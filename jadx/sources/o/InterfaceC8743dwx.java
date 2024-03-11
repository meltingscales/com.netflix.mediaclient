package o;

/* renamed from: o.dwx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC8743dwx<T> extends InterfaceC8585dra<T> {
    void a(T t, drM<? super Throwable, dpR> drm);

    void a(drM<? super Throwable, dpR> drm);

    void b(Object obj);

    void c(dwQ dwq, Throwable th);

    boolean c(Throwable th);

    Object d(Throwable th);

    boolean d();

    Object e(T t, Object obj, drM<? super Throwable, dpR> drm);

    void e(dwQ dwq, T t);

    boolean e();

    /* renamed from: o.dwx$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ boolean b(InterfaceC8743dwx interfaceC8743dwx, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return interfaceC8743dwx.c(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }
}
