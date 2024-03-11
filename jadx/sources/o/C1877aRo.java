package o;

import android.content.Context;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;

/* renamed from: o.aRo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1877aRo extends aRM {
    public static final a b = new a(null);
    private static final Map<Integer, c> e;
    private final String d = "58589";
    private final int a = 3;
    private final String c = "Jetpack Compose Next Episodic Post Play (Take 2)";

    public static final boolean h() {
        return b.b();
    }

    public static final boolean j() {
        return b.e();
    }

    @Override // o.aRM
    public String d() {
        return this.d;
    }

    @Override // o.aRM
    /* renamed from: k */
    public String a() {
        return this.c;
    }

    /* renamed from: o.aRo$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final boolean c;
        private final boolean d;

        public final boolean d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && this.c == cVar.c && this.d == cVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (((this.b.hashCode() * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d);
        }

        public String toString() {
            String str = this.b;
            boolean z = this.c;
            boolean z2 = this.d;
            return "Features(friendlyNameForCell=" + str + ", composeUI=" + z + ", useLegacyIgnoreTapContainer=" + z2 + ")";
        }

        public c(String str, boolean z, boolean z2) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = z;
            this.d = z2;
        }
    }

    /* renamed from: o.aRo$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("ComposeNextEpisodicPostPlay");
        }

        public final boolean b() {
            return a() != ABTestConfig.Cell.CELL_1;
        }

        public final c d() {
            Object e;
            e = dqE.e(C1877aRo.e, Integer.valueOf(a().getCellId()));
            return (c) e;
        }

        public final boolean e() {
            C1332Xp c1332Xp = C1332Xp.b;
            ABTestConfig.Cell a = a();
            C8632dsu.a(a, "");
            return ((C1877aRo) C1818aPj.a(C1877aRo.class)).d((Context) C1332Xp.b(Context.class), a);
        }

        private final ABTestConfig.Cell a() {
            return C1818aPj.e(C1877aRo.class);
        }
    }

    static {
        Map<Integer, c> c2;
        c2 = dqE.c(dpD.a(1, new c("Control", false, false)), dpD.a(2, new c("Updated Compose UI", true, false)), dpD.a(3, new c("Cell 2 + legacy ignore tap container", true, true)));
        e = c2;
    }
}
