package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.support.design.widget.Snackbar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "retrieved", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: SignUpFragment.kt */
final class SignUpFragment$onCreateView$2$1$s$1<T> implements Action1<String> {
    final /* synthetic */ ProgressDialog $dialog;
    final /* synthetic */ C12071 this$0;

    SignUpFragment$onCreateView$2$1$s$1(C12071 r1, ProgressDialog progressDialog) {
        this.this$0 = r1;
        this.$dialog = progressDialog;
    }

    public final void call(String str) {
        this.$dialog.dismiss();
        if (Intrinsics.areEqual((Object) str, (Object) "SmsSent")) {
            Snackbar.make(this.this$0.this$0.$view, (CharSequence) this.this$0.this$0.this$0.getString(R.string.resend_code_confirmation), 0).show();
        } else {
            Snackbar.make(this.this$0.this$0.$view, (CharSequence) this.this$0.this$0.this$0.getString(R.string.one_time_code_error), 0).show();
        }
    }
}
