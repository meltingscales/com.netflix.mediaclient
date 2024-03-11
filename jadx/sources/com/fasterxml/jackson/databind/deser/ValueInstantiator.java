package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.io.Serializable;
import o.C9491qb;

/* loaded from: classes5.dex */
public abstract class ValueInstantiator {
    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public JavaType c(DeserializationConfig deserializationConfig) {
        return null;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public SettableBeanProperty[] d(DeserializationConfig deserializationConfig) {
        return null;
    }

    public JavaType e(DeserializationConfig deserializationConfig) {
        return null;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public Class<?> k() {
        return Object.class;
    }

    public AnnotatedWithParams l() {
        return null;
    }

    public AnnotatedWithParams m() {
        return null;
    }

    public AnnotatedWithParams n() {
        return null;
    }

    public AnnotatedParameter o() {
        return null;
    }

    public String r() {
        Class<?> k = k();
        return k == null ? "UNKNOWN" : k.getName();
    }

    public boolean i() {
        return g() || f() || j() || b() || h() || c() || d() || e() || a();
    }

    public boolean g() {
        return n() != null;
    }

    public Object e(DeserializationContext deserializationContext) {
        return deserializationContext.c(k(), this, (JsonParser) null, "no default no-arguments constructor found", new Object[0]);
    }

    public Object d(DeserializationContext deserializationContext, Object[] objArr) {
        return deserializationContext.c(k(), this, (JsonParser) null, "no creator with arguments specified", new Object[0]);
    }

    public Object c(DeserializationContext deserializationContext, SettableBeanProperty[] settableBeanPropertyArr, C9491qb c9491qb) {
        return d(deserializationContext, c9491qb.a(settableBeanPropertyArr));
    }

    public Object b(DeserializationContext deserializationContext, Object obj) {
        return deserializationContext.c(k(), this, (JsonParser) null, "no delegate creator specified", new Object[0]);
    }

    public Object e(DeserializationContext deserializationContext, Object obj) {
        return deserializationContext.c(k(), this, (JsonParser) null, "no array delegate creator specified", new Object[0]);
    }

    public Object a(DeserializationContext deserializationContext, String str) {
        return b(deserializationContext, str);
    }

    public Object d(DeserializationContext deserializationContext, int i) {
        return deserializationContext.c(k(), this, (JsonParser) null, "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", Integer.valueOf(i));
    }

    public Object c(DeserializationContext deserializationContext, long j) {
        return deserializationContext.c(k(), this, (JsonParser) null, "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", Long.valueOf(j));
    }

    public Object a(DeserializationContext deserializationContext, double d) {
        return deserializationContext.c(k(), this, (JsonParser) null, "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", Double.valueOf(d));
    }

    public Object c(DeserializationContext deserializationContext, boolean z) {
        return deserializationContext.c(k(), this, (JsonParser) null, "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", Boolean.valueOf(z));
    }

    public Object b(DeserializationContext deserializationContext, String str) {
        if (a()) {
            String trim = str.trim();
            if ("true".equals(trim)) {
                return c(deserializationContext, true);
            }
            if ("false".equals(trim)) {
                return c(deserializationContext, false);
            }
        }
        if (str.length() == 0 && deserializationContext.d(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
            return null;
        }
        return deserializationContext.c(k(), this, deserializationContext.m(), "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
    }

    /* loaded from: classes5.dex */
    public static class Base extends ValueInstantiator implements Serializable {
        private static final long serialVersionUID = 1;
        protected final Class<?> e;

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Class<?> k() {
            return this.e;
        }

        public Base(Class<?> cls) {
            this.e = cls;
        }

        public Base(JavaType javaType) {
            this.e = javaType.h();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public String r() {
            return this.e.getName();
        }
    }
}
