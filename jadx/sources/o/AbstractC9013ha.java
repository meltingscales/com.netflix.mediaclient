package o;

import java.util.Set;

/* renamed from: o.ha  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9013ha<T> {

    /* renamed from: o.ha$c */
    /* loaded from: classes2.dex */
    public static final class c<T> extends AbstractC9013ha<T> {
        private final AbstractC9013ha<T> a;

        public final AbstractC9013ha<T> b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Not(operand=" + this.a + ')';
        }
    }

    public /* synthetic */ AbstractC9013ha(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC9013ha() {
    }

    /* renamed from: o.ha$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC9013ha {
        public static final f c = new f();

        private f() {
            super(null);
        }
    }

    /* renamed from: o.ha$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC9013ha {
        public static final d c = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: o.ha$e */
    /* loaded from: classes2.dex */
    public static final class e<T> extends AbstractC9013ha<T> {
        private final Set<AbstractC9013ha<T>> b;

        public final Set<AbstractC9013ha<T>> c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.b, ((e) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            String d;
            d = C8576dqs.d(this.b, " | ", null, null, 0, null, null, 62, null);
            return d;
        }
    }

    /* renamed from: o.ha$a */
    /* loaded from: classes2.dex */
    public static final class a<T> extends AbstractC9013ha<T> {
        private final Set<AbstractC9013ha<T>> b;

        public final Set<AbstractC9013ha<T>> c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.b, ((a) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return "And(operands=" + this.b + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Set<? extends AbstractC9013ha<? extends T>> set) {
            super(null);
            C8632dsu.c((Object) set, "");
            this.b = set;
            if (!(!set.isEmpty())) {
                throw new IllegalStateException("Apollo: cannot create a 'And' condition from an empty list".toString());
            }
        }
    }

    /* renamed from: o.ha$b */
    /* loaded from: classes2.dex */
    public static final class b<T> extends AbstractC9013ha<T> {
        private final T b;

        public final T c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.b, ((b) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return "Element(value=" + this.b + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T t) {
            super(null);
            C8632dsu.c((Object) t, "");
            this.b = t;
        }
    }
}
