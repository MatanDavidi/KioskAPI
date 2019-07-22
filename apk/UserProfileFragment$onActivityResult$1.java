package com.valora.kkiosk;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo21491d2 = {"<anonymous>", "", "run"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: UserProfileFragment.kt */
final class UserProfileFragment$onActivityResult$1 implements Runnable {
    final /* synthetic */ Intent $data;
    final /* synthetic */ UserProfileFragment this$0;

    UserProfileFragment$onActivityResult$1(UserProfileFragment userProfileFragment, Intent intent) {
        this.this$0 = userProfileFragment;
        this.$data = intent;
    }

    public final void run() {
        UserProfileFragment userProfileFragment = this.this$0;
        Intent intent = this.$data;
        if (intent == null) {
            Intrinsics.throwNpe();
        }
        String stringExtra = intent.getStringExtra("name");
        Intrinsics.checkExpressionValueIsNotNull(stringExtra, "data!!.getStringExtra(Co…ctivity.EXTRA_GROUP_NAME)");
        Intent intent2 = this.$data;
        if (intent2 == null) {
            Intrinsics.throwNpe();
        }
        String stringExtra2 = intent2.getStringExtra(CodeActivity.EXTRA_CODE);
        Intrinsics.checkExpressionValueIsNotNull(stringExtra2, "data!!.getStringExtra(CodeActivity.EXTRA_CODE)");
        userProfileFragment.enterPrivateGroup(stringExtra, stringExtra2);
    }
}
