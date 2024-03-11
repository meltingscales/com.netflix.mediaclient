package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CachedPlay extends Play {
    private Long oxid;

    public CachedPlay(Long l, AppView appView, AppView appView2, CommandValue commandValue, Long l2, TrackingInfo trackingInfo) {
        super(appView, appView2, commandValue, l2, trackingInfo);
        addContextType("CachedPlay");
        this.oxid = l;
    }

    @Override // com.netflix.cl.model.event.session.action.Play, com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "oxid", this.oxid);
        return jSONObject;
    }
}
