package o;

import androidx.appcompat.widget.ActivityChooserModel;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.netflix.ale.AleCryptoBouncyCastle;
import java.io.DataInput;
import java.io.EOFException;
import java.io.OutputStream;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.oJ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9367oJ extends AbstractC9386oc {
    protected DataInput U;
    protected int[] V;
    protected ObjectCodec W;
    protected int X;
    protected final C9377oT aa;
    protected boolean ab;
    private int aj;
    private static final int ad = JsonParser.Feature.ALLOW_TRAILING_COMMA.b();
    private static final int ah = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.b();
    private static final int af = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.b();
    private static final int Y = JsonParser.Feature.ALLOW_MISSING_VALUES.b();
    private static final int Z = JsonParser.Feature.ALLOW_SINGLE_QUOTES.b();
    private static final int ae = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.b();
    private static final int ac = JsonParser.Feature.ALLOW_COMMENTS.b();
    private static final int ag = JsonParser.Feature.ALLOW_YAML_COMMENTS.b();
    private static final int[] am = C9391oh.d();
    protected static final int[] T = C9391oh.a();

    private static final int f(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    @Override // o.AbstractC9386oc
    public void W() {
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec n() {
        return this.W;
    }

    public C9367oJ(C9389of c9389of, int i, DataInput dataInput, ObjectCodec objectCodec, C9377oT c9377oT, int i2) {
        super(c9389of, i);
        this.V = new int[16];
        this.W = objectCodec;
        this.aa = c9377oT;
        this.U = dataInput;
        this.X = i2;
    }

    @Override // o.AbstractC9386oc
    public void af() {
        super.af();
        this.aa.a();
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public String A() {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.ab) {
                this.ab = false;
                return ay();
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
        } else if (this.ab) {
            this.ab = false;
            return ay();
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
        } else if (this.ab) {
            this.ab = false;
            return ay();
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
                } else if (this.ab) {
                    this.ab = false;
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
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.ab) {
                this.ab = false;
                Y();
            }
            return this.A.l();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return this.B.c().length();
        } else {
            if (jsonToken != null) {
                if (jsonToken.e()) {
                    return this.A.l();
                }
                return this.P.d().length;
            }
            return 0;
        }
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
            boolean r0 = r3.ab
            if (r0 == 0) goto L1d
            r3.ab = r1
            r3.Y()
        L1d:
            o.pg r0 = r3.A
            int r0 = r0.i()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9367oJ.H():int");
    }

    @Override // o.AbstractC9386oc, com.fasterxml.jackson.core.JsonParser
    public byte[] e(Base64Variant base64Variant) {
        JsonToken jsonToken = this.P;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this.b == null)) {
            f("Current token (" + this.P + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.ab) {
            try {
                this.b = a(base64Variant);
                this.ab = false;
            } catch (IllegalArgumentException e) {
                throw d("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e.getMessage());
            }
        } else if (this.b == null) {
            C9439pc Z2 = Z();
            a(A(), Z2, base64Variant);
            this.b = Z2.i();
        }
        return this.b;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int e(Base64Variant base64Variant, OutputStream outputStream) {
        if (!this.ab || this.P != JsonToken.VALUE_STRING) {
            byte[] e = e(base64Variant);
            outputStream.write(e);
            return e.length;
        }
        byte[] c = this.q.c();
        try {
            return a(base64Variant, outputStream, c);
        } finally {
            this.q.b(c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d2, code lost:
        r12.ab = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d4, code lost:
        if (r2 <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
        r3 = r3 + r2;
        r14.write(r15, 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00da, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int a(com.fasterxml.jackson.core.Base64Variant r13, java.io.OutputStream r14, byte[] r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9367oJ.a(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public JsonToken Q() {
        JsonToken h;
        if (this.i) {
            return null;
        }
        JsonToken jsonToken = this.P;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return aE();
        }
        this.r = 0;
        if (this.ab) {
            aB();
        }
        int aM = aM();
        if (aM < 0) {
            close();
            this.P = null;
            return null;
        }
        this.b = null;
        this.G = this.f;
        if (aM == 93 || aM == 125) {
            m(aM);
            return this.P;
        }
        if (this.B.o()) {
            if (aM != 44) {
                d(aM, "was expecting comma to separate " + this.B.k() + " entries");
            }
            aM = aJ();
            if ((this.a & ad) != 0 && (aM == 93 || aM == 125)) {
                m(aM);
                return this.P;
            }
        }
        if (!this.B.g()) {
            return t(aM);
        }
        this.B.d(k(aM));
        this.P = jsonToken2;
        int aG = aG();
        if (aG == 34) {
            this.ab = true;
            this.p = JsonToken.VALUE_STRING;
            return this.P;
        }
        if (aG != 43) {
            if (aG == 91) {
                h = JsonToken.START_ARRAY;
            } else if (aG == 102) {
                d("false", 1);
                h = JsonToken.VALUE_FALSE;
            } else if (aG == 110) {
                d("null", 1);
                h = JsonToken.VALUE_NULL;
            } else if (aG == 116) {
                d("true", 1);
                h = JsonToken.VALUE_TRUE;
            } else if (aG == 123) {
                h = JsonToken.START_OBJECT;
            } else if (aG == 45) {
                h = aA();
            } else if (aG == 46) {
                h = a(false, false);
            } else {
                switch (aG) {
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
                        h = l(aG);
                        break;
                    default:
                        h = h(aG);
                        break;
                }
            }
        } else if (a(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e())) {
            h = az();
        } else {
            h = h(aG);
        }
        this.p = h;
        return this.P;
    }

    private final JsonToken t(int i) {
        if (i == 34) {
            this.ab = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.P = jsonToken;
            return jsonToken;
        } else if (i == 43) {
            if (a(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e())) {
                JsonToken az = az();
                this.P = az;
                return az;
            }
            JsonToken h = h(i);
            this.P = h;
            return h;
        } else if (i == 91) {
            this.B = this.B.a(this.G, this.I);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.P = jsonToken2;
            return jsonToken2;
        } else if (i == 102) {
            d("false", 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this.P = jsonToken3;
            return jsonToken3;
        } else if (i == 110) {
            d("null", 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this.P = jsonToken4;
            return jsonToken4;
        } else if (i == 116) {
            d("true", 1);
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this.P = jsonToken5;
            return jsonToken5;
        } else if (i == 123) {
            this.B = this.B.c(this.G, this.I);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this.P = jsonToken6;
            return jsonToken6;
        } else if (i == 45) {
            JsonToken aA = aA();
            this.P = aA;
            return aA;
        } else if (i == 46) {
            JsonToken a = a(false, false);
            this.P = a;
            return a;
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
                    JsonToken h2 = h(i);
                    this.P = h2;
                    return h2;
            }
        }
    }

    private final JsonToken aE() {
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
        JsonToken h;
        this.r = 0;
        JsonToken jsonToken = this.P;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            aE();
            return null;
        }
        if (this.ab) {
            aB();
        }
        int aJ = aJ();
        this.b = null;
        this.G = this.f;
        if (aJ == 93 || aJ == 125) {
            m(aJ);
            return null;
        }
        if (this.B.o()) {
            if (aJ != 44) {
                d(aJ, "was expecting comma to separate " + this.B.k() + " entries");
            }
            aJ = aJ();
            if ((this.a & ad) != 0 && (aJ == 93 || aJ == 125)) {
                m(aJ);
                return null;
            }
        }
        if (!this.B.g()) {
            t(aJ);
            return null;
        }
        String k = k(aJ);
        this.B.d(k);
        this.P = jsonToken2;
        int aG = aG();
        if (aG == 34) {
            this.ab = true;
            this.p = JsonToken.VALUE_STRING;
            return k;
        }
        if (aG != 43) {
            if (aG == 91) {
                h = JsonToken.START_ARRAY;
            } else if (aG == 102) {
                d("false", 1);
                h = JsonToken.VALUE_FALSE;
            } else if (aG == 110) {
                d("null", 1);
                h = JsonToken.VALUE_NULL;
            } else if (aG == 116) {
                d("true", 1);
                h = JsonToken.VALUE_TRUE;
            } else if (aG == 123) {
                h = JsonToken.START_OBJECT;
            } else if (aG == 45) {
                h = aA();
            } else {
                if (aG == 46) {
                    a(false, false);
                } else {
                    switch (aG) {
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
                            break;
                        default:
                            h = h(aG);
                            break;
                    }
                }
                h = l(aG);
            }
        } else if (a(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e())) {
            h = az();
        } else {
            h = h(aG);
        }
        this.p = h;
        return k;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String S() {
        if (this.P == JsonToken.FIELD_NAME) {
            this.s = false;
            JsonToken jsonToken = this.p;
            this.p = null;
            this.P = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this.ab) {
                    this.ab = false;
                    return ay();
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

    protected final JsonToken a(boolean z, boolean z2) {
        if (!a(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.e())) {
            return h(46);
        }
        char[] e = this.A.e();
        int i = 0;
        if (z) {
            e[0] = '-';
            i = 1;
        }
        return c(e, i, 46, z, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.fasterxml.jackson.core.JsonToken l(int r13) {
        /*
            r12 = this;
            o.pg r0 = r12.A
            char[] r0 = r0.e()
            r1 = 57
            r2 = 0
            r3 = 1
            r4 = 48
            if (r13 != r4) goto L29
            int r13 = r12.aD()
            if (r13 > r1) goto L18
            if (r13 < r4) goto L18
            r5 = r2
            goto L33
        L18:
            r5 = 120(0x78, float:1.68E-43)
            if (r13 == r5) goto L24
            r5 = 88
            if (r13 != r5) goto L21
            goto L24
        L21:
            r0[r2] = r4
            goto L32
        L24:
            com.fasterxml.jackson.core.JsonToken r13 = r12.d(r13, r2)
            return r13
        L29:
            char r13 = (char) r13
            r0[r2] = r13
            java.io.DataInput r13 = r12.U
            int r13 = r13.readUnsignedByte()
        L32:
            r5 = r3
        L33:
            r9 = r13
            r7 = r0
            r8 = r5
            r11 = r8
        L37:
            if (r9 > r1) goto L53
            if (r9 < r4) goto L53
            int r11 = r11 + 1
            int r13 = r7.length
            if (r8 < r13) goto L48
            o.pg r13 = r12.A
            char[] r13 = r13.d()
            r7 = r13
            r8 = r2
        L48:
            char r13 = (char) r9
            r7[r8] = r13
            java.io.DataInput r13 = r12.U
            int r9 = r13.readUnsignedByte()
            int r8 = r8 + r3
            goto L37
        L53:
            r13 = 46
            if (r9 == r13) goto L78
            r13 = 101(0x65, float:1.42E-43)
            if (r9 == r13) goto L78
            r13 = 69
            if (r9 != r13) goto L60
            goto L78
        L60:
            o.pg r13 = r12.A
            r13.b(r8)
            o.oG r13 = r12.B
            boolean r13 = r13.i()
            if (r13 == 0) goto L71
            r12.aP()
            goto L73
        L71:
            r12.X = r9
        L73:
            com.fasterxml.jackson.core.JsonToken r13 = r12.d(r2, r11)
            return r13
        L78:
            r10 = 0
            r6 = r12
            com.fasterxml.jackson.core.JsonToken r13 = r6.c(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9367oJ.l(int):com.fasterxml.jackson.core.JsonToken");
    }

    protected final JsonToken az() {
        return e(false);
    }

    protected final JsonToken aA() {
        return e(true);
    }

    private final JsonToken e(boolean z) {
        int i;
        int readUnsignedByte;
        char[] e = this.A.e();
        if (z) {
            e[0] = '-';
            i = 1;
        } else {
            i = 0;
        }
        int readUnsignedByte2 = this.U.readUnsignedByte();
        e[i] = (char) readUnsignedByte2;
        if (readUnsignedByte2 <= 48) {
            if (readUnsignedByte2 != 48) {
                if (readUnsignedByte2 == 46) {
                    return a(z, true);
                }
                return b(readUnsignedByte2, z, true);
            }
            readUnsignedByte = aD();
        } else if (readUnsignedByte2 > 57) {
            return b(readUnsignedByte2, z, true);
        } else {
            readUnsignedByte = this.U.readUnsignedByte();
        }
        char[] cArr = e;
        int i2 = 1;
        int i3 = i + 1;
        int i4 = readUnsignedByte;
        while (i4 <= 57 && i4 >= 48) {
            i2++;
            if (i3 >= cArr.length) {
                cArr = this.A.d();
                i3 = 0;
            }
            cArr[i3] = (char) i4;
            i4 = this.U.readUnsignedByte();
            i3++;
        }
        if (i4 == 46 || i4 == 101 || i4 == 69) {
            return c(cArr, i3, i4, z, i2);
        }
        this.A.b(i3);
        this.X = i4;
        if (this.B.i()) {
            aP();
        }
        return d(z, i2);
    }

    private final int aD() {
        int readUnsignedByte = this.U.readUnsignedByte();
        if (readUnsignedByte >= 48 && readUnsignedByte <= 57) {
            if ((this.a & ah) == 0) {
                h("Leading zeroes not allowed");
            }
            while (readUnsignedByte == 48) {
                readUnsignedByte = this.U.readUnsignedByte();
            }
        }
        return readUnsignedByte;
    }

    private final JsonToken c(char[] cArr, int i, int i2, boolean z, int i3) {
        int i4;
        int readUnsignedByte;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this.A.d();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            int i6 = 0;
            while (true) {
                readUnsignedByte = this.U.readUnsignedByte();
                if (readUnsignedByte < 48 || readUnsignedByte > 57) {
                    break;
                }
                i6++;
                if (i >= cArr.length) {
                    cArr = this.A.d();
                    i = 0;
                }
                cArr[i] = (char) readUnsignedByte;
                i++;
            }
            if (i6 == 0 && !a(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.e())) {
                a(readUnsignedByte, "Decimal point not followed by a digit");
            }
            i4 = i6;
            i2 = readUnsignedByte;
        } else {
            i4 = 0;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this.A.d();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) i2;
            int readUnsignedByte2 = this.U.readUnsignedByte();
            if (readUnsignedByte2 == 45 || readUnsignedByte2 == 43) {
                if (i7 >= cArr.length) {
                    cArr = this.A.d();
                    i7 = 0;
                }
                cArr[i7] = (char) readUnsignedByte2;
                readUnsignedByte2 = this.U.readUnsignedByte();
                i7++;
            }
            i2 = readUnsignedByte2;
            i = i7;
            int i8 = 0;
            while (i2 <= 57 && i2 >= 48) {
                i8++;
                if (i >= cArr.length) {
                    cArr = this.A.d();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i2 = this.U.readUnsignedByte();
                i++;
            }
            if (i8 == 0) {
                a(i2, "Exponent indicator not followed by a digit");
            }
            i5 = i8;
        }
        this.X = i2;
        if (this.B.i()) {
            aP();
        }
        this.A.b(i);
        return a(z, i3, i4, i5);
    }

    private final void aP() {
        int i = this.X;
        if (i > 32) {
            g(i);
            return;
        }
        this.X = -1;
        if (i == 13 || i == 10) {
            this.f++;
        }
    }

    protected final String k(int i) {
        if (i != 34) {
            return i(i);
        }
        int[] iArr = T;
        int readUnsignedByte = this.U.readUnsignedByte();
        if (iArr[readUnsignedByte] != 0) {
            return readUnsignedByte == 34 ? "" : e(0, readUnsignedByte, 0);
        }
        int readUnsignedByte2 = this.U.readUnsignedByte();
        if (iArr[readUnsignedByte2] != 0) {
            if (readUnsignedByte2 == 34) {
                return e(readUnsignedByte, 1);
            }
            return e(readUnsignedByte, readUnsignedByte2, 1);
        }
        int i2 = (readUnsignedByte << 8) | readUnsignedByte2;
        int readUnsignedByte3 = this.U.readUnsignedByte();
        if (iArr[readUnsignedByte3] != 0) {
            if (readUnsignedByte3 == 34) {
                return e(i2, 2);
            }
            return e(i2, readUnsignedByte3, 2);
        }
        int i3 = (i2 << 8) | readUnsignedByte3;
        int readUnsignedByte4 = this.U.readUnsignedByte();
        if (iArr[readUnsignedByte4] != 0) {
            if (readUnsignedByte4 == 34) {
                return e(i3, 3);
            }
            return e(i3, readUnsignedByte4, 3);
        }
        int i4 = (i3 << 8) | readUnsignedByte4;
        int readUnsignedByte5 = this.U.readUnsignedByte();
        if (iArr[readUnsignedByte5] == 0) {
            this.aj = i4;
            return r(readUnsignedByte5);
        } else if (readUnsignedByte5 == 34) {
            return e(i4, 4);
        } else {
            return e(i4, readUnsignedByte5, 4);
        }
    }

    private final String r(int i) {
        int[] iArr = T;
        int readUnsignedByte = this.U.readUnsignedByte();
        if (iArr[readUnsignedByte] != 0) {
            if (readUnsignedByte == 34) {
                return b(this.aj, i, 1);
            }
            return c(this.aj, i, readUnsignedByte, 1);
        }
        int i2 = (i << 8) | readUnsignedByte;
        int readUnsignedByte2 = this.U.readUnsignedByte();
        if (iArr[readUnsignedByte2] != 0) {
            if (readUnsignedByte2 == 34) {
                return b(this.aj, i2, 2);
            }
            return c(this.aj, i2, readUnsignedByte2, 2);
        }
        int i3 = (i2 << 8) | readUnsignedByte2;
        int readUnsignedByte3 = this.U.readUnsignedByte();
        if (iArr[readUnsignedByte3] != 0) {
            if (readUnsignedByte3 == 34) {
                return b(this.aj, i3, 3);
            }
            return c(this.aj, i3, readUnsignedByte3, 3);
        }
        int i4 = (i3 << 8) | readUnsignedByte3;
        int readUnsignedByte4 = this.U.readUnsignedByte();
        if (iArr[readUnsignedByte4] != 0) {
            if (readUnsignedByte4 == 34) {
                return b(this.aj, i4, 4);
            }
            return c(this.aj, i4, readUnsignedByte4, 4);
        }
        return a(readUnsignedByte4, i4);
    }

    private final String a(int i, int i2) {
        int[] iArr = T;
        int readUnsignedByte = this.U.readUnsignedByte();
        if (iArr[readUnsignedByte] != 0) {
            if (readUnsignedByte == 34) {
                return e(this.aj, i2, i, 1);
            }
            return a(this.aj, i2, i, readUnsignedByte, 1);
        }
        int i3 = (i << 8) | readUnsignedByte;
        int readUnsignedByte2 = this.U.readUnsignedByte();
        if (iArr[readUnsignedByte2] != 0) {
            if (readUnsignedByte2 == 34) {
                return e(this.aj, i2, i3, 2);
            }
            return a(this.aj, i2, i3, readUnsignedByte2, 2);
        }
        int i4 = (i3 << 8) | readUnsignedByte2;
        int readUnsignedByte3 = this.U.readUnsignedByte();
        if (iArr[readUnsignedByte3] != 0) {
            if (readUnsignedByte3 == 34) {
                return e(this.aj, i2, i4, 3);
            }
            return a(this.aj, i2, i4, readUnsignedByte3, 3);
        }
        int i5 = (i4 << 8) | readUnsignedByte3;
        int readUnsignedByte4 = this.U.readUnsignedByte();
        if (iArr[readUnsignedByte4] != 0) {
            if (readUnsignedByte4 == 34) {
                return e(this.aj, i2, i5, 4);
            }
            return a(this.aj, i2, i5, readUnsignedByte4, 4);
        }
        return c(readUnsignedByte4, i2, i5);
    }

    private final String c(int i, int i2, int i3) {
        int[] iArr = this.V;
        iArr[0] = this.aj;
        iArr[1] = i2;
        iArr[2] = i3;
        int[] iArr2 = T;
        int i4 = i;
        int i5 = 3;
        while (true) {
            int readUnsignedByte = this.U.readUnsignedByte();
            if (iArr2[readUnsignedByte] != 0) {
                if (readUnsignedByte == 34) {
                    return d(this.V, i5, i4, 1);
                }
                return b(this.V, i5, i4, readUnsignedByte, 1);
            }
            int i6 = (i4 << 8) | readUnsignedByte;
            int readUnsignedByte2 = this.U.readUnsignedByte();
            if (iArr2[readUnsignedByte2] != 0) {
                if (readUnsignedByte2 == 34) {
                    return d(this.V, i5, i6, 2);
                }
                return b(this.V, i5, i6, readUnsignedByte2, 2);
            }
            int i7 = (i6 << 8) | readUnsignedByte2;
            int readUnsignedByte3 = this.U.readUnsignedByte();
            if (iArr2[readUnsignedByte3] != 0) {
                if (readUnsignedByte3 == 34) {
                    return d(this.V, i5, i7, 3);
                }
                return b(this.V, i5, i7, readUnsignedByte3, 3);
            }
            int i8 = (i7 << 8) | readUnsignedByte3;
            int readUnsignedByte4 = this.U.readUnsignedByte();
            if (iArr2[readUnsignedByte4] != 0) {
                if (readUnsignedByte4 == 34) {
                    return d(this.V, i5, i8, 4);
                }
                return b(this.V, i5, i8, readUnsignedByte4, 4);
            }
            int[] iArr3 = this.V;
            if (i5 >= iArr3.length) {
                this.V = c(iArr3, i5);
            }
            this.V[i5] = i8;
            i5++;
            i4 = readUnsignedByte4;
        }
    }

    private final String e(int i, int i2, int i3) {
        return b(this.V, 0, i, i2, i3);
    }

    private final String c(int i, int i2, int i3, int i4) {
        int[] iArr = this.V;
        iArr[0] = i;
        return b(iArr, 1, i2, i3, i4);
    }

    private final String a(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.V;
        iArr[0] = i;
        iArr[1] = i2;
        return b(iArr, 2, i3, i4, i5);
    }

    protected final String b(int[] iArr, int i, int i2, int i3, int i4) {
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
                            iArr = c(iArr, iArr.length);
                            this.V = iArr;
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
                                iArr = c(iArr, iArr.length);
                                this.V = iArr;
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
                    iArr = c(iArr, iArr.length);
                    this.V = iArr;
                }
                iArr[i] = i2;
                i++;
                i2 = i3;
                i4 = 1;
            }
            i3 = this.U.readUnsignedByte();
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                iArr = c(iArr, iArr.length);
                this.V = iArr;
            }
            iArr[i] = f(i2, i4);
            i++;
        }
        String d = this.aa.d(iArr, i);
        return d == null ? c(iArr, i, i4) : d;
    }

    protected String i(int i) {
        if (i == 39 && (this.a & Z) != 0) {
            return ax();
        }
        if ((this.a & ae) == 0) {
            d((char) f(i), "was expecting double-quote to start field name");
        }
        int[] f = C9391oh.f();
        if (f[i] != 0) {
            d(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr = this.V;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        do {
            if (i2 < 4) {
                i2++;
                i |= i4 << 8;
            } else {
                if (i3 >= iArr.length) {
                    iArr = c(iArr, iArr.length);
                    this.V = iArr;
                }
                iArr[i3] = i4;
                i3++;
                i2 = 1;
            }
            i4 = i;
            i = this.U.readUnsignedByte();
        } while (f[i] == 0);
        this.X = i;
        if (i2 > 0) {
            if (i3 >= iArr.length) {
                int[] c = c(iArr, iArr.length);
                this.V = c;
                iArr = c;
            }
            iArr[i3] = i4;
            i3++;
        }
        String d = this.aa.d(iArr, i3);
        return d == null ? c(iArr, i3, i2) : d;
    }

    protected String ax() {
        int readUnsignedByte = this.U.readUnsignedByte();
        if (readUnsignedByte == 39) {
            return "";
        }
        int[] iArr = this.V;
        int[] iArr2 = T;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (readUnsignedByte != 39) {
            if (readUnsignedByte != 34 && iArr2[readUnsignedByte] != 0) {
                if (readUnsignedByte != 92) {
                    b(readUnsignedByte, "name");
                } else {
                    readUnsignedByte = V();
                }
                if (readUnsignedByte > 127) {
                    if (i >= 4) {
                        if (i2 >= iArr.length) {
                            iArr = c(iArr, iArr.length);
                            this.V = iArr;
                        }
                        iArr[i2] = i3;
                        i2++;
                        i = 0;
                        i3 = 0;
                    }
                    int i4 = i3 << 8;
                    if (readUnsignedByte < 2048) {
                        i3 = i4 | (readUnsignedByte >> 6) | 192;
                        i++;
                    } else {
                        int i5 = i4 | (readUnsignedByte >> 12) | 224;
                        int i6 = i + 1;
                        if (i6 >= 4) {
                            if (i2 >= iArr.length) {
                                iArr = c(iArr, iArr.length);
                                this.V = iArr;
                            }
                            iArr[i2] = i5;
                            i2++;
                            i6 = 0;
                            i5 = 0;
                        }
                        i3 = (i5 << 8) | ((readUnsignedByte >> 6) & 63) | 128;
                        i = i6 + 1;
                    }
                    readUnsignedByte = (readUnsignedByte & 63) | 128;
                }
            }
            if (i < 4) {
                i++;
                i3 = readUnsignedByte | (i3 << 8);
            } else {
                if (i2 >= iArr.length) {
                    iArr = c(iArr, iArr.length);
                    this.V = iArr;
                }
                iArr[i2] = i3;
                i2++;
                i3 = readUnsignedByte;
                i = 1;
            }
            readUnsignedByte = this.U.readUnsignedByte();
        }
        if (i > 0) {
            if (i2 >= iArr.length) {
                int[] c = c(iArr, iArr.length);
                this.V = c;
                iArr = c;
            }
            iArr[i2] = f(i3, i);
            i2++;
        }
        String d = this.aa.d(iArr, i2);
        return d == null ? c(iArr, i2, i) : d;
    }

    private final String e(int i, int i2) {
        int f = f(i, i2);
        String c = this.aa.c(f);
        if (c != null) {
            return c;
        }
        int[] iArr = this.V;
        iArr[0] = f;
        return c(iArr, 1, i2);
    }

    private final String b(int i, int i2, int i3) {
        int f = f(i2, i3);
        String e = this.aa.e(i, f);
        if (e != null) {
            return e;
        }
        int[] iArr = this.V;
        iArr[0] = i;
        iArr[1] = f;
        return c(iArr, 2, i3);
    }

    private final String e(int i, int i2, int i3, int i4) {
        int f = f(i3, i4);
        String e = this.aa.e(i, i2, f);
        if (e != null) {
            return e;
        }
        int[] iArr = this.V;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = f(f, i4);
        return c(iArr, 3, i4);
    }

    private final String d(int[] iArr, int i, int i2, int i3) {
        if (i >= iArr.length) {
            iArr = c(iArr, iArr.length);
            this.V = iArr;
        }
        int i4 = i + 1;
        iArr[i] = f(i2, i3);
        String d = this.aa.d(iArr, i4);
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
        throw new UnsupportedOperationException("Method not decompiled: o.C9367oJ.c(int[], int, int):java.lang.String");
    }

    @Override // o.AbstractC9386oc
    public void Y() {
        char[] e = this.A.e();
        int[] iArr = am;
        int length = e.length;
        int i = 0;
        while (true) {
            int readUnsignedByte = this.U.readUnsignedByte();
            if (iArr[readUnsignedByte] != 0) {
                if (readUnsignedByte == 34) {
                    this.A.b(i);
                    return;
                } else {
                    d(e, i, readUnsignedByte);
                    return;
                }
            }
            int i2 = i + 1;
            e[i] = (char) readUnsignedByte;
            if (i2 >= length) {
                d(e, i2, this.U.readUnsignedByte());
                return;
            }
            i = i2;
        }
    }

    private String ay() {
        char[] e = this.A.e();
        int[] iArr = am;
        int length = e.length;
        int i = 0;
        while (true) {
            int readUnsignedByte = this.U.readUnsignedByte();
            if (iArr[readUnsignedByte] != 0) {
                if (readUnsignedByte == 34) {
                    return this.A.d(i);
                }
                d(e, i, readUnsignedByte);
                return this.A.a();
            }
            int i2 = i + 1;
            e[i] = (char) readUnsignedByte;
            if (i2 >= length) {
                d(e, i2, this.U.readUnsignedByte());
                return this.A.a();
            }
            i = i2;
        }
    }

    private final void d(char[] cArr, int i, int i2) {
        int[] iArr = am;
        int length = cArr.length;
        while (true) {
            int i3 = iArr[i2];
            int i4 = 0;
            if (i3 == 0) {
                if (i >= length) {
                    cArr = this.A.d();
                    length = cArr.length;
                    i = 0;
                }
                cArr[i] = (char) i2;
                i2 = this.U.readUnsignedByte();
                i++;
            } else if (i2 != 34) {
                if (i3 == 1) {
                    i2 = V();
                } else if (i3 == 2) {
                    i2 = s(i2);
                } else if (i3 == 3) {
                    i2 = q(i2);
                } else if (i3 == 4) {
                    int p = p(i2);
                    if (i >= cArr.length) {
                        cArr = this.A.d();
                        length = cArr.length;
                        i = 0;
                    }
                    cArr[i] = (char) ((p >> 10) | 55296);
                    i2 = (p & 1023) | 56320;
                    i++;
                } else if (i2 < 32) {
                    b(i2, "string value");
                } else {
                    o(i2);
                }
                if (i >= cArr.length) {
                    cArr = this.A.d();
                    length = cArr.length;
                } else {
                    i4 = i;
                }
                i = i4 + 1;
                cArr[i4] = (char) i2;
                i2 = this.U.readUnsignedByte();
            } else {
                this.A.b(i);
                return;
            }
        }
    }

    protected void aB() {
        this.ab = false;
        int[] iArr = am;
        while (true) {
            int readUnsignedByte = this.U.readUnsignedByte();
            int i = iArr[readUnsignedByte];
            if (i != 0) {
                if (readUnsignedByte == 34) {
                    return;
                }
                if (i == 1) {
                    V();
                } else if (i == 2) {
                    aH();
                } else if (i == 3) {
                    aI();
                } else if (i == 4) {
                    aL();
                } else if (readUnsignedByte < 32) {
                    b(readUnsignedByte, "string value");
                } else {
                    o(readUnsignedByte);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
        if (r4 != 44) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r3.B.h() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        if (r3.B.i() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
        if ((r3.a & o.C9367oJ.Y) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
        r3.X = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.fasterxml.jackson.core.JsonToken h(int r4) {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L7f
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L66
            r0 = 78
            if (r4 == r0) goto L4d
            r0 = 93
            if (r4 == r0) goto L2a
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L47
            r0 = 43
            if (r4 == r0) goto L1e
            r0 = 44
            if (r4 == r0) goto L33
            goto L8b
        L1e:
            java.io.DataInput r4 = r3.U
            int r4 = r4.readUnsignedByte()
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3.b(r4, r0, r1)
            return r4
        L2a:
            o.oG r0 = r3.B
            boolean r0 = r0.h()
            if (r0 != 0) goto L33
            goto L8b
        L33:
            o.oG r0 = r3.B
            boolean r0 = r0.i()
            if (r0 != 0) goto L47
            int r0 = r3.a
            int r1 = o.C9367oJ.Y
            r0 = r0 & r1
            if (r0 == 0) goto L47
            r3.X = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L47:
            java.lang.String r0 = "expected a value"
            r3.d(r4, r0)
            goto L7f
        L4d:
            java.lang.String r0 = "NaN"
            r3.d(r0, r1)
            int r1 = r3.a
            int r2 = o.C9367oJ.af
            r1 = r1 & r2
            if (r1 == 0) goto L60
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.d(r0, r1)
            return r4
        L60:
            java.lang.String r0 = "Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow"
            r3.f(r0)
            goto L8b
        L66:
            java.lang.String r0 = "Infinity"
            r3.d(r0, r1)
            int r1 = r3.a
            int r2 = o.C9367oJ.af
            r1 = r1 & r2
            if (r1 == 0) goto L79
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.d(r0, r1)
            return r4
        L79:
            java.lang.String r0 = "Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow"
            r3.f(r0)
            goto L8b
        L7f:
            int r0 = r3.a
            int r1 = o.C9367oJ.Z
            r0 = r0 & r1
            if (r0 == 0) goto L8b
            com.fasterxml.jackson.core.JsonToken r4 = r3.as()
            return r4
        L8b:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto Laa
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3.ag()
            r3.d(r4, r0, r1)
        Laa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "expected a valid value "
            r0.append(r1)
            java.lang.String r1 = r3.ah()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.d(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9367oJ.h(int):com.fasterxml.jackson.core.JsonToken");
    }

    protected JsonToken as() {
        char[] e = this.A.e();
        int[] iArr = am;
        int i = 0;
        while (true) {
            int length = e.length;
            if (i >= e.length) {
                e = this.A.d();
                length = e.length;
                i = 0;
            }
            while (true) {
                int readUnsignedByte = this.U.readUnsignedByte();
                if (readUnsignedByte != 39) {
                    int i2 = iArr[readUnsignedByte];
                    if (i2 == 0 || readUnsignedByte == 34) {
                        int i3 = i + 1;
                        e[i] = (char) readUnsignedByte;
                        i = i3;
                        if (i3 >= length) {
                            break;
                        }
                    } else {
                        if (i2 == 1) {
                            readUnsignedByte = V();
                        } else if (i2 == 2) {
                            readUnsignedByte = s(readUnsignedByte);
                        } else if (i2 == 3) {
                            readUnsignedByte = q(readUnsignedByte);
                        } else if (i2 == 4) {
                            int p = p(readUnsignedByte);
                            int i4 = i + 1;
                            e[i] = (char) ((p >> 10) | 55296);
                            if (i4 >= e.length) {
                                e = this.A.d();
                                i = 0;
                            } else {
                                i = i4;
                            }
                            readUnsignedByte = (p & 1023) | 56320;
                        } else {
                            if (readUnsignedByte < 32) {
                                b(readUnsignedByte, "string value");
                            }
                            o(readUnsignedByte);
                        }
                        if (i >= e.length) {
                            e = this.A.d();
                            i = 0;
                        }
                        e[i] = (char) readUnsignedByte;
                        i++;
                    }
                } else {
                    this.A.b(i);
                    return JsonToken.VALUE_STRING;
                }
            }
        }
    }

    protected JsonToken d(int i, boolean z) {
        return b(i, z, false);
    }

    protected JsonToken b(int i, boolean z, boolean z2) {
        String str;
        while (i == 73) {
            i = this.U.readUnsignedByte();
            if (i != 78) {
                if (i != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            d(str, 3);
            if ((this.a & af) != 0) {
                return d(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            f("Non-standard token '" + str + "': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
        }
        if (!a(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e()) && z2 && !z) {
            a(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        a(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        return null;
    }

    protected final void d(String str, int i) {
        int length = str.length();
        do {
            int readUnsignedByte = this.U.readUnsignedByte();
            if (readUnsignedByte != str.charAt(i)) {
                c(readUnsignedByte, str.substring(0, i));
            }
            i++;
        } while (i < length);
        int readUnsignedByte2 = this.U.readUnsignedByte();
        if (readUnsignedByte2 >= 48 && readUnsignedByte2 != 93 && readUnsignedByte2 != 125) {
            c(str, i, readUnsignedByte2);
        }
        this.X = readUnsignedByte2;
    }

    private final void c(String str, int i, int i2) {
        char f = (char) f(i2);
        if (Character.isJavaIdentifierPart(f)) {
            c(f, str.substring(0, i));
        }
    }

    private final int aJ() {
        int i = this.X;
        if (i < 0) {
            i = this.U.readUnsignedByte();
        } else {
            this.X = -1;
        }
        while (i <= 32) {
            if (i == 13 || i == 10) {
                this.f++;
            }
            i = this.U.readUnsignedByte();
        }
        return (i == 47 || i == 35) ? u(i) : i;
    }

    private final int aM() {
        int i = this.X;
        if (i < 0) {
            try {
                i = this.U.readUnsignedByte();
            } catch (EOFException unused) {
                return ab();
            }
        } else {
            this.X = -1;
        }
        while (i <= 32) {
            if (i == 13 || i == 10) {
                this.f++;
            }
            try {
                i = this.U.readUnsignedByte();
            } catch (EOFException unused2) {
                return ab();
            }
        }
        return (i == 47 || i == 35) ? u(i) : i;
    }

    private final int u(int i) {
        while (true) {
            if (i > 32) {
                if (i == 47) {
                    aF();
                } else if (i != 35 || !aQ()) {
                    break;
                }
            } else if (i == 13 || i == 10) {
                this.f++;
            }
            i = this.U.readUnsignedByte();
        }
        return i;
    }

    private final int aG() {
        int i = this.X;
        if (i < 0) {
            i = this.U.readUnsignedByte();
        } else {
            this.X = -1;
        }
        if (i == 58) {
            int readUnsignedByte = this.U.readUnsignedByte();
            if (readUnsignedByte > 32) {
                return (readUnsignedByte == 47 || readUnsignedByte == 35) ? e(readUnsignedByte, true) : readUnsignedByte;
            } else if ((readUnsignedByte == 32 || readUnsignedByte == 9) && (readUnsignedByte = this.U.readUnsignedByte()) > 32) {
                return (readUnsignedByte == 47 || readUnsignedByte == 35) ? e(readUnsignedByte, true) : readUnsignedByte;
            } else {
                return e(readUnsignedByte, true);
            }
        }
        if (i == 32 || i == 9) {
            i = this.U.readUnsignedByte();
        }
        if (i == 58) {
            int readUnsignedByte2 = this.U.readUnsignedByte();
            if (readUnsignedByte2 > 32) {
                return (readUnsignedByte2 == 47 || readUnsignedByte2 == 35) ? e(readUnsignedByte2, true) : readUnsignedByte2;
            } else if ((readUnsignedByte2 == 32 || readUnsignedByte2 == 9) && (readUnsignedByte2 = this.U.readUnsignedByte()) > 32) {
                return (readUnsignedByte2 == 47 || readUnsignedByte2 == 35) ? e(readUnsignedByte2, true) : readUnsignedByte2;
            } else {
                return e(readUnsignedByte2, true);
            }
        }
        return e(i, false);
    }

    private final int e(int i, boolean z) {
        while (true) {
            if (i > 32) {
                if (i == 47) {
                    aF();
                } else if (i != 35 || !aQ()) {
                    if (z) {
                        return i;
                    }
                    if (i != 58) {
                        d(i, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i == 13 || i == 10) {
                this.f++;
            }
            i = this.U.readUnsignedByte();
        }
    }

    private final void aF() {
        if ((this.a & ac) == 0) {
            d(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int readUnsignedByte = this.U.readUnsignedByte();
        if (readUnsignedByte == 47) {
            aK();
        } else if (readUnsignedByte == 42) {
            aC();
        } else {
            d(readUnsignedByte, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void aC() {
        int[] b = C9391oh.b();
        int readUnsignedByte = this.U.readUnsignedByte();
        while (true) {
            int i = b[readUnsignedByte];
            if (i != 0) {
                if (i == 2) {
                    aH();
                } else if (i == 3) {
                    aI();
                } else if (i == 4) {
                    aL();
                } else if (i == 10 || i == 13) {
                    this.f++;
                } else if (i == 42) {
                    readUnsignedByte = this.U.readUnsignedByte();
                    if (readUnsignedByte == 47) {
                        return;
                    }
                } else {
                    o(readUnsignedByte);
                }
            }
            readUnsignedByte = this.U.readUnsignedByte();
        }
    }

    private final boolean aQ() {
        if ((this.a & ag) == 0) {
            return false;
        }
        aK();
        return true;
    }

    private final void aK() {
        int[] b = C9391oh.b();
        while (true) {
            int readUnsignedByte = this.U.readUnsignedByte();
            int i = b[readUnsignedByte];
            if (i != 0) {
                if (i == 2) {
                    aH();
                } else if (i == 3) {
                    aI();
                } else if (i == 4) {
                    aL();
                } else if (i == 10 || i == 13) {
                    break;
                } else if (i != 42 && i < 0) {
                    o(readUnsignedByte);
                }
            }
        }
        this.f++;
    }

    @Override // o.AbstractC9386oc
    public char V() {
        int readUnsignedByte = this.U.readUnsignedByte();
        if (readUnsignedByte == 34 || readUnsignedByte == 47 || readUnsignedByte == 92) {
            return (char) readUnsignedByte;
        }
        if (readUnsignedByte != 98) {
            if (readUnsignedByte != 102) {
                if (readUnsignedByte != 110) {
                    if (readUnsignedByte != 114) {
                        if (readUnsignedByte != 116) {
                            if (readUnsignedByte != 117) {
                                return b((char) f(readUnsignedByte));
                            }
                            int i = 0;
                            for (int i2 = 0; i2 < 4; i2++) {
                                int readUnsignedByte2 = this.U.readUnsignedByte();
                                int e = C9391oh.e(readUnsignedByte2);
                                if (e < 0) {
                                    d(readUnsignedByte2, "expected a hex-digit for character escape sequence");
                                }
                                i = (i << 4) | e;
                            }
                            return (char) i;
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int f(int r7) {
        /*
            r6 = this;
            r0 = r7 & 255(0xff, float:3.57E-43)
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L6e
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
            java.io.DataInput r1 = r6.U
            int r1 = r1.readUnsignedByte()
            r4 = r1 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L3b
            r4 = r1 & 255(0xff, float:3.57E-43)
            r6.v(r4)
        L3b:
            int r7 = r7 << 6
            r1 = r1 & 63
            r7 = r7 | r1
            if (r0 <= r2) goto L6d
            java.io.DataInput r1 = r6.U
            int r1 = r1.readUnsignedByte()
            r2 = r1 & 192(0xc0, float:2.69E-43)
            if (r2 == r5) goto L51
            r2 = r1 & 255(0xff, float:3.57E-43)
            r6.v(r2)
        L51:
            int r7 = r7 << 6
            r1 = r1 & 63
            r7 = r7 | r1
            if (r0 <= r3) goto L6d
            java.io.DataInput r0 = r6.U
            int r0 = r0.readUnsignedByte()
            r1 = r0 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L67
            r1 = r0 & 255(0xff, float:3.57E-43)
            r6.v(r1)
        L67:
            int r7 = r7 << 6
            r0 = r0 & 63
            r0 = r0 | r7
            goto L6e
        L6d:
            r0 = r7
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9367oJ.f(int):int");
    }

    private final int s(int i) {
        int readUnsignedByte = this.U.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            v(readUnsignedByte & PrivateKeyType.INVALID);
        }
        return ((i & 31) << 6) | (readUnsignedByte & 63);
    }

    private final int q(int i) {
        int readUnsignedByte = this.U.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            v(readUnsignedByte & PrivateKeyType.INVALID);
        }
        int readUnsignedByte2 = this.U.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            v(readUnsignedByte2 & PrivateKeyType.INVALID);
        }
        return ((((i & 15) << 6) | (readUnsignedByte & 63)) << 6) | (readUnsignedByte2 & 63);
    }

    private final int p(int i) {
        int readUnsignedByte = this.U.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            v(readUnsignedByte & PrivateKeyType.INVALID);
        }
        int readUnsignedByte2 = this.U.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            v(readUnsignedByte2 & PrivateKeyType.INVALID);
        }
        int readUnsignedByte3 = this.U.readUnsignedByte();
        if ((readUnsignedByte3 & 192) != 128) {
            v(readUnsignedByte3 & PrivateKeyType.INVALID);
        }
        return (((((((i & 7) << 6) | (readUnsignedByte & 63)) << 6) | (readUnsignedByte2 & 63)) << 6) | (readUnsignedByte3 & 63)) - AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
    }

    private final void aH() {
        int readUnsignedByte = this.U.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            v(readUnsignedByte & PrivateKeyType.INVALID);
        }
    }

    private final void aI() {
        int readUnsignedByte = this.U.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            v(readUnsignedByte & PrivateKeyType.INVALID);
        }
        int readUnsignedByte2 = this.U.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            v(readUnsignedByte2 & PrivateKeyType.INVALID);
        }
    }

    private final void aL() {
        int readUnsignedByte = this.U.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            v(readUnsignedByte & PrivateKeyType.INVALID);
        }
        int readUnsignedByte2 = this.U.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            v(readUnsignedByte2 & PrivateKeyType.INVALID);
        }
        int readUnsignedByte3 = this.U.readUnsignedByte();
        if ((readUnsignedByte3 & 192) != 128) {
            v(readUnsignedByte3 & PrivateKeyType.INVALID);
        }
    }

    protected void c(int i, String str) {
        d(i, str, ag());
    }

    protected void d(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            char f = (char) f(i);
            if (Character.isJavaIdentifierPart(f)) {
                sb.append(f);
                i = this.U.readUnsignedByte();
            } else {
                f("Unrecognized token '" + sb.toString() + "': was expecting " + str2);
                return;
            }
        }
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

    private void v(int i) {
        f("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    private static int[] c(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return Arrays.copyOf(iArr, iArr.length + i);
    }

    protected final byte[] a(Base64Variant base64Variant) {
        int readUnsignedByte;
        C9439pc Z2 = Z();
        while (true) {
            int readUnsignedByte2 = this.U.readUnsignedByte();
            if (readUnsignedByte2 > 32) {
                int e = base64Variant.e(readUnsignedByte2);
                if (e < 0) {
                    if (readUnsignedByte2 == 34) {
                        return Z2.i();
                    }
                    e = e(base64Variant, readUnsignedByte2, 0);
                    if (e < 0) {
                        continue;
                    }
                }
                int readUnsignedByte3 = this.U.readUnsignedByte();
                int e2 = base64Variant.e(readUnsignedByte3);
                if (e2 < 0) {
                    e2 = e(base64Variant, readUnsignedByte3, 1);
                }
                int i = (e << 6) | e2;
                int readUnsignedByte4 = this.U.readUnsignedByte();
                int e3 = base64Variant.e(readUnsignedByte4);
                if (e3 < 0) {
                    if (e3 != -2) {
                        if (readUnsignedByte4 == 34) {
                            Z2.a(i >> 4);
                            if (base64Variant.h()) {
                                d(base64Variant);
                            }
                            return Z2.i();
                        }
                        e3 = e(base64Variant, readUnsignedByte4, 2);
                    }
                    if (e3 == -2) {
                        readUnsignedByte = this.U.readUnsignedByte();
                        if (base64Variant.b(readUnsignedByte) || (readUnsignedByte == 92 && e(base64Variant, readUnsignedByte, 3) == -2)) {
                            Z2.a(i >> 4);
                        }
                    }
                }
                int i2 = (i << 6) | e3;
                int readUnsignedByte5 = this.U.readUnsignedByte();
                int e4 = base64Variant.e(readUnsignedByte5);
                if (e4 < 0) {
                    if (e4 != -2) {
                        if (readUnsignedByte5 == 34) {
                            Z2.c(i2 >> 2);
                            if (base64Variant.h()) {
                                d(base64Variant);
                            }
                            return Z2.i();
                        }
                        e4 = e(base64Variant, readUnsignedByte5, 3);
                    }
                    if (e4 == -2) {
                        Z2.c(i2 >> 2);
                    }
                }
                Z2.d((i2 << 6) | e4);
            }
        }
        throw a(base64Variant, readUnsignedByte, 3, "expected padding character '" + base64Variant.j() + "'");
    }

    @Override // o.AbstractC9386oc, com.fasterxml.jackson.core.JsonParser
    public JsonLocation G() {
        return new JsonLocation(U(), -1L, -1L, this.G, -1);
    }

    @Override // o.AbstractC9386oc, com.fasterxml.jackson.core.JsonParser
    public JsonLocation k() {
        return new JsonLocation(U(), -1L, -1L, this.f, -1);
    }

    private void m(int i) {
        if (i == 93) {
            if (!this.B.h()) {
                e(i, '}');
            }
            this.B = this.B.n();
            this.P = JsonToken.END_ARRAY;
        }
        if (i == 125) {
            if (!this.B.g()) {
                e(i, ']');
            }
            this.B = this.B.n();
            this.P = JsonToken.END_OBJECT;
        }
    }
}
