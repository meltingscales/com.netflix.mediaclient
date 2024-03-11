package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SetThumbRating extends ActionTracked {
    private CommandValue command;
    private AppView parentView;
    private Long thumbRating;
    private AppView view;

    public SetThumbRating(AppView appView, AppView appView2, Long l, CommandValue commandValue, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("SetThumbRating");
        this.view = appView;
        this.parentView = appView2;
        this.thumbRating = l;
        this.command = commandValue;
    }

    @Override // com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        ExtCLUtils.addObjectToJson(jSONObject, "parentView", this.parentView);
        ExtCLUtils.addObjectToJson(jSONObject, "thumbRating", this.thumbRating);
        ExtCLUtils.addObjectToJson(jSONObject, "command", this.command);
        return jSONObject;
    }
}