package o;

import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import java.util.List;
import java.util.Set;

/* renamed from: o.bTp */
/* loaded from: classes4.dex */
public final class C4029bTp {
    private final List<Long> a;
    private final Set<Integer> b;
    private final List<TrailerItem.a> d;

    public C4029bTp() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4029bTp c(C4029bTp c4029bTp, Set set, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            set = c4029bTp.b;
        }
        if ((i & 2) != 0) {
            list = c4029bTp.a;
        }
        if ((i & 4) != 0) {
            list2 = c4029bTp.d;
        }
        return c4029bTp.d(set, list, list2);
    }

    public final Set<Integer> b() {
        return this.b;
    }

    public final List<Long> c() {
        return this.a;
    }

    public final C4029bTp d(Set<Integer> set, List<Long> list, List<TrailerItem.a> list2) {
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        return new C4029bTp(set, list, list2);
    }

    public final List<TrailerItem.a> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4029bTp) {
            C4029bTp c4029bTp = (C4029bTp) obj;
            return C8632dsu.c(this.b, c4029bTp.b) && C8632dsu.c(this.a, c4029bTp.a) && C8632dsu.c(this.d, c4029bTp.d);
        }
        return false;
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        Set<Integer> set = this.b;
        List<Long> list = this.a;
        List<TrailerItem.a> list2 = this.d;
        return "FeedState(actionsHandled=" + set + ", feedPlaylistIds=" + list + ", headers=" + list2 + ")";
    }

    public C4029bTp(Set<Integer> set, List<Long> list, List<TrailerItem.a> list2) {
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        this.b = set;
        this.a = list;
        this.d = list2;
    }

    public /* synthetic */ C4029bTp(Set set, List list, List list2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? dqN.e() : set, (i & 2) != 0 ? C8569dql.i() : list, (i & 4) != 0 ? C8569dql.i() : list2);
    }
}
