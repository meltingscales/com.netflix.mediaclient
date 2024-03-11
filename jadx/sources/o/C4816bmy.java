package o;

import java.util.List;
import java.util.Map;

/* renamed from: o.bmy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4816bmy {
    private final Map<String, AbstractC4518bfy> a;
    private final C4805bmn b;
    private final long c;
    private final List<AbstractC4533bgM> d;

    public final C4805bmn a() {
        return this.b;
    }

    public final Map<String, AbstractC4518bfy> b() {
        return this.a;
    }

    public final long c() {
        return this.c;
    }

    public final List<AbstractC4533bgM> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4816bmy) {
            C4816bmy c4816bmy = (C4816bmy) obj;
            return C8632dsu.c(this.d, c4816bmy.d) && C8632dsu.c(this.a, c4816bmy.a) && C8632dsu.c(this.b, c4816bmy.b) && this.c == c4816bmy.c;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c);
    }

    public String toString() {
        List<AbstractC4533bgM> list = this.d;
        Map<String, AbstractC4518bfy> map = this.a;
        C4805bmn c4805bmn = this.b;
        long j = this.c;
        return "PdsAdsImpressionConfiguration(timedEvents=" + list + ", actionEvents=" + map + ", ads3PConfig=" + c4805bmn + ", durationMs=" + j + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4816bmy(List<? extends AbstractC4533bgM> list, Map<String, ? extends AbstractC4518bfy> map, C4805bmn c4805bmn, long j) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) c4805bmn, "");
        this.d = list;
        this.a = map;
        this.b = c4805bmn;
        this.c = j;
    }
}
