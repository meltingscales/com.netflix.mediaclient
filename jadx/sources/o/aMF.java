package o;

import android.content.Context;
import android.os.Handler;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import com.netflix.mediaclient.servicemgr.ZuulAgent;
import com.netflix.mediaclient.util.ConnectivityUtils;
import o.C1079Nx;

/* loaded from: classes.dex */
public abstract class aMF implements aMG {
    public static final String CATEGORY_DEBUG = "com.netflix.mediaclient.intent.category.DEBUG";
    private static final String TAG = "nf_service_ServiceAgent";
    public b agentContext;
    private c initCallback;
    private boolean initCalled;
    private Status initErrorResult;
    private long mInitStartTime;
    private final Handler mainHandler = new Handler();

    /* loaded from: classes.dex */
    public interface b {
        aOV a();

        Context b();

        aMU c();

        InterfaceC1251Um d();

        InterfaceC5128bss e();

        TQ f();

        InterfaceC5129bst g();

        IClientLogging h();

        InterfaceC4348bcn i();

        InterfaceC4208baF j();

        UserAgent l();

        InterfaceC4942bpR m();

        InterfaceC5098bsO n();

        InterfaceC5170bth o();

        ZuulAgent p();
    }

    /* loaded from: classes.dex */
    public interface c {
        void d(aMF amf, Status status);
    }

    public abstract String agentName();

    protected abstract void doInit();

    protected abstract Sessions getAgentLoadEventName();

    public Handler getMainHandler() {
        return this.mainHandler;
    }

    public abstract StopReason getStopReasonForInitFailed();

    public abstract Status getTimeoutStatus();

    public abstract StopReason getTimeoutStopReason();

    public void handleConnectivityChange(ConnectivityUtils.NetType netType) {
    }

    public boolean isInitCalled() {
        return this.initCalled;
    }

    public boolean isInitCompleted() {
        return this.initErrorResult != null;
    }

    public void onNetflixPlatformInitComplete(boolean z) {
    }

    public void onTrimMemory(int i) {
    }

    public final void init(b bVar, c cVar) {
        C8166dfJ.d();
        C1044Mm.a(TAG, "Request to init %s", getClass().getSimpleName());
        if (this.initCalled) {
            InterfaceC1598aHf.a(new C1596aHd().d(new IllegalStateException(getClass().getSimpleName() + " init already called!")).b(false));
            return;
        }
        this.agentContext = bVar;
        this.initCalled = true;
        this.initCallback = cVar;
        new C1071Np().d(new C1079Nx.b() { // from class: o.aME
            @Override // o.C1079Nx.b
            public final void run() {
                aMF.this.lambda$init$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0() {
        C1044Mm.a(TAG, "Initing %s", getClass().getSimpleName());
        InterfaceC1985aVp interfaceC1985aVp = (InterfaceC1985aVp) C1332Xp.b(InterfaceC1985aVp.class);
        if (interfaceC1985aVp.c()) {
            interfaceC1985aVp.d(getAgentLoadEventName());
        }
        this.mInitStartTime = System.currentTimeMillis();
        doInit();
    }

    public final void initCompleted(Status status) {
        ((InterfaceC1985aVp) C1332Xp.b(InterfaceC1985aVp.class)).a(getAgentLoadEventName());
        this.initErrorResult = status;
        C1044Mm.b(TAG, "%s InitComplete errorCode=%d took=%d", getClass().getSimpleName(), Integer.valueOf(status.c().getValue()), Long.valueOf(System.currentTimeMillis() - this.mInitStartTime));
        if (this.initCallback != null) {
            this.mainHandler.post(new Runnable() { // from class: o.aMF.5
                @Override // java.lang.Runnable
                public void run() {
                    c cVar = aMF.this.initCallback;
                    aMF amf = aMF.this;
                    cVar.d(amf, amf.initErrorResult);
                }
            });
        }
    }

    @Override // o.aMG
    public boolean isReady() {
        Status status = this.initErrorResult;
        return status != null && status.j();
    }

    public void destroy() {
        C1044Mm.e(TAG, "Destroying " + getClass().getSimpleName());
        this.agentContext = null;
    }

    public Context getContext() {
        return AbstractApplicationC1040Mh.d();
    }

    public TQ getNetflixPlatform() {
        b bVar = this.agentContext;
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    public InterfaceC5098bsO getServiceNotificationHelper() {
        b bVar = this.agentContext;
        if (bVar != null) {
            return bVar.n();
        }
        return null;
    }

    public UserAgent getUserAgent() {
        b bVar = this.agentContext;
        if (bVar != null) {
            return bVar.l();
        }
        return null;
    }

    public aOV getConfigurationAgent() {
        b bVar = this.agentContext;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public aMU getAUIAgent() {
        b bVar = this.agentContext;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    public InterfaceC4942bpR getResourceFetcher() {
        b bVar = this.agentContext;
        if (bVar != null) {
            return bVar.m();
        }
        return null;
    }

    public InterfaceC5128bss getErrorHandler() {
        b bVar = this.agentContext;
        if (bVar != null) {
            return bVar.e();
        }
        return null;
    }

    public IClientLogging getLoggingAgent() {
        b bVar = this.agentContext;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public ZuulAgent getZuulAgent() {
        b bVar = this.agentContext;
        if (bVar != null) {
            return bVar.p();
        }
        return null;
    }

    public InterfaceC1251Um getCdxAgent() {
        b bVar = this.agentContext;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public InterfaceC5129bst getMSLClient() {
        b bVar = this.agentContext;
        if (bVar != null) {
            return bVar.g();
        }
        return null;
    }

    public InterfaceC4208baF getOfflineAgent() {
        b bVar = this.agentContext;
        if (bVar != null) {
            return bVar.j();
        }
        return null;
    }

    public InterfaceC4348bcn getOfflineAgentPlaybackInterface() {
        b bVar = this.agentContext;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public InterfaceC5170bth getMslAgentCookiesProvider() {
        b bVar = this.agentContext;
        if (bVar != null) {
            return bVar.o();
        }
        return null;
    }

    public boolean inInitialization() {
        return isInitCalled() && !isInitCompleted();
    }

    public boolean addDataRequest(NetflixDataRequest netflixDataRequest) {
        TQ netflixPlatform = getNetflixPlatform();
        if (netflixPlatform != null) {
            return netflixPlatform.c(netflixDataRequest);
        }
        C1044Mm.d(TAG, "Unable to add data request! Service is null, this should NOT happen!");
        return false;
    }
}
