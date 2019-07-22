package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TextInputEditText;
import android.support.p000v4.app.FragmentActivity;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.valora.kkiosk.commons.extensions.Helper;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "retrieved", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: RecruitUserFragment.kt */
final class RecruitUserFragment$onCreateView$1$s$3<T> implements Action1<String> {
    final /* synthetic */ ProgressDialog $dialog;
    final /* synthetic */ String $textNumber;
    final /* synthetic */ RecruitUserFragment$onCreateView$1 this$0;

    RecruitUserFragment$onCreateView$1$s$3(RecruitUserFragment$onCreateView$1 recruitUserFragment$onCreateView$1, ProgressDialog progressDialog, String str) {
        this.this$0 = recruitUserFragment$onCreateView$1;
        this.$dialog = progressDialog;
        this.$textNumber = str;
    }

    public final void call(String str) {
        this.$dialog.dismiss();
        StringBuilder sb = new StringBuilder();
        sb.append("sms:");
        sb.append(this.$textNumber);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.putExtra("sms_body", str);
        FragmentActivity activity = this.this$0.this$0.getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        activity.startActivity(intent);
        ((TextInputEditText) this.this$0.this$0._$_findCachedViewById(C1224R.C1226id.friend_phone_number_text)).setText("");
        Helper helper = Helper.INSTANCE;
        Context context = this.this$0.this$0.getContext();
        if (context != null) {
            FirebaseAnalytics firebaseAnalytics = ((MainActivity) context).getFirebaseAnalytics();
            if (firebaseAnalytics == null) {
                Intrinsics.throwNpe();
            }
            helper.logEvent(firebaseAnalytics, NativeProtocol.WEB_DIALOG_ACTION, "sharing", "completed");
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.MainActivity");
    }
}
