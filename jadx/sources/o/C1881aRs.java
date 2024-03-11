package o;

import android.content.Context;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.C1881aRs;

/* renamed from: o.aRs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1881aRs extends aRM {
    private static final Map<Integer, b> a;
    private static final b c;
    public static final d d = new d(null);
    private final String b = "[Android] Use new BFG Router";
    private final String i = "57115";
    private final int e = a.size();

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
        return this.b;
    }

    /* renamed from: o.aRs$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final boolean c;
        private final String e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && this.c == bVar.c;
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

        public b(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = z;
        }
    }

    /* renamed from: o.aRs$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final b c() {
            return C1881aRs.c;
        }

        public final ABTestConfig.Cell e() {
            return C1818aPj.e(C1881aRs.class);
        }

        public final boolean d() {
            return e() != ABTestConfig.Cell.CELL_1;
        }

        public final boolean b() {
            C1332Xp c1332Xp = C1332Xp.b;
            ABTestConfig.Cell e = C1818aPj.e(C1881aRs.class);
            C8632dsu.a(e, "");
            return ((C1881aRs) C1818aPj.a(C1881aRs.class)).d((Context) C1332Xp.b(Context.class), e);
        }
    }

    static {
        Map c2;
        Map<Integer, b> b2;
        b bVar = new b("Control", false);
        c = bVar;
        c2 = dqE.c(dpD.a(1, bVar), dpD.a(2, new b("Use new bfg router", true)));
        b2 = dqC.b(c2, (drM) new drM<Integer, b>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab57115_AndroidUseNewBFGRouter$Companion$features$1
            public final C1881aRs.b c(int i) {
                return C1881aRs.d.c();
            }

            @Override // o.drM
            public /* synthetic */ C1881aRs.b invoke(Integer num) {
                return c(num.intValue());
            }
        });
        a = b2;
    }
}
