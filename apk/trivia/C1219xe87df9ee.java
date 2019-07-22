package com.valora.kkiosk.trivia;

import android.widget.TextView;
import com.valora.kkiosk.R;
import com.valora.kkiosk.trivia.QuizSelectionAdapter.SelectionItemViewHolder;
import com.valora.kkiosk.trivia.models.RankingItem;
import com.valora.kkiosk.trivia.models.UserAnswer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo21491d2 = {"populateRankingItem", "", "place", "", "rankingItem", "Lcom/valora/kkiosk/trivia/models/RankingItem;", "invoke", "com/valora/kkiosk/trivia/QuizSelectionAdapter$fillSelectionEstimateItem$answers$1$1"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* renamed from: com.valora.kkiosk.trivia.QuizSelectionAdapter$fillSelectionEstimateItem$$inlined$let$lambda$1 */
/* compiled from: QuizSelectionAdapter.kt */
final class C1219xe87df9ee extends Lambda implements Function2<Integer, RankingItem, Unit> {
    final /* synthetic */ SelectionItemViewHolder $selectionItemViewHolder$inlined;
    final /* synthetic */ QuizSelectionAdapter this$0;

    C1219xe87df9ee(QuizSelectionAdapter quizSelectionAdapter, SelectionItemViewHolder selectionItemViewHolder) {
        this.this$0 = quizSelectionAdapter;
        this.$selectionItemViewHolder$inlined = selectionItemViewHolder;
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), (RankingItem) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(int i, @NotNull RankingItem rankingItem) {
        Intrinsics.checkParameterIsNotNull(rankingItem, "rankingItem");
        TextView answerTextView$app_release = this.$selectionItemViewHolder$inlined.getAnswerTextView$app_release();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = this.this$0.getActivity().getResources().getString(R.string.x_place_ph);
        Intrinsics.checkExpressionValueIsNotNull(string, "activity.resources.getString(R.string.x_place_ph)");
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        UserAnswer userAnswer = rankingItem.getUserAnswer();
        if (userAnswer == null) {
            Intrinsics.throwNpe();
        }
        objArr[1] = userAnswer.getSelectedAnswer();
        objArr[2] = rankingItem.getUserName();
        String format = String.format(string, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        answerTextView$app_release.setText(format);
        this.$selectionItemViewHolder$inlined.getStatsTextView$app_release().setText(this.this$0.getTimeInSecondsString(rankingItem.getUserAnswer()));
        if (2 <= i && 4 >= i && Intrinsics.areEqual((Object) rankingItem.getUserId(), (Object) this.this$0.firebaseUser.getUid())) {
            this.this$0.tintProgressBar(this.$selectionItemViewHolder$inlined.getProgressBar$app_release(), this.this$0.correctAnswerColor);
            this.$selectionItemViewHolder$inlined.getContainer$app_release().setBackground(this.this$0.correctAnswerFrame);
        }
    }
}
