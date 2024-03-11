package com.google.android.datatransport.runtime.time;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes2.dex */
public final class TimeModule_EventClockFactory implements Factory<Clock> {
    private static final TimeModule_EventClockFactory INSTANCE = new TimeModule_EventClockFactory();

    public static TimeModule_EventClockFactory create() {
        return INSTANCE;
    }

    @Override // javax.inject.Provider
    public Clock get() {
        return eventClock();
    }

    public static Clock eventClock() {
        return (Clock) Preconditions.checkNotNull(TimeModule.eventClock(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
