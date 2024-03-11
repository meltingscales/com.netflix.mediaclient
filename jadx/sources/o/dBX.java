package o;

import java.util.Map;

/* loaded from: classes5.dex */
public final class dBX<T> extends dCC<T> {
    private final Map<String, dBT<? extends T>> a;
    private final Map<InterfaceC8660dtv<? extends T>, dBT<? extends T>> b;
    private final InterfaceC8660dtv<T> c;
    private final InterfaceC8554dpx d;

    @Override // o.dCC
    public InterfaceC8660dtv<T> d() {
        return this.c;
    }

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return (InterfaceC7707dCj) this.d.getValue();
    }

    @Override // o.dCC
    public dBP<T> d(InterfaceC7717dCt interfaceC7717dCt, String str) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        dBT<? extends T> dbt = this.a.get(str);
        return dbt != null ? dbt : super.d(interfaceC7717dCt, str);
    }

    @Override // o.dCC
    public dBZ<T> d(InterfaceC7721dCx interfaceC7721dCx, T t) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        C8632dsu.c((Object) t, "");
        dBT<? extends T> dbt = this.b.get(dsA.a(t.getClass()));
        if (dbt == null) {
            dbt = super.d(interfaceC7721dCx, (InterfaceC7721dCx) t);
        }
        if (dbt != null) {
            return dbt;
        }
        return null;
    }
}
