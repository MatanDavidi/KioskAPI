package com.valora.kkiosk.commons.models;

import com.valora.kkiosk.consents.Consent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/models/UserIdData;", "", "UserId", "", "Consents", "", "Lcom/valora/kkiosk/consents/Consent;", "(Ljava/lang/String;Ljava/util/List;)V", "getConsents", "()Ljava/util/List;", "getUserId", "()Ljava/lang/String;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: User.kt */
public final class UserIdData {
    @NotNull
    private final List<Consent> Consents;
    @Nullable
    private final String UserId;

    public UserIdData(@Nullable String str, @NotNull List<Consent> list) {
        Intrinsics.checkParameterIsNotNull(list, "Consents");
        this.UserId = str;
        this.Consents = list;
    }

    @Nullable
    public final String getUserId() {
        return this.UserId;
    }

    @NotNull
    public final List<Consent> getConsents() {
        return this.Consents;
    }
}
