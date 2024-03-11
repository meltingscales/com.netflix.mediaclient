package com.netflix.cl.model.event.session;

import com.netflix.cl.Logger;
import com.netflix.cl.Platform;
import com.netflix.cl.model.event.Event;

/* loaded from: classes.dex */
public abstract class Session extends Event {
    public final long getSessionId() {
        return this.id;
    }

    public Session() {
        addContextType("Session");
    }

    public String getSessionName() {
        return this.types.get(0);
    }

    public static SessionEnded createSessionEndedEvent(Long l) {
        Logger logger = Logger.INSTANCE;
        if (logger.isDisabled()) {
            return null;
        }
        Session session = logger.getSession(l);
        if (session != null) {
            return new SessionEnded(session);
        }
        Platform.getLocalLogger().error("Session::createSessionCanceledEvent: %d does not identifies Session! It should NOT happen, except on logout when we sever all sessions!", l);
        return null;
    }

    public static boolean doesSessionExist(Long l) {
        Logger logger = Logger.INSTANCE;
        return (logger.isDisabled() || logger.getSession(l) == null) ? false : true;
    }

    public static SessionCanceled createSessionCanceledEvent(Long l) {
        Logger logger = Logger.INSTANCE;
        if (logger.isDisabled()) {
            return null;
        }
        Session session = logger.getSession(l);
        if (session != null) {
            return new SessionCanceled(session);
        }
        Platform.getLocalLogger().error("Session::createSessionCanceledEvent: %d does not identifies Session! It should NOT happen, except on logout when we sever all sessions!", l);
        return null;
    }
}
