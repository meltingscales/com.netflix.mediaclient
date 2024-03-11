package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_Action;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class Action implements Parcelable {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ActionType {
        public static final String EXIT_TO_CREDITS = "exitToCredits";
        public static final String EXIT_TO_POSTPLAY = "exitToPostPlay";
        public static final String EXIT_TO_SOURCE_OF_PLAY = "exitToSourceOfPlay";
        public static final String NEXT_EPISODE = "playNextEpisode";
        public static final String PLAY_SEGMENT = "playSegment";
        public static final String PLAY_VIDEO = "playVideo";
        public static final String SKIP_PREPLAY = "skipPrePlay";
        public static final String UNDEFINED = "un_defi_ned";
    }

    @SerializedName("bookmarkPosition")
    public abstract Float bookmarkPositionMs();

    @Deprecated
    public abstract String newSegmentId();

    @Deprecated
    public abstract Integer newTimeMs();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String segmentId();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Integer startTimeMs();

    public abstract String type();

    public static TypeAdapter<Action> typeAdapter(Gson gson) {
        return new C$AutoValue_Action.GsonTypeAdapter(gson).setDefaultType(ActionType.UNDEFINED);
    }
}
