package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.C1882aRt;

/* renamed from: o.aRt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1882aRt extends aRM {
    private static final d b;
    private static final Map<Integer, d> c;
    public static final e d = new e(null);
    private final String e = "Redesigned Share Sheet For Android";
    private final String i = "57092";
    private final int a = c.size();

    @Override // o.aRM
    public String d() {
        return this.i;
    }

    @Override // o.aRM
    /* renamed from: j */
    public String a() {
        return this.e;
    }

    /* renamed from: o.aRt$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String b;
        private final boolean e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && this.e == dVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            String str = this.b;
            boolean z = this.e;
            return "Features(friendlyName=" + str + ", isInTest=" + z + ")";
        }

        public d(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = z;
        }
    }

    /* renamed from: o.aRt$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final d c() {
            return C1882aRt.b;
        }

        public final ABTestConfig.Cell b() {
            return C1818aPj.e(C1882aRt.class);
        }

        public final boolean a() {
            return b() != ABTestConfig.Cell.CELL_1;
        }
    }

    static {
        Map c2;
        Map<Integer, d> b2;
        d dVar = new d("Control", false);
        b = dVar;
        c2 = dqE.c(dpD.a(1, dVar), dpD.a(2, new d("Redesigned Share Sheet", true)));
        b2 = dqC.b(c2, (drM) new drM<Integer, d>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab57092_RedesignedShareSheetForAndroid$Companion$features$1
            public final C1882aRt.d d(int i) {
                return C1882aRt.d.c();
            }

            @Override // o.drM
            public /* synthetic */ C1882aRt.d invoke(Integer num) {
                return d(num.intValue());
            }
        });
        c = b2;
    }
}
