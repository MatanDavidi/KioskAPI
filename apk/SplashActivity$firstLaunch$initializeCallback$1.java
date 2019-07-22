package com.valora.kkiosk;

import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import com.valora.kkiosk.commons.models.UserIdData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J(\u0010\t\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH\u0016¨\u0006\f"}, mo21491d2 = {"com/valora/kkiosk/SplashActivity$firstLaunch$initializeCallback$1", "Lretrofit2/Callback;", "Lcom/valora/kkiosk/commons/models/UserIdData;", "onFailure", "", "call", "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: SplashActivity.kt */
public final class SplashActivity$firstLaunch$initializeCallback$1 implements Callback<UserIdData> {
    final /* synthetic */ SplashActivity this$0;

    SplashActivity$firstLaunch$initializeCallback$1(SplashActivity splashActivity) {
        this.this$0 = splashActivity;
    }

    public void onResponse(@Nullable Call<UserIdData> call, @Nullable Response<UserIdData> response) {
        if (response == null) {
            this.this$0.showStartupFailedDialog();
        } else if (response.isSuccessful()) {
            UserIdData userIdData = (UserIdData) response.body();
            ApiConfig apiConfig = ApiConfig.INSTANCE;
            if (userIdData == null) {
                Intrinsics.throwNpe();
            }
            String userId = userIdData.getUserId();
            if (userId == null) {
                userId = "";
            }
            apiConfig.setTempUserId(userId);
            UserIdData userIdData2 = (UserIdData) response.body();
            if ((userIdData2 != null ? userIdData2.getConsents() : null) == null) {
                this.this$0.showStartupFailedDialog();
                return;
            }
            SplashActivity splashActivity = this.this$0;
            Object body = response.body();
            if (body == null) {
                Intrinsics.throwNpe();
            }
            splashActivity.launchMainActivity(new ArrayList(((UserIdData) body).getConsents()));
        } else {
            this.this$0.showStartupFailedDialog();
        }
    }

    public void onFailure(@Nullable Call<UserIdData> call, @Nullable Throwable th) {
        this.this$0.showStartupFailedDialog();
    }
}
