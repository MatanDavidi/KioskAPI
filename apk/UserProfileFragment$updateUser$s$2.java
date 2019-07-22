package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.widget.Button;
import android.widget.Toast;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: UserProfileFragment.kt */
final class UserProfileFragment$updateUser$s$2<T> implements Action1<Throwable> {
    final /* synthetic */ UserProfileFragment this$0;

    UserProfileFragment$updateUser$s$2(UserProfileFragment userProfileFragment) {
        this.this$0 = userProfileFragment;
    }

    public final void call(Throwable th) {
        ProgressDialog access$getDialog$p = this.this$0.dialog;
        if (access$getDialog$p == null) {
            Intrinsics.throwNpe();
        }
        access$getDialog$p.hide();
        Button button = (Button) this.this$0._$_findCachedViewById(C1224R.C1226id.button_save);
        Intrinsics.checkExpressionValueIsNotNull(button, "button_save");
        button.setEnabled(true);
        if (th.getMessage() != null) {
            String message = th.getMessage();
            if (message == null) {
                Intrinsics.throwNpe();
            }
            CharSequence charSequence = message;
            int indexOf$default = StringsKt.indexOf$default(charSequence, "{", 0, false, 6, (Object) null);
            int lastIndexOf$default = StringsKt.lastIndexOf$default(charSequence, "}", 0, false, 6, (Object) null) + 1;
            if (message != null) {
                String substring = message.substring(indexOf$default, lastIndexOf$default);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Object obj = new JSONObject(substring).get("ResponseStatus");
                String str = "null cannot be cast to non-null type org.json.JSONObject";
                if (obj != null) {
                    Object obj2 = ((JSONObject) obj).getJSONArray("Errors").get(0);
                    if (obj2 != null) {
                        Toast.makeText(this.this$0.getContext(), ((JSONObject) obj2).get("Message").toString(), 1).show();
                        return;
                    }
                    throw new TypeCastException(str);
                }
                throw new TypeCastException(str);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }
}
