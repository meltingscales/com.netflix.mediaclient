package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref;

/* renamed from: o.dBx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7694dBx {
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private final AtomicReferenceArray<AbstractRunnableC7685dBo> e = new AtomicReferenceArray<>(128);
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C7694dBx.class, Object.class, "lastScheduledTask");
    private static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C7694dBx.class, "producerIndex");
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C7694dBx.class, "consumerIndex");
    private static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(C7694dBx.class, "blockingTasksInBuffer");

    private final int c() {
        return c.get(this) - b.get(this);
    }

    public final int a() {
        return a.get(this) != null ? c() + 1 : c();
    }

    public final AbstractRunnableC7685dBo e() {
        AbstractRunnableC7685dBo abstractRunnableC7685dBo = (AbstractRunnableC7685dBo) a.getAndSet(this, null);
        return abstractRunnableC7685dBo == null ? d() : abstractRunnableC7685dBo;
    }

    public final AbstractRunnableC7685dBo b(AbstractRunnableC7685dBo abstractRunnableC7685dBo, boolean z) {
        if (z) {
            return c(abstractRunnableC7685dBo);
        }
        AbstractRunnableC7685dBo abstractRunnableC7685dBo2 = (AbstractRunnableC7685dBo) a.getAndSet(this, abstractRunnableC7685dBo);
        if (abstractRunnableC7685dBo2 == null) {
            return null;
        }
        return c(abstractRunnableC7685dBo2);
    }

    private final AbstractRunnableC7685dBo c(AbstractRunnableC7685dBo abstractRunnableC7685dBo) {
        if (c() == 127) {
            return abstractRunnableC7685dBo;
        }
        if (abstractRunnableC7685dBo.f.c() == 1) {
            d.incrementAndGet(this);
        }
        int i = c.get(this) & 127;
        while (this.e.get(i) != null) {
            Thread.yield();
        }
        this.e.lazySet(i, abstractRunnableC7685dBo);
        c.incrementAndGet(this);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(int i, Ref.ObjectRef<AbstractRunnableC7685dBo> objectRef) {
        T t;
        if (i == 3) {
            t = d();
        } else {
            t = e(i);
        }
        if (t != 0) {
            objectRef.d = t;
            return -1L;
        }
        return a(i, objectRef);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final o.AbstractRunnableC7685dBo e(int r5) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = o.C7694dBx.b
            int r0 = r0.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = o.C7694dBx.c
            int r1 = r1.get(r4)
            r2 = 1
            if (r5 != r2) goto L10
            goto L11
        L10:
            r2 = 0
        L11:
            r5 = 0
            if (r0 == r1) goto L28
            if (r2 == 0) goto L1f
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = o.C7694dBx.d
            int r3 = r3.get(r4)
            if (r3 != 0) goto L1f
            return r5
        L1f:
            o.dBo r5 = r4.e(r0, r2)
            if (r5 != 0) goto L28
            int r0 = r0 + 1
            goto L11
        L28:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7694dBx.e(int):o.dBo");
    }

    public final AbstractRunnableC7685dBo b() {
        return b(true);
    }

    private final AbstractRunnableC7685dBo b(boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractRunnableC7685dBo abstractRunnableC7685dBo;
        do {
            atomicReferenceFieldUpdater = a;
            abstractRunnableC7685dBo = (AbstractRunnableC7685dBo) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC7685dBo != null) {
                if ((abstractRunnableC7685dBo.f.c() == 1) == z) {
                }
            }
            int i = b.get(this);
            int i2 = c.get(this);
            while (i != i2) {
                if (z && d.get(this) == 0) {
                    return null;
                }
                i2--;
                AbstractRunnableC7685dBo e = e(i2, z);
                if (e != null) {
                    return e;
                }
            }
            return null;
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, abstractRunnableC7685dBo, null));
        return abstractRunnableC7685dBo;
    }

    private final AbstractRunnableC7685dBo e(int i, boolean z) {
        int i2 = i & 127;
        AbstractRunnableC7685dBo abstractRunnableC7685dBo = this.e.get(i2);
        if (abstractRunnableC7685dBo != null) {
            if ((abstractRunnableC7685dBo.f.c() == 1) == z && Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(this.e, i2, abstractRunnableC7685dBo, null)) {
                if (z) {
                    d.decrementAndGet(this);
                }
                return abstractRunnableC7685dBo;
            }
        }
        return null;
    }

    public final void e(C7686dBp c7686dBp) {
        AbstractRunnableC7685dBo abstractRunnableC7685dBo = (AbstractRunnableC7685dBo) a.getAndSet(this, null);
        if (abstractRunnableC7685dBo != null) {
            c7686dBp.e(abstractRunnableC7685dBo);
        }
        do {
        } while (a(c7686dBp));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o.dBo, T, java.lang.Object] */
    private final long a(int i, Ref.ObjectRef<AbstractRunnableC7685dBo> objectRef) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r1;
        do {
            atomicReferenceFieldUpdater = a;
            r1 = (AbstractRunnableC7685dBo) atomicReferenceFieldUpdater.get(this);
            if (r1 == 0) {
                return -2L;
            }
            if (((r1.f.c() != 1 ? 2 : 1) & i) == 0) {
                return -2L;
            }
            long c2 = C7687dBq.i.c() - r1.g;
            long j = C7687dBq.h;
            if (c2 < j) {
                return j - c2;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, r1, null));
        objectRef.d = r1;
        return -1L;
    }

    private final boolean a(C7686dBp c7686dBp) {
        AbstractRunnableC7685dBo d2 = d();
        if (d2 == null) {
            return false;
        }
        c7686dBp.e(d2);
        return true;
    }

    private final AbstractRunnableC7685dBo d() {
        AbstractRunnableC7685dBo andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.e.getAndSet(i & 127, null)) != null) {
                e(andSet);
                return andSet;
            }
        }
    }

    private final void e(AbstractRunnableC7685dBo abstractRunnableC7685dBo) {
        if (abstractRunnableC7685dBo == null || abstractRunnableC7685dBo.f.c() != 1) {
            return;
        }
        d.decrementAndGet(this);
    }
}
