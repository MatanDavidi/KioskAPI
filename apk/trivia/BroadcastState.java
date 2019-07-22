package com.valora.kkiosk.trivia;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/BroadcastState;", "", "()V", "CANCELLED", "", "COUNTDOWN", "FINISHED", "INTRO", "OUTRO", "QUIZ", "REQUESTED", "TRANSITION", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: DatabaseConstants.kt */
public final class BroadcastState {
    @NotNull
    public static final String CANCELLED = "cancelled";
    @NotNull
    public static final String COUNTDOWN = "countdown";
    @NotNull
    public static final String FINISHED = "finished";
    public static final BroadcastState INSTANCE = new BroadcastState();
    @NotNull
    public static final String INTRO = "intro";
    @NotNull
    public static final String OUTRO = "outro";
    @NotNull
    public static final String QUIZ = "quiz";
    @NotNull
    public static final String REQUESTED = "requested";
    @NotNull
    public static final String TRANSITION = "transition";

    private BroadcastState() {
    }
}
