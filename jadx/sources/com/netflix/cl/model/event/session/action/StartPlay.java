package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class StartPlay extends ActionTracked {
    private CommandValue command;
    private AppView parentView;
    private Long playerId;
    private Long startOffset;
    private AppView view;

    public StartPlay(AppView appView, Long l, AppView appView2, CommandValue commandValue, Long l2, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("StartPlay");
        this.view = appView;
        this.startOffset = l;
        this.parentView = appView2;
        this.command = commandValue;
        this.playerId = l2;
    }

    @Override // com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        ExtCLUtils.addObjectToJson(jSONObject, "startOffset", this.startOffset);
        ExtCLUtils.addObjectToJson(jSONObject, "parentView", this.parentView);
        ExtCLUtils.addObjectToJson(jSONObject, "command", this.command);
        ExtCLUtils.addObjectToJson(jSONObject, "playerId", this.playerId);
        return jSONObject;
    }
}
