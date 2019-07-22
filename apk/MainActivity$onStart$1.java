package com.valora.kkiosk;

import android.util.Log;
import kotlin.Metadata;
import p007io.branch.indexing.BranchUniversalObject;
import p007io.branch.referral.Branch.BranchUniversalReferralInitListener;
import p007io.branch.referral.BranchError;
import p007io.branch.referral.util.LinkProperties;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, mo21491d2 = {"<anonymous>", "", "branchUniversalObject", "Lio/branch/indexing/BranchUniversalObject;", "kotlin.jvm.PlatformType", "linkProperties", "Lio/branch/referral/util/LinkProperties;", "error", "Lio/branch/referral/BranchError;", "onInitFinished"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
final class MainActivity$onStart$1 implements BranchUniversalReferralInitListener {
    public static final MainActivity$onStart$1 INSTANCE = new MainActivity$onStart$1();

    MainActivity$onStart$1() {
    }

    public final void onInitFinished(BranchUniversalObject branchUniversalObject, LinkProperties linkProperties, BranchError branchError) {
        if (branchError != null) {
            Log.e("MainActivity", branchError.getMessage());
        }
    }
}
