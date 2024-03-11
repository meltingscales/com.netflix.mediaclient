package o;

@drN
/* renamed from: o.dyx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8797dyx<T> {
    public static final c b = new c(null);
    private static final a c = new a();
    private final Object d;

    /* renamed from: o.dyx$a */
    /* loaded from: classes5.dex */
    public static class a {
        public String toString() {
            return "Failed";
        }
    }

    public static final /* synthetic */ C8797dyx a(Object obj) {
        return new C8797dyx(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof C8797dyx) && C8632dsu.c(obj, ((C8797dyx) obj2).e());
    }

    public static <T> Object e(Object obj) {
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final /* synthetic */ Object e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return c(this.d, obj);
    }

    public int hashCode() {
        return g(this.d);
    }

    private /* synthetic */ C8797dyx(Object obj) {
        this.d = obj;
    }

    public static final boolean f(Object obj) {
        return !(obj instanceof a);
    }

    public static final boolean i(Object obj) {
        return obj instanceof b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T c(Object obj) {
        if (obj instanceof a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T b(Object obj) {
        Throwable th;
        if (obj instanceof a) {
            if (!(obj instanceof b) || (th = ((b) obj).e) == null) {
                throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
            }
            throw th;
        }
        return obj;
    }

    public static final Throwable d(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        if (bVar != null) {
            return bVar.e;
        }
        return null;
    }

    /* renamed from: o.dyx$b */
    /* loaded from: classes5.dex */
    public static final class b extends a {
        public final Throwable e;

        public b(Throwable th) {
            this.e = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && C8632dsu.c(this.e, ((b) obj).e);
        }

        public int hashCode() {
            Throwable th = this.e;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // o.C8797dyx.a
        public String toString() {
            return "Closed(" + this.e + ')';
        }
    }

    /* renamed from: o.dyx$c */
    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final <E> Object d(E e) {
            return C8797dyx.e(e);
        }

        public final <E> Object d() {
            return C8797dyx.e(C8797dyx.c);
        }

        public final <E> Object a(Throwable th) {
            return C8797dyx.e(new b(th));
        }
    }

    public String toString() {
        return j(this.d);
    }

    public static String j(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
