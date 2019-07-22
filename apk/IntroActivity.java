package com.valora.kkiosk;

import android.os.Bundle;
import android.support.p000v4.app.Fragment;
import android.support.p000v4.content.res.ResourcesCompat;
import android.view.View;
import com.github.paolorotolo.appintro.AppIntro2;
import com.valora.kkiosk.intro.ValoraIntroSlide;
import com.valora.kkiosk.intro.ValoraIntroSlide.Companion;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, mo21491d2 = {"Lcom/valora/kkiosk/IntroActivity;", "Lcom/github/paolorotolo/appintro/AppIntro2;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDonePressed", "currentFragment", "Landroid/support/v4/app/Fragment;", "onSkipPressed", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: IntroActivity.kt */
public final class IntroActivity extends AppIntro2 {
    private HashMap _$_findViewCache;

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

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        int color = ResourcesCompat.getColor(getResources(), R.color.colorPrimary, null);
        int color2 = ResourcesCompat.getColor(getResources(), R.color.lightGray, null);
        Companion companion = ValoraIntroSlide.Companion;
        String string = getString(R.string.intro_page1_title);
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.intro_page1_title)");
        String string2 = getString(R.string.intro_page1_content);
        Intrinsics.checkExpressionValueIsNotNull(string2, "getString(R.string.intro_page1_content)");
        int i = color;
        int i2 = color2;
        int i3 = color2;
        addSlide(companion.newInstance(string, string2, R.drawable.i7plus_1, i, i2, i3));
        Companion companion2 = ValoraIntroSlide.Companion;
        String string3 = getString(R.string.intro_page2_title);
        Intrinsics.checkExpressionValueIsNotNull(string3, "getString(R.string.intro_page2_title)");
        String string4 = getString(R.string.intro_page2_content);
        Intrinsics.checkExpressionValueIsNotNull(string4, "getString(R.string.intro_page2_content)");
        addSlide(companion2.newInstance(string3, string4, R.drawable.i7plus_2, i, i2, i3));
        Companion companion3 = ValoraIntroSlide.Companion;
        String string5 = getString(R.string.intro_page3_title);
        Intrinsics.checkExpressionValueIsNotNull(string5, "getString(R.string.intro_page3_title)");
        String string6 = getString(R.string.intro_page3_content);
        Intrinsics.checkExpressionValueIsNotNull(string6, "getString(R.string.intro_page3_content)");
        addSlide(companion3.newInstance(string5, string6, R.drawable.i7plus_3, i, i2, i3));
    }

    public void onSkipPressed(@NotNull Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "currentFragment");
        super.onSkipPressed(fragment);
        finish();
    }

    public void onDonePressed(@NotNull Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "currentFragment");
        super.onDonePressed(fragment);
        finish();
    }
}
