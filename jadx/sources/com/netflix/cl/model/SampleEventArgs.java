package com.netflix.cl.model;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SampleEventArgs extends Data {
    private Map<String, Object> additionalProperties = new HashMap();
    private NetlixAppState appState;
    private Boolean cached;
    private JSONObject data;
    private JSONObject histograms;
    private AppView navigationLevel;
    private JSONObject samples;
    private JSONObject stats;
    private NetflixTraceStatus status;
    private String statusMsg;

    public SampleEventArgs(NetlixAppState netlixAppState, JSONObject jSONObject, String str, JSONObject jSONObject2, Boolean bool, JSONObject jSONObject3, AppView appView, NetflixTraceStatus netflixTraceStatus, JSONObject jSONObject4) {
        this.appState = netlixAppState;
        this.histograms = jSONObject;
        this.statusMsg = str;
        this.stats = jSONObject2;
        this.cached = bool;
        this.samples = jSONObject3;
        this.navigationLevel = appView;
        this.status = netflixTraceStatus;
        this.data = jSONObject4;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "appState", this.appState);
        ExtCLUtils.addJsonToJson(jSONObject, "histograms", this.histograms);
        ExtCLUtils.addStringToJson(jSONObject, "statusMsg", this.statusMsg);
        ExtCLUtils.addJsonToJson(jSONObject, "stats", this.stats);
        ExtCLUtils.addObjectToJson(jSONObject, "cached", this.cached);
        ExtCLUtils.addJsonToJson(jSONObject, "samples", this.samples);
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
