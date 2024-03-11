package o;

import android.content.Intent;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import com.netflix.mediaclient.service.user.UserAgent;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.aIm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1632aIm {
    private final MF a;
    public static final d c = new d(null);
    private static final C1632aIm b = new C1632aIm(MF.c.e());

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1632aIm) && C8632dsu.c(this.a, ((C1632aIm) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        MF mf = this.a;
        return "AccountActivityScopePropagator(accountGuid=" + mf + ")";
    }

    public C1632aIm(MF mf) {
        C8632dsu.c((Object) mf, "");
        this.a = mf;
    }

    /* renamed from: o.aIm$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final void d(NetflixActivityBase netflixActivityBase, Intent intent) {
            C8632dsu.c((Object) netflixActivityBase, "");
            C8632dsu.c((Object) intent, "");
            a(netflixActivityBase).e(intent);
        }

        public final void a(NetflixActivityBase netflixActivityBase, Intent intent) {
            C8632dsu.c((Object) netflixActivityBase, "");
            C8632dsu.c((Object) intent, "");
            c(netflixActivityBase).e(intent);
        }

        public final void a(InterfaceC5282bvn interfaceC5282bvn, Intent intent) {
            C8632dsu.c((Object) interfaceC5282bvn, "");
            C8632dsu.c((Object) intent, "");
            b(interfaceC5282bvn).e(intent);
        }

        public final void e(Intent intent, Intent intent2) {
            C8632dsu.c((Object) intent, "");
            C8632dsu.c((Object) intent2, "");
            intent2.putExtra("account_activity_state_account_guid", intent.getStringExtra("account_activity_state_account_guid"));
        }

        public final C1632aIm a(NetflixActivityBase netflixActivityBase) {
            Map k;
            Throwable th;
            C8632dsu.c((Object) netflixActivityBase, "");
            String stringExtra = netflixActivityBase.getIntent().getStringExtra("account_activity_state_account_guid");
            if (stringExtra == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                k = dqE.k(d(netflixActivityBase));
                C1596aHd c1596aHd = new C1596aHd("SPY-35026 - AccountActivityState error, account activity is missing account guid", null, null, true, k, false, false, 96, null);
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
                return C1632aIm.b;
            }
            return new C1632aIm(new MF(stringExtra));
        }

        private final C1632aIm c(NetflixActivityBase netflixActivityBase) {
            Map k;
            Throwable th;
            String userGuid;
            boolean g;
            Map k2;
            Throwable th2;
            UserAgent userAgent = netflixActivityBase.getUserAgent();
            if (userAgent == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                k2 = dqE.k(d(netflixActivityBase));
                C1596aHd c1596aHd = new C1596aHd("SPY-35026 - AccountActivityState error, user agent is null", null, null, true, k2, false, false, 96, null);
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
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    Throwable th3 = c1596aHd.i;
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
                    a.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
                return C1632aIm.b;
            }
            InterfaceC5282bvn i = userAgent.i();
            if (i != null && (userGuid = i.getUserGuid()) != null) {
                g = C8691duz.g(userGuid);
                if (!g) {
                    return b(i);
                }
            }
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            k = dqE.k(d(netflixActivityBase));
            C1596aHd c1596aHd2 = new C1596aHd("SPY-35026 - AccountActivityState error, current user is null", null, null, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd2.a;
            if (errorType2 != null) {
                c1596aHd2.e.put("errorType", errorType2.c());
                String b2 = c1596aHd2.b();
                if (b2 != null) {
                    String c2 = errorType2.c();
                    c1596aHd2.a(c2 + " " + b2);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th = new Throwable(c1596aHd2.b());
            } else {
                Throwable th4 = c1596aHd2.i;
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
                a2.e(c1596aHd2, th);
            } else {
                dVar2.e().b(c1596aHd2, th);
            }
            return C1632aIm.b;
        }

        private final C1632aIm b(InterfaceC5282bvn interfaceC5282bvn) {
            return new C1632aIm(MF.c.c(interfaceC5282bvn));
        }

        private final Map<String, String> d(NetflixActivityBase netflixActivityBase) {
            Map<String, String> b;
            b = dqD.b(dpD.a("sourceActivity", netflixActivityBase.toString()));
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Intent intent) {
        intent.putExtra("account_activity_state_account_guid", this.a.d());
    }
}
