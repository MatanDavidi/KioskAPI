package com.valora.kkiosk.trivia;

import android.widget.TextView;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.valora.kkiosk.trivia.models.Countdown;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000e"}, mo21491d2 = {"com/valora/kkiosk/trivia/QuestionFragment$onQuestionReceived$1", "Lcom/google/firebase/database/ChildEventListener;", "onCancelled", "", "snapshot", "Lcom/google/firebase/database/DatabaseError;", "onChildAdded", "p0", "Lcom/google/firebase/database/DataSnapshot;", "p1", "", "onChildChanged", "onChildMoved", "onChildRemoved", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: QuestionFragment.kt */
public final class QuestionFragment$onQuestionReceived$1 implements ChildEventListener {
    final /* synthetic */ QuestionFragment this$0;

    public void onCancelled(@NotNull DatabaseError databaseError) {
        Intrinsics.checkParameterIsNotNull(databaseError, "snapshot");
    }

    public void onChildAdded(@NotNull DataSnapshot dataSnapshot, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
    }

    public void onChildMoved(@NotNull DataSnapshot dataSnapshot, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
    }

    public void onChildRemoved(@NotNull DataSnapshot dataSnapshot) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
    }

    QuestionFragment$onQuestionReceived$1(QuestionFragment questionFragment) {
        this.this$0 = questionFragment;
    }

    public void onChildChanged(@NotNull DataSnapshot dataSnapshot, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "snapshot");
        if (Intrinsics.areEqual((Object) dataSnapshot.getKey(), (Object) BroadcastKeys.TIME_TO_ANSWER_COUNTDOWN)) {
            Countdown countdown = (Countdown) dataSnapshot.getValue(Countdown.class);
            TextView access$getCountdownTextView$p = this.this$0.countdownTextView;
            if (access$getCountdownTextView$p != null) {
                if (countdown == null) {
                    Intrinsics.throwNpe();
                }
                access$getCountdownTextView$p.setText(String.valueOf(countdown.getCurrent()));
            }
            QuestionFragment questionFragment = this.this$0;
            questionFragment.animateProgressBar(QuestionFragment.access$getCountdownProgressBar$p(questionFragment), countdown.getDuration() * 10, countdown.getCurrent() * 10);
            if (countdown.getCurrent() == 0) {
                QuestionFragment.access$getQuizSelectionAdapter$p(this.this$0).lockAnswerInput();
            }
        }
    }
}
