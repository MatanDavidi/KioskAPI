package com.valora.kkiosk;

import android.content.DialogInterface.OnClickListener;
import android.support.p003v7.app.AlertDialog.Builder;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J:\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0011"}, mo21491d2 = {"com/valora/kkiosk/WebViewActivity$onCreate$1", "Landroid/webkit/WebChromeClient;", "onGeolocationPermissionsShowPrompt", "", "origin", "", "callback", "Landroid/webkit/GeolocationPermissions$Callback;", "onJsPrompt", "", "view", "Landroid/webkit/WebView;", "url", "message", "defaultValue", "result", "Landroid/webkit/JsPromptResult;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: WebViewActivity.kt */
public final class WebViewActivity$onCreate$1 extends WebChromeClient {
    final /* synthetic */ WebViewActivity $activity;
    final /* synthetic */ WebViewActivity this$0;

    WebViewActivity$onCreate$1(WebViewActivity webViewActivity, WebViewActivity webViewActivity2) {
        this.this$0 = webViewActivity;
        this.$activity = webViewActivity2;
    }

    public boolean onJsPrompt(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable JsPromptResult jsPromptResult) {
        Builder builder = new Builder(this.$activity);
        builder.setMessage((CharSequence) str2);
        builder.setTitle((CharSequence) "Alert");
        builder.show();
        if (jsPromptResult != null) {
            jsPromptResult.confirm();
        }
        return true;
    }

    public void onGeolocationPermissionsShowPrompt(@Nullable String str, @Nullable Callback callback) {
        Builder builder = new Builder(this.$activity);
        builder.setTitle((CharSequence) this.this$0.getString(R.string.stores));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(this.this$0.getString(R.string.location_permission));
        builder.setMessage((CharSequence) sb.toString()).setCancelable(true).setPositiveButton((CharSequence) this.this$0.getString(R.string.allow), (OnClickListener) new WebViewActivity$onCreate$1$onGeolocationPermissionsShowPrompt$1(callback, str, true)).setNegativeButton((CharSequence) this.this$0.getString(R.string.no), (OnClickListener) new WebViewActivity$onCreate$1$onGeolocationPermissionsShowPrompt$2(callback, str, true));
        builder.create().show();
    }
}
