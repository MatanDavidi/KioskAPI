package com.valora.kkiosk.consents;

import android.app.Activity;
import android.support.p003v7.widget.RecyclerView.Adapter;
import android.support.p003v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import com.valora.kkiosk.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo21491d2 = {"Lcom/valora/kkiosk/consents/ConsentsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "consents", "Lcom/valora/kkiosk/consents/Consents;", "mActivity", "Landroid/app/Activity;", "(Lcom/valora/kkiosk/consents/Consents;Landroid/app/Activity;)V", "mDataSet", "getItemCount", "", "getItemViewType", "position", "getmDataSet", "onBindViewHolder", "", "_viewHolder", "p", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "setmDataSet", "ConsentViewHolder", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: ConsentsAdapter.kt */
public final class ConsentsAdapter extends Adapter<ViewHolder> {
    /* access modifiers changed from: private */
    public Activity mActivity;
    /* access modifiers changed from: private */
    public Consents mDataSet;

    @Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, mo21491d2 = {"Lcom/valora/kkiosk/consents/ConsentsAdapter$ConsentViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "acceptCheckBox", "Landroid/widget/Switch;", "getAcceptCheckBox$app_release", "()Landroid/widget/Switch;", "setAcceptCheckBox$app_release", "(Landroid/widget/Switch;)V", "mandatoryTextView", "Landroid/widget/TextView;", "getMandatoryTextView$app_release", "()Landroid/widget/TextView;", "setMandatoryTextView$app_release", "(Landroid/widget/TextView;)V", "titleTextView", "getTitleTextView$app_release", "setTitleTextView$app_release", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
    /* compiled from: ConsentsAdapter.kt */
    public static final class ConsentViewHolder extends ViewHolder {
        @NotNull
        private Switch acceptCheckBox;
        @NotNull
        private TextView mandatoryTextView;
        @NotNull
        private TextView titleTextView;

        public ConsentViewHolder(@NotNull View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            super(view);
            View findViewById = view.findViewById(R.id.consent_recycler_item_txt_title);
            String str = "null cannot be cast to non-null type android.widget.TextView";
            if (findViewById != null) {
                this.titleTextView = (TextView) findViewById;
                View findViewById2 = view.findViewById(R.id.consent_recycler_item_txt_mandatory);
                if (findViewById2 != null) {
                    this.mandatoryTextView = (TextView) findViewById2;
                    View findViewById3 = view.findViewById(R.id.consent_Recycler_item_chk_accept);
                    if (findViewById3 != null) {
                        this.acceptCheckBox = (Switch) findViewById3;
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.Switch");
                }
                throw new TypeCastException(str);
            }
            throw new TypeCastException(str);
        }

        @NotNull
        public final TextView getTitleTextView$app_release() {
            return this.titleTextView;
        }

        public final void setTitleTextView$app_release(@NotNull TextView textView) {
            Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
            this.titleTextView = textView;
        }

        @NotNull
        public final TextView getMandatoryTextView$app_release() {
            return this.mandatoryTextView;
        }

        public final void setMandatoryTextView$app_release(@NotNull TextView textView) {
            Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
            this.mandatoryTextView = textView;
        }

        @NotNull
        public final Switch getAcceptCheckBox$app_release() {
            return this.acceptCheckBox;
        }

        public final void setAcceptCheckBox$app_release(@NotNull Switch switchR) {
            Intrinsics.checkParameterIsNotNull(switchR, "<set-?>");
            this.acceptCheckBox = switchR;
        }
    }

    public int getItemViewType(int i) {
        return i;
    }

    public ConsentsAdapter(@NotNull Consents consents, @NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(consents, "consents");
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        this.mActivity = activity;
        this.mDataSet = consents;
    }

    public final void setmDataSet(@NotNull Consents consents) {
        Intrinsics.checkParameterIsNotNull(consents, "mDataSet");
        this.mDataSet = consents;
    }

    @Nullable
    public final Consents getmDataSet() {
        return this.mDataSet;
    }

    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.consent_recycler_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(view…r_item, viewGroup, false)");
        return new ConsentViewHolder(inflate);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0092, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onBindViewHolder(@org.jetbrains.annotations.NotNull android.support.p003v7.widget.RecyclerView.ViewHolder r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r5 = "_viewHolder"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r5)     // Catch:{ all -> 0x0093 }
            boolean r5 = r4 instanceof com.valora.kkiosk.consents.ConsentsAdapter.ConsentViewHolder     // Catch:{ all -> 0x0093 }
            if (r5 == 0) goto L_0x0091
            com.valora.kkiosk.consents.ConsentsAdapter$ConsentViewHolder r4 = (com.valora.kkiosk.consents.ConsentsAdapter.ConsentViewHolder) r4     // Catch:{ all -> 0x0093 }
            com.valora.kkiosk.consents.Consents r5 = r3.mDataSet     // Catch:{ all -> 0x0093 }
            java.util.ArrayList r5 = r5.getAllConsentsWithoutMaster()     // Catch:{ all -> 0x0093 }
            int r0 = r4.getAdapterPosition()     // Catch:{ all -> 0x0093 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = "mDataSet.getAllConsentsW…ewHolder.adapterPosition]"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r0)     // Catch:{ all -> 0x0093 }
            com.valora.kkiosk.consents.Consent r5 = (com.valora.kkiosk.consents.Consent) r5     // Catch:{ all -> 0x0093 }
            android.widget.Switch r0 = r4.getAcceptCheckBox$app_release()     // Catch:{ all -> 0x0093 }
            boolean r1 = r5.isConsentGiven()     // Catch:{ all -> 0x0093 }
            r0.setChecked(r1)     // Catch:{ all -> 0x0093 }
            android.widget.TextView r0 = r4.getMandatoryTextView$app_release()     // Catch:{ all -> 0x0093 }
            boolean r1 = r5.getMandatory()     // Catch:{ all -> 0x0093 }
            r2 = 0
            if (r1 == 0) goto L_0x0039
            r1 = 0
            goto L_0x003a
        L_0x0039:
            r1 = 4
        L_0x003a:
            r0.setVisibility(r1)     // Catch:{ all -> 0x0093 }
            android.widget.TextView r0 = r4.getTitleTextView$app_release()     // Catch:{ all -> 0x0093 }
            com.valora.kkiosk.consents.ConsentVersion r1 = r5.getCurrentVersion()     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = r1.getTitle()     // Catch:{ all -> 0x0093 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0093 }
            r0.setText(r1)     // Catch:{ all -> 0x0093 }
            android.widget.Switch r0 = r4.getAcceptCheckBox$app_release()     // Catch:{ all -> 0x0093 }
            boolean r1 = r5.isConsentGiven()     // Catch:{ all -> 0x0093 }
            r0.setChecked(r1)     // Catch:{ all -> 0x0093 }
            boolean r0 = r5.isMasterConsent()     // Catch:{ all -> 0x0093 }
            if (r0 != 0) goto L_0x0081
            boolean r0 = r5.isTermsOfUseConsent()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0066
            goto L_0x0081
        L_0x0066:
            android.widget.Switch r0 = r4.getAcceptCheckBox$app_release()     // Catch:{ all -> 0x0093 }
            com.valora.kkiosk.consents.ConsentsAdapter$onBindViewHolder$1 r1 = new com.valora.kkiosk.consents.ConsentsAdapter$onBindViewHolder$1     // Catch:{ all -> 0x0093 }
            r1.<init>(r3, r5, r4)     // Catch:{ all -> 0x0093 }
            android.widget.CompoundButton$OnCheckedChangeListener r1 = (android.widget.CompoundButton.OnCheckedChangeListener) r1     // Catch:{ all -> 0x0093 }
            r0.setOnCheckedChangeListener(r1)     // Catch:{ all -> 0x0093 }
            android.view.View r0 = r4.itemView     // Catch:{ all -> 0x0093 }
            com.valora.kkiosk.consents.ConsentsAdapter$onBindViewHolder$2 r1 = new com.valora.kkiosk.consents.ConsentsAdapter$onBindViewHolder$2     // Catch:{ all -> 0x0093 }
            r1.<init>(r3, r5, r4)     // Catch:{ all -> 0x0093 }
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1     // Catch:{ all -> 0x0093 }
            r0.setOnClickListener(r1)     // Catch:{ all -> 0x0093 }
            goto L_0x0091
        L_0x0081:
            android.widget.Switch r5 = r4.getAcceptCheckBox$app_release()     // Catch:{ all -> 0x0093 }
            r5.setEnabled(r2)     // Catch:{ all -> 0x0093 }
            android.widget.TextView r4 = r4.getTitleTextView$app_release()     // Catch:{ all -> 0x0093 }
            r4.setEnabled(r2)     // Catch:{ all -> 0x0093 }
            monitor-exit(r3)
            return
        L_0x0091:
            monitor-exit(r3)
            return
        L_0x0093:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valora.kkiosk.consents.ConsentsAdapter.onBindViewHolder(android.support.v7.widget.RecyclerView$ViewHolder, int):void");
    }

    public int getItemCount() {
        return this.mDataSet.getAllConsentsWithoutMaster().size();
    }
}
