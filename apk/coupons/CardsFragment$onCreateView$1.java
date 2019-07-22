package com.valora.kkiosk.coupons;

import android.support.p000v4.app.FragmentActivity;
import android.support.p000v4.widget.SwipeRefreshLayout.OnRefreshListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.valora.kkiosk.MainActivity;
import com.valora.kkiosk.commons.extensions.Helper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo21491d2 = {"<anonymous>", "", "onRefresh"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CardsFragment.kt */
final class CardsFragment$onCreateView$1 implements OnRefreshListener {
    final /* synthetic */ CardsFragment this$0;

    CardsFragment$onCreateView$1(CardsFragment cardsFragment) {
        this.this$0 = cardsFragment;
    }

    public final void onRefresh() {
        Helper helper = Helper.INSTANCE;
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            FirebaseAnalytics firebaseAnalytics = ((MainActivity) activity).getFirebaseAnalytics();
            if (firebaseAnalytics == null) {
                Intrinsics.throwNpe();
            }
            helper.logEvent(firebaseAnalytics, "ui_action", "button_press", "refresh");
            this.this$0.requestCards();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.MainActivity");
    }
}
