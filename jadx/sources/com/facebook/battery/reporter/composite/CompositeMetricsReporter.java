package com.facebook.battery.reporter.composite;

import androidx.collection.SimpleArrayMap;
import com.facebook.battery.metrics.composite.CompositeMetrics;
import com.facebook.battery.metrics.core.SystemMetrics;
import com.facebook.battery.reporter.core.SystemMetricsReporter;

/* loaded from: classes2.dex */
public class CompositeMetricsReporter implements SystemMetricsReporter<CompositeMetrics> {
    private final SimpleArrayMap<Class<? extends SystemMetrics>, SystemMetricsReporter<?>> mMetricsReporterMap = new SimpleArrayMap<>();

    @Override // com.facebook.battery.reporter.core.SystemMetricsReporter
    public void reportTo(CompositeMetrics compositeMetrics, SystemMetricsReporter.Event event) {
        for (int i = 0; i < this.mMetricsReporterMap.size(); i++) {
            Class<? extends SystemMetrics> keyAt = this.mMetricsReporterMap.keyAt(i);
            if (compositeMetrics.isValid(keyAt)) {
                this.mMetricsReporterMap.get(keyAt).reportTo(compositeMetrics.getMetric(keyAt), event);
            }
        }
    }

    public <T extends SystemMetrics<T>> CompositeMetricsReporter addMetricsReporter(Class<T> cls, SystemMetricsReporter<T> systemMetricsReporter) {
        this.mMetricsReporterMap.put(cls, systemMetricsReporter);
        return this;
    }
}
