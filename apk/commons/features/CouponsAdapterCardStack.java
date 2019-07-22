package com.valora.kkiosk.commons.features;

import android.content.Context;
import android.support.p000v4.util.SparseArrayCompat;
import android.support.p003v7.widget.RecyclerView.ViewHolder;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.places.model.PlaceFields;
import com.mutualmobile.cardstack.CardStackAdapter;
import com.mutualmobile.cardstack.CardStackLayout;
import com.mutualmobile.cardstack.CardStackLayout.OnCardSelected;
import com.valora.kkiosk.R;
import com.valora.kkiosk.commons.adapters.AdapterConstants;
import com.valora.kkiosk.commons.adapters.ViewType;
import com.valora.kkiosk.commons.adapters.ViewTypeDelegateAdapter;
import com.valora.kkiosk.commons.view.CustomScrollView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u001a\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0014H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R5\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/features/CouponsAdapterCardStack;", "Lcom/mutualmobile/cardstack/CardStackAdapter;", "stack", "Lcom/mutualmobile/cardstack/CardStackLayout;", "context", "Landroid/content/Context;", "items", "Ljava/util/ArrayList;", "Lcom/valora/kkiosk/commons/adapters/ViewType;", "(Lcom/mutualmobile/cardstack/CardStackLayout;Landroid/content/Context;Ljava/util/ArrayList;)V", "cardViews", "Landroid/util/SparseArray;", "Landroid/view/View;", "delegateAdapters", "Landroid/support/v4/util/SparseArrayCompat;", "Lcom/valora/kkiosk/commons/adapters/ViewTypeDelegateAdapter;", "getItems", "()Ljava/util/ArrayList;", "selectedPositionChangedListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "", "getSelectedPositionChangedListener", "()Lkotlin/jvm/functions/Function1;", "setSelectedPositionChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "getStack", "()Lcom/mutualmobile/cardstack/CardStackLayout;", "createView", "parent", "Landroid/view/ViewGroup;", "getCount", "resetCards", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: CouponsAdapterCardStack.kt */
public final class CouponsAdapterCardStack extends CardStackAdapter {
    private final SparseArray<View> cardViews = new SparseArray<>();
    private SparseArrayCompat<ViewTypeDelegateAdapter> delegateAdapters = new SparseArrayCompat<>();
    @NotNull
    private final ArrayList<? extends ViewType> items;
    @NotNull
    private Function1<? super Integer, Unit> selectedPositionChangedListener = CouponsAdapterCardStack$selectedPositionChangedListener$1.INSTANCE;
    @NotNull
    private final CardStackLayout stack;

    @NotNull
    public final CardStackLayout getStack() {
        return this.stack;
    }

    public CouponsAdapterCardStack(@NotNull CardStackLayout cardStackLayout, @NotNull Context context, @NotNull ArrayList<? extends ViewType> arrayList) {
        Intrinsics.checkParameterIsNotNull(cardStackLayout, "stack");
        Intrinsics.checkParameterIsNotNull(context, PlaceFields.CONTEXT);
        Intrinsics.checkParameterIsNotNull(arrayList, "items");
        super(context);
        this.stack = cardStackLayout;
        this.items = arrayList;
        this.delegateAdapters.put(AdapterConstants.INSTANCE.getCOUPON(), new CouponsDelegateAdapter(context));
        this.stack.setOnCardSelectedListener(new OnCardSelected(this) {
            final /* synthetic */ CouponsAdapterCardStack this$0;

            {
                this.this$0 = r1;
            }

            public final void onCardSelected(View view, int i) {
                View findViewById = view.findViewById(R.id.card_scroll);
                if (findViewById != null) {
                    ((CustomScrollView) findViewById).setScrollEnabled(this.this$0.getSelectedCardPosition() == i);
                    this.this$0.getSelectedPositionChangedListener().invoke(Integer.valueOf(i));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.commons.view.CustomScrollView");
            }
        });
    }

    @NotNull
    public final ArrayList<? extends ViewType> getItems() {
        return this.items;
    }

    @NotNull
    public final Function1<Integer, Unit> getSelectedPositionChangedListener() {
        return this.selectedPositionChangedListener;
    }

    public final void setSelectedPositionChangedListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.selectedPositionChangedListener = function1;
    }

    @NotNull
    public View createView(int i, @Nullable ViewGroup viewGroup) {
        ViewTypeDelegateAdapter viewTypeDelegateAdapter = (ViewTypeDelegateAdapter) this.delegateAdapters.get(AdapterConstants.INSTANCE.getCOUPON());
        if (viewTypeDelegateAdapter == null) {
            Intrinsics.throwNpe();
        }
        if (viewGroup == null) {
            Intrinsics.throwNpe();
        }
        ViewHolder onCreateViewHolder = viewTypeDelegateAdapter.onCreateViewHolder(viewGroup);
        viewTypeDelegateAdapter.onBindViewHolder(onCreateViewHolder, (ViewType) this.items.get(i));
        View findViewById = onCreateViewHolder.itemView.findViewById(R.id.card_scroll);
        if (findViewById != null) {
            ((CustomScrollView) findViewById).setScrollEnabled(false);
            this.cardViews.append(i, onCreateViewHolder.itemView);
            View view = onCreateViewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "vh.itemView");
            return view;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.commons.view.CustomScrollView");
    }

    public void resetCards() {
        super.resetCards();
        int size = this.cardViews.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                View findViewById = ((View) this.cardViews.get(i)).findViewById(R.id.card_scroll);
                if (!(findViewById instanceof CustomScrollView)) {
                    findViewById = null;
                }
                CustomScrollView customScrollView = (CustomScrollView) findViewById;
                if (customScrollView != null) {
                    customScrollView.setScrollEnabled(false);
                }
                if (customScrollView != null) {
                    customScrollView.setScrollX(0);
                }
                if (customScrollView != null) {
                    customScrollView.setScrollY(0);
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        this.selectedPositionChangedListener.invoke(Integer.valueOf(-1));
    }

    public int getCount() {
        return this.items.size();
    }
}
