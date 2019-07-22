package com.valora.kkiosk.trivia;

import android.content.res.Resources;
import android.support.p000v4.app.FragmentActivity;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.firebase.p004ui.database.FirebaseRecyclerAdapter;
import com.firebase.p004ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.valora.kkiosk.R;
import com.valora.kkiosk.commons.api.RestApi.ApiConfig;
import com.valora.kkiosk.trivia.models.Quiz;
import com.valora.kkiosk.trivia.models.TriviaLanguageItem;
import com.valora.kkiosk.trivia.models.TriviaPrize;
import com.valora.kkiosk.trivia.models.TriviaPrizes;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016¨\u0006\u000e"}, mo21491d2 = {"com/valora/kkiosk/trivia/StreamInactiveFragment$onCreateView$2", "Lcom/firebase/ui/database/FirebaseRecyclerAdapter;", "Lcom/valora/kkiosk/trivia/models/Quiz;", "Lcom/valora/kkiosk/trivia/QuizHolder;", "onBindViewHolder", "", "viewHolder", "position", "", "quiz", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: StreamInactiveFragment.kt */
public final class StreamInactiveFragment$onCreateView$2 extends FirebaseRecyclerAdapter<Quiz, QuizHolder> {
    final /* synthetic */ FirebaseRecyclerOptions $options;
    final /* synthetic */ StreamInactiveFragment this$0;

    StreamInactiveFragment$onCreateView$2(StreamInactiveFragment streamInactiveFragment, FirebaseRecyclerOptions firebaseRecyclerOptions, FirebaseRecyclerOptions firebaseRecyclerOptions2) {
        this.this$0 = streamInactiveFragment;
        this.$options = firebaseRecyclerOptions;
        super(firebaseRecyclerOptions2);
    }

    @NotNull
    public QuizHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new QuizHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.quiz_item, viewGroup, false));
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(@NotNull QuizHolder quizHolder, int i, @NotNull Quiz quiz) {
        Intrinsics.checkParameterIsNotNull(quizHolder, "viewHolder");
        Intrinsics.checkParameterIsNotNull(quiz, BroadcastState.QUIZ);
        DatabaseReference ref = getRef(i);
        Intrinsics.checkExpressionValueIsNotNull(ref, "getRef(position)");
        String key = ref.getKey();
        Long startsAtTimestamp = quiz.getStartsAtTimestamp();
        if (startsAtTimestamp == null) {
            Intrinsics.throwNpe();
        }
        if (DateUtils.isToday(startsAtTimestamp.longValue())) {
            TextView timeTextView = quizHolder.getTimeTextView();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            FragmentActivity activity = this.this$0.getActivity();
            Resources resources = activity != null ? activity.getResources() : null;
            if (resources == null) {
                Intrinsics.throwNpe();
            }
            String string = resources.getString(R.string.win_today_at_ph);
            Intrinsics.checkExpressionValueIsNotNull(string, "activity?.resources!!.ge…R.string.win_today_at_ph)");
            Object[] objArr = {this.this$0.timeFormatter.format(new Date(quiz.getStartsAtTimestamp().longValue()))};
            String format = String.format(string, Arrays.copyOf(objArr, objArr.length));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            timeTextView.setText(format);
        } else {
            TextView timeTextView2 = quizHolder.getTimeTextView();
            SimpleDateFormat access$getSimpleDateTimeFormatter$p = this.this$0.simpleDateTimeFormatter;
            Long startsAtTimestamp2 = quiz.getStartsAtTimestamp();
            if (startsAtTimestamp2 == null) {
                Intrinsics.throwNpe();
            }
            timeTextView2.setText(access$getSimpleDateTimeFormatter$p.format(new Date(startsAtTimestamp2.longValue())));
        }
        TextView mainPrizeTextView = quizHolder.getMainPrizeTextView();
        TriviaPrizes prizes = quiz.getPrizes();
        if (prizes == null) {
            Intrinsics.throwNpe();
        }
        TriviaPrize first = prizes.getFirst();
        if (first == null) {
            Intrinsics.throwNpe();
        }
        TriviaLanguageItem name = first.getName();
        if (name == null) {
            Intrinsics.throwNpe();
        }
        mainPrizeTextView.setText(name.getTextByLanguage(ApiConfig.INSTANCE.getUserLanguage()));
        TextView specialPrizeTextView = quizHolder.getSpecialPrizeTextView();
        TriviaPrizes prizes2 = quiz.getPrizes();
        if (prizes2 == null) {
            Intrinsics.throwNpe();
        }
        TriviaPrize special = prizes2.getSpecial();
        if (special == null) {
            Intrinsics.throwNpe();
        }
        TriviaLanguageItem name2 = special.getName();
        if (name2 == null) {
            Intrinsics.throwNpe();
        }
        specialPrizeTextView.setText(name2.getTextByLanguage(ApiConfig.INSTANCE.getUserLanguage()));
        TextView mainPrizeDescriptionTextView = quizHolder.getMainPrizeDescriptionTextView();
        TriviaPrizes prizes3 = quiz.getPrizes();
        if (prizes3 == null) {
            Intrinsics.throwNpe();
        }
        TriviaPrize first2 = prizes3.getFirst();
        if (first2 == null) {
            Intrinsics.throwNpe();
        }
        TriviaLanguageItem description = first2.getDescription();
        if (description == null) {
            Intrinsics.throwNpe();
        }
        mainPrizeDescriptionTextView.setText(description.getTextByLanguage(ApiConfig.INSTANCE.getUserLanguage()));
        TextView specialPrizeDescriptionTextView = quizHolder.getSpecialPrizeDescriptionTextView();
        TriviaPrizes prizes4 = quiz.getPrizes();
        if (prizes4 == null) {
            Intrinsics.throwNpe();
        }
        TriviaPrize special2 = prizes4.getSpecial();
        if (special2 == null) {
            Intrinsics.throwNpe();
        }
        TriviaLanguageItem description2 = special2.getDescription();
        if (description2 == null) {
            Intrinsics.throwNpe();
        }
        specialPrizeDescriptionTextView.setText(description2.getTextByLanguage(ApiConfig.INSTANCE.getUserLanguage()));
        StorageReference reference = FirebaseStorage.getInstance().getReference("quizzes");
        if (key == null) {
            Intrinsics.throwNpe();
        }
        StorageReference child = reference.child(key).child(StorageReferences.PRIZES);
        Intrinsics.checkExpressionValueIsNotNull(child, "FirebaseStorage.getInsta…StorageReferences.PRIZES)");
        StorageReference child2 = child.child(StorageReferences.MAIN);
        Intrinsics.checkExpressionValueIsNotNull(child2, "storageRef.child(StorageReferences.MAIN)");
        child2.getDownloadUrl().addOnSuccessListener(new StreamInactiveFragment$onCreateView$2$onBindViewHolder$1(this, quizHolder)).addOnFailureListener(StreamInactiveFragment$onCreateView$2$onBindViewHolder$2.INSTANCE);
        StorageReference child3 = child.child(StorageReferences.SPECIAL);
        Intrinsics.checkExpressionValueIsNotNull(child3, "storageRef.child(StorageReferences.SPECIAL)");
        child3.getDownloadUrl().addOnSuccessListener(new StreamInactiveFragment$onCreateView$2$onBindViewHolder$3(this, quizHolder)).addOnFailureListener(StreamInactiveFragment$onCreateView$2$onBindViewHolder$4.INSTANCE);
    }
}
