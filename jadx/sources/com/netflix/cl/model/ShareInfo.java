package com.netflix.cl.model;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ShareInfo extends Data {
    private String target;
    private String url;

    public ShareInfo(String str, String str2) {
        this.url = str;
        this.target = str2;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, SignupConstants.Field.URL, this.url);
        ExtCLUtils.addStringToJson(jSONObject, "target", this.target);
        return jSONObject;
    }
}
