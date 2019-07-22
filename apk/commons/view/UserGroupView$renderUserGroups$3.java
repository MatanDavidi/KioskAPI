package com.valora.kkiosk.commons.view;

import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import com.valora.kkiosk.commons.models.UserGroup;
import com.valora.kkioskPreview.C1224R;
import iammert.com.expandablelib.ExpandableLayout.Renderer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J,\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J,\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, mo21491d2 = {"com/valora/kkiosk/commons/view/UserGroupView$renderUserGroups$3", "Liammert/com/expandablelib/ExpandableLayout$Renderer;", "", "Lcom/valora/kkiosk/commons/models/UserGroup;", "renderChild", "", "view", "Landroid/view/View;", "userGroup", "p2", "", "p3", "renderParent", "parent", "title", "", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: UserGroupView.kt */
public final class UserGroupView$renderUserGroups$3 implements Renderer<String, UserGroup> {
    final /* synthetic */ UserGroupView this$0;

    UserGroupView$renderUserGroups$3(UserGroupView userGroupView) {
        this.this$0 = userGroupView;
    }

    public void renderChild(@Nullable View view, @Nullable UserGroup userGroup, int i, int i2) {
        if (view == null) {
            Intrinsics.throwNpe();
        }
        Switch switchR = (Switch) view.findViewById(C1224R.C1226id.switch_membergroup);
        String str = "view!!.switch_membergroup";
        Intrinsics.checkExpressionValueIsNotNull(switchR, str);
        if (userGroup == null) {
            Intrinsics.throwNpe();
        }
        switchR.setText(userGroup.getGroupDescription());
        Switch switchR2 = (Switch) view.findViewById(C1224R.C1226id.switch_membergroup);
        Intrinsics.checkExpressionValueIsNotNull(switchR2, str);
        switchR2.setChecked(userGroup.getIsUserMember());
        ((Switch) view.findViewById(C1224R.C1226id.switch_membergroup)).setOnCheckedChangeListener(new UserGroupView$renderUserGroups$3$renderChild$1(this, userGroup, view));
    }

    public void renderParent(@Nullable View view, @Nullable String str, boolean z, int i) {
        if (view == null) {
            Intrinsics.throwNpe();
        }
        TextView textView = (TextView) view.findViewById(C1224R.C1226id.text_view_usergroup_header);
        Intrinsics.checkExpressionValueIsNotNull(textView, "parent!!.text_view_usergroup_header");
        textView.setText(str);
    }
}
