package com.valora.kkiosk.trivia;

import com.google.firebase.database.DataSnapshot;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo21491d2 = {"getSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "invoke"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: TriviaActivity.kt */
final class TriviaActivity$processQuizData$1 extends Lambda implements Function0<DataSnapshot> {
    final /* synthetic */ DataSnapshot $broadcastSnapshot;

    TriviaActivity$processQuizData$1(DataSnapshot dataSnapshot) {
        this.$broadcastSnapshot = dataSnapshot;
        super(0);
    }

    @NotNull
    public final DataSnapshot invoke() {
        Iterable children = this.$broadcastSnapshot.getChildren();
        Intrinsics.checkExpressionValueIsNotNull(children, "broadcastSnapshot.children");
        Object last = CollectionsKt.last(children);
        Intrinsics.checkExpressionValueIsNotNull(last, "broadcastSnapshot.children.last()");
        return (DataSnapshot) last;
    }
}
