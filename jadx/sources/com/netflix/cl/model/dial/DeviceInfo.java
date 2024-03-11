package com.netflix.cl.model.dial;

import com.netflix.cl.model.Data;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class DeviceInfo extends Data {
    private JSONObject capabilities;
    private String manufacturer;
    private String modelName;
    private String modelNumber;
    private ServiceType serviceType;
    private String uuid;

    public DeviceInfo(ServiceType serviceType, String str, JSONObject jSONObject, String str2, String str3, String str4) {
        this.serviceType = serviceType;
        this.modelName = str;
        this.capabilities = jSONObject;
        this.modelNumber = str2;
        this.uuid = str3;
        this.manufacturer = str4;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "serviceType", this.serviceType);
        ExtCLUtils.addStringToJson(jSONObject, "modelName", this.modelName);
        ExtCLUtils.addJsonToJson(jSONObject, "capabilities", this.capabilities);
        ExtCLUtils.addStringToJson(jSONObject, "modelNumber", this.modelNumber);
        ExtCLUtils.addStringToJson(jSONObject, "uuid", this.uuid);
        ExtCLUtils.addStringToJson(jSONObject, "manufacturer", this.manufacturer);
        return jSONObject;
    }
}
