package com.valora.kkiosk;

import android.widget.ScrollView;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo21491d2 = {"<anonymous>", "", "run"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: UserProfileFragment.kt */
final class UserProfileFragment$onMemberGroupSectionExpanded$1 implements Runnable {
    final /* synthetic */ UserProfileFragment this$0;

    UserProfileFragment$onMemberGroupSectionExpanded$1(UserProfileFragment userProfileFragment) {
        this.this$0 = userProfileFragment;
    }

    public final void run() {
        ScrollView scrollView = (ScrollView) this.this$0._$_findCachedViewById(C1224R.C1226id.scroll_view_profile);
        ScrollView scrollView2 = (ScrollView) this.this$0._$_findCachedViewById(C1224R.C1226id.scroll_view_profile);
        Intrinsics.checkExpressionValueIsNotNull(scrollView2, "scroll_view_profile");
        scrollView.smoothScrollTo(0, scrollView2.getHeight());
    }
}
