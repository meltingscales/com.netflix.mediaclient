package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import java.util.Map;

/* loaded from: classes.dex */
public final class aRD extends aRM {
    private static final Map<Integer, c> d;
    public static final e e = new e(null);
    private final String b = "57679";
    private final int a = 3;
    private final String c = "Verification of New Per-Profile Configuration Fetched on Profile Switch";

    @EntryPoint
    @InstallIn({aFU.class})
    /* loaded from: classes3.dex */
    public interface d {
        InterfaceC1551aFm<Boolean> P();

        InterfaceC1551aFm<Boolean> S();
    }

    public static final boolean h() {
        return e.e();
    }

    public static final boolean j() {
        return e.b();
    }

    @Override // o.aRM
    public boolean O_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.b;
    }

    @Override // o.aRM
    /* renamed from: n */
    public String a() {
        return this.c;
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final boolean a;
        private final String c;
        private final boolean d;

        public final boolean a() {
            return this.a;
        }

        public final boolean d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && this.a == cVar.a && this.d == cVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (((this.c.hashCode() * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.d);
        }

        public String toString() {
            String str = this.c;
            boolean z = this.a;
            boolean z2 = this.d;
            return "Features(friendlyName=" + str + ", bindViaConfig=" + z + ", requireProfileScopedConfig=" + z2 + ")";
        }

        public c(String str, boolean z, boolean z2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = z;
            this.d = z2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
            if (r4 != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0109, code lost:
            if (r11 != false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b() {
            /*
                Method dump skipped, instructions count: 457
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aRD.e.b():boolean");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
            if (r4 != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0109, code lost:
            if (r11 != false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean e() {
            /*
                Method dump skipped, instructions count: 457
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aRD.e.e():boolean");
        }

        public final boolean c() {
            Object e;
            e = dqE.e(aRD.d, Integer.valueOf(a().getCellId()));
            return ((c) e).d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ABTestConfig.Cell a() {
            return C1818aPj.e(aRD.class);
        }
    }

    static {
        Map<Integer, c> c2;
        c2 = dqE.c(dpD.a(1, new c("Default Experience", false, false)), dpD.a(2, new c("Bind via config endpoint", true, false)), dpD.a(3, new c("Bind via config endpoint & refresh config", true, true)));
        d = c2;
    }
}
