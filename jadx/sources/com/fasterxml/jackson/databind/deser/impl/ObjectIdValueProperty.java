package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import o.AbstractC9452pp;
import o.InterfaceC9428pR;

/* loaded from: classes5.dex */
public final class ObjectIdValueProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    protected final ObjectIdReader a;

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember e() {
        return null;
    }

    public ObjectIdValueProperty(ObjectIdReader objectIdReader, PropertyMetadata propertyMetadata) {
        super(objectIdReader.b, objectIdReader.e(), propertyMetadata, objectIdReader.b());
        this.a = objectIdReader;
    }

    protected ObjectIdValueProperty(ObjectIdValueProperty objectIdValueProperty, AbstractC9452pp<?> abstractC9452pp, InterfaceC9428pR interfaceC9428pR) {
        super(objectIdValueProperty, abstractC9452pp, interfaceC9428pR);
        this.a = objectIdValueProperty.a;
    }

    protected ObjectIdValueProperty(ObjectIdValueProperty objectIdValueProperty, PropertyName propertyName) {
        super(objectIdValueProperty, propertyName);
        this.a = objectIdValueProperty.a;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty c(PropertyName propertyName) {
        return new ObjectIdValueProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty d(AbstractC9452pp<?> abstractC9452pp) {
        AbstractC9452pp<?> abstractC9452pp2 = this.p;
        if (abstractC9452pp2 == abstractC9452pp) {
            return this;
        }
        InterfaceC9428pR interfaceC9428pR = this.f13105o;
        if (abstractC9452pp2 == interfaceC9428pR) {
            interfaceC9428pR = abstractC9452pp;
        }
        return new ObjectIdValueProperty(this, abstractC9452pp, interfaceC9428pR);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty b(InterfaceC9428pR interfaceC9428pR) {
        return new ObjectIdValueProperty(this, this.p, interfaceC9428pR);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        e(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        if (jsonParser.a(JsonToken.VALUE_NULL)) {
            return null;
        }
        Object b = this.p.b(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this.a;
        deserializationContext.d(b, objectIdReader.e, objectIdReader.j).d(obj);
        SettableBeanProperty settableBeanProperty = this.a.d;
        return settableBeanProperty != null ? settableBeanProperty.c(obj, b) : obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void e(Object obj, Object obj2) {
        c(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object c(Object obj, Object obj2) {
        SettableBeanProperty settableBeanProperty = this.a.d;
        if (settableBeanProperty == null) {
            throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
        }
        return settableBeanProperty.c(obj, obj2);
    }
}
