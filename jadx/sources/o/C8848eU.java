package o;

import com.airbnb.lottie.parser.moshi.JsonDataException;
import com.airbnb.lottie.parser.moshi.JsonEncodingException;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.EOFException;
import okio.ByteString;

/* renamed from: o.eU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8848eU extends JsonReader {
    private int k;
    private long m;
    private final C7872dIo n;

    /* renamed from: o  reason: collision with root package name */
    private int f13865o = 0;
    private final InterfaceC7871dIn q;
    private String t;
    private static final ByteString i = ByteString.e("'\\");
    private static final ByteString h = ByteString.e("\"\\");
    private static final ByteString l = ByteString.e("{}[]:, \n\t\r\f/\\;#=");
    private static final ByteString g = ByteString.e("\n\r");
    private static final ByteString j = ByteString.e("*/");

    public C8848eU(InterfaceC7871dIn interfaceC7871dIn) {
        if (interfaceC7871dIn == null) {
            throw new NullPointerException("source == null");
        }
        this.q = interfaceC7871dIn;
        this.n = interfaceC7871dIn.c();
        a(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void c() {
        int i2 = this.f13865o;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 3) {
            a(1);
            this.b[this.f - 1] = 0;
            this.f13865o = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + l() + " at path " + b());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void a() {
        int i2 = this.f13865o;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 4) {
            int i3 = this.f;
            this.f = i3 - 1;
            int[] iArr = this.b;
            int i4 = i3 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.f13865o = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + l() + " at path " + b());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void e() {
        int i2 = this.f13865o;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 1) {
            a(3);
            this.f13865o = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + l() + " at path " + b());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void d() {
        int i2 = this.f13865o;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 2) {
            int i3 = this.f;
            int i4 = i3 - 1;
            this.f = i4;
            this.e[i4] = null;
            int[] iArr = this.b;
            int i5 = i3 - 2;
            iArr[i5] = iArr[i5] + 1;
            this.f13865o = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + l() + " at path " + b());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean f() {
        int i2 = this.f13865o;
        if (i2 == 0) {
            i2 = s();
        }
        return (i2 == 2 || i2 == 4 || i2 == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token l() {
        int i2 = this.f13865o;
        if (i2 == 0) {
            i2 = s();
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

    private int s() {
        int[] iArr = this.c;
        int i2 = this.f - 1;
        int i3 = iArr[i2];
        if (i3 == 1) {
            iArr[i2] = 2;
        } else if (i3 == 2) {
            int e = e(true);
            this.n.l();
            if (e != 44) {
                if (e != 59) {
                    if (e == 93) {
                        this.f13865o = 4;
                        return 4;
                    }
                    throw d("Unterminated array");
                }
                n();
            }
        } else if (i3 == 3 || i3 == 5) {
            iArr[i2] = 4;
            if (i3 == 5) {
                int e2 = e(true);
                this.n.l();
                if (e2 != 44) {
                    if (e2 != 59) {
                        if (e2 == 125) {
                            this.f13865o = 2;
                            return 2;
                        }
                        throw d("Unterminated object");
                    }
                    n();
                }
            }
            int e3 = e(true);
            if (e3 == 34) {
                this.n.l();
                this.f13865o = 13;
                return 13;
            } else if (e3 == 39) {
                this.n.l();
                n();
                this.f13865o = 12;
                return 12;
            } else if (e3 != 125) {
                n();
                if (c((char) e3)) {
                    this.f13865o = 14;
                    return 14;
                }
                throw d("Expected name");
            } else if (i3 != 5) {
                this.n.l();
                this.f13865o = 2;
                return 2;
            } else {
                throw d("Expected name");
            }
        } else if (i3 == 4) {
            iArr[i2] = 5;
            int e4 = e(true);
            this.n.l();
            if (e4 != 58) {
                if (e4 == 61) {
                    n();
                    if (this.q.j(1L) && this.n.a(0L) == 62) {
                        this.n.l();
                    }
                } else {
                    throw d("Expected ':'");
                }
            }
        } else if (i3 == 6) {
            iArr[i2] = 7;
        } else if (i3 == 7) {
            if (e(false) == -1) {
                this.f13865o = 18;
                return 18;
            }
            n();
        } else if (i3 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int e5 = e(true);
        if (e5 == 34) {
            this.n.l();
            this.f13865o = 9;
            return 9;
        } else if (e5 == 39) {
            n();
            this.n.l();
            this.f13865o = 8;
            return 8;
        } else {
            if (e5 != 44 && e5 != 59) {
                if (e5 == 91) {
                    this.n.l();
                    this.f13865o = 3;
                    return 3;
                } else if (e5 != 93) {
                    if (e5 == 123) {
                        this.n.l();
                        this.f13865o = 1;
                        return 1;
                    }
                    int r = r();
                    if (r != 0) {
                        return r;
                    }
                    int t = t();
                    if (t != 0) {
                        return t;
                    }
                    if (!c(this.n.a(0L))) {
                        throw d("Expected value");
                    }
                    n();
                    this.f13865o = 10;
                    return 10;
                } else if (i3 == 1) {
                    this.n.l();
                    this.f13865o = 4;
                    return 4;
                }
            }
            if (i3 == 1 || i3 == 2) {
                n();
                this.f13865o = 7;
                return 7;
            }
            throw d("Unexpected value");
        }
    }

    private int r() {
        String str;
        String str2;
        int i2;
        byte a = this.n.a(0L);
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
            if (!this.q.j(i4)) {
                return 0;
            }
            byte a2 = this.n.a(i3);
            if (a2 != str.charAt(i3) && a2 != str2.charAt(i3)) {
                return 0;
            }
            i3 = i4;
        }
        if (this.q.j(length + 1) && c(this.n.a(length))) {
            return 0;
        }
        this.n.h(length);
        this.f13865o = i2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
        if (c(r11) != false) goto L71;
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
        r16.m = r9;
        r16.n.h(r5);
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
        r16.f13865o = r1;
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
        r16.k = r5;
        r1 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b5, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int t() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8848eU.t():int");
    }

    private boolean c(int i2) {
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
        n();
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String i() {
        String str;
        int i2 = this.f13865o;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 14) {
            str = q();
        } else if (i2 == 13) {
            str = c(h);
        } else if (i2 == 12) {
            str = c(i);
        } else if (i2 != 15) {
            throw new JsonDataException("Expected a name but was " + l() + " at path " + b());
        } else {
            str = this.t;
        }
        this.f13865o = 0;
        this.e[this.f - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int c(JsonReader.e eVar) {
        int i2 = this.f13865o;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 < 12 || i2 > 15) {
            return -1;
        }
        if (i2 == 15) {
            return b(this.t, eVar);
        }
        int b = this.q.b(eVar.e);
        if (b != -1) {
            this.f13865o = 0;
            this.e[this.f - 1] = eVar.b[b];
            return b;
        }
        String str = this.e[this.f - 1];
        String i3 = i();
        int b2 = b(i3, eVar);
        if (b2 == -1) {
            this.f13865o = 15;
            this.t = i3;
            this.e[this.f - 1] = str;
        }
        return b2;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void m() {
        if (this.a) {
            throw new JsonDataException("Cannot skip unexpected " + l() + " at " + b());
        }
        int i2 = this.f13865o;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 14) {
            u();
        } else if (i2 == 13) {
            a(h);
        } else if (i2 == 12) {
            a(i);
        } else if (i2 != 15) {
            throw new JsonDataException("Expected a name but was " + l() + " at path " + b());
        }
        this.f13865o = 0;
        this.e[this.f - 1] = "null";
    }

    private int b(String str, JsonReader.e eVar) {
        int length = eVar.b.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(eVar.b[i2])) {
                this.f13865o = 0;
                this.e[this.f - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String o() {
        String b;
        int i2 = this.f13865o;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 10) {
            b = q();
        } else if (i2 == 9) {
            b = c(h);
        } else if (i2 == 8) {
            b = c(i);
        } else if (i2 == 11) {
            b = this.t;
            this.t = null;
        } else if (i2 == 16) {
            b = Long.toString(this.m);
        } else if (i2 == 17) {
            b = this.n.b(this.k);
        } else {
            throw new JsonDataException("Expected a string but was " + l() + " at path " + b());
        }
        this.f13865o = 0;
        int[] iArr = this.b;
        int i3 = this.f - 1;
        iArr[i3] = iArr[i3] + 1;
        return b;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean h() {
        int i2 = this.f13865o;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 5) {
            this.f13865o = 0;
            int[] iArr = this.b;
            int i3 = this.f - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.f13865o = 0;
            int[] iArr2 = this.b;
            int i4 = this.f - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + l() + " at path " + b());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double g() {
        int i2 = this.f13865o;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 16) {
            this.f13865o = 0;
            int[] iArr = this.b;
            int i3 = this.f - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.m;
        }
        if (i2 == 17) {
            this.t = this.n.b(this.k);
        } else if (i2 == 9) {
            this.t = c(h);
        } else if (i2 == 8) {
            this.t = c(i);
        } else if (i2 == 10) {
            this.t = q();
        } else if (i2 != 11) {
            throw new JsonDataException("Expected a double but was " + l() + " at path " + b());
        }
        this.f13865o = 11;
        try {
            double parseDouble = Double.parseDouble(this.t);
            if (!this.d && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + b());
            }
            this.t = null;
            this.f13865o = 0;
            int[] iArr2 = this.b;
            int i4 = this.f - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.t + " at path " + b());
        }
    }

    private String c(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long d = this.q.d(byteString);
            if (d == -1) {
                throw d("Unterminated string");
            }
            if (this.n.a(d) != 92) {
                if (sb == null) {
                    String b = this.n.b(d);
                    this.n.l();
                    return b;
                }
                sb.append(this.n.b(d));
                this.n.l();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.n.b(d));
            this.n.l();
            sb.append(p());
        }
    }

    private String q() {
        long d = this.q.d(l);
        return d != -1 ? this.n.b(d) : this.n.v();
    }

    private void a(ByteString byteString) {
        while (true) {
            long d = this.q.d(byteString);
            if (d == -1) {
                throw d("Unterminated string");
            }
            if (this.n.a(d) == 92) {
                this.n.h(d + 1);
                p();
            } else {
                this.n.h(d + 1);
                return;
            }
        }
    }

    private void u() {
        long d = this.q.d(l);
        C7872dIo c7872dIo = this.n;
        if (d == -1) {
            d = c7872dIo.D();
        }
        c7872dIo.h(d);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int j() {
        String c;
        int i2 = this.f13865o;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 16) {
            long j2 = this.m;
            int i3 = (int) j2;
            if (j2 != i3) {
                throw new JsonDataException("Expected an int but was " + this.m + " at path " + b());
            }
            this.f13865o = 0;
            int[] iArr = this.b;
            int i4 = this.f - 1;
            iArr[i4] = iArr[i4] + 1;
            return i3;
        }
        if (i2 == 17) {
            this.t = this.n.b(this.k);
        } else if (i2 == 9 || i2 == 8) {
            if (i2 == 9) {
                c = c(h);
            } else {
                c = c(i);
            }
            this.t = c;
            try {
                int parseInt = Integer.parseInt(c);
                this.f13865o = 0;
                int[] iArr2 = this.b;
                int i5 = this.f - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i2 != 11) {
            throw new JsonDataException("Expected an int but was " + l() + " at path " + b());
        }
        this.f13865o = 11;
        try {
            double parseDouble = Double.parseDouble(this.t);
            int i6 = (int) parseDouble;
            if (i6 != parseDouble) {
                throw new JsonDataException("Expected an int but was " + this.t + " at path " + b());
            }
            this.t = null;
            this.f13865o = 0;
            int[] iArr3 = this.b;
            int i7 = this.f - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.t + " at path " + b());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f13865o = 0;
        this.c[0] = 8;
        this.f = 1;
        this.n.d();
        this.q.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void k() {
        if (this.a) {
            throw new JsonDataException("Cannot skip unexpected " + l() + " at " + b());
        }
        int i2 = 0;
        do {
            int i3 = this.f13865o;
            if (i3 == 0) {
                i3 = s();
            }
            if (i3 == 3) {
                a(1);
            } else if (i3 == 1) {
                a(3);
            } else {
                if (i3 == 4) {
                    i2--;
                    if (i2 < 0) {
                        throw new JsonDataException("Expected a value but was " + l() + " at path " + b());
                    }
                    this.f--;
                } else if (i3 == 2) {
                    i2--;
                    if (i2 < 0) {
                        throw new JsonDataException("Expected a value but was " + l() + " at path " + b());
                    }
                    this.f--;
                } else if (i3 == 14 || i3 == 10) {
                    u();
                } else if (i3 == 9 || i3 == 13) {
                    a(h);
                } else if (i3 == 8 || i3 == 12) {
                    a(i);
                } else if (i3 == 17) {
                    this.n.h(this.k);
                } else if (i3 == 18) {
                    throw new JsonDataException("Expected a value but was " + l() + " at path " + b());
                }
                this.f13865o = 0;
            }
            i2++;
            this.f13865o = 0;
        } while (i2 != 0);
        int[] iArr = this.b;
        int i4 = this.f - 1;
        iArr[i4] = iArr[i4] + 1;
        this.e[i4] = "null";
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        r5.n.h(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0 != 47) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r5.q.j(2) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        n();
        r2 = r5.n.a(1L);
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
        r5.n.l();
        r5.n.l();
        w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        r5.n.l();
        r5.n.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
        if (y() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
        throw d("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r0 != 35) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        n();
        w();
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
            o.dIn r1 = r5.q
            int r2 = r0 + 1
            long r3 = (long) r2
            boolean r1 = r1.j(r3)
            if (r1 == 0) goto L7e
            o.dIo r1 = r5.n
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
            o.dIo r1 = r5.n
            r1.h(r3)
            r1 = 47
            if (r0 != r1) goto L70
            o.dIn r2 = r5.q
            r3 = 2
            boolean r2 = r2.j(r3)
            if (r2 != 0) goto L38
            return r0
        L38:
            r5.n()
            o.dIo r2 = r5.n
            r3 = 1
            byte r2 = r2.a(r3)
            r3 = 42
            if (r2 == r3) goto L58
            if (r2 == r1) goto L4a
            return r0
        L4a:
            o.dIo r0 = r5.n
            r0.l()
            o.dIo r0 = r5.n
            r0.l()
            r5.w()
            goto L0
        L58:
            o.dIo r0 = r5.n
            r0.l()
            o.dIo r0 = r5.n
            r0.l()
            boolean r0 = r5.y()
            if (r0 == 0) goto L69
            goto L0
        L69:
            java.lang.String r6 = "Unterminated comment"
            com.airbnb.lottie.parser.moshi.JsonEncodingException r6 = r5.d(r6)
            throw r6
        L70:
            r1 = 35
            if (r0 != r1) goto L7b
            r5.n()
            r5.w()
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
        throw new UnsupportedOperationException("Method not decompiled: o.C8848eU.e(boolean):int");
    }

    private void n() {
        if (!this.d) {
            throw d("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void w() {
        long d = this.q.d(g);
        C7872dIo c7872dIo = this.n;
        c7872dIo.h(d != -1 ? d + 1 : c7872dIo.D());
    }

    private boolean y() {
        InterfaceC7871dIn interfaceC7871dIn = this.q;
        ByteString byteString = j;
        long e = interfaceC7871dIn.e(byteString);
        boolean z = e != -1;
        C7872dIo c7872dIo = this.n;
        c7872dIo.h(z ? e + byteString.k() : c7872dIo.D());
        return z;
    }

    public String toString() {
        return "JsonReader(" + this.q + ")";
    }

    private char p() {
        int i2;
        if (!this.q.j(1L)) {
            throw d("Unterminated escape sequence");
        }
        byte l2 = this.n.l();
        if (l2 == 10 || l2 == 34 || l2 == 39 || l2 == 47 || l2 == 92) {
            return (char) l2;
        }
        if (l2 != 98) {
            if (l2 != 102) {
                if (l2 != 110) {
                    if (l2 != 114) {
                        if (l2 != 116) {
                            if (l2 != 117) {
                                if (this.d) {
                                    return (char) l2;
                                }
                                throw d("Invalid escape sequence: \\" + ((char) l2));
                            } else if (!this.q.j(4L)) {
                                throw new EOFException("Unterminated escape sequence at path " + b());
                            } else {
                                char c = 0;
                                for (int i3 = 0; i3 < 4; i3++) {
                                    byte a = this.n.a(i3);
                                    char c2 = (char) (c << 4);
                                    if (a >= 48 && a <= 57) {
                                        i2 = a - 48;
                                    } else if (a >= 97 && a <= 102) {
                                        i2 = a - 87;
                                    } else if (a < 65 || a > 70) {
                                        throw d("\\u" + this.n.b(4L));
                                    } else {
                                        i2 = a - 55;
                                    }
                                    c = (char) (c2 + i2);
                                }
                                this.n.h(4L);
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
}
