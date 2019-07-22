package com.valora.kkiosk;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.Metadata;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: UserProfileFragment.kt */
final class UserProfileFragment$onCreateView$3 implements OnClickListener {
    final /* synthetic */ UserProfileFragment this$0;

    UserProfileFragment$onCreateView$3(UserProfileFragment userProfileFragment) {
        this.this$0 = userProfileFragment;
    }

    public final void onClick(View view) {
        UserProfileFragment.updateUser$default(this.this$0, null, 1, null);
    }
}
