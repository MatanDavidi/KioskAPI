package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.p000v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import com.valora.kkiosk.commons.extensions.ExtensionsKt;
import com.valora.kkiosk.commons.extensions.RxBaseFragment;
import com.valora.kkiosk.commons.features.UserManager;
import com.valora.kkiosk.consents.Consents;
import com.valora.kkioskPreview.C1224R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.threeten.p017bp.ZonedDateTime;
import org.threeten.p017bp.format.DateTimeFormatter;
import p018rx.android.schedulers.AndroidSchedulers;
import p018rx.functions.Action1;
import p018rx.schedulers.Schedulers;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0002J\"\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u0018H\u0016J\u001a\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0012\u0010\u0013¨\u00060"}, mo21491d2 = {"Lcom/valora/kkiosk/PersonalDataFragment;", "Lcom/valora/kkiosk/commons/extensions/RxBaseFragment;", "()V", "consents", "Lcom/valora/kkiosk/consents/Consents;", "dob", "Lorg/threeten/bp/ZonedDateTime;", "dobFormatter", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "getDobFormatter", "()Lorg/threeten/bp/format/DateTimeFormatter;", "dobFormatter$delegate", "Lkotlin/Lazy;", "mListener", "Lcom/valora/kkiosk/PersonalDataFragment$OnUserProfileFragmentInteractionListener;", "userManager", "Lcom/valora/kkiosk/commons/features/UserManager;", "getUserManager", "()Lcom/valora/kkiosk/commons/features/UserManager;", "userManager$delegate", "gender", "", "navigateNext", "", "isFbLogin", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onViewCreated", "view", "OnUserProfileFragmentInteractionListener", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: PersonalDataFragment.kt */
public final class PersonalDataFragment extends RxBaseFragment {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PersonalDataFragment.class), "userManager", "getUserManager()Lcom/valora/kkiosk/commons/features/UserManager;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PersonalDataFragment.class), "dobFormatter", "getDobFormatter()Lorg/threeten/bp/format/DateTimeFormatter;"))};
    private HashMap _$_findViewCache;
    private Consents consents;
    /* access modifiers changed from: private */
    public ZonedDateTime dob;
    private final Lazy dobFormatter$delegate = LazyKt.lazy(PersonalDataFragment$dobFormatter$2.INSTANCE);
    /* access modifiers changed from: private */
    public OnUserProfileFragmentInteractionListener mListener;
    private final Lazy userManager$delegate = LazyKt.lazy(PersonalDataFragment$userManager$2.INSTANCE);

    @Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo21491d2 = {"Lcom/valora/kkiosk/PersonalDataFragment$OnUserProfileFragmentInteractionListener;", "", "userUpdated", "", "userName", "", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
    /* compiled from: PersonalDataFragment.kt */
    public interface OnUserProfileFragmentInteractionListener {
        void userUpdated(@NotNull String str);
    }

    private final DateTimeFormatter getDobFormatter() {
        Lazy lazy = this.dobFormatter$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (DateTimeFormatter) lazy.getValue();
    }

    private final UserManager getUserManager() {
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

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = viewGroup != null ? ExtensionsKt.inflate(viewGroup, R.layout.fragment_personal_data) : null;
        Bundle arguments = getArguments();
        if (arguments == null) {
            Intrinsics.throwNpe();
        }
        Serializable serializable = arguments.getSerializable(SplashActivityKt.EXTRA_CONSENTS);
        if (serializable != null) {
            this.consents = (Consents) serializable;
            if (inflate == null) {
                Intrinsics.throwNpe();
            }
            View findViewById = inflate.findViewById(R.id.button_complete);
            if (findViewById != null) {
                ((Button) findViewById).setOnClickListener(new PersonalDataFragment$onCreateView$1(this));
                View findViewById2 = inflate.findViewById(R.id.dob_text);
                if (findViewById2 != null) {
                    EditText editText = (EditText) findViewById2;
                    editText.setOnClickListener(new PersonalDataFragment$onCreateView$2(this, editText));
                    return inflate;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.EditText");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.Button");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.consents.Consents");
    }

    static /* synthetic */ void navigateNext$default(PersonalDataFragment personalDataFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        personalDataFragment.navigateNext(z);
    }

    private final void navigateNext(boolean z) {
        View view = getView();
        if (view == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(view, "view!!");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Object systemService = activity.getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            if (gender() != null || z) {
                EditText editText = (EditText) _$_findCachedViewById(C1224R.C1226id.first_name_text);
                String str = "first_name_text";
                Intrinsics.checkExpressionValueIsNotNull(editText, str);
                CharSequence text = editText.getText();
                boolean z2 = true;
                if (text == null || StringsKt.isBlank(text)) {
                    Snackbar.make(view, (CharSequence) getString(R.string.fill_first_name_text), 0).show();
                    return;
                }
                EditText editText2 = (EditText) _$_findCachedViewById(C1224R.C1226id.last_name_text);
                String str2 = "last_name_text";
                Intrinsics.checkExpressionValueIsNotNull(editText2, str2);
                CharSequence text2 = editText2.getText();
                if (text2 != null && !StringsKt.isBlank(text2)) {
                    z2 = false;
                }
                if (z2) {
                    Snackbar.make(view, (CharSequence) getString(R.string.fill_last_name_text), 0).show();
                } else if (this.dob != null || z) {
                    ProgressDialog progressDialog = new ProgressDialog(getActivity(), 0);
                    progressDialog.setMessage(getString(R.string.please_wait));
                    progressDialog.setCancelable(false);
                    progressDialog.show();
                    UserManager userManager = getUserManager();
                    Context context = getContext();
                    if (context == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
                    StringBuilder sb = new StringBuilder();
                    EditText editText3 = (EditText) _$_findCachedViewById(C1224R.C1226id.first_name_text);
                    Intrinsics.checkExpressionValueIsNotNull(editText3, str);
                    sb.append(editText3.getText().toString());
                    sb.append(" ");
                    EditText editText4 = (EditText) _$_findCachedViewById(C1224R.C1226id.last_name_text);
                    Intrinsics.checkExpressionValueIsNotNull(editText4, str2);
                    sb.append(editText4.getText().toString());
                    String sb2 = sb.toString();
                    String gender = gender();
                    ZonedDateTime zonedDateTime = this.dob;
                    if (zonedDateTime == null) {
                        zonedDateTime = ZonedDateTime.now();
                        Intrinsics.checkExpressionValueIsNotNull(zonedDateTime, "ZonedDateTime.now()");
                    }
                    ZonedDateTime zonedDateTime2 = zonedDateTime;
                    Consents consents2 = this.consents;
                    String str3 = "consents";
                    if (consents2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str3);
                    }
                    List approvedConsentIdList = consents2.getApprovedConsentIdList();
                    Consents consents3 = this.consents;
                    if (consents3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str3);
                    }
                    getSubscriptions().add(userManager.updateUser(context, sb2, gender, zonedDateTime2, null, approvedConsentIdList, consents3.getRevokedConsentIdList()).subscribeOn(Schedulers.m217io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1<? super T>) new PersonalDataFragment$navigateNext$s$1<Object>(this, progressDialog, view), (Action1<Throwable>) new PersonalDataFragment$navigateNext$s$2<Throwable>(progressDialog, view)));
                } else {
                    Snackbar.make(view, (CharSequence) getString(R.string.fill_dob_name_text), 0).show();
                }
            } else {
                Snackbar.make(view, (CharSequence) getString(R.string.fill_gender_text), 0).show();
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Nullable
    public final String gender() {
        RadioGroup radioGroup = (RadioGroup) _$_findCachedViewById(C1224R.C1226id.radio_gender_group);
        String str = "radio_gender_group";
        Intrinsics.checkExpressionValueIsNotNull(radioGroup, str);
        if (radioGroup.getCheckedRadioButtonId() == R.id.radio_female_button) {
            return "F";
        }
        RadioGroup radioGroup2 = (RadioGroup) _$_findCachedViewById(C1224R.C1226id.radio_gender_group);
        Intrinsics.checkExpressionValueIsNotNull(radioGroup2, str);
        if (radioGroup2.getCheckedRadioButtonId() == R.id.radio_male_button) {
            return "M";
        }
        return null;
    }

    public void onAttach(@Nullable Context context) {
        super.onAttach(context);
        if (context instanceof OnUserProfileFragmentInteractionListener) {
            this.mListener = (OnUserProfileFragmentInteractionListener) context;
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
}
