package o;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlinx.coroutines.CoroutinesInternalError;

/* renamed from: o.dxh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8754dxh<T> extends AbstractRunnableC7685dBo {
    public int b;

    public abstract InterfaceC8585dra<T> a();

    public void b(Object obj, Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T c(Object obj) {
        return obj;
    }

    public abstract Object o();

    public AbstractC8754dxh(int i) {
        this.b = i;
    }

    public Throwable a(Object obj) {
        dwO dwo = obj instanceof dwO ? (dwO) obj : null;
        if (dwo != null) {
            return dwo.a;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object e;
        Object e2;
        InterfaceC7688dBr interfaceC7688dBr = this.f;
        try {
            InterfaceC8585dra<T> a = a();
            C8632dsu.d(a);
            C7655dAl c7655dAl = (C7655dAl) a;
            InterfaceC8585dra<T> interfaceC8585dra = c7655dAl.e;
            Object obj = c7655dAl.a;
            dqZ context = interfaceC8585dra.getContext();
            Object c = dAO.c(context, obj);
            C8780dyg<?> b = c != dAO.b ? dwP.b(interfaceC8585dra, context, c) : null;
            dqZ context2 = interfaceC8585dra.getContext();
            Object o2 = o();
            Throwable a2 = a(o2);
            dxD dxd = (a2 == null && C8755dxi.b(this.b)) ? (dxD) context2.get(dxD.b) : null;
            if (dxd != null && !dxd.cu_()) {
                CancellationException i = dxd.i();
                b(o2, i);
                Result.c cVar = Result.e;
                interfaceC8585dra.resumeWith(Result.e(C8556dpz.a(i)));
            } else if (a2 != null) {
                Result.c cVar2 = Result.e;
                interfaceC8585dra.resumeWith(Result.e(C8556dpz.a(a2)));
            } else {
                Result.c cVar3 = Result.e;
                interfaceC8585dra.resumeWith(Result.e(c(o2)));
            }
            dpR dpr = dpR.c;
            if (b == null || b.y()) {
                dAO.b(context, c);
            }
            try {
                Result.c cVar4 = Result.e;
                interfaceC7688dBr.b();
                e2 = Result.e(dpr);
            } catch (Throwable th) {
                Result.c cVar5 = Result.e;
                e2 = Result.e(C8556dpz.a(th));
            }
            d(null, Result.d(e2));
        } catch (Throwable th2) {
            try {
                Result.c cVar6 = Result.e;
                interfaceC7688dBr.b();
                e = Result.e(dpR.c);
            } catch (Throwable th3) {
                Result.c cVar7 = Result.e;
                e = Result.e(C8556dpz.a(th3));
            }
            d(th2, Result.d(e));
        }
    }

    public final void d(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C8553dpw.c(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        C8632dsu.d(th);
        dwS.a(a().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }
}
