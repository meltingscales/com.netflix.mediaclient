package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.ui.epoxymodels.api.tracking.VideoAutoPlay$autoPlayDelayed$1;
import com.netflix.mediaclient.ui.epoxymodels.api.tracking.VideoAutoPlay$requestPlay$1;
import com.netflix.mediaclient.ui.epoxymodels.api.tracking.VideoAutoPlay$visibleItemsHeap$1;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import o.AbstractC3828bMd;
import o.C8632dsu;
import o.drO;
import o.dxD;

/* renamed from: o.bMd */
/* loaded from: classes4.dex */
public abstract class AbstractC3828bMd implements dwU {
    public static final b d = new b(null);
    public static final int e = 8;
    private final dwU a;
    private c b;
    private final dxN c;
    private final Map<Long, c> f;
    private boolean g;
    private dxD h;
    private BehaviorSubject<Integer> i;
    private final long j;
    private final drM<bLR<?>, dpR> k;
    private final drO<Boolean> l;
    private final PriorityQueue<c> m;
    private final drM<bLR<?>, dpR> n;

    /* renamed from: o */
    private final LifecycleOwner f13521o;

    @Override // o.dwU
    /* renamed from: b */
    public dxN getCoroutineContext() {
        return this.c;
    }

    public abstract void d(boolean z);

    public final c f() {
        return this.b;
    }

    public final Map<Long, c> h() {
        return this.f;
    }

    public final Observable<Integer> i() {
        return this.i;
    }

    public final PriorityQueue<c> j() {
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3828bMd(dwU dwu, LifecycleOwner lifecycleOwner, long j, drM<? super bLR<?>, dpR> drm, drM<? super bLR<?>, dpR> drm2, drO<Boolean> dro) {
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drm2, "");
        C8632dsu.c((Object) dro, "");
        this.a = dwu;
        this.f13521o = lifecycleOwner;
        this.j = j;
        this.n = drm;
        this.k = drm2;
        this.l = dro;
        BehaviorSubject<Integer> createDefault = BehaviorSubject.createDefault(-1);
        C8632dsu.a(createDefault, "");
        this.i = createDefault;
        this.f = new LinkedHashMap();
        final VideoAutoPlay$visibleItemsHeap$1 videoAutoPlay$visibleItemsHeap$1 = new drX<c, c, Integer>() { // from class: com.netflix.mediaclient.ui.epoxymodels.api.tracking.VideoAutoPlay$visibleItemsHeap$1
            @Override // o.drX
            /* renamed from: e */
            public final Integer invoke(AbstractC3828bMd.c cVar, AbstractC3828bMd.c cVar2) {
                return Integer.valueOf(cVar.d().e() - cVar2.d().e());
            }
        };
        this.m = new PriorityQueue<>(5, new Comparator() { // from class: o.bMh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c2;
                c2 = AbstractC3828bMd.c(drX.this, obj, obj2);
                return c2;
            }
        });
        this.c = GF.e();
    }

    /* renamed from: o.bMd$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("VideoAutoPlay");
        }
    }

    protected final void e(c cVar) {
        bLR<AbstractC3179au> d2;
        Integer d3;
        this.b = cVar;
        this.i.onNext(Integer.valueOf((cVar == null || (d2 = cVar.d()) == null || (d3 = d2.d()) == null) ? -1 : d3.intValue()));
    }

    /* renamed from: o.bMd$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private final AbstractC3179au b;
        private final bLR<AbstractC3179au> c;

        public final bLR<AbstractC3179au> d() {
            return this.c;
        }

        public final AbstractC3179au e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c(this.c, cVar.c) && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            bLR<AbstractC3179au> blr = this.c;
            AbstractC3179au abstractC3179au = this.b;
            return "Item(model=" + blr + ", holder=" + abstractC3179au + ")";
        }

        public c(bLR<AbstractC3179au> blr, AbstractC3179au abstractC3179au) {
            C8632dsu.c((Object) blr, "");
            C8632dsu.c((Object) abstractC3179au, "");
            this.c = blr;
            this.b = abstractC3179au;
        }
    }

    public static final int c(drX drx, Object obj, Object obj2) {
        C8632dsu.c((Object) drx, "");
        return ((Number) drx.invoke(obj, obj2)).intValue();
    }

    public final void g() {
        this.f13521o.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.epoxymodels.api.tracking.VideoAutoPlay$initLifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(LifecycleOwner lifecycleOwner) {
                drO dro;
                C8632dsu.c((Object) lifecycleOwner, "");
                super.onStart(lifecycleOwner);
                AbstractC3828bMd abstractC3828bMd = AbstractC3828bMd.this;
                dro = abstractC3828bMd.l;
                abstractC3828bMd.c(!((Boolean) dro.invoke()).booleanValue());
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(LifecycleOwner lifecycleOwner) {
                C8632dsu.c((Object) lifecycleOwner, "");
                super.onStop(lifecycleOwner);
                AbstractC3828bMd.this.c(false);
            }
        });
    }

    public final void e(boolean z) {
        c(!z);
    }

    public final void c(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        d(z);
        c cVar = this.b;
        if (cVar != null) {
            if (!z) {
                a(cVar, true);
            } else {
                a(cVar.d(), this.j, cVar.e());
            }
        }
    }

    public final void d() {
        dxD c2;
        dxD dxd = this.h;
        if (dxd != null) {
            dxD.b.b(dxd, null, 1, null);
        }
        c2 = C8737dwr.c(this.a, null, null, new VideoAutoPlay$autoPlayDelayed$1(this, null), 3, null);
        this.h = c2;
    }

    public final void e() {
        c peek = this.m.peek();
        if (peek != null) {
            a(peek.d(), this.j, peek.e());
        }
    }

    public final void a(bLR<AbstractC3179au> blr, long j, AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) blr, "");
        C8632dsu.c((Object) abstractC3179au, "");
        if (this.j > 0) {
            C8737dwr.c(this.a, null, null, new VideoAutoPlay$requestPlay$1(j, this, blr, abstractC3179au, null), 3, null);
        } else {
            d(blr, abstractC3179au);
        }
    }

    public static /* synthetic */ void b(AbstractC3828bMd abstractC3828bMd, AbstractC3179au abstractC3179au, bLR blr, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestPause");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        abstractC3828bMd.b(abstractC3179au, blr, z);
    }

    protected final void b(AbstractC3179au abstractC3179au, bLR<AbstractC3179au> blr, boolean z) {
        C8632dsu.c((Object) abstractC3179au, "");
        C8632dsu.c((Object) blr, "");
        d.getLogTag();
        blr.d(abstractC3179au, z);
        this.k.invoke(blr);
    }

    private final void a(c cVar, boolean z) {
        d.getLogTag();
        b(cVar.e(), cVar.d(), z);
    }

    public final void d(bLR<AbstractC3179au> blr, AbstractC3179au abstractC3179au) {
        d.getLogTag();
        if (this.g) {
            blr.c(abstractC3179au);
            this.n.invoke(blr);
            e(new c(blr, abstractC3179au));
        }
    }
}
