package com.valora.kkiosk.trivia;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.firebase.database.DatabaseReference;
import com.valora.kkiosk.trivia.QuizSelectionAdapter.EstimateItemViewHolder;
import com.valora.kkiosk.trivia.models.UserAnswer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, mo21491d2 = {"<anonymous>", "", "v", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: QuizSelectionAdapter.kt */
final class QuizSelectionAdapter$fillEstimateItem$1 implements OnEditorActionListener {
    final /* synthetic */ EstimateItemViewHolder $estimateItemViewHolder;
    final /* synthetic */ QuizSelectionAdapter this$0;

    QuizSelectionAdapter$fillEstimateItem$1(QuizSelectionAdapter quizSelectionAdapter, EstimateItemViewHolder estimateItemViewHolder) {
        this.this$0 = quizSelectionAdapter;
        this.$estimateItemViewHolder = estimateItemViewHolder;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            this.this$0.selectedAnswer = new UserAnswer(this.$estimateItemViewHolder.getEstimateInputEditText$app_release().getText().toString());
            DatabaseReference access$getDatabaseReference$p = this.this$0.databaseReference;
            if (access$getDatabaseReference$p == null) {
                Intrinsics.throwNpe();
            }
            access$getDatabaseReference$p.setValue(this.this$0.selectedAnswer);
        }
        return false;
    }
}
