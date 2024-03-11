package com.netflix.mediaclient.media.subtitles;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import o.C8123deT;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class MdxSubtitle extends BaseSubtitle {
    protected static final String ATTR_LABEL = "label";
    public static final int IMPL_VALUE = 2;
    private final boolean mSelected;

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public String getDownloadableId() {
        return null;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public int getRank() {
        return -1;
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

    public boolean isSelected() {
        return this.mSelected;
    }

    protected MdxSubtitle(JSONObject jSONObject, int i) {
        this.canDeviceRender = true;
        this.id = C8123deT.a(jSONObject, SignupConstants.Field.LANG_ID, (String) null);
        this.newTrackId = C8123deT.a(jSONObject, "new_track_id", (String) null);
        this.languageDescription = C8123deT.a(jSONObject, ATTR_LABEL, "English");
        this.isForcedNarrative = C8123deT.a(jSONObject, "isForcedNarrative", false);
        this.isNone = this.id.equalsIgnoreCase("None");
        this.nccpOrderNumber = i;
        this.mSelected = C8123deT.a(jSONObject, VisualStateDefinition.ELEMENT_STATE.SELECTED, false);
        this.trackType = 1;
    }

    public static final MdxSubtitle newInstance(JSONObject jSONObject, int i) {
        return new MdxSubtitle(jSONObject, i);
    }

    @Override // com.netflix.mediaclient.media.subtitles.BaseSubtitle
    public String toString() {
        return "MdxSubtitle [mSelected=" + this.mSelected + ", id=" + this.id + ", languageCodeBcp47=" + this.languageCodeBcp47 + ", languageDescription=" + this.languageDescription + ", trackType=" + this.trackType + ", canDeviceRender=" + this.canDeviceRender + ", nccpOrderNumber=" + this.nccpOrderNumber + "]";
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BaseSubtitle.IMPL, 2);
        jSONObject.put(SignupConstants.Field.LANG_ID, this.id);
        jSONObject.put("new_track_id", this.newTrackId);
        jSONObject.put(ATTR_LABEL, this.languageDescription);
        jSONObject.put(BaseSubtitle.ATTR_ORDER, this.nccpOrderNumber);
        jSONObject.put(VisualStateDefinition.ELEMENT_STATE.SELECTED, this.mSelected);
        return jSONObject;
    }
}
