package o;

import java.lang.ref.SoftReference;

/* renamed from: o.pb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9438pb {
    protected static final ThreadLocal<SoftReference<C9382oY>> d;
    private static final C9442pf e;

    static {
        C9442pf c9442pf;
        if ("true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"))) {
            c9442pf = C9442pf.c();
            e = c9442pf;
            d = new ThreadLocal<>();
        }
        c9442pf = null;
        e = c9442pf;
        d = new ThreadLocal<>();
    }

    public static C9382oY e() {
        SoftReference<C9382oY> softReference;
        ThreadLocal<SoftReference<C9382oY>> threadLocal = d;
        SoftReference<C9382oY> softReference2 = threadLocal.get();
        C9382oY c9382oY = softReference2 == null ? null : softReference2.get();
        if (c9382oY == null) {
            c9382oY = new C9382oY();
            C9442pf c9442pf = e;
            if (c9442pf != null) {
                softReference = c9442pf.d(c9382oY);
            } else {
                softReference = new SoftReference<>(c9382oY);
            }
            threadLocal.set(softReference);
        }
        return c9382oY;
    }
}
