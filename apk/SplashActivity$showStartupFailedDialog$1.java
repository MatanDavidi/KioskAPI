package com.valora.kkiosk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import kotlin.Metadata;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo21491d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "event", "", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: SplashActivity.kt */
final class SplashActivity$showStartupFailedDialog$1 implements OnClickListener {
    final /* synthetic */ SplashActivity this$0;

    SplashActivity$showStartupFailedDialog$1(SplashActivity splashActivity) {
        this.this$0 = splashActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.this$0.finish();
    }
}
