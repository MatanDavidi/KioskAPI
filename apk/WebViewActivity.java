package com.valora.kkiosk;

import android.content.Intent;
import android.os.Bundle;
import android.support.p003v7.app.ActionBar;
import android.support.p003v7.app.AppCompatActivity;
import android.support.p003v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, mo21491d2 = {"Lcom/valora/kkiosk/WebViewActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "webView", "Landroid/webkit/WebView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: WebViewActivity.kt */
public final class WebViewActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;
    private WebView webView;

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
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_web_view);
        View findViewById = findViewById(R.id.toolbar);
        if (findViewById != null) {
            setSupportActionBar((Toolbar) findViewById);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar == null) {
                Intrinsics.throwNpe();
            }
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            ActionBar supportActionBar2 = getSupportActionBar();
            if (supportActionBar2 == null) {
                Intrinsics.throwNpe();
            }
            supportActionBar2.setDisplayShowHomeEnabled(true);
            ActionBar supportActionBar3 = getSupportActionBar();
            if (supportActionBar3 == null) {
                Intrinsics.throwNpe();
            }
            supportActionBar3.setLogo((int) R.drawable.ic_kiosk_logo);
            ActionBar supportActionBar4 = getSupportActionBar();
            if (supportActionBar4 == null) {
                Intrinsics.throwNpe();
            }
            supportActionBar4.setTitle((CharSequence) "");
            View findViewById2 = findViewById(R.id.progress_bar);
            if (findViewById2 != null) {
                ProgressBar progressBar = (ProgressBar) findViewById2;
                WebViewActivity webViewActivity = this;
                View findViewById3 = findViewById(R.id.web_view);
                if (findViewById3 != null) {
                    this.webView = (WebView) findViewById3;
                    WebView webView2 = this.webView;
                    if (webView2 == null) {
                        Intrinsics.throwNpe();
                    }
                    WebSettings settings = webView2.getSettings();
                    String str = "webView!!.settings";
                    Intrinsics.checkExpressionValueIsNotNull(settings, str);
                    settings.setJavaScriptEnabled(true);
                    WebView webView3 = this.webView;
                    if (webView3 == null) {
                        Intrinsics.throwNpe();
                    }
                    webView3.getSettings().setGeolocationEnabled(true);
                    WebView webView4 = this.webView;
                    if (webView4 == null) {
                        Intrinsics.throwNpe();
                    }
                    WebSettings settings2 = webView4.getSettings();
                    Intrinsics.checkExpressionValueIsNotNull(settings2, str);
                    settings2.setJavaScriptCanOpenWindowsAutomatically(true);
                    WebView webView5 = this.webView;
                    if (webView5 == null) {
                        Intrinsics.throwNpe();
                    }
                    webView5.getSettings().setAppCacheEnabled(true);
                    WebView webView6 = this.webView;
                    if (webView6 == null) {
                        Intrinsics.throwNpe();
                    }
                    webView6.getSettings().setDatabaseEnabled(true);
                    WebView webView7 = this.webView;
                    if (webView7 == null) {
                        Intrinsics.throwNpe();
                    }
                    webView7.getSettings().setDomStorageEnabled(true);
                    WebView webView8 = this.webView;
                    if (webView8 == null) {
                        Intrinsics.throwNpe();
                    }
                    webView8.setWebChromeClient(new WebViewActivity$onCreate$1(this, webViewActivity));
                    WebView webView9 = this.webView;
                    if (webView9 == null) {
                        Intrinsics.throwNpe();
                    }
                    webView9.setWebViewClient(new WebViewActivity$onCreate$2(progressBar));
                    String str2 = "URL_TO_LOAD";
                    String stringExtra = getIntent().getStringExtra(str2);
                    if (stringExtra == null) {
                        Intent intent = getIntent();
                        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
                        stringExtra = intent.getData().getQueryParameter(str2);
                    }
                    WebView webView10 = this.webView;
                    if (webView10 == null) {
                        Intrinsics.throwNpe();
                    }
                    webView10.loadUrl(stringExtra);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.webkit.WebView");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.ProgressBar");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.Toolbar");
    }

    public boolean onOptionsItemSelected(@Nullable MenuItem menuItem) {
        if (menuItem == null) {
            Intrinsics.throwNpe();
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
