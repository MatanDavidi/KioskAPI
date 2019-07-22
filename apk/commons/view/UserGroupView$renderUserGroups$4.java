package com.valora.kkiosk.commons.view;

import android.view.View;
import iammert.com.expandablelib.ExpandCollapseListener.ExpandListener;
import kotlin.Metadata;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u000e\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, mo21491d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "kotlin.jvm.PlatformType", "<anonymous parameter 2>", "Landroid/view/View;", "onExpanded"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: UserGroupView.kt */
final class UserGroupView$renderUserGroups$4<P> implements ExpandListener<Object> {
    final /* synthetic */ UserGroupView this$0;

    UserGroupView$renderUserGroups$4(UserGroupView userGroupView) {
        this.this$0 = userGroupView;
    }

    public final void onExpanded(int i, Object obj, View view) {
        UserGroupView userGroupView = this.this$0;
        UserGroupCallbacks access$getCallbacks$p = userGroupView.callbacks;
        if (access$getCallbacks$p != null) {
            access$getCallbacks$p.onMemberGroupSectionExpanded();
        }
        userGroupView.isExpanded = true;
    }
}
