package com.netflix.cl.model.event.session.command;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ChangeValueCommand extends Command {
    private Object desiredValue;

    public ChangeValueCommand(Object obj) {
        addContextType("ChangeValueCommand");
        this.desiredValue = obj;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "desiredValue", this.desiredValue);
        return jSONObject;
    }
}
