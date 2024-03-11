package com.netflix.cl.model.context.android;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.model.context.CLContext;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MirrorScreen extends CLContext implements Exclusive {
    private String displayName;

    public MirrorScreen(String str) {
        addContextType("android.MirrorScreen");
        this.displayName = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "displayName", this.displayName);
        return jSONObject;
    }
}
