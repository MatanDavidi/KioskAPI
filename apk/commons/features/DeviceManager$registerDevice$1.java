package com.valora.kkiosk.commons.features;

import android.content.SharedPreferences;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J(\u0010\t\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH\u0016¨\u0006\f"}, mo21491d2 = {"com/valora/kkiosk/commons/features/DeviceManager$registerDevice$1", "Lretrofit2/Callback;", "Ljava/lang/Void;", "onFailure", "", "call", "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: DeviceManager.kt */
public final class DeviceManager$registerDevice$1 implements Callback<Void> {
    final /* synthetic */ SharedPreferences $prefs;
    final /* synthetic */ String $token;

    public void onFailure(@Nullable Call<Void> call, @Nullable Throwable th) {
    }

    DeviceManager$registerDevice$1(SharedPreferences sharedPreferences, String str) {
        this.$prefs = sharedPreferences;
        this.$token = str;
    }

    public void onResponse(@Nullable Call<Void> call, @Nullable Response<Void> response) {
        this.$prefs.edit().putString(DeviceManager.PREF_REGISTERED_TOKEN, this.$token).apply();
        DeviceManager.m_registeringDevice = false;
    }
}
