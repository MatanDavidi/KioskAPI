package com.valora.kkiosk.trivia;

import android.content.Intent;
import android.os.Bundle;
import android.support.p000v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.valora.kkiosk.R;
import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import com.valora.kkiosk.trivia.models.Dealini;
import com.valora.kkiosk.trivia.models.TriviaLanguageItem;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/HasLostFragment;", "Landroid/support/v4/app/Fragment;", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: HasLostFragment.kt */
public final class HasLostFragment extends Fragment {
    private HashMap _$_findViewCache;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intent intent;
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.trivia_fragment_has_lost, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.trivia_fragment_has_lost_btn_dealini);
        Button button2 = (Button) inflate.findViewById(R.id.trivia_fragment_has_lost_btn_action);
        TextView textView = (TextView) inflate.findViewById(R.id.trivia_fragment_has_lost_txt_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.trivia_fragment_has_lost_txt_text);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString(HasLostFragmentKt.EXTRA_WINNING_STATE, null) : null;
            Bundle arguments2 = getArguments();
            Serializable serializable = arguments2 != null ? arguments2.getSerializable(TriviaActivityKt.EXTRA_DEALINI) : null;
            if (string == null) {
                Intrinsics.throwNpe();
            }
            String str = "actionButton";
            String str2 = "textTextView";
            String str3 = "titleTextView";
            if (Intrinsics.areEqual((Object) string, (Object) WinningState.SPECIAL_PRIZE)) {
                Intrinsics.checkExpressionValueIsNotNull(textView, str3);
                textView.setText(getResources().getString(R.string.near_miss));
                Intrinsics.checkExpressionValueIsNotNull(textView2, str2);
                textView2.setText(getResources().getString(R.string.you_won_a_special_prize));
                Intrinsics.checkExpressionValueIsNotNull(button2, str);
                button2.setText(getResources().getString(R.string.to_your_special_prize));
            } else {
                Intrinsics.checkExpressionValueIsNotNull(textView, str3);
                textView.setText(getResources().getString(R.string.you_didnt_make_it));
                Intrinsics.checkExpressionValueIsNotNull(textView2, str2);
                textView2.setText(getResources().getString(R.string.good_luck_next_time));
                Intrinsics.checkExpressionValueIsNotNull(button2, str);
                button2.setText(getResources().getString(R.string.keep_watching));
            }
            if (serializable == null) {
                intent = DealiniLinks.INSTANCE.getPlayOnDealiniIntent(null);
            } else {
                DealiniLinks dealiniLinks = DealiniLinks.INSTANCE;
                Dealini dealini = (Dealini) serializable;
                TriviaLanguageItem link = dealini.getLink();
                if (link == null) {
                    Intrinsics.throwNpe();
                }
                String textByLanguage = link.getTextByLanguage(ApiConfig.INSTANCE.getUserLanguage());
                if (textByLanguage == null) {
                    Intrinsics.throwNpe();
                }
                intent = dealiniLinks.getPlayOnDealiniIntent(textByLanguage);
                TriviaLanguageItem text = dealini.getText();
                if (text == null) {
                    Intrinsics.throwNpe();
                }
                String textByLanguage2 = text.getTextByLanguage(ApiConfig.INSTANCE.getUserLanguage());
                Intrinsics.checkExpressionValueIsNotNull(button, "dealiniButton");
                button.setText(textByLanguage2);
            }
            button.setOnClickListener(new HasLostFragment$onCreateView$1(this, intent));
            button2.setOnClickListener(new HasLostFragment$onCreateView$2(this, string));
            return inflate;
        }
        throw new IllegalArgumentException("estimateReached extra not provided");
    }
}
