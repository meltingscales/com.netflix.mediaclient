package com.netflix.model.leafs.originals.interactive;

import android.content.Context;
import android.os.Parcelable;
import android.provider.Settings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_InteractiveSummary;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_InteractiveSummary_Features;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C8067ddQ;

/* loaded from: classes.dex */
public abstract class InteractiveSummary implements Parcelable {
    public abstract Features features();

    public abstract Map<String, String> nextSegmentRedirects();

    /* loaded from: classes.dex */
    public static abstract class Features implements Parcelable {
        public abstract String appUpdateDialogMessage();

        public abstract Double bookmarkOverrideSeconds();

        public abstract boolean choicePointDebugMenu();

        public abstract boolean customBookmark();

        public abstract boolean fallbackTutorial();

        public abstract boolean hideDetailedDurations();

        public abstract boolean hideSubtitlesMenuDuringPlayback();

        public abstract boolean interactiveAppUpdateDialogue();

        public abstract boolean interactiveTrailer();

        public abstract boolean ipp();

        public abstract boolean playbackGraph();

        public abstract boolean playerControlsPersistPlayPause();

        public abstract boolean playerControlsSnapshots();

        public abstract boolean pollingToggle();

        public abstract boolean prePlay();

        public abstract boolean resetUserState();

        public abstract List<String> supportedErrorDialogs();

        public abstract boolean videoMoments();

        public Long bookmarkOverrideMs() {
            Double bookmarkOverrideSeconds = bookmarkOverrideSeconds();
            if (bookmarkOverrideSeconds == null) {
                return null;
            }
            return Long.valueOf((long) (bookmarkOverrideSeconds.doubleValue() * 1000.0d));
        }

        public static TypeAdapter<Features> typeAdapter(Gson gson) {
            return new C$AutoValue_InteractiveSummary_Features.GsonTypeAdapter(gson).setDefaultSupportedErrorDialogs(new ArrayList(0)).setDefaultHideSubtitlesMenuDuringPlayback(false).setDefaultPlayerControlsPersistPlayPause(false);
        }
    }

    public static TypeAdapter<InteractiveSummary> typeAdapter(Gson gson) {
        return new C$AutoValue_InteractiveSummary.GsonTypeAdapter(gson).setDefaultFeatures(new AutoValue_InteractiveSummary_Features(false, false, false, false, false, false, false, false, false, false, false, false, null, new ArrayList(0), false, null, false, false));
    }

    public boolean isInDebug() {
        return features().choicePointDebugMenu() || C8067ddQ.c();
    }

    public boolean titleNeedsAppUpdate() {
        return !features().playbackGraph() && features().interactiveAppUpdateDialogue();
    }

    public boolean isBranchingNarrative() {
        return features().playbackGraph();
    }

    public boolean showAnimationWarningPopup(Context context) {
        return features().playbackGraph() && Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f;
    }
}
