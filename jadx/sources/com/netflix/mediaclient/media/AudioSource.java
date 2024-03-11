package com.netflix.mediaclient.media;

import com.netflix.mediaclient.media.manifest.Stream;
import java.util.ArrayList;
import java.util.List;
import o.C1044Mm;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AudioSource implements Comparable<AudioSource> {
    public static final int ASSISTIVE_AUDIO = 2;
    protected static final String ATTR_BITRATE = "bitrate";
    protected static final String ATTR_BITRATES = "bitrates";
    protected static final String ATTR_CODECNAME = "codecName";
    protected static final String ATTR_DEFAULTTIMEDTEXT = "defaultTimedText";
    protected static final String ATTR_DISSALOWED_TIMED_TEXT_TRACK = "disallowedSubtitleTracks";
    protected static final String ATTR_DLID = "downloadable_id";
    protected static final String ATTR_HYDRATED = "hydrated";
    protected static final String ATTR_ID = "id";
    protected static final String ATTR_IS_NATIVE = "isNative";
    protected static final String ATTR_LANGUAGE = "language";
    protected static final String ATTR_LANGUAGE_DESCRIPTION = "languageDescription";
    protected static final String ATTR_NEW_TRACK_ID = "new_track_id";
    protected static final String ATTR_NUM_CHANNELS = "channels";
    protected static final String ATTR_OFFTRACKDISALLOWED = "offTrackDisallowed";
    protected static final String ATTR_ORDER = "order";
    protected static final String ATTR_PROFILE = "profile";
    protected static final String ATTR_RANK = "rank";
    protected static final String ATTR_SELECTED = "selected";
    protected static final String ATTR_TRACK_TYPE = "trackType";
    public static final String AUDIO_LANGUAGE_ZXX = "zxx";
    public static final int COMMENTARY_AUDIO = 1;
    public static final int DDPLUS_AUDIO = 4;
    public static final int DOLBY_AC3_AUDIO = 1;
    public static final int HEAAC_AUDIO = 3;
    protected static final String NONE = "none";
    public static final int OGG_VORBIS_AUDIO = 2;
    public static final int PRIMARY_AUDIO = 0;
    protected static final String TAG = "nf_audio_source";
    public static final int UNKNOWN_AUDIO = 3;
    public static final int UNKNOWN_AUDIO_CODEC = -1;
    public static final int WMA_AUDIO = 0;
    protected int bitrate;
    protected String codecName;
    public int codecType;
    protected String defaultTimedText;
    public String[] disallowedSubtitles;
    protected String dlid;
    public String id;
    protected boolean isHydrated;
    public boolean isNative;
    public boolean isSalsaSupported;
    public String languageCodeBcp47;
    public String languageDescription;
    public int nccpOrderNumber;
    public String newTrackId;
    public int numChannels;
    protected boolean offTracksDisallowed;
    protected String profile;
    protected int rank;
    public int trackType;
    protected List<Stream> streams = new ArrayList();
    protected List<Integer> bitrates = new ArrayList();

    public int getBitrate() {
        return this.bitrate;
    }

    public int getCodecType() {
        return this.codecType;
    }

    public String[] getDisallowedSubtitles() {
        return this.disallowedSubtitles;
    }

    public String getDlid() {
        return this.dlid;
    }

    public String getId() {
        return this.id;
    }

    public String getLanguageCodeBcp47() {
        return this.languageCodeBcp47;
    }

    public String getLanguageDescription() {
        return this.languageDescription;
    }

    public int getNccpOrderNumber() {
        return this.nccpOrderNumber;
    }

    public String getNewTrackId() {
        return this.newTrackId;
    }

    public int getNumChannels() {
        return this.numChannels;
    }

    public int getRank() {
        return this.rank;
    }

    public List<Stream> getStreams() {
        return this.streams;
    }

    public int getTrackType() {
        return this.trackType;
    }

    public int hashCode() {
        return this.nccpOrderNumber + 31;
    }

    public boolean isHydrated() {
        return this.isHydrated;
    }

    public boolean isNative() {
        return this.isNative;
    }

    public boolean isSalsaSupported() {
        return this.isSalsaSupported;
    }

    public abstract JSONObject toJson();

    public String getLanguageDescriptionDisplayLabel() {
        if (this.numChannels == 6) {
            return this.languageDescription + " (5.1)";
        }
        return this.languageDescription;
    }

    @Override // java.lang.Comparable
    public int compareTo(AudioSource audioSource) {
        String str;
        if (audioSource == null) {
            return -1;
        }
        int i = this.trackType;
        int i2 = audioSource.trackType;
        if (i > i2) {
            return 1;
        }
        if (i >= i2 && (str = this.languageDescription) != null) {
            String str2 = audioSource.languageDescription;
            if (str2 == null) {
                return 1;
            }
            int compare = String.CASE_INSENSITIVE_ORDER.compare(str, str2);
            if (compare == 0 && (compare = this.languageDescription.compareTo(audioSource.languageDescription)) == 0) {
                int i3 = this.numChannels;
                int i4 = audioSource.numChannels;
                if (i3 < i4) {
                    return 1;
                }
                return i3 == i4 ? 0 : -1;
            }
            return compare;
        }
        return -1;
    }

    public String toString() {
        return "AudioSource [id=" + this.id + "new track=" + this.newTrackId + ", languageCodeBcp47=" + this.languageCodeBcp47 + ", languageDescription=" + this.languageDescription + ", trackType=" + this.trackType + ", codecType=" + this.codecType + ", isNative=" + this.isNative + ", numChannels=" + this.numChannels + ", dissalowed subtitles # " + this.disallowedSubtitles.length + ", nccpOrderNumber=" + this.nccpOrderNumber + ", dlid=" + this.dlid + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isAllowedSubtitle(com.netflix.mediaclient.media.subtitles.Subtitle r7) {
        /*
            r6 = this;
            boolean r0 = r6.isSalsaSupported
            r1 = 1
            if (r0 != 0) goto Lb
            java.lang.String[] r0 = r6.disallowedSubtitles
            int r0 = r0.length
            if (r0 >= r1) goto Lb
            return r1
        Lb:
            java.lang.String r0 = "nf_audio_source"
            if (r7 != 0) goto L15
            java.lang.String r2 = "Checking if subtitle off is allowed"
            o.C1044Mm.e(r0, r2)
            goto L25
        L15:
            java.lang.String r2 = "Checking if subtitle is allowed"
            o.C1044Mm.e(r0, r2)
            java.lang.String r0 = r7.getId()
            if (r0 == 0) goto L25
            java.lang.String r0 = r7.getId()
            goto L27
        L25:
            java.lang.String r0 = "none"
        L27:
            r2 = 0
            r3 = r2
        L29:
            java.lang.String[] r4 = r6.disallowedSubtitles
            int r5 = r4.length
            if (r3 >= r5) goto L3c
            r4 = r4[r3]
            if (r4 == 0) goto L39
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 == 0) goto L39
            return r2
        L39:
            int r3 = r3 + 1
            goto L29
        L3c:
            boolean r3 = r6.isSalsaSupported
            if (r3 == 0) goto L64
            java.lang.String r3 = r6.defaultTimedText
            r4 = 6
            if (r3 == 0) goto L5b
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L64
            if (r7 == 0) goto L5a
            int r0 = r7.getTrackType()
            if (r0 == r4) goto L5a
            int r7 = r7.getTrackType()
            r0 = 7
            if (r7 != r0) goto L64
        L5a:
            return r2
        L5b:
            if (r7 == 0) goto L64
            int r7 = r7.getTrackType()
            if (r7 != r4) goto L64
            return r2
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.media.AudioSource.isAllowedSubtitle(com.netflix.mediaclient.media.subtitles.Subtitle):boolean");
    }

    public static void dumpLog(AudioSource[] audioSourceArr, String str) {
        if (audioSourceArr != null) {
            return;
        }
        C1044Mm.d(str, "Audios are null!");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof AudioSource) && this.nccpOrderNumber == ((AudioSource) obj).nccpOrderNumber;
    }
}
