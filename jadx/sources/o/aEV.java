package o;

import o.C2433afw;
import o.C2529ahm;
import o.InterfaceC5222bug;

/* loaded from: classes3.dex */
public class aEV extends aEX implements InterfaceC5222bug<aEV> {
    public static final d c = new d(null);
    private final C2529ahm.e d;
    private final int e;

    @Override // o.InterfaceC5222bug
    /* renamed from: L */
    public aEV getVideo() {
        return this;
    }

    @Override // o.InterfaceC5222bug
    public int getPosition() {
        return this.e;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: J */
    public aEV mo3081getEntity() {
        return (aEV) InterfaceC5222bug.a.d(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aEV(o.C2529ahm.e r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r5, r0)
            o.aEV$d r0 = o.aEV.c
            o.ajh r0 = r0.a(r5)
            if (r0 == 0) goto L40
            o.afw r1 = r5.a()
            o.afw$c r1 = r1.c()
            r2 = 0
            if (r1 == 0) goto L1d
            java.lang.String r1 = r1.d()
            goto L1e
        L1d:
            r1 = r2
        L1e:
            o.afw r3 = r5.a()
            o.afw$c r3 = r3.c()
            if (r3 == 0) goto L2c
            java.lang.String r2 = r3.c()
        L2c:
            r4.<init>(r0, r1, r2)
            r4.d = r5
            java.lang.Integer r5 = r5.d()
            if (r5 == 0) goto L3c
            int r5 = r5.intValue()
            goto L3d
        L3c:
            r5 = -1
        L3d:
            r4.e = r5
            return
        L40:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aEV.<init>(o.ahm$e):void");
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final C2630ajh a(C2529ahm.e eVar) {
            C2529ahm.b b;
            C2529ahm.k e;
            C2529ahm.f c;
            C2529ahm.h d;
            C2529ahm.m a;
            C2529ahm.i e2;
            C2529ahm.a e3;
            C2529ahm.g a2;
            C2529ahm.j b2;
            C2630ajh e4;
            C8632dsu.c((Object) eVar, "");
            C2529ahm.c c2 = eVar.c();
            if (c2 == null || (e3 = c2.e()) == null || (a2 = e3.a()) == null || (b2 = a2.b()) == null || (e4 = b2.e()) == null) {
                C2529ahm.c c3 = eVar.c();
                if (c3 == null || (d = c3.d()) == null || (a = d.a()) == null || (e2 = a.e()) == null) {
                    C2529ahm.c c4 = eVar.c();
                    if (c4 == null || (b = c4.b()) == null || (e = b.e()) == null || (c = e.c()) == null) {
                        return null;
                    }
                    return c.a();
                }
                return e2.a();
            }
            return e4;
        }
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: getCursor */
    public String mo3080getCursor() {
        String b2 = this.d.b();
        return b2 == null ? "" : b2;
    }

    @Override // o.InterfaceC5222bug
    public InterfaceC5149btM getEvidence() {
        boolean g;
        C2433afw.c c2 = this.d.a().c();
        String d2 = c2 != null ? c2.d() : null;
        if (d2 != null) {
            g = C8691duz.g(d2);
            if (!g) {
                return new b(this);
            }
        }
        return null;
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC5149btM {
        private String b;
        private String c;
        private String e;

        @Override // o.InterfaceC5149btM
        public String getImageKey() {
            return this.b;
        }

        @Override // o.InterfaceC5149btM
        public String getImageUrl() {
            return this.e;
        }

        @Override // o.InterfaceC5149btM
        public String getTcardUrl() {
            return this.c;
        }

        b(aEV aev) {
            C2433afw.c c = aev.d.a().c();
            this.e = c != null ? c.d() : null;
            C2433afw.c c2 = aev.d.a().c();
            this.b = c2 != null ? c2.c() : null;
        }
    }
}
