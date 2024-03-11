package o;

/* loaded from: classes3.dex */
public final class aLZ<T> extends aLO<T> {
    private final T a;

    public final T e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aLZ) && C8632dsu.c(this.a, ((aLZ) obj).a);
    }

    public int hashCode() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        T t = this.a;
        return "Success(value=" + t + ")";
    }

    public aLZ(T t) {
        super(null);
        this.a = t;
    }
}
