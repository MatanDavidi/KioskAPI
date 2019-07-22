package com.valora.kkiosk;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo21491d2 = {"<anonymous>", "", "run"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: SignUpFragment.kt */
final class SignUpFragment$onCreateView$4 implements Runnable {
    final /* synthetic */ View $view;
    final /* synthetic */ SignUpFragment this$0;

    SignUpFragment$onCreateView$4(SignUpFragment signUpFragment, View view) {
        this.this$0 = signUpFragment;
        this.$view = view;
    }

    public final void run() {
        if (this.this$0.getActivity() != null && this.$view != null && ((EditText) this.this$0._$_findCachedViewById(C1224R.C1226id.phone_number_text)) == null) {
            View view = this.$view;
            if (view == null) {
                Intrinsics.throwNpe();
            }
            View findViewById = view.findViewById(R.id.phone_number_text);
            if (findViewById != null) {
                EditText editText = (EditText) findViewById;
                editText.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, 0.0f, 0.0f, 0));
                editText.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, 0.0f, 0.0f, 0));
                editText.setSelection(editText.length());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.EditText");
        }
    }
}
