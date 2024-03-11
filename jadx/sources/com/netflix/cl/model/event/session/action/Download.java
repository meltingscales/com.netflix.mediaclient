package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Download extends ActionTracked {
    private CommandValue command;
    private Long dxid;
    private Long oxid;
    private AppView parentView;
    private AppView view;

    public Download(Long l, Long l2, AppView appView, AppView appView2, CommandValue commandValue, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("Download");
        this.dxid = l;
        this.oxid = l2;
        this.view = appView;
        this.parentView = appView2;
        this.command = commandValue;
    }

    @Override // com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "dxid", this.dxid);
        ExtCLUtils.addObjectToJson(jSONObject, "oxid", this.oxid);
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        ExtCLUtils.addObjectToJson(jSONObject, "parentView", this.parentView);
        ExtCLUtils.addObjectToJson(jSONObject, "command", this.command);
        return jSONObject;
    }
}
