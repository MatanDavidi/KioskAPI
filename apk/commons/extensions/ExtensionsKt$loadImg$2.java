package com.valora.kkiosk.commons.extensions;

import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J:\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J<\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, mo21491d2 = {"com/valora/kkiosk/commons/extensions/ExtensionsKt$loadImg$2", "Lcom/bumptech/glide/request/RequestListener;", "", "Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;", "onException", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "model", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "isFromMemoryCache", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt$loadImg$2 implements RequestListener<String, GlideDrawable> {
    final /* synthetic */ Function1 $callback;

    ExtensionsKt$loadImg$2(Function1 function1) {
        this.$callback = function1;
    }

    public boolean onException(@Nullable Exception exc, @Nullable String str, @Nullable Target<GlideDrawable> target, boolean z) {
        Function1 function1 = this.$callback;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(false));
        }
        return false;
    }

    public boolean onResourceReady(@Nullable GlideDrawable glideDrawable, @Nullable String str, @Nullable Target<GlideDrawable> target, boolean z, boolean z2) {
        Function1 function1 = this.$callback;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(true));
        }
        return false;
    }
}
