package com.valora.kkiosk.coupons;

import android.content.Context;
import android.support.p000v4.widget.SwipeRefreshLayout;
import com.mutualmobile.cardstack.CardStackAdapter;
import com.mutualmobile.cardstack.CardStackLayout;
import com.valora.kkiosk.commons.features.CouponsAdapterCardStack;
import com.valora.kkiosk.commons.models.Coupon;
import com.valora.kkioskPreview.C1224R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo21491d2 = {"<anonymous>", "", "retrieved", "", "Lcom/valora/kkiosk/commons/models/Coupon;", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CardsFragment.kt */
final class CardsFragment$requestCards$s$1<T> implements Action1<List<? extends Coupon>> {
    final /* synthetic */ CardsFragment this$0;

    CardsFragment$requestCards$s$1(CardsFragment cardsFragment) {
        this.this$0 = cardsFragment;
    }

    public final void call(List<Coupon> list) {
        CardStackLayout cardStackLayout = (CardStackLayout) this.this$0._$_findCachedViewById(C1224R.C1226id.cards_list);
        String str = "cards_list";
        Intrinsics.checkExpressionValueIsNotNull(cardStackLayout, str);
        Context context = this.this$0.getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        CouponsAdapterCardStack couponsAdapterCardStack = new CouponsAdapterCardStack(cardStackLayout, context, new ArrayList(list));
        Field declaredField = CardStackAdapter.class.getDeclaredField("mScreenHeight");
        Intrinsics.checkExpressionValueIsNotNull(declaredField, "field");
        declaredField.setAccessible(true);
        CardStackLayout cardStackLayout2 = (CardStackLayout) this.this$0._$_findCachedViewById(C1224R.C1226id.cards_list);
        Intrinsics.checkExpressionValueIsNotNull(cardStackLayout2, str);
        declaredField.set(couponsAdapterCardStack, Integer.valueOf(cardStackLayout2.getMeasuredHeight()));
        couponsAdapterCardStack.setSelectedPositionChangedListener(new Function1<Integer, Unit>(this) {
            final /* synthetic */ CardsFragment$requestCards$s$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                SwipeRefreshLayout access$getSwipeContainer$p = this.this$0.this$0.swipeContainer;
                if (access$getSwipeContainer$p != null) {
                    access$getSwipeContainer$p.setEnabled(i < 0);
                }
            }
        });
        CardStackLayout cardStackLayout3 = (CardStackLayout) this.this$0._$_findCachedViewById(C1224R.C1226id.cards_list);
        Intrinsics.checkExpressionValueIsNotNull(cardStackLayout3, str);
        cardStackLayout3.setAdapter(couponsAdapterCardStack);
        SwipeRefreshLayout access$getSwipeContainer$p = this.this$0.swipeContainer;
        if (access$getSwipeContainer$p == null) {
            Intrinsics.throwNpe();
        }
        access$getSwipeContainer$p.setRefreshing(false);
    }
}
