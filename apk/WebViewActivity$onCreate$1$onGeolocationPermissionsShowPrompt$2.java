package com.valora.kkiosk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.GeolocationPermissions.Callback;
import kotlin.Metadata;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo21491d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "id", "", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: WebViewActivity.kt */
final class WebViewActivity$onCreate$1$onGeolocationPermissionsShowPrompt$2 implements OnClickListener {
    final /* synthetic */ Callback $callback;
    final /* synthetic */ String $origin;
    final /* synthetic */ boolean $remember;

    WebViewActivity$onCreate$1$onGeolocationPermissionsShowPrompt$2(Callback callback, String str, boolean z) {
        this.$callback = callback;
        this.$origin = str;
        this.$remember = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Callback callback = this.$callback;
        if (callback != null) {
            callback.invoke(this.$origin, false, this.$remember);
        }
    }
}
