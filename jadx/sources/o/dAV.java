package o;

import kotlin.Result;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes5.dex */
public final class dAV {
    public static final <T, R> Object b(dAE<? super T> dae, R r, drX<? super R, ? super InterfaceC8585dra<? super T>, ? extends Object> drx) {
        Object dwo;
        Object e;
        Object e2;
        Object e3;
        try {
            dwo = ((drX) dsH.a(drx, 2)).invoke(r, dae);
        } catch (Throwable th) {
            dwo = new dwO(th, false, 2, null);
        }
        e = C8586drb.e();
        if (dwo == e) {
            e3 = C8586drb.e();
            return e3;
        }
        Object h = dae.h(dwo);
        if (h == dxJ.c) {
            e2 = C8586drb.e();
            return e2;
        } else if (h instanceof dwO) {
            throw ((dwO) h).a;
        } else {
            return dxJ.d(h);
        }
    }

    public static final <T, R> Object d(dAE<? super T> dae, R r, drX<? super R, ? super InterfaceC8585dra<? super T>, ? extends Object> drx) {
        Object dwo;
        Object e;
        Object e2;
        Object e3;
        try {
            dwo = ((drX) dsH.a(drx, 2)).invoke(r, dae);
        } catch (Throwable th) {
            dwo = new dwO(th, false, 2, null);
        }
        e = C8586drb.e();
        if (dwo == e) {
            e3 = C8586drb.e();
            return e3;
        }
        Object h = dae.h(dwo);
        if (h == dxJ.c) {
            e2 = C8586drb.e();
            return e2;
        }
        if (h instanceof dwO) {
            Throwable th2 = ((dwO) h).a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).b != dae) {
                throw th2;
            }
            if (dwo instanceof dwO) {
                throw ((dwO) dwo).a;
            }
        } else {
            dwo = dxJ.d(h);
        }
        return dwo;
    }

    public static final <R, T> void c(drX<? super R, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, R r, InterfaceC8585dra<? super T> interfaceC8585dra) {
        Object e;
        InterfaceC8585dra d = C8592drh.d(interfaceC8585dra);
        try {
            dqZ context = interfaceC8585dra.getContext();
            Object c = dAO.c(context, null);
            Object invoke = ((drX) dsH.a(drx, 2)).invoke(r, d);
            dAO.b(context, c);
            e = C8586drb.e();
            if (invoke != e) {
                Result.c cVar = Result.e;
                d.resumeWith(Result.e(invoke));
            }
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            d.resumeWith(Result.e(C8556dpz.a(th)));
        }
    }
}
