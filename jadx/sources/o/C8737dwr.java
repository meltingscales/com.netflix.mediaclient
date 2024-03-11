package o;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import o.dqY;

/* renamed from: o.dwr */
/* loaded from: classes5.dex */
public final /* synthetic */ class C8737dwr {
    public static /* synthetic */ dxD c(dwU dwu, dqZ dqz, CoroutineStart coroutineStart, drX drx, int i, Object obj) {
        if ((i & 1) != 0) {
            dqz = EmptyCoroutineContext.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return C8738dws.c(dwu, dqz, coroutineStart, drx);
    }

    public static final dxD a(dwU dwu, dqZ dqz, CoroutineStart coroutineStart, drX<? super dwU, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        AbstractC8730dwk dxy;
        dqZ a = dwP.a(dwu, dqz);
        if (coroutineStart.a()) {
            dxy = new dxO(a, drx);
        } else {
            dxy = new dxY(a, true);
        }
        dxy.e(coroutineStart, (CoroutineStart) dxy, (drX<? super CoroutineStart, ? super InterfaceC8585dra<? super T>, ? extends Object>) drx);
        return dxy;
    }

    public static /* synthetic */ dwZ d(dwU dwu, dqZ dqz, CoroutineStart coroutineStart, drX drx, int i, Object obj) {
        if ((i & 1) != 0) {
            dqz = EmptyCoroutineContext.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return C8738dws.d(dwu, dqz, coroutineStart, drx);
    }

    public static final <T> dwZ<T> e(dwU dwu, dqZ dqz, CoroutineStart coroutineStart, drX<? super dwU, ? super InterfaceC8585dra<? super T>, ? extends Object> drx) {
        C8747dxa c8747dxa;
        dqZ a = dwP.a(dwu, dqz);
        if (coroutineStart.a()) {
            c8747dxa = new dxP(a, drx);
        } else {
            c8747dxa = new C8747dxa(a, true);
        }
        ((AbstractC8730dwk) c8747dxa).e(coroutineStart, (CoroutineStart) c8747dxa, (drX<? super CoroutineStart, ? super InterfaceC8585dra<? super T>, ? extends Object>) drx);
        return c8747dxa;
    }

    public static final <T> Object a(dqZ dqz, drX<? super dwU, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, InterfaceC8585dra<? super T> interfaceC8585dra) {
        Object e;
        Object e2;
        dqZ context = interfaceC8585dra.getContext();
        dqZ d = dwP.d(context, dqz);
        dxG.d(d);
        if (d == context) {
            dAE dae = new dAE(d, interfaceC8585dra);
            e = dAV.b(dae, dae, drx);
        } else {
            dqY.b bVar = dqY.d;
            if (C8632dsu.c(d.get(bVar), context.get(bVar))) {
                C8780dyg c8780dyg = new C8780dyg(d, interfaceC8585dra);
                dqZ context2 = c8780dyg.getContext();
                Object c = dAO.c(context2, null);
                try {
                    Object b = dAV.b(c8780dyg, c8780dyg, drx);
                    dAO.b(context2, c);
                    e = b;
                } catch (Throwable th) {
                    dAO.b(context2, c);
                    throw th;
                }
            } else {
                C8751dxe c8751dxe = new C8751dxe(d, interfaceC8585dra);
                dAT.c(drx, c8751dxe, c8751dxe, null, 4, null);
                e = c8751dxe.e();
            }
        }
        e2 = C8586drb.e();
        if (e == e2) {
            C8592drh.c(interfaceC8585dra);
        }
        return e;
    }
}
