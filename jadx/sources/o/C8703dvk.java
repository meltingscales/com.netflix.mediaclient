package o;

import java.util.Map;

/* renamed from: o.dvk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8703dvk<K, V> implements Map.Entry<K, V>, dsK {
    private final K c;
    private final V d;

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C8703dvk(K k, V v) {
        this.c = k;
        this.d = v;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        int hashCode = key == null ? 0 : key.hashCode();
        V value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && C8632dsu.c(entry.getKey(), getKey()) && C8632dsu.c(entry.getValue(), getValue());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
