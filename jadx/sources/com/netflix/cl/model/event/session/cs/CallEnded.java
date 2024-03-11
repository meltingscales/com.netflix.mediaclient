package com.netflix.cl.model.event.session.cs;

import com.netflix.cl.model.event.session.SessionEnded;
import com.netflix.cl.model.event.session.action.cs.Call;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CallEnded extends SessionEnded {
    private JSONObject qualityReport;

    public CallEnded(Call call, JSONObject jSONObject) {
        super(call);
        addContextType("cs.CallEnded");
        this.qualityReport = jSONObject;
    }

    @Override // com.netflix.cl.model.event.session.SessionEnded, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addJsonToJson(jSONObject, "qualityReport", this.qualityReport);
        return jSONObject;
    }
}
