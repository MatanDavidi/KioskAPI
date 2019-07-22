package com.valora.kkiosk.trivia;

import com.valora.kkiosk.R;
import kotlin.Metadata;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo21491d2 = {"<anonymous>", "", "run"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* renamed from: com.valora.kkiosk.trivia.StreamInactiveFragment$timerChildEventListener$1$restartTimer$1$run$1 */
/* compiled from: StreamInactiveFragment.kt */
final class C1220x3d05ba20 implements Runnable {
    final /* synthetic */ long $diff;
    final /* synthetic */ String $diffString;
    final /* synthetic */ StreamInactiveFragment$timerChildEventListener$1$restartTimer$1 this$0;

    C1220x3d05ba20(StreamInactiveFragment$timerChildEventListener$1$restartTimer$1 streamInactiveFragment$timerChildEventListener$1$restartTimer$1, String str, long j) {
        this.this$0 = streamInactiveFragment$timerChildEventListener$1$restartTimer$1;
        this.$diffString = str;
        this.$diff = j;
    }

    public final void run() {
        StreamInactiveFragment.access$getTimerTextView$p(this.this$0.this$0.this$0).setText(this.$diffString);
        if (this.$diff < 0) {
            StreamInactiveFragment.access$getTimerTextView$p(this.this$0.this$0.this$0).setText(this.this$0.this$0.this$0.getResources().getString(R.string.we_will_start_any_moment));
        } else if (StreamInactiveFragment.access$getTimerTextView$p(this.this$0.this$0.this$0).getVisibility() == 8) {
            StreamInactiveFragment.access$getTimerTextView$p(this.this$0.this$0.this$0).setVisibility(0);
            StreamInactiveFragment.access$getTimerTitleTextView$p(this.this$0.this$0.this$0).setVisibility(0);
        }
    }
}
