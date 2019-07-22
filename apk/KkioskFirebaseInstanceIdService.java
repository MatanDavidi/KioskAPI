package com.valora.kkiosk;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.valora.kkiosk.commons.api.RestApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo21491d2 = {"Lcom/valora/kkiosk/KkioskFirebaseInstanceIdService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "onNewToken", "", "s", "", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: KkioskFirebaseInstanceIdService.kt */
public final class KkioskFirebaseInstanceIdService extends FirebaseMessagingService {
    public void onNewToken(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "s");
        super.onNewToken(str);
        new RestApi().getUser().enqueue(new KkioskFirebaseInstanceIdService$onNewToken$1(this));
    }
}
