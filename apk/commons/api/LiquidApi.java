package com.valora.kkiosk.commons.api;

import com.valora.kkiosk.commons.models.CouponDataResponse;
import com.valora.kkiosk.commons.models.Languages;
import com.valora.kkiosk.commons.models.UserData;
import com.valora.kkiosk.commons.models.UserIdData;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J8\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010H'JD\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010H'J8\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010H'J8\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010H'JD\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010H'JD\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010H'J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0018H'JB\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u0006H'¨\u0006\u001b"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/api/LiquidApi;", "", "getCoupons", "Lretrofit2/Call;", "Lcom/valora/kkiosk/commons/models/CouponDataResponse;", "signature", "", "date", "userId", "getLanguages", "Lcom/valora/kkiosk/commons/models/Languages;", "getUser", "Lcom/valora/kkiosk/commons/models/UserData;", "initialize", "Lcom/valora/kkiosk/commons/models/UserIdData;", "body", "", "recruit", "register", "registerDevice", "Ljava/lang/Void;", "requestPin", "shareCoupon", "updateUser", "Lokhttp3/RequestBody;", "validateRecruit", "msn", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: LiquidApi.kt */
public interface LiquidApi {
    @NotNull
    @GET("/v1/content")
    Call<CouponDataResponse> getCoupons(@NotNull @Header("X-Liquid-Signature") String str, @NotNull @Header("X-Liquid-Timestamp") String str2, @NotNull @Query("UserId") String str3);

    @NotNull
    @GET("/v1/languages")
    Call<Languages> getLanguages(@NotNull @Header("X-Liquid-Signature") String str, @NotNull @Header("X-Liquid-Timestamp") String str2);

    @NotNull
    @GET("/v1/user")
    @Headers({"Content-Type: application/json"})
    Call<UserData> getUser(@NotNull @Query("UserID") String str, @NotNull @Header("X-Liquid-Signature") String str2, @NotNull @Header("X-Liquid-Timestamp") String str3);

    @NotNull
    @POST("/v1/initialize")
    @Headers({"Content-Type: application/json"})
    Call<UserIdData> initialize(@NotNull @Header("X-Liquid-Signature") String str, @NotNull @Header("X-Liquid-Timestamp") String str2, @NotNull @Body Map<String, String> map);

    @NotNull
    @POST("/v1/referral")
    @Headers({"Content-Type: application/json"})
    Call<Map<String, String>> recruit(@NotNull @Header("X-Liquid-Signature") String str, @NotNull @Header("X-Liquid-Timestamp") String str2, @NotNull @Body Map<String, String> map);

    @NotNull
    @POST("/v1/user")
    @Headers({"Content-Type: application/json"})
    Call<UserIdData> register(@NotNull @Header("X-Liquid-Signature") String str, @NotNull @Header("X-Liquid-Timestamp") String str2, @NotNull @Body Map<String, String> map);

    @NotNull
    @POST("/v1/device")
    Call<Void> registerDevice(@NotNull @Header("X-Liquid-Signature") String str, @NotNull @Header("X-Liquid-Timestamp") String str2, @NotNull @Body Map<String, String> map);

    @NotNull
    @POST("/v1/pin")
    @Headers({"Content-Type: application/json"})
    Call<Map<String, String>> requestPin(@NotNull @Header("X-Liquid-Signature") String str, @NotNull @Header("X-Liquid-Timestamp") String str2, @NotNull @Body Map<String, String> map);

    @NotNull
    @POST("/v1/share")
    Call<Map<String, Object>> shareCoupon(@NotNull @Header("X-Liquid-Signature") String str, @NotNull @Header("X-Liquid-Timestamp") String str2, @NotNull @Body Map<String, String> map);

    @PUT("/v1/user")
    @NotNull
    @Headers({"Content-Type: application/json"})
    Call<UserData> updateUser(@NotNull @Header("X-Liquid-Signature") String str, @NotNull @Header("X-Liquid-Timestamp") String str2, @NotNull @Body RequestBody requestBody);

    @NotNull
    @GET("/v1/validreferral")
    Call<Map<String, String>> validateRecruit(@NotNull @Header("X-Liquid-Signature") String str, @NotNull @Header("X-Liquid-Timestamp") String str2, @NotNull @Query("UserID") String str3, @NotNull @Query("MSN") String str4);
}
