package com.valora.kkiosk.commons.features;

import android.transition.TransitionManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.valora.kkiosk.commons.features.CouponsDelegateAdapter.TurnsViewHolder;
import com.valora.kkiosk.commons.models.Coupon;
import com.valora.kkioskPreview.C1224R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo21491d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/valora/kkiosk/commons/features/CouponsDelegateAdapter$TurnsViewHolder$bind$1$3"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* renamed from: com.valora.kkiosk.commons.features.CouponsDelegateAdapter$TurnsViewHolder$bind$$inlined$with$lambda$3 */
/* compiled from: CouponsDelegateAdapter.kt */
final class C1213x9aa7043a implements OnClickListener {
    final /* synthetic */ Coupon $item$inlined;
    final /* synthetic */ View $this_with;
    final /* synthetic */ TurnsViewHolder this$0;

    C1213x9aa7043a(View view, TurnsViewHolder turnsViewHolder, Coupon coupon) {
        this.$this_with = view;
        this.this$0 = turnsViewHolder;
        this.$item$inlined = coupon;
    }

    public final void onClick(View view) {
        ImageView imageView = (ImageView) this.$this_with.findViewById(C1224R.C1226id.back_image);
        String str = "back_image";
        Intrinsics.checkExpressionValueIsNotNull(imageView, str);
        String str2 = "top_image";
        if (imageView.getVisibility() == 0) {
            ImageView imageView2 = (ImageView) this.$this_with.findViewById(C1224R.C1226id.top_image);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, str2);
            imageView2.setVisibility(0);
            ImageView imageView3 = (ImageView) this.$this_with.findViewById(C1224R.C1226id.back_image);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, str);
            imageView3.setVisibility(8);
        } else {
            ImageView imageView4 = (ImageView) this.$this_with.findViewById(C1224R.C1226id.top_image);
            Intrinsics.checkExpressionValueIsNotNull(imageView4, str2);
            imageView4.setVisibility(8);
            ImageView imageView5 = (ImageView) this.$this_with.findViewById(C1224R.C1226id.back_image);
            Intrinsics.checkExpressionValueIsNotNull(imageView5, str);
            imageView5.setVisibility(0);
            ((ImageView) this.$this_with.findViewById(C1224R.C1226id.back_image)).bringToFront();
        }
        TextView textView = (TextView) this.$this_with.findViewById(C1224R.C1226id.top_text);
        Intrinsics.checkExpressionValueIsNotNull(textView, "top_text");
        ImageView imageView6 = (ImageView) this.$this_with.findViewById(C1224R.C1226id.top_image);
        Intrinsics.checkExpressionValueIsNotNull(imageView6, str2);
        textView.setVisibility(imageView6.getVisibility());
        TextView textView2 = (TextView) this.$this_with.findViewById(C1224R.C1226id.bottom_text);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "bottom_text");
        ImageView imageView7 = (ImageView) this.$this_with.findViewById(C1224R.C1226id.top_image);
        Intrinsics.checkExpressionValueIsNotNull(imageView7, str2);
        textView2.setVisibility(imageView7.getVisibility());
        ImageView imageView8 = (ImageView) this.$this_with.findViewById(C1224R.C1226id.barcode_image);
        Intrinsics.checkExpressionValueIsNotNull(imageView8, "barcode_image");
        ImageView imageView9 = (ImageView) this.$this_with.findViewById(C1224R.C1226id.top_image);
        Intrinsics.checkExpressionValueIsNotNull(imageView9, str2);
        imageView8.setVisibility(imageView9.getVisibility());
        TransitionManager.beginDelayedTransition(this.this$0.parentViewGroup);
    }
}
