package com.valora.kkiosk.trivia;

import android.view.View;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.PlayerConstants.PlayerState;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.YouTubePlayerInitListener;
import com.valora.kkiosk.R;
import com.valora.kkiosk.trivia.TriviaActivity.WhenMappings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.anko.Sdk19PropertiesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo21491d2 = {"<anonymous>", "", "initializedYouTubePlayer", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/player/YouTubePlayer;", "onInitSuccess"}, mo21492k = 3, mo21493mv = {1, 1, 15})
/* compiled from: TriviaActivity.kt */
final class TriviaActivity$initializeYoutubeLive$1 implements YouTubePlayerInitListener {
    final /* synthetic */ String $youtubeVideoid;
    final /* synthetic */ TriviaActivity this$0;

    TriviaActivity$initializeYoutubeLive$1(TriviaActivity triviaActivity, String str) {
        this.this$0 = triviaActivity;
        this.$youtubeVideoid = str;
    }

    public final void onInitSuccess(@NotNull final YouTubePlayer youTubePlayer) {
        Intrinsics.checkParameterIsNotNull(youTubePlayer, "initializedYouTubePlayer");
        youTubePlayer.addListener(new AbstractYouTubePlayerListener(this) {
            final /* synthetic */ TriviaActivity$initializeYoutubeLive$1 this$0;

            {
                this.this$0 = r1;
            }

            public void onReady() {
                this.this$0.this$0.initializedPlayer = youTubePlayer;
                youTubePlayer.loadVideo(this.this$0.$youtubeVideoid, 0.0f);
                youTubePlayer.play();
                View findViewById = TriviaActivity.access$getYoutubePlayerView$p(this.this$0.this$0).findViewById(R.id.panel);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "youtubePlayerView.findViewById<View>(R.id.panel)");
                Sdk19PropertiesKt.setBackgroundColor(findViewById, R.color.red);
            }

            public void onStateChange(@NotNull PlayerState playerState) {
                Intrinsics.checkParameterIsNotNull(playerState, "state");
                super.onStateChange(playerState);
                if (WhenMappings.$EnumSwitchMapping$0[playerState.ordinal()] == 1) {
                    youTubePlayer.play();
                }
            }
        });
    }
}
