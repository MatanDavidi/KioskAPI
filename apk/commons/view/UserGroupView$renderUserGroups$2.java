package com.valora.kkiosk.commons.view;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import com.valora.kkiosk.commons.models.UserGroup;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo21491d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: UserGroupView.kt */
final class UserGroupView$renderUserGroups$2 implements OnCheckedChangeListener {
    final /* synthetic */ UserGroupView this$0;

    UserGroupView$renderUserGroups$2(UserGroupView userGroupView) {
        this.this$0 = userGroupView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Switch switchR = (Switch) this.this$0._$_findCachedViewById(C1224R.C1226id.switch_membergroup_tabak);
        String str = "switch_membergroup_tabak";
        Intrinsics.checkExpressionValueIsNotNull(switchR, str);
        if (switchR.getTag() != null) {
            Switch switchR2 = (Switch) this.this$0._$_findCachedViewById(C1224R.C1226id.switch_membergroup_tabak);
            Intrinsics.checkExpressionValueIsNotNull(switchR2, str);
            switchR2.setTag(null);
        } else if (z) {
            this.this$0.signUpForTabaccoOffers();
        } else {
            Switch switchR3 = (Switch) this.this$0._$_findCachedViewById(C1224R.C1226id.switch_membergroup_tabak);
            Intrinsics.checkExpressionValueIsNotNull(switchR3, str);
            switchR3.setChecked(false);
            UserGroupCallbacks access$getCallbacks$p = this.this$0.callbacks;
            if (access$getCallbacks$p != null) {
                UserGroup userGroup = new UserGroup(UserGroupView.GROUP_ID_TABACCO_OFFERS, null, false, null, null);
                access$getCallbacks$p.updateUserGroup(userGroup);
            }
        }
    }
}
