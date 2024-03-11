package o;

import android.content.Intent;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import com.netflix.mediaclient.service.user.UserAgent;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.aIs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1638aIs {
    private final boolean b;
    private final C1567aGb e;
    public static final a d = new a(null);
    private static final C1638aIs c = new C1638aIs(C1567aGb.a.d(), false);

    public final C1567aGb d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1638aIs) {
            C1638aIs c1638aIs = (C1638aIs) obj;
            return C8632dsu.c(this.e, c1638aIs.e) && this.b == c1638aIs.b;
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        C1567aGb c1567aGb = this.e;
        boolean z = this.b;
        return "ProfileActivityScopePropagator(profileGuid=" + c1567aGb + ", isKidsProfile=" + z + ")";
    }

    public C1638aIs(C1567aGb c1567aGb, boolean z) {
        C8632dsu.c((Object) c1567aGb, "");
        this.e = c1567aGb;
        this.b = z;
    }

    /* renamed from: o.aIs$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final void d(NetflixActivityBase netflixActivityBase, Intent intent) {
            C8632dsu.c((Object) netflixActivityBase, "");
            C8632dsu.c((Object) intent, "");
            c(netflixActivityBase).a(intent);
        }

        public final void a(NetflixActivityBase netflixActivityBase, Intent intent) {
            C8632dsu.c((Object) netflixActivityBase, "");
            C8632dsu.c((Object) intent, "");
            d(netflixActivityBase).a(intent);
        }

        public final void b(InterfaceC5283bvo interfaceC5283bvo, Intent intent) {
            C8632dsu.c((Object) interfaceC5283bvo, "");
            C8632dsu.c((Object) intent, "");
            d(interfaceC5283bvo).a(intent);
        }

        public final void d(Intent intent, Intent intent2) {
            C8632dsu.c((Object) intent, "");
            C8632dsu.c((Object) intent2, "");
            intent2.putExtra("account_profile_state_profile_guid", intent.getStringExtra("account_profile_state_profile_guid"));
            intent2.putExtra("account_profile_state_is_kids_profile", intent.getBooleanExtra("account_profile_state_is_kids_profile", false));
        }

        public final C1638aIs c(NetflixActivityBase netflixActivityBase) {
            Map k;
            Throwable th;
            Map k2;
            Throwable th2;
            C8632dsu.c((Object) netflixActivityBase, "");
            String stringExtra = netflixActivityBase.getIntent().getStringExtra("account_profile_state_profile_guid");
            if (stringExtra == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                k2 = dqE.k(b(netflixActivityBase));
                C1596aHd c1596aHd = new C1596aHd("SPY-35026 - ProfileActivityState error, profile activity is missing profile guid", null, null, true, k2, false, false, 96, null);
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
                return C1638aIs.c;
            } else if (!netflixActivityBase.getIntent().hasExtra("account_profile_state_is_kids_profile")) {
                InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                k = dqE.k(b(netflixActivityBase));
                C1596aHd c1596aHd2 = new C1596aHd("SPY-35026 - ProfileActivityState error, profile activity is missing is kids flag", null, null, true, k, false, false, 96, null);
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
                    th = c1596aHd2.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar2.a();
                if (a2 != null) {
                    a2.e(c1596aHd2, th);
                } else {
                    dVar2.e().b(c1596aHd2, th);
                }
                return C1638aIs.c;
            } else {
                return new C1638aIs(new C1567aGb(stringExtra), netflixActivityBase.getIntent().getBooleanExtra("account_profile_state_is_kids_profile", false));
            }
        }

        private final C1638aIs d(NetflixActivityBase netflixActivityBase) {
            Map k;
            Throwable th;
            Map k2;
            Throwable th2;
            UserAgent userAgent = netflixActivityBase.getUserAgent();
            if (userAgent == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                k2 = dqE.k(b(netflixActivityBase));
                C1596aHd c1596aHd = new C1596aHd("SPY-35026 - ProfileActivityState error, user agent is null", null, null, true, k2, false, false, 96, null);
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
                return C1638aIs.c;
            }
            InterfaceC5283bvo j = userAgent.j();
            if (j == null) {
                InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                k = dqE.k(b(netflixActivityBase));
                C1596aHd c1596aHd2 = new C1596aHd("SPY-35026 - ProfileActivityState error, current profile is null", null, null, true, k, false, false, 96, null);
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
                return C1638aIs.c;
            }
            return d(j);
        }

        public final C1638aIs d(InterfaceC5283bvo interfaceC5283bvo) {
            C8632dsu.c((Object) interfaceC5283bvo, "");
            return new C1638aIs(C1567aGb.a.e(interfaceC5283bvo), interfaceC5283bvo.isKidsProfile());
        }

        private final Map<String, String> b(NetflixActivityBase netflixActivityBase) {
            Map<String, String> b;
            b = dqD.b(dpD.a("sourceActivity", netflixActivityBase.toString()));
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Intent intent) {
        intent.putExtra("account_profile_state_profile_guid", this.e.a());
        intent.putExtra("account_profile_state_is_kids_profile", this.b);
    }
}
