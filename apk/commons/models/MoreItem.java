package com.valora.kkiosk.commons.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/models/MoreItem;", "", "title", "", "(Ljava/lang/String;)V", "name", "icon", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getIcon", "()I", "isGroupHeader", "", "()Z", "setGroupHeader", "(Z)V", "getName", "()Ljava/lang/String;", "getTitle", "Name", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: MoreItem.kt */
public final class MoreItem {
    private final int icon;
    private boolean isGroupHeader;
    @NotNull
    private final String name;
    @NotNull
    private final String title;

    @Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/models/MoreItem$Name;", "", "()V", "Faq", "", "getFaq", "()Ljava/lang/String;", "PrivacyStatement", "getPrivacyStatement", "Profile", "getProfile", "Register", "getRegister", "Share", "getShare", "StoreFinder", "getStoreFinder", "Support", "getSupport", "Toc", "getToc", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
    /* compiled from: MoreItem.kt */
    public static final class Name {
        @NotNull
        private static final String Faq = Faq;
        public static final Name INSTANCE = new Name();
        @NotNull
        private static final String PrivacyStatement = PrivacyStatement;
        @NotNull
        private static final String Profile = "profile";
        @NotNull
        private static final String Register = Register;
        @NotNull
        private static final String Share = "share";
        @NotNull
        private static final String StoreFinder = StoreFinder;
        @NotNull
        private static final String Support = Support;
        @NotNull
        private static final String Toc = Toc;

        private Name() {
        }

        @NotNull
        public final String getStoreFinder() {
            return StoreFinder;
        }

        @NotNull
        public final String getShare() {
            return Share;
        }

        @NotNull
        public final String getRegister() {
            return Register;
        }

        @NotNull
        public final String getProfile() {
            return Profile;
        }

        @NotNull
        public final String getPrivacyStatement() {
            return PrivacyStatement;
        }

        @NotNull
        public final String getToc() {
            return Toc;
        }

        @NotNull
        public final String getFaq() {
            return Faq;
        }

        @NotNull
        public final String getSupport() {
            return Support;
        }
    }

    public MoreItem(@NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "title");
        this.name = str;
        this.icon = i;
        this.title = str2;
    }

    public final int getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final boolean isGroupHeader() {
        return this.isGroupHeader;
    }

    public final void setGroupHeader(boolean z) {
        this.isGroupHeader = z;
    }

    public MoreItem(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        this("", -1, str);
        this.isGroupHeader = true;
    }
}
