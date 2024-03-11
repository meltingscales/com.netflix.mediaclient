package com.netflix.cl.model.context;

import com.netflix.cl.model.GestureInputKind;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class GestureInput extends UserInput {
    private GestureInputKind gesture;

    public GestureInput(GestureInputKind gestureInputKind, Double d) {
        super(d);
        addContextType("GestureInput");
        this.gesture = gestureInputKind;
    }

    @Override // com.netflix.cl.model.context.UserInput, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "gesture", this.gesture);
        return jSONObject;
    }
}
