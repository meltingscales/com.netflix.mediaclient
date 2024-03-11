package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ManagedReferenceProperty extends SettableBeanProperty.Delegating {
    private static final long serialVersionUID = 1;
    protected final SettableBeanProperty a;
    protected final boolean d;
    protected final String h;

    public ManagedReferenceProperty(SettableBeanProperty settableBeanProperty, String str, SettableBeanProperty settableBeanProperty2, boolean z) {
        super(settableBeanProperty);
        this.h = str;
        this.a = settableBeanProperty2;
        this.d = z;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
    public SettableBeanProperty d(SettableBeanProperty settableBeanProperty) {
        throw new IllegalStateException("Should never try to reset delegate");
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void b(DeserializationConfig deserializationConfig) {
        this.b.b(deserializationConfig);
        this.a.b(deserializationConfig);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        e(obj, this.b.a(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return c(obj, a(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void e(Object obj, Object obj2) {
        c(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object c(Object obj, Object obj2) {
        Object[] objArr;
        if (obj2 != null) {
            if (this.d) {
                if (obj2 instanceof Object[]) {
                    for (Object obj3 : (Object[]) obj2) {
                        if (obj3 != null) {
                            this.a.e(obj3, obj);
                        }
                    }
                } else if (obj2 instanceof Collection) {
                    for (Object obj4 : (Collection) obj2) {
                        if (obj4 != null) {
                            this.a.e(obj4, obj);
                        }
                    }
                } else if (!(obj2 instanceof Map)) {
                    throw new IllegalStateException("Unsupported container type (" + obj2.getClass().getName() + ") when resolving reference '" + this.h + "'");
                } else {
                    for (Object obj5 : ((Map) obj2).values()) {
                        if (obj5 != null) {
                            this.a.e(obj5, obj);
                        }
                    }
                }
            } else {
                this.a.e(obj2, obj);
            }
        }
        return this.b.c(obj, obj2);
    }
}
