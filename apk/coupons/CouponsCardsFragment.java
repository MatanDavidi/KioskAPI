package com.valora.kkiosk.coupons;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener;
import android.support.p000v4.app.Fragment;
import android.support.p000v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.valora.kkiosk.R;
import com.valora.kkiosk.SplashActivityKt;
import com.valora.kkiosk.commons.features.CouponsManager;
import com.valora.kkiosk.commons.models.Coupon;
import com.valora.kkiosk.consents.Consents;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Stack;
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
import p018rx.subscriptions.CompositeSubscription;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010E\u001a\u00020\u0001H\u0002J&\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u0010\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020/H\u0016J\b\u0010Q\u001a\u00020RH\u0016J\u000e\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020\u0001J\b\u0010U\u001a\u00020RH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001d\u00104\u001a\u0004\u0018\u0001058BX\u0002¢\u0006\f\n\u0004\b8\u0010\u001b\u001a\u0004\b6\u00107R\u001c\u00109\u001a\u0004\u0018\u00010:X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006V"}, mo21491d2 = {"Lcom/valora/kkiosk/coupons/CouponsCardsFragment;", "Landroid/support/v4/app/Fragment;", "Landroid/support/design/widget/BottomNavigationView$OnNavigationItemSelectedListener;", "()V", "bottomNavigationView", "Landroid/support/design/widget/BottomNavigationView;", "getBottomNavigationView", "()Landroid/support/design/widget/BottomNavigationView;", "setBottomNavigationView", "(Landroid/support/design/widget/BottomNavigationView;)V", "consents", "Lcom/valora/kkiosk/consents/Consents;", "getConsents", "()Lcom/valora/kkiosk/consents/Consents;", "setConsents", "(Lcom/valora/kkiosk/consents/Consents;)V", "couponToShare", "Lcom/valora/kkiosk/commons/models/Coupon;", "getCouponToShare", "()Lcom/valora/kkiosk/commons/models/Coupon;", "setCouponToShare", "(Lcom/valora/kkiosk/commons/models/Coupon;)V", "couponsManager", "Lcom/valora/kkiosk/commons/features/CouponsManager;", "getCouponsManager", "()Lcom/valora/kkiosk/commons/features/CouponsManager;", "couponsManager$delegate", "Lkotlin/Lazy;", "currentMenuItemId", "", "getCurrentMenuItemId", "()I", "setCurrentMenuItemId", "(I)V", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getFirebaseAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setFirebaseAnalytics", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "navigationItemStack", "Ljava/util/Stack;", "getNavigationItemStack", "()Ljava/util/Stack;", "setNavigationItemStack", "(Ljava/util/Stack;)V", "previousMenuItem", "Landroid/view/MenuItem;", "getPreviousMenuItem", "()Landroid/view/MenuItem;", "setPreviousMenuItem", "(Landroid/view/MenuItem;)V", "settings", "Landroid/content/SharedPreferences;", "getSettings", "()Landroid/content/SharedPreferences;", "settings$delegate", "sharePhoneNumberText", "Landroid/widget/EditText;", "getSharePhoneNumberText", "()Landroid/widget/EditText;", "setSharePhoneNumberText", "(Landroid/widget/EditText;)V", "subscriptions", "Lrx/subscriptions/CompositeSubscription;", "getSubscriptions", "()Lrx/subscriptions/CompositeSubscription;", "setSubscriptions", "(Lrx/subscriptions/CompositeSubscription;)V", "getCurrentFragment", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onNavigationItemSelected", "", "item", "onStart", "", "replaceFragment", "fragment", "startUI", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: CouponsCardsFragment.kt */
public final class CouponsCardsFragment extends Fragment implements OnNavigationItemSelectedListener {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CouponsCardsFragment.class), "settings", "getSettings()Landroid/content/SharedPreferences;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CouponsCardsFragment.class), "couponsManager", "getCouponsManager()Lcom/valora/kkiosk/commons/features/CouponsManager;"))};
    private HashMap _$_findViewCache;
    @NotNull
    public BottomNavigationView bottomNavigationView;
    @NotNull
    public Consents consents;
    @Nullable
    private Coupon couponToShare;
    private final Lazy couponsManager$delegate = LazyKt.lazy(new CouponsCardsFragment$couponsManager$2(this));
    private int currentMenuItemId;
    @Nullable
    private FirebaseAnalytics firebaseAnalytics;
    @NotNull
    private Stack<Integer> navigationItemStack = new Stack<>();
    @Nullable
    private MenuItem previousMenuItem;
    private final Lazy settings$delegate = LazyKt.lazy(new CouponsCardsFragment$settings$2(this));
    @Nullable
    private EditText sharePhoneNumberText;
    @NotNull
    private CompositeSubscription subscriptions = new CompositeSubscription();

    private final CouponsManager getCouponsManager() {
        Lazy lazy = this.couponsManager$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (CouponsManager) lazy.getValue();
    }

    private final SharedPreferences getSettings() {
        Lazy lazy = this.settings$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (SharedPreferences) lazy.getValue();
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
    public final FirebaseAnalytics getFirebaseAnalytics() {
        return this.firebaseAnalytics;
    }

    public final void setFirebaseAnalytics(@Nullable FirebaseAnalytics firebaseAnalytics2) {
        this.firebaseAnalytics = firebaseAnalytics2;
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        this.firebaseAnalytics = FirebaseAnalytics.getInstance(activity);
        View inflate = layoutInflater.inflate(R.layout.fragment_coupons_cards, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.fragment_coupons_cards_bottom_navigation);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.f…_cards_bottom_navigation)");
        this.bottomNavigationView = (BottomNavigationView) findViewById;
        return inflate;
    }

    public void onStart() {
        super.onStart();
        Bundle arguments = getArguments();
        if (arguments == null) {
            Intrinsics.throwNpe();
        }
        Serializable serializable = arguments.getSerializable(SplashActivityKt.EXTRA_CONSENTS);
        if (serializable != null) {
            this.consents = (Consents) serializable;
            startUI();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.consents.Consents");
    }

    public boolean onNavigationItemSelected(@NotNull MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        switch (menuItem.getItemId()) {
            case R.id.nav_cards /*2131296524*/:
                replaceFragment(new CardsFragment());
                return true;
            case R.id.nav_coupons /*2131296525*/:
                replaceFragment(new CouponsFragment());
                return true;
            default:
                return false;
        }
    }

    @NotNull
    public final Consents getConsents() {
        Consents consents2 = this.consents;
        if (consents2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consents");
        }
        return consents2;
    }

    public final void setConsents(@NotNull Consents consents2) {
        Intrinsics.checkParameterIsNotNull(consents2, "<set-?>");
        this.consents = consents2;
    }

    @NotNull
    public final BottomNavigationView getBottomNavigationView() {
        BottomNavigationView bottomNavigationView2 = this.bottomNavigationView;
        if (bottomNavigationView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomNavigationView");
        }
        return bottomNavigationView2;
    }

    public final void setBottomNavigationView(@NotNull BottomNavigationView bottomNavigationView2) {
        Intrinsics.checkParameterIsNotNull(bottomNavigationView2, "<set-?>");
        this.bottomNavigationView = bottomNavigationView2;
    }

    @Nullable
    public final Coupon getCouponToShare() {
        return this.couponToShare;
    }

    public final void setCouponToShare(@Nullable Coupon coupon) {
        this.couponToShare = coupon;
    }

    @Nullable
    public final EditText getSharePhoneNumberText() {
        return this.sharePhoneNumberText;
    }

    public final void setSharePhoneNumberText(@Nullable EditText editText) {
        this.sharePhoneNumberText = editText;
    }

    public final int getCurrentMenuItemId() {
        return this.currentMenuItemId;
    }

    public final void setCurrentMenuItemId(int i) {
        this.currentMenuItemId = i;
    }

    @Nullable
    public final MenuItem getPreviousMenuItem() {
        return this.previousMenuItem;
    }

    public final void setPreviousMenuItem(@Nullable MenuItem menuItem) {
        this.previousMenuItem = menuItem;
    }

    @NotNull
    public final Stack<Integer> getNavigationItemStack() {
        return this.navigationItemStack;
    }

    public final void setNavigationItemStack(@NotNull Stack<Integer> stack) {
        Intrinsics.checkParameterIsNotNull(stack, "<set-?>");
        this.navigationItemStack = stack;
    }

    private final Fragment getCurrentFragment() {
        Fragment findFragmentById = getChildFragmentManager().findFragmentById(R.id.fragment_coupons_cards_framelayout);
        Intrinsics.checkExpressionValueIsNotNull(findFragmentById, "childFragmentManager.fin…oupons_cards_framelayout)");
        return findFragmentById;
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

    private final void startUI() {
        BottomNavigationView bottomNavigationView2 = this.bottomNavigationView;
        String str = "bottomNavigationView";
        if (bottomNavigationView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        bottomNavigationView2.setOnNavigationItemSelectedListener(this);
        BottomNavigationView bottomNavigationView3 = this.bottomNavigationView;
        if (bottomNavigationView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        MenuItem item = bottomNavigationView3.getMenu().getItem(0);
        Intrinsics.checkExpressionValueIsNotNull(item, "bottomNavigationView.menu.getItem(0)");
        onNavigationItemSelected(item);
    }

    public final void replaceFragment(@NotNull Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        getChildFragmentManager().beginTransaction().replace(R.id.fragment_coupons_cards_framelayout, fragment).commit();
    }
}
