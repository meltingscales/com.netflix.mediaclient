package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public abstract class dEU {
    private String b;
    protected int d;
    public final C7799dFu c = new C7799dFu();
    private StringBuilder a = new StringBuilder();

    public abstract String a();

    public abstract boolean b();

    public abstract byte c();

    public abstract int c(int i);

    public abstract String d(String str, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean e(char c) {
        return !(c == '}' || c == ']' || c == ':' || c == ',');
    }

    public final void i() {
        this.b = null;
    }

    protected abstract CharSequence l();

    public void m() {
    }

    public abstract boolean q();

    public final void o() {
        if (c() == 10) {
            return;
        }
        d(this, "Expected EOF after parsing, but had " + l().charAt(this.d - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final byte c(byte b) {
        byte c = c();
        if (c == b) {
            return c;
        }
        e(this, b, false, 2, null);
        throw new KotlinNothingValueException();
    }

    public void c(char c) {
        m();
        CharSequence l = l();
        int i = this.d;
        while (true) {
            int c2 = c(i);
            if (c2 != -1) {
                int i2 = c2 + 1;
                char charAt = l.charAt(c2);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.d = i2;
                    if (charAt == c) {
                        return;
                    }
                    d(c);
                }
                i = i2;
            } else {
                this.d = c2;
                d(c);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(char c) {
        int i = this.d;
        if (i > 0 && c == '\"') {
            try {
                this.d = i - 1;
                String j = j();
                this.d = i;
                if (C8632dsu.c((Object) j, (Object) "null")) {
                    c("Expected string literal but 'null' literal was found", this.d - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls to default values.");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th) {
                this.d = i;
                throw th;
            }
        }
        e(this, dEZ.e(c), false, 2, null);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void e(dEU deu, byte b, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return deu.b(b, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    public final Void b(byte b, boolean z) {
        String a = dEZ.a(b);
        int i = z ? this.d - 1 : this.d;
        String valueOf = (this.d == l().length() || i < 0) ? "EOF" : String.valueOf(l().charAt(i));
        d(this, "Expected " + a + ", but had '" + valueOf + "' instead", i, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final byte n() {
        CharSequence l = l();
        int i = this.d;
        while (true) {
            int c = c(i);
            if (c == -1) {
                this.d = c;
                return (byte) 10;
            }
            char charAt = l.charAt(c);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.d = c;
                return dEZ.e(charAt);
            }
            i = c + 1;
        }
    }

    public static /* synthetic */ boolean a(dEU deu, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return deu.e(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
    }

    public final boolean e(boolean z) {
        int c = c(k());
        int length = l().length() - c;
        if (length < 4 || c == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != l().charAt(c + i)) {
                return false;
            }
        }
        if (length <= 4 || dEZ.e(l().charAt(c + 4)) != 0) {
            if (z) {
                this.d = c + 4;
                return true;
            }
            return true;
        }
        return false;
    }

    public int k() {
        int c;
        char charAt;
        int i = this.d;
        while (true) {
            c = c(i);
            if (c == -1 || !((charAt = l().charAt(c)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i = c + 1;
        }
        this.d = c;
        return c;
    }

    public final String a(boolean z) {
        String h;
        byte n = n();
        if (z) {
            if (n != 1 && n != 0) {
                return null;
            }
            h = j();
        } else if (n != 1) {
            return null;
        } else {
            h = h();
        }
        this.b = h;
        return h;
    }

    public String e(int i, int i2) {
        return l().subSequence(i, i2).toString();
    }

    public final String h() {
        if (this.b != null) {
            return t();
        }
        return a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String e(CharSequence charSequence, int i, int i2) {
        String c;
        int c2;
        C8632dsu.c((Object) charSequence, "");
        char charAt = charSequence.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                c2 = c(d(i, i2));
                if (c2 == -1) {
                    d(this, "Unexpected EOF", c2, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    a(i, i2);
                    c2 = c(i2);
                    if (c2 == -1) {
                        d(this, "Unexpected EOF", c2, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i2);
                }
            }
            z = true;
            i = c2;
            i2 = i;
            charAt = charSequence.charAt(i2);
        }
        if (!z) {
            c = e(i, i2);
        } else {
            c = c(i, i2);
        }
        this.d = i2 + 1;
        return c;
    }

    private final int d(int i, int i2) {
        a(i, i2);
        return e(i2 + 1);
    }

    private final String c(int i, int i2) {
        a(i, i2);
        String sb = this.a.toString();
        C8632dsu.a(sb, "");
        this.a.setLength(0);
        return sb;
    }

    private final String t() {
        String str = this.b;
        C8632dsu.d((Object) str);
        this.b = null;
        return str;
    }

    public final String g() {
        String j = j();
        if (C8632dsu.c((Object) j, (Object) "null") && p()) {
            d(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return j;
    }

    private final boolean p() {
        return l().charAt(this.d - 1) != '\"';
    }

    public final String j() {
        String c;
        if (this.b != null) {
            return t();
        }
        int k = k();
        if (k >= l().length() || k == -1) {
            d(this, "EOF", k, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte e = dEZ.e(l().charAt(k));
        if (e == 1) {
            return h();
        }
        if (e != 0) {
            d(this, "Expected beginning of the string, but got " + l().charAt(k), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z = false;
        while (dEZ.e(l().charAt(k)) == 0) {
            k++;
            if (k >= l().length()) {
                a(this.d, k);
                int c2 = c(k);
                if (c2 == -1) {
                    this.d = k;
                    return c(0, 0);
                }
                k = c2;
                z = true;
            }
        }
        if (!z) {
            c = e(this.d, k);
        } else {
            c = c(this.d, k);
        }
        this.d = k;
        return c;
    }

    protected void a(int i, int i2) {
        this.a.append(l(), i, i2);
    }

    private final int e(int i) {
        int c = c(i);
        if (c == -1) {
            d(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i2 = c + 1;
        char charAt = l().charAt(c);
        if (charAt == 'u') {
            return b(l(), i2);
        }
        char c2 = dEZ.c(charAt);
        if (c2 == 0) {
            d(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        this.a.append(c2);
        return i2;
    }

    private final int b(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.d = i;
            m();
            if (this.d + 4 >= charSequence.length()) {
                d(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return b(charSequence, this.d);
        }
        this.a.append((char) ((e(charSequence, i) << 12) + (e(charSequence, i + 1) << 8) + (e(charSequence, i + 2) << 4) + e(charSequence, i + 3)));
        return i2;
    }

    private final int e(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' > charAt || charAt >= ':') {
            if ('a' > charAt || charAt >= 'g') {
                if ('A' > charAt || charAt >= 'G') {
                    d(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                return charAt - '7';
            }
            return charAt - 'W';
        }
        return charAt - '0';
    }

    public final void b(boolean z) {
        Object B;
        Object B2;
        ArrayList arrayList = new ArrayList();
        byte n = n();
        if (n != 8 && n != 6) {
            j();
            return;
        }
        while (true) {
            byte n2 = n();
            if (n2 != 1) {
                if (n2 == 8 || n2 == 6) {
                    arrayList.add(Byte.valueOf(n2));
                } else if (n2 == 9) {
                    B2 = C8576dqs.B((List<? extends Object>) arrayList);
                    if (((Number) B2).byteValue() != 8) {
                        int i = this.d;
                        throw C7797dFs.a(i, "found ] instead of } at path: " + this.c, l());
                    }
                    C8571dqn.v(arrayList);
                } else if (n2 == 7) {
                    B = C8576dqs.B((List<? extends Object>) arrayList);
                    if (((Number) B).byteValue() != 6) {
                        int i2 = this.d;
                        throw C7797dFs.a(i2, "found } instead of ] at path: " + this.c, l());
                    }
                    C8571dqn.v(arrayList);
                } else if (n2 == 10) {
                    d(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                c();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z) {
                j();
            } else {
                a();
            }
        }
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) l()) + "', currentPosition=" + this.d + ')';
    }

    public final void e(String str) {
        int c;
        C8632dsu.c((Object) str, "");
        c = duD.c((CharSequence) e(0, this.d), str, 0, false, 6, (Object) null);
        c("Encountered an unknown key '" + str + '\'', c, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void d(dEU deu, String str, int i, String str2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = deu.d;
            }
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            return deu.c(str, i, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    public final Void c(String str, int i, String str2) {
        String str3 = "";
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        if (str2.length() != 0) {
            str3 = '\n' + str2;
        }
        throw C7797dFs.a(i, str + " at path: " + this.c.e() + str3, l());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f5, code lost:
        d(r17, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0205, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
        if (r5 == r0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0146, code lost:
        if (r0 == r5) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0148, code lost:
        if (r9 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
        if (r0 == (r5 - 1)) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
        if (r1 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0150, code lost:
        if (r3 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015c, code lost:
        if (l().charAt(r5) != '\"') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015e, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0161, code lost:
        d(r17, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0171, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0172, code lost:
        d(r17, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0182, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0183, code lost:
        r17.d = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0185, code lost:
        if (r10 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0187, code lost:
        r0 = r11 * e(r13, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0191, code lost:
        if (r0 > 9.223372036854776E18d) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0197, code lost:
        if (r0 < (-9.223372036854776E18d)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019f, code lost:
        if (java.lang.Math.floor(r0) != r0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a1, code lost:
        r11 = (long) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a3, code lost:
        d(r17, "Can't convert " + r0 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c7, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c8, code lost:
        d(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d8, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d9, code lost:
        if (r9 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e0, code lost:
        if (r11 == Long.MIN_VALUE) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e3, code lost:
        return -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e4, code lost:
        d(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f4, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f() {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dEU.f():long");
    }

    private static final double e(long j, boolean z) {
        if (z) {
            if (z) {
                return Math.pow(10.0d, j);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Math.pow(10.0d, -j);
    }

    public final boolean e() {
        return a(k());
    }

    public final boolean d() {
        boolean z;
        int k = k();
        if (k == l().length()) {
            d(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (l().charAt(k) == '\"') {
            k++;
            z = true;
        } else {
            z = false;
        }
        boolean a = a(k);
        if (z) {
            if (this.d == l().length()) {
                d(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            } else if (l().charAt(this.d) != '\"') {
                d(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            } else {
                this.d++;
            }
        }
        return a;
    }

    private final boolean a(int i) {
        int c = c(i);
        if (c >= l().length() || c == -1) {
            d(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i2 = c + 1;
        int charAt = l().charAt(c) | ' ';
        if (charAt == 102) {
            e("alse", i2);
            return false;
        } else if (charAt == 116) {
            e("rue", i2);
            return true;
        } else {
            d(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    private final void e(String str, int i) {
        if (l().length() - i < str.length()) {
            d(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (l().charAt(i + i2) | ' ')) {
                d(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.d = i + str.length();
    }
}
