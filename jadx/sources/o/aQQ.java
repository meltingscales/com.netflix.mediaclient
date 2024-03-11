package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aQQ;

/* loaded from: classes.dex */
public final class aQQ extends aRM {
    private static final c b;
    public static final d c = new d(null);
    private static final Map<Integer, c> e;
    private final String i = "52962";
    private final int d = 2;
    private final String a = "Retry Retriable Errors";

    public static final boolean j() {
        return c.b();
    }

    @Override // o.aRM
    public boolean O_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.i;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.a;
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final boolean c;
        private final String e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && this.c == cVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            String str = this.e;
            boolean z = this.c;
            return "Features(friendlyName=" + str + ", retryRetriableErrors=" + z + ")";
        }

        public c(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = z;
        }

        public /* synthetic */ c(String str, boolean z, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? false : z);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final c d() {
            return aQQ.b;
        }

        public final boolean b() {
            return a() != ABTestConfig.Cell.CELL_1;
        }

        private final ABTestConfig.Cell a() {
            return C1818aPj.e(aQQ.class);
        }
    }

    static {
        Map c2;
        Map<Integer, c> b2;
        c cVar = new c("Control", false, 2, null);
        b = cVar;
        c2 = dqE.c(dpD.a(1, cVar), dpD.a(2, new c("Retry", true)));
        b2 = dqC.b(c2, (drM) new drM<Integer, c>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab52962_RetryErrors$Companion$features$1
            public final aQQ.c a(int i) {
                return aQQ.c.d();
            }

            @Override // o.drM
            public /* synthetic */ aQQ.c invoke(Integer num) {
                return a(num.intValue());
            }
        });
        e = b2;
    }
}
