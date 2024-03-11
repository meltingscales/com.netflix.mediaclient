package com.netflix.cl.util;

import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.SessionEnded;

/* loaded from: classes.dex */
public interface SessionListener {
    void onEndSession(Session session, SessionEnded sessionEnded);

    void onStartSession(Session session);
}
