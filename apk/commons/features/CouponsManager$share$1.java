package com.valora.kkiosk.commons.features;

import com.valora.kkiosk.commons.models.Coupon;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p018rx.Observable.OnSubscribe;
import p018rx.Subscriber;
import retrofit2.Response;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012f\u0010\u0002\u001ab\u0012*\b\u0000\u0012&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u0004 \u0006*0\u0012*\b\u0000\u0012&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, mo21491d2 = {"<anonymous>", "", "subscriber", "Lrx/Subscriber;", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CouponsManager.kt */
final class CouponsManager$share$1<T> implements OnSubscribe<T> {
    final /* synthetic */ Coupon $coupon;
    final /* synthetic */ String $msn;
    final /* synthetic */ CouponsManager this$0;

    CouponsManager$share$1(CouponsManager couponsManager, Coupon coupon, String str) {
        this.this$0 = couponsManager;
        this.$coupon = coupon;
        this.$msn = str;
    }

    public final void call(Subscriber<? super Pair<String, String>> subscriber) {
        Response execute = this.this$0.api.shareCoupon(this.$coupon, this.$msn).execute();
        Intrinsics.checkExpressionValueIsNotNull(execute, "response");
        if (execute.isSuccessful()) {
            Map map = (Map) execute.body();
            if (map == null) {
                Intrinsics.throwNpe();
            }
            Object obj = map.get("ResultCode");
            if (obj != null) {
                subscriber.onNext(new Pair((String) obj, (String) map.get("Message")));
                subscriber.onCompleted();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
        subscriber.onError(new Throwable(execute.message()));
    }
}
