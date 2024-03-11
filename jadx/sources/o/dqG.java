package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class dqG<K, V> implements InterfaceC8583dqz<K, V> {
    private final Map<K, V> a;
    private final drM<K, V> b;

    @Override // o.InterfaceC8583dqz
    public Map<K, V> a() {
        return this.a;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dqG(Map<K, ? extends V> map, drM<? super K, ? extends V> drm) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) drm, "");
        this.a = map;
        this.b = drm;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return e();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return b();
    }

    @Override // java.util.Map
    public final int size() {
        return c();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return d();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return a().equals(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }

    public int c() {
        return a().size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return a().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return a().containsValue(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return a().get(obj);
    }

    public Set<K> b() {
        return a().keySet();
    }

    public Collection<V> d() {
        return a().values();
    }

    public Set<Map.Entry<K, V>> e() {
        return a().entrySet();
    }

    @Override // o.InterfaceC8583dqz
    public V a(K k) {
        Map<K, V> a = a();
        V v = a.get(k);
        return (v != null || a.containsKey(k)) ? v : this.b.invoke(k);
    }
}
