package o;

import androidx.appcompat.widget.ActivityChooserModel;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.netflix.ale.AleCryptoBouncyCastle;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: o.oQ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9374oQ extends AbstractC9386oc {
    protected boolean U;
    protected int V;
    protected byte[] W;
    protected InputStream X;
    protected int Y;
    protected int Z;
    protected int[] aa;
    protected final C9377oT ab;
    protected ObjectCodec ac;
    protected boolean ah;
    private int aq;
    private static final int al = JsonParser.Feature.ALLOW_TRAILING_COMMA.b();
    private static final int ak = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.b();
    private static final int ai = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.b();
    private static final int ag = JsonParser.Feature.ALLOW_MISSING_VALUES.b();
    private static final int ae = JsonParser.Feature.ALLOW_SINGLE_QUOTES.b();
    private static final int af = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.b();
    private static final int ad = JsonParser.Feature.ALLOW_COMMENTS.b();
    private static final int aj = JsonParser.Feature.ALLOW_YAML_COMMENTS.b();
    private static final int[] am = C9391oh.d();
    protected static final int[] T = C9391oh.a();

    private final void aR() {
        this.G = this.f;
        int i = this.n;
        this.F = this.j + i;
        this.I = i - this.h;
    }

    private final void aX() {
        this.Y = this.f;
        int i = this.n;
        this.Z = i;
        this.V = i - this.h;
    }

    private static final int i(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec n() {
        return this.ac;
    }

    public C9374oQ(C9389of c9389of, int i, InputStream inputStream, ObjectCodec objectCodec, C9377oT c9377oT, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(c9389of, i);
        this.aa = new int[16];
        this.X = inputStream;
        this.ac = objectCodec;
        this.ab = c9377oT;
        this.W = bArr;
        this.n = i2;
        this.m = i3;
        this.h = i2 - i4;
        this.j = (-i2) + i4;
        this.U = z;
    }

    protected final boolean aB() {
        byte[] bArr;
        int length;
        InputStream inputStream = this.X;
        if (inputStream == null || (length = (bArr = this.W).length) == 0) {
            return false;
        }
        int read = inputStream.read(bArr, 0, length);
        if (read > 0) {
            int i = this.m;
            this.j += i;
            this.h -= i;
            this.Z -= i;
            this.n = 0;
            this.m = read;
            return true;
        }
        W();
        if (read == 0) {
            throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.W.length + " bytes");
        }
        return false;
    }

    @Override // o.AbstractC9386oc
    public void W() {
        if (this.X != null) {
            if (this.q.f() || a(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.X.close();
            }
            this.X = null;
        }
    }

    @Override // o.AbstractC9386oc
    public void af() {
        byte[] bArr;
        byte[] bArr2;
        super.af();
        this.ab.a();
        if (!this.U || (bArr = this.W) == null || bArr == (bArr2 = AbstractC9384oa.Q)) {
            return;
        }
        this.W = bArr2;
        this.q.c(bArr);
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public String A() {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.ah) {
                this.ah = false;
                return as();
            }
            return this.A.a();
        }
        return c(jsonToken);
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public String L() {
        JsonToken jsonToken = this.P;
        if (jsonToken != JsonToken.VALUE_STRING) {
            if (jsonToken == JsonToken.FIELD_NAME) {
                return l();
            }
            return super.c((String) null);
        } else if (this.ah) {
            this.ah = false;
            return as();
        } else {
            return this.A.a();
        }
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public String c(String str) {
        JsonToken jsonToken = this.P;
        if (jsonToken != JsonToken.VALUE_STRING) {
            if (jsonToken == JsonToken.FIELD_NAME) {
                return l();
            }
            return super.c(str);
        } else if (this.ah) {
            this.ah = false;
            return as();
        } else {
            return this.A.a();
        }
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public int E() {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            int i = this.r;
            int i2 = i & 1;
            if (i2 == 0) {
                if (i == 0) {
                    return ad();
                }
                if (i2 == 0) {
                    aj();
                }
            }
            return this.u;
        }
        return super.d(0);
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public int d(int i) {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            int i2 = this.r;
            int i3 = i2 & 1;
            if (i3 == 0) {
                if (i2 == 0) {
                    return ad();
                }
                if (i3 == 0) {
                    aj();
                }
            }
            return this.u;
        }
        return super.d(i);
    }

    protected final String c(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int c = jsonToken.c();
        if (c != 5) {
            if (c == 6 || c == 7 || c == 8) {
                return this.A.a();
            }
            return jsonToken.a();
        }
        return this.B.c();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] B() {
        JsonToken jsonToken = this.P;
        if (jsonToken != null) {
            int c = jsonToken.c();
            if (c != 5) {
                if (c != 6) {
                    if (c != 7 && c != 8) {
                        return this.P.d();
                    }
                } else if (this.ah) {
                    this.ah = false;
                    Y();
                }
                return this.A.h();
            }
            if (!this.s) {
                String c2 = this.B.c();
                int length = c2.length();
                char[] cArr = this.t;
                if (cArr == null) {
                    this.t = this.q.d(length);
                } else if (cArr.length < length) {
                    this.t = new char[length];
                }
                c2.getChars(0, length, this.t, 0);
                this.s = true;
            }
            return this.t;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int D() {
        JsonToken jsonToken = this.P;
        if (jsonToken != null) {
            int c = jsonToken.c();
            if (c == 5) {
                return this.B.c().length();
            }
            if (c != 6) {
                if (c != 7 && c != 8) {
                    return this.P.d().length;
                }
            } else if (this.ah) {
                this.ah = false;
                Y();
            }
            return this.A.l();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r0 != 8) goto L15;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int H() {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3.P
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.c()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3.ah
            if (r0 == 0) goto L1d
            r3.ah = r1
            r3.Y()
        L1d:
            o.pg r0 = r3.A
            int r0 = r0.i()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9374oQ.H():int");
    }

    @Override // o.AbstractC9386oc, com.fasterxml.jackson.core.JsonParser
    public byte[] e(Base64Variant base64Variant) {
        JsonToken jsonToken = this.P;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this.b == null)) {
            f("Current token (" + this.P + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.ah) {
            try {
                this.b = a(base64Variant);
                this.ah = false;
            } catch (IllegalArgumentException e) {
                throw d("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e.getMessage());
            }
        } else if (this.b == null) {
            C9439pc Z = Z();
            a(A(), Z, base64Variant);
            this.b = Z.i();
        }
        return this.b;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int e(Base64Variant base64Variant, OutputStream outputStream) {
        if (!this.ah || this.P != JsonToken.VALUE_STRING) {
            byte[] e = e(base64Variant);
            outputStream.write(e);
            return e.length;
        }
        byte[] c = this.q.c();
        try {
            return b(base64Variant, outputStream, c);
        } finally {
            this.q.b(c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
        r16.ah = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        if (r6 <= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012f, code lost:
        r7 = r7 + r6;
        r18.write(r19, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0133, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int b(com.fasterxml.jackson.core.Base64Variant r17, java.io.OutputStream r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9374oQ.b(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public JsonToken Q() {
        JsonToken f;
        JsonToken jsonToken = this.P;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return aL();
        }
        this.r = 0;
        if (this.ah) {
            aE();
        }
        int aU = aU();
        if (aU < 0) {
            close();
            this.P = null;
            return null;
        }
        this.b = null;
        if (aU == 93) {
            aJ();
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            this.P = jsonToken3;
            return jsonToken3;
        } else if (aU == 125) {
            aI();
            JsonToken jsonToken4 = JsonToken.END_OBJECT;
            this.P = jsonToken4;
            return jsonToken4;
        } else {
            if (this.B.o()) {
                if (aU != 44) {
                    d(aU, "was expecting comma to separate " + this.B.k() + " entries");
                }
                aU = aQ();
                if ((this.a & al) != 0 && (aU == 93 || aU == 125)) {
                    return r(aU);
                }
            }
            if (!this.B.g()) {
                aR();
                return x(aU);
            }
            aX();
            this.B.d(m(aU));
            this.P = jsonToken2;
            int aK = aK();
            aR();
            if (aK == 34) {
                this.ah = true;
                this.p = JsonToken.VALUE_STRING;
                return this.P;
            }
            if (aK != 43) {
                if (aK == 91) {
                    f = JsonToken.START_ARRAY;
                } else if (aK == 102) {
                    ay();
                    f = JsonToken.VALUE_FALSE;
                } else if (aK == 110) {
                    ax();
                    f = JsonToken.VALUE_NULL;
                } else if (aK == 116) {
                    aG();
                    f = JsonToken.VALUE_TRUE;
                } else if (aK == 123) {
                    f = JsonToken.START_OBJECT;
                } else if (aK == 45) {
                    f = a(true);
                } else if (aK == 46) {
                    f = c(false, false);
                } else {
                    switch (aK) {
                        case 48:
                        case 49:
                        case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            f = l(aK);
                            break;
                        default:
                            f = f(aK);
                            break;
                    }
                }
            } else if (a(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e())) {
                f = a(false);
            } else {
                f = f(aK);
            }
            this.p = f;
            return this.P;
        }
    }

    private final JsonToken x(int i) {
        if (i == 34) {
            this.ah = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.P = jsonToken;
            return jsonToken;
        } else if (i == 43) {
            if (!a(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e())) {
                JsonToken f = f(i);
                this.P = f;
                return f;
            }
            JsonToken a = a(false);
            this.P = a;
            return a;
        } else if (i == 91) {
            this.B = this.B.a(this.G, this.I);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.P = jsonToken2;
            return jsonToken2;
        } else if (i == 102) {
            ay();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this.P = jsonToken3;
            return jsonToken3;
        } else if (i == 110) {
            ax();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this.P = jsonToken4;
            return jsonToken4;
        } else if (i == 116) {
            aG();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this.P = jsonToken5;
            return jsonToken5;
        } else if (i == 123) {
            this.B = this.B.c(this.G, this.I);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this.P = jsonToken6;
            return jsonToken6;
        } else if (i == 45) {
            JsonToken a2 = a(true);
            this.P = a2;
            return a2;
        } else if (i == 46) {
            JsonToken c = c(false, false);
            this.P = c;
            return c;
        } else {
            switch (i) {
                case 48:
                case 49:
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    JsonToken l = l(i);
                    this.P = l;
                    return l;
                default:
                    JsonToken f2 = f(i);
                    this.P = f2;
                    return f2;
            }
        }
    }

    private final JsonToken aL() {
        this.s = false;
        JsonToken jsonToken = this.p;
        this.p = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this.B = this.B.a(this.G, this.I);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.B = this.B.c(this.G, this.I);
        }
        this.P = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String R() {
        JsonToken f;
        this.r = 0;
        JsonToken jsonToken = this.P;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            aL();
            return null;
        }
        if (this.ah) {
            aE();
        }
        int aU = aU();
        if (aU < 0) {
            close();
            this.P = null;
            return null;
        }
        this.b = null;
        if (aU == 93) {
            aJ();
            this.P = JsonToken.END_ARRAY;
            return null;
        } else if (aU == 125) {
            aI();
            this.P = JsonToken.END_OBJECT;
            return null;
        } else {
            if (this.B.o()) {
                if (aU != 44) {
                    d(aU, "was expecting comma to separate " + this.B.k() + " entries");
                }
                aU = aQ();
                if ((this.a & al) != 0 && (aU == 93 || aU == 125)) {
                    r(aU);
                    return null;
                }
            }
            if (!this.B.g()) {
                aR();
                x(aU);
                return null;
            }
            aX();
            String m = m(aU);
            this.B.d(m);
            this.P = jsonToken2;
            int aK = aK();
            aR();
            if (aK == 34) {
                this.ah = true;
                this.p = JsonToken.VALUE_STRING;
                return m;
            }
            if (aK != 43) {
                if (aK == 91) {
                    f = JsonToken.START_ARRAY;
                } else if (aK == 102) {
                    ay();
                    f = JsonToken.VALUE_FALSE;
                } else if (aK == 110) {
                    ax();
                    f = JsonToken.VALUE_NULL;
                } else if (aK == 116) {
                    aG();
                    f = JsonToken.VALUE_TRUE;
                } else if (aK == 123) {
                    f = JsonToken.START_OBJECT;
                } else if (aK == 45) {
                    f = a(true);
                } else if (aK == 46) {
                    f = c(false, false);
                } else {
                    switch (aK) {
                        case 48:
                        case 49:
                        case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            f = l(aK);
                            break;
                        default:
                            f = f(aK);
                            break;
                    }
                }
            } else if (a(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e())) {
                f = a(false);
            } else {
                f = f(aK);
            }
            this.p = f;
            return m;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String S() {
        if (this.P == JsonToken.FIELD_NAME) {
            this.s = false;
            JsonToken jsonToken = this.p;
            this.p = null;
            this.P = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this.ah) {
                    this.ah = false;
                    return as();
                }
                return this.A.a();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this.B = this.B.a(this.G, this.I);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this.B = this.B.c(this.G, this.I);
            }
            return null;
        } else if (Q() == JsonToken.VALUE_STRING) {
            return A();
        } else {
            return null;
        }
    }

    protected final JsonToken c(boolean z, boolean z2) {
        if (!a(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.e())) {
            return f(46);
        }
        char[] e = this.A.e();
        int i = 0;
        if (z) {
            e[0] = '-';
            i = 1;
        }
        return a(e, i, 46, z, 0);
    }

    protected JsonToken l(int i) {
        int i2;
        int i3;
        char[] e = this.A.e();
        if (i == 48) {
            i = ba();
        }
        e[0] = (char) i;
        int min = Math.min(this.m, (this.n + e.length) - 1);
        int i4 = 1;
        int i5 = 1;
        while (true) {
            i2 = this.n;
            if (i2 >= min) {
                return d(e, i4, false, i5);
            }
            byte[] bArr = this.W;
            this.n = i2 + 1;
            i3 = bArr[i2] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i5++;
            e[i4] = (char) i3;
            i4++;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return a(e, i4, i3, false, i5);
        }
        this.n = i2;
        this.A.b(i4);
        if (this.B.i()) {
            w(i3);
        }
        return d(false, i5);
    }

    private final JsonToken a(boolean z) {
        int i;
        int i2;
        int i3;
        char[] e = this.A.e();
        int i4 = 1;
        int i5 = 0;
        if (z) {
            e[0] = '-';
            i5 = 1;
        }
        if (this.n >= this.m) {
            az();
        }
        byte[] bArr = this.W;
        int i6 = this.n;
        this.n = i6 + 1;
        int i7 = bArr[i6] & 255;
        if (i7 <= 48) {
            if (i7 != 48) {
                if (i7 == 46) {
                    return c(z, true);
                }
                return b(i7, z, true);
            }
            i7 = ba();
        } else if (i7 > 57) {
            return b(i7, z, true);
        }
        int i8 = i5 + 1;
        e[i5] = (char) i7;
        int min = Math.min(this.m, (this.n + e.length) - i8);
        while (true) {
            i = i8;
            i2 = this.n;
            if (i2 >= min) {
                return d(e, i, z, i4);
            }
            byte[] bArr2 = this.W;
            this.n = i2 + 1;
            i3 = bArr2[i2] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i4++;
            i8 = i + 1;
            e[i] = (char) i3;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return a(e, i, i3, z, i4);
        }
        this.n = i2;
        this.A.b(i);
        if (this.B.i()) {
            w(i3);
        }
        return d(z, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r3 == 46) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r3 == 101) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r3 != 69) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        r6.n = r8;
        r6.A.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r6.B.i() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
        w(r6.W[r6.n] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        return d(r9, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        return a(r1, r2, r3, r9, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.fasterxml.jackson.core.JsonToken d(char[] r7, int r8, boolean r9, int r10) {
        /*
            r6 = this;
            r1 = r7
            r2 = r8
            r5 = r10
        L3:
            int r7 = r6.n
            int r8 = r6.m
            if (r7 < r8) goto L19
            boolean r7 = r6.aB()
            if (r7 != 0) goto L19
            o.pg r7 = r6.A
            r7.b(r2)
            com.fasterxml.jackson.core.JsonToken r7 = r6.d(r9, r5)
            return r7
        L19:
            byte[] r7 = r6.W
            int r8 = r6.n
            int r10 = r8 + 1
            r6.n = r10
            r7 = r7[r8]
            r3 = r7 & 255(0xff, float:3.57E-43)
            r7 = 57
            if (r3 > r7) goto L41
            r7 = 48
            if (r3 >= r7) goto L2e
            goto L41
        L2e:
            int r7 = r1.length
            if (r2 < r7) goto L39
            o.pg r7 = r6.A
            char[] r7 = r7.d()
            r2 = 0
            r1 = r7
        L39:
            char r7 = (char) r3
            r1[r2] = r7
            int r5 = r5 + 1
            int r2 = r2 + 1
            goto L3
        L41:
            r7 = 46
            if (r3 == r7) goto L6d
            r7 = 101(0x65, float:1.42E-43)
            if (r3 == r7) goto L6d
            r7 = 69
            if (r3 != r7) goto L4e
            goto L6d
        L4e:
            r6.n = r8
            o.pg r7 = r6.A
            r7.b(r2)
            o.oG r7 = r6.B
            boolean r7 = r7.i()
            if (r7 == 0) goto L68
            byte[] r7 = r6.W
            int r8 = r6.n
            r7 = r7[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6.w(r7)
        L68:
            com.fasterxml.jackson.core.JsonToken r7 = r6.d(r9, r5)
            return r7
        L6d:
            r0 = r6
            r4 = r9
            com.fasterxml.jackson.core.JsonToken r7 = r0.a(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9374oQ.d(char[], int, boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    private final int ba() {
        int i;
        if ((this.n < this.m || aB()) && (i = this.W[this.n] & 255) >= 48 && i <= 57) {
            if ((this.a & ak) == 0) {
                h("Leading zeroes not allowed");
            }
            this.n++;
            if (i == 48) {
                do {
                    if (this.n >= this.m && !aB()) {
                        break;
                    }
                    byte[] bArr = this.W;
                    int i2 = this.n;
                    i = bArr[i2] & 255;
                    if (i < 48 || i > 57) {
                        return 48;
                    }
                    this.n = i2 + 1;
                } while (i == 48);
            }
            return i;
        }
        return 48;
    }

    private final JsonToken a(char[] cArr, int i, int i2, boolean z, int i3) {
        int i4;
        boolean z2;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this.A.d();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            i4 = 0;
            while (true) {
                if (this.n >= this.m && !aB()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.W;
                int i6 = this.n;
                this.n = i6 + 1;
                i2 = bArr[i6] & 255;
                if (i2 < 48 || i2 > 57) {
                    break;
                }
                i4++;
                if (i >= cArr.length) {
                    cArr = this.A.d();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i++;
            }
            z2 = false;
            if (i4 == 0 && !a(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.e())) {
                a(i2, "Decimal point not followed by a digit");
            }
        } else {
            i4 = 0;
            z2 = false;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this.A.d();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) i2;
            if (this.n >= this.m) {
                az();
            }
            byte[] bArr2 = this.W;
            int i8 = this.n;
            this.n = i8 + 1;
            int i9 = bArr2[i8] & 255;
            if (i9 == 45 || i9 == 43) {
                if (i7 >= cArr.length) {
                    cArr = this.A.d();
                    i7 = 0;
                }
                cArr[i7] = (char) i9;
                if (this.n >= this.m) {
                    az();
                }
                byte[] bArr3 = this.W;
                int i10 = this.n;
                this.n = i10 + 1;
                i9 = bArr3[i10] & 255;
                i7++;
            }
            i2 = i9;
            int i11 = 0;
            while (i2 >= 48 && i2 <= 57) {
                i11++;
                if (i7 >= cArr.length) {
                    cArr = this.A.d();
                    i7 = 0;
                }
                int i12 = i7 + 1;
                cArr[i7] = (char) i2;
                if (this.n >= this.m && !aB()) {
                    i5 = i11;
                    z2 = true;
                    i = i12;
                    break;
                }
                byte[] bArr4 = this.W;
                int i13 = this.n;
                this.n = i13 + 1;
                i2 = bArr4[i13] & 255;
                i7 = i12;
            }
            i5 = i11;
            i = i7;
            if (i5 == 0) {
                a(i2, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this.n--;
            if (this.B.i()) {
                w(i2);
            }
        }
        this.A.b(i);
        return a(z, i3, i4, i5);
    }

    private final void w(int i) {
        int i2 = this.n;
        int i3 = i2 + 1;
        this.n = i3;
        if (i != 9) {
            if (i == 10) {
                this.f++;
                this.h = i3;
            } else if (i == 13) {
                this.n = i2;
            } else if (i != 32) {
                g(i);
            }
        }
    }

    protected final String m(int i) {
        if (i != 34) {
            return i(i);
        }
        int i2 = this.n;
        if (i2 + 13 > this.m) {
            return aC();
        }
        byte[] bArr = this.W;
        int[] iArr = T;
        int i3 = i2 + 1;
        this.n = i3;
        int i4 = bArr[i2] & 255;
        if (iArr[i4] != 0) {
            return i4 == 34 ? "" : a(0, i4, 0);
        }
        int i5 = i2 + 2;
        this.n = i5;
        int i6 = bArr[i3] & 255;
        if (iArr[i6] != 0) {
            if (i6 == 34) {
                return h(i4, 1);
            }
            return a(i4, i6, 1);
        }
        int i7 = i6 | (i4 << 8);
        int i8 = i2 + 3;
        this.n = i8;
        int i9 = bArr[i5] & 255;
        if (iArr[i9] != 0) {
            if (i9 == 34) {
                return h(i7, 2);
            }
            return a(i7, i9, 2);
        }
        int i10 = (i7 << 8) | i9;
        int i11 = i2 + 4;
        this.n = i11;
        int i12 = bArr[i8] & 255;
        if (iArr[i12] != 0) {
            if (i12 == 34) {
                return h(i10, 3);
            }
            return a(i10, i12, 3);
        }
        int i13 = (i10 << 8) | i12;
        this.n = i2 + 5;
        int i14 = bArr[i11] & 255;
        if (iArr[i14] == 0) {
            this.aq = i13;
            return s(i14);
        } else if (i14 == 34) {
            return h(i13, 4);
        } else {
            return a(i13, i14, 4);
        }
    }

    protected final String s(int i) {
        byte[] bArr = this.W;
        int[] iArr = T;
        int i2 = this.n;
        int i3 = i2 + 1;
        this.n = i3;
        int i4 = bArr[i2] & 255;
        if (iArr[i4] != 0) {
            if (i4 == 34) {
                return e(this.aq, i, 1);
            }
            return a(this.aq, i, i4, 1);
        }
        int i5 = (i << 8) | i4;
        int i6 = i2 + 2;
        this.n = i6;
        int i7 = bArr[i3] & 255;
        if (iArr[i7] != 0) {
            if (i7 == 34) {
                return e(this.aq, i5, 2);
            }
            return a(this.aq, i5, i7, 2);
        }
        int i8 = (i5 << 8) | i7;
        int i9 = i2 + 3;
        this.n = i9;
        int i10 = bArr[i6] & 255;
        if (iArr[i10] != 0) {
            if (i10 == 34) {
                return e(this.aq, i8, 3);
            }
            return a(this.aq, i8, i10, 3);
        }
        int i11 = (i8 << 8) | i10;
        this.n = i2 + 4;
        int i12 = bArr[i9] & 255;
        if (iArr[i12] != 0) {
            if (i12 == 34) {
                return e(this.aq, i11, 4);
            }
            return a(this.aq, i11, i12, 4);
        }
        return a(i12, i11);
    }

    protected final String a(int i, int i2) {
        byte[] bArr = this.W;
        int[] iArr = T;
        int i3 = this.n;
        int i4 = i3 + 1;
        this.n = i4;
        int i5 = bArr[i3] & 255;
        if (iArr[i5] != 0) {
            if (i5 == 34) {
                return e(this.aq, i2, i, 1);
            }
            return e(this.aq, i2, i, i5, 1);
        }
        int i6 = (i << 8) | i5;
        int i7 = i3 + 2;
        this.n = i7;
        int i8 = bArr[i4] & 255;
        if (iArr[i8] != 0) {
            if (i8 == 34) {
                return e(this.aq, i2, i6, 2);
            }
            return e(this.aq, i2, i6, i8, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i3 + 3;
        this.n = i10;
        int i11 = bArr[i7] & 255;
        if (iArr[i11] != 0) {
            if (i11 == 34) {
                return e(this.aq, i2, i9, 3);
            }
            return e(this.aq, i2, i9, i11, 3);
        }
        int i12 = (i9 << 8) | i11;
        this.n = i3 + 4;
        int i13 = bArr[i10] & 255;
        if (iArr[i13] != 0) {
            if (i13 == 34) {
                return e(this.aq, i2, i12, 4);
            }
            return e(this.aq, i2, i12, i13, 4);
        }
        return d(i13, i2, i12);
    }

    protected final String d(int i, int i2, int i3) {
        int[] iArr = this.aa;
        iArr[0] = this.aq;
        iArr[1] = i2;
        iArr[2] = i3;
        byte[] bArr = this.W;
        int[] iArr2 = T;
        int i4 = i;
        int i5 = 3;
        while (true) {
            int i6 = this.n;
            int i7 = i6 + 4;
            if (i7 <= this.m) {
                int i8 = i6 + 1;
                this.n = i8;
                int i9 = bArr[i6] & 255;
                if (iArr2[i9] != 0) {
                    if (i9 == 34) {
                        return d(this.aa, i5, i4, 1);
                    }
                    return e(this.aa, i5, i4, i9, 1);
                }
                int i10 = (i4 << 8) | i9;
                int i11 = i6 + 2;
                this.n = i11;
                int i12 = bArr[i8] & 255;
                if (iArr2[i12] != 0) {
                    if (i12 == 34) {
                        return d(this.aa, i5, i10, 2);
                    }
                    return e(this.aa, i5, i10, i12, 2);
                }
                int i13 = (i10 << 8) | i12;
                int i14 = i6 + 3;
                this.n = i14;
                int i15 = bArr[i11] & 255;
                if (iArr2[i15] != 0) {
                    if (i15 == 34) {
                        return d(this.aa, i5, i13, 3);
                    }
                    return e(this.aa, i5, i13, i15, 3);
                }
                int i16 = (i13 << 8) | i15;
                this.n = i7;
                int i17 = bArr[i14] & 255;
                if (iArr2[i17] != 0) {
                    if (i17 == 34) {
                        return d(this.aa, i5, i16, 4);
                    }
                    return e(this.aa, i5, i16, i17, 4);
                }
                int[] iArr3 = this.aa;
                if (i5 >= iArr3.length) {
                    this.aa = AbstractC9386oc.a(iArr3, i5);
                }
                this.aa[i5] = i16;
                i5++;
                i4 = i17;
            } else {
                return e(this.aa, i5, 0, i4, 0);
            }
        }
    }

    protected String aC() {
        if (this.n >= this.m && !aB()) {
            e(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this.W;
        int i = this.n;
        this.n = i + 1;
        int i2 = bArr[i] & 255;
        return i2 == 34 ? "" : e(this.aa, 0, 0, i2, 0);
    }

    private final String a(int i, int i2, int i3) {
        return e(this.aa, 0, i, i2, i3);
    }

    private final String a(int i, int i2, int i3, int i4) {
        int[] iArr = this.aa;
        iArr[0] = i;
        return e(iArr, 1, i2, i3, i4);
    }

    private final String e(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.aa;
        iArr[0] = i;
        iArr[1] = i2;
        return e(iArr, 2, i3, i4, i5);
    }

    protected final String e(int[] iArr, int i, int i2, int i3, int i4) {
        int[] iArr2 = T;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    b(i3, "name");
                } else {
                    i3 = V();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = AbstractC9386oc.a(iArr, iArr.length);
                            this.aa = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    int i6 = i2 << 8;
                    if (i3 < 2048) {
                        i2 = i6 | (i3 >> 6) | 192;
                        i4++;
                    } else {
                        int i7 = i6 | (i3 >> 12) | 224;
                        int i8 = i4 + 1;
                        if (i8 >= 4) {
                            if (i >= iArr.length) {
                                iArr = AbstractC9386oc.a(iArr, iArr.length);
                                this.aa = iArr;
                            }
                            iArr[i] = i7;
                            i++;
                            i8 = 0;
                        } else {
                            i5 = i7;
                        }
                        i2 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        i4 = i8 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = AbstractC9386oc.a(iArr, iArr.length);
                    this.aa = iArr;
                }
                iArr[i] = i2;
                i++;
                i2 = i3;
                i4 = 1;
            }
            if (this.n >= this.m && !aB()) {
                e(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this.W;
            int i9 = this.n;
            this.n = i9 + 1;
            i3 = bArr[i9] & 255;
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                iArr = AbstractC9386oc.a(iArr, iArr.length);
                this.aa = iArr;
            }
            iArr[i] = i(i2, i4);
            i++;
        }
        String d = this.ab.d(iArr, i);
        return d == null ? c(iArr, i, i4) : d;
    }

    protected String i(int i) {
        if (i == 39 && (this.a & ae) != 0) {
            return aD();
        }
        if ((this.a & af) == 0) {
            d((char) h(i), "was expecting double-quote to start field name");
        }
        int[] f = C9391oh.f();
        if (f[i] != 0) {
            d(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr = this.aa;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < 4) {
                i2++;
                i |= i4 << 8;
            } else {
                if (i3 >= iArr.length) {
                    iArr = AbstractC9386oc.a(iArr, iArr.length);
                    this.aa = iArr;
                }
                iArr[i3] = i4;
                i3++;
                i2 = 1;
            }
            i4 = i;
            if (this.n >= this.m && !aB()) {
                e(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this.W;
            int i5 = this.n;
            i = bArr[i5] & 255;
            if (f[i] != 0) {
                break;
            }
            this.n = i5 + 1;
        }
        if (i2 > 0) {
            if (i3 >= iArr.length) {
                int[] a = AbstractC9386oc.a(iArr, iArr.length);
                this.aa = a;
                iArr = a;
            }
            iArr[i3] = i4;
            i3++;
        }
        String d = this.ab.d(iArr, i3);
        return d == null ? c(iArr, i3, i2) : d;
    }

    protected String aD() {
        if (this.n >= this.m && !aB()) {
            e(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this.W;
        int i = this.n;
        this.n = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 39) {
            return "";
        }
        int[] iArr = this.aa;
        int[] iArr2 = T;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 != 39) {
            if (iArr2[i2] != 0 && i2 != 34) {
                if (i2 != 92) {
                    b(i2, "name");
                } else {
                    i2 = V();
                }
                if (i2 > 127) {
                    if (i3 >= 4) {
                        if (i4 >= iArr.length) {
                            iArr = AbstractC9386oc.a(iArr, iArr.length);
                            this.aa = iArr;
                        }
                        iArr[i4] = i5;
                        i4++;
                        i3 = 0;
                        i5 = 0;
                    }
                    int i6 = i5 << 8;
                    if (i2 < 2048) {
                        i5 = i6 | (i2 >> 6) | 192;
                        i3++;
                    } else {
                        int i7 = i6 | (i2 >> 12) | 224;
                        int i8 = i3 + 1;
                        if (i8 >= 4) {
                            if (i4 >= iArr.length) {
                                iArr = AbstractC9386oc.a(iArr, iArr.length);
                                this.aa = iArr;
                            }
                            iArr[i4] = i7;
                            i4++;
                            i8 = 0;
                            i7 = 0;
                        }
                        i5 = (i7 << 8) | ((i2 >> 6) & 63) | 128;
                        i3 = i8 + 1;
                    }
                    i2 = (i2 & 63) | 128;
                }
            }
            if (i3 < 4) {
                i3++;
                i5 = i2 | (i5 << 8);
            } else {
                if (i4 >= iArr.length) {
                    iArr = AbstractC9386oc.a(iArr, iArr.length);
                    this.aa = iArr;
                }
                iArr[i4] = i5;
                i4++;
                i5 = i2;
                i3 = 1;
            }
            if (this.n >= this.m && !aB()) {
                e(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this.W;
            int i9 = this.n;
            this.n = i9 + 1;
            i2 = bArr2[i9] & 255;
        }
        if (i3 > 0) {
            if (i4 >= iArr.length) {
                int[] a = AbstractC9386oc.a(iArr, iArr.length);
                this.aa = a;
                iArr = a;
            }
            iArr[i4] = i(i5, i3);
            i4++;
        }
        String d = this.ab.d(iArr, i4);
        return d == null ? c(iArr, i4, i3) : d;
    }

    private final String h(int i, int i2) {
        int i3 = i(i, i2);
        String c = this.ab.c(i3);
        if (c != null) {
            return c;
        }
        int[] iArr = this.aa;
        iArr[0] = i3;
        return c(iArr, 1, i2);
    }

    private final String e(int i, int i2, int i3) {
        int i4 = i(i2, i3);
        String e = this.ab.e(i, i4);
        if (e != null) {
            return e;
        }
        int[] iArr = this.aa;
        iArr[0] = i;
        iArr[1] = i4;
        return c(iArr, 2, i3);
    }

    private final String e(int i, int i2, int i3, int i4) {
        int i5 = i(i3, i4);
        String e = this.ab.e(i, i2, i5);
        if (e != null) {
            return e;
        }
        int[] iArr = this.aa;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i(i5, i4);
        return c(iArr, 3, i4);
    }

    private final String d(int[] iArr, int i, int i2, int i3) {
        if (i >= iArr.length) {
            iArr = AbstractC9386oc.a(iArr, iArr.length);
            this.aa = iArr;
        }
        int i4 = i + 1;
        iArr[i] = i(i2, i3);
        String d = this.ab.d(iArr, i4);
        return d == null ? c(iArr, i4, i3) : d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String c(int[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9374oQ.c(int[], int, int):java.lang.String");
    }

    protected void az() {
        if (aB()) {
            return;
        }
        av();
    }

    @Override // o.AbstractC9386oc
    public void Y() {
        int i = this.n;
        if (i >= this.m) {
            az();
            i = this.n;
        }
        char[] e = this.A.e();
        int[] iArr = am;
        int min = Math.min(this.m, e.length + i);
        byte[] bArr = this.W;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (iArr[i3] == 0) {
                i++;
                e[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this.n = i + 1;
                this.A.b(i2);
                return;
            }
        }
        this.n = i;
        a(e, i2);
    }

    protected String as() {
        int i = this.n;
        if (i >= this.m) {
            az();
            i = this.n;
        }
        char[] e = this.A.e();
        int[] iArr = am;
        int min = Math.min(this.m, e.length + i);
        byte[] bArr = this.W;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (iArr[i3] == 0) {
                i++;
                e[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this.n = i + 1;
                return this.A.d(i2);
            }
        }
        this.n = i;
        a(e, i2);
        return this.A.a();
    }

    private final void a(char[] cArr, int i) {
        int[] iArr = am;
        byte[] bArr = this.W;
        while (true) {
            int i2 = this.n;
            if (i2 >= this.m) {
                az();
                i2 = this.n;
            }
            int i3 = 0;
            if (i >= cArr.length) {
                cArr = this.A.d();
                i = 0;
            }
            int min = Math.min(this.m, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= min) {
                    this.n = i2;
                    break;
                }
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                int i6 = iArr[i5];
                if (i6 != 0) {
                    this.n = i4;
                    if (i5 != 34) {
                        if (i6 == 1) {
                            i5 = V();
                        } else if (i6 == 2) {
                            i5 = t(i5);
                        } else if (i6 == 3) {
                            i5 = this.m - i4 >= 2 ? q(i5) : p(i5);
                        } else if (i6 == 4) {
                            int v = v(i5);
                            int i7 = i + 1;
                            cArr[i] = (char) ((v >> 10) | 55296);
                            if (i7 >= cArr.length) {
                                cArr = this.A.d();
                                i = 0;
                            } else {
                                i = i7;
                            }
                            i5 = (v & 1023) | 56320;
                        } else if (i5 < 32) {
                            b(i5, "string value");
                        } else {
                            o(i5);
                        }
                        if (i >= cArr.length) {
                            cArr = this.A.d();
                        } else {
                            i3 = i;
                        }
                        i = i3 + 1;
                        cArr[i3] = (char) i5;
                    } else {
                        this.A.b(i);
                        return;
                    }
                } else {
                    cArr[i] = (char) i5;
                    i++;
                    i2 = i4;
                }
            }
        }
    }

    protected void aE() {
        this.ah = false;
        int[] iArr = am;
        byte[] bArr = this.W;
        while (true) {
            int i = this.n;
            int i2 = this.m;
            if (i >= i2) {
                az();
                i = this.n;
                i2 = this.m;
            }
            while (true) {
                if (i >= i2) {
                    this.n = i;
                    break;
                }
                int i3 = i + 1;
                int i4 = bArr[i] & 255;
                int i5 = iArr[i4];
                if (i5 != 0) {
                    this.n = i3;
                    if (i4 == 34) {
                        return;
                    }
                    if (i5 == 1) {
                        V();
                    } else if (i5 == 2) {
                        aO();
                    } else if (i5 == 3) {
                        aN();
                    } else if (i5 == 4) {
                        y(i4);
                    } else if (i4 < 32) {
                        b(i4, "string value");
                    } else {
                        o(i4);
                    }
                } else {
                    i = i3;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
        if (r4 != 44) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r3.B.h() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
        if (r3.B.i() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        if ((r3.a & o.C9374oQ.ag) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
        r3.n--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.fasterxml.jackson.core.JsonToken f(int r4) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9374oQ.f(int):com.fasterxml.jackson.core.JsonToken");
    }

    protected JsonToken aA() {
        char[] e = this.A.e();
        int[] iArr = am;
        byte[] bArr = this.W;
        int i = 0;
        while (true) {
            if (this.n >= this.m) {
                az();
            }
            if (i >= e.length) {
                e = this.A.d();
                i = 0;
            }
            int i2 = this.m;
            int length = this.n + (e.length - i);
            if (length < i2) {
                i2 = length;
            }
            while (true) {
                int i3 = this.n;
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    this.n = i4;
                    int i5 = bArr[i3] & 255;
                    if (i5 != 39) {
                        int i6 = iArr[i5];
                        if (i6 == 0 || i5 == 34) {
                            e[i] = (char) i5;
                            i++;
                        } else {
                            if (i6 == 1) {
                                i5 = V();
                            } else if (i6 == 2) {
                                i5 = t(i5);
                            } else if (i6 != 3) {
                                if (i6 == 4) {
                                    int v = v(i5);
                                    int i7 = i + 1;
                                    e[i] = (char) ((v >> 10) | 55296);
                                    if (i7 >= e.length) {
                                        e = this.A.d();
                                        i = 0;
                                    } else {
                                        i = i7;
                                    }
                                    i5 = (v & 1023) | 56320;
                                } else {
                                    if (i5 < 32) {
                                        b(i5, "string value");
                                    }
                                    o(i5);
                                }
                            } else if (this.m - i4 >= 2) {
                                i5 = q(i5);
                            } else {
                                i5 = p(i5);
                            }
                            if (i >= e.length) {
                                e = this.A.d();
                                i = 0;
                            }
                            e[i] = (char) i5;
                            i++;
                        }
                    } else {
                        this.A.b(i);
                        return JsonToken.VALUE_STRING;
                    }
                }
            }
        }
    }

    protected JsonToken b(int i, boolean z, boolean z2) {
        String str;
        while (i == 73) {
            if (this.n >= this.m && !aB()) {
                e(JsonToken.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this.W;
            int i2 = this.n;
            this.n = i2 + 1;
            i = bArr[i2];
            if (i != 78) {
                if (i != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            d(str, 3);
            if ((this.a & ai) != 0) {
                return d(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            c("Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow", (Object) str);
        }
        if (!a(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e()) && z2 && !z) {
            a(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        a(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        return null;
    }

    protected final void aG() {
        int i;
        int i2 = this.n;
        int i3 = i2 + 3;
        if (i3 < this.m) {
            byte[] bArr = this.W;
            if (bArr[i2] == 114 && bArr[i2 + 1] == 117 && bArr[i2 + 2] == 101 && ((i = bArr[i3] & 255) < 48 || i == 93 || i == 125)) {
                this.n = i3;
                return;
            }
        }
        b("true", 1);
    }

    protected final void ay() {
        int i;
        int i2 = this.n;
        int i3 = i2 + 4;
        if (i3 < this.m) {
            byte[] bArr = this.W;
            if (bArr[i2] == 97 && bArr[i2 + 1] == 108 && bArr[i2 + 2] == 115 && bArr[i2 + 3] == 101 && ((i = bArr[i3] & 255) < 48 || i == 93 || i == 125)) {
                this.n = i3;
                return;
            }
        }
        b("false", 1);
    }

    protected final void ax() {
        int i;
        int i2 = this.n;
        int i3 = i2 + 3;
        if (i3 < this.m) {
            byte[] bArr = this.W;
            if (bArr[i2] == 117 && bArr[i2 + 1] == 108 && bArr[i2 + 2] == 108 && ((i = bArr[i3] & 255) < 48 || i == 93 || i == 125)) {
                this.n = i3;
                return;
            }
        }
        b("null", 1);
    }

    protected final void d(String str, int i) {
        int i2;
        int length = str.length();
        if (this.n + length >= this.m) {
            b(str, i);
            return;
        }
        do {
            if (this.W[this.n] != str.charAt(i)) {
                g(str.substring(0, i));
            }
            i2 = this.n + 1;
            this.n = i2;
            i++;
        } while (i < length);
        int i3 = this.W[i2] & 255;
        if (i3 < 48 || i3 == 93 || i3 == 125) {
            return;
        }
        e(str, i, i3);
    }

    private final void b(String str, int i) {
        int i2;
        int i3;
        int length = str.length();
        do {
            if ((this.n >= this.m && !aB()) || this.W[this.n] != str.charAt(i)) {
                g(str.substring(0, i));
            }
            i2 = this.n + 1;
            this.n = i2;
            i++;
        } while (i < length);
        if ((i2 < this.m || aB()) && (i3 = this.W[this.n] & 255) >= 48 && i3 != 93 && i3 != 125) {
            e(str, i, i3);
        }
    }

    private final void e(String str, int i, int i2) {
        if (Character.isJavaIdentifierPart((char) h(i2))) {
            g(str.substring(0, i));
        }
    }

    private final int aQ() {
        while (true) {
            int i = this.n;
            if (i < this.m) {
                byte[] bArr = this.W;
                int i2 = i + 1;
                this.n = i2;
                int i3 = bArr[i] & 255;
                if (i3 > 32) {
                    if (i3 == 47 || i3 == 35) {
                        this.n = i;
                        return aV();
                    }
                    return i3;
                } else if (i3 != 32) {
                    if (i3 == 10) {
                        this.f++;
                        this.h = i2;
                    } else if (i3 == 13) {
                        aF();
                    } else if (i3 != 9) {
                        j(i3);
                    }
                }
            } else {
                return aV();
            }
        }
    }

    private final int aV() {
        int i;
        while (true) {
            if (this.n < this.m || aB()) {
                byte[] bArr = this.W;
                int i2 = this.n;
                int i3 = i2 + 1;
                this.n = i3;
                i = bArr[i2] & 255;
                if (i > 32) {
                    if (i == 47) {
                        aP();
                    } else if (i != 35 || !aT()) {
                        break;
                    }
                } else if (i != 32) {
                    if (i == 10) {
                        this.f++;
                        this.h = i3;
                    } else if (i == 13) {
                        aF();
                    } else if (i != 9) {
                        j(i);
                    }
                }
            } else {
                throw d("Unexpected end-of-input within/between " + this.B.k() + " entries");
            }
        }
        return i;
    }

    private final int aU() {
        if (this.n >= this.m && !aB()) {
            return ab();
        }
        byte[] bArr = this.W;
        int i = this.n;
        int i2 = i + 1;
        this.n = i2;
        int i3 = bArr[i] & 255;
        if (i3 > 32) {
            if (i3 == 47 || i3 == 35) {
                this.n = i;
                return aS();
            }
            return i3;
        }
        if (i3 != 32) {
            if (i3 == 10) {
                this.f++;
                this.h = i2;
            } else if (i3 == 13) {
                aF();
            } else if (i3 != 9) {
                j(i3);
            }
        }
        while (true) {
            int i4 = this.n;
            if (i4 < this.m) {
                byte[] bArr2 = this.W;
                int i5 = i4 + 1;
                this.n = i5;
                int i6 = bArr2[i4] & 255;
                if (i6 > 32) {
                    if (i6 == 47 || i6 == 35) {
                        this.n = i4;
                        return aS();
                    }
                    return i6;
                } else if (i6 != 32) {
                    if (i6 == 10) {
                        this.f++;
                        this.h = i5;
                    } else if (i6 == 13) {
                        aF();
                    } else if (i6 != 9) {
                        j(i6);
                    }
                }
            } else {
                return aS();
            }
        }
    }

    private final int aS() {
        int i;
        while (true) {
            if (this.n < this.m || aB()) {
                byte[] bArr = this.W;
                int i2 = this.n;
                int i3 = i2 + 1;
                this.n = i3;
                i = bArr[i2] & 255;
                if (i > 32) {
                    if (i == 47) {
                        aP();
                    } else if (i != 35 || !aT()) {
                        break;
                    }
                } else if (i != 32) {
                    if (i == 10) {
                        this.f++;
                        this.h = i3;
                    } else if (i == 13) {
                        aF();
                    } else if (i != 9) {
                        j(i);
                    }
                }
            } else {
                return ab();
            }
        }
        return i;
    }

    private final int aK() {
        int i = this.n;
        if (i + 4 >= this.m) {
            return c(false);
        }
        byte[] bArr = this.W;
        byte b = bArr[i];
        if (b == 58) {
            int i2 = i + 1;
            this.n = i2;
            byte b2 = bArr[i2];
            if (b2 > 32) {
                if (b2 == 47 || b2 == 35) {
                    return c(true);
                }
                this.n = i + 2;
                return b2;
            }
            if (b2 == 32 || b2 == 9) {
                int i3 = i + 2;
                this.n = i3;
                byte b3 = bArr[i3];
                if (b3 > 32) {
                    if (b3 == 47 || b3 == 35) {
                        return c(true);
                    }
                    this.n = i + 3;
                    return b3;
                }
            }
            return c(true);
        }
        if (b == 32 || b == 9) {
            int i4 = i + 1;
            this.n = i4;
            b = bArr[i4];
        }
        if (b == 58) {
            int i5 = this.n;
            int i6 = i5 + 1;
            this.n = i6;
            byte b4 = bArr[i6];
            if (b4 > 32) {
                if (b4 == 47 || b4 == 35) {
                    return c(true);
                }
                this.n = i5 + 2;
                return b4;
            }
            if (b4 == 32 || b4 == 9) {
                int i7 = i5 + 2;
                this.n = i7;
                byte b5 = bArr[i7];
                if (b5 > 32) {
                    if (b5 == 47 || b5 == 35) {
                        return c(true);
                    }
                    this.n = i5 + 3;
                    return b5;
                }
            }
            return c(true);
        }
        return c(false);
    }

    private final int c(boolean z) {
        while (true) {
            if (this.n < this.m || aB()) {
                byte[] bArr = this.W;
                int i = this.n;
                int i2 = i + 1;
                this.n = i2;
                int i3 = bArr[i] & 255;
                if (i3 > 32) {
                    if (i3 == 47) {
                        aP();
                    } else if (i3 != 35 || !aT()) {
                        if (z) {
                            return i3;
                        }
                        if (i3 != 58) {
                            d(i3, "was expecting a colon to separate field name and value");
                        }
                        z = true;
                    }
                } else if (i3 != 32) {
                    if (i3 == 10) {
                        this.f++;
                        this.h = i2;
                    } else if (i3 == 13) {
                        aF();
                    } else if (i3 != 9) {
                        j(i3);
                    }
                }
            } else {
                e(" within/between " + this.B.k() + " entries", (JsonToken) null);
                return -1;
            }
        }
    }

    private final void aP() {
        if ((this.a & ad) == 0) {
            d(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.n >= this.m && !aB()) {
            e(" in a comment", (JsonToken) null);
        }
        byte[] bArr = this.W;
        int i = this.n;
        this.n = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 47) {
            aM();
        } else if (i2 == 42) {
            aH();
        } else {
            d(i2, "was expecting either '*' or '/' for a comment");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
        e(" in a comment", (com.fasterxml.jackson.core.JsonToken) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void aH() {
        /*
            r5 = this;
            int[] r0 = o.C9391oh.b()
        L4:
            int r1 = r5.n
            int r2 = r5.m
            if (r1 < r2) goto L10
            boolean r1 = r5.aB()
            if (r1 == 0) goto L43
        L10:
            byte[] r1 = r5.W
            int r2 = r5.n
            int r3 = r2 + 1
            r5.n = r3
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = r0[r1]
            if (r2 == 0) goto L4
            r4 = 2
            if (r2 == r4) goto L6e
            r4 = 3
            if (r2 == r4) goto L6a
            r4 = 4
            if (r2 == r4) goto L66
            r4 = 10
            if (r2 == r4) goto L5d
            r4 = 13
            if (r2 == r4) goto L59
            r4 = 42
            if (r2 == r4) goto L39
            r5.o(r1)
            goto L4
        L39:
            int r1 = r5.m
            if (r3 < r1) goto L4a
            boolean r1 = r5.aB()
            if (r1 != 0) goto L4a
        L43:
            java.lang.String r0 = " in a comment"
            r1 = 0
            r5.e(r0, r1)
            return
        L4a:
            byte[] r1 = r5.W
            int r2 = r5.n
            r1 = r1[r2]
            r3 = 47
            if (r1 != r3) goto L4
            int r2 = r2 + 1
            r5.n = r2
            return
        L59:
            r5.aF()
            goto L4
        L5d:
            int r1 = r5.f
            int r1 = r1 + 1
            r5.f = r1
            r5.h = r3
            goto L4
        L66:
            r5.y(r1)
            goto L4
        L6a:
            r5.aN()
            goto L4
        L6e:
            r5.aO()
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9374oQ.aH():void");
    }

    private final boolean aT() {
        if ((this.a & aj) == 0) {
            return false;
        }
        aM();
        return true;
    }

    private final void aM() {
        int[] b = C9391oh.b();
        while (true) {
            if (this.n >= this.m && !aB()) {
                return;
            }
            byte[] bArr = this.W;
            int i = this.n;
            int i2 = i + 1;
            this.n = i2;
            int i3 = bArr[i] & 255;
            int i4 = b[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    aO();
                } else if (i4 == 3) {
                    aN();
                } else if (i4 == 4) {
                    y(i3);
                } else if (i4 == 10) {
                    this.f++;
                    this.h = i2;
                    return;
                } else if (i4 == 13) {
                    aF();
                    return;
                } else if (i4 != 42 && i4 < 0) {
                    o(i3);
                }
            }
        }
    }

    @Override // o.AbstractC9386oc
    public char V() {
        if (this.n >= this.m && !aB()) {
            e(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        byte[] bArr = this.W;
        int i = this.n;
        this.n = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b != 98) {
            if (b != 102) {
                if (b != 110) {
                    if (b != 114) {
                        if (b != 116) {
                            if (b != 117) {
                                return b((char) h((int) b));
                            }
                            int i2 = 0;
                            for (int i3 = 0; i3 < 4; i3++) {
                                if (this.n >= this.m && !aB()) {
                                    e(" in character escape sequence", JsonToken.VALUE_STRING);
                                }
                                byte[] bArr2 = this.W;
                                int i4 = this.n;
                                this.n = i4 + 1;
                                byte b2 = bArr2[i4];
                                int e = C9391oh.e(b2);
                                if (e < 0) {
                                    d(b2 & 255, "expected a hex-digit for character escape sequence");
                                }
                                i2 = (i2 << 4) | e;
                            }
                            return (char) i2;
                        }
                        return '\t';
                    }
                    return '\r';
                }
                return '\n';
            }
            return '\f';
        }
        return '\b';
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int h(int r7) {
        /*
            r6 = this;
            r0 = r7 & 255(0xff, float:3.57E-43)
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L68
            r1 = r7 & 224(0xe0, float:3.14E-43)
            r2 = 1
            r3 = 2
            r4 = 192(0xc0, float:2.69E-43)
            if (r1 != r4) goto L11
            r0 = r7 & 31
            goto L28
        L11:
            r1 = r7 & 240(0xf0, float:3.36E-43)
            r4 = 224(0xe0, float:3.14E-43)
            if (r1 != r4) goto L1b
            r7 = r7 & 15
            r0 = r3
            goto L2a
        L1b:
            r1 = r7 & 248(0xf8, float:3.48E-43)
            r4 = 240(0xf0, float:3.36E-43)
            if (r1 != r4) goto L25
            r7 = r7 & 7
            r0 = 3
            goto L2a
        L25:
            r6.n(r0)
        L28:
            r7 = r0
            r0 = r2
        L2a:
            int r1 = r6.aY()
            r4 = r1 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L39
            r4 = r1 & 255(0xff, float:3.57E-43)
            r6.k(r4)
        L39:
            int r7 = r7 << 6
            r1 = r1 & 63
            r7 = r7 | r1
            if (r0 <= r2) goto L67
            int r1 = r6.aY()
            r2 = r1 & 192(0xc0, float:2.69E-43)
            if (r2 == r5) goto L4d
            r2 = r1 & 255(0xff, float:3.57E-43)
            r6.k(r2)
        L4d:
            int r7 = r7 << 6
            r1 = r1 & 63
            r7 = r7 | r1
            if (r0 <= r3) goto L67
            int r0 = r6.aY()
            r1 = r0 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L61
            r1 = r0 & 255(0xff, float:3.57E-43)
            r6.k(r1)
        L61:
            int r7 = r7 << 6
            r0 = r0 & 63
            r0 = r0 | r7
            goto L68
        L67:
            r0 = r7
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9374oQ.h(int):int");
    }

    private final int t(int i) {
        if (this.n >= this.m) {
            az();
        }
        byte[] bArr = this.W;
        int i2 = this.n;
        int i3 = i2 + 1;
        this.n = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            e(b & 255, i3);
        }
        return ((i & 31) << 6) | (b & 63);
    }

    private final int p(int i) {
        if (this.n >= this.m) {
            az();
        }
        byte[] bArr = this.W;
        int i2 = this.n;
        int i3 = i2 + 1;
        this.n = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            e(b & 255, i3);
        }
        if (this.n >= this.m) {
            az();
        }
        byte[] bArr2 = this.W;
        int i4 = this.n;
        int i5 = i4 + 1;
        this.n = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            e(b2 & 255, i5);
        }
        return ((((i & 15) << 6) | (b & 63)) << 6) | (b2 & 63);
    }

    private final int q(int i) {
        byte[] bArr = this.W;
        int i2 = this.n;
        int i3 = i2 + 1;
        this.n = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            e(b & 255, i3);
        }
        byte[] bArr2 = this.W;
        int i4 = this.n;
        int i5 = i4 + 1;
        this.n = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            e(b2 & 255, i5);
        }
        return ((((i & 15) << 6) | (b & 63)) << 6) | (b2 & 63);
    }

    private final int v(int i) {
        if (this.n >= this.m) {
            az();
        }
        byte[] bArr = this.W;
        int i2 = this.n;
        int i3 = i2 + 1;
        this.n = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            e(b & 255, i3);
        }
        if (this.n >= this.m) {
            az();
        }
        byte[] bArr2 = this.W;
        int i4 = this.n;
        int i5 = i4 + 1;
        this.n = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            e(b2 & 255, i5);
        }
        if (this.n >= this.m) {
            az();
        }
        byte[] bArr3 = this.W;
        int i6 = this.n;
        int i7 = i6 + 1;
        this.n = i7;
        byte b3 = bArr3[i6];
        if ((b3 & 192) != 128) {
            e(b3 & 255, i7);
        }
        return (((((((i & 7) << 6) | (b & 63)) << 6) | (b2 & 63)) << 6) | (b3 & 63)) - AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
    }

    private final void aO() {
        if (this.n >= this.m) {
            az();
        }
        byte[] bArr = this.W;
        int i = this.n;
        int i2 = i + 1;
        this.n = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            e(b & 255, i2);
        }
    }

    private final void aN() {
        if (this.n >= this.m) {
            az();
        }
        byte[] bArr = this.W;
        int i = this.n;
        int i2 = i + 1;
        this.n = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            e(b & 255, i2);
        }
        if (this.n >= this.m) {
            az();
        }
        byte[] bArr2 = this.W;
        int i3 = this.n;
        int i4 = i3 + 1;
        this.n = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            e(b2 & 255, i4);
        }
    }

    private final void y(int i) {
        if (this.n >= this.m) {
            az();
        }
        byte[] bArr = this.W;
        int i2 = this.n;
        int i3 = i2 + 1;
        this.n = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            e(b & 255, i3);
        }
        if (this.n >= this.m) {
            az();
        }
        byte[] bArr2 = this.W;
        int i4 = this.n;
        int i5 = i4 + 1;
        this.n = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            e(b2 & 255, i5);
        }
        if (this.n >= this.m) {
            az();
        }
        byte[] bArr3 = this.W;
        int i6 = this.n;
        int i7 = i6 + 1;
        this.n = i7;
        byte b3 = bArr3[i6];
        if ((b3 & 192) != 128) {
            e(b3 & 255, i7);
        }
    }

    protected final void aF() {
        if (this.n < this.m || aB()) {
            byte[] bArr = this.W;
            int i = this.n;
            if (bArr[i] == 10) {
                this.n = i + 1;
            }
        }
        this.f++;
        this.h = this.n;
    }

    private int aY() {
        if (this.n >= this.m) {
            az();
        }
        byte[] bArr = this.W;
        int i = this.n;
        this.n = i + 1;
        return bArr[i] & 255;
    }

    protected void g(String str) {
        c(str, ag());
    }

    protected void c(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.n >= this.m && !aB()) {
                break;
            }
            byte[] bArr = this.W;
            int i = this.n;
            this.n = i + 1;
            char h = (char) h(bArr[i]);
            if (!Character.isJavaIdentifierPart(h)) {
                break;
            }
            sb.append(h);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        d("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    protected void o(int i) {
        if (i < 32) {
            j(i);
        }
        n(i);
    }

    protected void n(int i) {
        f("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    protected void k(int i) {
        f("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    protected void e(int i, int i2) {
        this.n = i2;
        k(i);
    }

    protected final byte[] a(Base64Variant base64Variant) {
        C9439pc Z = Z();
        while (true) {
            if (this.n >= this.m) {
                az();
            }
            byte[] bArr = this.W;
            int i = this.n;
            this.n = i + 1;
            int i2 = bArr[i] & 255;
            if (i2 > 32) {
                int e = base64Variant.e(i2);
                if (e < 0) {
                    if (i2 == 34) {
                        return Z.i();
                    }
                    e = e(base64Variant, i2, 0);
                    if (e < 0) {
                        continue;
                    }
                }
                if (this.n >= this.m) {
                    az();
                }
                byte[] bArr2 = this.W;
                int i3 = this.n;
                this.n = i3 + 1;
                int i4 = bArr2[i3] & 255;
                int e2 = base64Variant.e(i4);
                if (e2 < 0) {
                    e2 = e(base64Variant, i4, 1);
                }
                int i5 = (e << 6) | e2;
                if (this.n >= this.m) {
                    az();
                }
                byte[] bArr3 = this.W;
                int i6 = this.n;
                this.n = i6 + 1;
                int i7 = bArr3[i6] & 255;
                int e3 = base64Variant.e(i7);
                if (e3 < 0) {
                    if (e3 != -2) {
                        if (i7 == 34) {
                            Z.a(i5 >> 4);
                            if (base64Variant.h()) {
                                this.n--;
                                d(base64Variant);
                            }
                            return Z.i();
                        }
                        e3 = e(base64Variant, i7, 2);
                    }
                    if (e3 == -2) {
                        if (this.n >= this.m) {
                            az();
                        }
                        byte[] bArr4 = this.W;
                        int i8 = this.n;
                        this.n = i8 + 1;
                        int i9 = bArr4[i8] & 255;
                        if (!base64Variant.b(i9) && e(base64Variant, i9, 3) != -2) {
                            throw a(base64Variant, i9, 3, "expected padding character '" + base64Variant.j() + "'");
                        }
                        Z.a(i5 >> 4);
                    }
                }
                int i10 = (i5 << 6) | e3;
                if (this.n >= this.m) {
                    az();
                }
                byte[] bArr5 = this.W;
                int i11 = this.n;
                this.n = i11 + 1;
                int i12 = bArr5[i11] & 255;
                int e4 = base64Variant.e(i12);
                if (e4 < 0) {
                    if (e4 != -2) {
                        if (i12 == 34) {
                            Z.c(i10 >> 2);
                            if (base64Variant.h()) {
                                this.n--;
                                d(base64Variant);
                            }
                            return Z.i();
                        }
                        e4 = e(base64Variant, i12, 3);
                    }
                    if (e4 == -2) {
                        Z.c(i10 >> 2);
                    }
                }
                Z.d((i10 << 6) | e4);
            }
        }
    }

    @Override // o.AbstractC9386oc, com.fasterxml.jackson.core.JsonParser
    public JsonLocation G() {
        if (this.P == JsonToken.FIELD_NAME) {
            return new JsonLocation(U(), this.j + (this.Z - 1), -1L, this.Y, this.V);
        }
        return new JsonLocation(U(), this.F - 1, -1L, this.G, this.I);
    }

    @Override // o.AbstractC9386oc, com.fasterxml.jackson.core.JsonParser
    public JsonLocation k() {
        return new JsonLocation(U(), this.j + this.n, -1L, this.f, (this.n - this.h) + 1);
    }

    private final JsonToken r(int i) {
        if (i == 125) {
            aI();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            this.P = jsonToken;
            return jsonToken;
        }
        aJ();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        this.P = jsonToken2;
        return jsonToken2;
    }

    private final void aJ() {
        aR();
        if (!this.B.h()) {
            e(93, '}');
        }
        this.B = this.B.n();
    }

    private final void aI() {
        aR();
        if (!this.B.g()) {
            e(125, ']');
        }
        this.B = this.B.n();
    }
}
