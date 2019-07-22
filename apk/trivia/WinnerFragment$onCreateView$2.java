package com.valora.kkiosk.trivia;

import android.content.Intent;
import android.support.p000v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.valora.kkiosk.MainActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: WinnerFragment.kt */
final class WinnerFragment$onCreateView$2 implements OnClickListener {
    final /* synthetic */ WinnerFragment this$0;

    WinnerFragment$onCreateView$2(WinnerFragment winnerFragment) {
        this.this$0 = winnerFragment;
    }

    public final void onClick(View view) {
        Intent intent = new Intent(this.this$0.getActivity(), MainActivity.class);
        if (this.this$0.getActivity() != null) {
            FragmentActivity activity = this.this$0.getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            activity.startActivity(intent);
            FragmentActivity activity2 = this.this$0.getActivity();
            if (activity2 == null) {
                Intrinsics.throwNpe();
            }
            activity2.finish();
        }
    }
}
