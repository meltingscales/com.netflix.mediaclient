package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport$children$1;
import kotlinx.coroutines.TimeoutCancellationException;
import o.C7664dAu;
import o.dqZ;
import o.dxD;

/* loaded from: classes5.dex */
public class dxM implements dwI, dxU {
    private volatile Object _parentHandle;
    private volatile Object _state;
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(dxM.class, Object.class, "_state");
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(dxM.class, Object.class, "_parentHandle");

    /* JADX INFO: Access modifiers changed from: protected */
    public String a() {
        return "Job was cancelled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Object obj) {
    }

    public boolean cr_() {
        return true;
    }

    public boolean cx_() {
        return false;
    }

    protected boolean d() {
        return false;
    }

    protected void e(Object obj) {
    }

    protected void f(Throwable th) {
    }

    @Override // o.dqZ.b
    public final dqZ.d<?> getKey() {
        return dxD.b;
    }

    protected boolean i(Throwable th) {
        return false;
    }

    protected void p() {
    }

    public dxM(boolean z) {
        this._state = z ? dxJ.b : dxJ.a;
    }

    @Override // o.dqZ
    public <R> R fold(R r, drX<? super R, ? super dqZ.b, ? extends R> drx) {
        return (R) dxD.b.d(this, r, drx);
    }

    @Override // o.dqZ.b, o.dqZ
    public <E extends dqZ.b> E get(dqZ.d<E> dVar) {
        return (E) dxD.b.a(this, dVar);
    }

    public /* synthetic */ void m() {
        e((CancellationException) null);
    }

    @Override // o.dqZ
    public dqZ minusKey(dqZ.d<?> dVar) {
        return dxD.b.d(this, dVar);
    }

    @Override // o.dqZ
    public dqZ plus(dqZ dqz) {
        return dxD.b.c(this, dqz);
    }

    /* loaded from: classes5.dex */
    public static final class c extends C7664dAu.b {
        final /* synthetic */ Object b;
        final /* synthetic */ dxM e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C7664dAu c7664dAu, dxM dxm, Object obj) {
            super(c7664dAu);
            this.e = dxm;
            this.b = obj;
        }

        @Override // o.AbstractC7649dAf
        /* renamed from: c */
        public Object a(C7664dAu c7664dAu) {
            if (this.e.cy_() == this.b) {
                return null;
            }
            return C7666dAw.c();
        }
    }

    public final dwE t() {
        return (dwE) a.get(this);
    }

    public final void d(dwE dwe) {
        a.set(this, dwe);
    }

    @Override // o.dxD
    public dxD j() {
        dwE t = t();
        if (t != null) {
            return t.a();
        }
        return null;
    }

    public final void a(dxD dxd) {
        if (dxd == null) {
            d((dwE) dxR.b);
            return;
        }
        dxd.o();
        dwE c2 = dxd.c(this);
        d(c2);
        if (k()) {
            c2.co_();
            d((dwE) dxR.b);
        }
    }

    public final Object cy_() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof dAA)) {
                return obj;
            }
            ((dAA) obj).d(this);
        }
    }

    @Override // o.dxD
    public boolean cu_() {
        Object cy_ = cy_();
        return (cy_ instanceof dxA) && ((dxA) cy_).d();
    }

    @Override // o.dxD
    public final boolean k() {
        return !(cy_() instanceof dxA);
    }

    @Override // o.dxD
    public final boolean g() {
        Object cy_ = cy_();
        return (cy_ instanceof dwO) || ((cy_ instanceof a) && ((a) cy_).b());
    }

    private final Object e(a aVar, Object obj) {
        boolean b;
        Throwable a2;
        dwO dwo = obj instanceof dwO ? (dwO) obj : null;
        Throwable th = dwo != null ? dwo.a : null;
        synchronized (aVar) {
            b = aVar.b();
            List<Throwable> d2 = aVar.d(th);
            a2 = a(aVar, (List<? extends Throwable>) d2);
            if (a2 != null) {
                c(a2, (List<? extends Throwable>) d2);
            }
        }
        if (a2 != null && a2 != th) {
            obj = new dwO(a2, false, 2, null);
        }
        if (a2 != null && (a(a2) || i(a2))) {
            C8632dsu.d(obj);
            ((dwO) obj).c();
        }
        if (!b) {
            f(a2);
        }
        e(obj);
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, aVar, dxJ.b(obj));
        b(aVar, obj);
        return obj;
    }

    private final Throwable a(a aVar, List<? extends Throwable> list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (aVar.b()) {
                return new JobCancellationException(a(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final void c(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                C8553dpw.c(th, th2);
            }
        }
    }

    private final boolean e(dxA dxa, Object obj) {
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, dxa, dxJ.b(obj))) {
            f((Throwable) null);
            e(obj);
            b(dxa, obj);
            return true;
        }
        return false;
    }

    private final void b(dxA dxa, Object obj) {
        dwE t = t();
        if (t != null) {
            t.co_();
            d((dwE) dxR.b);
        }
        dwO dwo = obj instanceof dwO ? (dwO) obj : null;
        Throwable th = dwo != null ? dwo.a : null;
        if (dxa instanceof dxL) {
            try {
                ((dxL) dxa).e(th);
                return;
            } catch (Throwable th2) {
                e((Throwable) new CompletionHandlerException("Exception in completion handler " + dxa + " for " + this, th2));
                return;
            }
        }
        dxQ cp_ = dxa.cp_();
        if (cp_ != null) {
            e(cp_, th);
        }
    }

    private final void d(dxQ dxq, Throwable th) {
        f(th);
        Object g = dxq.g();
        C8632dsu.d(g);
        CompletionHandlerException completionHandlerException = null;
        for (C7664dAu c7664dAu = (C7664dAu) g; !C8632dsu.c(c7664dAu, dxq); c7664dAu = c7664dAu.j()) {
            if (c7664dAu instanceof dxE) {
                dxL dxl = (dxL) c7664dAu;
                try {
                    dxl.e(th);
                } catch (Throwable th2) {
                    if (completionHandlerException == null) {
                        CompletionHandlerException completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + dxl + " for " + this, th2);
                        dpR dpr = dpR.c;
                        completionHandlerException = completionHandlerException2;
                    } else {
                        C8553dpw.c(completionHandlerException, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            e((Throwable) completionHandlerException);
        }
        a(th);
    }

    private final boolean a(Throwable th) {
        if (d()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        dwE t = t();
        return (t == null || t == dxR.b) ? z : t.b(th) || z;
    }

    private final int g(Object obj) {
        C8756dxj c8756dxj;
        if (obj instanceof C8756dxj) {
            if (((C8756dxj) obj).d()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            c8756dxj = dxJ.b;
            if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, c8756dxj)) {
                p();
                return 1;
            }
            return -1;
        } else if (obj instanceof dxC) {
            if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, obj, ((dxC) obj).cp_())) {
                p();
                return 1;
            }
            return -1;
        } else {
            return 0;
        }
    }

    @Override // o.dxD
    public final CancellationException i() {
        Object cy_ = cy_();
        if (cy_ instanceof a) {
            Throwable c2 = ((a) cy_).c();
            if (c2 != null) {
                CancellationException c3 = c(c2, dwW.c(this) + " is cancelling");
                if (c3 != null) {
                    return c3;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (cy_ instanceof dxA) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (cy_ instanceof dwO) {
            return c(this, ((dwO) cy_).a, null, 1, null);
        } else {
            return new JobCancellationException(dwW.c(this) + " has completed normally", null, this);
        }
    }

    public static /* synthetic */ CancellationException c(dxM dxm, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return dxm.c(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    protected final CancellationException c(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = a();
            }
            return new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    public final Throwable r() {
        Object cy_ = cy_();
        if (cy_ instanceof a) {
            Throwable c2 = ((a) cy_).c();
            if (c2 != null) {
                return c2;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (cy_ instanceof dxA) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (cy_ instanceof dwO) {
            return ((dwO) cy_).a;
        } else {
            return null;
        }
    }

    public final boolean q() {
        Object cy_ = cy_();
        return (cy_ instanceof dwO) && ((dwO) cy_).d();
    }

    @Override // o.dxD
    public final InterfaceC8760dxn e(drM<? super Throwable, dpR> drm) {
        return c(false, true, drm);
    }

    @Override // o.dxD
    public final InterfaceC8760dxn c(boolean z, boolean z2, drM<? super Throwable, dpR> drm) {
        dxL d2 = d(drm, z);
        while (true) {
            Object cy_ = cy_();
            if (cy_ instanceof C8756dxj) {
                C8756dxj c8756dxj = (C8756dxj) cy_;
                if (c8756dxj.d()) {
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, cy_, d2)) {
                        return d2;
                    }
                } else {
                    b(c8756dxj);
                }
            } else {
                if (cy_ instanceof dxA) {
                    dxQ cp_ = ((dxA) cy_).cp_();
                    if (cp_ == null) {
                        C8632dsu.d(cy_);
                        e((dxL) cy_);
                    } else {
                        InterfaceC8760dxn interfaceC8760dxn = dxR.b;
                        if (z && (cy_ instanceof a)) {
                            synchronized (cy_) {
                                r3 = ((a) cy_).c();
                                if (r3 == null || ((drm instanceof dwD) && !((a) cy_).a())) {
                                    if (b(cy_, cp_, d2)) {
                                        if (r3 == null) {
                                            return d2;
                                        }
                                        interfaceC8760dxn = d2;
                                    }
                                }
                                dpR dpr = dpR.c;
                            }
                        }
                        if (r3 != null) {
                            if (z2) {
                                drm.invoke(r3);
                            }
                            return interfaceC8760dxn;
                        } else if (b(cy_, cp_, d2)) {
                            return d2;
                        }
                    }
                } else {
                    if (z2) {
                        dwO dwo = cy_ instanceof dwO ? (dwO) cy_ : null;
                        drm.invoke(dwo != null ? dwo.a : null);
                    }
                    return dxR.b;
                }
            }
        }
    }

    private final dxL d(drM<? super Throwable, dpR> drm, boolean z) {
        dxL dxl;
        if (z) {
            dxl = drm instanceof dxE ? (dxE) drm : null;
            if (dxl == null) {
                dxl = new C8772dxz(drm);
            }
        } else {
            dxl = drm instanceof dxL ? (dxL) drm : null;
            if (dxl == null) {
                dxl = new dxH(drm);
            }
        }
        dxl.d(this);
        return dxl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [o.dxC] */
    private final void b(C8756dxj c8756dxj) {
        dxQ dxq = new dxQ();
        if (!c8756dxj.d()) {
            dxq = new dxC(dxq);
        }
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, c8756dxj, dxq);
    }

    private final void e(dxL dxl) {
        dxl.c(new dxQ());
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, dxl, dxl.j());
    }

    @Override // o.dxD
    public final Object a_(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        if (!w()) {
            dxG.d(interfaceC8585dra.getContext());
            return dpR.c;
        }
        Object a2 = a(interfaceC8585dra);
        return a2 == C8588drd.c() ? a2 : dpR.c;
    }

    public void d(Throwable th) {
        c(th);
    }

    @Override // o.dwI
    public final void e(dxU dxu) {
        c(dxu);
    }

    public boolean h(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return c(th) && cr_();
    }

    public final boolean a_(Throwable th) {
        return c(th);
    }

    public final boolean c(Object obj) {
        Object obj2;
        dAH dah;
        dAH dah2;
        dAH dah3;
        obj2 = dxJ.e;
        if (cx_() && (obj2 = d(obj)) == dxJ.c) {
            return true;
        }
        dah = dxJ.e;
        if (obj2 == dah) {
            obj2 = f(obj);
        }
        dah2 = dxJ.e;
        if (obj2 == dah2 || obj2 == dxJ.c) {
            return true;
        }
        dah3 = dxJ.h;
        if (obj2 == dah3) {
            return false;
        }
        b(obj2);
        return true;
    }

    @Override // o.dxU
    public CancellationException l() {
        Throwable th;
        Object cy_ = cy_();
        if (cy_ instanceof a) {
            th = ((a) cy_).c();
        } else if (cy_ instanceof dwO) {
            th = ((dwO) cy_).a;
        } else if (cy_ instanceof dxA) {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + cy_).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        if (cancellationException == null) {
            return new JobCancellationException("Parent job is " + o(cy_), th, this);
        }
        return cancellationException;
    }

    private final Throwable a(Object obj) {
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(a(), null, this) : th;
        }
        C8632dsu.d(obj);
        return ((dxU) obj).l();
    }

    private final dxQ d(dxA dxa) {
        dxQ cp_ = dxa.cp_();
        if (cp_ == null) {
            if (dxa instanceof C8756dxj) {
                return new dxQ();
            }
            if (dxa instanceof dxL) {
                e((dxL) dxa);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + dxa).toString());
        }
        return cp_;
    }

    private final boolean d(dxA dxa, Throwable th) {
        dxQ d2 = d(dxa);
        if (d2 == null) {
            return false;
        }
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, dxa, new a(d2, false, th))) {
            d(d2, th);
            return true;
        }
        return false;
    }

    private final Object c(Object obj, Object obj2) {
        dAH dah;
        dAH dah2;
        if (!(obj instanceof dxA)) {
            dah2 = dxJ.e;
            return dah2;
        } else if (((obj instanceof C8756dxj) || (obj instanceof dxL)) && !(obj instanceof dwD) && !(obj2 instanceof dwO)) {
            if (e((dxA) obj, obj2)) {
                return obj2;
            }
            dah = dxJ.d;
            return dah;
        } else {
            return a((dxA) obj, obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object a(dxA dxa, Object obj) {
        dAH dah;
        dAH dah2;
        dAH dah3;
        dxQ d2 = d(dxa);
        if (d2 == null) {
            dah3 = dxJ.d;
            return dah3;
        }
        a aVar = dxa instanceof a ? (a) dxa : null;
        if (aVar == null) {
            aVar = new a(d2, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (aVar) {
            if (aVar.a()) {
                dah2 = dxJ.e;
                return dah2;
            }
            aVar.e(true);
            if (aVar != dxa && !AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, dxa, aVar)) {
                dah = dxJ.d;
                return dah;
            }
            boolean b = aVar.b();
            dwO dwo = obj instanceof dwO ? (dwO) obj : null;
            if (dwo != null) {
                aVar.e(dwo.a);
            }
            ?? c2 = Boolean.valueOf(true ^ b).booleanValue() ? aVar.c() : 0;
            objectRef.d = c2;
            dpR dpr = dpR.c;
            if (c2 != 0) {
                d(d2, (Throwable) c2);
            }
            dwD b2 = b(dxa);
            if (b2 != null && e(aVar, b2, obj)) {
                return dxJ.c;
            }
            return e(aVar, obj);
        }
    }

    private final Throwable i(Object obj) {
        dwO dwo = obj instanceof dwO ? (dwO) obj : null;
        if (dwo != null) {
            return dwo.a;
        }
        return null;
    }

    private final dwD b(dxA dxa) {
        dwD dwd = dxa instanceof dwD ? (dwD) dxa : null;
        if (dwd == null) {
            dxQ cp_ = dxa.cp_();
            if (cp_ != null) {
                return b((C7664dAu) cp_);
            }
            return null;
        }
        return dwd;
    }

    private final boolean e(a aVar, dwD dwd, Object obj) {
        while (dxD.b.b(dwd.e, false, false, new d(this, aVar, dwd, obj), 1, null) == dxR.b) {
            dwd = b((C7664dAu) dwd);
            if (dwd == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(a aVar, dwD dwd, Object obj) {
        dwD b = b((C7664dAu) dwd);
        if (b == null || !e(aVar, b, obj)) {
            b(e(aVar, obj));
        }
    }

    private final dwD b(C7664dAu c7664dAu) {
        while (c7664dAu.cq_()) {
            c7664dAu = c7664dAu.h();
        }
        while (true) {
            c7664dAu = c7664dAu.j();
            if (!c7664dAu.cq_()) {
                if (c7664dAu instanceof dwD) {
                    return (dwD) c7664dAu;
                }
                if (c7664dAu instanceof dxQ) {
                    return null;
                }
            }
        }
    }

    @Override // o.dxD
    public final dtQ<dxD> cv_() {
        dtQ<dxD> e2;
        e2 = dtV.e(new JobSupport$children$1(this, null));
        return e2;
    }

    @Override // o.dxD
    public final dwE c(dwI dwi) {
        InterfaceC8760dxn b = dxD.b.b(this, true, false, new dwD(dwi), 2, null);
        C8632dsu.d(b);
        return (dwE) b;
    }

    public void e(Throwable th) {
        throw th;
    }

    public String toString() {
        return x() + '@' + dwW.a(this);
    }

    public final String x() {
        return c() + '{' + o(cy_()) + '}';
    }

    public String c() {
        return dwW.c(this);
    }

    private final String o(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (aVar.b()) {
                return "Cancelling";
            }
            if (aVar.a()) {
                return "Completing";
            }
        } else if (!(obj instanceof dxA)) {
            return obj instanceof dwO ? "Cancelled" : "Completed";
        } else if (!((dxA) obj).d()) {
            return "New";
        }
        return "Active";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a implements dxA {
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;
        private final dxQ c;
        private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isCompleting");
        private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_rootCause");
        private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_exceptionsHolder");

        @Override // o.dxA
        public dxQ cp_() {
            return this.c;
        }

        public a(dxQ dxq, boolean z, Throwable th) {
            this.c = dxq;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        public final boolean a() {
            return b.get(this) != 0;
        }

        public final void e(boolean z) {
            b.set(this, z ? 1 : 0);
        }

        public final Throwable c() {
            return (Throwable) a.get(this);
        }

        public final void b(Throwable th) {
            a.set(this, th);
        }

        private final Object i() {
            return d.get(this);
        }

        private final void e(Object obj) {
            d.set(this, obj);
        }

        public final boolean j() {
            dAH dah;
            Object i = i();
            dah = dxJ.j;
            return i == dah;
        }

        public final boolean b() {
            return c() != null;
        }

        @Override // o.dxA
        public boolean d() {
            return c() == null;
        }

        public final List<Throwable> d(Throwable th) {
            ArrayList<Throwable> arrayList;
            dAH dah;
            Object i = i();
            if (i == null) {
                arrayList = g();
            } else if (i instanceof Throwable) {
                ArrayList<Throwable> g = g();
                g.add(i);
                arrayList = g;
            } else if (!(i instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + i).toString());
            } else {
                arrayList = (ArrayList) i;
            }
            Throwable c = c();
            if (c != null) {
                arrayList.add(0, c);
            }
            if (th != null && !C8632dsu.c(th, c)) {
                arrayList.add(th);
            }
            dah = dxJ.j;
            e(dah);
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void e(Throwable th) {
            Throwable c = c();
            if (c == null) {
                b(th);
            } else if (th == c) {
            } else {
                Object i = i();
                if (i == null) {
                    e((Object) th);
                } else if (i instanceof Throwable) {
                    if (th == i) {
                        return;
                    }
                    ArrayList<Throwable> g = g();
                    g.add(i);
                    g.add(th);
                    e(g);
                } else if (i instanceof ArrayList) {
                    ((ArrayList) i).add(th);
                } else {
                    throw new IllegalStateException(("State is " + i).toString());
                }
            }
        }

        private final ArrayList<Throwable> g() {
            return new ArrayList<>(4);
        }

        public String toString() {
            return "Finishing[cancelling=" + b() + ", completing=" + a() + ", rootCause=" + c() + ", exceptions=" + i() + ", list=" + cp_() + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends dxL {
        private final Object b;
        private final dxM c;
        private final a d;
        private final dwD e;

        @Override // o.drM
        public /* synthetic */ dpR invoke(Throwable th) {
            e(th);
            return dpR.c;
        }

        public d(dxM dxm, a aVar, dwD dwd, Object obj) {
            this.c = dxm;
            this.d = aVar;
            this.e = dwd;
            this.b = obj;
        }

        @Override // o.dwM
        public void e(Throwable th) {
            this.c.b(this.d, this.e, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e<T> extends C8741dwv<T> {
        private final dxM d;

        @Override // o.C8741dwv
        protected String i() {
            return "AwaitContinuation";
        }

        public e(InterfaceC8585dra<? super T> interfaceC8585dra, dxM dxm) {
            super(interfaceC8585dra, 1);
            this.d = dxm;
        }

        @Override // o.C8741dwv
        public Throwable e(dxD dxd) {
            Throwable c;
            Object cy_ = this.d.cy_();
            return (!(cy_ instanceof a) || (c = ((a) cy_).c()) == null) ? cy_ instanceof dwO ? ((dwO) cy_).a : dxd.i() : c;
        }
    }

    public final Object cw_() {
        Object cy_ = cy_();
        if (!(!(cy_ instanceof dxA))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (cy_ instanceof dwO) {
            throw ((dwO) cy_).a;
        }
        return dxJ.d(cy_);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object d(InterfaceC8585dra<Object> interfaceC8585dra) {
        Object cy_;
        do {
            cy_ = cy_();
            if (!(cy_ instanceof dxA)) {
                if (!(cy_ instanceof dwO)) {
                    return dxJ.d(cy_);
                }
                throw ((dwO) cy_).a;
            }
        } while (g(cy_) < 0);
        return b(interfaceC8585dra);
    }

    private final Object b(InterfaceC8585dra<Object> interfaceC8585dra) {
        e eVar = new e(C8588drd.c(interfaceC8585dra), this);
        eVar.h();
        dwB.d(eVar, e((drM<? super Throwable, dpR>) new dxV(eVar)));
        Object b = eVar.b();
        if (b == C8588drd.c()) {
            C8592drh.c(interfaceC8585dra);
        }
        return b;
    }

    private final void e(dxQ dxq, Throwable th) {
        Object g = dxq.g();
        C8632dsu.d(g);
        CompletionHandlerException completionHandlerException = null;
        for (C7664dAu c7664dAu = (C7664dAu) g; !C8632dsu.c(c7664dAu, dxq); c7664dAu = c7664dAu.j()) {
            if (c7664dAu instanceof dxL) {
                dxL dxl = (dxL) c7664dAu;
                try {
                    dxl.e(th);
                } catch (Throwable th2) {
                    if (completionHandlerException == null) {
                        CompletionHandlerException completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + dxl + " for " + this, th2);
                        dpR dpr = dpR.c;
                        completionHandlerException = completionHandlerException2;
                    } else {
                        C8553dpw.c(completionHandlerException, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            e((Throwable) completionHandlerException);
        }
    }

    @Override // o.dxD
    public final boolean o() {
        int g;
        do {
            g = g(cy_());
            if (g == 0) {
                return false;
            }
        } while (g != 1);
        return true;
    }

    private final boolean b(Object obj, dxQ dxq, dxL dxl) {
        int d2;
        c cVar = new c(dxl, this, obj);
        do {
            d2 = dxq.h().d(dxl, dxq, cVar);
            if (d2 == 1) {
                return true;
            }
        } while (d2 != 2);
        return false;
    }

    private final boolean w() {
        Object cy_;
        do {
            cy_ = cy_();
            if (!(cy_ instanceof dxA)) {
                return false;
            }
        } while (g(cy_) < 0);
        return true;
    }

    private final Object a(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        C8741dwv c8741dwv = new C8741dwv(C8588drd.c(interfaceC8585dra), 1);
        c8741dwv.h();
        dwB.d(c8741dwv, e((drM<? super Throwable, dpR>) new dxT(c8741dwv)));
        Object b = c8741dwv.b();
        if (b == C8588drd.c()) {
            C8592drh.c(interfaceC8585dra);
        }
        return b == C8588drd.c() ? b : dpR.c;
    }

    public final void d(dxL dxl) {
        Object cy_;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C8756dxj c8756dxj;
        do {
            cy_ = cy_();
            if (!(cy_ instanceof dxL)) {
                if (!(cy_ instanceof dxA) || ((dxA) cy_).cp_() == null) {
                    return;
                }
                dxl.cs_();
                return;
            } else if (cy_ != dxl) {
                return;
            } else {
                atomicReferenceFieldUpdater = e;
                c8756dxj = dxJ.b;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, cy_, c8756dxj));
    }

    @Override // o.dxD
    public void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(a(), null, this);
        }
        d((Throwable) cancellationException);
    }

    private final Object d(Object obj) {
        dAH dah;
        Object c2;
        dAH dah2;
        do {
            Object cy_ = cy_();
            if (!(cy_ instanceof dxA) || ((cy_ instanceof a) && ((a) cy_).a())) {
                dah = dxJ.e;
                return dah;
            }
            c2 = c(cy_, new dwO(a(obj), false, 2, null));
            dah2 = dxJ.d;
        } while (c2 == dah2);
        return c2;
    }

    private final Object f(Object obj) {
        dAH dah;
        dAH dah2;
        dAH dah3;
        dAH dah4;
        dAH dah5;
        dAH dah6;
        Throwable th = null;
        while (true) {
            Object cy_ = cy_();
            if (!(cy_ instanceof a)) {
                if (cy_ instanceof dxA) {
                    if (th == null) {
                        th = a(obj);
                    }
                    dxA dxa = (dxA) cy_;
                    if (dxa.d()) {
                        if (d(dxa, th)) {
                            dah4 = dxJ.e;
                            return dah4;
                        }
                    } else {
                        Object c2 = c(cy_, new dwO(th, false, 2, null));
                        dah5 = dxJ.e;
                        if (c2 == dah5) {
                            throw new IllegalStateException(("Cannot happen in " + cy_).toString());
                        }
                        dah6 = dxJ.d;
                        if (c2 != dah6) {
                            return c2;
                        }
                    }
                } else {
                    dah3 = dxJ.h;
                    return dah3;
                }
            } else {
                synchronized (cy_) {
                    if (((a) cy_).j()) {
                        dah2 = dxJ.h;
                        return dah2;
                    }
                    boolean b = ((a) cy_).b();
                    if (obj != null || !b) {
                        if (th == null) {
                            th = a(obj);
                        }
                        ((a) cy_).e(th);
                    }
                    Throwable c3 = b ^ true ? ((a) cy_).c() : null;
                    if (c3 != null) {
                        d(((a) cy_).cp_(), c3);
                    }
                    dah = dxJ.e;
                    return dah;
                }
            }
        }
    }

    public final boolean j(Object obj) {
        Object c2;
        dAH dah;
        dAH dah2;
        do {
            c2 = c(cy_(), obj);
            dah = dxJ.e;
            if (c2 == dah) {
                return false;
            }
            if (c2 == dxJ.c) {
                return true;
            }
            dah2 = dxJ.d;
        } while (c2 == dah2);
        b(c2);
        return true;
    }

    public final Object h(Object obj) {
        Object c2;
        dAH dah;
        dAH dah2;
        do {
            c2 = c(cy_(), obj);
            dah = dxJ.e;
            if (c2 == dah) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, i(obj));
            }
            dah2 = dxJ.d;
        } while (c2 == dah2);
        return c2;
    }
}
