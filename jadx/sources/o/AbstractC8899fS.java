package o;

import androidx.lifecycle.LifecycleOwner;
import com.airbnb.mvrx.MavericksBlockExecutions;
import com.airbnb.mvrx.MavericksViewModel$1;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.AbstractC8886fF;
import o.C8632dsu;
import o.InterfaceC8888fH;

/* renamed from: o.fS */
/* loaded from: classes2.dex */
public abstract class AbstractC8899fS<S extends InterfaceC8888fH> {
    private final AbstractC8899fS<S>.e a;
    private final Set<String> b;
    private final AbstractC8901fU<S> c;
    private final ConcurrentHashMap<String, Object> d;
    private final C8900fT e;
    private final dwU f;

    public final AbstractC8901fU<S> c() {
        return this.c;
    }

    public final dwU e() {
        return this.f;
    }

    public AbstractC8899fS(S s, C8900fT c8900fT) {
        C8632dsu.c((Object) s, "");
        C8632dsu.c((Object) c8900fT, "");
        this.e = C8930fx.c.c();
        AbstractC8901fU<S> e2 = c8900fT.e(this, s);
        this.c = e2;
        dwU e3 = e2.e();
        this.f = e3;
        this.a = new e();
        this.d = new ConcurrentHashMap<>();
        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
        if (e2.c()) {
            C8737dwr.c(e3, C8752dxf.b(), null, new MavericksViewModel$1(this, s, null), 2, null);
        }
    }

    public /* synthetic */ AbstractC8899fS(InterfaceC8888fH interfaceC8888fH, C8900fT c8900fT, int i, C8627dsp c8627dsp) {
        this(interfaceC8888fH, (i & 2) != 0 ? C8930fx.c.c() : c8900fT);
    }

    public final S b() {
        return (S) this.a.a();
    }

    public final dyS<S> a() {
        return (dyS<S>) this.a.e();
    }

    public void d() {
        dwY.d(this.f, null, 1, null);
    }

    public final void b(S s) {
        C8970gk.d(C8970gk.b(b(), true), s, true);
    }

    public final void b(drM<? super S, ? extends S> drm) {
        C8632dsu.c((Object) drm, "");
        this.a.c(drm);
    }

    public final Object b(InterfaceC8585dra<? super S> interfaceC8585dra) {
        return this.a.a(interfaceC8585dra);
    }

    public final void e(drM<? super S, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        this.a.a(drm);
    }

    public static /* synthetic */ dxD c(AbstractC8899fS abstractC8899fS, drM drm, dwQ dwq, dtE dte, drX drx, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                dwq = null;
            }
            if ((i & 2) != 0) {
                dte = null;
            }
            return abstractC8899fS.c(drm, dwq, dte, drx);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
    }

    protected <T> dxD c(drM<? super InterfaceC8585dra<? super T>, ? extends Object> drm, dwQ dwq, dtE<S, ? extends AbstractC8918fl<? extends T>> dte, drX<? super S, ? super AbstractC8918fl<? extends T>, ? extends S> drx) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drx, "");
        return this.a.a(drm, dwq, dte, drx);
    }

    public static /* synthetic */ dxD e(AbstractC8899fS abstractC8899fS, dyS dys, dwQ dwq, dtE dte, drX drx, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                dwq = null;
            }
            if ((i & 2) != 0) {
                dte = null;
            }
            return abstractC8899fS.a(dys, dwq, dte, drx);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
    }

    protected <T> dxD a(dyS<? extends T> dys, dwQ dwq, dtE<S, ? extends AbstractC8918fl<? extends T>> dte, drX<? super S, ? super AbstractC8918fl<? extends T>, ? extends S> drx) {
        C8632dsu.c((Object) dys, "");
        C8632dsu.c((Object) drx, "");
        return this.a.b(dys, dwq, dte, drx);
    }

    public final <T> dxD c(dyS<? extends T> dys, LifecycleOwner lifecycleOwner, AbstractC8928fv abstractC8928fv, drX<? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        C8632dsu.c((Object) dys, "");
        C8632dsu.c((Object) abstractC8928fv, "");
        C8632dsu.c((Object) drx, "");
        if (lifecycleOwner != null) {
            ConcurrentHashMap<String, Object> concurrentHashMap = this.d;
            Set<String> set = this.b;
            C8632dsu.a(set, "");
            return C8929fw.d(dys, lifecycleOwner, concurrentHashMap, set, abstractC8928fv, drx);
        }
        return this.a.d(dys, drx);
    }

    public String toString() {
        return getClass().getName() + ' ' + b();
    }

    /* renamed from: o.fS$e */
    /* loaded from: classes2.dex */
    public final class e extends AbstractC8886fF<S> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(new C8892fL(r8.c().c(), r8.c().d(), r8.c().e(), r8.c().b(), new drM<AbstractC8886fF<S>, MavericksBlockExecutions>() { // from class: com.airbnb.mvrx.MavericksViewModel$Repository$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: b */
                public final MavericksBlockExecutions invoke(AbstractC8886fF<S> abstractC8886fF) {
                    C8632dsu.c((Object) abstractC8886fF, "");
                    return r1.c().e(r1);
                }
            }));
            AbstractC8899fS.this = r8;
        }

        public final void c(drM<? super S, ? extends S> drm) {
            C8632dsu.c((Object) drm, "");
            d(drm);
        }

        public final void a(drM<? super S, dpR> drm) {
            C8632dsu.c((Object) drm, "");
            e(drm);
        }

        public final <T> dxD a(drM<? super InterfaceC8585dra<? super T>, ? extends Object> drm, dwQ dwq, dtE<S, ? extends AbstractC8918fl<? extends T>> dte, drX<? super S, ? super AbstractC8918fl<? extends T>, ? extends S> drx) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c((Object) drx, "");
            return d(drm, dwq, dte, drx);
        }

        public final <T> dxD b(dyS<? extends T> dys, dwQ dwq, dtE<S, ? extends AbstractC8918fl<? extends T>> dte, drX<? super S, ? super AbstractC8918fl<? extends T>, ? extends S> drx) {
            C8632dsu.c((Object) dys, "");
            C8632dsu.c((Object) drx, "");
            return e(dys, dwq, dte, drx);
        }
    }
}
