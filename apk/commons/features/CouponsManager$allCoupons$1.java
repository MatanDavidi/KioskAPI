package com.valora.kkiosk.commons.features;

import com.squareup.moshi.Moshi.Builder;
import com.valora.kkiosk.commons.models.CouponDataResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.hockeyapp.android.UpdateActivity;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "it", "Lcom/valora/kkiosk/commons/models/CouponDataResponse;", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CouponsManager.kt */
final class CouponsManager$allCoupons$1<T> implements Action1<CouponDataResponse> {
    final /* synthetic */ CouponsManager this$0;

    CouponsManager$allCoupons$1(CouponsManager couponsManager) {
        this.this$0 = couponsManager;
    }

    public final void call(CouponDataResponse couponDataResponse) {
        couponDataResponse.initialize();
        String json = new Builder().build().adapter(CouponDataResponse.class).toJson(couponDataResponse);
        CouponsManager couponsManager = this.this$0;
        Intrinsics.checkExpressionValueIsNotNull(json, UpdateActivity.EXTRA_JSON);
        couponsManager.writeCache(json);
    }
}
