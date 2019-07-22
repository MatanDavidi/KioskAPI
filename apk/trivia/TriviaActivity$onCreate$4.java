package com.valora.kkiosk.trivia;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
import com.valora.kkiosk.trivia.models.Broadcast;
import com.valora.kkiosk.trivia.models.TriviaUserProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH\u0016¨\u0006\u000e"}, mo21491d2 = {"com/valora/kkiosk/trivia/TriviaActivity$onCreate$4", "Lcom/google/firebase/database/ChildEventListener;", "onCancelled", "", "p0", "Lcom/google/firebase/database/DatabaseError;", "onChildAdded", "broadcastSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "p1", "", "onChildChanged", "onChildMoved", "onChildRemoved", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: TriviaActivity.kt */
public final class TriviaActivity$onCreate$4 implements ChildEventListener {
    final /* synthetic */ ChildEventListener $allBroadcastsChildEventListener;
    final /* synthetic */ ObjectRef $broadcastReference;
    final /* synthetic */ Query $countdownListenerRef;
    final /* synthetic */ Query $introListenerRef;
    final /* synthetic */ TriviaUserProfile $triviaUserProfile;
    final /* synthetic */ TriviaActivity this$0;

    public void onCancelled(@NotNull DatabaseError databaseError) {
        Intrinsics.checkParameterIsNotNull(databaseError, "p0");
    }

    public void onChildMoved(@NotNull DataSnapshot dataSnapshot, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
    }

    public void onChildRemoved(@NotNull DataSnapshot dataSnapshot) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "p0");
    }

    TriviaActivity$onCreate$4(TriviaActivity triviaActivity, TriviaUserProfile triviaUserProfile, ChildEventListener childEventListener, Query query, Query query2, ObjectRef objectRef) {
        this.this$0 = triviaActivity;
        this.$triviaUserProfile = triviaUserProfile;
        this.$allBroadcastsChildEventListener = childEventListener;
        this.$countdownListenerRef = query;
        this.$introListenerRef = query2;
        this.$broadcastReference = objectRef;
    }

    public void onChildAdded(@NotNull DataSnapshot dataSnapshot, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "broadcastSnapshot");
        if (Intrinsics.areEqual((Object) dataSnapshot.getKey(), (Object) "state") && this.this$0.initializedPlayer == null && Intrinsics.areEqual(dataSnapshot.getValue(), (Object) BroadcastState.INTRO)) {
            TriviaActivity triviaActivity = this.this$0;
            Broadcast access$getBroadcast$p = triviaActivity.broadcast;
            if (access$getBroadcast$p == null) {
                Intrinsics.throwNpe();
            }
            String youtubeVideoId = access$getBroadcast$p.getYoutubeVideoId();
            if (youtubeVideoId == null) {
                Intrinsics.throwNpe();
            }
            triviaActivity.initializeYoutubeLive(youtubeVideoId);
            this.this$0.hideAllFragmentsAndShowStream();
        }
    }

    public void onChildChanged(@NotNull DataSnapshot dataSnapshot, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(dataSnapshot, "broadcastSnapshot");
        String key = dataSnapshot.getKey();
        if (key != null) {
            int hashCode = key.hashCode();
            if (hashCode != -1782234803) {
                if (hashCode != -847398795) {
                    if (hashCode == 109757585 && key.equals("state")) {
                        Object value = dataSnapshot.getValue();
                        if (Intrinsics.areEqual(value, (Object) BroadcastState.INTRO)) {
                            TriviaActivity triviaActivity = this.this$0;
                            Broadcast access$getBroadcast$p = triviaActivity.broadcast;
                            if (access$getBroadcast$p == null) {
                                Intrinsics.throwNpe();
                            }
                            String youtubeVideoId = access$getBroadcast$p.getYoutubeVideoId();
                            if (youtubeVideoId == null) {
                                Intrinsics.throwNpe();
                            }
                            triviaActivity.initializeYoutubeLive(youtubeVideoId);
                            this.this$0.hideAllFragmentsAndShowStream();
                        } else if (Intrinsics.areEqual(value, (Object) BroadcastState.QUIZ)) {
                            TriviaActivity triviaActivity2 = this.this$0;
                            Broadcast access$getBroadcast$p2 = triviaActivity2.broadcast;
                            if (access$getBroadcast$p2 == null) {
                                Intrinsics.throwNpe();
                            }
                            triviaActivity2.showQuizFragment(access$getBroadcast$p2);
                        } else if (Intrinsics.areEqual(value, (Object) BroadcastState.TRANSITION)) {
                            if (!this.this$0.getShowStreamOnly() && (Intrinsics.areEqual((Object) this.this$0.winningState, (Object) WinningState.NO_PRIZE) || Intrinsics.areEqual((Object) this.this$0.winningState, (Object) WinningState.SPECIAL_PRIZE))) {
                                HasLostFragment hasLostFragment = new HasLostFragment();
                                Bundle bundle = new Bundle();
                                bundle.putString(HasLostFragmentKt.EXTRA_WINNING_STATE, this.this$0.winningState);
                                Broadcast access$getBroadcast$p3 = this.this$0.broadcast;
                                if (access$getBroadcast$p3 == null) {
                                    Intrinsics.throwNpe();
                                }
                                String youtubeVideoId2 = access$getBroadcast$p3.getYoutubeVideoId();
                                if (youtubeVideoId2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                bundle.putString(HasLostFragmentKt.EXTRA_YOUTUBE_ID, youtubeVideoId2);
                                bundle.putSerializable(HasLostFragmentKt.EXTRA_TRIVIA_USER_PROFILE, this.$triviaUserProfile);
                                bundle.putSerializable(TriviaActivityKt.EXTRA_DEALINI, this.this$0.nextQuiz.getDealini());
                                hasLostFragment.setArguments(bundle);
                                this.this$0.replaceFragment(hasLostFragment);
                            } else if (Intrinsics.areEqual((Object) this.this$0.winningState, (Object) WinningState.MAIN_PRIZE)) {
                                this.this$0.replaceFragment(new WinnerFragment());
                            } else {
                                this.this$0.hideAllFragmentsAndShowStream();
                            }
                        } else if (Intrinsics.areEqual(value, (Object) BroadcastState.FINISHED)) {
                            this.this$0.stopLivestream();
                            this.this$0.showStreamInactiveFragment();
                            this.this$0.broadcast = null;
                            this.this$0.setShowStreamOnly(false);
                            this.this$0.initializeEventListeners(this.$allBroadcastsChildEventListener, this.$countdownListenerRef, this.$introListenerRef);
                        } else if (Intrinsics.areEqual(value, (Object) "cancelled")) {
                            this.this$0.stopLivestream();
                            DatabaseReference databaseReference = (DatabaseReference) this.$broadcastReference.element;
                            if (databaseReference == null) {
                                Intrinsics.throwNpe();
                            }
                            databaseReference.removeEventListener((ChildEventListener) this);
                            this.this$0.initializeEventListeners(this.$allBroadcastsChildEventListener, this.$countdownListenerRef, this.$introListenerRef);
                        } else if (Intrinsics.areEqual(value, (Object) BroadcastState.OUTRO)) {
                            this.this$0.hideAllFragmentsAndShowStream();
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("UNHANDLED STATE ");
                            sb.append(dataSnapshot.getKey());
                            sb.append(" -> ");
                            sb.append(dataSnapshot.getValue());
                            Log.d("childChanged", sb.toString());
                        }
                    }
                } else if (key.equals("answers")) {
                    this.this$0.processQuizData(dataSnapshot);
                }
            } else if (key.equals(BroadcastKeys.QUESTIONS)) {
                this.this$0.processQuizData(dataSnapshot);
            }
        }
    }
}
