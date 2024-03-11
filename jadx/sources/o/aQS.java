package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aQS;

/* loaded from: classes.dex */
public final class aQS extends aRM {
    public static final d a = new d(null);
    private static final Map<Integer, e> c;
    private static final e e;
    private final String d = "Adaptive_Home_Lolomo";
    private final String i = "52105";
    private final int b = c.size();

    @Override // o.aRM
    public String d() {
        return this.i;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.d;
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final boolean a;
        private final boolean b;
        private final int c;
        private final String d;
        private final int e;
        private final int i;

        public final int a() {
            return this.e;
        }

        public final boolean b() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }

        public final int d() {
            return this.i;
        }

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && this.a == eVar.a && this.i == eVar.i && this.e == eVar.e && this.c == eVar.c && this.b == eVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (((((((((this.d.hashCode() * 31) + Boolean.hashCode(this.a)) * 31) + Integer.hashCode(this.i)) * 31) + Integer.hashCode(this.e)) * 31) + Integer.hashCode(this.c)) * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            String str = this.d;
            boolean z = this.a;
            int i = this.i;
            int i2 = this.e;
            int i3 = this.c;
            boolean z2 = this.b;
            return "Features(friendlyName=" + str + ", isInTest=" + z + ", pageSize=" + i + ", firstAdaptedRow=" + i2 + ", offset=" + i3 + ", avoidMoreRowsCache=" + z2 + ")";
        }

        public e(String str, boolean z, int i, int i2, int i3, boolean z2) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = z;
            this.i = i;
            this.e = i2;
            this.c = i3;
            this.b = z2;
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
            return aQS.e;
        }

        public final e e() {
            Object e;
            e = dqE.e(aQS.c, Integer.valueOf(d().getCellId()));
            return (e) e;
        }

        public final ABTestConfig.Cell d() {
            return C1818aPj.e(aQS.class);
        }

        public final boolean b() {
            return d() != ABTestConfig.Cell.CELL_1;
        }
    }

    static {
        Map c2;
        Map<Integer, e> b;
        e eVar = new e("Control", false, 2, 3, 4, false);
        e = eVar;
        c2 = dqE.c(dpD.a(1, eVar), dpD.a(2, new e("Secondary control: Do all the computations but return the precomputed page", true, 3, 0, 3, true)), dpD.a(3, new e("Most adaptive", true, 3, 0, 1, true)), dpD.a(4, new e("Best Bet: Always adapt starting at 1 (MVP4, initial page call + adapt at profile gate)", true, 3, 0, 3, true)), dpD.a(5, new e("Larger offset", true, 3, 0, 5, true)), dpD.a(6, new e("Best bet (cell 4) without adapting top of page", true, 3, 4, 3, true)), dpD.a(7, new e("Cell 3 with larger fragment", true, 6, 0, 1, true)), dpD.a(8, new e("Cell 4 with larger fragment", true, 6, 0, 3, true)), dpD.a(9, new e("Cell 5 with larger fragment; Less adaptation, better loading", true, 6, 0, 5, true)), dpD.a(10, new e("Best Bet + cache control (vs cell 4)", true, 3, 0, 3, false)), dpD.a(11, new e("Best Bet w/o new adaptive rows (vs cell 4)", true, 3, 0, 3, false)));
        b = dqC.b(c2, (drM) new drM<Integer, e>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab52105_Adaptive_Home_Lolomo$Companion$features$1
            public final aQS.e b(int i) {
                return aQS.a.c();
            }

            @Override // o.drM
            public /* synthetic */ aQS.e invoke(Integer num) {
                return b(num.intValue());
            }
        });
        c = b;
    }
}
