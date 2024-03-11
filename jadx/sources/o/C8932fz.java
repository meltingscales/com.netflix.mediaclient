package o;

/* renamed from: o.fz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8932fz<T> extends AbstractC8918fl<T> implements InterfaceC8881fA {
    private final T c;

    public C8932fz() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8932fz) && C8632dsu.c(this.c, ((C8932fz) obj).c);
    }

    public int hashCode() {
        T t = this.c;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        return "Loading(value=" + this.c + ')';
    }

    public C8932fz(T t) {
        super(false, false, t, null);
        this.c = t;
    }

    public /* synthetic */ C8932fz(Object obj, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : obj);
    }
}
