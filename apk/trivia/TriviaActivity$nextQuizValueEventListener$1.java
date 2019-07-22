package com.valora.kkiosk.trivia;

import android.util.Log;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.valora.kkiosk.trivia.models.Quiz;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¨\u0006\r"}, mo21491d2 = {"com/valora/kkiosk/trivia/TriviaActivity$nextQuizValueEventListener$1", "Lcom/google/firebase/database/ChildEventListener;", "onCancelled", "", "p0", "Lcom/google/firebase/database/DatabaseError;", "onChildAdded", "Lcom/google/firebase/database/DataSnapshot;", "p1", "", "onChildChanged", "onChildMoved", "onChildRemoved", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: TriviaActivity.kt */
public final class TriviaActivity$nextQuizValueEventListener$1 implements ChildEventListener {
    final /* synthetic */ TriviaActivity this$0;

    public void onCancelled(@NotNull DatabaseError databaseError) {
        Intrinsics.checkParameterIsNotNull(databaseError, "p0");
    }

    public void onChildChanged(@NotNull DataSnapshot dataSnapshot, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
    }

    public void onChildMoved(@NotNull DataSnapshot dataSnapshot, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
    }

    public void onChildRemoved(@NotNull DataSnapshot dataSnapshot) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
    }

    TriviaActivity$nextQuizValueEventListener$1(TriviaActivity triviaActivity) {
        this.this$0 = triviaActivity;
    }

    public void onChildAdded(@NotNull DataSnapshot dataSnapshot, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
        if (dataSnapshot.getValue() != null) {
            TriviaActivity triviaActivity = this.this$0;
            Object value = dataSnapshot.getValue(Quiz.class);
            if (value == null) {
                Intrinsics.throwNpe();
            }
            triviaActivity.nextQuiz = (Quiz) value;
            Log.d("next quiz", this.this$0.nextQuiz.getName());
        }
    }
}
