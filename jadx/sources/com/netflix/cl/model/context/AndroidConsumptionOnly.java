package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AndroidConsumptionOnly extends CLContext implements Exclusive {
    public AndroidConsumptionOnly() {
        addContextType("AndroidConsumptionOnly");
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
