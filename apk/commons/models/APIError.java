package com.valora.kkiosk.commons.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/models/APIError;", "", "ResponseStatus", "Lcom/valora/kkiosk/commons/models/ResponseStatus;", "(Lcom/valora/kkiosk/commons/models/ResponseStatus;)V", "getResponseStatus", "()Lcom/valora/kkiosk/commons/models/ResponseStatus;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: APIError.kt */
public final class APIError {
    @NotNull
    private final ResponseStatus ResponseStatus;

    public APIError(@NotNull ResponseStatus responseStatus) {
        Intrinsics.checkParameterIsNotNull(responseStatus, "ResponseStatus");
        this.ResponseStatus = responseStatus;
    }

    @NotNull
    public final ResponseStatus getResponseStatus() {
        return this.ResponseStatus;
    }
}
