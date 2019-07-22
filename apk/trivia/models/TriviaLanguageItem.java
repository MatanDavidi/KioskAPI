package com.valora.kkiosk.trivia.models;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\b\u0010\f\u001a\u00020\u0004H\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\r"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;", "Ljava/io/Serializable;", "()V", "de", "", "fr", "(Ljava/lang/String;Ljava/lang/String;)V", "getDe", "()Ljava/lang/String;", "getFr", "getTextByLanguage", "language", "toString", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Broadcast.kt */
public final class TriviaLanguageItem implements Serializable {
    @Nullable

    /* renamed from: de */
    private final String f256de;
    @Nullable

    /* renamed from: fr */
    private final String f257fr;

    public TriviaLanguageItem(@Nullable String str, @Nullable String str2) {
        this.f256de = str;
        this.f257fr = str2;
    }

    @Nullable
    public final String getDe() {
        return this.f256de;
    }

    @Nullable
    public final String getFr() {
        return this.f257fr;
    }

    public TriviaLanguageItem() {
        this(null, null);
    }

    @Nullable
    public final String getTextByLanguage(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "language");
        if (str.hashCode() == 3201 && str.equals("de")) {
            return this.f256de;
        }
        return this.f257fr;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TriviaLanguageItem(de=");
        sb.append(this.f256de);
        sb.append(", fr=");
        sb.append(this.f257fr);
        sb.append(')');
        return sb.toString();
    }
}
