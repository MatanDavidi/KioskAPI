package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.p000v4.app.FragmentActivity;
import android.text.Editable;
import android.util.Patterns;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.valora.kkiosk.commons.extensions.Helper;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import p018rx.android.schedulers.AndroidSchedulers;
import p018rx.functions.Action1;
import p018rx.schedulers.Schedulers;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: SignUpFragment.kt */
final class SignUpFragment$onCreateView$2 implements OnClickListener {
    final /* synthetic */ LinearLayout $termsLayout;
    final /* synthetic */ View $view;
    final /* synthetic */ SignUpFragment this$0;

    SignUpFragment$onCreateView$2(SignUpFragment signUpFragment, View view, LinearLayout linearLayout) {
        this.this$0 = signUpFragment;
        this.$view = view;
        this.$termsLayout = linearLayout;
    }

    public final void onClick(View view) {
        Helper helper = Helper.INSTANCE;
        Context context = this.this$0.getContext();
        if (context != null) {
            FirebaseAnalytics firebaseAnalytics = ((RegistrationActivity) context).getFirebaseAnalytics();
            if (firebaseAnalytics == null) {
                Intrinsics.throwNpe();
            }
            helper.logEvent(firebaseAnalytics, "ui_action", "button_press", "registration");
            EditText editText = (EditText) this.this$0._$_findCachedViewById(C1224R.C1226id.phone_number_text);
            Intrinsics.checkExpressionValueIsNotNull(editText, "phone_number_text");
            Editable text = editText.getText();
            CharSequence charSequence = text;
            if (charSequence == null || StringsKt.isBlank(charSequence)) {
                Snackbar.make(this.$view, (CharSequence) this.this$0.getString(R.string.fill_phone_number), 0).show();
            } else if (!Patterns.PHONE.matcher(charSequence).matches()) {
                Snackbar.make(this.$view, (CharSequence) this.this$0.getString(R.string.phone_number_invalid), 0).show();
            } else {
                CheckBox checkBox = (CheckBox) this.this$0._$_findCachedViewById(C1224R.C1226id.user_terms_box);
                Intrinsics.checkExpressionValueIsNotNull(checkBox, "user_terms_box");
                if (!checkBox.isChecked()) {
                    Snackbar.make(this.$view, (CharSequence) this.this$0.getString(R.string.terms_and_conditions_not_accepted), 0).show();
                    return;
                }
                FragmentActivity activity = this.this$0.getActivity();
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                Object systemService = activity.getSystemService("input_method");
                if (systemService != null) {
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(this.$view.getWindowToken(), 0);
                    ProgressDialog progressDialog = new ProgressDialog(this.this$0.getActivity(), 0);
                    progressDialog.setMessage(this.this$0.getString(R.string.please_wait));
                    progressDialog.setCancelable(false);
                    progressDialog.show();
                    ((Button) this.this$0._$_findCachedViewById(C1224R.C1226id.resend_code_button)).setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ SignUpFragment$onCreateView$2 this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void onClick(View view) {
                            ProgressDialog progressDialog = new ProgressDialog(this.this$0.this$0.getActivity(), 0);
                            progressDialog.setMessage(this.this$0.this$0.getString(R.string.please_wait));
                            progressDialog.setCancelable(false);
                            progressDialog.show();
                            this.this$0.this$0.getUserManager().requestPin(this.this$0.this$0.submittedPhone).subscribeOn(Schedulers.m217io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1<? super T>) new SignUpFragment$onCreateView$2$1$s$1<Object>(this, progressDialog), (Action1<Throwable>) new SignUpFragment$onCreateView$2$1$s$2<Throwable>(this, progressDialog));
                        }
                    });
                    this.this$0.submittedPhone = new Regex("[^\\d+]").replace(text.toString(), "");
                    this.this$0.getSubscriptions().add(this.this$0.getUserManager().requestPin(this.this$0.submittedPhone).subscribeOn(Schedulers.m217io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1<? super T>) new SignUpFragment$onCreateView$2$s$1<Object>(this, progressDialog), (Action1<Throwable>) new SignUpFragment$onCreateView$2$s$2<Throwable>(this, progressDialog)));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.RegistrationActivity");
        }
    }
}
