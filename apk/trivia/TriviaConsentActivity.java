package com.valora.kkiosk.trivia;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import android.support.p003v7.app.AlertDialog.Builder;
import android.support.p003v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.valora.kkiosk.MainActivityKt;
import com.valora.kkiosk.R;
import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import com.valora.kkiosk.consents.ConsentActivityKt;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0013H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/TriviaConsentActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "checkBox", "Landroid/widget/CheckBox;", "customTabsIntent", "Landroid/support/customtabs/CustomTabsIntent;", "mClient", "Landroid/support/customtabs/CustomTabsClient;", "mCustomTabsServiceConnection", "Landroid/support/customtabs/CustomTabsServiceConnection;", "mCustomTabsSession", "Landroid/support/customtabs/CustomTabsSession;", "settings", "Landroid/content/SharedPreferences;", "getTOSUrlString", "", "initializeChromeCustomTabs", "", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: TriviaConsentActivity.kt */
public final class TriviaConsentActivity extends AppCompatActivity implements OnClickListener {
    private HashMap _$_findViewCache;
    private CheckBox checkBox;
    /* access modifiers changed from: private */
    public CustomTabsIntent customTabsIntent;
    /* access modifiers changed from: private */
    public CustomTabsClient mClient;
    private CustomTabsServiceConnection mCustomTabsServiceConnection;
    /* access modifiers changed from: private */
    public CustomTabsSession mCustomTabsSession;
    private SharedPreferences settings;

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

    public static final /* synthetic */ CustomTabsIntent access$getCustomTabsIntent$p(TriviaConsentActivity triviaConsentActivity) {
        CustomTabsIntent customTabsIntent2 = triviaConsentActivity.customTabsIntent;
        if (customTabsIntent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customTabsIntent");
        }
        return customTabsIntent2;
    }

    public void onClick(@Nullable View view) {
        if (view == null) {
            Intrinsics.throwNpe();
        }
        if (view.getId() == R.id.trivia_consent_activity_btn_continue) {
            CheckBox checkBox2 = this.checkBox;
            if (checkBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkBox");
            }
            if (checkBox2.isChecked()) {
                SharedPreferences sharedPreferences = this.settings;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("settings");
                }
                sharedPreferences.edit().putBoolean(TriviaConsentActivityKt.TRIVIA_CONSENT_GIVEN, true).apply();
                Intent intent = new Intent(this, TriviaActivity.class);
                Intent intent2 = getIntent();
                Intrinsics.checkExpressionValueIsNotNull(intent2, "intent");
                intent.putExtras(intent2.getExtras());
                startActivity(intent);
                finish();
                return;
            }
            new Builder(this).setTitle((int) R.string.missing_consent).setMessage((int) R.string.missing_trivia_consent_text).setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) TriviaConsentActivity$onClick$1.INSTANCE).show();
        }
    }

    /* access modifiers changed from: private */
    public final String getTOSUrlString() {
        return Intrinsics.areEqual((Object) ApiConfig.INSTANCE.getUserLanguage(), (Object) "de") ? "https://www.kkiosk.ch/de/app/tnb-quiz/index.html" : "https://www.kkiosk.ch/fr/app/conditions-de-participation-quiz/index.html";
    }

    private final void initializeChromeCustomTabs() {
        this.mCustomTabsServiceConnection = new TriviaConsentActivity$initializeChromeCustomTabs$1(this);
        CustomTabsClient.bindCustomTabsService(this, ConsentActivityKt.CUSTOM_TAB_PACKAGE_NAME, this.mCustomTabsServiceConnection);
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.trivia_activity_consent);
        View findViewById = findViewById(R.id.trivia_consent_activity_checkbox);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById<CheckBox>(R…onsent_activity_checkbox)");
        this.checkBox = (CheckBox) findViewById;
        View findViewById2 = findViewById(R.id.trivia_consent_activity_txt_checkbox);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.trivia…nt_activity_txt_checkbox)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.trivia_consent_activity_btn_continue);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.trivia…nt_activity_btn_continue)");
        Button button = (Button) findViewById3;
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        if (intent.getExtras() != null) {
            initializeChromeCustomTabs();
            String string = getResources().getString(R.string.i_accept_the_tos_for_the_quiz);
            String string2 = getResources().getString(R.string.tos_and_data_privacy_statement_for_quiz);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Intrinsics.checkExpressionValueIsNotNull(string, "iAcceptString");
            Object[] objArr = {string2};
            String format = String.format(string, Arrays.copyOf(objArr, objArr.length));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            SpannableString spannableString = new SpannableString(format);
            spannableString.setSpan(new TriviaConsentActivity$onCreate$clickableSpan$1(this), string.length() - 2, spannableString.length(), 33);
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(getResources().getColor(R.color.colorPrimary));
            SharedPreferences sharedPreferences = getSharedPreferences(MainActivityKt.PREFS_NAME, 0);
            Intrinsics.checkExpressionValueIsNotNull(sharedPreferences, "getSharedPreferences(PREFS_NAME, 0)");
            this.settings = sharedPreferences;
            button.setOnClickListener(this);
            return;
        }
        throw new IllegalArgumentException("Missing LB Arguments");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        CustomTabsServiceConnection customTabsServiceConnection = this.mCustomTabsServiceConnection;
        if (customTabsServiceConnection != null) {
            unbindService(customTabsServiceConnection);
            this.mCustomTabsServiceConnection = null;
        }
    }
}
