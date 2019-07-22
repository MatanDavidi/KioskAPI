package com.valora.kkiosk.commons.features;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p018rx.Observable.OnSubscribe;
import p018rx.Subscriber;
import retrofit2.Response;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a*\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo21491d2 = {"<anonymous>", "", "subscriber", "Lrx/Subscriber;", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: UserManager.kt */
final class UserManager$validateRecruit$1<T> implements OnSubscribe<T> {
    final /* synthetic */ String $sanitizedMsn;
    final /* synthetic */ UserManager this$0;

    UserManager$validateRecruit$1(UserManager userManager, String str) {
        this.this$0 = userManager;
        this.$sanitizedMsn = str;
    }

    public final void call(Subscriber<? super String> subscriber) {
        Response execute = this.this$0.api.validateRecruit(this.$sanitizedMsn).execute();
        Intrinsics.checkExpressionValueIsNotNull(execute, "response");
        if (execute.isSuccessful()) {
            Map map = (Map) execute.body();
            if (map == null) {
                Intrinsics.throwNpe();
            }
            String str = "SmsTemplate";
            if (map.get(str) != null) {
                subscriber.onNext(map.get(str));
                subscriber.onCompleted();
                return;
            }
            subscriber.onError(new Throwable("Unexpected response from server"));
            return;
        }
        subscriber.onError(new Throwable(execute.message()));
    }
}
