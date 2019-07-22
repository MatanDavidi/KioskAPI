package com.valora.kkiosk.coupons;

import android.support.p000v4.app.FragmentActivity;
import com.valora.kkiosk.commons.features.CouponsManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo21491d2 = {"<anonymous>", "Lcom/valora/kkiosk/commons/features/CouponsManager;", "invoke"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CouponsCardsFragment.kt */
final class CouponsCardsFragment$couponsManager$2 extends Lambda implements Function0<CouponsManager> {
    final /* synthetic */ CouponsCardsFragment this$0;

    CouponsCardsFragment$couponsManager$2(CouponsCardsFragment couponsCardsFragment) {
        this.this$0 = couponsCardsFragment;
        super(0);
    }

    @NotNull
    public final CouponsManager invoke() {
        FragmentActivity activity = this.this$0.getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
        return new CouponsManager(null, activity, 1, null);
    }
}
