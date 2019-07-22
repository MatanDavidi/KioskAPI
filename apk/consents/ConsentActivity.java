package com.valora.kkiosk.consents;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsIntent.Builder;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import android.support.p003v7.app.AlertDialog;
import android.support.p003v7.app.AppCompatActivity;
import android.support.p003v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import com.valora.kkiosk.R;
import com.valora.kkiosk.SplashActivityKt;
import com.valora.kkiosk.commons.api.RestApi;
import com.valora.kkiosk.commons.models.UserData;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\"\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020\u0014H\u0014J\b\u0010%\u001a\u00020\u0014H\u0002J\b\u0010&\u001a\u00020\u0014H\u0002J\b\u0010'\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000¨\u0006("}, mo21491d2 = {"Lcom/valora/kkiosk/consents/ConsentActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "consentRecycler", "Landroid/support/v7/widget/RecyclerView;", "consentsAdapter", "Lcom/valora/kkiosk/consents/ConsentsAdapter;", "continueButton", "Landroid/widget/Button;", "mClient", "Landroid/support/customtabs/CustomTabsClient;", "mCustomTabsServiceConnection", "Landroid/support/customtabs/CustomTabsServiceConnection;", "mCustomTabsSession", "Landroid/support/customtabs/CustomTabsSession;", "manageDataButton", "userData", "Lcom/valora/kkiosk/commons/models/UserData;", "initializeChromeCustomTabs", "", "launchManageDataPage", "url", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showRequestFailedDialog", "startUI", "submitConsents", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: ConsentActivity.kt */
public final class ConsentActivity extends AppCompatActivity implements OnClickListener {
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public RecyclerView consentRecycler;
    private ConsentsAdapter consentsAdapter;
    private Button continueButton;
    /* access modifiers changed from: private */
    public CustomTabsClient mClient;
    private CustomTabsServiceConnection mCustomTabsServiceConnection;
    /* access modifiers changed from: private */
    public CustomTabsSession mCustomTabsSession;
    private Button manageDataButton;
    /* access modifiers changed from: private */
    public UserData userData;

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

    public static final /* synthetic */ RecyclerView access$getConsentRecycler$p(ConsentActivity consentActivity) {
        RecyclerView recyclerView = consentActivity.consentRecycler;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentRecycler");
        }
        return recyclerView;
    }

    public static final /* synthetic */ UserData access$getUserData$p(ConsentActivity consentActivity) {
        UserData userData2 = consentActivity.userData;
        if (userData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userData");
        }
        return userData2;
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_consent);
        View findViewById = findViewById(R.id.activity_consent_recycler);
        if (findViewById != null) {
            this.consentRecycler = (RecyclerView) findViewById;
            View findViewById2 = findViewById(R.id.activity_consent_button_continue);
            String str = "null cannot be cast to non-null type android.widget.Button";
            if (findViewById2 != null) {
                this.continueButton = (Button) findViewById2;
                View findViewById3 = findViewById(R.id.activity_consent_button_manage_data);
                if (findViewById3 != null) {
                    this.manageDataButton = (Button) findViewById3;
                    ProgressBar progressBar = (ProgressBar) findViewById(R.id.activity_consent_progress);
                    RecyclerView recyclerView = this.consentRecycler;
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("consentRecycler");
                    }
                    recyclerView.setVisibility(4);
                    Intrinsics.checkExpressionValueIsNotNull(progressBar, "progressBar");
                    progressBar.setVisibility(0);
                    new RestApi().getUser().enqueue(new ConsentActivity$onCreate$1(this, progressBar));
                    return;
                }
                throw new TypeCastException(str);
            }
            throw new TypeCastException(str);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
    }

    public void onClick(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        switch (view.getId()) {
            case R.id.activity_consent_button_continue /*2131296283*/:
                submitConsents();
                return;
            case R.id.activity_consent_button_manage_data /*2131296284*/:
                UserData userData2 = this.userData;
                if (userData2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userData");
                }
                String userMyPage = userData2.getUserMyPage();
                if (userMyPage == null) {
                    Intrinsics.throwNpe();
                }
                launchManageDataPage(userMyPage);
                return;
            default:
                return;
        }
    }

    private final void launchManageDataPage(String str) {
        new Builder(this.mCustomTabsSession).setToolbarColor(getResources().getColor(R.color.colorPrimary)).setShowTitle(true).build().launchUrl(this, Uri.parse(str));
    }

    private final void submitConsents() {
        ConsentsAdapter consentsAdapter2 = this.consentsAdapter;
        if (consentsAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentsAdapter");
        }
        Consents consents = consentsAdapter2.getmDataSet();
        if (consents != null) {
            boolean z = true;
            for (Consent consent : consents.getRevokedConsentsList()) {
                if (consent.getMandatory() && !consent.isConsentGiven()) {
                    z = false;
                }
            }
            if (!z) {
                new AlertDialog.Builder(this).setMessage((int) R.string.mandatory_consent_missing_message).setTitle((int) R.string.mandatory_consent_missing_title).setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) new ConsentActivity$submitConsents$2(this)).show();
            } else {
                Intent intent = new Intent();
                intent.putExtra(SplashActivityKt.EXTRA_CONSENTS, consents);
                setResult(-1, intent);
                if (intent.getBooleanExtra(ConsentActivityKt.EXTRA_IS_REGISTRATION, false)) {
                    finish();
                    return;
                }
                RestApi restApi = new RestApi();
                UserData userData2 = this.userData;
                String str = "userData";
                if (userData2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                }
                if (userData2 == null) {
                    Intrinsics.throwNpe();
                }
                String name = userData2.getName();
                if (name == null) {
                    Intrinsics.throwNpe();
                }
                UserData userData3 = this.userData;
                if (userData3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                }
                String gender = userData3.getGender();
                if (gender == null) {
                    Intrinsics.throwNpe();
                }
                UserData userData4 = this.userData;
                if (userData4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                }
                String dateOfBirth = userData4.getDateOfBirth();
                if (dateOfBirth == null) {
                    Intrinsics.throwNpe();
                }
                String stringExtra = getIntent().getStringExtra(ConsentActivityKt.EXTRA_USER_LANGUAGE);
                Intrinsics.checkExpressionValueIsNotNull(stringExtra, "intent.getStringExtra(EXTRA_USER_LANGUAGE)");
                restApi.updateUser(name, gender, dateOfBirth, stringExtra, null, consents.getApprovedConsentIdList(), consents.getRevokedConsentIdList()).enqueue(new ConsentActivity$submitConsents$3(this, consents));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void showRequestFailedDialog() {
        new AlertDialog.Builder(this).setTitle((int) R.string.profile_update_failed).setMessage((int) R.string.profile_update_failed_message).setPositiveButton((int) R.string.exit_app, (DialogInterface.OnClickListener) new ConsentActivity$showRequestFailedDialog$1(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void startUI() {
        /*
            r9 = this;
            r0 = 2131296291(0x7f090023, float:1.8210495E38)
            android.view.View r0 = r9.findViewById(r0)
            if (r0 == 0) goto L_0x0128
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.support.v7.app.ActionBar r1 = r9.getSupportActionBar()
            if (r1 != 0) goto L_0x0014
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0014:
            java.lang.String r2 = "supportActionBar!!"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.content.res.Resources r2 = r9.getResources()
            r3 = 2131689560(0x7f0f0058, float:1.9008139E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setTitle(r2)
            android.widget.Button r1 = r9.continueButton
            java.lang.String r2 = "continueButton"
            if (r1 != 0) goto L_0x0032
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0032:
            r3 = 1
            r1.setEnabled(r3)
            android.widget.Button r1 = r9.continueButton
            if (r1 != 0) goto L_0x003d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x003d:
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r4 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r1 = r1.alpha(r4)
            r5 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r5)
            r1.start()
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r7 = "intent"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            android.os.Bundle r1 = r1.getExtras()
            java.lang.String r8 = "manageDataButton"
            if (r1 == 0) goto L_0x00b8
            android.content.Intent r1 = r9.getIntent()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            android.os.Bundle r1 = r1.getExtras()
            if (r1 != 0) goto L_0x0071
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0071:
            java.lang.String r7 = "EXTRA_USER"
            boolean r1 = r1.containsKey(r7)
            if (r1 == 0) goto L_0x00b8
            android.widget.Button r1 = r9.manageDataButton
            if (r1 != 0) goto L_0x0080
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0080:
            r7 = r9
            android.view.View$OnClickListener r7 = (android.view.View.OnClickListener) r7
            r1.setOnClickListener(r7)
            android.widget.Button r1 = r9.manageDataButton
            if (r1 != 0) goto L_0x008d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x008d:
            r1.setEnabled(r3)
            android.widget.Button r1 = r9.manageDataButton
            if (r1 != 0) goto L_0x0097
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0097:
            r3 = 0
            r1.setVisibility(r3)
            android.widget.Button r1 = r9.manageDataButton
            if (r1 != 0) goto L_0x00a2
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x00a2:
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.view.ViewPropertyAnimator r1 = r1.alpha(r4)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r5)
            r1.start()
            r0.setVisibility(r3)
            r9.initializeChromeCustomTabs()
            goto L_0x00c7
        L_0x00b8:
            r1 = 8
            r0.setVisibility(r1)
            android.widget.Button r0 = r9.manageDataButton
            if (r0 != 0) goto L_0x00c4
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x00c4:
            r0.setVisibility(r1)
        L_0x00c7:
            com.valora.kkiosk.consents.ConsentsAdapter r0 = new com.valora.kkiosk.consents.ConsentsAdapter
            com.valora.kkiosk.consents.Consents r1 = new com.valora.kkiosk.consents.Consents
            java.util.ArrayList r3 = new java.util.ArrayList
            com.valora.kkiosk.commons.models.UserData r4 = r9.userData
            if (r4 != 0) goto L_0x00d6
            java.lang.String r5 = "userData"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x00d6:
            java.util.List r4 = r4.getConsents()
            if (r4 != 0) goto L_0x00df
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00df:
            java.util.Collection r4 = (java.util.Collection) r4
            r3.<init>(r4)
            r1.<init>(r3)
            r3 = r9
            android.app.Activity r3 = (android.app.Activity) r3
            r0.<init>(r1, r3)
            r9.consentsAdapter = r0
            android.support.v7.widget.LinearLayoutManager r0 = new android.support.v7.widget.LinearLayoutManager
            r1 = r9
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1)
            android.support.v7.widget.RecyclerView r1 = r9.consentRecycler
            java.lang.String r3 = "consentRecycler"
            if (r1 != 0) goto L_0x0100
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0100:
            com.valora.kkiosk.consents.ConsentsAdapter r4 = r9.consentsAdapter
            if (r4 != 0) goto L_0x0109
            java.lang.String r5 = "consentsAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x0109:
            android.support.v7.widget.RecyclerView$Adapter r4 = (android.support.p003v7.widget.RecyclerView.Adapter) r4
            r1.setAdapter(r4)
            android.support.v7.widget.RecyclerView r1 = r9.consentRecycler
            if (r1 != 0) goto L_0x0115
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0115:
            android.support.v7.widget.RecyclerView$LayoutManager r0 = (android.support.p003v7.widget.RecyclerView.LayoutManager) r0
            r1.setLayoutManager(r0)
            android.widget.Button r0 = r9.continueButton
            if (r0 != 0) goto L_0x0121
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0121:
            r1 = r9
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            return
        L_0x0128:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.TextView"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valora.kkiosk.consents.ConsentActivity.startUI():void");
    }

    private final void initializeChromeCustomTabs() {
        this.mCustomTabsServiceConnection = new ConsentActivity$initializeChromeCustomTabs$1(this);
        CustomTabsClient.bindCustomTabsService(this, ConsentActivityKt.CUSTOM_TAB_PACKAGE_NAME, this.mCustomTabsServiceConnection);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (i == 981 && i2 == -1) {
            if (intent != null) {
                Serializable serializableExtra = intent.getSerializableExtra(ConsentKt.EXTRA_CONSENT);
                if (serializableExtra != null) {
                    Consent consent = (Consent) serializableExtra;
                    int intExtra = intent.getIntExtra(ConsentActivityKt.EXTRA_INDEX, -1);
                    String str = "consentsAdapter";
                    if (consent.isConsentGiven()) {
                        ConsentsAdapter consentsAdapter2 = this.consentsAdapter;
                        if (consentsAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        Consents consents = consentsAdapter2.getmDataSet();
                        if (consents == null) {
                            Intrinsics.throwNpe();
                        }
                        consents.approveConsent(consent, intExtra);
                    } else {
                        ConsentsAdapter consentsAdapter3 = this.consentsAdapter;
                        if (consentsAdapter3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        Consents consents2 = consentsAdapter3.getmDataSet();
                        if (consents2 == null) {
                            Intrinsics.throwNpe();
                        }
                        consents2.revokeConsent(consent, intExtra);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Index changed at ");
                    sb.append(intExtra);
                    Log.d(Param.INDEX, sb.toString());
                    ConsentsAdapter consentsAdapter4 = this.consentsAdapter;
                    if (consentsAdapter4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    consentsAdapter4.notifyDataSetChanged();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.consents.Consent");
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Missing consent in result intent from ");
                sb2.append(ConsentDetailActivity.class.getSimpleName());
                new IllegalArgumentException(sb2.toString());
            }
        }
        super.onActivityResult(i, i2, intent);
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
