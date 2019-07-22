package com.valora.kkiosk.commons.models;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo21491d2 = {"<anonymous>", "Lcom/valora/kkiosk/commons/models/Coupon;", "it", "Lcom/valora/kkiosk/commons/models/CouponData;", "invoke"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: Coupon.kt */
final class Coupon$Companion$toCoupon$1 extends Lambda implements Function1<CouponData, Coupon> {
    public static final Coupon$Companion$toCoupon$1 INSTANCE = new Coupon$Companion$toCoupon$1();

    Coupon$Companion$toCoupon$1() {
        super(1);
    }

    @NotNull
    public final Coupon invoke(@NotNull CouponData couponData) {
        Intrinsics.checkParameterIsNotNull(couponData, "it");
        String topText = couponData.getTopText();
        String contentUrl = couponData.getContentUrl();
        String topImageUrl = couponData.getTopImageUrl();
        String barcodeUrl = couponData.getBarcodeUrl();
        String bottomText = couponData.getBottomText();
        String bottomImageUrl = couponData.getBottomImageUrl();
        String backUrl = couponData.getBackUrl();
        String thumbUrl = couponData.getThumbUrl();
        int scheduleId = couponData.getScheduleId();
        String shareType = couponData.getShareType();
        String contentId = couponData.getContentId();
        if (contentId == null) {
            Intrinsics.throwNpe();
        }
        Coupon coupon = new Coupon(contentUrl, topImageUrl, barcodeUrl, topText, bottomText, bottomImageUrl, backUrl, thumbUrl, null, -1, scheduleId, shareType, contentId, couponData.getDummy(), false);
        return coupon;
    }
}
