package com.netflix.cl.model;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DataAccessEventArgs extends Data {
    private NetlixAppState appState;
    private Boolean cached;
    private AppView navigationLevel;
    private NetworkCallEvent[] networkCalls;
    private NetflixTraceStatus status;
    private String statusMsg;

    public DataAccessEventArgs(NetlixAppState netlixAppState, NetworkCallEvent[] networkCallEventArr, String str, Boolean bool, AppView appView, NetflixTraceStatus netflixTraceStatus) {
        this.appState = netlixAppState;
        this.networkCalls = networkCallEventArr;
        this.statusMsg = str;
        this.cached = bool;
        this.navigationLevel = appView;
        this.status = netflixTraceStatus;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "appState", this.appState);
        ExtCLUtils.addObjectToJson(jSONObject, "networkCalls", this.networkCalls);
        ExtCLUtils.addStringToJson(jSONObject, "statusMsg", this.statusMsg);
        ExtCLUtils.addObjectToJson(jSONObject, "cached", this.cached);
        ExtCLUtils.addObjectToJson(jSONObject, "navigationLevel", this.navigationLevel);
        ExtCLUtils.addObjectToJson(jSONObject, "status", this.status);
        return jSONObject;
    }
}
