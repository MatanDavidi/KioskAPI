package com.valora.kkiosk.trivia.models;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/models/TriviaPrize;", "Ljava/io/Serializable;", "()V", "name", "Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;", "description", "(Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;)V", "getDescription", "()Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;", "getName", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Quiz.kt */
public final class TriviaPrize implements Serializable {
    @Nullable
    private final TriviaLanguageItem description;
    @Nullable
    private final TriviaLanguageItem name;

    public TriviaPrize(@Nullable TriviaLanguageItem triviaLanguageItem, @Nullable TriviaLanguageItem triviaLanguageItem2) {
        this.name = triviaLanguageItem;
        this.description = triviaLanguageItem2;
    }

    @Nullable
    public final TriviaLanguageItem getName() {
        return this.name;
    }

    @Nullable
    public final TriviaLanguageItem getDescription() {
        return this.description;
    }

    public TriviaPrize() {
        this(null, null);
    }
}
