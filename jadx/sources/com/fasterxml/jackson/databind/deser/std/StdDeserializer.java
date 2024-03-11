package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import o.AbstractC9450pn;
import o.AbstractC9452pp;
import o.AbstractC9543ra;
import o.C9398oo;
import o.C9537rU;
import o.InterfaceC9428pR;
import o.InterfaceC9535rS;

/* loaded from: classes5.dex */
public abstract class StdDeserializer<T> extends AbstractC9452pp<T> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> B;
    protected final JavaType C;
    protected static final int D = DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.d() | DeserializationFeature.USE_LONG_FOR_INTS.d();
    protected static final int v = DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS.d() | DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.d();

    public static final boolean b(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(int i) {
        return i < -32768 || i > 32767;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(long j) {
        return j < -2147483648L || j > 2147483647L;
    }

    @Override // o.AbstractC9452pp
    public Class<?> c() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c(int i) {
        return i < -128 || i > 255;
    }

    public JavaType g() {
        return this.C;
    }

    public StdDeserializer(Class<?> cls) {
        this.B = cls;
        this.C = null;
    }

    public StdDeserializer(JavaType javaType) {
        this.B = javaType == null ? Object.class : javaType.h();
        this.C = javaType;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public StdDeserializer(StdDeserializer<?> stdDeserializer) {
        this.B = stdDeserializer.B;
        this.C = stdDeserializer.C;
    }

    public JavaType h(DeserializationContext deserializationContext) {
        JavaType javaType = this.C;
        return javaType != null ? javaType : deserializationContext.a(this.B);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(AbstractC9452pp<?> abstractC9452pp) {
        return C9537rU.b(abstractC9452pp);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(AbstractC9450pn abstractC9450pn) {
        return C9537rU.b(abstractC9450pn);
    }

    @Override // o.AbstractC9452pp
    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC9543ra abstractC9543ra) {
        return abstractC9543ra.b(jsonParser, deserializationContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean x(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken o2 = jsonParser.o();
        if (o2 == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (o2 == JsonToken.VALUE_FALSE) {
            return false;
        }
        if (o2 == JsonToken.VALUE_NULL) {
            i(deserializationContext);
            return false;
        } else if (o2 == JsonToken.VALUE_NUMBER_INT) {
            return v(jsonParser, deserializationContext);
        } else {
            if (o2 == JsonToken.VALUE_STRING) {
                String trim = jsonParser.A().trim();
                if ("true".equals(trim) || "True".equals(trim)) {
                    return true;
                }
                if ("false".equals(trim) || "False".equals(trim)) {
                    return false;
                }
                if (i(trim)) {
                    e(deserializationContext, trim);
                    return false;
                }
                return Boolean.TRUE.equals((Boolean) deserializationContext.b(this.B, trim, "only \"true\" or \"false\" recognized", new Object[0]));
            } else if (o2 == JsonToken.START_ARRAY && deserializationContext.d(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.Q();
                boolean x = x(jsonParser, deserializationContext);
                I(jsonParser, deserializationContext);
                return x;
            } else {
                return ((Boolean) deserializationContext.e(this.B, jsonParser)).booleanValue();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean v(JsonParser jsonParser, DeserializationContext deserializationContext) {
        c(deserializationContext, jsonParser);
        return !"0".equals(jsonParser.A());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byte y(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int A = A(jsonParser, deserializationContext);
        return c(A) ? b((Number) deserializationContext.b(this.B, String.valueOf(A), "overflow, value cannot be represented as 8-bit value", new Object[0])).byteValue() : (byte) A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final short z(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int A = A(jsonParser, deserializationContext);
        return a(A) ? b((Number) deserializationContext.b(this.B, String.valueOf(A), "overflow, value cannot be represented as 16-bit value", new Object[0])).shortValue() : (short) A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int A(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.a(JsonToken.VALUE_NUMBER_INT)) {
            return jsonParser.u();
        }
        int t = jsonParser.t();
        if (t != 3) {
            if (t == 6) {
                String trim = jsonParser.A().trim();
                if (i(trim)) {
                    e(deserializationContext, trim);
                    return 0;
                }
                return d(deserializationContext, trim);
            } else if (t == 8) {
                if (!deserializationContext.d(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    d(jsonParser, deserializationContext, "int");
                }
                return jsonParser.E();
            } else if (t == 11) {
                i(deserializationContext);
                return 0;
            }
        } else if (deserializationContext.d(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.Q();
            int A = A(jsonParser, deserializationContext);
            I(jsonParser, deserializationContext);
            return A;
        }
        return ((Number) deserializationContext.e(this.B, jsonParser)).intValue();
    }

    protected final int d(DeserializationContext deserializationContext, String str) {
        try {
            if (str.length() > 9) {
                long parseLong = Long.parseLong(str);
                return a(parseLong) ? b((Number) deserializationContext.b(this.B, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE)).intValue() : (int) parseLong;
            }
            return C9398oo.d(str);
        } catch (IllegalArgumentException unused) {
            return b((Number) deserializationContext.b(this.B, str, "not a valid int value", new Object[0])).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long D(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.a(JsonToken.VALUE_NUMBER_INT)) {
            return jsonParser.w();
        }
        int t = jsonParser.t();
        if (t != 3) {
            if (t == 6) {
                String trim = jsonParser.A().trim();
                if (i(trim)) {
                    e(deserializationContext, trim);
                    return 0L;
                }
                return a(deserializationContext, trim);
            } else if (t == 8) {
                if (!deserializationContext.d(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    d(jsonParser, deserializationContext, "long");
                }
                return jsonParser.I();
            } else if (t == 11) {
                i(deserializationContext);
                return 0L;
            }
        } else if (deserializationContext.d(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.Q();
            long D2 = D(jsonParser, deserializationContext);
            I(jsonParser, deserializationContext);
            return D2;
        }
        return ((Number) deserializationContext.e(this.B, jsonParser)).longValue();
    }

    protected final long a(DeserializationContext deserializationContext, String str) {
        try {
            return C9398oo.e(str);
        } catch (IllegalArgumentException unused) {
            return b((Number) deserializationContext.b(this.B, str, "not a valid long value", new Object[0])).longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float C(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.a(JsonToken.VALUE_NUMBER_FLOAT)) {
            return jsonParser.s();
        }
        int t = jsonParser.t();
        if (t != 3) {
            if (t == 11) {
                i(deserializationContext);
                return 0.0f;
            } else if (t == 6) {
                String trim = jsonParser.A().trim();
                if (i(trim)) {
                    e(deserializationContext, trim);
                    return 0.0f;
                }
                return c(deserializationContext, trim);
            } else if (t == 7) {
                return jsonParser.s();
            }
        } else if (deserializationContext.d(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.Q();
            float C = C(jsonParser, deserializationContext);
            I(jsonParser, deserializationContext);
            return C;
        }
        return ((Number) deserializationContext.e(this.B, jsonParser)).floatValue();
    }

    protected final float c(DeserializationContext deserializationContext, String str) {
        char charAt = str.charAt(0);
        if (charAt != '-') {
            if (charAt == 'I') {
                if (g(str)) {
                    return Float.POSITIVE_INFINITY;
                }
            } else if (charAt == 'N' && h(str)) {
                return Float.NaN;
            }
        } else if (j(str)) {
            return Float.NEGATIVE_INFINITY;
        }
        try {
            return Float.parseFloat(str);
        } catch (IllegalArgumentException unused) {
            return b((Number) deserializationContext.b(this.B, str, "not a valid float value", new Object[0])).floatValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final double w(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.a(JsonToken.VALUE_NUMBER_FLOAT)) {
            return jsonParser.p();
        }
        int t = jsonParser.t();
        if (t != 3) {
            if (t == 11) {
                i(deserializationContext);
                return 0.0d;
            } else if (t == 6) {
                String trim = jsonParser.A().trim();
                if (i(trim)) {
                    e(deserializationContext, trim);
                    return 0.0d;
                }
                return b(deserializationContext, trim);
            } else if (t == 7) {
                return jsonParser.p();
            }
        } else if (deserializationContext.d(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.Q();
            double w = w(jsonParser, deserializationContext);
            I(jsonParser, deserializationContext);
            return w;
        }
        return ((Number) deserializationContext.e(this.B, jsonParser)).doubleValue();
    }

    protected final double b(DeserializationContext deserializationContext, String str) {
        char charAt = str.charAt(0);
        if (charAt != '-') {
            if (charAt == 'I') {
                if (g(str)) {
                    return Double.POSITIVE_INFINITY;
                }
            } else if (charAt == 'N' && h(str)) {
                return Double.NaN;
            }
        } else if (j(str)) {
            return Double.NEGATIVE_INFINITY;
        }
        try {
            return e(str);
        } catch (IllegalArgumentException unused) {
            return b((Number) deserializationContext.b(this.B, str, "not a valid double value (as String to convert)", new Object[0])).doubleValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Date a_(JsonParser jsonParser, DeserializationContext deserializationContext) {
        long longValue;
        int t = jsonParser.t();
        if (t != 3) {
            if (t != 11) {
                if (t != 6) {
                    if (t == 7) {
                        try {
                            longValue = jsonParser.w();
                        } catch (JsonParseException | InputCoercionException unused) {
                            longValue = ((Number) deserializationContext.c(this.B, jsonParser.y(), "not a valid 64-bit long for creating `java.util.Date`", new Object[0])).longValue();
                        }
                        return new Date(longValue);
                    }
                    return (Date) deserializationContext.e(this.B, jsonParser);
                }
                return a(jsonParser.A().trim(), deserializationContext);
            }
            return (Date) c(deserializationContext);
        }
        return u(jsonParser, deserializationContext);
    }

    protected Date u(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken o2;
        if (deserializationContext.b(v)) {
            o2 = jsonParser.Q();
            if (o2 == JsonToken.END_ARRAY && deserializationContext.d(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return (Date) c(deserializationContext);
            }
            if (deserializationContext.d(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                Date a_ = a_(jsonParser, deserializationContext);
                I(jsonParser, deserializationContext);
                return a_;
            }
        } else {
            o2 = jsonParser.o();
        }
        return (Date) deserializationContext.e(this.B, o2, jsonParser, null, new Object[0]);
    }

    protected Date a(String str, DeserializationContext deserializationContext) {
        try {
            if (i(str)) {
                return (Date) c(deserializationContext);
            }
            return deserializationContext.e(str);
        } catch (IllegalArgumentException e) {
            return (Date) deserializationContext.b(this.B, str, "not a valid representation (error: %s)", C9537rU.d((Throwable) e));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final double e(String str) {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_NORMAL;
        }
        return Double.parseDouble(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String B(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken o2 = jsonParser.o();
        if (o2 == JsonToken.VALUE_STRING) {
            return jsonParser.A();
        }
        if (o2 == JsonToken.VALUE_EMBEDDED_OBJECT) {
            Object q = jsonParser.q();
            if (q instanceof byte[]) {
                return deserializationContext.h().a((byte[]) q, false);
            }
            if (q == null) {
                return null;
            }
            return q.toString();
        }
        String L = jsonParser.L();
        return L != null ? L : (String) deserializationContext.e(String.class, jsonParser);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T t(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken o2 = jsonParser.o();
        if (o2 == JsonToken.START_ARRAY) {
            if (deserializationContext.d(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                if (jsonParser.Q() == JsonToken.END_ARRAY) {
                    return null;
                }
                return (T) deserializationContext.e(c(), jsonParser);
            }
        } else if (o2 == JsonToken.VALUE_STRING && deserializationContext.d(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.A().trim().isEmpty()) {
            return null;
        }
        return (T) deserializationContext.e(c(), jsonParser);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean d(String str) {
        return "null".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean i(String str) {
        return str.isEmpty() || "null".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean j(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean g(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean h(String str) {
        return "NaN".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T q(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (deserializationContext.b(v)) {
            JsonToken Q = jsonParser.Q();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (Q == jsonToken && deserializationContext.d(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return c(deserializationContext);
            }
            if (deserializationContext.d(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                T b = b(jsonParser, deserializationContext);
                if (jsonParser.Q() != jsonToken) {
                    F(jsonParser, deserializationContext);
                }
                return b;
            }
        } else {
            jsonParser.o();
        }
        return (T) deserializationContext.c(h(deserializationContext), jsonParser.o(), jsonParser, (String) null, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(JsonParser jsonParser, DeserializationContext deserializationContext, String str) {
        deserializationContext.b(c(), "Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)", jsonParser.L(), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object s(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int k = deserializationContext.k();
        if (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.a(k)) {
            return jsonParser.h();
        }
        if (DeserializationFeature.USE_LONG_FOR_INTS.a(k)) {
            return Long.valueOf(jsonParser.w());
        }
        return jsonParser.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object a(DeserializationContext deserializationContext, boolean z) {
        if (z) {
            i(deserializationContext);
        }
        return c(deserializationContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object d(DeserializationContext deserializationContext, boolean z) {
        boolean z2;
        MapperFeature mapperFeature;
        MapperFeature mapperFeature2 = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.d(mapperFeature2)) {
            if (z) {
                DeserializationFeature deserializationFeature = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
                if (deserializationContext.d(deserializationFeature)) {
                    z2 = false;
                    mapperFeature = deserializationFeature;
                }
            }
            return c(deserializationContext);
        }
        z2 = true;
        mapperFeature = mapperFeature2;
        c(deserializationContext, z2, mapperFeature, "String \"null\"");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object b(DeserializationContext deserializationContext, boolean z) {
        boolean z2;
        MapperFeature mapperFeature;
        MapperFeature mapperFeature2 = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.d(mapperFeature2)) {
            if (z) {
                DeserializationFeature deserializationFeature = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
                if (deserializationContext.d(deserializationFeature)) {
                    z2 = false;
                    mapperFeature = deserializationFeature;
                }
            }
            return c(deserializationContext);
        }
        z2 = true;
        mapperFeature = mapperFeature2;
        c(deserializationContext, z2, mapperFeature, "empty String (\"\")");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(DeserializationContext deserializationContext) {
        if (deserializationContext.d(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            deserializationContext.a(this, "Cannot coerce `null` %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", l());
        }
    }

    protected final void e(DeserializationContext deserializationContext, String str) {
        boolean z;
        MapperFeature mapperFeature;
        MapperFeature mapperFeature2 = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.d(mapperFeature2)) {
            DeserializationFeature deserializationFeature = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
            if (!deserializationContext.d(deserializationFeature)) {
                return;
            }
            z = false;
            mapperFeature = deserializationFeature;
        } else {
            z = true;
            mapperFeature = mapperFeature2;
        }
        c(deserializationContext, z, mapperFeature, str.isEmpty() ? "empty String (\"\")" : String.format("String \"%s\"", str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(DeserializationContext deserializationContext, String str) {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.d(mapperFeature)) {
            return;
        }
        c(deserializationContext, true, mapperFeature, str.isEmpty() ? "empty String (\"\")" : String.format("String \"%s\"", str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(DeserializationContext deserializationContext, String str) {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.d(mapperFeature)) {
            return;
        }
        deserializationContext.a(this, "Cannot coerce String \"%s\" %s (enable `%s.%s` to allow)", str, l(), mapperFeature.getClass().getSimpleName(), mapperFeature.name());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(DeserializationContext deserializationContext, JsonParser jsonParser) {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.d(mapperFeature)) {
            return;
        }
        deserializationContext.a(this, "Cannot coerce Number (%s) %s (enable `%s.%s` to allow)", jsonParser.A(), l(), mapperFeature.getClass().getSimpleName(), mapperFeature.name());
    }

    protected void c(DeserializationContext deserializationContext, boolean z, Enum<?> r5, String str) {
        deserializationContext.a(this, "Cannot coerce %s to Null value %s (%s `%s.%s` to allow)", str, l(), z ? "enable" : "disable", r5.getClass().getSimpleName(), r5.name());
    }

    protected String l() {
        String u;
        JavaType g = g();
        boolean z = false;
        if (g != null && !g.C()) {
            if (g.x() || g.d()) {
                z = true;
            }
            u = "'" + g.toString() + "'";
        } else {
            Class<?> c = c();
            if (c.isArray() || Collection.class.isAssignableFrom(c) || Map.class.isAssignableFrom(c)) {
                z = true;
            }
            u = C9537rU.u(c);
        }
        if (z) {
            return "as content of type " + u;
        }
        return "for type " + u;
    }

    public AbstractC9452pp<Object> a(DeserializationContext deserializationContext, JavaType javaType, BeanProperty beanProperty) {
        return deserializationContext.c(javaType, beanProperty);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean f(String str) {
        int length = str.length();
        if (length > 0) {
            char charAt = str.charAt(0);
            for (int i = (charAt == '-' || charAt == '+') ? 1 : 0; i < length; i++) {
                char charAt2 = str.charAt(i);
                if (charAt2 > '9' || charAt2 < '0') {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9452pp<?> d(DeserializationContext deserializationContext, BeanProperty beanProperty, AbstractC9452pp<?> abstractC9452pp) {
        AnnotatedMember e;
        Object c;
        AnnotationIntrospector f = deserializationContext.f();
        if (!b(f, beanProperty) || (e = beanProperty.e()) == null || (c = f.c(e)) == null) {
            return abstractC9452pp;
        }
        InterfaceC9535rS<Object, Object> b = deserializationContext.b(beanProperty.e(), c);
        JavaType d = b.d(deserializationContext.e());
        if (abstractC9452pp == null) {
            abstractC9452pp = deserializationContext.c(d, beanProperty);
        }
        return new StdDelegatingDeserializer(b, d, abstractC9452pp);
    }

    public JsonFormat.Value c(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls) {
        if (beanProperty != null) {
            return beanProperty.d(deserializationContext.c(), cls);
        }
        return deserializationContext.b(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean d(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value c = c(deserializationContext, beanProperty, cls);
        if (c != null) {
            return c.d(feature);
        }
        return null;
    }

    public final InterfaceC9428pR d(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyMetadata propertyMetadata) {
        if (settableBeanProperty != null) {
            return d(deserializationContext, settableBeanProperty, propertyMetadata.a(), settableBeanProperty.o());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InterfaceC9428pR b(DeserializationContext deserializationContext, BeanProperty beanProperty, AbstractC9452pp<?> abstractC9452pp) {
        Nulls d = d(deserializationContext, beanProperty);
        if (d == Nulls.SKIP) {
            return NullsConstantProvider.d();
        }
        InterfaceC9428pR d2 = d(deserializationContext, beanProperty, d, abstractC9452pp);
        return d2 != null ? d2 : abstractC9452pp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Nulls d(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        if (beanProperty != null) {
            return beanProperty.c().c();
        }
        return null;
    }

    protected final InterfaceC9428pR d(DeserializationContext deserializationContext, BeanProperty beanProperty, Nulls nulls, AbstractC9452pp<?> abstractC9452pp) {
        if (nulls == Nulls.FAIL) {
            if (beanProperty == null) {
                return NullsFailProvider.a(deserializationContext.a(abstractC9452pp.c()));
            }
            return NullsFailProvider.a(beanProperty);
        } else if (nulls != Nulls.AS_EMPTY) {
            if (nulls == Nulls.SKIP) {
                return NullsConstantProvider.d();
            }
            return null;
        } else if (abstractC9452pp == null) {
            return null;
        } else {
            if ((abstractC9452pp instanceof BeanDeserializerBase) && !((BeanDeserializerBase) abstractC9452pp).j().g()) {
                JavaType d = beanProperty.d();
                deserializationContext.c(d, String.format("Cannot create empty instance of %s, no default Creator", d));
            }
            AccessPattern a = abstractC9452pp.a();
            if (a == AccessPattern.ALWAYS_NULL) {
                return NullsConstantProvider.b();
            }
            if (a == AccessPattern.CONSTANT) {
                return NullsConstantProvider.a(abstractC9452pp.d(deserializationContext));
            }
            return new NullsAsEmptyProvider(abstractC9452pp);
        }
    }

    public void d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        if (obj == null) {
            obj = c();
        }
        if (deserializationContext.e(jsonParser, this, obj, str)) {
            return;
        }
        jsonParser.T();
    }

    public void F(JsonParser jsonParser, DeserializationContext deserializationContext) {
        deserializationContext.e(this, JsonToken.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", c().getName());
    }

    protected void I(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.Q() != JsonToken.END_ARRAY) {
            F(jsonParser, deserializationContext);
        }
    }

    protected Number b(Number number) {
        if (number == null) {
            return 0;
        }
        return number;
    }
}
