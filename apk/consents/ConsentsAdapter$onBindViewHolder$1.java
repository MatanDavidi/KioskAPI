package com.valora.kkiosk.consents;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.valora.kkiosk.consents.ConsentsAdapter.ConsentViewHolder;
import kotlin.Metadata;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo21491d2 = {"<anonymous>", "", "view", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: ConsentsAdapter.kt */
final class ConsentsAdapter$onBindViewHolder$1 implements OnCheckedChangeListener {
    final /* synthetic */ Consent $consent;
    final /* synthetic */ ConsentViewHolder $viewHolder;
    final /* synthetic */ ConsentsAdapter this$0;

    ConsentsAdapter$onBindViewHolder$1(ConsentsAdapter consentsAdapter, Consent consent, ConsentViewHolder consentViewHolder) {
        this.this$0 = consentsAdapter;
        this.$consent = consent;
        this.$viewHolder = consentViewHolder;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.this$0.mDataSet.approveConsent(this.$consent, this.$viewHolder.getAdapterPosition());
        } else {
            this.this$0.mDataSet.revokeConsent(this.$consent, this.$viewHolder.getAdapterPosition());
        }
    }
}
