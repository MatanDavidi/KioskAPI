package com.valora.kkiosk.commons.features;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.valora.kkiosk.commons.features.CouponsDelegateAdapter.TurnsViewHolder;
import com.valora.kkiosk.commons.models.Coupon;
import kotlin.Metadata;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo21491d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/valora/kkiosk/commons/features/CouponsDelegateAdapter$TurnsViewHolder$bind$1$4"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* renamed from: com.valora.kkiosk.commons.features.CouponsDelegateAdapter$TurnsViewHolder$bind$$inlined$with$lambda$4 */
/* compiled from: CouponsDelegateAdapter.kt */
final class C1214x9aa7043b implements OnClickListener {
    final /* synthetic */ Coupon $item$inlined;
    final /* synthetic */ View $this_with;
    final /* synthetic */ TurnsViewHolder this$0;

    C1214x9aa7043b(View view, TurnsViewHolder turnsViewHolder, Coupon coupon) {
        this.$this_with = view;
        this.this$0 = turnsViewHolder;
        this.$item$inlined = coupon;
    }

    public final void onClick(View view) {
        String contentUrl = this.$item$inlined.getContentUrl();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(contentUrl));
        this.$this_with.getContext().startActivity(intent);
        Log.d("url", this.$item$inlined.getContentUrl());
    }
}
