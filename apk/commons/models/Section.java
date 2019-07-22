package com.valora.kkiosk.commons.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/models/Section;", "", "Content", "", "Lcom/valora/kkiosk/commons/models/CouponData;", "Name", "", "Id", "", "(Ljava/util/List;Ljava/lang/String;I)V", "getContent", "()Ljava/util/List;", "getId", "()I", "getName", "()Ljava/lang/String;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Coupon.kt */
public final class Section {
    @Nullable
    private final List<CouponData> Content;

    /* renamed from: Id */
    private final int f242Id;
    @NotNull
    private final String Name;

    public Section(@Nullable List<CouponData> list, @NotNull String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "Name");
        this.Content = list;
        this.Name = str;
        this.f242Id = i;
    }

    @Nullable
    public final List<CouponData> getContent() {
        return this.Content;
    }

    @NotNull
    public final String getName() {
        return this.Name;
    }

    public final int getId() {
        return this.f242Id;
    }
}
