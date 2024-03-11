package com.netflix.mediaclient.media.subtitles;

/* loaded from: classes.dex */
public abstract class BaseSubtitle implements Subtitle {
    protected static final String ATTR_CAN_DEVICE_RENDER = "canDeviceRender";
    protected static final String ATTR_FORCED_NARRATIVE = "isForcedNarrative";
    protected static final String ATTR_HYDRATED = "hydrated";
    protected static final String ATTR_ID = "id";
    protected static final String ATTR_LANGUAGE = "language";
    protected static final String ATTR_LANGUAGE_DESCRIPTION = "languageDescription";
    protected static final String ATTR_NEW_TRACK_ID = "new_track_id";
    protected static final String ATTR_NONE_TRACK = "isNoneTrack";
    public static final String ATTR_ORDER = "order";
    protected static final String ATTR_RANK = "rank";
    protected static final String ATTR_SELECTED = "selected";
    protected static final String ATTR_TRACK_TYPE = "trackType";
    public static final String IMPL = "impl";
    protected static final String TRACK_TYPE_NONE = "None";
    protected boolean canDeviceRender;
    protected String id;
    protected boolean isForcedNarrative;
    protected boolean isHydrated;
    protected boolean isNone;
    protected String languageCodeBcp47;
    protected String languageDescription;
    protected int nccpOrderNumber;
    protected String newTrackId;
    int rank;
    protected int trackType;

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public boolean canDeviceRender() {
        return this.canDeviceRender;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public String getId() {
        return this.id;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public String getLanguageCodeBcp47() {
        return this.languageCodeBcp47;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public String getLanguageDescription() {
        return this.languageDescription;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public int getNccpOrderNumber() {
        return this.nccpOrderNumber;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public String getNewTrackId() {
        return this.newTrackId;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public int getTrackType() {
        return this.trackType;
    }

    public int hashCode() {
        return this.nccpOrderNumber + 31;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public boolean isCC() {
        return this.trackType == 2;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public boolean isHydrated() {
        return this.isHydrated;
    }

    @Override // java.lang.Comparable
    public int compareTo(Subtitle subtitle) {
        if (subtitle == null) {
            return -1;
        }
        if (this.isForcedNarrative || this.isNone || !subtitle.isForcedNarrativeOrNone()) {
            if (((this.isForcedNarrative || this.isNone) && !subtitle.isForcedNarrativeOrNone()) || this.languageDescription == null) {
                return -1;
            }
            if (subtitle.getLanguageDescription() == null) {
                return 1;
            }
            int compare = String.CASE_INSENSITIVE_ORDER.compare(this.languageDescription, subtitle.getLanguageDescription());
            return compare == 0 ? this.languageDescription.compareTo(subtitle.getLanguageDescription()) : compare;
        }
        return 1;
    }

    public String toString() {
        return getClass().getSimpleName() + " [id=" + this.id + ", languageCodeBcp47=" + this.languageCodeBcp47 + ", languageDescription=" + this.languageDescription + ", trackType=" + this.trackType + ", canDeviceRender=" + this.canDeviceRender + ", nccpOrderNumber=" + this.nccpOrderNumber + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof Subtitle) && this.nccpOrderNumber == ((Subtitle) obj).getNccpOrderNumber();
    }
}
