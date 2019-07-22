package com.valora.kkiosk.coupons;

import android.support.p000v4.app.FragmentActivity;
import com.valora.kkiosk.commons.features.CouponsManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo21491d2 = {"<anonymous>", "Lcom/valora/kkiosk/commons/features/CouponsManager;", "invoke"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CardsFragment.kt */
final class CardsFragment$couponsManager$2 extends Lambda implements Function0<CouponsManager> {
    final /* synthetic */ CardsFragment this$0;

    CardsFragment$couponsManager$2(CardsFragment cardsFragment) {
        this.this$0 = cardsFragment;
        super(0);
    }

    @NotNull
    public final CouponsManager invoke() {
        FragmentActivity activity = this.this$0.getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "this.activity!!");
        return new CouponsManager(null, activity, 1, null);
    }
}
