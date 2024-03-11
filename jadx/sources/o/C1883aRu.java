package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;

/* renamed from: o.aRu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1883aRu extends aRM {
    private static final Map<Integer, b> c;
    public static final c d = new c(null);
    private static final b e;
    private final String g = "57559";
    private final int b = c.size();
    private final String a = "Baseline Billboard on Tablet";

    @Override // o.aRM
    public String d() {
        return this.g;
    }

    @Override // o.aRM
    /* renamed from: j */
    public String a() {
        return this.a;
    }

    /* renamed from: o.aRu$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final boolean b;

        public final boolean d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && this.b == bVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            String str = this.a;
            boolean z = this.b;
            return "Features(friendlyName=" + str + ", baselineBillboard=" + z + ")";
        }

        public b(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = z;
        }

        public /* synthetic */ b(String str, boolean z, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? false : z);
        }
    }

    /* renamed from: o.aRu$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final b e() {
            Object e;
            e = dqE.e(C1883aRu.c, Integer.valueOf(d().getCellId()));
            return (b) e;
        }

        private final ABTestConfig.Cell d() {
            return C1818aPj.e(C1883aRu.class);
        }
    }

    static {
        Map<Integer, b> c2;
        b bVar = new b("Control", false, 2, null);
        e = bVar;
        c2 = dqE.c(dpD.a(1, bVar), dpD.a(2, new b("Baseline Billboard", true)));
        c = c2;
    }
}
