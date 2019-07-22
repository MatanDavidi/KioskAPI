package com.valora.kkiosk.commons.features;

import android.content.Context;
import android.util.Log;
import com.facebook.places.model.PlaceFields;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.valora.kkiosk.SplashActivityKt;
import com.valora.kkiosk.commons.api.RestApi;
import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import com.valora.kkiosk.commons.models.Coupon;
import com.valora.kkiosk.commons.models.CouponDataResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import p018rx.Observable;
import p018rx.Observable.OnSubscribe;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0010J\b\u0010\u0017\u001a\u00020\u0018H\u0002J*\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001a0\u00102\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0018J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, mo21491d2 = {"Lcom/valora/kkiosk/commons/features/CouponsManager;", "", "api", "Lcom/valora/kkiosk/commons/api/RestApi;", "context", "Landroid/content/Context;", "(Lcom/valora/kkiosk/commons/api/RestApi;Landroid/content/Context;)V", "cacheFile", "Ljava/io/File;", "getCacheFile", "()Ljava/io/File;", "cacheFile$delegate", "Lkotlin/Lazy;", "getContext", "()Landroid/content/Context;", "allCoupons", "Lrx/Observable;", "Lcom/valora/kkiosk/commons/models/CouponDataResponse;", "coupons", "getAllCoupons", "loyaltyCards", "", "Lcom/valora/kkiosk/commons/models/Coupon;", "readFromCache", "", "share", "Lkotlin/Pair;", "coupon", "msn", "writeCache", "", "data", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: CouponsManager.kt */
public final class CouponsManager {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CouponsManager.class), "cacheFile", "getCacheFile()Ljava/io/File;"))};
    /* access modifiers changed from: private */
    public final RestApi api;
    @NotNull
    private final Lazy cacheFile$delegate;
    @NotNull
    private final Context context;

    @NotNull
    public final File getCacheFile() {
        Lazy lazy = this.cacheFile$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (File) lazy.getValue();
    }

    public CouponsManager(@NotNull RestApi restApi, @NotNull Context context2) {
        Intrinsics.checkParameterIsNotNull(restApi, "api");
        Intrinsics.checkParameterIsNotNull(context2, PlaceFields.CONTEXT);
        this.api = restApi;
        this.context = context2;
        this.cacheFile$delegate = LazyKt.lazy(new CouponsManager$cacheFile$2(this));
    }

    public /* synthetic */ CouponsManager(RestApi restApi, Context context2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            restApi = new RestApi();
        }
        this(restApi, context2);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    private final Observable<CouponDataResponse> getAllCoupons() {
        if (!ApiConfig.INSTANCE.registered()) {
            StorageReference reference = FirebaseStorage.getInstance().getReference("dummy_JSON_iOS_DE.json");
            Intrinsics.checkExpressionValueIsNotNull(reference, "FirebaseStorage.getInsta…\"dummy_JSON_iOS_DE.json\")");
            Observable<CouponDataResponse> create = Observable.create((OnSubscribe<T>) new CouponsManager$getAllCoupons$1<T>(reference));
            Intrinsics.checkExpressionValueIsNotNull(create, "Observable.create { subs…          }\n            }");
            return create;
        }
        Observable<CouponDataResponse> create2 = Observable.create((OnSubscribe<T>) new CouponsManager$getAllCoupons$2<T>(this));
        Intrinsics.checkExpressionValueIsNotNull(create2, "Observable.create { subs…\n            }\n\n        }");
        return create2;
    }

    private final Observable<CouponDataResponse> allCoupons() {
        Observable<CouponDataResponse> onErrorReturn = getAllCoupons().doOnNext(new CouponsManager$allCoupons$1(this)).onErrorReturn(new CouponsManager$allCoupons$2(this));
        Intrinsics.checkExpressionValueIsNotNull(onErrorReturn, "getAllCoupons().doOnNext…)\n            }\n        }");
        return onErrorReturn;
    }

    @NotNull
    public final Observable<CouponDataResponse> coupons() {
        Observable<CouponDataResponse> map = allCoupons().map(CouponsManager$coupons$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(map, "allCoupons().map {\n            it\n        }");
        return map;
    }

    @NotNull
    public final Observable<List<Coupon>> loyaltyCards() {
        Observable<List<Coupon>> map = allCoupons().map(CouponsManager$loyaltyCards$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(map, "allCoupons().map {\n     …on) ?: listOf()\n        }");
        return map;
    }

    @NotNull
    public final Observable<Pair<String, String>> share(@NotNull Coupon coupon, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(coupon, Param.COUPON);
        Intrinsics.checkParameterIsNotNull(str, SplashActivityKt.PREF_MSN);
        Observable<Pair<String, String>> create = Observable.create((OnSubscribe<T>) new CouponsManager$share$1<T>(this, coupon, str));
        Intrinsics.checkExpressionValueIsNotNull(create, "Observable.create { subs…\n            }\n\n        }");
        return create;
    }

    /* access modifiers changed from: private */
    public final void writeCache(String str) {
        try {
            if (getCacheFile().exists()) {
                getCacheFile().delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(getCacheFile());
            Charset charset = Charsets.UTF_8;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                fileOutputStream.close();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } catch (IOException e) {
            e.printStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append("File write failed: ");
            sb.append(e.toString());
            Log.e("Exception", sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public final String readFromCache() {
        StringBuffer stringBuffer = new StringBuffer("");
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(getCacheFile()));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                stringBuffer.append(readLine);
            }
            inputStreamReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append("File read failed: ");
            sb.append(e.toString());
            Log.e("Exception", sb.toString());
        }
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkExpressionValueIsNotNull(stringBuffer2, "datax.toString()");
        return stringBuffer2;
    }
}
