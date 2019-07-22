package com.valora.kkiosk.trivia;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.p003v7.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import com.valora.kkiosk.MainActivity;
import com.valora.kkiosk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: TriviaActivity.kt */
final class TriviaActivity$onCreate$1 implements OnClickListener {
    final /* synthetic */ TriviaActivity this$0;

    TriviaActivity$onCreate$1(TriviaActivity triviaActivity) {
        this.this$0 = triviaActivity;
    }

    public final void onClick(View view) {
        if (this.this$0.broadcast == null) {
            TriviaActivity triviaActivity = this.this$0;
            triviaActivity.startActivity(new Intent(triviaActivity, MainActivity.class));
            this.this$0.finish();
        } else if (Intrinsics.areEqual((Object) this.this$0.winningState, (Object) "")) {
            new Builder(this.this$0).setTitle((int) R.string.cancel_quiz_title).setMessage((int) R.string.cancel_quiz_text).setPositiveButton((int) R.string.leave, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                final /* synthetic */ TriviaActivity$onCreate$1 this$0;

                {
                    this.this$0 = r1;
                }

                public void onClick(@Nullable DialogInterface dialogInterface, int i) {
                    this.this$0.this$0.startActivity(new Intent(this.this$0.this$0, MainActivity.class));
                    this.this$0.this$0.finish();
                }
            }).setNegativeButton((int) R.string.stay, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(@Nullable DialogInterface dialogInterface, int i) {
                    if (dialogInterface == null) {
                        Intrinsics.throwNpe();
                    }
                    dialogInterface.dismiss();
                }
            }).show();
        }
    }
}
