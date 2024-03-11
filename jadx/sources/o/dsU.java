package o;

/* loaded from: classes5.dex */
final class dsU<T> implements InterfaceC8639dta<Object, T> {
    private T a;

    @Override // o.InterfaceC8639dta
    public void setValue(Object obj, dtC<?> dtc, T t) {
        C8632dsu.c((Object) dtc, "");
        C8632dsu.c((Object) t, "");
        this.a = t;
    }

    @Override // o.InterfaceC8639dta, o.dsZ
    public T getValue(Object obj, dtC<?> dtc) {
        C8632dsu.c((Object) dtc, "");
        T t = this.a;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + dtc.getName() + " should be initialized before get.");
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("NotNullProperty(");
        if (this.a != null) {
            str = "value=" + this.a;
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
