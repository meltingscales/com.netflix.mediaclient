package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.LinkedHashMap;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;

/* renamed from: o.aGb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1567aGb {
    public static final e a = new e(null);
    private static final C1567aGb b = new C1567aGb("invalid_profile_guid");
    private final String e;

    public final String a() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1567aGb) && C8632dsu.c((Object) this.e, (Object) ((C1567aGb) obj).e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        String str = this.e;
        return "ProfileGuid(profileGuid=" + str + ")";
    }

    public C1567aGb(String str) {
        Throwable th;
        C8632dsu.c((Object) str, "");
        this.e = str;
        if (C8684dus.a((CharSequence) str)) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            C1596aHd c1596aHd = new C1596aHd("SPY-35060 - ProfileGuid, value is blank", null, null, true, dqF.d(new LinkedHashMap()), false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c2 = dVar2.c();
            if (c2 != null) {
                c2.d(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
        }
    }

    /* renamed from: o.aGb$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final C1567aGb d() {
            return C1567aGb.b;
        }

        public final C1567aGb e(InterfaceC5283bvo interfaceC5283bvo) {
            C8632dsu.c((Object) interfaceC5283bvo, "");
            String profileGuid = interfaceC5283bvo.getProfileGuid();
            C8632dsu.a(profileGuid, "");
            return new C1567aGb(profileGuid);
        }
    }
}
