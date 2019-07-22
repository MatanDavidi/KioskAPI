package com.valora.kkiosk.trivia;

import android.support.p003v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.valora.kkiosk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/QuizHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mainPrizeDescriptionTextView", "Landroid/widget/TextView;", "getMainPrizeDescriptionTextView", "()Landroid/widget/TextView;", "mainPrizeImageView", "Landroid/widget/ImageView;", "getMainPrizeImageView", "()Landroid/widget/ImageView;", "mainPrizeTextView", "getMainPrizeTextView", "specialPrizeDescriptionTextView", "getSpecialPrizeDescriptionTextView", "specialPrizeImageView", "getSpecialPrizeImageView", "specialPrizeTextView", "getSpecialPrizeTextView", "timeTextView", "getTimeTextView", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: StreamInactiveFragment.kt */
public final class QuizHolder extends ViewHolder {
    @NotNull
    private final TextView mainPrizeDescriptionTextView;
    @NotNull
    private final ImageView mainPrizeImageView;
    @NotNull
    private final TextView mainPrizeTextView;
    @NotNull
    private final TextView specialPrizeDescriptionTextView;
    @NotNull
    private final ImageView specialPrizeImageView;
    @NotNull
    private final TextView specialPrizeTextView;
    @NotNull
    private final TextView timeTextView;

    public QuizHolder(@Nullable View view) {
        if (view == null) {
            Intrinsics.throwNpe();
        }
        super(view);
        View findViewById = view.findViewById(R.id.quiz_item_txt_time);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView!!.findViewById(R.id.quiz_item_txt_time)");
        this.timeTextView = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.quiz_item_img_main_prize);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView!!.findViewById(…quiz_item_img_main_prize)");
        this.mainPrizeImageView = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.quiz_item_txt_main_prize);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView!!.findViewById(…quiz_item_txt_main_prize)");
        this.mainPrizeTextView = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.quiz_item_txt_main_prize_description);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView!!.findViewById(…t_main_prize_description)");
        this.mainPrizeDescriptionTextView = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.quiz_item_img_special_prize);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView!!.findViewById(…z_item_img_special_prize)");
        this.specialPrizeImageView = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.quiz_item_txt_special_prize);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "itemView!!.findViewById(…z_item_txt_special_prize)");
        this.specialPrizeTextView = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.quiz_item_txt_special_prize_description);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "itemView!!.findViewById(…pecial_prize_description)");
        this.specialPrizeDescriptionTextView = (TextView) findViewById7;
    }

    @NotNull
    public final TextView getTimeTextView() {
        return this.timeTextView;
    }

    @NotNull
    public final ImageView getMainPrizeImageView() {
        return this.mainPrizeImageView;
    }

    @NotNull
    public final TextView getMainPrizeTextView() {
        return this.mainPrizeTextView;
    }

    @NotNull
    public final TextView getMainPrizeDescriptionTextView() {
        return this.mainPrizeDescriptionTextView;
    }

    @NotNull
    public final ImageView getSpecialPrizeImageView() {
        return this.specialPrizeImageView;
    }

    @NotNull
    public final TextView getSpecialPrizeTextView() {
        return this.specialPrizeTextView;
    }

    @NotNull
    public final TextView getSpecialPrizeDescriptionTextView() {
        return this.specialPrizeDescriptionTextView;
    }
}
