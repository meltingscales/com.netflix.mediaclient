package o;

import java.util.Map;

/* renamed from: o.bmv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4813bmv {
    private final String b;
    private boolean d;
    private final Map<String, AbstractC4518bfy> e;

    public final boolean a() {
        return this.d;
    }

    public final Map<String, AbstractC4518bfy> c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final void d(boolean z) {
        this.d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4813bmv) {
            C4813bmv c4813bmv = (C4813bmv) obj;
            return C8632dsu.c(this.e, c4813bmv.e) && C8632dsu.c((Object) this.b, (Object) c4813bmv.b) && this.d == c4813bmv.d;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        String str = this.b;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        Map<String, AbstractC4518bfy> map = this.e;
        String str = this.b;
        boolean z = this.d;
        return "PdsAdBreaksImpressionConfiguration(actionEvents=" + map + ", auditPingUrl=" + str + ", processed=" + z + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4813bmv(Map<String, ? extends AbstractC4518bfy> map, String str, boolean z) {
        C8632dsu.c((Object) map, "");
        this.e = map;
        this.b = str;
        this.d = z;
    }

    public /* synthetic */ C4813bmv(Map map, String str, boolean z, int i, C8627dsp c8627dsp) {
        this(map, str, (i & 4) != 0 ? false : z);
    }
}
