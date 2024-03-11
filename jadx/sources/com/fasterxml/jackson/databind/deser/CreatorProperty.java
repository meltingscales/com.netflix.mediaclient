package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.InterfaceC9428pR;
import o.InterfaceC9532rP;

/* loaded from: classes5.dex */
public class CreatorProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    protected final AnnotatedParameter a;
    protected final int b;
    protected SettableBeanProperty d;
    protected boolean h;
    protected final Object i;

    public void b(SettableBeanProperty settableBeanProperty) {
        this.d = settableBeanProperty;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember e() {
        return this.a;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object g() {
        return this.i;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void h() {
        this.h = true;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public int i() {
        return this.b;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public boolean j() {
        return this.h;
    }

    public CreatorProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AbstractC9543ra abstractC9543ra, InterfaceC9532rP interfaceC9532rP, AnnotatedParameter annotatedParameter, int i, Object obj, PropertyMetadata propertyMetadata) {
        super(propertyName, javaType, propertyName2, abstractC9543ra, interfaceC9532rP, propertyMetadata);
        this.a = annotatedParameter;
        this.b = i;
        this.i = obj;
        this.d = null;
    }

    protected CreatorProperty(CreatorProperty creatorProperty, PropertyName propertyName) {
        super(creatorProperty, propertyName);
        this.a = creatorProperty.a;
        this.i = creatorProperty.i;
        this.d = creatorProperty.d;
        this.b = creatorProperty.b;
        this.h = creatorProperty.h;
    }

    protected CreatorProperty(CreatorProperty creatorProperty, AbstractC9452pp<?> abstractC9452pp, InterfaceC9428pR interfaceC9428pR) {
        super(creatorProperty, abstractC9452pp, interfaceC9428pR);
        this.a = creatorProperty.a;
        this.i = creatorProperty.i;
        this.d = creatorProperty.d;
        this.b = creatorProperty.b;
        this.h = creatorProperty.h;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty c(PropertyName propertyName) {
        return new CreatorProperty(this, propertyName);
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
        return new CreatorProperty(this, abstractC9452pp, interfaceC9428pR);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty b(InterfaceC9428pR interfaceC9428pR) {
        return new CreatorProperty(this, this.p, interfaceC9428pR);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void b(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this.d;
        if (settableBeanProperty != null) {
            settableBeanProperty.b(deserializationConfig);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        t();
        this.d.e(obj, a(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        t();
        return this.d.c(obj, a(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void e(Object obj, Object obj2) {
        t();
        this.d.e(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object c(Object obj, Object obj2) {
        t();
        return this.d.c(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyMetadata c() {
        PropertyMetadata c = super.c();
        SettableBeanProperty settableBeanProperty = this.d;
        return settableBeanProperty != null ? c.b(settableBeanProperty.c().e()) : c;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public String toString() {
        return "[creator property, name '" + a() + "'; inject id '" + this.i + "']";
    }

    private final void t() {
        if (this.d == null) {
            c((JsonParser) null, (DeserializationContext) null);
        }
    }

    private void c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = "No fallback setter/field defined for creator property '" + a() + "'";
        if (deserializationContext != null) {
            deserializationContext.c(d(), str);
            return;
        }
        throw InvalidDefinitionException.b(jsonParser, str, d());
    }
}
