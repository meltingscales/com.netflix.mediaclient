package o;

/* loaded from: classes5.dex */
public abstract class dsS<V> implements InterfaceC8639dta<Object, V> {
    private V value;

    protected void afterChange(dtC<?> dtc, V v, V v2) {
        C8632dsu.c((Object) dtc, "");
    }

    protected boolean beforeChange(dtC<?> dtc, V v, V v2) {
        C8632dsu.c((Object) dtc, "");
        return true;
    }

    @Override // o.InterfaceC8639dta, o.dsZ
    public V getValue(Object obj, dtC<?> dtc) {
        C8632dsu.c((Object) dtc, "");
        return this.value;
    }

    public dsS(V v) {
        this.value = v;
    }

    @Override // o.InterfaceC8639dta
    public void setValue(Object obj, dtC<?> dtc, V v) {
        C8632dsu.c((Object) dtc, "");
        V v2 = this.value;
        if (beforeChange(dtc, v2, v)) {
            this.value = v;
            afterChange(dtc, v2, v);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
