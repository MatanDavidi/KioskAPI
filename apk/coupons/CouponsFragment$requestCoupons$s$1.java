package com.valora.kkiosk.coupons;

import android.content.Intent;
import android.support.p000v4.app.FragmentActivity;
import android.support.p000v4.widget.SwipeRefreshLayout;
import android.support.p003v7.widget.RecyclerView;
import android.support.p003v7.widget.RecyclerView.Adapter;
import com.valora.kkiosk.SplashActivity;
import com.valora.kkiosk.commons.features.CouponsAdapter;
import com.valora.kkiosk.commons.models.APIError;
import com.valora.kkiosk.commons.models.CouponDataResponse;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "retrieved", "Lcom/valora/kkiosk/commons/models/CouponDataResponse;", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CouponsFragment.kt */
final class CouponsFragment$requestCoupons$s$1<T> implements Action1<CouponDataResponse> {
    final /* synthetic */ CouponsFragment this$0;

    CouponsFragment$requestCoupons$s$1(CouponsFragment couponsFragment) {
        this.this$0 = couponsFragment;
    }

    public final void call(CouponDataResponse couponDataResponse) {
        if (couponDataResponse.getApiError() != null) {
            APIError apiError = couponDataResponse.getApiError();
            if (apiError == null) {
                Intrinsics.throwNpe();
            }
            if (Intrinsics.areEqual((Object) apiError.getResponseStatus().getErrorCode(), (Object) "48")) {
                FragmentActivity activity = this.this$0.getActivity();
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                activity.startActivity(new Intent(this.this$0.getActivity(), SplashActivity.class));
                FragmentActivity activity2 = this.this$0.getActivity();
                if (activity2 == null) {
                    Intrinsics.throwNpe();
                }
                activity2.finish();
            }
        }
        RecyclerView recyclerView = (RecyclerView) this.this$0._$_findCachedViewById(C1224R.C1226id.coupons_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "coupons_list");
        Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            ((CouponsAdapter) adapter).clearAndAddCoupons(couponDataResponse.flatten());
            SwipeRefreshLayout access$getSwipeContainer$p = this.this$0.swipeContainer;
            if (access$getSwipeContainer$p == null) {
                Intrinsics.throwNpe();
            }
            access$getSwipeContainer$p.setRefreshing(false);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.commons.features.CouponsAdapter");
    }
}
