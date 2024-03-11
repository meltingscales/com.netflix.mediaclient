package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;
import java.util.HashMap;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.AbstractC9544rb;
import o.InterfaceC9458pv;
import o.InterfaceC9478qO;

/* loaded from: classes5.dex */
public class StdArraySerializers {
    protected static final HashMap<String, AbstractC9453pq<?>> e;

    static {
        HashMap<String, AbstractC9453pq<?>> hashMap = new HashMap<>();
        e = hashMap;
        hashMap.put(boolean[].class.getName(), new BooleanArraySerializer());
        hashMap.put(byte[].class.getName(), new ByteArraySerializer());
        hashMap.put(char[].class.getName(), new CharArraySerializer());
        hashMap.put(short[].class.getName(), new ShortArraySerializer());
        hashMap.put(int[].class.getName(), new IntArraySerializer());
        hashMap.put(long[].class.getName(), new LongArraySerializer());
        hashMap.put(float[].class.getName(), new FloatArraySerializer());
        hashMap.put(double[].class.getName(), new DoubleArraySerializer());
    }

    protected StdArraySerializers() {
    }

    public static AbstractC9453pq<?> d(Class<?> cls) {
        return e.get(cls.getName());
    }

    /* loaded from: classes5.dex */
    protected static abstract class TypedPrimitiveArraySerializer<T> extends ArraySerializerBase<T> {
        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public final ContainerSerializer<?> b(AbstractC9544rb abstractC9544rb) {
            return this;
        }

        protected TypedPrimitiveArraySerializer(Class<T> cls) {
            super(cls);
        }

        protected TypedPrimitiveArraySerializer(TypedPrimitiveArraySerializer<T> typedPrimitiveArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(typedPrimitiveArraySerializer, beanProperty, bool);
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class BooleanArraySerializer extends ArraySerializerBase<boolean[]> {
        private static final JavaType b = TypeFactory.a().c(Boolean.class);

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public ContainerSerializer<?> b(AbstractC9544rb abstractC9544rb) {
            return this;
        }

        public BooleanArraySerializer() {
            super(boolean[].class);
        }

        protected BooleanArraySerializer(BooleanArraySerializer booleanArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(booleanArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public AbstractC9453pq<?> d(BeanProperty beanProperty, Boolean bool) {
            return new BooleanArraySerializer(this, beanProperty, bool);
        }

        @Override // o.AbstractC9453pq
        /* renamed from: d */
        public boolean c(AbstractC9459pw abstractC9459pw, boolean[] zArr) {
            return zArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        /* renamed from: c */
        public boolean d(boolean[] zArr) {
            return zArr.length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        /* renamed from: c */
        public final void e(boolean[] zArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            int length = zArr.length;
            if (length == 1 && b(abstractC9459pw)) {
                d(zArr, jsonGenerator, abstractC9459pw);
                return;
            }
            jsonGenerator.e(zArr, length);
            d(zArr, jsonGenerator, abstractC9459pw);
            jsonGenerator.i();
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        /* renamed from: a */
        public void d(boolean[] zArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            for (boolean z : zArr) {
                jsonGenerator.a(z);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
        public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
            ObjectNode d = d("array", true);
            d.c("items", e("boolean"));
            return d;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
            e(interfaceC9478qO, javaType, JsonFormatTypes.BOOLEAN);
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class ShortArraySerializer extends TypedPrimitiveArraySerializer<short[]> {
        private static final JavaType e = TypeFactory.a().c(Short.TYPE);

        public ShortArraySerializer() {
            super(short[].class);
        }

        public ShortArraySerializer(ShortArraySerializer shortArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(shortArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public AbstractC9453pq<?> d(BeanProperty beanProperty, Boolean bool) {
            return new ShortArraySerializer(this, beanProperty, bool);
        }

        @Override // o.AbstractC9453pq
        /* renamed from: b */
        public boolean c(AbstractC9459pw abstractC9459pw, short[] sArr) {
            return sArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        /* renamed from: c */
        public boolean d(short[] sArr) {
            return sArr.length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public final void e(short[] sArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            int length = sArr.length;
            if (length == 1 && b(abstractC9459pw)) {
                d(sArr, jsonGenerator, abstractC9459pw);
                return;
            }
            jsonGenerator.e(sArr, length);
            d(sArr, jsonGenerator, abstractC9459pw);
            jsonGenerator.i();
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        /* renamed from: c */
        public void d(short[] sArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            for (short s : sArr) {
                jsonGenerator.c((int) s);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
        public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
            return d("array", true).c("items", e("integer"));
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
            e(interfaceC9478qO, javaType, JsonFormatTypes.INTEGER);
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class CharArraySerializer extends StdSerializer<char[]> {
        public CharArraySerializer() {
            super(char[].class);
        }

        @Override // o.AbstractC9453pq
        public boolean c(AbstractC9459pw abstractC9459pw, char[] cArr) {
            return cArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        /* renamed from: d */
        public void e(char[] cArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            if (abstractC9459pw.d(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                jsonGenerator.e(cArr, cArr.length);
                d(jsonGenerator, cArr);
                jsonGenerator.i();
                return;
            }
            jsonGenerator.d(cArr, 0, cArr.length);
        }

        @Override // o.AbstractC9453pq
        /* renamed from: e */
        public void c(char[] cArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
            WritableTypeId b;
            if (abstractC9459pw.d(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(cArr, JsonToken.START_ARRAY));
                d(jsonGenerator, cArr);
            } else {
                b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.d(cArr, JsonToken.VALUE_STRING));
                jsonGenerator.d(cArr, 0, cArr.length);
            }
            abstractC9544rb.c(jsonGenerator, b);
        }

        private final void d(JsonGenerator jsonGenerator, char[] cArr) {
            int length = cArr.length;
            for (int i = 0; i < length; i++) {
                jsonGenerator.d(cArr, i, 1);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
        public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
            ObjectNode d = d("array", true);
            ObjectNode e = e("string");
            e.c("type", "string");
            return d.c("items", e);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
            e(interfaceC9478qO, javaType, JsonFormatTypes.STRING);
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class IntArraySerializer extends ArraySerializerBase<int[]> {
        private static final JavaType e = TypeFactory.a().c(Integer.TYPE);

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public ContainerSerializer<?> b(AbstractC9544rb abstractC9544rb) {
            return this;
        }

        public IntArraySerializer() {
            super(int[].class);
        }

        protected IntArraySerializer(IntArraySerializer intArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(intArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public AbstractC9453pq<?> d(BeanProperty beanProperty, Boolean bool) {
            return new IntArraySerializer(this, beanProperty, bool);
        }

        @Override // o.AbstractC9453pq
        /* renamed from: b */
        public boolean c(AbstractC9459pw abstractC9459pw, int[] iArr) {
            return iArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        /* renamed from: c */
        public boolean d(int[] iArr) {
            return iArr.length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        /* renamed from: a */
        public final void e(int[] iArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            if (iArr.length == 1 && b(abstractC9459pw)) {
                d(iArr, jsonGenerator, abstractC9459pw);
            } else {
                jsonGenerator.e(iArr, 0, iArr.length);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        /* renamed from: c */
        public void d(int[] iArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            for (int i : iArr) {
                jsonGenerator.c(i);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
        public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
            return d("array", true).c("items", e("integer"));
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
            e(interfaceC9478qO, javaType, JsonFormatTypes.INTEGER);
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class LongArraySerializer extends TypedPrimitiveArraySerializer<long[]> {
        private static final JavaType d = TypeFactory.a().c(Long.TYPE);

        public LongArraySerializer() {
            super(long[].class);
        }

        public LongArraySerializer(LongArraySerializer longArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(longArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public AbstractC9453pq<?> d(BeanProperty beanProperty, Boolean bool) {
            return new LongArraySerializer(this, beanProperty, bool);
        }

        @Override // o.AbstractC9453pq
        /* renamed from: d */
        public boolean c(AbstractC9459pw abstractC9459pw, long[] jArr) {
            return jArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean d(long[] jArr) {
            return jArr.length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public final void e(long[] jArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            if (jArr.length == 1 && b(abstractC9459pw)) {
                d(jArr, jsonGenerator, abstractC9459pw);
            } else {
                jsonGenerator.a(jArr, 0, jArr.length);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void d(long[] jArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            for (long j : jArr) {
                jsonGenerator.b(j);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
        public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
            return d("array", true).c("items", d("number", true));
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
            e(interfaceC9478qO, javaType, JsonFormatTypes.NUMBER);
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class FloatArraySerializer extends TypedPrimitiveArraySerializer<float[]> {
        private static final JavaType d = TypeFactory.a().c(Float.TYPE);

        public FloatArraySerializer() {
            super(float[].class);
        }

        public FloatArraySerializer(FloatArraySerializer floatArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(floatArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public AbstractC9453pq<?> d(BeanProperty beanProperty, Boolean bool) {
            return new FloatArraySerializer(this, beanProperty, bool);
        }

        @Override // o.AbstractC9453pq
        /* renamed from: b */
        public boolean c(AbstractC9459pw abstractC9459pw, float[] fArr) {
            return fArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        /* renamed from: c */
        public boolean d(float[] fArr) {
            return fArr.length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        /* renamed from: a */
        public final void e(float[] fArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            int length = fArr.length;
            if (length == 1 && b(abstractC9459pw)) {
                d(fArr, jsonGenerator, abstractC9459pw);
                return;
            }
            jsonGenerator.e(fArr, length);
            d(fArr, jsonGenerator, abstractC9459pw);
            jsonGenerator.i();
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        /* renamed from: e */
        public void d(float[] fArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            for (float f : fArr) {
                jsonGenerator.d(f);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
        public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
            return d("array", true).c("items", e("number"));
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
            e(interfaceC9478qO, javaType, JsonFormatTypes.NUMBER);
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class DoubleArraySerializer extends ArraySerializerBase<double[]> {
        private static final JavaType b = TypeFactory.a().c(Double.TYPE);

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public ContainerSerializer<?> b(AbstractC9544rb abstractC9544rb) {
            return this;
        }

        public DoubleArraySerializer() {
            super(double[].class);
        }

        protected DoubleArraySerializer(DoubleArraySerializer doubleArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(doubleArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public AbstractC9453pq<?> d(BeanProperty beanProperty, Boolean bool) {
            return new DoubleArraySerializer(this, beanProperty, bool);
        }

        @Override // o.AbstractC9453pq
        /* renamed from: a */
        public boolean c(AbstractC9459pw abstractC9459pw, double[] dArr) {
            return dArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        /* renamed from: c */
        public boolean d(double[] dArr) {
            return dArr.length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        /* renamed from: c */
        public final void e(double[] dArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            if (dArr.length == 1 && b(abstractC9459pw)) {
                d(dArr, jsonGenerator, abstractC9459pw);
            } else {
                jsonGenerator.c(dArr, 0, dArr.length);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        /* renamed from: b */
        public void d(double[] dArr, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            for (double d : dArr) {
                jsonGenerator.e(d);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
        public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
            return d("array", true).c("items", e("number"));
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
            e(interfaceC9478qO, javaType, JsonFormatTypes.NUMBER);
        }
    }
}
