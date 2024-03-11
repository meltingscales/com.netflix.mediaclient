package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import o.AbstractC9452pp;
import o.C9471qH;
import o.C9494qe;
import o.InterfaceC9428pR;

/* loaded from: classes5.dex */
public class ObjectIdReferenceProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    private final SettableBeanProperty b;

    public ObjectIdReferenceProperty(SettableBeanProperty settableBeanProperty, C9471qH c9471qH) {
        super(settableBeanProperty);
        this.b = settableBeanProperty;
        this.k = c9471qH;
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, AbstractC9452pp<?> abstractC9452pp, InterfaceC9428pR interfaceC9428pR) {
        super(objectIdReferenceProperty, abstractC9452pp, interfaceC9428pR);
        this.b = objectIdReferenceProperty.b;
        this.k = objectIdReferenceProperty.k;
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, PropertyName propertyName) {
        super(objectIdReferenceProperty, propertyName);
        this.b = objectIdReferenceProperty.b;
        this.k = objectIdReferenceProperty.k;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty c(PropertyName propertyName) {
        return new ObjectIdReferenceProperty(this, propertyName);
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
        return new ObjectIdReferenceProperty(this, abstractC9452pp, interfaceC9428pR);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty b(InterfaceC9428pR interfaceC9428pR) {
        return new ObjectIdReferenceProperty(this, this.p, interfaceC9428pR);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void b(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this.b;
        if (settableBeanProperty != null) {
            settableBeanProperty.b(deserializationConfig);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember e() {
        return this.b.e();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public int i() {
        return this.b.i();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        e(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        try {
            return c(obj, a(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e) {
            if (this.k == null && this.p.b() == null) {
                throw JsonMappingException.d(jsonParser, "Unresolved forward reference but no identity info", e);
            }
            e.a().e(new a(this, e, this.m.h(), obj));
            return null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void e(Object obj, Object obj2) {
        this.b.e(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object c(Object obj, Object obj2) {
        return this.b.c(obj, obj2);
    }

    /* loaded from: classes5.dex */
    public static final class a extends C9494qe.d {
        public final Object c;
        private final ObjectIdReferenceProperty e;

        public a(ObjectIdReferenceProperty objectIdReferenceProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this.e = objectIdReferenceProperty;
            this.c = obj;
        }

        @Override // o.C9494qe.d
        public void c(Object obj, Object obj2) {
            if (!d(obj)) {
                throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
            }
            this.e.e(this.c, obj2);
        }
    }
}
