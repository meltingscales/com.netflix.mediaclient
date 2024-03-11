package o;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import com.squareup.moshi.JsonReader;
import java.io.EOFException;
import java.math.BigDecimal;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class dnG extends JsonReader {
    private int k = 0;
    private final C7872dIo m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private long f13860o;
    private String q;
    private dnI r;
    private final InterfaceC7871dIn t;
    private static final ByteString j = ByteString.e("'\\");
    private static final ByteString i = ByteString.e("\"\\");
    private static final ByteString l = ByteString.e("{}[]:, \n\t\r\f/\\;#=");
    private static final ByteString g = ByteString.e("\n\r");
    private static final ByteString f = ByteString.e("*/");

    public dnG(InterfaceC7871dIn interfaceC7871dIn) {
        if (interfaceC7871dIn == null) {
            throw new NullPointerException("source == null");
        }
        this.t = interfaceC7871dIn;
        this.m = interfaceC7871dIn.o();
        e(6);
    }

    @Override // com.squareup.moshi.JsonReader
    public void a() {
        int i2 = this.k;
        if (i2 == 0) {
            i2 = r();
        }
        if (i2 == 3) {
            e(1);
            this.a[this.h - 1] = 0;
            this.k = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + l() + " at path " + d());
    }

    @Override // com.squareup.moshi.JsonReader
    public void c() {
        int i2 = this.k;
        if (i2 == 0) {
            i2 = r();
        }
        if (i2 == 4) {
            int i3 = this.h;
            this.h = i3 - 1;
            int[] iArr = this.a;
            int i4 = i3 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.k = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + l() + " at path " + d());
    }

    @Override // com.squareup.moshi.JsonReader
    public void e() {
        int i2 = this.k;
        if (i2 == 0) {
            i2 = r();
        }
        if (i2 == 1) {
            e(3);
            this.k = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + l() + " at path " + d());
    }

    @Override // com.squareup.moshi.JsonReader
    public void b() {
        int i2 = this.k;
        if (i2 == 0) {
            i2 = r();
        }
        if (i2 == 2) {
            int i3 = this.h;
            int i4 = i3 - 1;
            this.h = i4;
            this.b[i4] = null;
            int[] iArr = this.a;
            int i5 = i3 - 2;
            iArr[i5] = iArr[i5] + 1;
            this.k = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + l() + " at path " + d());
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean h() {
        int i2 = this.k;
        if (i2 == 0) {
            i2 = r();
        }
        return (i2 == 2 || i2 == 4 || i2 == 18) ? false : true;
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader.Token l() {
        int i2 = this.k;
        if (i2 == 0) {
            i2 = r();
        }
        switch (i2) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    private int r() {
        int[] iArr = this.e;
        int i2 = this.h - 1;
        int i3 = iArr[i2];
        if (i3 == 1) {
            iArr[i2] = 2;
        } else if (i3 == 2) {
            int e = e(true);
            this.m.l();
            if (e != 44) {
                if (e != 59) {
                    if (e == 93) {
                        this.k = 4;
                        return 4;
                    }
                    throw b("Unterminated array");
                }
                s();
            }
        } else if (i3 == 3 || i3 == 5) {
            iArr[i2] = 4;
            if (i3 == 5) {
                int e2 = e(true);
                this.m.l();
                if (e2 != 44) {
                    if (e2 != 59) {
                        if (e2 == 125) {
                            this.k = 2;
                            return 2;
                        }
                        throw b("Unterminated object");
                    }
                    s();
                }
            }
            int e3 = e(true);
            if (e3 == 34) {
                this.m.l();
                this.k = 13;
                return 13;
            } else if (e3 == 39) {
                this.m.l();
                s();
                this.k = 12;
                return 12;
            } else if (e3 != 125) {
                s();
                if (d((char) e3)) {
                    this.k = 14;
                    return 14;
                }
                throw b("Expected name");
            } else if (i3 != 5) {
                this.m.l();
                this.k = 2;
                return 2;
            } else {
                throw b("Expected name");
            }
        } else if (i3 == 4) {
            iArr[i2] = 5;
            int e4 = e(true);
            this.m.l();
            if (e4 != 58) {
                if (e4 == 61) {
                    s();
                    if (this.t.j(1L) && this.m.a(0L) == 62) {
                        this.m.l();
                    }
                } else {
                    throw b("Expected ':'");
                }
            }
        } else if (i3 == 6) {
            iArr[i2] = 7;
        } else if (i3 == 7) {
            if (e(false) == -1) {
                this.k = 18;
                return 18;
            }
            s();
        } else if (i3 == 9) {
            this.r.a();
            this.r = null;
            this.h--;
            return r();
        } else if (i3 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int e5 = e(true);
        if (e5 == 34) {
            this.m.l();
            this.k = 9;
            return 9;
        } else if (e5 == 39) {
            s();
            this.m.l();
            this.k = 8;
            return 8;
        } else {
            if (e5 != 44 && e5 != 59) {
                if (e5 == 91) {
                    this.m.l();
                    this.k = 3;
                    return 3;
                } else if (e5 != 93) {
                    if (e5 == 123) {
                        this.m.l();
                        this.k = 1;
                        return 1;
                    }
                    int x = x();
                    if (x != 0) {
                        return x;
                    }
                    int v = v();
                    if (v != 0) {
                        return v;
                    }
                    if (!d(this.m.a(0L))) {
                        throw b("Expected value");
                    }
                    s();
                    this.k = 10;
                    return 10;
                } else if (i3 == 1) {
                    this.m.l();
                    this.k = 4;
                    return 4;
                }
            }
            if (i3 == 1 || i3 == 2) {
                s();
                this.k = 7;
                return 7;
            }
            throw b("Unexpected value");
        }
    }

    private int x() {
        String str;
        String str2;
        int i2;
        byte a = this.m.a(0L);
        if (a == 116 || a == 84) {
            str = "true";
            str2 = "TRUE";
            i2 = 5;
        } else if (a == 102 || a == 70) {
            str = "false";
            str2 = "FALSE";
            i2 = 6;
        } else if (a != 110 && a != 78) {
            return 0;
        } else {
            str = "null";
            str2 = "NULL";
            i2 = 7;
        }
        int length = str.length();
        int i3 = 1;
        while (i3 < length) {
            int i4 = i3 + 1;
            if (!this.t.j(i4)) {
                return 0;
            }
            byte a2 = this.m.a(i3);
            if (a2 != str.charAt(i3) && a2 != str2.charAt(i3)) {
                return 0;
            }
            i3 = i4;
        }
        if (this.t.j(length + 1) && d(this.m.a(length))) {
            return 0;
        }
        this.m.h(length);
        this.k = i2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
        if (d(r11) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
        if (r6 != 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
        if (r7 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
        if (r9 != Long.MIN_VALUE) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
        if (r8 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
        if (r9 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
        if (r8 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
        if (r8 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
        r9 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
        r16.f13860o = r9;
        r16.m.h(r5);
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
        r16.k = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a5, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a6, code lost:
        if (r6 == 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a9, code lost:
        if (r6 == 4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ac, code lost:
        if (r6 != 7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00af, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b0, code lost:
        r16.n = r5;
        r1 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b5, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int v() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dnG.v():int");
    }

    private boolean d(int i2) {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (i2 != 47 && i2 != 61) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        s();
        return false;
    }

    public String q() {
        String str;
        int i2 = this.k;
        if (i2 == 0) {
            i2 = r();
        }
        if (i2 == 14) {
            str = y();
        } else if (i2 == 13) {
            str = b(i);
        } else if (i2 == 12) {
            str = b(j);
        } else if (i2 != 15) {
            throw new JsonDataException("Expected a name but was " + l() + " at path " + d());
        } else {
            str = this.q;
            this.q = null;
        }
        this.k = 0;
        this.b[this.h - 1] = str;
        return str;
    }

    @Override // com.squareup.moshi.JsonReader
    public int d(JsonReader.c cVar) {
        int i2 = this.k;
        if (i2 == 0) {
            i2 = r();
        }
        if (i2 < 12 || i2 > 15) {
            return -1;
        }
        if (i2 == 15) {
            return e(this.q, cVar);
        }
        int b = this.t.b(cVar.b);
        if (b != -1) {
            this.k = 0;
            this.b[this.h - 1] = cVar.a[b];
            return b;
        }
        String str = this.b[this.h - 1];
        String q = q();
        int e = e(q, cVar);
        if (e == -1) {
            this.k = 15;
            this.q = q;
            this.b[this.h - 1] = str;
        }
        return e;
    }

    @Override // com.squareup.moshi.JsonReader
    public void t() {
        if (this.d) {
            JsonReader.Token l2 = l();
            q();
            throw new JsonDataException("Cannot skip unexpected " + l2 + " at " + d());
        }
        int i2 = this.k;
        if (i2 == 0) {
            i2 = r();
        }
        if (i2 == 14) {
            z();
        } else if (i2 == 13) {
            a(i);
        } else if (i2 == 12) {
            a(j);
        } else if (i2 != 15) {
            throw new JsonDataException("Expected a name but was " + l() + " at path " + d());
        }
        this.k = 0;
        this.b[this.h - 1] = "null";
    }

    private int e(String str, JsonReader.c cVar) {
        int length = cVar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(cVar.a[i2])) {
                this.k = 0;
                this.b[this.h - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public String m() {
        String b;
        int i2 = this.k;
        if (i2 == 0) {
            i2 = r();
        }
        if (i2 == 10) {
            b = y();
        } else if (i2 == 9) {
            b = b(i);
        } else if (i2 == 8) {
            b = b(j);
        } else if (i2 == 11) {
            b = this.q;
            this.q = null;
        } else if (i2 == 16) {
            b = Long.toString(this.f13860o);
        } else if (i2 == 17) {
            b = this.m.b(this.n);
        } else {
            throw new JsonDataException("Expected a string but was " + l() + " at path " + d());
        }
        this.k = 0;
        int[] iArr = this.a;
        int i3 = this.h - 1;
        iArr[i3] = iArr[i3] + 1;
        return b;
    }

    @Override // com.squareup.moshi.JsonReader
    public int c(JsonReader.c cVar) {
        int[] iArr;
        int i2;
        int i3 = this.k;
        if (i3 == 0) {
            i3 = r();
        }
        if (i3 < 8 || i3 > 11) {
            return -1;
        }
        if (i3 == 11) {
            return c(this.q, cVar);
        }
        int b = this.t.b(cVar.b);
        if (b != -1) {
            this.k = 0;
            int[] iArr2 = this.a;
            int i4 = this.h - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return b;
        }
        String m = m();
        int c = c(m, cVar);
        if (c == -1) {
            this.k = 11;
            this.q = m;
            this.a[this.h - 1] = iArr[i2] - 1;
        }
        return c;
    }

    private int c(String str, JsonReader.c cVar) {
        int length = cVar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(cVar.a[i2])) {
                this.k = 0;
                int[] iArr = this.a;
                int i3 = this.h - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean i() {
        int i2 = this.k;
        if (i2 == 0) {
            i2 = r();
        }
        if (i2 == 5) {
            this.k = 0;
            int[] iArr = this.a;
            int i3 = this.h - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.k = 0;
            int[] iArr2 = this.a;
            int i4 = this.h - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + l() + " at path " + d());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public <T> T o() {
        int i2 = this.k;
        if (i2 == 0) {
            i2 = r();
        }
        if (i2 == 7) {
            this.k = 0;
            int[] iArr = this.a;
            int i3 = this.h - 1;
            iArr[i3] = iArr[i3] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + l() + " at path " + d());
    }

    @Override // com.squareup.moshi.JsonReader
    public double g() {
        int i2 = this.k;
        if (i2 == 0) {
            i2 = r();
        }
        if (i2 == 16) {
            this.k = 0;
            int[] iArr = this.a;
            int i3 = this.h - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f13860o;
        }
        if (i2 == 17) {
            this.q = this.m.b(this.n);
        } else if (i2 == 9) {
            this.q = b(i);
        } else if (i2 == 8) {
            this.q = b(j);
        } else if (i2 == 10) {
            this.q = y();
        } else if (i2 != 11) {
            throw new JsonDataException("Expected a double but was " + l() + " at path " + d());
        }
        this.k = 11;
        try {
            double parseDouble = Double.parseDouble(this.q);
            if (!this.c && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + d());
            }
            this.q = null;
            this.k = 0;
            int[] iArr2 = this.a;
            int i4 = this.h - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.q + " at path " + d());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public long n() {
        String b;
        int i2 = this.k;
        if (i2 == 0) {
            i2 = r();
        }
        if (i2 == 16) {
            this.k = 0;
            int[] iArr = this.a;
            int i3 = this.h - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f13860o;
        }
        if (i2 == 17) {
            this.q = this.m.b(this.n);
        } else if (i2 == 9 || i2 == 8) {
            if (i2 == 9) {
                b = b(i);
            } else {
                b = b(j);
            }
            this.q = b;
            try {
                long parseLong = Long.parseLong(b);
                this.k = 0;
                int[] iArr2 = this.a;
                int i4 = this.h - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i2 != 11) {
            throw new JsonDataException("Expected a long but was " + l() + " at path " + d());
        }
        this.k = 11;
        try {
            long longValueExact = new BigDecimal(this.q).longValueExact();
            this.q = null;
            this.k = 0;
            int[] iArr3 = this.a;
            int i5 = this.h - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.q + " at path " + d());
        }
    }

    private String b(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long d = this.t.d(byteString);
            if (d == -1) {
                throw b("Unterminated string");
            }
            if (this.m.a(d) != 92) {
                if (sb == null) {
                    String b = this.m.b(d);
                    this.m.l();
                    return b;
                }
                sb.append(this.m.b(d));
                this.m.l();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.m.b(d));
            this.m.l();
            sb.append(w());
        }
    }

    private String y() {
        long d = this.t.d(l);
        return d != -1 ? this.m.b(d) : this.m.v();
    }

    private void a(ByteString byteString) {
        while (true) {
            long d = this.t.d(byteString);
            if (d == -1) {
                throw b("Unterminated string");
            }
            if (this.m.a(d) == 92) {
                this.m.h(d + 1);
                w();
            } else {
                this.m.h(d + 1);
                return;
            }
        }
    }

    private void z() {
        long d = this.t.d(l);
        C7872dIo c7872dIo = this.m;
        if (d == -1) {
            d = c7872dIo.D();
        }
        c7872dIo.h(d);
    }

    @Override // com.squareup.moshi.JsonReader
    public int f() {
        String b;
        int i2 = this.k;
        if (i2 == 0) {
            i2 = r();
        }
        if (i2 == 16) {
            long j2 = this.f13860o;
            int i3 = (int) j2;
            if (j2 != i3) {
                throw new JsonDataException("Expected an int but was " + this.f13860o + " at path " + d());
            }
            this.k = 0;
            int[] iArr = this.a;
            int i4 = this.h - 1;
            iArr[i4] = iArr[i4] + 1;
            return i3;
        }
        if (i2 == 17) {
            this.q = this.m.b(this.n);
        } else if (i2 == 9 || i2 == 8) {
            if (i2 == 9) {
                b = b(i);
            } else {
                b = b(j);
            }
            this.q = b;
            try {
                int parseInt = Integer.parseInt(b);
                this.k = 0;
                int[] iArr2 = this.a;
                int i5 = this.h - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i2 != 11) {
            throw new JsonDataException("Expected an int but was " + l() + " at path " + d());
        }
        this.k = 11;
        try {
            double parseDouble = Double.parseDouble(this.q);
            int i6 = (int) parseDouble;
            if (i6 != parseDouble) {
                throw new JsonDataException("Expected an int but was " + this.q + " at path " + d());
            }
            this.q = null;
            this.k = 0;
            int[] iArr3 = this.a;
            int i7 = this.h - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.q + " at path " + d());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.k = 0;
        this.e[0] = 8;
        this.h = 1;
        this.m.d();
        this.t.close();
    }

    @Override // com.squareup.moshi.JsonReader
    public void p() {
        if (this.d) {
            throw new JsonDataException("Cannot skip unexpected " + l() + " at " + d());
        }
        int i2 = 0;
        do {
            int i3 = this.k;
            if (i3 == 0) {
                i3 = r();
            }
            if (i3 == 3) {
                e(1);
            } else if (i3 == 1) {
                e(3);
            } else {
                if (i3 == 4) {
                    i2--;
                    if (i2 < 0) {
                        throw new JsonDataException("Expected a value but was " + l() + " at path " + d());
                    }
                    this.h--;
                } else if (i3 == 2) {
                    i2--;
                    if (i2 < 0) {
                        throw new JsonDataException("Expected a value but was " + l() + " at path " + d());
                    }
                    this.h--;
                } else if (i3 == 14 || i3 == 10) {
                    z();
                } else if (i3 == 9 || i3 == 13) {
                    a(i);
                } else if (i3 == 8 || i3 == 12) {
                    a(j);
                } else if (i3 == 17) {
                    this.m.h(this.n);
                } else if (i3 == 18) {
                    throw new JsonDataException("Expected a value but was " + l() + " at path " + d());
                }
                this.k = 0;
            }
            i2++;
            this.k = 0;
        } while (i2 != 0);
        int[] iArr = this.a;
        int i4 = this.h - 1;
        iArr[i4] = iArr[i4] + 1;
        this.b[i4] = "null";
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        r5.m.h(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0 != 47) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r5.t.j(2) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        s();
        r2 = r5.m.a(1L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r2 == 42) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r2 == 47) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        r5.m.l();
        r5.m.l();
        D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        r5.m.l();
        r5.m.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
        if (u() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
        throw b("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r0 != 35) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        s();
        D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int e(boolean r6) {
        /*
            r5 = this;
        L0:
            r0 = 0
        L1:
            o.dIn r1 = r5.t
            int r2 = r0 + 1
            long r3 = (long) r2
            boolean r1 = r1.j(r3)
            if (r1 == 0) goto L7e
            o.dIo r1 = r5.m
            long r3 = (long) r0
            byte r0 = r1.a(r3)
            r1 = 10
            if (r0 == r1) goto L7c
            r1 = 32
            if (r0 == r1) goto L7c
            r1 = 13
            if (r0 == r1) goto L7c
            r1 = 9
            if (r0 != r1) goto L24
            goto L7c
        L24:
            o.dIo r1 = r5.m
            r1.h(r3)
            r1 = 47
            if (r0 != r1) goto L70
            o.dIn r2 = r5.t
            r3 = 2
            boolean r2 = r2.j(r3)
            if (r2 != 0) goto L38
            return r0
        L38:
            r5.s()
            o.dIo r2 = r5.m
            r3 = 1
            byte r2 = r2.a(r3)
            r3 = 42
            if (r2 == r3) goto L58
            if (r2 == r1) goto L4a
            return r0
        L4a:
            o.dIo r0 = r5.m
            r0.l()
            o.dIo r0 = r5.m
            r0.l()
            r5.D()
            goto L0
        L58:
            o.dIo r0 = r5.m
            r0.l()
            o.dIo r0 = r5.m
            r0.l()
            boolean r0 = r5.u()
            if (r0 == 0) goto L69
            goto L0
        L69:
            java.lang.String r6 = "Unterminated comment"
            com.squareup.moshi.JsonEncodingException r6 = r5.b(r6)
            throw r6
        L70:
            r1 = 35
            if (r0 != r1) goto L7b
            r5.s()
            r5.D()
            goto L0
        L7b:
            return r0
        L7c:
            r0 = r2
            goto L1
        L7e:
            if (r6 != 0) goto L82
            r6 = -1
            return r6
        L82:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dnG.e(boolean):int");
    }

    private void s() {
        if (!this.c) {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void D() {
        long d = this.t.d(g);
        C7872dIo c7872dIo = this.m;
        c7872dIo.h(d != -1 ? d + 1 : c7872dIo.D());
    }

    private boolean u() {
        InterfaceC7871dIn interfaceC7871dIn = this.t;
        ByteString byteString = f;
        long e = interfaceC7871dIn.e(byteString);
        boolean z = e != -1;
        C7872dIo c7872dIo = this.m;
        c7872dIo.h(z ? e + byteString.k() : c7872dIo.D());
        return z;
    }

    public String toString() {
        return "JsonReader(" + this.t + ")";
    }

    private char w() {
        int i2;
        if (!this.t.j(1L)) {
            throw b("Unterminated escape sequence");
        }
        byte l2 = this.m.l();
        if (l2 == 10 || l2 == 34 || l2 == 39 || l2 == 47 || l2 == 92) {
            return (char) l2;
        }
        if (l2 != 98) {
            if (l2 != 102) {
                if (l2 != 110) {
                    if (l2 != 114) {
                        if (l2 != 116) {
                            if (l2 != 117) {
                                if (this.c) {
                                    return (char) l2;
                                }
                                throw b("Invalid escape sequence: \\" + ((char) l2));
                            } else if (!this.t.j(4L)) {
                                throw new EOFException("Unterminated escape sequence at path " + d());
                            } else {
                                char c = 0;
                                for (int i3 = 0; i3 < 4; i3++) {
                                    byte a = this.m.a(i3);
                                    char c2 = (char) (c << 4);
                                    if (a >= 48 && a <= 57) {
                                        i2 = a - 48;
                                    } else if (a >= 97 && a <= 102) {
                                        i2 = a - 87;
                                    } else if (a < 65 || a > 70) {
                                        throw b("\\u" + this.m.b(4L));
                                    } else {
                                        i2 = a - 55;
                                    }
                                    c = (char) (c2 + i2);
                                }
                                this.m.h(4L);
                                return c;
                            }
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

    @Override // com.squareup.moshi.JsonReader
    public void k() {
        if (h()) {
            this.q = q();
            this.k = 11;
        }
    }
}
