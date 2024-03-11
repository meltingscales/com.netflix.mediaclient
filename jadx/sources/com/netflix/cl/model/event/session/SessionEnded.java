package com.netflix.cl.model.event.session;

import com.netflix.cl.Platform;
import com.netflix.cl.model.event.Event;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SessionEnded extends Event {
    protected long durationInMs;
    private long sessionId;
    protected String sessionName;
    private long sessionStartTimeInMs;

    public long getDurationInMs() {
        return this.durationInMs;
    }

    public long getSessionId() {
        return this.sessionId;
    }

    public String getSessionName() {
        return this.sessionName;
    }

    public SessionEnded(Session session) {
        if (session == null) {
            throw new IllegalArgumentException("Session can not be null!");
        }
        this.sessionStartTimeInMs = session.getTimeInMs();
        this.sessionId = session.getSessionId();
        this.sessionName = session.getSessionName();
        addContextType("SessionEnded");
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        jSONObject.put("duration", this.durationInMs);
        jSONObject.put("sessionId", this.sessionId);
        return jSONObject;
    }

    @Override // com.netflix.cl.model.event.Event
    public void prepareForSending() {
        super.prepareForSending();
        if (this.durationInMs != 0) {
            Platform.ErrorReporter errorReporter = Platform.getErrorReporter();
            errorReporter.logHandledException("Event used before: " + Event.class.getSimpleName());
            if (Platform.getLocalLogger().isDebug()) {
                throw new IllegalStateException("This should NOT happen! Session ended event used before: " + Event.class.getSimpleName() + ", duration was: " + this.durationInMs);
            }
        }
        this.durationInMs = this.timeInMs - this.sessionStartTimeInMs;
    }
}
