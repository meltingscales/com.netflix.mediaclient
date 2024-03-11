package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Audio;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class Audio implements Parcelable {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TYPE {
        public static final String challengeDefault = "challengeDefault";
        public static final String challengeUnlock = "challengeUnlock";
        public static final String choiceFocus = "focus";
        public static final String explicitSelection = "explicitSelection";
        public static final String explicitSelectionCorrect = "explicitSelectionCorrect";
        public static final String explicitSelectionCorrect2 = "explicitSelectionCorrect2";
        public static final String explicitSelectionCorrect3 = "explicitSelectionCorrect3";
        public static final String explicitSelectionCorrectMaxStreak = "explicitSelectionCorrectMaxStreak";
        public static final String explicitSelectionWrong = "explicitSelectionWrong";
        public static final String explicitSelectionWrongBreakStreak = "explicitSelectionWrongBreakStreak";
        public static final String init = "init";
        public static final String notificationAppear = "notificationAppear";
        public static final String playerSwap = "playerSwap";
        public static final String statUnlock = "statUnlock";
        public static final String timeout = "timeout";
        public static final String timeoutFail = "timeoutFail";
        public static final String timeoutPass = "timeoutPass";
    }

    public abstract float delay();

    public abstract String id();

    public abstract String url();

    public abstract float volume();

    public static TypeAdapter<Audio> typeAdapter(Gson gson) {
        return new C$AutoValue_Audio.GsonTypeAdapter(gson).setDefaultVolume(1.0f).setDefaultId("").setDefaultDelay(0.0f);
    }
}
