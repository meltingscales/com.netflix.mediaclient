package o;

/* renamed from: o.ff  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8912ff<T> {
    protected T c;
    private AbstractC5913cN<?, ?> d;
    private final C8911fe<T> e;

    public T a(C8911fe<T> c8911fe) {
        return this.c;
    }

    public final void c(AbstractC5913cN<?, ?> abstractC5913cN) {
        this.d = abstractC5913cN;
    }

    public C8912ff() {
        this.e = new C8911fe<>();
        this.c = null;
    }

    public C8912ff(T t) {
        this.e = new C8911fe<>();
        this.c = t;
    }

    public final void c(T t) {
        this.c = t;
        AbstractC5913cN<?, ?> abstractC5913cN = this.d;
        if (abstractC5913cN != null) {
            abstractC5913cN.f();
        }
    }

    public final T a(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return a(this.e.e(f, f2, t, t2, f3, f4, f5));
    }
}
