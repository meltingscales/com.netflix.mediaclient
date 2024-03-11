package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Map;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9458pv;
import o.InterfaceC9478qO;
import o.InterfaceC9562rt;

/* loaded from: classes5.dex */
public class NumberSerializers {
    protected NumberSerializers() {
    }

    public static void d(Map<String, AbstractC9453pq<?>> map) {
        map.put(Integer.class.getName(), new IntegerSerializer(Integer.class));
        Class cls = Integer.TYPE;
        map.put(cls.getName(), new IntegerSerializer(cls));
        map.put(Long.class.getName(), new LongSerializer(Long.class));
        Class cls2 = Long.TYPE;
        map.put(cls2.getName(), new LongSerializer(cls2));
        String name = Byte.class.getName();
        IntLikeSerializer intLikeSerializer = IntLikeSerializer.a;
        map.put(name, intLikeSerializer);
        map.put(Byte.TYPE.getName(), intLikeSerializer);
        String name2 = Short.class.getName();
        ShortSerializer shortSerializer = ShortSerializer.a;
        map.put(name2, shortSerializer);
        map.put(Short.TYPE.getName(), shortSerializer);
        map.put(Double.class.getName(), new DoubleSerializer(Double.class));
        Class cls3 = Double.TYPE;
        map.put(cls3.getName(), new DoubleSerializer(cls3));
        String name3 = Float.class.getName();
        FloatSerializer floatSerializer = FloatSerializer.c;
        map.put(name3, floatSerializer);
        map.put(Float.TYPE.getName(), floatSerializer);
    }

    /* loaded from: classes5.dex */
    public static abstract class Base<T> extends StdScalarSerializer<T> implements InterfaceC9562rt {
        protected final boolean b;
        protected final String d;
        protected final JsonParser.NumberType e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        protected Base(Class<?> cls, JsonParser.NumberType numberType, String str) {
            super(cls, false);
            boolean z = false;
            this.e = numberType;
            this.d = str;
            this.b = (numberType == JsonParser.NumberType.INT || numberType == JsonParser.NumberType.LONG || numberType == JsonParser.NumberType.BIG_INTEGER) ? true : true;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
        public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
            return d(this.d, true);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
            if (this.b) {
                c(interfaceC9478qO, javaType, this.e);
            } else {
                d(interfaceC9478qO, javaType, this.e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC9562rt
        public AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
            JsonFormat.Value c = c(abstractC9459pw, beanProperty, (Class<?>) c());
            if (c == null || AnonymousClass4.b[c.a().ordinal()] != 1) {
                return this;
            }
            if (c() == BigDecimal.class) {
                return NumberSerializer.d();
            }
            return ToStringSerializer.b;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.std.NumberSerializers$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            b = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class ShortSerializer extends Base<Object> {
        static final ShortSerializer a = new ShortSerializer();

        public ShortSerializer() {
            super(Short.class, JsonParser.NumberType.INT, "number");
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            jsonGenerator.b(((Short) obj).shortValue());
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class IntegerSerializer extends Base<Object> {
        public IntegerSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.INT, "integer");
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            jsonGenerator.c(((Integer) obj).intValue());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.AbstractC9453pq
        public void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
            e(obj, jsonGenerator, abstractC9459pw);
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class IntLikeSerializer extends Base<Object> {
        static final IntLikeSerializer a = new IntLikeSerializer();

        public IntLikeSerializer() {
            super(Number.class, JsonParser.NumberType.INT, "integer");
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            jsonGenerator.c(((Number) obj).intValue());
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class LongSerializer extends Base<Object> {
        public LongSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.LONG, "number");
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            jsonGenerator.b(((Long) obj).longValue());
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class FloatSerializer extends Base<Object> {
        static final FloatSerializer c = new FloatSerializer();

        public FloatSerializer() {
            super(Float.class, JsonParser.NumberType.FLOAT, "number");
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            jsonGenerator.d(((Float) obj).floatValue());
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class DoubleSerializer extends Base<Object> {
        public DoubleSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.DOUBLE, "number");
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            jsonGenerator.e(((Double) obj).doubleValue());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.AbstractC9453pq
        public void c(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
            Double d = (Double) obj;
            if (e(d.doubleValue())) {
                WritableTypeId b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(obj, JsonToken.VALUE_NUMBER_FLOAT));
                jsonGenerator.e(d.doubleValue());
                abstractC9544rb.c(jsonGenerator, b);
                return;
            }
            jsonGenerator.e(d.doubleValue());
        }

        public static boolean e(double d) {
            return Double.isNaN(d) || Double.isInfinite(d);
        }
    }
}
