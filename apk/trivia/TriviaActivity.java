package com.valora.kkiosk.trivia;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p000v4.app.Fragment;
import android.support.p000v4.app.FragmentTransaction;
import android.support.p003v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.pierfrancescosoffritti.androidyoutubeplayer.p006ui.PlayerUIController;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.PlayerConstants.PlayerState;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayerView;
import com.valora.kkiosk.MainActivityKt;
import com.valora.kkiosk.R;
import com.valora.kkiosk.SplashActivityKt;
import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import com.valora.kkiosk.trivia.models.Broadcast;
import com.valora.kkiosk.trivia.models.CorrectAnswer;
import com.valora.kkiosk.trivia.models.Question;
import com.valora.kkiosk.trivia.models.Quiz;
import com.valora.kkiosk.trivia.models.TriviaUserProfile;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u000e\u001f\u0018\u00002\u00020\u0001:\u0001AB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020$H\u0002J'\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*2\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0,\"\u00020-¢\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\u001dJ\u0012\u00101\u001a\u00020$2\b\u00102\u001a\u0004\u0018\u000103H\u0014J\b\u00104\u001a\u00020$H\u0014J\b\u00105\u001a\u00020$H\u0014J\b\u00106\u001a\u00020$H\u0014J\u0010\u00107\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020\u0013H\u0002J\u0010\u0010<\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010=\u001a\u00020$H\u0002J\u0006\u0010\u0012\u001a\u00020$J\b\u0010>\u001a\u00020$H\u0002J\u0010\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020&H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0004\n\u0002\u0010 R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000¨\u0006B"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/TriviaActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "broadcast", "Lcom/valora/kkiosk/trivia/models/Broadcast;", "closeButton", "Landroid/widget/ImageButton;", "firebaseUser", "Lcom/google/firebase/auth/FirebaseUser;", "initializedPlayer", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/player/YouTubePlayer;", "nextQuiz", "Lcom/valora/kkiosk/trivia/models/Quiz;", "nextQuizValueEventListener", "com/valora/kkiosk/trivia/TriviaActivity$nextQuizValueEventListener$1", "Lcom/valora/kkiosk/trivia/TriviaActivity$nextQuizValueEventListener$1;", "questionFragment", "Lcom/valora/kkiosk/trivia/QuestionFragment;", "showStreamOnly", "", "getShowStreamOnly", "()Z", "setShowStreamOnly", "(Z)V", "viewerCountTextView", "Landroid/widget/TextView;", "viewersRef", "Lcom/google/firebase/database/DatabaseReference;", "winningState", "", "winningStateListener", "com/valora/kkiosk/trivia/TriviaActivity$winningStateListener$1", "Lcom/valora/kkiosk/trivia/TriviaActivity$winningStateListener$1;", "youtubePlayerView", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/player/YouTubePlayerView;", "displayViewerCount", "", "broadcastSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "hideAllFragmentsAndShowStream", "initializeEventListeners", "listener", "Lcom/google/firebase/database/ChildEventListener;", "refs", "", "Lcom/google/firebase/database/Query;", "(Lcom/google/firebase/database/ChildEventListener;[Lcom/google/firebase/database/Query;)V", "initializeYoutubeLive", "youtubeVideoid", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStop", "processQuizData", "replaceFragment", "fragment", "Landroid/support/v4/app/Fragment;", "shouldFragmentTransitionBeBlocked", "showQuizFragment", "showStreamInactiveFragment", "stopLivestream", "updateHasLostState", "snapshot", "IntentHelper", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: TriviaActivity.kt */
public final class TriviaActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public Broadcast broadcast;
    private ImageButton closeButton;
    /* access modifiers changed from: private */
    public FirebaseUser firebaseUser;
    /* access modifiers changed from: private */
    public YouTubePlayer initializedPlayer;
    /* access modifiers changed from: private */
    public Quiz nextQuiz = new Quiz();
    private TriviaActivity$nextQuizValueEventListener$1 nextQuizValueEventListener = new TriviaActivity$nextQuizValueEventListener$1(this);
    private QuestionFragment questionFragment = new QuestionFragment();
    private boolean showStreamOnly;
    private TextView viewerCountTextView;
    private DatabaseReference viewersRef;
    /* access modifiers changed from: private */
    public String winningState = "";
    /* access modifiers changed from: private */
    public final TriviaActivity$winningStateListener$1 winningStateListener = new TriviaActivity$winningStateListener$1(this);
    /* access modifiers changed from: private */
    public YouTubePlayerView youtubePlayerView;

    @Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/TriviaActivity$IntentHelper;", "", "()V", "getTriviaActivityIntent", "Landroid/content/Intent;", "activity", "Landroid/content/Context;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
    /* compiled from: TriviaActivity.kt */
    public static final class IntentHelper {
        public static final IntentHelper INSTANCE = new IntentHelper();

        private IntentHelper() {
        }

        @NotNull
        public final Intent getTriviaActivityIntent(@NotNull Context context) {
            Intent intent;
            Intrinsics.checkParameterIsNotNull(context, "activity");
            Bundle bundle = new Bundle();
            bundle.putString(SplashActivityKt.EXTRA_LB_USER_ID, ApiConfig.INSTANCE.getUserId());
            bundle.putString(SplashActivityKt.EXTRA_LB_USER_NAME, ApiConfig.INSTANCE.getUserName());
            bundle.putString(SplashActivityKt.EXTRA_LB_MSN, ApiConfig.INSTANCE.getMsn());
            if (context.getSharedPreferences(MainActivityKt.PREFS_NAME, 0).getBoolean(TriviaConsentActivityKt.TRIVIA_CONSENT_GIVEN, false)) {
                intent = new Intent(context, TriviaActivity.class);
            } else {
                intent = new Intent(context, TriviaConsentActivity.class);
            }
            intent.putExtras(bundle);
            return intent;
        }
    }

    @Metadata(mo21489bv = {1, 0, 3}, mo21492k = 3, mo21493mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[PlayerState.values().length];

        static {
            $EnumSwitchMapping$0[PlayerState.ENDED.ordinal()] = 1;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public static final /* synthetic */ FirebaseUser access$getFirebaseUser$p(TriviaActivity triviaActivity) {
        FirebaseUser firebaseUser2 = triviaActivity.firebaseUser;
        if (firebaseUser2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("firebaseUser");
        }
        return firebaseUser2;
    }

    public static final /* synthetic */ YouTubePlayerView access$getYoutubePlayerView$p(TriviaActivity triviaActivity) {
        YouTubePlayerView youTubePlayerView = triviaActivity.youtubePlayerView;
        if (youTubePlayerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("youtubePlayerView");
        }
        return youTubePlayerView;
    }

    public final boolean getShowStreamOnly() {
        return this.showStreamOnly;
    }

    public final void setShowStreamOnly(boolean z) {
        this.showStreamOnly = z;
    }

    public final void showStreamOnly() {
        this.showStreamOnly = true;
        hideAllFragmentsAndShowStream();
    }

    /* access modifiers changed from: private */
    public final void stopLivestream() {
        YouTubePlayer youTubePlayer = this.initializedPlayer;
        if (youTubePlayer != null) {
            if (youTubePlayer == null) {
                Intrinsics.throwNpe();
            }
            youTubePlayer.pause();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        YouTubePlayerView youTubePlayerView = this.youtubePlayerView;
        if (youTubePlayerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("youtubePlayerView");
        }
        youTubePlayerView.release();
    }

    public final void initializeYoutubeLive(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "youtubeVideoid");
        if (this.initializedPlayer == null) {
            YouTubePlayerView youTubePlayerView = this.youtubePlayerView;
            if (youTubePlayerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("youtubePlayerView");
            }
            youTubePlayerView.initialize(new TriviaActivity$initializeYoutubeLive$1(this, str), true);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        String str = "onCreate";
        Log.d(str, str);
        getWindow().addFlags(128);
        Intent intent = getIntent();
        String str2 = "intent";
        Intrinsics.checkExpressionValueIsNotNull(intent, str2);
        String string = intent.getExtras().getString(SplashActivityKt.EXTRA_LB_MSN);
        Intent intent2 = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent2, str2);
        TriviaUserProfile triviaUserProfile = new TriviaUserProfile(string, intent2.getExtras().getString(SplashActivityKt.EXTRA_LB_USER_NAME));
        FirebaseAuth instance = FirebaseAuth.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseAuth.getInstance()");
        FirebaseUser currentUser = instance.getCurrentUser();
        if (currentUser == null) {
            Intrinsics.throwNpe();
        }
        this.firebaseUser = currentUser;
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference(DatabaseReferences.USER_PROFILES);
        FirebaseUser firebaseUser2 = this.firebaseUser;
        if (firebaseUser2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("firebaseUser");
        }
        DatabaseReference child = reference.child(firebaseUser2.getUid());
        Intrinsics.checkExpressionValueIsNotNull(child, "FirebaseDatabase.getInst…).child(firebaseUser.uid)");
        child.setValue(triviaUserProfile);
        DatabaseReference reference2 = FirebaseDatabase.getInstance().getReference(DatabaseReferences.VIEWERS);
        Intrinsics.checkExpressionValueIsNotNull(reference2, "FirebaseDatabase.getInst…tabaseReferences.VIEWERS)");
        this.viewersRef = reference2;
        setContentView((int) R.layout.activity_trivia);
        getWindow().setFlags(1024, 1024);
        View findViewById = findViewById(R.id.youtube_player_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById<YouTubePlay…R.id.youtube_player_view)");
        this.youtubePlayerView = (YouTubePlayerView) findViewById;
        View findViewById2 = findViewById(R.id.activity_trivia_txt_viewer_count);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById<TextView>(R…_trivia_txt_viewer_count)");
        this.viewerCountTextView = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.activity_trivia_btn_exit);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.activity_trivia_btn_exit)");
        this.closeButton = (ImageButton) findViewById3;
        TextView textView = this.viewerCountTextView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewerCountTextView");
        }
        textView.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        ImageButton imageButton = this.closeButton;
        if (imageButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeButton");
        }
        imageButton.setOnClickListener(new TriviaActivity$onCreate$1(this));
        YouTubePlayerView youTubePlayerView = this.youtubePlayerView;
        String str3 = "youtubePlayerView";
        if (youTubePlayerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str3);
        }
        PlayerUIController playerUIController = youTubePlayerView.getPlayerUIController();
        Intrinsics.checkExpressionValueIsNotNull(playerUIController, "youtubePlayerView.playerUIController");
        playerUIController.showDuration(false);
        playerUIController.showBufferingProgress(false);
        playerUIController.showCurrentTime(false);
        playerUIController.showFullscreenButton(false);
        playerUIController.showVideoTitle(false);
        playerUIController.showMenuButton(false);
        playerUIController.showPlayPauseButton(false);
        playerUIController.showSeekBar(false);
        playerUIController.showUI(false);
        YouTubePlayerView youTubePlayerView2 = this.youtubePlayerView;
        if (youTubePlayerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str3);
        }
        youTubePlayerView2.setClickable(false);
        FirebaseDatabase instance2 = FirebaseDatabase.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance2, "FirebaseDatabase.getInstance()");
        DatabaseReference child2 = instance2.getReference().child(DatabaseReferences.VIEWER_COUNT);
        Intrinsics.checkExpressionValueIsNotNull(child2, "FirebaseDatabase.getInst…eReferences.VIEWER_COUNT)");
        child2.addValueEventListener(new TriviaActivity$onCreate$2(this));
        DatabaseReference reference3 = FirebaseDatabase.getInstance().getReference("broadcasts");
        Intrinsics.checkExpressionValueIsNotNull(reference3, "FirebaseDatabase.getInst…etReference(\"broadcasts\")");
        String str4 = "state";
        Query orderByChild = reference3.orderByChild(str4);
        String str5 = BroadcastState.COUNTDOWN;
        Query endAt = orderByChild.startAt(str5).endAt(str5);
        Intrinsics.checkExpressionValueIsNotNull(endAt, "allBroadcastsReference.o…down\").endAt(\"countdown\")");
        Query orderByChild2 = reference3.orderByChild(str4);
        String str6 = BroadcastState.INTRO;
        Query endAt2 = orderByChild2.startAt(str6).endAt(str6);
        Intrinsics.checkExpressionValueIsNotNull(endAt2, "allBroadcastsReference.o…t(\"intro\").endAt(\"intro\")");
        Intrinsics.checkExpressionValueIsNotNull(reference3.orderByChild(str4), "allBroadcastsReference.orderByChild(\"state\")");
        DatabaseReference reference4 = FirebaseDatabase.getInstance().getReference(DatabaseReferences.BROADCAST_USER_DATA);
        Intrinsics.checkExpressionValueIsNotNull(reference4, "FirebaseDatabase.getInst…nces.BROADCAST_USER_DATA)");
        long j = (long) 1800000;
        FirebaseDatabase.getInstance().getReference("quizzes").orderByChild("startsAtTimestamp").startAt((double) (new Date().getTime() - j)).endAt((double) (new Date().getTime() + j)).limitToFirst(1).addChildEventListener(this.nextQuizValueEventListener);
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = (ChildEventListener) null;
        ObjectRef objectRef2 = new ObjectRef();
        objectRef2.element = (DatabaseReference) null;
        TriviaActivity$onCreate$3 triviaActivity$onCreate$3 = new TriviaActivity$onCreate$3(this, endAt, endAt2, reference4, objectRef2, objectRef);
        ChildEventListener childEventListener = triviaActivity$onCreate$3;
        TriviaActivity$onCreate$4 triviaActivity$onCreate$4 = new TriviaActivity$onCreate$4(this, triviaUserProfile, childEventListener, endAt, endAt2, objectRef2);
        objectRef.element = triviaActivity$onCreate$4;
        initializeEventListeners(childEventListener, endAt, endAt2);
        showStreamInactiveFragment();
    }

    /* access modifiers changed from: private */
    public final void displayViewerCount(DataSnapshot dataSnapshot) {
        TextView textView = this.viewerCountTextView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewerCountTextView");
        }
        textView.setText(String.valueOf(dataSnapshot.getValue()));
    }

    /* access modifiers changed from: private */
    public final void processQuizData(DataSnapshot dataSnapshot) {
        TriviaActivity$processQuizData$1 triviaActivity$processQuizData$1 = new TriviaActivity$processQuizData$1(dataSnapshot);
        String key = dataSnapshot.getKey();
        if (key != null) {
            int hashCode = key.hashCode();
            String str = "null cannot be cast to non-null type com.valora.kkiosk.trivia.QuizLifecycleCallbacks";
            if (hashCode != -1782234803) {
                if (hashCode == -847398795 && key.equals("answers")) {
                    QuestionFragment questionFragment2 = this.questionFragment;
                    if (questionFragment2 != null) {
                        QuizLifecycleCallbacks quizLifecycleCallbacks = questionFragment2;
                        Object value = triviaActivity$processQuizData$1.invoke().getValue(CorrectAnswer.class);
                        if (value == null) {
                            Intrinsics.throwNpe();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(value, "getSnapshot().getValue(C…rectAnswer::class.java)!!");
                        quizLifecycleCallbacks.onAnswerReceived((CorrectAnswer) value);
                        return;
                    }
                    throw new TypeCastException(str);
                }
            } else if (key.equals(BroadcastKeys.QUESTIONS)) {
                QuestionFragment questionFragment3 = this.questionFragment;
                if (questionFragment3 != null) {
                    QuizLifecycleCallbacks quizLifecycleCallbacks2 = questionFragment3;
                    Object value2 = triviaActivity$processQuizData$1.invoke().getValue(Question.class);
                    if (value2 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(value2, "getSnapshot().getValue(Question::class.java)!!");
                    quizLifecycleCallbacks2.onQuestionReceived((Question) value2);
                    return;
                }
                throw new TypeCastException(str);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void updateHasLostState(DataSnapshot dataSnapshot) {
        if (Intrinsics.areEqual((Object) dataSnapshot.getKey(), (Object) DatabaseKeys.WINNING_STATE)) {
            if (Intrinsics.areEqual((Object) dataSnapshot.getKey(), (Object) WinningState.NO_PRIZE) || Intrinsics.areEqual((Object) dataSnapshot.getKey(), (Object) WinningState.SPECIAL_PRIZE)) {
                this.showStreamOnly = true;
            }
            this.winningState = String.valueOf(dataSnapshot.getValue());
        }
    }

    private final boolean shouldFragmentTransitionBeBlocked() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.activity_trivia_framelayout);
        boolean z = false;
        if (this.showStreamOnly) {
            return false;
        }
        if ((findFragmentById instanceof WinnerFragment) || (findFragmentById instanceof HasLostFragment)) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: private */
    public final void showStreamInactiveFragment() {
        if (!shouldFragmentTransitionBeBlocked()) {
            replaceFragment(new StreamInactiveFragment());
        }
    }

    /* access modifiers changed from: private */
    public final void hideAllFragmentsAndShowStream() {
        if (!isDestroyed() && !shouldFragmentTransitionBeBlocked()) {
            FragmentTransaction customAnimations = getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.abc_fade_out, R.anim.abc_fade_out);
            Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.activity_trivia_framelayout);
            if (findFragmentById != null) {
                customAnimations.remove(findFragmentById);
            }
            customAnimations.commitAllowingStateLoss();
        }
    }

    /* access modifiers changed from: private */
    public final void showQuizFragment(Broadcast broadcast2) {
        this.questionFragment = new QuestionFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(TriviaActivityKt.EXTRA_BROADCAST, broadcast2);
        this.questionFragment.setArguments(bundle);
        replaceFragment(this.questionFragment);
    }

    /* access modifiers changed from: private */
    public final void replaceFragment(Fragment fragment) {
        if (!shouldFragmentTransitionBeBlocked() && !isDestroyed()) {
            if (fragment.getArguments() == null) {
                fragment.setArguments(new Bundle());
            }
            Bundle arguments = fragment.getArguments();
            if (arguments == null) {
                Intrinsics.throwNpe();
            }
            arguments.putBoolean(HasLostFragmentKt.TRIVIA_ACTIVITY_SHOW_STREAM_ONLY, this.showStreamOnly);
            getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.abc_slide_in_top, R.anim.abc_slide_out_bottom).replace(R.id.activity_trivia_framelayout, fragment).commitAllowingStateLoss();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        DatabaseReference databaseReference = this.viewersRef;
        if (databaseReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewersRef");
        }
        FirebaseUser firebaseUser2 = this.firebaseUser;
        if (firebaseUser2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("firebaseUser");
        }
        databaseReference.child(firebaseUser2.getUid()).setValue(Boolean.valueOf(true));
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        DatabaseReference databaseReference = this.viewersRef;
        if (databaseReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewersRef");
        }
        FirebaseUser firebaseUser2 = this.firebaseUser;
        if (firebaseUser2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("firebaseUser");
        }
        databaseReference.child(firebaseUser2.getUid()).removeValue();
    }

    public final void initializeEventListeners(@NotNull ChildEventListener childEventListener, @NotNull Query... queryArr) {
        Intrinsics.checkParameterIsNotNull(childEventListener, CastExtraArgs.LISTENER);
        Intrinsics.checkParameterIsNotNull(queryArr, "refs");
        for (Query addChildEventListener : queryArr) {
            addChildEventListener.addChildEventListener(childEventListener);
        }
    }
}
