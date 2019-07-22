package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.content.Context;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.valora.kkiosk.SignUpFragment.OnSignUpFragmentInteractionListener;
import com.valora.kkiosk.commons.extensions.Helper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "retrieved", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: SignUpFragment.kt */
final class SignUpFragment$onCreateView$3$s$1<T> implements Action1<String> {
    final /* synthetic */ ProgressDialog $dialog;
    final /* synthetic */ SignUpFragment$onCreateView$3 this$0;

    SignUpFragment$onCreateView$3$s$1(SignUpFragment$onCreateView$3 signUpFragment$onCreateView$3, ProgressDialog progressDialog) {
        this.this$0 = signUpFragment$onCreateView$3;
        this.$dialog = progressDialog;
    }

    public final void call(String str) {
        this.$dialog.dismiss();
        OnSignUpFragmentInteractionListener access$getMListener$p = this.this$0.this$0.mListener;
        if (access$getMListener$p != null) {
            String access$getSubmittedPhone$p = this.this$0.this$0.submittedPhone;
            Intrinsics.checkExpressionValueIsNotNull(str, "retrieved");
            access$getMListener$p.onCodeProvidedIsValid(access$getSubmittedPhone$p, str, this.this$0.this$0.getConsents());
        }
        Helper helper = Helper.INSTANCE;
        Context context = this.this$0.this$0.getContext();
        if (context != null) {
            FirebaseAnalytics firebaseAnalytics = ((RegistrationActivity) context).getFirebaseAnalytics();
            if (firebaseAnalytics == null) {
                Intrinsics.throwNpe();
            }
            helper.logEvent(firebaseAnalytics, NativeProtocol.WEB_DIALOG_ACTION, "registration", "completed");
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.RegistrationActivity");
    }
}
