package com.valora.kkiosk.trivia;

import android.net.Uri;
import android.support.p000v4.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Metadata;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "it", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "onSuccess"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: StreamInactiveFragment.kt */
final class StreamInactiveFragment$onCreateView$2$onBindViewHolder$3<TResult> implements OnSuccessListener<Uri> {
    final /* synthetic */ QuizHolder $viewHolder;
    final /* synthetic */ StreamInactiveFragment$onCreateView$2 this$0;

    StreamInactiveFragment$onCreateView$2$onBindViewHolder$3(StreamInactiveFragment$onCreateView$2 streamInactiveFragment$onCreateView$2, QuizHolder quizHolder) {
        this.this$0 = streamInactiveFragment$onCreateView$2;
        this.$viewHolder = quizHolder;
    }

    public final void onSuccess(Uri uri) {
        FragmentActivity activity = this.this$0.this$0.getActivity();
        if (activity != null) {
            Glide.with(activity).load(uri).centerCrop().into(this.$viewHolder.getSpecialPrizeImageView());
        }
    }
}
