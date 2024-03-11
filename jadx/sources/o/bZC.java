package o;

import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import o.C2376afA;

/* loaded from: classes4.dex */
public final class bZC {
    private final List<Pair<C2376afA.d, C2376afA.e>> d;

    public bZC() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bZC) && C8632dsu.c(this.d, ((bZC) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        List<Pair<C2376afA.d, C2376afA.e>> list = this.d;
        return "LiveBoxArtUrls(urls=" + list + ")";
    }

    public bZC(List<Pair<C2376afA.d, C2376afA.e>> list) {
        C8632dsu.c((Object) list, "");
        this.d = list;
    }

    public /* synthetic */ bZC(List list, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? C8569dql.i() : list);
    }

    public final C2376afA.e e(Instant instant) {
        Object obj;
        C8632dsu.c((Object) instant, "");
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C2376afA.d dVar = (C2376afA.d) ((Pair) obj).d();
            if (C8632dsu.c(instant, dVar.c()) || instant.c(dVar.c())) {
                if (C8632dsu.c(instant, dVar.b()) || instant.e(dVar.b())) {
                    break;
                }
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            return (C2376afA.e) pair.a();
        }
        return null;
    }
}
