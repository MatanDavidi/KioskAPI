package com.valora.kkiosk.commons.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/models/ResponseStatus;", "", "ErrorCode", "", "Message", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getMessage", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: APIError.kt */
public final class ResponseStatus {
    @NotNull
    private final String ErrorCode;
    @NotNull
    private final String Message;

    public ResponseStatus(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "ErrorCode");
        Intrinsics.checkParameterIsNotNull(str2, "Message");
        this.ErrorCode = str;
        this.Message = str2;
    }

    @NotNull
    public final String getErrorCode() {
        return this.ErrorCode;
    }

    @NotNull
    public final String getMessage() {
        return this.Message;
    }
}
