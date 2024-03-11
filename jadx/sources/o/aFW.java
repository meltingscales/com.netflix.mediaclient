package o;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import o.InterfaceC7736dDl;
import o.aFR;
import o.aFS;

@InterfaceC7700dCc
/* loaded from: classes3.dex */
public final class aFW {
    public static final d Companion = new d(null);
    private final aFS b;
    private final aFR c;
    private final dEP d;
    private final dEP e;

    public aFW() {
        this((aFS) null, (aFR) null, (dEP) null, (dEP) null, 15, (C8627dsp) null);
    }

    public static /* synthetic */ aFW c(aFW afw, aFS afs, aFR afr, dEP dep, dEP dep2, int i, Object obj) {
        if ((i & 1) != 0) {
            afs = afw.b;
        }
        if ((i & 2) != 0) {
            afr = afw.c;
        }
        if ((i & 4) != 0) {
            dep = afw.e;
        }
        if ((i & 8) != 0) {
            dep2 = afw.d;
        }
        return afw.b(afs, afr, dep, dep2);
    }

    public final aFW b(aFS afs, aFR afr, dEP dep, dEP dep2) {
        C8632dsu.c((Object) afs, "");
        C8632dsu.c((Object) afr, "");
        C8632dsu.c((Object) dep, "");
        C8632dsu.c((Object) dep2, "");
        return new aFW(afs, afr, dep, dep2);
    }

    public final aFR c() {
        return this.c;
    }

    public final dEP d() {
        return this.d;
    }

    public final dEP e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aFW) {
            aFW afw = (aFW) obj;
            return C8632dsu.c(this.b, afw.b) && C8632dsu.c(this.c, afw.c) && C8632dsu.c(this.e, afw.e) && C8632dsu.c(this.d, afw.d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        aFS afs = this.b;
        aFR afr = this.c;
        dEP dep = this.e;
        dEP dep2 = this.d;
        return "StorageModel(clientMetadata=" + afs + ", metadata=" + afr + ", fields=" + dep + ", overrides=" + dep2 + ")";
    }

    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC7736dDl<aFW> {
        public static final a a;
        private static final /* synthetic */ dDS e;

        @Override // o.dBT, o.dBZ, o.dBP
        public InterfaceC7707dCj e() {
            return e;
        }

        static {
            a aVar = new a();
            a = aVar;
            dDS dds = new dDS("com.netflix.mediaclient.hendrixconfig.impl.StorageModel", aVar, 4);
            dds.b("clientMetadata", true);
            dds.b("metadata", true);
            dds.b("fields", true);
            dds.b("overrides", true);
            e = dds;
        }

        private a() {
        }

        @Override // o.dBZ
        /* renamed from: a */
        public void e(InterfaceC7721dCx interfaceC7721dCx, aFW afw) {
            C8632dsu.c((Object) interfaceC7721dCx, "");
            C8632dsu.c((Object) afw, "");
            InterfaceC7707dCj e2 = e();
            InterfaceC7719dCv e3 = interfaceC7721dCx.e(e2);
            aFW.a(afw, e3, e2);
            e3.d(e2);
        }

        @Override // o.InterfaceC7736dDl
        public dBT<?>[] a() {
            dEW dew = dEW.b;
            return new dBT[]{aFS.d.b, aFR.a.b, dew, dew};
        }

        @Override // o.InterfaceC7736dDl
        public dBT<?>[] b() {
            return InterfaceC7736dDl.e.b(this);
        }

        @Override // o.dBP
        /* renamed from: d */
        public aFW b(InterfaceC7720dCw interfaceC7720dCw) {
            int i;
            dEP dep;
            aFR afr;
            aFS afs;
            dEP dep2;
            C8632dsu.c((Object) interfaceC7720dCw, "");
            InterfaceC7707dCj e2 = e();
            InterfaceC7717dCt c = interfaceC7720dCw.c(e2);
            dEP dep3 = null;
            if (c.h()) {
                dEW dew = dEW.b;
                afs = (aFS) c.d(e2, 0, aFS.d.b, null);
                dep2 = (dEP) c.d(e2, 3, dew, null);
                dep = (dEP) c.d(e2, 2, dew, null);
                afr = (aFR) c.d(e2, 1, aFR.a.b, null);
                i = 15;
            } else {
                int i2 = 0;
                boolean z = true;
                aFR afr2 = null;
                aFS afs2 = null;
                dEP dep4 = null;
                while (z) {
                    int h = c.h(e2);
                    if (h == -1) {
                        z = false;
                    } else if (h == 0) {
                        afs2 = (aFS) c.d(e2, 0, aFS.d.b, afs2);
                        i2 |= 1;
                    } else if (h == 1) {
                        afr2 = (aFR) c.d(e2, 1, aFR.a.b, afr2);
                        i2 |= 2;
                    } else if (h == 2) {
                        dep3 = (dEP) c.d(e2, 2, dEW.b, dep3);
                        i2 |= 4;
                    } else if (h != 3) {
                        throw new UnknownFieldException(h);
                    } else {
                        dep4 = (dEP) c.d(e2, 3, dEW.b, dep4);
                        i2 |= 8;
                    }
                }
                i = i2;
                dep = dep3;
                afr = afr2;
                afs = afs2;
                dep2 = dep4;
            }
            c.e(e2);
            return new aFW(i, afs, afr, dep, dep2, (C7752dEa) null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final dBT<aFW> a() {
            return a.a;
        }
    }

    public /* synthetic */ aFW(int i, aFS afs, aFR afr, dEP dep, dEP dep2, C7752dEa c7752dEa) {
        Map d2;
        Map d3;
        this.b = (i & 1) == 0 ? new aFS(0L, 0L, 0, 7, (C8627dsp) null) : afs;
        if ((i & 2) == 0) {
            this.c = new aFR((String) null, (String) null, (Map) null, (String) null, 15, (C8627dsp) null);
        } else {
            this.c = afr;
        }
        if ((i & 4) == 0) {
            d3 = dqE.d();
            this.e = new dEP(d3);
        } else {
            this.e = dep;
        }
        if ((i & 8) != 0) {
            this.d = dep2;
            return;
        }
        d2 = dqE.d();
        this.d = new dEP(d2);
    }

    public aFW(aFS afs, aFR afr, dEP dep, dEP dep2) {
        C8632dsu.c((Object) afs, "");
        C8632dsu.c((Object) afr, "");
        C8632dsu.c((Object) dep, "");
        C8632dsu.c((Object) dep2, "");
        this.b = afs;
        this.c = afr;
        this.e = dep;
        this.d = dep2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x005f, code lost:
        if (o.C8632dsu.c(r1, new o.dEP(r3)) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void a(o.aFW r11, o.InterfaceC7719dCv r12, o.InterfaceC7707dCj r13) {
        /*
            r0 = 0
            boolean r1 = r12.c(r13, r0)
            if (r1 == 0) goto L8
            goto L1d
        L8:
            o.aFS r1 = r11.b
            o.aFS r10 = new o.aFS
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 7
            r9 = 0
            r2 = r10
            r2.<init>(r3, r5, r7, r8, r9)
            boolean r1 = o.C8632dsu.c(r1, r10)
            if (r1 != 0) goto L24
        L1d:
            o.aFS$d r1 = o.aFS.d.b
            o.aFS r2 = r11.b
            r12.b(r13, r0, r1, r2)
        L24:
            r0 = 1
            boolean r1 = r12.c(r13, r0)
            if (r1 == 0) goto L2c
            goto L41
        L2c:
            o.aFR r1 = r11.c
            o.aFR r9 = new o.aFR
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 15
            r8 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            boolean r1 = o.C8632dsu.c(r1, r9)
            if (r1 != 0) goto L48
        L41:
            o.aFR$a r1 = o.aFR.a.b
            o.aFR r2 = r11.c
            r12.b(r13, r0, r1, r2)
        L48:
            r0 = 2
            boolean r1 = r12.c(r13, r0)
            if (r1 == 0) goto L50
            goto L61
        L50:
            o.dEP r1 = r11.e
            o.dEP r2 = new o.dEP
            java.util.Map r3 = o.dqF.c()
            r2.<init>(r3)
            boolean r1 = o.C8632dsu.c(r1, r2)
            if (r1 != 0) goto L68
        L61:
            o.dEW r1 = o.dEW.b
            o.dEP r2 = r11.e
            r12.b(r13, r0, r1, r2)
        L68:
            r0 = 3
            boolean r1 = r12.c(r13, r0)
            if (r1 == 0) goto L70
            goto L81
        L70:
            o.dEP r1 = r11.d
            o.dEP r2 = new o.dEP
            java.util.Map r3 = o.dqF.c()
            r2.<init>(r3)
            boolean r1 = o.C8632dsu.c(r1, r2)
            if (r1 != 0) goto L88
        L81:
            o.dEW r1 = o.dEW.b
            o.dEP r11 = r11.d
            r12.b(r13, r0, r1, r11)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aFW.a(o.aFW, o.dCv, o.dCj):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ aFW(o.aFS r9, o.aFR r10, o.dEP r11, o.dEP r12, int r13, o.C8627dsp r14) {
        /*
            r8 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L11
            o.aFS r9 = new o.aFS
            r1 = 0
            r3 = 0
            r5 = 0
            r6 = 7
            r7 = 0
            r0 = r9
            r0.<init>(r1, r3, r5, r6, r7)
        L11:
            r14 = r13 & 2
            if (r14 == 0) goto L22
            o.aFR r10 = new o.aFR
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 15
            r6 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L22:
            r14 = r13 & 4
            if (r14 == 0) goto L2f
            o.dEP r11 = new o.dEP
            java.util.Map r14 = o.dqF.c()
            r11.<init>(r14)
        L2f:
            r13 = r13 & 8
            if (r13 == 0) goto L3c
            o.dEP r12 = new o.dEP
            java.util.Map r13 = o.dqF.c()
            r12.<init>(r13)
        L3c:
            r8.<init>(r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aFW.<init>(o.aFS, o.aFR, o.dEP, o.dEP, int, o.dsp):void");
    }
}
