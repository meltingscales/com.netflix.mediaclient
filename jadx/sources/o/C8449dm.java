package o;

import androidx.core.util.Pair;

/* renamed from: o.dm  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8449dm<T> {
    T a;
    T c;

    public void e(T t, T t2) {
        this.a = t;
        this.c = t2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            return c(pair.first, this.a) && c(pair.second, this.c);
        }
        return false;
    }

    private static boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public int hashCode() {
        T t = this.a;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.c;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.a + " " + this.c + "}";
    }
}
