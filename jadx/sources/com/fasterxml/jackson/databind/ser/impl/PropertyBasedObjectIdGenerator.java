package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import o.C9471qH;

/* loaded from: classes5.dex */
public class PropertyBasedObjectIdGenerator extends ObjectIdGenerators.PropertyGenerator {
    private static final long serialVersionUID = 1;
    protected final BeanPropertyWriter e;

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<Object> d(Object obj) {
        return this;
    }

    public PropertyBasedObjectIdGenerator(C9471qH c9471qH, BeanPropertyWriter beanPropertyWriter) {
        this(c9471qH.f(), beanPropertyWriter);
    }

    protected PropertyBasedObjectIdGenerator(Class<?> cls, BeanPropertyWriter beanPropertyWriter) {
        super(cls);
        this.e = beanPropertyWriter;
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator, com.fasterxml.jackson.annotation.ObjectIdGenerators.Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
    public boolean e(ObjectIdGenerator<?> objectIdGenerator) {
        if (objectIdGenerator.getClass() == getClass()) {
            PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = (PropertyBasedObjectIdGenerator) objectIdGenerator;
            if (propertyBasedObjectIdGenerator.a() == this.a && propertyBasedObjectIdGenerator.e == this.e) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public Object c(Object obj) {
        try {
            return this.e.b(obj);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException("Problem accessing property '" + this.e.a() + "': " + e2.getMessage(), e2);
        }
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<Object> a(Class<?> cls) {
        return cls == this.a ? this : new PropertyBasedObjectIdGenerator(cls, this.e);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator.IdKey b(Object obj) {
        if (obj == null) {
            return null;
        }
        return new ObjectIdGenerator.IdKey(getClass(), this.a, obj);
    }
}
