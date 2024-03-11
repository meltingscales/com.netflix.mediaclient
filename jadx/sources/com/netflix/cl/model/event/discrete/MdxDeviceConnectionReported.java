package com.netflix.cl.model.event.discrete;

import com.netflix.cl.model.DeviceConnectionStatus;
import com.netflix.cl.model.MdxDiscoveryFinalStatus;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class MdxDeviceConnectionReported extends DiscreteEvent {
    private DeviceConnectionStatus[] deviceConnectionStatuses;
    private MdxDiscoveryFinalStatus pageStatus;

    public MdxDeviceConnectionReported(MdxDiscoveryFinalStatus mdxDiscoveryFinalStatus, DeviceConnectionStatus[] deviceConnectionStatusArr) {
        addContextType("MdxDeviceConnectionReported");
        this.pageStatus = mdxDiscoveryFinalStatus;
        this.deviceConnectionStatuses = deviceConnectionStatusArr;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "pageStatus", this.pageStatus);
        ExtCLUtils.addObjectToJson(jSONObject, "deviceConnectionStatuses", this.deviceConnectionStatuses);
        return jSONObject;
    }
}
