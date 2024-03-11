package com.netflix.cl.model;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ProfileSettings extends Data {
    private String avatarName;
    private Boolean kids;
    private String language;
    private MaturityLevel maturityLevel;
    private Boolean nextEpisodeAutoplay;
    private String publicHandle;
    private String[] secondaryLanguages;
    private Boolean videoMerchEnabled;

    public ProfileSettings(Boolean bool, String str, String str2, String[] strArr, MaturityLevel maturityLevel, String str3, Boolean bool2, Boolean bool3) {
        this.videoMerchEnabled = bool;
        this.avatarName = str;
        this.publicHandle = str2;
        this.secondaryLanguages = strArr;
        this.maturityLevel = maturityLevel;
        this.language = str3;
        this.nextEpisodeAutoplay = bool2;
        this.kids = bool3;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "videoMerchEnabled", this.videoMerchEnabled);
        ExtCLUtils.addStringToJson(jSONObject, "avatarName", this.avatarName);
        ExtCLUtils.addStringToJson(jSONObject, "publicHandle", this.publicHandle);
        ExtCLUtils.addStringArrayToJson(jSONObject, SignupConstants.Field.SECONDARY_LANGUAGES, this.secondaryLanguages);
        ExtCLUtils.addObjectToJson(jSONObject, "maturityLevel", this.maturityLevel);
        ExtCLUtils.addStringToJson(jSONObject, "language", this.language);
        ExtCLUtils.addObjectToJson(jSONObject, "nextEpisodeAutoplay", this.nextEpisodeAutoplay);
        ExtCLUtils.addObjectToJson(jSONObject, "kids", this.kids);
        return jSONObject;
    }
}
