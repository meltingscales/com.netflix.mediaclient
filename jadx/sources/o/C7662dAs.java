package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.dAs  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7662dAs<E> {
    private volatile Object _next;
    private volatile long _state;
    private final AtomicReferenceArray b;
    private final int f;
    private final boolean h;
    private final int j;
    public static final d d = new d(null);
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(C7662dAs.class, Object.class, "_next");
    private static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(C7662dAs.class, "_state");
    public static final dAH a = new dAH("REMOVE_FROZEN");

    public C7662dAs(int i, boolean z) {
        this.j = i;
        this.h = z;
        int i2 = i - 1;
        this.f = i2;
        this.b = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final boolean e() {
        long j = e.get(this);
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final int d() {
        long j = e.get(this);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final boolean b() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(E r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = o.C7662dAs.e
        L2:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L16
            o.dAs$d r13 = o.C7662dAs.d
            int r13 = r13.a(r3)
            return r13
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L30
            return r6
        L30:
            boolean r2 = r12.h
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.b
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L4f
            int r2 = r12.j
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L2
        L4e:
            return r6
        L4f:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = o.C7662dAs.e
            o.dAs$d r2 = o.C7662dAs.d
            int r6 = r9 + 1
            r5 = r5 & r6
            long r5 = r2.e(r3, r5)
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.b
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L69:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = o.C7662dAs.e
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L80
            o.dAs r0 = r0.a()
            o.dAs r0 = r0.e(r9, r13)
            if (r0 != 0) goto L69
        L80:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7662dAs.a(java.lang.Object):int");
    }

    private final C7662dAs<E> e(int i, E e2) {
        Object obj = this.b.get(this.f & i);
        if ((obj instanceof e) && ((e) obj).b == i) {
            this.b.set(i & this.f, e2);
            return this;
        }
        return null;
    }

    public final Object c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j) != 0) {
                return a;
            }
            int i = (int) (1073741823 & j);
            int i2 = this.f;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.b.get(i4);
            if (obj == null) {
                if (this.h) {
                    return null;
                }
            } else if (obj instanceof e) {
                return null;
            } else {
                int i5 = (i + 1) & 1073741823;
                if (e.compareAndSet(this, j, d.a(j, i5))) {
                    this.b.set(this.f & i, null);
                    return obj;
                } else if (this.h) {
                    C7662dAs<E> c7662dAs = this;
                    do {
                        c7662dAs = c7662dAs.a(i, i5);
                    } while (c7662dAs != null);
                    return obj;
                }
            }
        }
    }

    private final C7662dAs<E> a(int i, int i2) {
        long j;
        int i3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        do {
            j = atomicLongFieldUpdater.get(this);
            i3 = (int) (1073741823 & j);
            if ((1152921504606846976L & j) != 0) {
                return a();
            }
        } while (!e.compareAndSet(this, j, d.a(j, i2)));
        this.b.set(this.f & i3, null);
        return null;
    }

    public final C7662dAs<E> a() {
        return d(j());
    }

    private final long j() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        return j2;
    }

    private final C7662dAs<E> d(long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        while (true) {
            C7662dAs<E> c7662dAs = (C7662dAs) atomicReferenceFieldUpdater.get(this);
            if (c7662dAs != null) {
                return c7662dAs;
            }
            AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(c, this, null, e(j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C7662dAs<E> e(long j) {
        C7662dAs<E> c7662dAs = new C7662dAs<>(this.j * 2, this.h);
        int i = (int) (1073741823 & j);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f;
            int i4 = i & i3;
            if (i4 != (i3 & i2)) {
                Object obj = this.b.get(i4);
                if (obj == null) {
                    obj = new e(i);
                }
                c7662dAs.b.set(c7662dAs.f & i, obj);
                i++;
            } else {
                e.set(c7662dAs, d.e(j, 1152921504606846976L));
                return c7662dAs;
            }
        }
    }

    /* renamed from: o.dAs$e */
    /* loaded from: classes5.dex */
    public static final class e {
        public final int b;

        public e(int i) {
            this.b = i;
        }
    }

    /* renamed from: o.dAs$d */
    /* loaded from: classes5.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        public final int a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long e(long j, long j2) {
            return j & (~j2);
        }

        private d() {
        }

        public final long a(long j, int i) {
            return e(j, 1073741823L) | i;
        }

        public final long e(long j, int i) {
            return e(j, 1152921503533105152L) | (i << 30);
        }
    }
}
