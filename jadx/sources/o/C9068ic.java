package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.apollographql.apollo3.exception.JsonDataException;
import com.apollographql.apollo3.exception.JsonEncodingException;
import java.io.EOFException;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNothingValueException;
import okio.ByteString;

/* renamed from: o.ic  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9068ic implements JsonReader {
    public static final d a = new d(null);
    private static final ByteString c;
    private static final ByteString d;
    private static final ByteString e;
    private final C7872dIo b;
    private int[] f;
    private int g;
    private String[] h;
    private int[] i;
    private int j;
    private String k;
    private long l;
    private int[] m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC7871dIn f13872o;
    private int t;

    public C9068ic(InterfaceC7871dIn interfaceC7871dIn) {
        C8632dsu.c((Object) interfaceC7871dIn, "");
        this.f13872o = interfaceC7871dIn;
        this.b = interfaceC7871dIn.o();
        int[] iArr = new int[64];
        iArr[0] = 6;
        this.m = iArr;
        this.t = 1;
        this.h = new String[64];
        this.f = new int[64];
        int[] iArr2 = new int[64];
        iArr2[0] = 0;
        this.i = iArr2;
        this.j = 1;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public JsonReader e() {
        Integer valueOf = Integer.valueOf(this.g);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : p()) == 3) {
            d(1);
            this.f[this.t - 1] = 0;
            this.g = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + l() + " at path " + r());
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public JsonReader a() {
        Integer valueOf = Integer.valueOf(this.g);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : p()) == 4) {
            int i = this.t;
            this.t = i - 1;
            int[] iArr = this.f;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.g = 0;
            return this;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + l() + " at path " + r());
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public JsonReader c() {
        Integer valueOf = Integer.valueOf(this.g);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : p()) == 1) {
            d(3);
            this.g = 0;
            int i = this.j;
            this.j = i + 1;
            this.i[i] = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + l() + " at path " + r());
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public JsonReader b() {
        Integer valueOf = Integer.valueOf(this.g);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : p()) == 2) {
            int i = this.t;
            int i2 = i - 1;
            this.t = i2;
            this.h[i2] = null;
            int[] iArr = this.f;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
            this.g = 0;
            this.j--;
            return this;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + l() + " at path " + r());
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public boolean g() {
        Integer valueOf = Integer.valueOf(this.g);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : p();
        return (intValue == 2 || intValue == 4) ? false : true;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public JsonReader.Token l() {
        Integer valueOf = Integer.valueOf(this.g);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : p()) {
            case 1:
                return JsonReader.Token.c;
            case 2:
                return JsonReader.Token.h;
            case 3:
                return JsonReader.Token.d;
            case 4:
                return JsonReader.Token.e;
            case 5:
            case 6:
                return JsonReader.Token.a;
            case 7:
                return JsonReader.Token.f;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.l;
            case 12:
            case 13:
            case 14:
                return JsonReader.Token.g;
            case 15:
                return JsonReader.Token.i;
            case 16:
                return JsonReader.Token.k;
            case 17:
                return JsonReader.Token.j;
            default:
                throw new AssertionError();
        }
    }

    private final int p() {
        int[] iArr = this.m;
        int i = this.t - 1;
        int i2 = iArr[i];
        switch (i2) {
            case 1:
                iArr[i] = 2;
                break;
            case 2:
                int e2 = e(true);
                this.b.l();
                char c2 = (char) e2;
                if (c2 == ']') {
                    this.g = 4;
                    return 4;
                } else if (c2 != ',') {
                    a("Unterminated array");
                    throw new KotlinNothingValueException();
                }
                break;
            case 3:
            case 5:
                iArr[i] = 4;
                if (i2 == 5) {
                    int e3 = e(true);
                    this.b.l();
                    char c3 = (char) e3;
                    if (c3 == '}') {
                        this.g = 2;
                        return 2;
                    } else if (c3 != ',') {
                        a("Unterminated object");
                        throw new KotlinNothingValueException();
                    }
                }
                char e4 = (char) e(true);
                if (e4 == '\"') {
                    this.b.l();
                    this.g = 13;
                    return 13;
                } else if (e4 != '}') {
                    a("Unexpected character: " + e4);
                    throw new KotlinNothingValueException();
                } else if (i2 != 5) {
                    this.b.l();
                    this.g = 2;
                    return 2;
                } else {
                    a("Expected name");
                    throw new KotlinNothingValueException();
                }
            case 4:
                iArr[i] = 5;
                int e5 = e(true);
                this.b.l();
                if (((char) e5) != ':') {
                    a("Expected ':'");
                    throw new KotlinNothingValueException();
                }
                break;
            case 6:
                iArr[i] = 7;
                break;
            case 7:
                if (e(false) == -1) {
                    this.g = 17;
                    return 17;
                }
                a("Malformed JSON");
                throw new KotlinNothingValueException();
            default:
                if (i2 == 8) {
                    throw new IllegalStateException("JsonReader is closed".toString());
                }
                break;
        }
        char e6 = (char) e(true);
        if (e6 == ']') {
            if (i2 == 1) {
                this.b.l();
                this.g = 4;
                return 4;
            }
            a("Unexpected value");
            throw new KotlinNothingValueException();
        } else if (e6 == ';' || e6 == ',' || e6 == '\'') {
            a("Unexpected value");
            throw new KotlinNothingValueException();
        } else if (e6 == '\"') {
            this.b.l();
            this.g = 9;
            return 9;
        } else if (e6 == '[') {
            this.b.l();
            this.g = 3;
            return 3;
        } else if (e6 == '{') {
            this.b.l();
            this.g = 1;
            return 1;
        } else {
            int w = w();
            if (w != 0) {
                return w;
            }
            int v = v();
            if (v != 0) {
                return v;
            }
            if (!e((char) this.b.a(0L))) {
                a("Expected value");
                throw new KotlinNothingValueException();
            }
            a("Malformed JSON");
            throw new KotlinNothingValueException();
        }
    }

    private final int w() {
        String str;
        String str2;
        int i;
        byte a2 = this.b.a(0L);
        if (a2 == 116 || a2 == 84) {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (a2 == 102 || a2 == 70) {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else if (a2 != 110 && a2 != 78) {
            return 0;
        } else {
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            long j = i2;
            if (!this.f13872o.j(1 + j)) {
                return 0;
            }
            byte a3 = this.b.a(j);
            if (a3 != ((byte) str.charAt(i2)) && a3 != ((byte) str2.charAt(i2))) {
                return 0;
            }
        }
        long j2 = length;
        if (this.f13872o.j(1 + j2) && e((char) this.b.a(j2))) {
            return 0;
        }
        this.b.h(j2);
        this.g = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a8, code lost:
        if (e(r2) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ab, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ac, code lost:
        if (r6 != 2) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ae, code lost:
        if (r8 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b4, code lost:
        if (r9 != Long.MIN_VALUE) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b6, code lost:
        if (r7 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00b8, code lost:
        if (r7 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00bb, code lost:
        r9 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00bc, code lost:
        r18.l = r9;
        r18.b.h(r12);
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00c6, code lost:
        if (r6 == 2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c9, code lost:
        if (r6 == 4) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00cc, code lost:
        if (r6 != 7) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ce, code lost:
        r18.n = r5;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00d2, code lost:
        r18.g = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d4, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int v() {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9068ic.v():int");
    }

    private final boolean e(char c2) {
        if (c2 != '/' && c2 != '\\' && c2 != ';' && c2 != '#' && c2 != '=') {
            return !(c2 == '{' || c2 == '}' || c2 == '[' || c2 == ']' || c2 == ':' || c2 == ',' || c2 == ' ' || c2 == '\t' || c2 == '\r' || c2 == '\n');
        }
        a("Unexpected character: " + c2);
        throw new KotlinNothingValueException();
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public String n() {
        String d2;
        Integer valueOf = Integer.valueOf(this.g);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : p()) {
            case 12:
                d2 = d(e);
                break;
            case 13:
                d2 = d(d);
                break;
            case 14:
                d2 = t();
                break;
            default:
                throw new JsonDataException("Expected a name but was " + l() + " at path " + r());
        }
        this.g = 0;
        this.h[this.t - 1] = d2;
        return d2;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public String k() {
        Integer valueOf = Integer.valueOf(this.g);
        String str = null;
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : p();
        if (intValue == 15) {
            str = String.valueOf(this.l);
        } else if (intValue != 16) {
            switch (intValue) {
                case 8:
                    str = d(e);
                    break;
                case 9:
                    str = d(d);
                    break;
                case 10:
                    str = t();
                    break;
                case 11:
                    String str2 = this.k;
                    if (str2 != null) {
                        this.k = null;
                        str = str2;
                        break;
                    }
                    break;
                default:
                    throw new JsonDataException("Expected a string but was " + l() + " at path " + r());
            }
        } else {
            str = this.b.b(this.n);
        }
        this.g = 0;
        int[] iArr = this.f;
        int i = this.t - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public boolean j() {
        Integer valueOf = Integer.valueOf(this.g);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : p();
        if (intValue == 5) {
            this.g = 0;
            int[] iArr = this.f;
            int i = this.t - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        } else if (intValue == 6) {
            this.g = 0;
            int[] iArr2 = this.f;
            int i2 = this.t - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + l() + " at path " + r());
        }
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public Void o() {
        Integer valueOf = Integer.valueOf(this.g);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : p()) == 7) {
            this.g = 0;
            int[] iArr = this.f;
            int i = this.t - 1;
            iArr[i] = iArr[i] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + l() + " at path " + r());
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public double i() {
        Integer valueOf = Integer.valueOf(this.g);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : p();
        if (intValue == 15) {
            this.g = 0;
            int[] iArr = this.f;
            int i = this.t - 1;
            iArr[i] = iArr[i] + 1;
            return this.l;
        }
        if (intValue == 16) {
            this.k = this.b.b(this.n);
        } else if (intValue == 9) {
            this.k = d(d);
        } else if (intValue == 8) {
            this.k = d(e);
        } else if (intValue == 10) {
            this.k = t();
        } else if (intValue != 11) {
            throw new JsonDataException("Expected a double but was " + l() + " at path " + r());
        }
        this.g = 11;
        try {
            String str = this.k;
            C8632dsu.d((Object) str);
            double parseDouble = Double.parseDouble(str);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + r());
            }
            this.k = null;
            this.g = 0;
            int[] iArr2 = this.f;
            int i2 = this.t - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.k + " at path " + r());
        }
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public long h() {
        Integer valueOf = Integer.valueOf(this.g);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : p();
        if (intValue == 15) {
            this.g = 0;
            int[] iArr = this.f;
            int i = this.t - 1;
            iArr[i] = iArr[i] + 1;
            return this.l;
        }
        if (intValue == 16) {
            this.k = this.b.b(this.n);
        } else if (intValue == 9 || intValue == 8) {
            String d2 = d(intValue == 9 ? d : e);
            this.k = d2;
            try {
                C8632dsu.d((Object) d2);
                long parseLong = Long.parseLong(d2);
                this.g = 0;
                int[] iArr2 = this.f;
                int i2 = this.t - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            throw new JsonDataException("Expected a long but was " + l() + " at path " + r());
        }
        this.g = 11;
        try {
            String str = this.k;
            C8632dsu.d((Object) str);
            double parseDouble = Double.parseDouble(str);
            long j = (long) parseDouble;
            if (j != parseDouble) {
                throw new JsonDataException("Expected a long but was " + this.k + " at path " + r());
            }
            this.k = null;
            this.g = 0;
            int[] iArr3 = this.f;
            int i3 = this.t - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return j;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.k + " at path " + r());
        }
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public C9071if m() {
        String k = k();
        C8632dsu.d((Object) k);
        return new C9071if(k);
    }

    private final String d(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long d2 = this.f13872o.d(byteString);
            if (d2 == -1) {
                a("Unterminated string");
                throw new KotlinNothingValueException();
            } else if (this.b.a(d2) != 92) {
                if (sb == null) {
                    String b = this.b.b(d2);
                    this.b.l();
                    return b;
                }
                sb.append(this.b.b(d2));
                this.b.l();
                String sb2 = sb.toString();
                C8632dsu.d((Object) sb2);
                return sb2;
            } else {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.b.b(d2));
                this.b.l();
                sb.append(u());
            }
        }
    }

    private final String t() {
        long d2 = this.f13872o.d(c);
        return d2 != -1 ? this.b.b(d2) : this.b.v();
    }

    private final void b(ByteString byteString) {
        while (true) {
            long d2 = this.f13872o.d(byteString);
            if (d2 == -1) {
                a("Unterminated string");
                throw new KotlinNothingValueException();
            } else if (this.b.a(d2) == 92) {
                this.b.h(d2 + 1);
                u();
            } else {
                this.b.h(d2 + 1);
                return;
            }
        }
    }

    private final void x() {
        long d2 = this.f13872o.d(c);
        C7872dIo c7872dIo = this.b;
        if (d2 == -1) {
            d2 = c7872dIo.D();
        }
        c7872dIo.h(d2);
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public int f() {
        Integer valueOf = Integer.valueOf(this.g);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : p();
        if (intValue == 15) {
            long j = this.l;
            int i = (int) j;
            if (j != i) {
                throw new JsonDataException("Expected an int but was " + this.l + " at path " + d());
            }
            this.g = 0;
            int[] iArr = this.f;
            int i2 = this.t - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (intValue == 16) {
            this.k = this.b.b(this.n);
        } else if (intValue == 9 || intValue == 8) {
            String d2 = d(intValue == 9 ? d : e);
            this.k = d2;
            try {
                C8632dsu.d((Object) d2);
                int parseInt = Integer.parseInt(d2);
                this.g = 0;
                int[] iArr2 = this.f;
                int i3 = this.t - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            throw new JsonDataException("Expected an int but was " + l() + " at path " + r());
        }
        this.g = 11;
        try {
            String str = this.k;
            C8632dsu.d((Object) str);
            double parseDouble = Double.parseDouble(str);
            int i4 = (int) parseDouble;
            if (i4 != parseDouble) {
                throw new JsonDataException("Expected an int but was " + this.k + " at path " + r());
            }
            this.k = null;
            this.g = 0;
            int[] iArr3 = this.f;
            int i5 = this.t - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return i4;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.k + " at path " + r());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.g = 0;
        this.m[0] = 8;
        this.t = 1;
        this.b.d();
        this.f13872o.close();
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public void s() {
        int i = 0;
        do {
            Integer valueOf = Integer.valueOf(this.g);
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            switch (valueOf != null ? valueOf.intValue() : p()) {
                case 1:
                    d(3);
                    i++;
                    break;
                case 2:
                    this.t--;
                    i--;
                    break;
                case 3:
                    d(1);
                    i++;
                    break;
                case 4:
                    this.t--;
                    i--;
                    break;
                case 8:
                case 12:
                    b(e);
                    break;
                case 9:
                case 13:
                    b(d);
                    break;
                case 10:
                case 14:
                    x();
                    break;
                case 16:
                    this.b.h(this.n);
                    break;
            }
            this.g = 0;
        } while (i != 0);
        int[] iArr = this.f;
        int i2 = this.t - 1;
        iArr[i2] = iArr[i2] + 1;
        this.h[i2] = "null";
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        s();
     */
    @Override // com.apollographql.apollo3.api.json.JsonReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(java.util.List<java.lang.String> r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r7, r0)
            boolean r0 = r7.isEmpty()
            r1 = -1
            if (r0 == 0) goto Ld
            return r1
        Ld:
            boolean r0 = r6.g()
            if (r0 == 0) goto L76
            java.lang.String r0 = r6.n()
            int[] r2 = r6.i
            int r3 = r6.j
            int r3 = r3 + (-1)
            r2 = r2[r3]
            java.lang.Object r3 = r7.get(r2)
            boolean r3 = o.C8632dsu.c(r3, r0)
            r4 = 0
            if (r3 == 0) goto L43
            int[] r0 = r6.i
            int r1 = r6.j
            int r1 = r1 + (-1)
            int r3 = r2 + 1
            r0[r1] = r3
            int r7 = r7.size()
            if (r3 != r7) goto L42
            int[] r7 = r6.i
            int r0 = r6.j
            int r0 = r0 + (-1)
            r7[r0] = r4
        L42:
            return r2
        L43:
            r3 = r2
        L44:
            int r3 = r3 + 1
            int r5 = r7.size()
            if (r3 != r5) goto L4d
            r3 = r4
        L4d:
            if (r3 != r2) goto L53
            r6.s()
            goto Ld
        L53:
            java.lang.Object r5 = r7.get(r3)
            boolean r5 = o.C8632dsu.c(r5, r0)
            if (r5 == 0) goto L44
            int[] r0 = r6.i
            int r1 = r6.j
            int r1 = r1 + (-1)
            int r2 = r3 + 1
            r0[r1] = r2
            int r7 = r7.size()
            if (r2 != r7) goto L75
            int[] r7 = r6.i
            int r0 = r6.j
            int r0 = r0 + (-1)
            r7[r0] = r4
        L75:
            return r3
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9068ic.a(java.util.List):int");
    }

    private final void d(int i) {
        int i2 = this.t;
        int[] iArr = this.m;
        if (i2 == iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C8632dsu.a(copyOf, "");
            this.m = copyOf;
            String[] strArr = this.h;
            Object[] copyOf2 = Arrays.copyOf(strArr, strArr.length * 2);
            C8632dsu.a(copyOf2, "");
            this.h = (String[]) copyOf2;
            int[] iArr2 = this.f;
            int[] copyOf3 = Arrays.copyOf(iArr2, iArr2.length * 2);
            C8632dsu.a(copyOf3, "");
            this.f = copyOf3;
            int[] iArr3 = this.i;
            int[] copyOf4 = Arrays.copyOf(iArr3, iArr3.length * 2);
            C8632dsu.a(copyOf4, "");
            this.i = copyOf4;
        }
        int[] iArr4 = this.m;
        int i3 = this.t;
        this.t = i3 + 1;
        iArr4[i3] = i;
    }

    private final int e(boolean z) {
        int i = 0;
        while (true) {
            long j = i;
            if (!this.f13872o.j(j + 1)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            i++;
            byte a2 = this.b.a(j);
            if (a2 != 9 && a2 != 10 && a2 != 13 && a2 != 32) {
                this.b.h(i - 1);
                if (a2 != 35) {
                    if (a2 == 47 && this.f13872o.j(2L)) {
                        a("Malformed JSON");
                        throw new KotlinNothingValueException();
                    }
                    return a2;
                }
                a("Malformed JSON");
                throw new KotlinNothingValueException();
            }
        }
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public List<Object> d() {
        return C9075ij.e.a(this.t, this.m, this.h, this.f);
    }

    private final String r() {
        String d2;
        d2 = C8576dqs.d(d(), ".", null, null, 0, null, null, 62, null);
        return d2;
    }

    private final char u() {
        int i;
        if (!this.f13872o.j(1L)) {
            a("Unterminated escape sequence");
            throw new KotlinNothingValueException();
        }
        char l = (char) this.b.l();
        if (l != 'u') {
            if (l == 't') {
                return '\t';
            }
            if (l == 'b') {
                return '\b';
            }
            if (l == 'n') {
                return '\n';
            }
            if (l == 'r') {
                return '\r';
            }
            if (l == 'f') {
                return '\f';
            }
            if (l == '\n' || l == '\'' || l == '\"' || l == '\\' || l == '/') {
                return l;
            }
            a("Invalid escape sequence: \\" + l);
            throw new KotlinNothingValueException();
        } else if (!this.f13872o.j(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + d());
        } else {
            char c2 = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                byte a2 = this.b.a(i2);
                char c3 = (char) (c2 << 4);
                if (a2 >= 48 && a2 <= 57) {
                    i = a2 - 48;
                } else if (a2 >= 97 && a2 <= 102) {
                    i = a2 - 87;
                } else if (a2 < 65 || a2 > 70) {
                    a("\\u" + this.b.b(4L));
                    throw new KotlinNothingValueException();
                } else {
                    i = a2 - 55;
                }
                c2 = (char) (c3 + i);
            }
            this.b.h(4L);
            return c2;
        }
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public void q() {
        throw new IllegalStateException("BufferedSourceJsonReader cannot rewind.".toString());
    }

    private final Void a(String str) {
        throw new JsonEncodingException(str + " at path " + d());
    }

    /* renamed from: o.ic$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    static {
        ByteString.b bVar = ByteString.c;
        e = bVar.e("'\\");
        d = bVar.e("\"\\");
        c = bVar.e("{}[]:, \n\t\r/\\;#=");
    }
}
