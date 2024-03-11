package o;

import kotlin.Result;

/* renamed from: o.dxi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8755dxi {
    public static final boolean b(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean d(int i) {
        return i == 2;
    }

    public static final <T> void c(AbstractC8754dxh<? super T> abstractC8754dxh, int i) {
        InterfaceC8585dra<? super T> a = abstractC8754dxh.a();
        boolean z = i == 4;
        if (!z && (a instanceof C7655dAl) && b(i) == b(abstractC8754dxh.b)) {
            dwQ dwq = ((C7655dAl) a).d;
            dqZ context = a.getContext();
            if (dwq.isDispatchNeeded(context)) {
                dwq.dispatch(context, abstractC8754dxh);
                return;
            } else {
                d(abstractC8754dxh);
                return;
            }
        }
        b(abstractC8754dxh, a, z);
    }

    public static final <T> void b(AbstractC8754dxh<? super T> abstractC8754dxh, InterfaceC8585dra<? super T> interfaceC8585dra, boolean z) {
        Object c;
        boolean y;
        Object o2 = abstractC8754dxh.o();
        Throwable a = abstractC8754dxh.a(o2);
        if (a != null) {
            Result.c cVar = Result.e;
            c = C8556dpz.a(a);
        } else {
            Result.c cVar2 = Result.e;
            c = abstractC8754dxh.c(o2);
        }
        Object e = Result.e(c);
        if (z) {
            C8632dsu.d(interfaceC8585dra);
            C7655dAl c7655dAl = (C7655dAl) interfaceC8585dra;
            InterfaceC8585dra<T> interfaceC8585dra2 = c7655dAl.e;
            Object obj = c7655dAl.a;
            dqZ context = interfaceC8585dra2.getContext();
            Object c2 = dAO.c(context, obj);
            C8780dyg<?> b = c2 != dAO.b ? dwP.b(interfaceC8585dra2, context, c2) : null;
            try {
                c7655dAl.e.resumeWith(e);
                dpR dpr = dpR.c;
                if (b != null) {
                    if (!y) {
                        return;
                    }
                }
                return;
            } finally {
                if (b == null || b.y()) {
                    dAO.b(context, c2);
                }
            }
        }
        interfaceC8585dra.resumeWith(e);
    }

    private static final void d(AbstractC8754dxh<?> abstractC8754dxh) {
        AbstractC8765dxs c = C8776dyc.a.c();
        if (c.d()) {
            c.e(abstractC8754dxh);
            return;
        }
        c.d(true);
        try {
            b(abstractC8754dxh, abstractC8754dxh.a(), true);
            do {
            } while (c.i());
        } finally {
            try {
            } finally {
            }
        }
    }
}
