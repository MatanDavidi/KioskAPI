package com.valora.kkiosk.trivia;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.valora.kkiosk.trivia.models.Broadcast;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH\u0016¨\u0006\u000e"}, mo21491d2 = {"com/valora/kkiosk/trivia/TriviaActivity$onCreate$3", "Lcom/google/firebase/database/ChildEventListener;", "onCancelled", "", "p0", "Lcom/google/firebase/database/DatabaseError;", "onChildAdded", "snapshot", "Lcom/google/firebase/database/DataSnapshot;", "p1", "", "onChildChanged", "onChildMoved", "onChildRemoved", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: TriviaActivity.kt */
public final class TriviaActivity$onCreate$3 implements ChildEventListener {
    final /* synthetic */ ObjectRef $broadcastReference;
    final /* synthetic */ Query $countdownListenerRef;
    final /* synthetic */ Query $introListenerRef;
    final /* synthetic */ ObjectRef $singleBroadcastChildEventListener;
    final /* synthetic */ DatabaseReference $userBroadcastDataRef;
    final /* synthetic */ TriviaActivity this$0;

    public void onCancelled(@NotNull DatabaseError databaseError) {
        Intrinsics.checkParameterIsNotNull(databaseError, "p0");
    }

    public void onChildChanged(@NotNull DataSnapshot dataSnapshot, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "snapshot");
    }

    public void onChildMoved(@NotNull DataSnapshot dataSnapshot, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
    }

    public void onChildRemoved(@NotNull DataSnapshot dataSnapshot) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
    }

    TriviaActivity$onCreate$3(TriviaActivity triviaActivity, Query query, Query query2, DatabaseReference databaseReference, ObjectRef objectRef, ObjectRef objectRef2) {
        this.this$0 = triviaActivity;
        this.$countdownListenerRef = query;
        this.$introListenerRef = query2;
        this.$userBroadcastDataRef = databaseReference;
        this.$broadcastReference = objectRef;
        this.$singleBroadcastChildEventListener = objectRef2;
    }

    public void onChildAdded(@NotNull DataSnapshot dataSnapshot, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "snapshot");
        TriviaActivity triviaActivity = this.this$0;
        Object value = dataSnapshot.getValue(Broadcast.class);
        if (value == null) {
            Intrinsics.throwNpe();
        }
        triviaActivity.broadcast = (Broadcast) value;
        Broadcast access$getBroadcast$p = this.this$0.broadcast;
        if (access$getBroadcast$p == null) {
            Intrinsics.throwNpe();
        }
        String key = dataSnapshot.getKey();
        if (key == null) {
            Intrinsics.throwNpe();
        }
        access$getBroadcast$p.setBroadcastId(key);
        ChildEventListener childEventListener = this;
        this.$countdownListenerRef.removeEventListener(childEventListener);
        this.$introListenerRef.removeEventListener(childEventListener);
        DatabaseReference databaseReference = this.$userBroadcastDataRef;
        Broadcast access$getBroadcast$p2 = this.this$0.broadcast;
        if (access$getBroadcast$p2 == null) {
            Intrinsics.throwNpe();
        }
        DatabaseReference child = databaseReference.child(access$getBroadcast$p2.getBroadcastId()).child(TriviaActivity.access$getFirebaseUser$p(this.this$0).getUid());
        Intrinsics.checkExpressionValueIsNotNull(child, "userBroadcastDataRef.chi…).child(firebaseUser.uid)");
        child.setValue(Boolean.valueOf(true));
        child.addChildEventListener(this.this$0.winningStateListener);
        this.$broadcastReference.element = FirebaseDatabase.getInstance().getReference("broadcasts");
        DatabaseReference databaseReference2 = (DatabaseReference) this.$broadcastReference.element;
        if (databaseReference2 == null) {
            Intrinsics.throwNpe();
        }
        Broadcast access$getBroadcast$p3 = this.this$0.broadcast;
        if (access$getBroadcast$p3 == null) {
            Intrinsics.throwNpe();
        }
        DatabaseReference child2 = databaseReference2.child(access$getBroadcast$p3.getBroadcastId());
        ChildEventListener childEventListener2 = (ChildEventListener) this.$singleBroadcastChildEventListener.element;
        if (childEventListener2 == null) {
            Intrinsics.throwNpe();
        }
        child2.addChildEventListener(childEventListener2);
    }
}
