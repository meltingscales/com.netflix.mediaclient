package com.netflix.cl.model.event;

import com.netflix.cl.Platform;
import com.netflix.cl.model.ContextType;
import com.netflix.cl.util.CLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class Event extends ContextType {
    private long sequence;
    public long timeInMs;

    public long getSequence() {
        return this.sequence;
    }

    public long getTimeInMs() {
        return this.timeInMs;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        jSONObject.put("time", this.timeInMs);
        jSONObject.put("sequence", this.sequence);
        return jSONObject;
    }

    public void prepareForSending() {
        if (this.id != 0 || this.sequence != 0 || this.timeInMs != 0) {
            Platform.ErrorReporter errorReporter = Platform.getErrorReporter();
            errorReporter.logHandledException("Event used before: " + getClass().getSimpleName());
            if (Platform.getLocalLogger().isDebug()) {
                throw new IllegalStateException("This should NOT happen! Event used before: " + getClass().getSimpleName());
            }
        }
        this.id = CLUtils.createContextId();
        this.sequence = Platform.getSequence();
        this.timeInMs = Platform.getCurrentTimeInMs();
    }
}
