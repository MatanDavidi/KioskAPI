package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.valora.kkiosk.commons.models.UserData;
import com.valora.kkiosk.commons.view.UserGroupView;
import com.valora.kkiosk.consents.Consents;
import com.valora.kkioskPreview.C1224R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.threeten.p017bp.LocalDate;
import org.threeten.p017bp.ZoneId;
import org.threeten.p017bp.ZonedDateTime;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "retrieved", "Lcom/valora/kkiosk/commons/models/UserData;", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: UserProfileFragment.kt */
final class UserProfileFragment$loadUser$s$1<T> implements Action1<UserData> {
    final /* synthetic */ UserProfileFragment this$0;

    UserProfileFragment$loadUser$s$1(UserProfileFragment userProfileFragment) {
        this.this$0 = userProfileFragment;
    }

    public final void call(UserData userData) {
        this.this$0.user = userData;
        UserProfileFragment userProfileFragment = this.this$0;
        UserData access$getUser$p = userProfileFragment.user;
        if (access$getUser$p == null) {
            Intrinsics.throwNpe();
        }
        List consents = access$getUser$p.getConsents();
        if (consents == null) {
            Intrinsics.throwNpe();
        }
        userProfileFragment.setConsents(new Consents(new ArrayList(consents)));
        ((EditText) this.this$0._$_findCachedViewById(C1224R.C1226id.msn_text)).setText(userData.getMsn(), BufferType.EDITABLE);
        ((EditText) this.this$0._$_findCachedViewById(C1224R.C1226id.name_text)).setText(userData.getName(), BufferType.EDITABLE);
        this.this$0.dob = LocalDate.parse(userData.getDateOfBirth(), this.this$0.getDobFormatter()).atStartOfDay(ZoneId.systemDefault());
        TextView textView = (TextView) this.this$0._$_findCachedViewById(C1224R.C1226id.dob_text);
        ZonedDateTime access$getDob$p = this.this$0.dob;
        if (access$getDob$p == null) {
            Intrinsics.throwNpe();
        }
        textView.setText(access$getDob$p.format(this.this$0.getUiDobFormatter()), BufferType.EDITABLE);
        UserGroupView userGroupView = (UserGroupView) this.this$0._$_findCachedViewById(C1224R.C1226id.user_group_view);
        UserData access$getUser$p2 = this.this$0.user;
        if (access$getUser$p2 == null) {
            Intrinsics.throwNpe();
        }
        List userGroups = access$getUser$p2.getUserGroups();
        if (userGroups == null) {
            Intrinsics.throwNpe();
        }
        ZonedDateTime access$getDob$p2 = this.this$0.dob;
        if (access$getDob$p2 == null) {
            Intrinsics.throwNpe();
        }
        userGroupView.updateUserGroups(userGroups, access$getDob$p2);
        ((UserGroupView) this.this$0._$_findCachedViewById(C1224R.C1226id.user_group_view)).setListener(this.this$0);
        if (this.this$0.dialog != null) {
            ProgressDialog access$getDialog$p = this.this$0.dialog;
            if (access$getDialog$p == null) {
                Intrinsics.throwNpe();
            }
            if (access$getDialog$p.isShowing() && this.this$0.getActivity() != null) {
                ProgressDialog access$getDialog$p2 = this.this$0.dialog;
                if (access$getDialog$p2 == null) {
                    Intrinsics.throwNpe();
                }
                access$getDialog$p2.hide();
            }
        }
    }
}
