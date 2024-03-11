package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.bin  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4666bin {
    private final List<c> d;
    private final Map<String, C4668bip[]> e;

    /* renamed from: o.bin$c */
    /* loaded from: classes3.dex */
    public interface c {
        void c(C4666bin c4666bin, long j);

        void e();
    }

    public C4666bin() {
        this.e = Collections.synchronizedMap(new HashMap());
        this.d = new CopyOnWriteArrayList();
    }

    public C4666bin(Map<String, C4668bip[]> map) {
        Map<String, C4668bip[]> synchronizedMap = Collections.synchronizedMap(new HashMap());
        this.e = synchronizedMap;
        this.d = new CopyOnWriteArrayList();
        synchronizedMap.putAll(map);
    }

    public void b(c cVar) {
        this.d.add(cVar);
    }

    public void a(C4666bin c4666bin, long j) {
        this.e.putAll(c4666bin.e);
        for (c cVar : this.d) {
            cVar.c(c4666bin, j);
        }
    }

    public void d() {
        this.e.clear();
        for (c cVar : this.d) {
            cVar.e();
        }
    }

    public C4668bip[] a(String str) {
        return this.e.get(str);
    }

    public Set<String> a() {
        return this.e.keySet();
    }

    public String c() {
        synchronized (this.e) {
            if (!a().isEmpty()) {
                C4668bip[] a = a(a().iterator().next());
                if (a.length > 0) {
                    return a[0].b();
                }
            }
            return null;
        }
    }

    public String toString() {
        return "NetflixLocationMap{locationMap=" + this.e + '}';
    }
}
