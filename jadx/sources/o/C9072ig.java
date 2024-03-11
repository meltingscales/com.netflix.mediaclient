package o;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: o.ig  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9072ig implements InterfaceC9069id {
    private static final String[] d;
    public static final a e = new a(null);
    private int[] a;
    private final String b;
    private String c;
    private String[] f;
    private final dIq h;
    private int[] i;
    private int j;

    public C9072ig(dIq diq, String str) {
        C8632dsu.c((Object) diq, "");
        this.h = diq;
        this.b = str;
        this.i = new int[64];
        this.f = new String[64];
        this.a = new int[64];
        b(6);
    }

    public /* synthetic */ C9072ig(dIq diq, String str, int i, C8627dsp c8627dsp) {
        this(diq, (i & 2) != 0 ? null : str);
    }

    private final String h() {
        String str = this.b;
        return (str == null || str.length() == 0) ? ":" : ": ";
    }

    @Override // o.InterfaceC9069id
    public String i() {
        String d2;
        d2 = C8576dqs.d(C9075ij.e.a(this.j, this.i, this.f, this.a), ".", null, null, 0, null, null, 62, null);
        return d2;
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id c() {
        o();
        return e(1, "[");
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id a() {
        return d(1, 2, "]");
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id e() {
        o();
        return e(3, "{");
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id d() {
        return d(3, 5, "}");
    }

    private final InterfaceC9069id e(int i, String str) {
        f();
        b(i);
        this.a[this.j - 1] = 0;
        this.h.b(str);
        return this;
    }

    private final InterfaceC9069id d(int i, int i2, String str) {
        int n = n();
        if (n == i2 || n == i) {
            if (this.c != null) {
                throw new IllegalStateException(("Dangling name: " + this.c).toString());
            }
            int i3 = this.j;
            int i4 = i3 - 1;
            this.j = i4;
            this.f[i4] = null;
            int[] iArr = this.a;
            int i5 = i3 - 2;
            iArr[i5] = iArr[i5] + 1;
            if (n == i2) {
                m();
            }
            this.h.b(str);
            return this;
        }
        throw new IllegalStateException("Nesting problem.".toString());
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id e(String str) {
        C8632dsu.c((Object) str, "");
        int i = this.j;
        if (i != 0) {
            if (this.c != null) {
                throw new IllegalStateException("Nesting problem.".toString());
            }
            this.c = str;
            this.f[i - 1] = str;
            return this;
        }
        throw new IllegalStateException("JsonWriter is closed.".toString());
    }

    private final void o() {
        if (this.c != null) {
            g();
            a aVar = e;
            dIq diq = this.h;
            String str = this.c;
            C8632dsu.d((Object) str);
            aVar.e(diq, str);
            this.c = null;
        }
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id d(String str) {
        C8632dsu.c((Object) str, "");
        o();
        f();
        e.e(this.h, str);
        int[] iArr = this.a;
        int i = this.j - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id j() {
        return c("null");
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id d(boolean z) {
        return c(z ? "true" : "false");
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(("Numeric values must be finite, but was " + d2).toString());
        }
        return c(String.valueOf(d2));
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id e(int i) {
        return c(String.valueOf(i));
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id d(long j) {
        return c(String.valueOf(j));
    }

    @Override // o.InterfaceC9069id
    public InterfaceC9069id a(C9071if c9071if) {
        C8632dsu.c((Object) c9071if, "");
        return c(c9071if.c());
    }

    @Override // o.InterfaceC9069id
    /* renamed from: d */
    public C9072ig b(InterfaceC9001hO interfaceC9001hO) {
        C8632dsu.c((Object) interfaceC9001hO, "");
        j();
        return this;
    }

    public final InterfaceC9069id c(String str) {
        C8632dsu.c((Object) str, "");
        o();
        f();
        this.h.b(str);
        int[] iArr = this.a;
        int i = this.j - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.h.close();
        int i = this.j;
        if (i > 1 || (i == 1 && this.i[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.j = 0;
    }

    private final void m() {
        if (this.b == null) {
            return;
        }
        this.h.c(10);
        int i = this.j;
        for (int i2 = 1; i2 < i; i2++) {
            this.h.b(this.b);
        }
    }

    private final void g() {
        int n = n();
        if (n == 5) {
            this.h.c(44);
        } else if (n != 3) {
            throw new IllegalStateException("Nesting problem.".toString());
        }
        m();
        c(4);
    }

    private final void f() {
        int n = n();
        if (n == 1) {
            c(2);
            m();
        } else if (n == 2) {
            this.h.c(44);
            m();
        } else if (n == 4) {
            this.h.b(h());
            c(5);
        } else if (n == 6) {
            c(7);
        } else if (n == 7) {
            throw new IllegalStateException("JSON must have only one top-level value.");
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }

    private final int n() {
        int i = this.j;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.".toString());
        }
        return this.i[i - 1];
    }

    private final void b(int i) {
        int i2 = this.j;
        int[] iArr = this.i;
        if (i2 == iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C8632dsu.a(copyOf, "");
            this.i = copyOf;
            String[] strArr = this.f;
            Object[] copyOf2 = Arrays.copyOf(strArr, strArr.length * 2);
            C8632dsu.a(copyOf2, "");
            this.f = (String[]) copyOf2;
            int[] iArr2 = this.a;
            int[] copyOf3 = Arrays.copyOf(iArr2, iArr2.length * 2);
            C8632dsu.a(copyOf3, "");
            this.a = copyOf3;
        }
        int[] iArr3 = this.i;
        int i3 = this.j;
        this.j = i3 + 1;
        iArr3[i3] = i;
    }

    private final void c(int i) {
        this.i[this.j - 1] = i;
    }

    /* renamed from: o.ig$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String e(byte b) {
            StringBuilder sb = new StringBuilder();
            sb.append("0123456789abcdef".charAt(b >>> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
            return sb.toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(o.dIq r8, java.lang.String r9) {
            /*
                r7 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r8, r0)
                o.C8632dsu.c(r9, r0)
                java.lang.String[] r0 = o.C9072ig.b()
                r1 = 34
                r8.c(r1)
                int r2 = r9.length()
                r3 = 0
                r4 = r3
            L17:
                if (r3 >= r2) goto L40
                char r5 = r9.charAt(r3)
                r6 = 128(0x80, float:1.794E-43)
                if (r5 >= r6) goto L26
                r5 = r0[r5]
                if (r5 != 0) goto L33
                goto L3d
            L26:
                r6 = 8232(0x2028, float:1.1535E-41)
                if (r5 != r6) goto L2d
                java.lang.String r5 = "\\u2028"
                goto L33
            L2d:
                r6 = 8233(0x2029, float:1.1537E-41)
                if (r5 != r6) goto L3d
                java.lang.String r5 = "\\u2029"
            L33:
                if (r4 >= r3) goto L38
                r8.c(r9, r4, r3)
            L38:
                r8.b(r5)
                int r4 = r3 + 1
            L3d:
                int r3 = r3 + 1
                goto L17
            L40:
                if (r4 >= r2) goto L45
                r8.c(r9, r4, r2)
            L45:
                r8.c(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C9072ig.a.e(o.dIq, java.lang.String):void");
        }
    }

    static {
        String[] strArr = new String[128];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u00" + e.e((byte) i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        d = strArr;
    }
}
