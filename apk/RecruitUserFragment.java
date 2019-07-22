package com.valora.kkiosk;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.valora.kkiosk.commons.extensions.ExtensionsKt;
import com.valora.kkiosk.commons.extensions.Helper;
import com.valora.kkiosk.commons.extensions.RxBaseFragment;
import com.valora.kkiosk.commons.features.UserManager;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo21491d2 = {"Lcom/valora/kkiosk/RecruitUserFragment;", "Lcom/valora/kkiosk/commons/extensions/RxBaseFragment;", "()V", "userManager", "Lcom/valora/kkiosk/commons/features/UserManager;", "getUserManager", "()Lcom/valora/kkiosk/commons/features/UserManager;", "userManager$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: RecruitUserFragment.kt */
public final class RecruitUserFragment extends RxBaseFragment {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RecruitUserFragment.class), "userManager", "getUserManager()Lcom/valora/kkiosk/commons/features/UserManager;"))};
    private HashMap _$_findViewCache;
    private final Lazy userManager$delegate = LazyKt.lazy(RecruitUserFragment$userManager$2.INSTANCE);

    /* access modifiers changed from: private */
    public final UserManager getUserManager() {
        Lazy lazy = this.userManager$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (UserManager) lazy.getValue();
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

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = viewGroup != null ? ExtensionsKt.inflate(viewGroup, R.layout.fragment_recruit_user) : null;
        if (inflate == null) {
            Intrinsics.throwNpe();
        }
        View findViewById = inflate.findViewById(R.id.friend_phone_number_text);
        if (findViewById != null) {
            EditText editText = (EditText) findViewById;
            TextView textView = (TextView) inflate.findViewById(R.id.fragment_recruit_user_txt_error);
            Helper helper = Helper.INSTANCE;
            Context context = getContext();
            if (context != null) {
                FirebaseAnalytics firebaseAnalytics = ((MainActivity) context).getFirebaseAnalytics();
                if (firebaseAnalytics == null) {
                    Intrinsics.throwNpe();
                }
                helper.logEvent(firebaseAnalytics, NativeProtocol.WEB_DIALOG_ACTION, "sharing", "begins");
                View findViewById2 = inflate.findViewById(R.id.recruit_button);
                if (findViewById2 != null) {
                    ((Button) findViewById2).setOnClickListener(new RecruitUserFragment$onCreateView$1(this, editText, inflate, textView));
                    View findViewById3 = inflate.findViewById(R.id.contacts_button);
                    if (findViewById3 != null) {
                        ((ImageButton) findViewById3).setOnClickListener(new RecruitUserFragment$onCreateView$2(this));
                        editText.addTextChangedListener(new RecruitUserFragment$onCreateView$3(textView));
                        return inflate;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageButton");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.Button");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.MainActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.EditText");
    }
}
