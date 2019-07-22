package com.valora.kkiosk.trivia.models;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u001f\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/models/CorrectAnswer;", "Ljava/io/Serializable;", "()V", "answer", "", "answerLockedTimestamp", "", "questionType", "stats", "Lcom/valora/kkiosk/trivia/models/Stats;", "ranking", "Lcom/valora/kkiosk/trivia/models/Ranking;", "(Ljava/lang/String;JLjava/lang/String;Lcom/valora/kkiosk/trivia/models/Stats;Lcom/valora/kkiosk/trivia/models/Ranking;)V", "getAnswer", "()Ljava/lang/String;", "setAnswer", "(Ljava/lang/String;)V", "getAnswerLockedTimestamp", "()J", "setAnswerLockedTimestamp", "(J)V", "getQuestionType", "setQuestionType", "getRanking", "()Lcom/valora/kkiosk/trivia/models/Ranking;", "setRanking", "(Lcom/valora/kkiosk/trivia/models/Ranking;)V", "getStats", "()Lcom/valora/kkiosk/trivia/models/Stats;", "setStats", "(Lcom/valora/kkiosk/trivia/models/Stats;)V", "toString", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Broadcast.kt */
public final class CorrectAnswer implements Serializable {
    @Nullable
    private String answer;
    private long answerLockedTimestamp;
    @NotNull
    private String questionType;
    @Nullable
    private Ranking ranking;
    @Nullable
    private Stats stats;

    public CorrectAnswer(@Nullable String str, long j, @NotNull String str2, @Nullable Stats stats2, @Nullable Ranking ranking2) {
        Intrinsics.checkParameterIsNotNull(str2, "questionType");
        this.answer = str;
        this.answerLockedTimestamp = j;
        this.questionType = str2;
        this.stats = stats2;
        this.ranking = ranking2;
    }

    @Nullable
    public final String getAnswer() {
        return this.answer;
    }

    public final void setAnswer(@Nullable String str) {
        this.answer = str;
    }

    public final long getAnswerLockedTimestamp() {
        return this.answerLockedTimestamp;
    }

    public final void setAnswerLockedTimestamp(long j) {
        this.answerLockedTimestamp = j;
    }

    @NotNull
    public final String getQuestionType() {
        return this.questionType;
    }

    public final void setQuestionType(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.questionType = str;
    }

    @Nullable
    public final Stats getStats() {
        return this.stats;
    }

    public final void setStats(@Nullable Stats stats2) {
        this.stats = stats2;
    }

    @Nullable
    public final Ranking getRanking() {
        return this.ranking;
    }

    public final void setRanking(@Nullable Ranking ranking2) {
        this.ranking = ranking2;
    }

    public CorrectAnswer() {
        this(null, -1, "", null, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CorrectAnswer(answer=");
        sb.append(this.answer);
        sb.append(", answerLockedTimestamp=");
        sb.append(this.answerLockedTimestamp);
        sb.append(", questionType='");
        sb.append(this.questionType);
        sb.append("', stats=");
        sb.append(this.stats);
        sb.append(", ranking=");
        sb.append(this.ranking);
        sb.append(')');
        return sb.toString();
    }
}
