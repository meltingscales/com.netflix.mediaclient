package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aQM;

/* loaded from: classes.dex */
public final class aQM extends aRM {
    private static final Map<Integer, c> c;
    private static final c d;
    public static final a e = new a(null);
    private final String b = "Mobile Companion V1";
    private final String h = "51670";
    private final int a = c.size();

    @Override // o.aRM
    public boolean N_() {
        return true;
    }

    @Override // o.aRM
    public boolean O_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.h;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.b;
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final boolean e;

        public final boolean d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && this.e == cVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            String str = this.a;
            boolean z = this.e;
            return "Features(friendlyName=" + str + ", useFeatureSpecificCopy=" + z + ")";
        }

        public c(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = z;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final c a() {
            return aQM.d;
        }

        public final c b() {
            Object e;
            e = dqE.e(aQM.c, Integer.valueOf(c().getCellId()));
            return (c) e;
        }

        public final ABTestConfig.Cell c() {
            return C1818aPj.e(aQM.class);
        }

        public final boolean d() {
            return c() != ABTestConfig.Cell.CELL_1;
        }
    }

    static {
        Map c2;
        Map<Integer, c> b;
        c cVar = new c("Control", false);
        d = cVar;
        c2 = dqE.c(dpD.a(1, cVar), dpD.a(2, new c("Mobile Companion Enabled With Feature Specific Copy, Lower Visibility", true)), dpD.a(3, new c("Mobile Companion Enabled With Feature Specific Copy, High Visibility", true)), dpD.a(4, new c("Mobile Companion Enabled With Feature Specific Copy, 3 + Increased Frequency", true)), dpD.a(5, new c("Mobile Companion Enabled With Generic Copy, 4 + MSG 2", false)), dpD.a(6, new c("Mobile Companion Enabled With Generic Copy, 4 + MSG 3", false)));
        b = dqC.b(c2, (drM) new drM<Integer, c>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab51670_MobileCompanionV1$Companion$features$1
            public final aQM.c c(int i) {
                return aQM.e.a();
            }

            @Override // o.drM
            public /* synthetic */ aQM.c invoke(Integer num) {
                return c(num.intValue());
            }
        });
        c = b;
    }
}
