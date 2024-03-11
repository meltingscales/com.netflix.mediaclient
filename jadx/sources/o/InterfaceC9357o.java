package o;

/* renamed from: o.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC9357o<T> {
    public static final b e = b.a;

    T d();

    @drN
    /* renamed from: o.o$d */
    /* loaded from: classes2.dex */
    public static final class d<T> implements InterfaceC9357o<T> {
        private final T c;

        public static <T> Object a(T t) {
            return t;
        }

        public static int b(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static String c(Object obj) {
            return "Value(value=" + obj + ')';
        }

        public static final /* synthetic */ d d(Object obj) {
            return new d(obj);
        }

        public static boolean e(Object obj, Object obj2) {
            return (obj2 instanceof d) && C8632dsu.c(obj, ((d) obj2).c());
        }

        public final /* synthetic */ Object c() {
            return this.c;
        }

        @Override // o.InterfaceC9357o
        public T d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            return e(this.c, obj);
        }

        public int hashCode() {
            return b(this.c);
        }

        public String toString() {
            return c(this.c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private /* synthetic */ d(Object obj) {
            this.c = obj;
        }
    }

    /* renamed from: o.o$b */
    /* loaded from: classes2.dex */
    public static final class b {
        static final /* synthetic */ b a = new b();
        private static final Object b = d.a(dpR.c);

        public final Object e() {
            return b;
        }

        private b() {
        }
    }
}
