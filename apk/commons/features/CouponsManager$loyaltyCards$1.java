package com.valora.kkiosk.commons.features;

import com.valora.kkiosk.commons.models.Coupon;
import com.valora.kkiosk.commons.models.CouponDataResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p018rx.functions.Func1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, mo21491d2 = {"<anonymous>", "", "Lcom/valora/kkiosk/commons/models/Coupon;", "it", "Lcom/valora/kkiosk/commons/models/CouponDataResponse;", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CouponsManager.kt */
final class CouponsManager$loyaltyCards$1<T, R> implements Func1<T, R> {
    public static final CouponsManager$loyaltyCards$1 INSTANCE = new CouponsManager$loyaltyCards$1();

    CouponsManager$loyaltyCards$1() {
    }

    @NotNull
    public final List<Coupon> call(CouponDataResponse couponDataResponse) {
        List loyalty = couponDataResponse.getLoyalty();
        if (loyalty == null) {
            return CollectionsKt.emptyList();
        }
        Iterable<Object> iterable = loyalty;
        Function1 toCoupon = Coupon.Companion.getToCoupon();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Object invoke : iterable) {
            arrayList.add(toCoupon.invoke(invoke));
        }
        return (List) arrayList;
    }
}
