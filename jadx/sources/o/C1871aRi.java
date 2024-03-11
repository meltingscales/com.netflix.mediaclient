package o;

import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_EnableCTAsForGamesBillboardOnTablet;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.C1871aRi;

/* renamed from: o.aRi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1871aRi extends aRM {
    private static final d b;
    private static final Map<Integer, d> d;
    public static final c e = new c(null);
    private final String c = "CTAs for games billboard on tablets holdback test";
    private final String f = "55677";
    private final int a = d.size();

    @Override // o.aRM
    public boolean M_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.f;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.c;
    }

    /* renamed from: o.aRi$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String b;
        private final boolean e;

        public final boolean d() {
            return this.e;
        }

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
            return "Features(friendlyName=" + str + ", showCTAs=" + z + ")";
        }

        public d(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = z;
        }
    }

    /* renamed from: o.aRi$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final d c() {
            return C1871aRi.b;
        }

        public final d e() {
            Object e;
            e = dqE.e(C1871aRi.d, Integer.valueOf(b().getCellId()));
            return (d) e;
        }

        public final ABTestConfig.Cell b() {
            return C1818aPj.e(C1871aRi.class);
        }
    }

    static {
        Map c2;
        Map<Integer, d> b2;
        d dVar = new d("Default", Config_FastProperty_EnableCTAsForGamesBillboardOnTablet.Companion.b());
        b = dVar;
        c2 = dqE.c(dpD.a(1, dVar), dpD.a(2, new d("Holdback -- no CTAs", false)), dpD.a(3, new d("has CTAs", true)));
        b2 = dqC.b(c2, (drM) new drM<Integer, d>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55677_CTAsForGamesBillboardOnTabletHoldback$Companion$features$1
            public final C1871aRi.d e(int i) {
                return C1871aRi.e.c();
            }

            @Override // o.drM
            public /* synthetic */ C1871aRi.d invoke(Integer num) {
                return e(num.intValue());
            }
        });
        d = b2;
    }
}
