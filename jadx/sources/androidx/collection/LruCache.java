package androidx.collection;

import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final Lock lock;
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    protected V create(K k) {
        C8632dsu.c((Object) k, "");
        return null;
    }

    protected void entryRemoved(boolean z, K k, V v, V v2) {
        C8632dsu.c((Object) k, "");
        C8632dsu.c((Object) v, "");
    }

    protected int sizeOf(K k, V v) {
        C8632dsu.c((Object) k, "");
        C8632dsu.c((Object) v, "");
        return 1;
    }

    public LruCache(int i) {
        this.maxSize = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.map = new LruHashMap<>(0, 0.75f);
        this.lock = new Lock();
    }

    private final int safeSizeOf(K k, V v) {
        int sizeOf = sizeOf(k, v);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException(("Negative size: " + k + '=' + v).toString());
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            Iterator<T> it = this.map.getEntries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            dpR dpr = dpR.c;
        }
        return linkedHashMap;
    }

    public void resize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        synchronized (this.lock) {
            this.maxSize = i;
            dpR dpr = dpR.c;
        }
        trimToSize(i);
    }

    public final V get(K k) {
        V put;
        C8632dsu.c((Object) k, "");
        synchronized (this.lock) {
            V v = this.map.get(k);
            if (v != null) {
                this.hitCount++;
                return v;
            }
            this.missCount++;
            V create = create(k);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                this.createCount++;
                put = this.map.put(k, create);
                if (put != null) {
                    this.map.put(k, put);
                } else {
                    this.size += safeSizeOf(k, create);
                    dpR dpr = dpR.c;
                }
            }
            if (put != null) {
                entryRemoved(false, k, create, put);
                return put;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final V put(K k, V v) {
        V put;
        C8632dsu.c((Object) k, "");
        C8632dsu.c((Object) v, "");
        synchronized (this.lock) {
            this.putCount++;
            this.size += safeSizeOf(k, v);
            put = this.map.put(k, v);
            if (put != null) {
                this.size -= safeSizeOf(k, put);
            }
            dpR dpr = dpR.c;
        }
        if (put != null) {
            entryRemoved(false, k, put, v);
        }
        trimToSize(this.maxSize);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!".toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r6) {
        /*
            r5 = this;
        L0:
            androidx.collection.internal.Lock r0 = r5.lock
            monitor-enter(r0)
            int r1 = r5.size     // Catch: java.lang.Throwable -> L62
            if (r1 < 0) goto L56
            androidx.collection.internal.LruHashMap<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L62
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L13
            int r1 = r5.size     // Catch: java.lang.Throwable -> L62
            if (r1 != 0) goto L56
        L13:
            int r1 = r5.size     // Catch: java.lang.Throwable -> L62
            if (r1 <= r6) goto L54
            androidx.collection.internal.LruHashMap<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L62
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L20
            goto L54
        L20:
            androidx.collection.internal.LruHashMap<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L62
            java.util.Set r1 = r1.getEntries()     // Catch: java.lang.Throwable -> L62
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L62
            java.lang.Object r1 = o.C8570dqm.h(r1)     // Catch: java.lang.Throwable -> L62
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L62
            if (r1 != 0) goto L32
            monitor-exit(r0)
            return
        L32:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L62
            androidx.collection.internal.LruHashMap<K, V> r3 = r5.map     // Catch: java.lang.Throwable -> L62
            r3.remove(r2)     // Catch: java.lang.Throwable -> L62
            int r3 = r5.size     // Catch: java.lang.Throwable -> L62
            int r4 = r5.safeSizeOf(r2, r1)     // Catch: java.lang.Throwable -> L62
            int r3 = r3 - r4
            r5.size = r3     // Catch: java.lang.Throwable -> L62
            int r3 = r5.evictionCount     // Catch: java.lang.Throwable -> L62
            r4 = 1
            int r3 = r3 + r4
            r5.evictionCount = r3     // Catch: java.lang.Throwable -> L62
            monitor-exit(r0)
            r0 = 0
            r5.entryRemoved(r4, r2, r1, r0)
            goto L0
        L54:
            monitor-exit(r0)
            return
        L56:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L62
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L62
            throw r6     // Catch: java.lang.Throwable -> L62
        L62:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.trimToSize(int):void");
    }

    public final V remove(K k) {
        V remove;
        C8632dsu.c((Object) k, "");
        synchronized (this.lock) {
            remove = this.map.remove(k);
            if (remove != null) {
                this.size -= safeSizeOf(k, remove);
            }
            dpR dpr = dpR.c;
        }
        if (remove != null) {
            entryRemoved(false, k, remove, null);
        }
        return remove;
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            int i = this.hitCount;
            int i2 = this.missCount + i;
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }
}
