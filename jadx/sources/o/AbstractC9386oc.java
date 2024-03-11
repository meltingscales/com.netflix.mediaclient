package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.io.ContentReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: o.oc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9386oc extends AbstractC9384oa {
    protected static final C9441pe<StreamReadCapability> d = JsonParser.c;
    public final C9443pg A;
    public C9364oG B;
    protected String C;
    protected long D;
    public long F;
    public int G;
    public int I;
    public byte[] b;
    public int f;
    protected C9439pc g;
    public int h;
    public boolean i;
    public long j;
    public int k;
    public int l;
    public int m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f13892o;
    public JsonToken p;
    public final C9389of q;
    public int r;
    public boolean s;
    public char[] t;
    public int u;
    protected BigDecimal v;
    protected BigInteger w;
    public double x;
    protected float y;
    public boolean z;

    protected abstract void W();

    protected void Y() {
    }

    public int an() {
        int i = this.I;
        return i < 0 ? i : i + 1;
    }

    public int ao() {
        return this.G;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* renamed from: ap */
    public C9364oG z() {
        return this.B;
    }

    public long ar() {
        return this.F;
    }

    public AbstractC9386oc(C9389of c9389of, int i) {
        super(i);
        this.f = 1;
        this.G = 1;
        this.r = 0;
        this.q = c9389of;
        this.A = c9389of.h();
        this.B = C9364oG.c(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.e(i) ? C9366oI.b(this) : null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void e(Object obj) {
        this.B.b(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser e(JsonParser.Feature feature) {
        this.a |= feature.b();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION && this.B.l() == null) {
            this.B = this.B.e(C9366oI.b(this));
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser b(JsonParser.Feature feature) {
        this.a &= ~feature.b();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION) {
            this.B = this.B.e(null);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser c(int i) {
        int i2 = this.a ^ i;
        if (i2 != 0) {
            this.a = i;
            b(i, i2);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser d(int i, int i2) {
        int i3 = this.a;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this.a = i4;
            b(i4, i5);
        }
        return this;
    }

    protected void b(int i, int i2) {
        int b = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.b();
        if ((i2 & b) == 0 || (i & b) == 0) {
            return;
        }
        if (this.B.l() == null) {
            this.B = this.B.e(C9366oI.b(this));
        } else {
            this.B = this.B.e(null);
        }
    }

    @Override // o.AbstractC9384oa, com.fasterxml.jackson.core.JsonParser
    public String l() {
        C9364oG b;
        JsonToken jsonToken = this.P;
        if ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (b = this.B.b()) != null) {
            return b.c();
        }
        return this.B.c();
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.i) {
            return;
        }
        this.n = Math.max(this.n, this.m);
        this.i = true;
        try {
            W();
        } finally {
            af();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation G() {
        return new JsonLocation(U(), -1L, ar(), ao(), an());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation k() {
        return new JsonLocation(U(), -1L, this.j + this.n, this.f, (this.n - this.h) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean M() {
        JsonToken jsonToken = this.P;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.s;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] e(Base64Variant base64Variant) {
        if (this.b == null) {
            if (this.P != JsonToken.VALUE_STRING) {
                f("Current token (" + this.P + ") not VALUE_STRING, can not access as binary");
            }
            C9439pc Z = Z();
            a(A(), Z, base64Variant);
            this.b = Z.i();
        }
        return this.b;
    }

    public void af() {
        this.A.m();
        char[] cArr = this.t;
        if (cArr != null) {
            this.t = null;
            this.q.a(cArr);
        }
    }

    @Override // o.AbstractC9384oa
    public void ae() {
        if (this.B.i()) {
            return;
        }
        e(String.format(": expected close marker for %s (start marker at %s)", this.B.h() ? "Array" : "Object", this.B.d(U())), (JsonToken) null);
    }

    public final int ab() {
        ae();
        return -1;
    }

    public C9439pc Z() {
        C9439pc c9439pc = this.g;
        if (c9439pc == null) {
            this.g = new C9439pc();
        } else {
            c9439pc.c();
        }
        return this.g;
    }

    public final JsonToken d(boolean z, int i) {
        this.z = z;
        this.k = i;
        this.f13892o = 0;
        this.l = 0;
        this.r = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    public final JsonToken a(boolean z, int i, int i2, int i3) {
        this.z = z;
        this.k = i;
        this.f13892o = i2;
        this.l = i3;
        this.r = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken d(String str, double d2) {
        this.A.b(str);
        this.x = d2;
        this.r = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean P() {
        if (this.P == JsonToken.VALUE_NUMBER_FLOAT && (this.r & 8) != 0) {
            double d2 = this.x;
            if (Double.isNaN(d2) || Double.isInfinite(d2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number y() {
        if (this.r == 0) {
            b(0);
        }
        if (this.P == JsonToken.VALUE_NUMBER_INT) {
            int i = this.r;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.u);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.D);
            }
            if ((i & 4) != 0) {
                return ac();
            }
            au();
        }
        int i2 = this.r;
        if ((i2 & 16) != 0) {
            return aa();
        }
        if ((i2 & 32) != 0) {
            return Float.valueOf(this.y);
        }
        if ((i2 & 8) == 0) {
            au();
        }
        return Double.valueOf(this.x);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType v() {
        if (this.r == 0) {
            b(0);
        }
        if (this.P == JsonToken.VALUE_NUMBER_INT) {
            int i = this.r;
            if ((i & 1) != 0) {
                return JsonParser.NumberType.INT;
            }
            if ((i & 2) != 0) {
                return JsonParser.NumberType.LONG;
            }
            return JsonParser.NumberType.BIG_INTEGER;
        }
        int i2 = this.r;
        if ((i2 & 16) != 0) {
            return JsonParser.NumberType.BIG_DECIMAL;
        }
        if ((i2 & 32) != 0) {
            return JsonParser.NumberType.FLOAT;
        }
        return JsonParser.NumberType.DOUBLE;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int u() {
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

    @Override // com.fasterxml.jackson.core.JsonParser
    public long w() {
        int i = this.r;
        if ((i & 2) == 0) {
            if (i == 0) {
                b(2);
            }
            if ((this.r & 2) == 0) {
                aq();
            }
        }
        return this.D;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger h() {
        int i = this.r;
        if ((i & 4) == 0) {
            if (i == 0) {
                b(4);
            }
            if ((this.r & 4) == 0) {
                ai();
            }
        }
        return ac();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float s() {
        int i = this.r;
        if ((i & 32) == 0) {
            if (i == 0) {
                b(32);
            }
            if ((this.r & 32) == 0) {
                am();
            }
        }
        return this.y;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double p() {
        int i = this.r;
        if ((i & 8) == 0) {
            if (i == 0) {
                b(8);
            }
            if ((this.r & 8) == 0) {
                al();
            }
        }
        return this.x;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal r() {
        int i = this.r;
        if ((i & 16) == 0) {
            if (i == 0) {
                b(16);
            }
            if ((this.r & 16) == 0) {
                ak();
            }
        }
        return aa();
    }

    protected void b(int i) {
        if (this.i) {
            f("Internal error: _parseNumericValue called when parser instance closed");
        }
        JsonToken jsonToken = this.P;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT) {
            if (jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
                h(i);
                return;
            } else {
                c("Current token (%s) not numeric, can not use numeric value accessors", (Object) jsonToken);
                return;
            }
        }
        int i2 = this.k;
        if (i2 <= 9) {
            this.u = this.A.d(this.z);
            this.r = 1;
        } else if (i2 <= 18) {
            long e = this.A.e(this.z);
            if (i2 == 10) {
                if (this.z) {
                    if (e >= -2147483648L) {
                        this.u = (int) e;
                        this.r = 1;
                        return;
                    }
                } else if (e <= 2147483647L) {
                    this.u = (int) e;
                    this.r = 1;
                    return;
                }
            }
            this.D = e;
            this.r = 2;
        } else {
            i(i);
        }
    }

    public int ad() {
        if (this.i) {
            f("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this.P == JsonToken.VALUE_NUMBER_INT && this.k <= 9) {
            int d2 = this.A.d(this.z);
            this.u = d2;
            this.r = 1;
            return d2;
        }
        b(1);
        if ((this.r & 1) == 0) {
            aj();
        }
        return this.u;
    }

    private void h(int i) {
        try {
            if (i == 16) {
                this.v = null;
                this.C = this.A.a();
                this.r = 16;
            } else if (i == 32) {
                this.y = this.A.c(a(JsonParser.Feature.USE_FAST_DOUBLE_PARSER));
                this.r = 32;
            } else {
                this.x = this.A.b(a(JsonParser.Feature.USE_FAST_DOUBLE_PARSER));
                this.r = 8;
            }
        } catch (NumberFormatException e) {
            c("Malformed numeric value (" + e(this.A.a()) + ")", (Throwable) e);
        }
    }

    private void i(int i) {
        String a = this.A.a();
        try {
            int i2 = this.k;
            char[] h = this.A.h();
            int i3 = this.A.i();
            boolean z = this.z;
            if (z) {
                i3++;
            }
            if (C9398oo.e(h, i3, i2, z)) {
                this.D = Long.parseLong(a);
                this.r = 2;
                return;
            }
            if (i == 1 || i == 2) {
                e(i, a);
            }
            if (i != 8 && i != 32) {
                this.w = null;
                this.C = a;
                this.r = 4;
                return;
            }
            this.x = C9398oo.c(a, a(JsonParser.Feature.USE_FAST_DOUBLE_PARSER));
            this.r = 8;
        } catch (NumberFormatException e) {
            c("Malformed numeric value (" + e(a) + ")", (Throwable) e);
        }
    }

    protected void e(int i, String str) {
        if (i == 1) {
            i(str);
        } else {
            j(str);
        }
    }

    public void aj() {
        int i = this.r;
        if ((i & 2) != 0) {
            long j = this.D;
            int i2 = (int) j;
            if (i2 != j) {
                b(A(), f());
            }
            this.u = i2;
        } else if ((i & 4) != 0) {
            BigInteger ac = ac();
            if (AbstractC9384oa.f13890J.compareTo(ac) > 0 || AbstractC9384oa.L.compareTo(ac) < 0) {
                at();
            }
            this.u = ac.intValue();
        } else if ((i & 8) != 0) {
            double d2 = this.x;
            if (d2 < -2.147483648E9d || d2 > 2.147483647E9d) {
                at();
            }
            this.u = (int) this.x;
        } else if ((i & 16) != 0) {
            BigDecimal aa = aa();
            if (AbstractC9384oa.M.compareTo(aa) > 0 || AbstractC9384oa.H.compareTo(aa) < 0) {
                at();
            }
            this.u = aa.intValue();
        } else {
            au();
        }
        this.r |= 1;
    }

    protected void aq() {
        int i = this.r;
        if ((i & 1) != 0) {
            this.D = this.u;
        } else if ((i & 4) != 0) {
            BigInteger ac = ac();
            if (AbstractC9384oa.O.compareTo(ac) > 0 || AbstractC9384oa.N.compareTo(ac) < 0) {
                aw();
            }
            this.D = ac.longValue();
        } else if ((i & 8) != 0) {
            double d2 = this.x;
            if (d2 < -9.223372036854776E18d || d2 > 9.223372036854776E18d) {
                aw();
            }
            this.D = (long) this.x;
        } else if ((i & 16) != 0) {
            BigDecimal aa = aa();
            if (AbstractC9384oa.K.compareTo(aa) > 0 || AbstractC9384oa.E.compareTo(aa) < 0) {
                aw();
            }
            this.D = aa.longValue();
        } else {
            au();
        }
        this.r |= 2;
    }

    protected void ai() {
        int i = this.r;
        if ((i & 16) != 0) {
            this.w = aa().toBigInteger();
        } else if ((i & 2) != 0) {
            this.w = BigInteger.valueOf(this.D);
        } else if ((i & 1) != 0) {
            this.w = BigInteger.valueOf(this.u);
        } else if ((i & 8) != 0) {
            this.w = BigDecimal.valueOf(this.x).toBigInteger();
        } else {
            au();
        }
        this.r |= 4;
    }

    protected void al() {
        double d2;
        int i = this.r;
        if ((i & 16) != 0) {
            this.x = aa().doubleValue();
        } else {
            if ((i & 4) != 0) {
                d2 = ac().doubleValue();
            } else if ((i & 2) != 0) {
                d2 = this.D;
            } else if ((i & 1) != 0) {
                d2 = this.u;
            } else if ((i & 32) != 0) {
                d2 = this.y;
            } else {
                au();
            }
            this.x = d2;
        }
        this.r |= 8;
    }

    protected void am() {
        float f;
        int i = this.r;
        if ((i & 16) != 0) {
            this.y = aa().floatValue();
        } else {
            if ((i & 4) != 0) {
                f = ac().floatValue();
            } else if ((i & 2) != 0) {
                f = (float) this.D;
            } else if ((i & 1) != 0) {
                f = this.u;
            } else if ((i & 8) != 0) {
                f = (float) this.x;
            } else {
                au();
            }
            this.y = f;
        }
        this.r |= 32;
    }

    protected void ak() {
        int i = this.r;
        if ((i & 8) != 0) {
            this.v = C9398oo.a(A());
        } else if ((i & 4) != 0) {
            this.v = new BigDecimal(ac());
        } else if ((i & 2) != 0) {
            this.v = BigDecimal.valueOf(this.D);
        } else if ((i & 1) != 0) {
            this.v = BigDecimal.valueOf(this.u);
        } else {
            au();
        }
        this.r |= 16;
    }

    protected BigInteger ac() {
        BigInteger bigInteger = this.w;
        if (bigInteger != null) {
            return bigInteger;
        }
        String str = this.C;
        if (str == null) {
            throw new IllegalStateException("cannot get BigInteger from current parser state");
        }
        BigInteger b = C9398oo.b(str);
        this.w = b;
        this.C = null;
        return b;
    }

    protected BigDecimal aa() {
        BigDecimal bigDecimal = this.v;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        String str = this.C;
        if (str == null) {
            throw new IllegalStateException("cannot get BigDecimal from current parser state");
        }
        BigDecimal a = C9398oo.a(str);
        this.v = a;
        this.C = null;
        return a;
    }

    public void e(int i, char c) {
        C9364oG z = z();
        f(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c), z.k(), z.d(U())));
    }

    public char b(char c) {
        if (a(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c;
        }
        if (c == '\'' && a(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return c;
        }
        f("Unrecognized character escape " + AbstractC9384oa.a(c));
        return c;
    }

    public void b(int i, String str) {
        if (!a(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32) {
            f("Illegal unquoted character (" + AbstractC9384oa.a((char) i) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    public String ag() {
        return ah();
    }

    public String ah() {
        return a(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    protected char V() {
        throw new UnsupportedOperationException();
    }

    public final int e(Base64Variant base64Variant, int i, int i2) {
        if (i != 92) {
            throw d(base64Variant, i, i2);
        }
        char V = V();
        if (V > ' ' || i2 != 0) {
            int e = base64Variant.e((int) V);
            if (e >= 0 || e == -2) {
                return e;
            }
            throw d(base64Variant, V, i2);
        }
        return -1;
    }

    public final int e(Base64Variant base64Variant, char c, int i) {
        if (c != '\\') {
            throw d(base64Variant, c, i);
        }
        char V = V();
        if (V > ' ' || i != 0) {
            int b = base64Variant.b(V);
            if (b >= 0 || (b == -2 && i >= 2)) {
                return b;
            }
            throw d(base64Variant, V, i);
        }
        return -1;
    }

    protected IllegalArgumentException d(Base64Variant base64Variant, int i, int i2) {
        return a(base64Variant, i, i2, (String) null);
    }

    public IllegalArgumentException a(Base64Variant base64Variant, int i, int i2, String str) {
        String str2;
        if (i <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i), Integer.valueOf(i2 + 1));
        } else if (base64Variant.b(i)) {
            str2 = "Unexpected padding character ('" + base64Variant.j() + "') as character #" + (i2 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i) || Character.isISOControl(i)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(i) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i) + "' (code 0x" + Integer.toHexString(i) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    public void d(Base64Variant base64Variant) {
        f(base64Variant.g());
    }

    public ContentReference U() {
        if (JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.e(this.a)) {
            return this.q.g();
        }
        return ContentReference.b();
    }

    public static int[] a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return Arrays.copyOf(iArr, iArr.length + i);
    }
}
