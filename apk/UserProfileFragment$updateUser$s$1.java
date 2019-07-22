package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.support.p000v4.app.FragmentActivity;
import android.widget.Button;
import com.valora.kkiosk.commons.models.UserData;
import com.valora.kkiosk.consents.ConsentCallbacks;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "retrieved", "Lcom/valora/kkiosk/commons/models/UserData;", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: UserProfileFragment.kt */
final class UserProfileFragment$updateUser$s$1<T> implements Action1<UserData> {
    final /* synthetic */ UserProfileFragment this$0;

    UserProfileFragment$updateUser$s$1(UserProfileFragment userProfileFragment) {
        this.this$0 = userProfileFragment;
    }

    public final void call(UserData userData) {
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            ((ConsentCallbacks) activity).onConsentsChanged(this.this$0.getConsents());
            ProgressDialog access$getDialog$p = this.this$0.dialog;
            if (access$getDialog$p == null) {
                Intrinsics.throwNpe();
            }
            access$getDialog$p.hide();
            this.this$0.loadUser();
            Button button = (Button) this.this$0._$_findCachedViewById(C1224R.C1226id.button_save);
            Intrinsics.checkExpressionValueIsNotNull(button, "button_save");
            button.setEnabled(true);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.consents.ConsentCallbacks");
    }
}
