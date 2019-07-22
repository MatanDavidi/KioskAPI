package com.valora.kkiosk.commons.extensions.glide;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Call.Factory;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class OkHttpStreamFetcher implements DataFetcher<InputStream> {
    private volatile Call call;
    private final Factory client;
    private ResponseBody responseBody;
    private InputStream stream;
    private final GlideUrl url;

    public OkHttpStreamFetcher(Factory factory, GlideUrl glideUrl) {
        this.client = factory;
        this.url = glideUrl;
    }

    public InputStream loadData(Priority priority) throws Exception {
        Builder url2 = new Builder().cacheControl(new CacheControl.Builder().maxAge(0, TimeUnit.SECONDS).build()).url(this.url.toStringUrl());
        for (Entry entry : this.url.getHeaders().entrySet()) {
            url2.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        this.call = this.client.newCall(url2.build());
        Response execute = this.call.execute();
        this.responseBody = execute.body();
        if (execute.isSuccessful()) {
            this.stream = ContentLengthInputStream.obtain(this.responseBody.byteStream(), this.responseBody.contentLength());
            return this.stream;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Request failed with code: ");
        sb.append(execute.code());
        throw new IOException(sb.toString());
    }

    public void cleanup() {
        try {
            if (this.stream != null) {
                this.stream.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody2 = this.responseBody;
        if (responseBody2 != null) {
            responseBody2.close();
        }
    }

    public String getId() {
        return this.url.getCacheKey();
    }

    public void cancel() {
        Call call2 = this.call;
        if (call2 != null) {
            call2.cancel();
        }
    }
}
