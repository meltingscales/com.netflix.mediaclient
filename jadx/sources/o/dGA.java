package o;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import o.C7819dGn;
import o.C7824dGs;
import o.InterfaceC7817dGl;
import o.dGF;
import okhttp3.Protocol;

/* loaded from: classes5.dex */
public final class dGA implements InterfaceC7817dGl {
    public static final c d = new c(null);
    private final dFW e;

    public dGA(dFW dfw) {
        this.e = dfw;
    }

    @Override // o.InterfaceC7817dGl
    public C7824dGs a(InterfaceC7817dGl.e eVar) {
        AbstractC7820dGo abstractC7820dGo;
        AbstractC7829dGx e;
        AbstractC7829dGx e2;
        C8632dsu.d(eVar, "");
        dFY c2 = eVar.c();
        dFW dfw = this.e;
        C7824dGs c3 = dfw != null ? dfw.c(eVar.e()) : null;
        dGF b2 = new dGF.b(System.currentTimeMillis(), eVar.e(), c3).b();
        C7826dGu d2 = b2.d();
        C7824dGs b3 = b2.b();
        dFW dfw2 = this.e;
        if (dfw2 != null) {
            dfw2.d(b2);
        }
        dGS dgs = c2 instanceof dGS ? c2 : null;
        if (dgs == null || (abstractC7820dGo = dgs.h()) == null) {
            abstractC7820dGo = AbstractC7820dGo.c;
        }
        if (c3 != null && b3 == null && (e2 = c3.e()) != null) {
            dGB.e(e2);
        }
        if (d2 == null && b3 == null) {
            C7824dGs a = new C7824dGs.b().e(eVar.e()).c(Protocol.HTTP_1_1).c(504).a("Unsatisfiable Request (only-if-cached)").e(dGB.a).c(-1L).e(System.currentTimeMillis()).a();
            abstractC7820dGo.a(c2, a);
            return a;
        } else if (d2 == null) {
            if (b3 == null) {
                C8632dsu.e();
            }
            C7824dGs a2 = b3.k().a(c.e(d, b3)).a();
            abstractC7820dGo.c(c2, a2);
            return a2;
        } else {
            if (b3 != null) {
                abstractC7820dGo.b(c2, b3);
            } else if (this.e != null) {
                abstractC7820dGo.d(c2);
            }
            try {
                C7824dGs e3 = eVar.e(d2);
                if (e3 == null && c3 != null && e != null) {
                }
                if (b3 != null) {
                    if (e3 != null && e3.c() == 304) {
                        C7824dGs.b k = b3.k();
                        c cVar = d;
                        C7824dGs a3 = k.d(c.d(cVar, b3.j(), e3.j())).c(e3.s()).e(e3.o()).a(c.e(cVar, b3)).e(c.e(cVar, e3)).a();
                        AbstractC7829dGx e4 = e3.e();
                        if (e4 == null) {
                            C8632dsu.e();
                        }
                        e4.close();
                        dFW dfw3 = this.e;
                        if (dfw3 == null) {
                            C8632dsu.e();
                        }
                        dfw3.c();
                        this.e.e(b3, a3);
                        abstractC7820dGo.c(c2, a3);
                        return a3;
                    }
                    AbstractC7829dGx e5 = b3.e();
                    if (e5 != null) {
                        dGB.e(e5);
                    }
                }
                if (e3 == null) {
                    C8632dsu.e();
                }
                C7824dGs.b k2 = e3.k();
                c cVar2 = d;
                C7824dGs a4 = k2.a(c.e(cVar2, b3)).e(c.e(cVar2, e3)).a();
                if (this.e != null) {
                    if (C7833dHa.d(a4) && dGF.c.d(a4, d2)) {
                        C7824dGs d3 = d(this.e.d(a4), a4);
                        if (b3 != null) {
                            abstractC7820dGo.d(c2);
                        }
                        return d3;
                    } else if (C7835dHc.a.d(d2.i())) {
                        try {
                            this.e.e(d2);
                        } catch (IOException unused) {
                        }
                    }
                }
                return a4;
            } finally {
                if (c3 != null && (e = c3.e()) != null) {
                    dGB.e(e);
                }
            }
        }
    }

    private final C7824dGs d(dGE dge, C7824dGs c7824dGs) {
        if (dge == null) {
            return c7824dGs;
        }
        dIH d2 = dge.d();
        AbstractC7829dGx e = c7824dGs.e();
        if (e == null) {
            C8632dsu.e();
        }
        b bVar = new b(e.e(), dge, dIw.b(d2));
        return c7824dGs.k().e(new C7836dHd(C7824dGs.c(c7824dGs, "Content-Type", null, 2, null), c7824dGs.e().c(), dIw.e(bVar))).a();
    }

    /* loaded from: classes5.dex */
    public static final class b implements dIJ {
        private boolean a;
        final /* synthetic */ dGE b;
        final /* synthetic */ dIq c;
        final /* synthetic */ InterfaceC7871dIn e;

        b(InterfaceC7871dIn interfaceC7871dIn, dGE dge, dIq diq) {
            this.e = interfaceC7871dIn;
            this.b = dge;
            this.c = diq;
        }

        @Override // o.dIJ
        public long b(C7872dIo c7872dIo, long j) {
            C8632dsu.d(c7872dIo, "");
            try {
                long b = this.e.b(c7872dIo, j);
                if (b != -1) {
                    c7872dIo.a(this.c.o(), c7872dIo.D() - b, b);
                    this.c.j();
                    return b;
                }
                if (!this.a) {
                    this.a = true;
                    this.c.close();
                }
                return -1L;
            } catch (IOException e) {
                if (!this.a) {
                    this.a = true;
                    this.b.e();
                }
                throw e;
            }
        }

        @Override // o.dIJ
        public dIK e() {
            return this.e.e();
        }

        @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.a && !dGB.c(this, 100, TimeUnit.MILLISECONDS)) {
                this.a = true;
                this.b.e();
            }
            this.e.close();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] a$s58$91 = {12919};
        private static int d = 0;
        private static int e = 1;

        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public static final /* synthetic */ C7819dGn d(c cVar, C7819dGn c7819dGn, C7819dGn c7819dGn2) {
            int i = 2 % 2;
            int i2 = e + 11;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                cVar.c(c7819dGn, c7819dGn2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            C7819dGn c = cVar.c(c7819dGn, c7819dGn2);
            int i3 = e + 71;
            d = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 90 / 0;
            }
            return c;
        }

        public static final /* synthetic */ C7824dGs e(c cVar, C7824dGs c7824dGs) {
            int i = 2 % 2;
            int i2 = e + 5;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                C7824dGs b = cVar.b(c7824dGs);
                int i3 = e + 43;
                d = i3 % 128;
                int i4 = i3 % 2;
                return b;
            }
            cVar.b(c7824dGs);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final C7824dGs b(C7824dGs c7824dGs) {
            AbstractC7829dGx abstractC7829dGx;
            int i = 2 % 2;
            int i2 = e;
            if (c7824dGs != null) {
                int i3 = i2 + 103;
                d = i3 % 128;
                if (i3 % 2 != 0) {
                    c7824dGs.e();
                    throw null;
                }
                abstractC7829dGx = c7824dGs.e();
            } else {
                int i4 = i2 + 59;
                d = i4 % 128;
                int i5 = i4 % 2;
                abstractC7829dGx = null;
            }
            return abstractC7829dGx != null ? c7824dGs.k().e((AbstractC7829dGx) null).a() : c7824dGs;
        }

        private final C7819dGn c(C7819dGn c7819dGn, C7819dGn c7819dGn2) {
            boolean a;
            boolean i;
            int i2 = 2 % 2;
            C7819dGn.d dVar = new C7819dGn.d();
            int c = c7819dGn.c();
            int i3 = 0;
            while (true) {
                Object obj = null;
                if (i3 >= c) {
                    int c2 = c7819dGn2.c();
                    for (int i4 = 0; i4 < c2; i4++) {
                        String c3 = c7819dGn2.c(i4);
                        if (!a(c3)) {
                            int i5 = e + 29;
                            d = i5 % 128;
                            int i6 = i5 % 2;
                            if (!c(c3)) {
                                continue;
                            } else {
                                int i7 = d + 101;
                                e = i7 % 128;
                                if (i7 % 2 == 0) {
                                    dVar.e(c3, c7819dGn2.a(i4));
                                    obj.hashCode();
                                    throw null;
                                }
                                dVar.e(c3, c7819dGn2.a(i4));
                            }
                        }
                    }
                    return dVar.b();
                }
                int i8 = d + 1;
                e = i8 % 128;
                int i9 = i8 % 2;
                String c4 = c7819dGn.c(i3);
                String a2 = c7819dGn.a(i3);
                a = C8691duz.a("Warning", c4, true);
                if (a) {
                    Object[] objArr = new Object[1];
                    f(true, new byte[]{1}, new int[]{0, 1, 140, 1}, objArr);
                    i = C8691duz.i(a2, ((String) objArr[0]).intern(), false, 2, null);
                    if (i) {
                        continue;
                        i3++;
                    }
                }
                if (!a(c4)) {
                    int i10 = e + 3;
                    d = i10 % 128;
                    int i11 = i10 % 2;
                    if (c(c4)) {
                        int i12 = d + 47;
                        e = i12 % 128;
                        if (i12 % 2 == 0) {
                            c7819dGn2.a(c4);
                            throw null;
                        } else if (c7819dGn2.a(c4) != null) {
                            i3++;
                        }
                    }
                }
                dVar.e(c4, a2);
                i3++;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r1 == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
            if (r1 == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
            r1 = o.dGA.c.e + 97;
            o.dGA.c.d = r1 % 128;
            r1 = r1 % 2;
            r0 = o.C8691duz.a("Trailers", r5, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
            if (r1 == 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
            if (r0 != false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
            if ((!r0) == true) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
            r0 = o.C8691duz.a("Transfer-Encoding", r5, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
            if (r0 != false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
            r5 = o.C8691duz.a("Upgrade", r5, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
            if (r5 != false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean c(java.lang.String r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                java.lang.String r1 = "Connection"
                r2 = 1
                boolean r1 = o.C8684dus.e(r1, r5, r2)
                if (r1 != 0) goto L70
                java.lang.String r1 = "Keep-Alive"
                boolean r1 = o.C8684dus.e(r1, r5, r2)
                if (r1 != 0) goto L70
                int r1 = o.dGA.c.e
                int r1 = r1 + 35
                int r3 = r1 % 128
                o.dGA.c.d = r3
                int r1 = r1 % r0
                java.lang.String r1 = "Proxy-Authenticate"
                boolean r1 = o.C8684dus.e(r1, r5, r2)
                if (r1 != 0) goto L70
                java.lang.String r1 = "Proxy-Authorization"
                boolean r1 = o.C8684dus.e(r1, r5, r2)
                if (r1 != 0) goto L70
                int r1 = o.dGA.c.e
                int r1 = r1 + 115
                int r3 = r1 % 128
                o.dGA.c.d = r3
                int r1 = r1 % r0
                java.lang.String r3 = "TE"
                if (r1 == 0) goto L41
                boolean r1 = o.C8684dus.e(r3, r5, r2)
                if (r1 != 0) goto L70
                goto L47
            L41:
                boolean r1 = o.C8684dus.e(r3, r5, r2)
                if (r1 != 0) goto L70
            L47:
                int r1 = o.dGA.c.e
                int r1 = r1 + 97
                int r3 = r1 % 128
                o.dGA.c.d = r3
                int r1 = r1 % r0
                java.lang.String r0 = "Trailers"
                boolean r0 = o.C8684dus.e(r0, r5, r2)
                if (r1 == 0) goto L5b
                if (r0 != 0) goto L70
                goto L5f
            L5b:
                r0 = r0 ^ r2
                if (r0 == r2) goto L5f
                goto L70
            L5f:
                java.lang.String r0 = "Transfer-Encoding"
                boolean r0 = o.C8684dus.e(r0, r5, r2)
                if (r0 != 0) goto L70
                java.lang.String r0 = "Upgrade"
                boolean r5 = o.C8684dus.e(r0, r5, r2)
                if (r5 != 0) goto L70
                goto L71
            L70:
                r2 = 0
            L71:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dGA.c.c(java.lang.String):boolean");
        }

        private final boolean a(String str) {
            boolean a;
            boolean a2;
            boolean a3;
            int i = 2 % 2;
            a = C8691duz.a("Content-Length", str, true);
            if (a) {
                return true;
            }
            a2 = C8691duz.a("Content-Encoding", str, true);
            if (!a2) {
                a3 = C8691duz.a("Content-Type", str, true);
                if (a3) {
                    int i2 = d;
                    int i3 = i2 + 79;
                    e = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 24 / 0;
                    }
                    int i5 = i2 + 15;
                    e = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                return false;
            }
            return true;
        }

        private static void f(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
            int i;
            int length;
            char[] cArr;
            int i2 = 2 % 2;
            C9584sQ c9584sQ = new C9584sQ();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr2 = a$s58$91;
            if (cArr2 != null) {
                int i7 = $10 + 115;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                }
                for (int i8 = 0; i8 < length; i8++) {
                    cArr[i8] = (char) (cArr2[i8] ^ (-1938542877577235927L));
                }
                cArr2 = cArr;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr2, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                c9584sQ.c = 0;
                char c = 0;
                while (c9584sQ.c < i4) {
                    int i9 = $11 + 83;
                    $10 = i9 % 128;
                    if (i9 % 2 == 0 ? bArr[c9584sQ.c] != 1 : bArr[c9584sQ.c] != 1) {
                        cArr4[c9584sQ.c] = (char) ((cArr3[c9584sQ.c] * 2) - c);
                    } else {
                        cArr4[c9584sQ.c] = (char) (((cArr3[c9584sQ.c] * 2) + 1) - c);
                    }
                    c = cArr4[c9584sQ.c];
                    c9584sQ.c++;
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i10 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i10, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i10);
                int i11 = $11 + 49;
                $10 = i11 % 128;
                int i12 = i11 % 2;
            }
            if (z) {
                int i13 = $10 + 49;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                char[] cArr6 = new char[i4];
                c9584sQ.c = 0;
                while (c9584sQ.c < i4) {
                    cArr6[c9584sQ.c] = cArr3[(i4 - c9584sQ.c) - 1];
                    c9584sQ.c++;
                }
                cArr3 = cArr6;
            }
            if (i5 > 0) {
                c9584sQ.c = 0;
                while (c9584sQ.c < i4) {
                    int i15 = $10 + 51;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        cArr3[c9584sQ.c] = (char) (cArr3[c9584sQ.c] << iArr[4]);
                        i = c9584sQ.c;
                    } else {
                        cArr3[c9584sQ.c] = (char) (cArr3[c9584sQ.c] - iArr[2]);
                        i = c9584sQ.c + 1;
                    }
                    c9584sQ.c = i;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }
}
