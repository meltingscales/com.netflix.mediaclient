package com.netflix.cl.model.context.android;

import com.netflix.cl.model.context.CLContext;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DeepLinkReferrer extends CLContext {
    private String uri;

    public DeepLinkReferrer(String str) {
        addContextType("android.DeepLinkReferrer");
        this.uri = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "uri", this.uri);
        return jSONObject;
    }
}
