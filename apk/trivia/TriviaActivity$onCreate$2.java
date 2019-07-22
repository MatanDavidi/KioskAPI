package com.valora.kkiosk.trivia;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo21491d2 = {"com/valora/kkiosk/trivia/TriviaActivity$onCreate$2", "Lcom/google/firebase/database/ValueEventListener;", "onCancelled", "", "p0", "Lcom/google/firebase/database/DatabaseError;", "onDataChange", "Lcom/google/firebase/database/DataSnapshot;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: TriviaActivity.kt */
public final class TriviaActivity$onCreate$2 implements ValueEventListener {
    final /* synthetic */ TriviaActivity this$0;

    public void onCancelled(@NotNull DatabaseError databaseError) {
        Intrinsics.checkParameterIsNotNull(databaseError, "p0");
    }

    TriviaActivity$onCreate$2(TriviaActivity triviaActivity) {
        this.this$0 = triviaActivity;
    }

    public void onDataChange(@NotNull DataSnapshot dataSnapshot) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
        this.this$0.displayViewerCount(dataSnapshot);
    }
}
