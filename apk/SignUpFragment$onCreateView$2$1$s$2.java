package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.support.design.widget.Snackbar;
import android.view.View;
import kotlin.Metadata;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: SignUpFragment.kt */
final class SignUpFragment$onCreateView$2$1$s$2<T> implements Action1<Throwable> {
    final /* synthetic */ ProgressDialog $dialog;
    final /* synthetic */ C12071 this$0;

    SignUpFragment$onCreateView$2$1$s$2(C12071 r1, ProgressDialog progressDialog) {
        this.this$0 = r1;
        this.$dialog = progressDialog;
    }

    public final void call(Throwable th) {
        this.$dialog.dismiss();
        View view = this.this$0.this$0.$view;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        Snackbar.make(view, (CharSequence) message, 0).show();
    }
}
