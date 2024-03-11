package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;

/* renamed from: o.aRm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1875aRm extends aRM {
    public static final d a = new d(null);
    private static final Map<Integer, b> c;
    private static final b d;
    private final String g = "56266";
    private final int e = c.size();
    private final String b = "Trailers on GPS";

    @Override // o.aRM
    /* renamed from: c */
    public String a() {
        return this.b;
    }

    @Override // o.aRM
    public String d() {
        return this.g;
    }

    /* renamed from: o.aRm$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final boolean b;
        private final boolean d;
        private final String e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && this.d == bVar.d && this.b == bVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (((this.e.hashCode() * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            String str = this.e;
            boolean z = this.d;
            boolean z2 = this.b;
            return "Features(friendlyName=" + str + ", trailersOnGPS=" + z + ", hasCWRow=" + z2 + ")";
        }

        public b(String str, boolean z, boolean z2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = z;
            this.b = z2;
        }

        public /* synthetic */ b(String str, boolean z, boolean z2, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
        }
    }

    /* renamed from: o.aRm$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final boolean d() {
            return c() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell c() {
            return C1818aPj.e(C1875aRm.class);
        }
    }

    static {
        Map<Integer, b> c2;
        b bVar = new b("Control", false, false, 6, null);
        d = bVar;
        c2 = dqE.c(dpD.a(1, bVar), dpD.a(2, new b("Trailers on GPS", false, false, 6, null)), dpD.a(3, new b("With CW", false, true, 2, null)));
        c = c2;
    }
}
