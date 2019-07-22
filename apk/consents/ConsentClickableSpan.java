package com.valora.kkiosk.consents;

import android.content.Intent;
import android.support.p000v4.app.Fragment;
import android.text.style.ClickableSpan;
import android.view.View;
import com.valora.kkiosk.SignUpFragmentKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, mo21491d2 = {"Lcom/valora/kkiosk/consents/ConsentClickableSpan;", "Landroid/text/style/ClickableSpan;", "consent", "Lcom/valora/kkiosk/consents/Consent;", "fragment", "Landroid/support/v4/app/Fragment;", "(Lcom/valora/kkiosk/consents/Consent;Landroid/support/v4/app/Fragment;)V", "getConsent", "()Lcom/valora/kkiosk/consents/Consent;", "getFragment", "()Landroid/support/v4/app/Fragment;", "onClick", "", "widget", "Landroid/view/View;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: ConsentClickableSpan.kt */
public final class ConsentClickableSpan extends ClickableSpan {
    @NotNull
    private final Consent consent;
    @NotNull
    private final Fragment fragment;

    public ConsentClickableSpan(@NotNull Consent consent2, @NotNull Fragment fragment2) {
        Intrinsics.checkParameterIsNotNull(consent2, "consent");
        Intrinsics.checkParameterIsNotNull(fragment2, "fragment");
        this.consent = consent2;
        this.fragment = fragment2;
    }

    @NotNull
    public final Consent getConsent() {
        return this.consent;
    }

    @NotNull
    public final Fragment getFragment() {
        return this.fragment;
    }

    public void onClick(@Nullable View view) {
        Intent intent = new Intent(this.fragment.getActivity(), ConsentDetailActivity.class);
        intent.putExtra(ConsentKt.EXTRA_CONSENT, this.consent);
        intent.putExtra(ConsentKt.EXTRA_HIDE_CONSENT_DENY_BUTTON, this.consent.isMasterConsent() || this.consent.isTermsOfUseConsent());
        this.fragment.startActivityForResult(intent, SignUpFragmentKt.REQUEST_CODE_CONSENT_DETAIL_ACTIVITY);
    }
}
