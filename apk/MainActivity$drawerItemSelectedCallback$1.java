package com.valora.kkiosk;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.design.widget.Snackbar;
import android.support.p000v4.app.Fragment;
import android.support.p003v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.valora.kkiosk.commons.extensions.Helper;
import com.valora.kkiosk.coupons.CouponsCardsFragment;
import com.valora.kkioskPreview.C1224R;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo21491d2 = {"<anonymous>", "", "it", "Landroid/view/MenuItem;", "onNavigationItemSelected"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
final class MainActivity$drawerItemSelectedCallback$1 implements OnNavigationItemSelectedListener {
    final /* synthetic */ MainActivity this$0;

    MainActivity$drawerItemSelectedCallback$1(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    public final boolean onNavigationItemSelected(@NotNull MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "it");
        Toolbar toolbar = this.this$0.getToolbar();
        if (toolbar == null) {
            Intrinsics.throwNpe();
        }
        toolbar.getMenu().clear();
        this.this$0.getMDrawerLayout().closeDrawers();
        String str = "android.intent.extra.TEXT";
        String str2 = "android.intent.action.SEND";
        String str3 = "null cannot be cast to non-null type kotlin.String";
        switch (menuItem.getItemId()) {
            case R.id.nav_coupons /*2131296525*/:
                ImageView imageView = (ImageView) this.this$0._$_findCachedViewById(C1224R.C1226id.toolbar_logo);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "toolbar_logo");
                imageView.setVisibility(0);
                TextView textView = (TextView) this.this$0._$_findCachedViewById(C1224R.C1226id.toolbar_text);
                Intrinsics.checkExpressionValueIsNotNull(textView, "toolbar_text");
                textView.setVisibility(8);
                this.this$0.replaceFragment(new CouponsCardsFragment(), menuItem.getItemId(), true);
                break;
            case R.id.nav_faq /*2131296526*/:
                MainActivity mainActivity = this.this$0;
                CharSequence title = menuItem.getTitle();
                if (title != null) {
                    mainActivity.setToolbarText((String) title);
                    MainActivity mainActivity2 = this.this$0;
                    String string = mainActivity2.getString(R.string.url_faqs);
                    Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.url_faqs)");
                    mainActivity2.displayWebViewFragment(string, menuItem.getItemId());
                    Helper helper = Helper.INSTANCE;
                    FirebaseAnalytics firebaseAnalytics = this.this$0.getFirebaseAnalytics();
                    if (firebaseAnalytics == null) {
                        Intrinsics.throwNpe();
                    }
                    helper.logScreen(firebaseAnalytics, "FAQ");
                    break;
                } else {
                    throw new TypeCastException(str3);
                }
            case R.id.nav_privacy_policy /*2131296527*/:
                MainActivity mainActivity3 = this.this$0;
                CharSequence title2 = menuItem.getTitle();
                if (title2 != null) {
                    mainActivity3.setToolbarText((String) title2);
                    MainActivity mainActivity4 = this.this$0;
                    String string2 = mainActivity4.getString(R.string.url_privacy);
                    Intrinsics.checkExpressionValueIsNotNull(string2, "getString(R.string.url_privacy)");
                    mainActivity4.displayWebViewFragment(string2, menuItem.getItemId());
                    Helper helper2 = Helper.INSTANCE;
                    FirebaseAnalytics firebaseAnalytics2 = this.this$0.getFirebaseAnalytics();
                    if (firebaseAnalytics2 == null) {
                        Intrinsics.throwNpe();
                    }
                    helper2.logScreen(firebaseAnalytics2, "Privacy");
                    break;
                } else {
                    throw new TypeCastException(str3);
                }
            case R.id.nav_profile /*2131296528*/:
                MainActivity mainActivity5 = this.this$0;
                CharSequence title3 = menuItem.getTitle();
                if (title3 != null) {
                    mainActivity5.setToolbarText((String) title3);
                    UserProfileFragment userProfileFragment = new UserProfileFragment();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable(SplashActivityKt.EXTRA_CONSENTS, this.this$0.getConsents());
                    userProfileFragment.setArguments(bundle);
                    MainActivity.replaceFragment$default(this.this$0, userProfileFragment, menuItem.getItemId(), false, 4, null);
                    Helper helper3 = Helper.INSTANCE;
                    FirebaseAnalytics firebaseAnalytics3 = this.this$0.getFirebaseAnalytics();
                    if (firebaseAnalytics3 == null) {
                        Intrinsics.throwNpe();
                    }
                    helper3.logScreen(firebaseAnalytics3, "User Profile");
                    break;
                } else {
                    throw new TypeCastException(str3);
                }
            case R.id.nav_recommend /*2131296529*/:
                MainActivity mainActivity6 = this.this$0;
                CharSequence title4 = menuItem.getTitle();
                if (title4 != null) {
                    mainActivity6.setToolbarText((String) title4);
                    MainActivity.replaceFragment$default(this.this$0, new RecruitUserFragment(), menuItem.getItemId(), false, 4, null);
                    this.this$0.setPreviousMenuItem(null);
                    Helper helper4 = Helper.INSTANCE;
                    FirebaseAnalytics firebaseAnalytics4 = this.this$0.getFirebaseAnalytics();
                    if (firebaseAnalytics4 == null) {
                        Intrinsics.throwNpe();
                    }
                    helper4.logEvent(firebaseAnalytics4, "ui_action", "button_press", "recommend");
                    Helper helper5 = Helper.INSTANCE;
                    FirebaseAnalytics firebaseAnalytics5 = this.this$0.getFirebaseAnalytics();
                    if (firebaseAnalytics5 == null) {
                        Intrinsics.throwNpe();
                    }
                    helper5.logScreen(firebaseAnalytics5, "Rectruit User");
                    break;
                } else {
                    throw new TypeCastException(str3);
                }
            case R.id.nav_share_now /*2131296530*/:
                MainActivity mainActivity7 = this.this$0;
                Intent intent = new Intent();
                intent.setAction(str2);
                intent.putExtra(str, this.this$0.getString(R.string.share_now_text));
                intent.setType("text/plain");
                mainActivity7.startActivity(intent);
                break;
            case R.id.nav_stores /*2131296531*/:
                MainActivity mainActivity8 = this.this$0;
                CharSequence title5 = menuItem.getTitle();
                if (title5 != null) {
                    mainActivity8.setToolbarText((String) title5);
                    this.this$0.displayWebViewFragment("https://k-kiosk-app.firebaseapp.com/", menuItem.getItemId());
                    Helper helper6 = Helper.INSTANCE;
                    FirebaseAnalytics firebaseAnalytics6 = this.this$0.getFirebaseAnalytics();
                    if (firebaseAnalytics6 == null) {
                        Intrinsics.throwNpe();
                    }
                    helper6.logScreen(firebaseAnalytics6, "Store Finder");
                    break;
                } else {
                    throw new TypeCastException(str3);
                }
            case R.id.nav_support /*2131296532*/:
                Intent intent2 = new Intent(str2);
                intent2.setType("message/rfc822");
                Collection listOf = CollectionsKt.listOf("info@kkiosk.ch");
                if (listOf != null) {
                    Object[] array = listOf.toArray(new String[0]);
                    if (array != null) {
                        intent2.putExtra("android.intent.extra.EMAIL", (String[]) array);
                        intent2.putExtra("android.intent.extra.SUBJECT", "Support k kiosk");
                        StringBuilder sb = new StringBuilder();
                        sb.append("\n\n\n---\nAndroid ");
                        sb.append(VERSION.RELEASE);
                        sb.append("\n");
                        sb.append(this.this$0.getDeviceName());
                        intent2.putExtra(str, sb.toString());
                        try {
                            this.this$0.startActivity(Intent.createChooser(intent2, "E-Mail..."));
                            break;
                        } catch (ActivityNotFoundException unused) {
                            Fragment currentFragment = this.this$0.getCurrentFragment();
                            Intrinsics.checkExpressionValueIsNotNull(currentFragment, "currentFragment");
                            View view = currentFragment.getView();
                            if (view == null) {
                                Intrinsics.throwNpe();
                            }
                            Snackbar.make(view, (CharSequence) this.this$0.getString(R.string.common_google_play_services_unknown_issue), 0).show();
                            break;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
                }
            case R.id.nav_terms /*2131296533*/:
                MainActivity mainActivity9 = this.this$0;
                CharSequence title6 = menuItem.getTitle();
                if (title6 != null) {
                    mainActivity9.setToolbarText((String) title6);
                    MainActivity mainActivity10 = this.this$0;
                    String string3 = mainActivity10.getString(R.string.url_terms);
                    Intrinsics.checkExpressionValueIsNotNull(string3, "getString(R.string.url_terms)");
                    mainActivity10.displayWebViewFragment(string3, menuItem.getItemId());
                    Helper helper7 = Helper.INSTANCE;
                    FirebaseAnalytics firebaseAnalytics7 = this.this$0.getFirebaseAnalytics();
                    if (firebaseAnalytics7 == null) {
                        Intrinsics.throwNpe();
                    }
                    helper7.logScreen(firebaseAnalytics7, "Terms and Conditions");
                    break;
                } else {
                    throw new TypeCastException(str3);
                }
        }
        return true;
    }
}
