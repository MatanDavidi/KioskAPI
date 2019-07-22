package com.valora.kkiosk.commons.api;

import android.content.Context;
import com.facebook.places.model.PlaceFields;
import com.valora.kkiosk.commons.extensions.ExtensionsKt;
import com.valora.kkiosk.commons.models.Languages;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.threeten.p017bp.ZonedDateTime;
import org.threeten.p017bp.format.DateTimeFormatter;
import retrofit2.Response;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bJ\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¨\u0006\u0010"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/api/APIHelper;", "", "()V", "formatDobToLBAPIString", "", "dob", "Lorg/threeten/bp/ZonedDateTime;", "getUserLanguage", "context", "Landroid/content/Context;", "apiLanguages", "", "processLanguagesResponse", "apiLanguagesResponse", "Lretrofit2/Response;", "Lcom/valora/kkiosk/commons/models/Languages;", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: APIHelper.kt */
public final class APIHelper {
    @NotNull
    public final List<String> processLanguagesResponse(@NotNull Response<Languages> response) {
        Intrinsics.checkParameterIsNotNull(response, "apiLanguagesResponse");
        if (!response.isSuccessful()) {
            return CollectionsKt.emptyList();
        }
        Object body = response.body();
        if (body == null) {
            Intrinsics.throwNpe();
        }
        return ((Languages) body).getLanguageKeys();
    }

    @NotNull
    public final String getUserLanguage(@NotNull Context context, @NotNull List<String> list) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(context, PlaceFields.CONTEXT);
        Intrinsics.checkParameterIsNotNull(list, "apiLanguages");
        Iterator it = ExtensionsKt.getSystemLanguages(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (list.contains((String) obj)) {
                break;
            }
        }
        String str = (String) obj;
        return str != null ? str : "de";
    }

    @NotNull
    public final String formatDobToLBAPIString(@NotNull ZonedDateTime zonedDateTime) {
        Intrinsics.checkParameterIsNotNull(zonedDateTime, "dob");
        String format = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(zonedDateTime);
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormatter.format(dob)");
        return format;
    }
}
