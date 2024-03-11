package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import java.io.OutputStream;

/* renamed from: o.oR  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9375oR extends AbstractC9386oc {
    protected static final String[] U = {"NaN", "Infinity", "+Infinity", "-Infinity"};
    protected static final double[] V = {Double.NaN, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
    protected int T;
    protected boolean W;
    protected int X;
    protected int Y;
    protected int Z;
    protected int aa;
    protected int ab;
    protected int ac;
    protected int ad;
    protected int ae;
    protected int[] af;
    protected int ag;
    protected int ah;
    protected int aj;
    protected int ak;
    protected final C9377oT al;

    /* JADX INFO: Access modifiers changed from: protected */
    public static final int e(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    @Override // o.AbstractC9386oc
    public void W() {
        this.T = 0;
        this.m = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final JsonToken c(JsonToken jsonToken) {
        this.aa = this.ab;
        this.P = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec n() {
        return null;
    }

    public AbstractC9375oR(C9389of c9389of, int i, C9377oT c9377oT) {
        super(c9389of, i);
        this.af = new int[8];
        this.W = false;
        this.T = 0;
        this.X = 1;
        this.al = c9377oT;
        this.P = null;
        this.aa = 0;
        this.ab = 1;
    }

    @Override // o.AbstractC9386oc
    public void af() {
        super.af();
        this.al.a();
    }

    @Override // o.AbstractC9386oc, com.fasterxml.jackson.core.JsonParser
    public boolean M() {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.A.o();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.s;
        }
        return false;
    }

    @Override // o.AbstractC9386oc, com.fasterxml.jackson.core.JsonParser
    public JsonLocation k() {
        int i = this.n;
        int i2 = this.h;
        int max = Math.max(this.f, this.X);
        return new JsonLocation(U(), (this.n - this.T) + this.j, -1L, max, (i - i2) + 1);
    }

    @Override // o.AbstractC9386oc, com.fasterxml.jackson.core.JsonParser
    public JsonLocation G() {
        return new JsonLocation(U(), this.F, -1L, this.G, this.I);
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public String A() {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.A.a();
        }
        return b(jsonToken);
    }

    protected final String b(JsonToken jsonToken) {
        int c;
        if (jsonToken == null || (c = jsonToken.c()) == -1) {
            return null;
        }
        if (c != 5) {
            if (c == 6 || c == 7 || c == 8) {
                return this.A.a();
            }
            return jsonToken.a();
        }
        return this.B.c();
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public String L() {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.A.a();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return l();
        }
        return super.c((String) null);
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public String c(String str) {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.A.a();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return l();
        }
        return super.c(str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] B() {
        JsonToken jsonToken = this.P;
        if (jsonToken != null) {
            int c = jsonToken.c();
            if (c != 5) {
                if (c == 6 || c == 7 || c == 8) {
                    return this.A.h();
                }
                return this.P.d();
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
            if (c != 5) {
                if (c == 6 || c == 7 || c == 8) {
                    return this.A.l();
                }
                return this.P.d().length;
            }
            return this.B.c().length();
        }
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int H() {
        JsonToken jsonToken = this.P;
        if (jsonToken != null) {
            int c = jsonToken.c();
            if (c == 6 || c == 7 || c == 8) {
                return this.A.i();
            }
            return 0;
        }
        return 0;
    }

    @Override // o.AbstractC9386oc, com.fasterxml.jackson.core.JsonParser
    public byte[] e(Base64Variant base64Variant) {
        JsonToken jsonToken = this.P;
        if (jsonToken != JsonToken.VALUE_STRING) {
            c("Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary", (Object) jsonToken);
        }
        if (this.b == null) {
            C9439pc Z = Z();
            a(A(), Z, base64Variant);
            this.b = Z.i();
        }
        return this.b;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int e(Base64Variant base64Variant, OutputStream outputStream) {
        byte[] e = e(base64Variant);
        outputStream.write(e);
        return e.length;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object q() {
        if (this.P == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final JsonToken ay() {
        this.B = this.B.a(-1, -1);
        this.aa = 5;
        this.ab = 6;
        JsonToken jsonToken = JsonToken.START_ARRAY;
        this.P = jsonToken;
        return jsonToken;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final JsonToken aF() {
        this.B = this.B.c(-1, -1);
        this.aa = 2;
        this.ab = 3;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        this.P = jsonToken;
        return jsonToken;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final JsonToken aA() {
        int i;
        if (!this.B.h()) {
            e(93, '}');
        }
        C9364oG b = this.B.b();
        this.B = b;
        if (b.g()) {
            i = 3;
        } else {
            i = b.h() ? 6 : 1;
        }
        this.aa = i;
        this.ab = i;
        JsonToken jsonToken = JsonToken.END_ARRAY;
        this.P = jsonToken;
        return jsonToken;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final JsonToken az() {
        int i;
        if (!this.B.g()) {
            e(125, ']');
        }
        C9364oG b = this.B.b();
        this.B = b;
        if (b.g()) {
            i = 3;
        } else {
            i = b.h() ? 6 : 1;
        }
        this.aa = i;
        this.ab = i;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        this.P = jsonToken;
        return jsonToken;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(int i, int i2) {
        int e = e(i, i2);
        String c = this.al.c(e);
        if (c != null) {
            return c;
        }
        int[] iArr = this.af;
        iArr[0] = e;
        return d(iArr, 1, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String e(int i, int i2, int i3) {
        int e = e(i2, i3);
        String e2 = this.al.e(i, e);
        if (e2 != null) {
            return e2;
        }
        int[] iArr = this.af;
        iArr[0] = i;
        iArr[1] = e;
        return d(iArr, 2, i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(int i, int i2, int i3, int i4) {
        int e = e(i3, i4);
        String e2 = this.al.e(i, i2, e);
        if (e2 != null) {
            return e2;
        }
        int[] iArr = this.af;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = e(e, i4);
        return d(iArr, 3, i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(int[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC9375oR.d(int[], int, int):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final JsonToken ax() {
        this.aa = 7;
        if (!this.B.i()) {
            ae();
        }
        close();
        this.P = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final JsonToken g(String str) {
        this.aa = 4;
        this.B.d(str);
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        this.P = jsonToken;
        return jsonToken;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final JsonToken c(int i, String str) {
        this.A.b(str);
        this.k = str.length();
        this.r = 1;
        this.u = i;
        this.aa = this.ab;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_INT;
        this.P = jsonToken;
        return jsonToken;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final JsonToken k(int i) {
        String str = U[i];
        this.A.b(str);
        if (!a(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
            c("Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow", str);
        }
        this.k = 0;
        this.r = 8;
        this.x = V[i];
        this.aa = this.ab;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_FLOAT;
        this.P = jsonToken;
        return jsonToken;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String i(int i) {
        return U[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aD() {
        this.G = Math.max(this.f, this.X);
        int i = this.n;
        this.I = i - this.h;
        this.F = this.j + (i - this.T);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(int i) {
        if (i < 32) {
            j(i);
        }
        l(i);
    }

    protected void l(int i) {
        f("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(int i, int i2) {
        this.n = i2;
        n(i);
    }

    protected void n(int i) {
        f("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }
}
