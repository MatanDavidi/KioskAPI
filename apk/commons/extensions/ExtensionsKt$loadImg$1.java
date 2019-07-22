package com.valora.kkiosk.commons.extensions;

import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo21491d2 = {"<anonymous>", "", "onPreDraw"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: Extensions.kt */
final class ExtensionsKt$loadImg$1 implements OnPreDrawListener {
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ ImageView $this_loadImg;

    ExtensionsKt$loadImg$1(ImageView imageView, String str) {
        this.$this_loadImg = imageView;
        this.$imageUrl = str;
    }

    public final boolean onPreDraw() {
        ExtensionsKt.imagesSize.put(this.$imageUrl, new Pair(Integer.valueOf(this.$this_loadImg.getWidth()), Integer.valueOf(this.$this_loadImg.getHeight())));
        return true;
    }
}
