package com.valora.kkiosk;

import android.app.Dialog;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo21491d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
final class MainActivity$showPushConsentDialog$1 implements OnClickListener {
    final /* synthetic */ Dialog $dialog;
    final /* synthetic */ MainActivity this$0;

    MainActivity$showPushConsentDialog$1(MainActivity mainActivity, Dialog dialog) {
        this.this$0 = mainActivity;
        this.$dialog = dialog;
    }

    public final void onClick(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Editor edit = this.this$0.getPreferences(0).edit();
        edit.putBoolean(MainActivityKt.SETTINGS_KEY_PUSH_CONSENT_GIVEN, true);
        edit.apply();
        this.$dialog.dismiss();
    }
}
