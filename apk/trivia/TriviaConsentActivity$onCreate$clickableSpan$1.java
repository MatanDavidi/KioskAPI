package com.valora.kkiosk.trivia;

import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, mo21491d2 = {"com/valora/kkiosk/trivia/TriviaConsentActivity$onCreate$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: TriviaConsentActivity.kt */
public final class TriviaConsentActivity$onCreate$clickableSpan$1 extends ClickableSpan {
    final /* synthetic */ TriviaConsentActivity this$0;

    TriviaConsentActivity$onCreate$clickableSpan$1(TriviaConsentActivity triviaConsentActivity) {
        this.this$0 = triviaConsentActivity;
    }

    public void onClick(@Nullable View view) {
        StringBuilder sb = new StringBuilder();
        sb.append("click ");
        sb.append(this.this$0.getTOSUrlString());
        Log.d("tosurl", sb.toString());
        CustomTabsIntent access$getCustomTabsIntent$p = TriviaConsentActivity.access$getCustomTabsIntent$p(this.this$0);
        TriviaConsentActivity triviaConsentActivity = this.this$0;
        access$getCustomTabsIntent$p.launchUrl(triviaConsentActivity, Uri.parse(triviaConsentActivity.getTOSUrlString()));
    }
}
