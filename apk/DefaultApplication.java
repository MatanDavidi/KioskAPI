package com.valora.kkiosk;

import android.app.Application;
import com.jakewharton.threetenabp.AndroidThreeTen;
import kotlin.Metadata;
import p007io.branch.referral.Branch;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo21491d2 = {"Lcom/valora/kkiosk/DefaultApplication;", "Landroid/app/Application;", "()V", "TAG", "", "onCreate", "", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: DefaultApplication.kt */
public final class DefaultApplication extends Application {
    private final String TAG = "Default Application";

    public void onCreate() {
        super.onCreate();
        Branch.getAutoInstance(this);
        AndroidThreeTen.init((Application) this);
    }
}
