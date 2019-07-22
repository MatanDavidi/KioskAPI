package com.valora.kkiosk.commons.view;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.MaterialDialog.SingleButtonCallback;
import com.valora.kkiosk.commons.models.UserGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo21491d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/afollestad/materialdialogs/MaterialDialog;", "<anonymous parameter 1>", "Lcom/afollestad/materialdialogs/DialogAction;", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: UserGroupView.kt */
final class UserGroupView$showQrCodeScanner$2 implements SingleButtonCallback {
    final /* synthetic */ UserGroup $userGroup;
    final /* synthetic */ UserGroupView this$0;

    UserGroupView$showQrCodeScanner$2(UserGroupView userGroupView, UserGroup userGroup) {
        this.this$0 = userGroupView;
        this.$userGroup = userGroup;
    }

    public final void onClick(@NotNull MaterialDialog materialDialog, @NotNull DialogAction dialogAction) {
        Intrinsics.checkParameterIsNotNull(materialDialog, "<anonymous parameter 0>");
        Intrinsics.checkParameterIsNotNull(dialogAction, "<anonymous parameter 1>");
        UserGroupCallbacks access$getCallbacks$p = this.this$0.callbacks;
        if (access$getCallbacks$p != null) {
            access$getCallbacks$p.showQrCodeScanner(this.$userGroup);
        }
    }
}
