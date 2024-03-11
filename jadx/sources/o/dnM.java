package o;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class dnM extends dnK {
    private static final String[] b = new String[128];
    private String k;
    private String l = ":";
    private final dIq m;

    static {
        for (int i = 0; i <= 31; i++) {
            b[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = b;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dnM(dIq diq) {
        if (diq == null) {
            throw new NullPointerException("sink == null");
        }
        this.m = diq;
        d(6);
    }

    @Override // o.dnK
    public dnK d() {
        if (this.i) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + f());
        }
        n();
        return d(1, 2, '[');
    }

    @Override // o.dnK
    public dnK c() {
        return c(1, 2, ']');
    }

    @Override // o.dnK
    public dnK e() {
        if (this.i) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + f());
        }
        n();
        return d(3, 5, '{');
    }

    @Override // o.dnK
    public dnK a() {
        this.i = false;
        return c(3, 5, '}');
    }

    private dnK d(int i, int i2, char c) {
        int i3;
        int i4 = this.h;
        int i5 = this.a;
        if (i4 == i5 && ((i3 = this.f[i4 - 1]) == i || i3 == i2)) {
            this.a = ~i5;
            return this;
        }
        o();
        g();
        d(i);
        this.d[this.h - 1] = 0;
        this.m.c(c);
        return this;
    }

    private dnK c(int i, int i2, char c) {
        int i3 = i();
        if (i3 == i2 || i3 == i) {
            if (this.k != null) {
                throw new IllegalStateException("Dangling name: " + this.k);
            }
            int i4 = this.h;
            int i5 = ~this.a;
            if (i4 == i5) {
                this.a = i5;
                return this;
            }
            int i6 = i4 - 1;
            this.h = i6;
            this.j[i6] = null;
            int[] iArr = this.d;
            int i7 = i4 - 2;
            iArr[i7] = iArr[i7] + 1;
            if (i3 == i2) {
                l();
            }
            this.m.c(c);
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // o.dnK
    public dnK d(String str) {
        if (str != null) {
            if (this.h == 0) {
                throw new IllegalStateException("JsonWriter is closed.");
            }
            int i = i();
            if ((i != 3 && i != 5) || this.k != null || this.i) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.k = str;
            this.j[this.h - 1] = str;
            return this;
        }
        throw new NullPointerException("name == null");
    }

    private void n() {
        if (this.k != null) {
            h();
            a(this.m, this.k);
            this.k = null;
        }
    }

    @Override // o.dnK
    public dnK b(String str) {
        if (str == null) {
            return b();
        }
        if (this.i) {
            this.i = false;
            return d(str);
        }
        n();
        o();
        a(this.m, str);
        int[] iArr = this.d;
        int i = this.h - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // o.dnK
    public dnK b() {
        if (this.i) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + f());
        }
        if (this.k != null) {
            if (!this.g) {
                this.k = null;
                return this;
            }
            n();
        }
        o();
        this.m.b("null");
        int[] iArr = this.d;
        int i = this.h - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // o.dnK
    public dnK a(boolean z) {
        if (this.i) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + f());
        }
        n();
        o();
        this.m.b(z ? "true" : "false");
        int[] iArr = this.d;
        int i = this.h - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // o.dnK
    public dnK a(double d) {
        if (!this.c && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.i) {
            this.i = false;
            return d(Double.toString(d));
        } else {
            n();
            o();
            this.m.b(Double.toString(d));
            int[] iArr = this.d;
            int i = this.h - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    @Override // o.dnK
    public dnK e(long j) {
        if (this.i) {
            this.i = false;
            return d(Long.toString(j));
        }
        n();
        o();
        this.m.b(Long.toString(j));
        int[] iArr = this.d;
        int i = this.h - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // o.dnK
    public dnK e(Number number) {
        if (number == null) {
            return b();
        }
        String obj = number.toString();
        if (!this.c && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.i) {
            this.i = false;
            return d(obj);
        } else {
            n();
            o();
            this.m.b(obj);
            int[] iArr = this.d;
            int i = this.h - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.h == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.m.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.m.close();
        int i = this.h;
        if (i > 1 || (i == 1 && this.f[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.h = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(o.dIq r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = o.dnM.b
            r1 = 34
            r7.c(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.c(r8, r4, r3)
        L2e:
            r7.b(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.c(r8, r4, r2)
        L3b:
            r7.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dnM.a(o.dIq, java.lang.String):void");
    }

    private void l() {
        if (this.e == null) {
            return;
        }
        this.m.c(10);
        int i = this.h;
        for (int i2 = 1; i2 < i; i2++) {
            this.m.b(this.e);
        }
    }

    private void h() {
        int i = i();
        if (i == 5) {
            this.m.c(44);
        } else if (i != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        l();
        b(4);
    }

    private void o() {
        int i = i();
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                this.m.c(44);
            } else {
                if (i == 4) {
                    this.m.b(this.l);
                    i2 = 5;
                } else if (i == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                } else {
                    i2 = 7;
                    if (i != 6) {
                        if (i != 7) {
                            throw new IllegalStateException("Nesting problem.");
                        }
                        if (!this.c) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    }
                }
                b(i2);
            }
        }
        l();
        b(i2);
    }
}
