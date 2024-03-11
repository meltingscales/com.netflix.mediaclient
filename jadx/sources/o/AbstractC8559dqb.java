package o;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.dqb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8559dqb<K, V> extends AbstractMap<K, V> implements Map<K, V>, dsP {
    public abstract Set getEntries();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public Set<Object> getKeys() {
        return super.keySet();
    }

    public int getSize() {
        return super.size();
    }

    public Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return (Set<K>) getKeys();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        return (Collection<V>) getValues();
    }
}
