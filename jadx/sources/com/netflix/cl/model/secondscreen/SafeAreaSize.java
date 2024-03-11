package com.netflix.cl.model.secondscreen;

import com.netflix.cl.model.Data;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SafeAreaSize extends Data {
    private String bottom;
    private String left;
    private String right;
    private String top;

    public SafeAreaSize(String str, String str2, String str3, String str4) {
        this.top = str;
        this.left = str2;
        this.bottom = str3;
        this.right = str4;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "top", this.top);
        ExtCLUtils.addStringToJson(jSONObject, "left", this.left);
        ExtCLUtils.addStringToJson(jSONObject, "bottom", this.bottom);
        ExtCLUtils.addStringToJson(jSONObject, "right", this.right);
        return jSONObject;
    }
}
