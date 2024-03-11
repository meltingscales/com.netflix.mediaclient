package com.netflix.cl.model.event.session.ftl;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Session extends com.netflix.cl.model.event.session.Session implements Exclusive {
    private Long cell;
    private String[] targets;

    public Session(Long l, String[] strArr) {
        addContextType("ftl.Session");
        this.cell = l;
        this.targets = strArr;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "cell", this.cell);
        ExtCLUtils.addStringArrayToJson(jSONObject, "targets", this.targets);
        return jSONObject;
    }
}
