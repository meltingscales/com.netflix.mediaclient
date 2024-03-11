package o;

import o.dAC;

@drN
/* loaded from: classes5.dex */
public final class dAG<S extends dAC<S>> {
    private final Object c;

    public static <S extends dAC<S>> Object b(Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof dAG) && C8632dsu.c(obj, ((dAG) obj2).b());
    }

    public static int d(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String e(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public final /* synthetic */ Object b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        return c(this.c, obj);
    }

    public int hashCode() {
        return d(this.c);
    }

    public String toString() {
        return e(this.c);
    }

    public static final boolean a(Object obj) {
        return obj == C7650dAg.e;
    }

    public static final S c(Object obj) {
        if (obj != C7650dAg.e) {
            C8632dsu.d(obj);
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }
}
