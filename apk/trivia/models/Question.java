package com.valora.kkiosk.trivia.models;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\b\u0010\"\u001a\u00020\tH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019¨\u0006#"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/models/Question;", "Ljava/io/Serializable;", "()V", "answers", "Lcom/valora/kkiosk/trivia/models/AnswerOptions;", "countdown", "Lcom/valora/kkiosk/trivia/models/Countdown;", "timeToAnswerCountdown", "questionId", "", "text", "Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;", "type", "(Lcom/valora/kkiosk/trivia/models/AnswerOptions;Lcom/valora/kkiosk/trivia/models/Countdown;Lcom/valora/kkiosk/trivia/models/Countdown;Ljava/lang/String;Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;Ljava/lang/String;)V", "getAnswers", "()Lcom/valora/kkiosk/trivia/models/AnswerOptions;", "setAnswers", "(Lcom/valora/kkiosk/trivia/models/AnswerOptions;)V", "getCountdown", "()Lcom/valora/kkiosk/trivia/models/Countdown;", "setCountdown", "(Lcom/valora/kkiosk/trivia/models/Countdown;)V", "getQuestionId", "()Ljava/lang/String;", "setQuestionId", "(Ljava/lang/String;)V", "getText", "()Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;", "setText", "(Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;)V", "getTimeToAnswerCountdown", "setTimeToAnswerCountdown", "getType", "setType", "toString", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Broadcast.kt */
public final class Question implements Serializable {
    @Nullable
    private AnswerOptions answers;
    @Nullable
    private Countdown countdown;
    @Nullable
    private String questionId;
    @Nullable
    private TriviaLanguageItem text;
    @Nullable
    private Countdown timeToAnswerCountdown;
    @Nullable
    private String type;

    public Question(@Nullable AnswerOptions answerOptions, @Nullable Countdown countdown2, @Nullable Countdown countdown3, @Nullable String str, @Nullable TriviaLanguageItem triviaLanguageItem, @Nullable String str2) {
        this.answers = answerOptions;
        this.countdown = countdown2;
        this.timeToAnswerCountdown = countdown3;
        this.questionId = str;
        this.text = triviaLanguageItem;
        this.type = str2;
    }

    @Nullable
    public final AnswerOptions getAnswers() {
        return this.answers;
    }

    public final void setAnswers(@Nullable AnswerOptions answerOptions) {
        this.answers = answerOptions;
    }

    @Nullable
    public final Countdown getCountdown() {
        return this.countdown;
    }

    public final void setCountdown(@Nullable Countdown countdown2) {
        this.countdown = countdown2;
    }

    @Nullable
    public final Countdown getTimeToAnswerCountdown() {
        return this.timeToAnswerCountdown;
    }

    public final void setTimeToAnswerCountdown(@Nullable Countdown countdown2) {
        this.timeToAnswerCountdown = countdown2;
    }

    @Nullable
    public final String getQuestionId() {
        return this.questionId;
    }

    public final void setQuestionId(@Nullable String str) {
        this.questionId = str;
    }

    @Nullable
    public final TriviaLanguageItem getText() {
        return this.text;
    }

    public final void setText(@Nullable TriviaLanguageItem triviaLanguageItem) {
        this.text = triviaLanguageItem;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public Question() {
        this(null, null, null, null, null, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question(answers=");
        sb.append(this.answers);
        sb.append(", countdown=");
        sb.append(this.countdown);
        sb.append(", timeToAnswerCountdown=");
        sb.append(this.timeToAnswerCountdown);
        sb.append(", questionId=");
        sb.append(this.questionId);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(')');
        return sb.toString();
    }
}
