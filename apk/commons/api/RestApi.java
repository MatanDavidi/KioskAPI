package com.valora.kkiosk.commons.api;

import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import com.valora.kkiosk.SplashActivityKt;
import com.valora.kkiosk.commons.extensions.DeviceUUIDFactory;
import com.valora.kkiosk.commons.extensions.HASH;
import com.valora.kkiosk.commons.models.Coupon;
import com.valora.kkiosk.commons.models.CouponDataResponse;
import com.valora.kkiosk.commons.models.Languages;
import com.valora.kkiosk.commons.models.UserData;
import com.valora.kkiosk.commons.models.UserGroup;
import com.valora.kkiosk.commons.models.UserIdData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import org.threeten.p017bp.ZoneId;
import org.threeten.p017bp.ZonedDateTime;
import org.threeten.p017bp.format.DateTimeFormatter;
import retrofit2.Call;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010J \u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u001f0\u00102\u0006\u0010 \u001a\u00020\u0017J8\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ$\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00102\u0006\u0010 \u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017J \u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u001f0\u00102\u0006\u0010 \u001a\u00020\u0017J(\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u001f0\u00102\u0006\u0010-\u001a\u00020.2\u0006\u0010 \u001a\u00020\u0017J\u001e\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00172\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aH\u0002JR\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\b\u00106\u001a\u0004\u0018\u0001072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ \u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u001f0\u00102\u0006\u0010 \u001a\u00020\u0017R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/api/RestApi;", "", "()V", "builder", "Lretrofit2/Retrofit$Builder;", "kotlin.jvm.PlatformType", "client", "Lokhttp3/OkHttpClient;", "dateFormatter", "Lorg/threeten/bp/format/DateTimeFormatter;", "dateTimeFormatter", "liquidApi", "Lcom/valora/kkiosk/commons/api/LiquidApi;", "utcTimezone", "Lorg/threeten/bp/ZoneId;", "getCoupons", "Lretrofit2/Call;", "Lcom/valora/kkiosk/commons/models/CouponDataResponse;", "getUser", "Lcom/valora/kkiosk/commons/models/UserData;", "initialize", "Lcom/valora/kkiosk/commons/models/UserIdData;", "culture", "", "intListToString", "list", "", "", "languages", "Lcom/valora/kkiosk/commons/models/Languages;", "recruit", "", "msn", "register", "pin", "dob", "Lorg/threeten/bp/ZonedDateTime;", "approvedConsents", "revokedConsents", "registerDevice", "Ljava/lang/Void;", "deviceToken", "language", "requestPin", "shareCoupon", "coupon", "Lcom/valora/kkiosk/commons/models/Coupon;", "signature", "dateTimeString", "params", "updateUser", "name", "gender", "dobString", "userGroup", "Lcom/valora/kkiosk/commons/models/UserGroup;", "validateRecruit", "ApiConfig", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: RestApi.kt */
public final class RestApi {
    private Builder builder = new Builder().baseUrl(ApiConfig.baseUrl).addConverterFactory(MoshiConverterFactory.create());
    private final OkHttpClient client;
    private final DateTimeFormatter dateFormatter;
    private final DateTimeFormatter dateTimeFormatter;
    private final LiquidApi liquidApi;
    private final ZoneId utcTimezone;

    @Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\nR\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\n¨\u0006\u001a"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/api/RestApi$ApiConfig;", "", "()V", "baseUrl", "", "instanceId", "msn", "getMsn", "()Ljava/lang/String;", "setMsn", "(Ljava/lang/String;)V", "secretKey", "tempUserId", "getTempUserId", "setTempUserId", "userId", "getUserId", "setUserId", "userLanguage", "getUserLanguage", "setUserLanguage", "userName", "getUserName", "setUserName", "registered", "", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
    /* compiled from: RestApi.kt */
    public static final class ApiConfig {
        public static final ApiConfig INSTANCE = new ApiConfig();
        @NotNull
        public static final String baseUrl = "https://kkiosk-ufeed.feeds.barcodes.no/";
        @NotNull
        public static final String instanceId = "3001";
        @NotNull
        private static String msn = null;
        @NotNull
        public static final String secretKey = "so8#@xsMbkVFyvjV";
        @NotNull
        private static String tempUserId;
        @NotNull
        private static String userId;
        @NotNull
        private static String userLanguage = "de";
        @NotNull
        private static String userName;

        static {
            String str = "";
            userId = str;
            tempUserId = str;
            userName = str;
            msn = str;
        }

        private ApiConfig() {
        }

        @NotNull
        public final String getUserId() {
            return userId;
        }

        public final void setUserId(@NotNull String str) {
            
            userId = str;
        }

        @NotNull
        public final String getTempUserId() {
            return tempUserId;
        }

        public final void setTempUserId(@NotNull String str) {
            
            tempUserId = str;
        }

        @NotNull
        public final String getUserName() {
            return userName;
        }

        public final void setUserName(@NotNull String str) {
            
            userName = str;
        }

        @NotNull
        public final String getMsn() {
            return msn;
        }

        public final void setMsn(@NotNull String str) {
            
            msn = str;
        }

        @NotNull
        public final String getUserLanguage() {
            return userLanguage;
        }

        public final void setUserLanguage(@NotNull String str) {
            
            userLanguage = str;
        }

        public final boolean registered() {
            return !
        }
    }

    public RestApi() {
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        
        this.dateTimeFormatter = dateTimeFormatter2;
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        this.dateFormatter = ofPattern;
        ZoneId of = ZoneId.of("UTC");
        
        this.utcTimezone = of;
        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
        builder2.addInterceptor(RestApi$interceptor$1.INSTANCE);
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(Level.BODY);
        builder2.addInterceptor(httpLoggingInterceptor);
        OkHttpClient build = builder2.build();
        
        this.client = build;
        Object create = this.builder.client(this.client).build().create(LiquidApi.class);
        
        this.liquidApi = (LiquidApi) create;
    }

    private final String intListToString(List<Integer> list) {
        return CollectionsKt.joinToString$default(list, null, "[", "]", 0, null, null, 57, null);
    }

    private final String signature(String str, List<String> list) {
        String joinToString$default = CollectionsKt.joinToString$default(list, "", null, null, 0, null, null, 62, null);
        HASH hash = HASH.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(joinToString$default);
        sb.append(ApiConfig.secretKey);
        return hash.sha256(sb.toString());
    }

    @NotNull
    public final Call<UserIdData> initialize(@NotNull String str) {
        
        Map mapOf = MapsKt.mapOf(TuplesKt.m122to("DeviceId", DeviceUUIDFactory.uuid().toString()), TuplesKt.m122to("Culture", str));
        String format = ZonedDateTime.now(this.utcTimezone).format(this.dateTimeFormatter);
        
        return this.liquidApi.initialize(signature(format, CollectionsKt.listOf(DeviceUUIDFactory.uuid().toString())), format, mapOf);
    }

    @NotNull
    public final Call<Map<String, String>> requestPin(@NotNull String str) {
        
        Map mapOf = MapsKt.mapOf(TuplesKt.m122to("UserId", ApiConfig.INSTANCE.getTempUserId()), TuplesKt.m122to("MSN", str));
        String format = ZonedDateTime.now(this.utcTimezone).format(this.dateTimeFormatter);
        
        return this.liquidApi.requestPin(signature(format, CollectionsKt.listOf(ApiConfig.INSTANCE.getTempUserId(), str)), format, mapOf);
    }

    @NotNull
    public final Call<UserIdData> register(@NotNull String str, @NotNull ZonedDateTime zonedDateTime, @NotNull List<Integer> list, @NotNull List<Integer> list2) {
        
        
        
        
        String str2 = "UserId";
        Map mapOf = MapsKt.mapOf(TuplesKt.m122to(str2, ApiConfig.INSTANCE.getTempUserId()), TuplesKt.m122to("PIN", str), TuplesKt.m122to("DateOfBirth", zonedDateTime.format(this.dateFormatter)), TuplesKt.m122to("ApprovedConsents", intListToString(list)), TuplesKt.m122to("RevokedConsents", intListToString(list2)));
        String format = ZonedDateTime.now(this.utcTimezone).format(this.dateTimeFormatter);
        
        return this.liquidApi.register(signature(format, CollectionsKt.listOf(ApiConfig.INSTANCE.getTempUserId(), str)), format, mapOf);
    }

    @NotNull
    public final Call<UserData> updateUser(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable UserGroup userGroup, @NotNull List<Integer> list, @NotNull List<Integer> list2) {
        
        
        
        
        
        
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("UserId", ApiConfig.INSTANCE.getUserId());
        jSONObject.put("Name", str);
        jSONObject.put("Gender", str2);
        jSONObject.put("DateOfBirth", str3);
        jSONObject.put("Culture", str4);
        jSONObject.put("ApprovedConsents", intListToString(list));
        jSONObject.put("RevokedConsents", intListToString(list2));
        if (userGroup != null) {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("GroupId", userGroup.getGroupId());
            jSONObject2.put("IsUserMember", userGroup.getIsUserMember());
            jSONObject2.put("UserCode", userGroup.getUserCode());
            jSONArray.put(jSONObject2);
            jSONObject.put("UserGroups", jSONArray);
        }
        RequestBody create = RequestBody.create(MediaType.parse("text"), jSONObject.toString());
        String format = ZonedDateTime.now(this.utcTimezone).format(this.dateTimeFormatter);
        
        String signature = signature(format, CollectionsKt.listOf(ApiConfig.INSTANCE.getUserId()));
        LiquidApi liquidApi2 = this.liquidApi;
        
        return liquidApi2.updateUser(signature, format, create);
    }

    @NotNull
    public final Call<Map<String, String>> validateRecruit(@NotNull String str) {
        
        String format = ZonedDateTime.now(this.utcTimezone).format(this.dateTimeFormatter);
        
        return this.liquidApi.validateRecruit(signature(format, CollectionsKt.listOf(ApiConfig.INSTANCE.getUserId(), str)), format, ApiConfig.INSTANCE.getUserId(), str);
    }

    @NotNull
    public final Call<Map<String, String>> recruit(@NotNull String str) {
        
        Map mapOf = MapsKt.mapOf(TuplesKt.m122to("UserId", ApiConfig.INSTANCE.getUserId()), TuplesKt.m122to("MSN", str));
        String format = ZonedDateTime.now(this.utcTimezone).format(this.dateTimeFormatter);
        
        return this.liquidApi.recruit(signature(format, CollectionsKt.listOf(ApiConfig.INSTANCE.getUserId(), str)), format, mapOf);
    }

    @NotNull
    public final Call<UserData> getUser() {
        String format = ZonedDateTime.now(this.utcTimezone).format(this.dateTimeFormatter);
        
        return this.liquidApi.getUser(ApiConfig.INSTANCE.getUserId(), signature(format, CollectionsKt.listOf(ApiConfig.INSTANCE.getUserId())), format);
    }

    @NotNull
    public final Call<CouponDataResponse> getCoupons() {
        String format = ZonedDateTime.now(this.utcTimezone).format(this.dateTimeFormatter);
        
        return this.liquidApi.getCoupons(signature(format, CollectionsKt.listOf(ApiConfig.INSTANCE.getUserId())), format, ApiConfig.INSTANCE.getUserId());
    }

    @NotNull
    public final Call<Map<String, Object>> shareCoupon(@NotNull Coupon coupon, @NotNull String str) {
        
        
        String format = ZonedDateTime.now(this.utcTimezone).format(this.dateTimeFormatter);
        
        String signature = signature(format, CollectionsKt.listOf(ApiConfig.INSTANCE.getUserId(), coupon.getCouponId()));
        return this.liquidApi.shareCoupon(signature, format, MapsKt.mapOf(TuplesKt.m122to("UserId", ApiConfig.INSTANCE.getUserId()), TuplesKt.m122to("ScheduleId", String.valueOf(coupon.getScheduleId())), TuplesKt.m122to("ContentId", coupon.getCouponId()), TuplesKt.m122to("FriendUserRef", str)));
    }

    @NotNull
    public final Call<Languages> languages() {
        String format = ZonedDateTime.now(this.utcTimezone).format(this.dateTimeFormatter);
        
        return this.liquidApi.getLanguages(signature(format, CollectionsKt.emptyList()), format);
    }

    @NotNull
    public final Call<Void> registerDevice(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        
        
        
        String uuid = DeviceUUIDFactory.uuid().toString();
        
        String userId = ApiConfig.INSTANCE.getUserId();
        String str7 = "Android";
        String str8 = AppEventsConstants.EVENT_PARAM_VALUE_YES;
        Map mapOf = MapsKt.mapOf(TuplesKt.m122to("DeviceId", uuid), TuplesKt.m122to("UserId", userId), TuplesKt.m122to("DeviceToken", str5), TuplesKt.m122to("MSN", str4), TuplesKt.m122to("Language", str6), TuplesKt.m122to("DeviceType", str7), TuplesKt.m122to("AppVersion", str8));
        String format = ZonedDateTime.now(this.utcTimezone).format(this.dateTimeFormatter);
        
        return this.liquidApi.registerDevice(signature(format, CollectionsKt.listOf(uuid, userId, str5, str4, str6, str7, str8)), format, mapOf);
    }
}
