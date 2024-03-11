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
public final class MethodProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    protected final AnnotatedMethod a;
    protected final transient Method b;
    protected final boolean d;

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember e() {
        return this.a;
    }

    public MethodProperty(AbstractC9465qB abstractC9465qB, JavaType javaType, AbstractC9543ra abstractC9543ra, InterfaceC9532rP interfaceC9532rP, AnnotatedMethod annotatedMethod) {
        super(abstractC9465qB, javaType, abstractC9543ra, interfaceC9532rP);
        this.a = annotatedMethod;
        this.b = annotatedMethod.b();
        this.d = NullsConstantProvider.c(this.f13105o);
    }

    protected MethodProperty(MethodProperty methodProperty, AbstractC9452pp<?> abstractC9452pp, InterfaceC9428pR interfaceC9428pR) {
        super(methodProperty, abstractC9452pp, interfaceC9428pR);
        this.a = methodProperty.a;
        this.b = methodProperty.b;
        this.d = NullsConstantProvider.c(interfaceC9428pR);
    }

    protected MethodProperty(MethodProperty methodProperty, PropertyName propertyName) {
        super(methodProperty, propertyName);
        this.a = methodProperty.a;
        this.b = methodProperty.b;
        this.d = methodProperty.d;
    }

    protected MethodProperty(MethodProperty methodProperty, Method method) {
        super(methodProperty);
        this.a = methodProperty.a;
        this.b = method;
        this.d = methodProperty.d;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty c(PropertyName propertyName) {
        return new MethodProperty(this, propertyName);
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
        return new MethodProperty(this, abstractC9452pp, interfaceC9428pR);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty b(InterfaceC9428pR interfaceC9428pR) {
        return new MethodProperty(this, this.p, interfaceC9428pR);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void b(DeserializationConfig deserializationConfig) {
        this.a.d(deserializationConfig.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object a;
        if (!jsonParser.a(JsonToken.VALUE_NULL)) {
            AbstractC9543ra abstractC9543ra = this.q;
            if (abstractC9543ra == null) {
                Object b = this.p.b(jsonParser, deserializationContext);
                if (b != null) {
                    a = b;
                } else if (this.d) {
                    return;
                } else {
                    a = this.f13105o.c(deserializationContext);
                }
            } else {
                a = this.p.a(jsonParser, deserializationContext, abstractC9543ra);
            }
        } else if (this.d) {
            return;
        } else {
            a = this.f13105o.c(deserializationContext);
        }
        try {
            this.b.invoke(obj, a);
        } catch (Exception e) {
            c(jsonParser, e, a);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object a;
        if (!jsonParser.a(JsonToken.VALUE_NULL)) {
            AbstractC9543ra abstractC9543ra = this.q;
            if (abstractC9543ra == null) {
                Object b = this.p.b(jsonParser, deserializationContext);
                if (b != null) {
                    a = b;
                } else if (this.d) {
                    return obj;
                } else {
                    a = this.f13105o.c(deserializationContext);
                }
            } else {
                a = this.p.a(jsonParser, deserializationContext, abstractC9543ra);
            }
        } else if (this.d) {
            return obj;
        } else {
            a = this.f13105o.c(deserializationContext);
        }
        try {
            Object invoke = this.b.invoke(obj, a);
            return invoke == null ? obj : invoke;
        } catch (Exception e) {
            c(jsonParser, e, a);
            return null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void e(Object obj, Object obj2) {
        try {
            this.b.invoke(obj, obj2);
        } catch (Exception e) {
            c(e, obj2);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object c(Object obj, Object obj2) {
        try {
            Object invoke = this.b.invoke(obj, obj2);
            return invoke == null ? obj : invoke;
        } catch (Exception e) {
            c(e, obj2);
            return null;
        }
    }

    Object readResolve() {
        return new MethodProperty(this, this.a.b());
    }
}
