package o;

import com.airbnb.mvrx.CoroutinesStateStore$flushQueuesOnce$2$1;
import com.airbnb.mvrx.CoroutinesStateStore$flushQueuesOnce$2$2;
import com.airbnb.mvrx.CoroutinesStateStore$flushQueuesOnceBlocking$1;
import com.airbnb.mvrx.CoroutinesStateStore$setupTriggerFlushQueues$1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.channels.BufferOverflow;
import o.InterfaceC8888fH;

/* renamed from: o.fr  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8924fr<S extends InterfaceC8888fH> implements InterfaceC8896fP<S> {
    private static final AbstractC8766dxt b;
    public static final e e = new e(null);
    private final dwU a;
    private final dyS<S> c;
    private final dqZ d;
    private final InterfaceC8792dys<drM<S, dpR>> f;
    private final InterfaceC8792dys<drM<S, S>> h;
    private final InterfaceC8810dzj<S> i;
    private volatile S j;

    @Override // o.InterfaceC8896fP
    /* renamed from: a */
    public S b() {
        return this.j;
    }

    public void c(S s) {
        C8632dsu.c((Object) s, "");
        this.j = s;
    }

    @Override // o.InterfaceC8896fP
    public dyS<S> e() {
        return this.c;
    }

    public C8924fr(S s, dwU dwu, dqZ dqz) {
        C8632dsu.c((Object) s, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) dqz, "");
        this.a = dwu;
        this.d = dqz;
        this.h = C8799dyz.e(Integer.MAX_VALUE, null, null, 6, null);
        this.f = C8799dyz.e(Integer.MAX_VALUE, null, null, 6, null);
        InterfaceC8810dzj<S> d = C8820dzt.d(1, 63, BufferOverflow.SUSPEND);
        d.a(s);
        this.i = d;
        this.j = s;
        this.c = dyR.e((InterfaceC8810dzj) d);
        b(dwu);
    }

    private final void b(dwU dwu) {
        if (C8895fO.b) {
            return;
        }
        C8737dwr.c(dwu, b.plus(this.d), null, new CoroutinesStateStore$setupTriggerFlushQueues$1(this, null), 2, null);
    }

    private final void d() {
        if (dwY.b(this.a)) {
            C8740dwu.b(null, new CoroutinesStateStore$flushQueuesOnceBlocking$1(this, null), 1, null);
        }
    }

    @Override // o.InterfaceC8896fP
    public void e(drM<? super S, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        this.f.d((InterfaceC8792dys<drM<S, dpR>>) drm);
        if (C8895fO.b) {
            d();
        }
    }

    @Override // o.InterfaceC8896fP
    public void c(drM<? super S, ? extends S> drm) {
        C8632dsu.c((Object) drm, "");
        this.h.d((InterfaceC8792dys<drM<S, S>>) drm);
        if (C8895fO.b) {
            d();
        }
    }

    /* renamed from: o.fr$e */
    /* loaded from: classes5.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    static {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        C8632dsu.a(newCachedThreadPool, "");
        b = C8767dxu.d(newCachedThreadPool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e2;
        Object e3;
        C7692dBv c7692dBv = new C7692dBv(interfaceC8585dra);
        try {
            c7692dBv.a((dBB) this.h.f(), (drX) new CoroutinesStateStore$flushQueuesOnce$2$1(this, null));
            c7692dBv.a((dBB) this.f.f(), (drX) new CoroutinesStateStore$flushQueuesOnce$2$2(this, null));
        } catch (Throwable th) {
            c7692dBv.c(th);
        }
        Object e4 = c7692dBv.e();
        e2 = C8586drb.e();
        if (e4 == e2) {
            C8592drh.c(interfaceC8585dra);
        }
        e3 = C8586drb.e();
        return e4 == e3 ? e4 : dpR.c;
    }
}
