package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.aQZ;

/* loaded from: classes.dex */
public final class aQZ extends aRM {
    private static final Map<Integer, e> b;
    private static final e c;
    public static final a e = new a(null);
    private final String i = "53181";
    private final int d = 2;
    private final String a = "android playback session 2: main playback";

    public static final e h() {
        return e.b();
    }

    @Override // o.aRM
    public String d() {
        return this.i;
    }

    @Override // o.aRM
    /* renamed from: m */
    public String a() {
        return this.a;
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final boolean b;
        private final String e;

        public final boolean c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && this.b == eVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            String str = this.e;
            boolean z = this.b;
            return "Features(friendlyName=" + str + ", isPlaybackSession2Enabled=" + z + ")";
        }

        public e(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.e = str;
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

        public final e b() {
            Object e;
            e = dqE.e(aQZ.b, Integer.valueOf(a().getCellId()));
            return (e) e;
        }

        public final ABTestConfig.Cell a() {
            ABTestConfig.Cell e = C1818aPj.e(aQZ.class);
            C8632dsu.a(e, "");
            return e;
        }
    }

    static {
        Map c2;
        Map<Integer, e> b2;
        e eVar = new e("Default Experience", false);
        c = eVar;
        c2 = dqE.c(dpD.a(1, eVar), dpD.a(2, new e("playback session 2 enabled", true)));
        b2 = dqC.b(c2, (drM) new drM<Integer, e>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab53181_PlaybackSession2_MainPlayback$Companion$features$1
            public final aQZ.e b(int i) {
                aQZ.e eVar2;
                eVar2 = aQZ.c;
                return eVar2;
            }

            @Override // o.drM
            public /* synthetic */ aQZ.e invoke(Integer num) {
                return b(num.intValue());
            }
        });
        b = b2;
    }
}
