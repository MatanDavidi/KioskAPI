package com.valora.kkiosk.trivia.models;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/models/UserAnswer;", "Ljava/io/Serializable;", "()V", "selectedAnswer", "", "(Ljava/lang/String;)V", "answerSubmittedTimestamp", "", "getAnswerSubmittedTimestamp", "()J", "setAnswerSubmittedTimestamp", "(J)V", "getSelectedAnswer", "()Ljava/lang/String;", "setSelectedAnswer", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Broadcast.kt */
public final class UserAnswer implements Serializable {
    private long answerSubmittedTimestamp;
    @Nullable
    private String selectedAnswer;

    public UserAnswer(@Nullable String str) {
        this.selectedAnswer = str;
        this.answerSubmittedTimestamp = -1;
    }

    @Nullable
    public final String getSelectedAnswer() {
        return this.selectedAnswer;
    }

    public final void setSelectedAnswer(@Nullable String str) {
        this.selectedAnswer = str;
    }

    public final long getAnswerSubmittedTimestamp() {
        return this.answerSubmittedTimestamp;
    }

    public final void setAnswerSubmittedTimestamp(long j) {
        this.answerSubmittedTimestamp = j;
    }

    public UserAnswer() {
        this(null);
    }
}
