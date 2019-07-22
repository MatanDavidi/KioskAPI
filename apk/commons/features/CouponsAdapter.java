package com.valora.kkiosk.commons.features;

import android.content.Context;
import android.support.p000v4.util.SparseArrayCompat;
import android.support.p003v7.widget.RecyclerView.Adapter;
import android.support.p003v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import com.facebook.places.model.PlaceFields;
import com.valora.kkiosk.commons.adapters.AdapterConstants;
import com.valora.kkiosk.commons.adapters.ViewType;
import com.valora.kkiosk.commons.adapters.ViewTypeDelegateAdapter;
import com.valora.kkiosk.commons.models.Coupon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0014\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0016H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, mo21491d2 = {"Lcom/valora/kkiosk/commons/features/CouponsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "delegateAdapters", "Landroid/support/v4/util/SparseArrayCompat;", "Lcom/valora/kkiosk/commons/adapters/ViewTypeDelegateAdapter;", "items", "Ljava/util/ArrayList;", "Lcom/valora/kkiosk/commons/adapters/ViewType;", "addCoupons", "", "coupons", "", "Lcom/valora/kkiosk/commons/models/Coupon;", "clearAndAddCoupons", "getCoupons", "getItemCount", "", "getItemViewType", "position", "getLastPosition", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: CouponsAdapter.kt */
public final class CouponsAdapter extends Adapter<ViewHolder> {
    @NotNull
    private final Context context;
    private SparseArrayCompat<ViewTypeDelegateAdapter> delegateAdapters = new SparseArrayCompat<>();
    private ArrayList<ViewType> items;

    public CouponsAdapter(@NotNull Context context2) {
        Intrinsics.checkParameterIsNotNull(context2, PlaceFields.CONTEXT);
        this.context = context2;
        this.delegateAdapters.put(AdapterConstants.INSTANCE.getCOUPON(), new CouponsDelegateAdapter(this.context));
        this.items = new ArrayList<>();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public int getItemCount() {
        return this.items.size();
    }

    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Object obj = this.delegateAdapters.get(i);
        if (obj == null) {
            Intrinsics.throwNpe();
        }
        return ((ViewTypeDelegateAdapter) obj).onCreateViewHolder(viewGroup);
    }

    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        Object obj = this.delegateAdapters.get(getItemViewType(i));
        if (obj == null) {
            Intrinsics.throwNpe();
        }
        ViewTypeDelegateAdapter viewTypeDelegateAdapter = (ViewTypeDelegateAdapter) obj;
        Object obj2 = this.items.get(i);
        Intrinsics.checkExpressionValueIsNotNull(obj2, "this.items[position]");
        viewTypeDelegateAdapter.onBindViewHolder(viewHolder, (ViewType) obj2);
    }

    public int getItemViewType(int i) {
        return ((ViewType) this.items.get(i)).getViewType();
    }

    public final void addCoupons(@NotNull List<Coupon> list) {
        Intrinsics.checkParameterIsNotNull(list, "coupons");
        int size = this.items.size();
        this.items.addAll(list);
        notifyItemRangeChanged(size, this.items.size());
    }

    public final void clearAndAddCoupons(@NotNull List<Coupon> list) {
        Intrinsics.checkParameterIsNotNull(list, "coupons");
        this.items.clear();
        notifyItemRangeRemoved(0, getLastPosition());
        this.items.addAll(list);
        notifyDataSetChanged();
    }

    @NotNull
    public final List<Coupon> getCoupons() {
        Iterable iterable = this.items;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((ViewType) next).getViewType() == AdapterConstants.INSTANCE.getCOUPON()) {
                arrayList.add(next);
            }
        }
        Iterable<ViewType> iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        for (ViewType viewType : iterable2) {
            if (viewType != null) {
                arrayList2.add((Coupon) viewType);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.commons.models.Coupon");
            }
        }
        return (List) arrayList2;
    }

    private final int getLastPosition() {
        if (CollectionsKt.getLastIndex(this.items) == -1) {
            return 0;
        }
        return CollectionsKt.getLastIndex(this.items);
    }
}
