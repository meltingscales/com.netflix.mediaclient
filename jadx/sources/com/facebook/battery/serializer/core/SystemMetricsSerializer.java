package com.facebook.battery.serializer.core;

import com.facebook.battery.metrics.core.SystemMetrics;
import java.io.DataInput;
import java.io.DataOutput;

/* loaded from: classes2.dex */
public abstract class SystemMetricsSerializer<T extends SystemMetrics<T>> {
    public abstract boolean deserializeContents(T t, DataInput dataInput);

    public abstract void serializeContents(T t, DataOutput dataOutput);

    public final void serialize(T t, DataOutput dataOutput) {
        dataOutput.writeShort(251);
        dataOutput.writeShort(1);
        dataOutput.writeInt(getTag());
        serializeContents(t, dataOutput);
    }

    public final boolean deserialize(T t, DataInput dataInput) {
        if (dataInput.readShort() == 251 && dataInput.readShort() == 1 && dataInput.readInt() == getTag()) {
            return deserializeContents(t, dataInput);
        }
        return false;
    }

    public final int getTag() {
        return getClass().toString().hashCode();
    }
}
