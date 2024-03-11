package o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.lx  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9248lx implements Closeable, Flushable {
    private static final String[] a;
    private static final String[] c = new String[128];
    private boolean b;
    private String d;
    private String e;
    private String f;
    private boolean h;
    private final Writer i;
    private boolean j;
    private int[] g = new int[32];
    private int m = 0;

    public final void e(boolean z) {
        this.h = z;
    }

    public final boolean f() {
        return this.h;
    }

    static {
        for (int i = 0; i <= 31; i++) {
            c[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = c;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        a = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C9248lx(Writer writer) {
        e(6);
        this.f = ":";
        this.h = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.i = writer;
    }

    public C9248lx c() {
        l();
        return e(1, "[");
    }

    public C9248lx b() {
        return e(1, 2, "]");
    }

    public C9248lx e() {
        l();
        return e(3, "{");
    }

    public C9248lx d() {
        return e(3, 5, "}");
    }

    private C9248lx e(int i, String str) {
        j();
        e(i);
        this.i.write(str);
        return this;
    }

    private C9248lx e(int i, int i2, String str) {
        int h = h();
        if (h == i2 || h == i) {
            if (this.e != null) {
                throw new IllegalStateException("Dangling name: " + this.e);
            }
            this.m--;
            if (h == i2) {
                g();
            }
            this.i.write(str);
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    private void e(int i) {
        int i2 = this.m;
        int[] iArr = this.g;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.g = iArr2;
        }
        int[] iArr3 = this.g;
        int i3 = this.m;
        this.m = i3 + 1;
        iArr3[i3] = i;
    }

    private int h() {
        int i = this.m;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.g[i - 1];
    }

    private void d(int i) {
        this.g[this.m - 1] = i;
    }

    public C9248lx c(String str) {
        if (str != null) {
            if (this.e == null) {
                if (this.m != 0) {
                    this.e = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    private void l() {
        if (this.e != null) {
            i();
            a(this.e);
            this.e = null;
        }
    }

    public C9248lx e(String str) {
        if (str == null) {
            return a();
        }
        l();
        j();
        a(str);
        return this;
    }

    public C9248lx a() {
        if (this.e != null) {
            if (!this.h) {
                this.e = null;
                return this;
            }
            l();
        }
        j();
        this.i.write("null");
        return this;
    }

    public C9248lx b(boolean z) {
        l();
        j();
        this.i.write(z ? "true" : "false");
        return this;
    }

    public C9248lx b(Boolean bool) {
        if (bool == null) {
            return a();
        }
        l();
        j();
        this.i.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public C9248lx a(long j) {
        l();
        j();
        this.i.write(Long.toString(j));
        return this;
    }

    public C9248lx a(Number number) {
        if (number == null) {
            return a();
        }
        l();
        String obj = number.toString();
        if (!this.j && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        j();
        this.i.append((CharSequence) obj);
        return this;
    }

    public void flush() {
        if (this.m == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.i.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.i.close();
        int i = this.m;
        if (i > 1 || (i == 1 && this.g[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.m = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.b
            if (r0 == 0) goto L7
            java.lang.String[] r0 = o.C9248lx.a
            goto L9
        L7:
            java.lang.String[] r0 = o.C9248lx.c
        L9:
            java.io.Writer r1 = r8.i
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.i
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.i
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.i
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.i
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9248lx.a(java.lang.String):void");
    }

    private void g() {
        if (this.d == null) {
            return;
        }
        this.i.write("\n");
        int i = this.m;
        for (int i2 = 1; i2 < i; i2++) {
            this.i.write(this.d);
        }
    }

    private void i() {
        int h = h();
        if (h == 5) {
            this.i.write(44);
        } else if (h != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        g();
        d(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        int h = h();
        if (h == 1) {
            d(2);
            g();
        } else if (h == 2) {
            this.i.append(',');
            g();
        } else if (h != 4) {
            if (h != 6) {
                if (h != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.j) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            d(7);
        } else {
            this.i.append((CharSequence) this.f);
            d(5);
        }
    }
}
