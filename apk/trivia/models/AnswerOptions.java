package com.valora.kkiosk.trivia.models;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/models/AnswerOptions;", "Ljava/io/Serializable;", "()V", "A", "Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;", "B", "C", "(Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;)V", "getA", "()Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;", "setA", "(Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;)V", "getB", "setB", "getC", "setC", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Broadcast.kt */
public final class AnswerOptions implements Serializable {
    @Nullable

    /* renamed from: A */
    private TriviaLanguageItem f250A;
    @Nullable

    /* renamed from: B */
    private TriviaLanguageItem f251B;
    @Nullable

    /* renamed from: C */
    private TriviaLanguageItem f252C;

    public AnswerOptions(@Nullable TriviaLanguageItem triviaLanguageItem, @Nullable TriviaLanguageItem triviaLanguageItem2, @Nullable TriviaLanguageItem triviaLanguageItem3) {
        this.f250A = triviaLanguageItem;
        this.f251B = triviaLanguageItem2;
        this.f252C = triviaLanguageItem3;
    }

    @Nullable
    public final TriviaLanguageItem getA() {
        return this.f250A;
    }

    public final void setA(@Nullable TriviaLanguageItem triviaLanguageItem) {
        this.f250A = triviaLanguageItem;
    }

    @Nullable
    public final TriviaLanguageItem getB() {
        return this.f251B;
    }

    public final void setB(@Nullable TriviaLanguageItem triviaLanguageItem) {
        this.f251B = triviaLanguageItem;
    }

    @Nullable
    public final TriviaLanguageItem getC() {
        return this.f252C;
    }

    public final void setC(@Nullable TriviaLanguageItem triviaLanguageItem) {
        this.f252C = triviaLanguageItem;
    }

    public AnswerOptions() {
        this(null, null, null);
    }
}
