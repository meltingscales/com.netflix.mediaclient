package com.facebook.battery.reporter.core;

import com.facebook.battery.metrics.core.SystemMetrics;

/* loaded from: classes2.dex */
public interface SystemMetricsReporter<T extends SystemMetrics<T>> {

    /* loaded from: classes2.dex */
    public interface Event {
        void acquireEvent(String str, String str2);

        void add(String str, double d);

        void add(String str, long j);

        void add(String str, String str2);

        boolean isSampled();

        void logAndRelease();
    }

    void reportTo(T t, Event event);
}
