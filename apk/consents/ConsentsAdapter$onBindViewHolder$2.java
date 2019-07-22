package com.valora.kkiosk.consents;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.valora.kkiosk.SignUpFragmentKt;
import com.valora.kkiosk.consents.ConsentsAdapter.ConsentViewHolder;
import kotlin.Metadata;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: ConsentsAdapter.kt */
final class ConsentsAdapter$onBindViewHolder$2 implements OnClickListener {
    final /* synthetic */ Consent $consent;
    final /* synthetic */ ConsentViewHolder $viewHolder;
    final /* synthetic */ ConsentsAdapter this$0;

    ConsentsAdapter$onBindViewHolder$2(ConsentsAdapter consentsAdapter, Consent consent, ConsentViewHolder consentViewHolder) {
        this.this$0 = consentsAdapter;
        this.$consent = consent;
        this.$viewHolder = consentViewHolder;
    }

    public final void onClick(View view) {
        ConsentsAdapter consentsAdapter = this.this$0;
        Intent intent = new Intent(consentsAdapter.mActivity, ConsentDetailActivity.class);
        intent.putExtra(ConsentKt.EXTRA_CONSENT, this.$consent);
        intent.putExtra(ConsentActivityKt.EXTRA_INDEX, this.$viewHolder.getAdapterPosition());
        consentsAdapter.mActivity.startActivityForResult(intent, SignUpFragmentKt.REQUEST_CODE_CONSENT_DETAIL_ACTIVITY);
    }
}
