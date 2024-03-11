package o;

import java.util.Map;

/* loaded from: classes5.dex */
public final class dvH<K, V> extends dvC<K, V, Map.Entry<K, V>> {
    private final C8713dvu<K, V> c;

    public dvH(C8713dvu<K, V> c8713dvu) {
        C8632dsu.c((Object) c8713dvu, "");
        this.c = c8713dvu;
    }

    @Override // java.util.Iterator
    /* renamed from: g */
    public Map.Entry<K, V> next() {
        C8725dwf.d(d());
        a(a() + 2);
        return new C8709dvq(this.c, b()[a() - 2], b()[a() - 1]);
    }
}
