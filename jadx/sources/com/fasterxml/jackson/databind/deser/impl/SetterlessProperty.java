package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.lang.reflect.Method;
import o.AbstractC9452pp;
import o.AbstractC9465qB;
import o.AbstractC9543ra;
import o.InterfaceC9428pR;
import o.InterfaceC9532rP;

/* loaded from: classes5.dex */
public final class SetterlessProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    protected final AnnotatedMethod a;
    protected final Method b;

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember e() {
        return this.a;
    }

    public SetterlessProperty(AbstractC9465qB abstractC9465qB, JavaType javaType, AbstractC9543ra abstractC9543ra, InterfaceC9532rP interfaceC9532rP, AnnotatedMethod annotatedMethod) {
        super(abstractC9465qB, javaType, abstractC9543ra, interfaceC9532rP);
        this.a = annotatedMethod;
        this.b = annotatedMethod.b();
    }

    protected SetterlessProperty(SetterlessProperty setterlessProperty, AbstractC9452pp<?> abstractC9452pp, InterfaceC9428pR interfaceC9428pR) {
        super(setterlessProperty, abstractC9452pp, interfaceC9428pR);
        this.a = setterlessProperty.a;
        this.b = setterlessProperty.b;
    }

    protected SetterlessProperty(SetterlessProperty setterlessProperty, PropertyName propertyName) {
        super(setterlessProperty, propertyName);
        this.a = setterlessProperty.a;
        this.b = setterlessProperty.b;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty c(PropertyName propertyName) {
        return new SetterlessProperty(this, propertyName);
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
        return new SetterlessProperty(this, abstractC9452pp, interfaceC9428pR);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty b(InterfaceC9428pR interfaceC9428pR) {
        return new SetterlessProperty(this, this.p, interfaceC9428pR);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void b(DeserializationConfig deserializationConfig) {
        this.a.d(deserializationConfig.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        if (jsonParser.a(JsonToken.VALUE_NULL)) {
            return;
        }
        if (this.q != null) {
            deserializationContext.c(d(), String.format("Problem deserializing 'setterless' property (\"%s\"): no way to handle typed deser with setterless yet", a()));
        }
        try {
            Object invoke = this.b.invoke(obj, null);
            if (invoke == null) {
                deserializationContext.c(d(), String.format("Problem deserializing 'setterless' property '%s': get method returned null", a()));
            }
            this.p.e(jsonParser, deserializationContext, invoke);
        } catch (Exception e) {
            e(jsonParser, e);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        d(jsonParser, deserializationContext, obj);
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void e(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should never call `set()` on setterless property ('" + a() + "')");
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object c(Object obj, Object obj2) {
        e(obj, obj2);
        return obj;
    }
}
