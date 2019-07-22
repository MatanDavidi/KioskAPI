package com.valora.kkiosk.commons.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import com.afollestad.materialdialogs.MaterialDialog.Builder;
import com.afollestad.materialdialogs.MaterialDialog.InputCallback;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.valora.kkiosk.R;
import com.valora.kkiosk.commons.models.UserGroup;
import com.valora.kkioskPreview.C1224R;
import iammert.com.expandablelib.ExpandableLayout;
import iammert.com.expandablelib.Section;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.threeten.p017bp.ZonedDateTime;
import org.threeten.p017bp.temporal.ChronoUnit;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fJ\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0010H\u0002J \u0010!\u001a\u00020\u00152\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/view/UserGroupView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "callbacks", "Lcom/valora/kkiosk/commons/view/UserGroupCallbacks;", "dob", "Lorg/threeten/bp/ZonedDateTime;", "isExpanded", "", "userGroups", "", "Lcom/valora/kkiosk/commons/models/UserGroup;", "renderUserGroups", "", "setListener", "listener", "showDialogAlreadySmoking", "showQrCodeScanner", "userGroup", "showTabaccoInfoDialog", "signUpForTabaccoOffers", "updateUserGroup", "groupId", "", "isChecked", "updateUserGroups", "Companion", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: UserGroupView.kt */
public final class UserGroupView extends LinearLayout {
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String GROUP_ID_TABACCO_OFFERS = "Tabak-Aktionen";
    public static final int REQUEST_CODE_QR = 2607;
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public UserGroupCallbacks callbacks;
    private ZonedDateTime dob;
    /* access modifiers changed from: private */
    public boolean isExpanded;
    private List<UserGroup> userGroups;

    @Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/view/UserGroupView$Companion;", "", "()V", "GROUP_ID_TABACCO_OFFERS", "", "REQUEST_CODE_QR", "", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
    /* compiled from: UserGroupView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public UserGroupView(@Nullable Context context) {
        this(context, null);
    }

    public UserGroupView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UserGroupView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.usergroup_view, this, true);
    }

    public final void updateUserGroups(@Nullable List<UserGroup> list, @Nullable ZonedDateTime zonedDateTime) {
        if (list != null) {
            this.userGroups = list;
        }
        if (zonedDateTime != null) {
            this.dob = zonedDateTime;
        }
        renderUserGroups();
    }

    public final void setListener(@NotNull UserGroupCallbacks userGroupCallbacks) {
        Intrinsics.checkParameterIsNotNull(userGroupCallbacks, CastExtraArgs.LISTENER);
        this.callbacks = userGroupCallbacks;
    }

    private final void renderUserGroups() {
        if (this.userGroups != null && this.dob != null) {
            Section section = new Section();
            section.parent = getContext().getString(R.string.membergroups_employee_offers);
            section.expanded = this.isExpanded;
            ExpandableLayout expandableLayout = (ExpandableLayout) _$_findCachedViewById(C1224R.C1226id.linear_layout_mitarbeiterrabatte);
            Intrinsics.checkExpressionValueIsNotNull(expandableLayout, "linear_layout_mitarbeiterrabatte");
            expandableLayout.getSections().clear();
            ((ExpandableLayout) _$_findCachedViewById(C1224R.C1226id.linear_layout_mitarbeiterrabatte)).removeAllViews();
            ((Switch) _$_findCachedViewById(C1224R.C1226id.switch_membergroup_tabak)).setOnCheckedChangeListener(null);
            List<UserGroup> list = this.userGroups;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            for (UserGroup userGroup : list) {
                if (Intrinsics.areEqual((Object) userGroup.getGroupId(), (Object) GROUP_ID_TABACCO_OFFERS)) {
                    ChronoUnit chronoUnit = ChronoUnit.YEARS;
                    ZonedDateTime zonedDateTime = this.dob;
                    if (zonedDateTime == null) {
                        Intrinsics.throwNpe();
                    }
                    String str = "frame_layout_tabacco";
                    if (chronoUnit.between(zonedDateTime, ZonedDateTime.now()) < ((long) 18)) {
                        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(C1224R.C1226id.frame_layout_tabacco);
                        Intrinsics.checkExpressionValueIsNotNull(frameLayout, str);
                        frameLayout.setVisibility(8);
                    } else {
                        FrameLayout frameLayout2 = (FrameLayout) _$_findCachedViewById(C1224R.C1226id.frame_layout_tabacco);
                        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, str);
                        frameLayout2.setVisibility(0);
                    }
                    Switch switchR = (Switch) _$_findCachedViewById(C1224R.C1226id.switch_membergroup_tabak);
                    Intrinsics.checkExpressionValueIsNotNull(switchR, "switch_membergroup_tabak");
                    switchR.setChecked(userGroup.getIsUserMember());
                } else if (userGroup.isUserConfigurable()) {
                    section.children.add(userGroup);
                }
            }
            ((ImageButton) _$_findCachedViewById(C1224R.C1226id.image_button_help_member_group)).setOnClickListener(new UserGroupView$renderUserGroups$1(this));
            ((Switch) _$_findCachedViewById(C1224R.C1226id.switch_membergroup_tabak)).setOnCheckedChangeListener(new UserGroupView$renderUserGroups$2(this));
            ((ExpandableLayout) _$_findCachedViewById(C1224R.C1226id.linear_layout_mitarbeiterrabatte)).setRenderer(new UserGroupView$renderUserGroups$3(this));
            ((ExpandableLayout) _$_findCachedViewById(C1224R.C1226id.linear_layout_mitarbeiterrabatte)).setExpandListener(new UserGroupView$renderUserGroups$4(this));
            ((ExpandableLayout) _$_findCachedViewById(C1224R.C1226id.linear_layout_mitarbeiterrabatte)).setCollapseListener(new UserGroupView$renderUserGroups$5(this));
            ((ExpandableLayout) _$_findCachedViewById(C1224R.C1226id.linear_layout_mitarbeiterrabatte)).addSection(section);
        }
    }

    /* access modifiers changed from: private */
    public final void updateUserGroup(String str, boolean z) {
        UserGroup userGroup = new UserGroup(str, null, z, null, null);
        UserGroupCallbacks userGroupCallbacks = this.callbacks;
        if (userGroupCallbacks != null) {
            userGroupCallbacks.updateUserGroup(userGroup);
        }
    }

    /* access modifiers changed from: private */
    public final void showQrCodeScanner(UserGroup userGroup) {
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        new Builder(context).title((int) R.string.membergroups_qr_code).content((int) R.string.membergroups_qr_info).input((CharSequence) "Code", (CharSequence) "", (InputCallback) new UserGroupView$showQrCodeScanner$1(this, userGroup)).neutralText((int) R.string.membergroups_qr_scan).onNeutral(new UserGroupView$showQrCodeScanner$2(this, userGroup)).positiveText((int) R.string.membergroups_ok).build().show();
    }

    /* access modifiers changed from: private */
    public final void showTabaccoInfoDialog() {
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        new Builder(context).title((int) R.string.membergroups_tabacco_title).content((int) R.string.membergroups_tabacco_info).positiveText((int) R.string.membergroups_ok).build().show();
    }

    /* access modifiers changed from: private */
    public final void signUpForTabaccoOffers() {
        Switch switchR = (Switch) _$_findCachedViewById(C1224R.C1226id.switch_membergroup_tabak);
        Intrinsics.checkExpressionValueIsNotNull(switchR, "switch_membergroup_tabak");
        switchR.setChecked(false);
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        new Builder(context).title((int) R.string.membergroups_tabacco_age_title).content((int) R.string.membergroups_tabacco_age_info).negativeText((int) R.string.membergroups_no).positiveText((int) R.string.membergroups_yes).onPositive(new UserGroupView$signUpForTabaccoOffers$1(this)).build().show();
    }

    /* access modifiers changed from: private */
    public final void showDialogAlreadySmoking() {
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        new Builder(context).title((int) R.string.membergroups_smoker_title).content((int) R.string.membergroups_smoker_info).negativeText((int) R.string.membergroups_no).positiveText((int) R.string.membergroups_yes).onPositive(new UserGroupView$showDialogAlreadySmoking$1(this)).build().show();
    }
}
