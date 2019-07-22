package com.valora.kkiosk.trivia.models;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/models/Ranking;", "Ljava/io/Serializable;", "()V", "first", "Lcom/valora/kkiosk/trivia/models/RankingItem;", "second", "third", "(Lcom/valora/kkiosk/trivia/models/RankingItem;Lcom/valora/kkiosk/trivia/models/RankingItem;Lcom/valora/kkiosk/trivia/models/RankingItem;)V", "getFirst", "()Lcom/valora/kkiosk/trivia/models/RankingItem;", "getSecond", "getThird", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Broadcast.kt */
public final class Ranking implements Serializable {
    @Nullable
    private final RankingItem first;
    @Nullable
    private final RankingItem second;
    @Nullable
    private final RankingItem third;

    public Ranking(@Nullable RankingItem rankingItem, @Nullable RankingItem rankingItem2, @Nullable RankingItem rankingItem3) {
        this.first = rankingItem;
        this.second = rankingItem2;
        this.third = rankingItem3;
    }

    @Nullable
    public final RankingItem getFirst() {
        return this.first;
    }

    @Nullable
    public final RankingItem getSecond() {
        return this.second;
    }

    @Nullable
    public final RankingItem getThird() {
        return this.third;
    }

    public Ranking() {
        this(null, null, null);
    }
}
