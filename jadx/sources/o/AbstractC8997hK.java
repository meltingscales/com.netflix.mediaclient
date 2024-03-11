package o;

import com.apollographql.apollo3.exception.MissingValueException;

/* renamed from: o.hK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8997hK<V> {
    public static final c d = new c(null);

    public /* synthetic */ AbstractC8997hK(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC8997hK() {
    }

    public final V e() {
        b bVar = this instanceof b ? (b) this : null;
        if (bVar != null) {
            return (V) bVar.a();
        }
        return null;
    }

    public final V c() {
        if (this instanceof b) {
            return (V) ((b) this).a();
        }
        throw new MissingValueException();
    }

    /* renamed from: o.hK$b */
    /* loaded from: classes2.dex */
    public static final class b<V> extends AbstractC8997hK<V> {
        private final V e;

        public final V a() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.e, ((b) obj).e);
        }

        public int hashCode() {
            V v = this.e;
            if (v == null) {
                return 0;
            }
            return v.hashCode();
        }

        public String toString() {
            return "Present(value=" + this.e + ')';
        }

        public b(V v) {
            super(null);
            this.e = v;
        }
    }

    /* renamed from: o.hK$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC8997hK {
        public static final e c = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: o.hK$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final e d() {
            return e.c;
        }

        public final <V> b<V> e(V v) {
            return new b<>(v);
        }

        public final <V> AbstractC8997hK<V> b(V v) {
            return v == null ? e.c : new b(v);
        }
    }
}
