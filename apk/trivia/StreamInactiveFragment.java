package com.valora.kkiosk.trivia;

import android.os.Bundle;
import android.support.p000v4.app.Fragment;
import android.support.p003v7.widget.LinearLayoutManager;
import android.support.p003v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.firebase.p004ui.database.FirebaseRecyclerAdapter;
import com.firebase.p004ui.database.FirebaseRecyclerOptions;
import com.firebase.p004ui.database.FirebaseRecyclerOptions.Builder;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.Query;
import com.valora.kkiosk.R;
import com.valora.kkiosk.trivia.models.Quiz;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Timer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0019\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020&H\u0016R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006*"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/StreamInactiveFragment;", "Landroid/support/v4/app/Fragment;", "()V", "adapter", "Lcom/firebase/ui/database/FirebaseRecyclerAdapter;", "Lcom/valora/kkiosk/trivia/models/Quiz;", "Lcom/valora/kkiosk/trivia/QuizHolder;", "getAdapter", "()Lcom/firebase/ui/database/FirebaseRecyclerAdapter;", "setAdapter", "(Lcom/firebase/ui/database/FirebaseRecyclerAdapter;)V", "nextQuizAtTextView", "Landroid/widget/TextView;", "getNextQuizAtTextView", "()Landroid/widget/TextView;", "setNextQuizAtTextView", "(Landroid/widget/TextView;)V", "nextQuizQuery", "Lcom/google/firebase/database/Query;", "simpleDateTimeFormatter", "Ljava/text/SimpleDateFormat;", "timeFormatter", "timer", "Ljava/util/Timer;", "timerChildEventListener", "com/valora/kkiosk/trivia/StreamInactiveFragment$timerChildEventListener$1", "Lcom/valora/kkiosk/trivia/StreamInactiveFragment$timerChildEventListener$1;", "timerTextView", "timerTitleTextView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "", "onResume", "onStart", "onStop", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: StreamInactiveFragment.kt */
public final class StreamInactiveFragment extends Fragment {
    private HashMap _$_findViewCache;
    @NotNull
    public FirebaseRecyclerAdapter<Quiz, QuizHolder> adapter;
    @NotNull
    public TextView nextQuizAtTextView;
    private final Query nextQuizQuery;
    /* access modifiers changed from: private */
    public final SimpleDateFormat simpleDateTimeFormatter = new SimpleDateFormat("EE, dd. MMM, HH:mm");
    /* access modifiers changed from: private */
    public final SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");
    /* access modifiers changed from: private */
    public Timer timer = new Timer();
    private final StreamInactiveFragment$timerChildEventListener$1 timerChildEventListener = new StreamInactiveFragment$timerChildEventListener$1(this);
    /* access modifiers changed from: private */
    public TextView timerTextView;
    /* access modifiers changed from: private */
    public TextView timerTitleTextView;

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
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public StreamInactiveFragment() {
        Query limitToFirst = Queries.INSTANCE.getUpcomingQuizzesQuery().limitToFirst(1);
        Intrinsics.checkExpressionValueIsNotNull(limitToFirst, "Queries.getUpcomingQuizzesQuery().limitToFirst(1)");
        this.nextQuizQuery = limitToFirst;
    }

    public static final /* synthetic */ TextView access$getTimerTextView$p(StreamInactiveFragment streamInactiveFragment) {
        TextView textView = streamInactiveFragment.timerTextView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timerTextView");
        }
        return textView;
    }

    public static final /* synthetic */ TextView access$getTimerTitleTextView$p(StreamInactiveFragment streamInactiveFragment) {
        TextView textView = streamInactiveFragment.timerTitleTextView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timerTitleTextView");
        }
        return textView;
    }

    @NotNull
    public final TextView getNextQuizAtTextView() {
        TextView textView = this.nextQuizAtTextView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nextQuizAtTextView");
        }
        return textView;
    }

    public final void setNextQuizAtTextView(@NotNull TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
        this.nextQuizAtTextView = textView;
    }

    @NotNull
    public final FirebaseRecyclerAdapter<Quiz, QuizHolder> getAdapter() {
        FirebaseRecyclerAdapter<Quiz, QuizHolder> firebaseRecyclerAdapter = this.adapter;
        if (firebaseRecyclerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return firebaseRecyclerAdapter;
    }

    public final void setAdapter(@NotNull FirebaseRecyclerAdapter<Quiz, QuizHolder> firebaseRecyclerAdapter) {
        Intrinsics.checkParameterIsNotNull(firebaseRecyclerAdapter, "<set-?>");
        this.adapter = firebaseRecyclerAdapter;
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.trivia_fragment_stream_inactive, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.fragment_stream_inactive_txt_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById<TextVi…tream_inactive_txt_title)");
        this.nextQuizAtTextView = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.fragment_stream_inactive_txt_timer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.f…tream_inactive_txt_timer)");
        this.timerTextView = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.trivia_fragment_stream_txt_timer_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.t…t_stream_txt_timer_title)");
        this.timerTitleTextView = (TextView) findViewById3;
        ((Button) inflate.findViewById(R.id.trivia_fragment_stream_inactive_button_dealini)).setOnClickListener(new StreamInactiveFragment$onCreateView$1(this));
        FirebaseRecyclerOptions build = new Builder().setQuery(Queries.INSTANCE.getUpcomingQuizzesQuery(), Quiz.class).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "FirebaseRecyclerOptions.…\n                .build()");
        this.adapter = new StreamInactiveFragment$onCreateView$2(this, build, build);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.fragment_stream_inactive_recycler_prizes);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recyclerView");
        FirebaseRecyclerAdapter<Quiz, QuizHolder> firebaseRecyclerAdapter = this.adapter;
        if (firebaseRecyclerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        recyclerView.setAdapter(firebaseRecyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return inflate;
    }

    public void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Quiz, QuizHolder> firebaseRecyclerAdapter = this.adapter;
        if (firebaseRecyclerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        firebaseRecyclerAdapter.startListening();
    }

    public void onStop() {
        super.onStop();
        FirebaseRecyclerAdapter<Quiz, QuizHolder> firebaseRecyclerAdapter = this.adapter;
        if (firebaseRecyclerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        firebaseRecyclerAdapter.stopListening();
    }

    public void onResume() {
        super.onResume();
        this.nextQuizQuery.addChildEventListener(this.timerChildEventListener);
    }

    public void onPause() {
        super.onPause();
        this.nextQuizQuery.removeEventListener((ChildEventListener) this.timerChildEventListener);
        this.timer.cancel();
    }
}
