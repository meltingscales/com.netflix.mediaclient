package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import o.C8632dsu;
import o.dsK;

/* loaded from: classes.dex */
public final class EmptyMap implements Map, Serializable, dsK {
    public static final EmptyMap d = new EmptyMap();
    private static final long serialVersionUID = 8246714829545688274L;

    private final Object readResolve() {
        return d;
    }

    public boolean b(Void r2) {
        C8632dsu.c((Object) r2, "");
        return false;
    }

    public int c() {
        return 0;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    /* renamed from: d */
    public Void get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    /* renamed from: e */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return "{}";
    }

    private EmptyMap() {
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return b((Void) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry> entrySet() {
        return b();
    }

    @Override // java.util.Map
    public final Set<Object> keySet() {
        return d();
    }

    @Override // java.util.Map
    public final int size() {
        return c();
    }

    @Override // java.util.Map
    public final Collection values() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public Set<Map.Entry> b() {
        return EmptySet.c;
    }

    public Set<Object> d() {
        return EmptySet.c;
    }

    public Collection a() {
        return EmptyList.b;
    }
}
