package com.netflix.mediaclient.media.subtitles;

import com.netflix.mediaclient.media.SubtitleUrl;
import o.C1044Mm;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class OfflineSubtitle implements Subtitle {
    protected static final String ATTR_LOCAL_PATH = "localPath";
    protected static final String ATTR_PROFILE = "profile";
    protected static final String ATTR_SUBTITLE_URL = "subtitleUrl";
    protected static final String TAG = "nf_subtitles_offline";
    protected String mLocalFilePath;
    protected Subtitle mSubtitle;
    private SubtitleUrl mSubtitleUrl;

    protected abstract int getImplementation();

    public String getLocalFilePath() {
        return this.mLocalFilePath;
    }

    public SubtitleUrl getSubtitleUrl() {
        return this.mSubtitleUrl;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public boolean isHydrated() {
        return false;
    }

    public OfflineSubtitle(JSONObject jSONObject) {
        this.mSubtitle = NccpSubtitle.newInstance(jSONObject);
        this.mLocalFilePath = jSONObject.optString(ATTR_LOCAL_PATH);
        this.mSubtitleUrl = new SubtitleUrl(jSONObject.getJSONObject(ATTR_SUBTITLE_URL));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public OfflineSubtitle(Subtitle subtitle, SubtitleUrl subtitleUrl, String str) {
        this.mSubtitle = subtitle;
        this.mSubtitleUrl = subtitleUrl;
        this.mLocalFilePath = str;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public String getId() {
        return this.mSubtitle.getId();
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public String getNewTrackId() {
        return this.mSubtitle.getNewTrackId();
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public String getDownloadableId() {
        return this.mSubtitleUrl.getDownloadableId();
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public String getLanguageCodeBcp47() {
        return this.mSubtitle.getLanguageCodeBcp47();
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public String getLanguageDescription() {
        return this.mSubtitle.getLanguageDescription();
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public int getTrackType() {
        return this.mSubtitle.getTrackType();
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public boolean canDeviceRender() {
        return this.mSubtitle.canDeviceRender();
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public int getNccpOrderNumber() {
        return this.mSubtitle.getNccpOrderNumber();
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public boolean isCC() {
        return this.mSubtitle.isCC();
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public boolean isForcedNarrativeOrNone() {
        return this.mSubtitle.isForcedNarrativeOrNone();
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public boolean isForcedNarrative() {
        return this.mSubtitle.isForcedNarrative();
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public boolean isNone() {
        return this.mSubtitle.isNone();
    }

    public String getProfile() {
        return this.mSubtitleUrl.getProfile();
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public JSONObject toJson() {
        JSONObject json = this.mSubtitle.toJson();
        json.put(BaseSubtitle.IMPL, getImplementation());
        json.put(ATTR_LOCAL_PATH, this.mLocalFilePath);
        json.put(ATTR_SUBTITLE_URL, this.mSubtitleUrl.toJson());
        return json;
    }

    public String toString() {
        return getClass().getSimpleName() + "{subtitle=" + this.mSubtitle + ", SubtitleUrl=" + this.mSubtitleUrl + ", LocalFilePath='" + this.mLocalFilePath + "'}";
    }

    public String toString2() {
        try {
            return getClass().getSimpleName() + ": " + toJson().toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static OfflineSubtitle newInstance(Subtitle subtitle, SubtitleUrl subtitleUrl, String str) {
        if (str == null) {
            str = "";
        }
        C1044Mm.a(TAG, "OfflineSubtitle::newInstance: text, path %s", str);
        return new OfflineTextSubtitle(subtitle, subtitleUrl, str);
    }

    @Override // java.lang.Comparable
    public int compareTo(Subtitle subtitle) {
        Subtitle subtitle2;
        if (subtitle == null || (subtitle2 = this.mSubtitle) == null || subtitle2.getLanguageDescription() == null) {
            return -1;
        }
        if (subtitle.getLanguageDescription() == null) {
            return 1;
        }
        int compare = String.CASE_INSENSITIVE_ORDER.compare(this.mSubtitle.getLanguageDescription(), subtitle.getLanguageDescription());
        return compare == 0 ? this.mSubtitle.getLanguageDescription().compareTo(subtitle.getLanguageDescription()) : compare;
    }
}
