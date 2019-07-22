package com.valora.kkiosk.trivia;

import android.annotation.SuppressLint;
import android.support.p000v4.app.FragmentActivity;
import java.util.Arrays;
import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0017¨\u0006\u0004"}, mo21491d2 = {"com/valora/kkiosk/trivia/StreamInactiveFragment$timerChildEventListener$1$restartTimer$1", "Ljava/util/TimerTask;", "run", "", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: StreamInactiveFragment.kt */
public final class StreamInactiveFragment$timerChildEventListener$1$restartTimer$1 extends TimerTask {
    final /* synthetic */ long $timestamp;
    final /* synthetic */ StreamInactiveFragment$timerChildEventListener$1 this$0;

    StreamInactiveFragment$timerChildEventListener$1$restartTimer$1(StreamInactiveFragment$timerChildEventListener$1 streamInactiveFragment$timerChildEventListener$1, long j) {
        this.this$0 = streamInactiveFragment$timerChildEventListener$1;
        this.$timestamp = j;
    }

    @SuppressLint({"SimpleDateFormat"})
    public void run() {
        long time = this.$timestamp - new Date().getTime();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArr = {Long.valueOf(TimeUnit.MILLISECONDS.toHours(time)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(time) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(time))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(time) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(time)))};
        String format = String.format("%02d:%02d:%02d", Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        if (this.this$0.this$0.getActivity() != null) {
            FragmentActivity activity = this.this$0.this$0.getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            activity.runOnUiThread(new C1220x3d05ba20(this, format, time));
        }
    }
}
