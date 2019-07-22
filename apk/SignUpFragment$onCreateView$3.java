package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.valora.kkiosk.commons.features.UserManager;
import com.valora.kkioskPreview.C1224R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.threeten.p017bp.ZoneId;
import org.threeten.p017bp.ZonedDateTime;
import p018rx.android.schedulers.AndroidSchedulers;
import p018rx.functions.Action1;
import p018rx.schedulers.Schedulers;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: SignUpFragment.kt */
final class SignUpFragment$onCreateView$3 implements OnClickListener {
    final /* synthetic */ InputMethodManager $imm;
    final /* synthetic */ View $view;
    final /* synthetic */ SignUpFragment this$0;

    SignUpFragment$onCreateView$3(SignUpFragment signUpFragment, InputMethodManager inputMethodManager, View view) {
        this.this$0 = signUpFragment;
        this.$imm = inputMethodManager;
        this.$view = view;
    }

    public final void onClick(View view) {
        this.$imm.hideSoftInputFromWindow(this.$view.getWindowToken(), 0);
        ProgressDialog progressDialog = new ProgressDialog(this.this$0.getActivity(), 0);
        progressDialog.setMessage(this.this$0.getString(R.string.please_wait));
        progressDialog.setCancelable(false);
        progressDialog.show();
        ZonedDateTime of = ZonedDateTime.m186of(1980, 2, 2, 12, 0, 0, 0, ZoneId.systemDefault());
        UserManager access$getUserManager$p = this.this$0.getUserManager();
        List approvedConsentIdList = this.this$0.getConsents().getApprovedConsentIdList();
        List revokedConsentIdList = this.this$0.getConsents().getRevokedConsentIdList();
        EditText editText = (EditText) this.this$0._$_findCachedViewById(C1224R.C1226id.pin_code_text);
        Intrinsics.checkExpressionValueIsNotNull(editText, "pin_code_text");
        String obj = editText.getText().toString();
        Intrinsics.checkExpressionValueIsNotNull(of, "fakeDob");
        this.this$0.getSubscriptions().add(access$getUserManager$p.register(approvedConsentIdList, revokedConsentIdList, obj, of).subscribeOn(Schedulers.m217io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1<? super T>) new SignUpFragment$onCreateView$3$s$1<Object>(this, progressDialog), (Action1<Throwable>) new SignUpFragment$onCreateView$3$s$2<Throwable>(this, progressDialog)));
    }
}
