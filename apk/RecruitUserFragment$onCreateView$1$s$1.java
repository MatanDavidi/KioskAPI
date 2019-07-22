package com.valora.kkiosk;

import kotlin.Metadata;
import p018rx.functions.Action1;
import p018rx.schedulers.Schedulers;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: RecruitUserFragment.kt */
final class RecruitUserFragment$onCreateView$1$s$1<T> implements Action1<String> {
    final /* synthetic */ String $textNumber;
    final /* synthetic */ RecruitUserFragment$onCreateView$1 this$0;

    RecruitUserFragment$onCreateView$1$s$1(RecruitUserFragment$onCreateView$1 recruitUserFragment$onCreateView$1, String str) {
        this.this$0 = recruitUserFragment$onCreateView$1;
        this.$textNumber = str;
    }

    public final void call(String str) {
        this.this$0.this$0.getSubscriptions().add(this.this$0.this$0.getUserManager().recruit(this.$textNumber).subscribeOn(Schedulers.m217io()).subscribe());
    }
}
