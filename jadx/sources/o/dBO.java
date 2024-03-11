package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.dBH;
import o.dBO;
import o.dpR;
import o.drM;

/* loaded from: classes5.dex */
public class dBO extends dBN implements dBK {
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(dBO.class, Object.class, "owner");
    private final InterfaceC8612dsa<dBH<?>, Object, Object, drM<Throwable, dpR>> c;
    private volatile Object owner;

    @Override // o.dBK
    public Object a(Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return c(this, obj, interfaceC8585dra);
    }

    public dBO(boolean z) {
        super(1, z ? 1 : 0);
        this.owner = z ? null : dBL.a;
        this.c = new InterfaceC8612dsa<dBH<?>, Object, Object, drM<? super Throwable, ? extends dpR>>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            /* renamed from: a */
            public final drM<Throwable, dpR> invoke(dBH<?> dbh, final Object obj, Object obj2) {
                final dBO dbo = dBO.this;
                return new drM<Throwable, dpR>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void e(Throwable th) {
                        dBO.this.d(obj);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        e(th);
                        return dpR.c;
                    }
                };
            }
        };
    }

    public boolean e() {
        return b() == 0;
    }

    private final int c(Object obj) {
        dAH dah;
        while (e()) {
            Object obj2 = d.get(this);
            dah = dBL.a;
            if (obj2 != dah) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object c(dBO dbo, Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e2;
        if (dbo.e(obj)) {
            return dpR.c;
        }
        Object c = dbo.c(obj, interfaceC8585dra);
        e2 = C8586drb.e();
        return c == e2 ? c : dpR.c;
    }

    @Override // o.dBK
    public boolean e(Object obj) {
        int a = a(obj);
        if (a != 0) {
            if (a != 1) {
                if (a == 2) {
                    throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
                }
                throw new IllegalStateException("unexpected".toString());
            }
            return false;
        }
        return true;
    }

    private final int a(Object obj) {
        while (!d()) {
            if (obj == null) {
                return 1;
            }
            int c = c(obj);
            if (c == 1) {
                return 2;
            }
            if (c == 2) {
                return 1;
            }
        }
        d.set(this, obj);
        return 0;
    }

    @Override // o.dBK
    public void d(Object obj) {
        dAH dah;
        dAH dah2;
        while (e()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            dah = dBL.a;
            if (obj2 != dah) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                dah2 = dBL.a;
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj2, dah2)) {
                    a();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    /* loaded from: classes5.dex */
    public final class e implements InterfaceC8743dwx<dpR>, InterfaceC8783dyj {
        public final C8741dwv<dpR> c;
        public final Object e;

        @Override // o.InterfaceC8743dwx
        public void a(drM<? super Throwable, dpR> drm) {
            this.c.a(drm);
        }

        @Override // o.InterfaceC8743dwx
        public void b(Object obj) {
            this.c.b(obj);
        }

        @Override // o.InterfaceC8783dyj
        public void c(dAC<?> dac, int i) {
            this.c.c(dac, i);
        }

        @Override // o.InterfaceC8743dwx
        public void c(dwQ dwq, Throwable th) {
            this.c.c(dwq, th);
        }

        @Override // o.InterfaceC8743dwx
        /* renamed from: c */
        public void e(dwQ dwq, dpR dpr) {
            this.c.e(dwq, (dwQ) dpr);
        }

        @Override // o.InterfaceC8743dwx
        public boolean c(Throwable th) {
            return this.c.c(th);
        }

        @Override // o.InterfaceC8743dwx
        public Object d(Throwable th) {
            return this.c.d(th);
        }

        @Override // o.InterfaceC8743dwx
        public boolean d() {
            return this.c.d();
        }

        @Override // o.InterfaceC8743dwx
        public boolean e() {
            return this.c.e();
        }

        @Override // o.InterfaceC8585dra
        public dqZ getContext() {
            return this.c.getContext();
        }

        @Override // o.InterfaceC8585dra
        public void resumeWith(Object obj) {
            this.c.resumeWith(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(C8741dwv<? super dpR> c8741dwv, Object obj) {
            this.c = c8741dwv;
            this.e = obj;
        }

        @Override // o.InterfaceC8743dwx
        /* renamed from: b */
        public Object e(dpR dpr, Object obj, drM<? super Throwable, dpR> drm) {
            final dBO dbo = dBO.this;
            Object e = this.c.e(dpr, obj, new drM<Throwable, dpR>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$tryResume$token$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    d(th);
                    return dpR.c;
                }

                public final void d(Throwable th) {
                    dBO.d.set(dBO.this, this.e);
                    dBO.this.d(this.e);
                }
            });
            if (e != null) {
                dBO.d.set(dBO.this, this.e);
            }
            return e;
        }

        @Override // o.InterfaceC8743dwx
        /* renamed from: c */
        public void a(dpR dpr, drM<? super Throwable, dpR> drm) {
            dBO.d.set(dBO.this, this.e);
            C8741dwv<dpR> c8741dwv = this.c;
            final dBO dbo = dBO.this;
            c8741dwv.a(dpr, new drM<Throwable, dpR>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$resume$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(Throwable th) {
                    dBO.this.d(this.e);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    b(th);
                    return dpR.c;
                }
            });
        }
    }

    public String toString() {
        return "Mutex@" + dwW.a(this) + "[isLocked=" + e() + ",owner=" + d.get(this) + ']';
    }

    private final Object c(Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e2;
        Object e3;
        b = C8590drf.b(interfaceC8585dra);
        C8741dwv b2 = dwB.b(b);
        try {
            e((InterfaceC8743dwx<? super dpR>) new e(b2, obj));
            Object b3 = b2.b();
            e2 = C8586drb.e();
            if (b3 == e2) {
                C8592drh.c(interfaceC8585dra);
            }
            e3 = C8586drb.e();
            return b3 == e3 ? b3 : dpR.c;
        } catch (Throwable th) {
            b2.j();
            throw th;
        }
    }
}
