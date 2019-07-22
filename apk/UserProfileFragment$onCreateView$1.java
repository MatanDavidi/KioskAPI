package com.valora.kkiosk;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.valora.kkiosk.commons.models.UserGroup;
import com.valora.kkiosk.commons.view.UserGroupView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.threeten.p017bp.ZoneId;
import org.threeten.p017bp.ZonedDateTime;
import org.threeten.p017bp.temporal.ChronoUnit;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo21491d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: UserProfileFragment.kt */
final class UserProfileFragment$onCreateView$1 implements OnClickListener {
    final /* synthetic */ TextView $dobText;
    final /* synthetic */ UserProfileFragment this$0;

    UserProfileFragment$onCreateView$1(UserProfileFragment userProfileFragment, TextView textView) {
        this.this$0 = userProfileFragment;
        this.$dobText = textView;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        int i3;
        if (this.$dobText.isFocusable()) {
            if (this.this$0.dob != null) {
                ZonedDateTime access$getDob$p = this.this$0.dob;
                if (access$getDob$p == null) {
                    Intrinsics.throwNpe();
                }
                int year = access$getDob$p.getYear();
                ZonedDateTime access$getDob$p2 = this.this$0.dob;
                if (access$getDob$p2 == null) {
                    Intrinsics.throwNpe();
                }
                int monthValue = access$getDob$p2.getMonthValue();
                ZonedDateTime access$getDob$p3 = this.this$0.dob;
                if (access$getDob$p3 == null) {
                    Intrinsics.throwNpe();
                }
                i3 = year;
                i = access$getDob$p3.getDayOfMonth();
                i2 = monthValue;
            } else {
                i3 = 1980;
                i2 = 0;
                i = 1;
            }
            DatePickerDialog datePickerDialog = new DatePickerDialog(this.this$0.getActivity(), new OnDateSetListener(this) {
                final /* synthetic */ UserProfileFragment$onCreateView$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    TextView textView = this.this$0.$dobText;
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(i3));
                    String str = "/";
                    sb.append(str);
                    int i4 = i2 + 1;
                    sb.append(String.valueOf(i4));
                    sb.append(str);
                    sb.append(String.valueOf(i));
                    textView.setText(sb.toString(), BufferType.EDITABLE);
                    this.this$0.this$0.dob = ZonedDateTime.m186of(i, i4, i3, 12, 0, 0, 0, ZoneId.systemDefault());
                    UserGroup userGroup = null;
                    ChronoUnit chronoUnit = ChronoUnit.YEARS;
                    ZonedDateTime access$getDob$p = this.this$0.this$0.dob;
                    if (access$getDob$p == null) {
                        Intrinsics.throwNpe();
                    }
                    if (chronoUnit.between(access$getDob$p, ZonedDateTime.now()) < ((long) 18)) {
                        userGroup = new UserGroup(UserGroupView.GROUP_ID_TABACCO_OFFERS, null, false, null, null);
                    }
                    this.this$0.this$0.updateUser(userGroup);
                }
            }, i3, i2, i);
            datePickerDialog.show();
        }
    }
}
