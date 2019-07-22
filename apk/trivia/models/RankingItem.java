package com.valora.kkiosk.trivia.models;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/models/RankingItem;", "Ljava/io/Serializable;", "()V", "diff", "", "userAnswer", "Lcom/valora/kkiosk/trivia/models/UserAnswer;", "selectedAnswer", "userName", "", "userId", "(ILcom/valora/kkiosk/trivia/models/UserAnswer;ILjava/lang/String;Ljava/lang/String;)V", "getDiff", "()I", "getSelectedAnswer", "getUserAnswer", "()Lcom/valora/kkiosk/trivia/models/UserAnswer;", "getUserId", "()Ljava/lang/String;", "getUserName", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Broadcast.kt */
public final class RankingItem implements Serializable {
    private final int diff;
    private final int selectedAnswer;
    @Nullable
    private final UserAnswer userAnswer;
    @Nullable
    private final String userId;
    @Nullable
    private final String userName;

    public RankingItem(int i, @Nullable UserAnswer userAnswer2, int i2, @Nullable String str, @Nullable String str2) {
        this.diff = i;
        this.userAnswer = userAnswer2;
        this.selectedAnswer = i2;
        this.userName = str;
        this.userId = str2;
    }

    public final int getDiff() {
        return this.diff;
    }

    public final int getSelectedAnswer() {
        return this.selectedAnswer;
    }

    @Nullable
    public final UserAnswer getUserAnswer() {
        return this.userAnswer;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    public RankingItem() {
        this(-1, null, -1, null, null);
    }
}
