package com.netflix.mediaclient.media.mdx;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.subtitles.BaseSubtitle;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Arrays;
import o.C1044Mm;
import o.C8123deT;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class MdxAudioSource extends AudioSource {
    protected static final String ATTR_LABEL = "label";
    public static final int IMPL_VALUE = 2;
    private boolean mAvailable;
    private final boolean mSelected;
    private boolean mSupported;

    public boolean isAvailable() {
        return this.mAvailable;
    }

    public boolean isSelected() {
        return this.mSelected;
    }

    public boolean isSupported() {
        return this.mSupported;
    }

    protected MdxAudioSource(JSONObject jSONObject, int i) {
        this.id = C8123deT.a(jSONObject, SignupConstants.Field.LANG_ID, (String) null);
        this.newTrackId = C8123deT.a(jSONObject, "new_track_id", (String) null);
        this.languageDescription = C8123deT.a(jSONObject, ATTR_LABEL, "English");
        this.mSelected = C8123deT.a(jSONObject, VisualStateDefinition.ELEMENT_STATE.SELECTED, false);
        this.nccpOrderNumber = i;
        this.isNative = true;
        this.trackType = 0;
        this.isSalsaSupported = false;
        JSONArray c = C8123deT.c(jSONObject, "disallowedSubtitleTracks");
        if (c != null) {
            this.disallowedSubtitles = new String[c.length()];
            for (int i2 = 0; i2 < c.length(); i2++) {
                this.disallowedSubtitles[i2] = c.getString(i2);
            }
            return;
        }
        C1044Mm.e("nf_audio_source", "No disallowedSubtitleTracks!");
        this.disallowedSubtitles = new String[0];
    }

    public static MdxAudioSource newInstance(JSONObject jSONObject, int i) {
        return new MdxAudioSource(jSONObject, i);
    }

    @Override // com.netflix.mediaclient.media.AudioSource
    public boolean isAllowedSubtitle(Subtitle subtitle) {
        if (subtitle == null) {
            return false;
        }
        return super.isAllowedSubtitle(subtitle);
    }

    @Override // com.netflix.mediaclient.media.AudioSource
    public String toString() {
        return "MdxAudioSource [mSelected=" + this.mSelected + ", mSupported=" + this.mSupported + ", mAvailable=" + this.mAvailable + ", id=" + this.id + ", new track id= " + this.newTrackId + ", languageCodeBcp47=" + this.languageCodeBcp47 + ", languageDescription=" + this.languageDescription + ", trackType=" + this.trackType + ", codecType=" + this.codecType + ", isNative=" + this.isNative + ", numChannels=" + this.numChannels + ", nccpOrderNumber=" + this.nccpOrderNumber + ", disallowedSubtitles=" + Arrays.toString(this.disallowedSubtitles) + "]";
    }

    @Override // com.netflix.mediaclient.media.AudioSource
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BaseSubtitle.IMPL, 2);
        jSONObject.put(SignupConstants.Field.LANG_ID, this.id);
        jSONObject.put("new_track_id", this.newTrackId);
        jSONObject.put(ATTR_LABEL, this.languageDescription);
        jSONObject.put(BaseSubtitle.ATTR_ORDER, this.nccpOrderNumber);
        jSONObject.put(VisualStateDefinition.ELEMENT_STATE.SELECTED, this.mSelected);
        String[] strArr = this.disallowedSubtitles;
        if (strArr != null && strArr.length > 0) {
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("disallowedSubtitleTracks", jSONArray);
            int i = 0;
            while (true) {
                String[] strArr2 = this.disallowedSubtitles;
                if (i >= strArr2.length) {
                    break;
                }
                jSONArray.put(strArr2[i]);
                i++;
            }
        }
        return jSONObject;
    }
}
