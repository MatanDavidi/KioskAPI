package com.valora.kkiosk.intro;

import android.os.Bundle;
import android.support.p000v4.app.Fragment;
import android.support.p000v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import com.valora.kkiosk.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo21491d2 = {"Lcom/valora/kkiosk/intro/ValoraIntroSlide;", "Landroid/support/v4/app/Fragment;", "()V", "backgroundResourceId", "", "contentText", "", "primaryColor", "textColor", "textColor2", "titleText", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: ValoraIntroSlide.kt */
public final class ValoraIntroSlide extends Fragment {
    private static final String ARG_BG_ID = "backgroundResourceId";
    private static final String ARG_COLOR_PRIMARY = "primaryColor";
    private static final String ARG_COLOR_TEXT = "textColor";
    private static final String ARG_COLOR_TEXT2 = "textColor2";
    private static final String ARG_TEXT_CONTENT = "contentText";
    private static final String ARG_TEXT_TITLE = "titleText";
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private int backgroundResourceId = -1;
    private String contentText;
    private int primaryColor = -1;
    private int textColor = -1;
    private int textColor2 = -1;
    private String titleText;

    @Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo21491d2 = {"Lcom/valora/kkiosk/intro/ValoraIntroSlide$Companion;", "", "()V", "ARG_BG_ID", "", "ARG_COLOR_PRIMARY", "ARG_COLOR_TEXT", "ARG_COLOR_TEXT2", "ARG_TEXT_CONTENT", "ARG_TEXT_TITLE", "newInstance", "Lcom/valora/kkiosk/intro/ValoraIntroSlide;", "title", "content", "background", "", "primaryColor", "textColor", "textColor2", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
    /* compiled from: ValoraIntroSlide.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ValoraIntroSlide newInstance(@NotNull String str, @NotNull String str2, int i, int i2, int i3, int i4) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(str2, Param.CONTENT);
            ValoraIntroSlide valoraIntroSlide = new ValoraIntroSlide();
            Bundle bundle = new Bundle();
            bundle.putString(ValoraIntroSlide.ARG_TEXT_TITLE, str);
            bundle.putString(ValoraIntroSlide.ARG_TEXT_CONTENT, str2);
            bundle.putInt(ValoraIntroSlide.ARG_BG_ID, i);
            bundle.putInt(ValoraIntroSlide.ARG_COLOR_PRIMARY, i2);
            bundle.putInt(ValoraIntroSlide.ARG_COLOR_TEXT, i3);
            bundle.putInt(ValoraIntroSlide.ARG_COLOR_TEXT2, i4);
            valoraIntroSlide.setArguments(bundle);
            return valoraIntroSlide;
        }
    }

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

    public ValoraIntroSlide() {
        String str = "";
        this.titleText = str;
        this.contentText = str;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                Intrinsics.throwNpe();
            }
            String string = arguments.getString(ARG_TEXT_TITLE);
            Intrinsics.checkExpressionValueIsNotNull(string, "arguments!!.getString(ARG_TEXT_TITLE)");
            this.titleText = string;
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                Intrinsics.throwNpe();
            }
            String string2 = arguments2.getString(ARG_TEXT_CONTENT);
            Intrinsics.checkExpressionValueIsNotNull(string2, "arguments!!.getString(ARG_TEXT_CONTENT)");
            this.contentText = string2;
            Bundle arguments3 = getArguments();
            if (arguments3 == null) {
                Intrinsics.throwNpe();
            }
            this.backgroundResourceId = arguments3.getInt(ARG_BG_ID);
            Bundle arguments4 = getArguments();
            if (arguments4 == null) {
                Intrinsics.throwNpe();
            }
            this.primaryColor = arguments4.getInt(ARG_COLOR_PRIMARY);
            Bundle arguments5 = getArguments();
            if (arguments5 == null) {
                Intrinsics.throwNpe();
            }
            this.textColor = arguments5.getInt(ARG_COLOR_TEXT);
            Bundle arguments6 = getArguments();
            if (arguments6 == null) {
                Intrinsics.throwNpe();
            }
            this.textColor2 = arguments6.getInt(ARG_COLOR_TEXT2);
        }
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.intro_slide, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.intro_img_bg);
        if (findViewById != null) {
            ImageView imageView = (ImageView) findViewById;
            View findViewById2 = inflate.findViewById(R.id.intro_txt_title);
            String str = "null cannot be cast to non-null type android.widget.TextView";
            if (findViewById2 != null) {
                TextView textView = (TextView) findViewById2;
                View findViewById3 = inflate.findViewById(R.id.intro_txt_content);
                if (findViewById3 != null) {
                    TextView textView2 = (TextView) findViewById3;
                    FragmentActivity activity = getActivity();
                    if (activity == null) {
                        Intrinsics.throwNpe();
                    }
                    Glide.with(activity).load(Integer.valueOf(this.backgroundResourceId)).centerCrop().into(imageView);
                    textView.setText(this.titleText);
                    textView2.setText(this.contentText);
                    textView.setTextColor(this.textColor);
                    textView2.setTextColor(this.textColor2);
                    return inflate;
                }
                throw new TypeCastException(str);
            }
            throw new TypeCastException(str);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
    }
}
