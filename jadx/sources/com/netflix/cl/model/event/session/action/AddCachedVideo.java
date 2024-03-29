package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.DownloadType;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AddCachedVideo extends ActionTracked {
    private CommandValue command;
    private DownloadType downloadType;
    private AppView parentView;
    private AppView view;

    public AddCachedVideo(AppView appView, AppView appView2, DownloadType downloadType, CommandValue commandValue, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("AddCachedVideo");
        this.view = appView;
        this.parentView = appView2;
        this.downloadType = downloadType;
        this.command = commandValue;
    }

    @Override // com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        ExtCLUtils.addObjectToJson(jSONObject, "parentView", this.parentView);
        ExtCLUtils.addObjectToJson(jSONObject, "downloadType", this.downloadType);
        ExtCLUtils.addObjectToJson(jSONObject, "command", this.command);
        return jSONObject;
    }
}
