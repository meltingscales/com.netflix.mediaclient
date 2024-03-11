package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import o.AbstractC9453pq;
import o.AbstractC9459pw;
import o.AbstractC9523rG;
import o.C9537rU;
import o.InterfaceC9478qO;

/* loaded from: classes5.dex */
public abstract class StdKeySerializers {
    protected static final AbstractC9453pq<Object> a = new StdKeySerializer();
    protected static final AbstractC9453pq<Object> d = new StringKeySerializer();

    public static AbstractC9453pq<Object> b(SerializationConfig serializationConfig, Class<?> cls, boolean z) {
        if (cls == null || cls == Object.class) {
            return new Dynamic();
        }
        if (cls == String.class) {
            return d;
        }
        if (cls.isPrimitive()) {
            cls = C9537rU.w(cls);
        }
        if (cls == Integer.class) {
            return new Default(5, cls);
        }
        if (cls == Long.class) {
            return new Default(6, cls);
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
            return new Default(8, cls);
        }
        if (cls == Class.class) {
            return new Default(3, cls);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return new Default(1, cls);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new Default(2, cls);
        }
        if (cls == UUID.class) {
            return new Default(8, cls);
        }
        if (cls == byte[].class) {
            return new Default(7, cls);
        }
        if (z) {
            return new Default(8, cls);
        }
        return null;
    }

    public static AbstractC9453pq<Object> d(SerializationConfig serializationConfig, Class<?> cls) {
        if (cls != null) {
            if (cls == Enum.class) {
                return new Dynamic();
            }
            if (C9537rU.t(cls)) {
                return EnumKeySerializer.d(cls, EnumValues.c(serializationConfig, cls));
            }
        }
        return new Default(8, cls);
    }

    /* loaded from: classes5.dex */
    public static class Default extends StdSerializer<Object> {
        protected final int c;

        public Default(int i, Class<?> cls) {
            super(cls, false);
            this.c = i;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            String name;
            switch (this.c) {
                case 1:
                    abstractC9459pw.d((Date) obj, jsonGenerator);
                    return;
                case 2:
                    abstractC9459pw.b(((Calendar) obj).getTimeInMillis(), jsonGenerator);
                    return;
                case 3:
                    jsonGenerator.a(((Class) obj).getName());
                    return;
                case 4:
                    if (abstractC9459pw.d(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                        name = obj.toString();
                    } else {
                        Enum r3 = (Enum) obj;
                        if (abstractC9459pw.d(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX)) {
                            name = String.valueOf(r3.ordinal());
                        } else {
                            name = r3.name();
                        }
                    }
                    jsonGenerator.a(name);
                    return;
                case 5:
                case 6:
                    jsonGenerator.c(((Number) obj).longValue());
                    return;
                case 7:
                    jsonGenerator.a(abstractC9459pw.c().i().d((byte[]) obj));
                    return;
                default:
                    jsonGenerator.a(obj.toString());
                    return;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class Dynamic extends StdSerializer<Object> {
        protected transient AbstractC9523rG a;

        public Dynamic() {
            super(String.class, false);
            this.a = AbstractC9523rG.c();
        }

        Object readResolve() {
            this.a = AbstractC9523rG.c();
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            Class<?> cls = obj.getClass();
            AbstractC9523rG abstractC9523rG = this.a;
            AbstractC9453pq<Object> c = abstractC9523rG.c(cls);
            if (c == null) {
                c = d(abstractC9523rG, cls, abstractC9459pw);
            }
            c.e(obj, jsonGenerator, abstractC9459pw);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
            e(interfaceC9478qO, javaType);
        }

        protected AbstractC9453pq<Object> d(AbstractC9523rG abstractC9523rG, Class<?> cls, AbstractC9459pw abstractC9459pw) {
            if (cls == Object.class) {
                Default r4 = new Default(8, cls);
                this.a = abstractC9523rG.d(cls, r4);
                return r4;
            }
            AbstractC9523rG.d e = abstractC9523rG.e(cls, abstractC9459pw, (BeanProperty) null);
            AbstractC9523rG abstractC9523rG2 = e.d;
            if (abstractC9523rG != abstractC9523rG2) {
                this.a = abstractC9523rG2;
            }
            return e.c;
        }
    }

    /* loaded from: classes5.dex */
    public static class StringKeySerializer extends StdSerializer<Object> {
        public StringKeySerializer() {
            super(String.class, false);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            jsonGenerator.a((String) obj);
        }
    }

    /* loaded from: classes5.dex */
    public static class EnumKeySerializer extends StdSerializer<Object> {
        protected final EnumValues e;

        protected EnumKeySerializer(Class<?> cls, EnumValues enumValues) {
            super(cls, false);
            this.e = enumValues;
        }

        public static EnumKeySerializer d(Class<?> cls, EnumValues enumValues) {
            return new EnumKeySerializer(cls, enumValues);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            if (abstractC9459pw.d(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                jsonGenerator.a(obj.toString());
                return;
            }
            Enum<?> r2 = (Enum) obj;
            if (abstractC9459pw.d(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX)) {
                jsonGenerator.a(String.valueOf(r2.ordinal()));
            } else {
                jsonGenerator.d(this.e.b(r2));
            }
        }
    }
}
