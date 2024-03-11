package o;

import java.util.Map;

/* loaded from: classes5.dex */
public final class dvD<K, V> extends dvC<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    /* renamed from: g */
    public Map.Entry<K, V> next() {
        C8725dwf.d(d());
        a(a() + 2);
        return new C8703dvk(b()[a() - 2], b()[a() - 1]);
    }
}
