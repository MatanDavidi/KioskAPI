package com.valora.kkiosk.consents;

import android.content.Intent;
import android.os.Bundle;
import android.support.p003v7.app.ActionBar;
import android.support.p003v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import com.valora.kkiosk.R;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo21491d2 = {"Lcom/valora/kkiosk/consents/ConsentDetailActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "consent", "Lcom/valora/kkiosk/consents/Consent;", "onClick", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "prepareResultAndFinish", "consentGiven", "", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: ConsentDetailActivity.kt */
public final class ConsentDetailActivity extends AppCompatActivity implements OnClickListener {
    private HashMap _$_findViewCache;
    private Consent consent;

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

    public void onClick(@Nullable View view) {
        if (view != null) {
            if (view.getId() == R.id.activity_consent_detail_btn_accept) {
                prepareResultAndFinish(true);
            } else if (view.getId() == R.id.activity_consent_detail_btn_reject) {
                prepareResultAndFinish(false);
            }
        }
    }

    private final void prepareResultAndFinish(boolean z) {
        Intent intent = new Intent();
        Consent consent2 = this.consent;
        String str = "consent";
        if (consent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        consent2.setState(z ? ConsentKt.CONSENT_STATE_CONSENT_GIVEN : ConsentKt.CONSENT_STATE_CONSENT_REVOKED);
        Consent consent3 = this.consent;
        if (consent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        intent.putExtra(ConsentKt.EXTRA_CONSENT, consent3);
        Intent intent2 = getIntent();
        String str2 = ConsentActivityKt.EXTRA_INDEX;
        intent.putExtra(str2, intent2.getIntExtra(str2, -1));
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_consent_detail);
        Serializable serializableExtra = getIntent().getSerializableExtra(ConsentKt.EXTRA_CONSENT);
        if (serializableExtra != null) {
            this.consent = (Consent) serializableExtra;
            boolean booleanExtra = getIntent().getBooleanExtra(ConsentKt.EXTRA_HIDE_CONSENT_DENY_BUTTON, false);
            WebView webView = (WebView) findViewById(R.id.activity_consent_detail_webview);
            ActionBar supportActionBar = getSupportActionBar();
            Button button = (Button) findViewById(R.id.activity_consent_detail_btn_reject);
            Button button2 = (Button) findViewById(R.id.activity_consent_detail_btn_accept);
            if (supportActionBar == null) {
                Intrinsics.throwNpe();
            }
            Consent consent2 = this.consent;
            String str = "consent";
            if (consent2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
            }
            supportActionBar.setTitle((CharSequence) consent2.getCurrentVersion().getTitle());
            if (webView == null) {
                Intrinsics.throwNpe();
            }
            Consent consent3 = this.consent;
            if (consent3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
            }
            webView.loadDataWithBaseURL("", consent3.getCurrentVersion().getDescription(), "text/html", "UTF-8", "");
            OnClickListener onClickListener = this;
            button.setOnClickListener(onClickListener);
            button2.setOnClickListener(onClickListener);
            if (booleanExtra) {
                Intrinsics.checkExpressionValueIsNotNull(button, "rejectButton");
                button.setVisibility(8);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.consents.Consent");
    }
}
