package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.core.JsonToken;

/* loaded from: classes5.dex */
public class WritableTypeId {
    public String a;
    public Object b;
    public Class<?> c;
    public Inclusion d;
    public Object e;
    public JsonToken f;
    public boolean h;

    /* loaded from: classes5.dex */
    public enum Inclusion {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY;

        public boolean a() {
            return this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY;
        }
    }

    public WritableTypeId() {
    }

    public WritableTypeId(Object obj, JsonToken jsonToken) {
        this(obj, jsonToken, null);
    }

    public WritableTypeId(Object obj, JsonToken jsonToken, Object obj2) {
        this.b = obj;
        this.e = obj2;
        this.f = jsonToken;
    }
}
