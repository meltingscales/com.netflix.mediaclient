package com.facebook.battery.metrics.composite;

import androidx.collection.SimpleArrayMap;
import com.facebook.battery.metrics.core.SystemMetrics;
import com.facebook.battery.metrics.core.SystemMetricsCollector;
import com.facebook.battery.metrics.core.Utilities;

/* loaded from: classes2.dex */
public class CompositeMetricsCollector extends SystemMetricsCollector<CompositeMetrics> {
    private final SimpleArrayMap<Class<? extends SystemMetrics>, SystemMetricsCollector<?>> mMetricsCollectorMap;

    /* loaded from: classes2.dex */
    public static class Builder {
        final SimpleArrayMap<Class<? extends SystemMetrics>, SystemMetricsCollector<?>> mMetricsCollectorMap = new SimpleArrayMap<>();

        public <T extends SystemMetrics<T>> Builder addMetricsCollector(Class<T> cls, SystemMetricsCollector<T> systemMetricsCollector) {
            this.mMetricsCollectorMap.put(cls, systemMetricsCollector);
            return this;
        }

        public CompositeMetricsCollector build() {
            return new CompositeMetricsCollector(this);
        }
    }

    protected CompositeMetricsCollector(Builder builder) {
        SimpleArrayMap<Class<? extends SystemMetrics>, SystemMetricsCollector<?>> simpleArrayMap = new SimpleArrayMap<>();
        this.mMetricsCollectorMap = simpleArrayMap;
        simpleArrayMap.putAll(builder.mMetricsCollectorMap);
    }

    @Override // com.facebook.battery.metrics.core.SystemMetricsCollector
    public boolean getSnapshot(CompositeMetrics compositeMetrics) {
        Utilities.checkNotNull(compositeMetrics, "Null value passed to getSnapshot!");
        SimpleArrayMap<Class<? extends SystemMetrics>, SystemMetrics> metrics = compositeMetrics.getMetrics();
        int size = metrics.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Class<? extends SystemMetrics> keyAt = metrics.keyAt(i);
            SystemMetricsCollector<?> systemMetricsCollector = this.mMetricsCollectorMap.get(keyAt);
            boolean snapshot = systemMetricsCollector != null ? systemMetricsCollector.getSnapshot(compositeMetrics.getMetric(keyAt)) : false;
            compositeMetrics.setIsValid(keyAt, snapshot);
            z |= snapshot;
        }
        return z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.battery.metrics.core.SystemMetricsCollector
    public CompositeMetrics createMetrics() {
        CompositeMetrics compositeMetrics = new CompositeMetrics();
        int size = this.mMetricsCollectorMap.size();
        for (int i = 0; i < size; i++) {
            compositeMetrics.putMetric(this.mMetricsCollectorMap.keyAt(i), this.mMetricsCollectorMap.valueAt(i).createMetrics());
        }
        return compositeMetrics;
    }
}
