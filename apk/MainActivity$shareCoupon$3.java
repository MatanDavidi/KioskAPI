package com.valora.kkiosk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import kotlin.Metadata;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
final class MainActivity$shareCoupon$3 implements OnDismissListener {
    final /* synthetic */ MainActivity this$0;

    MainActivity$shareCoupon$3(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.this$0.setSharePhoneNumberText(null);
        this.this$0.setCouponToShare(null);
    }
}
