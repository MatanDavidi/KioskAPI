package com.valora.kkiosk.commons.models;

import com.valora.kkiosk.consents.Consent;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r¢\u0006\u0002\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u0006\u001f"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/models/UserData;", "Ljava/io/Serializable;", "UserId", "", "Msn", "Name", "Address", "Postcode", "City", "DateOfBirth", "Gender", "UserMyPage", "UserGroups", "", "Lcom/valora/kkiosk/commons/models/UserGroup;", "Consents", "Lcom/valora/kkiosk/consents/Consent;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAddress", "()Ljava/lang/String;", "getCity", "getConsents", "()Ljava/util/List;", "getDateOfBirth", "getGender", "getMsn", "getName", "getPostcode", "getUserGroups", "getUserId", "getUserMyPage", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: User.kt */
public final class UserData implements Serializable {
    @Nullable
    private final String Address;
    @Nullable
    private final String City;
    @Nullable
    private final List<Consent> Consents;
    @Nullable
    private final String DateOfBirth;
    @Nullable
    private final String Gender;
    @NotNull
    private final String Msn;
    @Nullable
    private final String Name;
    @Nullable
    private final String Postcode;
    @Nullable
    private final List<UserGroup> UserGroups;
    @NotNull
    private final String UserId;
    @Nullable
    private final String UserMyPage;

    public UserData(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<UserGroup> list, @Nullable List<Consent> list2) {
        Intrinsics.checkParameterIsNotNull(str, "UserId");
        Intrinsics.checkParameterIsNotNull(str2, "Msn");
        this.UserId = str;
        this.Msn = str2;
        this.Name = str3;
        this.Address = str4;
        this.Postcode = str5;
        this.City = str6;
        this.DateOfBirth = str7;
        this.Gender = str8;
        this.UserMyPage = str9;
        this.UserGroups = list;
        this.Consents = list2;
    }

    @NotNull
    public final String getUserId() {
        return this.UserId;
    }

    @NotNull
    public final String getMsn() {
        return this.Msn;
    }

    @Nullable
    public final String getName() {
        return this.Name;
    }

    @Nullable
    public final String getAddress() {
        return this.Address;
    }

    @Nullable
    public final String getPostcode() {
        return this.Postcode;
    }

    @Nullable
    public final String getCity() {
        return this.City;
    }

    @Nullable
    public final String getDateOfBirth() {
        return this.DateOfBirth;
    }

    @Nullable
    public final String getGender() {
        return this.Gender;
    }

    @Nullable
    public final String getUserMyPage() {
        return this.UserMyPage;
    }

    @Nullable
    public final List<UserGroup> getUserGroups() {
        return this.UserGroups;
    }

    @Nullable
    public final List<Consent> getConsents() {
        return this.Consents;
    }
}
