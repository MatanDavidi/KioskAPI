package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.support.design.widget.Snackbar;
import android.support.p000v4.app.Fragment;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
final class MainActivity$shareCoupon$dialog$1$s$2<T> implements Action1<Throwable> {
    final /* synthetic */ ObjectRef $progress;
    final /* synthetic */ MainActivity$shareCoupon$dialog$1 this$0;

    MainActivity$shareCoupon$dialog$1$s$2(MainActivity$shareCoupon$dialog$1 mainActivity$shareCoupon$dialog$1, ObjectRef objectRef) {
        this.this$0 = mainActivity$shareCoupon$dialog$1;
        this.$progress = objectRef;
    }

    public final void call(Throwable th) {
        ((ProgressDialog) this.$progress.element).dismiss();
        Fragment currentFragment = this.this$0.this$0.getCurrentFragment();
        Intrinsics.checkExpressionValueIsNotNull(currentFragment, "currentFragment");
        View view = currentFragment.getView();
        if (view == null) {
            Intrinsics.throwNpe();
        }
        Snackbar.make(view, (CharSequence) this.this$0.this$0.getString(R.string.could_not_share), 0).show();
    }
}
