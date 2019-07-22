package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.p000v4.app.Fragment;
import android.view.View;
import com.valora.kkiosk.coupons.CouponsFragment;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo21491d2 = {"<anonymous>", "", "retrieved", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
final class MainActivity$shareCoupon$dialog$1$s$1<T> implements Action1<Pair<? extends String, ? extends String>> {
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ ObjectRef $progress;
    final /* synthetic */ MainActivity$shareCoupon$dialog$1 this$0;

    MainActivity$shareCoupon$dialog$1$s$1(MainActivity$shareCoupon$dialog$1 mainActivity$shareCoupon$dialog$1, ObjectRef objectRef, String str) {
        this.this$0 = mainActivity$shareCoupon$dialog$1;
        this.$progress = objectRef;
        this.$phoneNumber = str;
    }

    public final void call(Pair<String, String> pair) {
        ((ProgressDialog) this.$progress.element).dismiss();
        String str = "currentFragment";
        if (Intrinsics.areEqual((Object) (String) pair.getFirst(), (Object) "CouldNotShare")) {
            Fragment currentFragment = this.this$0.this$0.getCurrentFragment();
            Intrinsics.checkExpressionValueIsNotNull(currentFragment, str);
            View view = currentFragment.getView();
            if (view == null) {
                Intrinsics.throwNpe();
            }
            Snackbar.make(view, (CharSequence) this.this$0.this$0.getString(R.string.could_not_share), 0).show();
            return;
        }
        this.this$0.$coupon.setShared(true);
        boolean z = this.this$0.this$0.getSupportFragmentManager().findFragmentById(R.id.fragment_container) instanceof CouponsFragment;
        if (pair.getSecond() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("sms:");
            sb.append(this.$phoneNumber);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
            intent.putExtra("sms_body", (String) pair.getSecond());
            this.this$0.this$0.startActivity(intent);
            return;
        }
        Fragment currentFragment2 = this.this$0.this$0.getCurrentFragment();
        Intrinsics.checkExpressionValueIsNotNull(currentFragment2, str);
        View view2 = currentFragment2.getView();
        if (view2 == null) {
            Intrinsics.throwNpe();
        }
        Snackbar.make(view2, (CharSequence) this.this$0.this$0.getString(R.string.coupon_sent), 0).show();
    }
}
