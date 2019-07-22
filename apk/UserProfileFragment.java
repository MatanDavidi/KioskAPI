package com.valora.kkiosk;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.valora.kkiosk.commons.extensions.ExtensionsKt;
import com.valora.kkiosk.commons.extensions.RxBaseFragment;
import com.valora.kkiosk.commons.features.UserManager;
import com.valora.kkiosk.commons.models.UserData;
import com.valora.kkiosk.commons.models.UserGroup;
import com.valora.kkiosk.commons.view.UserGroupCallbacks;
import com.valora.kkiosk.consents.ConsentCallbacks;
import com.valora.kkiosk.consents.Consents;
import com.valora.kkioskPreview.C1224R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
import org.threeten.p017bp.ZonedDateTime;
import org.threeten.p017bp.format.DateTimeFormatter;
import p018rx.android.schedulers.AndroidSchedulers;
import p018rx.functions.Action1;
import p018rx.schedulers.Schedulers;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\b\u0010$\u001a\u00020 H\u0002J\"\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J&\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00104\u001a\u00020 H\u0016J\u0012\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020 H\u0016J\u001a\u0010:\u001a\u00020 2\u0006\u0010;\u001a\u00020/2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010<\u001a\u00020 2\u0006\u0010=\u001a\u00020>H\u0016J\u0014\u0010?\u001a\u00020 2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>H\u0002J\u0010\u0010@\u001a\u00020 2\u0006\u0010=\u001a\u00020>H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R#\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0015\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001c\u0010\u001d¨\u0006A"}, mo21491d2 = {"Lcom/valora/kkiosk/UserProfileFragment;", "Lcom/valora/kkiosk/commons/extensions/RxBaseFragment;", "Lcom/valora/kkiosk/commons/view/UserGroupCallbacks;", "()V", "consents", "Lcom/valora/kkiosk/consents/Consents;", "getConsents", "()Lcom/valora/kkiosk/consents/Consents;", "setConsents", "(Lcom/valora/kkiosk/consents/Consents;)V", "dialog", "Landroid/app/ProgressDialog;", "dob", "Lorg/threeten/bp/ZonedDateTime;", "dobFormatter", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "getDobFormatter", "()Lorg/threeten/bp/format/DateTimeFormatter;", "dobFormatter$delegate", "Lkotlin/Lazy;", "uiDobFormatter", "getUiDobFormatter", "uiDobFormatter$delegate", "user", "Lcom/valora/kkiosk/commons/models/UserData;", "userManager", "Lcom/valora/kkiosk/commons/features/UserManager;", "getUserManager", "()Lcom/valora/kkiosk/commons/features/UserManager;", "userManager$delegate", "enterPrivateGroup", "", "groupName", "", "code", "loadUser", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onMemberGroupSectionExpanded", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onPause", "onViewCreated", "view", "showQrCodeScanner", "userGroup", "Lcom/valora/kkiosk/commons/models/UserGroup;", "updateUser", "updateUserGroup", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: UserProfileFragment.kt */
public final class UserProfileFragment extends RxBaseFragment implements UserGroupCallbacks {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(UserProfileFragment.class), "userManager", "getUserManager()Lcom/valora/kkiosk/commons/features/UserManager;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(UserProfileFragment.class), "dobFormatter", "getDobFormatter()Lorg/threeten/bp/format/DateTimeFormatter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(UserProfileFragment.class), "uiDobFormatter", "getUiDobFormatter()Lorg/threeten/bp/format/DateTimeFormatter;"))};
    private HashMap _$_findViewCache;
    @NotNull
    public Consents consents;
    /* access modifiers changed from: private */
    public ProgressDialog dialog;
    /* access modifiers changed from: private */
    public ZonedDateTime dob;
    private final Lazy dobFormatter$delegate = LazyKt.lazy(UserProfileFragment$dobFormatter$2.INSTANCE);
    private final Lazy uiDobFormatter$delegate = LazyKt.lazy(UserProfileFragment$uiDobFormatter$2.INSTANCE);
    /* access modifiers changed from: private */
    public UserData user;
    private final Lazy userManager$delegate = LazyKt.lazy(UserProfileFragment$userManager$2.INSTANCE);

    /* access modifiers changed from: private */
    public final DateTimeFormatter getDobFormatter() {
        Lazy lazy = this.dobFormatter$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (DateTimeFormatter) lazy.getValue();
    }

    /* access modifiers changed from: private */
    public final DateTimeFormatter getUiDobFormatter() {
        Lazy lazy = this.uiDobFormatter$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (DateTimeFormatter) lazy.getValue();
    }

    private final UserManager getUserManager() {
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

    @NotNull
    public final Consents getConsents() {
        Consents consents2 = this.consents;
        if (consents2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consents");
        }
        return consents2;
    }

    public final void setConsents(@NotNull Consents consents2) {
        Intrinsics.checkParameterIsNotNull(consents2, "<set-?>");
        this.consents = consents2;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        loadUser();
        setHasOptionsMenu(true);
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = viewGroup != null ? ExtensionsKt.inflate(viewGroup, R.layout.fragment_user_profile) : null;
        Bundle arguments = getArguments();
        if (arguments == null) {
            Intrinsics.throwNpe();
        }
        Serializable serializable = arguments.getSerializable(SplashActivityKt.EXTRA_CONSENTS);
        if (serializable != null) {
            this.consents = (Consents) serializable;
            if (!(getActivity() instanceof ConsentCallbacks)) {
                StringBuilder sb = new StringBuilder();
                sb.append(UserProfileFragment.class.getSimpleName());
                sb.append(" parent activity must implement ");
                sb.append(ConsentCallbacks.class.getSimpleName());
                new IllegalStateException(sb.toString());
            }
            if (inflate == null) {
                Intrinsics.throwNpe();
            }
            View findViewById = inflate.findViewById(R.id.dob_text);
            if (findViewById != null) {
                TextView textView = (TextView) findViewById;
                textView.setOnClickListener(new UserProfileFragment$onCreateView$1(this, textView));
                View findViewById2 = inflate.findViewById(R.id.button_consents);
                String str = "null cannot be cast to non-null type android.widget.Button";
                if (findViewById2 != null) {
                    ((Button) findViewById2).setOnClickListener(new UserProfileFragment$onCreateView$2(this));
                    View findViewById3 = inflate.findViewById(R.id.button_save);
                    if (findViewById3 != null) {
                        ((Button) findViewById3).setOnClickListener(new UserProfileFragment$onCreateView$3(this));
                        return inflate;
                    }
                    throw new TypeCastException(str);
                }
                throw new TypeCastException(str);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.valora.kkiosk.consents.Consents");
    }

    public void onPause() {
        super.onPause();
        ProgressDialog progressDialog = this.dialog;
        if (progressDialog != null) {
            if (progressDialog == null) {
                Intrinsics.throwNpe();
            }
            progressDialog.dismiss();
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
    }

    /* access modifiers changed from: private */
    public final void loadUser() {
        this.dialog = new ProgressDialog(getActivity(), 0);
        ProgressDialog progressDialog = this.dialog;
        if (progressDialog == null) {
            Intrinsics.throwNpe();
        }
        progressDialog.setMessage(getString(R.string.please_wait));
        ProgressDialog progressDialog2 = this.dialog;
        if (progressDialog2 == null) {
            Intrinsics.throwNpe();
        }
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.dialog;
        if (progressDialog3 == null) {
            Intrinsics.throwNpe();
        }
        progressDialog3.show();
        getSubscriptions().add(getUserManager().getUser().subscribeOn(Schedulers.m217io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1<? super T>) new UserProfileFragment$loadUser$s$1<Object>(this), (Action1<Throwable>) new UserProfileFragment$loadUser$s$2<Throwable>(this)));
    }

    static /* synthetic */ void updateUser$default(UserProfileFragment userProfileFragment, UserGroup userGroup, int i, Object obj) {
        if ((i & 1) != 0) {
            userGroup = null;
        }
        userProfileFragment.updateUser(userGroup);
    }

    /* access modifiers changed from: private */
    public final void updateUser(UserGroup userGroup) {
        this.dialog = new ProgressDialog(getActivity(), 0);
        ProgressDialog progressDialog = this.dialog;
        if (progressDialog == null) {
            Intrinsics.throwNpe();
        }
        progressDialog.setMessage(getString(R.string.please_wait));
        ProgressDialog progressDialog2 = this.dialog;
        if (progressDialog2 == null) {
            Intrinsics.throwNpe();
        }
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.dialog;
        if (progressDialog3 == null) {
            Intrinsics.throwNpe();
        }
        progressDialog3.show();
        UserManager userManager = getUserManager();
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        EditText editText = (EditText) _$_findCachedViewById(C1224R.C1226id.name_text);
        Intrinsics.checkExpressionValueIsNotNull(editText, "name_text");
        String obj = editText.getText().toString();
        ZonedDateTime zonedDateTime = this.dob;
        if (zonedDateTime == null) {
            Intrinsics.throwNpe();
        }
        Consents consents2 = this.consents;
        String str = "consents";
        if (consents2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        List approvedConsentIdList = consents2.getApprovedConsentIdList();
        Consents consents3 = this.consents;
        if (consents3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        getSubscriptions().add(UserManager.updateUser$default(userManager, context, obj, null, zonedDateTime, userGroup, approvedConsentIdList, consents3.getRevokedConsentIdList(), 4, null).subscribeOn(Schedulers.m217io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1<? super T>) new UserProfileFragment$updateUser$s$1<Object>(this), (Action1<Throwable>) new UserProfileFragment$updateUser$s$2<Throwable>(this)));
        Button button = (Button) _$_findCachedViewById(C1224R.C1226id.button_save);
        Intrinsics.checkExpressionValueIsNotNull(button, "button_save");
        button.setEnabled(false);
    }

    public boolean onOptionsItemSelected(@Nullable MenuItem menuItem) {
        if (menuItem == null) {
            Intrinsics.throwNpe();
        }
        if (menuItem.getItemId() == R.id.action_edit) {
            EditText editText = (EditText) _$_findCachedViewById(C1224R.C1226id.name_text);
            String str = "name_text";
            Intrinsics.checkExpressionValueIsNotNull(editText, str);
            editText.setFocusableInTouchMode(true);
            EditText editText2 = (EditText) _$_findCachedViewById(C1224R.C1226id.name_text);
            Intrinsics.checkExpressionValueIsNotNull(editText2, str);
            editText2.setCursorVisible(true);
            TextView textView = (TextView) _$_findCachedViewById(C1224R.C1226id.dob_text);
            Intrinsics.checkExpressionValueIsNotNull(textView, "dob_text");
            textView.setFocusable(true);
            Button button = (Button) _$_findCachedViewById(C1224R.C1226id.button_save);
            Intrinsics.checkExpressionValueIsNotNull(button, "button_save");
            button.setVisibility(0);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (i == 1289 && i2 == -1 && getView() != null) {
            View view = getView();
            if (view == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(view, "view!!");
            onViewCreated(view, null);
        }
        if (i == 2607 && i2 == -1) {
            ((Button) _$_findCachedViewById(C1224R.C1226id.button_save)).post(new UserProfileFragment$onActivityResult$1(this, intent));
        }
        super.onActivityResult(i, i2, intent);
    }

    public void enterPrivateGroup(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "groupName");
        Intrinsics.checkParameterIsNotNull(str2, CodeActivity.EXTRA_CODE);
        UserGroup userGroup = new UserGroup(str, null, true, null, str2);
        updateUser(userGroup);
    }

    public void onMemberGroupSectionExpanded() {
        ((ScrollView) _$_findCachedViewById(C1224R.C1226id.scroll_view_profile)).postDelayed(new UserProfileFragment$onMemberGroupSectionExpanded$1(this), 100);
    }

    public void updateUserGroup(@NotNull UserGroup userGroup) {
        Intrinsics.checkParameterIsNotNull(userGroup, "userGroup");
        updateUser(userGroup);
    }

    public void showQrCodeScanner(@NotNull UserGroup userGroup) {
        Intrinsics.checkParameterIsNotNull(userGroup, "userGroup");
        Intent intent = new Intent(getContext(), CodeActivity.class);
        intent.putExtra("name", userGroup.getGroupId());
        startActivityForResult(intent, 2607);
    }
}
