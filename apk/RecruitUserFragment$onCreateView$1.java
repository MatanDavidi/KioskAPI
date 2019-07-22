package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.support.design.widget.Snackbar;
import android.support.p000v4.app.FragmentActivity;
import android.text.Editable;
import android.util.Patterns;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import p018rx.android.schedulers.AndroidSchedulers;
import p018rx.functions.Action1;
import p018rx.schedulers.Schedulers;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: RecruitUserFragment.kt */
final class RecruitUserFragment$onCreateView$1 implements OnClickListener {
    final /* synthetic */ TextView $errorTextView;
    final /* synthetic */ EditText $phoneEditText;
    final /* synthetic */ View $view;
    final /* synthetic */ RecruitUserFragment this$0;

    RecruitUserFragment$onCreateView$1(RecruitUserFragment recruitUserFragment, EditText editText, View view, TextView textView) {
        this.this$0 = recruitUserFragment;
        this.$phoneEditText = editText;
        this.$view = view;
        this.$errorTextView = textView;
    }

    public final void onClick(View view) {
        Editable text = this.$phoneEditText.getText();
        CharSequence charSequence = text;
        if (!Patterns.PHONE.matcher(charSequence).matches()) {
            Snackbar.make(this.$view, (CharSequence) this.this$0.getString(R.string.phone_number_invalid), 0).show();
            return;
        }
        Intrinsics.checkExpressionValueIsNotNull(text, "numberInput");
        String replace = new Regex("[^\\d+]").replace(charSequence, "");
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
            this.this$0.getSubscriptions().add(this.this$0.getUserManager().validateRecruit(replace).doOnNext(new RecruitUserFragment$onCreateView$1$s$1(this, replace)).doOnError(RecruitUserFragment$onCreateView$1$s$2.INSTANCE).subscribeOn(Schedulers.m217io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1<? super T>) new RecruitUserFragment$onCreateView$1$s$3<Object>(this, progressDialog, replace), (Action1<Throwable>) new RecruitUserFragment$onCreateView$1$s$4<Throwable>(this, progressDialog)));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
