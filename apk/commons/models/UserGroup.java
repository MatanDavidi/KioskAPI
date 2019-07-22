package com.valora.kkiosk.commons.models;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/models/UserGroup;", "Ljava/io/Serializable;", "GroupId", "", "GroupDescription", "IsUserMember", "", "UserConfigurable", "UserCode", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getGroupDescription", "()Ljava/lang/String;", "getGroupId", "getIsUserMember", "()Z", "getUserCode", "getUserConfigurable", "isCodeNeeded", "isUserConfigurable", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: User.kt */
public final class UserGroup implements Serializable {
    @Nullable
    private final String GroupDescription;
    @NotNull
    private final String GroupId;
    private final boolean IsUserMember;
    @Nullable
    private final String UserCode;
    @Nullable
    private final String UserConfigurable;

    public UserGroup(@NotNull String str, @Nullable String str2, boolean z, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkParameterIsNotNull(str, "GroupId");
        this.GroupId = str;
        this.GroupDescription = str2;
        this.IsUserMember = z;
        this.UserConfigurable = str3;
        this.UserCode = str4;
    }

    @NotNull
    public final String getGroupId() {
        return this.GroupId;
    }

    @Nullable
    public final String getGroupDescription() {
        return this.GroupDescription;
    }

    public final boolean getIsUserMember() {
        return this.IsUserMember;
    }

    @Nullable
    public final String getUserConfigurable() {
        return this.UserConfigurable;
    }

    @Nullable
    public final String getUserCode() {
        return this.UserCode;
    }

    public final boolean isUserConfigurable() {
        return !Intrinsics.areEqual((Object) this.UserConfigurable, (Object) "NotConfigurable");
    }

    public final boolean isCodeNeeded() {
        return Intrinsics.areEqual((Object) this.UserConfigurable, (Object) "CodeConfigurable");
    }
}
