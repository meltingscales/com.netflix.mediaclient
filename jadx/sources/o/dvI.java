package o;

/* loaded from: classes5.dex */
public final class dvI<V> {
    private final V a;
    private final Object b;
    private final Object c;

    public final Object b() {
        return this.b;
    }

    public final V c() {
        return this.a;
    }

    public final Object e() {
        return this.c;
    }

    public dvI(V v, Object obj, Object obj2) {
        this.a = v;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dvI(V r2) {
        /*
            r1 = this;
            o.dwd r0 = o.C8723dwd.b
            r1.<init>(r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dvI.<init>(java.lang.Object):void");
    }

    public dvI(V v, Object obj) {
        this(v, obj, C8723dwd.b);
    }

    public final dvI<V> e(V v) {
        return new dvI<>(v, this.c, this.b);
    }

    public final dvI<V> a(Object obj) {
        return new dvI<>(this.a, obj, this.b);
    }

    public final dvI<V> c(Object obj) {
        return new dvI<>(this.a, this.c, obj);
    }

    public final boolean a() {
        return this.b != C8723dwd.b;
    }

    public final boolean d() {
        return this.c != C8723dwd.b;
    }
}
