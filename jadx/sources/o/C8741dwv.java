package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.CompletionHandlerException;
import o.dxD;

/* renamed from: o.dwv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8741dwv<T> extends AbstractC8754dxh<T> implements InterfaceC8743dwx<T>, InterfaceC8594drj, InterfaceC8783dyj {
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    private final dqZ d;
    private final InterfaceC8585dra<T> i;
    private static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C8741dwv.class, "_decisionAndIndex");
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(C8741dwv.class, Object.class, "_state");
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C8741dwv.class, Object.class, "_parentHandle");

    @Override // o.AbstractC8754dxh
    public final InterfaceC8585dra<T> a() {
        return this.i;
    }

    @Override // o.InterfaceC8585dra
    public dqZ getContext() {
        return this.d;
    }

    protected String i() {
        return "CancellableContinuation";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8741dwv(InterfaceC8585dra<? super T> interfaceC8585dra, int i) {
        super(i);
        this.i = interfaceC8585dra;
        this.d = interfaceC8585dra.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C8734dwo.c;
    }

    private final InterfaceC8760dxn n() {
        return (InterfaceC8760dxn) a.get(this);
    }

    public final Object f() {
        return e.get(this);
    }

    @Override // o.InterfaceC8743dwx
    public boolean d() {
        return f() instanceof dxW;
    }

    @Override // o.InterfaceC8743dwx
    public boolean e() {
        return !(f() instanceof dxW);
    }

    private final String k() {
        Object f = f();
        return f instanceof dxW ? "Active" : f instanceof dwA ? "Cancelled" : "Completed";
    }

    public void h() {
        InterfaceC8760dxn l = l();
        if (l != null && e()) {
            l.co_();
            a.set(this, dxR.b);
        }
    }

    private final boolean s() {
        if (C8755dxi.d(this.b)) {
            InterfaceC8585dra<T> interfaceC8585dra = this.i;
            C8632dsu.d(interfaceC8585dra);
            if (((C7655dAl) interfaceC8585dra).b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof dwL) && ((dwL) obj).a != null) {
            c();
            return false;
        }
        c.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C8734dwo.c);
        return true;
    }

    @Override // o.InterfaceC8594drj
    public InterfaceC8594drj getCallerFrame() {
        InterfaceC8585dra<T> interfaceC8585dra = this.i;
        if (interfaceC8585dra instanceof InterfaceC8594drj) {
            return (InterfaceC8594drj) interfaceC8585dra;
        }
        return null;
    }

    @Override // o.AbstractC8754dxh
    public Object o() {
        return f();
    }

    @Override // o.AbstractC8754dxh
    public void b(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof dxW) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof dwO) {
                return;
            }
            if (obj2 instanceof dwL) {
                dwL dwl = (dwL) obj2;
                if (!(!dwl.a())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, obj2, dwL.d(dwl, null, null, null, null, th, 15, null))) {
                    dwl.c(this, th);
                    return;
                }
            } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, obj2, new dwL(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    private final boolean a(Throwable th) {
        if (s()) {
            InterfaceC8585dra<T> interfaceC8585dra = this.i;
            C8632dsu.d(interfaceC8585dra);
            return ((C7655dAl) interfaceC8585dra).c(th);
        }
        return false;
    }

    @Override // o.InterfaceC8743dwx
    public boolean c(Throwable th) {
        Object obj;
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z = false;
            if (!(obj instanceof dxW)) {
                return false;
            }
            if ((obj instanceof AbstractC8744dwy) || (obj instanceof dAC)) {
                z = true;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, obj, new dwA(this, th, z)));
        dxW dxw = (dxW) obj;
        if (dxw instanceof AbstractC8744dwy) {
            c((AbstractC8744dwy) obj, th);
        } else if (dxw instanceof dAC) {
            d((dAC) obj, th);
        }
        m();
        d(this.b);
        return true;
    }

    public final void b(Throwable th) {
        if (a(th)) {
            return;
        }
        c(th);
        m();
    }

    public final void c(AbstractC8744dwy abstractC8744dwy, Throwable th) {
        try {
            abstractC8744dwy.e(th);
        } catch (Throwable th2) {
            dqZ context = getContext();
            dwS.a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final void d(dAC<?> dac, Throwable th) {
        int i = c.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            dac.e(i, th, getContext());
        } catch (Throwable th2) {
            dqZ context = getContext();
            dwS.a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void d(drM<? super Throwable, dpR> drm, Throwable th) {
        try {
            drm.invoke(th);
        } catch (Throwable th2) {
            dqZ context = getContext();
            dwS.a(context, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public Throwable e(dxD dxd) {
        return dxd.i();
    }

    private final boolean p() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!c.compareAndSet(this, i, (536870911 & i) + 536870912));
        return true;
    }

    private final boolean t() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!c.compareAndSet(this, i, (536870911 & i) + 1073741824));
        return true;
    }

    public final Object b() {
        dxD dxd;
        Object e2;
        boolean s = s();
        if (p()) {
            if (n() == null) {
                l();
            }
            if (s) {
                j();
            }
            e2 = C8586drb.e();
            return e2;
        }
        if (s) {
            j();
        }
        Object f = f();
        if (!(f instanceof dwO)) {
            if (C8755dxi.b(this.b) && (dxd = (dxD) getContext().get(dxD.b)) != null && !dxd.cu_()) {
                CancellationException i = dxd.i();
                b(f, i);
                throw i;
            }
            return c(f);
        }
        throw ((dwO) f).a;
    }

    private final InterfaceC8760dxn l() {
        dxD dxd = (dxD) getContext().get(dxD.b);
        if (dxd == null) {
            return null;
        }
        InterfaceC8760dxn b = dxD.b.b(dxd, true, false, new dwC(this), 2, null);
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(a, this, null, b);
        return b;
    }

    public final void j() {
        Throwable c2;
        InterfaceC8585dra<T> interfaceC8585dra = this.i;
        C7655dAl c7655dAl = interfaceC8585dra instanceof C7655dAl ? (C7655dAl) interfaceC8585dra : null;
        if (c7655dAl == null || (c2 = c7655dAl.c((InterfaceC8743dwx<?>) this)) == null) {
            return;
        }
        c();
        c(c2);
    }

    @Override // o.InterfaceC8585dra
    public void resumeWith(Object obj) {
        c(this, dwN.b(obj, this), this.b, null, 4, null);
    }

    @Override // o.InterfaceC8743dwx
    public void a(T t, drM<? super Throwable, dpR> drm) {
        b(t, this.b, drm);
    }

    @Override // o.InterfaceC8783dyj
    public void c(dAC<?> dac, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        d(dac);
    }

    @Override // o.InterfaceC8743dwx
    public void a(drM<? super Throwable, dpR> drm) {
        d(c(drm));
    }

    private final void d(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C8734dwo) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof AbstractC8744dwy) || (obj2 instanceof dAC)) {
                e(obj, obj2);
            } else {
                boolean z = obj2 instanceof dwO;
                if (z) {
                    dwO dwo = (dwO) obj2;
                    if (!dwo.c()) {
                        e(obj, obj2);
                    }
                    if (obj2 instanceof dwA) {
                        if (!z) {
                            dwo = null;
                        }
                        Throwable th = dwo != null ? dwo.a : null;
                        if (obj instanceof AbstractC8744dwy) {
                            c((AbstractC8744dwy) obj, th);
                            return;
                        }
                        C8632dsu.d(obj);
                        d((dAC) obj, th);
                        return;
                    }
                    return;
                } else if (obj2 instanceof dwL) {
                    dwL dwl = (dwL) obj2;
                    if (dwl.b != null) {
                        e(obj, obj2);
                    }
                    if (obj instanceof dAC) {
                        return;
                    }
                    C8632dsu.d(obj);
                    AbstractC8744dwy abstractC8744dwy = (AbstractC8744dwy) obj;
                    if (dwl.a()) {
                        c(abstractC8744dwy, dwl.e);
                        return;
                    } else {
                        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, obj2, dwL.d(dwl, null, abstractC8744dwy, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else if (obj instanceof dAC) {
                    return;
                } else {
                    C8632dsu.d(obj);
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, obj2, new dwL(obj2, (AbstractC8744dwy) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final void e(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final AbstractC8744dwy c(drM<? super Throwable, dpR> drm) {
        return drm instanceof AbstractC8744dwy ? (AbstractC8744dwy) drm : new dxB(drm);
    }

    private final void d(int i) {
        if (t()) {
            return;
        }
        C8755dxi.c(this, i);
    }

    private final Object c(dxW dxw, Object obj, int i, drM<? super Throwable, dpR> drm, Object obj2) {
        if (obj instanceof dwO) {
            return obj;
        }
        if (C8755dxi.b(i) || obj2 != null) {
            if (drm == null && !(dxw instanceof AbstractC8744dwy) && obj2 == null) {
                return obj;
            }
            return new dwL(obj, dxw instanceof AbstractC8744dwy ? (AbstractC8744dwy) dxw : null, drm, obj2, null, 16, null);
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void c(C8741dwv c8741dwv, Object obj, int i, drM drm, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            drm = null;
        }
        c8741dwv.b(obj, i, drm);
    }

    private final void b(Object obj, int i, drM<? super Throwable, dpR> drm) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof dxW) {
            } else {
                if (obj2 instanceof dwA) {
                    dwA dwa = (dwA) obj2;
                    if (dwa.e()) {
                        if (drm != null) {
                            d(drm, dwa.a);
                            return;
                        }
                        return;
                    }
                }
                e(obj);
                throw new KotlinNothingValueException();
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, obj2, c((dxW) obj2, obj, i, drm, null)));
        m();
        d(i);
    }

    private final dAH a(Object obj, Object obj2, drM<? super Throwable, dpR> drm) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof dxW) {
            } else if ((obj3 instanceof dwL) && obj2 != null && ((dwL) obj3).a == obj2) {
                return C8745dwz.d;
            } else {
                return null;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, obj3, c((dxW) obj3, obj, this.b, drm, obj2)));
        m();
        return C8745dwz.d;
    }

    private final Void e(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void m() {
        if (s()) {
            return;
        }
        c();
    }

    public final void c() {
        InterfaceC8760dxn n = n();
        if (n == null) {
            return;
        }
        n.co_();
        a.set(this, dxR.b);
    }

    @Override // o.InterfaceC8743dwx
    public Object e(T t, Object obj, drM<? super Throwable, dpR> drm) {
        return a(t, obj, drm);
    }

    @Override // o.InterfaceC8743dwx
    public Object d(Throwable th) {
        return a(new dwO(th, false, 2, null), null, null);
    }

    @Override // o.InterfaceC8743dwx
    public void b(Object obj) {
        d(this.b);
    }

    @Override // o.InterfaceC8743dwx
    public void e(dwQ dwq, T t) {
        InterfaceC8585dra<T> interfaceC8585dra = this.i;
        C7655dAl c7655dAl = interfaceC8585dra instanceof C7655dAl ? (C7655dAl) interfaceC8585dra : null;
        c(this, t, (c7655dAl != null ? c7655dAl.d : null) == dwq ? 4 : this.b, null, 4, null);
    }

    @Override // o.InterfaceC8743dwx
    public void c(dwQ dwq, Throwable th) {
        InterfaceC8585dra<T> interfaceC8585dra = this.i;
        C7655dAl c7655dAl = interfaceC8585dra instanceof C7655dAl ? (C7655dAl) interfaceC8585dra : null;
        c(this, new dwO(th, false, 2, null), (c7655dAl != null ? c7655dAl.d : null) == dwq ? 4 : this.b, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8754dxh
    public <T> T c(Object obj) {
        return obj instanceof dwL ? (T) ((dwL) obj).d : obj;
    }

    @Override // o.AbstractC8754dxh
    public Throwable a(Object obj) {
        Throwable a2 = super.a(obj);
        if (a2 != null) {
            return a2;
        }
        return null;
    }

    public String toString() {
        return i() + '(' + dwW.e(this.i) + "){" + k() + "}@" + dwW.a(this);
    }
}
