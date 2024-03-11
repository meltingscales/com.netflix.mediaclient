package o;

import java.util.List;
import java.util.Map;
import o.dFO;

/* loaded from: classes5.dex */
public final class dFQ extends dFP {
    private final Map<InterfaceC8660dtv<?>, drM<?, dBZ<?>>> a;
    private final Map<InterfaceC8660dtv<?>, dFO> b;
    private final Map<InterfaceC8660dtv<?>, drM<String, dBP<?>>> c;
    public final Map<InterfaceC8660dtv<?>, Map<InterfaceC8660dtv<?>, dBT<?>>> d;
    private final Map<InterfaceC8660dtv<?>, Map<String, dBT<?>>> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dFQ(Map<InterfaceC8660dtv<?>, ? extends dFO> map, Map<InterfaceC8660dtv<?>, ? extends Map<InterfaceC8660dtv<?>, ? extends dBT<?>>> map2, Map<InterfaceC8660dtv<?>, ? extends drM<?, ? extends dBZ<?>>> map3, Map<InterfaceC8660dtv<?>, ? extends Map<String, ? extends dBT<?>>> map4, Map<InterfaceC8660dtv<?>, ? extends drM<? super String, ? extends dBP<?>>> map5) {
        super(null);
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        C8632dsu.c((Object) map3, "");
        C8632dsu.c((Object) map4, "");
        C8632dsu.c((Object) map5, "");
        this.b = map;
        this.d = map2;
        this.a = map3;
        this.e = map4;
        this.c = map5;
    }

    @Override // o.dFP
    public <T> dBZ<T> a(InterfaceC8660dtv<? super T> interfaceC8660dtv, T t) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) t, "");
        if (interfaceC8660dtv.d(t)) {
            Map<InterfaceC8660dtv<?>, dBT<?>> map = this.d.get(interfaceC8660dtv);
            dBT<?> dbt = map != null ? map.get(dsA.a(t.getClass())) : null;
            if (!(dbt instanceof dBZ)) {
                dbt = null;
            }
            if (dbt != null) {
                return dbt;
            }
            drM<?, dBZ<?>> drm = this.a.get(interfaceC8660dtv);
            drM<?, dBZ<?>> drm2 = dsH.c(drm, 1) ? drm : null;
            if (drm2 != null) {
                return (dBZ<T>) drm2.invoke(t);
            }
            return null;
        }
        return null;
    }

    @Override // o.dFP
    public <T> dBP<T> a(InterfaceC8660dtv<? super T> interfaceC8660dtv, String str) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        Map<String, dBT<?>> map = this.e.get(interfaceC8660dtv);
        dBT<?> dbt = map != null ? map.get(str) : null;
        if (!(dbt instanceof dBT)) {
            dbt = null;
        }
        if (dbt != null) {
            return dbt;
        }
        drM<String, dBP<?>> drm = this.c.get(interfaceC8660dtv);
        drM<String, dBP<?>> drm2 = dsH.c(drm, 1) ? drm : null;
        if (drm2 != null) {
            return (dBP<T>) drm2.invoke(str);
        }
        return null;
    }

    @Override // o.dFP
    public <T> dBT<T> b(InterfaceC8660dtv<T> interfaceC8660dtv, List<? extends dBT<?>> list) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) list, "");
        dFO dfo = this.b.get(interfaceC8660dtv);
        dBT<?> c = dfo != null ? dfo.c(list) : null;
        if (c instanceof dBT) {
            return (dBT<T>) c;
        }
        return null;
    }

    @Override // o.dFP
    public void b(dFS dfs) {
        C8632dsu.c((Object) dfs, "");
        for (Map.Entry<InterfaceC8660dtv<?>, dFO> entry : this.b.entrySet()) {
            InterfaceC8660dtv<?> key = entry.getKey();
            dFO value = entry.getValue();
            if (value instanceof dFO.e) {
                C8632dsu.d(key);
                dBT<?> d = ((dFO.e) value).d();
                C8632dsu.d(d);
                dfs.a(key, d);
            } else if (value instanceof dFO.a) {
                dfs.a(key, ((dFO.a) value).a());
            }
        }
        for (Map.Entry<InterfaceC8660dtv<?>, Map<InterfaceC8660dtv<?>, dBT<?>>> entry2 : this.d.entrySet()) {
            InterfaceC8660dtv<?> key2 = entry2.getKey();
            for (Map.Entry<InterfaceC8660dtv<?>, dBT<?>> entry3 : entry2.getValue().entrySet()) {
                InterfaceC8660dtv<?> key3 = entry3.getKey();
                dBT<?> value2 = entry3.getValue();
                C8632dsu.d(key2);
                C8632dsu.d(key3);
                C8632dsu.d(value2);
                dfs.a(key2, key3, value2);
            }
        }
        for (Map.Entry<InterfaceC8660dtv<?>, drM<?, dBZ<?>>> entry4 : this.a.entrySet()) {
            InterfaceC8660dtv<?> key4 = entry4.getKey();
            drM<?, dBZ<?>> value3 = entry4.getValue();
            C8632dsu.d(key4);
            C8632dsu.d(value3);
            dfs.b(key4, (drM) dsH.a(value3, 1));
        }
        for (Map.Entry<InterfaceC8660dtv<?>, drM<String, dBP<?>>> entry5 : this.c.entrySet()) {
            InterfaceC8660dtv<?> key5 = entry5.getKey();
            drM<String, dBP<?>> value4 = entry5.getValue();
            C8632dsu.d(key5);
            C8632dsu.d(value4);
            dfs.c(key5, (drM) dsH.a(value4, 1));
        }
    }
}
