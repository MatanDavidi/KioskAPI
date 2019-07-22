package com.valora.kkiosk;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, mo21491d2 = {"<anonymous>", "", "task", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/auth/AuthResult;", "kotlin.jvm.PlatformType", "onComplete"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: SplashActivity.kt */
final class SplashActivity$onCreate$1<TResult> implements OnCompleteListener<AuthResult> {
    final /* synthetic */ SplashActivity this$0;

    SplashActivity$onCreate$1(SplashActivity splashActivity) {
        this.this$0 = splashActivity;
    }

    public final void onComplete(@NotNull Task<AuthResult> task) {
        Intrinsics.checkParameterIsNotNull(task, "task");
        if (task.isSuccessful()) {
            this.this$0.startApp();
        } else {
            this.this$0.showStartupFailedDialog();
        }
    }
}
