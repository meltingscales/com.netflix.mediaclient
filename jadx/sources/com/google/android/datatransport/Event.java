package com.google.android.datatransport;

/* loaded from: classes2.dex */
public abstract class Event<T> {
    public abstract Integer getCode();

    public abstract T getPayload();

    public abstract Priority getPriority();

    public static <T> Event<T> ofData(int i, T t) {
        return new AutoValue_Event(Integer.valueOf(i), t, Priority.DEFAULT);
    }

    public static <T> Event<T> ofTelemetry(int i, T t) {
        return new AutoValue_Event(Integer.valueOf(i), t, Priority.VERY_LOW);
    }

    public static <T> Event<T> ofTelemetry(T t) {
        return new AutoValue_Event(null, t, Priority.VERY_LOW);
    }
}
