package kotlin;

import java.io.Serializable;
import o.C8627dsp;
import o.C8632dsu;
import o.drN;

@drN
/* loaded from: classes5.dex */
public final class Result<T> implements Serializable {
    public static final c e = new c(null);
    private final Object c;

    public static final boolean a(Object obj, Object obj2) {
        return C8632dsu.c(obj, obj2);
    }

    public static final /* synthetic */ Result b(Object obj) {
        return new Result(obj);
    }

    public static int c(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static <T> Object e(Object obj) {
        return obj;
    }

    public static boolean e(Object obj, Object obj2) {
        return (obj2 instanceof Result) && C8632dsu.c(obj, ((Result) obj2).c());
    }

    public final /* synthetic */ Object c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        return e(this.c, obj);
    }

    public int hashCode() {
        return c(this.c);
    }

    private /* synthetic */ Result(Object obj) {
        this.c = obj;
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof Failure);
    }

    public static final boolean a(Object obj) {
        return obj instanceof Failure;
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).d;
        }
        return null;
    }

    public String toString() {
        return f(this.c);
    }

    public static String f(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    /* loaded from: classes5.dex */
    public static final class Failure implements Serializable {
        public final Throwable d;

        public Failure(Throwable th) {
            C8632dsu.c((Object) th, "");
            this.d = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Failure) && C8632dsu.c(this.d, ((Failure) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            return "Failure(" + this.d + ')';
        }
    }
}
