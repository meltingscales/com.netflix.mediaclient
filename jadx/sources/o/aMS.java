package o;

import android.content.Context;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.webclient.AUIApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.model.leafs.AUIContextData;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballCallData;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes.dex */
public final class aMS extends aMF implements aMU {
    private aMO f;
    private final Context g;
    private aMM h;
    private int i;
    private final C1812aPd j;
    private aML k;
    private Status n;
    public static final b b = new b(null);
    public static final int d = 8;
    private static final String e = "nf_moneyball_agent";
    private static final String c = "requestContext";
    private static final String a = "userContext";

    private final void h() {
    }

    @Override // o.aMF
    public String agentName() {
        return "moneyball";
    }

    @Override // o.aMU
    public AUIApiEndpointRegistry b() {
        return this.h;
    }

    @Override // o.aMU
    public ApiEndpointRegistry e() {
        return this.h;
    }

    public aMS(Context context, C1812aPd c1812aPd) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c1812aPd, "");
        this.g = context;
        this.j = c1812aPd;
        this.i = -1;
        this.f = new aMO();
        int c2 = C8055ddE.c(context);
        this.i = c2;
        C1044Mm.c(e, "Current app version code=%d", Integer.valueOf(c2));
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.MONEYBALL_AGENT_LOADED;
    }

    @Override // o.aMF
    public void doInit() {
        this.k = new aML(getContext(), this, this.j);
        h();
        this.h = new aMM(this.g, getUserAgent(), this, getOfflineAgent(), this.j);
        initCompleted(InterfaceC1078Nw.aJ);
    }

    @Override // o.aMU
    public String a() {
        return this.f.c();
    }

    @Override // o.aMU
    public void d() {
        this.f.a();
    }

    @Override // o.aMU
    public C1817aPi g() {
        C1817aPi q = this.j.q();
        C8632dsu.a(q, "");
        return q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(MoneyballData moneyballData) {
        AUIContextData contextData;
        Map<String, ?> userInfo;
        Object obj;
        String obj2 = (moneyballData == null || (contextData = moneyballData.getContextData()) == null || (userInfo = contextData.getUserInfo()) == null || (obj = userInfo.get("authURL")) == null) ? null : obj.toString();
        if (obj2 != null) {
            a(obj2);
        }
    }

    private final void a(String str) {
        this.f.b(str);
    }

    /* loaded from: classes.dex */
    public static final class c extends aMY {
        final /* synthetic */ aMX b;

        c(aMX amx) {
            this.b = amx;
        }

        @Override // o.aMY, o.aMX
        public void onDataFetched(MoneyballData moneyballData, Status status, int i) {
            C8632dsu.c((Object) status, "");
            C1044Mm.a(aMS.e, "onDataFetched statusCode=%d", Integer.valueOf(status.c().getValue()));
            aMS.this.n = status;
            if (this.b != null) {
                aMS.this.a(moneyballData);
                this.b.onDataFetched(moneyballData, aMS.this.n, i);
            }
        }
    }

    private final void d(String str, String str2, List<String> list, aMX amx) {
        C1044Mm.a(e, "fetchData %s", list);
        c cVar = new c(amx);
        TQ netflixPlatform = getNetflixPlatform();
        if (netflixPlatform == null) {
            if (amx != null) {
                amx.onDataFetched(null, InterfaceC1078Nw.ad, 0);
                return;
            }
            return;
        }
        aML aml = this.k;
        if (aml != null) {
            netflixPlatform.c(aml.e(str, str2, list, cVar));
        } else if (amx != null) {
            amx.onDataFetched(null, InterfaceC1078Nw.ad, 0);
        }
    }

    @Override // o.aMU
    public void c(String str, String str2, aMX amx) {
        List<String> j;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C1044Mm.a(e, "fetch flow:%s mode:%s", str, str2);
        j = C8569dql.j("[\"aui\", \"moneyball\", \"" + str + "\", \"" + str2 + "\"]", "[\"aui\",\"" + c + "\"]");
        d(str, str2, j, new d(amx));
    }

    /* loaded from: classes.dex */
    public static final class d extends aMY {
        final /* synthetic */ aMX d;

        d(aMX amx) {
            this.d = amx;
        }

        @Override // o.aMY, o.aMX
        public void onDataFetched(MoneyballData moneyballData, Status status, int i) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) status, "");
            C1044Mm.a(aMS.e, "onDataFetched statusCode=%d", Integer.valueOf(status.c().getValue()));
            if (!status.j() || moneyballData == null) {
                C1044Mm.e(aMS.e, "error in fetching Moneyball data status: %s, moneyballData: %s", status, moneyballData);
                if (ConnectivityUtils.l(aMS.this.g)) {
                    dsE dse = dsE.b;
                    Object[] objArr = new Object[2];
                    objArr[0] = status;
                    objArr[1] = moneyballData == null ? "" : moneyballData;
                    String format = String.format("status= %s, moneyballData= %s", Arrays.copyOf(objArr, 2));
                    C8632dsu.a(format, "");
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd(format, null, null, false, k, false, false, 96, null);
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
                }
            }
            if (this.d != null) {
                aMS.this.a(moneyballData);
                this.d.onDataFetched(moneyballData, status, i);
            }
        }
    }

    public void e(aMX amx) {
        List<String> e2;
        C1044Mm.e(e, "fetch userContext");
        String str = a;
        e2 = C8566dqi.e("[\"aui\",\"" + str + "\"]");
        d(null, null, e2, new a(amx));
    }

    /* loaded from: classes.dex */
    public static final class a extends aMY {
        final /* synthetic */ aMX e;

        a(aMX amx) {
            this.e = amx;
        }

        @Override // o.aMY, o.aMX
        public void onDataFetched(MoneyballData moneyballData, Status status, int i) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) status, "");
            C1044Mm.a(aMS.e, "onDataFetched statusCode=%d", Integer.valueOf(status.c().getValue()));
            if (!status.j() || moneyballData == null) {
                C1044Mm.e(aMS.e, "error in fetching Moneyball data status: %s, moneyballData: %s", status, moneyballData);
                if (ConnectivityUtils.l(aMS.this.g)) {
                    dsE dse = dsE.b;
                    Object[] objArr = new Object[2];
                    objArr[0] = status;
                    objArr[1] = moneyballData == null ? "" : moneyballData;
                    String format = String.format("status= %s, moneyballData= %s", Arrays.copyOf(objArr, 2));
                    C8632dsu.a(format, "");
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd(format, null, null, false, k, false, false, 96, null);
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
                }
            }
            if (this.e != null) {
                aMS.this.a(moneyballData);
                this.e.onDataFetched(moneyballData, status, i);
            }
        }
    }

    @Override // o.aMU
    public void b(String str, aMX amx) {
        C8632dsu.c((Object) str, "");
        String str2 = e;
        C1044Mm.e(str2, "fetch" + str);
        c(SignupConstants.Flow.SIMPLE_SILVER_SIGN_UP, str, amx);
    }

    @Override // o.aMU
    public void a(final MoneyballCallData moneyballCallData, final aMX amx) {
        C8632dsu.c((Object) moneyballCallData, "");
        if (this.f.c() == null) {
            e(new aMX() { // from class: o.aMV
                @Override // o.aMX
                public final void onDataFetched(MoneyballData moneyballData, Status status, int i) {
                    aMS.e(aMS.this, moneyballCallData, amx, moneyballData, status, i);
                }
            });
        } else {
            c(moneyballCallData, amx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(aMS ams, MoneyballCallData moneyballCallData, aMX amx, MoneyballData moneyballData, Status status, int i) {
        C8632dsu.c((Object) ams, "");
        C8632dsu.c((Object) moneyballCallData, "");
        ams.c(moneyballCallData, amx);
    }

    /* loaded from: classes.dex */
    public static final class e extends aMY {
        final /* synthetic */ aMX b;

        e(aMX amx) {
            this.b = amx;
        }

        @Override // o.aMY, o.aMX
        public void onDataFetched(MoneyballData moneyballData, Status status, int i) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) status, "");
            if (!status.j() || moneyballData == null) {
                C1044Mm.e(aMS.e, "error in calling moneyball next. status: %s, auiData %s", status, moneyballData);
                if (ConnectivityUtils.l(aMS.this.g)) {
                    dsE dse = dsE.b;
                    Object[] objArr = new Object[2];
                    objArr[0] = status;
                    objArr[1] = moneyballData == null ? "" : moneyballData;
                    String format = String.format("status= %s, auiData= %s", Arrays.copyOf(objArr, 2));
                    C8632dsu.a(format, "");
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd(format, null, null, false, k, false, false, 96, null);
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
                }
            }
            if (this.b != null) {
                aMS.this.a(moneyballData);
                this.b.onDataFetched(moneyballData, status, i);
            }
        }
    }

    @Override // o.aMU
    public void c(MoneyballCallData moneyballCallData, aMX amx) {
        C8632dsu.c((Object) moneyballCallData, "");
        C1044Mm.e(e, SignupConstants.Field.NEXT_MODE);
        e eVar = new e(amx);
        TQ netflixPlatform = getNetflixPlatform();
        if (netflixPlatform == null) {
            if (amx != null) {
                amx.onDataFetched(null, InterfaceC1078Nw.ad, 0);
                return;
            }
            return;
        }
        aML aml = this.k;
        if (aml != null) {
            netflixPlatform.c(aml.d(moneyballCallData, eVar));
        } else if (amx != null) {
            amx.onDataFetched(null, InterfaceC1078Nw.ad, 0);
        }
    }

    @Override // o.aMU
    public void c(aMX amx) {
        List<String> e2;
        C8632dsu.c((Object) amx, "");
        C1044Mm.e(e, "getPath");
        e2 = C8566dqi.e("[\"aui\",\"phoneCodes\"]");
        d(null, null, e2, amx);
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.M;
        C8632dsu.a(netflixImmutableStatus, "");
        return netflixImmutableStatus;
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_MONEYBALL;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_MONEYBALL;
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
