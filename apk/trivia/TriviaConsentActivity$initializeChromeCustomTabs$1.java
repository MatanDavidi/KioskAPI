package com.valora.kkiosk.trivia;

import android.content.ComponentName;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsIntent.Builder;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import com.valora.kkiosk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, mo21491d2 = {"com/valora/kkiosk/trivia/TriviaConsentActivity$initializeChromeCustomTabs$1", "Landroid/support/customtabs/CustomTabsServiceConnection;", "onCustomTabsServiceConnected", "", "componentName", "Landroid/content/ComponentName;", "customTabsClient", "Landroid/support/customtabs/CustomTabsClient;", "onServiceDisconnected", "name", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: TriviaConsentActivity.kt */
public final class TriviaConsentActivity$initializeChromeCustomTabs$1 extends CustomTabsServiceConnection {
    final /* synthetic */ TriviaConsentActivity this$0;

    TriviaConsentActivity$initializeChromeCustomTabs$1(TriviaConsentActivity triviaConsentActivity) {
        this.this$0 = triviaConsentActivity;
    }

    public void onCustomTabsServiceConnected(@NotNull ComponentName componentName, @NotNull CustomTabsClient customTabsClient) {
        Intrinsics.checkParameterIsNotNull(componentName, "componentName");
        Intrinsics.checkParameterIsNotNull(customTabsClient, "customTabsClient");
        this.this$0.mClient = customTabsClient;
        CustomTabsClient access$getMClient$p = this.this$0.mClient;
        if (access$getMClient$p != null) {
            access$getMClient$p.warmup(0);
        }
        TriviaConsentActivity triviaConsentActivity = this.this$0;
        CustomTabsClient access$getMClient$p2 = triviaConsentActivity.mClient;
        CustomTabsSession customTabsSession = null;
        if (access$getMClient$p2 != null) {
            customTabsSession = access$getMClient$p2.newSession(null);
        }
        triviaConsentActivity.mCustomTabsSession = customTabsSession;
        TriviaConsentActivity triviaConsentActivity2 = this.this$0;
        CustomTabsIntent build = new Builder(triviaConsentActivity2.mCustomTabsSession).setToolbarColor(this.this$0.getResources().getColor(R.color.colorPrimary)).setShowTitle(true).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "CustomTabsIntent.Builder…                 .build()");
        triviaConsentActivity2.customTabsIntent = build;
    }

    public void onServiceDisconnected(@NotNull ComponentName componentName) {
        Intrinsics.checkParameterIsNotNull(componentName, "name");
        this.this$0.mClient = null;
    }
}
