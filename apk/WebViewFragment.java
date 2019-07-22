package com.valora.kkiosk;

import android.os.Bundle;
import android.support.p000v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.valora.kkiosk.commons.extensions.ExtensionsKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, mo21491d2 = {"Lcom/valora/kkiosk/WebViewFragment;", "Landroid/support/v4/app/Fragment;", "()V", "urlToLoad", "", "getUrlToLoad", "()Ljava/lang/String;", "setUrlToLoad", "(Ljava/lang/String;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: WebViewFragment.kt */
public final class WebViewFragment extends Fragment {
    private HashMap _$_findViewCache;
    @Nullable
    private String urlToLoad;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Nullable
    public final String getUrlToLoad() {
        return this.urlToLoad;
    }

    public final void setUrlToLoad(@Nullable String str) {
        this.urlToLoad = str;
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = viewGroup != null ? ExtensionsKt.inflate(viewGroup, R.layout.fragment_web_view) : null;
        if (inflate == null) {
            Intrinsics.throwNpe();
        }
        View findViewById = inflate.findViewById(R.id.progress_bar);
        if (findViewById != null) {
            ((ProgressBar) findViewById).animate();
            View findViewById2 = inflate.findViewById(R.id.web_view);
            if (findViewById2 != null) {
                WebView webView = (WebView) findViewById2;
                WebSettings settings = webView.getSettings();
                Intrinsics.checkExpressionValueIsNotNull(settings, "webView.settings");
                settings.setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewFragment$onCreateView$1(this));
                String str = this.urlToLoad;
                if (str != null) {
                    webView.loadUrl(str);
                }
                return inflate;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.webkit.WebView");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.ProgressBar");
    }
}
