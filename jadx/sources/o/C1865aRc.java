package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.C1865aRc;

/* renamed from: o.aRc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1865aRc extends aRM {
    public static final c b = new c(null);
    private static final d d;
    private static final Map<Integer, d> e;
    private final String g = "53602";
    private final int c = 4;
    private final String a = "MSL Network Timeout";

    public static final d j() {
        return b.d();
    }

    public static final boolean m() {
        return b.b();
    }

    @Override // o.aRM
    public boolean O_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.g;
    }

    @Override // o.aRM
    /* renamed from: k */
    public String a() {
        return this.a;
    }

    /* renamed from: o.aRc$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final int e;

        public final int c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && this.e == dVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Integer.hashCode(this.e);
        }

        public String toString() {
            String str = this.a;
            int i = this.e;
            return "Features(friendlyName=" + str + ", timeout=" + i + ")";
        }

        public d(String str, int i) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = i;
        }

        public /* synthetic */ d(String str, int i, int i2, C8627dsp c8627dsp) {
            this(str, (i2 & 2) != 0 ? 0 : i);
        }
    }

    /* renamed from: o.aRc$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final d e() {
            return C1865aRc.d;
        }

        public final d d() {
            Object e;
            e = dqE.e(C1865aRc.e, Integer.valueOf(c().getCellId()));
            return (d) e;
        }

        public final boolean b() {
            return c() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell c() {
            return C1818aPj.e(C1865aRc.class);
        }
    }

    static {
        Map c2;
        Map<Integer, d> b2;
        d dVar = new d("Control", 0, 2, null);
        d = dVar;
        c2 = dqE.c(dpD.a(1, dVar), dpD.a(2, new d("10 Seconds", 10000)), dpD.a(3, new d("20 Seconds", 20000)), dpD.a(4, new d("40 Seconds", 40000)));
        b2 = dqC.b(c2, (drM) new drM<Integer, d>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab53602_MslTimeout$Companion$features$1
            public final C1865aRc.d d(int i) {
                return C1865aRc.b.e();
            }

            @Override // o.drM
            public /* synthetic */ C1865aRc.d invoke(Integer num) {
                return d(num.intValue());
            }
        });
        e = b2;
    }
}
