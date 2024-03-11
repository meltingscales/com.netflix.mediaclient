package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlinx.coroutines.channels.BufferedChannel$onReceive$1;
import kotlinx.coroutines.channels.BufferedChannel$onReceive$2;
import kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$1;
import kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$2;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import o.C8793dyt;
import o.C8794dyu;
import o.dAB;
import o.dBH;
import o.dpR;
import o.drM;

/* renamed from: o.dyt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8793dyt<E> implements InterfaceC8792dys<E> {
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    public final drM<E, dpR> e;
    private final int k;
    private final InterfaceC8612dsa<dBH<?>, Object, Object, drM<Throwable, dpR>> m;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;
    private static final AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(C8793dyt.class, "sendersAndCloseStatus");
    private static final AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(C8793dyt.class, "receivers");
    private static final AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(C8793dyt.class, "bufferEnd");
    private static final AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(C8793dyt.class, "completedExpandBuffersAndPauseFlag");
    private static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(C8793dyt.class, Object.class, "sendSegment");
    private static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C8793dyt.class, Object.class, "receiveSegment");
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C8793dyt.class, Object.class, "bufferEndSegment");
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(C8793dyt.class, Object.class, "_closeCause");
    private static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(C8793dyt.class, Object.class, "closeHandler");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dyt$d */
    /* loaded from: classes5.dex */
    public static final class d implements InterfaceC8783dyj {
        private final InterfaceC8743dwx<Boolean> c;
        private final /* synthetic */ C8741dwv<Boolean> d;

        @Override // o.InterfaceC8783dyj
        public void c(dAC<?> dac, int i) {
            this.d.c(dac, i);
        }

        public final InterfaceC8743dwx<Boolean> d() {
            return this.c;
        }
    }

    @Override // o.dyI
    public Object a(E e2, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return b(this, e2, interfaceC8585dra);
    }

    @Override // o.dyJ
    public Object c(InterfaceC8585dra<? super E> interfaceC8585dra) {
        return c((C8793dyt) this, (InterfaceC8585dra) interfaceC8585dra);
    }

    @Override // o.dyJ
    public Object e(InterfaceC8585dra<? super C8797dyx<? extends E>> interfaceC8585dra) {
        return e((C8793dyt) this, (InterfaceC8585dra) interfaceC8585dra);
    }

    protected boolean k() {
        return false;
    }

    protected void p() {
    }

    protected void q() {
    }

    protected void r() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [o.drM<E, o.dpR>, o.drM<? super E, o.dpR>] */
    public C8793dyt(int i2, drM<? super E, dpR> drm) {
        long e2;
        dAH dah;
        this.k = i2;
        this.e = drm;
        if (i2 >= 0) {
            e2 = C8794dyu.e(i2);
            this.bufferEnd = e2;
            this.completedExpandBuffersAndPauseFlag = v();
            C8796dyw c8796dyw = new C8796dyw(0L, null, this, 3);
            this.sendSegment = c8796dyw;
            this.receiveSegment = c8796dyw;
            if (D()) {
                c8796dyw = C8794dyu.m;
                C8632dsu.d(c8796dyw);
            }
            this.bufferEndSegment = c8796dyw;
            this.m = drm != 0 ? new InterfaceC8612dsa<dBH<?>, Object, Object, drM<? super Throwable, ? extends dpR>>(this) { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1
                final /* synthetic */ C8793dyt<E> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                    this.a = this;
                }

                @Override // o.InterfaceC8612dsa
                /* renamed from: a */
                public final drM<Throwable, dpR> invoke(final dBH<?> dbh, Object obj, final Object obj2) {
                    final C8793dyt<E> c8793dyt = this.a;
                    return new drM<Throwable, dpR>() { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void c(Throwable th) {
                            if (obj2 != C8794dyu.s()) {
                                dAB.b((drM<? super Object, dpR>) c8793dyt.e, obj2, dbh.d());
                            }
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(Throwable th) {
                            c(th);
                            return dpR.c;
                        }
                    };
                }
            } : null;
            dah = C8794dyu.l;
            this._closeCause = dah;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
    }

    public final long g() {
        return l.get(this) & 1152921504606846975L;
    }

    public final long i() {
        return g.get(this);
    }

    private final long v() {
        return c.get(this);
    }

    private final boolean D() {
        long v = v();
        return v == 0 || v == Long.MAX_VALUE;
    }

    static /* synthetic */ <E> Object b(C8793dyt<E> c8793dyt, E e2, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e3;
        Object e4;
        Object e5;
        Object e6;
        C8796dyw<E> c8796dyw = (C8796dyw) f.get(c8793dyt);
        while (true) {
            long andIncrement = l.getAndIncrement(c8793dyt);
            long j2 = 1152921504606846975L & andIncrement;
            boolean j3 = c8793dyt.j(andIncrement);
            long j4 = C8794dyu.d;
            long j5 = j2 / j4;
            int i2 = (int) (j2 % j4);
            if (c8796dyw.b != j5) {
                C8796dyw<E> e7 = c8793dyt.e(j5, c8796dyw);
                if (e7 != null) {
                    c8796dyw = e7;
                } else if (j3) {
                    Object b2 = c8793dyt.b((C8793dyt<E>) e2, interfaceC8585dra);
                    e6 = C8586drb.e();
                    if (b2 == e6) {
                        return b2;
                    }
                }
            }
            int d2 = c8793dyt.d(c8796dyw, i2, e2, j2, null, j3);
            if (d2 == 0) {
                c8796dyw.c();
                break;
            } else if (d2 == 1) {
                break;
            } else if (d2 != 2) {
                if (d2 == 3) {
                    Object a = c8793dyt.a((C8796dyw<int>) c8796dyw, i2, (int) e2, j2, interfaceC8585dra);
                    e4 = C8586drb.e();
                    if (a == e4) {
                        return a;
                    }
                } else if (d2 == 4) {
                    if (j2 < c8793dyt.i()) {
                        c8796dyw.c();
                    }
                    Object b3 = c8793dyt.b((C8793dyt<E>) e2, interfaceC8585dra);
                    e5 = C8586drb.e();
                    if (b3 == e5) {
                        return b3;
                    }
                } else if (d2 == 5) {
                    c8796dyw.c();
                }
            } else if (j3) {
                c8796dyw.k();
                Object b4 = c8793dyt.b((C8793dyt<E>) e2, interfaceC8585dra);
                e3 = C8586drb.e();
                if (b4 == e3) {
                    return b4;
                }
            }
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InterfaceC8783dyj interfaceC8783dyj, C8796dyw<E> c8796dyw, int i2) {
        interfaceC8783dyj.c(c8796dyw, i2 + C8794dyu.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(E e2, InterfaceC8743dwx<? super dpR> interfaceC8743dwx) {
        drM<E, dpR> drm = this.e;
        if (drm != null) {
            dAB.b(drm, e2, interfaceC8743dwx.getContext());
        }
        Throwable j2 = j();
        Result.c cVar = Result.e;
        interfaceC8743dwx.resumeWith(Result.e(C8556dpz.a(j2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
        return o.C8797dyx.b.d(o.dpR.c);
     */
    @Override // o.dyI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = o.C8793dyt.l
            long r0 = r0.get(r14)
            boolean r0 = r14.i(r0)
            if (r0 == 0) goto L13
            o.dyx$c r15 = o.C8797dyx.b
            java.lang.Object r15 = r15.d()
            return r15
        L13:
            o.dAH r8 = o.C8794dyu.f()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = b()
            java.lang.Object r0 = r0.get(r14)
            o.dyw r0 = (o.C8796dyw) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = a()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = c(r14, r1)
            int r1 = o.C8794dyu.d
            long r1 = (long) r1
            long r3 = r9 / r1
            long r1 = r9 % r1
            int r12 = (int) r1
            long r1 = r0.b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L4d
            o.dyw r1 = e(r14, r3, r0)
            if (r1 != 0) goto L4b
            if (r11 == 0) goto L21
            goto L8d
        L4b:
            r13 = r1
            goto L4e
        L4d:
            r13 = r0
        L4e:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = d(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Laf
            r1 = 1
            if (r0 == r1) goto Lb2
            r1 = 2
            if (r0 == r1) goto L88
            r1 = 3
            if (r0 == r1) goto L7c
            r1 = 4
            if (r0 == r1) goto L70
            r1 = 5
            if (r0 == r1) goto L6b
            goto L6e
        L6b:
            r13.c()
        L6e:
            r0 = r13
            goto L21
        L70:
            long r0 = r14.i()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L8d
            r13.c()
            goto L8d
        L7c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L88:
            if (r11 == 0) goto L98
            r13.k()
        L8d:
            o.dyx$c r15 = o.C8797dyx.b
            java.lang.Throwable r0 = r14.j()
            java.lang.Object r15 = r15.a(r0)
            goto Lba
        L98:
            boolean r15 = r8 instanceof o.InterfaceC8783dyj
            if (r15 == 0) goto L9f
            o.dyj r8 = (o.InterfaceC8783dyj) r8
            goto La0
        L9f:
            r8 = 0
        La0:
            if (r8 == 0) goto La5
            a(r14, r8, r13, r12)
        La5:
            r13.k()
            o.dyx$c r15 = o.C8797dyx.b
            java.lang.Object r15 = r15.d()
            goto Lba
        Laf:
            r13.c()
        Lb2:
            o.dyx$c r15 = o.C8797dyx.b
            o.dpR r0 = o.dpR.c
            java.lang.Object r15 = r15.d(r0)
        Lba:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8793dyt.d(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d(C8796dyw<E> c8796dyw, int i2, E e2, long j2, Object obj, boolean z) {
        dAH dah;
        dAH dah2;
        dAH dah3;
        c8796dyw.b(i2, e2);
        if (z) {
            return a(c8796dyw, i2, e2, j2, obj, z);
        }
        Object a = c8796dyw.a(i2);
        if (a == null) {
            if (e(j2)) {
                if (c8796dyw.d(i2, null, C8794dyu.e)) {
                    return 1;
                }
            } else if (obj == null) {
                return 3;
            } else {
                if (c8796dyw.d(i2, null, obj)) {
                    return 2;
                }
            }
        } else if (a instanceof InterfaceC8783dyj) {
            c8796dyw.d(i2);
            if (a(a, e2)) {
                dah3 = C8794dyu.h;
                c8796dyw.c(i2, dah3);
                q();
                return 0;
            }
            dah = C8794dyu.i;
            Object d2 = c8796dyw.d(i2, dah);
            dah2 = C8794dyu.i;
            if (d2 != dah2) {
                c8796dyw.e(i2, true);
            }
            return 5;
        }
        return a(c8796dyw, i2, e2, j2, obj, z);
    }

    private final int a(C8796dyw<E> c8796dyw, int i2, E e2, long j2, Object obj, boolean z) {
        dAH dah;
        dAH dah2;
        dAH dah3;
        dAH dah4;
        dAH dah5;
        dAH dah6;
        dAH dah7;
        while (true) {
            Object a = c8796dyw.a(i2);
            if (a == null) {
                if (!e(j2) || z) {
                    if (z) {
                        dah = C8794dyu.f;
                        if (c8796dyw.d(i2, null, dah)) {
                            c8796dyw.e(i2, false);
                            return 4;
                        }
                    } else if (obj == null) {
                        return 3;
                    } else {
                        if (c8796dyw.d(i2, null, obj)) {
                            return 2;
                        }
                    }
                } else if (c8796dyw.d(i2, null, C8794dyu.e)) {
                    return 1;
                }
            } else {
                dah2 = C8794dyu.k;
                if (a == dah2) {
                    if (c8796dyw.d(i2, a, C8794dyu.e)) {
                        return 1;
                    }
                } else {
                    dah3 = C8794dyu.i;
                    if (a == dah3) {
                        c8796dyw.d(i2);
                        return 5;
                    }
                    dah4 = C8794dyu.n;
                    if (a == dah4) {
                        c8796dyw.d(i2);
                        return 5;
                    } else if (a == C8794dyu.s()) {
                        c8796dyw.d(i2);
                        y();
                        return 4;
                    } else {
                        c8796dyw.d(i2);
                        if (a instanceof dyM) {
                            a = ((dyM) a).a;
                        }
                        if (a(a, e2)) {
                            dah7 = C8794dyu.h;
                            c8796dyw.c(i2, dah7);
                            q();
                            return 0;
                        }
                        dah5 = C8794dyu.i;
                        Object d2 = c8796dyw.d(i2, dah5);
                        dah6 = C8794dyu.i;
                        if (d2 != dah6) {
                            c8796dyw.e(i2, true);
                        }
                        return 5;
                    }
                }
            }
        }
    }

    private final boolean i(long j2) {
        if (j(j2)) {
            return false;
        }
        return !e(j2 & 1152921504606846975L);
    }

    private final boolean e(long j2) {
        return j2 < v() || j2 < i() + ((long) this.k);
    }

    private final boolean a(Object obj, E e2) {
        boolean a;
        boolean a2;
        if (obj instanceof dBH) {
            return ((dBH) obj).d(this, e2);
        }
        if (obj instanceof dyG) {
            C8632dsu.d(obj);
            dyG dyg = (dyG) obj;
            C8741dwv<C8797dyx<? extends E>> c8741dwv = dyg.c;
            C8797dyx a3 = C8797dyx.a(C8797dyx.b.d(e2));
            drM<E, dpR> drm = this.e;
            a2 = C8794dyu.a(c8741dwv, a3, drm != null ? dAB.e(drm, e2, dyg.c.getContext()) : null);
            return a2;
        } else if (obj instanceof e) {
            C8632dsu.d(obj);
            return ((e) obj).e(e2);
        } else if (obj instanceof InterfaceC8743dwx) {
            C8632dsu.d(obj);
            InterfaceC8743dwx interfaceC8743dwx = (InterfaceC8743dwx) obj;
            drM<E, dpR> drm2 = this.e;
            a = C8794dyu.a(interfaceC8743dwx, e2, drm2 != null ? dAB.e(drm2, e2, interfaceC8743dwx.getContext()) : null);
            return a;
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    static /* synthetic */ <E> Object c(C8793dyt<E> c8793dyt, InterfaceC8585dra<? super E> interfaceC8585dra) {
        dAH dah;
        dAH dah2;
        dAH dah3;
        C8796dyw<E> c8796dyw = (C8796dyw) h.get(c8793dyt);
        while (!c8793dyt.o()) {
            long andIncrement = g.getAndIncrement(c8793dyt);
            long j2 = C8794dyu.d;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (c8796dyw.b != j3) {
                C8796dyw<E> c2 = c8793dyt.c(j3, c8796dyw);
                if (c2 == null) {
                    continue;
                } else {
                    c8796dyw = c2;
                }
            }
            Object a = c8793dyt.a(c8796dyw, i2, andIncrement, (Object) null);
            dah = C8794dyu.r;
            if (a == dah) {
                throw new IllegalStateException("unexpected".toString());
            }
            dah2 = C8794dyu.g;
            if (a == dah2) {
                if (andIncrement < c8793dyt.g()) {
                    c8796dyw.c();
                }
            } else {
                dah3 = C8794dyu.q;
                if (a == dah3) {
                    return c8793dyt.b(c8796dyw, i2, andIncrement, interfaceC8585dra);
                }
                c8796dyw.c();
                return a;
            }
        }
        throw dAK.e(c8793dyt.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(InterfaceC8783dyj interfaceC8783dyj, C8796dyw<E> c8796dyw, int i2) {
        r();
        interfaceC8783dyj.c(c8796dyw, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(InterfaceC8743dwx<? super E> interfaceC8743dwx) {
        Result.c cVar = Result.e;
        interfaceC8743dwx.resumeWith(Result.e(C8556dpz.a(x())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ <E> java.lang.Object e(o.C8793dyt<E> r13, o.InterfaceC8585dra<? super o.C8797dyx<? extends E>> r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L13
            r0 = r14
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.e = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r13, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.d
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r6.e
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            o.C8556dpz.d(r14)
            o.dyx r14 = (o.C8797dyx) r14
            java.lang.Object r13 = r14.e()
            goto Lb0
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            o.C8556dpz.d(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = c()
            java.lang.Object r14 = r14.get(r13)
            o.dyw r14 = (o.C8796dyw) r14
        L46:
            boolean r1 = r13.o()
            if (r1 == 0) goto L57
            o.dyx$c r14 = o.C8797dyx.b
            java.lang.Throwable r13 = r13.d()
            java.lang.Object r13 = r14.a(r13)
            goto Lb0
        L57:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = e()
            long r4 = r1.getAndIncrement(r13)
            int r1 = o.C8794dyu.d
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.b
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L75
            o.dyw r1 = d(r13, r9, r14)
            if (r1 != 0) goto L74
            goto L46
        L74:
            r14 = r1
        L75:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = c(r7, r8, r9, r10, r12)
            o.dAH r7 = o.C8794dyu.n()
            if (r1 == r7) goto Lb1
            o.dAH r7 = o.C8794dyu.c()
            if (r1 != r7) goto L96
            long r7 = r13.g()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L46
            r14.c()
            goto L46
        L96:
            o.dAH r7 = o.C8794dyu.p()
            if (r1 != r7) goto La7
            r6.e = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.e(r2, r3, r4, r6)
            if (r13 != r0) goto Lb0
            return r0
        La7:
            r14.c()
            o.dyx$c r13 = o.C8797dyx.b
            java.lang.Object r13 = r13.d(r1)
        Lb0:
            return r13
        Lb1:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8793dyt.e(o.dyt, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(o.C8796dyw<E> r11, int r12, long r13, o.InterfaceC8585dra<? super o.C8797dyx<? extends E>> r15) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8793dyt.e(o.dyw, int, long, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(InterfaceC8743dwx<? super C8797dyx<? extends E>> interfaceC8743dwx) {
        Result.c cVar = Result.e;
        interfaceC8743dwx.resumeWith(Result.e(C8797dyx.a(C8797dyx.b.a(d()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.dyJ
    public Object s() {
        dAH dah;
        C8796dyw c8796dyw;
        dAH dah2;
        dAH dah3;
        dAH dah4;
        long j2 = g.get(this);
        long j3 = l.get(this);
        if (g(j3)) {
            return C8797dyx.b.a(d());
        }
        if (j2 >= (j3 & 1152921504606846975L)) {
            return C8797dyx.b.d();
        }
        dah = C8794dyu.i;
        C8796dyw c8796dyw2 = (C8796dyw) h.get(this);
        while (!o()) {
            long andIncrement = g.getAndIncrement(this);
            long j4 = C8794dyu.d;
            long j5 = andIncrement / j4;
            int i2 = (int) (andIncrement % j4);
            if (c8796dyw2.b != j5) {
                C8796dyw c2 = c(j5, c8796dyw2);
                if (c2 == null) {
                    continue;
                } else {
                    c8796dyw = c2;
                }
            } else {
                c8796dyw = c8796dyw2;
            }
            Object a = a(c8796dyw, i2, andIncrement, dah);
            dah2 = C8794dyu.r;
            if (a == dah2) {
                InterfaceC8783dyj interfaceC8783dyj = dah instanceof InterfaceC8783dyj ? (InterfaceC8783dyj) dah : null;
                if (interfaceC8783dyj != null) {
                    d(interfaceC8783dyj, c8796dyw, i2);
                }
                d(andIncrement);
                c8796dyw.k();
                return C8797dyx.b.d();
            }
            dah3 = C8794dyu.g;
            if (a == dah3) {
                if (andIncrement < g()) {
                    c8796dyw.c();
                }
                c8796dyw2 = c8796dyw;
            } else {
                dah4 = C8794dyu.q;
                if (a == dah4) {
                    throw new IllegalStateException("unexpected".toString());
                }
                c8796dyw.c();
                return C8797dyx.b.d(a);
            }
        }
        return C8797dyx.b.a(d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(long j2) {
        dAH dah;
        UndeliveredElementException d2;
        C8796dyw<E> c8796dyw = (C8796dyw) h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.k + j3, v())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = C8794dyu.d;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (c8796dyw.b != j5) {
                    C8796dyw<E> c2 = c(j5, c8796dyw);
                    if (c2 == null) {
                        continue;
                    } else {
                        c8796dyw = c2;
                    }
                }
                Object a = a(c8796dyw, i2, j3, (Object) null);
                dah = C8794dyu.g;
                if (a == dah) {
                    if (j3 < g()) {
                        c8796dyw.c();
                    }
                } else {
                    c8796dyw.c();
                    drM<E, dpR> drm = this.e;
                    if (drm != null && (d2 = dAB.d(drm, a, null, 2, null)) != null) {
                        throw d2;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(C8796dyw<E> c8796dyw, int i2, long j2, Object obj) {
        dAH dah;
        dAH dah2;
        dAH dah3;
        Object a = c8796dyw.a(i2);
        if (a == null) {
            if (j2 >= (l.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    dah3 = C8794dyu.q;
                    return dah3;
                } else if (c8796dyw.d(i2, a, obj)) {
                    w();
                    dah2 = C8794dyu.r;
                    return dah2;
                }
            }
        } else if (a == C8794dyu.e) {
            dah = C8794dyu.h;
            if (c8796dyw.d(i2, a, dah)) {
                w();
                return c8796dyw.b(i2);
            }
        }
        return e(c8796dyw, i2, j2, obj);
    }

    private final Object e(C8796dyw<E> c8796dyw, int i2, long j2, Object obj) {
        dAH dah;
        dAH dah2;
        dAH dah3;
        dAH dah4;
        dAH dah5;
        dAH dah6;
        dAH dah7;
        dAH dah8;
        dAH dah9;
        dAH dah10;
        dAH dah11;
        dAH dah12;
        dAH dah13;
        dAH dah14;
        dAH dah15;
        dAH dah16;
        while (true) {
            Object a = c8796dyw.a(i2);
            if (a != null) {
                dah5 = C8794dyu.k;
                if (a != dah5) {
                    if (a == C8794dyu.e) {
                        dah6 = C8794dyu.h;
                        if (c8796dyw.d(i2, a, dah6)) {
                            w();
                            return c8796dyw.b(i2);
                        }
                    } else {
                        dah7 = C8794dyu.f;
                        if (a == dah7) {
                            dah8 = C8794dyu.g;
                            return dah8;
                        }
                        dah9 = C8794dyu.n;
                        if (a == dah9) {
                            dah10 = C8794dyu.g;
                            return dah10;
                        } else if (a == C8794dyu.s()) {
                            w();
                            dah11 = C8794dyu.g;
                            return dah11;
                        } else {
                            dah12 = C8794dyu.t;
                            if (a != dah12) {
                                dah13 = C8794dyu.p;
                                if (c8796dyw.d(i2, a, dah13)) {
                                    boolean z = a instanceof dyM;
                                    if (z) {
                                        a = ((dyM) a).a;
                                    }
                                    if (d(a, c8796dyw, i2)) {
                                        dah16 = C8794dyu.h;
                                        c8796dyw.c(i2, dah16);
                                        w();
                                        return c8796dyw.b(i2);
                                    }
                                    dah14 = C8794dyu.f;
                                    c8796dyw.c(i2, dah14);
                                    c8796dyw.e(i2, false);
                                    if (z) {
                                        w();
                                    }
                                    dah15 = C8794dyu.g;
                                    return dah15;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            if (j2 < (l.get(this) & 1152921504606846975L)) {
                dah = C8794dyu.n;
                if (c8796dyw.d(i2, a, dah)) {
                    w();
                    dah2 = C8794dyu.g;
                    return dah2;
                }
            } else if (obj == null) {
                dah3 = C8794dyu.q;
                return dah3;
            } else if (c8796dyw.d(i2, a, obj)) {
                w();
                dah4 = C8794dyu.r;
                return dah4;
            }
        }
    }

    private final boolean d(Object obj, C8796dyw<E> c8796dyw, int i2) {
        if (obj instanceof InterfaceC8743dwx) {
            C8632dsu.d(obj);
            return C8794dyu.a((InterfaceC8743dwx) obj, dpR.c, null, 2, null);
        } else if (obj instanceof dBH) {
            C8632dsu.d(obj);
            TrySelectDetailedResult b2 = ((dBJ) obj).b(this, dpR.c);
            if (b2 == TrySelectDetailedResult.REREGISTER) {
                c8796dyw.d(i2);
            }
            return b2 == TrySelectDetailedResult.SUCCESSFUL;
        } else if (obj instanceof d) {
            return C8794dyu.a(((d) obj).d(), Boolean.TRUE, null, 2, null);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    private final void w() {
        if (D()) {
            return;
        }
        C8796dyw<E> c8796dyw = (C8796dyw) b.get(this);
        while (true) {
            long andIncrement = c.getAndIncrement(this);
            long j2 = C8794dyu.d;
            long j3 = andIncrement / j2;
            if (g() <= andIncrement) {
                if (c8796dyw.b < j3 && c8796dyw.b() != 0) {
                    b(j3, c8796dyw);
                }
                c(this, 0L, 1, (Object) null);
                return;
            }
            if (c8796dyw.b != j3) {
                C8796dyw<E> e2 = e(j3, c8796dyw, andIncrement);
                if (e2 == null) {
                    continue;
                } else {
                    c8796dyw = e2;
                }
            }
            if (e(c8796dyw, (int) (andIncrement % j2), andIncrement)) {
                c(this, 0L, 1, (Object) null);
                return;
            }
            c(this, 0L, 1, (Object) null);
        }
    }

    private final boolean e(C8796dyw<E> c8796dyw, int i2, long j2) {
        dAH dah;
        dAH dah2;
        Object a = c8796dyw.a(i2);
        if ((a instanceof InterfaceC8783dyj) && j2 >= g.get(this)) {
            dah = C8794dyu.t;
            if (c8796dyw.d(i2, a, dah)) {
                if (d(a, c8796dyw, i2)) {
                    c8796dyw.c(i2, C8794dyu.e);
                    return true;
                }
                dah2 = C8794dyu.f;
                c8796dyw.c(i2, dah2);
                c8796dyw.e(i2, false);
                return false;
            }
        }
        return c(c8796dyw, i2, j2);
    }

    private final boolean c(C8796dyw<E> c8796dyw, int i2, long j2) {
        dAH dah;
        dAH dah2;
        dAH dah3;
        dAH dah4;
        dAH dah5;
        dAH dah6;
        dAH dah7;
        dAH dah8;
        while (true) {
            Object a = c8796dyw.a(i2);
            if (a instanceof InterfaceC8783dyj) {
                if (j2 < g.get(this)) {
                    if (c8796dyw.d(i2, a, new dyM((InterfaceC8783dyj) a))) {
                        return true;
                    }
                } else {
                    dah = C8794dyu.t;
                    if (c8796dyw.d(i2, a, dah)) {
                        if (d(a, c8796dyw, i2)) {
                            c8796dyw.c(i2, C8794dyu.e);
                            return true;
                        }
                        dah2 = C8794dyu.f;
                        c8796dyw.c(i2, dah2);
                        c8796dyw.e(i2, false);
                        return false;
                    }
                }
            } else {
                dah3 = C8794dyu.f;
                if (a != dah3) {
                    if (a == null) {
                        dah4 = C8794dyu.k;
                        if (c8796dyw.d(i2, a, dah4)) {
                            return true;
                        }
                    } else if (a != C8794dyu.e) {
                        dah5 = C8794dyu.n;
                        if (a == dah5) {
                            break;
                        }
                        dah6 = C8794dyu.h;
                        if (a == dah6) {
                            break;
                        }
                        dah7 = C8794dyu.i;
                        if (a == dah7 || a == C8794dyu.s()) {
                            return true;
                        }
                        dah8 = C8794dyu.p;
                        if (a != dah8) {
                            throw new IllegalStateException(("Unexpected cell state: " + a).toString());
                        }
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }
    }

    static /* synthetic */ void c(C8793dyt c8793dyt, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i2 & 1) != 0) {
            j2 = 1;
        }
        c8793dyt.h(j2);
    }

    private final void h(long j2) {
        if ((j.addAndGet(this, j2) & 4611686018427387904L) != 0) {
            do {
            } while ((j.get(this) & 4611686018427387904L) != 0);
        }
    }

    public final void d(long j2) {
        int i2;
        long j3;
        long e2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long e3;
        long j4;
        long e4;
        if (D()) {
            return;
        }
        do {
        } while (v() <= j2);
        i2 = C8794dyu.j;
        for (int i3 = 0; i3 < i2; i3++) {
            long v = v();
            if (v == (4611686018427387903L & j.get(this)) && v == v()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = j;
        do {
            j3 = atomicLongFieldUpdater2.get(this);
            e2 = C8794dyu.e(j3 & 4611686018427387903L, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, e2));
        while (true) {
            long v2 = v();
            atomicLongFieldUpdater = j;
            long j5 = atomicLongFieldUpdater.get(this);
            long j6 = j5 & 4611686018427387903L;
            boolean z = (4611686018427387904L & j5) != 0;
            if (v2 == j6 && v2 == v()) {
                break;
            } else if (!z) {
                e3 = C8794dyu.e(j6, true);
                atomicLongFieldUpdater.compareAndSet(this, j5, e3);
            }
        }
        do {
            j4 = atomicLongFieldUpdater.get(this);
            e4 = C8794dyu.e(j4 & 4611686018427387903L, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, e4));
    }

    @Override // o.dyJ
    public dBB<E> f() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.a;
        C8632dsu.d(bufferedChannel$onReceive$1);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.a;
        C8632dsu.d(bufferedChannel$onReceive$2);
        return new dBA(this, (InterfaceC8612dsa) dsH.a(bufferedChannel$onReceive$1, 3), (InterfaceC8612dsa) dsH.a(bufferedChannel$onReceive$2, 3), this.m);
    }

    @Override // o.dyJ
    public dBB<C8797dyx<E>> h() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.c;
        C8632dsu.d(bufferedChannel$onReceiveCatching$1);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.d;
        C8632dsu.d(bufferedChannel$onReceiveCatching$2);
        return new dBA(this, (InterfaceC8612dsa) dsH.a(bufferedChannel$onReceiveCatching$1, 3), (InterfaceC8612dsa) dsH.a(bufferedChannel$onReceiveCatching$2, 3), this.m);
    }

    private final void b(dBH<?> dbh) {
        dbh.b(C8794dyu.s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(Object obj, Object obj2) {
        if (obj2 != C8794dyu.s()) {
            return obj2;
        }
        throw x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(Object obj, Object obj2) {
        return C8797dyx.a(obj2 == C8794dyu.s() ? C8797dyx.b.a(d()) : C8797dyx.b.d(obj2));
    }

    @Override // o.dyJ
    public InterfaceC8798dyy<E> ct_() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dyt$e */
    /* loaded from: classes5.dex */
    public final class e implements InterfaceC8798dyy<E>, InterfaceC8783dyj {
        private C8741dwv<? super Boolean> b;
        private Object c;

        public e() {
            dAH dah;
            dah = C8794dyu.f13864o;
            this.c = dah;
        }

        @Override // o.InterfaceC8798dyy
        public Object c(InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
            C8796dyw<E> c8796dyw;
            dAH dah;
            dAH dah2;
            dAH dah3;
            C8793dyt<E> c8793dyt = C8793dyt.this;
            C8796dyw<E> c8796dyw2 = (C8796dyw) C8793dyt.h.get(c8793dyt);
            while (!c8793dyt.o()) {
                long andIncrement = C8793dyt.g.getAndIncrement(c8793dyt);
                long j = C8794dyu.d;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (c8796dyw2.b != j2) {
                    C8796dyw<E> c = c8793dyt.c(j2, c8796dyw2);
                    if (c == null) {
                        continue;
                    } else {
                        c8796dyw = c;
                    }
                } else {
                    c8796dyw = c8796dyw2;
                }
                Object a = c8793dyt.a(c8796dyw, i, andIncrement, (Object) null);
                dah = C8794dyu.r;
                if (a == dah) {
                    throw new IllegalStateException("unreachable".toString());
                }
                dah2 = C8794dyu.g;
                if (a == dah2) {
                    if (andIncrement < c8793dyt.g()) {
                        c8796dyw.c();
                    }
                    c8796dyw2 = c8796dyw;
                } else {
                    dah3 = C8794dyu.q;
                    if (a == dah3) {
                        return e(c8796dyw, i, andIncrement, interfaceC8585dra);
                    }
                    c8796dyw.c();
                    this.c = a;
                    return C8589dre.e(true);
                }
            }
            return C8589dre.e(d());
        }

        private final boolean d() {
            this.c = C8794dyu.s();
            Throwable d = C8793dyt.this.d();
            if (d == null) {
                return false;
            }
            throw dAK.e(d);
        }

        @Override // o.InterfaceC8783dyj
        public void c(dAC<?> dac, int i) {
            C8741dwv<? super Boolean> c8741dwv = this.b;
            if (c8741dwv != null) {
                c8741dwv.c(dac, i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b() {
            C8741dwv<? super Boolean> c8741dwv = this.b;
            C8632dsu.d(c8741dwv);
            this.b = null;
            this.c = C8794dyu.s();
            Throwable d = C8793dyt.this.d();
            if (d == null) {
                Result.c cVar = Result.e;
                c8741dwv.resumeWith(Result.e(Boolean.FALSE));
                return;
            }
            Result.c cVar2 = Result.e;
            c8741dwv.resumeWith(Result.e(C8556dpz.a(d)));
        }

        @Override // o.InterfaceC8798dyy
        public E a() {
            dAH dah;
            dAH dah2;
            E e = (E) this.c;
            dah = C8794dyu.f13864o;
            if (e == dah) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            dah2 = C8794dyu.f13864o;
            this.c = dah2;
            if (e != C8794dyu.s()) {
                return e;
            }
            throw dAK.e(C8793dyt.this.x());
        }

        public final boolean e(E e) {
            boolean a;
            C8741dwv<? super Boolean> c8741dwv = this.b;
            C8632dsu.d(c8741dwv);
            this.b = null;
            this.c = e;
            Boolean bool = Boolean.TRUE;
            drM<E, dpR> drm = C8793dyt.this.e;
            a = C8794dyu.a(c8741dwv, bool, drm != null ? dAB.e(drm, e, c8741dwv.getContext()) : null);
            return a;
        }

        public final void c() {
            C8741dwv<? super Boolean> c8741dwv = this.b;
            C8632dsu.d(c8741dwv);
            this.b = null;
            this.c = C8794dyu.s();
            Throwable d = C8793dyt.this.d();
            if (d == null) {
                Result.c cVar = Result.e;
                c8741dwv.resumeWith(Result.e(Boolean.FALSE));
                return;
            }
            Result.c cVar2 = Result.e;
            c8741dwv.resumeWith(Result.e(C8556dpz.a(d)));
        }

        private final Object e(C8796dyw<E> c8796dyw, int i, long j, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
            InterfaceC8585dra b;
            dAH dah;
            dAH dah2;
            Boolean e;
            drM<E, dpR> drm;
            dqZ context;
            dAH dah3;
            dAH dah4;
            dAH dah5;
            Object e2;
            C8793dyt<E> c8793dyt = C8793dyt.this;
            b = C8590drf.b(interfaceC8585dra);
            C8741dwv b2 = dwB.b(b);
            try {
                this.b = b2;
                Object a = c8793dyt.a(c8796dyw, i, j, this);
                dah = C8794dyu.r;
                if (a == dah) {
                    c8793dyt.d((InterfaceC8783dyj) this, (C8796dyw) c8796dyw, i);
                } else {
                    dah2 = C8794dyu.g;
                    drM<Throwable, dpR> drm2 = null;
                    if (a == dah2) {
                        if (j < c8793dyt.g()) {
                            c8796dyw.c();
                        }
                        C8796dyw c8796dyw2 = (C8796dyw) C8793dyt.h.get(c8793dyt);
                        while (true) {
                            if (c8793dyt.o()) {
                                b();
                                break;
                            }
                            long andIncrement = C8793dyt.g.getAndIncrement(c8793dyt);
                            long j2 = C8794dyu.d;
                            long j3 = andIncrement / j2;
                            int i2 = (int) (andIncrement % j2);
                            if (c8796dyw2.b != j3) {
                                C8796dyw c = c8793dyt.c(j3, c8796dyw2);
                                if (c != null) {
                                    c8796dyw2 = c;
                                }
                            }
                            a = c8793dyt.a(c8796dyw2, i2, andIncrement, this);
                            dah3 = C8794dyu.r;
                            if (a == dah3) {
                                c8793dyt.d((InterfaceC8783dyj) this, c8796dyw2, i2);
                                break;
                            }
                            dah4 = C8794dyu.g;
                            if (a == dah4) {
                                if (andIncrement < c8793dyt.g()) {
                                    c8796dyw2.c();
                                }
                            } else {
                                dah5 = C8794dyu.q;
                                if (a == dah5) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                c8796dyw2.c();
                                this.c = a;
                                this.b = null;
                                e = C8589dre.e(true);
                                drm = c8793dyt.e;
                                if (drm != null) {
                                    context = b2.getContext();
                                }
                            }
                        }
                        b2.a(e, drm2);
                    } else {
                        c8796dyw.c();
                        this.c = a;
                        this.b = null;
                        e = C8589dre.e(true);
                        drm = c8793dyt.e;
                        if (drm != null) {
                            context = b2.getContext();
                            drm2 = dAB.e(drm, a, context);
                        }
                        b2.a(e, drm2);
                    }
                }
                Object b3 = b2.b();
                e2 = C8586drb.e();
                if (b3 == e2) {
                    C8592drh.c(interfaceC8585dra);
                }
                return b3;
            } catch (Throwable th) {
                b2.j();
                throw th;
            }
        }
    }

    protected final Throwable d() {
        return (Throwable) d.get(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Throwable j() {
        Throwable d2 = d();
        return d2 == null ? new ClosedSendChannelException("Channel was closed") : d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable x() {
        Throwable d2 = d();
        return d2 == null ? new ClosedReceiveChannelException("Channel was closed") : d2;
    }

    @Override // o.dyI
    public boolean b(Throwable th) {
        return e(th, false);
    }

    @Override // o.dyJ
    public final void e(CancellationException cancellationException) {
        d((Throwable) cancellationException);
    }

    public boolean d(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return e(th, true);
    }

    protected boolean e(Throwable th, boolean z) {
        dAH dah;
        if (z) {
            z();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        dah = C8794dyu.l;
        boolean m = AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, dah, th);
        if (z) {
            C();
        } else {
            B();
        }
        y();
        p();
        if (m) {
            u();
        }
        return m;
    }

    private final void u() {
        Object obj;
        dAH dah;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                dah = C8794dyu.c;
            } else {
                dah = C8794dyu.b;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, dah));
        if (obj == null) {
            return;
        }
        drM drm = (drM) dsH.a(obj, 1);
        ((drM) obj).invoke(d());
    }

    @Override // o.dyI
    public void d(drM<? super Throwable, dpR> drm) {
        dAH dah;
        dAH dah2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        dAH dah3;
        dAH dah4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, null, drm)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            dah = C8794dyu.c;
            if (obj == dah) {
                atomicReferenceFieldUpdater = i;
                dah3 = C8794dyu.c;
                dah4 = C8794dyu.b;
            } else {
                dah2 = C8794dyu.b;
                if (obj == dah2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, dah3, dah4));
        drm.invoke(d());
    }

    private final void B() {
        long j2;
        long c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            int i2 = (int) (j2 >> 60);
            if (i2 == 0) {
                c2 = C8794dyu.c(j2 & 1152921504606846975L, 2);
            } else if (i2 != 1) {
                return;
            } else {
                c2 = C8794dyu.c(j2 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, c2));
    }

    private final void C() {
        long j2;
        long c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            c2 = C8794dyu.c(1152921504606846975L & j2, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, c2));
    }

    private final void z() {
        long j2;
        long c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (((int) (j2 >> 60)) != 0) {
                return;
            }
            c2 = C8794dyu.c(1152921504606846975L & j2, 1);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, c2));
    }

    private final void y() {
        n();
    }

    private final C8796dyw<E> b(long j2) {
        C8796dyw<E> t = t();
        if (k()) {
            long b2 = b(t);
            if (b2 != -1) {
                a(b2);
            }
        }
        b(t, j2);
        return t;
    }

    private final void c(long j2) {
        e(b(j2));
    }

    private final C8796dyw<E> t() {
        C8796dyw c8796dyw = b.get(this);
        C8796dyw c8796dyw2 = (C8796dyw) f.get(this);
        if (c8796dyw2.b > ((C8796dyw) c8796dyw).b) {
            c8796dyw = c8796dyw2;
        }
        C8796dyw c8796dyw3 = (C8796dyw) h.get(this);
        if (c8796dyw3.b > ((C8796dyw) c8796dyw).b) {
            c8796dyw = c8796dyw3;
        }
        return (C8796dyw) C7650dAg.a((AbstractC7647dAd) c8796dyw);
    }

    private final long b(C8796dyw<E> c8796dyw) {
        dAH dah;
        do {
            int i2 = C8794dyu.d;
            while (true) {
                i2--;
                if (-1 < i2) {
                    long j2 = (c8796dyw.b * C8794dyu.d) + i2;
                    if (j2 >= i()) {
                        while (true) {
                            Object a = c8796dyw.a(i2);
                            if (a != null) {
                                dah = C8794dyu.k;
                                if (a != dah) {
                                    if (a == C8794dyu.e) {
                                        return j2;
                                    }
                                }
                            }
                            if (c8796dyw.d(i2, a, C8794dyu.s())) {
                                c8796dyw.k();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                } else {
                    c8796dyw = (C8796dyw) c8796dyw.e();
                }
            }
        } while (c8796dyw != null);
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
        r12 = (o.C8796dyw) r12.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(o.C8796dyw<E> r12) {
        /*
            r11 = this;
            o.drM<E, o.dpR> r0 = r11.e
            r1 = 0
            r2 = 1
            java.lang.Object r3 = o.C7657dAn.a(r1, r2, r1)
        L8:
            int r4 = o.C8794dyu.d
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.b
            int r8 = o.C8794dyu.d
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.a(r4)
            o.dAH r9 = o.C8794dyu.e()
            if (r8 == r9) goto Lbb
            o.dAH r9 = o.C8794dyu.e
            if (r8 != r9) goto L48
            long r9 = r11.i()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            o.dAH r9 = o.C8794dyu.s()
            boolean r8 = r12.d(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.c(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = o.dAB.b(r0, r5, r1)
        L40:
            r12.d(r4)
            r12.k()
            goto Laf
        L48:
            o.dAH r9 = o.C8794dyu.i()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof o.InterfaceC8783dyj
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof o.dyM
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            o.dAH r9 = o.C8794dyu.m()
            if (r8 == r9) goto Lbb
            o.dAH r9 = o.C8794dyu.k()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            o.dAH r9 = o.C8794dyu.m()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.i()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof o.dyM
            if (r9 == 0) goto L80
            r9 = r8
            o.dyM r9 = (o.dyM) r9
            o.dyj r9 = r9.a
            goto L83
        L80:
            r9 = r8
            o.dyj r9 = (o.InterfaceC8783dyj) r9
        L83:
            o.dAH r10 = o.C8794dyu.s()
            boolean r8 = r12.d(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.c(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = o.dAB.b(r0, r5, r1)
        L97:
            java.lang.Object r3 = o.C7657dAn.d(r3, r9)
            r12.d(r4)
            r12.k()
            goto Laf
        La2:
            o.dAH r9 = o.C8794dyu.s()
            boolean r8 = r12.d(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.k()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            o.dAd r12 = r12.e()
            o.dyw r12 = (o.C8796dyw) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Ldf
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            o.dyj r3 = (o.InterfaceC8783dyj) r3
            r11.c(r3)
            goto Ldf
        Lc7:
            o.C8632dsu.d(r3)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld1:
            if (r5 >= r12) goto Ldf
            java.lang.Object r0 = r3.get(r12)
            o.dyj r0 = (o.InterfaceC8783dyj) r0
            r11.c(r0)
            int r12 = r12 + (-1)
            goto Ld1
        Ldf:
            if (r1 != 0) goto Le2
            return
        Le2:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8793dyt.e(o.dyw):void");
    }

    private final void b(C8796dyw<E> c8796dyw, long j2) {
        dAH dah;
        Object a = C7657dAn.a(null, 1, null);
        loop0: while (c8796dyw != null) {
            for (int i2 = C8794dyu.d - 1; -1 < i2; i2--) {
                if ((c8796dyw.b * C8794dyu.d) + i2 < j2) {
                    break loop0;
                }
                while (true) {
                    Object a2 = c8796dyw.a(i2);
                    if (a2 != null) {
                        dah = C8794dyu.k;
                        if (a2 != dah) {
                            if (a2 instanceof dyM) {
                                if (c8796dyw.d(i2, a2, C8794dyu.s())) {
                                    a = C7657dAn.d(a, ((dyM) a2).a);
                                    c8796dyw.e(i2, true);
                                    break;
                                }
                            } else if (!(a2 instanceof InterfaceC8783dyj)) {
                                break;
                            } else if (c8796dyw.d(i2, a2, C8794dyu.s())) {
                                a = C7657dAn.d(a, a2);
                                c8796dyw.e(i2, true);
                                break;
                            }
                        }
                    }
                    if (c8796dyw.d(i2, a2, C8794dyu.s())) {
                        c8796dyw.k();
                        break;
                    }
                }
            }
            c8796dyw = (C8796dyw) c8796dyw.e();
        }
        if (a != null) {
            if (!(a instanceof ArrayList)) {
                d((InterfaceC8783dyj) a);
                return;
            }
            C8632dsu.d(a);
            ArrayList arrayList = (ArrayList) a;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                d((InterfaceC8783dyj) arrayList.get(size));
            }
        }
    }

    private final void d(InterfaceC8783dyj interfaceC8783dyj) {
        b(interfaceC8783dyj, true);
    }

    private final void c(InterfaceC8783dyj interfaceC8783dyj) {
        b(interfaceC8783dyj, false);
    }

    private final void b(InterfaceC8783dyj interfaceC8783dyj, boolean z) {
        if (interfaceC8783dyj instanceof d) {
            InterfaceC8743dwx<Boolean> d2 = ((d) interfaceC8783dyj).d();
            Result.c cVar = Result.e;
            d2.resumeWith(Result.e(Boolean.FALSE));
        } else if (interfaceC8783dyj instanceof InterfaceC8743dwx) {
            InterfaceC8585dra interfaceC8585dra = (InterfaceC8585dra) interfaceC8783dyj;
            Result.c cVar2 = Result.e;
            interfaceC8585dra.resumeWith(Result.e(C8556dpz.a(z ? x() : j())));
        } else if (interfaceC8783dyj instanceof dyG) {
            C8741dwv<C8797dyx<? extends E>> c8741dwv = ((dyG) interfaceC8783dyj).c;
            Result.c cVar3 = Result.e;
            c8741dwv.resumeWith(Result.e(C8797dyx.a(C8797dyx.b.a(d()))));
        } else if (interfaceC8783dyj instanceof e) {
            ((e) interfaceC8783dyj).c();
        } else if (interfaceC8783dyj instanceof dBH) {
            ((dBH) interfaceC8783dyj).d(this, C8794dyu.s());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC8783dyj).toString());
        }
    }

    @Override // o.dyI
    public boolean n() {
        return j(l.get(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(long j2) {
        return d(j2, false);
    }

    public boolean o() {
        return g(l.get(this));
    }

    private final boolean g(long j2) {
        return d(j2, true);
    }

    private final boolean d(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    c(j2 & 1152921504606846975L);
                    return true;
                }
                throw new IllegalStateException(("unexpected close status: " + i2).toString());
            }
            b(j2 & 1152921504606846975L);
            if (!z || !l()) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            C8796dyw<E> c8796dyw = (C8796dyw) atomicReferenceFieldUpdater.get(this);
            long i2 = i();
            if (g() <= i2) {
                return false;
            }
            long j2 = C8794dyu.d;
            long j3 = i2 / j2;
            if (c8796dyw.b != j3 && (c8796dyw = c(j3, c8796dyw)) == null) {
                if (((C8796dyw) atomicReferenceFieldUpdater.get(this)).b < j3) {
                    return false;
                }
            } else {
                c8796dyw.c();
                if (b(c8796dyw, (int) (i2 % j2), i2)) {
                    return true;
                }
                g.compareAndSet(this, i2, i2 + 1);
            }
        }
    }

    private final boolean b(C8796dyw<E> c8796dyw, int i2, long j2) {
        Object a;
        dAH dah;
        dAH dah2;
        dAH dah3;
        dAH dah4;
        dAH dah5;
        dAH dah6;
        dAH dah7;
        do {
            a = c8796dyw.a(i2);
            if (a != null) {
                dah2 = C8794dyu.k;
                if (a != dah2) {
                    if (a == C8794dyu.e) {
                        return true;
                    }
                    dah3 = C8794dyu.f;
                    if (a == dah3 || a == C8794dyu.s()) {
                        return false;
                    }
                    dah4 = C8794dyu.h;
                    if (a == dah4) {
                        return false;
                    }
                    dah5 = C8794dyu.n;
                    if (a == dah5) {
                        return false;
                    }
                    dah6 = C8794dyu.t;
                    if (a == dah6) {
                        return true;
                    }
                    dah7 = C8794dyu.p;
                    return a != dah7 && j2 == i();
                }
            }
            dah = C8794dyu.n;
        } while (!c8796dyw.d(i2, a, dah));
        w();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C8796dyw<E> e(long j2, C8796dyw<E> c8796dyw) {
        Object b2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        drX drx = (drX) C8794dyu.t();
        loop0: while (true) {
            b2 = C7650dAg.b(c8796dyw, j2, drx);
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
        if (dAG.a(b2)) {
            y();
            if (c8796dyw.b * C8794dyu.d < i()) {
                c8796dyw.c();
            }
        } else {
            C8796dyw<E> c8796dyw2 = (C8796dyw) dAG.c(b2);
            long j3 = c8796dyw2.b;
            if (j3 <= j2) {
                return c8796dyw2;
            }
            long j4 = C8794dyu.d;
            l(j3 * j4);
            if (c8796dyw2.b * j4 < i()) {
                c8796dyw2.c();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C8796dyw<E> c(long j2, C8796dyw<E> c8796dyw) {
        Object b2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        drX drx = (drX) C8794dyu.t();
        loop0: while (true) {
            b2 = C7650dAg.b(c8796dyw, j2, drx);
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
        if (dAG.a(b2)) {
            y();
            if (c8796dyw.b * C8794dyu.d < g()) {
                c8796dyw.c();
            }
        } else {
            C8796dyw<E> c8796dyw2 = (C8796dyw) dAG.c(b2);
            if (!D() && j2 <= v() / C8794dyu.d) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
                while (true) {
                    dAC dac2 = (dAC) atomicReferenceFieldUpdater2.get(this);
                    if (dac2.b >= c8796dyw2.b || !c8796dyw2.l()) {
                        break;
                    } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, dac2, c8796dyw2)) {
                        if (dac2.f()) {
                            dac2.h();
                        }
                    } else if (c8796dyw2.f()) {
                        c8796dyw2.h();
                    }
                }
            }
            long j3 = c8796dyw2.b;
            if (j3 <= j2) {
                return c8796dyw2;
            }
            long j4 = C8794dyu.d;
            f(j3 * j4);
            if (c8796dyw2.b * j4 < g()) {
                c8796dyw2.c();
            }
        }
        return null;
    }

    private final C8796dyw<E> e(long j2, C8796dyw<E> c8796dyw, long j3) {
        Object b2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        drX drx = (drX) C8794dyu.t();
        loop0: while (true) {
            b2 = C7650dAg.b(c8796dyw, j2, drx);
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
        if (dAG.a(b2)) {
            y();
            b(j2, c8796dyw);
            c(this, 0L, 1, (Object) null);
            return null;
        }
        C8796dyw<E> c8796dyw2 = (C8796dyw) dAG.c(b2);
        long j4 = c8796dyw2.b;
        if (j4 > j2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long j5 = C8794dyu.d;
            if (atomicLongFieldUpdater.compareAndSet(this, j3 + 1, j5 * j4)) {
                h((c8796dyw2.b * j5) - j3);
                return null;
            }
            c(this, 0L, 1, (Object) null);
            return null;
        }
        return c8796dyw2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(long r5, o.C8796dyw<E> r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.b
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            o.dAd r0 = r7.b()
            o.dyw r0 = (o.C8796dyw) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.g()
            if (r5 == 0) goto L22
            o.dAd r5 = r7.b()
            o.dyw r5 = (o.C8796dyw) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = o.C8793dyt.b
        L24:
            java.lang.Object r6 = r5.get(r4)
            o.dAC r6 = (o.dAC) r6
            long r0 = r6.b
            long r2 = r7.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.l()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.h()
        L49:
            return
        L4a:
            boolean r6 = r7.f()
            if (r6 == 0) goto L24
            r7.h()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8793dyt.b(long, o.dyw):void");
    }

    private final void l(long j2) {
        long j3;
        long c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            long j4 = 1152921504606846975L & j3;
            if (j4 >= j2) {
                return;
            }
            c2 = C8794dyu.c(j4, (int) (j3 >> 60));
        } while (!l.compareAndSet(this, j3, c2));
    }

    private final void f(long j2) {
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j2) {
                return;
            }
        } while (!g.compareAndSet(this, j3, j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d4, code lost:
        r3 = (o.C8796dyw) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01db, code lost:
        if (r3 != null) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d4 A[EDGE_INSN: B:109:0x01d4->B:91:0x01d4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8793dyt.toString():java.lang.String");
    }

    private final Object b(E e2, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        InterfaceC8585dra b2;
        Object e3;
        Object e4;
        UndeliveredElementException d2;
        b2 = C8590drf.b(interfaceC8585dra);
        C8741dwv c8741dwv = new C8741dwv(b2, 1);
        c8741dwv.h();
        drM<E, dpR> drm = this.e;
        if (drm != null && (d2 = dAB.d(drm, e2, null, 2, null)) != null) {
            C8553dpw.c(d2, j());
            Result.c cVar = Result.e;
            c8741dwv.resumeWith(Result.e(C8556dpz.a(d2)));
        } else {
            Throwable j2 = j();
            Result.c cVar2 = Result.e;
            c8741dwv.resumeWith(Result.e(C8556dpz.a(j2)));
        }
        Object b3 = c8741dwv.b();
        e3 = C8586drb.e();
        if (b3 == e3) {
            C8592drh.c(interfaceC8585dra);
        }
        e4 = C8586drb.e();
        return b3 == e4 ? b3 : dpR.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object a(o.C8796dyw<E> r21, int r22, E r23, long r24, o.InterfaceC8585dra<? super o.dpR> r26) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8793dyt.a(o.dyw, int, java.lang.Object, long, o.dra):java.lang.Object");
    }

    private final Object b(C8796dyw<E> c8796dyw, int i2, long j2, InterfaceC8585dra<? super E> interfaceC8585dra) {
        InterfaceC8585dra b2;
        dAH dah;
        dAH dah2;
        drM<E, dpR> drm;
        dqZ context;
        dAH dah3;
        dAH dah4;
        dAH dah5;
        Object e2;
        b2 = C8590drf.b(interfaceC8585dra);
        C8741dwv b3 = dwB.b(b2);
        try {
            Object a = a(c8796dyw, i2, j2, b3);
            dah = C8794dyu.r;
            if (a == dah) {
                d((InterfaceC8783dyj) b3, (C8796dyw) c8796dyw, i2);
            } else {
                dah2 = C8794dyu.g;
                drM<Throwable, dpR> drm2 = null;
                drm2 = null;
                if (a == dah2) {
                    if (j2 < g()) {
                        c8796dyw.c();
                    }
                    C8796dyw c8796dyw2 = (C8796dyw) h.get(this);
                    while (true) {
                        if (o()) {
                            b(b3);
                            break;
                        }
                        long andIncrement = g.getAndIncrement(this);
                        long j3 = C8794dyu.d;
                        long j4 = andIncrement / j3;
                        int i3 = (int) (andIncrement % j3);
                        if (c8796dyw2.b != j4) {
                            C8796dyw c2 = c(j4, c8796dyw2);
                            if (c2 != null) {
                                c8796dyw2 = c2;
                            }
                        }
                        a = a(c8796dyw2, i3, andIncrement, b3);
                        dah3 = C8794dyu.r;
                        if (a == dah3) {
                            C8741dwv c8741dwv = b3 instanceof InterfaceC8783dyj ? b3 : null;
                            if (c8741dwv != null) {
                                d((InterfaceC8783dyj) c8741dwv, c8796dyw2, i3);
                            }
                        } else {
                            dah4 = C8794dyu.g;
                            if (a == dah4) {
                                if (andIncrement < g()) {
                                    c8796dyw2.c();
                                }
                            } else {
                                dah5 = C8794dyu.q;
                                if (a == dah5) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                c8796dyw2.c();
                                drm = this.e;
                                if (drm != null) {
                                    context = b3.getContext();
                                }
                            }
                        }
                    }
                    b3.a(a, drm2);
                } else {
                    c8796dyw.c();
                    drm = this.e;
                    if (drm != null) {
                        context = b3.getContext();
                        drm2 = dAB.e(drm, a, context);
                    }
                    b3.a(a, drm2);
                }
            }
            Object b4 = b3.b();
            e2 = C8586drb.e();
            if (b4 == e2) {
                C8592drh.c(interfaceC8585dra);
            }
            return b4;
        } catch (Throwable th) {
            b3.j();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(dBH<?> dbh, Object obj) {
        dAH dah;
        dAH dah2;
        dAH dah3;
        C8796dyw c8796dyw = (C8796dyw) h.get(this);
        while (!o()) {
            long andIncrement = g.getAndIncrement(this);
            long j2 = C8794dyu.d;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (c8796dyw.b != j3) {
                C8796dyw c2 = c(j3, c8796dyw);
                if (c2 == null) {
                    continue;
                } else {
                    c8796dyw = c2;
                }
            }
            Object a = a(c8796dyw, i2, andIncrement, dbh);
            dah = C8794dyu.r;
            if (a == dah) {
                InterfaceC8783dyj interfaceC8783dyj = dbh instanceof InterfaceC8783dyj ? (InterfaceC8783dyj) dbh : null;
                if (interfaceC8783dyj != null) {
                    d(interfaceC8783dyj, c8796dyw, i2);
                    return;
                }
                return;
            }
            dah2 = C8794dyu.g;
            if (a == dah2) {
                if (andIncrement < g()) {
                    c8796dyw.c();
                }
            } else {
                dah3 = C8794dyu.q;
                if (a == dah3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                c8796dyw.c();
                dbh.b(a);
                return;
            }
        }
        b(dbh);
    }
}
