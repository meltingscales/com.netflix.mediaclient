package com.netflix.cl.model.event.session.command;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PlayCommand extends Command {
    private Long actualTime;

    public PlayCommand(Long l) {
        addContextType("PlayCommand");
        this.actualTime = l;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "actualTime", this.actualTime);
        return jSONObject;
    }
}
