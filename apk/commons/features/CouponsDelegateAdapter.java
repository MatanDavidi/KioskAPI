package com.valora.kkiosk.commons.features;

import android.content.Context;
import android.support.p003v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import com.facebook.places.model.PlaceFields;
import com.valora.kkiosk.R;
import com.valora.kkiosk.commons.adapters.ViewType;
import com.valora.kkiosk.commons.adapters.ViewTypeDelegateAdapter;
import com.valora.kkiosk.commons.extensions.ExtensionsKt;
import com.valora.kkiosk.commons.models.Coupon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/features/CouponsDelegateAdapter;", "Lcom/valora/kkiosk/commons/adapters/ViewTypeDelegateAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "onBindViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "item", "Lcom/valora/kkiosk/commons/adapters/ViewType;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "TurnsViewHolder", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: CouponsDelegateAdapter.kt */
public final class CouponsDelegateAdapter implements ViewTypeDelegateAdapter {
    @NotNull
    private final Context context;

    @Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/features/CouponsDelegateAdapter$TurnsViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/view/ViewGroup;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "parentViewGroup", "bind", "", "item", "Lcom/valora/kkiosk/commons/models/Coupon;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
    /* compiled from: CouponsDelegateAdapter.kt */
    public static final class TurnsViewHolder extends ViewHolder {
        @NotNull
        private final Context context;
        /* access modifiers changed from: private */
        public final ViewGroup parentViewGroup;

        public TurnsViewHolder(@NotNull ViewGroup viewGroup, @NotNull Context context2) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(context2, PlaceFields.CONTEXT);
            super(ExtensionsKt.inflate(viewGroup, R.layout.coupon_item));
            this.context = context2;
            this.parentViewGroup = viewGroup;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x016f  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x01c3  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x01c5  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x01db  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x01e7  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x020f  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0251  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x026c  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0289  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x02ab  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x02c3  */
        /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void bind(@org.jetbrains.annotations.NotNull com.valora.kkiosk.commons.models.Coupon r14) {
            /*
                r13 = this;
                java.lang.String r0 = "item"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r0)
                android.view.View r0 = r13.itemView
                java.lang.Boolean r1 = r14.getDummy()
                r2 = 1
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                java.lang.String r3 = "top_image"
                r4 = 1053609165(0x3ecccccd, float:0.4)
                java.lang.String r5 = "top_text"
                r6 = 1065353216(0x3f800000, float:1.0)
                java.lang.String r7 = "barcode_image"
                if (r1 == 0) goto L_0x004c
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.top_image
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r1.setAlpha(r4)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.top_text
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
                r1.setAlpha(r4)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.barcode_image
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
                r1.setAlpha(r4)
                goto L_0x0076
            L_0x004c:
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.top_image
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r1.setAlpha(r6)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.top_text
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
                r1.setAlpha(r6)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.barcode_image
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
                r1.setAlpha(r6)
            L_0x0076:
                java.lang.String r1 = r14.getTopImageUrl()
                r8 = 2
                r9 = 0
                if (r1 == 0) goto L_0x0095
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.top_image
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                java.lang.String r3 = r14.getTopImageUrl()
                if (r3 != 0) goto L_0x0092
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0092:
                com.valora.kkiosk.commons.extensions.ExtensionsKt.loadImg$default(r1, r3, r9, r8, r9)
            L_0x0095:
                java.lang.String r1 = r14.getBarcodeUrl()
                r3 = 8
                r10 = 0
                if (r1 != 0) goto L_0x00ad
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.barcode_image
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
                r1.setVisibility(r3)
                goto L_0x00d2
            L_0x00ad:
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.barcode_image
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
                java.lang.String r11 = r14.getBarcodeUrl()
                if (r11 != 0) goto L_0x00c1
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x00c1:
                com.valora.kkiosk.commons.extensions.ExtensionsKt.loadImg$default(r1, r11, r9, r8, r9)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.barcode_image
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
                r1.setVisibility(r10)
            L_0x00d2:
                android.view.View r1 = r13.itemView
                com.valora.kkiosk.commons.features.CouponsDelegateAdapter$TurnsViewHolder$bind$$inlined$with$lambda$1 r11 = new com.valora.kkiosk.commons.features.CouponsDelegateAdapter$TurnsViewHolder$bind$$inlined$with$lambda$1
                r11.<init>(r0, r13, r14)
                android.view.View$OnClickListener r11 = (android.view.View.OnClickListener) r11
                r1.setOnClickListener(r11)
                java.lang.String r1 = r14.getBackImageUrl()
                java.lang.String r11 = "back_image"
                if (r1 == 0) goto L_0x00fd
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.back_image
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r11)
                java.lang.String r12 = r14.getBackImageUrl()
                if (r12 != 0) goto L_0x00fa
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x00fa:
                com.valora.kkiosk.commons.extensions.ExtensionsKt.loadImg$default(r1, r12, r9, r8, r9)
            L_0x00fd:
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.back_image
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r11)
                r11 = 4
                r1.setVisibility(r11)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.button_share
                android.view.View r1 = r0.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                com.valora.kkiosk.commons.features.CouponsDelegateAdapter$TurnsViewHolder$bind$$inlined$with$lambda$2 r11 = new com.valora.kkiosk.commons.features.CouponsDelegateAdapter$TurnsViewHolder$bind$$inlined$with$lambda$2
                r11.<init>(r0, r13, r14)
                android.view.View$OnClickListener r11 = (android.view.View.OnClickListener) r11
                r1.setOnClickListener(r11)
                java.lang.String r1 = r14.getTopText()
                if (r1 == 0) goto L_0x0159
                java.lang.String r1 = r14.getTopText()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0132
                r1 = 1
                goto L_0x0133
            L_0x0132:
                r1 = 0
            L_0x0133:
                if (r1 == 0) goto L_0x0136
                goto L_0x0159
            L_0x0136:
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.top_text
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
                java.lang.String r11 = r14.getTopText()
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                r1.setText(r11)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.top_text
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
                r1.setVisibility(r10)
                goto L_0x0167
            L_0x0159:
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.top_text
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
                r1.setVisibility(r3)
            L_0x0167:
                java.lang.String r1 = r14.getBottomText()
                java.lang.String r5 = "bottom_text"
                if (r1 == 0) goto L_0x01a4
                java.lang.String r1 = r14.getBottomText()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                if (r1 != 0) goto L_0x017d
                r1 = 1
                goto L_0x017e
            L_0x017d:
                r1 = 0
            L_0x017e:
                if (r1 == 0) goto L_0x0181
                goto L_0x01a4
            L_0x0181:
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.bottom_text
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
                java.lang.String r11 = r14.getBottomText()
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                r1.setText(r11)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.bottom_text
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
                r1.setVisibility(r10)
                goto L_0x01b2
            L_0x01a4:
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.bottom_text
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
                r1.setVisibility(r3)
            L_0x01b2:
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.gift_indicator
                android.view.View r1 = r0.findViewById(r1)
                java.lang.String r5 = "gift_indicator"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
                boolean r5 = r14.getShared()
                if (r5 == 0) goto L_0x01c5
                r5 = 0
                goto L_0x01c7
            L_0x01c5:
                r5 = 8
            L_0x01c7:
                r1.setVisibility(r5)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.barcode_image
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
                java.lang.String r5 = r14.getBarcodeUrl()
                if (r5 == 0) goto L_0x01dc
                r3 = 0
            L_0x01dc:
                r1.setVisibility(r3)
                java.lang.String r1 = r14.getBackImageUrl()
                java.lang.String r3 = "button_info"
                if (r1 != 0) goto L_0x020f
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.button_info
                android.view.View r1 = r0.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r1.setAlpha(r4)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.button_info
                android.view.View r1 = r0.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r1.setEnabled(r10)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.button_info
                android.view.View r1 = r0.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                r1.setOnClickListener(r9)
                goto L_0x024b
            L_0x020f:
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.button_info
                android.view.View r1 = r0.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r1.setVisibility(r10)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.button_info
                android.view.View r1 = r0.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r1.setAlpha(r6)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.button_info
                android.view.View r1 = r0.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r1.setEnabled(r2)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.button_info
                android.view.View r1 = r0.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                com.valora.kkiosk.commons.features.CouponsDelegateAdapter$TurnsViewHolder$bind$$inlined$with$lambda$3 r3 = new com.valora.kkiosk.commons.features.CouponsDelegateAdapter$TurnsViewHolder$bind$$inlined$with$lambda$3
                r3.<init>(r0, r13, r14)
                android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
                r1.setOnClickListener(r3)
            L_0x024b:
                boolean r1 = r14.isShareable()
                if (r1 == 0) goto L_0x0267
                java.lang.Boolean r1 = r14.getDummy()
                if (r1 == 0) goto L_0x0265
                java.lang.Boolean r1 = r14.getDummy()
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 == 0) goto L_0x0267
            L_0x0265:
                r1 = 1
                goto L_0x0268
            L_0x0267:
                r1 = 0
            L_0x0268:
                java.lang.String r3 = "button_share"
                if (r1 == 0) goto L_0x0289
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.button_share
                android.view.View r1 = r0.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r1.setAlpha(r6)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.button_share
                android.view.View r1 = r0.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r1.setEnabled(r2)
                goto L_0x02a5
            L_0x0289:
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.button_share
                android.view.View r1 = r0.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r1.setAlpha(r4)
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.button_share
                android.view.View r1 = r0.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r1.setEnabled(r10)
            L_0x02a5:
                java.lang.String r1 = r14.getContentUrl()
                if (r1 == 0) goto L_0x02bd
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.top_image
                android.view.View r1 = r0.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                com.valora.kkiosk.commons.features.CouponsDelegateAdapter$TurnsViewHolder$bind$$inlined$with$lambda$4 r2 = new com.valora.kkiosk.commons.features.CouponsDelegateAdapter$TurnsViewHolder$bind$$inlined$with$lambda$4
                r2.<init>(r0, r13, r14)
                android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
                r1.setOnClickListener(r2)
            L_0x02bd:
                java.lang.String r14 = r14.getBottomImageUrl()
                if (r14 == 0) goto L_0x02d3
                int r1 = com.valora.kkioskPreview.C1224R.C1226id.bottom_image
                android.view.View r0 = r0.findViewById(r1)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                java.lang.String r1 = "bottom_image"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                com.valora.kkiosk.commons.extensions.ExtensionsKt.loadImg$default(r0, r14, r9, r8, r9)
            L_0x02d3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.valora.kkiosk.commons.features.CouponsDelegateAdapter.TurnsViewHolder.bind(com.valora.kkiosk.commons.models.Coupon):void");
        }
    }

    public CouponsDelegateAdapter(@NotNull Context context2) {
        Intrinsics.checkParameterIsNotNull(context2, PlaceFields.CONTEXT);
        this.context = context2;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new TurnsViewHolder(viewGroup, this.context);
    }

    public void onBindViewHolder(@NotNull ViewHolder viewHolder, @NotNull ViewType viewType) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(viewType, "item");
        ((TurnsViewHolder) viewHolder).bind((Coupon) viewType);
    }
}
