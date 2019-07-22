package com.valora.kkiosk.commons.extensions;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006*\u00020\u0007\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004\u001a*\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\"&\u0010\u0000\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0001X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo21491d2 = {"imagesSize", "Ljava/util/HashMap;", "", "Lkotlin/Pair;", "", "getSystemLanguages", "", "Landroid/content/Context;", "inflate", "Landroid/view/View;", "Landroid/view/ViewGroup;", "layoutId", "loadImg", "", "Landroid/widget/ImageView;", "imageUrl", "callback", "Lkotlin/Function1;", "", "app_release"}, mo21492k = 2, mo21493mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt {
    /* access modifiers changed from: private */
    public static HashMap<String, Pair<Integer, Integer>> imagesSize = new HashMap<>();

    @NotNull
    public static final View inflate(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "$this$inflate");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…te(layoutId, this, false)");
        return inflate;
    }

    public static /* synthetic */ void loadImg$default(ImageView imageView, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        loadImg(imageView, str, function1);
    }

    public static final void loadImg(@NotNull ImageView imageView, @NotNull String str, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(imageView, "$this$loadImg");
        Intrinsics.checkParameterIsNotNull(str, "imageUrl");
        if (!TextUtils.isEmpty(str)) {
            Pair pair = (Pair) imagesSize.get(str);
            if (pair == null || ((Number) pair.getSecond()).intValue() <= 0) {
                imageView.getViewTreeObserver().addOnPreDrawListener(new ExtensionsKt$loadImg$1(imageView, str));
            } else {
                LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.height = ((Number) pair.getSecond()).intValue();
                imageView.setLayoutParams(layoutParams);
            }
            Glide.with(imageView.getContext()).load(str).listener((RequestListener<? super ModelType, GlideDrawable>) new ExtensionsKt$loadImg$2<Object,GlideDrawable>(function1)).diskCacheStrategy(DiskCacheStrategy.NONE).into(imageView);
        }
    }

    @NotNull
    public static final List<String> getSystemLanguages(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "$this$getSystemLanguages");
        String str = "resources";
        if (VERSION.SDK_INT >= 24) {
            Resources resources = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, str);
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkExpressionValueIsNotNull(configuration, "resources.configuration");
            LocaleList locales = configuration.getLocales();
            Iterable intRange = new IntRange(0, locales.size() - 1);
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
            Iterator it = intRange.iterator();
            while (it.hasNext()) {
                Locale locale = locales.get(((IntIterator) it).nextInt());
                Intrinsics.checkExpressionValueIsNotNull(locale, "list[i]");
                arrayList.add(locale.getLanguage());
            }
            return (List) arrayList;
        }
        Resources resources2 = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources2, str);
        Locale locale2 = resources2.getConfiguration().locale;
        Intrinsics.checkExpressionValueIsNotNull(locale2, "resources.configuration.locale");
        return CollectionsKt.listOf(locale2.getLanguage());
    }
}
