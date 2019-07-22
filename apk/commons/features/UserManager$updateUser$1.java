package com.valora.kkiosk.commons.features;

import android.content.Context;
import com.valora.kkiosk.commons.api.APIHelper;
import com.valora.kkiosk.commons.api.RestApi;
import com.valora.kkiosk.commons.models.UserData;
import com.valora.kkiosk.commons.models.UserGroup;
import java.io.EOFException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.threeten.p017bp.ZonedDateTime;
import p018rx.Observable.OnSubscribe;
import p018rx.Subscriber;
import retrofit2.Response;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a*\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo21491d2 = {"<anonymous>", "", "subscriber", "Lrx/Subscriber;", "Lcom/valora/kkiosk/commons/models/UserData;", "kotlin.jvm.PlatformType", "call"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: UserManager.kt */
final class UserManager$updateUser$1<T> implements OnSubscribe<T> {
    final /* synthetic */ List $approvedConsents;
    final /* synthetic */ Context $context;
    final /* synthetic */ ZonedDateTime $dob;
    final /* synthetic */ String $gender;
    final /* synthetic */ String $name;
    final /* synthetic */ List $revokedConsents;
    final /* synthetic */ UserGroup $userGroup;
    final /* synthetic */ UserManager this$0;

    UserManager$updateUser$1(UserManager userManager, Context context, String str, String str2, ZonedDateTime zonedDateTime, UserGroup userGroup, List list, List list2) {
        this.this$0 = userManager;
        this.$context = context;
        this.$name = str;
        this.$gender = str2;
        this.$dob = zonedDateTime;
        this.$userGroup = userGroup;
        this.$approvedConsents = list;
        this.$revokedConsents = list2;
    }

    public final void call(Subscriber<? super UserData> subscriber) {
        try {
            Response execute = this.this$0.api.languages().execute();
            APIHelper aPIHelper = new APIHelper();
            Intrinsics.checkExpressionValueIsNotNull(execute, "apiLanguagesResponse");
            String userLanguage = aPIHelper.getUserLanguage(this.$context, aPIHelper.processLanguagesResponse(execute));
            RestApi access$getApi$p = this.this$0.api;
            String str = this.$name;
            String str2 = this.$gender;
            if (str2 == null) {
                str2 = "";
            }
            Response execute2 = access$getApi$p.updateUser(str, str2, aPIHelper.formatDobToLBAPIString(this.$dob), userLanguage, this.$userGroup, this.$approvedConsents, this.$revokedConsents).execute();
            Intrinsics.checkExpressionValueIsNotNull(execute2, "response");
            if (execute2.isSuccessful()) {
                subscriber.onNext(execute2.body());
                subscriber.onCompleted();
                return;
            }
            ResponseBody errorBody = execute2.errorBody();
            subscriber.onError(new Throwable(errorBody != null ? errorBody.string() : null));
        } catch (EOFException unused) {
            subscriber.onNext(null);
            subscriber.onCompleted();
        }
    }
}
