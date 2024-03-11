package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.dDu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7745dDu<K, V> extends dDE<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    private final InterfaceC7707dCj d;

    protected Map<K, V> b(LinkedHashMap<K, V> linkedHashMap) {
        C8632dsu.c((Object) linkedHashMap, "");
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: c */
    public void b(LinkedHashMap<K, V> linkedHashMap, int i) {
        C8632dsu.c((Object) linkedHashMap, "");
    }

    @Override // o.dDE, o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return this.d;
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ int a(Object obj) {
        return c((LinkedHashMap) ((LinkedHashMap) obj));
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Object b(Object obj) {
        return c((Map) ((Map) obj));
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Object c(Object obj) {
        return b((LinkedHashMap) ((LinkedHashMap) obj));
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ int d(Object obj) {
        return e((Map) ((Map) obj));
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Iterator e(Object obj) {
        return b((Map) ((Map) obj));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7745dDu(dBT<K> dbt, dBT<V> dbt2) {
        super(dbt, dbt2, null);
        C8632dsu.c((Object) dbt, "");
        C8632dsu.c((Object) dbt2, "");
        this.d = new C7746dDv(dbt.e(), dbt2.e());
    }

    protected int e(Map<K, ? extends V> map) {
        C8632dsu.c((Object) map, "");
        return map.size();
    }

    protected Iterator<Map.Entry<K, V>> b(Map<K, ? extends V> map) {
        C8632dsu.c((Object) map, "");
        return (Iterator<Map.Entry<K, ? extends V>>) map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: c */
    public LinkedHashMap<K, V> d() {
        return new LinkedHashMap<>();
    }

    protected int c(LinkedHashMap<K, V> linkedHashMap) {
        C8632dsu.c((Object) linkedHashMap, "");
        return linkedHashMap.size() * 2;
    }

    protected LinkedHashMap<K, V> c(Map<K, ? extends V> map) {
        C8632dsu.c((Object) map, "");
        LinkedHashMap<K, V> linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap<>(map) : linkedHashMap;
    }
}
