package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.SystemClock;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.JSONObject;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.repository.SecureStoreProvider;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.error.crypto.ErrorSource;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.msl.MslServiceState;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.volley.StatusCodeError;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.net.AuthCookieHolder;
import com.netflix.msl.EsnMigrationFailedNoNetworkException;
import com.netflix.msl.MslErrorException;
import com.netflix.msl.MslException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import o.C1079Nx;
import o.InterfaceC5129bst;

/* loaded from: classes.dex */
public class aYD extends aMF implements InterfaceC5129bst, InterfaceC5170bth {
    private int a;
    private aYS b;
    private InterfaceC5129bst.a c;
    private BroadcastReceiver f;
    private final InterfaceC1692aKs h;
    private final CryptoErrorManager i;
    private final aHJ j;
    private long n;
    private String l = null;
    private final InterfaceC8286dhX d = j();
    private final aYH g = new aYH();
    private final C1079Nx.b e = new C1079Nx.b() { // from class: o.aYI
        @Override // o.C1079Nx.b
        public final void run() {
            aYD.this.m();
        }
    };

    private void r() {
    }

    @Override // o.aMF
    public String agentName() {
        return "msl";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        try {
            d(false);
        } catch (Throwable th) {
            C1044Mm.b("nf_msl_agent", th, "Failed to execute AppBoot asynchronously. Already reported.", new Object[0]);
        }
    }

    public aYD(aHJ ahj, CryptoErrorManager cryptoErrorManager, InterfaceC1692aKs interfaceC1692aKs) {
        this.j = ahj;
        this.i = cryptoErrorManager;
        this.h = interfaceC1692aKs;
        interfaceC1692aKs.a(this, getMainHandler());
        C1332Xp.d(InterfaceC5132bsw.class, new C2098aZu(this), true);
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.MSL_AGENT_LOADED;
    }

    @Override // o.aMF
    public void doInit() {
        C1044Mm.e("nf_msl_agent", "MSLAgent::doInit start ");
        String a = aYN.a(getContext());
        this.l = a;
        C1044Mm.a("nf_msl_agent", "SSL trust store hash: %s", a);
        Status i = i();
        if (i.i()) {
            C1044Mm.e("nf_msl_agent", "MSLAgent::doInit internalInit error done");
            this.g.b(MslServiceState.f);
            initCompleted(i);
            return;
        }
        Status h = h();
        C1044Mm.e("nf_msl_agent", "MSLAgent::doInit regular workflow done");
        this.g.b(MslServiceState.h);
        initCompleted(h);
        o();
        e(h);
    }

    private void o() {
        aOV configurationAgent = getConfigurationAgent();
        Objects.requireNonNull(configurationAgent);
        InterfaceC1843aQh w = configurationAgent.w();
        if (!(w instanceof C1844aQi)) {
            C1044Mm.e("nf_msl_agent", "Not WEA, no need to get proxy ESN.");
            return;
        }
        C1844aQi c1844aQi = (C1844aQi) w;
        if (c1844aQi.a(this.b.d())) {
            a(new aZJ(c1844aQi.r()));
        }
    }

    private void e(Status status) {
        if (status.j()) {
            C1044Mm.e("nf_msl_agent", "MSL Agent is successfully initiated, send any MSL request that was added before.");
            getNetflixPlatform().e();
        }
    }

    private Status i() {
        r();
        try {
            this.g.b(MslServiceState.d);
            aOV configurationAgent = getConfigurationAgent();
            Objects.requireNonNull(configurationAgent);
            aOV aov = configurationAgent;
            UserAgent userAgent = getUserAgent();
            Objects.requireNonNull(userAgent);
            UserAgent userAgent2 = userAgent;
            SecureStoreProvider.INSTANCE.c(configurationAgent.w());
            this.b = aYL.e(getContext(), configurationAgent, userAgent, this.j, getErrorHandler(), this.g);
            return InterfaceC1078Nw.aJ;
        } catch (EsnMigrationFailedNoNetworkException e) {
            C1044Mm.b("nf_msl_agent", e, "MSLAgent::doInit failed on ESN migration fails because of no network connectivity!", new Object[0]);
            return InterfaceC1078Nw.v;
        } catch (Throwable th) {
            C1044Mm.b("nf_msl_agent", th, "MSLAgent::doInit failed!", new Object[0]);
            InterfaceC1598aHf.a(new C1596aHd("-1001: Failed to create MSL agent").b(ErrorType.p).b(false).d(th));
            return new NetflixStatus(StatusCode.MSL_FAILED_TO_CREATE_CLIENT, th);
        }
    }

    private Status h() {
        try {
            g();
        } catch (MslErrorException e) {
            C1044Mm.a("nf_msl_agent", e, "MSLAgent::doInit appboot failed!");
            Status g = g(e);
            if (g != null) {
                C1044Mm.e("nf_msl_agent", "MSLAgent::doInit failed.");
                return g;
            }
        } catch (Throwable th) {
            C1044Mm.b("nf_msl_agent", th, "MSLAgent::doInit failed!", new Object[0]);
            boolean j = this.b.j();
            InterfaceC1598aHf.a(new C1596aHd("AppBoot failure, isSynchronous: " + j).d(th).b(false));
            return InterfaceC1078Nw.av;
        }
        return InterfaceC1078Nw.aJ;
    }

    @Override // o.InterfaceC5129bst
    public Status d(MslErrorException mslErrorException) {
        return b(mslErrorException);
    }

    private Status b(MslErrorException mslErrorException) {
        C8416dku c = mslErrorException.c();
        if (C8185dfc.b(c)) {
            C1044Mm.e("nf_msl_agent", "Our device is one of black listed, we need to default to legacy crypto and offline is NOT supported!");
            return f();
        } else if (C8185dfc.a(c)) {
            C1044Mm.e("nf_msl_agent", "Our device sent all zeros in signature bad challenge, something is wrong with Widevine L1 plugin, report and fallback to L3");
            return c(mslErrorException);
        } else if (C8185dfc.c(c)) {
            C1044Mm.e("nf_msl_agent", "Our device sent bad challenge, something is wrong with Widevine plugin, report and start fallback workflow");
            return e(mslErrorException);
        } else if (C8185dfc.d(c)) {
            C1044Mm.e("nf_msl_agent", "Our device sent invalid key request, something is wrong with Widevine plugin, report and start fallback workflow");
            return a(mslErrorException);
        } else {
            return null;
        }
    }

    private Status g(MslErrorException mslErrorException) {
        if (C8185dfc.e(mslErrorException.c())) {
            C1044Mm.e("nf_msl_agent", "Famous retry request on  error code 207003");
            int i = this.a + 1;
            this.a = i;
            if (i > 5) {
                C1044Mm.e("nf_msl_agent", "Reached maximal number (%d) of retries %d in general", 5, Integer.valueOf(i));
                return InterfaceC1078Nw.ap;
            }
        }
        return b(mslErrorException);
    }

    private Status e(MslErrorException mslErrorException) {
        a("Bad challenge on appboot", mslErrorException);
        this.i.a(ErrorSource.msl, StatusCode.MSL_BAD_CHALLENGE, mslErrorException);
        return InterfaceC1078Nw.an;
    }

    private Status a(MslErrorException mslErrorException) {
        a("Invalid key request on appboot", mslErrorException);
        this.i.a(ErrorSource.msl, StatusCode.MSL_INVALID_KEY_REQUEST, mslErrorException);
        return InterfaceC1078Nw.aq;
    }

    private void a(String str, MslErrorException mslErrorException) {
        C1596aHd d = new C1596aHd(str).b(false).b(ErrorType.p).d(mslErrorException);
        if (mslErrorException != null && mslErrorException.c() != null) {
            d.e("errorCode", String.valueOf(mslErrorException.c().a()));
            if (mslErrorException.c().e() != null) {
                d.e("errorMessage", String.valueOf(mslErrorException.c().e()));
            }
        }
        InterfaceC1598aHf.a(d);
    }

    private Status c(MslErrorException mslErrorException) {
        this.i.a(ErrorSource.msl, StatusCode.WIDEVINE_L1_ALL_ZEROS_SIGNATURE_CHALLENGE, mslErrorException);
        return InterfaceC1078Nw.aO;
    }

    private Status f() {
        if (this.i.d(CryptoErrorManager.CryptoFailbackCause.BLACKLISTED, null) == CryptoErrorManager.CryptoFailback.widevineL3) {
            return InterfaceC1078Nw.aw;
        }
        InterfaceC1598aHf.a(new C1596aHd("MSL_BLACKLISTED_DEVICE").b(false));
        return InterfaceC1078Nw.as;
    }

    @Override // o.aMF
    public void destroy() {
        super.destroy();
        if (this.f != null) {
            C8116deM.a(getContext(), this.f);
        }
    }

    private void g() {
        if (this.b.j()) {
            C1044Mm.e("nf_msl_agent", "Execute AppBoot synchronously, first app launch...");
            this.g.b(MslServiceState.c);
            try {
                d(true);
                return;
            } catch (Throwable th) {
                InterfaceC1598aHf.e("Appboot failed synchronously", th);
                throw th;
            }
        }
        C1044Mm.e("nf_msl_agent", "Execute AppBoot asynchronously, regular app launch...");
        new C1071Np().d(this.e);
    }

    private void d(boolean z) {
        a((String) null, z);
    }

    private void a(String str, boolean z) {
        JSONObject d;
        C1044Mm.e("nf_msl_agent", "Regular appBoot request");
        JSONObject a = this.b.a((Long) null, this.l);
        C1044Mm.a("nf_msl_agent", "doExecuteAppBoot with request url: %s, request: %s ", str, a);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (C8168dfL.g(str)) {
                d = this.b.b(a, Collections.emptyList());
            } else {
                d = this.b.d(str, a, Collections.emptyList());
            }
            a(d, SystemClock.elapsedRealtime() - elapsedRealtime, z);
        } catch (Throwable th) {
            a(str, th, z);
            throw th;
        }
    }

    private void a(String str, Throwable th, boolean z) {
        if (!ConnectivityUtils.n(getContext())) {
            C1044Mm.j("nf_msl_agent", "Appboot failed because of missing Internet connection, do not report!");
            return;
        }
        if (str == null) {
            str = "default";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appBootUrl", str);
        aOV configurationAgent = getConfigurationAgent();
        Objects.requireNonNull(configurationAgent);
        if (configurationAgent.aF()) {
            hashMap.put("primaryKeyType", "ECC");
            hashMap.put("fallbackKeyType", AleCryptoBouncyCastle.RSA_KEY_ALG);
        } else {
            hashMap.put("primaryKeyType", AleCryptoBouncyCastle.RSA_KEY_ALG);
        }
        hashMap.put("failureToStartApp", String.valueOf(z));
        InterfaceC1598aHf.e(z ? "Appboot failed synchronously. App blocked." : "Appboot failed asynchronously. User not affected.", th, ErrorType.p, false, hashMap);
    }

    private void a(JSONObject jSONObject, long j, boolean z) {
        if (a(jSONObject, z)) {
            C1044Mm.j("nf_msl_agent", "Explicit retry on server response...");
        } else if (d(jSONObject, z)) {
            C1044Mm.j("nf_msl_agent", "Explicit retry on server response for action ID or some other error...");
        } else {
            c(jSONObject, j);
            a(jSONObject);
        }
    }

    private boolean a(JSONObject jSONObject, boolean z) {
        if (jSONObject.has("retry")) {
            int i = this.a + 1;
            this.a = i;
            if (i > 5) {
                C1044Mm.e("nf_msl_agent", "Reached maximal number (%d) of retries %d in general", 5, Integer.valueOf(i));
                return false;
            }
            int optInt = jSONObject.getJSONObject("retry").optInt("delay", -1) * 1000;
            if (z) {
                try {
                    d(true);
                } catch (Throwable th) {
                    InterfaceC1598aHf.e("Appboot failed on retry action", th);
                    throw th;
                }
            } else if (optInt > 0) {
                C1044Mm.a("nf_msl_agent", "Explicit retry in %d seconds", Integer.valueOf(optInt));
                getMainHandler().postDelayed(new Runnable() { // from class: o.aYG
                    @Override // java.lang.Runnable
                    public final void run() {
                        aYD.this.n();
                    }
                }, optInt);
            } else {
                C1044Mm.j("nf_msl_agent", "Delay is not found, retry now.");
                new C1071Np().d(this.e);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        new C1071Np().d(this.e);
    }

    private boolean d(JSONObject jSONObject, boolean z) {
        if (jSONObject.has(UmaAlert.ICON_ERROR)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(UmaAlert.ICON_ERROR);
            if (!e(jSONObject2, z)) {
                C1044Mm.j("nf_msl_agent", "handleError:: not handling error %s", jSONObject2);
                C1596aHd e = new C1596aHd("Unhandled error in appboot response").b(true).b(ErrorType.p).e(UmaAlert.ICON_ERROR, jSONObject2.toString());
                InterfaceC1597aHe.b(e.e("blockOnRetry", "" + z));
                if (z) {
                    C1044Mm.j("nf_msl_agent", "Appboot is executed blocking, report and raise an exception of unhandled error.");
                    throw new MslException(C8373dje.bd, String.format("Unhandled error in appboot response (%s)", jSONObject2));
                }
                C1044Mm.j("nf_msl_agent", "Appboot is NOT executed blocking, report and continue.");
                return false;
            }
            C1044Mm.j("nf_msl_agent", "Appboot needs to retried!");
            return true;
        }
        return false;
    }

    private boolean e(JSONObject jSONObject, boolean z) {
        if (jSONObject.has("actionid")) {
            int i = jSONObject.getInt("actionid");
            if (i != 2) {
                if (i != 7) {
                    if (i != 13) {
                        return false;
                    }
                    return c(jSONObject);
                }
                return c(jSONObject, z);
            }
            return c(z);
        }
        return false;
    }

    private boolean c(boolean z) {
        return b("action ID 2", z);
    }

    private boolean b(String str, boolean z) {
        C1044Mm.a("nf_msl_agent", "Handling %s, retry appboot...", str);
        int i = this.a + 1;
        this.a = i;
        if (i > 5) {
            C1044Mm.e("nf_msl_agent", "Reached maximal number (%d) of retries %d for %s", 5, Integer.valueOf(this.a), str);
            return false;
        } else if (!this.d.a()) {
            C1044Mm.e("nf_msl_agent", "Can not retry anymore using backoff policy on %s, attempt %d", Integer.valueOf(this.a), str);
            return false;
        } else {
            long d = this.d.d();
            C1044Mm.e("nf_msl_agent", "Retry # %d for %s (max %d) in %d ms", Integer.valueOf(this.a), 5, Long.valueOf(d), str);
            if (z) {
                try {
                    d(false);
                } catch (Throwable th) {
                    C1044Mm.b("nf_msl_agent", th, "Failed to execute AppBoot for %s on %d retry", Integer.valueOf(this.a), str);
                    return false;
                }
            } else {
                getMainHandler().postDelayed(new Runnable() { // from class: o.aYK
                    @Override // java.lang.Runnable
                    public final void run() {
                        aYD.this.l();
                    }
                }, d);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        new C1071Np().d(this.e);
    }

    private boolean c(JSONObject jSONObject, boolean z) {
        C1044Mm.e("nf_msl_agent", "Handling action ID 7, change appboot url and retry appboot...");
        if (!jSONObject.has("appbootendpoint")) {
            C1044Mm.d("nf_msl_agent", "New appboot server URL not found. Not expected!");
            return false;
        }
        String string = jSONObject.getString("appbootendpoint");
        if (!C8342dia.b(string)) {
            C1044Mm.e("nf_msl_agent", "New appboot server URL found, but is not proper web URL: %s. Not expected!", string);
            return false;
        }
        if (z) {
            try {
                a(string, true);
            } catch (Throwable th) {
                C1044Mm.b("nf_msl_agent", th, "Failed to re-execute AppBoot with new URL %son action id 7", string);
            }
        } else {
            getMainHandler().post(new Runnable() { // from class: o.aYJ
                @Override // java.lang.Runnable
                public final void run() {
                    aYD.this.k();
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        new C1071Np().d(this.e);
    }

    private boolean c(JSONObject jSONObject) {
        C1044Mm.e("nf_msl_agent", "handleActionId13");
        InterfaceC1903aSn a = aMH.c().a();
        Context context = getContext();
        UserAgent userAgent = getUserAgent();
        Objects.requireNonNull(userAgent);
        getErrorHandler().b(a.a(context, userAgent, jSONObject));
        C1044Mm.b("nf_msl_agent", "Error handler added for action ID 13.");
        return true;
    }

    private void c(JSONObject jSONObject, long j) {
        if (jSONObject.has("servertime_seconds")) {
            long j2 = jSONObject.getLong("servertime_seconds");
            this.n = j2;
            C8170dfN.a((j2 * 1000) + (j / 2));
            if (this.c != null) {
                C1044Mm.e("nf_msl_agent", "Updating server time to nrd.");
                this.c.e(this.n);
            }
        }
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject.has("ssltruststore")) {
            String string = jSONObject.getJSONObject("ssltruststore").getString(NotificationFactory.DATA);
            if (C8168dfL.h(string)) {
                this.l = aYC.a(string);
                aYN.b(getContext(), this.l);
                int length = string.length();
                C1044Mm.a("nf_msl_agent", "handleSslTrustStoreUpdate:: SSL trust store size: %d, hash: %s", Integer.valueOf(length), this.l);
            }
        }
    }

    @Override // o.InterfaceC5129bst
    public void d(String str, String str2) {
        this.b.c(str, str2);
    }

    @Override // o.InterfaceC5129bst
    public dkV e(String str, String str2) {
        dkU d = this.b.d(str);
        if (d == null) {
            C1044Mm.j("nf_msl_agent", " userIdToken for oldUserId %s is null, trying with some userIdToken as a recovery..", str);
            d = this.b.a();
            if (d == null) {
                C1044Mm.e("nf_msl_agent", "don't have any userIdTokens.. can't switch profile to %s", str2);
                return null;
            }
        }
        return new dkV(d, str2);
    }

    @Override // o.InterfaceC5129bst
    public void d() {
        aYS ays = this.b;
        if (ays != null) {
            ays.g();
        }
    }

    @Override // o.InterfaceC5129bst
    public C8378djj b() {
        aYS ays = this.b;
        if (ays == null) {
            return null;
        }
        return ays.f();
    }

    @Override // o.InterfaceC5129bst
    public boolean c(String str) {
        aYS ays = this.b;
        return (ays == null || str == null || ays.d(str) == null) ? false : true;
    }

    @Override // o.InterfaceC5129bst
    public C8379djk c() {
        UserAgent userAgent = getUserAgent();
        if (userAgent == null || this.b == null || userAgent.g() == null) {
            return null;
        }
        aYS ays = this.b;
        String g = userAgent.g();
        Objects.requireNonNull(g);
        return ays.b(g);
    }

    @Override // o.InterfaceC5129bst
    public AbstractC8399dkd e() {
        aYS ays = this.b;
        if (ays == null) {
            return null;
        }
        return ays.b();
    }

    @Override // o.InterfaceC4938bpN
    public boolean a(NetflixDataRequest netflixDataRequest) {
        return getResourceFetcher().a(netflixDataRequest);
    }

    @Override // o.InterfaceC5170bth
    public AuthCookieHolder e(String str) {
        if (str == null) {
            return null;
        }
        C1044Mm.e("nf_msl_agent", "getAuthorizationCredentials:: Using legacy code!");
        return this.b.e(str);
    }

    @Override // o.InterfaceC5170bth
    public void a(String str, AuthCookieHolder authCookieHolder) {
        this.b.a(str, authCookieHolder);
    }

    @Override // o.InterfaceC5129bst
    public void d(InterfaceC5089bsF interfaceC5089bsF) {
        aZE<?> aze = (aZE) interfaceC5089bsF;
        try {
            aze.a((InterfaceC8387djs) this.b);
            aze.e(getConfigurationAgent());
            aze.d(getUserAgent());
            aze.e(this);
            aze.a(getErrorHandler());
            aOV configurationAgent = getConfigurationAgent();
            Objects.requireNonNull(configurationAgent);
            aze.c(configurationAgent.t());
            c(aze);
        } catch (Throwable th) {
            C1044Mm.b("nf_msl_agent", th, "Failed to add request! This can happen only when ESN provider is null, ignore since app is not in working state. Error will be reported to an user by UI,", new Object[0]);
        }
    }

    private void c(aZE<?> aze) {
        if (b(aze)) {
            C1044Mm.a("nf_msl_agent", "Falkor MSL Request %s is using its own MSLUserCredentialRegistry ", aze.getClass().getSimpleName());
        } else if (aze.Z() == null) {
            UserAgent userAgent = getUserAgent();
            Objects.requireNonNull(userAgent);
            aze.c(userAgent.f());
        }
    }

    private boolean b(aZE<?> aze) {
        String K;
        if (!(aze instanceof AbstractC2100aZw) || (K = ((AbstractC2100aZw) aze).K()) == null) {
            return false;
        }
        C1044Mm.a("nf_msl_agent", "Falkor MSL request profile GUID override found %s", K);
        UserAgent userAgent = getUserAgent();
        Objects.requireNonNull(userAgent);
        InterfaceC5093bsJ e = userAgent.e(K);
        if (e == null) {
            C1044Mm.e("nf_msl_agent", "Falkor MSL request profile GUID override found %s, but userIdToken is NOT found!", K);
            aze.a_(new StatusCodeError(StatusCode.MSL_USER_ID_TOKEN_NOT_FOUND));
            return false;
        }
        aze.c(e);
        return true;
    }

    private static C8287dhY j() {
        return new C8287dhY(1000, 0.5d, 2.0d, 60000, 900000);
    }

    public boolean a(String str) {
        return this.b.c(str);
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        return this.g.e().c();
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_MSL;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_MSL;
    }

    @Override // o.InterfaceC5129bst
    public C8382djn a() {
        aYS ays = this.b;
        if (ays == null) {
            return null;
        }
        return ays.e();
    }
}
