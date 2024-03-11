package com.facebook.battery.metrics.composite;

import androidx.collection.SimpleArrayMap;
import com.facebook.battery.metrics.core.SystemMetrics;
import com.facebook.battery.metrics.core.Utilities;

/* loaded from: classes2.dex */
public class CompositeMetrics extends SystemMetrics<CompositeMetrics> {
    private final SimpleArrayMap<Class<? extends SystemMetrics>, SystemMetrics> mMetricsMap = new SimpleArrayMap<>();
    private final SimpleArrayMap<Class<? extends SystemMetrics>, Boolean> mMetricsValid = new SimpleArrayMap<>();

    public SimpleArrayMap<Class<? extends SystemMetrics>, SystemMetrics> getMetrics() {
        return this.mMetricsMap;
    }

    @Override // com.facebook.battery.metrics.core.SystemMetrics
    public CompositeMetrics diff(CompositeMetrics compositeMetrics, CompositeMetrics compositeMetrics2) {
        SystemMetrics metric;
        if (compositeMetrics2 != null) {
            if (compositeMetrics == null) {
                compositeMetrics2.set(this);
            } else {
                int size = this.mMetricsMap.size();
                for (int i = 0; i < size; i++) {
                    Class<? extends SystemMetrics> keyAt = this.mMetricsMap.keyAt(i);
                    boolean z = isValid(keyAt) && compositeMetrics.isValid(keyAt);
                    if (z && (metric = compositeMetrics2.getMetric(keyAt)) != null) {
                        getMetric(keyAt).diff(compositeMetrics.getMetric(keyAt), metric);
                    }
                    compositeMetrics2.setIsValid(keyAt, z);
                }
            }
            return compositeMetrics2;
        }
        throw new IllegalArgumentException("CompositeMetrics doesn't support nullable results");
    }

    @Override // com.facebook.battery.metrics.core.SystemMetrics
    public CompositeMetrics set(CompositeMetrics compositeMetrics) {
        int size = this.mMetricsMap.size();
        for (int i = 0; i < size; i++) {
            Class<? extends SystemMetrics> keyAt = this.mMetricsMap.keyAt(i);
            SystemMetrics metric = compositeMetrics.getMetric(keyAt);
            if (metric != null) {
                getMetric(keyAt).set(metric);
                setIsValid(keyAt, compositeMetrics.isValid(keyAt));
            } else {
                setIsValid(keyAt, false);
            }
        }
        return this;
    }

    public <T extends SystemMetrics<T>> CompositeMetrics putMetric(Class<T> cls, T t) {
        this.mMetricsMap.put(cls, t);
        this.mMetricsValid.put(cls, Boolean.FALSE);
        return this;
    }

    public <T extends SystemMetrics<T>> T getMetric(Class<T> cls) {
        return cls.cast(this.mMetricsMap.get(cls));
    }

    public boolean isValid(Class cls) {
        Boolean bool = this.mMetricsValid.get(cls);
        return bool != null && bool.booleanValue();
    }

    public void setIsValid(Class cls, boolean z) {
        this.mMetricsValid.put(cls, z ? Boolean.TRUE : Boolean.FALSE);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Composite Metrics{\n");
        int size = this.mMetricsMap.size();
        for (int i = 0; i < size; i++) {
            sb.append(this.mMetricsMap.valueAt(i));
            sb.append(isValid(this.mMetricsMap.keyAt(i)) ? " [valid]" : " [invalid]");
            sb.append('\n');
        }
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompositeMetrics compositeMetrics = (CompositeMetrics) obj;
        return Utilities.simpleArrayMapEquals(this.mMetricsValid, compositeMetrics.mMetricsValid) && Utilities.simpleArrayMapEquals(this.mMetricsMap, compositeMetrics.mMetricsMap);
    }

    public int hashCode() {
        return (this.mMetricsMap.hashCode() * 31) + this.mMetricsValid.hashCode();
    }
}
