package o;

/* loaded from: classes4.dex */
final class bII<T, V> implements dsZ<T, V> {
    private final drX<T, dtC<?>, V> b;
    private Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public bII(drX<? super T, ? super dtC<?>, ? extends V> drx) {
        C8632dsu.c((Object) drx, "");
        this.b = drx;
        this.c = c.d;
    }

    /* loaded from: classes4.dex */
    static final class c {
        public static final c d = new c();

        private c() {
        }
    }

    @Override // o.dsZ
    public V getValue(T t, dtC<?> dtc) {
        C8632dsu.c((Object) dtc, "");
        if (C8632dsu.c(this.c, c.d)) {
            this.c = this.b.invoke(t, dtc);
        }
        return (V) this.c;
    }
}
