package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.util.RequestPayload;
import java.io.Closeable;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.AbstractC9323nS;
import o.C9322nR;
import o.C9441pe;
import o.InterfaceC9324nT;

/* loaded from: classes2.dex */
public abstract class JsonParser implements Closeable {
    public static final C9441pe<StreamReadCapability> c = C9441pe.e(StreamReadCapability.values());
    public int a;
    protected transient RequestPayload e;

    /* loaded from: classes2.dex */
    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public abstract String A();

    public abstract char[] B();

    public abstract int D();

    public Object F() {
        return null;
    }

    public abstract JsonLocation G();

    public abstract int H();

    public abstract boolean M();

    public abstract boolean N();

    public abstract JsonToken O();

    public boolean P() {
        return false;
    }

    public abstract JsonToken Q();

    public abstract JsonParser T();

    public boolean X() {
        return false;
    }

    public abstract boolean a(JsonToken jsonToken);

    public boolean b() {
        return false;
    }

    @Deprecated
    public JsonParser c(int i) {
        this.a = i;
        return this;
    }

    public JsonParser c(int i, int i2) {
        return this;
    }

    public abstract String c(String str);

    public boolean c() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public int d(int i) {
        return i;
    }

    public long d(long j) {
        return j;
    }

    public abstract void e();

    public abstract boolean e(int i);

    public abstract byte[] e(Base64Variant base64Variant);

    public abstract BigInteger h();

    public abstract JsonLocation k();

    public abstract String l();

    public abstract ObjectCodec n();

    public abstract JsonToken o();

    public abstract double p();

    public Object q() {
        return null;
    }

    public abstract BigDecimal r();

    public abstract float s();

    @Deprecated
    public abstract int t();

    public abstract int u();

    public abstract NumberType v();

    public abstract long w();

    public Object x() {
        return null;
    }

    public abstract Number y();

    public abstract AbstractC9323nS z();

    /* loaded from: classes2.dex */
    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true),
        USE_FAST_DOUBLE_PARSER(false);
        
        private final boolean s;
        private final int v = 1 << ordinal();

        public int b() {
            return this.v;
        }

        public boolean e() {
            return this.s;
        }

        public boolean e(int i) {
            return (i & this.v) != 0;
        }

        public static int a() {
            Feature[] values;
            int i = 0;
            for (Feature feature : values()) {
                if (feature.e()) {
                    i |= feature.b();
                }
            }
            return i;
        }

        Feature(boolean z) {
            this.s = z;
        }
    }

    public JsonParser() {
        this.a = JsonFactory.DEFAULT_PARSER_FEATURE_FLAGS;
    }

    public JsonParser(int i) {
        this.a = i;
    }

    public void d(InterfaceC9324nT interfaceC9324nT) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + interfaceC9324nT.c() + "'");
    }

    public void e(Object obj) {
        AbstractC9323nS z = z();
        if (z != null) {
            z.b(obj);
        }
    }

    public JsonParser e(Feature feature) {
        this.a = feature.b() | this.a;
        return this;
    }

    public JsonParser b(Feature feature) {
        this.a = (~feature.b()) & this.a;
        return this;
    }

    public JsonParser b(Feature feature, boolean z) {
        if (z) {
            e(feature);
        } else {
            b(feature);
        }
        return this;
    }

    public boolean a(Feature feature) {
        return feature.e(this.a);
    }

    public JsonParser d(int i, int i2) {
        return c((i & i2) | ((~i2) & this.a));
    }

    public String R() {
        if (Q() == JsonToken.FIELD_NAME) {
            return l();
        }
        return null;
    }

    public String S() {
        if (Q() == JsonToken.VALUE_STRING) {
            return A();
        }
        return null;
    }

    public JsonToken f() {
        return o();
    }

    public int j() {
        return t();
    }

    public boolean J() {
        return f() == JsonToken.START_ARRAY;
    }

    public boolean K() {
        return f() == JsonToken.START_OBJECT;
    }

    public String d() {
        return l();
    }

    public byte m() {
        int u = u();
        if (u < -128 || u > 255) {
            throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java byte", A()), JsonToken.VALUE_NUMBER_INT, Byte.TYPE);
        }
        return (byte) u;
    }

    public short C() {
        int u = u();
        if (u < -32768 || u > 32767) {
            throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java short", A()), JsonToken.VALUE_NUMBER_INT, Short.TYPE);
        }
        return (short) u;
    }

    public boolean g() {
        JsonToken f = f();
        if (f == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (f == JsonToken.VALUE_FALSE) {
            return false;
        }
        throw new JsonParseException(this, String.format("Current token (%s) not of boolean type", f)).e(this.e);
    }

    public byte[] i() {
        return e(C9322nR.e());
    }

    public int e(Base64Variant base64Variant, OutputStream outputStream) {
        a();
        return 0;
    }

    public int E() {
        return d(0);
    }

    public long I() {
        return d(0L);
    }

    public String L() {
        return c((String) null);
    }

    public JsonParseException d(String str) {
        return new JsonParseException(this, str).e(this.e);
    }

    protected void a() {
        throw new UnsupportedOperationException("Operation not supported by parser of type " + getClass().getName());
    }
}
