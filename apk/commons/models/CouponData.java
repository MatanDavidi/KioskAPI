package com.valora.kkiosk.commons.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001f\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u001aJ\b\u00104\u001a\u00020\u0003H\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b(\u0010\u001cR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u00065"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/models/CouponData;", "", "ContentId", "", "TopImageUrl", "TopText", "BottomText", "BottomImageUrl", "Description", "SubText", "AmountLeft", "ShareType", "ValidForStoreTags", "", "Activated", "", "BackUrl", "ContentUrl", "ThumbUrl", "BackgroundColour", "BarcodeUrl", "ScheduleId", "", "Type", "ExpiryDate", "Dummy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getActivated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAmountLeft", "()Ljava/lang/String;", "getBackUrl", "getBackgroundColour", "getBarcodeUrl", "getBottomImageUrl", "getBottomText", "getContentId", "getContentUrl", "getDescription", "getDummy", "getExpiryDate", "getScheduleId", "()I", "getShareType", "getSubText", "getThumbUrl", "getTopImageUrl", "getTopText", "getType", "getValidForStoreTags", "()Ljava/util/List;", "toString", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Coupon.kt */
public final class CouponData {
    @Nullable
    private final Boolean Activated;
    @NotNull
    private final String AmountLeft;
    @Nullable
    private final String BackUrl;
    @Nullable
    private final String BackgroundColour;
    @Nullable
    private final String BarcodeUrl;
    @Nullable
    private final String BottomImageUrl;
    @Nullable
    private final String BottomText;
    @Nullable
    private final String ContentId;
    @NotNull
    private final String ContentUrl;
    @Nullable
    private final String Description;
    @Nullable
    private final Boolean Dummy;
    @Nullable
    private final String ExpiryDate;
    private final int ScheduleId;
    @NotNull
    private final String ShareType;
    @Nullable
    private final String SubText;
    @Nullable
    private final String ThumbUrl;
    @Nullable
    private final String TopImageUrl;
    @Nullable
    private final String TopText;
    @Nullable
    private final String Type;
    @Nullable
    private final List<String> ValidForStoreTags;

    public CouponData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull String str8, @NotNull String str9, @Nullable List<String> list, @Nullable Boolean bool, @Nullable String str10, @NotNull String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, int i, @Nullable String str15, @Nullable String str16, @Nullable Boolean bool2) {
        String str17 = str8;
        String str18 = str9;
        String str19 = str11;
        Intrinsics.checkParameterIsNotNull(str8, "AmountLeft");
        Intrinsics.checkParameterIsNotNull(str9, "ShareType");
        Intrinsics.checkParameterIsNotNull(str19, "ContentUrl");
        this.ContentId = str;
        this.TopImageUrl = str2;
        this.TopText = str3;
        this.BottomText = str4;
        this.BottomImageUrl = str5;
        this.Description = str6;
        this.SubText = str7;
        this.AmountLeft = str17;
        this.ShareType = str18;
        this.ValidForStoreTags = list;
        this.Activated = bool;
        this.BackUrl = str10;
        this.ContentUrl = str19;
        this.ThumbUrl = str12;
        this.BackgroundColour = str13;
        this.BarcodeUrl = str14;
        this.ScheduleId = i;
        this.Type = str15;
        this.ExpiryDate = str16;
        this.Dummy = bool2;
    }

    @Nullable
    public final String getContentId() {
        return this.ContentId;
    }

    @Nullable
    public final String getTopImageUrl() {
        return this.TopImageUrl;
    }

    @Nullable
    public final String getTopText() {
        return this.TopText;
    }

    @Nullable
    public final String getBottomText() {
        return this.BottomText;
    }

    @Nullable
    public final String getBottomImageUrl() {
        return this.BottomImageUrl;
    }

    @Nullable
    public final String getDescription() {
        return this.Description;
    }

    @Nullable
    public final String getSubText() {
        return this.SubText;
    }

    @NotNull
    public final String getAmountLeft() {
        return this.AmountLeft;
    }

    public /* synthetic */ CouponData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, Boolean bool, String str10, String str11, String str12, String str13, String str14, int i, String str15, String str16, Boolean bool2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i2 & 256) != 0 ? Coupon.NOT_SHAREABLE : str9, list, bool, str10, str11, str12, str13, str14, i, str15, str16, bool2);
    }

    @NotNull
    public final String getShareType() {
        return this.ShareType;
    }

    @Nullable
    public final List<String> getValidForStoreTags() {
        return this.ValidForStoreTags;
    }

    @Nullable
    public final Boolean getActivated() {
        return this.Activated;
    }

    @Nullable
    public final String getBackUrl() {
        return this.BackUrl;
    }

    @NotNull
    public final String getContentUrl() {
        return this.ContentUrl;
    }

    @Nullable
    public final String getThumbUrl() {
        return this.ThumbUrl;
    }

    @Nullable
    public final String getBackgroundColour() {
        return this.BackgroundColour;
    }

    @Nullable
    public final String getBarcodeUrl() {
        return this.BarcodeUrl;
    }

    public final int getScheduleId() {
        return this.ScheduleId;
    }

    @Nullable
    public final String getType() {
        return this.Type;
    }

    @Nullable
    public final String getExpiryDate() {
        return this.ExpiryDate;
    }

    @Nullable
    public final Boolean getDummy() {
        return this.Dummy;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CouponData(ContentId=");
        sb.append(this.ContentId);
        sb.append(", TopImageUrl=");
        sb.append(this.TopImageUrl);
        sb.append(", TopText=");
        sb.append(this.TopText);
        sb.append(", BottomText=");
        sb.append(this.BottomText);
        sb.append(", ShareType=");
        sb.append(this.ShareType);
        sb.append(", ValidForStoreTags=");
        sb.append(this.ValidForStoreTags);
        sb.append(", Activated=");
        sb.append(this.Activated);
        sb.append(", BackUrl=");
        sb.append(this.BackUrl);
        sb.append(", ThumbUrl=");
        sb.append(this.ThumbUrl);
        sb.append(", BackgroundColour=");
        sb.append(this.BackgroundColour);
        sb.append(", BarcodeUrl=");
        sb.append(this.BarcodeUrl);
        sb.append(", ScheduleId=");
        sb.append(this.ScheduleId);
        sb.append(", Type=");
        sb.append(this.Type);
        sb.append(", ExpiryDate=");
        sb.append(this.ExpiryDate);
        sb.append(", Dummy=");
        sb.append(this.Dummy);
        sb.append(')');
        return sb.toString();
    }
}
