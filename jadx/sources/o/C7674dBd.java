package o;

import io.reactivex.ObservableEmitter;
import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o.dBK;

/* renamed from: o.dBd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7674dBd<T> extends AbstractC8730dwk<dpR> implements dyK<T> {
    private static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(C7674dBd.class, "_signal");
    private volatile int _signal;
    private final dBK a;
    private final ObservableEmitter<T> d;

    @Override // o.dyK
    public dyI<T> u() {
        return this;
    }

    @Override // o.dyI
    public /* synthetic */ void d(drM drm) {
        a((drM<? super Throwable, dpR>) drm);
    }

    public C7674dBd(dqZ dqz, ObservableEmitter<T> observableEmitter) {
        super(dqz, false, true);
        this.d = observableEmitter;
        this.a = dBL.d(false, 1, null);
    }

    @Override // o.dyI
    public boolean n() {
        return !cu_();
    }

    @Override // o.dyI
    public boolean b(Throwable th) {
        return a_(th);
    }

    public Void a(drM<? super Throwable, dpR> drm) {
        throw new UnsupportedOperationException("RxObservableCoroutine doesn't support invokeOnClose");
    }

    @Override // o.dyI
    public Object d(T t) {
        if (!dBK.b.a(this.a, null, 1, null)) {
            return C8797dyx.b.d();
        }
        Throwable g = g((C7674dBd<T>) t);
        if (g == null) {
            return C8797dyx.b.d(dpR.c);
        }
        return C8797dyx.b.a(g);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // o.dyI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(T r5, o.InterfaceC8585dra<? super o.dpR> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.rx2.RxObservableCoroutine$send$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.rx2.RxObservableCoroutine$send$1 r0 = (kotlinx.coroutines.rx2.RxObservableCoroutine$send$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.rx2.RxObservableCoroutine$send$1 r0 = new kotlinx.coroutines.rx2.RxObservableCoroutine$send$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.e
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.b
            java.lang.Object r0 = r0.d
            o.dBd r0 = (o.C7674dBd) r0
            o.C8556dpz.d(r6)
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            o.C8556dpz.d(r6)
            o.dBK r6 = r4.a
            r0.d = r4
            r0.b = r5
            r0.c = r3
            r2 = 0
            java.lang.Object r6 = o.dBK.b.b(r6, r2, r0, r3, r2)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r0 = r4
        L4b:
            java.lang.Throwable r5 = r0.g(r5)
            if (r5 != 0) goto L54
            o.dpR r5 = o.dpR.c
            return r5
        L54:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7674dBd.a(java.lang.Object, o.dra):java.lang.Object");
    }

    private final Throwable g(T t) {
        if (!cu_()) {
            a(r(), q());
            return i();
        }
        try {
            this.d.onNext(t);
            v();
            return null;
        } catch (Throwable th) {
            UndeliverableException undeliverableException = new UndeliverableException(th);
            boolean b = b((Throwable) undeliverableException);
            v();
            if (b) {
                return undeliverableException;
            }
            dAX.e(undeliverableException, getContext());
            return i();
        }
    }

    private final void v() {
        dBK.b.d(this.a, null, 1, null);
        if (cu_() || !dBK.b.a(this.a, null, 1, null)) {
            return;
        }
        a(r(), q());
    }

    private final void a(Throwable th, boolean z) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        dBK dbk;
        try {
            atomicIntegerFieldUpdater = e;
        } catch (Throwable th2) {
            dBK.b.d(this.a, null, 1, null);
            throw th2;
        }
        if (atomicIntegerFieldUpdater.get(this) != -2) {
            atomicIntegerFieldUpdater.set(this, -2);
            CancellationException cancellationException = th != null ? th : null;
            if (cancellationException == null) {
                try {
                    this.d.onComplete();
                } catch (Exception e2) {
                    dAX.e(e2, getContext());
                }
                dbk = this.a;
            } else {
                if ((cancellationException instanceof UndeliverableException) && !z) {
                    dAX.e(th, getContext());
                } else if (cancellationException != i() || !this.d.isDisposed()) {
                    try {
                        this.d.onError(th);
                    } catch (Exception e3) {
                        C8553dpw.c(th, e3);
                        dAX.e(th, getContext());
                    }
                }
                dbk = this.a;
            }
            dBK.b.d(this.a, null, 1, null);
            throw th2;
        }
        dbk = this.a;
        dBK.b.d(dbk, null, 1, null);
    }

    private final void e(Throwable th, boolean z) {
        if (e.compareAndSet(this, 0, -1) && dBK.b.a(this.a, null, 1, null)) {
            a(th, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC8730dwk
    /* renamed from: c */
    public void a(dpR dpr) {
        e((Throwable) null, false);
    }

    @Override // o.AbstractC8730dwk
    public void b(Throwable th, boolean z) {
        e(th, z);
    }
}
