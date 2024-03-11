package o;

import androidx.appcompat.widget.ActivityChooserModel;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;

/* renamed from: o.oL  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9369oL extends AbstractC9386oc {
    protected char[] T;
    protected final int U;
    protected int V;
    protected boolean W;
    protected ObjectCodec Y;
    protected final C9381oX Z;
    protected int aa;
    protected Reader ab;
    protected long ac;
    protected boolean ah;
    private static final int am = JsonParser.Feature.ALLOW_TRAILING_COMMA.b();
    private static final int aj = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.b();
    private static final int ai = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.b();
    private static final int ag = JsonParser.Feature.ALLOW_MISSING_VALUES.b();
    private static final int ae = JsonParser.Feature.ALLOW_SINGLE_QUOTES.b();
    private static final int af = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.b();
    private static final int ad = JsonParser.Feature.ALLOW_COMMENTS.b();
    private static final int ak = JsonParser.Feature.ALLOW_YAML_COMMENTS.b();
    protected static final int[] X = C9391oh.a();

    private final void aM() {
        int i = this.n;
        this.F = this.j + i;
        this.G = this.f;
        this.I = i - this.h;
    }

    private final void aV() {
        int i = this.n;
        this.ac = i;
        this.aa = this.f;
        this.V = i - this.h;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec n() {
        return this.Y;
    }

    public C9369oL(C9389of c9389of, int i, Reader reader, ObjectCodec objectCodec, C9381oX c9381oX, char[] cArr, int i2, int i3, boolean z) {
        super(c9389of, i);
        this.ab = reader;
        this.Y = objectCodec;
        this.T = cArr;
        this.n = i2;
        this.m = i3;
        this.h = i2;
        this.j = -i2;
        this.Z = c9381oX;
        this.U = c9381oX.c();
        this.W = z;
    }

    public C9369oL(C9389of c9389of, int i, Reader reader, ObjectCodec objectCodec, C9381oX c9381oX) {
        super(c9389of, i);
        this.ab = reader;
        this.T = c9389of.b();
        this.n = 0;
        this.m = 0;
        this.Y = objectCodec;
        this.Z = c9381oX;
        this.U = c9381oX.c();
        this.W = true;
    }

    protected char d(String str, JsonToken jsonToken) {
        if (this.n >= this.m && !aB()) {
            e(str, jsonToken);
        }
        char[] cArr = this.T;
        int i = this.n;
        this.n = i + 1;
        return cArr[i];
    }

    @Override // o.AbstractC9386oc
    public void W() {
        if (this.ab != null) {
            if (this.q.f() || a(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.ab.close();
            }
            this.ab = null;
        }
    }

    @Override // o.AbstractC9386oc
    public void af() {
        char[] cArr;
        super.af();
        this.Z.e();
        if (!this.W || (cArr = this.T) == null) {
            return;
        }
        this.T = null;
        this.q.d(cArr);
    }

    protected void ax() {
        if (aB()) {
            return;
        }
        av();
    }

    protected boolean aB() {
        Reader reader = this.ab;
        if (reader != null) {
            char[] cArr = this.T;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                int i = this.m;
                long j = i;
                this.j += j;
                this.h -= i;
                this.ac -= j;
                this.n = 0;
                this.m = read;
                return true;
            }
            W();
            if (read == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.m);
            }
        }
        return false;
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public final String A() {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.ah) {
                this.ah = false;
                Y();
            }
            return this.A.a();
        }
        return c(jsonToken);
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public final String L() {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.ah) {
                this.ah = false;
                Y();
            }
            return this.A.a();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return l();
        } else {
            return super.c((String) null);
        }
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public final String c(String str) {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.ah) {
                this.ah = false;
                Y();
            }
            return this.A.a();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return l();
        } else {
            return super.c(str);
        }
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
    public final char[] B() {
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
    public final int D() {
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
    public final int H() {
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
        throw new UnsupportedOperationException("Method not decompiled: o.C9369oL.H():int");
    }

    @Override // o.AbstractC9386oc, com.fasterxml.jackson.core.JsonParser
    public byte[] e(Base64Variant base64Variant) {
        byte[] bArr;
        JsonToken jsonToken = this.P;
        if (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || (bArr = this.b) == null) {
            if (jsonToken != JsonToken.VALUE_STRING) {
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
        return bArr;
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
            return c(base64Variant, outputStream, c);
        } finally {
            this.q.b(c);
        }
    }

    protected int c(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (this.n >= this.m) {
                ax();
            }
            char[] cArr = this.T;
            int i3 = this.n;
            this.n = i3 + 1;
            char c = cArr[i3];
            if (c > ' ') {
                int b = base64Variant.b(c);
                if (b < 0) {
                    if (c == '\"') {
                        break;
                    }
                    b = e(base64Variant, c, 0);
                    if (b < 0) {
                        continue;
                    }
                }
                if (i > length - 3) {
                    i2 += i;
                    outputStream.write(bArr, 0, i);
                    i = 0;
                }
                if (this.n >= this.m) {
                    ax();
                }
                char[] cArr2 = this.T;
                int i4 = this.n;
                this.n = i4 + 1;
                char c2 = cArr2[i4];
                int b2 = base64Variant.b(c2);
                if (b2 < 0) {
                    b2 = e(base64Variant, c2, 1);
                }
                int i5 = (b << 6) | b2;
                if (this.n >= this.m) {
                    ax();
                }
                char[] cArr3 = this.T;
                int i6 = this.n;
                this.n = i6 + 1;
                char c3 = cArr3[i6];
                int b3 = base64Variant.b(c3);
                if (b3 < 0) {
                    if (b3 != -2) {
                        if (c3 == '\"') {
                            bArr[i] = (byte) (i5 >> 4);
                            if (base64Variant.h()) {
                                this.n--;
                                d(base64Variant);
                            }
                            i++;
                        } else {
                            b3 = e(base64Variant, c3, 2);
                        }
                    }
                    if (b3 == -2) {
                        if (this.n >= this.m) {
                            ax();
                        }
                        char[] cArr4 = this.T;
                        int i7 = this.n;
                        this.n = i7 + 1;
                        char c4 = cArr4[i7];
                        if (!base64Variant.e(c4) && e(base64Variant, c4, 3) != -2) {
                            throw a(base64Variant, c4, 3, "expected padding character '" + base64Variant.j() + "'");
                        }
                        bArr[i] = (byte) (i5 >> 4);
                        i++;
                    }
                }
                int i8 = (i5 << 6) | b3;
                if (this.n >= this.m) {
                    ax();
                }
                char[] cArr5 = this.T;
                int i9 = this.n;
                this.n = i9 + 1;
                char c5 = cArr5[i9];
                int b4 = base64Variant.b(c5);
                if (b4 < 0) {
                    if (b4 != -2) {
                        if (c5 == '\"') {
                            bArr[i] = (byte) (i8 >> 10);
                            int i10 = i + 2;
                            bArr[i + 1] = (byte) (i8 >> 2);
                            if (base64Variant.h()) {
                                this.n--;
                                d(base64Variant);
                            }
                            i = i10;
                        } else {
                            b4 = e(base64Variant, c5, 3);
                        }
                    }
                    if (b4 == -2) {
                        bArr[i] = (byte) (i8 >> 10);
                        bArr[i + 1] = (byte) (i8 >> 2);
                        i += 2;
                    }
                }
                int i11 = (i8 << 6) | b4;
                bArr[i] = (byte) (i11 >> 16);
                bArr[i + 1] = (byte) (i11 >> 8);
                bArr[i + 2] = (byte) i11;
                i += 3;
            }
        }
        this.ah = false;
        if (i > 0) {
            int i12 = i2 + i;
            outputStream.write(bArr, 0, i);
            return i12;
        }
        return i2;
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public final JsonToken Q() {
        JsonToken jsonToken;
        JsonToken jsonToken2 = this.P;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            return aK();
        }
        this.r = 0;
        if (this.ah) {
            aF();
        }
        int aP = aP();
        if (aP < 0) {
            close();
            this.P = null;
            return null;
        }
        this.b = null;
        if (aP == 93 || aP == 125) {
            n(aP);
            return this.P;
        }
        if (this.B.o()) {
            aP = l(aP);
            if ((this.a & am) != 0 && (aP == 93 || aP == 125)) {
                n(aP);
                return this.P;
            }
        }
        boolean g = this.B.g();
        if (g) {
            aV();
            this.B.d(aP == 34 ? ay() : i(aP));
            this.P = jsonToken3;
            aP = aJ();
        }
        aM();
        if (aP == 34) {
            this.ah = true;
            jsonToken = JsonToken.VALUE_STRING;
        } else if (aP != 43) {
            if (aP == 91) {
                if (!g) {
                    this.B = this.B.a(this.G, this.I);
                }
                jsonToken = JsonToken.START_ARRAY;
            } else if (aP == 102) {
                aC();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (aP != 110) {
                if (aP != 116) {
                    if (aP == 123) {
                        if (!g) {
                            this.B = this.B.c(this.G, this.I);
                        }
                        jsonToken = JsonToken.START_OBJECT;
                    } else if (aP == 125) {
                        d(aP, "expected a value");
                    } else if (aP == 45) {
                        jsonToken = a(true);
                    } else if (aP == 46) {
                        jsonToken = b(false);
                    } else {
                        switch (aP) {
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
                                jsonToken = f(aP);
                                break;
                            default:
                                jsonToken = h(aP);
                                break;
                        }
                    }
                }
                aG();
                jsonToken = JsonToken.VALUE_TRUE;
            } else {
                aE();
                jsonToken = JsonToken.VALUE_NULL;
            }
        } else if (a(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e())) {
            jsonToken = a(false);
        } else {
            jsonToken = h(aP);
        }
        if (g) {
            this.p = jsonToken;
            return this.P;
        }
        this.P = jsonToken;
        return jsonToken;
    }

    private final JsonToken aK() {
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
            aK();
            return null;
        }
        if (this.ah) {
            aF();
        }
        int aP = aP();
        if (aP < 0) {
            close();
            this.P = null;
            return null;
        }
        this.b = null;
        if (aP == 93 || aP == 125) {
            n(aP);
            return null;
        }
        if (this.B.o()) {
            aP = l(aP);
            if ((this.a & am) != 0 && (aP == 93 || aP == 125)) {
                n(aP);
                return null;
            }
        }
        if (!this.B.g()) {
            aM();
            k(aP);
            return null;
        }
        aV();
        String ay = aP == 34 ? ay() : i(aP);
        this.B.d(ay);
        this.P = jsonToken2;
        int aJ = aJ();
        aM();
        if (aJ == 34) {
            this.ah = true;
            this.p = JsonToken.VALUE_STRING;
            return ay;
        }
        if (aJ != 43) {
            if (aJ == 91) {
                h = JsonToken.START_ARRAY;
            } else if (aJ == 102) {
                aC();
                h = JsonToken.VALUE_FALSE;
            } else if (aJ == 110) {
                aE();
                h = JsonToken.VALUE_NULL;
            } else if (aJ == 116) {
                aG();
                h = JsonToken.VALUE_TRUE;
            } else if (aJ == 123) {
                h = JsonToken.START_OBJECT;
            } else if (aJ == 45) {
                h = a(true);
            } else if (aJ == 46) {
                h = b(false);
            } else {
                switch (aJ) {
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
                        h = f(aJ);
                        break;
                    default:
                        h = h(aJ);
                        break;
                }
            }
        } else if (a(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e())) {
            h = a(false);
        } else {
            h = h(aJ);
        }
        this.p = h;
        return ay;
    }

    private final JsonToken k(int i) {
        if (i == 34) {
            this.ah = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.P = jsonToken;
            return jsonToken;
        } else if (i == 91) {
            this.B = this.B.a(this.G, this.I);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.P = jsonToken2;
            return jsonToken2;
        } else if (i == 102) {
            e("false", 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this.P = jsonToken3;
            return jsonToken3;
        } else if (i == 110) {
            e("null", 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this.P = jsonToken4;
            return jsonToken4;
        } else if (i == 116) {
            e("true", 1);
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this.P = jsonToken5;
            return jsonToken5;
        } else if (i == 123) {
            this.B = this.B.c(this.G, this.I);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this.P = jsonToken6;
            return jsonToken6;
        } else {
            switch (i) {
                case 44:
                    if (!this.B.i() && (this.a & ag) != 0) {
                        this.n--;
                        JsonToken jsonToken7 = JsonToken.VALUE_NULL;
                        this.P = jsonToken7;
                        return jsonToken7;
                    }
                    break;
                case 45:
                    JsonToken a = a(true);
                    this.P = a;
                    return a;
                case 46:
                    JsonToken b = b(false);
                    this.P = b;
                    return b;
                default:
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
                            JsonToken f = f(i);
                            this.P = f;
                            return f;
                    }
            }
            JsonToken h = h(i);
            this.P = h;
            return h;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String S() {
        if (this.P == JsonToken.FIELD_NAME) {
            this.s = false;
            JsonToken jsonToken = this.p;
            this.p = null;
            this.P = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this.ah) {
                    this.ah = false;
                    Y();
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

    protected final JsonToken b(boolean z) {
        if (!a(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.e())) {
            return h(46);
        }
        int i = this.n;
        int i2 = i - 1;
        if (z) {
            i2 = i - 2;
        }
        return a(46, i2, i, z, 0);
    }

    protected final JsonToken f(int i) {
        int i2 = this.n;
        int i3 = i2 - 1;
        int i4 = this.m;
        if (i == 48) {
            return e(false, i3);
        }
        int i5 = 1;
        while (i2 < i4) {
            int i6 = i2 + 1;
            char c = this.T[i2];
            if (c < '0' || c > '9') {
                if (c == '.' || c == 'e' || c == 'E') {
                    this.n = i6;
                    return a(c, i3, i6, false, i5);
                }
                this.n = i2;
                if (this.B.i()) {
                    m(c);
                }
                this.A.b(this.T, i3, i2 - i3);
                return d(false, i5);
            }
            i5++;
            i2 = i6;
        }
        this.n = i3;
        return e(false, i3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    private final com.fasterxml.jackson.core.JsonToken a(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:227)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:222)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:167)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:372)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    private final JsonToken a(boolean z) {
        int i = this.n;
        int i2 = z ? i - 1 : i;
        int i3 = this.m;
        if (i >= i3) {
            return e(z, i2);
        }
        int i4 = i + 1;
        char c = this.T[i];
        if (c > '9' || c < '0') {
            this.n = i4;
            if (c == '.') {
                return b(z);
            }
            return c((int) c, z, true);
        } else if (c == '0') {
            return e(z, i2);
        } else {
            int i5 = 1;
            while (i4 < i3) {
                int i6 = i4 + 1;
                char c2 = this.T[i4];
                if (c2 < '0' || c2 > '9') {
                    if (c2 == '.' || c2 == 'e' || c2 == 'E') {
                        this.n = i6;
                        return a(c2, i2, i6, z, i5);
                    }
                    this.n = i4;
                    if (this.B.i()) {
                        m(c2);
                    }
                    this.A.b(this.T, i2, i4 - i2);
                    return d(z, i5);
                }
                i5++;
                i4 = i6;
            }
            return e(z, i2);
        }
    }

    private final JsonToken e(boolean z, int i) {
        int i2;
        char d;
        boolean z2;
        int i3;
        char d2;
        char d3;
        if (z) {
            i++;
        }
        this.n = i;
        char[] e = this.A.e();
        if (z) {
            e[0] = '-';
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = this.n;
        if (i4 < this.m) {
            char[] cArr = this.T;
            this.n = i4 + 1;
            d = cArr[i4];
        } else {
            d = d("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (d == '0') {
            d = aT();
        }
        int i5 = 0;
        while (d >= '0' && d <= '9') {
            i5++;
            if (i2 >= e.length) {
                e = this.A.d();
                i2 = 0;
            }
            int i6 = i2 + 1;
            e[i2] = d;
            if (this.n >= this.m && !aB()) {
                d = 0;
                i2 = i6;
                z2 = true;
                break;
            }
            char[] cArr2 = this.T;
            int i7 = this.n;
            this.n = i7 + 1;
            d = cArr2[i7];
            i2 = i6;
        }
        z2 = false;
        if (i5 == 0 && !a(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.e())) {
            return c(d, z);
        }
        int i8 = -1;
        if (d == '.') {
            if (i2 >= e.length) {
                e = this.A.d();
                i2 = 0;
            }
            e[i2] = d;
            i2++;
            i3 = 0;
            while (true) {
                if (this.n >= this.m && !aB()) {
                    z2 = true;
                    break;
                }
                char[] cArr3 = this.T;
                int i9 = this.n;
                this.n = i9 + 1;
                d = cArr3[i9];
                if (d < '0' || d > '9') {
                    break;
                }
                i3++;
                if (i2 >= e.length) {
                    e = this.A.d();
                    i2 = 0;
                }
                e[i2] = d;
                i2++;
            }
            if (i3 == 0 && !a(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.e())) {
                a(d, "Decimal point not followed by a digit");
            }
        } else {
            i3 = -1;
        }
        if (d == 'e' || d == 'E') {
            if (i2 >= e.length) {
                e = this.A.d();
                i2 = 0;
            }
            int i10 = i2 + 1;
            e[i2] = d;
            int i11 = this.n;
            if (i11 < this.m) {
                char[] cArr4 = this.T;
                this.n = i11 + 1;
                d2 = cArr4[i11];
            } else {
                d2 = d("expected a digit for number exponent", JsonToken.VALUE_NUMBER_FLOAT);
            }
            if (d2 == '-' || d2 == '+') {
                if (i10 >= e.length) {
                    e = this.A.d();
                    i10 = 0;
                }
                e[i10] = d2;
                int i12 = this.n;
                if (i12 < this.m) {
                    char[] cArr5 = this.T;
                    this.n = i12 + 1;
                    d3 = cArr5[i12];
                } else {
                    d3 = d("expected a digit for number exponent", JsonToken.VALUE_NUMBER_FLOAT);
                }
                d2 = d3;
                i10++;
            }
            int i13 = 0;
            d = d2;
            while (d <= '9' && d >= '0') {
                i13++;
                if (i10 >= e.length) {
                    e = this.A.d();
                    i10 = 0;
                }
                i2 = i10 + 1;
                e[i10] = d;
                if (this.n >= this.m && !aB()) {
                    i8 = i13;
                    z2 = true;
                    break;
                }
                char[] cArr6 = this.T;
                int i14 = this.n;
                this.n = i14 + 1;
                d = cArr6[i14];
                i10 = i2;
            }
            i2 = i10;
            i8 = i13;
            if (i8 == 0) {
                a(d, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this.n--;
            if (this.B.i()) {
                m(d);
            }
        }
        this.A.b(i2);
        if (i3 < 0 && i8 < 0) {
            return d(z, i5);
        }
        return a(z, i5, i3, i8);
    }

    private final char aT() {
        char c;
        int i = this.n;
        if (i >= this.m || ((c = this.T[i]) >= '0' && c <= '9')) {
            return aU();
        }
        return '0';
    }

    private char aU() {
        char c;
        if ((this.n < this.m || aB()) && (c = this.T[this.n]) >= '0' && c <= '9') {
            if ((this.a & aj) == 0) {
                h("Leading zeroes not allowed");
            }
            this.n++;
            if (c == '0') {
                do {
                    if (this.n >= this.m && !aB()) {
                        break;
                    }
                    char[] cArr = this.T;
                    int i = this.n;
                    c = cArr[i];
                    if (c < '0' || c > '9') {
                        return '0';
                    }
                    this.n = i + 1;
                } while (c == '0');
            }
            return c;
        }
        return '0';
    }

    protected JsonToken c(int i, boolean z) {
        return c(i, z, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    protected com.fasterxml.jackson.core.JsonToken c(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:227)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:222)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:167)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:372)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    private final void m(int i) {
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

    protected final String ay() {
        int i = this.n;
        int i2 = this.U;
        int[] iArr = X;
        while (true) {
            if (i >= this.m) {
                break;
            }
            char[] cArr = this.T;
            char c = cArr[i];
            if (c >= iArr.length || iArr[c] == 0) {
                i2 = (i2 * 33) + c;
                i++;
            } else if (c == '\"') {
                int i3 = this.n;
                this.n = i + 1;
                return this.Z.e(cArr, i3, i - i3, i2);
            }
        }
        int i4 = this.n;
        this.n = i;
        return c(i4, i2, 34);
    }

    private String c(int i, int i2, int i3) {
        this.A.b(this.T, i, this.n - i);
        char[] f = this.A.f();
        int g = this.A.g();
        while (true) {
            if (this.n >= this.m && !aB()) {
                e(" in field name", JsonToken.FIELD_NAME);
            }
            char[] cArr = this.T;
            int i4 = this.n;
            this.n = i4 + 1;
            char c = cArr[i4];
            if (c <= '\\') {
                if (c == '\\') {
                    c = V();
                } else if (c <= i3) {
                    if (c == i3) {
                        this.A.b(g);
                        C9443pg c9443pg = this.A;
                        return this.Z.e(c9443pg.h(), c9443pg.i(), c9443pg.l(), i2);
                    } else if (c < ' ') {
                        b(c, "name");
                    }
                }
            }
            i2 = (i2 * 33) + c;
            int i5 = g + 1;
            f[g] = c;
            if (i5 >= f.length) {
                f = this.A.d();
                g = 0;
            } else {
                g = i5;
            }
        }
    }

    protected String i(int i) {
        if (i == 39 && (this.a & ae) != 0) {
            return aA();
        }
        if ((this.a & af) == 0) {
            d(i, "was expecting double-quote to start field name");
        }
        int[] c = C9391oh.c();
        int length = c.length;
        if (i >= length ? !Character.isJavaIdentifierPart((char) i) : c[i] != 0) {
            d(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i2 = this.n;
        int i3 = this.U;
        int i4 = this.m;
        if (i2 < i4) {
            do {
                char[] cArr = this.T;
                char c2 = cArr[i2];
                if (c2 < length) {
                    if (c[c2] != 0) {
                        int i5 = this.n - 1;
                        this.n = i2;
                        return this.Z.e(cArr, i5, i2 - i5, i3);
                    }
                } else if (!Character.isJavaIdentifierPart(c2)) {
                    int i6 = this.n - 1;
                    this.n = i2;
                    return this.Z.e(this.T, i6, i2 - i6, i3);
                }
                i3 = (i3 * 33) + c2;
                i2++;
            } while (i2 < i4);
            int i7 = this.n;
            this.n = i2;
            return c(i7 - 1, i3, c);
        }
        int i72 = this.n;
        this.n = i2;
        return c(i72 - 1, i3, c);
    }

    protected String aA() {
        int i = this.n;
        int i2 = this.U;
        int i3 = this.m;
        if (i < i3) {
            int[] iArr = X;
            int length = iArr.length;
            do {
                char[] cArr = this.T;
                char c = cArr[i];
                if (c == '\'') {
                    int i4 = this.n;
                    this.n = i + 1;
                    return this.Z.e(cArr, i4, i - i4, i2);
                } else if (c < length && iArr[c] != 0) {
                    break;
                } else {
                    i2 = (i2 * 33) + c;
                    i++;
                }
            } while (i < i3);
        }
        int i5 = this.n;
        this.n = i;
        return c(i5, i2, 39);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
        if (r4 != 44) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        if (r3.B.h() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (r3.B.i() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        if ((r3.a & o.C9369oL.ag) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        r3.n--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.fasterxml.jackson.core.JsonToken h(int r4) {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L8e
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L75
            r0 = 78
            if (r4 == r0) goto L5c
            r0 = 93
            if (r4 == r0) goto L3c
            r0 = 43
            if (r4 == r0) goto L1b
            r0 = 44
            if (r4 == r0) goto L45
            goto L9a
        L1b:
            int r4 = r3.n
            int r0 = r3.m
            if (r4 < r0) goto L2c
            boolean r4 = r3.aB()
            if (r4 != 0) goto L2c
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3.e(r4)
        L2c:
            char[] r4 = r3.T
            int r0 = r3.n
            int r2 = r0 + 1
            r3.n = r2
            char r4 = r4[r0]
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3.c(r4, r0, r1)
            return r4
        L3c:
            o.oG r0 = r3.B
            boolean r0 = r0.h()
            if (r0 != 0) goto L45
            goto L9a
        L45:
            o.oG r0 = r3.B
            boolean r0 = r0.i()
            if (r0 != 0) goto L9a
            int r0 = r3.a
            int r2 = o.C9369oL.ag
            r0 = r0 & r2
            if (r0 == 0) goto L9a
            int r4 = r3.n
            int r4 = r4 - r1
            r3.n = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L5c:
            java.lang.String r0 = "NaN"
            r3.e(r0, r1)
            int r1 = r3.a
            int r2 = o.C9369oL.ai
            r1 = r1 & r2
            if (r1 == 0) goto L6f
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.d(r0, r1)
            return r4
        L6f:
            java.lang.String r0 = "Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow"
            r3.f(r0)
            goto L9a
        L75:
            java.lang.String r0 = "Infinity"
            r3.e(r0, r1)
            int r1 = r3.a
            int r2 = o.C9369oL.ai
            r1 = r1 & r2
            if (r1 == 0) goto L88
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.d(r0, r1)
            return r4
        L88:
            java.lang.String r0 = "Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow"
            r3.f(r0)
            goto L9a
        L8e:
            int r0 = r3.a
            int r1 = o.C9369oL.ae
            r0 = r0 & r1
            if (r0 == 0) goto L9a
            com.fasterxml.jackson.core.JsonToken r4 = r3.az()
            return r4
        L9a:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto Lb9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3.ag()
            r3.b(r0, r1)
        Lb9:
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
        throw new UnsupportedOperationException("Method not decompiled: o.C9369oL.h(int):com.fasterxml.jackson.core.JsonToken");
    }

    protected JsonToken az() {
        char[] e = this.A.e();
        int g = this.A.g();
        while (true) {
            if (this.n >= this.m && !aB()) {
                e(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this.T;
            int i = this.n;
            this.n = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    c = V();
                } else if (c <= '\'') {
                    if (c == '\'') {
                        this.A.b(g);
                        return JsonToken.VALUE_STRING;
                    } else if (c < ' ') {
                        b(c, "string value");
                    }
                }
            }
            if (g >= e.length) {
                e = this.A.d();
                g = 0;
            }
            e[g] = c;
            g++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String c(int r5, int r6, int[] r7) {
        /*
            r4 = this;
            o.pg r0 = r4.A
            char[] r1 = r4.T
            int r2 = r4.n
            int r2 = r2 - r5
            r0.b(r1, r5, r2)
            o.pg r5 = r4.A
            char[] r5 = r5.f()
            o.pg r0 = r4.A
            int r0 = r0.g()
            int r1 = r7.length
        L17:
            int r2 = r4.n
            int r3 = r4.m
            if (r2 < r3) goto L24
            boolean r2 = r4.aB()
            if (r2 != 0) goto L24
            goto L37
        L24:
            char[] r2 = r4.T
            int r3 = r4.n
            char r2 = r2[r3]
            if (r2 >= r1) goto L31
            r3 = r7[r2]
            if (r3 == 0) goto L51
            goto L37
        L31:
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r2)
            if (r3 != 0) goto L51
        L37:
            o.pg r5 = r4.A
            r5.b(r0)
            o.pg r5 = r4.A
            char[] r7 = r5.h()
            int r0 = r5.i()
            int r5 = r5.l()
            o.oX r1 = r4.Z
            java.lang.String r5 = r1.e(r7, r0, r5, r6)
            return r5
        L51:
            int r3 = r4.n
            int r3 = r3 + 1
            r4.n = r3
            int r6 = r6 * 33
            int r6 = r6 + r2
            int r3 = r0 + 1
            r5[r0] = r2
            int r0 = r5.length
            if (r3 < r0) goto L69
            o.pg r5 = r4.A
            char[] r5 = r5.d()
            r0 = 0
            goto L17
        L69:
            r0 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9369oL.c(int, int, int[]):java.lang.String");
    }

    @Override // o.AbstractC9386oc
    public final void Y() {
        int i = this.n;
        int i2 = this.m;
        if (i < i2) {
            int[] iArr = X;
            int length = iArr.length;
            while (true) {
                char[] cArr = this.T;
                char c = cArr[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    C9443pg c9443pg = this.A;
                    int i3 = this.n;
                    c9443pg.b(cArr, i3, i - i3);
                    this.n = i + 1;
                    return;
                }
            }
        }
        C9443pg c9443pg2 = this.A;
        char[] cArr2 = this.T;
        int i4 = this.n;
        c9443pg2.a(cArr2, i4, i - i4);
        this.n = i;
        as();
    }

    protected void as() {
        char[] f = this.A.f();
        int g = this.A.g();
        int[] iArr = X;
        int length = iArr.length;
        while (true) {
            if (this.n >= this.m && !aB()) {
                e(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this.T;
            int i = this.n;
            this.n = i + 1;
            char c = cArr[i];
            if (c < length && iArr[c] != 0) {
                if (c == '\"') {
                    this.A.b(g);
                    return;
                } else if (c == '\\') {
                    c = V();
                } else if (c < ' ') {
                    b(c, "string value");
                }
            }
            if (g >= f.length) {
                f = this.A.d();
                g = 0;
            }
            f[g] = c;
            g++;
        }
    }

    protected final void aF() {
        this.ah = false;
        int i = this.n;
        int i2 = this.m;
        char[] cArr = this.T;
        while (true) {
            if (i >= i2) {
                this.n = i;
                if (!aB()) {
                    e(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                }
                i = this.n;
                i2 = this.m;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    this.n = i3;
                    V();
                    i = this.n;
                    i2 = this.m;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this.n = i3;
                        return;
                    } else if (c < ' ') {
                        this.n = i3;
                        b(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    protected final void aD() {
        if (this.n < this.m || aB()) {
            char[] cArr = this.T;
            int i = this.n;
            if (cArr[i] == '\n') {
                this.n = i + 1;
            }
        }
        this.f++;
        this.h = this.n;
    }

    private final int aJ() {
        int i = this.n;
        if (i + 4 >= this.m) {
            return e(false);
        }
        char[] cArr = this.T;
        char c = cArr[i];
        if (c == ':') {
            int i2 = i + 1;
            this.n = i2;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 == '/' || c2 == '#') {
                    return e(true);
                }
                this.n = i + 2;
                return c2;
            }
            if (c2 == ' ' || c2 == '\t') {
                int i3 = i + 2;
                this.n = i3;
                char c3 = cArr[i3];
                if (c3 > ' ') {
                    if (c3 == '/' || c3 == '#') {
                        return e(true);
                    }
                    this.n = i + 3;
                    return c3;
                }
            }
            return e(true);
        }
        if (c == ' ' || c == '\t') {
            int i4 = i + 1;
            this.n = i4;
            c = cArr[i4];
        }
        if (c == ':') {
            int i5 = this.n;
            int i6 = i5 + 1;
            this.n = i6;
            char c4 = cArr[i6];
            if (c4 > ' ') {
                if (c4 == '/' || c4 == '#') {
                    return e(true);
                }
                this.n = i5 + 2;
                return c4;
            }
            if (c4 == ' ' || c4 == '\t') {
                int i7 = i5 + 2;
                this.n = i7;
                char c5 = cArr[i7];
                if (c5 > ' ') {
                    if (c5 == '/' || c5 == '#') {
                        return e(true);
                    }
                    this.n = i5 + 3;
                    return c5;
                }
            }
            return e(true);
        }
        return e(false);
    }

    private final int e(boolean z) {
        while (true) {
            if (this.n < this.m || aB()) {
                char[] cArr = this.T;
                int i = this.n;
                int i2 = i + 1;
                this.n = i2;
                char c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        aI();
                    } else if (c != '#' || !aO()) {
                        if (z) {
                            return c;
                        }
                        if (c != ':') {
                            d(c, "was expecting a colon to separate field name and value");
                        }
                        z = true;
                    }
                } else if (c < ' ') {
                    if (c == '\n') {
                        this.f++;
                        this.h = i2;
                    } else if (c == '\r') {
                        aD();
                    } else if (c != '\t') {
                        j(c);
                    }
                }
            } else {
                e(" within/between " + this.B.k() + " entries", (JsonToken) null);
                return -1;
            }
        }
    }

    private final int l(int i) {
        if (i != 44) {
            d(i, "was expecting comma to separate " + this.B.k() + " entries");
        }
        while (true) {
            int i2 = this.n;
            if (i2 < this.m) {
                char[] cArr = this.T;
                int i3 = i2 + 1;
                this.n = i3;
                char c = cArr[i2];
                if (c > ' ') {
                    if (c == '/' || c == '#') {
                        this.n = i2;
                        return aL();
                    }
                    return c;
                } else if (c < ' ') {
                    if (c == '\n') {
                        this.f++;
                        this.h = i3;
                    } else if (c == '\r') {
                        aD();
                    } else if (c != '\t') {
                        j(c);
                    }
                }
            } else {
                return aL();
            }
        }
    }

    private final int aL() {
        char c;
        while (true) {
            if (this.n < this.m || aB()) {
                char[] cArr = this.T;
                int i = this.n;
                int i2 = i + 1;
                this.n = i2;
                c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        aI();
                    } else if (c != '#' || !aO()) {
                        break;
                    }
                } else if (c < ' ') {
                    if (c == '\n') {
                        this.f++;
                        this.h = i2;
                    } else if (c == '\r') {
                        aD();
                    } else if (c != '\t') {
                        j(c);
                    }
                }
            } else {
                throw d("Unexpected end-of-input within/between " + this.B.k() + " entries");
            }
        }
        return c;
    }

    private final int aP() {
        if (this.n >= this.m && !aB()) {
            return ab();
        }
        char[] cArr = this.T;
        int i = this.n;
        int i2 = i + 1;
        this.n = i2;
        char c = cArr[i];
        if (c > ' ') {
            if (c == '/' || c == '#') {
                this.n = i;
                return aQ();
            }
            return c;
        }
        if (c != ' ') {
            if (c == '\n') {
                this.f++;
                this.h = i2;
            } else if (c == '\r') {
                aD();
            } else if (c != '\t') {
                j(c);
            }
        }
        while (true) {
            int i3 = this.n;
            if (i3 < this.m) {
                char[] cArr2 = this.T;
                int i4 = i3 + 1;
                this.n = i4;
                char c2 = cArr2[i3];
                if (c2 > ' ') {
                    if (c2 == '/' || c2 == '#') {
                        this.n = i3;
                        return aQ();
                    }
                    return c2;
                } else if (c2 != ' ') {
                    if (c2 == '\n') {
                        this.f++;
                        this.h = i4;
                    } else if (c2 == '\r') {
                        aD();
                    } else if (c2 != '\t') {
                        j(c2);
                    }
                }
            } else {
                return aQ();
            }
        }
    }

    private int aQ() {
        char c;
        while (true) {
            if (this.n >= this.m && !aB()) {
                return ab();
            }
            char[] cArr = this.T;
            int i = this.n;
            int i2 = i + 1;
            this.n = i2;
            c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    aI();
                } else if (c != '#' || !aO()) {
                    break;
                }
            } else if (c != ' ') {
                if (c == '\n') {
                    this.f++;
                    this.h = i2;
                } else if (c == '\r') {
                    aD();
                } else if (c != '\t') {
                    j(c);
                }
            }
        }
        return c;
    }

    private void aI() {
        if ((this.a & ad) == 0) {
            d(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.n >= this.m && !aB()) {
            e(" in a comment", (JsonToken) null);
        }
        char[] cArr = this.T;
        int i = this.n;
        this.n = i + 1;
        char c = cArr[i];
        if (c == '/') {
            aN();
        } else if (c == '*') {
            aH();
        } else {
            d(c, "was expecting either '*' or '/' for a comment");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        e(" in a comment", (com.fasterxml.jackson.core.JsonToken) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void aH() {
        /*
            r3 = this;
        L0:
            int r0 = r3.n
            int r1 = r3.m
            if (r0 < r1) goto Lc
            boolean r0 = r3.aB()
            if (r0 == 0) goto L26
        Lc:
            char[] r0 = r3.T
            int r1 = r3.n
            int r2 = r1 + 1
            r3.n = r2
            char r0 = r0[r1]
            r1 = 42
            if (r0 > r1) goto L0
            if (r0 != r1) goto L3c
            int r0 = r3.m
            if (r2 < r0) goto L2d
            boolean r0 = r3.aB()
            if (r0 != 0) goto L2d
        L26:
            java.lang.String r0 = " in a comment"
            r1 = 0
            r3.e(r0, r1)
            return
        L2d:
            char[] r0 = r3.T
            int r1 = r3.n
            char r0 = r0[r1]
            r2 = 47
            if (r0 != r2) goto L0
            int r1 = r1 + 1
            r3.n = r1
            return
        L3c:
            r1 = 32
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L4d
            int r0 = r3.f
            int r0 = r0 + 1
            r3.f = r0
            r3.h = r2
            goto L0
        L4d:
            r1 = 13
            if (r0 != r1) goto L55
            r3.aD()
            goto L0
        L55:
            r1 = 9
            if (r0 == r1) goto L0
            r3.j(r0)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9369oL.aH():void");
    }

    private boolean aO() {
        if ((this.a & ak) == 0) {
            return false;
        }
        aN();
        return true;
    }

    private void aN() {
        while (true) {
            if (this.n >= this.m && !aB()) {
                return;
            }
            char[] cArr = this.T;
            int i = this.n;
            int i2 = i + 1;
            this.n = i2;
            char c = cArr[i];
            if (c < ' ') {
                if (c == '\n') {
                    this.f++;
                    this.h = i2;
                    return;
                } else if (c == '\r') {
                    aD();
                    return;
                } else if (c != '\t') {
                    j(c);
                }
            }
        }
    }

    @Override // o.AbstractC9386oc
    public char V() {
        if (this.n >= this.m && !aB()) {
            e(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        char[] cArr = this.T;
        int i = this.n;
        this.n = i + 1;
        char c = cArr[i];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c != 'b') {
            if (c != 'f') {
                if (c != 'n') {
                    if (c != 'r') {
                        if (c != 't') {
                            if (c != 'u') {
                                return b(c);
                            }
                            int i2 = 0;
                            for (int i3 = 0; i3 < 4; i3++) {
                                if (this.n >= this.m && !aB()) {
                                    e(" in character escape sequence", JsonToken.VALUE_STRING);
                                }
                                char[] cArr2 = this.T;
                                int i4 = this.n;
                                this.n = i4 + 1;
                                char c2 = cArr2[i4];
                                int e = C9391oh.e(c2);
                                if (e < 0) {
                                    d(c2, "expected a hex-digit for character escape sequence");
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

    private final void aG() {
        char c;
        int i = this.n;
        int i2 = i + 3;
        if (i2 < this.m) {
            char[] cArr = this.T;
            if (cArr[i] == 'r' && cArr[i + 1] == 'u' && cArr[i + 2] == 'e' && ((c = cArr[i2]) < '0' || c == ']' || c == '}')) {
                this.n = i2;
                return;
            }
        }
        e("true", 1);
    }

    private final void aC() {
        char c;
        int i = this.n;
        int i2 = i + 4;
        if (i2 < this.m) {
            char[] cArr = this.T;
            if (cArr[i] == 'a' && cArr[i + 1] == 'l' && cArr[i + 2] == 's' && cArr[i + 3] == 'e' && ((c = cArr[i2]) < '0' || c == ']' || c == '}')) {
                this.n = i2;
                return;
            }
        }
        e("false", 1);
    }

    private final void aE() {
        char c;
        int i = this.n;
        int i2 = i + 3;
        if (i2 < this.m) {
            char[] cArr = this.T;
            if (cArr[i] == 'u' && cArr[i + 1] == 'l' && cArr[i + 2] == 'l' && ((c = cArr[i2]) < '0' || c == ']' || c == '}')) {
                this.n = i2;
                return;
            }
        }
        e("null", 1);
    }

    protected final void e(String str, int i) {
        int i2;
        int length = str.length();
        if (this.n + length >= this.m) {
            d(str, i);
            return;
        }
        do {
            if (this.T[this.n] != str.charAt(i)) {
                g(str.substring(0, i));
            }
            i2 = this.n + 1;
            this.n = i2;
            i++;
        } while (i < length);
        char c = this.T[i2];
        if (c < '0' || c == ']' || c == '}') {
            return;
        }
        d(str, i, c);
    }

    private final void d(String str, int i) {
        int i2;
        char c;
        int length = str.length();
        do {
            if ((this.n >= this.m && !aB()) || this.T[this.n] != str.charAt(i)) {
                g(str.substring(0, i));
            }
            i2 = this.n + 1;
            this.n = i2;
            i++;
        } while (i < length);
        if ((i2 < this.m || aB()) && (c = this.T[this.n]) >= '0' && c != ']' && c != '}') {
            d(str, i, c);
        }
    }

    private final void d(String str, int i, int i2) {
        if (Character.isJavaIdentifierPart((char) i2)) {
            g(str.substring(0, i));
        }
    }

    protected byte[] a(Base64Variant base64Variant) {
        C9439pc Z = Z();
        while (true) {
            if (this.n >= this.m) {
                ax();
            }
            char[] cArr = this.T;
            int i = this.n;
            this.n = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                int b = base64Variant.b(c);
                if (b < 0) {
                    if (c == '\"') {
                        return Z.i();
                    }
                    b = e(base64Variant, c, 0);
                    if (b < 0) {
                        continue;
                    }
                }
                if (this.n >= this.m) {
                    ax();
                }
                char[] cArr2 = this.T;
                int i2 = this.n;
                this.n = i2 + 1;
                char c2 = cArr2[i2];
                int b2 = base64Variant.b(c2);
                if (b2 < 0) {
                    b2 = e(base64Variant, c2, 1);
                }
                int i3 = (b << 6) | b2;
                if (this.n >= this.m) {
                    ax();
                }
                char[] cArr3 = this.T;
                int i4 = this.n;
                this.n = i4 + 1;
                char c3 = cArr3[i4];
                int b3 = base64Variant.b(c3);
                if (b3 < 0) {
                    if (b3 != -2) {
                        if (c3 == '\"') {
                            Z.a(i3 >> 4);
                            if (base64Variant.h()) {
                                this.n--;
                                d(base64Variant);
                            }
                            return Z.i();
                        }
                        b3 = e(base64Variant, c3, 2);
                    }
                    if (b3 == -2) {
                        if (this.n >= this.m) {
                            ax();
                        }
                        char[] cArr4 = this.T;
                        int i5 = this.n;
                        this.n = i5 + 1;
                        char c4 = cArr4[i5];
                        if (!base64Variant.e(c4) && e(base64Variant, c4, 3) != -2) {
                            throw a(base64Variant, c4, 3, "expected padding character '" + base64Variant.j() + "'");
                        }
                        Z.a(i3 >> 4);
                    }
                }
                int i6 = (i3 << 6) | b3;
                if (this.n >= this.m) {
                    ax();
                }
                char[] cArr5 = this.T;
                int i7 = this.n;
                this.n = i7 + 1;
                char c5 = cArr5[i7];
                int b4 = base64Variant.b(c5);
                if (b4 < 0) {
                    if (b4 != -2) {
                        if (c5 == '\"') {
                            Z.c(i6 >> 2);
                            if (base64Variant.h()) {
                                this.n--;
                                d(base64Variant);
                            }
                            return Z.i();
                        }
                        b4 = e(base64Variant, c5, 3);
                    }
                    if (b4 == -2) {
                        Z.c(i6 >> 2);
                    }
                }
                Z.d((i6 << 6) | b4);
            }
        }
    }

    @Override // o.AbstractC9386oc, com.fasterxml.jackson.core.JsonParser
    public JsonLocation G() {
        if (this.P == JsonToken.FIELD_NAME) {
            return new JsonLocation(U(), -1L, this.j + (this.ac - 1), this.aa, this.V);
        }
        return new JsonLocation(U(), -1L, this.F - 1, this.G, this.I);
    }

    @Override // o.AbstractC9386oc, com.fasterxml.jackson.core.JsonParser
    public JsonLocation k() {
        return new JsonLocation(U(), -1L, this.j + this.n, this.f, (this.n - this.h) + 1);
    }

    protected void g(String str) {
        b(str, ag());
    }

    protected void b(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.n >= this.m && !aB()) {
                break;
            }
            char c = this.T[this.n];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.n++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        d("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    private void n(int i) {
        if (i == 93) {
            aM();
            if (!this.B.h()) {
                e(i, '}');
            }
            this.B = this.B.n();
            this.P = JsonToken.END_ARRAY;
        }
        if (i == 125) {
            aM();
            if (!this.B.g()) {
                e(i, ']');
            }
            this.B = this.B.n();
            this.P = JsonToken.END_OBJECT;
        }
    }
}
