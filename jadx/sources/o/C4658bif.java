package o;

import java.util.List;

/* renamed from: o.bif  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4658bif extends C4656bid {
    private final String a;
    private final int e;

    public int b() {
        return this.e;
    }

    public String d() {
        return this.a;
    }

    public C4658bif(long j, long j2, long j3, long j4, String str, int i) {
        super(j, j2, j3, j4);
        this.a = str;
        this.e = i;
    }

    @Override // o.C4656bid
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CachedFragmentInfo{trackType=");
        sb.append(this.e == 1 ? "A" : "V");
        sb.append(", streamId='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", pts=(");
        sb.append(androidx.media3.common.C.usToMs(f()));
        sb.append("ms,");
        sb.append(androidx.media3.common.C.usToMs(g()));
        sb.append("ms), bytes=(");
        sb.append(c());
        sb.append(",");
        sb.append(e());
        sb.append(')');
        sb.append('}');
        return sb.toString();
    }

    public static C4658bif e(String str, List<C4656bid> list, long j, long j2, int i) {
        List<C4656bid> c = C4674biv.c(list, j, j + j2);
        if (c.isEmpty()) {
            return null;
        }
        long f = c.get(0).f();
        return new C4658bif(f, c.get(c.size() - 1).g() - f, j, j2, str, i);
    }
}
