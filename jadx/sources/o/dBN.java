package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.sync.SemaphoreImpl$addAcquireToQueue$createNewSegment$1;
import kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1;
import o.dBN;
import o.dpR;

/* loaded from: classes5.dex */
public class dBN implements dBM {
    private volatile int _availablePermits;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private final drM<Throwable, dpR> g;
    private volatile Object head;
    private final int i;
    private volatile Object tail;
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(dBN.class, Object.class, "head");
    private static final AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(dBN.class, "deqIdx");
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(dBN.class, Object.class, "tail");
    private static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(dBN.class, "enqIdx");
    private static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(dBN.class, "_availablePermits");

    @Override // o.dBM
    public Object e(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return a(this, interfaceC8585dra);
    }

    public dBN(int i, int i2) {
        this.i = i;
        if (i <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
        } else if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        } else {
            dBS dbs = new dBS(0L, null, 2);
            this.head = dbs;
            this.tail = dbs;
            this._availablePermits = i - i2;
            this.g = new drM<Throwable, dpR>() { // from class: kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
                {
                    super(1);
                }

                public final void d(Throwable th) {
                    dBN.this.a();
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    d(th);
                    return dpR.c;
                }
            };
        }
    }

    public int b() {
        return Math.max(a.get(this), 0);
    }

    public boolean d() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i > this.i) {
                e();
            } else if (i <= 0) {
                return false;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    static /* synthetic */ Object a(dBN dbn, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e2;
        if (dbn.c() > 0) {
            return dpR.c;
        }
        Object c2 = dbn.c(interfaceC8585dra);
        e2 = C8586drb.e();
        return c2 == e2 ? c2 : dpR.c;
    }

    private final int c() {
        int andDecrement;
        do {
            andDecrement = a.getAndDecrement(this);
        } while (andDecrement > this.i);
        return andDecrement;
    }

    @Override // o.dBM
    public void a() {
        do {
            int andIncrement = a.getAndIncrement(this);
            if (andIncrement >= this.i) {
                e();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.i).toString());
            } else if (andIncrement >= 0) {
                return;
            }
        } while (!h());
    }

    private final void e() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        int i2;
        do {
            atomicIntegerFieldUpdater = a;
            i = atomicIntegerFieldUpdater.get(this);
            i2 = this.i;
            if (i <= i2) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(InterfaceC8783dyj interfaceC8783dyj) {
        int i;
        Object b2;
        int i2;
        dAH dah;
        dAH dah2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        dBS dbs = (dBS) atomicReferenceFieldUpdater.get(this);
        long andIncrement = b.getAndIncrement(this);
        SemaphoreImpl$addAcquireToQueue$createNewSegment$1 semaphoreImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreImpl$addAcquireToQueue$createNewSegment$1.e;
        i = dBR.b;
        long j = andIncrement / i;
        loop0: while (true) {
            b2 = C7650dAg.b(dbs, j, semaphoreImpl$addAcquireToQueue$createNewSegment$1);
            if (!dAG.a(b2)) {
                dAC c2 = dAG.c(b2);
                while (true) {
                    dAC dac = (dAC) atomicReferenceFieldUpdater.get(this);
                    if (dac.b >= c2.b) {
                        break loop0;
                    } else if (!c2.l()) {
                        break;
                    } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, dac, c2)) {
                        if (dac.f()) {
                            dac.h();
                        }
                    } else if (c2.f()) {
                        c2.h();
                    }
                }
            } else {
                break;
            }
        }
        dBS dbs2 = (dBS) dAG.c(b2);
        i2 = dBR.b;
        int i3 = (int) (andIncrement % i2);
        if (Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(dbs2.a(), i3, null, interfaceC8783dyj)) {
            interfaceC8783dyj.c(dbs2, i3);
            return true;
        }
        dah = dBR.d;
        dah2 = dBR.g;
        if (Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(dbs2.a(), i3, dah, dah2)) {
            if (interfaceC8783dyj instanceof InterfaceC8743dwx) {
                C8632dsu.d(interfaceC8783dyj);
                ((InterfaceC8743dwx) interfaceC8783dyj).a(dpR.c, this.g);
            } else if (interfaceC8783dyj instanceof dBH) {
                ((dBH) interfaceC8783dyj).b(dpR.c);
            } else {
                throw new IllegalStateException(("unexpected: " + interfaceC8783dyj).toString());
            }
            return true;
        }
        return false;
    }

    private final boolean h() {
        int i;
        Object b2;
        int i2;
        dAH dah;
        dAH dah2;
        int i3;
        dAH dah3;
        dAH dah4;
        dAH dah5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        dBS dbs = (dBS) atomicReferenceFieldUpdater.get(this);
        long andIncrement = c.getAndIncrement(this);
        i = dBR.b;
        long j = andIncrement / i;
        SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.d;
        loop0: while (true) {
            b2 = C7650dAg.b(dbs, j, semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (dAG.a(b2)) {
                break;
            }
            dAC c2 = dAG.c(b2);
            while (true) {
                dAC dac = (dAC) atomicReferenceFieldUpdater.get(this);
                if (dac.b >= c2.b) {
                    break loop0;
                } else if (!c2.l()) {
                    break;
                } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, dac, c2)) {
                    if (dac.f()) {
                        dac.h();
                    }
                } else if (c2.f()) {
                    c2.h();
                }
            }
        }
        dBS dbs2 = (dBS) dAG.c(b2);
        dbs2.c();
        int i4 = (dbs2.b > j ? 1 : (dbs2.b == j ? 0 : -1));
        if (i4 > 0) {
            return false;
        }
        i2 = dBR.b;
        int i5 = (int) (andIncrement % i2);
        dah = dBR.d;
        Object andSet = dbs2.a().getAndSet(i5, dah);
        if (andSet == null) {
            i3 = dBR.a;
            for (int i6 = 0; i6 < i3; i6++) {
                Object obj = dbs2.a().get(i5);
                dah5 = dBR.g;
                if (obj == dah5) {
                    return true;
                }
            }
            dah3 = dBR.d;
            dah4 = dBR.c;
            return !Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(dbs2.a(), i5, dah3, dah4);
        }
        dah2 = dBR.e;
        if (andSet == dah2) {
            return false;
        }
        return d(andSet);
    }

    private final boolean d(Object obj) {
        if (obj instanceof InterfaceC8743dwx) {
            C8632dsu.d(obj);
            InterfaceC8743dwx interfaceC8743dwx = (InterfaceC8743dwx) obj;
            Object e2 = interfaceC8743dwx.e(dpR.c, null, this.g);
            if (e2 != null) {
                interfaceC8743dwx.b(e2);
                return true;
            }
            return false;
        } else if (obj instanceof dBH) {
            return ((dBH) obj).d(this, dpR.c);
        } else {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
    }

    private final Object c(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        InterfaceC8585dra b2;
        Object e2;
        Object e3;
        b2 = C8590drf.b(interfaceC8585dra);
        C8741dwv b3 = dwB.b(b2);
        try {
            if (!e((InterfaceC8783dyj) b3)) {
                e((InterfaceC8743dwx<? super dpR>) b3);
            }
            Object b4 = b3.b();
            e2 = C8586drb.e();
            if (b4 == e2) {
                C8592drh.c(interfaceC8585dra);
            }
            e3 = C8586drb.e();
            return b4 == e3 ? b4 : dpR.c;
        } catch (Throwable th) {
            b3.j();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(InterfaceC8743dwx<? super dpR> interfaceC8743dwx) {
        while (c() <= 0) {
            C8632dsu.d(interfaceC8743dwx);
            if (e((InterfaceC8783dyj) interfaceC8743dwx)) {
                return;
            }
        }
        interfaceC8743dwx.a(dpR.c, this.g);
    }
}
