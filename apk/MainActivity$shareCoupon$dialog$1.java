package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.widget.EditText;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.MaterialDialog.SingleButtonCallback;
import com.valora.kkiosk.commons.extensions.Helper;
import com.valora.kkiosk.commons.features.CouponsManager;
import com.valora.kkiosk.commons.models.Coupon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import p018rx.android.schedulers.AndroidSchedulers;
import p018rx.functions.Action1;
import p018rx.schedulers.Schedulers;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo21491d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/afollestad/materialdialogs/MaterialDialog;", "<anonymous parameter 1>", "Lcom/afollestad/materialdialogs/DialogAction;", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
final class MainActivity$shareCoupon$dialog$1 implements SingleButtonCallback {
    final /* synthetic */ Coupon $coupon;
    final /* synthetic */ MainActivity this$0;

    MainActivity$shareCoupon$dialog$1(MainActivity mainActivity, Coupon coupon) {
        this.this$0 = mainActivity;
        this.$coupon = coupon;
    }

    public final void onClick(@NotNull MaterialDialog materialDialog, @NotNull DialogAction dialogAction) {
        Intrinsics.checkParameterIsNotNull(materialDialog, "<anonymous parameter 0>");
        Intrinsics.checkParameterIsNotNull(dialogAction, "<anonymous parameter 1>");
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = new ProgressDialog(this.this$0);
        ((ProgressDialog) objectRef.element).setMessage(this.this$0.getResources().getString(R.string.verschenken));
        ((ProgressDialog) objectRef.element).show();
        Helper helper = Helper.INSTANCE;
        EditText sharePhoneNumberText = this.this$0.getSharePhoneNumberText();
        if (sharePhoneNumberText == null) {
            Intrinsics.throwNpe();
        }
        String sanitizeMSN = helper.sanitizeMSN(new Regex("[^\\d+]").replace(sharePhoneNumberText.getText().toString(), ""));
        CouponsManager access$getCouponsManager$p = this.this$0.getCouponsManager();
        Coupon couponToShare = this.this$0.getCouponToShare();
        if (couponToShare == null) {
            Intrinsics.throwNpe();
        }
        this.this$0.getSubscriptions().add(access$getCouponsManager$p.share(couponToShare, sanitizeMSN).subscribeOn(Schedulers.m217io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1<? super T>) new MainActivity$shareCoupon$dialog$1$s$1<Object>(this, objectRef, sanitizeMSN), (Action1<Throwable>) new MainActivity$shareCoupon$dialog$1$s$2<Throwable>(this, objectRef)));
    }
}
