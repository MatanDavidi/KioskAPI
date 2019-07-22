package com.valora.kkiosk.trivia;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/Queries;", "", "()V", "getUpcomingQuizzesQuery", "Lcom/google/firebase/database/Query;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: DatabaseConstants.kt */
public final class Queries {
    public static final Queries INSTANCE = new Queries();

    private Queries() {
    }

    @NotNull
    public final Query getUpcomingQuizzesQuery() {
        FirebaseDatabase instance = FirebaseDatabase.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseDatabase.getInstance()");
        Query orderByChild = instance.getReference().child("quizzes").startAt((double) new Date().getTime()).orderByChild("startsAtTimestamp");
        Intrinsics.checkExpressionValueIsNotNull(orderByChild, "FirebaseDatabase.getInst…Keys.STARTS_AT_TIMESTAMP)");
        return orderByChild;
    }
}
