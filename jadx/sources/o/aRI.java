package o;

import java.util.Map;
import o.aRI;

/* loaded from: classes.dex */
public final class aRI extends aRM {
    private static final c b;
    public static final a d = new a(null);
    private static final Map<Integer, c> e;
    private final String a = "NetflixVideoView Surface Creation";
    private final String f = "58207";
    private final int c = e.size();

    @Override // o.aRM
    public String d() {
        return this.f;
    }

    @Override // o.aRM
    /* renamed from: j */
    public String a() {
        return this.a;
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final boolean b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && this.b == cVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            String str = this.a;
            boolean z = this.b;
            return "Features(friendlyName=" + str + ", isInTest=" + z + ")";
        }

        public c(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = z;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final c e() {
            return aRI.b;
        }
    }

    static {
        Map c2;
        Map<Integer, c> b2;
        c cVar = new c("Control", false);
        b = cVar;
        c2 = dqE.c(dpD.a(1, cVar), dpD.a(2, new c("Create Single Surface Earlier", true)), dpD.a(3, new c("Create Surface Earlier allow recreation", true)));
        b2 = dqC.b(c2, (drM) new drM<Integer, c>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab58207_NetflixVideoViewSurface$Companion$features$1
            public final aRI.c e(int i) {
                return aRI.d.e();
            }

            @Override // o.drM
            public /* synthetic */ aRI.c invoke(Integer num) {
                return e(num.intValue());
            }
        });
        e = b2;
    }
}
