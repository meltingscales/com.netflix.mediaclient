package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DeviceLocale extends CLContext implements Exclusive {
    private String deviceLocale;

    public DeviceLocale(String str) {
        addContextType("DeviceLocale");
        this.deviceLocale = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "deviceLocale", this.deviceLocale);
        return jSONObject;
    }
}
