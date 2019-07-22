package com.valora.kkiosk;

import android.support.p000v4.app.FragmentManager.OnBackStackChangedListener;
import kotlin.Metadata;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo21491d2 = {"<anonymous>", "", "onBackStackChanged"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
final class MainActivity$startUI$3 implements OnBackStackChangedListener {
    final /* synthetic */ MainActivity this$0;

    MainActivity$startUI$3(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    public final void onBackStackChanged() {
        this.this$0.updateNavigation();
    }
}
