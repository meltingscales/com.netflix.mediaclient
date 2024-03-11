package com.netflix.mediaclient.media;

import o.C8123deT;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class SubtitleUrl {
    private static final String ATTR_CDN_ID = "cdnId";
    private static final String ATTR_DOWNLOADABLE_ID = "downloadableId";
    private static final String ATTR_PROFILE = "profile";
    private static final String ATTR_URL = "url";
    private static final String ATTR_XID = "xid";
    private static final String TAG = "nf_subtitles";
    private long mCdnId;
    private String mDownloadableId;
    private String mProfile;
    private long mSize;
    private String mUrl;

    public long getCdnId() {
        return this.mCdnId;
    }

    public String getDownloadUrl() {
        return this.mUrl;
    }

    public String getDownloadableId() {
        return this.mDownloadableId;
    }

    public String getProfile() {
        return this.mProfile;
    }

    public long getSize() {
        return this.mSize;
    }

    public String getSubtitleProfile() {
        return this.mProfile;
    }

    public SubtitleUrl(JSONObject jSONObject) {
        this.mSize = -1L;
        populate(jSONObject);
    }

    protected void populate(JSONObject jSONObject) {
        this.mUrl = C8123deT.a(jSONObject, "url", (String) null);
        this.mProfile = C8123deT.a(jSONObject, ATTR_PROFILE, (String) null);
        this.mCdnId = C8123deT.d(jSONObject, ATTR_CDN_ID, 0L);
        this.mDownloadableId = C8123deT.a(jSONObject, ATTR_DOWNLOADABLE_ID, (String) null);
    }

    public SubtitleUrl(String str, String str2, long j, String str3, long j2) {
        this.mUrl = str;
        this.mProfile = str2;
        this.mCdnId = j;
        this.mDownloadableId = str3;
        this.mSize = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubtitleUrl subtitleUrl = (SubtitleUrl) obj;
        String str = this.mUrl;
        if (str == null ? subtitleUrl.mUrl == null : str.equals(subtitleUrl.mUrl)) {
            String str2 = this.mDownloadableId;
            if (str2 == null ? subtitleUrl.mDownloadableId == null : str2.equals(subtitleUrl.mDownloadableId)) {
                return this.mCdnId == subtitleUrl.mCdnId && this.mProfile == subtitleUrl.mProfile;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.mUrl;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.mDownloadableId;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = (int) this.mCdnId;
        String str3 = this.mProfile;
        return (((((hashCode * 31) + hashCode2) * 31) + i) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        String str = this.mUrl;
        if (str != null) {
            jSONObject.put("url", str);
        }
        jSONObject.put(ATTR_PROFILE, this.mProfile);
        jSONObject.put(ATTR_CDN_ID, this.mCdnId);
        jSONObject.put(ATTR_DOWNLOADABLE_ID, this.mDownloadableId);
        return jSONObject;
    }

    public String toString() {
        return "SubtitleUrl{mUrl='" + this.mUrl + "', mDownloadableId='" + this.mDownloadableId + "', mCdnId=" + this.mCdnId + ", mProfile=" + this.mProfile + '}';
    }
}
