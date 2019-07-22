package com.valora.kkiosk;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.p003v7.app.AlertDialog.Builder;
import android.support.p003v7.app.AppCompatActivity;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.FirebaseAuth;
import com.valora.kkiosk.commons.api.RestApi;
import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import com.valora.kkiosk.commons.extensions.DeviceUUIDFactory;
import com.valora.kkiosk.commons.features.CouponsManager;
import com.valora.kkiosk.consents.Consent;
import com.valora.kkiosk.consents.ConsentActivity;
import com.valora.kkiosk.consents.ConsentActivityKt;
import com.valora.kkiosk.consents.ConsentKt;
import com.valora.kkiosk.consents.Consents;
import com.valora.kkiosk.trivia.TriviaActivity.IntentHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J \u0010\u000f\u001a\u00020\u000e2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u000eJ\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001a"}, mo21491d2 = {"Lcom/valora/kkiosk/SplashActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "restApi", "Lcom/valora/kkiosk/commons/api/RestApi;", "getRestApi", "()Lcom/valora/kkiosk/commons/api/RestApi;", "settings", "Landroid/content/SharedPreferences;", "getSettings", "()Landroid/content/SharedPreferences;", "setSettings", "(Landroid/content/SharedPreferences;)V", "firstLaunch", "", "launchMainActivity", "consents", "Ljava/util/ArrayList;", "Lcom/valora/kkiosk/consents/Consent;", "Lkotlin/collections/ArrayList;", "logoutAndReset", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showStartupFailedDialog", "startApp", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: SplashActivity.kt */
public final class SplashActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;
    @NotNull
    private final RestApi restApi = new RestApi();
    @NotNull
    public SharedPreferences settings;

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

    @NotNull
    public final RestApi getRestApi() {
        return this.restApi;
    }

    @NotNull
    public final SharedPreferences getSettings() {
        SharedPreferences sharedPreferences = this.settings;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settings");
        }
        return sharedPreferences;
    }

    public final void setSettings(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "<set-?>");
        this.settings = sharedPreferences;
    }

    public final void logoutAndReset() {
        SharedPreferences sharedPreferences = this.settings;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settings");
        }
        Editor edit = sharedPreferences.edit();
        edit.remove(SplashActivityKt.PREF_USER_ID);
        ApiConfig.INSTANCE.setUserId("");
        File cacheFile = new CouponsManager(new RestApi(), this).getCacheFile();
        if (cacheFile.exists()) {
            cacheFile.delete();
        }
        if (edit.commit()) {
            firstLaunch();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        new DeviceUUIDFactory(getApplicationContext());
        SharedPreferences sharedPreferences = getSharedPreferences(MainActivityKt.PREFS_NAME, 0);
        Intrinsics.checkExpressionValueIsNotNull(sharedPreferences, "getSharedPreferences(PREFS_NAME, 0)");
        this.settings = sharedPreferences;
        ApiConfig apiConfig = ApiConfig.INSTANCE;
        SharedPreferences sharedPreferences2 = this.settings;
        String str = "settings";
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        String str2 = "";
        String string = sharedPreferences2.getString(SplashActivityKt.PREF_USER_ID, str2);
        if (string == null) {
            Intrinsics.throwNpe();
        }
        apiConfig.setUserId(string);
        ApiConfig apiConfig2 = ApiConfig.INSTANCE;
        SharedPreferences sharedPreferences3 = this.settings;
        if (sharedPreferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        String string2 = sharedPreferences3.getString(SplashActivityKt.PREF_MSN, str2);
        if (string2 == null) {
            Intrinsics.throwNpe();
        }
        apiConfig2.setMsn(string2);
        ApiConfig apiConfig3 = ApiConfig.INSTANCE;
        SharedPreferences sharedPreferences4 = this.settings;
        if (sharedPreferences4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        String string3 = sharedPreferences4.getString(SplashActivityKt.PREF_USER_NAME, str2);
        if (string3 == null) {
            Intrinsics.throwNpe();
        }
        apiConfig3.setUserName(string3);
        FirebaseAuth instance = FirebaseAuth.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseAuth.getInstance()");
        if (instance.getCurrentUser() == null) {
            Intrinsics.checkExpressionValueIsNotNull(FirebaseAuth.getInstance().signInAnonymously().addOnCompleteListener((Activity) this, (OnCompleteListener<TResult>) new SplashActivity$onCreate$1<TResult>(this)), "FirebaseAuth.getInstance…          }\n            }");
        } else {
            startApp();
        }
    }

    /* access modifiers changed from: private */
    public final void startApp() {
        if (ApiConfig.INSTANCE.registered()) {
            this.restApi.getUser().enqueue(new SplashActivity$startApp$1(this));
        } else {
            firstLaunch();
        }
    }

    private final void firstLaunch() {
        this.restApi.languages().enqueue(new SplashActivity$firstLaunch$languagesCallback$1(this, new SplashActivity$firstLaunch$initializeCallback$1(this)));
    }

    /* access modifiers changed from: private */
    public final void launchMainActivity(ArrayList<Consent> arrayList) {
        Intent intent = getIntent();
        String str = "intent";
        Intrinsics.checkExpressionValueIsNotNull(intent, str);
        if (intent.getExtras() != null) {
            Intent intent2 = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent2, str);
            if (intent2.getExtras().get(KkioskFirebaseMessagingServiceKt.FCM_KEY_SHOW_TRIVIA) != null) {
                startActivity(IntentHelper.INSTANCE.getTriviaActivityIntent(this));
                return;
            }
        }
        Context context = this;
        Intent intent3 = new Intent(context, MainActivity.class);
        boolean registered = ApiConfig.INSTANCE.registered();
        String str2 = SplashActivityKt.EXTRA_CONSENTS;
        if (registered) {
            for (Consent consent : arrayList) {
                SplashActivity splashActivity = this;
                if (consent.isMasterConsent() && (Intrinsics.areEqual((Object) consent.getState(), (Object) ConsentKt.CONSENT_STATE_NO_CONSENT) || Intrinsics.areEqual((Object) consent.getState(), (Object) ConsentKt.CONSENT_STATE_CONSENT_RENEWAL_REQUIRED))) {
                    Intent intent4 = new Intent(context, ConsentActivity.class);
                    intent4.putExtra(str2, new Consents(arrayList));
                    intent4.putExtra(ConsentActivityKt.EXTRA_SHOULD_LAUNCH_MAIN_ACTIVITY, true);
                    intent4.putExtra(ConsentActivityKt.EXTRA_USER_LANGUAGE, ApiConfig.INSTANCE.getUserLanguage());
                    splashActivity.startActivity(intent4);
                    splashActivity.finish();
                    return;
                }
            }
        }
        intent3.putExtra(str2, new Consents(arrayList));
        startActivity(intent3);
        finish();
    }

    /* access modifiers changed from: private */
    public final void showStartupFailedDialog() {
        new Builder(this).setMessage((int) R.string.something_went_wrong_startup).setCancelable(true).setPositiveButton((int) R.string.close, (OnClickListener) new SplashActivity$showStartupFailedDialog$1(this));
    }
}
