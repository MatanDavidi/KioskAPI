package com.valora.kkiosk;

import com.valora.kkiosk.commons.models.UserData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J(\u0010\t\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH\u0016¨\u0006\f"}, mo21491d2 = {"com/valora/kkiosk/SplashActivity$startApp$1", "Lretrofit2/Callback;", "Lcom/valora/kkiosk/commons/models/UserData;", "onFailure", "", "call", "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: SplashActivity.kt */
public final class SplashActivity$startApp$1 implements Callback<UserData> {
    final /* synthetic */ SplashActivity this$0;

    SplashActivity$startApp$1(SplashActivity splashActivity) {
        this.this$0 = splashActivity;
    }

    public void onFailure(@Nullable Call<UserData> call, @Nullable Throwable th) {
        this.this$0.logoutAndReset();
    }

    public void onResponse(@Nullable Call<UserData> call, @Nullable Response<UserData> response) {
        if ((response != null ? (UserData) response.body() : null) != null) {
            Object body = response.body();
            if (body == null) {
                Intrinsics.throwNpe();
            }
            if (((UserData) body).getConsents() != null) {
                SplashActivity splashActivity = this.this$0;
                Object body2 = response.body();
                if (body2 == null) {
                    Intrinsics.throwNpe();
                }
                List consents = ((UserData) body2).getConsents();
                if (consents == null) {
                    Intrinsics.throwNpe();
                }
                splashActivity.launchMainActivity(new ArrayList(consents));
                return;
            }
        }
        this.this$0.logoutAndReset();
    }
}
