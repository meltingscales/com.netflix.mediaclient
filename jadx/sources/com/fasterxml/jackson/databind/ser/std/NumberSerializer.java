package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.AbstractC9453pq;
import o.AbstractC9454pr;
import o.AbstractC9459pw;
import o.InterfaceC9458pv;
import o.InterfaceC9478qO;
import o.InterfaceC9562rt;

@InterfaceC9458pv
/* loaded from: classes5.dex */
public class NumberSerializer extends StdScalarSerializer<Number> implements InterfaceC9562rt {
    public static final NumberSerializer a = new NumberSerializer(Number.class);
    protected final boolean e;

    public NumberSerializer(Class<? extends Number> cls) {
        super(cls, false);
        this.e = cls == BigInteger.class;
    }

    @Override // o.InterfaceC9562rt
    public AbstractC9453pq<?> e(AbstractC9459pw abstractC9459pw, BeanProperty beanProperty) {
        JsonFormat.Value c = c(abstractC9459pw, beanProperty, (Class<?>) c());
        if (c == null || AnonymousClass2.e[c.a().ordinal()] != 1) {
            return this;
        }
        if (c() == BigDecimal.class) {
            return d();
        }
        return ToStringSerializer.b;
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.std.NumberSerializer$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            e = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: a */
    public void e(Number number, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        if (number instanceof BigDecimal) {
            jsonGenerator.b((BigDecimal) number);
        } else if (number instanceof BigInteger) {
            jsonGenerator.e((BigInteger) number);
        } else if (number instanceof Long) {
            jsonGenerator.b(number.longValue());
        } else if (number instanceof Double) {
            jsonGenerator.e(number.doubleValue());
        } else if (number instanceof Float) {
            jsonGenerator.d(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            jsonGenerator.c(number.intValue());
        } else {
            jsonGenerator.d(number.toString());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC9487qX
    public AbstractC9454pr b(AbstractC9459pw abstractC9459pw, Type type) {
        return d(this.e ? "integer" : "number", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    public void d(InterfaceC9478qO interfaceC9478qO, JavaType javaType) {
        if (this.e) {
            c(interfaceC9478qO, javaType, JsonParser.NumberType.BIG_INTEGER);
        } else if (c() == BigDecimal.class) {
            d(interfaceC9478qO, javaType, JsonParser.NumberType.BIG_DECIMAL);
        } else {
            interfaceC9478qO.j(javaType);
        }
    }

    public static AbstractC9453pq<?> d() {
        return BigDecimalAsStringSerializer.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class BigDecimalAsStringSerializer extends ToStringSerializerBase {
        static final BigDecimalAsStringSerializer e = new BigDecimalAsStringSerializer();

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase, o.AbstractC9453pq
        public boolean c(AbstractC9459pw abstractC9459pw, Object obj) {
            return false;
        }

        public BigDecimalAsStringSerializer() {
            super(BigDecimal.class);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
        public void e(Object obj, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
            String obj2;
            if (jsonGenerator.e(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                if (!d(jsonGenerator, bigDecimal)) {
                    abstractC9459pw.b(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(bigDecimal.scale()), 9999, 9999), new Object[0]);
                }
                obj2 = bigDecimal.toPlainString();
            } else {
                obj2 = obj.toString();
            }
            jsonGenerator.i(obj2);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase
        public String e(Object obj) {
            throw new IllegalStateException();
        }

        protected boolean d(JsonGenerator jsonGenerator, BigDecimal bigDecimal) {
            int scale = bigDecimal.scale();
            return scale >= -9999 && scale <= 9999;
        }
    }
}
