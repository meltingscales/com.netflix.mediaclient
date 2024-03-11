package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.C1884aRv;

/* renamed from: o.aRv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1884aRv extends aRM {
    private static final c a;
    public static final e c = new e(null);
    private static final Map<Integer, c> d;
    private final String h = "57513";
    private final int e = 4;
    private final String b = "Player UI GraphQL Migration V2";

    @Override // o.aRM
    public String d() {
        return this.h;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.b;
    }

    /* renamed from: o.aRv$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final boolean a;
        private final boolean b;
        private final String c;
        private final boolean e;

        public final boolean a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final boolean d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && this.b == cVar.b && this.a == cVar.a && this.e == cVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.c.hashCode() * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            String str = this.c;
            boolean z = this.b;
            boolean z2 = this.a;
            boolean z3 = this.e;
            return "Features(friendlyName=" + str + ", onlyMemoryCache=" + z + ", onlyDiskCache=" + z2 + ", useManualChainedCache=" + z3 + ")";
        }

        public c(String str, boolean z, boolean z2, boolean z3) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = z;
            this.a = z2;
            this.e = z3;
        }

        public /* synthetic */ c(String str, boolean z, boolean z2, boolean z3, int i, C8627dsp c8627dsp) {
            this(str, z, z2, (i & 8) != 0 ? false : z3);
        }
    }

    /* renamed from: o.aRv$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final c e() {
            return C1884aRv.a;
        }

        public final c d() {
            Object e;
            e = dqE.e(C1884aRv.d, Integer.valueOf(a().getCellId()));
            return (c) e;
        }

        public final ABTestConfig.Cell a() {
            return C1818aPj.e(C1884aRv.class);
        }

        public final boolean b() {
            return a() != ABTestConfig.Cell.CELL_1;
        }
    }

    static {
        Map c2;
        Map<Integer, c> b;
        c cVar = new c("Control", false, false, false, 8, null);
        a = cVar;
        c2 = dqE.c(dpD.a(1, cVar), dpD.a(2, new c("GraphQL both cache", false, false, false, 8, null)), dpD.a(3, new c("GraphQL only memory cache", true, false, false, 8, null)), dpD.a(4, new c("GraphQL only disk cache", false, true, false, 8, null)), dpD.a(5, new c("GraphQL manually chained cache", true, false, true)));
        b = dqC.b(c2, (drM) new drM<Integer, c>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab57513_PlayerUIOnGraphQLV2$Companion$features$1
            public final C1884aRv.c b(int i) {
                return C1884aRv.c.e();
            }

            @Override // o.drM
            public /* synthetic */ C1884aRv.c invoke(Integer num) {
                return b(num.intValue());
            }
        });
        d = b;
    }
}
