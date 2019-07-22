package com.valora.kkiosk.consents;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u0006\u0010\u0018\u001a\u00020\u0006J\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010\u001a\u001a\u00020\u0006J\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006J\b\u0010\u001e\u001a\u00020\u0003H\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0014\"\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, mo21491d2 = {"Lcom/valora/kkiosk/consents/Consent;", "Ljava/io/Serializable;", "Name", "", "State", "Mandatory", "", "CurrentVersion", "Lcom/valora/kkiosk/consents/ConsentVersion;", "ChangeLog", "", "Lcom/valora/kkiosk/consents/ConsentChangeLog;", "(Ljava/lang/String;Ljava/lang/String;ZLcom/valora/kkiosk/consents/ConsentVersion;Ljava/util/List;)V", "getChangeLog", "()Ljava/util/List;", "getCurrentVersion", "()Lcom/valora/kkiosk/consents/ConsentVersion;", "getMandatory", "()Z", "getName", "()Ljava/lang/String;", "getState", "setState", "(Ljava/lang/String;)V", "hasNoConsent", "isConsentGiven", "isConsentRevoked", "isMasterConsent", "isRenewalRequired", "isTermsOfUseConsent", "toString", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Consent.kt */
public final class Consent implements Serializable {
    @NotNull
    private final List<ConsentChangeLog> ChangeLog;
    @NotNull
    private final ConsentVersion CurrentVersion;
    private final boolean Mandatory;
    @NotNull
    private final String Name;
    @NotNull
    private String State;

    public Consent(@NotNull String str, @NotNull String str2, boolean z, @NotNull ConsentVersion consentVersion, @NotNull List<ConsentChangeLog> list) {
        Intrinsics.checkParameterIsNotNull(str, "Name");
        Intrinsics.checkParameterIsNotNull(str2, "State");
        Intrinsics.checkParameterIsNotNull(consentVersion, "CurrentVersion");
        Intrinsics.checkParameterIsNotNull(list, "ChangeLog");
        this.Name = str;
        this.State = str2;
        this.Mandatory = z;
        this.CurrentVersion = consentVersion;
        this.ChangeLog = list;
    }

    @NotNull
    public final String getName() {
        return this.Name;
    }

    @NotNull
    public final String getState() {
        return this.State;
    }

    public final void setState(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.State = str;
    }

    public final boolean getMandatory() {
        return this.Mandatory;
    }

    @NotNull
    public final ConsentVersion getCurrentVersion() {
        return this.CurrentVersion;
    }

    @NotNull
    public final List<ConsentChangeLog> getChangeLog() {
        return this.ChangeLog;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Consent(Name='");
        sb.append(this.Name);
        sb.append("', State='");
        sb.append(this.State);
        sb.append("', Mandatory=");
        sb.append(this.Mandatory);
        sb.append(", CurrentVersion=");
        sb.append(this.CurrentVersion);
        sb.append(", ChangeLog=");
        sb.append(this.ChangeLog);
        sb.append(')');
        return sb.toString();
    }

    public final boolean isConsentGiven() {
        return Intrinsics.areEqual((Object) this.State, (Object) ConsentKt.CONSENT_STATE_CONSENT_GIVEN);
    }

    public final boolean isConsentRevoked() {
        return Intrinsics.areEqual((Object) this.State, (Object) ConsentKt.CONSENT_STATE_CONSENT_REVOKED);
    }

    public final boolean isRenewalRequired() {
        return Intrinsics.areEqual((Object) this.State, (Object) ConsentKt.CONSENT_STATE_CONSENT_RENEWAL_REQUIRED);
    }

    public final boolean hasNoConsent() {
        return Intrinsics.areEqual((Object) this.State, (Object) ConsentKt.CONSENT_STATE_NO_CONSENT);
    }

    public final boolean isMasterConsent() {
        return Intrinsics.areEqual((Object) this.Name, (Object) ConsentKt.CONSENT_NAME_MASTER);
    }

    public final boolean isTermsOfUseConsent() {
        return Intrinsics.areEqual((Object) this.Name, (Object) ConsentKt.CONSENT_NAME_TERMS_OF_USE);
    }
}
