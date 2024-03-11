package com.netflix.cl.model.context.tvui;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.model.context.CLContext;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NrdAppId extends CLContext implements Exclusive {
    private String appId;

    public NrdAppId(String str) {
        addContextType("tvui.NrdAppId");
        this.appId = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, NetflixMediaDrm.PROPERTY_APP_ID, this.appId);
        return jSONObject;
    }
}
