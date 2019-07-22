package com.valora.kkiosk.consents;

import com.facebook.internal.ServerProtocol;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo21491d2 = {"Lcom/valora/kkiosk/consents/ConsentChangeLog;", "Ljava/io/Serializable;", "id", "", "version", "", "(ILjava/lang/String;)V", "getId", "()I", "getVersion", "()Ljava/lang/String;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Consent.kt */
public final class ConsentChangeLog implements Serializable {

    /* renamed from: id */
    private final int f243id;
    @NotNull
    private final String version;

    public ConsentChangeLog(int i, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
        this.f243id = i;
        this.version = str;
    }

    public final int getId() {
        return this.f243id;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }
}
