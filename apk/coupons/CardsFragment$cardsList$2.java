package com.valora.kkiosk.coupons;

import com.mutualmobile.cardstack.CardStackLayout;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo21491d2 = {"<anonymous>", "Lcom/mutualmobile/cardstack/CardStackLayout;", "kotlin.jvm.PlatformType", "invoke"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CardsFragment.kt */
final class CardsFragment$cardsList$2 extends Lambda implements Function0<CardStackLayout> {
    final /* synthetic */ CardsFragment this$0;

    CardsFragment$cardsList$2(CardsFragment cardsFragment) {
        this.this$0 = cardsFragment;
        super(0);
    }

    public final CardStackLayout invoke() {
        return (CardStackLayout) this.this$0._$_findCachedViewById(C1224R.C1226id.cards_list);
    }
}
