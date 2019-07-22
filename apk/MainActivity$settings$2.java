package com.valora.kkiosk;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo21491d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
final class MainActivity$settings$2 extends Lambda implements Function0<SharedPreferences> {
    final /* synthetic */ MainActivity this$0;

    MainActivity$settings$2(MainActivity mainActivity) {
        this.this$0 = mainActivity;
        super(0);
    }

    public final SharedPreferences invoke() {
        return this.this$0.getSharedPreferences(MainActivityKt.PREFS_NAME, 0);
    }
}
