package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.ftl.FtlController;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IClientLoggingListener;
import com.netflix.mediaclient.util.ConnectivityUtils;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.C1079Nx;
import o.C1812aPd;
import o.C9861xv;
import org.json.JSONObject;

/* renamed from: o.aUe  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1948aUe extends aMF implements IClientLogging, C1812aPd.d {
    private final aOV a;
    private final Context b;
    private C1990aVu d;
    private final dwU e;
    private final InterfaceC1595aHc h;
    private aTN i;
    private final InterfaceC5129bst k;
    private aTA l;
    private final C1981aVl m;

    /* renamed from: o  reason: collision with root package name */
    private final Set<IClientLoggingListener> f13446o;
    private aTE p;
    private aTC r;
    private final UserAgent s;
    private C9861xv.b w;
    private final long q = System.currentTimeMillis();
    private final AtomicInteger g = new AtomicInteger();
    private final AtomicBoolean t = new AtomicBoolean(false);
    private final List<Runnable> f = new ArrayList();
    private final Runnable j = new Runnable() { // from class: o.aUe.3
        @Override // java.lang.Runnable
        public void run() {
            C1044Mm.e("nf_log", "Running state check...");
            C1948aUe.this.i.m();
            C1948aUe.this.l.c();
            C1948aUe.this.p.b();
            C1948aUe.this.r.c();
            AbstractApplicationC1040Mh.getInstance().o().d();
            C1044Mm.e("nf_log", "Running state check done.");
        }
    };
    private final BroadcastReceiver n = new BroadcastReceiver() { // from class: o.aUe.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C1044Mm.b("nf_log", "Received intent ", intent);
            C1948aUe.this.d(intent);
        }
    };

    @AssistedFactory
    /* renamed from: o.aUe$c */
    /* loaded from: classes.dex */
    public interface c {
        C1948aUe b(aOV aov, UserAgent userAgent, InterfaceC5129bst interfaceC5129bst);
    }

    @Override // o.aMF
    public String agentName() {
        return "logging";
    }

    public void b(boolean z) {
    }

    @Override // com.netflix.mediaclient.servicemgr.IClientLogging
    public InterfaceC5090bsG e() {
        return this.l;
    }

    @Override // com.netflix.mediaclient.servicemgr.IClientLogging
    public aTX g() {
        return this.r;
    }

    @Override // com.netflix.mediaclient.servicemgr.IClientLogging
    public aTU h() {
        return this.p;
    }

    @Override // o.aMF, o.aMG
    public boolean isReady() {
        return true;
    }

    @Override // com.netflix.mediaclient.servicemgr.IClientLogging
    public InterfaceC1979aVj j() {
        return this.m;
    }

    public void o() {
    }

    @AssistedInject
    public C1948aUe(@ApplicationContext Context context, Set<IClientLoggingListener> set, InterfaceC1595aHc interfaceC1595aHc, @Assisted aOV aov, @Assisted UserAgent userAgent, @Assisted InterfaceC5129bst interfaceC5129bst, dwU dwu) {
        C1044Mm.e("nf_log", "ClientLoggingAgent::");
        this.b = context;
        this.m = new C1981aVl(this);
        this.a = aov;
        this.s = userAgent;
        this.k = interfaceC5129bst;
        this.f13446o = set;
        this.h = interfaceC1595aHc;
        this.e = dwu;
        C1044Mm.e("nf_log", "ClientLoggingAgent:: done");
    }

    private ScheduledExecutorService r() {
        return C1953aUj.a.e();
    }

    @Override // o.aMF
    public void doInit() {
        C1044Mm.e("nf_log", "ClientLoggingAgent::init start ");
        new C1071Np().d(new C1079Nx.b() { // from class: o.aUh
            @Override // o.C1079Nx.b
            public final void run() {
                C1948aUe.this.t();
            }
        });
        initCompleted(InterfaceC1078Nw.aJ);
        C1044Mm.e("nf_log", "ClientLoggingAgent::init done ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        C1044Mm.e("nf_log", "ClientLoggingAgent::off-init start ");
        this.i = new aTO(getContext(), this, i(), this.a, getNetflixPlatform());
        this.l = C1957aUn.e(this.b, this, i(), this.a, this.k);
        this.p = C1957aUn.b(this.b, this, i(), getConfigurationAgent());
        this.r = new C1964aUu(this, i(), getContext());
        this.d = new C1990aVu(this.b);
        r().scheduleWithFixedDelay(this.j, 60000L, 60000L, TimeUnit.MILLISECONDS);
        r().schedule(new Runnable() { // from class: o.aUf
            @Override // java.lang.Runnable
            public final void run() {
                C1948aUe.this.D();
            }
        }, 30L, TimeUnit.SECONDS);
        this.i.e(r());
        this.l.a(r());
        this.m.c(getMainHandler(), getOfflineAgent());
        this.p.c(r());
        this.r.a(r());
        this.d.d();
        u();
        w();
        v();
        s();
        FtlController.INSTANCE.c(this.l);
        p();
        C1044Mm.e("nf_log", "ClientLoggingAgent::off-init done ");
    }

    private void p() {
        synchronized (this) {
            for (Runnable runnable : this.f) {
                r().schedule(runnable, 0L, TimeUnit.SECONDS);
            }
            this.f.clear();
        }
    }

    public void c(final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3) {
        boolean z;
        Runnable runnable = new Runnable() { // from class: o.aUg
            @Override // java.lang.Runnable
            public final void run() {
                C1948aUe.this.b(jSONObject, jSONObject2, jSONObject3);
            }
        };
        synchronized (this) {
            if (e() == null) {
                this.f.add(runnable);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            C1044Mm.j("nf_log", "ClientLoggingAgent not ready to deliver startup logblob, postponing.");
            InterfaceC1598aHf.a("ClientLoggingAgent not ready to deliver startup logblob, postponing.");
            return;
        }
        r().schedule(runnable, 0L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        e().a(new aUR(this.b, this.a, this.s, this.k, jSONObject, jSONObject2, jSONObject3));
    }

    public void l() {
        boolean z;
        Runnable runnable = new Runnable() { // from class: o.aUk
            @Override // java.lang.Runnable
            public final void run() {
                C1948aUe.this.x();
            }
        };
        synchronized (this) {
            if (e() == null) {
                this.f.add(runnable);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            C1044Mm.j("nf_log", "ClientLoggingAgent not ready to deliver startupError logBlob.");
            InterfaceC1598aHf.a("ClientLoggingAgent not ready to deliver startupError logBlob.");
            return;
        }
        r().schedule(runnable, 0L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        e().a(new aUQ(this.b, this.a, this.k));
    }

    public void m() {
        if (e() == null) {
            return;
        }
        r().schedule(new Runnable() { // from class: o.aUi
            @Override // java.lang.Runnable
            public final void run() {
                C1948aUe.this.y();
            }
        }, 45L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        new aVC(this.e, this).a();
    }

    private void v() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (getConfigurationAgent() != null && getConfigurationAgent().a() != null) {
            for (Map.Entry<String, ABTestConfig> entry : getConfigurationAgent().a().entrySet()) {
                ABTestConfig value = entry.getValue();
                if (value != null && value.getCell() != null && value.isExplicit()) {
                    aRM d = C1818aPj.d(entry.getKey());
                    arrayList.add(new XC(d == null ? "" : d.a().toString(), entry.getKey(), value.getCell().getCellId()));
                    hashMap.put(entry.getKey(), Integer.valueOf(value.getCell().getCellId()));
                }
            }
        }
        this.h.e(hashMap);
        for (ExternalCrashReporter externalCrashReporter : ExternalCrashReporter.a(getContext())) {
            externalCrashReporter.c(arrayList);
        }
    }

    private void s() {
        aOV configurationAgent = getConfigurationAgent();
        if (configurationAgent instanceof C1812aPd) {
            ((C1812aPd) configurationAgent).a(this);
        }
    }

    @Override // o.aMF
    public void destroy() {
        C1044Mm.e("nf_log", "PNA:: destroy and unregister receiver");
        C8116deM.a(getContext(), this.n);
        C9861xv.e(this.w);
        aTN atn = this.i;
        if (atn != null) {
            atn.b();
        }
        aTA ata = this.l;
        if (ata != null) {
            ata.d();
        }
        C1981aVl c1981aVl = this.m;
        if (c1981aVl != null) {
            c1981aVl.a();
        }
        super.destroy();
    }

    public UserAgent i() {
        return getUserAgent();
    }

    public boolean c(Intent intent) {
        if (intent == null) {
            C1044Mm.j("nf_log", "Intent is null");
            return false;
        }
        return false;
    }

    private void u() {
        C1044Mm.e("nf_log", "Register receiver");
        IntentFilter intentFilter = new IntentFilter();
        d(intentFilter, new String[]{"com.netflix.mediaclient.intent.action.LOG_PAUSE_EVENTS_DELIVERY", "com.netflix.mediaclient.intent.action.LOG_RESUME_EVENTS_DELIVERY", "com.netflix.mediaclient.intent.action.LOG_RESUME_ALL_EVENTS_DELIVERY"});
        intentFilter.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intentFilter.setPriority(999);
        try {
            LocalBroadcastManager.getInstance(getContext()).registerReceiver(this.n, intentFilter);
        } catch (Throwable th) {
            C1044Mm.e("nf_log", "Failed to register ", th);
        }
    }

    private void d(IntentFilter intentFilter, String[] strArr) {
        for (String str : strArr) {
            intentFilter.addAction(str);
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.IClientLogging
    public long c() {
        return this.g.incrementAndGet() * 60000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.g.set(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        synchronized (this.t) {
            if (this.t.get()) {
                C1044Mm.j("nf_log", "LoggingAgent::startDelivery: log delivery was already started!");
                return;
            }
            C1044Mm.e("nf_log", "LoggingAgent::startDelivery: starting log delivery!");
            this.t.set(true);
            this.i.o();
            this.l.f();
            this.p.c();
            this.r.a();
        }
    }

    @Override // o.aMF
    public void handleConnectivityChange(ConnectivityUtils.NetType netType) {
        aTN atn = this.i;
        if (atn != null) {
            atn.h();
        }
        aTA ata = this.l;
        if (ata != null) {
            ata.e();
        }
        aTE ate = this.p;
        if (ate != null) {
            ate.d();
        }
        aTC atc = this.r;
        if (atc != null) {
            atc.b();
        }
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.LOGGING_AGENT_LOADED;
    }

    @Override // o.C1812aPd.d
    public void d(Status status) {
        if (status.j()) {
            getMainHandler().post(new Runnable() { // from class: o.aUm
                @Override // java.lang.Runnable
                public final void run() {
                    C1948aUe.this.q();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        C1044Mm.b("nf_log", "Refresh configuration for error and breadcrumb logging");
        w();
    }

    private void w() {
        for (IClientLoggingListener iClientLoggingListener : this.f13446o) {
            iClientLoggingListener.e(this, getConfigurationAgent(), IClientLogging.c);
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.IClientLogging
    public void k() {
        C1044Mm.e("nf_log", "onUserLogout");
        C8166dfJ.d();
        C8127deX.e();
        C8127deX.c();
        this.i.l();
    }

    @Override // com.netflix.mediaclient.servicemgr.IClientLogging
    public void n() {
        C1044Mm.e("nf_log", "onProfileSwitch");
        this.i.d(true);
    }

    public void b() {
        C1044Mm.e("nf_log", "Flush events");
        aTN atn = this.i;
        if (atn != null) {
            atn.d(true);
        }
        aTE ate = this.p;
        if (ate != null) {
            ate.e();
        }
        aTA ata = this.l;
        if (ata != null) {
            ata.b();
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.IClientLogging
    public String a() {
        return String.valueOf(C8127deX.b());
    }

    @Override // com.netflix.mediaclient.servicemgr.IClientLogging
    public String f() {
        return String.valueOf(C8127deX.a());
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        return InterfaceC1078Nw.K;
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_LOG;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_LOG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("flush", false);
        String action = intent.getAction();
        if ("com.netflix.mediaclient.intent.action.LOG_PAUSE_EVENTS_DELIVERY".equals(action)) {
            C1044Mm.e("nf_log", "Pause CL and PT events!");
            o();
            return true;
        } else if ("com.netflix.mediaclient.intent.action.LOG_RESUME_EVENTS_DELIVERY".equals(action)) {
            C1044Mm.e("nf_log", "Resume CL and PT events!");
            b(booleanExtra);
            return true;
        } else if ("com.netflix.mediaclient.intent.action.LOG_RESUME_ALL_EVENTS_DELIVERY".equals(action)) {
            C1044Mm.e("nf_log", "Start delivering all events!");
            D();
            return true;
        } else {
            return false;
        }
    }
}
