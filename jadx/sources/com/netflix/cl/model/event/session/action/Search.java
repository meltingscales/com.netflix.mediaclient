package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Search extends ActionTracked {
    private CommandValue command;
    private AppView parentView;
    private String searchTerm;
    private AppView view;

    public Search(AppView appView, String str, AppView appView2, CommandValue commandValue, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("Search");
        this.view = appView;
        this.searchTerm = str;
        this.parentView = appView2;
        this.command = commandValue;
    }

    @Override // com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        ExtCLUtils.addStringToJson(jSONObject, "searchTerm", this.searchTerm);
        ExtCLUtils.addObjectToJson(jSONObject, "parentView", this.parentView);
        ExtCLUtils.addObjectToJson(jSONObject, "command", this.command);
        return jSONObject;
    }
}
