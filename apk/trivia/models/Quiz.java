package com.valora.kkiosk.trivia.models;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/models/Quiz;", "Ljava/io/Serializable;", "()V", "name", "", "prizes", "Lcom/valora/kkiosk/trivia/models/TriviaPrizes;", "startsAtTimestamp", "", "dealini", "Lcom/valora/kkiosk/trivia/models/Dealini;", "(Ljava/lang/String;Lcom/valora/kkiosk/trivia/models/TriviaPrizes;Ljava/lang/Long;Lcom/valora/kkiosk/trivia/models/Dealini;)V", "getDealini", "()Lcom/valora/kkiosk/trivia/models/Dealini;", "getName", "()Ljava/lang/String;", "getPrizes", "()Lcom/valora/kkiosk/trivia/models/TriviaPrizes;", "getStartsAtTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Quiz.kt */
public final class Quiz implements Serializable {
    @Nullable
    private final Dealini dealini;
    @Nullable
    private final String name;
    @Nullable
    private final TriviaPrizes prizes;
    @Nullable
    private final Long startsAtTimestamp;

    public Quiz(@Nullable String str, @Nullable TriviaPrizes triviaPrizes, @Nullable Long l, @Nullable Dealini dealini2) {
        this.name = str;
        this.prizes = triviaPrizes;
        this.startsAtTimestamp = l;
        this.dealini = dealini2;
    }

    @Nullable
    public final Dealini getDealini() {
        return this.dealini;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final TriviaPrizes getPrizes() {
        return this.prizes;
    }

    @Nullable
    public final Long getStartsAtTimestamp() {
        return this.startsAtTimestamp;
    }

    public Quiz() {
        this(null, null, null, null);
    }
}
