package com.netflix.cl.model.context;

import com.netflix.cl.model.GestureInputDirection;
import com.netflix.cl.model.GestureInputKind;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DirectedGestureInput extends GestureInput {
    private GestureInputDirection direction;

    public DirectedGestureInput(GestureInputDirection gestureInputDirection, GestureInputKind gestureInputKind, Double d) {
        super(gestureInputKind, d);
        addContextType("DirectedGestureInput");
        this.direction = gestureInputDirection;
    }

    @Override // com.netflix.cl.model.context.GestureInput, com.netflix.cl.model.context.UserInput, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "direction", this.direction);
        return jSONObject;
    }
}
