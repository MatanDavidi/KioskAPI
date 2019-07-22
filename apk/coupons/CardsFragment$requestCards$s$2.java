package com.valora.kkiosk.coupons;

import android.support.design.widget.Snackbar;
import android.support.p000v4.widget.SwipeRefreshLayout;
import android.view.View;
import com.mutualmobile.cardstack.CardStackLayout;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CardsFragment.kt */
final class CardsFragment$requestCards$s$2<T> implements Action1<Throwable> {
    final /* synthetic */ CardsFragment this$0;

    CardsFragment$requestCards$s$2(CardsFragment cardsFragment) {
        this.this$0 = cardsFragment;
    }

    public final void call(Throwable th) {
        SwipeRefreshLayout access$getSwipeContainer$p = this.this$0.swipeContainer;
        if (access$getSwipeContainer$p == null) {
            Intrinsics.throwNpe();
        }
        access$getSwipeContainer$p.setRefreshing(false);
        if (((CardStackLayout) this.this$0._$_findCachedViewById(C1224R.C1226id.cards_list)) != null) {
            CardStackLayout cardStackLayout = (CardStackLayout) this.this$0._$_findCachedViewById(C1224R.C1226id.cards_list);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            Snackbar.make((View) cardStackLayout, (CharSequence) message, 0).show();
        }
    }
}
