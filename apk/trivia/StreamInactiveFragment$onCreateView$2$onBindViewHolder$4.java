package com.valora.kkiosk.trivia;

import com.google.android.gms.tasks.OnFailureListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo21491d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "onFailure"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: StreamInactiveFragment.kt */
final class StreamInactiveFragment$onCreateView$2$onBindViewHolder$4 implements OnFailureListener {
    public static final StreamInactiveFragment$onCreateView$2$onBindViewHolder$4 INSTANCE = new StreamInactiveFragment$onCreateView$2$onBindViewHolder$4();

    StreamInactiveFragment$onCreateView$2$onBindViewHolder$4() {
    }

    public final void onFailure(@NotNull Exception exc) {
        Intrinsics.checkParameterIsNotNull(exc, "it");
        exc.printStackTrace();
    }
}
