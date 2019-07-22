package com.valora.kkiosk.coupons;

import android.os.Bundle;
import android.support.p000v4.app.FragmentActivity;
import android.support.p000v4.widget.SwipeRefreshLayout;
import android.support.p003v7.widget.LinearLayoutManager;
import android.support.p003v7.widget.PagerSnapHelper;
import android.support.p003v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.valora.kkiosk.MainActivity;
import com.valora.kkiosk.R;
import com.valora.kkiosk.commons.adapters.AdapterConstants;
import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import com.valora.kkiosk.commons.extensions.ExtensionsKt;
import com.valora.kkiosk.commons.extensions.Helper;
import com.valora.kkiosk.commons.extensions.RxBaseFragment;
import com.valora.kkiosk.commons.features.CouponsAdapter;
import com.valora.kkiosk.commons.features.CouponsManager;
import com.valora.kkioskPreview.C1224R;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018rx.android.schedulers.AndroidSchedulers;
import p018rx.functions.Action1;
import p018rx.schedulers.Schedulers;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u0014H\u0016J\u0006\u0010(\u001a\u00020\u0014J\b\u0010)\u001a\u00020\u0014H\u0002J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u001fH\u0002R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, mo21491d2 = {"Lcom/valora/kkiosk/coupons/CouponsFragment;", "Lcom/valora/kkiosk/commons/extensions/RxBaseFragment;", "()V", "couponsList", "Landroid/support/v7/widget/RecyclerView;", "kotlin.jvm.PlatformType", "getCouponsList", "()Landroid/support/v7/widget/RecyclerView;", "couponsList$delegate", "Lkotlin/Lazy;", "couponsManager", "Lcom/valora/kkiosk/commons/features/CouponsManager;", "getCouponsManager", "()Lcom/valora/kkiosk/commons/features/CouponsManager;", "couponsManager$delegate", "registerButton", "Landroid/widget/Button;", "swipeContainer", "Landroid/support/v4/widget/SwipeRefreshLayout;", "initAdapter", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "reloadView", "requestCoupons", "updateRegisterButtonStatus", "view", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: CouponsFragment.kt */
public final class CouponsFragment extends RxBaseFragment {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CouponsFragment.class), "couponsList", "getCouponsList()Landroid/support/v7/widget/RecyclerView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CouponsFragment.class), "couponsManager", "getCouponsManager()Lcom/valora/kkiosk/commons/features/CouponsManager;"))};
    private HashMap _$_findViewCache;
    private final Lazy couponsList$delegate = LazyKt.lazy(new CouponsFragment$couponsList$2(this));
    private final Lazy couponsManager$delegate = LazyKt.lazy(new CouponsFragment$couponsManager$2(this));
    private Button registerButton;
    /* access modifiers changed from: private */
    public SwipeRefreshLayout swipeContainer;

    private final RecyclerView getCouponsList() {
        Lazy lazy = this.couponsList$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (RecyclerView) lazy.getValue();
    }

    private final CouponsManager getCouponsManager() {
        Lazy lazy = this.couponsManager$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (CouponsManager) lazy.getValue();
    }

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

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = viewGroup != null ? ExtensionsKt.inflate(viewGroup, R.layout.fragment_coupons) : null;
        if (inflate == null) {
            Intrinsics.throwNpe();
        }
        View findViewById = inflate.findViewById(R.id.swipe_container);
        if (findViewById != null) {
            this.swipeContainer = (SwipeRefreshLayout) findViewById;
            SwipeRefreshLayout swipeRefreshLayout = this.swipeContainer;
            if (swipeRefreshLayout == null) {
                Intrinsics.throwNpe();
            }
            swipeRefreshLayout.setOnRefreshListener(new CouponsFragment$onCreateView$1(this));
            View findViewById2 = inflate.findViewById(R.id.register_button_coupons);
            if (findViewById2 != null) {
                this.registerButton = (Button) findViewById2;
                updateRegisterButtonStatus(inflate);
                return inflate;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.Button");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.widget.SwipeRefreshLayout");
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(@Nullable Menu menu, @Nullable MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (menuInflater == null) {
            Intrinsics.throwNpe();
        }
        menuInflater.inflate(R.menu.activity_main_menu, menu);
    }

    public boolean onOptionsItemSelected(@Nullable MenuItem menuItem) {
        if (menuItem == null) {
            Intrinsics.throwNpe();
        }
        if (menuItem.getItemId() != R.id.menu_refresh) {
            return super.onOptionsItemSelected(menuItem);
        }
        Helper helper = Helper.INSTANCE;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            FirebaseAnalytics firebaseAnalytics = ((MainActivity) activity).getFirebaseAnalytics();
            if (firebaseAnalytics == null) {
                Intrinsics.throwNpe();
            }
            helper.logEvent(firebaseAnalytics, "ui_action", "button_press", "refresh");
            SwipeRefreshLayout swipeRefreshLayout = this.swipeContainer;
            if (swipeRefreshLayout == null) {
                Intrinsics.throwNpe();
            }
            swipeRefreshLayout.setRefreshing(true);
            requestCoupons();
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.MainActivity");
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        ((RecyclerView) _$_findCachedViewById(C1224R.C1226id.coupons_list)).setHasFixedSize(true);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1224R.C1226id.coupons_list);
        String str = "coupons_list";
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, str);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        new PagerSnapHelper().attachToRecyclerView((RecyclerView) _$_findCachedViewById(C1224R.C1226id.coupons_list));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1224R.C1226id.coupons_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, str);
        recyclerView2.getRecycledViewPool().setMaxRecycledViews(AdapterConstants.INSTANCE.getCOUPON(), 0);
        initAdapter();
        if (bundle == null) {
            SwipeRefreshLayout swipeRefreshLayout = this.swipeContainer;
            if (swipeRefreshLayout == null) {
                Intrinsics.throwNpe();
            }
            swipeRefreshLayout.setRefreshing(true);
            requestCoupons();
        }
    }

    public void onResume() {
        super.onResume();
        View view = getView();
        if (view == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(view, "view!!");
        updateRegisterButtonStatus(view);
        reloadView();
    }

    public final void reloadView() {
        requestCoupons();
    }

    private final void updateRegisterButtonStatus(View view) {
        if (ApiConfig.INSTANCE.registered()) {
            Button button = this.registerButton;
            if (button != null) {
                button.setVisibility(8);
                return;
            }
            return;
        }
        Button button2 = this.registerButton;
        if (button2 != null) {
            button2.setVisibility(0);
        }
    }

    private final void initAdapter() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1224R.C1226id.coupons_list);
        String str = "coupons_list";
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, str);
        if (recyclerView.getAdapter() == null) {
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1224R.C1226id.coupons_list);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, str);
            FragmentActivity activity = getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
            recyclerView2.setAdapter(new CouponsAdapter(activity));
        }
    }

    /* access modifiers changed from: private */
    public final void requestCoupons() {
        getSubscriptions().add(getCouponsManager().coupons().subscribeOn(Schedulers.m217io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1<? super T>) new CouponsFragment$requestCoupons$s$1<Object>(this), (Action1<Throwable>) new CouponsFragment$requestCoupons$s$2<Throwable>(this)));
    }
}
