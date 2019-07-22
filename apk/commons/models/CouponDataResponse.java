package com.valora.kkiosk.commons.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003J\u0006\u0010\u001d\u001a\u00020\u001eR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0005R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\u0005R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u0005R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u0005¨\u0006\u001f"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/models/CouponDataResponse;", "", "Sections", "", "Lcom/valora/kkiosk/commons/models/Section;", "(Ljava/util/List;)V", "getSections", "()Ljava/util/List;", "apiError", "Lcom/valora/kkiosk/commons/models/APIError;", "getApiError", "()Lcom/valora/kkiosk/commons/models/APIError;", "setApiError", "(Lcom/valora/kkiosk/commons/models/APIError;)V", "coupons", "Lcom/valora/kkiosk/commons/models/CouponData;", "getCoupons", "setCoupons", "loyalty", "getLoyalty", "setLoyalty", "offers", "getOffers", "setOffers", "rewards", "getRewards", "setRewards", "flatten", "Lcom/valora/kkiosk/commons/models/Coupon;", "initialize", "", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Coupon.kt */
public final class CouponDataResponse {
    @Nullable
    private final List<Section> Sections;
    @Nullable
    private APIError apiError;
    @NotNull
    public List<CouponData> coupons;
    @NotNull
    public List<CouponData> loyalty;
    @NotNull
    public List<CouponData> offers;
    @NotNull
    public List<CouponData> rewards;

    public CouponDataResponse(@Nullable List<Section> list) {
        this.Sections = list;
    }

    @Nullable
    public final List<Section> getSections() {
        return this.Sections;
    }

    public final void initialize() {
        if (this.Sections != null) {
            this.coupons = CollectionsKt.emptyList();
            this.loyalty = CollectionsKt.emptyList();
            this.rewards = CollectionsKt.emptyList();
            this.offers = CollectionsKt.emptyList();
            for (Section section : this.Sections) {
                CouponDataResponse couponDataResponse = this;
                String name = section.getName();
                switch (name.hashCode()) {
                    case -1935925833:
                        if (!name.equals("Offers")) {
                            break;
                        } else {
                            List<CouponData> content = section.getContent();
                            if (content == null) {
                                Intrinsics.throwNpe();
                            }
                            couponDataResponse.offers = content;
                            continue;
                        }
                    case -1672428307:
                        if (!name.equals("Coupons")) {
                            break;
                        } else {
                            List<CouponData> content2 = section.getContent();
                            if (content2 == null) {
                                Intrinsics.throwNpe();
                            }
                            couponDataResponse.coupons = content2;
                            continue;
                        }
                    case -1529663740:
                        if (!name.equals("Rewards")) {
                            break;
                        } else {
                            List<CouponData> content3 = section.getContent();
                            if (content3 == null) {
                                Intrinsics.throwNpe();
                            }
                            couponDataResponse.rewards = content3;
                            continue;
                        }
                    case 2023382054:
                        if (!name.equals("Loyalty")) {
                            break;
                        } else {
                            List<CouponData> content4 = section.getContent();
                            if (content4 == null) {
                                Intrinsics.throwNpe();
                            }
                            couponDataResponse.loyalty = content4;
                            continue;
                        }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unmapped coupon response key ");
                sb.append(section.getName());
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    @NotNull
    public final List<Coupon> flatten() {
        List list;
        List list2;
        List list3;
        List[] listArr = new List[3];
        List<CouponData> list4 = this.rewards;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rewards");
        }
        if (list4 != null) {
            Iterable<Object> iterable = list4;
            Function1 toCoupon = Coupon.Companion.getToCoupon();
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (Object invoke : iterable) {
                arrayList.add(toCoupon.invoke(invoke));
            }
            list = (List) arrayList;
        } else {
            list = CollectionsKt.emptyList();
        }
        listArr[0] = list;
        List<CouponData> list5 = this.offers;
        if (list5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offers");
        }
        if (list5 != null) {
            Iterable<Object> iterable2 = list5;
            Function1 toCoupon2 = Coupon.Companion.getToCoupon();
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            for (Object invoke2 : iterable2) {
                arrayList2.add(toCoupon2.invoke(invoke2));
            }
            list2 = (List) arrayList2;
        } else {
            list2 = CollectionsKt.emptyList();
        }
        listArr[1] = list2;
        List<CouponData> list6 = this.coupons;
        if (list6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coupons");
        }
        if (list6 != null) {
            Iterable<Object> iterable3 = list6;
            Function1 toCoupon3 = Coupon.Companion.getToCoupon();
            Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable3, 10));
            for (Object invoke3 : iterable3) {
                arrayList3.add(toCoupon3.invoke(invoke3));
            }
            list3 = (List) arrayList3;
        } else {
            list3 = CollectionsKt.emptyList();
        }
        listArr[2] = list3;
        return CollectionsKt.flatten(CollectionsKt.listOf(listArr));
    }

    @NotNull
    public final List<CouponData> getCoupons() {
        List<CouponData> list = this.coupons;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coupons");
        }
        return list;
    }

    public final void setCoupons(@NotNull List<CouponData> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.coupons = list;
    }

    @NotNull
    public final List<CouponData> getLoyalty() {
        List<CouponData> list = this.loyalty;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loyalty");
        }
        return list;
    }

    public final void setLoyalty(@NotNull List<CouponData> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.loyalty = list;
    }

    @NotNull
    public final List<CouponData> getOffers() {
        List<CouponData> list = this.offers;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offers");
        }
        return list;
    }

    public final void setOffers(@NotNull List<CouponData> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.offers = list;
    }

    @NotNull
    public final List<CouponData> getRewards() {
        List<CouponData> list = this.rewards;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rewards");
        }
        return list;
    }

    public final void setRewards(@NotNull List<CouponData> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.rewards = list;
    }

    @Nullable
    public final APIError getApiError() {
        return this.apiError;
    }

    public final void setApiError(@Nullable APIError aPIError) {
        this.apiError = aPIError;
    }
}
