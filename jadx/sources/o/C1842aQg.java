package o;

import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.configuration.crypto.WidevineSupport$init$2;
import com.netflix.mediaclient.service.configuration.crypto.WidevineSupport$init$6;
import o.C1837aQb;
import o.C1842aQg;
import o.dpR;
import o.drO;

/* renamed from: o.aQg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1842aQg extends C1045Mp {
    public static final C1842aQg a;
    private static byte[] b;
    private static Throwable c;
    private static boolean d;
    private static String e;
    private static boolean f;
    private static boolean g;
    private static String h;
    private static boolean i;
    private static int j;
    private static String k;
    private static String l;
    private static String m;

    public final Throwable a() {
        return c;
    }

    public final byte[] b() {
        return b;
    }

    public final String d() {
        return e;
    }

    public final int e() {
        return j;
    }

    public final boolean f() {
        return d;
    }

    public final String g() {
        return k;
    }

    public final String h() {
        return m;
    }

    public final String i() {
        return l;
    }

    public final String j() {
        return h;
    }

    public final boolean k() {
        return f;
    }

    public final boolean l() {
        return g;
    }

    private C1842aQg() {
        super("nf_widevine_WidevineSupport");
    }

    public final void e(NetflixMediaDrm netflixMediaDrm) {
        synchronized (this) {
            C8632dsu.c((Object) netflixMediaDrm, "");
            boolean z = i;
            d = false;
            i = true;
            netflixMediaDrm.setPropertyString(NetflixMediaDrm.PROPERTY_SECURITY_LEVEL, "L3");
            if (z && !C1840aQe.d.d()) {
                getLogTag();
            }
            String propertyString = netflixMediaDrm.getPropertyString(NetflixMediaDrm.PROPERTY_SYSTEM_ID);
            getLogTag();
            C8632dsu.d((Object) propertyString);
            m = propertyString;
            k = C1840aQe.d.c(netflixMediaDrm);
        }
    }

    private final boolean n() {
        final C1837aQb c1837aQb = new C1837aQb();
        c1837aQb.c();
        String f2 = c1837aQb.f();
        if (f2 != null) {
            m = f2;
            e = f2;
        } else {
            WidevineSupport$init$2 widevineSupport$init$2 = new drO<dpR>() { // from class: com.netflix.mediaclient.service.configuration.crypto.WidevineSupport$init$2
                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    a();
                    return dpR.c;
                }

                public final void a() {
                    C1842aQg c1842aQg = C1842aQg.a;
                    C1842aQg.m = "SECURITY_LEVEL_GET_FAILURE";
                }
            };
        }
        String e2 = c1837aQb.e();
        if (e2 != null) {
            h = e2;
            l = e2;
            dpR dpr = dpR.c;
        } else {
            new drO<Object>() { // from class: com.netflix.mediaclient.service.configuration.crypto.WidevineSupport$init$4
                {
                    super(0);
                }

                @Override // o.drO
                public final Object invoke() {
                    C1842aQg c1842aQg = C1842aQg.a;
                    C1842aQg.h = "SECURITY_LEVEL_GET_FAILURE";
                    Throwable d2 = C1837aQb.this.d();
                    if (d2 != null) {
                        C1842aQg.l = CLv2Utils.e(d2);
                        return dpR.c;
                    }
                    return new drO<dpR>() { // from class: com.netflix.mediaclient.service.configuration.crypto.WidevineSupport$init$4.2
                        @Override // o.drO
                        public /* synthetic */ dpR invoke() {
                            c();
                            return dpR.c;
                        }

                        public final void c() {
                            C1842aQg c1842aQg2 = C1842aQg.a;
                            C1842aQg.l = "Unknown cause";
                        }
                    };
                }
            };
        }
        b = c1837aQb.b();
        String h2 = c1837aQb.h();
        if (h2 != null) {
            k = h2;
        } else {
            WidevineSupport$init$6 widevineSupport$init$6 = new drO<dpR>() { // from class: com.netflix.mediaclient.service.configuration.crypto.WidevineSupport$init$6
                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    c();
                    return dpR.c;
                }

                public final void c() {
                    C1842aQg c1842aQg = C1842aQg.a;
                    C1842aQg.k = NetflixMediaDrm.WIDEVINE_VERSION_FAILURE_TO_RETRIEVE;
                }
            };
        }
        c = c1837aQb.d();
        boolean e3 = C1840aQe.d.e(h);
        d = e3;
        g = e3;
        i = !e3;
        return c1837aQb.a();
    }

    public String toString() {
        boolean z = f;
        boolean z2 = d;
        boolean z3 = i;
        String str = h;
        int i2 = j;
        String str2 = m;
        String str3 = e;
        return "WidevineSupport{, supported=" + z + ", isL1=" + z2 + ", isL3=" + z3 + ", securityLevel='" + str + "', maxSecurityLevel='" + i2 + "', systemId='" + str2 + "', initialSystemId='" + str3 + "'}";
    }

    public final void c() {
        getLogTag();
        f = n();
        getLogTag();
    }

    static {
        C1842aQg c1842aQg = new C1842aQg();
        a = c1842aQg;
        e = "";
        m = "";
        j = -1;
        k = "";
        c1842aQg.getLogTag();
        c1842aQg.c();
    }
}
