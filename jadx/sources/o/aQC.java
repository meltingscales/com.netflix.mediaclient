package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aQC;

/* loaded from: classes.dex */
public final class aQC extends aRM {
    public static final d a = new d(null);
    private static final e b;
    private static final Map<Integer, e> d;
    private final String f = "45199";
    private final int c = d.size();
    private final String e = "Game Billboard In Home";

    public static final boolean h() {
        return a.a();
    }

    public static final e j() {
        return a.d();
    }

    @Override // o.aRM
    public String d() {
        return this.f;
    }

    @Override // o.aRM
    /* renamed from: l */
    public String a() {
        return this.e;
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final boolean a;
        private final String c;
        private final boolean d;

        public final boolean a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && this.d == eVar.d && this.a == eVar.a;
            }
            return false;
        }

        public int hashCode() {
            return (((this.c.hashCode() * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.a);
        }

        public String toString() {
            String str = this.c;
            boolean z = this.d;
            boolean z2 = this.a;
            return "Features(friendlyName=" + str + ", showStaticBillboard=" + z + ", showDynamicBillboard=" + z2 + ")";
        }

        public e(String str, boolean z, boolean z2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = z;
            this.a = z2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final e c() {
            return aQC.b;
        }

        public final boolean a() {
            return e() != ABTestConfig.Cell.CELL_1;
        }

        public final e d() {
            Object e;
            e = dqE.e(aQC.d, Integer.valueOf(e().getCellId()));
            return (e) e;
        }

        public final ABTestConfig.Cell e() {
            return C1818aPj.e(aQC.class);
        }
    }

    static {
        Map c;
        Map<Integer, e> b2;
        e eVar = new e("Control", false, false);
        b = eVar;
        c = dqE.c(dpD.a(1, eVar), dpD.a(2, new e("Show one game in the homepage billboard", false, true)), dpD.a(3, new e("General billboard promoting games", true, false)), dpD.a(4, new e("Show multiple single title game billboard", false, true)), dpD.a(5, new e("Show multiple single game in the homepage billboard", false, true)));
        b2 = dqC.b(c, (drM) new drM<Integer, e>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab45199_gamesBillboardInHome$Companion$features$1
            @Override // o.drM
            public /* synthetic */ aQC.e invoke(Integer num) {
                return b(num.intValue());
            }

            public final aQC.e b(int i) {
                return aQC.a.c();
            }
        });
        d = b2;
    }
}
