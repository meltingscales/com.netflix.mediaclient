package o;

import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;

/* renamed from: o.bjA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4680bjA {
    private final long a;
    private final SegmentType b;
    private final long c;
    private final String d;
    private final Long e;

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.c;
    }

    public final SegmentType c() {
        return this.b;
    }

    public final Long d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4680bjA) {
            C4680bjA c4680bjA = (C4680bjA) obj;
            return this.c == c4680bjA.c && C8632dsu.c((Object) this.d, (Object) c4680bjA.d) && this.a == c4680bjA.a && this.b == c4680bjA.b && C8632dsu.c(this.e, c4680bjA.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.c);
        int hashCode2 = this.d.hashCode();
        int hashCode3 = Long.hashCode(this.a);
        int hashCode4 = this.b.hashCode();
        Long l = this.e;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        long j = this.c;
        String str = this.d;
        long j2 = this.a;
        SegmentType segmentType = this.b;
        Long l = this.e;
        return "MediaSegmentDescription(viewableId=" + j + ", segmentId=" + str + ", parentViewableId=" + j2 + ", contentType=" + segmentType + ", adBreakLocationMs=" + l + ")";
    }

    public C4680bjA(long j, String str, long j2, SegmentType segmentType, Long l) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) segmentType, "");
        this.c = j;
        this.d = str;
        this.a = j2;
        this.b = segmentType;
        this.e = l;
    }
}
