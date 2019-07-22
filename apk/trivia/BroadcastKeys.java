package com.valora.kkiosk.trivia;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/BroadcastKeys;", "", "()V", "ANSWERS", "", "QUESTIONS", "STATE", "TIME_TO_ANSWER_COUNTDOWN", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: DatabaseConstants.kt */
public final class BroadcastKeys {
    @NotNull
    public static final String ANSWERS = "answers";
    public static final BroadcastKeys INSTANCE = new BroadcastKeys();
    @NotNull
    public static final String QUESTIONS = "questions";
    @NotNull
    public static final String STATE = "state";
    @NotNull
    public static final String TIME_TO_ANSWER_COUNTDOWN = "timeToAnswerCountdown";

    private BroadcastKeys() {
    }
}
