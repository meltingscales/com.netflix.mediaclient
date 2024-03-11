package o;

import com.netflix.model.leafs.advisory.Advisory;
import java.util.Map;

/* loaded from: classes4.dex */
public final class cJZ {
    private final String a;
    private final boolean b;
    private final Map<Advisory, Boolean> d;
    private final Advisory e;

    public cJZ() {
        this(null, null, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ cJZ a(cJZ cjz, String str, Map map, boolean z, Advisory advisory, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cjz.a;
        }
        if ((i & 2) != 0) {
            map = cjz.d;
        }
        if ((i & 4) != 0) {
            z = cjz.b;
        }
        if ((i & 8) != 0) {
            advisory = cjz.e;
        }
        return cjz.c(str, map, z, advisory);
    }

    public final String a() {
        return this.a;
    }

    public final Map<Advisory, Boolean> b() {
        return this.d;
    }

    public final cJZ c(String str, Map<Advisory, Boolean> map, boolean z, Advisory advisory) {
        C8632dsu.c((Object) map, "");
        return new cJZ(str, map, z, advisory);
    }

    public final boolean d() {
        return this.b;
    }

    public final Advisory e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cJZ) {
            cJZ cjz = (cJZ) obj;
            return C8632dsu.c((Object) this.a, (Object) cjz.a) && C8632dsu.c(this.d, cjz.d) && this.b == cjz.b && C8632dsu.c(this.e, cjz.e);
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = Boolean.hashCode(this.b);
        Advisory advisory = this.e;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (advisory != null ? advisory.hashCode() : 0);
    }

    public String toString() {
        String str = this.a;
        Map<Advisory, Boolean> map = this.d;
        boolean z = this.b;
        Advisory advisory = this.e;
        return "ContentAdvisoryState(videoId=" + str + ", advisories=" + map + ", isAdvisoryDisabled=" + z + ", advisoryToDisplay=" + advisory + ")";
    }

    public cJZ(String str, Map<Advisory, Boolean> map, boolean z, Advisory advisory) {
        C8632dsu.c((Object) map, "");
        this.a = str;
        this.d = map;
        this.b = z;
        this.e = advisory;
    }

    public /* synthetic */ cJZ(String str, Map map, boolean z, Advisory advisory, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? dqE.d() : map, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : advisory);
    }
}
