package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import o.AbstractC9323nS;
import o.C9322nR;
import o.C9441pe;
import o.C9448pl;
import o.InterfaceC9324nT;
import o.InterfaceC9326nV;
import o.InterfaceC9327nW;

/* loaded from: classes2.dex */
public abstract class JsonGenerator implements Closeable, Flushable {
    protected static final C9441pe<StreamWriteCapability> a;
    protected static final C9441pe<StreamWriteCapability> c;
    public static final C9441pe<StreamWriteCapability> d;
    public InterfaceC9326nV b;

    public abstract JsonGenerator a(Feature feature);

    public JsonGenerator a(InterfaceC9326nV interfaceC9326nV) {
        this.b = interfaceC9326nV;
        return this;
    }

    public abstract void a(Object obj);

    public abstract void a(String str);

    public abstract void a(boolean z);

    public JsonGenerator b(int i) {
        return this;
    }

    public JsonGenerator b(int i, int i2) {
        return this;
    }

    public abstract void b(long j);

    public abstract void b(String str);

    public abstract void b(BigDecimal bigDecimal);

    public boolean b() {
        return false;
    }

    public abstract int c(Base64Variant base64Variant, InputStream inputStream, int i);

    public abstract void c(int i);

    public boolean c() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    @Deprecated
    public abstract JsonGenerator d(int i);

    public abstract void d(char c2);

    public abstract void d(float f);

    public abstract void d(String str);

    public abstract void d(InterfaceC9327nW interfaceC9327nW);

    public abstract void d(char[] cArr, int i, int i2);

    public boolean d() {
        return true;
    }

    public JsonGenerator e(CharacterEscapes characterEscapes) {
        return this;
    }

    public abstract void e(double d2);

    public abstract void e(Base64Variant base64Variant, byte[] bArr, int i, int i2);

    public void e(String str) {
    }

    public abstract void e(BigInteger bigInteger);

    public abstract void e(InterfaceC9327nW interfaceC9327nW);

    public abstract void e(char[] cArr, int i, int i2);

    public abstract boolean e(Feature feature);

    public InterfaceC9326nV f() {
        return this.b;
    }

    @Override // java.io.Flushable
    public abstract void flush();

    public abstract void g(String str);

    public boolean g() {
        return false;
    }

    public abstract AbstractC9323nS h();

    public abstract void i();

    public abstract void i(String str);

    public abstract int j();

    public abstract void k();

    public abstract void l();

    public abstract void n();

    public abstract void o();

    static {
        C9441pe<StreamWriteCapability> e = C9441pe.e(StreamWriteCapability.values());
        a = e;
        d = e.c(StreamWriteCapability.CAN_WRITE_FORMATTED_NUMBERS);
        c = e.c(StreamWriteCapability.CAN_WRITE_BINARY_NATIVELY);
    }

    /* loaded from: classes2.dex */
    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false),
        USE_FAST_DOUBLE_WRITER(false),
        WRITE_HEX_UPPER_CASE(true);
        
        private final int k = 1 << ordinal();
        private final boolean n;

        public boolean b(int i) {
            return (i & this.k) != 0;
        }

        public int c() {
            return this.k;
        }

        public boolean d() {
            return this.n;
        }

        public static int e() {
            Feature[] values;
            int i = 0;
            for (Feature feature : values()) {
                if (feature.d()) {
                    i |= feature.c();
                }
            }
            return i;
        }

        Feature(boolean z) {
            this.n = z;
        }
    }

    public void e(Object obj) {
        AbstractC9323nS h = h();
        if (h != null) {
            h.b(obj);
        }
    }

    public JsonGenerator d(int i, int i2) {
        return d((i & i2) | ((~i2) & j()));
    }

    public void a(InterfaceC9324nT interfaceC9324nT) {
        throw new UnsupportedOperationException(String.format("Generator of type %s does not support schema of type '%s'", getClass().getName(), interfaceC9324nT.c()));
    }

    public JsonGenerator a(InterfaceC9327nW interfaceC9327nW) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void e(int i) {
        n();
    }

    public void g(Object obj) {
        n();
        e(obj);
    }

    public void e(Object obj, int i) {
        e(i);
        e(obj);
    }

    public void i(Object obj) {
        l();
        e(obj);
    }

    public void a(Object obj, int i) {
        i(obj);
    }

    public void c(long j) {
        a(Long.toString(j));
    }

    public void e(int[] iArr, int i, int i2) {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        a(iArr.length, i, i2);
        e(iArr, i2);
        for (int i3 = i; i3 < i2 + i; i3++) {
            c(iArr[i3]);
        }
        i();
    }

    public void a(long[] jArr, int i, int i2) {
        if (jArr == null) {
            throw new IllegalArgumentException("null array");
        }
        a(jArr.length, i, i2);
        e(jArr, i2);
        for (int i3 = i; i3 < i2 + i; i3++) {
            b(jArr[i3]);
        }
        i();
    }

    public void c(double[] dArr, int i, int i2) {
        if (dArr == null) {
            throw new IllegalArgumentException("null array");
        }
        a(dArr.length, i, i2);
        e(dArr, i2);
        for (int i3 = i; i3 < i2 + i; i3++) {
            e(dArr[i3]);
        }
        i();
    }

    public void b(InterfaceC9327nW interfaceC9327nW) {
        b(interfaceC9327nW.b());
    }

    public void c(InterfaceC9327nW interfaceC9327nW) {
        g(interfaceC9327nW.b());
    }

    public void e(byte[] bArr, int i, int i2) {
        e(C9322nR.e(), bArr, i, i2);
    }

    public void a(byte[] bArr) {
        e(C9322nR.e(), bArr, 0, bArr.length);
    }

    public int c(InputStream inputStream, int i) {
        return c(C9322nR.e(), inputStream, i);
    }

    public void b(short s) {
        c((int) s);
    }

    public void c(Object obj) {
        if (obj == null) {
            k();
        } else if (obj instanceof byte[]) {
            a((byte[]) obj);
        } else {
            throw new JsonGenerationException("No native support for writing embedded objects of type " + obj.getClass().getName(), this);
        }
    }

    public void b(Object obj) {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void f(Object obj) {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void h(Object obj) {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public WritableTypeId c(WritableTypeId writableTypeId) {
        Object obj = writableTypeId.e;
        JsonToken jsonToken = writableTypeId.f;
        if (g()) {
            writableTypeId.h = false;
            h(obj);
        } else {
            String valueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            writableTypeId.h = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.d;
            if (jsonToken != JsonToken.START_OBJECT && inclusion.a()) {
                inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
                writableTypeId.d = inclusion;
            }
            int i = AnonymousClass3.e[inclusion.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    i(writableTypeId.b);
                    a(writableTypeId.a, valueOf);
                    return writableTypeId;
                } else if (i == 4) {
                    l();
                    a(valueOf);
                } else {
                    n();
                    i(valueOf);
                }
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            i(writableTypeId.b);
        } else if (jsonToken == JsonToken.START_ARRAY) {
            n();
        }
        return writableTypeId;
    }

    /* renamed from: com.fasterxml.jackson.core.JsonGenerator$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[WritableTypeId.Inclusion.values().length];
            e = iArr;
            try {
                iArr[WritableTypeId.Inclusion.PARENT_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[WritableTypeId.Inclusion.PAYLOAD_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[WritableTypeId.Inclusion.METADATA_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[WritableTypeId.Inclusion.WRAPPER_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[WritableTypeId.Inclusion.WRAPPER_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public WritableTypeId b(WritableTypeId writableTypeId) {
        JsonToken jsonToken = writableTypeId.f;
        if (jsonToken == JsonToken.START_OBJECT) {
            o();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            i();
        }
        if (writableTypeId.h) {
            int i = AnonymousClass3.e[writableTypeId.d.ordinal()];
            if (i == 1) {
                Object obj = writableTypeId.e;
                a(writableTypeId.a, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (i != 2 && i != 3) {
                if (i == 5) {
                    i();
                } else {
                    o();
                }
            }
        }
        return writableTypeId;
    }

    public void a(String str, String str2) {
        a(str);
        i(str2);
    }

    public void a(JsonParser jsonParser) {
        JsonToken f = jsonParser.f();
        switch (f == null ? -1 : f.c()) {
            case -1:
                c("No current event to copy");
                return;
            case 0:
            default:
                throw new IllegalStateException("Internal error: unknown current token, " + f);
            case 1:
                l();
                return;
            case 2:
                o();
                return;
            case 3:
                n();
                return;
            case 4:
                i();
                return;
            case 5:
                a(jsonParser.l());
                return;
            case 6:
                if (jsonParser.M()) {
                    d(jsonParser.B(), jsonParser.H(), jsonParser.D());
                    return;
                } else {
                    i(jsonParser.A());
                    return;
                }
            case 7:
                JsonParser.NumberType v = jsonParser.v();
                if (v == JsonParser.NumberType.INT) {
                    c(jsonParser.u());
                    return;
                } else if (v == JsonParser.NumberType.BIG_INTEGER) {
                    e(jsonParser.h());
                    return;
                } else {
                    b(jsonParser.w());
                    return;
                }
            case 8:
                JsonParser.NumberType v2 = jsonParser.v();
                if (v2 == JsonParser.NumberType.BIG_DECIMAL) {
                    b(jsonParser.r());
                    return;
                } else if (v2 == JsonParser.NumberType.FLOAT) {
                    d(jsonParser.s());
                    return;
                } else {
                    e(jsonParser.p());
                    return;
                }
            case 9:
                a(true);
                return;
            case 10:
                a(false);
                return;
            case 11:
                k();
                return;
            case 12:
                a(jsonParser.q());
                return;
        }
    }

    public void b(JsonParser jsonParser) {
        JsonToken f = jsonParser.f();
        int c2 = f == null ? -1 : f.c();
        if (c2 == 5) {
            a(jsonParser.l());
            JsonToken Q = jsonParser.Q();
            c2 = Q != null ? Q.c() : -1;
        }
        if (c2 == 1) {
            l();
            d(jsonParser);
        } else if (c2 == 3) {
            n();
            d(jsonParser);
        } else {
            a(jsonParser);
        }
    }

    protected void d(JsonParser jsonParser) {
        int i = 1;
        while (true) {
            JsonToken Q = jsonParser.Q();
            if (Q == null) {
                return;
            }
            switch (Q.c()) {
                case 1:
                    l();
                    break;
                case 2:
                    o();
                    i--;
                    if (i == 0) {
                        return;
                    }
                    continue;
                case 3:
                    n();
                    break;
                case 4:
                    i();
                    i--;
                    if (i == 0) {
                        return;
                    }
                    continue;
                case 5:
                    a(jsonParser.l());
                    continue;
                case 6:
                    if (jsonParser.M()) {
                        d(jsonParser.B(), jsonParser.H(), jsonParser.D());
                    } else {
                        i(jsonParser.A());
                        continue;
                    }
                case 7:
                    JsonParser.NumberType v = jsonParser.v();
                    if (v == JsonParser.NumberType.INT) {
                        c(jsonParser.u());
                    } else if (v == JsonParser.NumberType.BIG_INTEGER) {
                        e(jsonParser.h());
                    } else {
                        b(jsonParser.w());
                        continue;
                    }
                case 8:
                    JsonParser.NumberType v2 = jsonParser.v();
                    if (v2 == JsonParser.NumberType.BIG_DECIMAL) {
                        b(jsonParser.r());
                    } else if (v2 == JsonParser.NumberType.FLOAT) {
                        d(jsonParser.s());
                    } else {
                        e(jsonParser.p());
                        continue;
                    }
                case 9:
                    a(true);
                    continue;
                case 10:
                    a(false);
                    continue;
                case 11:
                    k();
                    continue;
                case 12:
                    a(jsonParser.q());
                    continue;
                default:
                    throw new IllegalStateException("Internal error: unknown current token, " + Q);
            }
            i++;
        }
    }

    public void c(String str) {
        throw new JsonGenerationException(str, this);
    }

    public final void e() {
        C9448pl.e();
    }

    public void a() {
        throw new UnsupportedOperationException("Operation not supported by generator of type " + getClass().getName());
    }

    public final void a(int i, int i2, int i3) {
        if (i2 < 0 || i2 + i3 > i) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i)));
        }
    }

    public void d(Object obj) {
        if (obj == null) {
            k();
        } else if (obj instanceof String) {
            i((String) obj);
        } else {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    c(number.intValue());
                    return;
                } else if (number instanceof Long) {
                    b(number.longValue());
                    return;
                } else if (number instanceof Double) {
                    e(number.doubleValue());
                    return;
                } else if (number instanceof Float) {
                    d(number.floatValue());
                    return;
                } else if (number instanceof Short) {
                    b(number.shortValue());
                    return;
                } else if (number instanceof Byte) {
                    b(number.byteValue());
                    return;
                } else if (number instanceof BigInteger) {
                    e((BigInteger) number);
                    return;
                } else if (number instanceof BigDecimal) {
                    b((BigDecimal) number);
                    return;
                } else if (number instanceof AtomicInteger) {
                    c(((AtomicInteger) number).get());
                    return;
                } else if (number instanceof AtomicLong) {
                    b(((AtomicLong) number).get());
                    return;
                }
            } else if (obj instanceof byte[]) {
                a((byte[]) obj);
                return;
            } else if (obj instanceof Boolean) {
                a(((Boolean) obj).booleanValue());
                return;
            } else if (obj instanceof AtomicBoolean) {
                a(((AtomicBoolean) obj).get());
                return;
            }
            throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
        }
    }
}
