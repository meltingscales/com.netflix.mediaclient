package com.netflix.cl.model.event.session;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Presentation extends SessionTracked {
    private AppView view;

    public Presentation(AppView appView, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("Presentation");
        this.view = appView;
    }

    @Override // com.netflix.cl.model.event.session.SessionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        return jSONObject;
    }
}
