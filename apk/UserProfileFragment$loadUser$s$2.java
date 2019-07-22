package com.valora.kkiosk;

import android.app.ProgressDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p018rx.functions.Action1;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: UserProfileFragment.kt */
final class UserProfileFragment$loadUser$s$2<T> implements Action1<Throwable> {
    final /* synthetic */ UserProfileFragment this$0;

    UserProfileFragment$loadUser$s$2(UserProfileFragment userProfileFragment) {
        this.this$0 = userProfileFragment;
    }

    public final void call(Throwable th) {
        if (this.this$0.dialog != null) {
            ProgressDialog access$getDialog$p = this.this$0.dialog;
            if (access$getDialog$p == null) {
                Intrinsics.throwNpe();
            }
            access$getDialog$p.hide();
        }
    }
}
