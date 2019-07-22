package com.valora.kkiosk.trivia;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.firebase.database.DatabaseReference;
import com.valora.kkiosk.trivia.models.UserAnswer;
import kotlin.Metadata;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: QuizSelectionAdapter.kt */
final class QuizSelectionAdapter$fillSelectionItem$1 implements OnClickListener {
    final /* synthetic */ int $position;
    final /* synthetic */ QuizSelectionAdapter this$0;

    QuizSelectionAdapter$fillSelectionItem$1(QuizSelectionAdapter quizSelectionAdapter, int i) {
        this.this$0 = quizSelectionAdapter;
        this.$position = i;
    }

    public final void onClick(View view) {
        QuizSelectionAdapter quizSelectionAdapter = this.this$0;
        quizSelectionAdapter.selectedAnswer = new UserAnswer(quizSelectionAdapter.getThreeAnswerIndexByPosition(this.$position));
        Drawable[] access$getThreeAnswerFrames$p = this.this$0.threeAnswerFrames;
        int length = access$getThreeAnswerFrames$p.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Drawable drawable = access$getThreeAnswerFrames$p[i];
            int i3 = i2 + 1;
            if (i2 == this.$position) {
                this.this$0.threeAnswerFrames[i2] = this.this$0.correctAnswerFrame;
            } else {
                this.this$0.threeAnswerFrames[i2] = this.this$0.neutralAnswerFrame;
            }
            i++;
            i2 = i3;
        }
        DatabaseReference access$getDatabaseReference$p = this.this$0.databaseReference;
        if (access$getDatabaseReference$p != null) {
            access$getDatabaseReference$p.setValue(this.this$0.selectedAnswer);
        }
        this.this$0.notifyDataSetChanged();
    }
}
