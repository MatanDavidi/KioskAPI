package com.valora.kkiosk.trivia;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.p000v4.app.Fragment;
import android.support.p000v4.app.FragmentActivity;
import android.support.p000v4.app.NotificationCompat;
import android.support.p000v4.content.ContextCompat;
import android.support.p000v4.view.animation.FastOutSlowInInterpolator;
import android.support.p003v7.widget.LinearLayoutManager;
import android.support.p003v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.valora.kkiosk.R;
import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import com.valora.kkiosk.trivia.models.Broadcast;
import com.valora.kkiosk.trivia.models.CorrectAnswer;
import com.valora.kkiosk.trivia.models.Question;
import com.valora.kkiosk.trivia.models.TriviaLanguageItem;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0003J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0016J&\u0010$\u001a\u0004\u0018\u00010\u00182\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000¨\u00060"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/QuestionFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/valora/kkiosk/trivia/QuizLifecycleCallbacks;", "Lcom/valora/kkiosk/trivia/AnswerStatusTextViewCallback;", "()V", "answerStatusTextView", "Landroid/widget/TextView;", "broadcast", "Lcom/valora/kkiosk/trivia/models/Broadcast;", "countdownProgressBar", "Landroid/widget/ProgressBar;", "countdownTextView", "currentQuestionId", "", "firebaseUser", "Lcom/google/firebase/auth/FirebaseUser;", "linearLayoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "questionTextView", "quizSelectionAdapter", "Lcom/valora/kkiosk/trivia/QuizSelectionAdapter;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "selectionContainer", "Landroid/view/View;", "userDataAnswersRef", "Lcom/google/firebase/database/DatabaseReference;", "animateProgressBar", "", "progressBar", "max", "", "current", "onAnswerReceived", "answer", "Lcom/valora/kkiosk/trivia/models/CorrectAnswer;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onQuestionReceived", "question", "Lcom/valora/kkiosk/trivia/models/Question;", "onStatusChanged", "status", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: QuestionFragment.kt */
public final class QuestionFragment extends Fragment implements QuizLifecycleCallbacks, AnswerStatusTextViewCallback {
    private HashMap _$_findViewCache;
    private TextView answerStatusTextView;
    private Broadcast broadcast;
    /* access modifiers changed from: private */
    public ProgressBar countdownProgressBar;
    /* access modifiers changed from: private */
    public TextView countdownTextView;
    private String currentQuestionId;
    private FirebaseUser firebaseUser;
    private LinearLayoutManager linearLayoutManager;
    private TextView questionTextView;
    /* access modifiers changed from: private */
    public QuizSelectionAdapter quizSelectionAdapter;
    private RecyclerView recyclerView;
    private View selectionContainer;
    private DatabaseReference userDataAnswersRef;

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

    public static final /* synthetic */ ProgressBar access$getCountdownProgressBar$p(QuestionFragment questionFragment) {
        ProgressBar progressBar = questionFragment.countdownProgressBar;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countdownProgressBar");
        }
        return progressBar;
    }

    public static final /* synthetic */ QuizSelectionAdapter access$getQuizSelectionAdapter$p(QuestionFragment questionFragment) {
        QuizSelectionAdapter quizSelectionAdapter2 = questionFragment.quizSelectionAdapter;
        if (quizSelectionAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("quizSelectionAdapter");
        }
        return quizSelectionAdapter2;
    }

    public void onStatusChanged(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "status");
        TextView textView = this.answerStatusTextView;
        String str2 = "answerStatusTextView";
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str2);
        }
        textView.setAlpha(0.0f);
        TextView textView2 = this.answerStatusTextView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str2);
        }
        textView2.setVisibility(0);
        TextView textView3 = this.answerStatusTextView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str2);
        }
        textView3.animate().alpha(1.0f).setDuration(500).setInterpolator(new FastOutSlowInInterpolator()).start();
        Bundle arguments = getArguments();
        if (arguments == null) {
            Intrinsics.throwNpe();
        }
        if (arguments.getBoolean(HasLostFragmentKt.TRIVIA_ACTIVITY_SHOW_STREAM_ONLY, false)) {
            TextView textView4 = this.answerStatusTextView;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
            }
            textView4.setText(getResources().getString(R.string.sorry_you_lost));
            TextView textView5 = this.answerStatusTextView;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
            }
            FragmentActivity activity = getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            textView5.setBackgroundTintList(ContextCompat.getColorStateList(activity, R.color.red));
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1455299637) {
            if (hashCode != -1043047224) {
                if (hashCode == 130295007 && str.equals(AnswerStatus.NO_ANSWER)) {
                    TextView textView6 = this.answerStatusTextView;
                    if (textView6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str2);
                    }
                    textView6.setText(getResources().getString(R.string.time_is_up));
                    TextView textView7 = this.answerStatusTextView;
                    if (textView7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str2);
                    }
                    FragmentActivity activity2 = getActivity();
                    if (activity2 == null) {
                        Intrinsics.throwNpe();
                    }
                    textView7.setBackgroundTintList(ContextCompat.getColorStateList(activity2, R.color.colorPrimaryDark));
                }
            } else if (str.equals(AnswerStatus.CORRECT_ANSWER)) {
                TextView textView8 = this.answerStatusTextView;
                if (textView8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str2);
                }
                textView8.setText(getResources().getString(R.string.correct_answer));
                TextView textView9 = this.answerStatusTextView;
                if (textView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str2);
                }
                FragmentActivity activity3 = getActivity();
                if (activity3 == null) {
                    Intrinsics.throwNpe();
                }
                textView9.setBackgroundTintList(ContextCompat.getColorStateList(activity3, R.color.colorPrimaryLight));
            }
        } else if (str.equals(AnswerStatus.WRONG_ANSWER)) {
            TextView textView10 = this.answerStatusTextView;
            if (textView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
            }
            textView10.setText(getResources().getString(R.string.sadly_incorrect));
            TextView textView11 = this.answerStatusTextView;
            if (textView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
            }
            FragmentActivity activity4 = getActivity();
            if (activity4 == null) {
                Intrinsics.throwNpe();
            }
            textView11.setBackgroundTintList(ContextCompat.getColorStateList(activity4, R.color.red));
        }
    }

    public void onQuestionReceived(@NotNull Question question) {
        Intrinsics.checkParameterIsNotNull(question, "question");
        if (this.broadcast != null) {
            String questionId = question.getQuestionId();
            if (questionId == null) {
                Intrinsics.throwNpe();
            }
            this.currentQuestionId = questionId;
            StringBuilder sb = new StringBuilder();
            sb.append("broadcastUserData/");
            Broadcast broadcast2 = this.broadcast;
            if (broadcast2 == null) {
                Intrinsics.throwNpe();
            }
            sb.append(broadcast2.getBroadcastId());
            String str = "/";
            sb.append(str);
            FirebaseUser firebaseUser2 = this.firebaseUser;
            String str2 = "firebaseUser";
            if (firebaseUser2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
            }
            sb.append(firebaseUser2.getUid());
            sb.append(str);
            String str3 = "answers";
            sb.append(str3);
            sb.append(str);
            String str4 = this.currentQuestionId;
            String str5 = "currentQuestionId";
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str5);
            }
            sb.append(str4);
            Log.d("path", sb.toString());
            DatabaseReference reference = FirebaseDatabase.getInstance().getReference(DatabaseReferences.BROADCAST_USER_DATA);
            Broadcast broadcast3 = this.broadcast;
            if (broadcast3 == null) {
                Intrinsics.throwNpe();
            }
            DatabaseReference child = reference.child(broadcast3.getBroadcastId());
            FirebaseUser firebaseUser3 = this.firebaseUser;
            if (firebaseUser3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
            }
            DatabaseReference child2 = child.child(firebaseUser3.getUid()).child(str3);
            String str6 = this.currentQuestionId;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str5);
            }
            DatabaseReference child3 = child2.child(str6);
            Intrinsics.checkExpressionValueIsNotNull(child3, "FirebaseDatabase.getInst….child(currentQuestionId)");
            this.userDataAnswersRef = child3;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ref ");
            DatabaseReference databaseReference = this.userDataAnswersRef;
            String str7 = "userDataAnswersRef";
            if (databaseReference == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str7);
            }
            DatabaseReference ref = databaseReference.getRef();
            Intrinsics.checkExpressionValueIsNotNull(ref, "userDataAnswersRef.ref");
            sb2.append(ref.getKey());
            Log.d("questionReceived", sb2.toString());
            String str8 = "quizSelectionAdapter";
            String str9 = "questionTextView";
            if (Intrinsics.areEqual((Object) question.getType(), (Object) "QUESTION_TYPE_ESTIMATE")) {
                QuizSelectionAdapter quizSelectionAdapter2 = this.quizSelectionAdapter;
                if (quizSelectionAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str8);
                }
                DatabaseReference databaseReference2 = this.userDataAnswersRef;
                if (databaseReference2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str7);
                }
                quizSelectionAdapter2.setData(0, question, null, databaseReference2);
                TextView textView = this.questionTextView;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str9);
                }
                TriviaLanguageItem text = question.getText();
                if (text == null) {
                    Intrinsics.throwNpe();
                }
                textView.setText(text.getTextByLanguage(ApiConfig.INSTANCE.getUserLanguage()));
            } else {
                TextView textView2 = this.questionTextView;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str9);
                }
                TriviaLanguageItem text2 = question.getText();
                if (text2 == null) {
                    Intrinsics.throwNpe();
                }
                textView2.setText(text2.getTextByLanguage(ApiConfig.INSTANCE.getUserLanguage()));
                QuizSelectionAdapter quizSelectionAdapter3 = this.quizSelectionAdapter;
                if (quizSelectionAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str8);
                }
                DatabaseReference databaseReference3 = this.userDataAnswersRef;
                if (databaseReference3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str7);
                }
                quizSelectionAdapter3.setData(2, question, null, databaseReference3);
            }
            DatabaseReference reference2 = FirebaseDatabase.getInstance().getReference("broadcasts");
            Broadcast broadcast4 = this.broadcast;
            if (broadcast4 == null) {
                Intrinsics.throwNpe();
            }
            DatabaseReference child4 = reference2.child(broadcast4.getBroadcastId()).child(BroadcastKeys.QUESTIONS);
            String questionId2 = question.getQuestionId();
            if (questionId2 == null) {
                Intrinsics.throwNpe();
            }
            child4.child(questionId2).addChildEventListener(new QuestionFragment$onQuestionReceived$1(this));
        }
    }

    public void onAnswerReceived(@NotNull CorrectAnswer correctAnswer) {
        Intrinsics.checkParameterIsNotNull(correctAnswer, "answer");
        TextView textView = this.countdownTextView;
        if (textView != null) {
            ViewPropertyAnimator animate = textView != null ? textView.animate() : null;
            if (animate == null) {
                Intrinsics.throwNpe();
            }
            animate.alpha(0.0f).setDuration(500).setInterpolator(new FastOutSlowInInterpolator()).start();
            ProgressBar progressBar = this.countdownProgressBar;
            if (progressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("countdownProgressBar");
            }
            progressBar.animate().alpha(0.0f).setDuration(500).setInterpolator(new FastOutSlowInInterpolator()).start();
            if (getActivity() != null) {
                String questionType = correctAnswer.getQuestionType();
                int hashCode = questionType.hashCode();
                String str = "quizSelectionAdapter";
                if (hashCode != 364526408) {
                    if (hashCode == 951022580 && questionType.equals("QUESTION_TYPE_ESTIMATE")) {
                        QuizSelectionAdapter quizSelectionAdapter2 = this.quizSelectionAdapter;
                        if (quizSelectionAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        quizSelectionAdapter2.setData(1, null, correctAnswer, null);
                    }
                } else if (questionType.equals(QuestionTypes.QUESTION_TYPE_THREE_ANSWERS)) {
                    QuizSelectionAdapter quizSelectionAdapter3 = this.quizSelectionAdapter;
                    if (quizSelectionAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    quizSelectionAdapter3.setData(3, null, correctAnswer, null);
                }
            }
        }
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.trivia_fragment_question, viewGroup, false);
        FirebaseAuth instance = FirebaseAuth.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseAuth.getInstance()");
        FirebaseUser currentUser = instance.getCurrentUser();
        if (currentUser == null) {
            Intrinsics.throwNpe();
        }
        this.firebaseUser = currentUser;
        this.countdownTextView = (TextView) inflate.findViewById(R.id.fragment_questions_txt_countdown);
        View findViewById = inflate.findViewById(R.id.fragment_questions_progress);
        if (findViewById != null) {
            this.countdownProgressBar = (ProgressBar) findViewById;
            View findViewById2 = inflate.findViewById(R.id.fragment_question_txt_question);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.f…nt_question_txt_question)");
            this.questionTextView = (TextView) findViewById2;
            View findViewById3 = inflate.findViewById(R.id.fragment_question_recycler);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.fragment_question_recycler)");
            this.recyclerView = (RecyclerView) findViewById3;
            View findViewById4 = inflate.findViewById(R.id.trivia_fragment_question_txt_answer_status);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.t…estion_txt_answer_status)");
            this.answerStatusTextView = (TextView) findViewById4;
            TextView textView = this.answerStatusTextView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("answerStatusTextView");
            }
            textView.setVisibility(8);
            this.linearLayoutManager = new LinearLayoutManager(getActivity());
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Activity activity2 = activity;
                Bundle arguments = getArguments();
                if (arguments == null) {
                    Intrinsics.throwNpe();
                }
                this.quizSelectionAdapter = new QuizSelectionAdapter(activity2, arguments.getBoolean(HasLostFragmentKt.TRIVIA_ACTIVITY_SHOW_STREAM_ONLY, false), this);
                RecyclerView recyclerView2 = this.recyclerView;
                String str = "recyclerView";
                if (recyclerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                }
                QuizSelectionAdapter quizSelectionAdapter2 = this.quizSelectionAdapter;
                if (quizSelectionAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("quizSelectionAdapter");
                }
                recyclerView2.setAdapter(quizSelectionAdapter2);
                RecyclerView recyclerView3 = this.recyclerView;
                if (recyclerView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                }
                LinearLayoutManager linearLayoutManager2 = this.linearLayoutManager;
                if (linearLayoutManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("linearLayoutManager");
                }
                recyclerView3.setLayoutManager(linearLayoutManager2);
                ProgressBar progressBar = this.countdownProgressBar;
                String str2 = "countdownProgressBar";
                if (progressBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str2);
                }
                progressBar.setMax(100);
                ProgressBar progressBar2 = this.countdownProgressBar;
                if (progressBar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str2);
                }
                progressBar2.setProgress(100);
                if (getArguments() == null) {
                    return inflate;
                }
                Bundle arguments2 = getArguments();
                Serializable serializable = arguments2 != null ? arguments2.getSerializable(TriviaActivityKt.EXTRA_BROADCAST) : null;
                if (serializable != null) {
                    this.broadcast = (Broadcast) serializable;
                    if (this.broadcast == null) {
                    }
                    return inflate;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.trivia.models.Broadcast");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.ProgressBar");
    }

    /* access modifiers changed from: private */
    @SuppressLint({"ObjectAnimatorBinding"})
    public final void animateProgressBar(ProgressBar progressBar, int i, int i2) {
        int i3 = i2 * 100;
        progressBar.setMax(i * 100);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, NotificationCompat.CATEGORY_PROGRESS, new int[]{progressBar.getProgress(), i3});
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "progressAnimator");
        ofInt.setDuration(1500);
        ofInt.setInterpolator(new FastOutSlowInInterpolator());
        ofInt.start();
    }
}
