package com.valora.kkiosk.trivia.models;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/models/Stats;", "Ljava/io/Serializable;", "()V", "A", "", "B", "C", "(III)V", "getA", "()I", "getB", "getC", "total", "getTotal", "setTotal", "(I)V", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Broadcast.kt */
public final class Stats implements Serializable {

    /* renamed from: A */
    private final int f253A;

    /* renamed from: B */
    private final int f254B;

    /* renamed from: C */
    private final int f255C;
    private int total = -1;

    public Stats(int i, int i2, int i3) {
        this.f253A = i;
        this.f254B = i2;
        this.f255C = i3;
    }

    public final int getA() {
        return this.f253A;
    }

    public final int getB() {
        return this.f254B;
    }

    public final int getC() {
        return this.f255C;
    }

    public Stats() {
        this(-1, -1, -1);
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setTotal(int i) {
        this.total = i;
    }
}
