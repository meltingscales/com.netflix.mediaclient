package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/* loaded from: classes5.dex */
public class PropertyBasedObjectIdGenerator extends ObjectIdGenerators.PropertyGenerator {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<Object> d(Object obj) {
        return this;
    }

    public PropertyBasedObjectIdGenerator(Class<?> cls) {
        super(cls);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public Object c(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<Object> a(Class<?> cls) {
        return cls == this.a ? this : new PropertyBasedObjectIdGenerator(cls);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator.IdKey b(Object obj) {
        if (obj == null) {
            return null;
        }
        return new ObjectIdGenerator.IdKey(getClass(), this.a, obj);
    }
}
