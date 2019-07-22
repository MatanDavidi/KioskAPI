package com.valora.kkiosk.trivia;

import android.support.p000v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: HasLostFragment.kt */
final class HasLostFragment$onCreateView$2 implements OnClickListener {
    final /* synthetic */ String $winningState;
    final /* synthetic */ HasLostFragment this$0;

    HasLostFragment$onCreateView$2(HasLostFragment hasLostFragment, String str) {
        this.this$0 = hasLostFragment;
        this.$winningState = str;
    }

    public final void onClick(View view) {
        if (!Intrinsics.areEqual((Object) this.$winningState, (Object) WinningState.SPECIAL_PRIZE)) {
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                ((TriviaActivity) activity).showStreamOnly();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.trivia.TriviaActivity");
        } else if (this.this$0.getActivity() != null) {
            FragmentActivity activity2 = this.this$0.getActivity();
            if (activity2 == null) {
                Intrinsics.throwNpe();
            }
            activity2.finish();
        }
    }
}
