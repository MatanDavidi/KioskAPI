package com.valora.kkiosk.consents;

import android.content.Intent;
import com.valora.kkiosk.MainActivity;
import com.valora.kkiosk.SplashActivityKt;
import com.valora.kkiosk.commons.models.UserData;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J(\u0010\t\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH\u0016¨\u0006\f"}, mo21491d2 = {"com/valora/kkiosk/consents/ConsentActivity$submitConsents$3", "Lretrofit2/Callback;", "Lcom/valora/kkiosk/commons/models/UserData;", "onFailure", "", "call", "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: ConsentActivity.kt */
public final class ConsentActivity$submitConsents$3 implements Callback<UserData> {
    final /* synthetic */ Consents $consents;
    final /* synthetic */ ConsentActivity this$0;

    ConsentActivity$submitConsents$3(ConsentActivity consentActivity, Consents consents) {
        this.this$0 = consentActivity;
        this.$consents = consents;
    }

    public void onResponse(@Nullable Call<UserData> call, @Nullable Response<UserData> response) {
        if (this.this$0.getIntent().getBooleanExtra(ConsentActivityKt.EXTRA_SHOULD_LAUNCH_MAIN_ACTIVITY, false)) {
            Intent intent = new Intent(this.this$0, MainActivity.class);
            intent.putExtra(SplashActivityKt.EXTRA_CONSENTS, this.$consents);
            this.this$0.startActivity(intent);
            this.this$0.finish();
            return;
        }
        this.this$0.finish();
    }

    public void onFailure(@Nullable Call<UserData> call, @Nullable Throwable th) {
        this.this$0.showRequestFailedDialog();
    }
}
