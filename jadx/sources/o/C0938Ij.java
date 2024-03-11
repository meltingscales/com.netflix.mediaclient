package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.Ij  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0938Ij<T> extends AbstractC0935Ig<T> {
    private final T c;
    private int d;
    private final AbstractC0935Ig<T> e;

    public final AbstractC0935Ig<T> a() {
        return this.e;
    }

    public final T e() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0938Ij(T t, AbstractC0935Ig<? extends T> abstractC0935Ig) {
        super(null);
        C8632dsu.c((Object) abstractC0935Ig, "");
        this.c = t;
        this.e = abstractC0935Ig;
    }

    public String toString() {
        T d = d();
        AbstractC0935Ig<T> g = g();
        return d + ", " + g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC0935Ig) {
            AbstractC0935Ig abstractC0935Ig = (AbstractC0935Ig) obj;
            if (C8632dsu.c(d(), abstractC0935Ig.d()) && C8632dsu.c(g(), abstractC0935Ig.g())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.d == 0) {
            Object obj = this.c;
            if (obj == null) {
                obj = C0938Ij.class;
            }
            this.d = obj.hashCode() + g().hashCode();
        }
        return this.d;
    }
}
