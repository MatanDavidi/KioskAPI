package com.valora.kkiosk;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p000v4.app.Fragment;
import android.support.p000v4.app.FragmentManager;
import android.support.p000v4.app.FragmentTransaction;
import android.support.p003v7.app.ActionBar;
import android.support.p003v7.app.AppCompatActivity;
import android.support.p003v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.valora.kkiosk.PersonalDataFragment.OnUserProfileFragmentInteractionListener;
import com.valora.kkiosk.SignUpFragment.OnSignUpFragmentInteractionListener;
import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import com.valora.kkiosk.consents.ConsentActivity;
import com.valora.kkiosk.consents.Consents;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001aH\u0016J \u0010!\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\"\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000¨\u0006-"}, mo21491d2 = {"Lcom/valora/kkiosk/RegistrationActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/valora/kkiosk/SignUpFragment$OnSignUpFragmentInteractionListener;", "Lcom/valora/kkiosk/PersonalDataFragment$OnUserProfileFragmentInteractionListener;", "()V", "consents", "Lcom/valora/kkiosk/consents/Consents;", "getConsents", "()Lcom/valora/kkiosk/consents/Consents;", "setConsents", "(Lcom/valora/kkiosk/consents/Consents;)V", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getFirebaseAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setFirebaseAnalytics", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "msn", "", "userId", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userName", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCodeProvidedIsValid", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "replaceFragment", "fragment", "Landroid/support/v4/app/Fragment;", "userUpdated", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: RegistrationActivity.kt */
public final class RegistrationActivity extends AppCompatActivity implements OnSignUpFragmentInteractionListener, OnUserProfileFragmentInteractionListener {
    private HashMap _$_findViewCache;
    @NotNull
    public Consents consents;
    @Nullable
    private FirebaseAnalytics firebaseAnalytics;
    private String msn;
    @Nullable
    private String userId;
    private String userName;

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

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @Nullable
    public final FirebaseAnalytics getFirebaseAnalytics() {
        return this.firebaseAnalytics;
    }

    public final void setFirebaseAnalytics(@Nullable FirebaseAnalytics firebaseAnalytics2) {
        this.firebaseAnalytics = firebaseAnalytics2;
    }

    @NotNull
    public final Consents getConsents() {
        Consents consents2 = this.consents;
        if (consents2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consents");
        }
        return consents2;
    }

    public final void setConsents(@NotNull Consents consents2) {
        Intrinsics.checkParameterIsNotNull(consents2, "<set-?>");
        this.consents = consents2;
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_registration);
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
            if (VERSION.SDK_INT >= 21) {
                ActionBar supportActionBar3 = getSupportActionBar();
                if (supportActionBar3 == null) {
                    Intrinsics.throwNpe();
                }
                supportActionBar3.setLogo((int) R.drawable.top_logo);
            }
            Intent intent = getIntent();
            String str = SplashActivityKt.EXTRA_CONSENTS;
            Serializable serializableExtra = intent.getSerializableExtra(str);
            if (serializableExtra != null) {
                this.consents = (Consents) serializableExtra;
                this.firebaseAnalytics = FirebaseAnalytics.getInstance(this);
                SignUpFragment signUpFragment = new SignUpFragment();
                Bundle bundle2 = new Bundle();
                Consents consents2 = this.consents;
                if (consents2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("consents");
                }
                bundle2.putSerializable(str, consents2);
                signUpFragment.setArguments(bundle2);
                replaceFragment(signUpFragment);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.consents.Consents");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.Toolbar");
    }

    private final void replaceFragment(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        beginTransaction.replace(R.id.fragment_container, fragment);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        if (supportFragmentManager.getFragments() != null) {
            beginTransaction.addToBackStack(null);
        }
        beginTransaction.commit();
    }

    public boolean onOptionsItemSelected(@Nullable MenuItem menuItem) {
        if (menuItem == null) {
            Intrinsics.throwNpe();
        }
        if (menuItem.getItemId() == 16908332) {
            ApiConfig.INSTANCE.setUserId("");
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onCodeProvidedIsValid(@NotNull String str, @NotNull String str2, @NotNull Consents consents2) {
        Intrinsics.checkParameterIsNotNull(str, SplashActivityKt.PREF_MSN);
        Intrinsics.checkParameterIsNotNull(str2, SplashActivityKt.PREF_USER_ID);
        Intrinsics.checkParameterIsNotNull(consents2, "consents");
        this.userId = str2;
        this.msn = str;
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Bundle extras = intent.getExtras();
        Serializable serializable = consents2;
        String str3 = SplashActivityKt.EXTRA_CONSENTS;
        extras.putSerializable(str3, serializable);
        this.consents = consents2;
        PersonalDataFragment personalDataFragment = new PersonalDataFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(str3, serializable);
        personalDataFragment.setArguments(bundle);
        replaceFragment(personalDataFragment);
    }

    public void userUpdated(@NotNull String str) {
        String str2 = SplashActivityKt.PREF_USER_NAME;
        Intrinsics.checkParameterIsNotNull(str, str2);
        this.userName = str;
        Intent intent = new Intent();
        intent.putExtra(SplashActivityKt.PREF_USER_ID, this.userId);
        intent.putExtra(str2, str);
        String str3 = this.msn;
        String str4 = SplashActivityKt.PREF_MSN;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str4);
        }
        intent.putExtra(str4, str3);
        Consents consents2 = this.consents;
        if (consents2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consents");
        }
        intent.putExtra(SplashActivityKt.EXTRA_CONSENTS, consents2);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (i == 1289 && i2 == -1) {
            if (intent != null) {
                String str = SplashActivityKt.EXTRA_CONSENTS;
                intent.getSerializableExtra(str);
                Intent intent2 = new Intent();
                intent2.putExtra(SplashActivityKt.PREF_USER_ID, this.userId);
                String str2 = this.userName;
                String str3 = SplashActivityKt.PREF_USER_NAME;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str3);
                }
                intent2.putExtra(str3, str2);
                String str4 = this.msn;
                String str5 = SplashActivityKt.PREF_MSN;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str5);
                }
                intent2.putExtra(str5, str4);
                intent2.putExtra(str, intent.getSerializableExtra(str));
                setResult(-1, intent2);
                finish();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(ConsentActivity.class.getSimpleName());
                sb.append(" did not return any data but should return consents");
                new IllegalArgumentException(sb.toString());
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        ApiConfig.INSTANCE.setUserId("");
    }
}
