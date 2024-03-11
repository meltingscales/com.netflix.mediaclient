package com.facebook.battery.metrics.core;

import com.facebook.battery.metrics.core.SystemMetrics;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class SystemMetrics<T extends SystemMetrics<T>> implements Serializable {
    public abstract T diff(T t, T t2);

    public abstract T set(T t);
}
