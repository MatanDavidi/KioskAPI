package com.valora.kkiosk.commons.adapters;

import android.support.p003v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/adapters/ViewTypeDelegateAdapter;", "", "onBindViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "item", "Lcom/valora/kkiosk/commons/adapters/ViewType;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: ViewTypeDelegateAdapter.kt */
public interface ViewTypeDelegateAdapter {
    void onBindViewHolder(@NotNull ViewHolder viewHolder, @NotNull ViewType viewType);

    @NotNull
    ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup);
}
