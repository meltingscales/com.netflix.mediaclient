package o;

import j$.time.Instant;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AbstractC3855bNd;

@Singleton
/* loaded from: classes4.dex */
public final class bND implements InterfaceC3862bNk {
    private final C3858bNg a;
    private final InterfaceC8812dzl<AbstractC3855bNd.c> b;
    private final InterfaceC8812dzl<AbstractC3855bNd.c> c;
    private final InterfaceC1270Vf d;
    private final InterfaceC8812dzl<AbstractC3855bNd.c> e;
    private final dyS<AbstractC3855bNd.c> f;
    private final dyS<AbstractC3855bNd.c> g;
    private final dyS<AbstractC3855bNd.c> i;
    private final InterfaceC3864bNm j;

    @Override // o.InterfaceC3862bNk
    public dyS<AbstractC3855bNd.c> a() {
        return this.g;
    }

    @Override // o.InterfaceC3862bNk
    public dyS<AbstractC3855bNd.c> b() {
        return this.i;
    }

    @Inject
    public bND(InterfaceC3864bNm interfaceC3864bNm, InterfaceC1270Vf interfaceC1270Vf, C3858bNg c3858bNg) {
        C8632dsu.c((Object) interfaceC3864bNm, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        C8632dsu.c((Object) c3858bNg, "");
        this.j = interfaceC3864bNm;
        this.d = interfaceC1270Vf;
        this.a = c3858bNg;
        InterfaceC8812dzl<AbstractC3855bNd.c> d2 = dzB.d(interfaceC3864bNm.a());
        this.b = d2;
        this.g = a(d2);
        InterfaceC8812dzl<AbstractC3855bNd.c> d3 = dzB.d(interfaceC3864bNm.c());
        this.e = d3;
        this.f = a(d3);
        InterfaceC8812dzl<AbstractC3855bNd.c> d4 = dzB.d(interfaceC3864bNm.d());
        this.c = d4;
        this.i = a(d4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(AbstractC3855bNd.c cVar) {
        return cVar.e().compareTo(this.d.e()) < 0;
    }

    @Override // o.InterfaceC3862bNk
    public void c(AbstractC3855bNd.c cVar) {
        C8632dsu.c((Object) cVar, "");
        this.b.d(cVar);
        this.j.b(cVar);
        this.e.d(null);
        this.j.c(null);
        this.c.d(null);
        this.j.d(null);
    }

    @Override // o.InterfaceC3862bNk
    public AbstractC3855bNd.c d() {
        AbstractC3855bNd.c b = this.b.b();
        if (b == null || !e(b)) {
            return this.b.b();
        }
        return null;
    }

    @Override // o.InterfaceC3862bNk
    public void c(String str) {
        C8632dsu.c((Object) str, "");
        AbstractC3855bNd.c b = this.b.b();
        AbstractC3855bNd.c b2 = this.c.b();
        if (!C8632dsu.c((Object) (b != null ? b.b() : null), (Object) str)) {
            if (!C8632dsu.c((Object) (b2 != null ? b2.b() : null), (Object) str)) {
                throw new IllegalStateException("No valid createBeacon in state, beaconCode: " + str);
            }
            b = b2;
        }
        this.b.d(null);
        this.j.b(null);
        this.e.d(b);
        this.j.c(b);
        this.c.d(null);
        this.j.d(null);
    }

    @Override // o.InterfaceC3862bNk
    public void b(String str) {
        C8632dsu.c((Object) str, "");
        AbstractC3855bNd.c b = this.e.b();
        if (this.a.e()) {
            if (!C8632dsu.c((Object) (b != null ? b.b() : null), (Object) str)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        this.b.d(null);
        this.j.b(null);
        this.e.d(null);
        this.j.c(null);
        this.c.d(b);
        this.j.d(b);
    }

    @Override // o.InterfaceC3862bNk
    public void a(String str) {
        C8632dsu.c((Object) str, "");
        AbstractC3855bNd.c b = this.b.b();
        if (C8632dsu.c((Object) (b != null ? b.b() : null), (Object) str)) {
            this.b.d(null);
            this.j.b(null);
        }
        AbstractC3855bNd.c b2 = this.e.b();
        if (C8632dsu.c((Object) (b2 != null ? b2.b() : null), (Object) str)) {
            this.e.d(null);
            this.j.c(null);
        }
        AbstractC3855bNd.c b3 = this.c.b();
        if (C8632dsu.c((Object) (b3 != null ? b3.b() : null), (Object) str)) {
            this.c.d(null);
            this.j.d(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements dyS<AbstractC3855bNd.c> {
        final /* synthetic */ bND a;
        final /* synthetic */ dyS b;

        public d(dyS dys, bND bnd) {
            this.b = dys;
            this.a = bnd;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super AbstractC3855bNd.c> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.b.collect(new AnonymousClass2(dyq, this.a), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.bND$d$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements dyQ {
            final /* synthetic */ bND a;
            final /* synthetic */ dyQ d;

            public AnonymousClass2(dyQ dyq, bND bnd) {
                this.d = dyq;
                this.a = bnd;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, o.InterfaceC8585dra r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.RealGameControllerBeaconRepo$filterExpired$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.RealGameControllerBeaconRepo$filterExpired$$inlined$map$1$2$1 r0 = (com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.RealGameControllerBeaconRepo$filterExpired$$inlined$map$1$2$1) r0
                    int r1 = r0.a
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.a = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.RealGameControllerBeaconRepo$filterExpired$$inlined$map$1$2$1 r0 = new com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.RealGameControllerBeaconRepo$filterExpired$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.d
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.a
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r6)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    o.C8556dpz.d(r6)
                    o.dyQ r6 = r4.d
                    o.bNd$c r5 = (o.AbstractC3855bNd.c) r5
                    if (r5 == 0) goto L43
                    o.bND r2 = r4.a
                    boolean r2 = o.bND.a(r2, r5)
                    if (r2 != r3) goto L43
                    r5 = 0
                L43:
                    r0.a = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.bND.d.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    @Override // o.InterfaceC3862bNk
    public void a(String str, Instant instant) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) instant, "");
        AbstractC3855bNd.c b = this.b.b();
        if (C8632dsu.c((Object) (b != null ? b.b() : null), (Object) str)) {
            AbstractC3855bNd.c e = AbstractC3855bNd.c.e(b, null, null, instant, 0, 11, null);
            this.b.d(e);
            this.j.b(e);
        }
        AbstractC3855bNd.c b2 = this.e.b();
        if (C8632dsu.c((Object) (b2 != null ? b2.b() : null), (Object) str)) {
            AbstractC3855bNd.c e2 = AbstractC3855bNd.c.e(b2, null, null, instant, 0, 11, null);
            this.e.d(e2);
            this.j.c(e2);
        }
        AbstractC3855bNd.c b3 = this.c.b();
        if (C8632dsu.c((Object) (b3 != null ? b3.b() : null), (Object) str)) {
            AbstractC3855bNd.c e3 = AbstractC3855bNd.c.e(b3, null, null, instant, 0, 11, null);
            this.c.d(e3);
            this.j.d(e3);
        }
    }

    private final dyS<AbstractC3855bNd.c> a(dyS<AbstractC3855bNd.c> dys) {
        return new d(dys, this);
    }
}
