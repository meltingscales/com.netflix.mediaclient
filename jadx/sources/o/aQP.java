package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_CategoriesRowExplicitAllocation;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aQP;

/* loaded from: classes.dex */
public final class aQP extends aRM {
    private static final Map<Integer, d> c;
    private static final d d;
    public static final a e = new a(null);
    private final String b = "Android New Member Categories Row Holdback Test";
    private final String h = "51615";
    private final int a = c.size();

    @Override // o.aRM
    public boolean L_() {
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
    public static final class d {
        private final String a;
        private final boolean c;

        public final boolean b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && this.c == dVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            String str = this.a;
            boolean z = this.c;
            return "Features(friendlyName=" + str + ", enableCategoriesRow=" + z + ")";
        }

        public d(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = z;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final d e() {
            return aQP.d;
        }

        public final d d() {
            Object e;
            e = dqE.e(aQP.c, Integer.valueOf(a().getCellId()));
            return (d) e;
        }

        public final boolean c() {
            if (Config_FastProperty_CategoriesRowExplicitAllocation.Companion.e()) {
                return d().b() && b();
            }
            return d().b();
        }

        public final ABTestConfig.Cell a() {
            ABTestConfig.Cell e = C1818aPj.e(aQP.class);
            C8632dsu.a(e, "");
            return e;
        }

        public final boolean b() {
            C1332Xp c1332Xp = C1332Xp.b;
            ABTestConfig.Cell e = C1818aPj.e(aQP.class);
            C8632dsu.a(e, "");
            return ((aQP) C1818aPj.a(aQP.class)).d((Context) C1332Xp.b(Context.class), e);
        }
    }

    static {
        Map c2;
        Map<Integer, d> b;
        d dVar = new d("Current production", false);
        d = dVar;
        c2 = dqE.c(dpD.a(1, new d("Category row pinned at the top region with categories specifically curated for new members but generating all category landing pages with ARO (no curation): ARO-generated for all categories", true)), dpD.a(2, new d("Category row pinned at the top region with categories specifically curated for new members: ARO-generated for all categories but Enjoyed in Country (this landing page is curated)", true)), dpD.a(3, dVar));
        b = dqC.b(c2, (drM) new drM<Integer, d>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab51615_NewMemberCategoriesRowHoldbackTest$Companion$features$1
            public final aQP.d a(int i) {
                return aQP.e.e();
            }

            @Override // o.drM
            public /* synthetic */ aQP.d invoke(Integer num) {
                return a(num.intValue());
            }
        });
        c = b;
    }
}
