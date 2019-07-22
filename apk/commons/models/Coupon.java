package com.valora.kkiosk.commons.models;

import com.valora.kkiosk.commons.adapters.AdapterConstants;
import com.valora.kkiosk.commons.adapters.ViewType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u0000 B2\u00020\u0001:\u0001BB©\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0002\u0010\u0014J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00100\u001a\u00020\u0012HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jº\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00122\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\b\u0010>\u001a\u00020\rH\u0016J\t\u0010?\u001a\u00020\rHÖ\u0001J\u0006\u0010@\u001a\u00020\u0012J\b\u0010A\u001a\u00020\u0003H\u0016R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u001a\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0016¨\u0006C"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/models/Coupon;", "Lcom/valora/kkiosk/commons/adapters/ViewType;", "contentUrl", "", "topImageUrl", "barcodeUrl", "topText", "bottomText", "bottomImageUrl", "backImageUrl", "thumbUrl", "overlayUrl", "campaignId", "", "scheduleId", "ShareType", "couponId", "dummy", "", "shared", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V", "getBackImageUrl", "()Ljava/lang/String;", "getBarcodeUrl", "getBottomImageUrl", "getBottomText", "getCampaignId", "()I", "getContentUrl", "getCouponId", "getDummy", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOverlayUrl", "getScheduleId", "getShared", "()Z", "setShared", "(Z)V", "getThumbUrl", "getTopImageUrl", "getTopText", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)Lcom/valora/kkiosk/commons/models/Coupon;", "equals", "other", "", "getViewType", "hashCode", "isShareable", "toString", "Companion", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Coupon.kt */
public final class Coupon implements ViewType {
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String NOT_SHAREABLE = "NotShareable";
    @NotNull
    public static final String SHAREABLE = "Shareable";
    @NotNull
    public static final String SHARE_AND_CARE = "ShareAndCare";
    /* access modifiers changed from: private */
    @NotNull
    public static final Function1<CouponData, Coupon> toCoupon = Coupon$Companion$toCoupon$1.INSTANCE;
    private final String ShareType;
    @Nullable
    private final String backImageUrl;
    @Nullable
    private final String barcodeUrl;
    @Nullable
    private final String bottomImageUrl;
    @Nullable
    private final String bottomText;
    private final int campaignId;
    @Nullable
    private final String contentUrl;
    @NotNull
    private final String couponId;
    @Nullable
    private final Boolean dummy;
    @Nullable
    private final String overlayUrl;
    private final int scheduleId;
    private boolean shared;
    @Nullable
    private final String thumbUrl;
    @Nullable
    private final String topImageUrl;
    @Nullable
    private final String topText;

    @Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/models/Coupon$Companion;", "", "()V", "NOT_SHAREABLE", "", "SHAREABLE", "SHARE_AND_CARE", "toCoupon", "Lkotlin/Function1;", "Lcom/valora/kkiosk/commons/models/CouponData;", "Lcom/valora/kkiosk/commons/models/Coupon;", "getToCoupon", "()Lkotlin/jvm/functions/Function1;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
    /* compiled from: Coupon.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function1<CouponData, Coupon> getToCoupon() {
            return Coupon.toCoupon;
        }
    }

    private final String component12() {
        return this.ShareType;
    }

    @NotNull
    public static /* synthetic */ Coupon copy$default(Coupon coupon, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2, String str10, String str11, Boolean bool, boolean z, int i3, Object obj) {
        Coupon coupon2 = coupon;
        int i4 = i3;
        return coupon.copy((i4 & 1) != 0 ? coupon2.contentUrl : str, (i4 & 2) != 0 ? coupon2.topImageUrl : str2, (i4 & 4) != 0 ? coupon2.barcodeUrl : str3, (i4 & 8) != 0 ? coupon2.topText : str4, (i4 & 16) != 0 ? coupon2.bottomText : str5, (i4 & 32) != 0 ? coupon2.bottomImageUrl : str6, (i4 & 64) != 0 ? coupon2.backImageUrl : str7, (i4 & 128) != 0 ? coupon2.thumbUrl : str8, (i4 & 256) != 0 ? coupon2.overlayUrl : str9, (i4 & 512) != 0 ? coupon2.campaignId : i, (i4 & 1024) != 0 ? coupon2.scheduleId : i2, (i4 & 2048) != 0 ? coupon2.ShareType : str10, (i4 & 4096) != 0 ? coupon2.couponId : str11, (i4 & 8192) != 0 ? coupon2.dummy : bool, (i4 & 16384) != 0 ? coupon2.shared : z);
    }

    @Nullable
    public final String component1() {
        return this.contentUrl;
    }

    public final int component10() {
        return this.campaignId;
    }

    public final int component11() {
        return this.scheduleId;
    }

    @NotNull
    public final String component13() {
        return this.couponId;
    }

    @Nullable
    public final Boolean component14() {
        return this.dummy;
    }

    public final boolean component15() {
        return this.shared;
    }

    @Nullable
    public final String component2() {
        return this.topImageUrl;
    }

    @Nullable
    public final String component3() {
        return this.barcodeUrl;
    }

    @Nullable
    public final String component4() {
        return this.topText;
    }

    @Nullable
    public final String component5() {
        return this.bottomText;
    }

    @Nullable
    public final String component6() {
        return this.bottomImageUrl;
    }

    @Nullable
    public final String component7() {
        return this.backImageUrl;
    }

    @Nullable
    public final String component8() {
        return this.thumbUrl;
    }

    @Nullable
    public final String component9() {
        return this.overlayUrl;
    }

    @NotNull
    public final Coupon copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, int i, int i2, @Nullable String str10, @NotNull String str11, @Nullable Boolean bool, boolean z) {
        String str12 = str11;
        Intrinsics.checkParameterIsNotNull(str12, "couponId");
        Coupon coupon = new Coupon(str, str2, str3, str4, str5, str6, str7, str8, str9, i, i2, str10, str12, bool, z);
        return coupon;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof Coupon) {
                Coupon coupon = (Coupon) obj;
                if (Intrinsics.areEqual((Object) this.contentUrl, (Object) coupon.contentUrl) && Intrinsics.areEqual((Object) this.topImageUrl, (Object) coupon.topImageUrl) && Intrinsics.areEqual((Object) this.barcodeUrl, (Object) coupon.barcodeUrl) && Intrinsics.areEqual((Object) this.topText, (Object) coupon.topText) && Intrinsics.areEqual((Object) this.bottomText, (Object) coupon.bottomText) && Intrinsics.areEqual((Object) this.bottomImageUrl, (Object) coupon.bottomImageUrl) && Intrinsics.areEqual((Object) this.backImageUrl, (Object) coupon.backImageUrl) && Intrinsics.areEqual((Object) this.thumbUrl, (Object) coupon.thumbUrl) && Intrinsics.areEqual((Object) this.overlayUrl, (Object) coupon.overlayUrl)) {
                    if (this.campaignId == coupon.campaignId) {
                        if ((this.scheduleId == coupon.scheduleId) && Intrinsics.areEqual((Object) this.ShareType, (Object) coupon.ShareType) && Intrinsics.areEqual((Object) this.couponId, (Object) coupon.couponId) && Intrinsics.areEqual((Object) this.dummy, (Object) coupon.dummy)) {
                            if (this.shared == coupon.shared) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.contentUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.topImageUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.barcodeUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.topText;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.bottomText;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.bottomImageUrl;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.backImageUrl;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.thumbUrl;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.overlayUrl;
        int hashCode9 = (((((hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31) + this.campaignId) * 31) + this.scheduleId) * 31;
        String str10 = this.ShareType;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.couponId;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        Boolean bool = this.dummy;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i2 = (hashCode11 + i) * 31;
        boolean z = this.shared;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public Coupon(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, int i, int i2, @Nullable String str10, @NotNull String str11, @Nullable Boolean bool, boolean z) {
        String str12 = str11;
        Intrinsics.checkParameterIsNotNull(str12, "couponId");
        this.contentUrl = str;
        this.topImageUrl = str2;
        this.barcodeUrl = str3;
        this.topText = str4;
        this.bottomText = str5;
        this.bottomImageUrl = str6;
        this.backImageUrl = str7;
        this.thumbUrl = str8;
        this.overlayUrl = str9;
        this.campaignId = i;
        this.scheduleId = i2;
        this.ShareType = str10;
        this.couponId = str12;
        this.dummy = bool;
        this.shared = z;
    }

    public /* synthetic */ Coupon(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2, String str10, String str11, Boolean bool, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4 = i3;
        this((i4 & 1) != 0 ? null : str, str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? null : str5, (i4 & 32) != 0 ? null : str6, (i4 & 64) != 0 ? null : str7, (i4 & 128) != 0 ? null : str8, (i4 & 256) != 0 ? null : str9, i, i2, (i4 & 2048) != 0 ? null : str10, str11, (i4 & 8192) != 0 ? Boolean.valueOf(false) : bool, (i4 & 16384) != 0 ? false : z);
    }

    @Nullable
    public final String getContentUrl() {
        return this.contentUrl;
    }

    @Nullable
    public final String getTopImageUrl() {
        return this.topImageUrl;
    }

    @Nullable
    public final String getBarcodeUrl() {
        return this.barcodeUrl;
    }

    @Nullable
    public final String getTopText() {
        return this.topText;
    }

    @Nullable
    public final String getBottomText() {
        return this.bottomText;
    }

    @Nullable
    public final String getBottomImageUrl() {
        return this.bottomImageUrl;
    }

    @Nullable
    public final String getBackImageUrl() {
        return this.backImageUrl;
    }

    @Nullable
    public final String getThumbUrl() {
        return this.thumbUrl;
    }

    @Nullable
    public final String getOverlayUrl() {
        return this.overlayUrl;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final int getScheduleId() {
        return this.scheduleId;
    }

    @NotNull
    public final String getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final Boolean getDummy() {
        return this.dummy;
    }

    public final boolean getShared() {
        return this.shared;
    }

    public final void setShared(boolean z) {
        this.shared = z;
    }

    public final boolean isShareable() {
        String str = this.ShareType;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1116702519) {
                if (hashCode == 422313369 && str.equals(SHAREABLE)) {
                    return true;
                }
            } else if (str.equals(SHARE_AND_CARE)) {
                return true;
            }
        }
        return false;
    }

    public int getViewType() {
        return AdapterConstants.INSTANCE.getCOUPON();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coupon(shareable=");
        sb.append(isShareable());
        sb.append(" ShareType=");
        sb.append(this.ShareType);
        sb.append(", contentUrl=");
        sb.append(this.contentUrl);
        sb.append(", topImageUrl=");
        sb.append(this.topImageUrl);
        sb.append(", barcodeUrl=");
        sb.append(this.barcodeUrl);
        sb.append(", topText=");
        sb.append(this.topText);
        sb.append(", bottomText=");
        sb.append(this.bottomText);
        sb.append(", bottomImageUrl=");
        sb.append(this.bottomImageUrl);
        sb.append(", backImageUrl=");
        sb.append(this.backImageUrl);
        sb.append(", thumbUrl=");
        sb.append(this.thumbUrl);
        sb.append(", overlayUrl=");
        sb.append(this.overlayUrl);
        sb.append(", campaignId=");
        sb.append(this.campaignId);
        sb.append(", scheduleId=");
        sb.append(this.scheduleId);
        sb.append(", couponId='");
        sb.append(this.couponId);
        sb.append("', dummy=");
        sb.append(this.dummy);
        sb.append(", shared=");
        sb.append(this.shared);
        sb.append(')');
        return sb.toString();
    }
}
