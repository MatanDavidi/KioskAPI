package com.valora.kkiosk.trivia;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo21491d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: TriviaConsentActivity.kt */
final class TriviaConsentActivity$onClick$1 implements OnClickListener {
    public static final TriviaConsentActivity$onClick$1 INSTANCE = new TriviaConsentActivity$onClick$1();

    TriviaConsentActivity$onClick$1() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (dialogInterface == null) {
            Intrinsics.throwNpe();
        }
        dialogInterface.dismiss();
    }
}
