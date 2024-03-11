package com.netflix.cl.model.envelope;

import com.netflix.cl.Platform;
import com.netflix.cl.model.ContextType;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class RemovedContext implements SimpleOperation {
    private ContextType context;

    public RemovedContext(ContextType contextType) {
        Platform.LocalLogger localLogger = Platform.getLocalLogger();
        localLogger.debug("" + contextType);
        this.context = contextType;
    }

    @Override // com.netflix.cl.model.envelope.SimpleOperation
    public JSONArray addItself(JSONArray jSONArray) {
        jSONArray.put(this.context.toJSONObject());
        return jSONArray;
    }
}
