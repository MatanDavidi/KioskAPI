package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.support.design.widget.Snackbar;
import android.view.View;
import kotlin.Metadata;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: PersonalDataFragment.kt */
final class PersonalDataFragment$navigateNext$s$2<T> implements Action1<Throwable> {
    final /* synthetic */ ProgressDialog $dialog;
    final /* synthetic */ View $view;

    PersonalDataFragment$navigateNext$s$2(ProgressDialog progressDialog, View view) {
        this.$dialog = progressDialog;
        this.$view = view;
    }

    public final void call(Throwable th) {
        this.$dialog.dismiss();
        View view = this.$view;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        Snackbar.make(view, (CharSequence) message, 0).show();
    }
}
