package com.google.firebase.events;

/* loaded from: classes5.dex */
public class Event<T> {
    private final T payload;
    private final Class<T> type;

    public T getPayload() {
        return this.payload;
    }

    public Class<T> getType() {
        return this.type;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.type, this.payload);
    }
}
