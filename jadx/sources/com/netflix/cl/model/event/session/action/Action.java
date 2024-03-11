package com.netflix.cl.model.event.session.action;

import com.netflix.cl.Logger;
import com.netflix.cl.Platform;
import com.netflix.cl.model.event.session.Session;

/* loaded from: classes.dex */
public abstract class Action extends Session {
    /* JADX INFO: Access modifiers changed from: protected */
    public Action() {
        addContextType("Action");
    }

    public static ActionFailed createActionFailedEvent(Long l, String str) {
        Logger logger = Logger.INSTANCE;
        if (logger.isDisabled()) {
            return null;
        }
        Session session = logger.getSession(l);
        if (session instanceof Action) {
            return new ActionFailed(session, str);
        }
        if (l != null) {
            Platform.getLocalLogger().error("Action::createActionFailedEvent: sessionId %d does not identifies Action! It should NOT happen!", session);
        } else {
            Platform.getLocalLogger().error("Action::createActionFailedEvent: sessionId is null! It should NOT happen if CLv2 is used for logging!");
        }
        return null;
    }
}
