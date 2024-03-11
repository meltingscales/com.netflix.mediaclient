package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import o.AbstractC9544rb;

/* loaded from: classes5.dex */
public abstract class ContainerSerializer<T> extends StdSerializer<T> {
    protected abstract ContainerSerializer<?> b(AbstractC9544rb abstractC9544rb);

    public abstract boolean d(T t);

    public ContainerSerializer(Class<T> cls) {
        super(cls);
    }

    public ContainerSerializer(JavaType javaType) {
        super(javaType);
    }

    public ContainerSerializer(Class<?> cls, boolean z) {
        super(cls, z);
    }

    public ContainerSerializer(ContainerSerializer<?> containerSerializer) {
        super(containerSerializer.q, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContainerSerializer<?> c(AbstractC9544rb abstractC9544rb) {
        return abstractC9544rb == null ? this : b(abstractC9544rb);
    }
}
