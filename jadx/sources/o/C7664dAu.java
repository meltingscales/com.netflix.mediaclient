package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.PropertyReference0Impl;
import o.dwW;

/* renamed from: o.dAu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7664dAu {
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C7664dAu.class, Object.class, "_next");
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(C7664dAu.class, Object.class, "_prev");
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(C7664dAu.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    private final dAD c() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        dAD dad = (dAD) atomicReferenceFieldUpdater.get(this);
        if (dad == null) {
            dAD dad2 = new dAD(this);
            atomicReferenceFieldUpdater.lazySet(this, dad2);
            return dad2;
        }
        return dad;
    }

    /* renamed from: o.dAu$b */
    /* loaded from: classes5.dex */
    public static abstract class b extends AbstractC7649dAf<C7664dAu> {
        public final C7664dAu c;
        public C7664dAu d;

        public b(C7664dAu c7664dAu) {
            this.c = c7664dAu;
        }

        @Override // o.AbstractC7649dAf
        /* renamed from: c */
        public void e(C7664dAu c7664dAu, Object obj) {
            boolean z = obj == null;
            C7664dAu c7664dAu2 = z ? this.c : this.d;
            if (c7664dAu2 != null && AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(C7664dAu.b, c7664dAu, this, c7664dAu2) && z) {
                C7664dAu c7664dAu3 = this.c;
                C7664dAu c7664dAu4 = this.d;
                C8632dsu.d(c7664dAu4);
                c7664dAu3.a(c7664dAu4);
            }
        }
    }

    public boolean cq_() {
        return g() instanceof dAD;
    }

    public final Object g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof dAA)) {
                return obj;
            }
            ((dAA) obj).d(this);
        }
    }

    public final C7664dAu j() {
        return C7666dAw.d(g());
    }

    public final C7664dAu h() {
        C7664dAu d2 = d((dAA) null);
        return d2 == null ? d((C7664dAu) d.get(this)) : d2;
    }

    private final C7664dAu d(C7664dAu c7664dAu) {
        while (c7664dAu.cq_()) {
            c7664dAu = (C7664dAu) d.get(c7664dAu);
        }
        return c7664dAu;
    }

    public final boolean c(C7664dAu c7664dAu) {
        d.lazySet(c7664dAu, this);
        b.lazySet(c7664dAu, this);
        while (g() == this) {
            if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(b, this, this, c7664dAu)) {
                c7664dAu.a(this);
                return true;
            }
        }
        return false;
    }

    public final int d(C7664dAu c7664dAu, C7664dAu c7664dAu2, b bVar) {
        d.lazySet(c7664dAu, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        atomicReferenceFieldUpdater.lazySet(c7664dAu, c7664dAu2);
        bVar.d = c7664dAu2;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, c7664dAu2, bVar)) {
            return bVar.d(this) == null ? 1 : 2;
        }
        return 0;
    }

    public boolean cs_() {
        return f() == null;
    }

    public final C7664dAu f() {
        Object g;
        C7664dAu c7664dAu;
        do {
            g = g();
            if (g instanceof dAD) {
                return ((dAD) g).d;
            }
            if (g == this) {
                return (C7664dAu) g;
            }
            C8632dsu.d(g);
            c7664dAu = (C7664dAu) g;
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(b, this, g, c7664dAu.c()));
        c7664dAu.d((dAA) null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C7664dAu c7664dAu) {
        C7664dAu c7664dAu2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        do {
            c7664dAu2 = (C7664dAu) atomicReferenceFieldUpdater.get(c7664dAu);
            if (g() != c7664dAu) {
                return;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(d, c7664dAu, c7664dAu2, this));
        if (cq_()) {
            c7664dAu.d((dAA) null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r3, r1, ((o.dAD) r5).d) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final o.C7664dAu d(o.dAA r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o.C7664dAu.d
            java.lang.Object r0 = r0.get(r8)
            o.dAu r0 = (o.C7664dAu) r0
            r1 = r0
        L9:
            r2 = 0
            r3 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = o.C7664dAu.b
            java.lang.Object r5 = r4.get(r1)
            if (r5 != r8) goto L20
            if (r0 != r1) goto L16
            return r1
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = o.C7664dAu.d
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r8, r0, r1)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r1
        L20:
            boolean r6 = r8.cq_()
            if (r6 == 0) goto L27
            return r2
        L27:
            if (r5 != r9) goto L2a
            return r1
        L2a:
            boolean r6 = r5 instanceof o.dAA
            if (r6 == 0) goto L34
            o.dAA r5 = (o.dAA) r5
            r5.d(r1)
            goto L0
        L34:
            boolean r6 = r5 instanceof o.dAD
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            o.dAD r5 = (o.dAD) r5
            o.dAu r2 = r5.d
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r3, r1, r2)
            if (r1 != 0) goto L45
            goto L0
        L45:
            r1 = r3
            goto L9
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = o.C7664dAu.d
            java.lang.Object r1 = r4.get(r1)
            o.dAu r1 = (o.C7664dAu) r1
            goto Lb
        L50:
            o.C8632dsu.d(r5)
            r3 = r5
            o.dAu r3 = (o.C7664dAu) r3
            r7 = r3
            r3 = r1
            r1 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7664dAu.d(o.dAA):o.dAu");
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, o.dtD
            public Object get() {
                return dwW.c(this.receiver);
            }
        } + '@' + dwW.a(this);
    }
}
