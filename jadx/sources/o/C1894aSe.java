package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.ConfigData;
import com.netflix.mediaclient.util.net.AuthCookieHolder;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.aSe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1894aSe extends C1893aSd {
    public static final e d = new e(null);
    private final aOV a;
    private ConfigData e;

    @Override // o.C1893aSd, o.aRX
    protected String S() {
        return "FetchCookiesConfigMSLRequest_Ab57679_RefreshConfig";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1894aSe(String str, InterfaceC4986bqI interfaceC4986bqI, aOV aov) {
        super(str, interfaceC4986bqI);
        C8632dsu.c((Object) aov, "");
        this.a = aov;
    }

    @Override // o.C1893aSd, o.aRX, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> j = super.j();
        C8632dsu.d(j);
        j.put("x-netflix.request.refreshconfig", "true");
        C8632dsu.a(j, "");
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C1893aSd, o.AbstractC2100aZw
    /* renamed from: c */
    public AuthCookieHolder d(C8380djl c8380djl) {
        Map d2;
        Map k;
        Throwable th;
        Map d3;
        Map k2;
        Throwable th2;
        C8632dsu.c((Object) c8380djl, "");
        AuthCookieHolder d4 = super.d(c8380djl);
        try {
            ConfigData e2 = aRZ.e(null, c8380djl.c());
            if (C8168dfL.g(e2.hendrixConfigJson)) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                ErrorType errorType = ErrorType.g;
                d3 = dqE.d();
                k2 = dqE.k(d3);
                C1596aHd c1596aHd = new C1596aHd("hendrixConfig missing in bind call", null, errorType, true, k2, false, false, 96, null);
                ErrorType errorType2 = c1596aHd.a;
                if (errorType2 != null) {
                    c1596aHd.e.put("errorType", errorType2.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType2.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            } else {
                d.getLogTag();
                try {
                    this.e = e2;
                } catch (Exception e3) {
                    e = e3;
                    Exception exc = e;
                    InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                    ErrorType errorType3 = ErrorType.g;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd2 = new C1596aHd("Unexpected error processing hendrixConfig in bind response", exc, errorType3, true, k, false, false, 96, null);
                    ErrorType errorType4 = c1596aHd2.a;
                    if (errorType4 != null) {
                        c1596aHd2.e.put("errorType", errorType4.c());
                        String b2 = c1596aHd2.b();
                        if (b2 != null) {
                            String c2 = errorType4.c();
                            c1596aHd2.a(c2 + " " + b2);
                        }
                    }
                    if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                        th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                    } else if (c1596aHd2.b() != null) {
                        th = new Throwable(c1596aHd2.b());
                    } else {
                        Throwable th3 = c1596aHd2.i;
                        if (th3 == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        } else {
                            th = th3;
                        }
                    }
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar2.a();
                    if (a2 != null) {
                        a2.e(c1596aHd2, th);
                    } else {
                        dVar2.e().b(c1596aHd2, th);
                    }
                    C8632dsu.d(d4);
                    return d4;
                }
            }
        } catch (Exception e4) {
            e = e4;
        }
        C8632dsu.d(d4);
        return d4;
    }

    @Override // o.C1893aSd, o.aZE
    public void a(AuthCookieHolder authCookieHolder) {
        ConfigData configData = this.e;
        if (configData != null) {
            this.a.b(configData);
        }
        super.a(authCookieHolder);
    }

    /* renamed from: o.aSe$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("FetchCookiesConfigMSLRequest_Ab57679_RefreshConfig");
        }
    }
}
