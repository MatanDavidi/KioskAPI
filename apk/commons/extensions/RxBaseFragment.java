package com.valora.kkiosk.commons.extensions;

import android.support.p000v4.app.Fragment;
import android.view.View;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p018rx.subscriptions.CompositeSubscription;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/extensions/RxBaseFragment;", "Landroid/support/v4/app/Fragment;", "()V", "subscriptions", "Lrx/subscriptions/CompositeSubscription;", "getSubscriptions", "()Lrx/subscriptions/CompositeSubscription;", "setSubscriptions", "(Lrx/subscriptions/CompositeSubscription;)V", "onPause", "", "onResume", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: RxBaseFragment.kt */
public class RxBaseFragment extends Fragment {
    private HashMap _$_findViewCache;
    @NotNull
    private CompositeSubscription subscriptions = new CompositeSubscription();

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final CompositeSubscription getSubscriptions() {
        return this.subscriptions;
    }

    /* access modifiers changed from: protected */
    public final void setSubscriptions(@NotNull CompositeSubscription compositeSubscription) {
        Intrinsics.checkParameterIsNotNull(compositeSubscription, "<set-?>");
        this.subscriptions = compositeSubscription;
    }

    public void onResume() {
        super.onResume();
        this.subscriptions = new CompositeSubscription();
    }

    public void onPause() {
        super.onPause();
        if (!this.subscriptions.isUnsubscribed()) {
            this.subscriptions.unsubscribe();
        }
        this.subscriptions.clear();
    }
}
