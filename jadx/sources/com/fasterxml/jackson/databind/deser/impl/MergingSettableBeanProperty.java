package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

/* loaded from: classes5.dex */
public class MergingSettableBeanProperty extends SettableBeanProperty.Delegating {
    private static final long serialVersionUID = 1;
    protected final AnnotatedMember d;

    protected MergingSettableBeanProperty(SettableBeanProperty settableBeanProperty, AnnotatedMember annotatedMember) {
        super(settableBeanProperty);
        this.d = annotatedMember;
    }

    public static MergingSettableBeanProperty a(SettableBeanProperty settableBeanProperty, AnnotatedMember annotatedMember) {
        return new MergingSettableBeanProperty(settableBeanProperty, annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
    public SettableBeanProperty d(SettableBeanProperty settableBeanProperty) {
        return new MergingSettableBeanProperty(settableBeanProperty, this.d);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object a;
        Object d = this.d.d(obj);
        if (d == null) {
            a = this.b.a(jsonParser, deserializationContext);
        } else {
            a = this.b.a(jsonParser, deserializationContext, d);
        }
        if (a != d) {
            this.b.e(obj, a);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object a;
        Object d = this.d.d(obj);
        if (d == null) {
            a = this.b.a(jsonParser, deserializationContext);
        } else {
            a = this.b.a(jsonParser, deserializationContext, d);
        }
        return (a == d || a == null) ? obj : this.b.c(obj, a);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void e(Object obj, Object obj2) {
        if (obj2 != null) {
            this.b.e(obj, obj2);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object c(Object obj, Object obj2) {
        return obj2 != null ? this.b.c(obj, obj2) : obj;
    }
}
