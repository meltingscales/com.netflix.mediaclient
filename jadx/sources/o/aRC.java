package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aRC;

/* loaded from: classes.dex */
public final class aRC extends aRM {
    private static final Map<Integer, c> a;
    public static final d d = new d(null);
    private static final c e;
    private final String i = "57575";
    private final int c = 4;
    private final String b = "VideoViewRefactor";

    @Override // o.aRM
    public String d() {
        return this.i;
    }

    @Override // o.aRM
    /* renamed from: j */
    public String a() {
        return this.b;
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final boolean a;
        private final String b;
        private final boolean e;

        public final boolean b() {
            return this.e;
        }

        public final boolean c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && this.a == cVar.a && this.e == cVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (((this.b.hashCode() * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            String str = this.b;
            boolean z = this.a;
            boolean z2 = this.e;
            return "Features(friendlyName=" + str + ", noSurfaceCallback=" + z + ", videoRenderReadyOnSurfaceAvailable=" + z2 + ")";
        }

        public c(String str, boolean z, boolean z2) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = z;
            this.e = z2;
        }

        public /* synthetic */ c(String str, boolean z, boolean z2, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final c b() {
            return aRC.e;
        }

        public final c e() {
            Object e;
            e = dqE.e(aRC.a, Integer.valueOf(d().getCellId()));
            return (c) e;
        }

        private final ABTestConfig.Cell d() {
            return C1818aPj.e(aRC.class);
        }
    }

    static {
        Map c2;
        Map<Integer, c> b;
        c cVar = new c("Control", false, false, 6, null);
        e = cVar;
        c2 = dqE.c(dpD.a(1, cVar), dpD.a(2, new c("No Surface Callback", true, false, 4, null)), dpD.a(3, new c("video renderer ready condition on surface available", false, true, 2, null)), dpD.a(4, new c("No Surface Callback, video renderer ready condition on surface available", true, true)));
        b = dqC.b(c2, (drM) new drM<Integer, c>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab57575_VideoViewRefactor$Companion$features$1
            public final aRC.c b(int i) {
                return aRC.d.b();
            }

            @Override // o.drM
            public /* synthetic */ aRC.c invoke(Integer num) {
                return b(num.intValue());
            }
        });
        a = b;
    }
}
