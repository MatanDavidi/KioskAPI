package com.valora.kkiosk.trivia.models;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\r"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/models/Countdown;", "Ljava/io/Serializable;", "()V", "current", "", "duration", "(II)V", "getCurrent", "()I", "setCurrent", "(I)V", "getDuration", "setDuration", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Broadcast.kt */
public final class Countdown implements Serializable {
    private int current;
    private int duration;

    public Countdown(int i, int i2) {
        this.current = i;
        this.duration = i2;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final void setCurrent(int i) {
        this.current = i;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public Countdown() {
        this(-1, -1);
    }
}
