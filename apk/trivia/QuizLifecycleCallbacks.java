package com.valora.kkiosk.trivia;

import com.valora.kkiosk.trivia.models.CorrectAnswer;
import com.valora.kkiosk.trivia.models.Question;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/QuizLifecycleCallbacks;", "", "onAnswerReceived", "", "answer", "Lcom/valora/kkiosk/trivia/models/CorrectAnswer;", "onQuestionReceived", "question", "Lcom/valora/kkiosk/trivia/models/Question;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: QuizLifecycleCallbacks.kt */
public interface QuizLifecycleCallbacks {
    void onAnswerReceived(@NotNull CorrectAnswer correctAnswer);

    void onQuestionReceived(@NotNull Question question);
}
