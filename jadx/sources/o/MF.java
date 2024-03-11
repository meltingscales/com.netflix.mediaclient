package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.LinkedHashMap;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes.dex */
public final class MF {
    public static final d c = new d(null);
    private static final MF e = new MF("invalid_account_guid");
    private final String b;

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MF) && C8632dsu.c((Object) this.b, (Object) ((MF) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        String str = this.b;
        return "AccountGuid(accountGuid=" + str + ")";
    }

    public MF(String str) {
        Throwable th;
        C8632dsu.c((Object) str, "");
        this.b = str;
        if (C8684dus.a((CharSequence) str)) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            C1596aHd c1596aHd = new C1596aHd("SPY-35060 - AccountGuid, value is blank", null, null, true, dqF.d(new LinkedHashMap()), false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
            InterfaceC1597aHe c3 = dVar2.c();
            if (c3 != null) {
                c3.d(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final MF e() {
            return MF.e;
        }

        public final MF c(InterfaceC5282bvn interfaceC5282bvn) {
            Throwable th;
            C8632dsu.c((Object) interfaceC5282bvn, "");
            String userGuid = interfaceC5282bvn.getUserGuid();
            if (userGuid == null || C8684dus.a((CharSequence) userGuid)) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                C1596aHd c1596aHd = new C1596aHd("SPY-35060 - AccountGuid, user.userGuid is null or blank", null, null, true, dqF.d(dqF.c()), false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
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
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
                return e();
            }
            return new MF(userGuid);
        }
    }
}
