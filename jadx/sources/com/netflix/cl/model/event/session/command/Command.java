package com.netflix.cl.model.event.session.command;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.model.event.session.Session;

/* loaded from: classes2.dex */
public abstract class Command extends Session implements Exclusive {
    public Command() {
        addContextType("Command");
    }
}
