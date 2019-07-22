package com.valora.kkiosk.commons.features;

import com.squareup.moshi.Moshi;
import com.squareup.moshi.Moshi.Builder;
import com.valora.kkiosk.commons.models.APIError;
import com.valora.kkiosk.commons.models.CouponDataResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p018rx.functions.Func1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "Lcom/valora/kkiosk/commons/models/CouponDataResponse;", "kotlin.jvm.PlatformType", "it", "", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CouponsManager.kt */
final class CouponsManager$allCoupons$2<T, R> implements Func1<Throwable, CouponDataResponse> {
    final /* synthetic */ CouponsManager this$0;

    CouponsManager$allCoupons$2(CouponsManager couponsManager) {
        this.this$0 = couponsManager;
    }

    public final CouponDataResponse call(Throwable th) {
        Moshi build = new Builder().build();
        APIError aPIError = (APIError) build.adapter(APIError.class).fromJson(th.getMessage());
        if (!Intrinsics.areEqual((Object) aPIError.getResponseStatus().getErrorCode(), (Object) "48")) {
            return (CouponDataResponse) build.adapter(CouponDataResponse.class).fromJson(this.this$0.readFromCache());
        }
        CouponDataResponse couponDataResponse = new CouponDataResponse(null);
        couponDataResponse.setApiError(aPIError);
        return couponDataResponse;
    }
}
