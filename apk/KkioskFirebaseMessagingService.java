package com.valora.kkiosk;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.support.p000v4.app.NotificationCompat.Builder;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.messaging.RemoteMessage.Notification;
import com.valora.kkiosk.trivia.TriviaActivity.IntentHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo21491d2 = {"Lcom/valora/kkiosk/KkioskFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "TAG", "", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "presentNotification", "body", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: KkioskFirebaseMessagingService.kt */
public final class KkioskFirebaseMessagingService extends FirebaseMessagingService {
    private final String TAG = "MyFirebaseMsgService";

    public void onMessageReceived(@Nullable RemoteMessage remoteMessage) {
        String str = this.TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("FROM:");
        if (remoteMessage == null) {
            Intrinsics.throwNpe();
        }
        sb.append(remoteMessage.getFrom());
        Log.d(str, sb.toString());
        Map data = remoteMessage.getData();
        Intrinsics.checkExpressionValueIsNotNull(data, "remoteMessage.data");
        if (!data.isEmpty()) {
            String str2 = this.TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Message data: ");
            sb2.append(remoteMessage.getData());
            Log.d(str2, sb2.toString());
            String str3 = (String) remoteMessage.getData().get("message");
            if (str3 != null) {
                presentNotification(str3, remoteMessage);
            } else if (remoteMessage.getNotification() != null) {
                Notification notification = remoteMessage.getNotification();
                if (notification == null) {
                    Intrinsics.throwNpe();
                }
                String str4 = "remoteMessage.notification!!";
                Intrinsics.checkExpressionValueIsNotNull(notification, str4);
                if (notification.getBody() != null) {
                    Notification notification2 = remoteMessage.getNotification();
                    if (notification2 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(notification2, str4);
                    String body = notification2.getBody();
                    if (body == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(body, "remoteMessage.notification!!.body!!");
                    presentNotification(body, remoteMessage);
                }
            }
        }
    }

    private final void presentNotification(String str, RemoteMessage remoteMessage) {
        Intent intent;
        if (((String) remoteMessage.getData().get(KkioskFirebaseMessagingServiceKt.FCM_KEY_SHOW_TRIVIA)) != null) {
            intent = IntentHelper.INSTANCE.getTriviaActivityIntent(this);
        } else {
            intent = new Intent(this, MainActivity.class);
        }
        intent.setFlags(67108864);
        Context context = this;
        Builder contentIntent = new Builder(context).setSmallIcon(R.mipmap.ic_launcher).setContentTitle("k kiosk").setContentText(str).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2)).setContentIntent(PendingIntent.getActivity(context, 0, intent, 1073741824));
        Object systemService = getSystemService("notification");
        if (systemService != null) {
            ((NotificationManager) systemService).notify(0, contentIntent.build());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.NotificationManager");
    }
}
