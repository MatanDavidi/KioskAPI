package com.valora.kkiosk.trivia;

import android.util.Log;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.valora.kkiosk.trivia.models.Quiz;
import java.util.Timer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010"}, mo21491d2 = {"com/valora/kkiosk/trivia/StreamInactiveFragment$timerChildEventListener$1", "Lcom/google/firebase/database/ChildEventListener;", "onCancelled", "", "p0", "Lcom/google/firebase/database/DatabaseError;", "onChildAdded", "Lcom/google/firebase/database/DataSnapshot;", "p1", "", "onChildChanged", "onChildMoved", "onChildRemoved", "restartTimer", "timestamp", "", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: StreamInactiveFragment.kt */
public final class StreamInactiveFragment$timerChildEventListener$1 implements ChildEventListener {
    final /* synthetic */ StreamInactiveFragment this$0;

    public void onCancelled(@NotNull DatabaseError databaseError) {
        Intrinsics.checkParameterIsNotNull(databaseError, "p0");
    }

    public void onChildMoved(@NotNull DataSnapshot dataSnapshot, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
    }

    public void onChildRemoved(@NotNull DataSnapshot dataSnapshot) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
    }

    StreamInactiveFragment$timerChildEventListener$1(StreamInactiveFragment streamInactiveFragment) {
        this.this$0 = streamInactiveFragment;
    }

    private final void restartTimer(long j) {
        this.this$0.timer.cancel();
        Log.d("timer", "started");
        this.this$0.timer = new Timer();
        this.this$0.timer.scheduleAtFixedRate(new StreamInactiveFragment$timerChildEventListener$1$restartTimer$1(this, j), 0, 1000);
    }

    public void onChildChanged(@NotNull DataSnapshot dataSnapshot, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
        Intrinsics.areEqual((Object) dataSnapshot.getKey(), (Object) "startsAtTimestamp");
    }

    public void onChildAdded(@NotNull DataSnapshot dataSnapshot, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
        Quiz quiz = (Quiz) dataSnapshot.getValue(Quiz.class);
        if (quiz != null) {
            Long startsAtTimestamp = quiz.getStartsAtTimestamp();
            if (startsAtTimestamp != null) {
                restartTimer(startsAtTimestamp.longValue());
            }
        }
    }
}
