package o;

/* renamed from: o.rT  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9536rT<T> {
    private C9536rT<T> a;
    private final T e;

    public T b() {
        return this.e;
    }

    public C9536rT<T> d() {
        return this.a;
    }

    public C9536rT(T t, C9536rT<T> c9536rT) {
        this.e = t;
        this.a = c9536rT;
    }

    public void b(C9536rT<T> c9536rT) {
        if (this.a != null) {
            throw new IllegalStateException();
        }
        this.a = c9536rT;
    }

    public static <ST> boolean c(C9536rT<ST> c9536rT, ST st) {
        while (c9536rT != null) {
            if (c9536rT.b() == st) {
                return true;
            }
            c9536rT = c9536rT.d();
        }
        return false;
    }
}
