package com.netflix.clcs.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.netflix.clcs.client.InterstitialClient;
import com.netflix.clcs.models.InterstitialLoggingHandler;
import com.netflix.clcs.models.Modal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import o.C0867Fq;
import o.C0870Ft;
import o.C0876Fz;
import o.C0877Ga;
import o.C0897Gu;
import o.C8569dql;
import o.C8571dqn;
import o.C8576dqs;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C8737dwr;
import o.FD;
import o.FE;
import o.FI;
import o.FJ;
import o.FK;
import o.FL;
import o.FN;
import o.FX;
import o.FY;
import o.InterfaceC1571aGf;
import o.InterfaceC8598drn;
import o.InterfaceC8812dzl;
import o.InterfaceC8822dzv;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;
import o.dyR;
import o.dzB;

@SuppressLint({"LogNotNetflixLog"})
/* loaded from: classes2.dex */
public final class InterstitialCoordinator implements FY {
    public static final c b = new c(null);
    public static final int d = 8;
    private final FK a;
    private InterstitialClient c;
    private FN e;
    private FX f;
    private final Map<String, List<drM<Object, dpR>>> g;
    private final Map<String, Object> h;
    private final FL i;
    private final Map<String, drM<String, dpR>> j;
    private final InterfaceC8812dzl<Boolean> k;
    private FragmentManager l;
    private final InterfaceC1571aGf.d m;
    private final dwU n;

    /* renamed from: o  reason: collision with root package name */
    private final InterstitialLoggingHandler f13131o;
    private final Map<String, FE> q;
    private final Map<String, Pair<drM<Boolean, dpR>, List<FJ>>> s;
    private final List<d> t;

    /* loaded from: classes2.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[Navigation.values().length];
            try {
                iArr[Navigation.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Navigation.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Navigation.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            c = iArr;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        InterstitialCoordinator c();
    }

    public final FX a() {
        return this.f;
    }

    @Override // o.FY
    public InterstitialLoggingHandler c() {
        return this.f13131o;
    }

    public final void c(FragmentManager fragmentManager) {
        C8632dsu.c((Object) fragmentManager, "");
        this.l = fragmentManager;
    }

    public InterstitialCoordinator(dwU dwu, FK fk, InterfaceC1571aGf.d dVar, InterstitialLoggingHandler interstitialLoggingHandler, FL fl) {
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) fk, "");
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) interstitialLoggingHandler, "");
        C8632dsu.c((Object) fl, "");
        this.n = dwu;
        this.a = fk;
        this.m = dVar;
        this.f13131o = interstitialLoggingHandler;
        this.i = fl;
        this.h = new LinkedHashMap();
        this.g = new LinkedHashMap();
        this.j = new LinkedHashMap();
        this.s = new LinkedHashMap();
        this.q = new LinkedHashMap();
        this.k = dzB.d(Boolean.FALSE);
        this.t = new ArrayList();
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Navigation {
        private static final /* synthetic */ Navigation[] b;
        private static final /* synthetic */ InterfaceC8598drn d;
        public static final Navigation c = new Navigation("Forward", 0);
        public static final Navigation a = new Navigation("Replace", 1);
        public static final Navigation e = new Navigation("Backward", 2);

        private static final /* synthetic */ Navigation[] a() {
            return new Navigation[]{c, a, e};
        }

        public static Navigation valueOf(String str) {
            return (Navigation) Enum.valueOf(Navigation.class, str);
        }

        public static Navigation[] values() {
            return (Navigation[]) b.clone();
        }

        private Navigation(String str, int i) {
        }

        static {
            Navigation[] a2 = a();
            b = a2;
            d = C8600drp.e(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d {
        private final String c;
        private final String d;

        public final String b() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c((Object) this.c, (Object) dVar.c);
            }
            return false;
        }

        public int hashCode() {
            String str = this.d;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.d;
            String str2 = this.c;
            return "StackItem(navigationMarker=" + str + ", serverState=" + str2 + ")";
        }

        public d(String str, String str2) {
            C8632dsu.c((Object) str2, "");
            this.d = str;
            this.c = str2;
        }
    }

    private final C0897Gu e() {
        FragmentManager fragmentManager = this.l;
        Fragment findFragmentByTag = fragmentManager != null ? fragmentManager.findFragmentByTag("HostDialog") : null;
        if (findFragmentByTag instanceof C0897Gu) {
            return (C0897Gu) findFragmentByTag;
        }
        return null;
    }

    public final InterfaceC1571aGf c(Context context) {
        C8632dsu.c((Object) context, "");
        return this.m.b(context);
    }

    public final void a(FX fx, InterstitialClient interstitialClient, FN fn, FragmentManager fragmentManager) {
        boolean z;
        C8632dsu.c((Object) fx, "");
        C8632dsu.c((Object) interstitialClient, "");
        C8632dsu.c((Object) fn, "");
        C8632dsu.c((Object) fragmentManager, "");
        this.c = interstitialClient;
        this.e = fn;
        this.l = fragmentManager;
        if (fx.e().a() instanceof Modal) {
            FE b2 = ((Modal) fx.e().a()).b();
            z = true;
            if (b2 != null) {
                z = true ^ C0870Ft.e(b2);
            }
        } else {
            z = false;
        }
        c().c(z);
        C0897Gu e = e();
        if (e != null) {
            e.dismissAllowingStateLoss();
        }
        a(this, fx, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(InterstitialCoordinator interstitialCoordinator, FX fx, Navigation navigation, int i, Object obj) {
        if ((i & 2) != 0) {
            navigation = Navigation.c;
        }
        interstitialCoordinator.d(fx, navigation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(final FX fx, Navigation navigation) {
        C0897Gu e;
        String h;
        FN fn;
        FN fn2;
        FX.b e2;
        FX fx2 = this.f;
        if (fx2 != null) {
            FE j = fx2.j();
            if (j != null) {
                e(j);
            }
            c().a(fx != null, fx2.i(), fx2.d());
        }
        this.f = fx;
        this.h.clear();
        FragmentManager fragmentManager = this.l;
        if (fragmentManager == null) {
            Log.e("InterstitialCoordinator", "No fragment manager was found");
            return;
        }
        if (fx != null) {
            b(fx);
            c().b(fx2 == null, fx.i(), fx.d());
            FE g = fx.g();
            if (g != null) {
                e(g);
            }
        }
        FD fd = null;
        if (fx == null) {
            c().b();
            C0897Gu e3 = e();
            if (e3 != null) {
                e3.e(null);
            }
            if (fx2 != null && (e2 = fx2.e()) != null) {
                fd = e2.a();
            }
            if ((fd instanceof C0876Fz) && (fn2 = this.e) != null) {
                fn2.c();
            }
        } else {
            C0897Gu.d dVar = C0897Gu.a;
            if (dVar.d(fx) && fx2 != null && !dVar.d(fx2)) {
                FN fn3 = this.e;
                if (fn3 != null) {
                    fn3.c();
                }
            } else if (!dVar.d(fx) && fx2 != null && dVar.d(fx2) && (e = e()) != null) {
                e.e(null);
            }
        }
        if (fx != null) {
            if (C0897Gu.a.d(fx) && e() == null) {
                new C0897Gu().show(fragmentManager, "HostDialog");
            } else if ((fx.e().a() instanceof C0876Fz) && (fn = this.e) != null) {
                fn.b(ComposableLambdaKt.composableLambdaInstance(-1114574031, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.clcs.ui.InterstitialCoordinator$transitionToScreen$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                        c(composer, num.intValue());
                        return dpR.c;
                    }

                    public final void c(Composer composer, int i) {
                        if ((i & 11) != 2 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1114574031, i, -1, "com.netflix.clcs.ui.InterstitialCoordinator.transitionToScreen.<anonymous> (InterstitialCoordinator.kt:179)");
                            }
                            C0877Ga.c((C0876Fz) FX.this.e().a(), FX.this.f(), FX.this.e().b(), this, null, composer, 4096, 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer.skipToGroupEnd();
                    }
                }));
            }
        }
        this.g.clear();
        this.j.clear();
        this.s.clear();
        this.q.clear();
        C0897Gu e4 = e();
        if (e4 != null) {
            e4.e(fx);
        }
        if (fx == null) {
            this.t.clear();
        }
        if (fx == null || (h = fx.h()) == null) {
            return;
        }
        d dVar2 = new d(fx.a(), h);
        int i = a.c[navigation.ordinal()];
        if (i == 1) {
            this.t.add(dVar2);
        } else if (i == 2 || i == 3) {
            C8571dqn.v(this.t);
            this.t.add(dVar2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(FE.a aVar) {
        if (aVar == null) {
            return;
        }
        boolean z = aVar instanceof FE.a.c;
    }

    private final void b(FX fx) {
        List<FI> b2 = fx.b();
        if (b2 != null) {
            for (FI fi2 : b2) {
                Object d2 = this.i.d(fi2.e());
                if (d2 != null) {
                    this.h.put(fi2.c().e(), d2);
                }
            }
        }
    }

    @Override // o.FY
    public InterfaceC8822dzv<Boolean> d() {
        return dyR.b((InterfaceC8812dzl) this.k);
    }

    @Override // o.FY
    public void e(FE fe) {
        Object D;
        List h;
        String h2;
        String h3;
        String h4;
        C8632dsu.c((Object) fe, "");
        if (this.k.b().booleanValue()) {
            return;
        }
        if (fe instanceof FE.m) {
            for (FE fe2 : ((FE.m) fe).a()) {
                e(fe2);
            }
        } else if (fe instanceof FE.n) {
            FE.n nVar = (FE.n) fe;
            c().d(nVar.a());
            FX fx = this.f;
            if (fx == null || (h4 = fx.h()) == null) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<FE.n.a> e = nVar.e();
            if (e == null) {
                e = C8569dql.i();
            }
            for (FE.n.a aVar : e) {
                Object obj = this.h.get(aVar.c().e());
                if (obj != null) {
                    String d2 = C0867Fq.d(aVar.c(), obj);
                    if (d2 != null) {
                        drM<String, dpR> drm = this.j.get(aVar.c().e());
                        if (drm != null) {
                            drm.invoke(d2);
                            return;
                        }
                        return;
                    }
                    linkedHashMap.put(aVar.c().e(), obj);
                    dpR dpr = dpR.c;
                } else {
                    Object a2 = C0867Fq.a(aVar.c());
                    if (a2 != null) {
                        linkedHashMap.put(aVar.c().e(), a2);
                        dpR dpr2 = dpR.c;
                    }
                }
            }
            this.k.d(Boolean.TRUE);
            C8737dwr.c(this.n, null, null, new InterstitialCoordinator$handleEffect$4(this, h4, fe, linkedHashMap, null), 3, null);
        } else if (fe instanceof FE.o) {
            FX fx2 = this.f;
            if (fx2 == null || (h3 = fx2.h()) == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            List<FJ> e2 = ((FE.o) fe).e();
            if (e2 == null) {
                e2 = C8569dql.i();
            }
            for (FJ fj : e2) {
                Object obj2 = this.h.get(fj.e());
                if (obj2 != null) {
                    linkedHashMap2.put(fj.e(), obj2);
                } else {
                    Object a3 = C0867Fq.a(fj);
                    if (a3 != null) {
                        linkedHashMap2.put(fj.e(), a3);
                    }
                }
            }
            C8737dwr.c(this.n, null, null, new InterstitialCoordinator$handleEffect$7(this, h3, fe, linkedHashMap2, null), 3, null);
        } else if (fe instanceof FE.d) {
            c().d(((FE.d) fe).a());
            a(this, null, null, 2, null);
        } else if (fe instanceof FE.l) {
            Map<String, FE> map = this.q;
            FJ b2 = ((FE.l) fe).b();
            FE fe3 = map.get(b2 != null ? b2.e() : null);
            if (fe3 != null) {
                e(fe3);
            }
        } else if (fe instanceof FE.g) {
            this.a.e(fe);
        } else if (fe instanceof FE.h) {
            c().d(((FE.h) fe).d());
            this.a.e(fe);
        } else if (fe instanceof FE.i) {
            this.a.e(fe);
        } else if (fe instanceof FE.b) {
            FE.b bVar = (FE.b) fe;
            c().b(bVar.c(), bVar.e(), bVar.b(), bVar.a());
        } else if (fe instanceof FE.c) {
            String e3 = ((FE.c) fe).e();
            if (e3 != null) {
                c().b(e3);
            }
        } else if (fe instanceof FE.e) {
            a(this, null, null, 2, null);
            this.a.e(fe);
        } else if (fe instanceof FE.j) {
            FX fx3 = this.f;
            if (fx3 == null || (h2 = fx3.h()) == null) {
                return;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            List<FE.n.a> a4 = ((FE.j) fe).a();
            if (a4 == null) {
                a4 = C8569dql.i();
            }
            for (FE.n.a aVar2 : a4) {
                Object obj3 = this.h.get(aVar2.c().e());
                if (obj3 != null) {
                    String d3 = C0867Fq.d(aVar2.c(), obj3);
                    if (d3 != null) {
                        drM<String, dpR> drm2 = this.j.get(aVar2.c().e());
                        if (drm2 != null) {
                            drm2.invoke(d3);
                            return;
                        }
                        return;
                    }
                    linkedHashMap3.put(aVar2.c().e(), obj3);
                    dpR dpr3 = dpR.c;
                } else {
                    Object a5 = C0867Fq.a(aVar2.c());
                    if (a5 != null) {
                        linkedHashMap3.put(aVar2.c().e(), a5);
                        dpR dpr4 = dpR.c;
                    }
                }
            }
            this.k.d(Boolean.TRUE);
            C8737dwr.c(this.n, null, null, new InterstitialCoordinator$handleEffect$13(this, h2, fe, linkedHashMap3, null), 3, null);
        } else if (fe instanceof FE.f) {
            FE.f fVar = (FE.f) fe;
            c().d(fVar.a());
            if (fVar.e() == null) {
                if (!this.t.isEmpty()) {
                    C8571dqn.v(this.t);
                }
            } else {
                Iterator<d> it = this.t.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (C8632dsu.c((Object) it.next().d(), (Object) fVar.e())) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    List<d> list = this.t;
                    h = C8576dqs.h((List) list, (list.size() - i) - 1);
                    this.t.clear();
                    this.t.addAll(h);
                } else {
                    InterstitialLoggingHandler c2 = c();
                    String e4 = fVar.e();
                    c2.b("InterstitialEffectError", "NavigateBackError", "Could not find navigationMarker: " + e4, (Exception) null);
                    String e5 = fVar.e();
                    Log.e("InterstitialCoordinator", "Could not find navigationMarker: " + e5);
                    C8571dqn.v(this.t);
                }
            }
            D = C8576dqs.D((List<? extends Object>) this.t);
            d dVar = (d) D;
            if (dVar == null) {
                a(this, null, null, 2, null);
                return;
            }
            this.k.d(Boolean.TRUE);
            C8737dwr.c(this.n, null, null, new InterstitialCoordinator$handleEffect$14(this, dVar, fe, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    @Override // o.FY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.Object r4, o.FJ r5) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r5, r0)
            if (r4 == 0) goto L11
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.h
            java.lang.String r1 = r5.e()
            r0.put(r1, r4)
            goto L1a
        L11:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.h
            java.lang.String r1 = r5.e()
            r0.remove(r1)
        L1a:
            java.util.Map<java.lang.String, java.util.List<o.drM<java.lang.Object, o.dpR>>> r0 = r3.g
            java.lang.String r1 = r5.e()
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L3c
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()
            o.drM r1 = (o.drM) r1
            r1.invoke(r4)
            goto L2c
        L3c:
            java.util.Map<java.lang.String, kotlin.Pair<o.drM<java.lang.Boolean, o.dpR>, java.util.List<o.FJ>>> r4 = r3.s
            java.lang.String r5 = r5.e()
            java.lang.Object r4 = r4.get(r5)
            kotlin.Pair r4 = (kotlin.Pair) r4
            if (r4 == 0) goto L8f
            java.lang.Object r5 = r4.b()
            o.drM r5 = (o.drM) r5
            java.lang.Object r4 = r4.c()
            java.util.List r4 = (java.util.List) r4
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L61
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L61
            goto L87
        L61:
            java.util.Iterator r4 = r4.iterator()
        L65:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r4.next()
            o.FJ r0 = (o.FJ) r0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.h
            java.lang.String r2 = r0.e()
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto L7e
            goto L85
        L7e:
            java.lang.String r0 = o.C0867Fq.d(r0, r1)
            if (r0 != 0) goto L85
            goto L65
        L85:
            r4 = 0
            goto L88
        L87:
            r4 = 1
        L88:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5.invoke(r4)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.ui.InterstitialCoordinator.a(java.lang.Object, o.FJ):void");
    }

    @Override // o.FY
    public void a(drM<? super String, dpR> drm, FJ fj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) fj, "");
        this.j.put(fj.e(), drm);
    }

    private final void a(FJ fj) {
        Object a2;
        if (this.h.containsKey(fj.e()) || (a2 = C0867Fq.a(fj)) == null) {
            return;
        }
        this.h.put(fj.e(), a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = o.C8576dqs.n(r0);
     */
    @Override // o.FY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(o.drM<java.lang.Object, o.dpR> r4, o.FJ r5) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r5, r0)
            java.util.Map<java.lang.String, java.util.List<o.drM<java.lang.Object, o.dpR>>> r0 = r3.g
            java.lang.String r1 = r5.e()
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L1c
            java.util.List r0 = o.C8570dqm.h(r0)
            if (r0 != 0) goto L21
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L21:
            r0.add(r4)
            java.util.Map<java.lang.String, java.util.List<o.drM<java.lang.Object, o.dpR>>> r1 = r3.g
            java.lang.String r2 = r5.e()
            r1.put(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.h
            java.lang.String r5 = r5.e()
            java.lang.Object r5 = r0.get(r5)
            if (r5 == 0) goto L3c
            r4.invoke(r5)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.ui.InterstitialCoordinator.d(o.drM, o.FJ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    @Override // o.FY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(o.drM<? super java.lang.Boolean, o.dpR> r7, o.FE r8) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.ui.InterstitialCoordinator.a(o.drM, o.FE):void");
    }
}
