package com.valora.kkiosk.commons.view;

import com.valora.kkiosk.commons.models.UserGroup;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\f"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/view/UserGroupCallbacks;", "", "enterPrivateGroup", "", "groupName", "", "code", "onMemberGroupSectionExpanded", "showQrCodeScanner", "userGroup", "Lcom/valora/kkiosk/commons/models/UserGroup;", "updateUserGroup", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: UserGroupView.kt */
public interface UserGroupCallbacks {
    void enterPrivateGroup(@NotNull String str, @NotNull String str2);

    void onMemberGroupSectionExpanded();

    void showQrCodeScanner(@NotNull UserGroup userGroup);

    void updateUserGroup(@NotNull UserGroup userGroup);
}
