package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.TextView;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.valora.kkiosk.commons.extensions.Helper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: RecruitUserFragment.kt */
final class RecruitUserFragment$onCreateView$1$s$4<T> implements Action1<Throwable> {
    final /* synthetic */ ProgressDialog $dialog;
    final /* synthetic */ RecruitUserFragment$onCreateView$1 this$0;

    RecruitUserFragment$onCreateView$1$s$4(RecruitUserFragment$onCreateView$1 recruitUserFragment$onCreateView$1, ProgressDialog progressDialog) {
        this.this$0 = recruitUserFragment$onCreateView$1;
        this.$dialog = progressDialog;
    }

    public final void call(Throwable th) {
        System.out.print(th);
        this.$dialog.dismiss();
        TextView textView = this.this$0.$errorTextView;
        Intrinsics.checkExpressionValueIsNotNull(textView, "errorTextView");
        textView.setVisibility(0);
        Helper helper = Helper.INSTANCE;
        Context context = this.this$0.this$0.getContext();
        if (context != null) {
            FirebaseAnalytics firebaseAnalytics = ((MainActivity) context).getFirebaseAnalytics();
            if (firebaseAnalytics == null) {
                Intrinsics.throwNpe();
            }
            helper.logEvent(firebaseAnalytics, NativeProtocol.WEB_DIALOG_ACTION, "sharing", "failed");
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.MainActivity");
    }
}
