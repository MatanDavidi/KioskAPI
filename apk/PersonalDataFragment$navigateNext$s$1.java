package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.EditText;
import com.valora.kkiosk.PersonalDataFragment.OnUserProfileFragmentInteractionListener;
import com.valora.kkiosk.commons.features.DeviceManager;
import com.valora.kkiosk.commons.models.UserData;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "retrieved", "Lcom/valora/kkiosk/commons/models/UserData;", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: PersonalDataFragment.kt */
final class PersonalDataFragment$navigateNext$s$1<T> implements Action1<UserData> {
    final /* synthetic */ ProgressDialog $dialog;
    final /* synthetic */ View $view;
    final /* synthetic */ PersonalDataFragment this$0;

    PersonalDataFragment$navigateNext$s$1(PersonalDataFragment personalDataFragment, ProgressDialog progressDialog, View view) {
        this.this$0 = personalDataFragment;
        this.$dialog = progressDialog;
        this.$view = view;
    }

    public final void call(UserData userData) {
        this.$dialog.dismiss();
        OnUserProfileFragmentInteractionListener access$getMListener$p = this.this$0.mListener;
        if (access$getMListener$p != null) {
            StringBuilder sb = new StringBuilder();
            EditText editText = (EditText) this.this$0._$_findCachedViewById(C1224R.C1226id.first_name_text);
            Intrinsics.checkExpressionValueIsNotNull(editText, "first_name_text");
            sb.append(editText.getText().toString());
            sb.append(" ");
            EditText editText2 = (EditText) this.this$0._$_findCachedViewById(C1224R.C1226id.last_name_text);
            Intrinsics.checkExpressionValueIsNotNull(editText2, "last_name_text");
            sb.append(editText2.getText().toString());
            access$getMListener$p.userUpdated(sb.toString());
        }
        Snackbar.make(this.$view, (CharSequence) this.this$0.getString(R.string.registration_completed), 0).show();
        DeviceManager deviceManager = DeviceManager.INSTANCE;
        Intrinsics.checkExpressionValueIsNotNull(userData, "retrieved");
        Context context = this.this$0.getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        deviceManager.registerDevice(userData, context);
    }
}
