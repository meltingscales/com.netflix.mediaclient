package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MyNetflix;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aQY;

/* loaded from: classes.dex */
public final class aQY extends aRM {
    private static final Map<Integer, a> b;
    private static final a c;
    public static final d e = new d(null);
    private final String d = "My Netflix";
    private final String g = "53407";
    private final int a = b.size();

    @Override // o.aRM
    public String d() {
        return this.g;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.d;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final boolean c;
        private final String e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && this.c == aVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            String str = this.e;
            boolean z = this.c;
            return "Features(friendlyName=" + str + ", isInTest=" + z + ")";
        }

        public a(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = z;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final a b() {
            return aQY.c;
        }

        public final boolean c() {
            return !aQJ.e.d() && e() == ABTestConfig.Cell.CELL_1 && (a() || Config_FastProperty_MyNetflix.Companion.b());
        }

        private final ABTestConfig.Cell e() {
            return C1818aPj.e(aQY.class);
        }

        private final boolean a() {
            C1332Xp c1332Xp = C1332Xp.b;
            ABTestConfig.Cell e = C1818aPj.e(aQY.class);
            C8632dsu.a(e, "");
            return ((aQY) C1818aPj.a(aQY.class)).d((Context) C1332Xp.b(Context.class), e);
        }
    }

    static {
        Map c2;
        Map<Integer, a> b2;
        a aVar = new a("My Netflix bottom tab", false);
        c = aVar;
        c2 = dqE.c(dpD.a(1, aVar), dpD.a(2, new a("Control Experience", true)));
        b2 = dqC.b(c2, (drM) new drM<Integer, a>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab53407_MyNetflixHoldback$Companion$features$1
            public final aQY.a a(int i) {
                return aQY.e.b();
            }

            @Override // o.drM
            public /* synthetic */ aQY.a invoke(Integer num) {
                return a(num.intValue());
            }
        });
        b = b2;
    }
}
