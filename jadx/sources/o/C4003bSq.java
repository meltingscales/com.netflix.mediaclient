package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import java.util.List;

/* renamed from: o.bSq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4003bSq {
    private final List<C4002bSp> c;
    private final LoMo e;

    public final List<C4002bSp> a() {
        return this.c;
    }

    public final LoMo b() {
        return this.e;
    }

    public final LoMo c() {
        return this.e;
    }

    public final List<C4002bSp> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4003bSq) {
            C4003bSq c4003bSq = (C4003bSq) obj;
            return C8632dsu.c(this.e, c4003bSq.e) && C8632dsu.c(this.c, c4003bSq.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        List<C4002bSp> list = this.c;
        return (hashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        LoMo loMo = this.e;
        List<C4002bSp> list = this.c;
        return "FetchRowResponse(row=" + loMo + ", rowEntities=" + list + ")";
    }

    public C4003bSq(LoMo loMo, List<C4002bSp> list) {
        C8632dsu.c((Object) loMo, "");
        this.e = loMo;
        this.c = list;
    }
}
