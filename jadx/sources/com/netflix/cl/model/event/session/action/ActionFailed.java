package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.SessionEnded;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ActionFailed extends SessionEnded {
    private String error;

    public ActionFailed(Session session, String str) {
        super(session);
        addContextType("ActionFailed");
        this.error = str;
    }

    @Override // com.netflix.cl.model.event.session.SessionEnded, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        addStringToJson(jSONObject, UmaAlert.ICON_ERROR, this.error);
        return jSONObject;
    }
}
