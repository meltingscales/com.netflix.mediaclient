package o;

import java.util.List;

/* loaded from: classes5.dex */
public abstract class dFO {
    public abstract dBT<?> c(List<? extends dBT<?>> list);

    private dFO() {
    }

    /* loaded from: classes5.dex */
    public static final class e extends dFO {
        private final dBT<?> b;

        @Override // o.dFO
        public dBT<?> c(List<? extends dBT<?>> list) {
            C8632dsu.c((Object) list, "");
            return this.b;
        }

        public final dBT<?> d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && C8632dsu.c(((e) obj).b, this.b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }
    }

    /* loaded from: classes5.dex */
    public static final class a extends dFO {
        private final drM<List<? extends dBT<?>>, dBT<?>> e;

        public final drM<List<? extends dBT<?>>, dBT<?>> a() {
            return this.e;
        }

        @Override // o.dFO
        public dBT<?> c(List<? extends dBT<?>> list) {
            C8632dsu.c((Object) list, "");
            return this.e.invoke(list);
        }
    }
}
