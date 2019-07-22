package com.valora.kkiosk.coupons;

import android.content.SharedPreferences;
import android.support.p000v4.app.FragmentActivity;
import com.valora.kkiosk.MainActivityKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo21491d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "invoke"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CouponsCardsFragment.kt */
final class CouponsCardsFragment$settings$2 extends Lambda implements Function0<SharedPreferences> {
    final /* synthetic */ CouponsCardsFragment this$0;

    CouponsCardsFragment$settings$2(CouponsCardsFragment couponsCardsFragment) {
        this.this$0 = couponsCardsFragment;
        super(0);
    }

    @Nullable
    public final SharedPreferences invoke() {
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            return activity.getSharedPreferences(MainActivityKt.PREFS_NAME, 0);
        }
        return null;
    }
}
