package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import java.io.File;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.InterfaceC9478qO;

/* loaded from: classes5.dex */
public class StdJdkSerializers {
    public static Collection<Map.Entry<Class<?>, Object>> c() {
        HashMap hashMap = new HashMap();
        hashMap.put(URL.class, new ToStringSerializer(URL.class));
        hashMap.put(URI.class, new ToStringSerializer(URI.class));
        hashMap.put(Currency.class, new ToStringSerializer(Currency.class));
        hashMap.put(UUID.class, new UUIDSerializer());
        hashMap.put(Pattern.class, new ToStringSerializer(Pattern.class));
        hashMap.put(Locale.class, new ToStringSerializer(Locale.class));
        hashMap.put(AtomicBoolean.class, AtomicBooleanSerializer.class);
        hashMap.put(AtomicInteger.class, AtomicIntegerSerializer.class);
        hashMap.put(AtomicLong.class, AtomicLongSerializer.class);
        hashMap.put(File.class, FileSerializer.class);
        hashMap.put(Class.class, ClassSerializer.class);
        NullSerializer nullSerializer = NullSerializer.b;
        hashMap.put(Void.class, nullSerializer);
        hashMap.put(Void.TYPE, nullSerializer);
        try {
            hashMap.put(Timestamp.class, DateSerializer.b);
            hashMap.put(Date.class, SqlDateSerializer.class);
            hashMap.put(Time.class, SqlTimeSerializer.class);
        } catch (NoClassDefFoundError unused) {
        }
        return hashMap.entrySet();
    }

    /* loaded from: classes5.dex */
    public static class AtomicBooleanSerializer extends StdScalarSerializer<AtomicBoolean> {
        public AtomicBooleanSerializer() {
            super(AtomicBoolean.class, false);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        /* renamed from: c */
        public void e(AtomicBoolean atomicBoolean, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            jsonGenerator.a(atomicBoolean.get());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
        public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
            return d("boolean", true);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
            interfaceC9478qO.c(javaType);
        }
    }

    /* loaded from: classes5.dex */
    public static class AtomicIntegerSerializer extends StdScalarSerializer<AtomicInteger> {
        public AtomicIntegerSerializer() {
            super(AtomicInteger.class, false);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void e(AtomicInteger atomicInteger, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            jsonGenerator.c(atomicInteger.get());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
        public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
            return d("integer", true);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
            c(interfaceC9478qO, javaType, JsonParser.NumberType.INT);
        }
    }

    /* loaded from: classes5.dex */
    public static class AtomicLongSerializer extends StdScalarSerializer<AtomicLong> {
        public AtomicLongSerializer() {
            super(AtomicLong.class, false);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        /* renamed from: a */
        public void e(AtomicLong atomicLong, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            jsonGenerator.b(atomicLong.get());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
        public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
            return d("integer", true);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
            c(interfaceC9478qO, javaType, JsonParser.NumberType.LONG);
        }
    }
}
