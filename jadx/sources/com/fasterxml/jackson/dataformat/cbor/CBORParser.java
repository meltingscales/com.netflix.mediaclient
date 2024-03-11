package com.fasterxml.jackson.dataformat.cbor;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.netflix.ale.AleCryptoBouncyCastle;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import o.AbstractC9384oa;
import o.C9366oI;
import o.C9377oT;
import o.C9389of;
import o.C9398oo;
import o.C9439pc;
import o.C9443pg;
import o.C9591sc;
import o.C9599sk;
import o.InterfaceC9321nQ;
import org.chromium.net.ConnectionSubtype;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes2.dex */
public class CBORParser extends AbstractC9384oa {
    private static final BigInteger ad;
    static final BigDecimal b;
    static final BigDecimal d;
    static final BigInteger f;
    static final BigInteger g;
    static final BigDecimal h;
    static final BigDecimal i;
    static final BigInteger j;
    static final BigInteger l;
    protected BigDecimal A;
    protected double B;
    protected BigInteger C;
    protected float D;
    protected long F;
    protected ObjectCodec G;
    protected int I;
    protected int[] T;
    protected int U;
    protected int V;
    protected int W;
    protected C9599sk X;
    protected boolean Y;
    protected int Z;
    protected int aa;
    protected final C9377oT ab;
    protected final C9443pg ac;
    protected int ae;
    protected long af;
    protected int ag;
    private int aj;
    private int al;
    protected boolean k;
    protected byte[] m;
    protected C9439pc n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f13116o;
    protected long p;
    protected int q;
    protected int r;
    protected byte[] s;
    protected int t;
    protected char[] u;
    protected InputStream v;
    protected final C9389of w;
    protected int x;
    protected boolean y;
    protected int z;
    private static final Charset am = Charset.forName("UTF-8");
    private static final int[] ai = C9591sc.c;
    private static final double ah = Math.pow(2.0d, 10.0d);
    private static final double ak = Math.pow(2.0d, -14.0d);

    private static final long e(int i2, int i3) {
        return (i2 << 32) + ((i3 << 32) >>> 32);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int H() {
        return 0;
    }

    public int am() {
        return this.aa;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* renamed from: ar */
    public C9599sk z() {
        return this.X;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec n() {
        return this.G;
    }

    /* loaded from: classes2.dex */
    public enum Feature implements InterfaceC9321nQ {
        ;
        
        final int b;
        final boolean d;

        @Override // o.InterfaceC9383oZ
        public int a() {
            return this.b;
        }

        @Override // o.InterfaceC9383oZ
        public boolean b() {
            return this.d;
        }

        public static int d() {
            Feature[] values;
            int i = 0;
            for (Feature feature : values()) {
                if (feature.b()) {
                    i |= feature.a();
                }
            }
            return i;
        }
    }

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        g = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        j = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        l = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        f = valueOf4;
        h = new BigDecimal(valueOf3);
        b = new BigDecimal(valueOf4);
        i = new BigDecimal(valueOf);
        d = new BigDecimal(valueOf2);
        ad = BigInteger.ONE.shiftLeft(63);
    }

    public CBORParser(C9389of c9389of, int i2, int i3, ObjectCodec objectCodec, C9377oT c9377oT, InputStream inputStream, byte[] bArr, int i4, int i5, boolean z) {
        super(i2);
        this.p = 0L;
        this.q = 1;
        this.t = 0;
        this.af = 0L;
        this.ae = 1;
        this.Z = 0;
        this.u = null;
        this.y = false;
        this.n = null;
        this.aa = -1;
        this.Y = false;
        this.T = AbstractC9384oa.R;
        this.z = 0;
        this.w = c9389of;
        this.G = objectCodec;
        this.ab = c9377oT;
        this.v = inputStream;
        this.s = bArr;
        this.x = i4;
        this.r = i5;
        this.k = z;
        this.ac = c9389of.h();
        this.X = C9599sk.e(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.e(i2) ? C9366oI.b(this) : null);
        this.ae = -1;
        this.Z = -1;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation G() {
        Object j2 = this.w.j();
        long j3 = this.af;
        return new JsonLocation(j2, j3, -1L, -1, (int) j3);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation k() {
        long j2 = this.p + this.x;
        return new JsonLocation(this.w.j(), j2, -1L, -1, (int) j2);
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public String l() {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            return this.X.b().c();
        }
        return this.X.c();
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f13116o) {
            return;
        }
        this.f13116o = true;
        this.ab.a();
        try {
            W();
        } finally {
            Z();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean M() {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.ac.o();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.y;
        }
        return false;
    }

    protected void Z() {
        byte[] bArr;
        if (this.k && (bArr = this.s) != null) {
            this.s = null;
            this.w.c(bArr);
        }
        this.ac.m();
        char[] cArr = this.u;
        if (cArr != null) {
            this.u = null;
            this.w.a(cArr);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public JsonToken Q() {
        this.z = 0;
        if (this.Y) {
            af();
        }
        this.af = this.p + this.x;
        this.m = null;
        if (this.X.g()) {
            if (this.P != JsonToken.FIELD_NAME) {
                this.aa = -1;
                if (!this.X.m()) {
                    this.X = this.X.b();
                    JsonToken jsonToken = JsonToken.END_OBJECT;
                    this.P = jsonToken;
                    return jsonToken;
                }
                JsonToken V = V();
                this.P = V;
                return V;
            }
        } else if (!this.X.m()) {
            this.aa = -1;
            this.X = this.X.b();
            JsonToken jsonToken2 = JsonToken.END_ARRAY;
            this.P = jsonToken2;
            return jsonToken2;
        }
        if (this.x >= this.r && !an()) {
            return ab();
        }
        byte[] bArr = this.s;
        int i2 = this.x;
        this.x = i2 + 1;
        byte b2 = bArr[i2];
        int i3 = (b2 >> 5) & 7;
        if (i3 == 6) {
            this.aa = Integer.valueOf(x(b2 & 31)).intValue();
            if (this.x >= this.r && !an()) {
                return ab();
            }
            byte[] bArr2 = this.s;
            int i4 = this.x;
            this.x = i4 + 1;
            b2 = bArr2[i4];
            i3 = (b2 >> 5) & 7;
        } else {
            this.aa = -1;
        }
        int i5 = b2 & 31;
        switch (i3) {
            case 0:
                this.z = 1;
                if (i5 <= 23) {
                    this.I = i5;
                } else {
                    int i6 = i5 - 24;
                    if (i6 == 0) {
                        this.I = ax();
                    } else if (i6 == 1) {
                        this.I = aq();
                    } else if (i6 == 2) {
                        int ap = ap();
                        if (ap >= 0) {
                            this.I = ap;
                        } else {
                            this.F = ap & 4294967295L;
                            this.z = 2;
                        }
                    } else if (i6 == 3) {
                        long as = as();
                        if (as >= 0) {
                            this.F = as;
                            this.z = 2;
                        } else {
                            this.C = c(as);
                            this.z = 4;
                        }
                    } else {
                        n(b2);
                    }
                }
                JsonToken jsonToken3 = JsonToken.VALUE_NUMBER_INT;
                this.P = jsonToken3;
                return jsonToken3;
            case 1:
                this.z = 1;
                if (i5 <= 23) {
                    this.I = (-i5) - 1;
                } else {
                    int i7 = i5 - 24;
                    if (i7 == 0) {
                        this.I = (-ax()) - 1;
                    } else if (i7 == 1) {
                        this.I = (-aq()) - 1;
                    } else if (i7 == 2) {
                        int ap2 = ap();
                        if (ap2 < 0) {
                            this.F = (-(ap2 & 4294967295L)) - 1;
                            this.z = 2;
                        } else {
                            this.I = (-ap2) - 1;
                        }
                    } else if (i7 == 3) {
                        long as2 = as();
                        if (as2 >= 0) {
                            this.F = (-as2) - 1;
                            this.z = 2;
                        } else {
                            this.C = a(as2);
                            this.z = 4;
                        }
                    } else {
                        n(b2);
                    }
                }
                JsonToken jsonToken4 = JsonToken.VALUE_NUMBER_INT;
                this.P = jsonToken4;
                return jsonToken4;
            case 2:
                this.ag = b2;
                this.Y = true;
                int i8 = this.aa;
                if (i8 >= 0) {
                    return k(i8);
                }
                JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
                this.P = jsonToken5;
                return jsonToken5;
            case 3:
                this.ag = b2;
                this.Y = true;
                JsonToken jsonToken6 = JsonToken.VALUE_STRING;
                this.P = jsonToken6;
                return jsonToken6;
            case 4:
                int u = u(i5);
                int i9 = this.aa;
                if (i9 >= 0) {
                    return b(i9, u);
                }
                this.X = this.X.e(u);
                JsonToken jsonToken7 = JsonToken.START_ARRAY;
                this.P = jsonToken7;
                return jsonToken7;
            case 5:
                this.P = JsonToken.START_OBJECT;
                this.X = this.X.c(u(i5));
                return this.P;
            case 6:
                f("Multiple tags not allowed per value (first tag: " + this.aa + ")");
                break;
        }
        switch (i5) {
            case 20:
                JsonToken jsonToken8 = JsonToken.VALUE_FALSE;
                this.P = jsonToken8;
                return jsonToken8;
            case 21:
                JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
                this.P = jsonToken9;
                return jsonToken9;
            case 22:
                JsonToken jsonToken10 = JsonToken.VALUE_NULL;
                this.P = jsonToken10;
                return jsonToken10;
            case 23:
                JsonToken ac = ac();
                this.P = ac;
                return ac;
            case 25:
                this.D = aA();
                this.z = 32;
                JsonToken jsonToken11 = JsonToken.VALUE_NUMBER_FLOAT;
                this.P = jsonToken11;
                return jsonToken11;
            case 26:
                this.D = Float.intBitsToFloat(ap());
                this.z = 32;
                JsonToken jsonToken12 = JsonToken.VALUE_NUMBER_FLOAT;
                this.P = jsonToken12;
                return jsonToken12;
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                this.B = Double.longBitsToDouble(as());
                this.z = 8;
                JsonToken jsonToken13 = JsonToken.VALUE_NUMBER_FLOAT;
                this.P = jsonToken13;
                return jsonToken13;
            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                if (this.X.h() && !this.X.o()) {
                    this.X = this.X.b();
                    JsonToken jsonToken14 = JsonToken.END_ARRAY;
                    this.P = jsonToken14;
                    return jsonToken14;
                }
                ah();
                break;
        }
        n(b2);
        return null;
    }

    protected String e(int i2, boolean z) {
        int i3 = i2 & 31;
        if (i3 > 23) {
            switch (i3) {
                case 24:
                    i3 = ax();
                    break;
                case 25:
                    i3 = aq();
                    break;
                case 26:
                    i3 = ap();
                    break;
                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                    long as = as();
                    if (z) {
                        as = (-as) - 1;
                    }
                    return String.valueOf(as);
                default:
                    throw d("Invalid length indicator for ints (" + i3 + "), token 0x" + Integer.toHexString(i2));
            }
        }
        if (z) {
            i3 = (-i3) - 1;
        }
        return String.valueOf(i3);
    }

    protected JsonToken k(int i2) {
        boolean z;
        if (i2 == 2) {
            z = false;
        } else if (i2 != 3) {
            JsonToken jsonToken = JsonToken.VALUE_EMBEDDED_OBJECT;
            this.P = jsonToken;
            return jsonToken;
        } else {
            z = true;
        }
        Y();
        BigInteger bigInteger = new BigInteger(this.m);
        if (z) {
            bigInteger = bigInteger.negate();
        }
        this.C = bigInteger;
        this.z = 4;
        this.aa = -1;
        JsonToken jsonToken2 = JsonToken.VALUE_NUMBER_INT;
        this.P = jsonToken2;
        return jsonToken2;
    }

    protected JsonToken b(int i2, int i3) {
        BigDecimal valueOf;
        this.X = this.X.e(i3);
        if (i2 != 4) {
            JsonToken jsonToken = JsonToken.START_ARRAY;
            this.P = jsonToken;
            return jsonToken;
        }
        this.P = JsonToken.START_ARRAY;
        if (i3 != 2) {
            f("Unexpected array size (" + i3 + ") for tagged 'bigfloat' value; should have exactly 2 number elements");
        }
        if (!g("bigfloat")) {
            f("Unexpected token (" + f() + ") as the first part of 'bigfloat' value: should get VALUE_NUMBER_INT");
        }
        int i4 = -u();
        if (!g("bigfloat")) {
            f("Unexpected token (" + f() + ") as the second part of 'bigfloat' value: should get VALUE_NUMBER_INT");
        }
        if (v() == JsonParser.NumberType.BIG_INTEGER) {
            valueOf = new BigDecimal(h(), i4);
        } else {
            valueOf = BigDecimal.valueOf(w(), i4);
        }
        if (!U()) {
            f("Unexpected token (" + f() + ") after 2 elements of 'bigfloat' value");
        }
        this.A = valueOf;
        this.z = 16;
        JsonToken jsonToken2 = JsonToken.VALUE_NUMBER_FLOAT;
        this.P = jsonToken2;
        return jsonToken2;
    }

    protected final boolean g(String str) {
        int i2 = -1;
        if (!this.X.m()) {
            this.aa = -1;
            this.X = this.X.b();
            this.P = JsonToken.END_ARRAY;
            return false;
        } else if (this.x >= this.r && !an()) {
            ab();
            return false;
        } else {
            byte[] bArr = this.s;
            int i3 = this.x;
            this.x = i3 + 1;
            byte b2 = bArr[i3];
            int i4 = (b2 >> 5) & 7;
            if (i4 == 6) {
                i2 = x(b2 & 31);
                if (this.x >= this.r && !an()) {
                    ab();
                    return false;
                }
                byte[] bArr2 = this.s;
                int i5 = this.x;
                this.x = i5 + 1;
                b2 = bArr2[i5];
                i4 = (b2 >> 5) & 7;
            }
            int i6 = b2 & 31;
            if (i4 == 0) {
                this.z = 1;
                if (i6 <= 23) {
                    this.I = i6;
                } else {
                    int i7 = i6 - 24;
                    if (i7 == 0) {
                        this.I = ax();
                    } else if (i7 == 1) {
                        this.I = aq();
                    } else if (i7 == 2) {
                        int ap = ap();
                        if (ap >= 0) {
                            this.I = ap;
                        } else {
                            this.F = ap & 4294967295L;
                            this.z = 2;
                        }
                    } else if (i7 == 3) {
                        long as = as();
                        if (as >= 0) {
                            this.F = as;
                            this.z = 2;
                        } else {
                            this.C = c(as);
                            this.z = 4;
                        }
                    } else {
                        n(b2);
                    }
                }
                this.P = JsonToken.VALUE_NUMBER_INT;
                return true;
            } else if (i4 == 1) {
                this.z = 1;
                if (i6 <= 23) {
                    this.I = (-i6) - 1;
                } else {
                    int i8 = i6 - 24;
                    if (i8 == 0) {
                        this.I = (-ax()) - 1;
                    } else if (i8 == 1) {
                        this.I = (-aq()) - 1;
                    } else if (i8 == 2) {
                        int ap2 = ap();
                        if (ap2 < 0) {
                            this.F = (-(ap2 & 4294967295L)) - 1;
                            this.z = 2;
                        } else {
                            this.I = (-ap2) - 1;
                        }
                    } else if (i8 == 3) {
                        long as2 = as();
                        if (as2 >= 0) {
                            this.F = (-as2) - 1;
                            this.z = 2;
                        } else {
                            this.C = a(as2);
                            this.z = 4;
                        }
                    } else {
                        n(b2);
                    }
                }
                this.P = JsonToken.VALUE_NUMBER_INT;
                return true;
            } else {
                if (i4 != 2) {
                    if (i4 == 6) {
                        f("Multiple tags not allowed per value (first tag: " + i2 + ")");
                    }
                } else if (i2 >= 0) {
                    this.ag = b2;
                    this.Y = true;
                    JsonToken k = k(i2);
                    this.P = k;
                    return k == JsonToken.VALUE_NUMBER_INT;
                }
                this.x--;
                Q();
                return false;
            }
        }
    }

    protected final boolean U() {
        if (!this.X.m()) {
            this.aa = -1;
            this.X = this.X.b();
            this.P = JsonToken.END_ARRAY;
            return true;
        }
        byte[] bArr = this.s;
        int i2 = this.x;
        this.x = i2 + 1;
        byte b2 = bArr[i2];
        if (((b2 >> 5) & 7) == 6) {
            int x = x(b2 & 31);
            if (this.x >= this.r && !an()) {
                ab();
                return false;
            }
            byte[] bArr2 = this.s;
            int i3 = this.x;
            this.x = i3 + 1;
            if (((bArr2[i3] >> 5) & 7) == 6) {
                f("Multiple tags not allowed per value (first tag: " + x + ")");
            }
        }
        this.x--;
        return Q() == JsonToken.END_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String R() {
        String w;
        if (this.X.g()) {
            JsonToken jsonToken = this.P;
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (jsonToken != jsonToken2) {
                this.z = 0;
                if (this.Y) {
                    af();
                }
                this.af = this.p + this.x;
                this.m = null;
                this.aa = -1;
                if (!this.X.m()) {
                    this.X = this.X.b();
                    this.P = JsonToken.END_OBJECT;
                    return null;
                }
                if (this.x >= this.r) {
                    ao();
                }
                byte[] bArr = this.s;
                int i2 = this.x;
                this.x = i2 + 1;
                byte b2 = bArr[i2];
                if (((b2 >> 5) & 7) != 3) {
                    if (b2 == -1) {
                        if (!this.X.o()) {
                            this.X = this.X.b();
                            this.P = JsonToken.END_OBJECT;
                            return null;
                        }
                        ah();
                    }
                    f(b2);
                    this.P = jsonToken2;
                    return A();
                }
                int i3 = b2 & 31;
                if (i3 > 23) {
                    int u = u(i3);
                    if (u < 0) {
                        w = aB();
                    } else {
                        w = w(u);
                    }
                } else if (i3 == 0) {
                    w = "";
                } else {
                    String D = D(i3);
                    if (D != null) {
                        this.x += i3;
                        w = D;
                    } else {
                        w = e(i3, y(i3));
                    }
                }
                this.X.e(w);
                this.P = jsonToken2;
                return w;
            }
        }
        if (Q() == JsonToken.FIELD_NAME) {
            return l();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fasterxml.jackson.core.JsonParser
    public String S() {
        this.z = 0;
        if (this.Y) {
            af();
        }
        this.af = this.p + this.x;
        this.m = null;
        this.aa = -1;
        if (this.X.g()) {
            if (this.P != JsonToken.FIELD_NAME) {
                this.aa = -1;
                if (!this.X.m()) {
                    this.X = this.X.b();
                    this.P = JsonToken.END_OBJECT;
                    return null;
                }
                this.P = V();
                return null;
            }
        } else if (!this.X.m()) {
            this.aa = -1;
            this.X = this.X.b();
            this.P = JsonToken.END_ARRAY;
            return null;
        }
        if (this.x >= this.r && !an()) {
            ab();
            return null;
        }
        byte[] bArr = this.s;
        int i2 = this.x;
        this.x = i2 + 1;
        byte b2 = bArr[i2];
        int i3 = (b2 >> 5) & 7;
        if (i3 == 6) {
            this.aa = Integer.valueOf(x(b2 & 31)).intValue();
            if (this.x >= this.r && !an()) {
                ab();
                return null;
            }
            byte[] bArr2 = this.s;
            int i4 = this.x;
            this.x = i4 + 1;
            b2 = bArr2[i4];
            i3 = (b2 >> 5) & 7;
        } else {
            this.aa = -1;
        }
        int i5 = b2 & 31;
        switch (i3) {
            case 0:
                this.z = 1;
                if (i5 <= 23) {
                    this.I = i5;
                } else {
                    int i6 = i5 - 24;
                    if (i6 == 0) {
                        this.I = ax();
                    } else if (i6 == 1) {
                        this.I = aq();
                    } else if (i6 == 2) {
                        int ap = ap();
                        if (ap < 0) {
                            this.F = ap & 4294967295L;
                            this.z = 2;
                        } else {
                            this.I = ap;
                        }
                    } else if (i6 == 3) {
                        long as = as();
                        if (as >= 0) {
                            this.F = as;
                            this.z = 2;
                        } else {
                            this.C = c(as);
                            this.z = 4;
                        }
                    } else {
                        n(b2);
                    }
                }
                this.P = JsonToken.VALUE_NUMBER_INT;
                return null;
            case 1:
                this.z = 1;
                if (i5 <= 23) {
                    this.I = (-i5) - 1;
                } else {
                    int i7 = i5 - 24;
                    if (i7 == 0) {
                        this.I = (-ax()) - 1;
                    } else if (i7 == 1) {
                        this.I = (-aq()) - 1;
                    } else if (i7 == 2) {
                        int ap2 = ap();
                        if (ap2 < 0) {
                            this.F = (-(ap2 & 4294967295L)) - 1;
                            this.z = 2;
                        } else {
                            this.I = (-ap2) - 1;
                        }
                    } else if (i7 == 3) {
                        long as2 = as();
                        if (as2 >= 0) {
                            this.F = as2;
                            this.z = 2;
                        } else {
                            this.C = a(as2);
                            this.z = 4;
                        }
                    } else {
                        n(b2);
                    }
                }
                this.P = JsonToken.VALUE_NUMBER_INT;
                return null;
            case 2:
                this.ag = b2;
                this.Y = true;
                this.P = JsonToken.VALUE_EMBEDDED_OBJECT;
                return null;
            case 3:
                this.ag = b2;
                this.Y = true;
                this.P = JsonToken.VALUE_STRING;
                return h(b2);
            case 4:
                this.P = JsonToken.START_ARRAY;
                this.X = this.X.e(u(i5));
                return null;
            case 5:
                this.P = JsonToken.START_OBJECT;
                this.X = this.X.c(u(i5));
                return null;
            case 6:
                f("Multiple tags not allowed per value (first tag: " + this.aa + ")");
                break;
        }
        switch (i5) {
            case 20:
                this.P = JsonToken.VALUE_FALSE;
                return null;
            case 21:
                this.P = JsonToken.VALUE_TRUE;
                return null;
            case 22:
                this.P = JsonToken.VALUE_NULL;
                return null;
            case 23:
                this.P = ac();
                return null;
            case 25:
                this.D = aA();
                this.z = 32;
                this.P = JsonToken.VALUE_NUMBER_FLOAT;
                return null;
            case 26:
                this.D = Float.intBitsToFloat(ap());
                this.z = 32;
                this.P = JsonToken.VALUE_NUMBER_FLOAT;
                return null;
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                this.B = Double.longBitsToDouble(as());
                this.z = 8;
                this.P = JsonToken.VALUE_NUMBER_FLOAT;
                return null;
            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                if (this.X.h() && !this.X.o()) {
                    this.X = this.X.b();
                    this.P = JsonToken.END_ARRAY;
                    return null;
                }
                ah();
                break;
                break;
        }
        n(b2);
        if (Q() == JsonToken.VALUE_STRING) {
            return A();
        }
        return null;
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public String A() {
        JsonToken jsonToken = this.P;
        if (this.Y && jsonToken == JsonToken.VALUE_STRING) {
            return h(this.ag);
        }
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.ac.a();
        }
        if (jsonToken == null) {
            return null;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.X.c();
        }
        if (jsonToken.e()) {
            return y().toString();
        }
        return this.P.a();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] B() {
        if (this.P != null) {
            if (this.Y) {
                Y();
            }
            JsonToken jsonToken = this.P;
            if (jsonToken == JsonToken.VALUE_STRING) {
                return this.ac.h();
            }
            if (jsonToken == JsonToken.FIELD_NAME) {
                return this.X.c().toCharArray();
            }
            if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
                return y().toString().toCharArray();
            }
            return jsonToken.d();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int D() {
        if (this.P != null) {
            if (this.Y) {
                Y();
            }
            JsonToken jsonToken = this.P;
            if (jsonToken == JsonToken.VALUE_STRING) {
                return this.ac.l();
            }
            if (jsonToken == JsonToken.FIELD_NAME) {
                return this.X.c().length();
            }
            if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
                return y().toString().length();
            }
            return jsonToken.d().length;
        }
        return 0;
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public String L() {
        if (this.Y && this.P == JsonToken.VALUE_STRING) {
            return h(this.ag);
        }
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.ac.a();
        }
        if (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.b()) {
            return null;
        }
        return A();
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public String c(String str) {
        JsonToken jsonToken = this.P;
        return (jsonToken == JsonToken.VALUE_STRING || !(jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.b())) ? A() : str;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] e(Base64Variant base64Variant) {
        if (this.Y) {
            Y();
        }
        if (this.P != JsonToken.VALUE_EMBEDDED_OBJECT) {
            f("Current token (" + f() + ") not VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        return this.m;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object q() {
        if (this.Y) {
            Y();
        }
        if (this.P == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this.m;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int e(Base64Variant base64Variant, OutputStream outputStream) {
        if (this.P != JsonToken.VALUE_EMBEDDED_OBJECT) {
            f("Current token (" + f() + ") not VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        int i2 = 0;
        if (!this.Y) {
            byte[] bArr = this.m;
            if (bArr == null) {
                return 0;
            }
            int length = bArr.length;
            outputStream.write(bArr, 0, length);
            return length;
        }
        this.Y = false;
        int u = u(this.ag & 31);
        if (u >= 0) {
            return b(outputStream, u);
        }
        while (true) {
            int t = t(2);
            if (t < 0) {
                return i2;
            }
            i2 += b(outputStream, t);
        }
    }

    private int b(OutputStream outputStream, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            int i4 = this.r;
            int i5 = this.x;
            int i6 = i4 - i5;
            if (i5 >= i4) {
                ao();
                i6 = this.r - this.x;
            }
            int min = Math.min(i6, i3);
            outputStream.write(this.s, this.x, min);
            this.x += min;
            i3 -= min;
        }
        this.Y = false;
        return i2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean P() {
        if (this.P == JsonToken.VALUE_NUMBER_FLOAT) {
            int i2 = this.z;
            if ((i2 & 8) != 0) {
                double d2 = this.B;
                return Double.isNaN(d2) || Double.isInfinite(d2);
            } else if ((i2 & 32) != 0) {
                float f2 = this.D;
                return Float.isNaN(f2) || Float.isInfinite(f2);
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number y() {
        if (this.z == 0) {
            b(0);
        }
        if (this.P == JsonToken.VALUE_NUMBER_INT) {
            int i2 = this.z;
            if ((i2 & 1) != 0) {
                return Integer.valueOf(this.I);
            }
            if ((i2 & 2) != 0) {
                return Long.valueOf(this.F);
            }
            return (i2 & 4) != 0 ? this.C : this.A;
        }
        int i3 = this.z;
        if ((i3 & 16) != 0) {
            return this.A;
        }
        if ((i3 & 8) != 0) {
            return Double.valueOf(this.B);
        }
        if ((i3 & 32) == 0) {
            au();
        }
        return Float.valueOf(this.D);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType v() {
        if (this.z == 0) {
            b(0);
        }
        if (this.P == JsonToken.VALUE_NUMBER_INT) {
            int i2 = this.z;
            if ((i2 & 1) != 0) {
                return JsonParser.NumberType.INT;
            }
            if ((i2 & 2) != 0) {
                return JsonParser.NumberType.LONG;
            }
            return JsonParser.NumberType.BIG_INTEGER;
        }
        int i3 = this.z;
        if ((i3 & 16) != 0) {
            return JsonParser.NumberType.BIG_DECIMAL;
        }
        if ((i3 & 8) != 0) {
            return JsonParser.NumberType.DOUBLE;
        }
        return JsonParser.NumberType.FLOAT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int u() {
        int i2 = this.z;
        if ((i2 & 1) == 0) {
            if (i2 == 0) {
                b(1);
            }
            if ((this.z & 1) == 0) {
                ak();
            }
        }
        return this.I;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long w() {
        int i2 = this.z;
        if ((i2 & 2) == 0) {
            if (i2 == 0) {
                b(2);
            }
            if ((this.z & 2) == 0) {
                al();
            }
        }
        return this.F;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger h() {
        int i2 = this.z;
        if ((i2 & 4) == 0) {
            if (i2 == 0) {
                b(4);
            }
            if ((this.z & 4) == 0) {
                ad();
            }
        }
        return this.C;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float s() {
        int i2 = this.z;
        if ((i2 & 32) == 0) {
            if (i2 == 0) {
                b(32);
            }
            if ((this.z & 32) == 0) {
                aj();
            }
        }
        return this.D;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double p() {
        int i2 = this.z;
        if ((i2 & 8) == 0) {
            if (i2 == 0) {
                b(8);
            }
            if ((this.z & 8) == 0) {
                ai();
            }
        }
        return this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal r() {
        int i2 = this.z;
        if ((i2 & 16) == 0) {
            if (i2 == 0) {
                b(16);
            }
            if ((this.z & 16) == 0) {
                ag();
            }
        }
        return this.A;
    }

    protected void b(int i2) {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return;
        }
        f("Current token (" + f() + ") not numeric, can not use numeric value accessors");
    }

    protected void ak() {
        int i2 = this.z;
        if ((i2 & 2) != 0) {
            long j2 = this.F;
            int i3 = (int) j2;
            if (i3 != j2) {
                f("Numeric value (" + A() + ") out of range of int");
            }
            this.I = i3;
        } else if ((i2 & 4) != 0) {
            if (g.compareTo(this.C) > 0 || j.compareTo(this.C) < 0) {
                at();
            }
            this.I = this.C.intValue();
        } else if ((i2 & 8) != 0) {
            double d2 = this.B;
            if (d2 < -2.147483648E9d || d2 > 2.147483647E9d) {
                at();
            }
            this.I = (int) this.B;
        } else if ((i2 & 32) != 0) {
            double d3 = this.D;
            if (d3 < -2.147483648E9d || d3 > 2.147483647E9d) {
                at();
            }
            this.I = (int) this.D;
        } else if ((i2 & 16) != 0) {
            if (i.compareTo(this.A) > 0 || d.compareTo(this.A) < 0) {
                at();
            }
            this.I = this.A.intValue();
        } else {
            au();
        }
        this.z |= 1;
    }

    protected void al() {
        int i2 = this.z;
        if ((i2 & 1) != 0) {
            this.F = this.I;
        } else if ((i2 & 4) != 0) {
            if (l.compareTo(this.C) > 0 || f.compareTo(this.C) < 0) {
                aw();
            }
            this.F = this.C.longValue();
        } else if ((i2 & 8) != 0) {
            double d2 = this.B;
            if (d2 < -9.223372036854776E18d || d2 > 9.223372036854776E18d) {
                aw();
            }
            this.F = (long) this.B;
        } else if ((i2 & 32) != 0) {
            double d3 = this.D;
            if (d3 < -9.223372036854776E18d || d3 > 9.223372036854776E18d) {
                at();
            }
            this.F = this.D;
        } else if ((i2 & 16) != 0) {
            if (h.compareTo(this.A) > 0 || b.compareTo(this.A) < 0) {
                aw();
            }
            this.F = this.A.longValue();
        } else {
            au();
        }
        this.z |= 2;
    }

    protected void ad() {
        int i2 = this.z;
        if ((i2 & 16) != 0) {
            this.C = this.A.toBigInteger();
        } else if ((i2 & 2) != 0) {
            this.C = BigInteger.valueOf(this.F);
        } else if ((i2 & 1) != 0) {
            this.C = BigInteger.valueOf(this.I);
        } else if ((i2 & 8) != 0) {
            this.C = BigDecimal.valueOf(this.B).toBigInteger();
        } else if ((i2 & 32) != 0) {
            this.C = BigDecimal.valueOf(this.D).toBigInteger();
        } else {
            au();
        }
        this.z |= 4;
    }

    protected void aj() {
        float f2;
        int i2 = this.z;
        if ((i2 & 16) != 0) {
            this.D = this.A.floatValue();
        } else {
            if ((i2 & 4) != 0) {
                f2 = this.C.floatValue();
            } else if ((i2 & 8) != 0) {
                f2 = (float) this.B;
            } else if ((i2 & 2) != 0) {
                f2 = (float) this.F;
            } else if ((i2 & 1) != 0) {
                f2 = this.I;
            } else {
                au();
            }
            this.D = f2;
        }
        this.z |= 32;
    }

    protected void ai() {
        double d2;
        double d3;
        int i2 = this.z;
        if ((i2 & 16) != 0) {
            d3 = this.A.doubleValue();
        } else if ((i2 & 32) == 0) {
            if ((i2 & 4) != 0) {
                d2 = this.C.doubleValue();
            } else if ((i2 & 2) != 0) {
                d2 = this.F;
            } else if ((i2 & 1) == 0) {
                au();
                this.z |= 8;
            } else {
                d2 = this.I;
            }
            this.B = d2;
            this.z |= 8;
        } else {
            d3 = this.D;
        }
        this.B = d3;
        this.z |= 8;
    }

    protected void ag() {
        int i2 = this.z;
        if ((i2 & 40) != 0) {
            this.A = C9398oo.a(A());
        } else if ((i2 & 4) != 0) {
            this.A = new BigDecimal(this.C);
        } else if ((i2 & 2) != 0) {
            this.A = BigDecimal.valueOf(this.F);
        } else if ((i2 & 1) != 0) {
            this.A = BigDecimal.valueOf(this.I);
        } else {
            au();
        }
        this.z |= 16;
    }

    protected void Y() {
        this.Y = false;
        int i2 = this.ag;
        int i3 = (i2 >> 5) & 7;
        int i4 = i2 & 31;
        if (i3 != 3) {
            if (i3 == 2) {
                this.m = i(u(i4));
                return;
            }
            au();
        }
        int u = u(i4);
        if (u <= 0) {
            if (u < 0) {
                az();
                return;
            } else {
                this.ac.k();
                return;
            }
        }
        if (u > this.r - this.x) {
            if (u >= this.s.length) {
                A(u);
                return;
            }
            l(u);
        }
        C(u);
    }

    protected String h(int i2) {
        this.Y = false;
        if (((i2 >> 5) & 7) != 3) {
            au();
        }
        int u = u(i2 & 31);
        if (u <= 0) {
            if (u == 0) {
                this.ac.k();
                return "";
            }
            az();
            return this.ac.a();
        }
        if (u > this.r - this.x) {
            if (u >= this.s.length) {
                A(u);
                return this.ac.a();
            }
            l(u);
        }
        return C(u);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8 A[LOOP:1: B:14:0x002f->B:31:0x00c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String C(int r12) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.dataformat.cbor.CBORParser.C(int):java.lang.String");
    }

    private final void A(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        char[] e = this.ac.e();
        int[] iArr = ai;
        int length = e.length;
        int i7 = 0;
        while (true) {
            i2--;
            if (i2 >= 0) {
                int ay = ay();
                int i8 = ay & PrivateKeyType.INVALID;
                int i9 = iArr[i8];
                if (i9 != 0 || i7 >= length) {
                    i2 -= i9;
                    if (i2 < 0) {
                        throw d("Malformed UTF-8 character at end of long (non-chunked) text segment");
                    }
                    if (i9 != 0) {
                        if (i9 == 1) {
                            int ay2 = ay();
                            if ((ay2 & 192) != 128) {
                                a(ay2 & PrivateKeyType.INVALID, this.x);
                            }
                            int i10 = ay2 & 63;
                            i4 = i7;
                            i5 = (ay & 31) << 6;
                            i6 = i10;
                        } else if (i9 == 2) {
                            i8 = z(i8);
                        } else if (i9 == 3) {
                            int B = B(i8);
                            i4 = i7 + 1;
                            e[i7] = (char) ((B >> 10) | 55296);
                            if (i4 >= e.length) {
                                e = this.ac.d();
                                length = e.length;
                                i4 = 0;
                            }
                            i5 = B & 1023;
                            i6 = 56320;
                        } else {
                            m(i8);
                        }
                        int i11 = i4;
                        i8 = i5 | i6;
                        i7 = i11;
                    }
                    if (i7 >= length) {
                        e = this.ac.d();
                        length = e.length;
                        i7 = 0;
                    }
                    i3 = i7 + 1;
                    e[i7] = (char) i8;
                } else {
                    i3 = i7 + 1;
                    e[i7] = (char) i8;
                }
                i7 = i3;
            } else {
                this.ac.b(i7);
                return;
            }
        }
    }

    private final void az() {
        int i2;
        char[] e = this.ac.e();
        int[] iArr = ai;
        int length = e.length;
        byte[] bArr = this.s;
        this.al = this.x;
        this.aj = 0;
        int i3 = 0;
        while (true) {
            if (this.x >= this.al) {
                if (this.aj == 0) {
                    int t = t(3);
                    if (t < 0) {
                        this.ac.b(i3);
                        return;
                    }
                    this.aj = t;
                    int i4 = this.x + t;
                    int i5 = this.r;
                    if (i4 <= i5) {
                        this.aj = 0;
                        this.al = i4;
                    } else {
                        this.aj = i4 - i5;
                        this.al = i5;
                    }
                }
                if (this.x >= this.r) {
                    ao();
                    int i6 = this.x + this.aj;
                    int i7 = this.r;
                    if (i6 <= i7) {
                        this.aj = 0;
                        this.al = i6;
                    } else {
                        this.aj = i6 - i7;
                        this.al = i7;
                    }
                }
            }
            int i8 = this.x;
            this.x = i8 + 1;
            byte b2 = bArr[i8];
            int i9 = b2 & 255;
            int i10 = iArr[i9];
            if (i10 == 0 && i3 < length) {
                i2 = i3 + 1;
                e[i3] = (char) i9;
            } else {
                if (i10 != 0) {
                    if (i10 == 1) {
                        int aF = aF();
                        if ((aF & 192) != 128) {
                            a(aF & PrivateKeyType.INVALID, this.x);
                        }
                        i9 = (aF & 63) | ((b2 & 31) << 6);
                    } else if (i10 == 2) {
                        i9 = r(i9);
                    } else if (i10 == 3) {
                        int v = v(i9);
                        if (i3 >= e.length) {
                            e = this.ac.d();
                            length = e.length;
                            i3 = 0;
                        }
                        e[i3] = (char) ((v >> 10) | 55296);
                        i9 = 56320 | (v & 1023);
                        i3++;
                    } else {
                        m(i9);
                    }
                }
                if (i3 >= length) {
                    e = this.ac.d();
                    length = e.length;
                    i3 = 0;
                }
                i2 = i3 + 1;
                e[i3] = (char) i9;
            }
            i3 = i2;
        }
    }

    private final int ay() {
        int i2 = this.x;
        if (i2 < this.r) {
            byte b2 = this.s[i2];
            this.x = i2 + 1;
            return b2;
        }
        ao();
        byte[] bArr = this.s;
        int i3 = this.x;
        this.x = i3 + 1;
        return bArr[i3];
    }

    private final int aF() {
        int i2 = this.x;
        if (i2 >= this.al) {
            return aC();
        }
        byte b2 = this.s[i2];
        this.x = i2 + 1;
        return b2;
    }

    private final int aC() {
        if (this.x >= this.r) {
            ao();
            int i2 = this.aj;
            if (i2 > 0) {
                int i3 = this.x;
                int i4 = i2 + i3;
                int i5 = this.r;
                if (i4 <= i5) {
                    this.aj = 0;
                    this.al = i4;
                } else {
                    this.aj = i4 - i5;
                    this.al = i5;
                }
                byte[] bArr = this.s;
                this.x = i3 + 1;
                return bArr[i3];
            }
        }
        int t = t(3);
        if (t < 0) {
            e(": chunked Text ends with partial UTF-8 character", JsonToken.VALUE_STRING);
        }
        int i6 = this.x;
        int i7 = t + i6;
        int i8 = this.r;
        if (i7 <= i8) {
            this.aj = 0;
            this.al = i7;
        } else {
            this.aj = i7 - i8;
            this.al = i8;
        }
        byte[] bArr2 = this.s;
        this.x = i6 + 1;
        return bArr2[i6];
    }

    protected byte[] i(int i2) {
        if (i2 < 0) {
            C9439pc aa = aa();
            while (true) {
                if (this.x >= this.r) {
                    ao();
                }
                byte[] bArr = this.s;
                int i3 = this.x;
                this.x = i3 + 1;
                byte b2 = bArr[i3];
                int i4 = b2 & 255;
                if (i4 == 255) {
                    return aa.i();
                }
                int i5 = i4 >> 5;
                if (i5 != 2) {
                    throw d("Mismatched chunk in chunked content: expected 2 but encountered " + i5);
                }
                int u = u(b2 & 31);
                if (u < 0) {
                    throw d("Illegal chunked-length indicator within chunked-length value (type 2)");
                }
                while (u > 0) {
                    int i6 = this.r;
                    int i7 = this.x;
                    int i8 = i6 - i7;
                    if (i7 >= i6) {
                        ao();
                        i8 = this.r - this.x;
                    }
                    int min = Math.min(i8, u);
                    aa.write(this.s, this.x, min);
                    this.x += min;
                    u -= min;
                }
            }
        } else if (i2 == 0) {
            return AbstractC9384oa.Q;
        } else {
            byte[] bArr2 = new byte[i2];
            if (this.x >= this.r) {
                ao();
            }
            int i9 = 0;
            while (true) {
                int min2 = Math.min(i2, this.r - this.x);
                System.arraycopy(this.s, this.x, bArr2, i9, min2);
                this.x += min2;
                i9 += min2;
                i2 -= min2;
                if (i2 <= 0) {
                    return bArr2;
                }
                ao();
            }
        }
    }

    protected final JsonToken V() {
        String w;
        if (this.x >= this.r) {
            ao();
        }
        byte[] bArr = this.s;
        int i2 = this.x;
        this.x = i2 + 1;
        byte b2 = bArr[i2];
        if (((b2 >> 5) & 7) != 3) {
            if (b2 == -1) {
                if (!this.X.o()) {
                    this.X = this.X.b();
                    return JsonToken.END_OBJECT;
                }
                ah();
            }
            f(b2);
            return JsonToken.FIELD_NAME;
        }
        int i3 = b2 & 31;
        if (i3 > 23) {
            int u = u(i3);
            if (u < 0) {
                w = aB();
            } else {
                w = w(u);
            }
        } else if (i3 == 0) {
            w = "";
        } else {
            String D = D(i3);
            if (D != null) {
                this.x += i3;
                w = D;
            } else {
                w = e(i3, y(i3));
            }
        }
        this.X.e(w);
        return JsonToken.FIELD_NAME;
    }

    private final String y(int i2) {
        char[] e = this.ac.e();
        if (e.length < i2) {
            e = this.ac.e(i2);
        }
        int i3 = this.x;
        int i4 = i2 + i3;
        this.x = i4;
        int[] iArr = ai;
        byte[] bArr = this.s;
        int i5 = 0;
        while (true) {
            int i6 = bArr[i3] & 255;
            if (iArr[i6] == 0) {
                int i7 = i5 + 1;
                e[i5] = (char) i6;
                i3++;
                if (i3 == i4) {
                    return this.ac.d(i7);
                }
                i5 = i7;
            } else {
                while (i3 < i4) {
                    int i8 = i3 + 1;
                    byte b2 = bArr[i3];
                    int i9 = b2 & 255;
                    int i10 = iArr[i9];
                    if (i10 != 0) {
                        if (i10 == 1) {
                            i3 += 2;
                            i9 = ((b2 & 31) << 6) | (bArr[i8] & 63);
                        } else if (i10 == 2) {
                            int i11 = i3 + 3;
                            i9 = (bArr[i3 + 2] & 63) | ((bArr[i8] & 63) << 6) | ((b2 & 15) << 12);
                            i3 = i11;
                        } else if (i10 == 3) {
                            byte b3 = bArr[i8];
                            int i12 = i3 + 4;
                            int i13 = ((bArr[i3 + 3] & 63) | ((((b3 & 63) << 12) | ((b2 & 7) << 18)) | ((bArr[i3 + 2] & 63) << 6))) - AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
                            e[i5] = (char) ((i13 >> 10) | 55296);
                            i9 = (i13 & 1023) | 56320;
                            i5++;
                            i3 = i12;
                        } else {
                            f("Invalid byte " + Integer.toHexString(i9) + " in Object name");
                        }
                        e[i5] = (char) i9;
                        i5++;
                    }
                    i3 = i8;
                    e[i5] = (char) i9;
                    i5++;
                }
                return this.ac.d(i5);
            }
        }
    }

    private final String w(int i2) {
        if (this.r - this.x < i2) {
            if (i2 >= this.s.length) {
                A(i2);
                return this.ac.a();
            }
            l(i2);
        }
        String D = D(i2);
        if (D != null) {
            this.x += i2;
            return D;
        }
        return e(i2, y(i2));
    }

    private final String aB() {
        az();
        return this.ac.a();
    }

    protected final void f(int i2) {
        String str;
        int i3 = (i2 >> 5) & 7;
        if (i3 == 0) {
            str = e(i2, false);
        } else if (i3 == 1) {
            str = e(i2, true);
        } else if (i3 == 2) {
            str = new String(i(u(i2 & 31)), am);
        } else {
            if ((i2 & PrivateKeyType.INVALID) == 255) {
                ah();
            }
            throw d("Unsupported major type (" + i3 + ") for CBOR Objects, not (yet?) supported, only Strings");
        }
        this.X.e(str);
    }

    private final String D(int i2) {
        if (this.r - this.x < i2) {
            l(i2);
        }
        if (i2 < 5) {
            int i3 = this.x;
            byte[] bArr = this.s;
            int i4 = bArr[i3] & 255;
            if (i2 > 1) {
                i4 = (i4 << 8) + (bArr[i3 + 1] & 255);
                if (i2 > 2) {
                    i4 = (i4 << 8) + (bArr[i3 + 2] & 255);
                    if (i2 > 3) {
                        i4 = (i4 << 8) + (bArr[i3 + 3] & 255);
                    }
                }
            }
            this.V = i4;
            return this.ab.c(i4);
        }
        byte[] bArr2 = this.s;
        int i5 = this.x;
        byte b2 = bArr2[i5];
        int i6 = i5 + 4;
        int i7 = (b2 & 255) << 8;
        int i8 = ((((i7 | (bArr2[i5 + 1] & 255)) << 8) | (bArr2[i5 + 2] & 255)) << 8) | (bArr2[i5 + 3] & 255);
        if (i2 < 9) {
            int i9 = bArr2[i6] & 255;
            int i10 = i2 - 5;
            if (i10 > 0) {
                i9 = (bArr2[i5 + 5] & 255) + (i9 << 8);
                if (i10 > 1) {
                    i9 = (i9 << 8) + (bArr2[i5 + 6] & 255);
                    if (i10 > 2) {
                        i9 = (i9 << 8) + (bArr2[i5 + 7] & 255);
                    }
                }
            }
            this.V = i8;
            this.W = i9;
            return this.ab.e(i8, i9);
        }
        byte b3 = bArr2[i6];
        int i11 = (b3 & 255) << 8;
        int i12 = ((((i11 | (bArr2[i5 + 5] & 255)) << 8) | (bArr2[i5 + 6] & 255)) << 8) | (bArr2[i5 + 7] & 255);
        if (i2 < 13) {
            int i13 = bArr2[i5 + 8] & 255;
            int i14 = i2 - 9;
            if (i14 > 0) {
                i13 = (bArr2[i5 + 9] & 255) + (i13 << 8);
                if (i14 > 1) {
                    i13 = (i13 << 8) + (bArr2[i5 + 10] & 255);
                    if (i14 > 2) {
                        i13 = (i13 << 8) + (bArr2[i5 + 11] & 255);
                    }
                }
            }
            this.V = i8;
            this.W = i12;
            this.U = i13;
            return this.ab.e(i8, i12, i13);
        }
        return e(i2, i8, i12);
    }

    private final String e(int i2, int i3, int i4) {
        int i5;
        int[] iArr;
        int i6;
        int i7 = (i2 + 3) >> 2;
        int[] iArr2 = this.T;
        if (i7 > iArr2.length) {
            this.T = b(iArr2, i7);
        }
        int[] iArr3 = this.T;
        iArr3[0] = i3;
        iArr3[1] = i4;
        int i8 = this.x + 8;
        int i9 = i2 - 8;
        byte[] bArr = this.s;
        int i10 = 2;
        while (true) {
            byte b2 = bArr[i8];
            byte b3 = bArr[i8 + 1];
            byte b4 = bArr[i8 + 2];
            i5 = i8 + 4;
            byte b5 = bArr[i8 + 3];
            iArr = this.T;
            i6 = i10 + 1;
            iArr[i10] = ((((((b2 & 255) << 8) | (b3 & 255)) << 8) | (b4 & 255)) << 8) | (b5 & 255);
            i9 -= 4;
            if (i9 <= 3) {
                break;
            }
            i8 = i5;
            i10 = i6;
        }
        if (i9 > 0) {
            int i11 = bArr[i5] & 255;
            if (i9 > 1) {
                i11 = (i11 << 8) + (bArr[i8 + 5] & 255);
                if (i9 > 2) {
                    i11 = (i11 << 8) + (bArr[i8 + 6] & 255);
                }
            }
            iArr[i6] = i11;
            i6 = i10 + 2;
        }
        return this.ab.d(iArr, i6);
    }

    private final String e(int i2, String str) {
        if (i2 < 5) {
            return this.ab.d(str, this.V);
        }
        if (i2 < 9) {
            return this.ab.a(str, this.V, this.W);
        }
        if (i2 < 13) {
            return this.ab.e(str, this.V, this.W, this.U);
        }
        return this.ab.c(str, this.T, (i2 + 3) >> 2);
    }

    private static int[] b(int[] iArr, int i2) {
        return Arrays.copyOf(iArr, i2 + 4);
    }

    protected void af() {
        this.Y = false;
        int i2 = (this.ag >> 5) & 7;
        if (i2 != 3 && i2 == 3) {
            au();
        }
        int i3 = this.ag;
        int i4 = i3 & 31;
        if (i4 <= 23) {
            if (i4 > 0) {
                p(i4);
            }
        } else if (i4 != 31) {
            switch (i4) {
                case 24:
                    p(ax());
                    return;
                case 25:
                    p(aq());
                    return;
                case 26:
                    p(ap());
                    return;
                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                    b(as());
                    return;
                default:
                    n(i3);
                    return;
            }
        } else {
            q(i2);
        }
    }

    protected void q(int i2) {
        while (true) {
            if (this.x >= this.r) {
                ao();
            }
            byte[] bArr = this.s;
            int i3 = this.x;
            this.x = i3 + 1;
            byte b2 = bArr[i3];
            int i4 = b2 & 255;
            if (i4 == 255) {
                return;
            }
            int i5 = i4 >> 5;
            if (i5 != i2) {
                throw d("Mismatched chunk in chunked content: expected " + i2 + " but encountered " + i5);
            }
            int i6 = b2 & 31;
            if (i6 <= 23) {
                if (i6 > 0) {
                    p(i6);
                }
            } else if (i6 != 31) {
                switch (i6) {
                    case 24:
                        p(ax());
                        continue;
                    case 25:
                        p(aq());
                        continue;
                    case 26:
                        p(ap());
                        continue;
                    case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                        b(as());
                        continue;
                    default:
                        n(this.ag);
                        continue;
                }
            } else {
                throw d("Illegal chunked-length indicator within chunked-length value (type " + i2 + ")");
            }
        }
    }

    protected void b(long j2) {
        while (j2 > 2147483647L) {
            p(Integer.MAX_VALUE);
            j2 -= 2147483647L;
        }
        p((int) j2);
    }

    protected void p(int i2) {
        while (true) {
            int min = Math.min(i2, this.r - this.x);
            this.x += min;
            i2 -= min;
            if (i2 <= 0) {
                return;
            }
            ao();
        }
    }

    private final int x(int i2) {
        if (i2 <= 23) {
            return i2;
        }
        int i3 = i2 - 24;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        long as = as();
                        if (as < -2147483648L || as > 2147483647L) {
                            f("Illegal Tag value: " + as);
                        }
                        return (int) as;
                    }
                    throw d("Invalid low bits for Tag token: 0x" + Integer.toHexString(i2));
                }
                return ap();
            }
            return aq();
        }
        return ax();
    }

    private final int u(int i2) {
        if (i2 == 31) {
            return -1;
        }
        if (i2 <= 23) {
            return i2;
        }
        int i3 = i2 - 24;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        long as = as();
                        if (as < 0 || as > 2147483647L) {
                            throw d("Illegal length for " + f() + ": " + as);
                        }
                        return (int) as;
                    }
                    throw d("Invalid length for " + f() + ": 0x" + Integer.toHexString(i2));
                }
                return ap();
            }
            return aq();
        }
        return ax();
    }

    private int t(int i2) {
        if (this.x >= this.r) {
            ao();
        }
        byte[] bArr = this.s;
        int i3 = this.x;
        this.x = i3 + 1;
        byte b2 = bArr[i3];
        int i4 = b2 & 255;
        if (i4 == 255) {
            return -1;
        }
        int i5 = i4 >> 5;
        if (i5 != i2) {
            throw d("Mismatched chunk in chunked content: expected " + i2 + " but encountered " + i5 + " (byte 0x" + Integer.toHexString(i4) + ")");
        }
        int u = u(b2 & 31);
        if (u >= 0) {
            return u;
        }
        throw d("Illegal chunked-length indicator within chunked-length value (type " + i2 + ")");
    }

    private float aA() {
        int aq = aq();
        int i2 = 65535 & aq;
        boolean z = (i2 >> 15) != 0;
        int i3 = (i2 >> 10) & 31;
        int i4 = aq & 1023;
        if (i3 == 0) {
            float f2 = (float) (ak * (i4 / ah));
            return z ? -f2 : f2;
        } else if (i3 != 31) {
            float pow = (float) (Math.pow(2.0d, i3 - 15) * ((i4 / ah) + 1.0d));
            return z ? -pow : pow;
        } else if (i4 != 0) {
            return Float.NaN;
        } else {
            return z ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
        }
    }

    private final int ax() {
        if (this.x >= this.r) {
            ao();
        }
        byte[] bArr = this.s;
        int i2 = this.x;
        this.x = i2 + 1;
        return bArr[i2] & 255;
    }

    private final int aq() {
        int i2 = this.x;
        int i3 = i2 + 1;
        if (i3 >= this.r) {
            return aE();
        }
        byte[] bArr = this.s;
        byte b2 = bArr[i2];
        byte b3 = bArr[i3];
        this.x = i2 + 2;
        return ((b2 & 255) << 8) + (b3 & 255);
    }

    private final int aE() {
        if (this.x >= this.r) {
            ao();
        }
        byte[] bArr = this.s;
        int i2 = this.x;
        int i3 = i2 + 1;
        this.x = i3;
        byte b2 = bArr[i2];
        if (i3 >= this.r) {
            ao();
        }
        byte[] bArr2 = this.s;
        int i4 = this.x;
        this.x = i4 + 1;
        return ((b2 & 255) << 8) + (bArr2[i4] & 255);
    }

    private final int ap() {
        int i2 = this.x;
        int i3 = i2 + 3;
        if (i3 >= this.r) {
            return aG();
        }
        byte[] bArr = this.s;
        byte b2 = bArr[i2];
        byte b3 = bArr[i2 + 1];
        byte b4 = bArr[i2 + 2];
        byte b5 = bArr[i3];
        this.x = i2 + 4;
        return (b2 << 24) + ((b3 & 255) << 16) + ((b4 & 255) << 8) + (b5 & 255);
    }

    private final int aG() {
        if (this.x >= this.r) {
            ao();
        }
        byte[] bArr = this.s;
        int i2 = this.x;
        int i3 = i2 + 1;
        this.x = i3;
        byte b2 = bArr[i2];
        if (i3 >= this.r) {
            ao();
        }
        byte[] bArr2 = this.s;
        int i4 = this.x;
        int i5 = i4 + 1;
        this.x = i5;
        byte b3 = bArr2[i4];
        if (i5 >= this.r) {
            ao();
        }
        byte[] bArr3 = this.s;
        int i6 = this.x;
        int i7 = i6 + 1;
        this.x = i7;
        byte b4 = bArr3[i6];
        if (i7 >= this.r) {
            ao();
        }
        byte[] bArr4 = this.s;
        int i8 = this.x;
        this.x = i8 + 1;
        return (((((b2 << 8) + (b3 & 255)) << 8) + (b4 & 255)) << 8) + (bArr4[i8] & 255);
    }

    private final long as() {
        int i2 = this.x;
        int i3 = i2 + 7;
        if (i3 >= this.r) {
            return aD();
        }
        byte[] bArr = this.s;
        byte b2 = bArr[i2];
        byte b3 = bArr[i2 + 1];
        byte b4 = bArr[i2 + 2];
        byte b5 = bArr[i2 + 3];
        byte b6 = bArr[i2 + 4];
        byte b7 = bArr[i2 + 5];
        byte b8 = bArr[i2 + 6];
        byte b9 = bArr[i3];
        this.x = i2 + 8;
        return e((b2 << 24) + ((b3 & 255) << 16) + ((b4 & 255) << 8) + (b5 & 255), (b6 << 24) + ((b7 & 255) << 16) + ((b8 & 255) << 8) + (b9 & 255));
    }

    private final long aD() {
        return e(ap(), ap());
    }

    protected JsonToken ac() {
        return JsonToken.VALUE_NULL;
    }

    private final int z(int i2) {
        int ay = ay();
        if ((ay & 192) != 128) {
            a(ay & PrivateKeyType.INVALID, this.x);
        }
        int ay2 = ay();
        if ((ay2 & 192) != 128) {
            a(ay2 & PrivateKeyType.INVALID, this.x);
        }
        return ((((i2 & 15) << 6) | (ay & 63)) << 6) | (ay2 & 63);
    }

    private final int r(int i2) {
        int aF = aF();
        if ((aF & 192) != 128) {
            a(aF & PrivateKeyType.INVALID, this.x);
        }
        int aF2 = aF();
        if ((aF2 & 192) != 128) {
            a(aF2 & PrivateKeyType.INVALID, this.x);
        }
        return ((((i2 & 15) << 6) | (aF & 63)) << 6) | (aF2 & 63);
    }

    private final int B(int i2) {
        int ay = ay();
        if ((ay & 192) != 128) {
            a(ay & PrivateKeyType.INVALID, this.x);
        }
        int ay2 = ay();
        if ((ay2 & 192) != 128) {
            a(ay2 & PrivateKeyType.INVALID, this.x);
        }
        int ay3 = ay();
        if ((ay3 & 192) != 128) {
            a(ay3 & PrivateKeyType.INVALID, this.x);
        }
        return (((((((i2 & 7) << 6) | (ay & 63)) << 6) | (ay2 & 63)) << 6) | (ay3 & 63)) - AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
    }

    private final int v(int i2) {
        int aF = aF();
        if ((aF & 192) != 128) {
            a(aF & PrivateKeyType.INVALID, this.x);
        }
        int aF2 = aF();
        if ((aF2 & 192) != 128) {
            a(aF2 & PrivateKeyType.INVALID, this.x);
        }
        int aF3 = aF();
        if ((aF3 & 192) != 128) {
            a(aF3 & PrivateKeyType.INVALID, this.x);
        }
        return (((((((i2 & 7) << 6) | (aF & 63)) << 6) | (aF2 & 63)) << 6) | (aF3 & 63)) - AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
    }

    protected final boolean an() {
        InputStream inputStream = this.v;
        if (inputStream != null) {
            this.p += this.r;
            byte[] bArr = this.s;
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read > 0) {
                this.x = 0;
                this.r = read;
                return true;
            }
            W();
            if (read == 0) {
                throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.s.length + " bytes");
            }
        }
        return false;
    }

    protected final void ao() {
        if (an()) {
            return;
        }
        av();
    }

    protected final void l(int i2) {
        if (this.v == null) {
            throw d("Needed to read " + i2 + " bytes, reached end-of-input");
        }
        int i3 = this.r;
        int i4 = this.x;
        int i5 = i3 - i4;
        if (i5 <= 0 || i4 <= 0) {
            this.r = 0;
        } else {
            byte[] bArr = this.s;
            System.arraycopy(bArr, i4, bArr, 0, i5);
            this.r = i5;
        }
        this.p += this.x;
        this.x = 0;
        while (true) {
            int i6 = this.r;
            if (i6 >= i2) {
                return;
            }
            InputStream inputStream = this.v;
            byte[] bArr2 = this.s;
            int read = inputStream.read(bArr2, i6, bArr2.length - i6);
            if (read < 1) {
                W();
                if (read == 0) {
                    throw new IOException("InputStream.read() returned 0 characters when trying to read " + i5 + " bytes");
                }
                throw d("Needed to read " + i2 + " bytes, missed " + i2 + " before end-of-input");
            }
            this.r += read;
        }
    }

    protected C9439pc aa() {
        C9439pc c9439pc = this.n;
        if (c9439pc == null) {
            this.n = new C9439pc();
        } else {
            c9439pc.c();
        }
        return this.n;
    }

    protected void W() {
        if (this.v != null) {
            if (this.w.f() || a(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.v.close();
            }
            this.v = null;
        }
    }

    @Override // o.AbstractC9384oa
    public void ae() {
        if (this.X.i()) {
            return;
        }
        e(String.format(": expected close marker for %s (start marker at %s)", this.X.h() ? "Array" : "Object", this.X.d(this.w.j())), (JsonToken) null);
    }

    protected JsonToken ab() {
        this.aa = -1;
        close();
        this.P = null;
        return null;
    }

    protected void n(int i2) {
        int i3 = i2 & PrivateKeyType.INVALID;
        if (i3 == 255) {
            throw d("Mismatched BREAK byte (0xFF): encountered where value expected");
        }
        throw d("Invalid CBOR value token (first byte): 0x" + Integer.toHexString(i3));
    }

    protected void ah() {
        if (this.X.i()) {
            throw d("Unexpected Break (0xFF) token in Root context");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected Break (0xFF) token in definite length (");
        sb.append(this.X.n());
        sb.append(") ");
        sb.append(this.X.g() ? "Object" : "Array");
        throw d(sb.toString());
    }

    protected void m(int i2) {
        if (i2 < 32) {
            j(i2);
        }
        o(i2);
    }

    protected void o(int i2) {
        f("Invalid UTF-8 start byte 0x" + Integer.toHexString(i2));
    }

    protected void s(int i2) {
        f("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i2));
    }

    protected void a(int i2, int i3) {
        this.x = i3;
        s(i2);
    }

    private final BigInteger c(long j2) {
        return BigInteger.valueOf((j2 << 1) >>> 1).or(ad);
    }

    private final BigInteger a(long j2) {
        return c(j2).negate().subtract(BigInteger.ONE);
    }
}
