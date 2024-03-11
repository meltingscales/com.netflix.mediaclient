package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MdxLib extends CLContext implements Exclusive {
    private String libVersion;

    public MdxLib(String str) {
        addContextType("MdxLib");
        this.libVersion = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "libVersion", this.libVersion);
        return jSONObject;
    }
}
