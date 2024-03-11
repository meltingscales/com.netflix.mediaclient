package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.pf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C9442pf {
    private final Object e = new Object();
    private final Map<SoftReference<C9382oY>, Boolean> c = new ConcurrentHashMap();
    private final ReferenceQueue<C9382oY> b = new ReferenceQueue<>();

    /* renamed from: o.pf$b */
    /* loaded from: classes2.dex */
    static final class b {
        static final C9442pf c = new C9442pf();
    }

    C9442pf() {
    }

    public static C9442pf c() {
        return b.c;
    }

    public SoftReference<C9382oY> d(C9382oY c9382oY) {
        SoftReference<C9382oY> softReference = new SoftReference<>(c9382oY, this.b);
        this.c.put(softReference, Boolean.TRUE);
        e();
        return softReference;
    }

    private void e() {
        while (true) {
            SoftReference softReference = (SoftReference) this.b.poll();
            if (softReference == null) {
                return;
            }
            this.c.remove(softReference);
        }
    }
}
