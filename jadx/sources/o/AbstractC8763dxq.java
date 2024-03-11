package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.InterfaceC8748dxb;

/* renamed from: o.dxq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8763dxq extends AbstractC8762dxp implements InterfaceC8748dxb {
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(AbstractC8763dxq.class, Object.class, "_queue");
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(AbstractC8763dxq.class, Object.class, "_delayed");
    private static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(AbstractC8763dxq.class, "_isCompleted");

    public InterfaceC8760dxn e(long j, Runnable runnable, dqZ dqz) {
        return InterfaceC8748dxb.b.c(this, j, runnable, dqz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l() {
        return a.get(this) != 0;
    }

    private final void e(boolean z) {
        a.set(this, z ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC8765dxs
    public boolean e() {
        dAH dah;
        if (g()) {
            b bVar = (b) e.get(this);
            if (bVar == null || bVar.e()) {
                Object obj = c.get(this);
                if (obj != null) {
                    if (obj instanceof C7662dAs) {
                        return ((C7662dAs) obj).e();
                    }
                    dah = C8761dxo.c;
                    if (obj != dah) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC8765dxs
    protected long c() {
        e a2;
        long e2;
        dAH dah;
        if (super.c() == 0) {
            return 0L;
        }
        Object obj = c.get(this);
        if (obj != null) {
            if (!(obj instanceof C7662dAs)) {
                dah = C8761dxo.c;
                return obj == dah ? Long.MAX_VALUE : 0L;
            } else if (!((C7662dAs) obj).e()) {
                return 0L;
            }
        }
        b bVar = (b) e.get(this);
        if (bVar == null || (a2 = bVar.a()) == null) {
            return Long.MAX_VALUE;
        }
        long j = a2.c;
        AbstractC8727dwh b2 = C8735dwp.b();
        e2 = C8657dts.e(j - (b2 != null ? b2.d() : System.nanoTime()), 0L);
        return e2;
    }

    @Override // o.AbstractC8765dxs
    public void a() {
        C8776dyc.a.e();
        e(true);
        m();
        do {
        } while (j() <= 0);
        k();
    }

    @Override // o.InterfaceC8748dxb
    public void b(long j, InterfaceC8743dwx<? super dpR> interfaceC8743dwx) {
        long c2 = C8761dxo.c(j);
        if (c2 < 4611686018427387903L) {
            AbstractC8727dwh b2 = C8735dwp.b();
            long d2 = b2 != null ? b2.d() : System.nanoTime();
            a aVar = new a(c2 + d2, interfaceC8743dwx);
            a(d2, aVar);
            dwB.d(interfaceC8743dwx, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InterfaceC8760dxn d(long j, Runnable runnable) {
        long c2 = C8761dxo.c(j);
        if (c2 < 4611686018427387903L) {
            AbstractC8727dwh b2 = C8735dwp.b();
            long d2 = b2 != null ? b2.d() : System.nanoTime();
            d dVar = new d(c2 + d2, runnable);
            a(d2, dVar);
            return dVar;
        }
        return dxR.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    @Override // o.AbstractC8765dxs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long j() {
        /*
            r8 = this;
            boolean r0 = r8.i()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o.AbstractC8763dxq.e
            java.lang.Object r0 = r0.get(r8)
            o.dxq$b r0 = (o.AbstractC8763dxq.b) r0
            if (r0 == 0) goto L4f
            boolean r3 = r0.e()
            if (r3 != 0) goto L4f
            o.dwh r3 = o.C8735dwp.b()
            if (r3 == 0) goto L24
            long r3 = r3.d()
            goto L28
        L24:
            long r3 = java.lang.System.nanoTime()
        L28:
            monitor-enter(r0)
            o.dAR r5 = r0.d()     // Catch: java.lang.Throwable -> L4c
            r6 = 0
            if (r5 != 0) goto L32
            monitor-exit(r0)
            goto L47
        L32:
            o.dxq$e r5 = (o.AbstractC8763dxq.e) r5     // Catch: java.lang.Throwable -> L4c
            boolean r7 = r5.e(r3)     // Catch: java.lang.Throwable -> L4c
            if (r7 == 0) goto L46
            boolean r5 = r8.e(r5)     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L46
            r5 = 0
            o.dAR r5 = r0.e(r5)     // Catch: java.lang.Throwable -> L4c
            r6 = r5
        L46:
            monitor-exit(r0)
        L47:
            o.dxq$e r6 = (o.AbstractC8763dxq.e) r6
            if (r6 != 0) goto L28
            goto L4f
        L4c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L4f:
            java.lang.Runnable r0 = r8.o()
            if (r0 == 0) goto L59
            r0.run()
            return r1
        L59:
            long r0 = r8.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC8763dxq.j():long");
    }

    @Override // o.dwQ
    public final void dispatch(dqZ dqz, Runnable runnable) {
        b(runnable);
    }

    public void b(Runnable runnable) {
        if (e(runnable)) {
            n();
        } else {
            dwV.b.b(runnable);
        }
    }

    private final boolean e(Runnable runnable) {
        dAH dah;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (l()) {
                return false;
            }
            if (obj == null) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(c, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C7662dAs) {
                C8632dsu.d(obj);
                C7662dAs c7662dAs = (C7662dAs) obj;
                int a2 = c7662dAs.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(c, this, obj, c7662dAs.a());
                } else if (a2 == 2) {
                    return false;
                }
            } else {
                dah = C8761dxo.c;
                if (obj == dah) {
                    return false;
                }
                C7662dAs c7662dAs2 = new C7662dAs(8, true);
                C8632dsu.d(obj);
                c7662dAs2.a((Runnable) obj);
                c7662dAs2.a(runnable);
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(c, this, obj, c7662dAs2)) {
                    return true;
                }
            }
        }
    }

    private final Runnable o() {
        dAH dah;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C7662dAs) {
                C8632dsu.d(obj);
                C7662dAs c7662dAs = (C7662dAs) obj;
                Object c2 = c7662dAs.c();
                if (c2 != C7662dAs.a) {
                    return (Runnable) c2;
                }
                AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(c, this, obj, c7662dAs.a());
            } else {
                dah = C8761dxo.c;
                if (obj == dah) {
                    return null;
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(c, this, obj, null)) {
                    C8632dsu.d(obj);
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void m() {
        dAH dah;
        dAH dah2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = c;
                dah = C8761dxo.c;
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, null, dah)) {
                    return;
                }
            } else if (obj instanceof C7662dAs) {
                ((C7662dAs) obj).b();
                return;
            } else {
                dah2 = C8761dxo.c;
                if (obj == dah2) {
                    return;
                }
                C7662dAs c7662dAs = new C7662dAs(8, true);
                C8632dsu.d(obj);
                c7662dAs.a((Runnable) obj);
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(c, this, obj, c7662dAs)) {
                    return;
                }
            }
        }
    }

    public final void a(long j, e eVar) {
        int c2 = c(j, eVar);
        if (c2 == 0) {
            if (e(eVar)) {
                n();
            }
        } else if (c2 == 1) {
            e(j, eVar);
        } else if (c2 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    private final boolean e(e eVar) {
        b bVar = (b) e.get(this);
        return (bVar != null ? bVar.a() : null) == eVar;
    }

    private final int c(long j, e eVar) {
        if (l()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        b bVar = (b) atomicReferenceFieldUpdater.get(this);
        if (bVar == null) {
            AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, null, new b(j));
            Object obj = atomicReferenceFieldUpdater.get(this);
            C8632dsu.d(obj);
            bVar = (b) obj;
        }
        return eVar.a(j, bVar, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        c.set(this, null);
        e.set(this, null);
    }

    private final void k() {
        e c2;
        AbstractC8727dwh b2 = C8735dwp.b();
        long d2 = b2 != null ? b2.d() : System.nanoTime();
        while (true) {
            b bVar = (b) e.get(this);
            if (bVar == null || (c2 = bVar.c()) == null) {
                return;
            }
            e(d2, c2);
        }
    }

    /* renamed from: o.dxq$e */
    /* loaded from: classes5.dex */
    public static abstract class e implements Runnable, Comparable<e>, InterfaceC8760dxn, dAR {
        private volatile Object _heap;
        private int a = -1;
        public long c;

        @Override // o.dAR
        public int c() {
            return this.a;
        }

        @Override // o.dAR
        public void d(int i) {
            this.a = i;
        }

        public final boolean e(long j) {
            return j - this.c >= 0;
        }

        public e(long j) {
            this.c = j;
        }

        @Override // o.dAR
        public dAP<?> d() {
            Object obj = this._heap;
            if (obj instanceof dAP) {
                return (dAP) obj;
            }
            return null;
        }

        @Override // o.dAR
        public void a(dAP<?> dap) {
            dAH dah;
            Object obj = this._heap;
            dah = C8761dxo.a;
            if (obj == dah) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = dap;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(e eVar) {
            int i = ((this.c - eVar.c) > 0L ? 1 : ((this.c - eVar.c) == 0L ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.c + ']';
        }

        public final int a(long j, b bVar, AbstractC8763dxq abstractC8763dxq) {
            dAH dah;
            synchronized (this) {
                Object obj = this._heap;
                dah = C8761dxo.a;
                if (obj == dah) {
                    return 2;
                }
                synchronized (bVar) {
                    e d = bVar.d();
                    if (abstractC8763dxq.l()) {
                        return 1;
                    }
                    if (d == null) {
                        bVar.a = j;
                    } else {
                        long j2 = d.c;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - bVar.a > 0) {
                            bVar.a = j;
                        }
                    }
                    long j3 = this.c;
                    long j4 = bVar.a;
                    if (j3 - j4 < 0) {
                        this.c = j4;
                    }
                    bVar.a((b) this);
                    return 0;
                }
            }
        }

        @Override // o.InterfaceC8760dxn
        public final void co_() {
            dAH dah;
            dAH dah2;
            synchronized (this) {
                Object obj = this._heap;
                dah = C8761dxo.a;
                if (obj == dah) {
                    return;
                }
                b bVar = obj instanceof b ? (b) obj : null;
                if (bVar != null) {
                    bVar.c((b) this);
                }
                dah2 = C8761dxo.a;
                this._heap = dah2;
                dpR dpr = dpR.c;
            }
        }
    }

    /* renamed from: o.dxq$a */
    /* loaded from: classes5.dex */
    final class a extends e {
        private final InterfaceC8743dwx<dpR> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j, InterfaceC8743dwx<? super dpR> interfaceC8743dwx) {
            super(j);
            this.d = interfaceC8743dwx;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d.e(AbstractC8763dxq.this, dpR.c);
        }

        @Override // o.AbstractC8763dxq.e
        public String toString() {
            return super.toString() + this.d;
        }
    }

    /* renamed from: o.dxq$d */
    /* loaded from: classes5.dex */
    static final class d extends e {
        private final Runnable a;

        public d(long j, Runnable runnable) {
            super(j);
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.run();
        }

        @Override // o.AbstractC8763dxq.e
        public String toString() {
            return super.toString() + this.a;
        }
    }

    /* renamed from: o.dxq$b */
    /* loaded from: classes5.dex */
    public static final class b extends dAP<e> {
        public long a;

        public b(long j) {
            this.a = j;
        }
    }
}
