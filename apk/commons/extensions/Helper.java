package com.valora.kkiosk.commons.extensions;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.FirebaseAnalytics.Event;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.valora.kkiosk.SplashActivityKt;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006J\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006¨\u0006\u001c"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/extensions/Helper;", "", "()V", "base64Decode", "", "text", "", "base64Encode", "data", "getRandomBytes", "size", "", "getRandomString", "getRawBytes", "getString", "logEvent", "", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "category", "action", "label", "logScreen", "screenName", "normalizePhoneNumber", "number", "sanitizeMSN", "msn", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class Helper {
    public static final Helper INSTANCE = new Helper();

    private Helper() {
    }

    @NotNull
    public final String getRandomString() {
        return String.valueOf(new SecureRandom().nextLong());
    }

    @NotNull
    public final byte[] getRandomBytes(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    @NotNull
    public final byte[] getRawBytes(@NotNull String str) {
        String str2 = "(this as java.lang.String).getBytes(charset)";
        
        try {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            
            return bytes;
        } catch (UnsupportedEncodingException unused) {
            byte[] bytes2 = str.getBytes(Charsets.UTF_8);
            
            return bytes2;
        }
    }

    @NotNull
    public final String normalizePhoneNumber(@NotNull String str) {
        
        PhoneNumberUtil instance = PhoneNumberUtil.getInstance();
        try {
            String format = instance.format(instance.parse(str, "CH"), PhoneNumberFormat.E164);
            
            return format;
        } catch (NumberParseException unused) {
            return "";
        }
    }

    @NotNull
    public final String getString(@NotNull byte[] bArr) {
        
        try {
            return new String(bArr, Charsets.UTF_8);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr, Charsets.UTF_8);
        }
    }

    @NotNull
    public final byte[] base64Decode(@NotNull String str) {
        
        byte[] decode = Base64.decode(str, 2);
        
        return decode;
    }

    @NotNull
    public final String base64Encode(@NotNull byte[] bArr) {
        
        String encodeToString = Base64.encodeToString(bArr, 2);
        
        return encodeToString;
    }

    @NotNull
    public final String sanitizeMSN(@NotNull String str) {
        
        return StringsKt.replaceFirst$default(normalizePhoneNumber(str), "+", "", false, 4, (Object) null);
    }

    public final void logScreen(@NotNull FirebaseAnalytics firebaseAnalytics, @NotNull String str) {
        
        
        Bundle bundle = new Bundle();
        bundle.putString(Param.ITEM_CATEGORY, "screen");
        bundle.putString(Param.ITEM_NAME, str);
        firebaseAnalytics.logEvent(Event.VIEW_ITEM, bundle);
    }

    public final void logEvent(@NotNull FirebaseAnalytics firebaseAnalytics, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        
        String str4 = "category";
        
        
        String str5 = "label";
        
        Bundle bundle = new Bundle();
        bundle.putString(str4, str);
        bundle.putString(str5, str3);
        firebaseAnalytics.logEvent(str2, bundle);
    }
}
