package o;

import androidx.collection.LruCache;

/* renamed from: o.dh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8262dh {
    private static final C8262dh c = new C8262dh();
    private final LruCache<String, C3658bG> a = new LruCache<>(20);

    public static C8262dh a() {
        return c;
    }

    C8262dh() {
    }

    public C3658bG e(String str) {
        if (str == null) {
            return null;
        }
        return this.a.get(str);
    }

    public void b(String str, C3658bG c3658bG) {
        if (str == null) {
            return;
        }
        this.a.put(str, c3658bG);
    }
}
