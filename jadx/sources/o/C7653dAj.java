package o;

import java.util.concurrent.CancellationException;
import kotlin.Result;

/* renamed from: o.dAj */
/* loaded from: classes5.dex */
public final class C7653dAj {
    private static final dAH a = new dAH("UNDEFINED");
    public static final dAH e = new dAH("REUSABLE_CLAIMED");

    public static /* synthetic */ void c(InterfaceC8585dra interfaceC8585dra, Object obj, drM drm, int i, Object obj2) {
        if ((i & 2) != 0) {
            drm = null;
        }
        c(interfaceC8585dra, obj, drm);
    }

    public static final <T> void c(InterfaceC8585dra<? super T> interfaceC8585dra, Object obj, drM<? super Throwable, dpR> drm) {
        if (!(interfaceC8585dra instanceof C7655dAl)) {
            interfaceC8585dra.resumeWith(obj);
            return;
        }
        C7655dAl c7655dAl = (C7655dAl) interfaceC8585dra;
        Object e2 = dwN.e(obj, drm);
        if (c7655dAl.d.isDispatchNeeded(c7655dAl.getContext())) {
            c7655dAl.c = e2;
            c7655dAl.b = 1;
            c7655dAl.d.dispatch(c7655dAl.getContext(), c7655dAl);
            return;
        }
        AbstractC8765dxs c = C8776dyc.a.c();
        if (c.d()) {
            c7655dAl.c = e2;
            c7655dAl.b = 1;
            c.e(c7655dAl);
            return;
        }
        c.d(true);
        try {
            dxD dxd = (dxD) c7655dAl.getContext().get(dxD.b);
            if (dxd != null && !dxd.cu_()) {
                CancellationException i = dxd.i();
                c7655dAl.b(e2, i);
                Result.c cVar = Result.e;
                c7655dAl.resumeWith(Result.e(C8556dpz.a(i)));
            } else {
                InterfaceC8585dra<T> interfaceC8585dra2 = c7655dAl.e;
                Object obj2 = c7655dAl.a;
                dqZ context = interfaceC8585dra2.getContext();
                Object c2 = dAO.c(context, obj2);
                C8780dyg<?> b = c2 != dAO.b ? dwP.b(interfaceC8585dra2, context, c2) : null;
                c7655dAl.e.resumeWith(obj);
                dpR dpr = dpR.c;
                if (b == null || b.y()) {
                    dAO.b(context, c2);
                }
            }
            do {
            } while (c.i());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final boolean b(C7655dAl<? super dpR> c7655dAl) {
        dpR dpr = dpR.c;
        AbstractC8765dxs c = C8776dyc.a.c();
        if (!c.g()) {
            if (c.d()) {
                c7655dAl.c = dpr;
                c7655dAl.b = 1;
                c.e(c7655dAl);
                return true;
            }
            c.d(true);
            try {
                c7655dAl.run();
                do {
                } while (c.i());
            } finally {
                try {
                } finally {
                }
            }
        }
        return false;
    }
}
