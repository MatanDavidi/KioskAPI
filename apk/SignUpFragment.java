package com.valora.kkiosk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p000v4.app.Fragment;
import android.support.p000v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.valora.kkiosk.commons.extensions.ExtensionsKt;
import com.valora.kkiosk.commons.extensions.Helper;
import com.valora.kkiosk.commons.extensions.RxBaseFragment;
import com.valora.kkiosk.commons.features.UserManager;
import com.valora.kkiosk.consents.Consent;
import com.valora.kkiosk.consents.ConsentClickableSpan;
import com.valora.kkiosk.consents.ConsentDetailActivity;
import com.valora.kkiosk.consents.ConsentKt;
import com.valora.kkiosk.consents.ConsentVersion;
import com.valora.kkiosk.consents.Consents;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u0018H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006+"}, mo21491d2 = {"Lcom/valora/kkiosk/SignUpFragment;", "Lcom/valora/kkiosk/commons/extensions/RxBaseFragment;", "()V", "consents", "Lcom/valora/kkiosk/consents/Consents;", "getConsents", "()Lcom/valora/kkiosk/consents/Consents;", "setConsents", "(Lcom/valora/kkiosk/consents/Consents;)V", "mListener", "Lcom/valora/kkiosk/SignUpFragment$OnSignUpFragmentInteractionListener;", "masterConsentGiven", "", "submittedPhone", "", "termsBox", "Landroid/widget/CheckBox;", "userManager", "Lcom/valora/kkiosk/commons/features/UserManager;", "getUserManager", "()Lcom/valora/kkiosk/commons/features/UserManager;", "userManager$delegate", "Lkotlin/Lazy;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "OnSignUpFragmentInteractionListener", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: SignUpFragment.kt */
public final class SignUpFragment extends RxBaseFragment {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SignUpFragment.class), "userManager", "getUserManager()Lcom/valora/kkiosk/commons/features/UserManager;"))};
    private HashMap _$_findViewCache;
    @NotNull
    public Consents consents;
    /* access modifiers changed from: private */
    public OnSignUpFragmentInteractionListener mListener;
    /* access modifiers changed from: private */
    public boolean masterConsentGiven;
    /* access modifiers changed from: private */
    public String submittedPhone = "";
    /* access modifiers changed from: private */
    public CheckBox termsBox;
    private final Lazy userManager$delegate = LazyKt.lazy(SignUpFragment$userManager$2.INSTANCE);

    @Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, mo21491d2 = {"Lcom/valora/kkiosk/SignUpFragment$OnSignUpFragmentInteractionListener;", "", "onCodeProvidedIsValid", "", "msn", "", "userId", "consents", "Lcom/valora/kkiosk/consents/Consents;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
    /* compiled from: SignUpFragment.kt */
    public interface OnSignUpFragmentInteractionListener {
        void onCodeProvidedIsValid(@NotNull String str, @NotNull String str2, @NotNull Consents consents);
    }

    /* access modifiers changed from: private */
    public final UserManager getUserManager() {
        Lazy lazy = this.userManager$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (UserManager) lazy.getValue();
    }

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

    public static final /* synthetic */ CheckBox access$getTermsBox$p(SignUpFragment signUpFragment) {
        CheckBox checkBox = signUpFragment.termsBox;
        if (checkBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("termsBox");
        }
        return checkBox;
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

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        if (arguments == null) {
            Intrinsics.throwNpe();
        }
        Serializable serializable = arguments.getSerializable(SplashActivityKt.EXTRA_CONSENTS);
        if (serializable != null) {
            this.consents = (Consents) serializable;
            View inflate = viewGroup != null ? ExtensionsKt.inflate(viewGroup, R.layout.fragment_sign_up) : null;
            if (inflate == null) {
                Intrinsics.throwNpe();
            }
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.fragment_sign_up_checkbox_container);
            View findViewById = inflate.findViewById(R.id.user_terms_box);
            if (findViewById != null) {
                this.termsBox = (CheckBox) findViewById;
                View findViewById2 = inflate.findViewById(R.id.fragment_sign_up_tos_checkbox_text);
                if (findViewById2 != null) {
                    TextView textView = (TextView) findViewById2;
                    String string = getString(R.string.tos);
                    Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.tos)");
                    String string2 = getString(R.string.space_and_space);
                    Intrinsics.checkExpressionValueIsNotNull(string2, "getString(R.string.space_and_space)");
                    String string3 = getString(R.string.data_privacy);
                    Intrinsics.checkExpressionValueIsNotNull(string3, "getString(R.string.data_privacy)");
                    String string4 = getString(R.string.i_accept_ph);
                    Intrinsics.checkExpressionValueIsNotNull(string4, "getString(R.string.i_accept_ph)");
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    Object[] objArr = {string3, string2, string};
                    String format = String.format(string4, Arrays.copyOf(objArr, objArr.length));
                    Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                    SpannableString spannableString = new SpannableString(format);
                    int length = string4.length() - 6;
                    Consents consents2 = this.consents;
                    String str = "consents";
                    if (consents2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    Fragment fragment = this;
                    spannableString.setSpan(new ConsentClickableSpan(consents2.getMasterConsent(), fragment), length, string3.length() + length, 33);
                    Consents consents3 = this.consents;
                    if (consents3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    spannableString.setSpan(new ConsentClickableSpan(consents3.getTermsOfUseConsent(), fragment), format.length() - string.length(), format.length(), 33);
                    textView.setText(spannableString);
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    textView.setHighlightColor(getResources().getColor(R.color.colorPrimary));
                    CheckBox checkBox = this.termsBox;
                    if (checkBox == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("termsBox");
                    }
                    checkBox.setOnCheckedChangeListener(new SignUpFragment$onCreateView$1(this));
                    FragmentActivity activity = getActivity();
                    if (activity == null) {
                        Intrinsics.throwNpe();
                    }
                    Object systemService = activity.getSystemService("input_method");
                    if (systemService != null) {
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        Helper helper = Helper.INSTANCE;
                        Context context = getContext();
                        if (context != null) {
                            FirebaseAnalytics firebaseAnalytics = ((RegistrationActivity) context).getFirebaseAnalytics();
                            if (firebaseAnalytics == null) {
                                Intrinsics.throwNpe();
                            }
                            helper.logEvent(firebaseAnalytics, NativeProtocol.WEB_DIALOG_ACTION, "registration", "begins");
                            View findViewById3 = inflate.findViewById(R.id.next_button);
                            String str2 = "null cannot be cast to non-null type android.widget.Button";
                            if (findViewById3 != null) {
                                ((Button) findViewById3).setOnClickListener(new SignUpFragment$onCreateView$2(this, inflate, linearLayout));
                                View findViewById4 = inflate.findViewById(R.id.confirm_pin_button);
                                if (findViewById4 != null) {
                                    ((Button) findViewById4).setOnClickListener(new SignUpFragment$onCreateView$3(this, inputMethodManager, inflate));
                                    new Handler().postDelayed(new SignUpFragment$onCreateView$4(this, inflate), 200);
                                    return inflate;
                                }
                                throw new TypeCastException(str2);
                            }
                            throw new TypeCastException(str2);
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.RegistrationActivity");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.CheckBox");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.consents.Consents");
    }

    public void onAttach(@Nullable Context context) {
        super.onAttach(context);
        if (context instanceof OnSignUpFragmentInteractionListener) {
            this.mListener = (OnSignUpFragmentInteractionListener) context;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        sb.append(context.toString());
        sb.append(" must implement OnSignUpFragmentInteractionListener");
        throw new RuntimeException(sb.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.mListener = null;
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (i == 981 && i2 == -1) {
            if (intent != null) {
                Serializable serializableExtra = intent.getSerializableExtra(ConsentKt.EXTRA_CONSENT);
                if (serializableExtra != null) {
                    Consent consent = (Consent) serializableExtra;
                    String str = "consents";
                    if (consent.isMasterConsent()) {
                        this.masterConsentGiven = consent.isConsentGiven();
                        CheckBox checkBox = this.termsBox;
                        if (checkBox == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("termsBox");
                        }
                        checkBox.setChecked(consent.isConsentGiven());
                        if (this.masterConsentGiven) {
                            Consents consents2 = this.consents;
                            if (consents2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            consents2.approveMasterConsent();
                        } else {
                            Consents consents3 = this.consents;
                            if (consents3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            ConsentVersion currentVersion = consents3.getMasterConsent().getCurrentVersion();
                            FragmentActivity activity = getActivity();
                            if (activity == null) {
                                Intrinsics.throwNpe();
                            }
                            Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
                            currentVersion.getRevokeWarningDialog(activity, new SignUpFragment$onActivityResult$1(this)).show();
                            Consents consents4 = this.consents;
                            if (consents4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            consents4.revokeMasterConsent();
                        }
                    } else if (consent.isConsentGiven()) {
                        Consents consents5 = this.consents;
                        if (consents5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        consents5.approveConsent(consent, -1);
                    } else {
                        Consents consents6 = this.consents;
                        if (consents6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        consents6.revokeConsent(consent, -1);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.consents.Consent");
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing consent in result intent from ");
                sb.append(ConsentDetailActivity.class.getSimpleName());
                new IllegalArgumentException(sb.toString());
            }
        }
        super.onActivityResult(i, i2, intent);
    }
}
