package o;

/* renamed from: o.gl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8971gl<T> extends AbstractC8918fl<T> {
    private final T a;
    private Object c;

    @Override // o.AbstractC8918fl
    public T c() {
        return this.a;
    }

    public final void c(Object obj) {
        this.c = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8971gl) && C8632dsu.c(this.a, ((C8971gl) obj).a);
    }

    public int hashCode() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        return "Success(value=" + this.a + ')';
    }

    public C8971gl(T t) {
        super(true, false, t, null);
        this.a = t;
    }
}
