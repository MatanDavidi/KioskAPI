package com.valora.kkiosk.commons.features;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.places.model.PlaceFields;
import com.google.firebase.iid.FirebaseInstanceId;
import com.valora.kkiosk.commons.api.RestApi;
import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import com.valora.kkiosk.commons.extensions.ExtensionsKt;
import com.valora.kkiosk.commons.models.UserData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/features/DeviceManager;", "", "()V", "PREF_REGISTERED_TOKEN", "", "m_registeringDevice", "", "registerDevice", "", "userData", "Lcom/valora/kkiosk/commons/models/UserData;", "context", "Landroid/content/Context;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: DeviceManager.kt */
public final class DeviceManager {
    public static final DeviceManager INSTANCE = new DeviceManager();
    /* access modifiers changed from: private */
    public static final String PREF_REGISTERED_TOKEN = PREF_REGISTERED_TOKEN;
    /* access modifiers changed from: private */
    public static boolean m_registeringDevice;

    private DeviceManager() {
    }

    public final void registerDevice(@NotNull UserData userData, @NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(userData, "userData");
        Intrinsics.checkParameterIsNotNull(context, PlaceFields.CONTEXT);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        FirebaseInstanceId instance = FirebaseInstanceId.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseInstanceId.getInstance()");
        String token = instance.getToken();
        if (ApiConfig.INSTANCE.registered() && !m_registeringDevice && token != null && (!Intrinsics.areEqual((Object) defaultSharedPreferences.getString(PREF_REGISTERED_TOKEN, ""), (Object) token))) {
            m_registeringDevice = true;
            new RestApi().registerDevice(userData.getMsn(), token, (String) ExtensionsKt.getSystemLanguages(context).get(0)).enqueue(new DeviceManager$registerDevice$1(defaultSharedPreferences, token));
        }
    }
}
