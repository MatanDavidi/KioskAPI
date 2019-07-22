package com.valora.kkiosk.trivia;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/FirebaseReferences;", "", "()V", "BROADCASTS", "", "QUIZZES", "SCHEDULE", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: DatabaseConstants.kt */
public final class FirebaseReferences {
    @NotNull
    public static final String BROADCASTS = "broadcasts";
    public static final FirebaseReferences INSTANCE = new FirebaseReferences();
    @NotNull
    public static final String QUIZZES = "quizzes";
    @NotNull
    public static final String SCHEDULE = "schedule";

    private FirebaseReferences() {
    }
}
