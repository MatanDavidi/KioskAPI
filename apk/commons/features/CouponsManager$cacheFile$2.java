package com.valora.kkiosk.commons.features;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo21491d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CouponsManager.kt */
final class CouponsManager$cacheFile$2 extends Lambda implements Function0<File> {
    final /* synthetic */ CouponsManager this$0;

    CouponsManager$cacheFile$2(CouponsManager couponsManager) {
        this.this$0 = couponsManager;
        super(0);
    }

    @NotNull
    public final File invoke() {
        return new File(this.this$0.getContext().getCacheDir(), "coupons.json");
    }
}
