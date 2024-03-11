package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.lang.reflect.Field;
import o.AbstractC9452pp;
import o.AbstractC9465qB;
import o.AbstractC9543ra;
import o.C9537rU;
import o.InterfaceC9428pR;
import o.InterfaceC9532rP;

/* loaded from: classes5.dex */
public final class FieldProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    protected final transient Field a;
    protected final AnnotatedField b;
    protected final boolean d;

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember e() {
        return this.b;
    }

    public FieldProperty(AbstractC9465qB abstractC9465qB, JavaType javaType, AbstractC9543ra abstractC9543ra, InterfaceC9532rP interfaceC9532rP, AnnotatedField annotatedField) {
        super(abstractC9465qB, javaType, abstractC9543ra, interfaceC9532rP);
        this.b = annotatedField;
        this.a = annotatedField.b();
        this.d = NullsConstantProvider.c(this.f13105o);
    }

    protected FieldProperty(FieldProperty fieldProperty, AbstractC9452pp<?> abstractC9452pp, InterfaceC9428pR interfaceC9428pR) {
        super(fieldProperty, abstractC9452pp, interfaceC9428pR);
        this.b = fieldProperty.b;
        this.a = fieldProperty.a;
        this.d = NullsConstantProvider.c(interfaceC9428pR);
    }

    protected FieldProperty(FieldProperty fieldProperty, PropertyName propertyName) {
        super(fieldProperty, propertyName);
        this.b = fieldProperty.b;
        this.a = fieldProperty.a;
        this.d = fieldProperty.d;
    }

    protected FieldProperty(FieldProperty fieldProperty) {
        super(fieldProperty);
        AnnotatedField annotatedField = fieldProperty.b;
        this.b = annotatedField;
        Field b = annotatedField.b();
        if (b == null) {
            throw new IllegalArgumentException("Missing field (broken JDK (de)serialization?)");
        }
        this.a = b;
        this.d = fieldProperty.d;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty c(PropertyName propertyName) {
        return new FieldProperty(this, propertyName);
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
        return new FieldProperty(this, abstractC9452pp, interfaceC9428pR);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty b(InterfaceC9428pR interfaceC9428pR) {
        return new FieldProperty(this, this.p, interfaceC9428pR);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void b(DeserializationConfig deserializationConfig) {
        C9537rU.b(this.a, deserializationConfig.a(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
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
            this.a.set(obj, a);
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
            this.a.set(obj, a);
        } catch (Exception e) {
            c(jsonParser, e, a);
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void e(Object obj, Object obj2) {
        try {
            this.a.set(obj, obj2);
        } catch (Exception e) {
            c(e, obj2);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object c(Object obj, Object obj2) {
        try {
            this.a.set(obj, obj2);
        } catch (Exception e) {
            c(e, obj2);
        }
        return obj;
    }

    Object readResolve() {
        return new FieldProperty(this);
    }
}
