package com.valora.kkiosk.trivia;

import com.valora.kkiosk.trivia.models.CorrectAnswer;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo21491d2 = {"<anonymous>", "", "run"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: QuestionFragment.kt */
final class QuestionFragment$onCreateView$1 implements Runnable {
    final /* synthetic */ HashMap $answers;
    final /* synthetic */ ObjectRef $element;
    final /* synthetic */ QuestionFragment this$0;

    QuestionFragment$onCreateView$1(QuestionFragment questionFragment, HashMap hashMap, ObjectRef objectRef) {
        this.this$0 = questionFragment;
        this.$answers = hashMap;
        this.$element = objectRef;
    }

    public final void run() {
        QuestionFragment questionFragment = this.this$0;
        Object obj = this.$answers.get((String) this.$element.element);
        if (obj == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(obj, "answers[element]!!");
        questionFragment.onAnswerReceived((CorrectAnswer) obj);
    }
}
