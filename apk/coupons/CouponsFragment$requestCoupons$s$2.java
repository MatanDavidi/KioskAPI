package com.valora.kkiosk.coupons;

import android.support.design.widget.Snackbar;
import android.support.p000v4.widget.SwipeRefreshLayout;
import android.support.p003v7.widget.RecyclerView;
import android.view.View;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CouponsFragment.kt */
final class CouponsFragment$requestCoupons$s$2<T> implements Action1<Throwable> {
    final /* synthetic */ CouponsFragment this$0;

    CouponsFragment$requestCoupons$s$2(CouponsFragment couponsFragment) {
        this.this$0 = couponsFragment;
    }

    public final void call(Throwable th) {
        SwipeRefreshLayout access$getSwipeContainer$p = this.this$0.swipeContainer;
        if (access$getSwipeContainer$p == null) {
            Intrinsics.throwNpe();
        }
        access$getSwipeContainer$p.setRefreshing(false);
        if (((RecyclerView) this.this$0._$_findCachedViewById(C1224R.C1226id.coupons_list)) != null) {
            RecyclerView recyclerView = (RecyclerView) this.this$0._$_findCachedViewById(C1224R.C1226id.coupons_list);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            Snackbar.make((View) recyclerView, (CharSequence) message, 0).show();
        }
    }
}
