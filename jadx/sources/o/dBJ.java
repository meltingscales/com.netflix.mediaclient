package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* loaded from: classes5.dex */
public class dBJ<R> extends AbstractC8744dwy implements InterfaceC7696dBz<R>, dBG<R> {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(dBJ.class, Object.class, "state");
    private final dqZ b;
    private int c;
    private List<dBJ<R>.a> d;
    private Object e;
    private Object h;
    private volatile Object state;

    public Object b(InterfaceC8585dra<? super R> interfaceC8585dra) {
        return d((dBJ) this, (InterfaceC8585dra) interfaceC8585dra);
    }

    @Override // o.dBH
    public void b(Object obj) {
        this.h = obj;
    }

    @Override // o.InterfaceC8783dyj
    public void c(dAC<?> dac, int i) {
        this.e = dac;
        this.c = i;
    }

    @Override // o.dBH
    public dqZ d() {
        return this.b;
    }

    @Override // o.dBH
    public void e(InterfaceC8760dxn interfaceC8760dxn) {
        this.e = interfaceC8760dxn;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(Throwable th) {
        e(th);
        return dpR.c;
    }

    public dBJ(dqZ dqz) {
        dAH dah;
        dAH dah2;
        this.b = dqz;
        dah = dBF.h;
        this.state = dah;
        this.d = new ArrayList(2);
        this.c = -1;
        dah2 = dBF.d;
        this.h = dah2;
    }

    private final boolean c() {
        return a.get(this) instanceof a;
    }

    static /* synthetic */ <R> Object d(dBJ<R> dbj, InterfaceC8585dra<? super R> interfaceC8585dra) {
        return dbj.c() ? dbj.c(interfaceC8585dra) : dbj.d((InterfaceC8585dra) interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[PHI: r6 
      PHI: (r6v5 java.lang.Object) = (r6v4 java.lang.Object), (r6v1 java.lang.Object) binds: [B:21:0x0054, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(o.InterfaceC8585dra<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.d = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            o.C8556dpz.d(r6)
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.a
            o.dBJ r2 = (o.dBJ) r2
            o.C8556dpz.d(r6)
            goto L4b
        L3c:
            o.C8556dpz.d(r6)
            r0.a = r5
            r0.d = r4
            java.lang.Object r6 = r5.e(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.a = r6
            r0.d = r3
            java.lang.Object r6 = r2.c(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dBJ.d(o.dra):java.lang.Object");
    }

    @Override // o.InterfaceC7696dBz
    public void b(dBC dbc, drM<? super InterfaceC8585dra<? super R>, ? extends Object> drm) {
        e(this, new a(dbc.c(), dbc.e(), dbc.a(), dBF.j(), drm, dbc.d()), false, 1, null);
    }

    @Override // o.InterfaceC7696dBz
    public <Q> void a(dBB<? extends Q> dbb, drX<? super Q, ? super InterfaceC8585dra<? super R>, ? extends Object> drx) {
        e(this, new a(dbb.c(), dbb.e(), dbb.a(), null, drx, dbb.d()), false, 1, null);
    }

    public static /* synthetic */ void e(dBJ dbj, a aVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        dbj.b(aVar, z);
    }

    public final void b(dBJ<R>.a aVar, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        if (!z) {
            d(aVar.b);
        }
        if (aVar.c((dBJ) this)) {
            if (!z) {
                List<dBJ<R>.a> list = this.d;
                C8632dsu.d(list);
                list.add(aVar);
            }
            aVar.a = this.e;
            aVar.c = this.c;
            this.e = null;
            this.c = -1;
            return;
        }
        atomicReferenceFieldUpdater.set(this, aVar);
    }

    private final void d(Object obj) {
        List<dBJ<R>.a> list = this.d;
        C8632dsu.d(list);
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).b == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Object obj) {
        dBJ<R>.a a2 = a(obj);
        C8632dsu.d(a2);
        a2.a = null;
        a2.c = -1;
        b((a) a2, true);
    }

    @Override // o.dBH
    public boolean d(Object obj, Object obj2) {
        return e(obj, obj2) == 0;
    }

    public final TrySelectDetailedResult b(Object obj, Object obj2) {
        TrySelectDetailedResult a2;
        a2 = dBF.a(e(obj, obj2));
        return a2;
    }

    private final int e(Object obj, Object obj2) {
        boolean d;
        dAH dah;
        dAH dah2;
        dAH dah3;
        List e;
        List b;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof InterfaceC8743dwx) {
                dBJ<R>.a a2 = a(obj);
                if (a2 == null) {
                    continue;
                } else {
                    drM<Throwable, dpR> d2 = a2.d(this, obj2);
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj3, a2)) {
                        this.h = obj2;
                        d = dBF.d((InterfaceC8743dwx) obj3, d2);
                        if (d) {
                            return 0;
                        }
                        this.h = null;
                        return 2;
                    }
                }
            } else {
                dah = dBF.a;
                if (C8632dsu.c(obj3, dah) || (obj3 instanceof a)) {
                    return 3;
                }
                dah2 = dBF.b;
                if (C8632dsu.c(obj3, dah2)) {
                    return 2;
                }
                dah3 = dBF.h;
                if (C8632dsu.c(obj3, dah3)) {
                    e = C8566dqi.e(obj);
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj3, e)) {
                        return 1;
                    }
                } else if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                } else {
                    b = C8576dqs.b((Collection<? extends Object>) obj3, obj);
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj3, b)) {
                        return 1;
                    }
                }
            }
        }
    }

    private final dBJ<R>.a a(Object obj) {
        List<dBJ<R>.a> list = this.d;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).b == obj) {
                obj2 = next;
                break;
            }
        }
        dBJ<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    private final Object c(InterfaceC8585dra<? super R> interfaceC8585dra) {
        Object obj = a.get(this);
        C8632dsu.d(obj);
        dBJ<R>.a aVar = (a) obj;
        Object obj2 = this.h;
        c(aVar);
        return aVar.e(aVar.c(obj2), interfaceC8585dra);
    }

    @Override // o.AbstractC8742dww
    public void e(Throwable th) {
        Object obj;
        dAH dah;
        dAH dah2;
        dAH dah3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            dah = dBF.a;
            if (obj == dah) {
                return;
            }
            dah2 = dBF.b;
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, dah2));
        List<dBJ<R>.a> list = this.d;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).c();
        }
        dah3 = dBF.d;
        this.h = dah3;
        this.d = null;
    }

    /* loaded from: classes5.dex */
    public final class a {
        public Object a;
        public final Object b;
        public int c = -1;
        public final InterfaceC8612dsa<dBH<?>, Object, Object, drM<Throwable, dpR>> e;
        private final Object f;
        private final InterfaceC8612dsa<Object, dBH<?>, Object, dpR> h;
        private final Object i;
        private final InterfaceC8612dsa<Object, Object, Object, Object> j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, InterfaceC8612dsa<Object, ? super dBH<?>, Object, dpR> interfaceC8612dsa, InterfaceC8612dsa<Object, Object, Object, ? extends Object> interfaceC8612dsa2, Object obj2, Object obj3, InterfaceC8612dsa<? super dBH<?>, Object, Object, ? extends drM<? super Throwable, dpR>> interfaceC8612dsa3) {
            this.b = obj;
            this.h = interfaceC8612dsa;
            this.j = interfaceC8612dsa2;
            this.f = obj2;
            this.i = obj3;
            this.e = interfaceC8612dsa3;
        }

        public final boolean c(dBJ<R> dbj) {
            dAH dah;
            this.h.invoke(this.b, dbj, this.f);
            Object obj = ((dBJ) dbj).h;
            dah = dBF.d;
            return obj == dah;
        }

        public final Object c(Object obj) {
            return this.j.invoke(this.b, this.f, obj);
        }

        public final Object e(Object obj, InterfaceC8585dra<? super R> interfaceC8585dra) {
            Object obj2 = this.i;
            if (this.f == dBF.j()) {
                C8632dsu.d(obj2);
                return ((drM) obj2).invoke(interfaceC8585dra);
            }
            C8632dsu.d(obj2);
            return ((drX) obj2).invoke(obj, interfaceC8585dra);
        }

        public final void c() {
            Object obj = this.a;
            dBJ<R> dbj = dBJ.this;
            if (obj instanceof dAC) {
                ((dAC) obj).e(this.c, null, dbj.d());
                return;
            }
            InterfaceC8760dxn interfaceC8760dxn = obj instanceof InterfaceC8760dxn ? (InterfaceC8760dxn) obj : null;
            if (interfaceC8760dxn != null) {
                interfaceC8760dxn.co_();
            }
        }

        public final drM<Throwable, dpR> d(dBH<?> dbh, Object obj) {
            InterfaceC8612dsa<dBH<?>, Object, Object, drM<Throwable, dpR>> interfaceC8612dsa = this.e;
            if (interfaceC8612dsa != null) {
                return interfaceC8612dsa.invoke(dbh, this.f, obj);
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        r0 = r0.b();
        r1 = o.C8586drb.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
        if (r0 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        o.C8592drh.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
        r6 = o.C8586drb.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r0 != r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
        return o.dpR.c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(o.InterfaceC8585dra<? super o.dpR> r6) {
        /*
            r5 = this;
            o.dwv r0 = new o.dwv
            o.dra r1 = o.C8588drd.c(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.h()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = a()
        L11:
            java.lang.Object r2 = r1.get(r5)
            o.dAH r3 = o.dBF.e()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = a()
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            r0.a(r5)
            goto L65
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = a()
            o.dAH r4 = o.dBF.e()
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L44:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            a(r5, r3)
            goto L44
        L52:
            boolean r1 = r2 instanceof o.dBJ.a
            if (r1 == 0) goto L7c
            o.dpR r1 = o.dpR.c
            o.dBJ$a r2 = (o.dBJ.a) r2
            java.lang.Object r3 = d(r5)
            o.drM r2 = r2.d(r5, r3)
            r0.a(r1, r2)
        L65:
            java.lang.Object r0 = r0.b()
            java.lang.Object r1 = o.C8588drd.c()
            if (r0 != r1) goto L72
            o.C8592drh.c(r6)
        L72:
            java.lang.Object r6 = o.C8588drd.c()
            if (r0 != r6) goto L79
            return r0
        L79:
            o.dpR r6 = o.dpR.c
            return r6
        L7c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "unexpected state: "
            r6.append(r0)
            r6.append(r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dBJ.e(o.dra):java.lang.Object");
    }

    private final void c(dBJ<R>.a aVar) {
        dAH dah;
        dAH dah2;
        List<dBJ<R>.a> list = this.d;
        if (list == null) {
            return;
        }
        for (dBJ<R>.a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.c();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        dah = dBF.a;
        atomicReferenceFieldUpdater.set(this, dah);
        dah2 = dBF.d;
        this.h = dah2;
        this.d = null;
    }
}
