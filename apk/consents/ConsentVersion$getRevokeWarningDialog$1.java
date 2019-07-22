package com.valora.kkiosk.consents;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo21491d2 = {"<anonymous>", "", "dialogInterface", "Landroid/content/DialogInterface;", "i", "", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: Consent.kt */
final class ConsentVersion$getRevokeWarningDialog$1 implements OnClickListener {
    public static final ConsentVersion$getRevokeWarningDialog$1 INSTANCE = new ConsentVersion$getRevokeWarningDialog$1();

    ConsentVersion$getRevokeWarningDialog$1() {
    }

    public final void onClick(@NotNull DialogInterface dialogInterface, int i) {
        Intrinsics.checkParameterIsNotNull(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }
}
