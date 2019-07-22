package com.valora.kkiosk.commons.features;

import com.valora.kkiosk.commons.models.CouponDataResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import p018rx.Observable.OnSubscribe;
import p018rx.Subscriber;
import retrofit2.Response;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a*\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo21491d2 = {"<anonymous>", "", "subscriber", "Lrx/Subscriber;", "Lcom/valora/kkiosk/commons/models/CouponDataResponse;", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CouponsManager.kt */
final class CouponsManager$getAllCoupons$2<T> implements OnSubscribe<T> {
    final /* synthetic */ CouponsManager this$0;

    CouponsManager$getAllCoupons$2(CouponsManager couponsManager) {
        this.this$0 = couponsManager;
    }

    public final void call(Subscriber<? super CouponDataResponse> subscriber) {
        Response execute = this.this$0.api.getCoupons().execute();
        Intrinsics.checkExpressionValueIsNotNull(execute, "response");
        if (execute.isSuccessful()) {
            subscriber.onNext((CouponDataResponse) execute.body());
            subscriber.onCompleted();
            return;
        }
        ResponseBody errorBody = execute.errorBody();
        if (errorBody == null) {
            Intrinsics.throwNpe();
        }
        subscriber.onError(new Exception(errorBody.string()));
    }
}
