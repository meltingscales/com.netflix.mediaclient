package o;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* renamed from: o.dAz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7669dAz {
    public static final dxN a;
    private static final boolean c = false;
    public static final C7669dAz d;

    private C7669dAz() {
    }

    static {
        C7669dAz c7669dAz = new C7669dAz();
        d = c7669dAz;
        dAL.d("kotlinx.coroutines.fast.service.loader", true);
        a = c7669dAz.d();
    }

    private final dxN d() {
        dtQ b;
        List<MainDispatcherFactory> q;
        Object next;
        dxN d2;
        try {
            if (c) {
                q = C7658dAo.d.e();
            } else {
                b = dtY.b(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator());
                q = C8670due.q(b);
            }
            Iterator<T> it = q.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            return (mainDispatcherFactory == null || (d2 = C7667dAx.d(mainDispatcherFactory, q)) == null) ? C7667dAx.a(null, null, 3, null) : d2;
        } catch (Throwable th) {
            return C7667dAx.a(th, null, 2, null);
        }
    }
}
