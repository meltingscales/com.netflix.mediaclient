package com.netflix.mediaclient.media.subtitles;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.AbstractC4537bgQ;
import o.C8123deT;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NccpSubtitle extends BaseSubtitle {
    public static final int IMPL_VALUE = 1;
    private static final String TRACK_TYPE_ASSISTIVE = "ASSISTIVE";
    private static final String TRACK_TYPE_FORCED_NARRATIVE_SUBTITLE = "FORCED_NARRATIVE_SUBTITLE";
    private static final String TRACK_TYPE_PRIMARY = "PRIMARY";

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public String getDownloadableId() {
        return null;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public int getRank() {
        return this.rank;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public boolean isForcedNarrative() {
        return this.isForcedNarrative;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public boolean isForcedNarrativeOrNone() {
        return this.isForcedNarrative || this.isNone;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public boolean isNone() {
        return this.isNone;
    }

    protected NccpSubtitle(JSONObject jSONObject) {
        if (jSONObject.has(BaseSubtitle.ATTR_ORDER)) {
            this.nccpOrderNumber = jSONObject.getInt(BaseSubtitle.ATTR_ORDER);
        }
        this.canDeviceRender = C8123deT.a(jSONObject, "canDeviceRender", false);
        this.id = C8123deT.a(jSONObject, SignupConstants.Field.LANG_ID, (String) null);
        this.newTrackId = C8123deT.a(jSONObject, "new_track_id", (String) null);
        this.languageCodeBcp47 = C8123deT.a(jSONObject, "language", SignupConstants.Language.ENGLISH_EN);
        this.languageDescription = C8123deT.a(jSONObject, "languageDescription", "English");
        String a = C8123deT.a(jSONObject, "trackType", (String) null);
        this.isForcedNarrative = C8123deT.a(jSONObject, "isForcedNarrative", false);
        this.isNone = this.id.equalsIgnoreCase("None");
        if (a == null) {
            this.trackType = 0;
        } else if (TRACK_TYPE_ASSISTIVE.equalsIgnoreCase(a)) {
            this.trackType = 2;
        } else if (TRACK_TYPE_PRIMARY.equalsIgnoreCase(a)) {
            this.trackType = 1;
        } else if (TRACK_TYPE_FORCED_NARRATIVE_SUBTITLE.equalsIgnoreCase(a)) {
            this.trackType = 6;
        }
        if (this.isForcedNarrative) {
            this.trackType = 6;
        }
        if (this.isNone) {
            this.trackType = 7;
        }
        this.rank = C8123deT.a(jSONObject, "rank", -1);
        this.isHydrated = C8123deT.a(jSONObject, "hydrated", true);
    }

    protected NccpSubtitle(AbstractC4537bgQ abstractC4537bgQ, int i) {
        this.nccpOrderNumber = i;
        this.canDeviceRender = abstractC4537bgQ.e();
        this.id = abstractC4537bgQ.f();
        this.newTrackId = abstractC4537bgQ.m();
        this.languageCodeBcp47 = abstractC4537bgQ.h() == null ? SignupConstants.Language.ENGLISH_EN : abstractC4537bgQ.h();
        this.languageDescription = abstractC4537bgQ.o() == null ? "English" : abstractC4537bgQ.o();
        String n = abstractC4537bgQ.n();
        this.isForcedNarrative = abstractC4537bgQ.i();
        this.isHydrated = abstractC4537bgQ.g();
        this.isNone = this.id.equalsIgnoreCase("None");
        this.rank = abstractC4537bgQ.k();
        if (n == null) {
            this.trackType = 0;
        } else if (TRACK_TYPE_ASSISTIVE.equalsIgnoreCase(n)) {
            this.trackType = 2;
        } else if (TRACK_TYPE_PRIMARY.equalsIgnoreCase(n)) {
            this.trackType = 1;
        } else if (TRACK_TYPE_FORCED_NARRATIVE_SUBTITLE.equalsIgnoreCase(n)) {
            this.trackType = 6;
        }
        if (this.isForcedNarrative) {
            this.trackType = 6;
        }
        if (this.isNone) {
            this.trackType = 7;
        }
    }

    public static final Subtitle newInstance(JSONObject jSONObject) {
        return new NccpSubtitle(jSONObject);
    }

    public static final Subtitle newInstance(JSONObject jSONObject, int i) {
        NccpSubtitle nccpSubtitle = new NccpSubtitle(jSONObject);
        nccpSubtitle.nccpOrderNumber = i;
        return nccpSubtitle;
    }

    public static final Subtitle newInstance(AbstractC4537bgQ abstractC4537bgQ, int i) {
        return new NccpSubtitle(abstractC4537bgQ, i);
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BaseSubtitle.IMPL, 1);
        jSONObject.put(SignupConstants.Field.LANG_ID, this.id);
        jSONObject.put("new_track_id", this.newTrackId);
        jSONObject.put(BaseSubtitle.ATTR_ORDER, this.nccpOrderNumber);
        jSONObject.put("canDeviceRender", this.canDeviceRender);
        jSONObject.put("language", this.languageCodeBcp47);
        jSONObject.put("languageDescription", this.languageDescription);
        jSONObject.put("isForcedNarrative", this.isForcedNarrative);
        int i = this.trackType;
        jSONObject.put("trackType", i == 2 ? TRACK_TYPE_ASSISTIVE : i == 1 ? TRACK_TYPE_PRIMARY : null);
        jSONObject.put("rank", this.rank);
        jSONObject.put("hydrated", this.isHydrated);
        return jSONObject;
    }

    @Override // com.netflix.mediaclient.media.subtitles.BaseSubtitle
    public String toString() {
        return "NccpSubtitle[id=" + this.id + ", newTrackId=" + this.newTrackId + ", languageCodeBcp47=" + this.languageCodeBcp47 + ", languageDescription=" + this.languageDescription + ", trackType=" + this.trackType + ", canDeviceRender=" + this.canDeviceRender + ", nccpOrderNumber=" + this.nccpOrderNumber + "]";
    }
}
