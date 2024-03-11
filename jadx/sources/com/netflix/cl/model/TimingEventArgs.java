package com.netflix.cl.model;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TimingEventArgs extends Data {
    private Map<String, Object> additionalProperties = new HashMap();
    private NetlixAppState appState;
    private Boolean cached;
    private JSONObject data;
    private AppView navigationLevel;
    private NetflixTraceStatus status;
    private String statusMsg;

    public TimingEventArgs(NetlixAppState netlixAppState, String str, Boolean bool, AppView appView, NetflixTraceStatus netflixTraceStatus, JSONObject jSONObject) {
        this.appState = netlixAppState;
        this.statusMsg = str;
        this.cached = bool;
        this.navigationLevel = appView;
        this.status = netflixTraceStatus;
        this.data = jSONObject;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "appState", this.appState);
        ExtCLUtils.addStringToJson(jSONObject, "statusMsg", this.statusMsg);
        ExtCLUtils.addObjectToJson(jSONObject, "cached", this.cached);
        ExtCLUtils.addObjectToJson(jSONObject, "navigationLevel", this.navigationLevel);
        ExtCLUtils.addObjectToJson(jSONObject, "status", this.status);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = this.data;
        if (jSONObject3 != null) {
            jSONObject2.put(NotificationFactory.DATA, jSONObject3);
        }
        for (Map.Entry<String, Object> entry : this.additionalProperties.entrySet()) {
            ExtCLUtils.addObjectToJson(jSONObject2, entry.getKey(), entry.getValue());
        }
        jSONObject.put("debug", jSONObject2.toString());
        return jSONObject;
    }
}
