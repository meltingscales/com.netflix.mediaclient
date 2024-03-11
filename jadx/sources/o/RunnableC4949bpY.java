package o;

import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.user.UserAgentImpl;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.util.net.AuthCookieHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;

/* renamed from: o.bpY  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC4949bpY implements Runnable {
    public static final d d = new d(null);
    private final InterfaceC5129bst a;
    private final boolean b;
    private final ArrayList<String> c;
    private final UserAgent.c e;
    private final HashMap<String, Boolean> f;
    private Boolean h;
    private final C5065bri i;
    private final UserAgentImpl j;

    public RunnableC4949bpY(UserAgentImpl userAgentImpl, InterfaceC5129bst interfaceC5129bst, C5065bri c5065bri, boolean z, UserAgent.c cVar) {
        C8632dsu.c((Object) userAgentImpl, "");
        C8632dsu.c((Object) interfaceC5129bst, "");
        C8632dsu.c((Object) c5065bri, "");
        C8632dsu.c((Object) cVar, "");
        this.j = userAgentImpl;
        this.a = interfaceC5129bst;
        this.i = c5065bri;
        this.b = z;
        this.e = cVar;
        this.c = new ArrayList<>();
        this.f = new HashMap<>();
    }

    /* renamed from: o.bpY$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Status status) {
        synchronized (this) {
            if (this.h == null) {
                this.e.c(status);
            }
            this.h = Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        C1044Mm.a("nf_user_fetchAllUserProfiles", "Fetch profile %s auth data", str);
        dkV e2 = this.a.e(this.j.f().d(), str);
        if (e2 == null) {
            C1044Mm.d("nf_user_fetchAllUserProfiles", "fetchProfileAuthorizationCredentials failed, userId token was not found for current user id. It should not happen!");
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ay;
            C8632dsu.a(netflixImmutableStatus, "");
            b(netflixImmutableStatus);
            return;
        }
        c(str, e2);
    }

    /* renamed from: o.bpY$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC5011bqh {
        final /* synthetic */ String b;

        c(String str) {
            this.b = str;
        }

        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void b(AuthCookieHolder authCookieHolder, Status status) {
            String str;
            boolean g;
            C8632dsu.c((Object) status, "");
            InterfaceC5170bth mslAgentCookiesProvider = RunnableC4949bpY.this.j.getMslAgentCookiesProvider();
            if (status.j() && authCookieHolder != null && mslAgentCookiesProvider != null && (str = authCookieHolder.netflixId) != null) {
                g = C8691duz.g(str);
                if (!g) {
                    C1044Mm.e("nf_user_fetchAllUserProfiles", "MSL got userID token AND cookies");
                    mslAgentCookiesProvider.a(this.b, authCookieHolder);
                    RunnableC4949bpY.this.f.put(this.b, Boolean.TRUE);
                    RunnableC4949bpY.this.c();
                    return;
                }
            }
            C1044Mm.j("nf_user_fetchAllUserProfiles", "MSL got userID token but can't get cookies. call failed.");
            RunnableC4949bpY runnableC4949bpY = RunnableC4949bpY.this;
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aB;
            C8632dsu.a(netflixImmutableStatus, "");
            runnableC4949bpY.b(netflixImmutableStatus);
        }
    }

    private final void c(String str, AbstractC8424dlb abstractC8424dlb) {
        AbstractC2100aZw e2 = this.i.e(str, new c(str));
        e2.c(this.j.a(str, abstractC8424dlb));
        this.j.addDataRequest(e2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        synchronized (this) {
            Iterator<String> it = this.c.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Boolean bool = this.f.get(next);
                if (bool == null && bool == Boolean.FALSE) {
                    C1044Mm.a("nf_user_fetchAllUserProfiles", "Profile %s authorization data call did not reported back yet", next);
                    return;
                }
            }
            C1044Mm.e("nf_user_fetchAllUserProfiles", "Profile data retrieved for all profiles!");
            this.f.clear();
            this.c.clear();
            C1044Mm.e("nf_user_fetchAllUserProfiles", "Check if some profile is added in between...");
            b();
            if (this.c.size() < 1) {
                C1044Mm.e("nf_user_fetchAllUserProfiles", "All profiles authorization tokens retrieved...");
                this.e.c(InterfaceC1078Nw.aJ);
            } else {
                C1044Mm.j("nf_user_fetchAllUserProfiles", "Need to fetch newly added %d profile(s)", Integer.valueOf(this.c.size()));
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        b();
    }

    private final void b() {
        Map k;
        Throwable th;
        List<? extends InterfaceC5283bvo> b = this.j.b();
        if (b == null || b.isEmpty()) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            k = dqE.k(new LinkedHashMap());
            C1596aHd c1596aHd = new C1596aHd("No profiles found, it should NOT happen!", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b2);
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
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aF;
            C8632dsu.a(netflixImmutableStatus, "");
            b(netflixImmutableStatus);
            return;
        }
        this.j.b(new e());
    }

    /* renamed from: o.bpY$e */
    /* loaded from: classes4.dex */
    public static final class e extends C5015bql {
        e() {
        }

        @Override // o.C5015bql, o.InterfaceC5018bqo
        public void e(AccountData accountData, Status status) {
            C8632dsu.c((Object) status, "");
            List<InterfaceC5283bvo> userProfiles = accountData != null ? accountData.getUserProfiles() : null;
            if (userProfiles == null || userProfiles.isEmpty()) {
                RunnableC4949bpY runnableC4949bpY = RunnableC4949bpY.this;
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ay;
                C8632dsu.a(netflixImmutableStatus, "");
                runnableC4949bpY.b(netflixImmutableStatus);
                return;
            }
            RunnableC4949bpY runnableC4949bpY2 = RunnableC4949bpY.this;
            for (InterfaceC5283bvo interfaceC5283bvo : userProfiles) {
                if (runnableC4949bpY2.j.c(interfaceC5283bvo.getProfileGuid()) == null || runnableC4949bpY2.b) {
                    runnableC4949bpY2.c.add(interfaceC5283bvo.getProfileGuid());
                    String profileGuid = interfaceC5283bvo.getProfileGuid();
                    C8632dsu.a(profileGuid, "");
                    runnableC4949bpY2.a(profileGuid);
                }
            }
        }
    }
}
