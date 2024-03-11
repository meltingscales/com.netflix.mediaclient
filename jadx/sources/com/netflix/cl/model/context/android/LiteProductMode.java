package com.netflix.cl.model.context.android;

import com.netflix.cl.model.context.CLContext;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class LiteProductMode extends CLContext {
    public LiteProductMode() {
        addContextType("android.LiteProductMode");
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
