package com.valora.kkiosk;

import android.text.Editable;
import android.text.TextWatcher;
import com.afollestad.materialdialogs.internal.MDButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\u000e"}, mo21491d2 = {"com/valora/kkiosk/MainActivity$shareCoupon$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "p0", "Landroid/text/Editable;", "beforeTextChanged", "", "p1", "", "p2", "p3", "onTextChanged", "text", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
public final class MainActivity$shareCoupon$2 implements TextWatcher {
    final /* synthetic */ MDButton $positiveAction;

    public void afterTextChanged(@Nullable Editable editable) {
    }

    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    MainActivity$shareCoupon$2(MDButton mDButton) {
        this.$positiveAction = mDButton;
    }

    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        MDButton mDButton = this.$positiveAction;
        Intrinsics.checkExpressionValueIsNotNull(mDButton, "positiveAction");
        mDButton.setEnabled(String.valueOf(charSequence).length() > 0);
    }
}
