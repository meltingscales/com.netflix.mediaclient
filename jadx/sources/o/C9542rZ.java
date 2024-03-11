package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

/* renamed from: o.rZ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9542rZ extends JsonGenerator {
    protected static final int e = JsonGenerator.Feature.e();
    protected boolean f;
    protected int g;
    protected int h;
    protected a i;
    protected boolean j;
    protected boolean k;
    protected boolean l;
    protected boolean m;
    protected a n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f13900o;
    protected ObjectCodec p;
    protected AbstractC9323nS q;
    protected Object r;
    protected Object s;
    protected C9371oN t;

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(Object obj) {
        this.r = obj;
        this.l = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean b() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean c() {
        return this.k;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @Deprecated
    public JsonGenerator d(int i) {
        this.h = i;
        return this;
    }

    public C9542rZ d(boolean z) {
        this.j = z;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() {
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean g() {
        return this.f13900o;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void h(Object obj) {
        this.s = obj;
        this.l = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int j() {
        return this.h;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* renamed from: q */
    public final C9371oN h() {
        return this.t;
    }

    public C9542rZ(ObjectCodec objectCodec, boolean z) {
        this.l = false;
        this.p = objectCodec;
        this.h = e;
        this.t = C9371oN.c(null);
        a aVar = new a();
        this.n = aVar;
        this.i = aVar;
        this.g = 0;
        this.f13900o = z;
        this.k = z;
        this.m = z | z;
    }

    public C9542rZ(JsonParser jsonParser) {
        this(jsonParser, (DeserializationContext) null);
    }

    public C9542rZ(JsonParser jsonParser, DeserializationContext deserializationContext) {
        this.l = false;
        this.p = jsonParser.n();
        this.q = jsonParser.z();
        this.h = e;
        this.t = C9371oN.c(null);
        a aVar = new a();
        this.n = aVar;
        this.i = aVar;
        this.g = 0;
        this.f13900o = jsonParser.c();
        boolean b = jsonParser.b();
        this.k = b;
        this.m = b | this.f13900o;
        this.j = deserializationContext != null ? deserializationContext.d(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) : false;
    }

    public static C9542rZ c(JsonParser jsonParser) {
        C9542rZ c9542rZ = new C9542rZ(jsonParser);
        c9542rZ.b(jsonParser);
        return c9542rZ;
    }

    public JsonParser m() {
        return b(this.p);
    }

    public JsonParser r() {
        JsonParser b = b(this.p);
        b.Q();
        return b;
    }

    public JsonParser b(ObjectCodec objectCodec) {
        return new d(this.i, objectCodec, this.f13900o, this.k, this.q);
    }

    public JsonParser g(JsonParser jsonParser) {
        d dVar = new d(this.i, jsonParser.n(), this.f13900o, this.k, this.q);
        dVar.e(jsonParser.G());
        return dVar;
    }

    public JsonToken p() {
        return this.i.a(0);
    }

    public C9542rZ b(C9542rZ c9542rZ) {
        if (!this.f13900o) {
            this.f13900o = c9542rZ.g();
        }
        if (!this.k) {
            this.k = c9542rZ.c();
        }
        this.m = this.f13900o | this.k;
        JsonParser m = c9542rZ.m();
        while (m.Q() != null) {
            b(m);
        }
        return this;
    }

    public void e(JsonGenerator jsonGenerator) {
        a aVar = this.i;
        boolean z = this.m;
        boolean z2 = z && aVar.d();
        int i = -1;
        while (true) {
            i++;
            if (i >= 16) {
                aVar = aVar.c();
                if (aVar == null) {
                    return;
                }
                z2 = z && aVar.d();
                i = 0;
            }
            JsonToken a2 = aVar.a(i);
            if (a2 == null) {
                return;
            }
            if (z2) {
                Object b = aVar.b(i);
                if (b != null) {
                    jsonGenerator.b(b);
                }
                Object g = aVar.g(i);
                if (g != null) {
                    jsonGenerator.h(g);
                }
            }
            switch (AnonymousClass4.a[a2.ordinal()]) {
                case 1:
                    jsonGenerator.l();
                    break;
                case 2:
                    jsonGenerator.o();
                    break;
                case 3:
                    jsonGenerator.n();
                    break;
                case 4:
                    jsonGenerator.i();
                    break;
                case 5:
                    Object d2 = aVar.d(i);
                    if (d2 instanceof InterfaceC9327nW) {
                        jsonGenerator.d((InterfaceC9327nW) d2);
                        break;
                    } else {
                        jsonGenerator.a((String) d2);
                        break;
                    }
                case 6:
                    Object d3 = aVar.d(i);
                    if (d3 instanceof InterfaceC9327nW) {
                        jsonGenerator.e((InterfaceC9327nW) d3);
                        break;
                    } else {
                        jsonGenerator.i((String) d3);
                        break;
                    }
                case 7:
                    Object d4 = aVar.d(i);
                    if (d4 instanceof Integer) {
                        jsonGenerator.c(((Integer) d4).intValue());
                        break;
                    } else if (d4 instanceof BigInteger) {
                        jsonGenerator.e((BigInteger) d4);
                        break;
                    } else if (d4 instanceof Long) {
                        jsonGenerator.b(((Long) d4).longValue());
                        break;
                    } else if (d4 instanceof Short) {
                        jsonGenerator.b(((Short) d4).shortValue());
                        break;
                    } else {
                        jsonGenerator.c(((Number) d4).intValue());
                        break;
                    }
                case 8:
                    Object d5 = aVar.d(i);
                    if (d5 instanceof Double) {
                        jsonGenerator.e(((Double) d5).doubleValue());
                        break;
                    } else if (d5 instanceof BigDecimal) {
                        jsonGenerator.b((BigDecimal) d5);
                        break;
                    } else if (d5 instanceof Float) {
                        jsonGenerator.d(((Float) d5).floatValue());
                        break;
                    } else if (d5 == null) {
                        jsonGenerator.k();
                        break;
                    } else if (d5 instanceof String) {
                        jsonGenerator.d((String) d5);
                        break;
                    } else {
                        throw new JsonGenerationException(String.format("Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize", d5.getClass().getName()), jsonGenerator);
                    }
                case 9:
                    jsonGenerator.a(true);
                    break;
                case 10:
                    jsonGenerator.a(false);
                    break;
                case 11:
                    jsonGenerator.k();
                    break;
                case 12:
                    Object d6 = aVar.d(i);
                    if (d6 instanceof C9540rX) {
                        ((C9540rX) d6).b(jsonGenerator);
                        break;
                    } else if (d6 instanceof InterfaceC9451po) {
                        jsonGenerator.a(d6);
                        break;
                    } else {
                        jsonGenerator.c(d6);
                        break;
                    }
                default:
                    throw new RuntimeException("Internal error: should never end up through this code path");
            }
        }
    }

    public C9542rZ e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken Q;
        if (!jsonParser.a(JsonToken.FIELD_NAME)) {
            b(jsonParser);
            return this;
        }
        l();
        do {
            b(jsonParser);
            Q = jsonParser.Q();
        } while (Q == JsonToken.FIELD_NAME);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        if (Q != jsonToken) {
            deserializationContext.a(C9542rZ.class, jsonToken, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + Q, new Object[0]);
        }
        o();
        return this;
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("[TokenBuffer: ");
        JsonParser m = m();
        boolean z = false;
        if (this.f13900o || this.k) {
            z = true;
            i = 0;
        } else {
            i = 0;
        }
        while (true) {
            try {
                JsonToken Q = m.Q();
                if (Q == null) {
                    break;
                }
                if (z) {
                    b(sb);
                }
                if (i < 100) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(Q.toString());
                    if (Q == JsonToken.FIELD_NAME) {
                        sb.append('(');
                        sb.append(m.l());
                        sb.append(')');
                    }
                }
                i++;
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }
        if (i >= 100) {
            sb.append(" ... (truncated ");
            sb.append(i - 100);
            sb.append(" entries)");
        }
        sb.append(']');
        return sb.toString();
    }

    private final void b(StringBuilder sb) {
        Object b = this.n.b(this.g - 1);
        if (b != null) {
            sb.append("[objectId=");
            sb.append(String.valueOf(b));
            sb.append(']');
        }
        Object g = this.n.g(this.g - 1);
        if (g != null) {
            sb.append("[typeId=");
            sb.append(String.valueOf(g));
            sb.append(']');
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator a(JsonGenerator.Feature feature) {
        this.h = (~feature.c()) & this.h;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean e(JsonGenerator.Feature feature) {
        return (feature.c() & this.h) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator d(int i, int i2) {
        this.h = (i & i2) | ((~i2) & j());
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void n() {
        this.t.s();
        a(JsonToken.START_ARRAY);
        this.t = this.t.l();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void e(int i) {
        this.t.s();
        a(JsonToken.START_ARRAY);
        this.t = this.t.l();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void g(Object obj) {
        this.t.s();
        a(JsonToken.START_ARRAY);
        this.t = this.t.l();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(Object obj, int i) {
        this.t.s();
        a(JsonToken.START_ARRAY);
        this.t = this.t.a(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void i() {
        b(JsonToken.END_ARRAY);
        C9371oN b = this.t.b();
        if (b != null) {
            this.t = b;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void l() {
        this.t.s();
        a(JsonToken.START_OBJECT);
        this.t = this.t.n();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void i(Object obj) {
        this.t.s();
        a(JsonToken.START_OBJECT);
        this.t = this.t.e(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a(Object obj, int i) {
        this.t.s();
        a(JsonToken.START_OBJECT);
        this.t = this.t.e(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void o() {
        b(JsonToken.END_OBJECT);
        C9371oN b = this.t.b();
        if (b != null) {
            this.t = b;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void a(String str) {
        this.t.b(str);
        j(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(InterfaceC9327nW interfaceC9327nW) {
        this.t.b(interfaceC9327nW.b());
        j(interfaceC9327nW);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void i(String str) {
        if (str == null) {
            k();
        } else {
            e(JsonToken.VALUE_STRING, str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(char[] cArr, int i, int i2) {
        i(new String(cArr, i, i2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(InterfaceC9327nW interfaceC9327nW) {
        if (interfaceC9327nW == null) {
            k();
        } else {
            e(JsonToken.VALUE_STRING, interfaceC9327nW);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(String str) {
        a();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(InterfaceC9327nW interfaceC9327nW) {
        a();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(char[] cArr, int i, int i2) {
        a();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(char c) {
        a();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void g(String str) {
        e(JsonToken.VALUE_EMBEDDED_OBJECT, new C9540rX(str));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(short s) {
        e(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void c(int i) {
        e(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(long j) {
        e(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(double d2) {
        e(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(float f) {
        e(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            k();
        } else {
            e(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(BigInteger bigInteger) {
        if (bigInteger == null) {
            k();
        } else {
            e(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d(String str) {
        e(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a(boolean z) {
        e(z ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void k() {
        e(JsonToken.VALUE_NULL);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a(Object obj) {
        if (obj == null) {
            k();
        } else if (obj.getClass() == byte[].class || (obj instanceof C9540rX)) {
            e(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            ObjectCodec objectCodec = this.p;
            if (objectCodec == null) {
                e(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            } else {
                objectCodec.writeValue(this, obj);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void e(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        a((Object) bArr2);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int c(Base64Variant base64Variant, InputStream inputStream, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void c(Object obj) {
        e(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a(JsonParser jsonParser) {
        if (this.m) {
            i(jsonParser);
        }
        switch (AnonymousClass4.a[jsonParser.f().ordinal()]) {
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
                int i = AnonymousClass4.c[jsonParser.v().ordinal()];
                if (i == 1) {
                    c(jsonParser.u());
                    return;
                } else if (i == 2) {
                    e(jsonParser.h());
                    return;
                } else {
                    b(jsonParser.w());
                    return;
                }
            case 8:
                if (this.j) {
                    b(jsonParser.r());
                    return;
                }
                int i2 = AnonymousClass4.c[jsonParser.v().ordinal()];
                if (i2 == 3) {
                    b(jsonParser.r());
                    return;
                } else if (i2 == 4) {
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
            default:
                throw new RuntimeException("Internal error: unexpected token: " + jsonParser.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.rZ$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            c = iArr;
            try {
                iArr[JsonParser.NumberType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[JsonParser.NumberType.BIG_INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[JsonParser.NumberType.BIG_DECIMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[JsonParser.NumberType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[JsonParser.NumberType.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            a = iArr2;
            try {
                iArr2[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[JsonToken.START_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[JsonToken.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[JsonToken.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[JsonToken.VALUE_TRUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[JsonToken.VALUE_FALSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[JsonToken.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b(JsonParser jsonParser) {
        JsonToken f = jsonParser.f();
        if (f == JsonToken.FIELD_NAME) {
            if (this.m) {
                i(jsonParser);
            }
            a(jsonParser.l());
            f = jsonParser.Q();
        } else if (f == null) {
            throw new IllegalStateException("No token available from argument `JsonParser`");
        }
        int i = AnonymousClass4.a[f.ordinal()];
        if (i == 1) {
            if (this.m) {
                i(jsonParser);
            }
            l();
            e(jsonParser);
        } else if (i == 2) {
            o();
        } else if (i != 3) {
            if (i == 4) {
                i();
            } else {
                e(jsonParser, f);
            }
        } else {
            if (this.m) {
                i(jsonParser);
            }
            n();
            e(jsonParser);
        }
    }

    protected void e(JsonParser jsonParser) {
        int i = 1;
        while (true) {
            JsonToken Q = jsonParser.Q();
            if (Q == null) {
                return;
            }
            int i2 = AnonymousClass4.a[Q.ordinal()];
            if (i2 == 1) {
                if (this.m) {
                    i(jsonParser);
                }
                l();
            } else if (i2 == 2) {
                o();
                i--;
                if (i == 0) {
                    return;
                }
            } else if (i2 == 3) {
                if (this.m) {
                    i(jsonParser);
                }
                n();
            } else if (i2 == 4) {
                i();
                i--;
                if (i == 0) {
                    return;
                }
            } else if (i2 == 5) {
                if (this.m) {
                    i(jsonParser);
                }
                a(jsonParser.l());
            } else {
                e(jsonParser, Q);
            }
            i++;
        }
    }

    private void e(JsonParser jsonParser, JsonToken jsonToken) {
        if (this.m) {
            i(jsonParser);
        }
        switch (AnonymousClass4.a[jsonToken.ordinal()]) {
            case 6:
                if (jsonParser.M()) {
                    d(jsonParser.B(), jsonParser.H(), jsonParser.D());
                    return;
                } else {
                    i(jsonParser.A());
                    return;
                }
            case 7:
                int i = AnonymousClass4.c[jsonParser.v().ordinal()];
                if (i == 1) {
                    c(jsonParser.u());
                    return;
                } else if (i == 2) {
                    e(jsonParser.h());
                    return;
                } else {
                    b(jsonParser.w());
                    return;
                }
            case 8:
                if (this.j) {
                    b(jsonParser.r());
                    return;
                }
                int i2 = AnonymousClass4.c[jsonParser.v().ordinal()];
                if (i2 == 3) {
                    b(jsonParser.r());
                    return;
                } else if (i2 == 4) {
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
            default:
                throw new RuntimeException("Internal error: unexpected token: " + jsonToken);
        }
    }

    private final void i(JsonParser jsonParser) {
        Object F = jsonParser.F();
        this.s = F;
        if (F != null) {
            this.l = true;
        }
        Object x = jsonParser.x();
        this.r = x;
        if (x != null) {
            this.l = true;
        }
    }

    protected final void e(JsonToken jsonToken) {
        a d2;
        this.t.s();
        if (this.l) {
            d2 = this.n.c(this.g, jsonToken, this.r, this.s);
        } else {
            d2 = this.n.d(this.g, jsonToken);
        }
        if (d2 == null) {
            this.g++;
            return;
        }
        this.n = d2;
        this.g = 1;
    }

    protected final void e(JsonToken jsonToken, Object obj) {
        a d2;
        this.t.s();
        if (this.l) {
            d2 = this.n.b(this.g, jsonToken, obj, this.r, this.s);
        } else {
            d2 = this.n.d(this.g, jsonToken, obj);
        }
        if (d2 == null) {
            this.g++;
            return;
        }
        this.n = d2;
        this.g = 1;
    }

    protected final void j(Object obj) {
        a d2;
        if (this.l) {
            d2 = this.n.b(this.g, JsonToken.FIELD_NAME, obj, this.r, this.s);
        } else {
            d2 = this.n.d(this.g, JsonToken.FIELD_NAME, obj);
        }
        if (d2 == null) {
            this.g++;
            return;
        }
        this.n = d2;
        this.g = 1;
    }

    protected final void a(JsonToken jsonToken) {
        a d2;
        if (this.l) {
            d2 = this.n.c(this.g, jsonToken, this.r, this.s);
        } else {
            d2 = this.n.d(this.g, jsonToken);
        }
        if (d2 == null) {
            this.g++;
            return;
        }
        this.n = d2;
        this.g = 1;
    }

    protected final void b(JsonToken jsonToken) {
        a d2 = this.n.d(this.g, jsonToken);
        if (d2 == null) {
            this.g++;
            return;
        }
        this.n = d2;
        this.g = 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o.rZ$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC9384oa {
        protected boolean b;
        protected transient C9439pc d;
        protected final boolean f;
        protected JsonLocation g;
        protected final boolean h;
        protected ObjectCodec i;
        protected final boolean j;
        protected a k;
        protected int l;
        protected C9594sf n;

        @Override // com.fasterxml.jackson.core.JsonParser
        public int H() {
            return 0;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean M() {
            return false;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean b() {
            return this.f;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean c() {
            return this.j;
        }

        @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.b) {
                return;
            }
            this.b = true;
        }

        public void e(JsonLocation jsonLocation) {
            this.g = jsonLocation;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public ObjectCodec n() {
            return this.i;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public AbstractC9323nS z() {
            return this.n;
        }

        public d(a aVar, ObjectCodec objectCodec, boolean z, boolean z2, AbstractC9323nS abstractC9323nS) {
            super(0);
            this.g = null;
            this.k = aVar;
            this.l = -1;
            this.i = objectCodec;
            this.n = C9594sf.b(abstractC9323nS);
            this.j = z;
            this.f = z2;
            this.h = z | z2;
        }

        @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
        public JsonToken Q() {
            a aVar;
            if (this.b || (aVar = this.k) == null) {
                return null;
            }
            int i = this.l + 1;
            this.l = i;
            if (i >= 16) {
                this.l = 0;
                a c = aVar.c();
                this.k = c;
                if (c == null) {
                    return null;
                }
            }
            JsonToken a = this.k.a(this.l);
            this.P = a;
            if (a == JsonToken.FIELD_NAME) {
                Object V = V();
                this.n.c(V instanceof String ? (String) V : V.toString());
            } else if (a == JsonToken.START_OBJECT) {
                this.n = this.n.n();
            } else if (a == JsonToken.START_ARRAY) {
                this.n = this.n.o();
            } else if (a == JsonToken.END_OBJECT || a == JsonToken.END_ARRAY) {
                this.n = this.n.l();
            } else {
                this.n.m();
            }
            return this.P;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public String R() {
            a aVar;
            if (!this.b && (aVar = this.k) != null) {
                int i = this.l + 1;
                if (i < 16) {
                    JsonToken a = aVar.a(i);
                    JsonToken jsonToken = JsonToken.FIELD_NAME;
                    if (a == jsonToken) {
                        this.l = i;
                        this.P = jsonToken;
                        Object d = this.k.d(i);
                        String obj = d instanceof String ? (String) d : d.toString();
                        this.n.c(obj);
                        return obj;
                    }
                }
                if (Q() == JsonToken.FIELD_NAME) {
                    return l();
                }
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation G() {
            return k();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation k() {
            JsonLocation jsonLocation = this.g;
            return jsonLocation == null ? JsonLocation.d : jsonLocation;
        }

        @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
        public String l() {
            JsonToken jsonToken = this.P;
            if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
                return this.n.b().c();
            }
            return this.n.c();
        }

        @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
        public String A() {
            JsonToken jsonToken = this.P;
            if (jsonToken == JsonToken.VALUE_STRING || jsonToken == JsonToken.FIELD_NAME) {
                Object V = V();
                if (V instanceof String) {
                    return (String) V;
                }
                return C9537rU.c(V);
            } else if (jsonToken == null) {
                return null;
            } else {
                int i = AnonymousClass4.a[jsonToken.ordinal()];
                if (i == 7 || i == 8) {
                    return C9537rU.c(V());
                }
                return this.P.a();
            }
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public char[] B() {
            String A = A();
            if (A == null) {
                return null;
            }
            return A.toCharArray();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int D() {
            String A = A();
            if (A == null) {
                return 0;
            }
            return A.length();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean P() {
            if (this.P == JsonToken.VALUE_NUMBER_FLOAT) {
                Object V = V();
                if (V instanceof Double) {
                    Double d = (Double) V;
                    return d.isNaN() || d.isInfinite();
                } else if (V instanceof Float) {
                    Float f = (Float) V;
                    return f.isNaN() || f.isInfinite();
                } else {
                    return false;
                }
            }
            return false;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigInteger h() {
            Number y = y();
            if (y instanceof BigInteger) {
                return (BigInteger) y;
            }
            if (v() == JsonParser.NumberType.BIG_DECIMAL) {
                return ((BigDecimal) y).toBigInteger();
            }
            return BigInteger.valueOf(y.longValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigDecimal r() {
            Number y = y();
            if (y instanceof BigDecimal) {
                return (BigDecimal) y;
            }
            int i = AnonymousClass4.c[v().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new BigDecimal((BigInteger) y);
                }
                if (i != 5) {
                    return BigDecimal.valueOf(y.doubleValue());
                }
            }
            return BigDecimal.valueOf(y.longValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public double p() {
            return y().doubleValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public float s() {
            return y().floatValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int u() {
            Number y = this.P == JsonToken.VALUE_NUMBER_INT ? (Number) V() : y();
            if ((y instanceof Integer) || b(y)) {
                return y.intValue();
            }
            return e(y);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public long w() {
            Number y = this.P == JsonToken.VALUE_NUMBER_INT ? (Number) V() : y();
            if ((y instanceof Long) || c(y)) {
                return y.longValue();
            }
            return a(y);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonParser.NumberType v() {
            Number y = y();
            if (y instanceof Integer) {
                return JsonParser.NumberType.INT;
            }
            if (y instanceof Long) {
                return JsonParser.NumberType.LONG;
            }
            if (y instanceof Double) {
                return JsonParser.NumberType.DOUBLE;
            }
            if (y instanceof BigDecimal) {
                return JsonParser.NumberType.BIG_DECIMAL;
            }
            if (y instanceof BigInteger) {
                return JsonParser.NumberType.BIG_INTEGER;
            }
            if (y instanceof Float) {
                return JsonParser.NumberType.FLOAT;
            }
            if (y instanceof Short) {
                return JsonParser.NumberType.INT;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Number y() {
            W();
            Object V = V();
            if (V instanceof Number) {
                return (Number) V;
            }
            if (V instanceof String) {
                String str = (String) V;
                if (str.indexOf(46) >= 0) {
                    return Double.valueOf(Double.parseDouble(str));
                }
                return Long.valueOf(Long.parseLong(str));
            } else if (V == null) {
                return null;
            } else {
                throw new IllegalStateException("Internal error: entry should be a Number, but is of type " + V.getClass().getName());
            }
        }

        private final boolean b(Number number) {
            return (number instanceof Short) || (number instanceof Byte);
        }

        private final boolean c(Number number) {
            return (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }

        protected int e(Number number) {
            if (number instanceof Long) {
                long longValue = number.longValue();
                int i = (int) longValue;
                if (i != longValue) {
                    at();
                }
                return i;
            }
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (AbstractC9384oa.f13890J.compareTo(bigInteger) > 0 || AbstractC9384oa.L.compareTo(bigInteger) < 0) {
                    at();
                }
            } else if ((number instanceof Double) || (number instanceof Float)) {
                double doubleValue = number.doubleValue();
                if (doubleValue < -2.147483648E9d || doubleValue > 2.147483647E9d) {
                    at();
                }
                return (int) doubleValue;
            } else if (number instanceof BigDecimal) {
                BigDecimal bigDecimal = (BigDecimal) number;
                if (AbstractC9384oa.M.compareTo(bigDecimal) > 0 || AbstractC9384oa.H.compareTo(bigDecimal) < 0) {
                    at();
                }
            } else {
                au();
            }
            return number.intValue();
        }

        protected long a(Number number) {
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (AbstractC9384oa.O.compareTo(bigInteger) > 0 || AbstractC9384oa.N.compareTo(bigInteger) < 0) {
                    aw();
                }
            } else if ((number instanceof Double) || (number instanceof Float)) {
                double doubleValue = number.doubleValue();
                if (doubleValue < -9.223372036854776E18d || doubleValue > 9.223372036854776E18d) {
                    aw();
                }
                return (long) doubleValue;
            } else if (number instanceof BigDecimal) {
                BigDecimal bigDecimal = (BigDecimal) number;
                if (AbstractC9384oa.K.compareTo(bigDecimal) > 0 || AbstractC9384oa.E.compareTo(bigDecimal) < 0) {
                    aw();
                }
            } else {
                au();
            }
            return number.longValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object q() {
            if (this.P == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return V();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public byte[] e(Base64Variant base64Variant) {
            if (this.P == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object V = V();
                if (V instanceof byte[]) {
                    return (byte[]) V;
                }
            }
            if (this.P != JsonToken.VALUE_STRING) {
                throw d("Current token (" + this.P + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            }
            String A = A();
            if (A == null) {
                return null;
            }
            C9439pc c9439pc = this.d;
            if (c9439pc == null) {
                c9439pc = new C9439pc(100);
                this.d = c9439pc;
            } else {
                c9439pc.c();
            }
            a(A, c9439pc, base64Variant);
            return c9439pc.i();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int e(Base64Variant base64Variant, OutputStream outputStream) {
            byte[] e = e(base64Variant);
            if (e != null) {
                outputStream.write(e, 0, e.length);
                return e.length;
            }
            return 0;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object F() {
            return this.k.g(this.l);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object x() {
            return this.k.b(this.l);
        }

        protected final Object V() {
            return this.k.d(this.l);
        }

        protected final void W() {
            JsonToken jsonToken = this.P;
            if (jsonToken == null || !jsonToken.e()) {
                throw d("Current token (" + this.P + ") not numeric, cannot use numeric value accessors");
            }
        }

        @Override // o.AbstractC9384oa
        public void ae() {
            au();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o.rZ$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private static final JsonToken[] a;
        protected final Object[] b = new Object[16];
        protected TreeMap<Integer, Object> c;
        protected a d;
        protected long e;

        private final int c(int i) {
            return i + i + 1;
        }

        private final int e(int i) {
            return i + i;
        }

        public a c() {
            return this.d;
        }

        public boolean d() {
            return this.c != null;
        }

        static {
            JsonToken[] jsonTokenArr = new JsonToken[16];
            a = jsonTokenArr;
            JsonToken[] values = JsonToken.values();
            System.arraycopy(values, 1, jsonTokenArr, 1, Math.min(15, values.length - 1));
        }

        public JsonToken a(int i) {
            long j = this.e;
            if (i > 0) {
                j >>= i << 2;
            }
            return a[((int) j) & 15];
        }

        public Object d(int i) {
            return this.b[i];
        }

        public a d(int i, JsonToken jsonToken) {
            if (i < 16) {
                b(i, jsonToken);
                return null;
            }
            a aVar = new a();
            this.d = aVar;
            aVar.b(0, jsonToken);
            return this.d;
        }

        public a c(int i, JsonToken jsonToken, Object obj, Object obj2) {
            if (i < 16) {
                d(i, jsonToken, obj, obj2);
                return null;
            }
            a aVar = new a();
            this.d = aVar;
            aVar.d(0, jsonToken, obj, obj2);
            return this.d;
        }

        public a d(int i, JsonToken jsonToken, Object obj) {
            if (i < 16) {
                c(i, jsonToken, obj);
                return null;
            }
            a aVar = new a();
            this.d = aVar;
            aVar.c(0, jsonToken, obj);
            return this.d;
        }

        public a b(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            if (i < 16) {
                a(i, jsonToken, obj, obj2, obj3);
                return null;
            }
            a aVar = new a();
            this.d = aVar;
            aVar.a(0, jsonToken, obj, obj2, obj3);
            return this.d;
        }

        private void b(int i, JsonToken jsonToken) {
            long ordinal = jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.e |= ordinal;
        }

        private void d(int i, JsonToken jsonToken, Object obj, Object obj2) {
            long ordinal = jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.e = ordinal | this.e;
            a(i, obj, obj2);
        }

        private void c(int i, JsonToken jsonToken, Object obj) {
            this.b[i] = obj;
            long ordinal = jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.e |= ordinal;
        }

        private void a(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            this.b[i] = obj;
            long ordinal = jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.e = ordinal | this.e;
            a(i, obj2, obj3);
        }

        private final void a(int i, Object obj, Object obj2) {
            if (this.c == null) {
                this.c = new TreeMap<>();
            }
            if (obj != null) {
                this.c.put(Integer.valueOf(c(i)), obj);
            }
            if (obj2 != null) {
                this.c.put(Integer.valueOf(e(i)), obj2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object b(int i) {
            TreeMap<Integer, Object> treeMap = this.c;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(c(i)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object g(int i) {
            TreeMap<Integer, Object> treeMap = this.c;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(e(i)));
        }
    }
}
