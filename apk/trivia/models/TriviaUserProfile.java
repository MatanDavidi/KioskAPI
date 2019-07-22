package com.valora.kkiosk.trivia.models;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p007io.fabric.sdk.android.services.common.AbstractSpiCall;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, mo21491d2 = {"Lcom/valora/kkiosk/trivia/models/TriviaUserProfile;", "Ljava/io/Serializable;", "()V", "lbmsn", "", "lbuserName", "(Ljava/lang/String;Ljava/lang/String;)V", "getLbmsn", "()Ljava/lang/String;", "getLbuserName", "platform", "getPlatform", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: TriviaUserProfile.kt */
public final class TriviaUserProfile implements Serializable {
    @Nullable
    private final String lbmsn;
    @Nullable
    private final String lbuserName;
    @NotNull
    private final String platform;

    public TriviaUserProfile(@Nullable String str, @Nullable String str2) {
        this.lbmsn = str;
        this.lbuserName = str2;
        this.platform = AbstractSpiCall.ANDROID_CLIENT_TYPE;
    }

    @Nullable
    public final String getLbmsn() {
        return this.lbmsn;
    }

    @Nullable
    public final String getLbuserName() {
        return this.lbuserName;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    public TriviaUserProfile() {
        this(null, null);
    }
}
