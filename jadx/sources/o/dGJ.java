package o;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.text.Regex;
import o.C8632dsu;
import o.dGB;
import o.dGJ;
import o.dpR;

/* loaded from: classes5.dex */
public final class dGJ implements Closeable, Flushable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int G = 0;
    private static int H = 1;
    public static final d a;
    private static int a$s17$3437 = 0;
    public static final String b;
    private static boolean b$s19$3437 = false;
    public static final String c;
    public static final long d;
    private static char[] d$s16$3437 = null;
    public static final String e;
    private static boolean e$s20$3437 = false;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final Regex j;
    public static final String n;

    /* renamed from: o */
    public static final String f13798o;
    private final LinkedHashMap<String, e> A;
    private long B;
    private boolean C;
    private boolean D;
    private final int E;
    private long F;
    private int I;
    private boolean k;
    private final int l;
    private final dGK m;
    private final File p;
    private boolean q;
    private final InterfaceC7855dHw r;
    private boolean s;
    private final c t;
    private final File u;
    private dIq v;
    private final File w;
    private final File x;
    private boolean y;
    private long z;

    static void i() {
        e$s20$3437 = true;
        d$s16$3437 = new char[]{10417};
        a$s17$3437 = -286512960;
        b$s19$3437 = true;
    }

    public final int b() {
        int i2 = 2 % 2;
        int i3 = H + 27;
        int i4 = i3 % 128;
        G = i4;
        int i5 = i3 % 2;
        int i6 = this.E;
        int i7 = i4 + 13;
        H = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final boolean c() {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = i3 + 67;
        H = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.s;
        int i6 = i3 + 35;
        H = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public final File d() {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = i3 + 43;
        H = i4 % 128;
        int i5 = i4 % 2;
        File file = this.p;
        int i6 = i3 + 107;
        H = i6 % 128;
        int i7 = i6 % 2;
        return file;
    }

    public final InterfaceC7855dHw e() {
        InterfaceC7855dHw interfaceC7855dHw;
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = i3 + 49;
        G = i4 % 128;
        if (i4 % 2 != 0) {
            interfaceC7855dHw = this.r;
            int i5 = 30 / 0;
        } else {
            interfaceC7855dHw = this.r;
        }
        int i6 = i3 + 53;
        G = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 57 / 0;
        }
        return interfaceC7855dHw;
    }

    public static final /* synthetic */ void a(dGJ dgj, boolean z) {
        int i2 = 2 % 2;
        int i3 = G + 23;
        int i4 = i3 % 128;
        H = i4;
        int i5 = i3 % 2;
        dgj.C = z;
        int i6 = i4 + 35;
        G = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void b(dGJ dgj, boolean z) {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = i3 + 97;
        H = i4 % 128;
        int i5 = i4 % 2;
        dgj.q = z;
        int i6 = i3 + 19;
        H = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean b(dGJ dgj) {
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = i3 + 117;
        G = i4 % 128;
        int i5 = i4 % 2;
        boolean z = dgj.y;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 59;
        G = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public static final /* synthetic */ void d(dGJ dgj, int i2) {
        int i3 = 2 % 2;
        int i4 = H;
        int i5 = i4 + 125;
        G = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        dgj.I = i2;
        if (i6 != 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = i4 + 27;
        G = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void d(dGJ dgj, dIq diq) {
        int i2 = 2 % 2;
        int i3 = H + 51;
        G = i3 % 128;
        if (i3 % 2 == 0) {
            dgj.v = diq;
        } else {
            dgj.v = diq;
            throw null;
        }
    }

    public static final /* synthetic */ void d(dGJ dgj, boolean z) {
        int i2 = 2 % 2;
        int i3 = G + 23;
        int i4 = i3 % 128;
        H = i4;
        int i5 = i3 % 2;
        dgj.D = z;
        int i6 = i4 + 85;
        G = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean d(dGJ dgj) {
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = i3 + 65;
        G = i4 % 128;
        int i5 = i4 % 2;
        boolean z = dgj.k;
        int i6 = i3 + 51;
        G = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean e(dGJ dgj) {
        int i2 = 2 % 2;
        int i3 = H + 63;
        G = i3 % 128;
        if (i3 % 2 == 0) {
            return dgj.k();
        }
        dgj.k();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* loaded from: classes5.dex */
    public static final class c extends dGH {
        final /* synthetic */ dGJ b;

        @Override // o.dGH
        public long d() {
            synchronized (this.b) {
                if (!dGJ.b(this.b) || this.b.c()) {
                    return -1L;
                }
                try {
                    this.b.f();
                } catch (IOException unused) {
                    dGJ.a(this.b, true);
                }
                try {
                    if (dGJ.e(this.b)) {
                        this.b.h();
                        dGJ.d(this.b, 0);
                    }
                } catch (IOException unused2) {
                    dGJ.d(this.b, true);
                    dGJ.d(this.b, dIw.b(dIw.a()));
                }
                return -1L;
            }
        }
    }

    private final void m() {
        int i2 = 2 % 2;
        InterfaceC7871dIn e2 = dIw.e(this.r.i(this.x));
        try {
            String z = e2.z();
            String z2 = e2.z();
            String z3 = e2.z();
            String z4 = e2.z();
            String z5 = e2.z();
            if (!(!C8632dsu.c((Object) g, (Object) z))) {
                int i3 = G + 23;
                H = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                J(null, 127, new byte[]{-127}, null, objArr);
                if (!(!C8632dsu.c((Object) ((String) objArr[0]).intern(), (Object) z2)) && !(!C8632dsu.c((Object) String.valueOf(this.l), (Object) z3)) && !(!C8632dsu.c((Object) String.valueOf(this.E), (Object) z4)) && z5.length() <= 0) {
                    int i5 = G + 35;
                    H = i5 % 128;
                    int i6 = i5 % 2 != 0 ? 0 : 1;
                    while (true) {
                        try {
                            e(e2.z());
                            i6++;
                        } catch (EOFException unused) {
                            this.I = i6 - this.A.size();
                            if (e2.m()) {
                                this.v = o();
                            } else {
                                h();
                            }
                            dpR dpr = dpR.c;
                            C8608drx.a(e2, null);
                            int i7 = H + 93;
                            G = i7 % 128;
                            if (i7 % 2 != 0) {
                                throw null;
                            }
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + z + ", " + z2 + ", " + z4 + ", " + z5 + ']');
        } finally {
        }
    }

    private final dIq o() {
        int i2 = 2 % 2;
        dIq b2 = dIw.b(new dGI(this.r.a(this.x), new drM<IOException, dpR>() { // from class: okhttp3.internal.cache.DiskLruCache$newJournalWriter$faultHidingSink$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(IOException iOException) {
                a(iOException);
                return dpR.c;
            }

            public final void a(IOException iOException) {
                C8632dsu.d(iOException, "");
                dGJ dgj = dGJ.this;
                if (!dGB.h || Thread.holdsLock(dgj)) {
                    dGJ.b(dGJ.this, true);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C8632dsu.b(currentThread, "");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(dgj);
                throw new AssertionError(sb.toString());
            }
        }));
        int i3 = H + 49;
        G = i3 % 128;
        int i4 = i3 % 2;
        return b2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x003c, code lost:
        if (r17 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x003f, code lost:
        if (r17 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0041, code lost:
        r12 = r17.substring(r12);
        o.C8632dsu.b(r12, "");
        r13 = o.dGJ.f13798o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x004e, code lost:
        if (r9 != r13.length()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0050, code lost:
        r14 = o.dGJ.G + 83;
        o.dGJ.H = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0059, code lost:
        if ((r14 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x005b, code lost:
        r13 = o.C8691duz.i(r17, r13, true, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0060, code lost:
        if (r13 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0063, code lost:
        r13 = o.C8691duz.i(r17, r13, false, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0067, code lost:
        if (r13 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0069, code lost:
        r1 = o.dGJ.H + 49;
        o.dGJ.G = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0072, code lost:
        if ((r1 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0074, code lost:
        r16.A.remove(r12);
        r1 = 21 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x007c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x007d, code lost:
        r16.A.remove(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0082, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0088, code lost:
        throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dGJ.e(java.lang.String):void");
    }

    private final void n() {
        Iterator<e> it;
        int i2 = 2 % 2;
        int i3 = G + 77;
        H = i3 % 128;
        if (i3 % 2 == 0) {
            this.r.b(this.u);
            it = this.A.values().iterator();
            int i4 = 28 / 0;
        } else {
            this.r.b(this.u);
            it = this.A.values().iterator();
        }
        while (it.hasNext()) {
            e next = it.next();
            C8632dsu.b(next, "");
            e eVar = next;
            if (eVar.e() == null) {
                int i5 = H + 93;
                G = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                int i6 = this.E;
                for (int i7 = 0; i7 < i6; i7++) {
                    this.F += eVar.d()[i7];
                }
            } else {
                eVar.c((a) null);
                int i8 = this.E;
                for (int i9 = 0; i9 < i8; i9++) {
                    int i10 = G + 69;
                    H = i10 % 128;
                    int i11 = i10 % 2;
                    this.r.b(eVar.b().get(i9));
                    this.r.b(eVar.a().get(i9));
                }
                it.remove();
            }
        }
    }

    public final void h() {
        synchronized (this) {
            dIq diq = this.v;
            if (diq != null) {
                diq.close();
            }
            dIq b2 = dIw.b(this.r.d(this.u));
            b2.b(g).c(10);
            Object[] objArr = new Object[1];
            J(null, 127, new byte[]{-127}, null, objArr);
            b2.b(((String) objArr[0]).intern()).c(10);
            b2.k(this.l).c(10);
            b2.k(this.E).c(10);
            b2.c(10);
            for (e eVar : this.A.values()) {
                if (eVar.e() != null) {
                    b2.b(e).c(32);
                    b2.b(eVar.c());
                    b2.c(10);
                } else {
                    b2.b(b).c(32);
                    b2.b(eVar.c());
                    eVar.d(b2);
                    b2.c(10);
                }
            }
            dpR dpr = dpR.c;
            C8608drx.a(b2, null);
            if (this.r.c(this.x)) {
                this.r.a(this.x, this.w);
            }
            this.r.a(this.u, this.x);
            this.r.b(this.w);
            this.v = o();
            this.q = false;
            this.D = false;
        }
    }

    public final b a(String str) {
        synchronized (this) {
            C8632dsu.d((Object) str, "");
            g();
            j();
            c(str);
            e eVar = this.A.get(str);
            if (eVar != null) {
                C8632dsu.b(eVar, "");
                b j2 = eVar.j();
                if (j2 != null) {
                    this.I++;
                    dIq diq = this.v;
                    if (diq == null) {
                        C8632dsu.e();
                    }
                    diq.b(i).c(32).b(str).c(10);
                    if (k()) {
                        dGK.b(this.m, this.t, 0L, 2, null);
                    }
                    return j2;
                }
                return null;
            }
            return null;
        }
    }

    public static /* synthetic */ a e(dGJ dgj, String str, long j2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = G + 83;
        int i5 = i4 % 128;
        H = i5;
        int i6 = i4 % 2;
        if ((i2 & 2) != 0) {
            int i7 = i5 + 55;
            G = i7 % 128;
            int i8 = i7 % 2;
            j2 = d;
        }
        a c2 = dgj.c(str, j2);
        int i9 = H + 107;
        G = i9 % 128;
        int i10 = i9 % 2;
        return c2;
    }

    public final a c(String str, long j2) {
        synchronized (this) {
            C8632dsu.d((Object) str, "");
            g();
            j();
            c(str);
            e eVar = this.A.get(str);
            if (j2 == d || (eVar != null && eVar.f() == j2)) {
                if ((eVar != null ? eVar.e() : null) != null) {
                    return null;
                }
                if (eVar == null || eVar.h() == 0) {
                    if (!this.C && !this.D) {
                        dIq diq = this.v;
                        if (diq == null) {
                            C8632dsu.e();
                        }
                        diq.b(e).c(32).b(str).c(10);
                        diq.flush();
                        if (this.q) {
                            return null;
                        }
                        if (eVar == null) {
                            eVar = new e(this, str);
                            this.A.put(str, eVar);
                        }
                        a aVar = new a(this, eVar);
                        eVar.c(aVar);
                        return aVar;
                    }
                    dGK.b(this.m, this.t, 0L, 2, null);
                    return null;
                }
                return null;
            }
            return null;
        }
    }

    public final void d(a aVar, boolean z) {
        synchronized (this) {
            C8632dsu.d(aVar, "");
            e e2 = aVar.e();
            if (!C8632dsu.c(e2.e(), aVar)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (z && !e2.g()) {
                int i2 = this.E;
                for (int i3 = 0; i3 < i2; i3++) {
                    boolean[] c2 = aVar.c();
                    if (c2 == null) {
                        C8632dsu.e();
                    }
                    if (!c2[i3]) {
                        aVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i3);
                    } else if (!this.r.c(e2.a().get(i3))) {
                        aVar.a();
                        return;
                    }
                }
            }
            int i4 = this.E;
            for (int i5 = 0; i5 < i4; i5++) {
                File file = e2.a().get(i5);
                if (z && !e2.i()) {
                    if (this.r.c(file)) {
                        File file2 = e2.b().get(i5);
                        this.r.a(file, file2);
                        long j2 = e2.d()[i5];
                        long h2 = this.r.h(file2);
                        e2.d()[i5] = h2;
                        this.F = (this.F - j2) + h2;
                    }
                } else {
                    this.r.b(file);
                }
            }
            e2.c((a) null);
            if (e2.i()) {
                b(e2);
                return;
            }
            this.I++;
            dIq diq = this.v;
            if (diq == null) {
                C8632dsu.e();
            }
            if (!e2.g() && !z) {
                this.A.remove(e2.c());
                diq.b(f13798o).c(32);
                diq.b(e2.c());
                diq.c(10);
                diq.flush();
                if (this.F <= this.B || k()) {
                    dGK.b(this.m, this.t, 0L, 2, null);
                }
            }
            e2.b(true);
            diq.b(b).c(32);
            diq.b(e2.c());
            e2.d(diq);
            diq.c(10);
            if (z) {
                long j3 = this.z;
                this.z = 1 + j3;
                e2.c(j3);
            }
            diq.flush();
            if (this.F <= this.B) {
            }
            dGK.b(this.m, this.t, 0L, 2, null);
        }
    }

    private final boolean k() {
        int i2 = 2 % 2;
        int i3 = H + 31;
        int i4 = i3 % 128;
        G = i4;
        int i5 = i3 % 2;
        int i6 = this.I;
        if (i6 >= 2000) {
            int i7 = i4 + 101;
            H = i7 % 128;
            if (i7 % 2 == 0) {
                this.A.size();
                throw null;
            } else if (i6 >= this.A.size()) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(String str) {
        synchronized (this) {
            C8632dsu.d((Object) str, "");
            g();
            j();
            c(str);
            e eVar = this.A.get(str);
            if (eVar != null) {
                C8632dsu.b(eVar, "");
                boolean b2 = b(eVar);
                if (b2 && this.F <= this.B) {
                    this.C = false;
                }
                return b2;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0057, code lost:
        if (r12.e() != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(o.dGJ.e r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            o.C8632dsu.d(r12, r1)
            boolean r1 = r11.k
            r2 = 10
            r3 = 32
            r4 = 1
            if (r1 != 0) goto L62
            int r1 = o.dGJ.G
            int r1 = r1 + 99
            int r5 = r1 % 128
            o.dGJ.H = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L5d
            int r1 = r12.h()
            if (r1 <= 0) goto L44
            int r1 = o.dGJ.H
            int r1 = r1 + 85
            int r5 = r1 % 128
            o.dGJ.G = r5
            int r1 = r1 % r0
            o.dIq r1 = r11.v
            if (r1 == 0) goto L44
            java.lang.String r5 = o.dGJ.e
            r1.b(r5)
            r1.c(r3)
            java.lang.String r5 = r12.c()
            r1.b(r5)
            r1.c(r2)
            r1.flush()
        L44:
            int r1 = r12.h()
            if (r1 > 0) goto L59
            int r1 = o.dGJ.H
            int r1 = r1 + 29
            int r5 = r1 % 128
            o.dGJ.G = r5
            int r1 = r1 % r0
            o.dGJ$a r1 = r12.e()
            if (r1 == 0) goto L62
        L59:
            r12.c(r4)
            return r4
        L5d:
            r12.h()
            r12 = 0
            throw r12
        L62:
            o.dGJ$a r1 = r12.e()
            if (r1 == 0) goto L6b
            r1.d()
        L6b:
            int r1 = r11.E
            r5 = 0
        L6e:
            if (r5 >= r1) goto L95
            o.dHw r6 = r11.r
            java.util.List r7 = r12.b()
            java.lang.Object r7 = r7.get(r5)
            java.io.File r7 = (java.io.File) r7
            r6.b(r7)
            long r6 = r11.F
            long[] r8 = r12.d()
            r9 = r8[r5]
            long r6 = r6 - r9
            r11.F = r6
            long[] r6 = r12.d()
            r7 = 0
            r6[r5] = r7
            int r5 = r5 + 1
            goto L6e
        L95:
            int r1 = r11.I
            int r1 = r1 + r4
            r11.I = r1
            o.dIq r1 = r11.v
            if (r1 == 0) goto Lb9
            int r5 = o.dGJ.G
            int r5 = r5 + 3
            int r6 = r5 % 128
            o.dGJ.H = r6
            int r5 = r5 % r0
            java.lang.String r5 = o.dGJ.f13798o
            r1.b(r5)
            r1.c(r3)
            java.lang.String r3 = r12.c()
            r1.b(r3)
            r1.c(r2)
        Lb9:
            java.util.LinkedHashMap<java.lang.String, o.dGJ$e> r1 = r11.A
            java.lang.String r12 = r12.c()
            r1.remove(r12)
            boolean r12 = r11.k()
            if (r12 == 0) goto Ldc
            int r12 = o.dGJ.H
            int r12 = r12 + 35
            int r1 = r12 % 128
            o.dGJ.G = r1
            int r12 = r12 % r0
            o.dGK r5 = r11.m
            o.dGJ$c r6 = r11.t
            r7 = 0
            r9 = 2
            r10 = 0
            o.dGK.b(r5, r6, r7, r9, r10)
        Ldc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dGJ.b(o.dGJ$e):boolean");
    }

    private final void j() {
        synchronized (this) {
            if (!(!this.s)) {
                throw new IllegalStateException("cache is closed".toString());
            }
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        synchronized (this) {
            if (this.y) {
                j();
                f();
                dIq diq = this.v;
                if (diq == null) {
                    C8632dsu.e();
                }
                diq.flush();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e[] eVarArr;
        a e2;
        synchronized (this) {
            if (this.y && !this.s) {
                Collection<e> values = this.A.values();
                C8632dsu.b(values, "");
                Object[] array = values.toArray(new e[0]);
                if (array != null) {
                    for (e eVar : (e[]) array) {
                        if (eVar.e() != null && (e2 = eVar.e()) != null) {
                            e2.d();
                        }
                    }
                    f();
                    dIq diq = this.v;
                    if (diq == null) {
                        C8632dsu.e();
                    }
                    diq.close();
                    this.v = null;
                    this.s = true;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            this.s = true;
        }
    }

    public final void f() {
        int i2 = 2 % 2;
        while (this.F > this.B) {
            int i3 = G + 27;
            H = i3 % 128;
            int i4 = i3 % 2;
            if (!l()) {
                int i5 = H + 83;
                G = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
        }
        this.C = false;
    }

    private final boolean l() {
        int i2 = 2 % 2;
        int i3 = H + 29;
        G = i3 % 128;
        int i4 = i3 % 2;
        for (e eVar : this.A.values()) {
            if (!eVar.i()) {
                int i5 = H + 43;
                G = i5 % 128;
                int i6 = i5 % 2;
                C8632dsu.b(eVar, "");
                b(eVar);
                return true;
            }
        }
        return false;
    }

    public final void a() {
        int i2 = 2 % 2;
        int i3 = H + 117;
        G = i3 % 128;
        if (i3 % 2 == 0) {
            close();
            this.r.e(this.p);
            int i4 = G + 63;
            H = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
                return;
            }
            return;
        }
        close();
        this.r.e(this.p);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
        if (o.dGJ.j.e(r4) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0021, code lost:
        if (o.dGJ.j.e(r4) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0023, code lost:
        r4 = o.dGJ.H + 13;
        o.dGJ.G = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
        throw new java.lang.IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + r4 + com.fasterxml.jackson.core.JsonFactory.DEFAULT_QUOTE_CHAR).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.dGJ.H
            int r1 = r1 + 89
            int r2 = r1 % 128
            o.dGJ.G = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1b
            kotlin.text.Regex r1 = o.dGJ.j
            boolean r1 = r1.e(r4)
            r2 = 21
            int r2 = r2 / 0
            if (r1 == 0) goto L2d
            goto L23
        L1b:
            kotlin.text.Regex r1 = o.dGJ.j
            boolean r1 = r1.e(r4)
            if (r1 == 0) goto L2d
        L23:
            int r4 = o.dGJ.H
            int r4 = r4 + 13
            int r1 = r4 % 128
            o.dGJ.G = r1
            int r4 = r4 % r0
            return
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "keys must match regex [a-z0-9_-]{1,120}: \""
            r0.append(r1)
            r0.append(r4)
            r4 = 34
            r0.append(r4)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dGJ.c(java.lang.String):void");
    }

    /* loaded from: classes5.dex */
    public final class b implements Closeable {
        private final String a;
        private final List<dIJ> b;
        private final long c;
        final /* synthetic */ dGJ d;
        private final long[] e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(dGJ dgj, String str, long j, List<? extends dIJ> list, long[] jArr) {
            C8632dsu.d((Object) str, "");
            C8632dsu.d(list, "");
            C8632dsu.d(jArr, "");
            this.d = dgj;
            this.a = str;
            this.c = j;
            this.b = list;
            this.e = jArr;
        }

        public final a b() {
            return this.d.c(this.a, this.c);
        }

        public final dIJ e(int i) {
            return this.b.get(i);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (dIJ dij : this.b) {
                dGB.e(dij);
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class a {
        private final e a;
        private boolean b;
        public final /* synthetic */ dGJ c;
        private final boolean[] e;

        public final boolean[] c() {
            return this.e;
        }

        public final e e() {
            return this.a;
        }

        public a(dGJ dgj, e eVar) {
            C8632dsu.d(eVar, "");
            this.c = dgj;
            this.a = eVar;
            this.e = eVar.g() ? null : new boolean[dgj.b()];
        }

        public final void d() {
            if (C8632dsu.c(this.a.e(), this)) {
                if (dGJ.d(this.c)) {
                    this.c.d(this, false);
                } else {
                    this.a.c(true);
                }
            }
        }

        public final dIH b(final int i) {
            synchronized (this.c) {
                if (!(!this.b)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!C8632dsu.c(this.a.e(), this)) {
                    return dIw.a();
                }
                if (!this.a.g()) {
                    boolean[] zArr = this.e;
                    if (zArr == null) {
                        C8632dsu.e();
                    }
                    zArr[i] = true;
                }
                try {
                    return new dGI(this.c.e().d(this.a.a().get(i)), new drM<IOException, dpR>() { // from class: okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(IOException iOException) {
                            d(iOException);
                            return dpR.c;
                        }

                        public final void d(IOException iOException) {
                            C8632dsu.d(iOException, "");
                            synchronized (dGJ.a.this.c) {
                                dGJ.a.this.d();
                                dpR dpr = dpR.c;
                            }
                        }
                    });
                } catch (FileNotFoundException unused) {
                    return dIw.a();
                }
            }
        }

        public final void b() {
            synchronized (this.c) {
                if (!(!this.b)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (C8632dsu.c(this.a.e(), this)) {
                    this.c.d(this, true);
                }
                this.b = true;
                dpR dpr = dpR.c;
            }
        }

        public final void a() {
            synchronized (this.c) {
                if (!(!this.b)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (C8632dsu.c(this.a.e(), this)) {
                    this.c.d(this, false);
                }
                this.b = true;
                dpR dpr = dpR.c;
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class e {
        private final List<File> a;
        final /* synthetic */ dGJ b;
        private final String c;
        private final List<File> d;
        private a e;
        private int f;
        private long g;
        private boolean h;
        private final long[] i;
        private boolean j;

        public final List<File> a() {
            return this.a;
        }

        public final void a(int i) {
            this.f = i;
        }

        public final List<File> b() {
            return this.d;
        }

        public final void b(boolean z) {
            this.h = z;
        }

        public final String c() {
            return this.c;
        }

        public final void c(long j) {
            this.g = j;
        }

        public final void c(a aVar) {
            this.e = aVar;
        }

        public final void c(boolean z) {
            this.j = z;
        }

        public final long[] d() {
            return this.i;
        }

        public final a e() {
            return this.e;
        }

        public final long f() {
            return this.g;
        }

        public final boolean g() {
            return this.h;
        }

        public final int h() {
            return this.f;
        }

        public final boolean i() {
            return this.j;
        }

        public e(dGJ dgj, String str) {
            C8632dsu.d((Object) str, "");
            this.b = dgj;
            this.c = str;
            this.i = new long[dgj.b()];
            this.d = new ArrayList();
            this.a = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int b = dgj.b();
            for (int i = 0; i < b; i++) {
                sb.append(i);
                this.d.add(new File(dgj.d(), sb.toString()));
                sb.append(".tmp");
                this.a.add(new File(dgj.d(), sb.toString()));
                sb.setLength(length);
            }
        }

        public final void d(List<String> list) {
            C8632dsu.d(list, "");
            if (list.size() != this.b.b()) {
                c(list);
                throw null;
            }
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    this.i[i] = Long.parseLong(list.get(i));
                }
            } catch (NumberFormatException unused) {
                c(list);
                throw null;
            }
        }

        public final void d(dIq diq) {
            C8632dsu.d(diq, "");
            for (long j : this.i) {
                diq.c(32).k(j);
            }
        }

        private final Void c(List<String> list) {
            throw new IOException("unexpected journal line: " + list);
        }

        private final dIJ d(int i) {
            dIJ i2 = this.b.e().i(this.d.get(i));
            if (dGJ.d(this.b)) {
                return i2;
            }
            this.f++;
            return new a(i2, i2);
        }

        /* loaded from: classes5.dex */
        public static final class a extends dIt {
            private boolean b;
            final /* synthetic */ dIJ e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(dIJ dij, dIJ dij2) {
                super(dij2);
                e.this = r1;
                this.e = dij;
            }

            @Override // o.dIt, o.dIJ, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.b) {
                    return;
                }
                this.b = true;
                synchronized (e.this.b) {
                    e eVar = e.this;
                    eVar.a(eVar.h() - 1);
                    if (e.this.h() == 0 && e.this.i()) {
                        e eVar2 = e.this;
                        eVar2.b.b(eVar2);
                    }
                    dpR dpr = dpR.c;
                }
            }
        }

        public final b j() {
            dGJ dgj = this.b;
            if (dGB.h && !Thread.holdsLock(dgj)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C8632dsu.b(currentThread, "");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(dgj);
                throw new AssertionError(sb.toString());
            } else if (this.h) {
                if (dGJ.d(this.b) || (this.e == null && !this.j)) {
                    ArrayList<dIJ> arrayList = new ArrayList();
                    long[] jArr = (long[]) this.i.clone();
                    try {
                        int b = this.b.b();
                        for (int i = 0; i < b; i++) {
                            arrayList.add(d(i));
                        }
                        return new b(this.b, this.c, this.g, arrayList, jArr);
                    } catch (FileNotFoundException unused) {
                        for (dIJ dij : arrayList) {
                            dGB.e(dij);
                        }
                        try {
                            this.b.b(this);
                        } catch (IOException unused2) {
                        }
                        return null;
                    }
                }
                return null;
            } else {
                return null;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }
    }

    static {
        i();
        a = new d(null);
        c = c;
        f = f;
        h = h;
        g = g;
        Object[] objArr = new Object[1];
        J(null, 127, new byte[]{-127}, null, objArr);
        n = ((String) objArr[0]).intern();
        d = -1L;
        j = new Regex("[a-z0-9_-]{1,120}");
        b = b;
        e = e;
        f13798o = f13798o;
        i = i;
        int i2 = G + 95;
        H = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void g() {
        synchronized (this) {
            if (dGB.h && !Thread.holdsLock(this)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C8632dsu.b(currentThread, "");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(this);
                throw new AssertionError(sb.toString());
            }
            if (this.y) {
                return;
            }
            if (this.r.c(this.w)) {
                if (this.r.c(this.x)) {
                    this.r.b(this.w);
                } else {
                    this.r.a(this.w, this.x);
                }
            }
            this.k = dGB.c(this.r, this.w);
            if (this.r.c(this.x)) {
                try {
                    m();
                    n();
                    this.y = true;
                    return;
                } catch (IOException e2) {
                    dHG b2 = dHG.i.b();
                    b2.d("DiskLruCache " + this.p + " is corrupt: " + e2.getMessage() + ", removing", 5, e2);
                    a();
                    this.s = false;
                }
            }
            h();
            this.y = true;
        }
    }

    private static void J(int[] iArr, int i2, byte[] bArr, char[] cArr, Object[] objArr) {
        char[] cArr2;
        char[] cArr3;
        int i3 = 2 % 2;
        C9572sD c9572sD = new C9572sD();
        char[] cArr4 = d$s16$3437;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i4 = $10 + 79;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 45;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr5[i6] = (char) (cArr4[i6] - 189645286263740190L);
                    i6--;
                } else {
                    cArr5[i6] = (char) (cArr4[i6] ^ (-189645286263740190L));
                    i6++;
                }
            }
            cArr4 = cArr5;
        }
        int i8 = (int) ((-189645286263740190L) ^ a$s17$3437);
        if (e$s20$3437) {
            int i9 = $11 + 91;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                c9572sD.a = bArr.length;
                cArr3 = new char[c9572sD.a];
                c9572sD.e = 1;
            } else {
                c9572sD.a = bArr.length;
                cArr3 = new char[c9572sD.a];
                c9572sD.e = 0;
            }
            while (c9572sD.e < c9572sD.a) {
                cArr3[c9572sD.e] = (char) (cArr4[bArr[(c9572sD.a - 1) - c9572sD.e] + i2] - i8);
                c9572sD.e++;
            }
            String str = new String(cArr3);
            int i10 = $11 + 123;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            objArr[0] = str;
        } else if (!b$s19$3437) {
            c9572sD.a = iArr.length;
            char[] cArr6 = new char[c9572sD.a];
            c9572sD.e = 0;
            int i12 = $11 + 57;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            while (c9572sD.e < c9572sD.a) {
                cArr6[c9572sD.e] = (char) (cArr4[iArr[(c9572sD.a - 1) - c9572sD.e] - i2] - i8);
                c9572sD.e++;
            }
            objArr[0] = new String(cArr6);
        } else {
            int i14 = $10 + 107;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                c9572sD.a = cArr.length;
                cArr2 = new char[c9572sD.a];
                c9572sD.e = 1;
            } else {
                c9572sD.a = cArr.length;
                cArr2 = new char[c9572sD.a];
                c9572sD.e = 0;
            }
            while (c9572sD.e < c9572sD.a) {
                cArr2[c9572sD.e] = (char) (cArr4[cArr[(c9572sD.a - 1) - c9572sD.e] - i2] - i8);
                c9572sD.e++;
            }
            objArr[0] = new String(cArr2);
        }
    }
}
