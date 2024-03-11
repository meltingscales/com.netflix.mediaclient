package o;

import android.util.LongSparseArray;
import android.util.Pair;
import java.util.List;

/* renamed from: o.bog  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4904bog {
    private final C4624bhy a;
    private c b;
    private final LongSparseArray<c> d = new LongSparseArray<>();

    public C4904bog(C4624bhy c4624bhy) {
        this.a = c4624bhy;
    }

    public void e(long j, List<Long> list, String str, String str2) {
        synchronized (this.d) {
            this.d.put(j, new c(list, str, str2));
        }
    }

    public Pair<String, String> b(long j, long j2) {
        synchronized (this.d) {
            c cVar = this.d.get(j);
            if (cVar == null || !cVar.c.contains(Long.valueOf(j2))) {
                return null;
            }
            this.b = cVar;
            return Pair.create(cVar.e, cVar.d);
        }
    }

    public void a(long j) {
        c cVar;
        synchronized (this.d) {
            c cVar2 = this.d.get(j);
            if (cVar2 != null && (cVar = this.b) != null) {
                if (C8168dfL.d(cVar2.e, cVar.e)) {
                    for (Long l : cVar2.c) {
                        C4726bju e = this.a.e(l.longValue());
                        if (e != null) {
                            e.b(Long.valueOf(j));
                        }
                    }
                }
            }
        }
    }

    public void d() {
        synchronized (this.d) {
            this.d.clear();
        }
    }

    /* renamed from: o.bog$c */
    /* loaded from: classes3.dex */
    static class c {
        List<Long> c;
        String d;
        String e;

        public c(List<Long> list, String str, String str2) {
            this.c = list;
            this.e = str;
            this.d = str2;
        }
    }
}
