package com.netflix.cl.model.event.session.action.android;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.android.MinusOneCardInfo;
import com.netflix.cl.model.android.MinusOneRequestType;
import com.netflix.cl.model.event.session.action.ActionTracked;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class MinusOneRequest extends ActionTracked {
    private MinusOneCardInfo cardImpression;
    private CommandValue command;
    private AppView parentView;
    private MinusOneRequestType trigger;
    private AppView view;

    public MinusOneRequest(AppView appView, AppView appView2, MinusOneCardInfo minusOneCardInfo, MinusOneRequestType minusOneRequestType, CommandValue commandValue, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("android.MinusOneRequest");
        this.view = appView;
        this.parentView = appView2;
        this.cardImpression = minusOneCardInfo;
        this.trigger = minusOneRequestType;
        this.command = commandValue;
    }

    @Override // com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        ExtCLUtils.addObjectToJson(jSONObject, "parentView", this.parentView);
        ExtCLUtils.addObjectToJson(jSONObject, "cardImpression", this.cardImpression);
        ExtCLUtils.addObjectToJson(jSONObject, "trigger", this.trigger);
        ExtCLUtils.addObjectToJson(jSONObject, "command", this.command);
        return jSONObject;
    }
}
