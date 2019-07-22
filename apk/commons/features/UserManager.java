package com.valora.kkiosk.commons.features;

import android.content.Context;
import com.facebook.places.model.PlaceFields;
import com.valora.kkiosk.SplashActivityKt;
import com.valora.kkiosk.commons.api.RestApi;
import com.valora.kkiosk.commons.extensions.Helper;
import com.valora.kkiosk.commons.models.UserData;
import com.valora.kkiosk.commons.models.UserGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.threeten.p017bp.ZonedDateTime;
import p018rx.Observable;
import p018rx.Observable.OnSubscribe;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bJ8\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\n\u001a\u00020\u000bJX\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/features/UserManager;", "", "api", "Lcom/valora/kkiosk/commons/api/RestApi;", "(Lcom/valora/kkiosk/commons/api/RestApi;)V", "getUser", "Lrx/Observable;", "Lcom/valora/kkiosk/commons/models/UserData;", "recruit", "", "msn", "", "register", "approvedConsents", "", "", "revokedConsents", "pin", "dob", "Lorg/threeten/bp/ZonedDateTime;", "requestPin", "updateUser", "context", "Landroid/content/Context;", "name", "gender", "userGroup", "Lcom/valora/kkiosk/commons/models/UserGroup;", "validateRecruit", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: UserManager.kt */
public final class UserManager {
    /* access modifiers changed from: private */
    public final RestApi api;

    public UserManager() {
        this(null, 1, null);
    }

    public UserManager(@NotNull RestApi restApi) {
        Intrinsics.checkParameterIsNotNull(restApi, "api");
        this.api = restApi;
    }

    public /* synthetic */ UserManager(RestApi restApi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            restApi = new RestApi();
        }
        this(restApi);
    }

    @NotNull
    public final Observable<String> requestPin(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, SplashActivityKt.PREF_MSN);
        Observable<String> create = Observable.create((OnSubscribe<T>) new UserManager$requestPin$1<T>(this, Helper.INSTANCE.sanitizeMSN(str)));
        Intrinsics.checkExpressionValueIsNotNull(create, "create { subscriber ->\n\n…)\n            }\n        }");
        return create;
    }

    @NotNull
    public final Observable<String> register(@NotNull List<Integer> list, @NotNull List<Integer> list2, @NotNull String str, @NotNull ZonedDateTime zonedDateTime) {
        Intrinsics.checkParameterIsNotNull(list, "approvedConsents");
        Intrinsics.checkParameterIsNotNull(list2, "revokedConsents");
        Intrinsics.checkParameterIsNotNull(str, "pin");
        Intrinsics.checkParameterIsNotNull(zonedDateTime, "dob");
        UserManager$register$1 userManager$register$1 = new UserManager$register$1(this, str, zonedDateTime, list, list2);
        Observable<String> create = Observable.create((OnSubscribe<T>) userManager$register$1);
        Intrinsics.checkExpressionValueIsNotNull(create, "create { subscriber ->\n\n…\n            }\n\n        }");
        return create;
    }

    @NotNull
    public final Observable<UserData> getUser() {
        Observable<UserData> create = Observable.create((OnSubscribe<T>) new UserManager$getUser$1<T>(this));
        Intrinsics.checkExpressionValueIsNotNull(create, "create { subscriber ->\n …)\n            }\n        }");
        return create;
    }

    @NotNull
    public static /* synthetic */ Observable updateUser$default(UserManager userManager, Context context, String str, String str2, ZonedDateTime zonedDateTime, UserGroup userGroup, List list, List list2, int i, Object obj) {
        return userManager.updateUser(context, str, (i & 4) != 0 ? null : str2, zonedDateTime, (i & 16) != 0 ? null : userGroup, list, list2);
    }

    @NotNull
    public final Observable<UserData> updateUser(@NotNull Context context, @NotNull String str, @Nullable String str2, @NotNull ZonedDateTime zonedDateTime, @Nullable UserGroup userGroup, @NotNull List<Integer> list, @NotNull List<Integer> list2) {
        Context context2 = context;
        Intrinsics.checkParameterIsNotNull(context, PlaceFields.CONTEXT);
        String str3 = str;
        Intrinsics.checkParameterIsNotNull(str, "name");
        ZonedDateTime zonedDateTime2 = zonedDateTime;
        Intrinsics.checkParameterIsNotNull(zonedDateTime, "dob");
        List<Integer> list3 = list;
        Intrinsics.checkParameterIsNotNull(list3, "approvedConsents");
        List<Integer> list4 = list2;
        Intrinsics.checkParameterIsNotNull(list4, "revokedConsents");
        UserManager$updateUser$1 userManager$updateUser$1 = new UserManager$updateUser$1(this, context2, str3, str2, zonedDateTime2, userGroup, list3, list4);
        Observable<UserData> create = Observable.create((OnSubscribe<T>) userManager$updateUser$1);
        Intrinsics.checkExpressionValueIsNotNull(create, "create { subscriber ->\n\n…\n            }\n\n        }");
        return create;
    }

    @NotNull
    public final Observable<String> validateRecruit(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, SplashActivityKt.PREF_MSN);
        Observable<String> create = Observable.create((OnSubscribe<T>) new UserManager$validateRecruit$1<T>(this, Helper.INSTANCE.sanitizeMSN(str)));
        Intrinsics.checkExpressionValueIsNotNull(create, "create { subscriber ->\n\n…)\n            }\n        }");
        return create;
    }

    @NotNull
    public final Observable<Boolean> recruit(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, SplashActivityKt.PREF_MSN);
        Observable<Boolean> create = Observable.create((OnSubscribe<T>) new UserManager$recruit$1<T>(this, Helper.INSTANCE.sanitizeMSN(str)));
        Intrinsics.checkExpressionValueIsNotNull(create, "create { subscriber ->\n …\n            }\n\n        }");
        return create;
    }
}
