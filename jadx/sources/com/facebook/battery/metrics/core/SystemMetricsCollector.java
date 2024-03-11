package com.facebook.battery.metrics.core;

import com.facebook.battery.metrics.core.SystemMetrics;

/* loaded from: classes2.dex */
public abstract class SystemMetricsCollector<T extends SystemMetrics> {
    public abstract T createMetrics();

    public abstract boolean getSnapshot(T t);
}
