package com.netflix.cl.model.event.session.ftl;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NetworkChangeSession extends Session {
    public NetworkChangeSession(Long l, String[] strArr) {
        super(l, strArr);
        addContextType("ftl.NetworkChangeSession");
    }

    @Override // com.netflix.cl.model.event.session.ftl.Session, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
