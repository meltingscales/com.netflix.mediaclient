package o;

import android.util.LruCache;

/* renamed from: o.Ny  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1080Ny<K, V> extends LruCache<K, V> {
    private final String d;

    public C1080Ny(String str, int i) {
        super(i);
        this.d = str;
    }

    @Override // android.util.LruCache
    public void entryRemoved(boolean z, K k, V v, V v2) {
        String str = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "- Evicted: " : "- Entry removed: ");
        sb.append(k);
        C1044Mm.b(str, sb.toString());
        super.entryRemoved(z, k, v, v2);
    }
}
