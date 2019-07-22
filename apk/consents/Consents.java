package com.valora.kkiosk.consents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0016\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\tJ\u0006\u0010\u001c\u001a\u00020\u0017J\u0006\u0010\u001d\u001a\u00020\u0017J\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0 J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0 J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040 J\b\u0010$\u001a\u00020\u0017H\u0002J\u0016\u0010%\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\tJ\u0006\u0010&\u001a\u00020\u0017J\u0006\u0010'\u001a\u00020\u0017R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bX\u000e¢\u0006\u0002\n\u0000R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006("}, mo21491d2 = {"Lcom/valora/kkiosk/consents/Consents;", "Ljava/io/Serializable;", "consentList", "Ljava/util/ArrayList;", "Lcom/valora/kkiosk/consents/Consent;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "approvedConsentsMap", "", "", "getConsentList", "()Ljava/util/ArrayList;", "setConsentList", "masterConsent", "getMasterConsent", "()Lcom/valora/kkiosk/consents/Consent;", "setMasterConsent", "(Lcom/valora/kkiosk/consents/Consent;)V", "revokedConsentsMap", "termsOfUseConsent", "getTermsOfUseConsent", "setTermsOfUseConsent", "addApprovedConsent", "", "consent", "addRevokedConsent", "approveConsent", "index", "approveMasterConsent", "approveTermsOfUseConsent", "getAllConsentsWithoutMaster", "getApprovedConsentIdList", "", "getApprovedConsentsList", "getRevokedConsentIdList", "getRevokedConsentsList", "resetList", "revokeConsent", "revokeMasterConsent", "revokeTermsOfUseConsent", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Consents.kt */
public final class Consents implements Serializable {
    private Map<Integer, Consent> approvedConsentsMap = new LinkedHashMap();
    @NotNull
    private ArrayList<Consent> consentList;
    @NotNull
    public Consent masterConsent;
    private Map<Integer, Consent> revokedConsentsMap = new LinkedHashMap();
    @NotNull
    public Consent termsOfUseConsent;

    public Consents(@NotNull ArrayList<Consent> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "consentList");
        this.consentList = arrayList;
        Consent consent = null;
        for (Consent consent2 : this.consentList) {
            if (consent2.isMasterConsent()) {
                this.masterConsent = consent2;
            } else if (consent2.isTermsOfUseConsent()) {
                this.termsOfUseConsent = consent2;
            } else if (consent2.isConsentGiven()) {
                addApprovedConsent(consent2);
            } else {
                addRevokedConsent(consent2);
            }
        }
        Consent consent3 = this.masterConsent;
        String str = "masterConsent";
        if (consent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        String state = consent3.getState();
        String str2 = ConsentKt.CONSENT_STATE_CONSENT_GIVEN;
        if (Intrinsics.areEqual((Object) state, (Object) str2)) {
            ArrayList<Consent> arrayList2 = this.consentList;
            Consent consent4 = this.masterConsent;
            if (consent4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
            }
            arrayList2.remove(consent4);
        }
        Consent consent5 = this.termsOfUseConsent;
        String str3 = "termsOfUseConsent";
        if (consent5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str3);
        }
        if (Intrinsics.areEqual((Object) consent5.getState(), (Object) str2)) {
            ArrayList<Consent> arrayList3 = this.consentList;
            Consent consent6 = this.termsOfUseConsent;
            if (consent6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str3);
            }
            arrayList3.remove(consent6);
        }
    }

    @NotNull
    public final ArrayList<Consent> getConsentList() {
        return this.consentList;
    }

    public final void setConsentList(@NotNull ArrayList<Consent> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.consentList = arrayList;
    }

    @NotNull
    public final Consent getMasterConsent() {
        Consent consent = this.masterConsent;
        if (consent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("masterConsent");
        }
        return consent;
    }

    public final void setMasterConsent(@NotNull Consent consent) {
        Intrinsics.checkParameterIsNotNull(consent, "<set-?>");
        this.masterConsent = consent;
    }

    @NotNull
    public final Consent getTermsOfUseConsent() {
        Consent consent = this.termsOfUseConsent;
        if (consent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("termsOfUseConsent");
        }
        return consent;
    }

    public final void setTermsOfUseConsent(@NotNull Consent consent) {
        Intrinsics.checkParameterIsNotNull(consent, "<set-?>");
        this.termsOfUseConsent = consent;
    }

    @NotNull
    public final List<Consent> getRevokedConsentsList() {
        return CollectionsKt.toList(this.revokedConsentsMap.values());
    }

    @NotNull
    public final List<Consent> getApprovedConsentsList() {
        return CollectionsKt.toList(this.approvedConsentsMap.values());
    }

    public final void approveMasterConsent() {
        Consent consent = this.masterConsent;
        if (consent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("masterConsent");
        }
        consent.setState(ConsentKt.CONSENT_STATE_CONSENT_GIVEN);
    }

    public final void approveTermsOfUseConsent() {
        Consent consent = this.termsOfUseConsent;
        if (consent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("termsOfUseConsent");
        }
        consent.setState(ConsentKt.CONSENT_STATE_CONSENT_GIVEN);
    }

    public final void revokeTermsOfUseConsent() {
        Consent consent = this.termsOfUseConsent;
        if (consent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("termsOfUseConsent");
        }
        consent.setState(ConsentKt.CONSENT_STATE_NO_CONSENT);
    }

    public final void revokeMasterConsent() {
        Consent consent = this.masterConsent;
        if (consent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("masterConsent");
        }
        consent.setState(ConsentKt.CONSENT_STATE_NO_CONSENT);
    }

    private final void addRevokedConsent(Consent consent) {
        Map<Integer, Consent> map = this.revokedConsentsMap;
        Pair pair = new Pair(Integer.valueOf(consent.getCurrentVersion().getId()), consent);
        map.put(pair.getFirst(), pair.getSecond());
    }

    private final void addApprovedConsent(Consent consent) {
        Map<Integer, Consent> map = this.approvedConsentsMap;
        Pair pair = new Pair(Integer.valueOf(consent.getCurrentVersion().getId()), consent);
        map.put(pair.getFirst(), pair.getSecond());
    }

    public final void revokeConsent(@NotNull Consent consent, int i) {
        Intrinsics.checkParameterIsNotNull(consent, "consent");
        this.approvedConsentsMap.remove(Integer.valueOf(consent.getCurrentVersion().getId()));
        consent.setState(ConsentKt.CONSENT_STATE_CONSENT_REVOKED);
        if (i == -1) {
            resetList();
        } else {
            this.consentList.set(i, consent);
        }
        addRevokedConsent(consent);
    }

    private final void resetList() {
        ArrayList<Consent> arrayList = new ArrayList<>();
        arrayList.addAll(getRevokedConsentsList());
        arrayList.addAll(getApprovedConsentsList());
        this.consentList = arrayList;
    }

    public final void approveConsent(@NotNull Consent consent, int i) {
        Intrinsics.checkParameterIsNotNull(consent, "consent");
        this.revokedConsentsMap.remove(Integer.valueOf(consent.getCurrentVersion().getId()));
        consent.setState(ConsentKt.CONSENT_STATE_CONSENT_GIVEN);
        if (i == -1) {
            resetList();
        } else {
            this.consentList.set(i, consent);
        }
        addApprovedConsent(consent);
    }

    @NotNull
    public final List<Integer> getApprovedConsentIdList() {
        ArrayList arrayList = new ArrayList(CollectionsKt.toList(this.approvedConsentsMap.keySet()));
        Consent consent = this.masterConsent;
        String str = "masterConsent";
        if (consent == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        if (consent.isConsentGiven()) {
            Consent consent2 = this.masterConsent;
            if (consent2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
            }
            arrayList.add(Integer.valueOf(consent2.getCurrentVersion().getId()));
        }
        Consent consent3 = this.termsOfUseConsent;
        String str2 = "termsOfUseConsent";
        if (consent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str2);
        }
        if (consent3.isConsentGiven()) {
            Consent consent4 = this.termsOfUseConsent;
            if (consent4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
            }
            arrayList.add(Integer.valueOf(consent4.getCurrentVersion().getId()));
        }
        return arrayList;
    }

    @NotNull
    public final List<Integer> getRevokedConsentIdList() {
        ArrayList arrayList = new ArrayList(CollectionsKt.toList(this.revokedConsentsMap.keySet()));
        Consent consent = this.masterConsent;
        String str = "masterConsent";
        if (consent == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        if (!consent.isConsentGiven()) {
            Consent consent2 = this.masterConsent;
            if (consent2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
            }
            arrayList.add(Integer.valueOf(consent2.getCurrentVersion().getId()));
        }
        Consent consent3 = this.termsOfUseConsent;
        String str2 = "termsOfUseConsent";
        if (consent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str2);
        }
        if (!consent3.isConsentGiven()) {
            Consent consent4 = this.termsOfUseConsent;
            if (consent4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
            }
            arrayList.add(Integer.valueOf(consent4.getCurrentVersion().getId()));
        }
        return arrayList;
    }

    @NotNull
    public final ArrayList<Consent> getAllConsentsWithoutMaster() {
        return this.consentList;
    }
}
