package com.valora.kkiosk.trivia;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.p000v4.app.NotificationCompat;
import android.support.p000v4.content.ContextCompat;
import android.support.p000v4.view.animation.FastOutSlowInInterpolator;
import android.support.p003v7.widget.RecyclerView.Adapter;
import android.support.p003v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.valora.kkiosk.R;
import com.valora.kkiosk.trivia.models.AnswerOptions;
import com.valora.kkiosk.trivia.models.CorrectAnswer;
import com.valora.kkiosk.trivia.models.Question;
import com.valora.kkiosk.trivia.models.TriviaLanguageItem;
import com.valora.kkiosk.trivia.models.UserAnswer;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003HIJB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0010H\u0003J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020(2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020(2\u0006\u00101\u001a\u000202H\u0002J\b\u00104\u001a\u00020\u0010H\u0016J\u0010\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u0010H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00106\u001a\u00020\u0010H\u0002J\u0010\u00109\u001a\u00020:2\u0006\u00106\u001a\u00020\u0010H\u0002J\u0010\u0010;\u001a\u0002082\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010<\u001a\u00020(J\u0018\u0010=\u001a\u00020(2\u0006\u0010>\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0010H\u0016J\u0018\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0010H\u0016J,\u0010D\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010E\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0018\u0010F\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010G\u001a\u00020\u0010H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010XD¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0010XD¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001e\u0010\"\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120#X\u000e¢\u0006\u0004\n\u0002\u0010$R\u000e\u0010%\u001a\u00020\u0010XD¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/QuizSelectionAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "activity", "Landroid/app/Activity;", "showStreamOnly", "", "answerStatusTextViewCallback", "Lcom/valora/kkiosk/trivia/AnswerStatusTextViewCallback;", "(Landroid/app/Activity;ZLcom/valora/kkiosk/trivia/AnswerStatusTextViewCallback;)V", "getActivity", "()Landroid/app/Activity;", "answerInputLocked", "correctAnswer", "Lcom/valora/kkiosk/trivia/models/CorrectAnswer;", "correctAnswerColor", "", "correctAnswerFrame", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "databaseReference", "Lcom/google/firebase/database/DatabaseReference;", "displayMode", "firebaseUser", "Lcom/google/firebase/auth/FirebaseUser;", "itemCount", "neutralAnswerColor", "neutralAnswerFrame", "question", "Lcom/valora/kkiosk/trivia/models/Question;", "selectedAnswer", "Lcom/valora/kkiosk/trivia/models/UserAnswer;", "getShowStreamOnly", "()Z", "threeAnswerFrames", "", "[Landroid/graphics/drawable/Drawable;", "wrongAnswerColor", "wrongAnswerFrame", "animateProgressBar", "", "progressBar", "Landroid/widget/ProgressBar;", "max", "current", "fillEstimateItem", "estimateItemViewHolder", "Lcom/valora/kkiosk/trivia/QuizSelectionAdapter$EstimateItemViewHolder;", "fillSelectionEstimateItem", "selectionItemViewHolder", "Lcom/valora/kkiosk/trivia/QuizSelectionAdapter$SelectionItemViewHolder;", "fillSelectionItem", "getItemCount", "getItemViewType", "position", "getThreeAnswerIndexByPosition", "", "getThreeAnswerQuestionByPosition", "Lcom/valora/kkiosk/trivia/models/TriviaLanguageItem;", "getTimeInSecondsString", "lockAnswerInput", "onBindViewHolder", "_viewHolder", "p", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "setData", "answer", "tintProgressBar", "color", "EstimateItemViewHolder", "QuizSelectionAdapterDisplayMode", "SelectionItemViewHolder", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: QuizSelectionAdapter.kt */
public final class QuizSelectionAdapter extends Adapter<ViewHolder> {
    @NotNull
    private final Activity activity;
    private boolean answerInputLocked;
    private final AnswerStatusTextViewCallback answerStatusTextViewCallback;
    private CorrectAnswer correctAnswer;
    /* access modifiers changed from: private */
    public final int correctAnswerColor;
    /* access modifiers changed from: private */
    public final Drawable correctAnswerFrame;
    /* access modifiers changed from: private */
    public DatabaseReference databaseReference;
    private int displayMode;
    /* access modifiers changed from: private */
    public FirebaseUser firebaseUser;
    private int itemCount;
    private final int neutralAnswerColor;
    /* access modifiers changed from: private */
    public final Drawable neutralAnswerFrame;
    private Question question;
    /* access modifiers changed from: private */
    public UserAnswer selectedAnswer;
    private final boolean showStreamOnly;
    /* access modifiers changed from: private */
    public Drawable[] threeAnswerFrames;
    private final int wrongAnswerColor;
    private final Drawable wrongAnswerFrame;

    @Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/QuizSelectionAdapter$EstimateItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "estimateInputEditText", "Landroid/widget/EditText;", "getEstimateInputEditText$app_release", "()Landroid/widget/EditText;", "setEstimateInputEditText$app_release", "(Landroid/widget/EditText;)V", "subTextView", "Landroid/widget/TextView;", "getSubTextView$app_release", "()Landroid/widget/TextView;", "setSubTextView$app_release", "(Landroid/widget/TextView;)V", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
    /* compiled from: QuizSelectionAdapter.kt */
    public static final class EstimateItemViewHolder extends ViewHolder {
        @NotNull
        private EditText estimateInputEditText;
        @NotNull
        private TextView subTextView;

        public EstimateItemViewHolder(@NotNull View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            super(view);
            View findViewById = view.findViewById(R.id.trivia_fragment_question_estimate_answer);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "v.findViewById<EditText>…question_estimate_answer)");
            this.estimateInputEditText = (EditText) findViewById;
            View findViewById2 = view.findViewById(R.id.trivia_fragment_question_estimate_answer_subtext);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "v.findViewById<TextView>…_estimate_answer_subtext)");
            this.subTextView = (TextView) findViewById2;
        }

        @NotNull
        public final EditText getEstimateInputEditText$app_release() {
            return this.estimateInputEditText;
        }

        public final void setEstimateInputEditText$app_release(@NotNull EditText editText) {
            Intrinsics.checkParameterIsNotNull(editText, "<set-?>");
            this.estimateInputEditText = editText;
        }

        @NotNull
        public final TextView getSubTextView$app_release() {
            return this.subTextView;
        }

        public final void setSubTextView$app_release(@NotNull TextView textView) {
            Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
            this.subTextView = textView;
        }
    }

    @Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/QuizSelectionAdapter$QuizSelectionAdapterDisplayMode;", "", "()V", "ESTIMATE_ANSWER", "", "ESTIMATE_INPUT", "THREE_ANSWERS_ANSWER", "THREE_ANSWERS_INPUT", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
    /* compiled from: QuizSelectionAdapter.kt */
    public static final class QuizSelectionAdapterDisplayMode {
        public static final int ESTIMATE_ANSWER = 1;
        public static final int ESTIMATE_INPUT = 0;
        public static final QuizSelectionAdapterDisplayMode INSTANCE = new QuizSelectionAdapterDisplayMode();
        public static final int THREE_ANSWERS_ANSWER = 3;
        public static final int THREE_ANSWERS_INPUT = 2;

        private QuizSelectionAdapterDisplayMode() {
        }
    }

    @Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\n¨\u0006 "}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/QuizSelectionAdapter$SelectionItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "answerTextView", "Landroid/widget/TextView;", "getAnswerTextView$app_release", "()Landroid/widget/TextView;", "setAnswerTextView$app_release", "(Landroid/widget/TextView;)V", "backgroundImageView", "Landroid/widget/ImageView;", "getBackgroundImageView$app_release", "()Landroid/widget/ImageView;", "setBackgroundImageView$app_release", "(Landroid/widget/ImageView;)V", "container", "Landroid/support/constraint/ConstraintLayout;", "getContainer$app_release", "()Landroid/support/constraint/ConstraintLayout;", "setContainer$app_release", "(Landroid/support/constraint/ConstraintLayout;)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar$app_release", "()Landroid/widget/ProgressBar;", "setProgressBar$app_release", "(Landroid/widget/ProgressBar;)V", "statsTextView", "getStatsTextView$app_release", "setStatsTextView$app_release", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
    /* compiled from: QuizSelectionAdapter.kt */
    public static final class SelectionItemViewHolder extends ViewHolder {
        @NotNull
        private TextView answerTextView;
        @NotNull
        private ImageView backgroundImageView;
        @NotNull
        private ConstraintLayout container;
        @NotNull
        private ProgressBar progressBar;
        @NotNull
        private TextView statsTextView;

        public SelectionItemViewHolder(@NotNull View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            super(view);
            View findViewById = view.findViewById(R.id.trivia_fragment_question_answer_txt);
            String str = "null cannot be cast to non-null type android.widget.TextView";
            if (findViewById != null) {
                this.answerTextView = (TextView) findViewById;
                View findViewById2 = view.findViewById(R.id.trivia_fragment_question_answer_background);
                if (findViewById2 != null) {
                    this.backgroundImageView = (ImageView) findViewById2;
                    View findViewById3 = view.findViewById(R.id.trivia_fragment_question_txt_stats);
                    if (findViewById3 != null) {
                        this.statsTextView = (TextView) findViewById3;
                        View findViewById4 = view.findViewById(R.id.trivia_fragment_question_answer_progress);
                        if (findViewById4 != null) {
                            this.progressBar = (ProgressBar) findViewById4;
                            View findViewById5 = view.findViewById(R.id.trivia_selection_item_container);
                            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "v.findViewById(R.id.triv…selection_item_container)");
                            this.container = (ConstraintLayout) findViewById5;
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.ProgressBar");
                    }
                    throw new TypeCastException(str);
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
            }
            throw new TypeCastException(str);
        }

        @NotNull
        public final TextView getAnswerTextView$app_release() {
            return this.answerTextView;
        }

        public final void setAnswerTextView$app_release(@NotNull TextView textView) {
            Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
            this.answerTextView = textView;
        }

        @NotNull
        public final ImageView getBackgroundImageView$app_release() {
            return this.backgroundImageView;
        }

        public final void setBackgroundImageView$app_release(@NotNull ImageView imageView) {
            Intrinsics.checkParameterIsNotNull(imageView, "<set-?>");
            this.backgroundImageView = imageView;
        }

        @NotNull
        public final TextView getStatsTextView$app_release() {
            return this.statsTextView;
        }

        public final void setStatsTextView$app_release(@NotNull TextView textView) {
            Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
            this.statsTextView = textView;
        }

        @NotNull
        public final ProgressBar getProgressBar$app_release() {
            return this.progressBar;
        }

        public final void setProgressBar$app_release(@NotNull ProgressBar progressBar2) {
            Intrinsics.checkParameterIsNotNull(progressBar2, "<set-?>");
            this.progressBar = progressBar2;
        }

        @NotNull
        public final ConstraintLayout getContainer$app_release() {
            return this.container;
        }

        public final void setContainer$app_release(@NotNull ConstraintLayout constraintLayout) {
            Intrinsics.checkParameterIsNotNull(constraintLayout, "<set-?>");
            this.container = constraintLayout;
        }
    }

    public QuizSelectionAdapter(@NotNull Activity activity2, boolean z, @NotNull AnswerStatusTextViewCallback answerStatusTextViewCallback2) {
        Intrinsics.checkParameterIsNotNull(activity2, "activity");
        Intrinsics.checkParameterIsNotNull(answerStatusTextViewCallback2, "answerStatusTextViewCallback");
        this.activity = activity2;
        this.showStreamOnly = z;
        this.answerStatusTextViewCallback = answerStatusTextViewCallback2;
        FirebaseAuth instance = FirebaseAuth.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseAuth.getInstance()");
        FirebaseUser currentUser = instance.getCurrentUser();
        if (currentUser == null) {
            Intrinsics.throwNpe();
        }
        this.firebaseUser = currentUser;
        this.correctAnswerFrame = this.activity.getResources().getDrawable(R.drawable.trivia_question_frame_blue);
        this.wrongAnswerFrame = this.activity.getResources().getDrawable(R.drawable.trivia_question_frame_red);
        this.neutralAnswerFrame = this.activity.getResources().getDrawable(R.drawable.trivia_question_frame_grey);
        this.wrongAnswerColor = R.color.red;
        this.correctAnswerColor = R.color.colorPrimary;
        this.neutralAnswerColor = R.color.gray;
        this.displayMode = -1;
        Drawable drawable = this.neutralAnswerFrame;
        this.threeAnswerFrames = new Drawable[]{drawable, drawable, drawable};
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    public final boolean getShowStreamOnly() {
        return this.showStreamOnly;
    }

    /* access modifiers changed from: private */
    public final void tintProgressBar(ProgressBar progressBar, int i) {
        progressBar.getProgressDrawable().setColorFilter(ContextCompat.getColor(this.activity, i), Mode.SRC_IN);
    }

    public final void setData(int i, @Nullable Question question2, @Nullable CorrectAnswer correctAnswer2, @Nullable DatabaseReference databaseReference2) {
        this.answerInputLocked = false;
        this.displayMode = i;
        if (question2 != null) {
            this.question = question2;
        }
        if (correctAnswer2 != null) {
            this.correctAnswer = correctAnswer2;
        }
        this.databaseReference = databaseReference2;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                i2 = 5;
            } else if (i == 2 || i == 3) {
                i2 = 3;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid displayMode ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.itemCount = i2;
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        int i2 = this.displayMode;
        if (i2 == 0) {
            return QuizSelectionAdapterKt.VIEWTYPE_TRIVIA_ESTIMATE_ITEM;
        }
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return QuizSelectionAdapterKt.VIEWTYPE_TRIVIA_SELECTION_ITEM;
        }
        return -1;
    }

    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "viewGroup");
        if (i == 123) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.trivia_selection_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(view…n_item, viewGroup, false)");
            return new SelectionItemViewHolder(inflate);
        } else if (i == 312) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.trivia_estimate_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate2, "LayoutInflater.from(view…e_item, viewGroup, false)");
            return new EstimateItemViewHolder(inflate2);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown viewType ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public synchronized void onBindViewHolder(@NotNull ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "_viewHolder");
        if (viewHolder instanceof SelectionItemViewHolder) {
            fillSelectionItem((SelectionItemViewHolder) viewHolder);
        } else if (viewHolder instanceof EstimateItemViewHolder) {
            fillEstimateItem((EstimateItemViewHolder) viewHolder);
        }
    }

    public int getItemCount() {
        return this.itemCount;
    }

    private final void fillEstimateItem(EstimateItemViewHolder estimateItemViewHolder) {
        estimateItemViewHolder.getEstimateInputEditText$app_release().setEnabled(!this.answerInputLocked);
        estimateItemViewHolder.getEstimateInputEditText$app_release().setOnEditorActionListener(new QuizSelectionAdapter$fillEstimateItem$1(this, estimateItemViewHolder));
        if (this.showStreamOnly) {
            estimateItemViewHolder.getEstimateInputEditText$app_release().setEnabled(false);
            estimateItemViewHolder.getSubTextView$app_release().setText(this.activity.getResources().getString(R.string.sorry_you_lost));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void fillSelectionEstimateItem(com.valora.kkiosk.trivia.QuizSelectionAdapter.SelectionItemViewHolder r9) {
        /*
            r8 = this;
            com.valora.kkiosk.trivia.models.CorrectAnswer r0 = r8.correctAnswer
            if (r0 == 0) goto L_0x0227
            com.valora.kkiosk.trivia.QuizSelectionAdapter$fillSelectionEstimateItem$$inlined$let$lambda$1 r1 = new com.valora.kkiosk.trivia.QuizSelectionAdapter$fillSelectionEstimateItem$$inlined$let$lambda$1
            r1.<init>(r8, r9)
            int r2 = r9.getAdapterPosition()
            java.lang.String r3 = "java.lang.String.format(format, *args)"
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x01d4
            if (r2 == r5) goto L_0x00a4
            r9 = 2
            if (r2 == r9) goto L_0x0078
            r3 = 3
            if (r2 == r3) goto L_0x004c
            r9 = 4
            if (r2 == r9) goto L_0x0020
            goto L_0x0225
        L_0x0020:
            com.valora.kkiosk.trivia.models.Ranking r9 = r0.getRanking()
            if (r9 == 0) goto L_0x0225
            com.valora.kkiosk.trivia.models.Ranking r9 = r0.getRanking()
            if (r9 != 0) goto L_0x002f
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x002f:
            com.valora.kkiosk.trivia.models.RankingItem r9 = r9.getThird()
            if (r9 == 0) goto L_0x0225
            com.valora.kkiosk.trivia.models.Ranking r9 = r0.getRanking()
            if (r9 != 0) goto L_0x003e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x003e:
            com.valora.kkiosk.trivia.models.RankingItem r9 = r9.getThird()
            if (r9 != 0) goto L_0x0047
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0047:
            r1.invoke(r3, r9)
            goto L_0x0225
        L_0x004c:
            com.valora.kkiosk.trivia.models.Ranking r2 = r0.getRanking()
            if (r2 == 0) goto L_0x0225
            com.valora.kkiosk.trivia.models.Ranking r2 = r0.getRanking()
            if (r2 != 0) goto L_0x005b
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x005b:
            com.valora.kkiosk.trivia.models.RankingItem r2 = r2.getSecond()
            if (r2 == 0) goto L_0x0225
            com.valora.kkiosk.trivia.models.Ranking r0 = r0.getRanking()
            if (r0 != 0) goto L_0x006a
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x006a:
            com.valora.kkiosk.trivia.models.RankingItem r0 = r0.getSecond()
            if (r0 != 0) goto L_0x0073
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0073:
            r1.invoke(r9, r0)
            goto L_0x0225
        L_0x0078:
            com.valora.kkiosk.trivia.models.Ranking r9 = r0.getRanking()
            if (r9 == 0) goto L_0x0225
            com.valora.kkiosk.trivia.models.Ranking r9 = r0.getRanking()
            if (r9 != 0) goto L_0x0087
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0087:
            com.valora.kkiosk.trivia.models.RankingItem r9 = r9.getFirst()
            if (r9 == 0) goto L_0x0225
            com.valora.kkiosk.trivia.models.Ranking r9 = r0.getRanking()
            if (r9 != 0) goto L_0x0096
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0096:
            com.valora.kkiosk.trivia.models.RankingItem r9 = r9.getFirst()
            if (r9 != 0) goto L_0x009f
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x009f:
            r1.invoke(r5, r9)
            goto L_0x0225
        L_0x00a4:
            com.valora.kkiosk.trivia.models.UserAnswer r1 = r8.selectedAnswer
            if (r1 != 0) goto L_0x00ed
            android.widget.TextView r0 = r9.getAnswerTextView$app_release()
            android.app.Activity r1 = r8.activity
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131689729(0x7f0f0101, float:1.9008482E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.widget.TextView r0 = r9.getStatsTextView$app_release()
            java.lang.String r1 = ""
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.widget.ProgressBar r0 = r9.getProgressBar$app_release()
            r0.setProgress(r4)
            android.support.constraint.ConstraintLayout r0 = r9.getContainer$app_release()
            android.graphics.drawable.Drawable r1 = r8.wrongAnswerFrame
            r0.setBackground(r1)
            android.widget.ProgressBar r9 = r9.getProgressBar$app_release()
            android.view.View r9 = (android.view.View) r9
            int r0 = r8.wrongAnswerColor
            org.jetbrains.anko.CustomViewPropertiesKt.setBackgroundColorResource(r9, r0)
            com.valora.kkiosk.trivia.AnswerStatusTextViewCallback r9 = r8.answerStatusTextViewCallback
            java.lang.String r0 = "noAnswer"
            r9.onStatusChanged(r0)
            goto L_0x0225
        L_0x00ed:
            android.widget.TextView r1 = r9.getAnswerTextView$app_release()
            kotlin.jvm.internal.StringCompanionObject r2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            android.app.Activity r2 = r8.activity
            android.content.res.Resources r2 = r2.getResources()
            r6 = 2131689816(0x7f0f0158, float:1.9008658E38)
            java.lang.String r2 = r2.getString(r6)
            java.lang.String r6 = "activity.resources.getSt…(R.string.your_answer_ph)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.valora.kkiosk.trivia.models.UserAnswer r7 = r8.selectedAnswer
            if (r7 != 0) goto L_0x010e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x010e:
            java.lang.String r7 = r7.getSelectedAnswer()
            r6[r4] = r7
            int r7 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r2 = java.lang.String.format(r2, r6)
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            android.widget.TextView r1 = r9.getStatsTextView$app_release()
            com.valora.kkiosk.trivia.models.UserAnswer r2 = r8.selectedAnswer
            if (r2 != 0) goto L_0x0130
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0130:
            java.lang.String r2 = r8.getTimeInSecondsString(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            android.widget.ProgressBar r1 = r9.getProgressBar$app_release()
            r1.setProgress(r4)
            com.valora.kkiosk.trivia.models.Ranking r1 = r0.getRanking()
            r2 = 0
            if (r1 == 0) goto L_0x0152
            com.valora.kkiosk.trivia.models.RankingItem r1 = r1.getFirst()
            if (r1 == 0) goto L_0x0152
            java.lang.String r1 = r1.getUserId()
            goto L_0x0153
        L_0x0152:
            r1 = r2
        L_0x0153:
            com.google.firebase.auth.FirebaseUser r3 = r8.firebaseUser
            java.lang.String r3 = r3.getUid()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x01b8
            com.valora.kkiosk.trivia.models.Ranking r1 = r0.getRanking()
            if (r1 == 0) goto L_0x0171
            com.valora.kkiosk.trivia.models.RankingItem r1 = r1.getSecond()
            if (r1 == 0) goto L_0x0171
            java.lang.String r1 = r1.getUserId()
            goto L_0x0172
        L_0x0171:
            r1 = r2
        L_0x0172:
            com.google.firebase.auth.FirebaseUser r3 = r8.firebaseUser
            java.lang.String r3 = r3.getUid()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x01b8
            com.valora.kkiosk.trivia.models.Ranking r0 = r0.getRanking()
            if (r0 == 0) goto L_0x018f
            com.valora.kkiosk.trivia.models.RankingItem r0 = r0.getThird()
            if (r0 == 0) goto L_0x018f
            java.lang.String r2 = r0.getUserId()
        L_0x018f:
            com.google.firebase.auth.FirebaseUser r0 = r8.firebaseUser
            java.lang.String r0 = r0.getUid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x01b8
            android.support.constraint.ConstraintLayout r0 = r9.getContainer$app_release()
            android.graphics.drawable.Drawable r1 = r8.wrongAnswerFrame
            r0.setBackground(r1)
            com.valora.kkiosk.trivia.AnswerStatusTextViewCallback r0 = r8.answerStatusTextViewCallback
            java.lang.String r1 = "wrongAnswer"
            r0.onStatusChanged(r1)
            android.widget.ProgressBar r9 = r9.getProgressBar$app_release()
            android.view.View r9 = (android.view.View) r9
            int r0 = r8.wrongAnswerColor
            org.jetbrains.anko.CustomViewPropertiesKt.setBackgroundColorResource(r9, r0)
            goto L_0x0225
        L_0x01b8:
            com.valora.kkiosk.trivia.AnswerStatusTextViewCallback r0 = r8.answerStatusTextViewCallback
            java.lang.String r1 = "correctAnswer"
            r0.onStatusChanged(r1)
            android.support.constraint.ConstraintLayout r0 = r9.getContainer$app_release()
            android.graphics.drawable.Drawable r1 = r8.correctAnswerFrame
            r0.setBackground(r1)
            android.widget.ProgressBar r9 = r9.getProgressBar$app_release()
            android.view.View r9 = (android.view.View) r9
            int r0 = r8.correctAnswerColor
            org.jetbrains.anko.CustomViewPropertiesKt.setBackgroundColorResource(r9, r0)
            goto L_0x0225
        L_0x01d4:
            android.widget.TextView r1 = r9.getAnswerTextView$app_release()
            kotlin.jvm.internal.StringCompanionObject r2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            android.app.Activity r2 = r8.activity
            android.content.res.Resources r2 = r2.getResources()
            r6 = 2131689567(0x7f0f005f, float:1.9008153E38)
            java.lang.String r2 = r2.getString(r6)
            java.lang.String r6 = "activity.resources.getSt…string.correct_answer_ph)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r6)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r0 = r0.getAnswer()
            if (r0 != 0) goto L_0x01f7
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x01f7:
            r5[r4] = r0
            int r0 = r5.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)
            java.lang.String r0 = java.lang.String.format(r2, r0)
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            android.widget.ImageView r0 = r9.getBackgroundImageView$app_release()
            r0.setVisibility(r4)
            android.support.constraint.ConstraintLayout r9 = r9.getContainer$app_release()
            android.app.Activity r0 = r8.activity
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131231038(0x7f08013e, float:1.8078146E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            r9.setBackground(r0)
        L_0x0225:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valora.kkiosk.trivia.QuizSelectionAdapter.fillSelectionEstimateItem(com.valora.kkiosk.trivia.QuizSelectionAdapter$SelectionItemViewHolder):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cc, code lost:
        animateProgressBar(r11.getProgressBar$app_release(), (r1.getA() + r1.getB()) + r1.getC(), r3);
        r11.getStatsTextView$app_release().setText(java.lang.String.valueOf(r3));
        r1 = r10.selectedAnswer;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f0, code lost:
        if (r1 == null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f2, code lost:
        r1 = r1.getSelectedAnswer();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f7, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f8, code lost:
        if (r1 != null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fa, code lost:
        r10.answerStatusTextViewCallback.onStatusChanged(com.valora.kkiosk.trivia.AnswerStatus.NO_ANSWER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0101, code lost:
        r1 = r10.correctAnswer;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0103, code lost:
        if (r1 == null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0105, code lost:
        r1 = r1.getAnswer();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010a, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010b, code lost:
        r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, r1);
        r3 = r10.selectedAnswer;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0111, code lost:
        if (r3 == null) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0113, code lost:
        if (r3 != null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0115, code lost:
        kotlin.jvm.internal.Intrinsics.throwNpe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011c, code lost:
        if (r3.getSelectedAnswer() != null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011e, code lost:
        if (r1 == false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        tintProgressBar(r11.getProgressBar$app_release(), r10.wrongAnswerColor);
        r11.getContainer$app_release().setBackground(r10.wrongAnswerFrame);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0134, code lost:
        r3 = r10.selectedAnswer;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0136, code lost:
        if (r3 == null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0138, code lost:
        r3 = r3.getSelectedAnswer();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013d, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0142, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, (java.lang.Object) r0) == false) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0144, code lost:
        r0 = r10.selectedAnswer;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0146, code lost:
        if (r0 != null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0148, code lost:
        kotlin.jvm.internal.Intrinsics.throwNpe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014b, code lost:
        r0 = r0.getSelectedAnswer();
        r1 = r10.correctAnswer;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0151, code lost:
        if (r1 != null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0153, code lost:
        kotlin.jvm.internal.Intrinsics.throwNpe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1.getAnswer()) == false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0160, code lost:
        r10.answerStatusTextViewCallback.onStatusChanged(com.valora.kkiosk.trivia.AnswerStatus.CORRECT_ANSWER);
        tintProgressBar(r11.getProgressBar$app_release(), r10.correctAnswerColor);
        r11.getContainer$app_release().setBackground(r10.correctAnswerFrame);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017a, code lost:
        r10.answerStatusTextViewCallback.onStatusChanged(com.valora.kkiosk.trivia.AnswerStatus.WRONG_ANSWER);
        tintProgressBar(r11.getProgressBar$app_release(), r10.wrongAnswerColor);
        r11.getContainer$app_release().setBackground(r10.wrongAnswerFrame);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0194, code lost:
        if (r1 == false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0196, code lost:
        tintProgressBar(r11.getProgressBar$app_release(), r10.correctAnswerColor);
        r11.getContainer$app_release().setBackground(r10.correctAnswerFrame);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a9, code lost:
        tintProgressBar(r11.getProgressBar$app_release(), r10.neutralAnswerColor);
        r11.getContainer$app_release().setBackground(r10.neutralAnswerFrame);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c3, code lost:
        throw new java.lang.IllegalStateException();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void fillSelectionItem(com.valora.kkiosk.trivia.QuizSelectionAdapter.SelectionItemViewHolder r11) {
        /*
            r10 = this;
            int r0 = r11.getAdapterPosition()
            int r1 = r10.displayMode
            java.lang.String r2 = "selectionItemViewHolder.itemView"
            r3 = 1
            r4 = 0
            r5 = 0
            if (r1 != r3) goto L_0x0012
            r10.fillSelectionEstimateItem(r11)
            goto L_0x01c4
        L_0x0012:
            r6 = 2
            r7 = 3
            if (r1 == r7) goto L_0x0018
            if (r1 != r6) goto L_0x01c4
        L_0x0018:
            com.valora.kkiosk.trivia.models.TriviaLanguageItem r1 = r10.getThreeAnswerQuestionByPosition(r0)
            android.widget.ImageView r8 = r11.getBackgroundImageView$app_release()
            r9 = 8
            r8.setVisibility(r9)
            android.widget.ProgressBar r8 = r11.getProgressBar$app_release()
            r8.setVisibility(r4)
            android.widget.TextView r8 = r11.getAnswerTextView$app_release()
            r8.setVisibility(r4)
            android.widget.TextView r8 = r11.getAnswerTextView$app_release()
            com.valora.kkiosk.commons.api.RestApi$ApiConfig r9 = com.valora.kkiosk.commons.api.RestApi.ApiConfig.INSTANCE
            java.lang.String r9 = r9.getUserLanguage()
            java.lang.String r1 = r1.getTextByLanguage(r9)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r8.setText(r1)
            android.support.constraint.ConstraintLayout r1 = r11.getContainer$app_release()
            android.graphics.drawable.Drawable[] r8 = r10.threeAnswerFrames
            r8 = r8[r0]
            r1.setBackground(r8)
            int r1 = r10.displayMode
            if (r1 != r6) goto L_0x0073
            android.view.View r1 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            boolean r6 = r10.answerInputLocked
            r3 = r3 ^ r6
            r1.setEnabled(r3)
            boolean r1 = r10.answerInputLocked
            if (r1 == 0) goto L_0x0065
            return
        L_0x0065:
            android.view.View r1 = r11.itemView
            com.valora.kkiosk.trivia.QuizSelectionAdapter$fillSelectionItem$1 r3 = new com.valora.kkiosk.trivia.QuizSelectionAdapter$fillSelectionItem$1
            r3.<init>(r10, r0)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r1.setOnClickListener(r3)
            goto L_0x01c4
        L_0x0073:
            if (r1 != r7) goto L_0x01c4
            android.view.View r1 = r11.itemView
            r1.setOnClickListener(r5)
            com.valora.kkiosk.trivia.models.CorrectAnswer r1 = r10.correctAnswer
            if (r1 == 0) goto L_0x01c4
            if (r1 != 0) goto L_0x0083
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0083:
            com.valora.kkiosk.trivia.models.Stats r1 = r1.getStats()
            if (r1 == 0) goto L_0x01c4
            com.valora.kkiosk.trivia.models.CorrectAnswer r1 = r10.correctAnswer
            if (r1 != 0) goto L_0x0090
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0090:
            com.valora.kkiosk.trivia.models.Stats r1 = r1.getStats()
            if (r1 != 0) goto L_0x0099
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0099:
            java.lang.String r0 = r10.getThreeAnswerIndexByPosition(r0)
            int r3 = r0.hashCode()
            switch(r3) {
                case 65: goto L_0x00c0;
                case 66: goto L_0x00b3;
                case 67: goto L_0x00a6;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            goto L_0x01bc
        L_0x00a6:
            java.lang.String r3 = "C"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x01bc
            int r3 = r1.getC()
            goto L_0x00cc
        L_0x00b3:
            java.lang.String r3 = "B"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x01bc
            int r3 = r1.getB()
            goto L_0x00cc
        L_0x00c0:
            java.lang.String r3 = "A"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x01bc
            int r3 = r1.getA()
        L_0x00cc:
            android.widget.ProgressBar r6 = r11.getProgressBar$app_release()
            int r7 = r1.getA()
            int r8 = r1.getB()
            int r7 = r7 + r8
            int r1 = r1.getC()
            int r7 = r7 + r1
            r10.animateProgressBar(r6, r7, r3)
            android.widget.TextView r1 = r11.getStatsTextView$app_release()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1.setText(r3)
            com.valora.kkiosk.trivia.models.UserAnswer r1 = r10.selectedAnswer
            if (r1 == 0) goto L_0x00f7
            java.lang.String r1 = r1.getSelectedAnswer()
            goto L_0x00f8
        L_0x00f7:
            r1 = r5
        L_0x00f8:
            if (r1 != 0) goto L_0x0101
            com.valora.kkiosk.trivia.AnswerStatusTextViewCallback r1 = r10.answerStatusTextViewCallback
            java.lang.String r3 = "noAnswer"
            r1.onStatusChanged(r3)
        L_0x0101:
            com.valora.kkiosk.trivia.models.CorrectAnswer r1 = r10.correctAnswer
            if (r1 == 0) goto L_0x010a
            java.lang.String r1 = r1.getAnswer()
            goto L_0x010b
        L_0x010a:
            r1 = r5
        L_0x010b:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            com.valora.kkiosk.trivia.models.UserAnswer r3 = r10.selectedAnswer
            if (r3 == 0) goto L_0x011e
            if (r3 != 0) goto L_0x0118
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0118:
            java.lang.String r3 = r3.getSelectedAnswer()
            if (r3 != 0) goto L_0x0134
        L_0x011e:
            if (r1 == 0) goto L_0x0134
            android.widget.ProgressBar r0 = r11.getProgressBar$app_release()
            int r1 = r10.wrongAnswerColor
            r10.tintProgressBar(r0, r1)
            android.support.constraint.ConstraintLayout r0 = r11.getContainer$app_release()
            android.graphics.drawable.Drawable r1 = r10.wrongAnswerFrame
            r0.setBackground(r1)
            goto L_0x01c4
        L_0x0134:
            com.valora.kkiosk.trivia.models.UserAnswer r3 = r10.selectedAnswer
            if (r3 == 0) goto L_0x013d
            java.lang.String r3 = r3.getSelectedAnswer()
            goto L_0x013e
        L_0x013d:
            r3 = r5
        L_0x013e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L_0x0194
            com.valora.kkiosk.trivia.models.UserAnswer r0 = r10.selectedAnswer
            if (r0 != 0) goto L_0x014b
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x014b:
            java.lang.String r0 = r0.getSelectedAnswer()
            com.valora.kkiosk.trivia.models.CorrectAnswer r1 = r10.correctAnswer
            if (r1 != 0) goto L_0x0156
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0156:
            java.lang.String r1 = r1.getAnswer()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x017a
            com.valora.kkiosk.trivia.AnswerStatusTextViewCallback r0 = r10.answerStatusTextViewCallback
            java.lang.String r1 = "correctAnswer"
            r0.onStatusChanged(r1)
            android.widget.ProgressBar r0 = r11.getProgressBar$app_release()
            int r1 = r10.correctAnswerColor
            r10.tintProgressBar(r0, r1)
            android.support.constraint.ConstraintLayout r0 = r11.getContainer$app_release()
            android.graphics.drawable.Drawable r1 = r10.correctAnswerFrame
            r0.setBackground(r1)
            goto L_0x01c4
        L_0x017a:
            com.valora.kkiosk.trivia.AnswerStatusTextViewCallback r0 = r10.answerStatusTextViewCallback
            java.lang.String r1 = "wrongAnswer"
            r0.onStatusChanged(r1)
            android.widget.ProgressBar r0 = r11.getProgressBar$app_release()
            int r1 = r10.wrongAnswerColor
            r10.tintProgressBar(r0, r1)
            android.support.constraint.ConstraintLayout r0 = r11.getContainer$app_release()
            android.graphics.drawable.Drawable r1 = r10.wrongAnswerFrame
            r0.setBackground(r1)
            goto L_0x01c4
        L_0x0194:
            if (r1 == 0) goto L_0x01a9
            android.widget.ProgressBar r0 = r11.getProgressBar$app_release()
            int r1 = r10.correctAnswerColor
            r10.tintProgressBar(r0, r1)
            android.support.constraint.ConstraintLayout r0 = r11.getContainer$app_release()
            android.graphics.drawable.Drawable r1 = r10.correctAnswerFrame
            r0.setBackground(r1)
            goto L_0x01c4
        L_0x01a9:
            android.widget.ProgressBar r0 = r11.getProgressBar$app_release()
            int r1 = r10.neutralAnswerColor
            r10.tintProgressBar(r0, r1)
            android.support.constraint.ConstraintLayout r0 = r11.getContainer$app_release()
            android.graphics.drawable.Drawable r1 = r10.neutralAnswerFrame
            r0.setBackground(r1)
            goto L_0x01c4
        L_0x01bc:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>()
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            throw r11
        L_0x01c4:
            boolean r0 = r10.showStreamOnly
            if (r0 == 0) goto L_0x01d5
            android.view.View r0 = r11.itemView
            r0.setOnClickListener(r5)
            android.view.View r11 = r11.itemView
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r2)
            r11.setEnabled(r4)
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valora.kkiosk.trivia.QuizSelectionAdapter.fillSelectionItem(com.valora.kkiosk.trivia.QuizSelectionAdapter$SelectionItemViewHolder):void");
    }

    /* access modifiers changed from: private */
    public final String getTimeInSecondsString(UserAnswer userAnswer) {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = this.activity.getResources().getString(R.string.s_ph);
        Intrinsics.checkExpressionValueIsNotNull(string, "activity.resources.getString(R.string.s_ph)");
        Object[] objArr = new Object[1];
        CorrectAnswer correctAnswer2 = this.correctAnswer;
        if (correctAnswer2 == null) {
            Intrinsics.throwNpe();
        }
        objArr[0] = decimalFormat.format(Float.valueOf(((float) (correctAnswer2.getAnswerLockedTimestamp() - userAnswer.getAnswerSubmittedTimestamp())) / ((float) 1000)));
        String format = String.format(string, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* access modifiers changed from: private */
    public final String getThreeAnswerIndexByPosition(int i) {
        String str;
        if (this.displayMode == 1) {
            return "";
        }
        if (i == 0) {
            str = AnswerKeys.f245A;
        } else if (i == 1) {
            str = AnswerKeys.f246B;
        } else if (i == 2) {
            str = AnswerKeys.f247C;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid position for retrieving correctAnswer index ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return str;
    }

    private final TriviaLanguageItem getThreeAnswerQuestionByPosition(int i) {
        TriviaLanguageItem triviaLanguageItem;
        if (i == 0) {
            Question question2 = this.question;
            if (question2 == null) {
                Intrinsics.throwNpe();
            }
            AnswerOptions answers = question2.getAnswers();
            if (answers == null) {
                Intrinsics.throwNpe();
            }
            triviaLanguageItem = answers.getA();
            if (triviaLanguageItem == null) {
                Intrinsics.throwNpe();
            }
        } else if (i == 1) {
            Question question3 = this.question;
            if (question3 == null) {
                Intrinsics.throwNpe();
            }
            AnswerOptions answers2 = question3.getAnswers();
            if (answers2 == null) {
                Intrinsics.throwNpe();
            }
            triviaLanguageItem = answers2.getB();
            if (triviaLanguageItem == null) {
                Intrinsics.throwNpe();
            }
        } else if (i == 2) {
            Question question4 = this.question;
            if (question4 == null) {
                Intrinsics.throwNpe();
            }
            AnswerOptions answers3 = question4.getAnswers();
            if (answers3 == null) {
                Intrinsics.throwNpe();
            }
            triviaLanguageItem = answers3.getC();
            if (triviaLanguageItem == null) {
                Intrinsics.throwNpe();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid position ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return triviaLanguageItem;
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private final void animateProgressBar(ProgressBar progressBar, int i, int i2) {
        int i3 = i2 * 100;
        progressBar.setMax(i * 100);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, NotificationCompat.CATEGORY_PROGRESS, new int[]{progressBar.getProgress(), i3});
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "progressAnimator");
        ofInt.setDuration(500);
        ofInt.setInterpolator(new FastOutSlowInInterpolator());
        ofInt.start();
    }

    public final void lockAnswerInput() {
        this.answerInputLocked = true;
        notifyDataSetChanged();
    }
}
