package com.valora.kkiosk.commons.features;

import android.support.p003v7.widget.LinearLayoutManager;
import android.support.p003v7.widget.RecyclerView;
import android.support.p003v7.widget.RecyclerView.Adapter;
import android.support.p003v7.widget.RecyclerView.LayoutManager;
import android.support.p003v7.widget.RecyclerView.OnScrollListener;
import android.view.View;
import android.view.View.OnScrollChangeListener;
import android.widget.FrameLayout;
import com.mutualmobile.cardstack.CardStackLayout;
import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J2\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016J \u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/features/FadeOutElementScrollListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "Landroid/view/View$OnScrollChangeListener;", "btn", "Landroid/view/View;", "(Landroid/view/View;)V", "onScrollChange", "", "v", "scrollX", "", "scrollY", "oldScrollX", "oldScrollY", "onScrollStateChanged", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "onScrolled", "dx", "dy", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: FadeOutElementScrollListener.kt */
public final class FadeOutElementScrollListener extends OnScrollListener implements OnScrollChangeListener {
    private final View btn;

    public FadeOutElementScrollListener(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "btn");
        this.btn = view;
    }

    public void onScrollChange(@Nullable View view, int i, int i2, int i3, int i4) {
        if (!(view instanceof CardStackLayout)) {
            view = null;
        }
        CardStackLayout cardStackLayout = (CardStackLayout) view;
        if (cardStackLayout != null) {
            View childAt = cardStackLayout.getChildAt(cardStackLayout.getChildCount() - 1);
            if (childAt != null) {
                int bottom = childAt.getBottom() - (cardStackLayout.getHeight() + cardStackLayout.getScrollY());
                if (!ApiConfig.INSTANCE.registered()) {
                    FrameLayout frame = cardStackLayout.getFrame();
                    FrameLayout frame2 = cardStackLayout.getFrame();
                    String str = "stack.frame";
                    Intrinsics.checkExpressionValueIsNotNull(frame2, str);
                    View childAt2 = frame.getChildAt(frame2.getChildCount() - 1);
                    Intrinsics.checkExpressionValueIsNotNull(childAt2, "stack.frame.getChildAt(stack.frame.childCount - 1)");
                    float x = childAt2.getX();
                    FrameLayout frame3 = cardStackLayout.getFrame();
                    Intrinsics.checkExpressionValueIsNotNull(frame3, str);
                    if (x < ((float) frame3.getHeight())) {
                        this.btn.setAlpha(Math.min(1.0f, ((float) bottom) / 50.0f));
                        if (bottom <= 0) {
                            this.btn.setVisibility(8);
                        } else {
                            this.btn.setVisibility(0);
                        }
                        return;
                    }
                }
                this.btn.setAlpha(1.0f);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
    }

    public void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        if (recyclerView.getChildCount() > 0) {
            View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
            if (childAt != null) {
                LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int bottom = childAt.getBottom() - (recyclerView.getHeight() + recyclerView.getScrollY());
                    if (!ApiConfig.INSTANCE.registered()) {
                        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                        Adapter adapter = recyclerView.getAdapter();
                        if (adapter == null) {
                            Intrinsics.throwNpe();
                        }
                        if (findLastVisibleItemPosition == adapter.getItemCount() - 1) {
                            if (bottom <= 50) {
                                this.btn.setAlpha(((float) bottom) / 50.0f);
                            }
                            if (bottom <= 0) {
                                this.btn.setVisibility(8);
                            } else {
                                this.btn.setVisibility(0);
                            }
                            super.onScrolled(recyclerView, i, i2);
                            return;
                        }
                    }
                    this.btn.setAlpha(1.0f);
                    super.onScrolled(recyclerView, i, i2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
    }

    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
    }
}
