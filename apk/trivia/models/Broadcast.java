package com.valora.kkiosk.trivia.models;

import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0001\u0012&\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012&\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0013J\b\u00102\u001a\u00020\u0005H\u0016R:\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R:\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001c¨\u00063"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/models/Broadcast;", "Ljava/io/Serializable;", "()V", "answers", "Ljava/util/HashMap;", "", "Lcom/valora/kkiosk/trivia/models/CorrectAnswer;", "Lkotlin/collections/HashMap;", "introCountdown", "Lcom/valora/kkiosk/trivia/models/Countdown;", "timeUntilTransitionCountdown", "transitionPhaseCountdown", "createdAt", "", "questions", "Lcom/valora/kkiosk/trivia/models/Question;", "quizId", "state", "youtubeVideoId", "(Ljava/util/HashMap;Lcom/valora/kkiosk/trivia/models/Countdown;Lcom/valora/kkiosk/trivia/models/Countdown;Lcom/valora/kkiosk/trivia/models/Countdown;Ljava/lang/Long;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAnswers", "()Ljava/util/HashMap;", "setAnswers", "(Ljava/util/HashMap;)V", "broadcastId", "getBroadcastId", "()Ljava/lang/String;", "setBroadcastId", "(Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/Long;", "setCreatedAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getIntroCountdown", "()Lcom/valora/kkiosk/trivia/models/Countdown;", "setIntroCountdown", "(Lcom/valora/kkiosk/trivia/models/Countdown;)V", "getQuestions", "setQuestions", "getQuizId", "setQuizId", "getState", "setState", "getTimeUntilTransitionCountdown", "setTimeUntilTransitionCountdown", "getTransitionPhaseCountdown", "setTransitionPhaseCountdown", "getYoutubeVideoId", "setYoutubeVideoId", "toString", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Broadcast.kt */
public final class Broadcast implements Serializable {
    @Nullable
    private HashMap<String, CorrectAnswer> answers;
    @NotNull
    public String broadcastId;
    @Nullable
    private Long createdAt;
    @Nullable
    private Countdown introCountdown;
    @Nullable
    private HashMap<String, Question> questions;
    @Nullable
    private String quizId;
    @Nullable
    private String state;
    @Nullable
    private Countdown timeUntilTransitionCountdown;
    @Nullable
    private Countdown transitionPhaseCountdown;
    @Nullable
    private String youtubeVideoId;

    public Broadcast(@Nullable HashMap<String, CorrectAnswer> hashMap, @Nullable Countdown countdown, @Nullable Countdown countdown2, @Nullable Countdown countdown3, @Nullable Long l, @Nullable HashMap<String, Question> hashMap2, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.answers = hashMap;
        this.introCountdown = countdown;
        this.timeUntilTransitionCountdown = countdown2;
        this.transitionPhaseCountdown = countdown3;
        this.createdAt = l;
        this.questions = hashMap2;
        this.quizId = str;
        this.state = str2;
        this.youtubeVideoId = str3;
    }

    @Nullable
    public final HashMap<String, CorrectAnswer> getAnswers() {
        return this.answers;
    }

    public final void setAnswers(@Nullable HashMap<String, CorrectAnswer> hashMap) {
        this.answers = hashMap;
    }

    @Nullable
    public final Countdown getIntroCountdown() {
        return this.introCountdown;
    }

    public final void setIntroCountdown(@Nullable Countdown countdown) {
        this.introCountdown = countdown;
    }

    @Nullable
    public final Countdown getTimeUntilTransitionCountdown() {
        return this.timeUntilTransitionCountdown;
    }

    public final void setTimeUntilTransitionCountdown(@Nullable Countdown countdown) {
        this.timeUntilTransitionCountdown = countdown;
    }

    @Nullable
    public final Countdown getTransitionPhaseCountdown() {
        return this.transitionPhaseCountdown;
    }

    public final void setTransitionPhaseCountdown(@Nullable Countdown countdown) {
        this.transitionPhaseCountdown = countdown;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    public final void setCreatedAt(@Nullable Long l) {
        this.createdAt = l;
    }

    @Nullable
    public final HashMap<String, Question> getQuestions() {
        return this.questions;
    }

    public final void setQuestions(@Nullable HashMap<String, Question> hashMap) {
        this.questions = hashMap;
    }

    @Nullable
    public final String getQuizId() {
        return this.quizId;
    }

    public final void setQuizId(@Nullable String str) {
        this.quizId = str;
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    public final void setState(@Nullable String str) {
        this.state = str;
    }

    @Nullable
    public final String getYoutubeVideoId() {
        return this.youtubeVideoId;
    }

    public final void setYoutubeVideoId(@Nullable String str) {
        this.youtubeVideoId = str;
    }

    @NotNull
    public final String getBroadcastId() {
        String str = this.broadcastId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("broadcastId");
        }
        return str;
    }

    public final void setBroadcastId(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.broadcastId = str;
    }

    public Broadcast() {
        this(null, null, null, null, Long.valueOf(-1), null, null, null, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Broadcast(answers=");
        sb.append(this.answers);
        sb.append(", introCountdown=");
        sb.append(this.introCountdown);
        sb.append(", timeUntilTransitionCountdown=");
        sb.append(this.timeUntilTransitionCountdown);
        sb.append(", transitionPhaseCountdown=");
        sb.append(this.transitionPhaseCountdown);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", questions=");
        sb.append(this.questions);
        sb.append(", quizId=");
        sb.append(this.quizId);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", youtubeVideoId=");
        sb.append(this.youtubeVideoId);
        sb.append(')');
        return sb.toString();
    }
}
