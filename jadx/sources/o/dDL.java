package o;

/* loaded from: classes5.dex */
public final class dDL<T> implements dBT<T> {
    private final InterfaceC7707dCj a;
    private final dBT<T> d;

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return this.a;
    }

    public dDL(dBT<T> dbt) {
        C8632dsu.c((Object) dbt, "");
        this.d = dbt;
        this.a = new C7756dEe(dbt.e());
    }

    @Override // o.dBZ
    public void e(InterfaceC7721dCx interfaceC7721dCx, T t) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        if (t != null) {
            interfaceC7721dCx.d();
            interfaceC7721dCx.e(this.d, t);
            return;
        }
        interfaceC7721dCx.e();
    }

    @Override // o.dBP
    public T b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return interfaceC7720dCw.i() ? (T) interfaceC7720dCw.d(this.d) : (T) interfaceC7720dCw.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && dDL.class == obj.getClass() && C8632dsu.c(this.d, ((dDL) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }
}
