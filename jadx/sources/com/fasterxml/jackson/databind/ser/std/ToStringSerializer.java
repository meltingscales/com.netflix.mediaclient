package com.fasterxml.jackson.databind.ser.std;

import o.InterfaceC9458pv;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class ToStringSerializer extends ToStringSerializerBase {
    public static final ToStringSerializer b = new ToStringSerializer();

    public ToStringSerializer() {
        super(Object.class);
    }

    public ToStringSerializer(Class<?> cls) {
        super(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase
    public final String e(Object obj) {
        return obj.toString();
    }
}
