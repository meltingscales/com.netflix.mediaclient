package o;

import o.InterfaceC8888fH;

/* renamed from: o.gb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8961gb<S extends InterfaceC8888fH> {
    private c<S> b;
    private final S d;

    public C8961gb(S s) {
        C8632dsu.c((Object) s, "");
        this.d = s;
        this.b = new c<>(s);
    }

    /* renamed from: o.gb$c */
    /* loaded from: classes2.dex */
    public static final class c<S extends InterfaceC8888fH> {
        private final int b;
        private final S e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.e, ((c) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            return "StateWrapper(state=" + this.e + ')';
        }

        public c(S s) {
            C8632dsu.c((Object) s, "");
            this.e = s;
            this.b = hashCode();
        }

        public final void c() {
            if (this.b == hashCode()) {
                return;
            }
            throw new IllegalArgumentException((this.e.getClass().getSimpleName() + " was mutated. State classes should be immutable.").toString());
        }
    }

    public final void a(S s) {
        C8632dsu.c((Object) s, "");
        this.b.c();
        this.b = new c<>(s);
    }
}
