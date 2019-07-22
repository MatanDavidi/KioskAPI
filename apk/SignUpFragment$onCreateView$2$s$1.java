package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.os.Handler;
import android.os.SystemClock;
import android.support.design.widget.Snackbar;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "retrieved", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: SignUpFragment.kt */
final class SignUpFragment$onCreateView$2$s$1<T> implements Action1<String> {
    final /* synthetic */ ProgressDialog $dialog;
    final /* synthetic */ SignUpFragment$onCreateView$2 this$0;

    SignUpFragment$onCreateView$2$s$1(SignUpFragment$onCreateView$2 signUpFragment$onCreateView$2, ProgressDialog progressDialog) {
        this.this$0 = signUpFragment$onCreateView$2;
        this.$dialog = progressDialog;
    }

    public final void call(String str) {
        if (Intrinsics.areEqual((Object) str, (Object) "SmsSent")) {
            Button button = (Button) this.this$0.this$0._$_findCachedViewById(C1224R.C1226id.next_button);
            Intrinsics.checkExpressionValueIsNotNull(button, "next_button");
            button.setVisibility(8);
            LinearLayout linearLayout = this.this$0.$termsLayout;
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "termsLayout");
            linearLayout.setVisibility(8);
            EditText editText = (EditText) this.this$0.this$0._$_findCachedViewById(C1224R.C1226id.phone_number_text);
            Intrinsics.checkExpressionValueIsNotNull(editText, "phone_number_text");
            editText.setVisibility(8);
            EditText editText2 = (EditText) this.this$0.this$0._$_findCachedViewById(C1224R.C1226id.pin_code_text);
            Intrinsics.checkExpressionValueIsNotNull(editText2, "pin_code_text");
            editText2.setVisibility(0);
            Button button2 = (Button) this.this$0.this$0._$_findCachedViewById(C1224R.C1226id.confirm_pin_button);
            Intrinsics.checkExpressionValueIsNotNull(button2, "confirm_pin_button");
            button2.setVisibility(0);
            Button button3 = (Button) this.this$0.this$0._$_findCachedViewById(C1224R.C1226id.resend_code_button);
            Intrinsics.checkExpressionValueIsNotNull(button3, "resend_code_button");
            button3.setVisibility(0);
            TextView textView = (TextView) this.this$0.this$0._$_findCachedViewById(C1224R.C1226id.info_text_view);
            Intrinsics.checkExpressionValueIsNotNull(textView, "info_text_view");
            textView.setText(this.this$0.this$0.getString(R.string.phone_request_enter_code));
            new Handler().postDelayed(new Runnable(this) {
                final /* synthetic */ SignUpFragment$onCreateView$2$s$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void run() {
                    ((EditText) this.this$0.this$0.this$0._$_findCachedViewById(C1224R.C1226id.pin_code_text)).dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, 0.0f, 0.0f, 0));
                    ((EditText) this.this$0.this$0.this$0._$_findCachedViewById(C1224R.C1226id.pin_code_text)).dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, 0.0f, 0.0f, 0));
                }
            }, 200);
            this.$dialog.dismiss();
            return;
        }
        this.$dialog.dismiss();
        Snackbar.make(this.this$0.$view, (CharSequence) this.this$0.this$0.getString(R.string.one_time_code_error), 0).show();
    }
}
