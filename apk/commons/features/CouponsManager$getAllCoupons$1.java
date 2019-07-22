package com.valora.kkiosk.commons.features;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.StorageReference;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi.Builder;
import com.valora.kkiosk.commons.models.CouponDataResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import p018rx.Observable.OnSubscribe;
import p018rx.Subscriber;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a*\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo21491d2 = {"<anonymous>", "", "subscriber", "Lrx/Subscriber;", "Lcom/valora/kkiosk/commons/models/CouponDataResponse;", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: CouponsManager.kt */
final class CouponsManager$getAllCoupons$1<T> implements OnSubscribe<T> {
    final /* synthetic */ StorageReference $jsonRef;

    CouponsManager$getAllCoupons$1(StorageReference storageReference) {
        this.$jsonRef = storageReference;
    }

    public final void call(final Subscriber<? super CouponDataResponse> subscriber) {
        this.$jsonRef.getBytes((long) 524288).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            public final void onSuccess(byte[] bArr) {
                JsonAdapter adapter = new Builder().build().adapter(CouponDataResponse.class);
                Intrinsics.checkExpressionValueIsNotNull(bArr, "bytes");
                CouponDataResponse couponDataResponse = (CouponDataResponse) adapter.fromJson(new String(bArr, Charsets.UTF_8));
                couponDataResponse.initialize();
                subscriber.onNext(couponDataResponse);
                subscriber.onCompleted();
            }
        }).addOnFailureListener(new OnFailureListener() {
            public final void onFailure(@NotNull Exception exc) {
                Intrinsics.checkParameterIsNotNull(exc, "e");
                subscriber.onError(exc);
            }
        });
    }
}
