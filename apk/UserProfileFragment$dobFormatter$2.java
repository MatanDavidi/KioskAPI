package com.valora.kkiosk;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.threeten.p017bp.format.DateTimeFormatter;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo21491d2 = {"<anonymous>", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "invoke"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: UserProfileFragment.kt */
final class UserProfileFragment$dobFormatter$2 extends Lambda implements Function0<DateTimeFormatter> {
    public static final UserProfileFragment$dobFormatter$2 INSTANCE = new UserProfileFragment$dobFormatter$2();

    UserProfileFragment$dobFormatter$2() {
        super(0);
    }

    public final DateTimeFormatter invoke() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd");
    }
}
