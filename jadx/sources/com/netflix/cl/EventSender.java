package com.netflix.cl;

import com.netflix.cl.model.envelope.LoggingEnvelope;
import com.netflix.cl.model.event.Event;

/* loaded from: classes.dex */
public interface EventSender {
    boolean canSendEvent(String str);

    void eventAdded(Event event, int i);

    void send(LoggingEnvelope loggingEnvelope);
}
