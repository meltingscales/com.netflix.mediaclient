package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.C1887aRy;

/* renamed from: o.aRy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1887aRy extends aRM {
    public static final d b = new d(null);
    private static final e d;
    private static final Map<Integer, e> e;
    private final String c = "Subtitle Appearance GraphQL Migration";
    private final String h = "57413";
    private final int a = e.size();

    @Override // o.aRM
    public String d() {
        return this.h;
    }

    @Override // o.aRM
    /* renamed from: j */
    public String a() {
        return this.c;
    }

    /* renamed from: o.aRy$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final boolean a;
        private final String c;

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && this.a == eVar.a;
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + Boolean.hashCode(this.a);
        }

        public String toString() {
            String str = this.c;
            boolean z = this.a;
            return "Features(friendlyName=" + str + ", isInTest=" + z + ")";
        }

        public e(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = z;
        }
    }

    /* renamed from: o.aRy$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final e d() {
            return C1887aRy.d;
        }

        public final e b() {
            Object e;
            e = dqE.e(C1887aRy.e, Integer.valueOf(e().getCellId()));
            return (e) e;
        }

        public final ABTestConfig.Cell e() {
            return C1818aPj.e(C1887aRy.class);
        }
    }

    static {
        Map c;
        Map<Integer, e> b2;
        e eVar = new e("Control", false);
        d = eVar;
        c = dqE.c(dpD.a(1, eVar), dpD.a(2, new e("GraphQL", true)));
        b2 = dqC.b(c, (drM) new drM<Integer, e>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab57413_ProfileSubtitleGraphQLMigration$Companion$features$1
            public final C1887aRy.e b(int i) {
                return C1887aRy.b.d();
            }

            @Override // o.drM
            public /* synthetic */ C1887aRy.e invoke(Integer num) {
                return b(num.intValue());
            }
        });
        e = b2;
    }
}
