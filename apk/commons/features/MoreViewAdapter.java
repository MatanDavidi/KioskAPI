package com.valora.kkiosk.commons.features;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.valora.kkiosk.R;
import com.valora.kkiosk.commons.models.MoreItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.anko.Sdk19PropertiesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/features/MoreViewAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/valora/kkiosk/commons/models/MoreItem;", "mContext", "Landroid/content/Context;", "modelsArrayList", "", "(Landroid/content/Context;Ljava/util/List;)V", "getView", "Landroid/view/View;", "position", "", "convertView", "parent", "Landroid/view/ViewGroup;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: MoreViewAdapter.kt */
public final class MoreViewAdapter extends ArrayAdapter<MoreItem> {
    private final Context mContext;
    private final List<MoreItem> modelsArrayList;

    public MoreViewAdapter(@NotNull Context context, @NotNull List<MoreItem> list) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(list, "modelsArrayList");
        super(context, R.layout.more_item, list);
        this.mContext = context;
        this.modelsArrayList = list;
    }

    @NotNull
    public View getView(int i, @Nullable View view, @Nullable ViewGroup viewGroup) {
        Object systemService = this.mContext.getSystemService("layout_inflater");
        if (systemService != null) {
            View view2 = null;
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.more_item, viewGroup, false);
            if (inflate == null) {
                Intrinsics.throwNpe();
            }
            View findViewById = inflate.findViewById(R.id.item_icon);
            if (findViewById != null) {
                ImageView imageView = (ImageView) findViewById;
                View findViewById2 = inflate.findViewById(R.id.item_title);
                if (findViewById2 != null) {
                    TextView textView = (TextView) findViewById2;
                    Sdk19PropertiesKt.setImageResource(imageView, ((MoreItem) this.modelsArrayList.get(i)).getIcon());
                    textView.setText(((MoreItem) this.modelsArrayList.get(i)).getTitle());
                    return inflate;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }
}
