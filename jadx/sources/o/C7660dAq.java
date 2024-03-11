package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: o.dAq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7660dAq extends dwQ implements InterfaceC8748dxb {
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C7660dAq.class, "runningWorkers");
    private final dwQ a;
    private final /* synthetic */ InterfaceC8748dxb c;
    private final int e;
    private final Object g;
    private final C7665dAv<Runnable> j;
    private volatile int runningWorkers;

    @Override // o.InterfaceC8748dxb
    public void b(long j, InterfaceC8743dwx<? super dpR> interfaceC8743dwx) {
        this.c.b(j, interfaceC8743dwx);
    }

    @Override // o.InterfaceC8748dxb
    public InterfaceC8760dxn e(long j, Runnable runnable, dqZ dqz) {
        return this.c.e(j, runnable, dqz);
    }

    public C7660dAq(dwQ dwq, int i) {
        this.a = dwq;
        this.e = i;
        InterfaceC8748dxb interfaceC8748dxb = dwq instanceof InterfaceC8748dxb ? (InterfaceC8748dxb) dwq : null;
        this.c = interfaceC8748dxb == null ? dwX.a() : interfaceC8748dxb;
        this.j = new C7665dAv<>(false);
        this.g = new Object();
    }

    @Override // o.dwQ
    public dwQ limitedParallelism(int i) {
        C7661dAr.b(i);
        return i >= this.e ? this : super.limitedParallelism(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable c() {
        while (true) {
            Runnable d = this.j.d();
            if (d != null) {
                return d;
            }
            synchronized (this.g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.j.a() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* renamed from: o.dAq$e */
    /* loaded from: classes5.dex */
    final class e implements Runnable {
        private Runnable d;

        public e(Runnable runnable) {
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.d.run();
                } catch (Throwable th) {
                    dwS.a(EmptyCoroutineContext.e, th);
                }
                Runnable c = C7660dAq.this.c();
                if (c == null) {
                    return;
                }
                this.d = c;
                i++;
                if (i >= 16 && C7660dAq.this.a.isDispatchNeeded(C7660dAq.this)) {
                    C7660dAq.this.a.dispatch(C7660dAq.this, this);
                    return;
                }
            }
        }
    }

    @Override // o.dwQ
    public void dispatch(dqZ dqz, Runnable runnable) {
        Runnable c;
        this.j.e(runnable);
        if (b.get(this) >= this.e || !b() || (c = c()) == null) {
            return;
        }
        this.a.dispatch(this, new e(c));
    }

    @Override // o.dwQ
    public void dispatchYield(dqZ dqz, Runnable runnable) {
        Runnable c;
        this.j.e(runnable);
        if (b.get(this) >= this.e || !b() || (c = c()) == null) {
            return;
        }
        this.a.dispatchYield(this, new e(c));
    }

    private final boolean b() {
        synchronized (this.g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
            if (atomicIntegerFieldUpdater.get(this) >= this.e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
