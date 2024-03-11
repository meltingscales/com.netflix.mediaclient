package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aRH;

/* loaded from: classes.dex */
public final class aRH extends aRM {
    private static final Map<Integer, c> a;
    public static final b b = new b(null);
    private static final c e;
    private final String d = "Android - Video Codec Refactor";
    private final String i = "58746";
    private final int c = a.size();

    public static final boolean j() {
        return b.e();
    }

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
    public static final class c {
        private final String a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c((Object) this.a, (Object) ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "Features(friendlyName=" + str + ")";
        }

        public c(String str) {
            C8632dsu.c((Object) str, "");
            this.a = str;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final c a() {
            return aRH.e;
        }

        public final ABTestConfig.Cell c() {
            return C1818aPj.e(aRH.class);
        }

        public final boolean e() {
            return c() != ABTestConfig.Cell.CELL_1;
        }
    }

    static {
        Map c2;
        Map<Integer, c> b2;
        c cVar = new c("Control");
        e = cVar;
        c2 = dqE.c(dpD.a(1, cVar), dpD.a(2, new c("Refactor")));
        b2 = dqC.b(c2, (drM) new drM<Integer, c>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab58746_VideoCodecRefactor$Companion$features$1
            public final aRH.c b(int i) {
                return aRH.b.a();
            }

            @Override // o.drM
            public /* synthetic */ aRH.c invoke(Integer num) {
                return b(num.intValue());
            }
        });
        a = b2;
    }
}
