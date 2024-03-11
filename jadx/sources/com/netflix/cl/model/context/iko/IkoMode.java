package com.netflix.cl.model.context.iko;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.model.context.CLContext;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IkoMode extends CLContext implements Exclusive {
    public IkoMode() {
        addContextType("iko.IkoMode");
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
