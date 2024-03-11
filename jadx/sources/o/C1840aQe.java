package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.configuration.crypto.DrmMetricsCollector;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.aQe */
/* loaded from: classes3.dex */
public final class C1840aQe extends C1045Mp {
    public static final C1840aQe d = new C1840aQe();

    public final boolean d() {
        return false;
    }

    private C1840aQe() {
        super("nf_widevine_mediadrm_utils");
    }

    public final void b(NetflixMediaDrm netflixMediaDrm) {
        Throwable th;
        if (netflixMediaDrm != null) {
            try {
                netflixMediaDrm.close();
            } catch (Throwable th2) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                C1596aHd b = new C1596aHd(null, null, null, false, null, false, false, 127, null).b(ErrorType.w).d(th2).b(false);
                ErrorType errorType = b.a;
                if (errorType != null) {
                    b.e.put("errorType", errorType.c());
                    String b2 = b.b();
                    if (b2 != null) {
                        String c = errorType.c();
                        b.a(c + " " + b2);
                    }
                }
                if (b.b() != null && b.i != null) {
                    th = new Throwable(b.b(), b.i);
                } else if (b.b() != null) {
                    th = new Throwable(b.b());
                } else {
                    th = b.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(b, th);
                } else {
                    dVar.e().b(b, th);
                }
            }
        }
    }

    public final String c(NetflixMediaDrm netflixMediaDrm) {
        String oemCryptoApiVersion;
        boolean g;
        C8632dsu.c((Object) netflixMediaDrm, "");
        String propertyString = netflixMediaDrm.getPropertyString("version");
        String str = propertyString != null ? propertyString : "";
        if (!C8632dsu.c((Object) str, (Object) "1.0") || (oemCryptoApiVersion = netflixMediaDrm.getOemCryptoApiVersion()) == null) {
            return str;
        }
        g = C8691duz.g(oemCryptoApiVersion);
        if (g) {
            return str;
        }
        C8632dsu.d((Object) oemCryptoApiVersion);
        return oemCryptoApiVersion;
    }

    public final boolean e(String str) {
        boolean a;
        a = C8691duz.a("L1", str, true);
        return a;
    }

    public static /* synthetic */ void d(C1840aQe c1840aQe, String str, Throwable th, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        c1840aQe.e(str, th, num);
    }

    public final void c(NetflixMediaDrm netflixMediaDrm, Throwable th, DrmMetricsCollector.WvApi wvApi) {
        C8632dsu.c((Object) th, "");
        C8632dsu.c((Object) wvApi, "");
        DrmMetricsCollector.d.d(new aPH(netflixMediaDrm, DrmMetricsCollector.NfAppStage.d).b(th).b(wvApi).c("WidevineSupport"));
    }

    public final void e(String str, Throwable th, Integer num) {
        Throwable th2;
        C8632dsu.c((Object) str, "");
        if (th == null) {
            getLogTag();
        }
        C1596aHd b = new C1596aHd(str, null, null, false, null, false, false, 126, null).b(ErrorType.w).d(th).b(false);
        if (num != null) {
            b.e("retries", num.toString());
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        ErrorType errorType = b.a;
        if (errorType != null) {
            b.e.put("errorType", errorType.c());
            String b2 = b.b();
            if (b2 != null) {
                String c = errorType.c();
                b.a(c + " " + b2);
            }
        }
        if (b.b() != null && b.i != null) {
            th2 = new Throwable(b.b(), b.i);
        } else if (b.b() != null) {
            th2 = new Throwable(b.b());
        } else {
            th2 = b.i;
            if (th2 == null) {
                th2 = new Throwable("Handled exception with no message");
            } else if (th2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(b, th2);
        } else {
            dVar.e().b(b, th2);
        }
    }
}
