package com.valora.kkiosk.trivia;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import kotlin.Metadata;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: HasLostFragment.kt */
final class HasLostFragment$onCreateView$1 implements OnClickListener {
    final /* synthetic */ Intent $dealiniLink;
    final /* synthetic */ HasLostFragment this$0;

    HasLostFragment$onCreateView$1(HasLostFragment hasLostFragment, Intent intent) {
        this.this$0 = hasLostFragment;
        this.$dealiniLink = intent;
    }

    public final void onClick(View view) {
        this.this$0.startActivity(this.$dealiniLink);
    }
}
