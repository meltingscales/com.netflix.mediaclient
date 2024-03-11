package com.netflix.cl.model;

import com.netflix.cl.model.dial.DeviceInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class DeviceConnectionStatus extends Data {
    private Boolean connected;
    private DeviceInfo deviceInfo;

    public DeviceConnectionStatus(Boolean bool, DeviceInfo deviceInfo) {
        this.connected = bool;
        this.deviceInfo = deviceInfo;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "connected", this.connected);
        ExtCLUtils.addObjectToJson(jSONObject, "deviceInfo", this.deviceInfo);
        return jSONObject;
    }
}
