package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.dDi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7733dDi<K, V> extends dDE<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    private final InterfaceC7707dCj c;

    protected Map<K, V> a(HashMap<K, V> hashMap) {
        C8632dsu.c((Object) hashMap, "");
        return hashMap;
    }

    protected void b(HashMap<K, V> hashMap, int i) {
        C8632dsu.c((Object) hashMap, "");
    }

    @Override // o.dDE, o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return this.c;
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ int a(Object obj) {
        return c((HashMap) ((HashMap) obj));
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Object b(Object obj) {
        return d((Map) ((Map) obj));
    }

    @Override // o.AbstractC7718dCu
    public /* bridge */ /* synthetic */ void b(Object obj, int i) {
        b((HashMap) ((HashMap) obj), i);
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Object c(Object obj) {
        return a((HashMap) ((HashMap) obj));
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ int d(Object obj) {
        return c((Map) ((Map) obj));
    }

    @Override // o.AbstractC7718dCu
    public /* synthetic */ Iterator e(Object obj) {
        return b((Map) ((Map) obj));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7733dDi(dBT<K> dbt, dBT<V> dbt2) {
        super(dbt, dbt2, null);
        C8632dsu.c((Object) dbt, "");
        C8632dsu.c((Object) dbt2, "");
        this.c = new C7732dDh(dbt.e(), dbt2.e());
    }

    protected int c(Map<K, ? extends V> map) {
        C8632dsu.c((Object) map, "");
        return map.size();
    }

    protected Iterator<Map.Entry<K, V>> b(Map<K, ? extends V> map) {
        C8632dsu.c((Object) map, "");
        return (Iterator<Map.Entry<K, ? extends V>>) map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: a */
    public HashMap<K, V> d() {
        return new HashMap<>();
    }

    protected int c(HashMap<K, V> hashMap) {
        C8632dsu.c((Object) hashMap, "");
        return hashMap.size() * 2;
    }

    protected HashMap<K, V> d(Map<K, ? extends V> map) {
        C8632dsu.c((Object) map, "");
        HashMap<K, V> hashMap = map instanceof HashMap ? (HashMap) map : null;
        return hashMap == null ? new HashMap<>(map) : hashMap;
    }
}
