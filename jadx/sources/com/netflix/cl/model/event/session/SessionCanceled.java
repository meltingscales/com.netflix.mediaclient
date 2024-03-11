package com.netflix.cl.model.event.session;

/* loaded from: classes.dex */
public class SessionCanceled extends SessionEnded {
    public SessionCanceled(Session session) {
        super(session);
        addContextType("SessionCanceled");
    }
}
