package com.netflix.cl.model;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CachedVideoInfo extends Data {
    private Boolean displayable;
    private Long id;
    private Long oxid;
    private CachedVideoPlayableStatus playableStatus;

    public CachedVideoInfo(Long l, CachedVideoPlayableStatus cachedVideoPlayableStatus, Boolean bool, Long l2) {
        this.oxid = l;
        this.playableStatus = cachedVideoPlayableStatus;
        this.displayable = bool;
        this.id = l2;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "oxid", this.oxid);
        ExtCLUtils.addObjectToJson(jSONObject, "playableStatus", this.playableStatus);
        ExtCLUtils.addObjectToJson(jSONObject, "displayable", this.displayable);
        ExtCLUtils.addObjectToJson(jSONObject, SignupConstants.Field.LANG_ID, this.id);
        return jSONObject;
    }
}
