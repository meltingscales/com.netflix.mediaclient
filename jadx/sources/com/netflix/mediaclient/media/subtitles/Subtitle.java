package com.netflix.mediaclient.media.subtitles;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface Subtitle extends Comparable<Subtitle> {
    public static final int CLOSED_CAPTION_SUBTITLE = 2;
    public static final int COMMENTARY = 4;
    public static final int DESCRIPTIONS = 5;
    public static final int FORCED_NARRATIVE = 6;
    public static final int NONE = 7;
    public static final int PRIMARY_SUBTITLE = 1;
    public static final int SUBTITLES = 3;
    public static final int UNKNOWN_SUBTITLE = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AllowedTrackTypes {
    }

    boolean canDeviceRender();

    String getDownloadableId();

    String getId();

    String getLanguageCodeBcp47();

    String getLanguageDescription();

    int getNccpOrderNumber();

    String getNewTrackId();

    int getRank();

    int getTrackType();

    boolean isCC();

    boolean isForcedNarrative();

    boolean isForcedNarrativeOrNone();

    boolean isHydrated();

    boolean isNone();

    JSONObject toJson();
}
