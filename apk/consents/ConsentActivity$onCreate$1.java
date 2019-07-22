package com.valora.kkiosk.consents;

import android.support.p000v4.app.NotificationCompat;
import android.widget.ProgressBar;
import com.valora.kkiosk.commons.models.UserData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J$\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, mo21491d2 = {"com/valora/kkiosk/consents/ConsentActivity$onCreate$1", "Lretrofit2/Callback;", "Lcom/valora/kkiosk/commons/models/UserData;", "onFailure", "", "call", "Lretrofit2/Call;", "t", "", "onResponse", "userProfileResponse", "Lretrofit2/Response;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: ConsentActivity.kt */
public final class ConsentActivity$onCreate$1 implements Callback<UserData> {
    final /* synthetic */ ProgressBar $progressBar;
    final /* synthetic */ ConsentActivity this$0;

    ConsentActivity$onCreate$1(ConsentActivity consentActivity, ProgressBar progressBar) {
        this.this$0 = consentActivity;
        this.$progressBar = progressBar;
    }

    public void onResponse(@NotNull Call<UserData> call, @NotNull Response<UserData> response) {
        Intrinsics.checkParameterIsNotNull(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkParameterIsNotNull(response, "userProfileResponse");
        ConsentActivity consentActivity = this.this$0;
        Object body = response.body();
        if (body == null) {
            Intrinsics.throwNpe();
        }
        consentActivity.userData = (UserData) body;
        ConsentActivity.access$getConsentRecycler$p(this.this$0).setVisibility(0);
        ProgressBar progressBar = this.$progressBar;
        Intrinsics.checkExpressionValueIsNotNull(progressBar, "progressBar");
        progressBar.setVisibility(8);
        this.this$0.startUI();
    }

    public void onFailure(@NotNull Call<UserData> call, @NotNull Throwable th) {
        Intrinsics.checkParameterIsNotNull(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkParameterIsNotNull(th, "t");
        ConsentActivity.access$getConsentRecycler$p(this.this$0).setVisibility(0);
        ProgressBar progressBar = this.$progressBar;
        Intrinsics.checkExpressionValueIsNotNull(progressBar, "progressBar");
        progressBar.setVisibility(8);
        this.this$0.showRequestFailedDialog();
    }
}
