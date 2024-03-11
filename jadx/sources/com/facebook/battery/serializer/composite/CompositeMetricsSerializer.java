package com.facebook.battery.serializer.composite;

import android.util.SparseArray;
import androidx.collection.SimpleArrayMap;
import com.facebook.battery.metrics.composite.CompositeMetrics;
import com.facebook.battery.metrics.core.SystemMetrics;
import com.facebook.battery.serializer.core.SystemMetricsSerializer;
import java.io.DataInput;
import java.io.DataOutput;

/* loaded from: classes2.dex */
public class CompositeMetricsSerializer extends SystemMetricsSerializer<CompositeMetrics> {
    private final SimpleArrayMap<Class<? extends SystemMetrics>, SystemMetricsSerializer<?>> mSerializers = new SimpleArrayMap<>();
    private final SparseArray<SystemMetricsSerializer<? extends SystemMetrics<?>>> mDeserializers = new SparseArray<>();
    private final SparseArray<Class<? extends SystemMetrics<?>>> mDeserializerClasses = new SparseArray<>();

    public <T extends SystemMetrics<T>> CompositeMetricsSerializer addMetricsSerializer(Class<T> cls, SystemMetricsSerializer<T> systemMetricsSerializer) {
        this.mSerializers.put(cls, systemMetricsSerializer);
        this.mDeserializers.put(systemMetricsSerializer.getTag(), systemMetricsSerializer);
        this.mDeserializerClasses.put(systemMetricsSerializer.getTag(), cls);
        return this;
    }

    @Override // com.facebook.battery.serializer.core.SystemMetricsSerializer
    public void serializeContents(CompositeMetrics compositeMetrics, DataOutput dataOutput) {
        int size = this.mSerializers.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (compositeMetrics.isValid(this.mSerializers.keyAt(i2))) {
                i++;
            }
        }
        dataOutput.writeInt(i);
        for (int i3 = 0; i3 < size; i3++) {
            Class<? extends SystemMetrics> keyAt = this.mSerializers.keyAt(i3);
            if (compositeMetrics.isValid(keyAt)) {
                SystemMetricsSerializer<?> valueAt = this.mSerializers.valueAt(i3);
                dataOutput.writeInt(valueAt.getTag());
                valueAt.serializeContents(compositeMetrics.getMetric(keyAt), dataOutput);
            }
        }
    }

    @Override // com.facebook.battery.serializer.core.SystemMetricsSerializer
    public boolean deserializeContents(CompositeMetrics compositeMetrics, DataInput dataInput) {
        SimpleArrayMap<Class<? extends SystemMetrics>, SystemMetrics> metrics = compositeMetrics.getMetrics();
        int size = compositeMetrics.getMetrics().size();
        for (int i = 0; i < size; i++) {
            compositeMetrics.setIsValid(metrics.keyAt(i), false);
        }
        int readInt = dataInput.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = dataInput.readInt();
            SystemMetricsSerializer<? extends SystemMetrics<?>> systemMetricsSerializer = this.mDeserializers.get(readInt2);
            Class<? extends SystemMetrics<?>> cls = this.mDeserializerClasses.get(readInt2);
            if (systemMetricsSerializer == null || cls == null || !systemMetricsSerializer.deserializeContents(compositeMetrics.getMetric(cls), dataInput)) {
                return false;
            }
            compositeMetrics.setIsValid(cls, true);
        }
        return true;
    }
}
