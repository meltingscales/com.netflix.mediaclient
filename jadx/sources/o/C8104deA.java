package o;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.EsnMigrationState;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.deA  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8104deA extends C1045Mp {
    public static final C8104deA b = new C8104deA();

    private C8104deA() {
        super("EsnMigrationUtils");
    }

    public static final EsnMigrationState c(Context context, InterfaceC1843aQh interfaceC1843aQh) {
        EsnMigrationState e;
        synchronized (C8104deA.class) {
            C8632dsu.c((Object) context, "");
            C8104deA c8104deA = b;
            e = c8104deA.e(interfaceC1843aQh);
            c8104deA.d(context);
        }
        return e;
    }

    private final EsnMigrationState e(InterfaceC1843aQh interfaceC1843aQh) {
        if (interfaceC1843aQh == null) {
            CryptoProvider a = C1834aPz.a.a();
            return EsnMigrationState.a(a, a, false);
        } else if (interfaceC1843aQh.q() != null) {
            getLogTag();
            return a(interfaceC1843aQh);
        } else {
            getLogTag();
            return c(interfaceC1843aQh);
        }
    }

    private final void d(Context context) {
        C8157dfA.a(context, "nf_drm_system_id", C1842aQg.a.h());
        CryptoProvider a = C1834aPz.a.a();
        if (a != null) {
            C8157dfA.a(context, "nf_drm_crypto_provider", a.name());
        }
    }

    private final EsnMigrationState c(InterfaceC1843aQh interfaceC1843aQh) {
        CryptoProvider J_ = interfaceC1843aQh.J_();
        C8632dsu.a(J_, "");
        C1834aPz c1834aPz = C1834aPz.a;
        CryptoProvider b2 = c1834aPz.b();
        String c = c1834aPz.c();
        if (b2 != null) {
            if (!a(c)) {
                if (!C8632dsu.c((Object) C1842aQg.a.h(), (Object) c)) {
                    getLogTag();
                    return EsnMigrationState.a(b2, J_, true);
                }
                getLogTag();
                if (J_ == b2) {
                    getLogTag();
                    return EsnMigrationState.a(b2, J_, false);
                }
                getLogTag();
                return EsnMigrationState.a(b2, J_, true);
            }
            getLogTag();
            return EsnMigrationState.a(b2, J_, true);
        }
        getLogTag();
        return EsnMigrationState.a(J_, J_, false);
    }

    public static final boolean b(InterfaceC1843aQh interfaceC1843aQh) {
        C8632dsu.c((Object) interfaceC1843aQh, "");
        String s = interfaceC1843aQh.s();
        String o2 = interfaceC1843aQh.o();
        boolean z = true;
        boolean z2 = s == null && interfaceC1843aQh.q() != null;
        boolean z3 = (s == null || C8632dsu.c((Object) s, (Object) o2)) ? false : true;
        if (!z2 && !z3) {
            z = false;
        }
        b.a(z2, z3, s, o2);
        return z;
    }

    private final boolean a(String str) {
        int hashCode;
        return str == null || ((hashCode = str.hashCode()) == -2053249079 ? str.equals("LEGACY") : hashCode == 1073592702 ? str.equals("M_PLUS_MGK") : hashCode == 1096067005 && str.equals("FORCE_LEGACY"));
    }

    private final EsnMigrationState a(InterfaceC1843aQh interfaceC1843aQh) {
        getLogTag();
        boolean b2 = b(interfaceC1843aQh);
        CryptoProvider J_ = interfaceC1843aQh.J_();
        C8632dsu.a(J_, "");
        CryptoProvider b3 = C1834aPz.a.b();
        return EsnMigrationState.a(b3, J_, J_ != b3 || b2);
    }

    private final void a(boolean z, boolean z2, String str, String str2) {
        Throwable th;
        Throwable th2;
        getLogTag();
        if (z) {
            C1596aHd b2 = new C1596aHd("WEA: App upgrade to WVEA identity detected", null, null, false, null, false, false, 126, null).b(false).b(ErrorType.p);
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ErrorType errorType = b2.a;
            if (errorType != null) {
                b2.e.put("errorType", errorType.c());
                String b3 = b2.b();
                if (b3 != null) {
                    String c = errorType.c();
                    b2.a(c + " " + b3);
                }
            }
            if (b2.b() != null && b2.i != null) {
                th2 = new Throwable(b2.b(), b2.i);
            } else if (b2.b() != null) {
                th2 = new Throwable(b2.b());
            } else {
                Throwable th3 = b2.i;
                if (th3 == null) {
                    th2 = new Throwable("Handled exception with no message");
                } else if (th3 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    th2 = th3;
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(b2, th2);
            } else {
                dVar.e().b(b2, th2);
            }
        } else if (z2) {
            C1596aHd b4 = new C1596aHd("WEA: Cached migration identity is NOT the same as existing identity", null, null, false, null, false, false, 126, null).b(false).b(ErrorType.p);
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            ErrorType errorType2 = b4.a;
            if (errorType2 != null) {
                b4.e.put("errorType", errorType2.c());
                String b5 = b4.b();
                if (b5 != null) {
                    String c2 = errorType2.c();
                    b4.a(c2 + " " + b5);
                }
            }
            if (b4.b() != null && b4.i != null) {
                th = new Throwable(b4.b(), b4.i);
            } else if (b4.b() != null) {
                th = new Throwable(b4.b());
            } else {
                Throwable th4 = b4.i;
                if (th4 == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th4 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    th = th4;
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar2.a();
            if (a2 != null) {
                a2.e(b4, th);
            } else {
                dVar2.e().b(b4, th);
            }
        } else {
            getLogTag();
        }
    }
}
