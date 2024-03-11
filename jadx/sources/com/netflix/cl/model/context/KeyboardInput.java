package com.netflix.cl.model.context;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class KeyboardInput extends UserInput {
    private Boolean isHotKey;
    private Object keyCode;

    public KeyboardInput(Object obj, Boolean bool, Double d) {
        super(d);
        addContextType("KeyboardInput");
        this.keyCode = obj;
        this.isHotKey = bool;
    }

    @Override // com.netflix.cl.model.context.UserInput, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "keyCode", this.keyCode);
        ExtCLUtils.addObjectToJson(jSONObject, "isHotKey", this.isHotKey);
        return jSONObject;
    }
}
