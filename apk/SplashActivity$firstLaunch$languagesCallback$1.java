package com.valora.kkiosk;

import android.support.p000v4.app.NotificationCompat;
import com.valora.kkiosk.commons.api.APIHelper;
import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import com.valora.kkiosk.commons.models.Languages;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J$\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, mo21491d2 = {"com/valora/kkiosk/SplashActivity$firstLaunch$languagesCallback$1", "Lretrofit2/Callback;", "Lcom/valora/kkiosk/commons/models/Languages;", "onFailure", "", "call", "Lretrofit2/Call;", "t", "", "onResponse", "apiLanguagesResponse", "Lretrofit2/Response;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: SplashActivity.kt */
public final class SplashActivity$firstLaunch$languagesCallback$1 implements Callback<Languages> {
    final /* synthetic */ SplashActivity$firstLaunch$initializeCallback$1 $initializeCallback;
    final /* synthetic */ SplashActivity this$0;

    SplashActivity$firstLaunch$languagesCallback$1(SplashActivity splashActivity, SplashActivity$firstLaunch$initializeCallback$1 splashActivity$firstLaunch$initializeCallback$1) {
        this.this$0 = splashActivity;
        this.$initializeCallback = splashActivity$firstLaunch$initializeCallback$1;
    }

    public void onResponse(@NotNull Call<Languages> call, @NotNull Response<Languages> response) {
        Intrinsics.checkParameterIsNotNull(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkParameterIsNotNull(response, "apiLanguagesResponse");
        APIHelper aPIHelper = new APIHelper();
        ApiConfig.INSTANCE.setUserLanguage(aPIHelper.getUserLanguage(this.this$0, aPIHelper.processLanguagesResponse(response)));
        this.this$0.getRestApi().initialize(ApiConfig.INSTANCE.getUserLanguage()).enqueue(this.$initializeCallback);
    }

    public void onFailure(@NotNull Call<Languages> call, @NotNull Throwable th) {
        Intrinsics.checkParameterIsNotNull(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkParameterIsNotNull(th, "t");
        this.this$0.showStartupFailedDialog();
    }
}
