package com.netflix.mediaclient.service.user;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.SignOutReason;
import com.netflix.cl.model.context.KidsMode;
import com.netflix.cl.model.event.session.NetflixId;
import com.netflix.cl.model.event.session.ProfileGuid;
import com.netflix.cl.model.event.session.UserInteraction;
import com.netflix.cl.model.event.session.VisitorDeviceId;
import com.netflix.cl.model.event.session.action.SelectProfile;
import com.netflix.cl.model.event.session.action.SignInWithAutoLoginToken;
import com.netflix.cl.model.event.session.action.SignOut;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter;
import com.netflix.mediaclient.ngpstore.api.NgpStoreApi;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_AutoLogin;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_NgpConfig;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.user.UserAgentImpl;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo;
import com.netflix.mediaclient.service.webclient.model.leafs.ConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipChoicesResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInData;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.UserCookies;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.log.RootCause;
import com.netflix.mediaclient.util.net.AuthCookieHolder;
import com.netflix.model.survey.Survey;
import com.netflix.msl.MslException;
import dagger.Lazy;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractApplicationC1040Mh;
import o.AbstractC2100aZw;
import o.AbstractC5011bqh;
import o.AbstractC8424dlb;
import o.C1044Mm;
import o.C1071Np;
import o.C1079Nx;
import o.C1569aGd;
import o.C1596aHd;
import o.C1815aPg;
import o.C1818aPj;
import o.C1826aPr;
import o.C1831aPw;
import o.C1868aRf;
import o.C4950bpZ;
import o.C4984bqG;
import o.C4985bqH;
import o.C4991bqN;
import o.C5003bqZ;
import o.C5004bqa;
import o.C5006bqc;
import o.C5007bqd;
import o.C5009bqf;
import o.C5010bqg;
import o.C5015bql;
import o.C5016bqm;
import o.C5020bqq;
import o.C5065bri;
import o.C8067ddQ;
import o.C8157dfA;
import o.C8168dfL;
import o.C8169dfM;
import o.C8170dfN;
import o.C8197dfo;
import o.C8284dhV;
import o.C8313dhy;
import o.C8378djj;
import o.InterfaceC1078Nw;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC4360bcz;
import o.InterfaceC4986bqI;
import o.InterfaceC5012bqi;
import o.InterfaceC5013bqj;
import o.InterfaceC5018bqo;
import o.InterfaceC5034brD;
import o.InterfaceC5093bsJ;
import o.InterfaceC5170bth;
import o.InterfaceC5282bvn;
import o.InterfaceC5283bvo;
import o.InterfaceC5284bvp;
import o.InterfaceC6636cgz;
import o.RunnableC4949bpY;
import o.aCI;
import o.aIR;
import o.aMF;
import o.aMH;
import o.aOV;
import o.aYD;
import o.bXD;
import o.cNT;
import o.dkV;
import o.dkX;
import o.dkY;
import o.dpR;
import o.drM;
import o.drO;
import o.dwQ;
import o.dwU;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UserAgentImpl extends aMF implements UserAgent, InterfaceC5013bqj {
    private C4950bpZ a;
    private final dwU c;
    public InterfaceC5012bqi d;
    private final aOV f;
    private final Lazy<aCI> h;
    private bXD i;
    private Context k;
    private boolean m;
    private InterfaceC5283bvo n;
    private C5009bqf p;
    private UmaAlert r;
    private C5065bri s;
    private InterfaceC5284bvp t;
    private final aYD v;
    private e w;
    private final dwQ y;
    private boolean u = false;
    private Long x = null;
    private UserAgentState q = UserAgentState.d;
    private boolean j = true;
    private final Runnable g = new Runnable() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.2
        @Override // java.lang.Runnable
        public void run() {
            C1044Mm.e("nf_service_useragent", "fetchAccountDataHandler");
            UserAgentImpl.this.Z();
        }
    };
    C1831aPw e = new C1831aPw() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.7
        @Override // o.C1831aPw, o.InterfaceC1813aPe
        public void d(ConfigData configData, Status status) {
            if (status.j()) {
                UserAgentImpl.this.q = UserAgentState.c;
                UserAgentImpl.this.initCompleted(InterfaceC1078Nw.aJ);
                return;
            }
            UserAgentImpl.this.q = UserAgentState.a;
            UserAgentImpl.this.initCompleted(status);
        }
    };
    private final InterfaceC4986bqI b = new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.19
        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void e(AccountData accountData, Status status) {
            if (status.j() && accountData != null) {
                List<InterfaceC5283bvo> userProfiles = accountData.getUserProfiles();
                C1044Mm.a("nf_service_useragent", "onUserProfilesUpdated got profiles: %d", Integer.valueOf(userProfiles.size()));
                UserAgentImpl.this.c(userProfiles);
                if (UserAgentImpl.this.n != null) {
                    for (InterfaceC5283bvo interfaceC5283bvo : userProfiles) {
                        if (C8168dfL.d(UserAgentImpl.this.n.getProfileGuid(), interfaceC5283bvo.getProfileGuid())) {
                            UserAgentImpl.this.e(interfaceC5283bvo);
                            UserAgentImpl.this.n = interfaceC5283bvo;
                        }
                    }
                }
                aMH.c().a(UserAgentImpl.this.n);
                C4985bqH.b.e(UserAgentImpl.this.k, UserAgentImpl.this.n, "onUserProfilesUpdated");
                C5020bqq.c();
                return;
            }
            C1044Mm.d("nf_service_useragent", "Updating user profiles failed with statusCode=" + status.c());
        }
    };
    private final AtomicBoolean l = new AtomicBoolean(false);

    /* renamed from: o  reason: collision with root package name */
    private final C5006bqc f13230o = new C5006bqc(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum ProfileActivatedSource {
        login,
        switchProfile,
        restoreProfile,
        currentProfileDeleted
    }

    public UmaAlert A() {
        return this.r;
    }

    public boolean D() {
        return this.m;
    }

    public boolean I() {
        return this.u;
    }

    @Override // o.InterfaceC5013bqj
    public void a(UmaAlert umaAlert) {
        this.r = umaAlert;
    }

    @Override // o.aMF
    public String agentName() {
        return "userAgent";
    }

    public void b(boolean z) {
        this.m = z;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public InterfaceC5093bsJ f() {
        return this.f13230o;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public InterfaceC5283bvo j() {
        return this.n;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public InterfaceC5034brD l() {
        return this.f13230o;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public InterfaceC5284bvp s() {
        return this.t;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public boolean v() {
        return this.n != null;
    }

    public UserAgentImpl(Context context, bXD bxd, aOV aov, aYD ayd, dwU dwu, dwQ dwq, Lazy<aCI> lazy) {
        this.k = context;
        this.i = bxd;
        this.f = aov;
        this.v = ayd;
        this.h = lazy;
        this.d = new C5016bqm(context, aov, new drO() { // from class: o.bqs
            @Override // o.drO
            public final Object invoke() {
                TQ netflixPlatform;
                netflixPlatform = UserAgentImpl.this.getNetflixPlatform();
                return netflixPlatform;
            }
        }, dwu, dwq, lazy);
        ad();
        this.a = new C4950bpZ(this.k);
        this.c = dwu;
        this.y = dwq;
    }

    private void ad() {
        InterfaceC5283bvo m = m();
        if (m == null) {
            return;
        }
        InterfaceC5283bvo interfaceC5283bvo = this.n;
        boolean isKidsProfile = interfaceC5283bvo == null ? false : interfaceC5283bvo.isKidsProfile();
        for (ExternalCrashReporter externalCrashReporter : ExternalCrashReporter.c.b(this.k)) {
            externalCrashReporter.e(m.getProfileGuid(), isKidsProfile);
        }
    }

    @Override // o.aMF
    public void doInit() {
        this.w = new e();
        this.s = new C5065bri(getContext(), this.f);
        this.p = new C5009bqf(getContext(), K(), this.c, this.y, this.h);
        ab();
        T();
        Logger.INSTANCE.startSession(new UserInteraction());
        String J2 = J();
        C1831aPw c1831aPw = null;
        if (C8168dfL.h(J2)) {
            C1044Mm.e("nf_service_useragent", "member init");
            if (i(J2)) {
                this.q = UserAgentState.c;
                initCompleted(InterfaceC1078Nw.aJ);
                if (AbstractApplicationC1040Mh.e()) {
                    getMainHandler().postDelayed(this.g, 30000L);
                }
            }
            if (this.f.ad()) {
                this.f.c(f(), true, null);
                return;
            }
            return;
        }
        C1044Mm.e("nf_service_useragent", "nonMember init");
        if (this.f.c()) {
            this.q = UserAgentState.c;
            initCompleted(InterfaceC1078Nw.aJ);
        } else {
            c1831aPw = this.e;
        }
        this.f.c(f(), false, c1831aPw);
    }

    private NgpStoreApi K() {
        return aIR.c.c(getContext()).a();
    }

    private String J() {
        return C8157dfA.e(getContext(), "useragent_current_profile_id", (String) null);
    }

    private boolean i(final String str) {
        C1044Mm.a("nf_service_useragent", "initLastKnownUser userId=%s", str);
        if (!getMSLClient().c(str)) {
            C1044Mm.e("nf_service_useragent", "UserId is NOT known to MSL, check if re-authorization data exist!");
            C8378djj b = getMSLClient().b();
            if (b != null && str.equals(b.b)) {
                e(b);
                return false;
            }
            C1044Mm.j("nf_service_useragent", "Restore data not found for %s, try to log in using cookies", str);
            AuthCookieHolder e2 = getMslAgentCookiesProvider().e(str);
            if (e2 != null) {
                C1044Mm.a("nf_service_useragent", "Cookies found for %s, trying to log in using cookies...", str);
                a(e2);
                return false;
            }
            C1044Mm.j("nf_service_useragent", "Restore data not found for %s, leave user in logout state", str);
            M();
            return true;
        }
        C1044Mm.e("nf_service_useragent", "User is known to MSL, check restrictions....");
        this.f13230o.c(str);
        C5004bqa.d(r(), this, getErrorHandler());
        boolean ag = ag();
        C1044Mm.a("nf_service_useragent", "User is known to MSL, verifySSOTokenFromSharedStorage disableSso=%b", Boolean.valueOf(ag));
        if (!ag) {
            this.p.a();
        }
        AuthCookieHolder e3 = getMslAgentCookiesProvider().e(str);
        if (e3 != null) {
            C1044Mm.a("nf_service_useragent", "Cookies found. all good for user, %s, %s", str, e3);
            this.f13230o.b(e3);
            b(e3, str);
            return true;
        }
        C1044Mm.e("nf_service_useragent", "Cookies NOT found for user %s, try to get them!", str);
        AbstractC5011bqh abstractC5011bqh = new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.25
            @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
            public void b(AuthCookieHolder authCookieHolder, Status status) {
                if (status.j() && authCookieHolder != null && C8168dfL.h(authCookieHolder.netflixId)) {
                    UserAgentImpl.this.f13230o.c(authCookieHolder);
                    UserAgentImpl.this.b(authCookieHolder, str);
                } else {
                    C1044Mm.j("nf_service_useragent", "Failed to refresh credentials!");
                    UserAgentImpl.this.b(SignOutReason.cookiesFetchFailed);
                }
                UserAgentImpl.this.q = UserAgentState.c;
                UserAgentImpl.this.initCompleted(InterfaceC1078Nw.aJ);
            }
        };
        this.q = UserAgentState.e;
        addDataRequest(this.s.e(str, abstractC5011bqh));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AuthCookieHolder authCookieHolder, String str) {
        m(str);
        c(authCookieHolder);
        y();
    }

    private void c(AuthCookieHolder authCookieHolder) {
        String str;
        InterfaceC5283bvo interfaceC5283bvo = this.n;
        if (interfaceC5283bvo != null) {
            if (interfaceC5283bvo.isKidsProfile()) {
                Logger.INSTANCE.addContext(new KidsMode());
            }
            Logger logger = Logger.INSTANCE;
            logger.startSession(new ProfileGuid(interfaceC5283bvo.getProfileGuid()));
            if (authCookieHolder == null || (str = authCookieHolder.netflixId) == null) {
                return;
            }
            logger.startSession(new NetflixId(str));
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void x() {
        InterfaceC5283bvo interfaceC5283bvo = this.n;
        C5006bqc c5006bqc = this.f13230o;
        if (interfaceC5283bvo != null) {
            if (interfaceC5283bvo.isKidsProfile()) {
                Logger.INSTANCE.addContext(new KidsMode());
            }
            Logger logger = Logger.INSTANCE;
            logger.startSession(new ProfileGuid(interfaceC5283bvo.getProfileGuid()));
            if (c5006bqc == null || c5006bqc.i() == null) {
                return;
            }
            logger.startSession(new NetflixId(c5006bqc.i()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        getMainHandler().removeCallbacks(this.g);
        if (this.j) {
            C1044Mm.a("nf_service_useragent", "refreshConfigAndAccountData fetching account data.");
            this.j = false;
            this.f.c(f(), true, null);
            b(new C5015bql() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.35
                @Override // o.C5015bql, o.InterfaceC5018bqo
                public void e(AccountData accountData, Status status) {
                    C8157dfA.e.j(UserAgentImpl.this.getContext());
                }
            });
            return;
        }
        C1044Mm.a("nf_service_useragent", "refreshConfigAndAccountData already fetched.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(AccountData accountData, Status status) {
        return status.j() && accountData != null && accountData.getUserAccount() != null && accountData.getUserAccount().isNotActiveOrOnHold();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AccountData accountData, Status status) {
        if (c(accountData, status)) {
            C1044Mm.e("nf_service_useragent", "user is not active, need to bump him out to nonMember page");
            final UserCookies O = O();
            if (C8168dfL.g(O.netflixId)) {
                d(new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.37
                    @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
                    public void b(AuthCookieHolder authCookieHolder, Status status2) {
                        super.b(authCookieHolder, status2);
                        if (status2.j() && authCookieHolder != null && C8168dfL.h(authCookieHolder.netflixId)) {
                            C1044Mm.a("nf_service_useragent", "cookie fetch success  setting %s", authCookieHolder.netflixId);
                            C8284dhV.a(authCookieHolder.netflixId, authCookieHolder.secureNetflixId, UserAgentImpl.this.V());
                        } else {
                            C1044Mm.a("nf_service_useragent", "cookie refresh fail setting %s", UserAgentImpl.this.l().i());
                        }
                        C1044Mm.a("nf_service_useragent", "cookies in jar before sign-up activity : %s", O);
                        UserAgentImpl.this.S();
                    }
                });
            } else {
                S();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        if (AbstractApplicationC1040Mh.getInstance().n()) {
            return;
        }
        LocalBroadcastManager.getInstance(this.k).sendBroadcast(new Intent("com.netflix.mediaclient.ui.error.ACTION_ACCOUNT_INACTIVE"));
    }

    private boolean P() {
        return this.f.ai();
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void b(final InterfaceC5018bqo interfaceC5018bqo) {
        this.d.d(new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.38
            @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
            public void c(AccountData accountData, Status status) {
                if (status.j()) {
                    UserAgentImpl.this.c(accountData.getUserProfiles());
                    C5020bqq.d(UserAgentImpl.this.getContext());
                    boolean r = UserAgentImpl.this.r();
                    UserAgentImpl userAgentImpl = UserAgentImpl.this;
                    C5004bqa.d(r, userAgentImpl, userAgentImpl.getErrorHandler());
                    InterfaceC6636cgz a = InterfaceC6636cgz.a(UserAgentImpl.this.getContext());
                    boolean z = (a.e(UserAgentImpl.this.getContext()) && a.d()) ? false : true;
                    boolean j = C1868aRf.j();
                    if (UserAgentImpl.this.c(accountData, status) && z && !j) {
                        UserAgentImpl.this.b(accountData, status);
                    }
                }
                InterfaceC5018bqo interfaceC5018bqo2 = interfaceC5018bqo;
                if (interfaceC5018bqo2 != null) {
                    interfaceC5018bqo2.e(accountData, status);
                }
                if (UserAgentImpl.this.n != null) {
                    UserAgentImpl.this.e(false, (String) null, (String) null);
                }
            }
        }, P());
    }

    private void e(C8378djj c8378djj) {
        C1044Mm.e("nf_service_useragent", "recoverUserWithMslAuthData:: recover user state with msl auth data");
        this.q = UserAgentState.h;
        dkY dky = new dkY(c8378djj.e, c8378djj.c);
        AuthCookieHolder e2 = getMslAgentCookiesProvider().e(c8378djj.b);
        C1044Mm.a("nf_service_useragent", "recoverUserWithMslAuthData:: cookies found for user %s, trying relogin with failback", c8378djj.b);
        b(c8378djj.b, dky, new dkX(e2.netflixId, e2.secureNetflixId));
    }

    private void a(AuthCookieHolder authCookieHolder) {
        C1044Mm.e("nf_service_useragent", "recover user state with cookies");
        this.q = UserAgentState.b;
        b(authCookieHolder.userId, new dkX(authCookieHolder.netflixId, authCookieHolder.secureNetflixId), (AbstractC8424dlb) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str, final AbstractC8424dlb abstractC8424dlb, final AbstractC8424dlb abstractC8424dlb2) {
        this.f13230o.c(str);
        AbstractC2100aZw e2 = this.s.e(str, new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.40
            @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
            public void b(AuthCookieHolder authCookieHolder, Status status) {
                if (status.j()) {
                    C1044Mm.e("nf_service_useragent", "Able to refresh credentials!");
                    UserAgentImpl.this.f13230o.c(str);
                    UserAgentImpl.this.f13230o.c(authCookieHolder);
                    UserAgentImpl.this.b(authCookieHolder, str);
                    abstractC8424dlb.getClass();
                } else {
                    C1044Mm.j("nf_service_useragent", "Failed to refresh credentials using %s!", abstractC8424dlb.getClass().getSimpleName());
                    AbstractC8424dlb abstractC8424dlb3 = abstractC8424dlb2;
                    if (abstractC8424dlb3 != null) {
                        C1044Mm.j("nf_service_useragent", "Re trying to recover with failback using %s, if we fail, user will be logged out!", abstractC8424dlb3.getClass().getSimpleName());
                        abstractC8424dlb.getClass();
                        abstractC8424dlb2.getClass();
                        UserAgentImpl.this.b(str, abstractC8424dlb2, (AbstractC8424dlb) null);
                        return;
                    }
                    abstractC8424dlb.getClass();
                    UserAgentImpl.this.b(SignOutReason.reloginByCookiesFailed);
                }
                UserAgentImpl.this.q = UserAgentState.c;
                UserAgentImpl.this.initCompleted(InterfaceC1078Nw.aJ);
            }
        });
        e2.c(a(str, abstractC8424dlb));
        addDataRequest(e2);
    }

    private void m(String str) {
        C1044Mm.e("nf_service_useragent", "restoreProfileData");
        if (this.d.b()) {
            c(str, ProfileActivatedSource.restoreProfile);
        }
    }

    private void M() {
        L();
    }

    @Override // o.aMF
    public void destroy() {
        getMainHandler().removeCallbacks(this.g);
        ae();
        super.destroy();
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.USER_AGENT_LOADED;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public List<? extends InterfaceC5283bvo> b() {
        List<InterfaceC5283bvo> c2 = this.d.c();
        if (v() && c2 == null) {
            InterfaceC1597aHe.e("SPY-35025 - all profiles is incorrectly null, when user is logged in");
        }
        return c2;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public InterfaceC5283bvo b(String str) {
        return this.d.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String[] strArr) {
        C4984bqG.b.c(this.k, strArr);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public boolean p() {
        return O().isValid();
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public boolean u() {
        InterfaceC5282bvn e2 = this.d.e();
        if (e2 != null) {
            return e2.isNotActiveOrOnHold();
        }
        return false;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public boolean w() {
        InterfaceC5282bvn e2 = this.d.e();
        if (e2 != null) {
            long memberSince = e2.memberSince();
            if (memberSince > 0) {
                long d = (C8170dfN.d() - memberSince) / 86400000;
                C1044Mm.b("nf_service_useragent", "isNewMember days = " + d);
                if (d < 30) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public Boolean t() {
        C4985bqH.b.e(this.k, this.n, "isKidsProfile");
        InterfaceC5283bvo interfaceC5283bvo = this.n;
        if (interfaceC5283bvo == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC5283bvo.isKidsProfile());
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public String h() {
        InterfaceC5283bvo a;
        InterfaceC5282bvn e2 = this.d.e();
        if (e2 == null || (a = this.d.a(e2.getUserGuid())) == null) {
            return null;
        }
        return a.getProfileEmail();
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public String e() {
        InterfaceC5282bvn e2 = this.d.e();
        if (e2 == null) {
            return null;
        }
        return e2.getUserGuid();
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public InterfaceC5282bvn i() {
        return this.d.e();
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public boolean c() {
        InterfaceC5282bvn e2 = this.d.e();
        return e2 != null && e2.canCreateUserProfile();
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public String g() {
        C1044Mm.e("nf_service_useragent", "getCurrentProfileGuid called");
        InterfaceC5283bvo interfaceC5283bvo = this.n;
        if (interfaceC5283bvo == null) {
            return null;
        }
        return interfaceC5283bvo.getProfileGuid();
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public InterfaceC5034brD c(String str) {
        synchronized (this) {
            InterfaceC5170bth mslAgentCookiesProvider = getMslAgentCookiesProvider();
            if (mslAgentCookiesProvider == null) {
                return null;
            }
            final AuthCookieHolder e2 = mslAgentCookiesProvider.e(str);
            if (e2 == null) {
                C1044Mm.j("nf_service_useragent", "No cookies for profile %s", str);
                return null;
            }
            C1044Mm.a("nf_service_useragent", "Cookies found for profile %s", str);
            return new InterfaceC5034brD() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.36
                @Override // o.InterfaceC5034brD
                public boolean c(AuthCookieHolder authCookieHolder) {
                    return false;
                }

                @Override // o.InterfaceC5034brD
                public String f() {
                    return UserAgentImpl.this.f13230o.f();
                }

                @Override // o.InterfaceC5034brD
                public String g() {
                    return UserAgentImpl.this.f13230o.g();
                }

                @Override // o.InterfaceC5034brD
                public String i() {
                    return e2.netflixId;
                }

                @Override // o.InterfaceC5034brD
                public String j() {
                    return e2.secureNetflixId;
                }

                @Override // o.InterfaceC5034brD
                public String d() {
                    return e2.userId;
                }

                @Override // o.InterfaceC5034brD
                public String b() {
                    return e2.userId;
                }
            };
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public InterfaceC5093bsJ e(final String str) {
        if (C8168dfL.g(str)) {
            return null;
        }
        if (!getMSLClient().c(str)) {
            C1044Mm.j("nf_service_useragent", "MSL store does not know for profile %s", str);
            return null;
        }
        C1044Mm.a("nf_service_useragent", "MSL store know for profile %s", str);
        return new InterfaceC5093bsJ() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.44
            @Override // o.InterfaceC5093bsJ
            public AbstractC8424dlb c() {
                return null;
            }

            @Override // o.InterfaceC5093bsJ
            public String d() {
                return str;
            }
        };
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void c(C5007bqd c5007bqd, final InterfaceC5018bqo interfaceC5018bqo) {
        C1044Mm.e("nf_service_useragent", "loginUser activateAccByEmailPassword");
        C4991bqN.a(getContext());
        if (this.f == null) {
            interfaceC5018bqo.c(InterfaceC1078Nw.aK);
        } else if (v()) {
            C1044Mm.d("nf_service_useragent", "User is logged in! This should NOT happen!");
            this.a.b();
            a(C8169dfM.e(StatusCode.NRD_REGISTRATION_EXISTS, "UserAgent: activateAccByEmailPassword fails, NRD registration exist", false, RootCause.clientFailure), interfaceC5018bqo);
            ExtLogger.INSTANCE.failedExclusiveAction("SignIn", null);
        } else {
            C1044Mm.e("nf_service_useragent", "Login via Dynecom");
            this.f.d(c5007bqd, new C1831aPw() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.4
                @Override // o.C1831aPw, o.InterfaceC1813aPe
                public void c(SignInData signInData, Status status) {
                    if (status.i() || signInData == null || !signInData.isSignInSuccessful() || !signInData.isValid()) {
                        UserAgentImpl.this.b(signInData, status, interfaceC5018bqo);
                    } else {
                        UserAgentImpl.this.d(signInData, interfaceC5018bqo);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SignInData signInData, Status status, InterfaceC5018bqo interfaceC5018bqo) {
        C1044Mm.d("nf_service_useragent", "Login via Dynecom was failure...");
        if (status.g()) {
            a(C8169dfM.e(status.c(), "UserAgent: activateLoginViaDynecom fails", true, RootCause.clientFailure), interfaceC5018bqo);
            return;
        }
        StatusCode statusCode = StatusCode.USER_SIGNIN_RETRY;
        if (signInData != null) {
            if (signInData.shouldTrySignUp()) {
                C1044Mm.e("nf_service_useragent", "Not currentMember,  need to go to sign-up page and send push notifications regId");
                AbstractApplicationC1040Mh.getInstance().b();
                AuthCookieHolder authCookieHolder = signInData.authCookieHolder;
                if (authCookieHolder != null) {
                    a(authCookieHolder.netflixId, authCookieHolder.secureNetflixId);
                }
                af();
                statusCode = StatusCode.USER_SIGNIN_FAILURE_TRY_SIGNUP;
            } else if (signInData.isThrottled()) {
                statusCode = StatusCode.USER_SIGNIN_THROTTLED;
            } else if (signInData.isPasswordIncorrect()) {
                statusCode = StatusCode.ERROR_INCORRECT_PASSWORD;
                C1044Mm.d("nf_service_useragent", "Password is incorrect");
            } else if (signInData.isEmailUnrecognised()) {
                statusCode = StatusCode.ERROR_UNRECOGNIZED_EMAIL;
                C1044Mm.d("nf_service_useragent", "Email is incorrect");
            } else if (signInData.isPhoneUnrecognized()) {
                statusCode = StatusCode.ERROR_UNRECOGNIZED_PHONE;
                C1044Mm.d("nf_service_useragent", "Phone is incorrect");
            } else if (signInData.isAccountWithNoPasswordSet()) {
                statusCode = StatusCode.ERROR_ACCOUNT_PASSWORD_NOT_SET;
                C1044Mm.d("nf_service_useragent", "Account has no password set");
            } else if (signInData.isConsumptionOnlyFormerMember()) {
                statusCode = StatusCode.ERROR_FORMER_MEMBER_CONSUMPTION;
                C1044Mm.d("nf_service_useragent", "Account is a consumption-only former member");
            } else if (signInData.isRedirectOnlyFormerMember()) {
                statusCode = StatusCode.ERROR_FORMER_MEMBER_REDIRECT;
                C1044Mm.d("nf_service_useragent", "Account is a redirect-only former member");
            } else if (signInData.isConsumptionOnlyNeverMember()) {
                statusCode = StatusCode.ERROR_NEVER_MEMBER_CONSUMPTION;
                C1044Mm.d("nf_service_useragent", "Account is a consumption-only never member");
            } else if (signInData.isRedirectOnlyNeverMember()) {
                statusCode = StatusCode.ERROR_NEVER_MEMBER_REDIRECT;
                C1044Mm.d("nf_service_useragent", "Account is a redirect-only never member");
            } else if (signInData.isRedirectOnlyDVDMember()) {
                statusCode = StatusCode.ERROR_DVD_MEMBER_REDIRECT;
                C1044Mm.d("nf_service_useragent", "Account is a redirect-only DVD member");
            } else if (signInData.isConsumptionOnlyUnrecognizedEmail()) {
                statusCode = StatusCode.ERROR_UNRECOGNIZED_CONSUMPTION;
                C1044Mm.d("nf_service_useragent", "Email is incorrect, but login is consumption-only");
            } else if (signInData.isRedirectOnlyUnrecognizedEmail()) {
                statusCode = StatusCode.ERROR_UNRECOGNIZED_REDIRECT;
                C1044Mm.d("nf_service_useragent", "Email is incorrect, but login is redirect-only");
            }
        }
        a(C8169dfM.e(statusCode, "UserAgent: activateLoginViaDynecom fails", true, RootCause.clientFailure), interfaceC5018bqo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SignInData signInData, InterfaceC5018bqo interfaceC5018bqo) {
        C1044Mm.e("nf_service_useragent", "Login via Dynecom was success...");
        try {
            this.f13230o.b(signInData.authCookieHolder);
            if (getMSLClient().c("TEMP_PROFILE_ID")) {
                ac();
                C1044Mm.e("nf_service_useragent", "Activate user, user ID token is available!");
                b((dkX) null, interfaceC5018bqo);
            } else {
                C1044Mm.j("nf_service_useragent", "loginUser tokenActivate, user ID token is not available!");
                AuthCookieHolder authCookieHolder = signInData.authCookieHolder;
                c(new C1569aGd(authCookieHolder.netflixId, authCookieHolder.secureNetflixId), interfaceC5018bqo);
            }
        } catch (JSONException e2) {
            C1044Mm.b("nf_service_useragent", e2, "error creating activationTokesn", new Object[0]);
            a(C8169dfM.e(StatusCode.NRD_ERROR, "UserAgent: activateLoginViaDynecom fails", true, RootCause.clientFailure), interfaceC5018bqo);
        }
    }

    private void ac() {
        if (v()) {
            C1044Mm.j("nf_service_useragent", "Attempting token activation while user is logged in");
            InterfaceC1598aHf.a(new C1596aHd("Attempting token activation while user is logged in").b(false));
        }
    }

    private void a(String str, String str2) {
        this.f.e(e(str, str2));
    }

    private UserCookies e(String str, String str2) {
        UserCookies O = O();
        if (C8168dfL.d(str, O.netflixId) && C8168dfL.d(str2, O.secureNetflixId)) {
            return null;
        }
        return new UserCookies(str, str2);
    }

    private void b(dkX dkx, InterfaceC5018bqo interfaceC5018bqo) {
        a(dkx, interfaceC5018bqo, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final dkX dkx, final InterfaceC5018bqo interfaceC5018bqo, final boolean z) {
        C1044Mm.a("nf_service_useragent", "doActivateFetchConfigData: fetch account level config data shouldRetry %s", Boolean.valueOf(z));
        C1831aPw c1831aPw = new C1831aPw() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.5
            @Override // o.C1831aPw, o.InterfaceC1813aPe
            public void d(ConfigData configData, Status status) {
                C1044Mm.a("nf_service_useragent", "doActivateFetchConfigData onConfigDataFetched res.isSuccess:%b, isAccountDataAvailable:%b", Boolean.valueOf(status.j()), Boolean.valueOf(UserAgentImpl.this.R()));
                if (status.j()) {
                    UserAgentImpl.this.b(dkx, interfaceC5018bqo, true);
                } else if (z) {
                    UserAgentImpl.this.a(dkx, interfaceC5018bqo, false);
                } else if (C8067ddQ.c()) {
                    C1044Mm.e("nf_service_useragent", "failed to get accountConfigData even with 2 tries..");
                    UserAgentImpl.this.d(C8169dfM.e(status));
                    UserAgentImpl.this.a(status, interfaceC5018bqo);
                } else {
                    UserAgentImpl.this.b(dkx, interfaceC5018bqo, true);
                }
            }
        };
        InterfaceC5093bsJ a = a("TEMP_PROFILE_ID", dkx);
        C1818aPj.c(getContext());
        InterfaceC1593aHa.b("Deleted persisted AB allocations");
        this.f.c(a, true, c1831aPw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(dkX dkx, InterfaceC5018bqo interfaceC5018bqo, boolean z) {
        AuthCookieHolder authCookieHolder;
        C1044Mm.a("nf_service_useragent", "doActivateFetchUser shouldRetry %s", Boolean.valueOf(z));
        if (this.f13230o.d() != null) {
            C1044Mm.j("nf_service_useragent", "This should NOT happen, userID exist in MSL registry %s", this.f13230o.d());
        }
        this.f13230o.c("TEMP_PROFILE_ID");
        C1044Mm.e("nf_service_useragent", "fetching user data");
        if (dkx != null) {
            authCookieHolder = new AuthCookieHolder("TEMP_PROFILE_ID", dkx.e(), dkx.a());
        } else {
            authCookieHolder = new AuthCookieHolder("TEMP_PROFILE_ID", this.f13230o.i(), this.f13230o.j());
        }
        C1044Mm.a("nf_service_useragent", "Dynecom credentials: %s", authCookieHolder);
        this.d.d(c(dkx, interfaceC5018bqo, authCookieHolder, z), P());
    }

    public InterfaceC5093bsJ a(String str, AbstractC8424dlb abstractC8424dlb) {
        return new C5010bqg(str, abstractC8424dlb, this.f13230o);
    }

    private JSONObject a(String str, String str2, AuthCookieHolder authCookieHolder) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Payload.PARAM_RENO_CAUSE, str);
            if (str2 != null) {
                jSONObject.put("rawResponse", str2);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("credentials", jSONObject2);
            if (authCookieHolder != null) {
                jSONObject2.put("exist", true);
                String str3 = authCookieHolder.netflixId;
                if (str3 != null) {
                    jSONObject2.put("netflixId", str3);
                }
                String str4 = authCookieHolder.secureNetflixId;
                if (str4 != null) {
                    jSONObject2.put("secureNetflixId", str4);
                }
                String str5 = authCookieHolder.userId;
                if (str5 != null) {
                    jSONObject2.put("userId", str5);
                }
            } else {
                jSONObject2.put("exist", false);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(AccountData accountData, AuthCookieHolder authCookieHolder, InterfaceC5018bqo interfaceC5018bqo) {
        C1044Mm.d("nf_service_useragent", "Response success! Primary profile does NOT exist! This should NOT happen!");
        d(C8169dfM.d(StatusCode.PRIMARY_PROFILE_NOT_FOUND, a("Response success! Primary profile does NOT exist! This should NOT happen!", accountData.getRawResponse(), authCookieHolder)));
        a(InterfaceC1078Nw.aH, interfaceC5018bqo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, InterfaceC5283bvo interfaceC5283bvo, AuthCookieHolder authCookieHolder) {
        C1044Mm.a("nf_service_useragent", "Current MSLUserCredentialRegistry getUserId: %s", str);
        C1044Mm.a("nf_service_useragent", "Replace : %s with %s", "TEMP_PROFILE_ID", interfaceC5283bvo.getProfileGuid());
        getMSLClient().d("TEMP_PROFILE_ID", interfaceC5283bvo.getProfileGuid());
        this.f13230o.c(interfaceC5283bvo.getProfileGuid());
        authCookieHolder.userId = interfaceC5283bvo.getProfileGuid();
        this.f13230o.c(authCookieHolder);
    }

    private InterfaceC4986bqI c(final dkX dkx, final InterfaceC5018bqo interfaceC5018bqo, final AuthCookieHolder authCookieHolder, final boolean z) {
        return new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.3
            @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
            public void c(AccountData accountData, Status status) {
                if (!status.j()) {
                    if (z) {
                        UserAgentImpl.this.b(dkx, interfaceC5018bqo, false);
                        return;
                    }
                    C1044Mm.e("nf_service_useragent", "fetchAccountData failed (skipping user info changeUser) with statusCode=%s", status.c());
                    UserAgentImpl.this.d(C8169dfM.e(status));
                    UserAgentImpl.this.a(status, interfaceC5018bqo);
                    return;
                }
                C1044Mm.a("nf_service_useragent", "Account data fetched: %s", accountData);
                InterfaceC5283bvo primaryProfile = accountData.getPrimaryProfile();
                if (primaryProfile == null) {
                    UserAgentImpl.this.d(accountData, authCookieHolder, interfaceC5018bqo);
                    return;
                }
                try {
                    String d = UserAgentImpl.this.l().d();
                    if (C8168dfL.h(d) && !"TEMP_PROFILE_ID".equals(d)) {
                        C1044Mm.j("nf_service_useragent", "We already have credentials %s. Double submission most likely!", d);
                        return;
                    }
                    UserAgentImpl.this.e(d, primaryProfile, authCookieHolder);
                    String d2 = UserAgentImpl.this.l().d();
                    Logger logger = Logger.INSTANCE;
                    logger.startSession(new ProfileGuid(d2));
                    logger.startSession(new NetflixId(authCookieHolder.netflixId));
                    UserAgentImpl.this.c(d2, ProfileActivatedSource.login);
                    C5020bqq.d(UserAgentImpl.this.getContext());
                    C5020bqq.b(UserAgentImpl.this.getContext());
                    UserAgentImpl.this.U();
                    C5020bqq.a();
                    UserAgentImpl.this.a(new NetflixStatus(StatusCode.OK), interfaceC5018bqo);
                    AbstractApplicationC1040Mh.getInstance().t();
                    C8157dfA.d(UserAgentImpl.this.getContext(), "nf_user_status_loggedin", true);
                    UserAgentImpl.this.a.b();
                    C1044Mm.e("nf_service_useragent", "doLoginComplete");
                    if (UserAgentImpl.this.n != null) {
                        UserAgentImpl.this.e(false, (String) null, (String) null);
                    }
                } catch (MslException e2) {
                    C1044Mm.b("nf_service_useragent", e2, "Unable to changeUser placeholder temp profile ID", new Object[0]);
                    InterfaceC1593aHa.b("MslException: " + e2.getMessage());
                    UserAgentImpl.this.a(C8169dfM.e(StatusCode.MSL_FAILED_TO_UPDATE_USER_ID, "UserAgent: activateAccByEmailPassword fails, failed to changeUser UserID in MSLStore", false, RootCause.clientFailure), interfaceC5018bqo);
                }
            }
        };
    }

    private void d(final InterfaceC4986bqI interfaceC4986bqI) {
        addDataRequest(this.s.e(this.f13230o.d(), new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.1
            @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
            public void b(AuthCookieHolder authCookieHolder, Status status) {
                C1044Mm.a("nf_service_useragent", "status: %s, MSL refreshed cookies %s", authCookieHolder, status);
                if (status.j() && authCookieHolder != null && C8168dfL.h(authCookieHolder.netflixId)) {
                    UserAgentImpl.this.f13230o.c(authCookieHolder);
                    Logger logger = Logger.INSTANCE;
                    logger.startSession(new ProfileGuid(UserAgentImpl.this.f13230o.d()));
                    logger.startSession(new NetflixId(authCookieHolder.netflixId));
                }
                interfaceC4986bqI.b(authCookieHolder, status);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<InterfaceC5283bvo> list) {
        InterfaceC5283bvo a = this.d.a(this.f13230o.d());
        if (a != null) {
            C1044Mm.e("nf_service_useragent", "Current profile found...");
            this.n = a;
            C4985bqH.b.e(this.k, a, "updateCurrentProfile");
        }
    }

    private InterfaceC5283bvo e(List<InterfaceC5283bvo> list, String str) {
        for (InterfaceC5283bvo interfaceC5283bvo : list) {
            if (interfaceC5283bvo.isProfileGuidValid() && interfaceC5283bvo.getProfileGuid().equals(str)) {
                return interfaceC5283bvo;
            }
        }
        return null;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void d(C1569aGd c1569aGd, InterfaceC5018bqo interfaceC5018bqo) {
        C1044Mm.e("nf_service_useragent", "loginUserByTokens");
        this.f13230o.b(new AuthCookieHolder(null, c1569aGd.a, c1569aGd.d));
        c(c1569aGd, interfaceC5018bqo);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void c(InterfaceC5018bqo interfaceC5018bqo) {
        C1044Mm.e("nf_service_useragent", "loginUserWithExistingTokens");
        b(new dkX(this.f13230o.i(), this.f13230o.j()), interfaceC5018bqo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(C1569aGd c1569aGd, InterfaceC5018bqo interfaceC5018bqo) {
        C1044Mm.e("nf_service_useragent", "loginUser tokenActivate");
        if (v()) {
            InterfaceC1598aHf.a(new C1596aHd("Attempting token activation while user is logged in").b(false));
        }
        b(new dkX(c1569aGd.a, c1569aGd.d), interfaceC5018bqo);
    }

    private boolean o(String str) {
        return (this.d.c() == null || C8168dfL.g(str) || g(str) == null) ? false : true;
    }

    private InterfaceC5283bvo l(String str) {
        InterfaceC5283bvo g = g(str);
        Objects.requireNonNull(g);
        return g;
    }

    private InterfaceC5283bvo g(String str) {
        return this.d.a(str);
    }

    public void c(final String str, Long l) {
        this.u = true;
        this.j = true;
        Long l2 = this.x;
        if (l2 != null) {
            Logger.INSTANCE.cancelSession(l2);
        }
        if (l == null) {
            l = Logger.INSTANCE.startSession(new SelectProfile(AppView.profileAvatar, str, null, CommandValue.SelectProfileCommand, null));
        }
        this.x = l;
        if (!o(str) || C8168dfL.g(this.f13230o.d())) {
            C1044Mm.e("nf_service_useragent", "Unknown profile ID: %s or credentialUserId: %s", str, this.f13230o.d());
            StatusCode statusCode = StatusCode.SWITCH_PROFILE_UNKNOWN_ID;
            d(statusCode);
            c(statusCode);
        } else if (this.f13230o.d().equals(str)) {
            C1044Mm.a("nf_service_useragent", "We are already on profile %s. Do nothing.", str);
            StatusCode statusCode2 = StatusCode.OK;
            d(statusCode2);
            c(statusCode2);
            C5020bqq.a(getContext(), l(str));
        } else {
            C1044Mm.a("nf_service_useragent", "selectProfile %s", str);
            getLoggingAgent().n();
            dkV e2 = getMSLClient().e(this.f13230o.d(), str);
            if (e2 == null) {
                C1044Mm.d("nf_service_useragent", "switchWebUserProfile failed, userId token was not found for current user id. It should not happen!");
                StatusCode statusCode3 = StatusCode.MSL_SWITCH_PROFILE_NO_AUTH_DATA;
                d(statusCode3);
                c(statusCode3);
                return;
            }
            a((UmaAlert) null);
            AbstractC2100aZw e3 = this.s.e(str, new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.9
                @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
                public void b(AuthCookieHolder authCookieHolder, Status status) {
                    if (status.j() && authCookieHolder != null && C8168dfL.h(authCookieHolder.netflixId)) {
                        UserAgentImpl.this.b(str, authCookieHolder, status);
                        return;
                    }
                    StatusCode statusCode4 = StatusCode.MSL_SWITCH_PROFILE_FAILED;
                    StatusCode c2 = status.c();
                    StatusCode statusCode5 = StatusCode.MSL_REFRESH_PROFILE_LIST;
                    if (c2 == statusCode5) {
                        C1044Mm.e("nf_service_useragent", "(skipping userProfile changeUser) - msl failed to switch user, profile most likely does not exist, refresh profile list - with statusCode=%s", status.c());
                        UserAgentImpl.this.Y();
                        statusCode4 = statusCode5;
                    } else {
                        C1044Mm.e("nf_service_useragent", "(skipping userProfile changeUser) - msl failed to switch user - with statusCode=%s", status.c());
                    }
                    UserAgentImpl.this.d(statusCode4);
                    UserAgentImpl.this.c(statusCode4);
                }
            });
            e3.c(a(str, e2));
            addDataRequest(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        this.d.e(new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.8
            @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
            public void c(AccountData accountData, Status status) {
                if (status.j()) {
                    UserAgentImpl.this.c(accountData.getUserProfiles());
                    C1044Mm.e("nf_service_useragent", "Profile list refreshed on failed switch profile, alert profile gate");
                    C5020bqq.c();
                    return;
                }
                C1044Mm.d("nf_service_useragent", "Profile list refreshed failed on failed switch profile, do NOT alert profile gate! We are in logout process most likely.");
            }
        }, P());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, AuthCookieHolder authCookieHolder, Status status) {
        this.f13230o.c(str);
        C1044Mm.e("nf_service_useragent", "doSelectedProfile new profile, update...");
        InterfaceC5283bvo interfaceC5283bvo = this.n;
        if (interfaceC5283bvo != null) {
            if (interfaceC5283bvo.isKidsProfile()) {
                Logger.INSTANCE.removeExclusiveContext(KidsMode.class);
            }
            ExtLogger.INSTANCE.endExclusiveAction("NetflixId");
        }
        aa();
        InterfaceC5283bvo b = b(str);
        if (b != null && b.isKidsProfile()) {
            Logger.INSTANCE.addContext(new KidsMode());
        }
        if (authCookieHolder != null) {
            C1044Mm.a("nf_service_useragent", "User credentials found: %s ", authCookieHolder);
            this.f13230o.c(authCookieHolder);
            Logger logger = Logger.INSTANCE;
            logger.startSession(new NetflixId(authCookieHolder.netflixId));
            logger.startSession(new ProfileGuid(str));
        } else {
            C1044Mm.d("nf_service_useragent", "User credentials not returned! Failure!");
        }
        c(str, ProfileActivatedSource.switchProfile);
        d(status.c());
        c(status.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(StatusCode statusCode) {
        this.u = false;
        C5020bqq.c(getContext(), statusCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(StatusCode statusCode) {
        Long l = this.x;
        if (l != null) {
            if (statusCode == StatusCode.OK) {
                Logger.INSTANCE.endSession(l);
            } else {
                ExtLogger.INSTANCE.failedAction(l, statusCode.toString());
            }
            this.x = null;
        }
    }

    /* renamed from: com.netflix.mediaclient.service.user.UserAgentImpl$10  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass10 extends AbstractC5011bqh {
        final /* synthetic */ InterfaceC5018bqo c;

        AnonymousClass10(InterfaceC5018bqo interfaceC5018bqo) {
            this.c = interfaceC5018bqo;
        }

        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void b(final boolean z, final Status status) {
            if (this.c != null) {
                Handler mainHandler = UserAgentImpl.this.getMainHandler();
                final InterfaceC5018bqo interfaceC5018bqo = this.c;
                mainHandler.post(new Runnable() { // from class: o.bqy
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5018bqo.this.a(z, status);
                    }
                });
            }
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void d(InterfaceC5018bqo interfaceC5018bqo) {
        addDataRequest(this.s.c(new AnonymousClass10(interfaceC5018bqo)));
    }

    /* renamed from: com.netflix.mediaclient.service.user.UserAgentImpl$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 extends AbstractC5011bqh {
        final /* synthetic */ InterfaceC5018bqo a;

        AnonymousClass6(InterfaceC5018bqo interfaceC5018bqo) {
            this.a = interfaceC5018bqo;
        }

        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void b(final boolean z, final Status status) {
            if (this.a != null) {
                Handler mainHandler = UserAgentImpl.this.getMainHandler();
                final InterfaceC5018bqo interfaceC5018bqo = this.a;
                mainHandler.post(new Runnable() { // from class: o.bqA
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5018bqo.this.a(z, status);
                    }
                });
            }
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void a(InterfaceC5018bqo interfaceC5018bqo) {
        addDataRequest(this.s.d(new AnonymousClass6(interfaceC5018bqo)));
    }

    /* renamed from: com.netflix.mediaclient.service.user.UserAgentImpl$12  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass12 extends AbstractC5011bqh {
        final /* synthetic */ InterfaceC5018bqo d;

        AnonymousClass12(InterfaceC5018bqo interfaceC5018bqo) {
            this.d = interfaceC5018bqo;
        }

        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void a(final UpdateProductChoiceResponse updateProductChoiceResponse, final Status status) {
            if (this.d == null) {
                return;
            }
            Handler mainHandler = UserAgentImpl.this.getMainHandler();
            final InterfaceC5018bqo interfaceC5018bqo = this.d;
            mainHandler.post(new Runnable() { // from class: o.bqz
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC5018bqo.this.a(updateProductChoiceResponse, status);
                }
            });
        }
    }

    public void d(int i, String str, String str2, Boolean bool, InterfaceC5018bqo interfaceC5018bqo) {
        addDataRequest(this.s.b(new AnonymousClass12(interfaceC5018bqo), Integer.toString(i), str, "", str2, bool));
    }

    public void b(SignOutReason signOutReason) {
        e(signOutReason, false);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void e(SignOutReason signOutReason, boolean z) {
        C1044Mm.a("nf_service_useragent", "Force logout %b!", Boolean.valueOf(z));
        boolean e2 = AbstractApplicationC1040Mh.e();
        boolean j = InterfaceC4360bcz.e().j();
        a(signOutReason);
        if (!z && j) {
            C1044Mm.e("nf_service_useragent", "User playback is in progress, leave to PlayerActivity to redirect to logout page on end of playback!");
            return;
        }
        aMH.c().a(getContext());
        if (z || e2) {
            C1044Mm.a("nf_service_useragent", "forceLogoutUser:: Application is currently in foreground %b, - go to logout always %b", Boolean.valueOf(e2), Boolean.valueOf(z));
            aMH.c().d(getContext());
            return;
        }
        C1044Mm.e("nf_service_useragent", "forceLogoutUser:: UI is NOT visible, just kill all activities.");
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public boolean r() {
        InterfaceC5282bvn e2 = this.d.e();
        return e2 != null && e2.isMobileOnlyPlan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final SignOutReason signOutReason, final InterfaceC5018bqo interfaceC5018bqo, final Long l) {
        final boolean v = v();
        if (signOutReason != SignOutReason.shared) {
            C1044Mm.a("nf_service_useragent", "%s logoutUser: deleteSsoToken", getContext().getPackageName());
            this.p.b("logoutUser");
        }
        getMainHandler().post(new Runnable() { // from class: o.bqw
            @Override // java.lang.Runnable
            public final void run() {
                UserAgentImpl.this.W();
            }
        });
        C4984bqG.b.c(this.k);
        if (v) {
            Intent intent = new Intent("com.netflix.mediaclient.intent.action.PUSH_ONLOGOUT");
            intent.addCategory("com.netflix.mediaclient.intent.category.PUSH");
            if (this.f13230o.i() != null) {
                intent.putExtra("nid", this.f13230o.i());
            }
            if (this.f13230o.j() != null) {
                intent.putExtra("sid", this.f13230o.j());
            }
            intent.putExtra("device_cat", this.f.r().c());
            intent.putExtra("uid", g());
            LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent);
        }
        C8284dhV.a(V());
        this.f13230o.e();
        if (getAUIAgent() != null) {
            getAUIAgent().d();
        }
        y();
        this.f.c(f(), new C1831aPw() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.13
            @Override // o.C1831aPw, o.InterfaceC1813aPe
            public void d(ConfigData configData, Status status) {
                C1044Mm.e("nf_service_useragent", "logoutUser: onConfigDataFetched: ");
                if (v) {
                    UserAgentImpl.this.a(signOutReason, interfaceC5018bqo, l);
                    return;
                }
                if (UserAgentImpl.this.O().isValid()) {
                    UserAgentImpl.this.getMSLClient().d();
                    UserAgentImpl.this.f13230o.e();
                }
                UserAgentImpl.this.b(StatusCode.OK, interfaceC5018bqo, l);
            }
        });
        C5020bqq.a(this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W() {
        try {
            getLoggingAgent().k();
        } catch (Throwable th) {
            C1044Mm.b("nf_service_useragent", th, "Failed log reinit!", new Object[0]);
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void c(SignOutReason signOutReason, InterfaceC5018bqo interfaceC5018bqo) {
        C1044Mm.e("nf_service_useragent", "logoutUser: ");
        if (!isReady()) {
            C1044Mm.j("nf_service_useragent", "Can't log user out because agent has not been initialized!");
        } else if (signOutReason == SignOutReason.user) {
            C1044Mm.e("nf_service_useragent", "logoutUser:: user initiated, report to backend");
            getMSLClient().a(new C5003bqZ(e(signOutReason, interfaceC5018bqo)));
        } else {
            C1044Mm.a("nf_service_useragent", "logoutUser:: %s", signOutReason);
            e(signOutReason, interfaceC5018bqo, Logger.INSTANCE.startSession(new SignOut(signOutReason, null, null, null, null)));
        }
    }

    private C5003bqZ.b e(final SignOutReason signOutReason, final InterfaceC5018bqo interfaceC5018bqo) {
        return new C5003bqZ.b() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.15
            @Override // o.C5003bqZ.b
            public void c(String str) {
                C1044Mm.a("nf_service_useragent", "Logout was user initiated and it was successfully registered with backend, clear user data. Message: %s", str);
                UserAgentImpl.this.e(signOutReason, interfaceC5018bqo, (Long) null);
            }

            @Override // o.C5003bqZ.b
            public void b(String str, Status status) {
                C1044Mm.j("nf_service_useragent", "Logout was user initiated and it was NOT successfully registered with backend, clear user data...  reason: %s, status code: %s.");
                UserAgentImpl.this.e(signOutReason, interfaceC5018bqo, (Long) null);
            }
        };
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void a(final UserAgent.b bVar) {
        if (Config_FastProperty_NgpConfig.Companion.d()) {
            C1044Mm.a("nf_service_useragent", "performSharedLogoutCheck:: disabled");
            bVar.d(false);
            return;
        }
        K().readLogoutStore(new NgpStoreApi.e<NgpStoreApi.d>() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.11
            @Override // com.netflix.mediaclient.ngpstore.api.NgpStoreApi.e
            /* renamed from: c  reason: avoid collision after fix types in other method */
            public void d(NgpStoreApi.d dVar) {
                boolean z;
                if (C4991bqN.a(UserAgentImpl.this.getContext(), dVar)) {
                    z = true;
                } else {
                    C1044Mm.c("nf_service_useragent", "%s onNgpStoreReadDone logoutStore is null", UserAgentImpl.this.getContext().getPackageName());
                    z = false;
                }
                C4991bqN.a(UserAgentImpl.this.getMainHandler(), z, bVar);
            }

            @Override // com.netflix.mediaclient.ngpstore.api.NgpStoreApi.e
            /* renamed from: d  reason: avoid collision after fix types in other method */
            public boolean c(NgpStoreApi.d dVar) {
                return (dVar == null || UserAgentImpl.this.getContext().getPackageName().equals(dVar.b)) ? false : true;
            }
        });
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void B() {
        C1044Mm.a("nf_service_useragent", "requestSharedLogout");
        if (ah()) {
            C1044Mm.a("nf_service_useragent", "requestSharedLogout disabled");
        } else {
            c(SignOutReason.shared, (InterfaceC5018bqo) null);
        }
    }

    private boolean ah() {
        return Config_FastProperty_NgpConfig.Companion.d();
    }

    private boolean ag() {
        return Config_FastProperty_NgpConfig.Companion.c();
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public String d() {
        InterfaceC5283bvo interfaceC5283bvo = this.n;
        List<String> languagesList = interfaceC5283bvo != null ? interfaceC5283bvo.getLanguagesList() : null;
        if (languagesList == null || languagesList.size() < 1) {
            return C4984bqG.b.e(this.k).d();
        }
        C8313dhy c8313dhy = new C8313dhy(languagesList.get(0));
        C8313dhy e2 = C4984bqG.b.e(this.k);
        Object[] objArr = new Object[3];
        objArr[0] = c8313dhy.d();
        objArr[1] = e2.d();
        objArr[2] = e2.d(c8313dhy) ? c8313dhy.d() : e2.d();
        C1044Mm.a("nf_service_useragent", "nf_loc userPref:%s appLocaleRaw:%s - picking %s", objArr);
        return e2.d(c8313dhy) ? c8313dhy.d() : e2.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        Logger logger = Logger.INSTANCE;
        if (logger.existExclusiveSession("SignInWithAutoLoginToken")) {
            ExtLogger.INSTANCE.endExclusiveAction("SignInWithAutoLoginToken");
        } else if (logger.existExclusiveSession("SignIn")) {
            ExtLogger.INSTANCE.endExclusiveAction("SignIn");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Error error) {
        String a = C8169dfM.a(error);
        Logger logger = Logger.INSTANCE;
        if (logger.existExclusiveSession("SignInWithAutoLoginToken")) {
            ExtLogger.INSTANCE.failedExclusiveAction("SignInWithAutoLoginToken", a);
        } else if (logger.existExclusiveSession("SignIn")) {
            ExtLogger.INSTANCE.failedExclusiveAction("SignIn", a);
        }
    }

    public void a(final Status status, final InterfaceC5018bqo interfaceC5018bqo) {
        getMainHandler().post(new Runnable() { // from class: o.bqu
            @Override // java.lang.Runnable
            public final void run() {
                UserAgentImpl.c(InterfaceC5018bqo.this, status);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(InterfaceC5018bqo interfaceC5018bqo, Status status) {
        if (interfaceC5018bqo != null) {
            interfaceC5018bqo.c(status);
        }
    }

    private void L() {
        this.f.b();
        this.d.d();
        C8197dfo c8197dfo = new C8197dfo();
        c8197dfo.a("useragent_current_profile_id");
        c8197dfo.a("pref_ablanguagestrings");
        c8197dfo.a("nf_user_status_loggedin", false);
        c8197dfo.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SignOutReason signOutReason, InterfaceC5018bqo interfaceC5018bqo, Long l) {
        C1044Mm.e("nf_service_useragent", "Logout complete");
        C5020bqq.d(getContext(), this.d.c(), this.d.e() != null ? this.d.e().getUserGuid() : null);
        getMSLClient().d();
        this.f13230o.e();
        b(StatusCode.OK, interfaceC5018bqo, l);
        InterfaceC1593aHa.b("Logout complete");
        this.n = null;
        this.t = null;
        if (signOutReason != SignOutReason.shared) {
            C1044Mm.e("nf_service_useragent", "onLogout:: updating shared logout time.");
            C1826aPr.d(K(), this.k);
        } else {
            C1044Mm.e("nf_service_useragent", "onLogout:: not writing shared logout time");
        }
        L();
        aMH.c().a((InterfaceC5283bvo) null);
        PartnerReceiver.d(getContext(), false);
        aa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(StatusCode statusCode, final InterfaceC5018bqo interfaceC5018bqo, final Long l) {
        getMainHandler().post(new Runnable() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.14
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC5018bqo interfaceC5018bqo2 = interfaceC5018bqo;
                if (interfaceC5018bqo2 != null) {
                    interfaceC5018bqo2.b(new NetflixStatus(StatusCode.OK));
                    C1044Mm.e("nf_service_useragent", "Received deactivate complete and notified UI");
                    return;
                }
                C1044Mm.e("nf_service_useragent", "Received deactivate complete, but no callback. Background sign out!");
                Long l2 = l;
                if (l2 != null) {
                    Logger.INSTANCE.endSession(l2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(InterfaceC5283bvo interfaceC5283bvo) {
        return interfaceC5283bvo != null && C8168dfL.d(g(), interfaceC5283bvo.getProfileGuid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(InterfaceC5283bvo interfaceC5283bvo) {
        if (this.n.getProfileType().equals(interfaceC5283bvo.getProfileType())) {
            return;
        }
        C1044Mm.a("nf_service_useragent", "Current profile type changed - sending REFRESH_HOME intent");
        C5020bqq.d(getContext(), interfaceC5283bvo.getProfileGuid());
        LocalBroadcastManager.getInstance(getContext()).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO"));
        aMH.c().a(getContext());
        if (AbstractApplicationC1040Mh.e()) {
            C1044Mm.a("nf_service_useragent", "Application is currently in foreground - restarting profiles gate");
            InterfaceC5282bvn e2 = this.d.e();
            cNT a = cNT.a(getContext());
            Context context = getContext();
            Objects.requireNonNull(e2);
            a.e(context, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends AbstractC5011bqh {
        InterfaceC5018bqo c;

        private c(InterfaceC5018bqo interfaceC5018bqo) {
            this.c = interfaceC5018bqo;
        }

        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void e(AccountData accountData, Status status) {
            UserAgentImpl.this.b.e(accountData, status);
            this.c.a(status, accountData);
        }
    }

    public void c(String str, boolean z, String str2, Integer num, InterfaceC5018bqo interfaceC5018bqo) {
        C1044Mm.e("nf_service_useragent", "addWebUserProfile");
        this.d.b(str, z, str2, num, new c(interfaceC5018bqo));
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public boolean c(InterfaceC5283bvo interfaceC5283bvo) {
        boolean d = this.d.d(interfaceC5283bvo);
        if (d) {
            C5020bqq.c();
        }
        return d;
    }

    public void e(String str, String str2, Boolean bool, String str3, Integer num, String str4, List<String> list, Boolean bool2, Boolean bool3, InterfaceC5018bqo interfaceC5018bqo) {
        C1044Mm.e("nf_service_useragent", "editWebUserProfile");
        this.d.e(str, str2, bool, str3, num, str4, list, bool2, bool3, false, new c(interfaceC5018bqo));
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void a(String str, Integer num, Boolean bool, InterfaceC5018bqo interfaceC5018bqo) {
        this.d.e(str, null, bool, null, num, null, null, null, null, true, new c(interfaceC5018bqo));
    }

    public void b(String str, InterfaceC5018bqo interfaceC5018bqo) {
        C1044Mm.e("nf_service_useragent", "removeWebUserProfile");
        if (C8168dfL.g(str)) {
            C1044Mm.d("nf_service_useragent", "deleteUserProfile with invalid profileId");
            interfaceC5018bqo.a(InterfaceC1078Nw.aF, (AccountData) null);
            return;
        }
        this.d.a(str, new c(interfaceC5018bqo));
    }

    public void e(final String str, InterfaceC5284bvp interfaceC5284bvp, InterfaceC5018bqo interfaceC5018bqo) {
        C1044Mm.e("nf_service_useragent", "updateWebUserProfileSubtitlePrefs");
        this.d.a(str, interfaceC5284bvp, new c(interfaceC5018bqo) { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.16
            @Override // com.netflix.mediaclient.service.user.UserAgentImpl.c, o.AbstractC5011bqh, o.InterfaceC4986bqI
            public void e(AccountData accountData, Status status) {
                if (accountData != null && accountData.getUserProfiles() != null && status.j()) {
                    Iterator<InterfaceC5283bvo> it = accountData.getUserProfiles().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC5283bvo next = it.next();
                        if (str.equals(next.getProfileGuid())) {
                            C1044Mm.e("nf_service_useragent", "onUserProfilesUpdated updating UserAgent.mSubtitleSettings");
                            UserAgentImpl.this.t = next.getSubtitlePreference();
                            break;
                        }
                    }
                }
                super.e(accountData, status);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean R() {
        List<InterfaceC5283bvo> c2 = this.d.c();
        return (c2 == null || c2.isEmpty() || this.d.e() == null) ? false : true;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void a(SignOutReason signOutReason) {
        c(signOutReason, (InterfaceC5018bqo) null);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public String a() {
        InterfaceC5282bvn e2 = this.d.e();
        if (e2 == null) {
            C1044Mm.e("nf_service_useragent", "getGeoCountry is null");
            return null;
        }
        return e2.getCountryOfSignUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, ProfileActivatedSource profileActivatedSource) {
        List<InterfaceC5283bvo> c2 = this.d.c();
        if (c2 == null) {
            k("mListOfUserProfiles is null");
            return;
        }
        ad();
        if (getAUIAgent() != null) {
            getAUIAgent().d();
        }
        int i = 0;
        for (InterfaceC5283bvo interfaceC5283bvo : c2) {
            String profileGuid = interfaceC5283bvo.getProfileGuid();
            C1044Mm.a("nf_service_useragent", "profileActivated:: Profile activated %s vs profile %s", str, profileGuid);
            i++;
            if (!interfaceC5283bvo.isProfileGuidValid()) {
                InterfaceC1593aHa.b("Profile i=" + i + ", size=" + c2.size());
                try {
                    InterfaceC1593aHa.b(interfaceC5283bvo.toJsonObject().toString());
                } catch (JSONException e2) {
                    InterfaceC1598aHf.e("userProfile.toJsonObject()", e2);
                }
                InterfaceC1597aHe.e("UserProfile missing guid");
            } else if (profileGuid.equals(str)) {
                this.n = interfaceC5283bvo;
                aMH.c().a(this.n);
                C4985bqH.b.e(this.k, this.n, "profileActivated");
                InterfaceC5283bvo interfaceC5283bvo2 = this.n;
                if (interfaceC5283bvo2 != null && interfaceC5283bvo2.getSubtitlePreference() != null) {
                    C1044Mm.e("nf_service_useragent", "profileActivated:: Switch profile update subtitle settings");
                    this.t = j().getSubtitlePreference();
                }
                C1044Mm.e("nf_service_useragent", "profileActivated:: Switch profile set preferred languages...");
                b(this.n.getLanguages());
                if (profileActivatedSource == ProfileActivatedSource.restoreProfile) {
                    C1044Mm.e("nf_service_useragent", "profileActivated:: Reinit existing user on cold start, send check in.");
                    C5020bqq.a(getContext(), interfaceC5283bvo);
                } else {
                    C1044Mm.e("nf_service_useragent", "profileActivated:: Login or switch profile, notify others...");
                    b(interfaceC5283bvo);
                }
                if (this.n != null) {
                    e(false, (String) null, (String) null);
                }
                C1044Mm.a("nf_service_useragent", "profileActivated:: Switch profile completed, new current profile: %s", this.n);
                return;
            }
        }
        k("Activated ProfileId not found in list of user profiles: ");
    }

    private void k(String str) {
        this.n = null;
        this.t = null;
        C1044Mm.d("nf_service_useragent", str);
        if (getNetflixPlatform() != null) {
            C1044Mm.d("nf_service_useragent", str);
        }
    }

    private void b(InterfaceC5283bvo interfaceC5283bvo) {
        C5020bqq.a(getContext(), interfaceC5283bvo);
        af();
        InterfaceC1593aHa.b("Login complete");
        PartnerReceiver.d(getContext(), true);
    }

    private void af() {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.PUSH_ONLOGIN");
        intent.addCategory("com.netflix.mediaclient.intent.category.PUSH");
        LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent);
    }

    private void aa() {
        InterfaceC5283bvo interfaceC5283bvo = this.n;
        this.n = null;
        this.t = null;
        C5020bqq.b(getContext(), interfaceC5283bvo, this.d.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        C1044Mm.e("nf_service_useragent", "fetchProfileData");
        this.d.c(str, this.n, new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.17
            @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
            public void e(InterfaceC5283bvo interfaceC5283bvo, Status status) {
                boolean d = UserAgentImpl.this.d(interfaceC5283bvo);
                if (status.j() && d) {
                    if (!C8168dfL.d(UserAgentImpl.this.n.toString(), interfaceC5283bvo.toString())) {
                        if (!C8168dfL.d(UserAgentImpl.this.n.getLanguagesInCsv(), interfaceC5283bvo.getLanguagesInCsv())) {
                            C1044Mm.e("nf_service_useragent", "onProfileDataFetched language changed, changeUser ");
                            UserAgentImpl.this.b(interfaceC5283bvo.getLanguages());
                        }
                        UserAgentImpl.this.t = interfaceC5283bvo.getSubtitlePreference();
                        UserAgentImpl.this.n = interfaceC5283bvo;
                        C4985bqH.b.e(UserAgentImpl.this.k, UserAgentImpl.this.n, "fetchProfileData");
                        C8157dfA.e.j(UserAgentImpl.this.getContext());
                        return;
                    }
                    C1044Mm.e("nf_service_useragent", "onProfileDataFetched nothing changed ignore.. ");
                }
            }
        });
    }

    public void d(String str, String str2) {
        if (C8168dfL.h(str)) {
            C1044Mm.a("nf_service_useragent", "record ums impression msgType: %s, impressionType:%s", str, str2);
            addDataRequest(this.s.b(str, str2));
            return;
        }
        C1044Mm.e("nf_service_useragent", "msgName or impressionType is null - skip reporting");
    }

    public void G() {
        addDataRequest(this.s.c());
        C1044Mm.e("nf_service_useragent", "Opting in to WhatsApp notifications");
    }

    public void a(final InterfaceC5018bqo interfaceC5018bqo, String str) {
        C1044Mm.e("nf_service_useragent", "Resolving expanded url from simple URL pattern");
        addDataRequest(this.s.e(new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.20
            @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
            public void a(ResolveSimpleUrlPatternResponse resolveSimpleUrlPatternResponse, Status status) {
                InterfaceC5018bqo interfaceC5018bqo2 = interfaceC5018bqo;
                if (interfaceC5018bqo2 != null) {
                    interfaceC5018bqo2.a(resolveSimpleUrlPatternResponse, status);
                }
            }
        }, str));
    }

    public void f(String str) {
        if (C8168dfL.h(str)) {
            C1044Mm.c("nf_service_useragent", "sending umaAlertFeedback: %s", str);
            addDataRequest(this.s.d(str));
            return;
        }
        C1044Mm.a("nf_service_useragent", "umaAlertFeedback is empty - skip reporting");
    }

    public Single<Status> E() {
        return Single.create(new SingleOnSubscribe<Status>() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.18
            @Override // io.reactivex.SingleOnSubscribe
            public void subscribe(final SingleEmitter<Status> singleEmitter) {
                AbstractC5011bqh abstractC5011bqh = new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.18.4
                    @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
                    public void a(Status status) {
                        singleEmitter.onSuccess(status);
                    }
                };
                UserAgentImpl userAgentImpl = UserAgentImpl.this;
                userAgentImpl.addDataRequest(userAgentImpl.s.h(abstractC5011bqh));
            }
        }).subscribeOn(Schedulers.io());
    }

    public Observable<Status> F() {
        return Observable.create(new ObservableOnSubscribe<Status>() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.24
            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(final ObservableEmitter<Status> observableEmitter) {
                AbstractC5011bqh abstractC5011bqh = new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.24.4
                    @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
                    public void c(Status status) {
                        observableEmitter.onNext(status);
                    }
                };
                UserAgentImpl userAgentImpl = UserAgentImpl.this;
                userAgentImpl.addDataRequest(userAgentImpl.s.i(abstractC5011bqh));
            }
        }).subscribeOn(Schedulers.io());
    }

    public void e(boolean z, String str, String str2) {
        UmaAlert A = A();
        if (z || A == null || A.isStale() || A.isConsumed()) {
            if (str2 == null && j() != null) {
                C1044Mm.e("nf_service_useragent", "UMA refreshing from DGS...");
                this.i.a(getContext(), j(), new drM() { // from class: o.bqr
                    @Override // o.drM
                    public final Object invoke(Object obj) {
                        dpR b;
                        b = UserAgentImpl.this.b((bXD.b) obj);
                        return b;
                    }
                });
                return;
            }
            C1044Mm.e("nf_service_useragent", "UMA refreshing from server...");
            addDataRequest(this.s.b(getContext(), this, str, P(), str2));
            return;
        }
        C1044Mm.e("nf_service_useragent", "Current UMA is not stale or consumed, skipping server refresh.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR b(bXD.b bVar) {
        if (bVar == bXD.b.d.a) {
            LocalBroadcastManager.getInstance(getContext()).sendBroadcast(new Intent("RefreshUserMessageRequest.ACTION_UMA_MESSAGE_UPDATED"));
            return dpR.c;
        }
        if (bVar instanceof bXD.b.a) {
            a(((bXD.b.a) bVar).c());
            LocalBroadcastManager.getInstance(getContext()).sendBroadcast(new Intent("RefreshUserMessageRequest.ACTION_UMA_MESSAGE_UPDATED"));
        }
        return dpR.c;
    }

    public UmaAlert z() {
        if (!I() && j() != null && A() != null) {
            UmaAlert A = A();
            if (!j().isKidsProfile() || (j().isKidsProfile() && A.isKidsEligible())) {
                return A;
            }
        }
        return null;
    }

    public void C() {
        UmaAlert z = z();
        if (z != null) {
            z.setConsumed(true);
            LocalBroadcastManager.getInstance(getContext()).sendBroadcast(new Intent("RefreshUserMessageRequest.ACTION_UMA_MESSAGE_CONSUMED"));
        }
    }

    public void h(final InterfaceC5018bqo interfaceC5018bqo) {
        C1044Mm.e("nf_service_useragent", "fetchAvailableAvatarsList");
        addDataRequest(this.s.b(new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.23
            @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
            public void d(List<AvatarInfo> list, Status status) {
                InterfaceC5018bqo interfaceC5018bqo2 = interfaceC5018bqo;
                if (interfaceC5018bqo2 != null) {
                    interfaceC5018bqo2.d(list, status);
                }
            }
        }));
    }

    public void f(final InterfaceC5018bqo interfaceC5018bqo) {
        C1044Mm.e("nf_service_useragent", "getProductChoices");
        addDataRequest(this.s.e(new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.21
            @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
            public void a(MembershipChoicesResponse membershipChoicesResponse, Status status) {
                InterfaceC5018bqo interfaceC5018bqo2 = interfaceC5018bqo;
                if (interfaceC5018bqo2 != null) {
                    interfaceC5018bqo2.d(membershipChoicesResponse, status);
                }
            }
        }));
    }

    public void c(final InterfaceC5018bqo interfaceC5018bqo, String str) {
        C1044Mm.e("nf_service_useragent", "getProductChoices");
        addDataRequest(this.s.d(new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.22
            @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
            public void a(UpdateProductChoiceResponse updateProductChoiceResponse, Status status) {
                InterfaceC5018bqo interfaceC5018bqo2 = interfaceC5018bqo;
                if (interfaceC5018bqo2 != null) {
                    interfaceC5018bqo2.a(updateProductChoiceResponse, status);
                }
            }
        }, str));
    }

    public void e(final InterfaceC5018bqo interfaceC5018bqo, String str, String str2, String str3, String str4, Boolean bool) {
        C1044Mm.e("nf_service_useragent", "getProductChoices");
        addDataRequest(this.s.b(new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.27
            @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
            public void a(UpdateProductChoiceResponse updateProductChoiceResponse, Status status) {
                InterfaceC5018bqo interfaceC5018bqo2 = interfaceC5018bqo;
                if (interfaceC5018bqo2 != null) {
                    interfaceC5018bqo2.a(updateProductChoiceResponse, status);
                }
            }
        }, str, str2, str3, str4, bool));
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public InterfaceC5284bvp k() {
        return this.d.a();
    }

    /* loaded from: classes4.dex */
    public final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_ENDED".equals(action)) {
                if (UserAgentImpl.this.g() != null) {
                    C1044Mm.a("nf_service_useragent", "Starting userProfile fetch ");
                    UserAgentImpl userAgentImpl = UserAgentImpl.this;
                    userAgentImpl.h(userAgentImpl.g());
                    return;
                }
                C1044Mm.a("nf_service_useragent", "canDoDataFetches false - skipping fetchProfileData request");
            } else if ("com.netflix.mediaclient.intent.action.DELETED_PROFILE".equals(action)) {
                UserAgentImpl.this.n = null;
                UserAgentImpl.this.c(context, StatusCode.DELETED_PROFILE);
            } else if ("com.netflix.mediaclient.intent.action.HOME_TTR_DONE".equals(action)) {
                UserAgentImpl.this.Z();
            }
        }
    }

    void c(Context context, StatusCode statusCode) {
        C1044Mm.e("nf_service_useragent", "onAccountErrors statusCode: " + statusCode);
        if (StatusCode.DELETED_PROFILE.equals(statusCode)) {
            if (!N()) {
                c(SignOutReason.profileDeletedSwitchToMainProfileFailed, (InterfaceC5018bqo) null);
            } else {
                C5020bqq.e();
            }
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public InterfaceC5283bvo m() {
        List<? extends InterfaceC5283bvo> b = b();
        if (b == null) {
            return null;
        }
        for (InterfaceC5283bvo interfaceC5283bvo : b) {
            if (interfaceC5283bvo != null && interfaceC5283bvo.isPrimaryProfile()) {
                return interfaceC5283bvo;
            }
        }
        return null;
    }

    private boolean N() {
        C1044Mm.e("nf_service_useragent", "fallbackToPrimaryAccount");
        InterfaceC5283bvo m = m();
        if (m == null) {
            return false;
        }
        c(m.getProfileGuid(), (Long) null);
        return true;
    }

    private void ab() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.netflix.mediaclient.intent.action.DELETED_PROFILE");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_ENDED");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.HOME_TTR_DONE");
        LocalBroadcastManager.getInstance(getContext()).registerReceiver(this.w, intentFilter);
    }

    private void ae() {
        try {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.w);
        } catch (Exception e2) {
            C1044Mm.a("nf_service_useragent", "unregisterUserAgentEventReceiver " + e2);
        }
    }

    private boolean n(String str) {
        String Y = this.f.Y();
        C1044Mm.c("nf_service_useragent", "userEnteredPinMatchesStoredPin usrPin=%s", Y);
        return C8168dfL.g(Y) || str.equals(Y);
    }

    /* renamed from: com.netflix.mediaclient.service.user.UserAgentImpl$30  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass30 extends AbstractC5011bqh {
        final /* synthetic */ InterfaceC5018bqo d;

        AnonymousClass30(InterfaceC5018bqo interfaceC5018bqo) {
            this.d = interfaceC5018bqo;
        }

        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void b(final boolean z, final Status status) {
            if (this.d == null) {
                return;
            }
            Handler mainHandler = UserAgentImpl.this.getMainHandler();
            final InterfaceC5018bqo interfaceC5018bqo = this.d;
            mainHandler.post(new Runnable() { // from class: o.bqx
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC5018bqo.this.a(z, status);
                }
            });
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void b(String str, UserAgent.PinType pinType, String str2, InterfaceC5018bqo interfaceC5018bqo) {
        AnonymousClass30 anonymousClass30 = new AnonymousClass30(interfaceC5018bqo);
        if (n(str)) {
            anonymousClass30.b(true, (Status) InterfaceC1078Nw.aJ);
        } else if (ConnectivityUtils.l(getContext())) {
            addDataRequest(this.s.a(str, pinType, str2, anonymousClass30));
        } else {
            anonymousClass30.b(n(str), InterfaceC1078Nw.aJ);
        }
    }

    /* renamed from: com.netflix.mediaclient.service.user.UserAgentImpl$26  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass26 extends AbstractC5011bqh {
        final /* synthetic */ InterfaceC5018bqo b;

        AnonymousClass26(InterfaceC5018bqo interfaceC5018bqo) {
            this.b = interfaceC5018bqo;
        }

        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void c(final AccountData accountData, final Status status) {
            if (this.b == null) {
                return;
            }
            Handler mainHandler = UserAgentImpl.this.getMainHandler();
            final InterfaceC5018bqo interfaceC5018bqo = this.b;
            mainHandler.post(new Runnable() { // from class: o.bqE
                @Override // java.lang.Runnable
                public final void run() {
                    UserAgentImpl.AnonymousClass26.a(AccountData.this, interfaceC5018bqo, status);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(AccountData accountData, InterfaceC5018bqo interfaceC5018bqo, Status status) {
            interfaceC5018bqo.a((accountData == null || accountData.getUserAccount() == null || !accountData.getUserAccount().isAgeVerified()) ? false : true, status);
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void j(InterfaceC5018bqo interfaceC5018bqo) {
        this.d.d(new AnonymousClass26(interfaceC5018bqo), false);
    }

    /* renamed from: com.netflix.mediaclient.service.user.UserAgentImpl$28  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass28 extends AbstractC5011bqh {
        final /* synthetic */ InterfaceC5018bqo e;

        AnonymousClass28(InterfaceC5018bqo interfaceC5018bqo) {
            this.e = interfaceC5018bqo;
        }

        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void e(final Survey survey, final Status status) {
            if (this.e == null) {
                return;
            }
            Handler mainHandler = UserAgentImpl.this.getMainHandler();
            final InterfaceC5018bqo interfaceC5018bqo = this.e;
            mainHandler.post(new Runnable() { // from class: o.bqF
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC5018bqo.this.a(survey, status);
                }
            });
        }
    }

    public void i(InterfaceC5018bqo interfaceC5018bqo) {
        addDataRequest(this.s.a(new AnonymousClass28(interfaceC5018bqo)));
    }

    public void H() {
        addDataRequest(this.s.d());
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void e(String str, final InterfaceC5018bqo interfaceC5018bqo) {
        if (this.l.get()) {
            C1044Mm.e("nf_service_useragent", "Autologin already started");
            return;
        }
        synchronized (this.l) {
            if (this.l.get()) {
                C1044Mm.e("nf_service_useragent", "Autologin already started");
                return;
            }
            this.l.set(true);
            final Long startSession = Logger.INSTANCE.startSession(new SignInWithAutoLoginToken(null, null, null, null));
            addDataRequest(this.s.a(str, new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.29
                @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
                public void d(C1569aGd c1569aGd, Status status) {
                    if (status.j() && c1569aGd != null) {
                        C1044Mm.e("nf_service_useragent", "Autologin success, go token activate");
                        c1569aGd.c = true;
                        UserAgentImpl.this.c(c1569aGd, new C5015bql() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.29.4
                            @Override // o.C5015bql, o.InterfaceC5018bqo
                            public void c(Status status2) {
                                if (status2.j()) {
                                    UserAgentImpl.this.U();
                                    interfaceC5018bqo.c(InterfaceC1078Nw.aJ);
                                    return;
                                }
                                UserAgentImpl.this.d(C8169dfM.e(status2));
                                interfaceC5018bqo.c(InterfaceC1078Nw.aI);
                            }
                        });
                    } else {
                        UserAgentImpl.this.d(C8169dfM.e(status));
                        interfaceC5018bqo.c(InterfaceC1078Nw.aI);
                        ExtLogger.INSTANCE.failedAction(startSession, C8169dfM.d(status));
                    }
                    UserAgentImpl.this.l.set(false);
                }
            }));
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void d(String str) {
        if (!Config_FastProperty_AutoLogin.Companion.a()) {
            C1044Mm.j("nf_service_useragent", "Autologin is NOT enabled");
        } else if (this.l.get()) {
            C1044Mm.e("nf_service_useragent", "Autologin already started");
        } else {
            synchronized (this.l) {
                if (this.l.get()) {
                    C1044Mm.e("nf_service_useragent", "Autologin already started");
                    return;
                }
                getMainHandler().post(new Runnable() { // from class: o.bqt
                    @Override // java.lang.Runnable
                    public final void run() {
                        UserAgentImpl.this.X();
                    }
                });
                if (C8168dfL.g(str)) {
                    C1044Mm.d("nf_service_useragent", "Token not found, autologin is not possible");
                } else if (this.d.e() != null) {
                    C1044Mm.d("nf_service_useragent", "User is already logged in, autologin is NOT possible!");
                } else {
                    C1044Mm.e("nf_service_useragent", "Execute autologin with token: " + str);
                    this.l.set(true);
                    addDataRequest(this.s.a(str, new AnonymousClass34(Logger.INSTANCE.startSession(new SignInWithAutoLoginToken(null, null, null, null)))));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X() {
        getServiceNotificationHelper().d(30, true);
    }

    /* renamed from: com.netflix.mediaclient.service.user.UserAgentImpl$34  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass34 extends AbstractC5011bqh {
        final /* synthetic */ Long e;

        AnonymousClass34(Long l) {
            this.e = l;
        }

        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void d(C1569aGd c1569aGd, Status status) {
            if (status.j() && c1569aGd != null) {
                C1044Mm.e("nf_service_useragent", "Autologin success, go token activate");
                c1569aGd.c = true;
                UserAgentImpl.this.c(c1569aGd, new C5015bql() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.34.3
                    @Override // o.C5015bql, o.InterfaceC5018bqo
                    public void c(Status status2) {
                        if (status2.j()) {
                            UserAgentImpl.this.U();
                        } else {
                            UserAgentImpl.this.d(C8169dfM.e(status2));
                        }
                    }
                });
            } else {
                ExtLogger.INSTANCE.failedAction(this.e, C8169dfM.d(status));
            }
            UserAgentImpl.this.l.set(false);
            UserAgentImpl.this.getMainHandler().post(new Runnable() { // from class: o.bqD
                @Override // java.lang.Runnable
                public final void run() {
                    UserAgentImpl.AnonymousClass34.this.c();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            UserAgentImpl.this.getServiceNotificationHelper().d(30, true);
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public String n() {
        C1044Mm.a("nf_service_useragent", "getPrimaryProfileGuid");
        List<? extends InterfaceC5283bvo> b = b();
        if (b != null) {
            for (InterfaceC5283bvo interfaceC5283bvo : b) {
                if (interfaceC5283bvo.isPrimaryProfile()) {
                    Object[] objArr = new Object[2];
                    objArr[0] = C8168dfL.h(interfaceC5283bvo.getProfileName()) ? interfaceC5283bvo.getProfileName() : "";
                    objArr[1] = interfaceC5283bvo.getProfileGuid();
                    C1044Mm.a("nf_service_useragent", "primaryProfileName: %s, %s ", objArr);
                    return interfaceC5283bvo.getProfileGuid();
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public boolean q() {
        InterfaceC5282bvn e2 = this.d.e();
        if (e2 != null) {
            return e2.isAgeVerified();
        }
        return false;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void y() {
        this.a.b();
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public String o() {
        return this.a.d();
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void j(String str) {
        this.a.e(str);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void c(long j, InterfaceC5018bqo interfaceC5018bqo) {
        if (interfaceC5018bqo == null) {
            throw new IllegalStateException("Callback can not be null!");
        }
        if (v()) {
            C1044Mm.e("nf_service_useragent", "Create auto login token");
            addDataRequest(this.s.a(j, new AnonymousClass31(interfaceC5018bqo)));
            return;
        }
        C1044Mm.j("nf_service_useragent", "User is not logged in, this call can not be completed successfully!");
        interfaceC5018bqo.b(null, InterfaceC1078Nw.aN);
    }

    /* renamed from: com.netflix.mediaclient.service.user.UserAgentImpl$31  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass31 extends AbstractC5011bqh {
        final /* synthetic */ InterfaceC5018bqo d;

        AnonymousClass31(InterfaceC5018bqo interfaceC5018bqo) {
            this.d = interfaceC5018bqo;
        }

        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void b(final String str, final Status status) {
            Handler mainHandler = UserAgentImpl.this.getMainHandler();
            final InterfaceC5018bqo interfaceC5018bqo = this.d;
            mainHandler.post(new Runnable() { // from class: o.bqB
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC5018bqo.this.b(str, status);
                }
            });
        }
    }

    /* renamed from: com.netflix.mediaclient.service.user.UserAgentImpl$33  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass33 extends AbstractC5011bqh {
        final /* synthetic */ InterfaceC5018bqo c;

        AnonymousClass33(InterfaceC5018bqo interfaceC5018bqo) {
            this.c = interfaceC5018bqo;
        }

        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void b(final String str, final Status status) {
            Handler mainHandler = UserAgentImpl.this.getMainHandler();
            final InterfaceC5018bqo interfaceC5018bqo = this.c;
            mainHandler.post(new Runnable() { // from class: o.bqC
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC5018bqo.this.b(str, status);
                }
            });
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void c(List<String> list, InterfaceC5018bqo interfaceC5018bqo) {
        addDataRequest(this.s.d(list, new AnonymousClass33(interfaceC5018bqo)));
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void e(final InterfaceC5018bqo interfaceC5018bqo) {
        InterfaceC5283bvo j = j();
        Objects.requireNonNull(j, "Current profile is null");
        final String profileGuid = j.getProfileGuid();
        addDataRequest(this.s.e(profileGuid, new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.32
            @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
            public void b(AuthCookieHolder authCookieHolder, Status status) {
                if (status.j() && authCookieHolder != null) {
                    if (!Objects.equals(authCookieHolder.userId, profileGuid)) {
                        C1044Mm.e("nf_service_useragent", "User id mismatch: %s, %s", authCookieHolder.userId, profileGuid);
                        InterfaceC5018bqo interfaceC5018bqo2 = interfaceC5018bqo;
                        if (!status.i()) {
                            status = InterfaceC1078Nw.ae;
                        }
                        interfaceC5018bqo2.e(status);
                        return;
                    }
                    C1044Mm.a("nf_service_useragent", "User credentials found: %s ", authCookieHolder);
                    UserAgentImpl.this.f13230o.c(authCookieHolder);
                    Logger logger = Logger.INSTANCE;
                    logger.startSession(new NetflixId(authCookieHolder.netflixId));
                    logger.startSession(new ProfileGuid(profileGuid));
                    interfaceC5018bqo.e(status);
                    return;
                }
                InterfaceC5018bqo interfaceC5018bqo3 = interfaceC5018bqo;
                if (!status.i()) {
                    status = InterfaceC1078Nw.ad;
                }
                interfaceC5018bqo3.e(status);
            }
        }));
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void d(boolean z, UserAgent.c cVar) {
        C1071Np c1071Np = new C1071Np();
        final RunnableC4949bpY runnableC4949bpY = new RunnableC4949bpY(this, getMSLClient(), this.s, z, cVar);
        c1071Np.d(new C1079Nx.b() { // from class: o.bqv
            @Override // o.C1079Nx.b
            public final void run() {
                RunnableC4949bpY.this.run();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UserCookies O() {
        return C8284dhV.e(V());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean V() {
        return C1815aPg.d(this.k).a();
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        return this.q.b();
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_USER;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_USER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<InterfaceC5283bvo> list, String str) {
        if (list == null) {
            C1044Mm.d("nf_service_useragent", "new userProfiles data is null");
        } else if (!v()) {
            C1044Mm.j("nf_service_useragent", "Received profile change event and user is not signed in, ignore...");
        } else {
            InterfaceC5283bvo e2 = e(list, this.f13230o.d());
            if (e2 != null) {
                d(e2, str);
            } else {
                Q();
            }
        }
    }

    private void d(InterfaceC5283bvo interfaceC5283bvo, String str) {
        C1044Mm.e("nf_service_useragent", "Current profile found, refresh...");
        this.n = interfaceC5283bvo;
        C4985bqH.b.e(this.k, interfaceC5283bvo, "handleCurrentProfileChanged");
        if (interfaceC5283bvo.getProfileGuid().equals(str)) {
            C1044Mm.e("nf_service_useragent", "Current profile is updated, alert UI so it can refresh itself.");
            C5020bqq.d(getContext(), interfaceC5283bvo.getProfileGuid());
            LocalBroadcastManager.getInstance(getContext()).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO"));
        }
    }

    private void Q() {
        C1044Mm.j("nf_service_useragent", "Current profile is deleted from account: %s, fallback to main account profile...", this.n);
        InterfaceC5282bvn e2 = this.d.e();
        String userGuid = e2 == null ? null : e2.getUserGuid();
        InterfaceC5283bvo a = this.d.a(userGuid);
        if (a != null) {
            C1044Mm.a("nf_service_useragent", "Switch to primary profile as for login: %s", e2.getUserGuid());
            this.n = a;
        } else {
            C1044Mm.e("nf_service_useragent", "Cannot find user profile for primary profile of account: %s", e2.getUserGuid());
            InterfaceC1598aHf.a(new C1596aHd("handleCurrentProfileDeleted:: Cannot find primary profile for account").b(false).e(Payload.PARAM_GUID, userGuid));
        }
        this.f13230o.c(userGuid);
        C1044Mm.a("nf_service_useragent", "After:: MSLUserCredentialRegistry getUserId: %s ", this.f13230o.d());
        c(this.f13230o.d(), ProfileActivatedSource.currentProfileDeleted);
        C1044Mm.e("nf_service_useragent", "Display profile gate, so user can select profile they want");
        if (AbstractApplicationC1040Mh.e()) {
            C1044Mm.a("nf_service_useragent", "Application is currently in foreground - restarting profiles gate");
            cNT a2 = cNT.a(getContext());
            Context context = getContext();
            Objects.requireNonNull(e2);
            a2.c(context, e2);
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgent
    public void a(final String str) {
        if (!v()) {
            C1044Mm.j("nf_service_useragent", "Received profile change event and user is not signed in, ignore...");
            return;
        }
        this.d.e(new AbstractC5011bqh() { // from class: com.netflix.mediaclient.service.user.UserAgentImpl.39
            @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
            public void c(AccountData accountData, Status status) {
                if (status.j()) {
                    C1044Mm.a("nf_service_useragent", "Account data fetched for on profile change event: %s", accountData);
                    UserAgentImpl.this.b(accountData.getUserProfiles(), str);
                    C1044Mm.e("nf_service_useragent", "Profile list refreshed on profile change event");
                    C5020bqq.c();
                    return;
                }
                C1044Mm.d("nf_service_useragent", "Profile list refreshed failed on profile change event.");
                InterfaceC1598aHf.a("Profile list refreshed failed on profile change event.");
            }
        }, P());
    }

    private static void T() {
        String a = C8284dhV.a();
        if (C8168dfL.h(a)) {
            Logger.INSTANCE.startSession(new VisitorDeviceId(a));
        }
    }
}
