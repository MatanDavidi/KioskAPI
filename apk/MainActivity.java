package com.valora.kkiosk;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.p000v4.app.Fragment;
import android.support.p000v4.app.FragmentManager;
import android.support.p000v4.app.FragmentTransaction;
import android.support.p000v4.view.GravityCompat;
import android.support.p000v4.widget.DrawerLayout;
import android.support.p003v7.app.ActionBar;
import android.support.p003v7.app.AppCompatActivity;
import android.support.p003v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.MaterialDialog.Builder;
import com.afollestad.materialdialogs.internal.MDButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import com.valora.kkiosk.commons.api.RestApi;
import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import com.valora.kkiosk.commons.extensions.ExtensionsKt;
import com.valora.kkiosk.commons.extensions.Helper;
import com.valora.kkiosk.commons.features.CouponsManager;
import com.valora.kkiosk.commons.models.Coupon;
import com.valora.kkiosk.consents.ConsentCallbacks;
import com.valora.kkiosk.consents.Consents;
import com.valora.kkiosk.coupons.CouponsCardsFragment;
import com.valora.kkioskPreview.C1224R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.hockeyapp.android.CrashManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p007io.branch.referral.Branch;
import p007io.branch.referral.Branch.BranchUniversalReferralInitListener;
import p018rx.subscriptions.CompositeSubscription;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010R\u001a\u00020SH\u0002J\u0018\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u001cH\u0002J\b\u0010X\u001a\u00020VH\u0002J\b\u0010Y\u001a\u00020ZH\u0002J\u000e\u0010[\u001a\u00020S2\u0006\u0010U\u001a\u00020VJ\"\u0010\\\u001a\u00020S2\u0006\u0010]\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020\u001c2\b\u0010_\u001a\u0004\u0018\u00010ZH\u0014J\b\u0010`\u001a\u00020SH\u0016J\u0010\u0010a\u001a\u00020S2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010b\u001a\u00020S2\b\u0010c\u001a\u0004\u0018\u00010dH\u0014J\u0010\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020hH\u0016J\u0010\u0010i\u001a\u00020S2\u0006\u0010j\u001a\u00020ZH\u0016J\u0010\u0010k\u001a\u00020f2\u0006\u0010l\u001a\u000206H\u0016J\b\u0010m\u001a\u00020SH\u0014J\b\u0010n\u001a\u00020SH\u0016J\u000e\u0010o\u001a\u00020S2\u0006\u0010p\u001a\u00020qJ\"\u0010r\u001a\u00020S2\u0006\u0010s\u001a\u00020\u00172\u0006\u0010t\u001a\u00020\u001c2\b\b\u0002\u0010u\u001a\u00020fH\u0002J\u0010\u0010v\u001a\u00020S2\u0006\u0010w\u001a\u00020VH\u0002J\u000e\u0010x\u001a\u00020S2\u0006\u0010y\u001a\u00020\u000bJ\b\u0010z\u001a\u00020SH\u0002J\b\u0010{\u001a\u00020SH\u0002J\b\u0010|\u001a\u00020SH\u0002J\b\u0010}\u001a\u00020SH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020*X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00105\u001a\u0004\u0018\u000106X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R#\u0010;\u001a\n \u0018*\u0004\u0018\u00010<0<8BX\u0002¢\u0006\f\n\u0004\b?\u0010\u0015\u001a\u0004\b=\u0010>R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010L\u001a\u0004\u0018\u00010MX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006~"}, mo21491d2 = {"Lcom/valora/kkiosk/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/valora/kkiosk/consents/ConsentCallbacks;", "()V", "consents", "Lcom/valora/kkiosk/consents/Consents;", "getConsents", "()Lcom/valora/kkiosk/consents/Consents;", "setConsents", "(Lcom/valora/kkiosk/consents/Consents;)V", "couponToShare", "Lcom/valora/kkiosk/commons/models/Coupon;", "getCouponToShare", "()Lcom/valora/kkiosk/commons/models/Coupon;", "setCouponToShare", "(Lcom/valora/kkiosk/commons/models/Coupon;)V", "couponsManager", "Lcom/valora/kkiosk/commons/features/CouponsManager;", "getCouponsManager", "()Lcom/valora/kkiosk/commons/features/CouponsManager;", "couponsManager$delegate", "Lkotlin/Lazy;", "currentFragment", "Landroid/support/v4/app/Fragment;", "kotlin.jvm.PlatformType", "getCurrentFragment", "()Landroid/support/v4/app/Fragment;", "currentMenuItemId", "", "getCurrentMenuItemId", "()I", "setCurrentMenuItemId", "(I)V", "drawerItemSelectedCallback", "Landroid/support/design/widget/NavigationView$OnNavigationItemSelectedListener;", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getFirebaseAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setFirebaseAnalytics", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "mDrawerLayout", "Landroid/support/v4/widget/DrawerLayout;", "getMDrawerLayout", "()Landroid/support/v4/widget/DrawerLayout;", "setMDrawerLayout", "(Landroid/support/v4/widget/DrawerLayout;)V", "navigationView", "Landroid/support/design/widget/NavigationView;", "getNavigationView", "()Landroid/support/design/widget/NavigationView;", "setNavigationView", "(Landroid/support/design/widget/NavigationView;)V", "previousMenuItem", "Landroid/view/MenuItem;", "getPreviousMenuItem", "()Landroid/view/MenuItem;", "setPreviousMenuItem", "(Landroid/view/MenuItem;)V", "settings", "Landroid/content/SharedPreferences;", "getSettings", "()Landroid/content/SharedPreferences;", "settings$delegate", "sharePhoneNumberText", "Landroid/widget/EditText;", "getSharePhoneNumberText", "()Landroid/widget/EditText;", "setSharePhoneNumberText", "(Landroid/widget/EditText;)V", "subscriptions", "Lrx/subscriptions/CompositeSubscription;", "getSubscriptions", "()Lrx/subscriptions/CompositeSubscription;", "setSubscriptions", "(Lrx/subscriptions/CompositeSubscription;)V", "toolbar", "Landroid/support/v7/widget/Toolbar;", "getToolbar", "()Landroid/support/v7/widget/Toolbar;", "setToolbar", "(Landroid/support/v7/widget/Toolbar;)V", "checkForCrashes", "", "displayWebViewFragment", "url", "", "itemId", "getDeviceName", "getRegistrationActivityIntent", "Landroid/content/Intent;", "launchWebViewActivity", "onActivityResult", "requestCode", "resultCode", "data", "onBackPressed", "onConsentsChanged", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onNewIntent", "intent", "onOptionsItemSelected", "item", "onPause", "onStart", "registerPressed", "view", "Landroid/view/View;", "replaceFragment", "fragment", "menuItemId", "isRootItem", "setToolbarText", "text", "shareCoupon", "coupon", "showPushConsentDialog", "startUI", "updateDrawerForSignInState", "updateNavigation", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
public final class MainActivity extends AppCompatActivity implements ConsentCallbacks {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MainActivity.class), "settings", "getSettings()Landroid/content/SharedPreferences;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MainActivity.class), "couponsManager", "getCouponsManager()Lcom/valora/kkiosk/commons/features/CouponsManager;"))};
    private HashMap _$_findViewCache;
    @NotNull
    public Consents consents;
    @Nullable
    private Coupon couponToShare;
    private final Lazy couponsManager$delegate = LazyKt.lazy(new MainActivity$couponsManager$2(this));
    private int currentMenuItemId;
    private final OnNavigationItemSelectedListener drawerItemSelectedCallback = new MainActivity$drawerItemSelectedCallback$1(this);
    @Nullable
    private FirebaseAnalytics firebaseAnalytics;
    @NotNull
    public DrawerLayout mDrawerLayout;
    @NotNull
    public NavigationView navigationView;
    @Nullable
    private MenuItem previousMenuItem;
    private final Lazy settings$delegate = LazyKt.lazy(new MainActivity$settings$2(this));
    @Nullable
    private EditText sharePhoneNumberText;
    @NotNull
    private CompositeSubscription subscriptions = new CompositeSubscription();
    @Nullable
    private Toolbar toolbar;

    /* access modifiers changed from: private */
    public final CouponsManager getCouponsManager() {
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
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
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

    @Nullable
    public final Toolbar getToolbar() {
        return this.toolbar;
    }

    public final void setToolbar(@Nullable Toolbar toolbar2) {
        this.toolbar = toolbar2;
    }

    @NotNull
    public final DrawerLayout getMDrawerLayout() {
        DrawerLayout drawerLayout = this.mDrawerLayout;
        if (drawerLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDrawerLayout");
        }
        return drawerLayout;
    }

    public final void setMDrawerLayout(@NotNull DrawerLayout drawerLayout) {
        Intrinsics.checkParameterIsNotNull(drawerLayout, "<set-?>");
        this.mDrawerLayout = drawerLayout;
    }

    @NotNull
    public final NavigationView getNavigationView() {
        NavigationView navigationView2 = this.navigationView;
        if (navigationView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationView");
        }
        return navigationView2;
    }

    public final void setNavigationView(@NotNull NavigationView navigationView2) {
        Intrinsics.checkParameterIsNotNull(navigationView2, "<set-?>");
        this.navigationView = navigationView2;
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

    @Nullable
    public final FirebaseAnalytics getFirebaseAnalytics() {
        return this.firebaseAnalytics;
    }

    public final void setFirebaseAnalytics(@Nullable FirebaseAnalytics firebaseAnalytics2) {
        this.firebaseAnalytics = firebaseAnalytics2;
    }

    public final Fragment getCurrentFragment() {
        View view;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        List fragments = supportFragmentManager.getFragments();
        Intrinsics.checkExpressionValueIsNotNull(fragments, "supportFragmentManager.fragments");
        Iterable iterable = fragments;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            Fragment fragment = (Fragment) next;
            if (fragment != null) {
                view = fragment.getView();
            } else {
                view = null;
            }
            if (view != null) {
                arrayList.add(next);
            }
        }
        return (Fragment) CollectionsKt.last((List) arrayList);
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

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        this.toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(this.toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        String str = "";
        if (supportActionBar != null) {
            supportActionBar.setTitle((CharSequence) str);
        }
        Intent intent = getIntent();
        String str2 = SplashActivityKt.EXTRA_CONSENTS;
        if (intent.hasExtra(str2)) {
            Serializable serializableExtra = getIntent().getSerializableExtra(str2);
            if (serializableExtra != null) {
                this.consents = (Consents) serializableExtra;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.consents.Consents");
            }
        } else if (ApiConfig.INSTANCE.registered()) {
            new RestApi().getUser().enqueue(new MainActivity$onCreate$1(this));
        }
        this.subscriptions = new CompositeSubscription();
        checkForCrashes();
        ApiConfig apiConfig = ApiConfig.INSTANCE;
        String string = getSettings().getString(SplashActivityKt.PREF_USER_ID, str);
        if (string == null) {
            Intrinsics.throwNpe();
        }
        apiConfig.setUserId(string);
        ApiConfig apiConfig2 = ApiConfig.INSTANCE;
        String string2 = getSettings().getString(SplashActivityKt.PREF_MSN, str);
        if (string2 == null) {
            Intrinsics.throwNpe();
        }
        apiConfig2.setMsn(string2);
        ApiConfig apiConfig3 = ApiConfig.INSTANCE;
        String string3 = getSettings().getString(SplashActivityKt.PREF_USER_NAME, str);
        if (string3 == null) {
            Intrinsics.throwNpe();
        }
        apiConfig3.setUserName(string3);
        String str3 = "FIRST_TIME";
        if (getSettings().getBoolean(str3, true)) {
            getSettings().edit().putBoolean(str3, false).apply();
            startActivity(new Intent(this, IntroActivity.class));
        }
        startUI();
    }

    private final void startUI() {
        if (ApiConfig.INSTANCE.registered()) {
            new RestApi().getUser().enqueue(new MainActivity$startUI$1(this));
        }
        this.firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setHomeAsUpIndicator((int) R.drawable.baseline_menu_white_24);
        }
        getSupportFragmentManager().addOnBackStackChangedListener(new MainActivity$startUI$3(this));
        View findViewById = findViewById(R.id.drawer_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById<DrawerLayout>(R.id.drawer_layout)");
        this.mDrawerLayout = (DrawerLayout) findViewById;
        View findViewById2 = findViewById(R.id.nav_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.nav_view)");
        this.navigationView = (NavigationView) findViewById2;
        NavigationView navigationView2 = this.navigationView;
        String str = "navigationView";
        if (navigationView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        navigationView2.setNavigationItemSelectedListener(this.drawerItemSelectedCallback);
        NavigationView navigationView3 = this.navigationView;
        if (navigationView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        navigationView3.setItemIconTintList(new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}, new int[]{-16842912}, new int[]{16842919}}, ArraysKt.toIntArray(new Integer[]{Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1)})));
        NavigationView navigationView4 = this.navigationView;
        if (navigationView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        this.drawerItemSelectedCallback.onNavigationItemSelected(navigationView4.getMenu().findItem(R.id.nav_coupons));
        updateDrawerForSignInState();
    }

    private final void updateDrawerForSignInState() {
        NavigationView navigationView2 = this.navigationView;
        if (navigationView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationView");
        }
        MenuItem findItem = navigationView2.getMenu().findItem(R.id.nav_profile);
        boolean registered = ApiConfig.INSTANCE.registered();
        Intrinsics.checkExpressionValueIsNotNull(findItem, "profileItem");
        findItem.setVisible(registered);
        if (registered && !getPreferences(0).getBoolean(MainActivityKt.SETTINGS_KEY_PUSH_CONSENT_GIVEN, false)) {
            showPushConsentDialog();
        }
    }

    private final void showPushConsentDialog() {
        Dialog dialog = new Dialog(this);
        View inflate = getLayoutInflater().inflate(R.layout.dialog_push_consent_explanation, null, false);
        dialog.setContentView(inflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        ((Button) inflate.findViewById(R.id.dialog_push_consent_button_accept)).setOnClickListener(new MainActivity$showPushConsentDialog$1(this, dialog));
        ((Button) inflate.findViewById(R.id.dialog_push_consent_button_deny)).setOnClickListener(new MainActivity$showPushConsentDialog$2(this, dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public final void updateNavigation() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        List fragments = supportFragmentManager.getFragments();
        if (!fragments.isEmpty()) {
            Fragment fragment = (Fragment) fragments.get(fragments.size() - 1);
            if (!(fragment == null || fragment.getArguments() == null)) {
                Bundle arguments = fragment.getArguments();
                if (arguments == null) {
                    Intrinsics.throwNpe();
                }
                int i = arguments.getInt(MainActivityKt.EXTRA_FRAGMENT_MENU_ITEM_ID);
                if (i != this.currentMenuItemId) {
                    NavigationView navigationView2 = this.navigationView;
                    if (navigationView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("navigationView");
                    }
                    this.drawerItemSelectedCallback.onNavigationItemSelected(navigationView2.getMenu().findItem(i));
                }
            }
        }
    }

    public void onStart() {
        super.onStart();
        Branch instance = Branch.getInstance();
        BranchUniversalReferralInitListener branchUniversalReferralInitListener = MainActivity$onStart$1.INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "this.intent");
        instance.initSession(branchUniversalReferralInitListener, intent.getData(), (Activity) this);
    }

    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.subscriptions.isUnsubscribed();
        this.subscriptions.clear();
    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkParameterIsNotNull(menu, "menu");
        String str = "";
        if (!getSettings().getString(SplashActivityKt.PREF_USER_ID, str).equals(str)) {
            getMenuInflater().inflate(R.menu.main, menu);
        }
        return true;
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        DrawerLayout drawerLayout = this.mDrawerLayout;
        if (drawerLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDrawerLayout");
        }
        drawerLayout.openDrawer((int) GravityCompat.START);
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0105, code lost:
        if (r11 != null) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0107, code lost:
        r11.setText(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b0, code lost:
        if (r11 != null) goto L_0x0107;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r11, int r12, @org.jetbrains.annotations.Nullable android.content.Intent r13) {
        /*
            r10 = this;
            java.lang.String r0 = "Choose a number"
            super.onActivityResult(r11, r12, r13)
            r1 = -1
            if (r12 != r1) goto L_0x01b4
            if (r13 == 0) goto L_0x01b4
            java.lang.String r12 = "extra_consents"
            boolean r1 = r13.hasExtra(r12)
            if (r1 == 0) goto L_0x0026
            java.io.Serializable r12 = r13.getSerializableExtra(r12)
            if (r12 == 0) goto L_0x001e
            com.valora.kkiosk.consents.Consents r12 = (com.valora.kkiosk.consents.Consents) r12
            r10.onConsentsChanged(r12)
            goto L_0x0026
        L_0x001e:
            kotlin.TypeCastException r11 = new kotlin.TypeCastException
            java.lang.String r12 = "null cannot be cast to non-null type com.valora.kkiosk.consents.Consents"
            r11.<init>(r12)
            throw r11
        L_0x0026:
            r12 = 2015(0x7df, float:2.824E-42)
            if (r11 == r12) goto L_0x005b
            r12 = 2016(0x7e0, float:2.825E-42)
            if (r11 == r12) goto L_0x0030
            goto L_0x01b4
        L_0x0030:
            java.lang.String r11 = "userId"
            java.lang.String r12 = r13.getStringExtra(r11)
            java.lang.String r0 = "userName"
            java.lang.String r1 = r13.getStringExtra(r0)
            java.lang.String r2 = "msn"
            java.lang.String r13 = r13.getStringExtra(r2)
            android.content.SharedPreferences r3 = r10.getSettings()
            android.content.SharedPreferences$Editor r3 = r3.edit()
            r3.putString(r11, r12)
            r3.putString(r0, r1)
            r3.putString(r2, r13)
            r3.apply()
            r10.updateDrawerForSignInState()
            goto L_0x01b4
        L_0x005b:
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            r12 = 2131296433(0x7f0900b1, float:1.8210783E38)
            android.view.View r12 = r10.findViewById(r12)
            android.widget.EditText r12 = (android.widget.EditText) r12
            if (r12 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            android.widget.EditText r12 = r10.sharePhoneNumberText
        L_0x006e:
            r11.element = r12
            android.net.Uri r2 = r13.getData()
            r12 = 0
            android.database.Cursor r12 = (android.database.Cursor) r12
            java.lang.String r7 = ""
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 1
            android.net.Uri r13 = r13.getData()     // Catch:{ Exception -> 0x016a, all -> 0x0114 }
            r13.getLastPathSegment()     // Catch:{ Exception -> 0x016a, all -> 0x0114 }
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch:{ Exception -> 0x016a, all -> 0x0114 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r12 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x016a, all -> 0x0114 }
            if (r12 != 0) goto L_0x0097
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ Exception -> 0x016a, all -> 0x0114 }
        L_0x0097:
            java.lang.String r13 = "data1"
            int r13 = r12.getColumnIndex(r13)     // Catch:{ Exception -> 0x016a, all -> 0x0114 }
            boolean r1 = r12.moveToFirst()     // Catch:{ Exception -> 0x016a, all -> 0x0114 }
            if (r1 == 0) goto L_0x00c0
        L_0x00a3:
            boolean r1 = r12.isAfterLast()     // Catch:{ Exception -> 0x016a, all -> 0x0114 }
            if (r1 != 0) goto L_0x00c0
            java.lang.String r1 = r12.getString(r13)     // Catch:{ Exception -> 0x016a, all -> 0x0114 }
            java.lang.String r2 = "cursor.getString(phoneIdx)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)     // Catch:{ Exception -> 0x016a, all -> 0x0114 }
            r8.add(r1)     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            r12.moveToNext()     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            r7 = r1
            goto L_0x00a3
        L_0x00ba:
            r13 = move-exception
            r7 = r1
            goto L_0x0115
        L_0x00bd:
            r7 = r1
            goto L_0x016b
        L_0x00c0:
            r12.close()
            int r12 = r8.size()
            java.lang.String[] r12 = new java.lang.String[r12]
            java.lang.Object[] r12 = r8.toArray(r12)
            java.lang.String[] r12 = (java.lang.String[]) r12
            android.support.v7.app.AlertDialog$Builder r13 = new android.support.v7.app.AlertDialog$Builder
            r1 = r10
            android.content.Context r1 = (android.content.Context) r1
            r13.<init>(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r13.setTitle(r0)
            r0 = r12
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            com.valora.kkiosk.MainActivity$onActivityResult$1 r1 = new com.valora.kkiosk.MainActivity$onActivityResult$1
            r1.<init>(r12, r11)
            android.content.DialogInterface$OnClickListener r1 = (android.content.DialogInterface.OnClickListener) r1
            r13.setItems(r0, r1)
            android.support.v7.app.AlertDialog r12 = r13.create()
            int r13 = r8.size()
            if (r13 <= r9) goto L_0x00f7
        L_0x00f3:
            r12.show()
            goto L_0x010c
        L_0x00f7:
            com.valora.kkiosk.commons.extensions.Helper r12 = com.valora.kkiosk.commons.extensions.Helper.INSTANCE
            java.lang.String r13 = r7.toString()
            java.lang.String r12 = r12.normalizePhoneNumber(r13)
            T r11 = r11.element
            android.widget.EditText r11 = (android.widget.EditText) r11
            if (r11 == 0) goto L_0x010c
        L_0x0107:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r11.setText(r12)
        L_0x010c:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r11 = r7.length()
            goto L_0x01b4
        L_0x0114:
            r13 = move-exception
        L_0x0115:
            if (r12 == 0) goto L_0x011a
            r12.close()
        L_0x011a:
            int r12 = r8.size()
            java.lang.String[] r12 = new java.lang.String[r12]
            java.lang.Object[] r12 = r8.toArray(r12)
            java.lang.String[] r12 = (java.lang.String[]) r12
            android.support.v7.app.AlertDialog$Builder r1 = new android.support.v7.app.AlertDialog$Builder
            r2 = r10
            android.content.Context r2 = (android.content.Context) r2
            r1.<init>(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setTitle(r0)
            r0 = r12
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            com.valora.kkiosk.MainActivity$onActivityResult$1 r2 = new com.valora.kkiosk.MainActivity$onActivityResult$1
            r2.<init>(r12, r11)
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            r1.setItems(r0, r2)
            android.support.v7.app.AlertDialog r12 = r1.create()
            int r0 = r8.size()
            if (r0 <= r9) goto L_0x014e
            r12.show()
            goto L_0x0163
        L_0x014e:
            com.valora.kkiosk.commons.extensions.Helper r12 = com.valora.kkiosk.commons.extensions.Helper.INSTANCE
            java.lang.String r0 = r7.toString()
            java.lang.String r12 = r12.normalizePhoneNumber(r0)
            T r11 = r11.element
            android.widget.EditText r11 = (android.widget.EditText) r11
            if (r11 == 0) goto L_0x0163
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r11.setText(r12)
        L_0x0163:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r11 = r7.length()
            throw r13
        L_0x016a:
        L_0x016b:
            if (r12 == 0) goto L_0x0170
            r12.close()
        L_0x0170:
            int r12 = r8.size()
            java.lang.String[] r12 = new java.lang.String[r12]
            java.lang.Object[] r12 = r8.toArray(r12)
            java.lang.String[] r12 = (java.lang.String[]) r12
            android.support.v7.app.AlertDialog$Builder r13 = new android.support.v7.app.AlertDialog$Builder
            r1 = r10
            android.content.Context r1 = (android.content.Context) r1
            r13.<init>(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r13.setTitle(r0)
            r0 = r12
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            com.valora.kkiosk.MainActivity$onActivityResult$1 r1 = new com.valora.kkiosk.MainActivity$onActivityResult$1
            r1.<init>(r12, r11)
            android.content.DialogInterface$OnClickListener r1 = (android.content.DialogInterface.OnClickListener) r1
            r13.setItems(r0, r1)
            android.support.v7.app.AlertDialog r12 = r13.create()
            int r13 = r8.size()
            if (r13 <= r9) goto L_0x01a2
            goto L_0x00f3
        L_0x01a2:
            com.valora.kkiosk.commons.extensions.Helper r12 = com.valora.kkiosk.commons.extensions.Helper.INSTANCE
            java.lang.String r13 = r7.toString()
            java.lang.String r12 = r12.normalizePhoneNumber(r13)
            T r11 = r11.element
            android.widget.EditText r11 = (android.widget.EditText) r11
            if (r11 == 0) goto L_0x010c
            goto L_0x0107
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valora.kkiosk.MainActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void registerPressed(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        startActivityForResult(getRegistrationActivityIntent(), MainActivityKt.SIGNUP_RESULT);
    }

    static /* synthetic */ void replaceFragment$default(MainActivity mainActivity, Fragment fragment, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        mainActivity.replaceFragment(fragment, i, z);
    }

    /* access modifiers changed from: private */
    public final void replaceFragment(Fragment fragment, int i, boolean z) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (fragment instanceof CouponsCardsFragment) {
            Bundle bundle = new Bundle();
            Consents consents2 = this.consents;
            if (consents2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("consents");
            }
            bundle.putSerializable(SplashActivityKt.EXTRA_CONSENTS, consents2);
            ((CouponsCardsFragment) fragment).setArguments(bundle);
        }
        Bundle bundle2 = new Bundle();
        if (fragment.getArguments() != null) {
            bundle2 = fragment.getArguments();
            if (bundle2 == null) {
                Intrinsics.throwNpe();
            }
        }
        bundle2.putInt(MainActivityKt.EXTRA_FRAGMENT_MENU_ITEM_ID, i);
        fragment.setArguments(bundle2);
        beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        beginTransaction.replace(R.id.fragment_container, fragment);
        if (!z) {
            beginTransaction.addToBackStack(Reflection.getOrCreateKotlinClass(fragment.getClass()).getSimpleName());
        }
        this.currentMenuItemId = i;
        beginTransaction.commit();
    }

    /* access modifiers changed from: private */
    public final void displayWebViewFragment(String str, int i) {
        WebViewFragment webViewFragment = new WebViewFragment();
        webViewFragment.setUrlToLoad(str);
        replaceFragment$default(this, webViewFragment, i, false, 4, null);
    }

    public final void launchWebViewActivity(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intent intent = new Intent(this, WebViewActivity.class);
        intent.putExtra("URL_TO_LOAD", str);
        startActivity(intent);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: private */
    public final void setToolbarText(String str) {
        ImageView imageView = (ImageView) _$_findCachedViewById(C1224R.C1226id.toolbar_logo);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "toolbar_logo");
        imageView.setVisibility(8);
        TextView textView = (TextView) _$_findCachedViewById(C1224R.C1226id.toolbar_text);
        String str2 = "toolbar_text";
        Intrinsics.checkExpressionValueIsNotNull(textView, str2);
        textView.setVisibility(0);
        TextView textView2 = (TextView) _$_findCachedViewById(C1224R.C1226id.toolbar_text);
        Intrinsics.checkExpressionValueIsNotNull(textView2, str2);
        textView2.setText(str);
    }

    public final void shareCoupon(@NotNull Coupon coupon) {
        Intrinsics.checkParameterIsNotNull(coupon, Param.COUPON);
        Helper helper = Helper.INSTANCE;
        FirebaseAnalytics firebaseAnalytics2 = this.firebaseAnalytics;
        if (firebaseAnalytics2 == null) {
            Intrinsics.throwNpe();
        }
        helper.logEvent(firebaseAnalytics2, "ui_action", "button_press", "share_coupon");
        this.couponToShare = coupon;
        View inflate = getLayoutInflater().inflate(R.layout.share_dialog, null);
        if (coupon.getBarcodeUrl() == null && coupon.isShareable()) {
            View findViewById = inflate.findViewById(R.id.text_view_2);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "shareDialogView.findView…xtView>(R.id.text_view_2)");
            ((TextView) findViewById).setText(getString(R.string.share_explanation_robin_good));
        }
        MaterialDialog build = new Builder(this).customView(inflate, false).positiveText((int) R.string.verschenken).negativeText((int) R.string.cancel).onPositive(new MainActivity$shareCoupon$dialog$1(this, coupon)).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "dialog");
        View customView = build.getCustomView();
        if (customView == null) {
            Intrinsics.throwNpe();
        }
        View findViewById2 = customView.findViewById(R.id.share_contacts_button);
        if (findViewById2 != null) {
            ((ImageButton) findViewById2).setOnClickListener(new MainActivity$shareCoupon$1(this));
            View customView2 = build.getCustomView();
            if (customView2 == null) {
                Intrinsics.throwNpe();
            }
            View findViewById3 = customView2.findViewById(R.id.share_thumb_image);
            if (findViewById3 != null) {
                ImageView imageView = (ImageView) findViewById3;
                if (coupon.getThumbUrl() != null) {
                    ExtensionsKt.loadImg$default(imageView, coupon.getThumbUrl(), null, 2, null);
                }
                MDButton actionButton = build.getActionButton(DialogAction.POSITIVE);
                View customView3 = build.getCustomView();
                if (customView3 == null) {
                    Intrinsics.throwNpe();
                }
                this.sharePhoneNumberText = (EditText) customView3.findViewById(R.id.share_phone_number_text);
                EditText editText = this.sharePhoneNumberText;
                if (editText != null) {
                    editText.addTextChangedListener(new MainActivity$shareCoupon$2(actionButton));
                }
                build.setOnDismissListener(new MainActivity$shareCoupon$3(this));
                build.show();
                Intrinsics.checkExpressionValueIsNotNull(actionButton, "positiveAction");
                actionButton.setEnabled(false);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageButton");
    }

    private final void checkForCrashes() {
        CrashManager.register(this);
    }

    /* access modifiers changed from: private */
    public final String getDeviceName() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        Intrinsics.checkExpressionValueIsNotNull(str2, "model");
        Intrinsics.checkExpressionValueIsNotNull(str, "manufacturer");
        if (StringsKt.startsWith$default(str2, str, false, 2, null)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringsKt.capitalize(str));
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    private final Intent getRegistrationActivityIntent() {
        Intent intent = new Intent(this, RegistrationActivity.class);
        Consents consents2 = this.consents;
        if (consents2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consents");
        }
        intent.putExtra(SplashActivityKt.EXTRA_CONSENTS, consents2);
        return intent;
    }

    public void onConsentsChanged(@NotNull Consents consents2) {
        Intrinsics.checkParameterIsNotNull(consents2, "consents");
        this.consents = consents2;
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        intent.getExtras().putSerializable(SplashActivityKt.EXTRA_CONSENTS, consents2);
    }
}
