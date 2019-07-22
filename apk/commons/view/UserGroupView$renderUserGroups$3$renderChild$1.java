package com.valora.kkiosk.commons.view;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.MaterialDialog.Builder;
import com.afollestad.materialdialogs.MaterialDialog.SingleButtonCallback;
import com.valora.kkiosk.R;
import com.valora.kkiosk.commons.models.UserGroup;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo21491d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: UserGroupView.kt */
final class UserGroupView$renderUserGroups$3$renderChild$1 implements OnCheckedChangeListener {
    final /* synthetic */ UserGroup $userGroup;
    final /* synthetic */ View $view;
    final /* synthetic */ UserGroupView$renderUserGroups$3 this$0;

    UserGroupView$renderUserGroups$3$renderChild$1(UserGroupView$renderUserGroups$3 userGroupView$renderUserGroups$3, UserGroup userGroup, View view) {
        this.this$0 = userGroupView$renderUserGroups$3;
        this.$userGroup = userGroup;
        this.$view = view;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        UserGroup userGroup = this.$userGroup;
        if (userGroup == null) {
            Intrinsics.throwNpe();
        }
        String str = "view!!.switch_membergroup";
        if (!userGroup.isCodeNeeded() || !z) {
            UserGroup userGroup2 = this.$userGroup;
            if (userGroup2 == null) {
                Intrinsics.throwNpe();
            }
            if (userGroup2.isCodeNeeded()) {
                View view = this.$view;
                if (view == null) {
                    Intrinsics.throwNpe();
                }
                Switch switchR = (Switch) view.findViewById(C1224R.C1226id.switch_membergroup);
                Intrinsics.checkExpressionValueIsNotNull(switchR, str);
                switchR.setChecked(true);
                Context context = this.this$0.this$0.getContext();
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                new Builder(context).content((int) R.string.membergroups_leave_dialog_msg).negativeText((int) R.string.membergroups_leave_dialog_cancel).positiveText((int) R.string.membergroups_leave_dialog_leave).onPositive(new SingleButtonCallback(this) {
                    final /* synthetic */ UserGroupView$renderUserGroups$3$renderChild$1 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onClick(@NotNull MaterialDialog materialDialog, @NotNull DialogAction dialogAction) {
                        Intrinsics.checkParameterIsNotNull(materialDialog, "<anonymous parameter 0>");
                        Intrinsics.checkParameterIsNotNull(dialogAction, "<anonymous parameter 1>");
                        this.this$0.this$0.this$0.updateUserGroup(this.this$0.$userGroup.getGroupId(), false);
                    }
                }).build().show();
                return;
            }
            this.this$0.this$0.updateUserGroup(this.$userGroup.getGroupId(), z);
            return;
        }
        View view2 = this.$view;
        if (view2 == null) {
            Intrinsics.throwNpe();
        }
        Switch switchR2 = (Switch) view2.findViewById(C1224R.C1226id.switch_membergroup);
        Intrinsics.checkExpressionValueIsNotNull(switchR2, str);
        switchR2.setChecked(false);
        UserGroupView userGroupView = this.this$0.this$0;
        UserGroup userGroup3 = this.$userGroup;
        if (userGroup3 == null) {
            Intrinsics.throwNpe();
        }
        userGroupView.showQrCodeScanner(userGroup3);
    }
}
