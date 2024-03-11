package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.C1888aRz;

/* renamed from: o.aRz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1888aRz extends aRM {
    private static final Map<Integer, d> a;
    public static final a d = new a(null);
    private static final d e;
    private final String b = "Fetch Live In Lolomo";
    private final String i = "57560";
    private final int c = a.size();

    @Override // o.aRM
    public String d() {
        return this.i;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.b;
    }

    /* renamed from: o.aRz$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final boolean b;
        private final String c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && this.b == dVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            String str = this.c;
            boolean z = this.b;
            return "Features(friendlyName=" + str + ", isInTest=" + z + ")";
        }

        public d(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = z;
        }
    }

    /* renamed from: o.aRz$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final d d() {
            return C1888aRz.e;
        }

        public final ABTestConfig.Cell e() {
            return C1818aPj.e(C1888aRz.class);
        }

        public final boolean b() {
            return e() != ABTestConfig.Cell.CELL_1;
        }
    }

    static {
        Map c;
        Map<Integer, d> b;
        d dVar = new d("Control", false);
        e = dVar;
        c = dqE.c(dpD.a(1, dVar), dpD.a(2, new d("Fetch Live In Lolomo", true)));
        b = dqC.b(c, (drM) new drM<Integer, d>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab57560_FetchLiveInLolomo$Companion$features$1
            public final C1888aRz.d d(int i) {
                return C1888aRz.d.d();
            }

            @Override // o.drM
            public /* synthetic */ C1888aRz.d invoke(Integer num) {
                return d(num.intValue());
            }
        });
        a = b;
    }
}
