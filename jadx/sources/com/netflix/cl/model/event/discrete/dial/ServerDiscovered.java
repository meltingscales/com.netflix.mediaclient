package com.netflix.cl.model.event.discrete.dial;

import com.netflix.cl.model.event.discrete.DiscreteEvent;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes2.dex */
public final class ServerDiscovered extends DiscreteEvent {
    private String deviceDescription;
    private String discoveryResponseHeaders;
    private String uuid;

    public ServerDiscovered(String str, String str2, String str3) {
        addContextType("dial.ServerDiscovered");
        this.uuid = str;
        this.deviceDescription = str2;
        this.discoveryResponseHeaders = str3;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        addStringToJson(jSONObject, "uuid", this.uuid);
        addStringToJson(jSONObject, "deviceDescription", this.deviceDescription);
        addStringToJson(jSONObject, "discoveryResponseHeaders", this.discoveryResponseHeaders);
        return jSONObject;
    }
}
