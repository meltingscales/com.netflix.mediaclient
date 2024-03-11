package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.epoxymodels.api.tracking.EpoxyPresentationTracking$reportPresented$1;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import o.AbstractC3179au;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC3825bMa;
import o.bLU;
import o.dpR;

/* loaded from: classes4.dex */
public final class bLU {
    public static final e c = new e(null);
    public static final int e = 8;
    private final dwU a;
    private final long b;
    private final Map<Long, Long> d;
    private final InterfaceC8612dsa<InterfaceC3825bMa, Long, AbstractC3179au, dpR> f;
    private final Map<Long, Pair<InterfaceC3825bMa, AbstractC3179au>> g;
    private final drX<InterfaceC3825bMa, AbstractC3179au, Long> h;
    private boolean i;
    private final C1619aI j;
    private final int k;
    private final drX<InterfaceC3825bMa, AbstractC3179au, dpR> m;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public bLU(dwU dwu, C1619aI c1619aI, LifecycleOwner lifecycleOwner, drX<? super InterfaceC3825bMa, ? super AbstractC3179au, dpR> drx, long j, int i, drX<? super InterfaceC3825bMa, ? super AbstractC3179au, Long> drx2, InterfaceC8612dsa<? super InterfaceC3825bMa, ? super Long, ? super AbstractC3179au, dpR> interfaceC8612dsa) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) c1619aI, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) drx2, "");
        C8632dsu.c((Object) interfaceC8612dsa, "");
        this.a = dwu;
        this.j = c1619aI;
        this.m = drx;
        this.b = j;
        this.k = i;
        this.h = drx2;
        this.f = interfaceC8612dsa;
        this.g = new LinkedHashMap();
        this.d = new LinkedHashMap();
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.epoxymodels.api.tracking.EpoxyPresentationTracking$3
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(LifecycleOwner lifecycleOwner2) {
                C8632dsu.c((Object) lifecycleOwner2, "");
                super.onStart(lifecycleOwner2);
                bLU.this.a(true);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(LifecycleOwner lifecycleOwner2) {
                C8632dsu.c((Object) lifecycleOwner2, "");
                super.onStop(lifecycleOwner2);
                bLU.this.a(false);
            }
        });
        if (1 <= i && i < 101) {
            c1619aI.b(Integer.valueOf(i));
            return;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd("Invalid visibility ratio, must be greater than 0 and less or equals to 100: " + i, null, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b = c1596aHd.b();
            if (b != null) {
                c1596aHd.a(errorType.c() + " " + b);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
        c1619aI.b((Integer) 50);
    }

    public /* synthetic */ bLU(dwU dwu, C1619aI c1619aI, LifecycleOwner lifecycleOwner, drX drx, long j, int i, drX drx2, InterfaceC8612dsa interfaceC8612dsa, int i2, C8627dsp c8627dsp) {
        this(dwu, c1619aI, lifecycleOwner, drx, (i2 & 16) != 0 ? 500L : j, (i2 & 32) != 0 ? 50 : i, (i2 & 64) != 0 ? new drX() { // from class: com.netflix.mediaclient.ui.epoxymodels.api.tracking.EpoxyPresentationTracking$1
            @Override // o.drX
            /* renamed from: b */
            public final Void invoke(InterfaceC3825bMa interfaceC3825bMa, AbstractC3179au abstractC3179au) {
                C8632dsu.c((Object) interfaceC3825bMa, "");
                C8632dsu.c((Object) abstractC3179au, "");
                return null;
            }
        } : drx2, (i2 & 128) != 0 ? new InterfaceC8612dsa<InterfaceC3825bMa, Long, AbstractC3179au, dpR>() { // from class: com.netflix.mediaclient.ui.epoxymodels.api.tracking.EpoxyPresentationTracking$2
            public final void e(InterfaceC3825bMa interfaceC3825bMa, long j2, AbstractC3179au abstractC3179au) {
                C8632dsu.c((Object) interfaceC3825bMa, "");
                C8632dsu.c((Object) abstractC3179au, "");
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(InterfaceC3825bMa interfaceC3825bMa, Long l, AbstractC3179au abstractC3179au) {
                e(interfaceC3825bMa, l.longValue(), abstractC3179au);
                return dpR.c;
            }
        } : interfaceC8612dsa);
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("EpoxyPresentationTracking");
        }
    }

    public final void e(boolean z) {
        a(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        this.j.b();
        if (z) {
            for (Map.Entry<Long, Pair<InterfaceC3825bMa, AbstractC3179au>> entry : this.g.entrySet()) {
                Pair<InterfaceC3825bMa, AbstractC3179au> value = entry.getValue();
                InterfaceC3825bMa b = value.b();
                AbstractC3179au c2 = value.c();
                e(b, c2, this.b);
                e(b, c2);
            }
            return;
        }
        for (Map.Entry<Long, Pair<InterfaceC3825bMa, AbstractC3179au>> entry2 : this.g.entrySet()) {
            Pair<InterfaceC3825bMa, AbstractC3179au> value2 = entry2.getValue();
            e(value2.b(), value2.c());
        }
    }

    public final <T extends AbstractC3073as<V>, V extends AbstractC3179au> InterfaceC4732bk<T, V> c() {
        return new InterfaceC4732bk() { // from class: o.bLV
            @Override // o.InterfaceC4732bk
            public final void b(AbstractC3073as abstractC3073as, Object obj, int i) {
                bLU.c(bLU.this, abstractC3073as, (AbstractC3179au) obj, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(bLU blu, AbstractC3073as abstractC3073as, AbstractC3179au abstractC3179au, int i) {
        C8632dsu.c((Object) blu, "");
        if (abstractC3073as instanceof InterfaceC3825bMa) {
            if (i == 5) {
                Map<Long, Pair<InterfaceC3825bMa, AbstractC3179au>> map = blu.g;
                long b = abstractC3073as.b();
                C8632dsu.d(abstractC3179au);
                map.put(Long.valueOf(b), new Pair<>(abstractC3073as, abstractC3179au));
                blu.e((InterfaceC3825bMa) abstractC3073as, abstractC3179au, blu.b);
            } else if (i == 6) {
                blu.g.remove(Long.valueOf(abstractC3073as.b()));
            }
            C8632dsu.d(abstractC3179au);
            blu.e((InterfaceC3825bMa) abstractC3073as, abstractC3179au);
        }
    }

    private final void e(InterfaceC3825bMa interfaceC3825bMa, AbstractC3179au abstractC3179au, long j) {
        if (this.b > 0) {
            C8737dwr.c(this.a, null, null, new EpoxyPresentationTracking$reportPresented$1(j, this, interfaceC3825bMa, abstractC3179au, null), 3, null);
        } else {
            a(interfaceC3825bMa, abstractC3179au);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InterfaceC3825bMa interfaceC3825bMa, AbstractC3179au abstractC3179au) {
        if (b(interfaceC3825bMa)) {
            this.m.invoke(interfaceC3825bMa, abstractC3179au);
        }
    }

    private final void e(InterfaceC3825bMa interfaceC3825bMa, AbstractC3179au abstractC3179au) {
        Long invoke;
        if (b(interfaceC3825bMa)) {
            if (this.d.get(Long.valueOf(interfaceC3825bMa.b())) != null || (invoke = this.h.invoke(interfaceC3825bMa, abstractC3179au)) == null) {
                return;
            }
            this.d.put(Long.valueOf(interfaceC3825bMa.b()), invoke);
            return;
        }
        Long remove = this.d.remove(Long.valueOf(interfaceC3825bMa.b()));
        if (remove != null) {
            this.f.invoke(interfaceC3825bMa, remove, abstractC3179au);
        }
    }

    private final boolean b(InterfaceC3825bMa interfaceC3825bMa) {
        return this.i && this.g.get(Long.valueOf(interfaceC3825bMa.b())) != null;
    }
}
