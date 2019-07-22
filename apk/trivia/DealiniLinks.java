package com.valora.kkiosk.trivia;

import android.content.Intent;
import android.net.Uri;
import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/DealiniLinks;", "", "()V", "de", "", "fr", "getPlayOnDealiniIntent", "Landroid/content/Intent;", "overrideString", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Dealini.kt */
public final class DealiniLinks {
    public static final DealiniLinks INSTANCE = new DealiniLinks();

    /* renamed from: de */
    private static final String f248de = "http://werweiss.io/?l=de";

    /* renamed from: fr */
    private static final String f249fr = "http://werweiss.io/?l=fr";

    private DealiniLinks() {
    }

    @NotNull
    public final Intent getPlayOnDealiniIntent(@Nullable String str) {
        String str2 = Intrinsics.areEqual((Object) ApiConfig.INSTANCE.getUserLanguage(), (Object) "de") ? f248de : f249fr;
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str == null) {
            intent.setData(Uri.parse(str2));
        } else {
            intent.setData(Uri.parse(str));
        }
        return intent;
    }
}
