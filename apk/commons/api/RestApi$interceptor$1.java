package com.valora.kkiosk.commons.api;

import kotlin.Metadata;
import okhttp3.Interceptor;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "kotlin.jvm.PlatformType", "intercept"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: RestApi.kt */
final class RestApi$interceptor$1 implements Interceptor {
    public static final RestApi$interceptor$1 INSTANCE = new RestApi$interceptor$1();

    RestApi$interceptor$1() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x001e
            okhttp3.Request r1 = r5.request()
            if (r1 == 0) goto L_0x001e
            okhttp3.Request$Builder r1 = r1.newBuilder()
            if (r1 == 0) goto L_0x001e
            java.lang.String r2 = "Accept"
            java.lang.String r3 = "application/json"
            okhttp3.Request$Builder r1 = r1.addHeader(r2, r3)
            if (r1 == 0) goto L_0x001e
            okhttp3.Request r1 = r1.build()
            goto L_0x001f
        L_0x001e:
            r1 = r0
        L_0x001f:
            if (r5 == 0) goto L_0x0025
            okhttp3.Response r0 = r5.proceed(r1)
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valora.kkiosk.commons.api.RestApi$interceptor$1.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
