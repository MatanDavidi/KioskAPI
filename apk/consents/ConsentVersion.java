package com.valora.kkiosk.consents;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import com.valora.kkiosk.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0005H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001e"}, mo21491d2 = {"Lcom/valora/kkiosk/consents/ConsentVersion;", "Ljava/io/Serializable;", "Id", "", "Title", "", "Version", "Description", "DefaultState", "", "RevokeWarningText", "MinimumAge", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V", "getDefaultState", "()Z", "getDescription", "()Ljava/lang/String;", "getId", "()I", "getMinimumAge", "getRevokeWarningText", "getTitle", "getVersion", "getRevokeWarningDialog", "Landroid/app/AlertDialog$Builder;", "activity", "Landroid/app/Activity;", "onPositiveClickListener", "Landroid/content/DialogInterface$OnClickListener;", "toString", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Consent.kt */
public final class ConsentVersion implements Serializable {
    private final boolean DefaultState;
    @NotNull
    private final String Description;

    /* renamed from: Id */
    private final int f244Id;
    private final int MinimumAge;
    @NotNull
    private final String RevokeWarningText;
    @NotNull
    private final String Title;
    @NotNull
    private final String Version;

    public ConsentVersion(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "Title");
        Intrinsics.checkParameterIsNotNull(str2, "Version");
        Intrinsics.checkParameterIsNotNull(str3, "Description");
        Intrinsics.checkParameterIsNotNull(str4, "RevokeWarningText");
        this.f244Id = i;
        this.Title = str;
        this.Version = str2;
        this.Description = str3;
        this.DefaultState = z;
        this.RevokeWarningText = str4;
        this.MinimumAge = i2;
    }

    public final int getId() {
        return this.f244Id;
    }

    @NotNull
    public final String getTitle() {
        return this.Title;
    }

    @NotNull
    public final String getVersion() {
        return this.Version;
    }

    @NotNull
    public final String getDescription() {
        return this.Description;
    }

    public final boolean getDefaultState() {
        return this.DefaultState;
    }

    @NotNull
    public final String getRevokeWarningText() {
        return this.RevokeWarningText;
    }

    public final int getMinimumAge() {
        return this.MinimumAge;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id=");
        sb.append(this.f244Id);
        sb.append(" Title=");
        sb.append(this.Title);
        sb.append(" Version=");
        sb.append(this.Version);
        sb.append(" Description=");
        sb.append(this.Description);
        sb.append(" DefaultState=");
        sb.append(this.DefaultState);
        sb.append(" MinimumAge=");
        sb.append(this.MinimumAge);
        return sb.toString();
    }

    @NotNull
    public final Builder getRevokeWarningDialog(@NotNull Activity activity, @NotNull OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(onClickListener, "onPositiveClickListener");
        Builder negativeButton = new Builder(activity).setTitle(this.Title).setMessage(this.RevokeWarningText).setPositiveButton(R.string.allow, onClickListener).setNegativeButton(R.string.reject, ConsentVersion$getRevokeWarningDialog$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(negativeButton, "AlertDialog.Builder(acti…miss()\n                })");
        return negativeButton;
    }
}
