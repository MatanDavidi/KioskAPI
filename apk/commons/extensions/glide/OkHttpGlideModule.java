package com.valora.kkiosk.commons.extensions.glide;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.GlideModule;
import com.valora.kkiosk.commons.extensions.glide.OkHttpUrlLoader.Factory;
import java.io.File;
import java.io.InputStream;
import okhttp3.Cache;
import okhttp3.OkHttpClient.Builder;

public class OkHttpGlideModule implements GlideModule {
    public void applyOptions(Context context, GlideBuilder glideBuilder) {
    }

    public void registerComponents(Context context, Glide glide) {
        glide.register(GlideUrl.class, InputStream.class, new Factory(new Builder().cache(new Cache(new File(context.getCacheDir(), "http"), 262144000)).build()));
    }
}
