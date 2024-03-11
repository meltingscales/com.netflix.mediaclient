package o;

import java.util.List;

/* renamed from: o.Wc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1293Wc {
    private final List<C1292Wb> a;
    private final VR b;
    private final List<VI> e;

    public final List<VI> b() {
        return this.e;
    }

    public final List<C1292Wb> c() {
        return this.a;
    }

    public final VR d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1293Wc) {
            C1293Wc c1293Wc = (C1293Wc) obj;
            return C8632dsu.c(this.b, c1293Wc.b) && C8632dsu.c(this.e, c1293Wc.e) && C8632dsu.c(this.a, c1293Wc.a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.e.hashCode()) * 31) + this.a.hashCode();
    }

    public String toString() {
        VR vr = this.b;
        List<VI> list = this.e;
        List<C1292Wb> list2 = this.a;
        return "TrackData(defaultTrackData=" + vr + ", audioTrackData=" + list + ", timedTextTrackData=" + list2 + ")";
    }

    public C1293Wc(VR vr, List<VI> list, List<C1292Wb> list2) {
        C8632dsu.c((Object) vr, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        this.b = vr;
        this.e = list;
        this.a = list2;
    }
}
