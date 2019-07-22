package com.valora.kkiosk;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J(\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, mo21491d2 = {"com/valora/kkiosk/WebViewFragment$onCreateView$1", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "errorCode", "", "description", "failingUrl", "shouldOverrideUrlLoading", "", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: WebViewFragment.kt */
public final class WebViewFragment$onCreateView$1 extends WebViewClient {
    final /* synthetic */ WebViewFragment this$0;

    WebViewFragment$onCreateView$1(WebViewFragment webViewFragment) {
        this.this$0 = webViewFragment;
    }

    public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
        if (webView != null) {
            webView.loadUrl(str);
        }
        return true;
    }

    public void onReceivedError(@NotNull WebView webView, int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(webView, "view");
        Intrinsics.checkParameterIsNotNull(str, "description");
        Intrinsics.checkParameterIsNotNull(str2, "failingUrl");
        Toast.makeText(this.this$0.getActivity(), str, 0).show();
    }

    public void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
        ((ProgressBar) this.this$0._$_findCachedViewById(C1224R.C1226id.progress_bar)).animate();
        super.onPageStarted(webView, str, bitmap);
    }

    public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        if (((ProgressBar) this.this$0._$_findCachedViewById(C1224R.C1226id.progress_bar)) != null) {
            ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C1224R.C1226id.progress_bar);
            Intrinsics.checkExpressionValueIsNotNull(progressBar, "progress_bar");
            progressBar.setVisibility(8);
            super.onPageFinished(webView, str);
        }
    }
}
