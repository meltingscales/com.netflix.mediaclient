package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9398oo;
import o.InterfaceC9458pv;

/* loaded from: classes5.dex */
public class NumberDeserializers {
    private static final HashSet<String> d = new HashSet<>();

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i = 0; i < 11; i++) {
            d.add(clsArr[i].getName());
        }
    }

    public static AbstractC9452pp<?> c(Class<?> cls, String str) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return IntegerDeserializer.c;
            }
            if (cls == Boolean.TYPE) {
                return BooleanDeserializer.a;
            }
            if (cls == Long.TYPE) {
                return LongDeserializer.b;
            }
            if (cls == Double.TYPE) {
                return DoubleDeserializer.c;
            }
            if (cls == Character.TYPE) {
                return CharacterDeserializer.c;
            }
            if (cls == Byte.TYPE) {
                return ByteDeserializer.e;
            }
            if (cls == Short.TYPE) {
                return ShortDeserializer.b;
            }
            if (cls == Float.TYPE) {
                return FloatDeserializer.e;
            }
        } else if (!d.contains(str)) {
            return null;
        } else {
            if (cls == Integer.class) {
                return IntegerDeserializer.b;
            }
            if (cls == Boolean.class) {
                return BooleanDeserializer.e;
            }
            if (cls == Long.class) {
                return LongDeserializer.d;
            }
            if (cls == Double.class) {
                return DoubleDeserializer.a;
            }
            if (cls == Character.class) {
                return CharacterDeserializer.a;
            }
            if (cls == Byte.class) {
                return ByteDeserializer.b;
            }
            if (cls == Short.class) {
                return ShortDeserializer.c;
            }
            if (cls == Float.class) {
                return FloatDeserializer.b;
            }
            if (cls == Number.class) {
                return NumberDeserializer.c;
            }
            if (cls == BigDecimal.class) {
                return BigDecimalDeserializer.a;
            }
            if (cls == BigInteger.class) {
                return BigIntegerDeserializer.a;
            }
        }
        throw new IllegalArgumentException("Internal error: can't find deserializer for " + cls.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static abstract class PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
        private static final long serialVersionUID = 1;
        protected final boolean g;
        protected final T h;
        protected final T j;

        @Override // o.AbstractC9452pp
        public Object d(DeserializationContext deserializationContext) {
            return this.h;
        }

        protected PrimitiveOrWrapperDeserializer(Class<T> cls, T t, T t2) {
            super((Class<?>) cls);
            this.j = t;
            this.h = t2;
            this.g = cls.isPrimitive();
        }

        @Override // o.AbstractC9452pp, o.InterfaceC9428pR
        public final T c(DeserializationContext deserializationContext) {
            if (this.g && deserializationContext.d(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                deserializationContext.a(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", c().toString());
            }
            return this.j;
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static final class BooleanDeserializer extends PrimitiveOrWrapperDeserializer<Boolean> {
        static final BooleanDeserializer a = new BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
        static final BooleanDeserializer e = new BooleanDeserializer(Boolean.class, null);
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC9452pp
        public /* bridge */ /* synthetic */ Object d(DeserializationContext deserializationContext) {
            return super.d(deserializationContext);
        }

        public BooleanDeserializer(Class<Boolean> cls, Boolean bool) {
            super(cls, bool, Boolean.FALSE);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: d */
        public Boolean b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            JsonToken o2 = jsonParser.o();
            return o2 == JsonToken.VALUE_TRUE ? Boolean.TRUE : o2 == JsonToken.VALUE_FALSE ? Boolean.FALSE : a(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
        /* renamed from: b */
        public Boolean a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
            JsonToken o2 = jsonParser.o();
            return o2 == JsonToken.VALUE_TRUE ? Boolean.TRUE : o2 == JsonToken.VALUE_FALSE ? Boolean.FALSE : a(jsonParser, deserializationContext);
        }

        protected final Boolean a(JsonParser jsonParser, DeserializationContext deserializationContext) {
            JsonToken o2 = jsonParser.o();
            if (o2 == JsonToken.VALUE_NULL) {
                return (Boolean) a(deserializationContext, this.g);
            }
            if (o2 == JsonToken.START_ARRAY) {
                return q(jsonParser, deserializationContext);
            }
            if (o2 == JsonToken.VALUE_NUMBER_INT) {
                return Boolean.valueOf(v(jsonParser, deserializationContext));
            }
            if (o2 != JsonToken.VALUE_STRING) {
                return o2 == JsonToken.VALUE_TRUE ? Boolean.TRUE : o2 == JsonToken.VALUE_FALSE ? Boolean.FALSE : (Boolean) deserializationContext.e(this.B, jsonParser);
            }
            String trim = jsonParser.A().trim();
            if ("true".equals(trim) || "True".equals(trim)) {
                h(deserializationContext, trim);
                return Boolean.TRUE;
            } else if ("false".equals(trim) || "False".equals(trim)) {
                h(deserializationContext, trim);
                return Boolean.FALSE;
            } else if (trim.length() == 0) {
                return (Boolean) b(deserializationContext, this.g);
            } else {
                if (d(trim)) {
                    return (Boolean) d(deserializationContext, this.g);
                }
                return (Boolean) deserializationContext.b(this.B, trim, "only \"true\" or \"false\" recognized", new Object[0]);
            }
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class ByteDeserializer extends PrimitiveOrWrapperDeserializer<Byte> {
        private static final long serialVersionUID = 1;
        static final ByteDeserializer e = new ByteDeserializer(Byte.TYPE, (byte) 0);
        static final ByteDeserializer b = new ByteDeserializer(Byte.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC9452pp
        public /* bridge */ /* synthetic */ Object d(DeserializationContext deserializationContext) {
            return super.d(deserializationContext);
        }

        public ByteDeserializer(Class<Byte> cls, Byte b2) {
            super(cls, b2, (byte) 0);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: a */
        public Byte b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (jsonParser.a(JsonToken.VALUE_NUMBER_INT)) {
                return Byte.valueOf(jsonParser.m());
            }
            return c(jsonParser, deserializationContext);
        }

        protected Byte c(JsonParser jsonParser, DeserializationContext deserializationContext) {
            JsonToken o2 = jsonParser.o();
            if (o2 == JsonToken.VALUE_STRING) {
                String trim = jsonParser.A().trim();
                if (d(trim)) {
                    return (Byte) d(deserializationContext, this.g);
                }
                if (trim.length() == 0) {
                    return (Byte) b(deserializationContext, this.g);
                }
                h(deserializationContext, trim);
                try {
                    int d = C9398oo.d(trim);
                    if (c(d)) {
                        return (Byte) deserializationContext.b(this.B, trim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                    }
                    return Byte.valueOf((byte) d);
                } catch (IllegalArgumentException unused) {
                    return (Byte) deserializationContext.b(this.B, trim, "not a valid Byte value", new Object[0]);
                }
            } else if (o2 == JsonToken.VALUE_NUMBER_FLOAT) {
                if (!deserializationContext.d(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    d(jsonParser, deserializationContext, "Byte");
                }
                return Byte.valueOf(jsonParser.m());
            } else if (o2 == JsonToken.VALUE_NULL) {
                return (Byte) a(deserializationContext, this.g);
            } else {
                if (o2 == JsonToken.START_ARRAY) {
                    return q(jsonParser, deserializationContext);
                }
                if (o2 == JsonToken.VALUE_NUMBER_INT) {
                    return Byte.valueOf(jsonParser.m());
                }
                return (Byte) deserializationContext.e(this.B, jsonParser);
            }
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class ShortDeserializer extends PrimitiveOrWrapperDeserializer<Short> {
        static final ShortDeserializer b = new ShortDeserializer(Short.TYPE, 0);
        static final ShortDeserializer c = new ShortDeserializer(Short.class, null);
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC9452pp
        public /* bridge */ /* synthetic */ Object d(DeserializationContext deserializationContext) {
            return super.d(deserializationContext);
        }

        public ShortDeserializer(Class<Short> cls, Short sh) {
            super(cls, sh, (short) 0);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: d */
        public Short b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return a(jsonParser, deserializationContext);
        }

        protected Short a(JsonParser jsonParser, DeserializationContext deserializationContext) {
            JsonToken o2 = jsonParser.o();
            if (o2 == JsonToken.VALUE_NUMBER_INT) {
                return Short.valueOf(jsonParser.C());
            }
            if (o2 == JsonToken.VALUE_STRING) {
                String trim = jsonParser.A().trim();
                if (trim.length() == 0) {
                    return (Short) b(deserializationContext, this.g);
                }
                if (d(trim)) {
                    return (Short) d(deserializationContext, this.g);
                }
                h(deserializationContext, trim);
                try {
                    int d = C9398oo.d(trim);
                    if (a(d)) {
                        return (Short) deserializationContext.b(this.B, trim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                    }
                    return Short.valueOf((short) d);
                } catch (IllegalArgumentException unused) {
                    return (Short) deserializationContext.b(this.B, trim, "not a valid Short value", new Object[0]);
                }
            } else if (o2 == JsonToken.VALUE_NUMBER_FLOAT) {
                if (!deserializationContext.d(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    d(jsonParser, deserializationContext, "Short");
                }
                return Short.valueOf(jsonParser.C());
            } else if (o2 == JsonToken.VALUE_NULL) {
                return (Short) a(deserializationContext, this.g);
            } else {
                if (o2 == JsonToken.START_ARRAY) {
                    return q(jsonParser, deserializationContext);
                }
                return (Short) deserializationContext.e(this.B, jsonParser);
            }
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class CharacterDeserializer extends PrimitiveOrWrapperDeserializer<Character> {
        private static final long serialVersionUID = 1;
        static final CharacterDeserializer c = new CharacterDeserializer(Character.TYPE, 0);
        static final CharacterDeserializer a = new CharacterDeserializer(Character.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC9452pp
        public /* bridge */ /* synthetic */ Object d(DeserializationContext deserializationContext) {
            return super.d(deserializationContext);
        }

        public CharacterDeserializer(Class<Character> cls, Character ch) {
            super(cls, ch, (char) 0);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: d */
        public Character b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            int t = jsonParser.t();
            if (t != 3) {
                if (t == 11) {
                    return (Character) a(deserializationContext, this.g);
                }
                if (t == 6) {
                    String A = jsonParser.A();
                    if (A.length() == 1) {
                        return Character.valueOf(A.charAt(0));
                    }
                    if (A.length() == 0) {
                        return (Character) b(deserializationContext, this.g);
                    }
                } else if (t == 7) {
                    c(deserializationContext, jsonParser);
                    int u = jsonParser.u();
                    if (u >= 0 && u <= 65535) {
                        return Character.valueOf((char) u);
                    }
                }
                return (Character) deserializationContext.e(this.B, jsonParser);
            }
            return q(jsonParser, deserializationContext);
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer<Integer> {
        private static final long serialVersionUID = 1;
        static final IntegerDeserializer c = new IntegerDeserializer(Integer.TYPE, 0);
        static final IntegerDeserializer b = new IntegerDeserializer(Integer.class, null);

        @Override // o.AbstractC9452pp
        public boolean i() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC9452pp
        public /* bridge */ /* synthetic */ Object d(DeserializationContext deserializationContext) {
            return super.d(deserializationContext);
        }

        public IntegerDeserializer(Class<Integer> cls, Integer num) {
            super(cls, num, 0);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: d */
        public Integer b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (jsonParser.a(JsonToken.VALUE_NUMBER_INT)) {
                return Integer.valueOf(jsonParser.u());
            }
            return a(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
        /* renamed from: c */
        public Integer a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
            if (jsonParser.a(JsonToken.VALUE_NUMBER_INT)) {
                return Integer.valueOf(jsonParser.u());
            }
            return a(jsonParser, deserializationContext);
        }

        protected final Integer a(JsonParser jsonParser, DeserializationContext deserializationContext) {
            int t = jsonParser.t();
            if (t != 3) {
                if (t != 11) {
                    if (t != 6) {
                        if (t != 7) {
                            if (t == 8) {
                                if (!deserializationContext.d(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                                    d(jsonParser, deserializationContext, "Integer");
                                }
                                return Integer.valueOf(jsonParser.E());
                            }
                            return (Integer) deserializationContext.e(this.B, jsonParser);
                        }
                        return Integer.valueOf(jsonParser.u());
                    }
                    String trim = jsonParser.A().trim();
                    int length = trim.length();
                    if (length == 0) {
                        return (Integer) b(deserializationContext, this.g);
                    }
                    if (d(trim)) {
                        return (Integer) d(deserializationContext, this.g);
                    }
                    h(deserializationContext, trim);
                    try {
                        if (length > 9) {
                            long parseLong = Long.parseLong(trim);
                            if (a(parseLong)) {
                                return (Integer) deserializationContext.b(this.B, trim, String.format("Overflow: numeric value (%s) out of range of Integer (%d - %d)", trim, Integer.MIN_VALUE, Integer.MAX_VALUE), new Object[0]);
                            }
                            return Integer.valueOf((int) parseLong);
                        }
                        return Integer.valueOf(C9398oo.d(trim));
                    } catch (IllegalArgumentException unused) {
                        return (Integer) deserializationContext.b(this.B, trim, "not a valid Integer value", new Object[0]);
                    }
                }
                return (Integer) a(deserializationContext, this.g);
            }
            return q(jsonParser, deserializationContext);
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer<Long> {
        static final LongDeserializer b = new LongDeserializer(Long.TYPE, 0L);
        static final LongDeserializer d = new LongDeserializer(Long.class, null);
        private static final long serialVersionUID = 1;

        @Override // o.AbstractC9452pp
        public boolean i() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC9452pp
        public /* bridge */ /* synthetic */ Object d(DeserializationContext deserializationContext) {
            return super.d(deserializationContext);
        }

        public LongDeserializer(Class<Long> cls, Long l) {
            super(cls, l, 0L);
        }

        @Override // o.AbstractC9452pp
        /* renamed from: d */
        public Long b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (jsonParser.a(JsonToken.VALUE_NUMBER_INT)) {
                return Long.valueOf(jsonParser.w());
            }
            return c(jsonParser, deserializationContext);
        }

        protected final Long c(JsonParser jsonParser, DeserializationContext deserializationContext) {
            int t = jsonParser.t();
            if (t != 3) {
                if (t != 11) {
                    if (t != 6) {
                        if (t != 7) {
                            if (t == 8) {
                                if (!deserializationContext.d(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                                    d(jsonParser, deserializationContext, "Long");
                                }
                                return Long.valueOf(jsonParser.I());
                            }
                            return (Long) deserializationContext.e(this.B, jsonParser);
                        }
                        return Long.valueOf(jsonParser.w());
                    }
                    String trim = jsonParser.A().trim();
                    if (trim.length() == 0) {
                        return (Long) b(deserializationContext, this.g);
                    }
                    if (d(trim)) {
                        return (Long) d(deserializationContext, this.g);
                    }
                    h(deserializationContext, trim);
                    try {
                        return Long.valueOf(C9398oo.e(trim));
                    } catch (IllegalArgumentException unused) {
                        return (Long) deserializationContext.b(this.B, trim, "not a valid Long value", new Object[0]);
                    }
                }
                return (Long) a(deserializationContext, this.g);
            }
            return q(jsonParser, deserializationContext);
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class FloatDeserializer extends PrimitiveOrWrapperDeserializer<Float> {
        private static final long serialVersionUID = 1;
        static final FloatDeserializer e = new FloatDeserializer(Float.TYPE, Float.valueOf(0.0f));
        static final FloatDeserializer b = new FloatDeserializer(Float.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC9452pp
        public /* bridge */ /* synthetic */ Object d(DeserializationContext deserializationContext) {
            return super.d(deserializationContext);
        }

        public FloatDeserializer(Class<Float> cls, Float f) {
            super(cls, f, Float.valueOf(0.0f));
        }

        @Override // o.AbstractC9452pp
        /* renamed from: a */
        public Float b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return d(jsonParser, deserializationContext);
        }

        protected final Float d(JsonParser jsonParser, DeserializationContext deserializationContext) {
            JsonToken o2 = jsonParser.o();
            if (o2 == JsonToken.VALUE_NUMBER_FLOAT || o2 == JsonToken.VALUE_NUMBER_INT) {
                return Float.valueOf(jsonParser.s());
            }
            if (o2 == JsonToken.VALUE_STRING) {
                String trim = jsonParser.A().trim();
                if (trim.length() == 0) {
                    return (Float) b(deserializationContext, this.g);
                }
                if (d(trim)) {
                    return (Float) d(deserializationContext, this.g);
                }
                char charAt = trim.charAt(0);
                if (charAt != '-') {
                    if (charAt == 'I') {
                        if (g(trim)) {
                            return Float.valueOf(Float.POSITIVE_INFINITY);
                        }
                    } else if (charAt == 'N' && h(trim)) {
                        return Float.valueOf(Float.NaN);
                    }
                } else if (j(trim)) {
                    return Float.valueOf(Float.NEGATIVE_INFINITY);
                }
                h(deserializationContext, trim);
                try {
                    return Float.valueOf(Float.parseFloat(trim));
                } catch (IllegalArgumentException unused) {
                    return (Float) deserializationContext.b(this.B, trim, "not a valid Float value", new Object[0]);
                }
            } else if (o2 == JsonToken.VALUE_NULL) {
                return (Float) a(deserializationContext, this.g);
            } else {
                if (o2 == JsonToken.START_ARRAY) {
                    return q(jsonParser, deserializationContext);
                }
                return (Float) deserializationContext.e(this.B, jsonParser);
            }
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class DoubleDeserializer extends PrimitiveOrWrapperDeserializer<Double> {
        private static final long serialVersionUID = 1;
        static final DoubleDeserializer c = new DoubleDeserializer(Double.TYPE, Double.valueOf(0.0d));
        static final DoubleDeserializer a = new DoubleDeserializer(Double.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC9452pp
        public /* bridge */ /* synthetic */ Object d(DeserializationContext deserializationContext) {
            return super.d(deserializationContext);
        }

        public DoubleDeserializer(Class<Double> cls, Double d) {
            super(cls, d, Double.valueOf(0.0d));
        }

        @Override // o.AbstractC9452pp
        /* renamed from: d */
        public Double b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return c(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
        /* renamed from: d */
        public Double a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
            return c(jsonParser, deserializationContext);
        }

        protected final Double c(JsonParser jsonParser, DeserializationContext deserializationContext) {
            JsonToken o2 = jsonParser.o();
            if (o2 == JsonToken.VALUE_NUMBER_INT || o2 == JsonToken.VALUE_NUMBER_FLOAT) {
                return Double.valueOf(jsonParser.p());
            }
            if (o2 == JsonToken.VALUE_STRING) {
                String trim = jsonParser.A().trim();
                if (trim.length() == 0) {
                    return (Double) b(deserializationContext, this.g);
                }
                if (d(trim)) {
                    return (Double) d(deserializationContext, this.g);
                }
                char charAt = trim.charAt(0);
                if (charAt != '-') {
                    if (charAt == 'I') {
                        if (g(trim)) {
                            return Double.valueOf(Double.POSITIVE_INFINITY);
                        }
                    } else if (charAt == 'N' && h(trim)) {
                        return Double.valueOf(Double.NaN);
                    }
                } else if (j(trim)) {
                    return Double.valueOf(Double.NEGATIVE_INFINITY);
                }
                h(deserializationContext, trim);
                try {
                    return Double.valueOf(StdDeserializer.e(trim));
                } catch (IllegalArgumentException unused) {
                    return (Double) deserializationContext.b(this.B, trim, "not a valid Double value", new Object[0]);
                }
            } else if (o2 == JsonToken.VALUE_NULL) {
                return (Double) a(deserializationContext, this.g);
            } else {
                if (o2 == JsonToken.START_ARRAY) {
                    return q(jsonParser, deserializationContext);
                }
                return (Double) deserializationContext.e(this.B, jsonParser);
            }
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class NumberDeserializer extends StdScalarDeserializer<Object> {
        public static final NumberDeserializer c = new NumberDeserializer();

        public NumberDeserializer() {
            super(Number.class);
        }

        @Override // o.AbstractC9452pp
        public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            int t = jsonParser.t();
            if (t != 3) {
                if (t != 6) {
                    if (t == 7) {
                        if (deserializationContext.b(StdDeserializer.D)) {
                            return s(jsonParser, deserializationContext);
                        }
                        return jsonParser.y();
                    } else if (t == 8) {
                        if (deserializationContext.d(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) && !jsonParser.P()) {
                            return jsonParser.r();
                        }
                        return jsonParser.y();
                    } else {
                        return deserializationContext.e(this.B, jsonParser);
                    }
                }
                String trim = jsonParser.A().trim();
                if (trim.length() == 0) {
                    return c(deserializationContext);
                }
                if (d(trim)) {
                    return c(deserializationContext);
                }
                if (g(trim)) {
                    return Double.valueOf(Double.POSITIVE_INFINITY);
                }
                if (j(trim)) {
                    return Double.valueOf(Double.NEGATIVE_INFINITY);
                }
                if (h(trim)) {
                    return Double.valueOf(Double.NaN);
                }
                h(deserializationContext, trim);
                try {
                    if (!f(trim)) {
                        if (deserializationContext.d(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                            return new BigDecimal(trim);
                        }
                        return Double.valueOf(trim);
                    } else if (deserializationContext.d(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                        return new BigInteger(trim);
                    } else {
                        long parseLong = Long.parseLong(trim);
                        if (!deserializationContext.d(DeserializationFeature.USE_LONG_FOR_INTS) && parseLong <= 2147483647L && parseLong >= -2147483648L) {
                            return Integer.valueOf((int) parseLong);
                        }
                        return Long.valueOf(parseLong);
                    }
                } catch (IllegalArgumentException unused) {
                    return deserializationContext.b(this.B, trim, "not a valid number", new Object[0]);
                }
            }
            return q(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC9452pp
        public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
            int t = jsonParser.t();
            if (t == 6 || t == 7 || t == 8) {
                return b(jsonParser, deserializationContext);
            }
            return abstractC9543ra.e(jsonParser, deserializationContext);
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class BigIntegerDeserializer extends StdScalarDeserializer<BigInteger> {
        public static final BigIntegerDeserializer a = new BigIntegerDeserializer();

        public BigIntegerDeserializer() {
            super(BigInteger.class);
        }

        @Override // o.AbstractC9452pp
        public Object d(DeserializationContext deserializationContext) {
            return BigInteger.ZERO;
        }

        @Override // o.AbstractC9452pp
        /* renamed from: c */
        public BigInteger b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            int t = jsonParser.t();
            if (t != 3) {
                if (t == 6) {
                    String trim = jsonParser.A().trim();
                    if (i(trim)) {
                        f(deserializationContext, trim);
                        return c(deserializationContext);
                    }
                    h(deserializationContext, trim);
                    try {
                        return new BigInteger(trim);
                    } catch (IllegalArgumentException unused) {
                        return (BigInteger) deserializationContext.b(this.B, trim, "not a valid representation", new Object[0]);
                    }
                }
                if (t == 7) {
                    int i = AnonymousClass3.c[jsonParser.v().ordinal()];
                    if (i == 1 || i == 2 || i == 3) {
                        return jsonParser.h();
                    }
                } else if (t == 8) {
                    if (!deserializationContext.d(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                        d(jsonParser, deserializationContext, "java.math.BigInteger");
                    }
                    return jsonParser.r().toBigInteger();
                }
                return (BigInteger) deserializationContext.e(this.B, jsonParser);
            }
            return q(jsonParser, deserializationContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            c = iArr;
            try {
                iArr[JsonParser.NumberType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[JsonParser.NumberType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[JsonParser.NumberType.BIG_INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @InterfaceC9458pv
    /* loaded from: classes5.dex */
    public static class BigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> {
        public static final BigDecimalDeserializer a = new BigDecimalDeserializer();

        public BigDecimalDeserializer() {
            super(BigDecimal.class);
        }

        @Override // o.AbstractC9452pp
        public Object d(DeserializationContext deserializationContext) {
            return BigDecimal.ZERO;
        }

        @Override // o.AbstractC9452pp
        /* renamed from: d */
        public BigDecimal b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            int t = jsonParser.t();
            if (t != 3) {
                if (t != 6) {
                    if (t == 7 || t == 8) {
                        return jsonParser.r();
                    }
                    return (BigDecimal) deserializationContext.e(this.B, jsonParser);
                }
                String trim = jsonParser.A().trim();
                if (i(trim)) {
                    f(deserializationContext, trim);
                    return c(deserializationContext);
                }
                h(deserializationContext, trim);
                try {
                    return new BigDecimal(trim);
                } catch (IllegalArgumentException unused) {
                    return (BigDecimal) deserializationContext.b(this.B, trim, "not a valid representation", new Object[0]);
                }
            }
            return q(jsonParser, deserializationContext);
        }
    }
}
