package com.netflix.cl.model.event.session.accessibility;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.model.accessibility.ColorCorrectionType;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ColorCorrectionSession extends AccessibilityToolSession implements Exclusive {
    private ColorCorrectionType colorCorrectionValue;

    public ColorCorrectionSession(ColorCorrectionType colorCorrectionType) {
        addContextType("accessibility.ColorCorrectionSession");
        this.colorCorrectionValue = colorCorrectionType;
    }

    @Override // com.netflix.cl.model.event.session.accessibility.AccessibilityToolSession, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "colorCorrectionValue", this.colorCorrectionValue);
        return jSONObject;
    }
}
