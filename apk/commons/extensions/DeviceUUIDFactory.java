package com.valora.kkiosk.commons.extensions;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

public class DeviceUUIDFactory {
    protected static final String PREFS_DEVICE_ID = "device_id";
    protected static final String PREFS_FILE = "device_id.xml";
    private static UUID uuid;

    public static UUID uuid() {
        return uuid;
    }

    public DeviceUUIDFactory(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_FILE, 0);
        String uuid2 = UUID.randomUUID().toString();
        String str = PREFS_DEVICE_ID;
        uuid = UUID.fromString(sharedPreferences.getString(str, uuid2));
        sharedPreferences.edit().putString(str, uuid.toString()).apply();
    }
}
