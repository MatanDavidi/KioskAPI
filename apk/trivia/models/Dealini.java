package com.valora.kkiosk.trivia.models;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\f"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/models/Dealini;", "Ljava/io/Serializable;", "()V", "link", "Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;", "text", "(Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;)V", "getLink", "()Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;", "getText", "toString", "", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Quiz.kt */
public final class Dealini implements Serializable {
    @Nullable
    private final TriviaLanguageItem link;
    @Nullable
    private final TriviaLanguageItem text;

    public Dealini(@Nullable TriviaLanguageItem triviaLanguageItem, @Nullable TriviaLanguageItem triviaLanguageItem2) {
        this.link = triviaLanguageItem;
        this.text = triviaLanguageItem2;
    }

    @Nullable
    public final TriviaLanguageItem getLink() {
        return this.link;
    }

    @Nullable
    public final TriviaLanguageItem getText() {
        return this.text;
    }

    public Dealini() {
        this(null, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dealini(link=");
        sb.append(this.link);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(')');
        return sb.toString();
    }
}
