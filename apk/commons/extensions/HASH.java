package com.valora.kkiosk.commons.extensions;

import com.facebook.share.internal.ShareConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/extensions/HASH;", "", "()V", "DIGITS_LOWER", "", "DIGITS_UPPER", "MD5", "", "SHA_1", "SHA_256", "encodeHex", "data", "", "toLowerCase", "", "toDigits", "getDigest", "Ljava/security/MessageDigest;", "algorithm", "md5", "text", "md5Bytes", "sha1", "sha1Bytes", "sha256", "sha256Bytes", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class HASH {
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final HASH INSTANCE = new HASH();
    private static final String MD5 = MD5;
    private static final String SHA_1 = "SHA-1";
    private static final String SHA_256 = "SHA-256";

    private HASH() {
    }

    @NotNull
    public final String md5(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, ShareConstants.WEB_DIALOG_PARAM_DATA);
        return new String(encodeHex$default(this, md5Bytes(bArr), false, 2, null));
    }

    @NotNull
    public final String md5(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        return new String(encodeHex$default(this, md5Bytes(Helper.INSTANCE.getRawBytes(str)), false, 2, null));
    }

    @NotNull
    public final byte[] md5Bytes(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, ShareConstants.WEB_DIALOG_PARAM_DATA);
        byte[] digest = getDigest(MD5).digest(bArr);
        Intrinsics.checkExpressionValueIsNotNull(digest, "getDigest(MD5).digest(data)");
        return digest;
    }

    @NotNull
    public final String sha1(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, ShareConstants.WEB_DIALOG_PARAM_DATA);
        return new String(encodeHex$default(this, sha1Bytes(bArr), false, 2, null));
    }

    @NotNull
    public final String sha1(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        return new String(encodeHex$default(this, sha1Bytes(Helper.INSTANCE.getRawBytes(str)), false, 2, null));
    }

    @NotNull
    public final byte[] sha1Bytes(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, ShareConstants.WEB_DIALOG_PARAM_DATA);
        byte[] digest = getDigest(SHA_1).digest(bArr);
        Intrinsics.checkExpressionValueIsNotNull(digest, "getDigest(SHA_1).digest(data)");
        return digest;
    }

    @NotNull
    public final String sha256(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, ShareConstants.WEB_DIALOG_PARAM_DATA);
        return new String(encodeHex$default(this, sha256Bytes(bArr), false, 2, null));
    }

    @NotNull
    public final String sha256(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        return new String(encodeHex$default(this, sha256Bytes(Helper.INSTANCE.getRawBytes(str)), false, 2, null));
    }

    @NotNull
    public final byte[] sha256Bytes(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, ShareConstants.WEB_DIALOG_PARAM_DATA);
        byte[] digest = getDigest(SHA_256).digest(bArr);
        Intrinsics.checkExpressionValueIsNotNull(digest, "getDigest(SHA_256).digest(data)");
        return digest;
    }

    @NotNull
    public final MessageDigest getDigest(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "algorithm");
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            Intrinsics.checkExpressionValueIsNotNull(instance, "MessageDigest.getInstance(algorithm)");
            return instance;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @NotNull
    public static /* synthetic */ char[] encodeHex$default(HASH hash, byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return hash.encodeHex(bArr, z);
    }

    @NotNull
    public final char[] encodeHex(@NotNull byte[] bArr, boolean z) {
        Intrinsics.checkParameterIsNotNull(bArr, ShareConstants.WEB_DIALOG_PARAM_DATA);
        return encodeHex(bArr, z ? DIGITS_LOWER : DIGITS_UPPER);
    }

    @NotNull
    public final char[] encodeHex(@NotNull byte[] bArr, @NotNull char[] cArr) {
        Intrinsics.checkParameterIsNotNull(bArr, ShareConstants.WEB_DIALOG_PARAM_DATA);
        Intrinsics.checkParameterIsNotNull(cArr, "toDigits");
        int length = bArr.length;
        char[] cArr2 = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return cArr2;
    }
}
