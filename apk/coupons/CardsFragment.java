package com.valora.kkiosk.coupons;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p000v4.app.FragmentActivity;
import android.support.p000v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mutualmobile.cardstack.CardStackLayout;
import com.valora.kkiosk.MainActivity;
import com.valora.kkiosk.R;
import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import com.valora.kkiosk.commons.extensions.ExtensionsKt;
import com.valora.kkiosk.commons.extensions.Helper;
import com.valora.kkiosk.commons.extensions.RxBaseFragment;
import com.valora.kkiosk.commons.features.CouponsManager;
import com.valora.kkiosk.commons.features.FadeOutElementScrollListener;
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

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0012H\u0016J\b\u0010%\u001a\u00020\u0012H\u0002J\u0006\u0010&\u001a\u00020\u0012R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, mo21491d2 = {"Lcom/valora/kkiosk/coupons/CardsFragment;", "Lcom/valora/kkiosk/commons/extensions/RxBaseFragment;", "()V", "cardsList", "Lcom/mutualmobile/cardstack/CardStackLayout;", "kotlin.jvm.PlatformType", "getCardsList", "()Lcom/mutualmobile/cardstack/CardStackLayout;", "cardsList$delegate", "Lkotlin/Lazy;", "couponsManager", "Lcom/valora/kkiosk/commons/features/CouponsManager;", "getCouponsManager", "()Lcom/valora/kkiosk/commons/features/CouponsManager;", "couponsManager$delegate", "swipeContainer", "Landroid/support/v4/widget/SwipeRefreshLayout;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "requestCards", "updateRegisterButtonStatus", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: CardsFragment.kt */
public final class CardsFragment extends RxBaseFragment {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CardsFragment.class), "cardsList", "getCardsList()Lcom/mutualmobile/cardstack/CardStackLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CardsFragment.class), "couponsManager", "getCouponsManager()Lcom/valora/kkiosk/commons/features/CouponsManager;"))};
    private HashMap _$_findViewCache;
    private final Lazy cardsList$delegate = LazyKt.lazy(new CardsFragment$cardsList$2(this));
    private final Lazy couponsManager$delegate = LazyKt.lazy(new CardsFragment$couponsManager$2(this));
    /* access modifiers changed from: private */
    public SwipeRefreshLayout swipeContainer;

    private final CardStackLayout getCardsList() {
        Lazy lazy = this.cardsList$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (CardStackLayout) lazy.getValue();
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
        View inflate = viewGroup != null ? ExtensionsKt.inflate(viewGroup, R.layout.fragment_cards) : null;
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
            swipeRefreshLayout.setOnRefreshListener(new CardsFragment$onCreateView$1(this));
            return inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.widget.SwipeRefreshLayout");
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        if (VERSION.SDK_INT >= 23) {
            CardStackLayout cardStackLayout = (CardStackLayout) _$_findCachedViewById(C1224R.C1226id.cards_list);
            Button button = (Button) _$_findCachedViewById(C1224R.C1226id.register_button_cards);
            Intrinsics.checkExpressionValueIsNotNull(button, "register_button_cards");
            cardStackLayout.setOnScrollChangeListener(new FadeOutElementScrollListener(button));
            CardStackLayout cardsList = getCardsList();
            Intrinsics.checkExpressionValueIsNotNull(cardsList, "cardsList");
            cardsList.setCardGapBottom(12.0f);
        }
        updateRegisterButtonStatus();
        if (bundle == null) {
            SwipeRefreshLayout swipeRefreshLayout = this.swipeContainer;
            if (swipeRefreshLayout == null) {
                Intrinsics.throwNpe();
            }
            swipeRefreshLayout.setRefreshing(true);
            requestCards();
        }
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
            requestCards();
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.MainActivity");
    }

    public final void updateRegisterButtonStatus() {
        if (ApiConfig.INSTANCE.registered()) {
            Button button = (Button) _$_findCachedViewById(C1224R.C1226id.register_button_cards);
            if (button != null) {
                button.setVisibility(8);
                return;
            }
            return;
        }
        Button button2 = (Button) _$_findCachedViewById(C1224R.C1226id.register_button_cards);
        if (button2 != null) {
            button2.setVisibility(0);
        }
    }

    public void onResume() {
        super.onResume();
        requestCards();
    }

    /* access modifiers changed from: private */
    public final void requestCards() {
        getSubscriptions().add(getCouponsManager().loyaltyCards().subscribeOn(Schedulers.m217io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1<? super T>) new CardsFragment$requestCards$s$1<Object>(this), (Action1<Throwable>) new CardsFragment$requestCards$s$2<Throwable>(this)));
    }
}
