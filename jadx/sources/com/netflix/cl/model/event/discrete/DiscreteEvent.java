package com.netflix.cl.model.event.discrete;

import com.netflix.cl.model.event.Event;

/* loaded from: classes.dex */
public abstract class DiscreteEvent extends Event {
    public DiscreteEvent() {
        addContextType("DiscreteEvent");
    }

    public String getEventMostDerivedType() {
        return this.types.get(0);
    }
}
