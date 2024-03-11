package o;

import android.content.Context;
import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetworkErrorStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.app.StatusException;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.volley.StatusCodeError;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import java.io.File;
import o.C5005bqb;
import o.C9864xy;

/* renamed from: o.bpT  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4944bpT extends aMF implements InterfaceC4942bpR {
    private C9865xz a;
    protected final Context b;
    private File c;
    protected final aHJ d;
    protected C9865xz e;
    private C5005bqb f;
    private volatile ImageLoader j;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.bpT$b */
    /* loaded from: classes4.dex */
    public interface b {
        InterfaceC8260dgy V();
    }

    @Override // o.aMF
    public String agentName() {
        return "resourceFetcher";
    }

    @Override // o.aMF
    public void onTrimMemory(int i) {
        if (this.j != null) {
            this.j.d(i);
        }
    }

    public C4944bpT(Context context, aHJ ahj) {
        this.b = context;
        this.d = ahj;
    }

    @Override // o.aMF
    public void doInit() {
        C1044Mm.e("nf_service_resourcefetcher", "ResourceFetcher starting doInit.");
        b();
        g();
        f();
        e();
        C1332Xp.d(InterfaceC4942bpR.class, this, true);
        initCompleted(InterfaceC1078Nw.aJ);
    }

    private void f() {
        File file = new File(this.b.getCacheDir(), "downloads");
        this.c = file;
        if (!file.isDirectory()) {
            this.c.mkdirs();
        }
        this.f = new C5005bqb((C9823xJ) this.e.a());
    }

    protected void b() {
        int O = getConfigurationAgent().O();
        C1044Mm.a("nf_service_resourcefetcher", "Creating Volley RequestQueue with threadPoolsize of %d", Integer.valueOf(O));
        C9865xz a = this.d.a((InterfaceC9854xo) c(), (InterfaceC9857xr) new aZM(a()), O, true, "resources");
        this.e = a;
        a.e();
    }

    private void g() {
        int k = getConfigurationAgent().k();
        C1044Mm.a("nf_service_resourcefetcher", "Creating MSL Volley RequestQueue with threadPoolsize of %d", Integer.valueOf(k));
        C9865xz a = this.d.a((InterfaceC9854xo) new C9829xP(), (InterfaceC9857xr) new aZM(new aZA(this.b, this.d, getConfigurationAgent().t())), k, true, "msl");
        this.a = a;
        a.e();
    }

    @Override // o.aMF
    public void destroy() {
        super.destroy();
        if (this.e != null) {
            C1044Mm.a("nf_service_resourcefetcher", "Stopping Volley RequestQueue");
            this.e.b();
            this.e = null;
        }
        if (this.a != null) {
            C1044Mm.a("nf_service_resourcefetcher", "Stopping MSL Volley RequestQueue");
            this.a.b();
            this.a = null;
        }
    }

    @Override // o.InterfaceC4942bpR
    public ImageLoader e() {
        if (this.j == null) {
            synchronized (this) {
                if (this.j == null) {
                    synchronized (this) {
                        ImageLoader d = d();
                        if (d != null) {
                            C1332Xp.d(ImageLoader.class, d, true);
                            this.j = d;
                        }
                    }
                }
            }
        }
        return this.j;
    }

    private ImageLoader d() {
        C1044Mm.e("nf_service_resourcefetcher", "ResourceFetcher creating ImageLoader");
        if (this.e == null) {
            C1044Mm.j("nf_service_resourcefetcher", "Attempting to create an ImageLoader with a null RequestQueue");
            InterfaceC1598aHf.a(new C1596aHd("Attempting to create an ImageLoader with a null RequestQueue").b(false));
            return null;
        }
        InterfaceC8260dgy V = ((b) EntryPointAccessors.fromApplication(this.b, b.class)).V();
        long x = getConfigurationAgent().x();
        int P = getConfigurationAgent().P();
        C1044Mm.a("nf_service_resourcefetcher", "Received request to create new ImageLoader with socketTimeout = %d and minimumTtl = %d ms", Integer.valueOf(P), Long.valueOf(x));
        return V.e(this.e, P, x, this.c);
    }

    @Override // o.InterfaceC4942bpR
    public void b(String str, AssetType assetType, InterfaceC4943bpS interfaceC4943bpS) {
        a(str, assetType, Request.Priority.NORMAL, interfaceC4943bpS);
    }

    public void a(final String str, AssetType assetType, Request.Priority priority, final InterfaceC4943bpS interfaceC4943bpS) {
        this.e.e(new C4941bpQ(str, interfaceC4943bpS, new C9864xy.b() { // from class: o.bpT.5
            @Override // o.C9864xy.b
            public void b(VolleyError volleyError) {
                C1044Mm.b("nf_service_resourcefetcher", volleyError, "RawFileDownloadRequest failed: ", new Object[0]);
                InterfaceC4943bpS interfaceC4943bpS2 = interfaceC4943bpS;
                if (interfaceC4943bpS2 != null) {
                    interfaceC4943bpS2.d(str, null, new NetworkErrorStatus(volleyError));
                }
            }
        }, getConfigurationAgent().P(), priority));
    }

    @Override // o.InterfaceC4942bpR
    public void c(final String str, AssetType assetType, Request.Priority priority, final InterfaceC4943bpS interfaceC4943bpS) {
        try {
            File file = new File(this.c, C8342dia.a(str));
            if (file.exists()) {
                interfaceC4943bpS.b(str, file.getAbsolutePath(), InterfaceC1078Nw.aJ);
                return;
            }
        } catch (Exception e) {
            C1044Mm.a("nf_service_resourcefetcher", e, "could not read from disk");
        }
        this.e.e(new C4939bpO(str, interfaceC4943bpS, new C9864xy.b() { // from class: o.bpT.3
            @Override // o.C9864xy.b
            public void b(VolleyError volleyError) {
                C1044Mm.b("nf_service_resourcefetcher", volleyError, "FileDownloadRequest failed: ", new Object[0]);
                InterfaceC4943bpS interfaceC4943bpS2 = interfaceC4943bpS;
                if (interfaceC4943bpS2 != null) {
                    interfaceC4943bpS2.b(str, null, new NetworkErrorStatus(volleyError));
                }
            }
        }, getConfigurationAgent().P(), priority, this.c));
    }

    public void a(final String str, AssetType assetType, final InterfaceC4943bpS interfaceC4943bpS) {
        C5005bqb.e d = this.f.d(C8342dia.d(str));
        if (d == null) {
            this.e.e(new C4937bpM(str, interfaceC4943bpS, new C9864xy.b() { // from class: o.bpT.2
                @Override // o.C9864xy.b
                public void b(VolleyError volleyError) {
                    C1044Mm.b("nf_service_resourcefetcher", volleyError, "fetchAndCacheResource failed: ", new Object[0]);
                    InterfaceC4943bpS interfaceC4943bpS2 = interfaceC4943bpS;
                    if (interfaceC4943bpS2 != null) {
                        interfaceC4943bpS2.b(str, null, 0L, 0L, new NetworkErrorStatus(volleyError));
                    }
                }
            }, getConfigurationAgent().P(), this.f));
        } else if (interfaceC4943bpS != null) {
            interfaceC4943bpS.b(str, d.e(), d.a(), d.d(), InterfaceC1078Nw.aJ);
        }
    }

    protected InterfaceC9820xG a() {
        C1044Mm.e("nf_service_resourcefetcher", "Create resource Http Stack");
        return new C4945bpU(this.d);
    }

    public C9823xJ c() {
        File file = new File(this.b.getCacheDir(), "volley");
        int c = C8196dfn.c(this.b);
        C1044Mm.c("nf_service_resourcefetcher", "Creating new Volley DiskBasedCache, location: %s,  max size: %d bytes", file.getAbsolutePath(), Integer.valueOf(c));
        return new C9823xJ(file, c);
    }

    @Override // o.InterfaceC4942bpR
    public boolean a(String str) {
        if (this.c.isDirectory() && C8168dfL.h(str)) {
            return new File(this.c, str).delete();
        }
        return false;
    }

    @Override // o.InterfaceC4938bpN
    public boolean a(NetflixDataRequest netflixDataRequest) {
        synchronized (this) {
            if (netflixDataRequest == null) {
                C1044Mm.j("nf_service_resourcefetcher", "Request is null!");
                return false;
            } else if (netflixDataRequest instanceof aZE) {
                return c((aZE) netflixDataRequest);
            } else if (netflixDataRequest instanceof AbstractC5042brL) {
                return b((AbstractC5042brL) netflixDataRequest);
            } else {
                throw new IllegalStateException("Not supported implementation of NetflixDataRequest:" + netflixDataRequest.getClass().getSimpleName());
            }
        }
    }

    private boolean b(AbstractC5042brL abstractC5042brL) {
        C1044Mm.a("nf_service_resourcefetcher", "Adding direct request %s to queue...", e((NetflixDataRequest) abstractC5042brL));
        e(abstractC5042brL);
        int t = getConfigurationAgent().t();
        C1044Mm.a("nf_service_resourcefetcher", "Setting default timeout value for data request to %d ms", Integer.valueOf(t));
        abstractC5042brL.e(C8241dgf.a(t));
        abstractC5042brL.b(getConfigurationAgent());
        if (a(abstractC5042brL)) {
            this.a.e(abstractC5042brL);
            return true;
        }
        return false;
    }

    private boolean a(AbstractC5042brL abstractC5042brL) {
        ApiEndpointRegistry j = getConfigurationAgent().j();
        if (getAUIAgent().b() != null && (abstractC5042brL instanceof aMK)) {
            abstractC5042brL.a(getAUIAgent().e());
            return true;
        } else if (j != null) {
            abstractC5042brL.a(getConfigurationAgent().j());
            return true;
        } else {
            C1044Mm.d("nf_service_resourcefetcher", "ApiEndpointRegistry is not available!");
            return false;
        }
    }

    private boolean e(AbstractC5042brL abstractC5042brL) {
        if (abstractC5042brL instanceof AbstractC5039brI) {
            C1044Mm.e("nf_service_resourcefetcher", "FalkorVolleyWebClientRequest request, check for profile override!");
            if (e((AbstractC5039brI) abstractC5042brL)) {
                C1044Mm.e("nf_service_resourcefetcher", "FalkorVolleyWebClientRequest:: UserCredentialRegistry injected by profile ID override!");
                return true;
            }
        }
        if (!abstractC5042brL.ab() && getUserAgent() != null && getUserAgent().l() != null) {
            abstractC5042brL.e(new C5031brA(getUserAgent().l()));
            return true;
        }
        C1044Mm.j("nf_service_resourcefetcher", "UserCredentialRegistry existed!");
        return false;
    }

    private boolean e(AbstractC5039brI abstractC5039brI) {
        if (abstractC5039brI.R() == null || getUserAgent() == null) {
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(abstractC5039brI.R() != null);
            C1044Mm.a("nf_service_resourcefetcher", "Profile GUID not found %b", objArr);
            return false;
        }
        InterfaceC5034brD c = getUserAgent().c(abstractC5039brI.R());
        if (c == null) {
            InterfaceC1598aHf.a("Authorization tokens are NOT found for profile " + abstractC5039brI.R());
            return false;
        }
        C1044Mm.e("nf_service_resourcefetcher", "Injected user credential repository for overridden profile GUID.");
        abstractC5039brI.e(c);
        return true;
    }

    private static String e(NetflixDataRequest netflixDataRequest) {
        if (C8168dfL.h(netflixDataRequest.getClass().getSimpleName())) {
            return netflixDataRequest.getClass().getSimpleName();
        }
        if (netflixDataRequest instanceof AbstractC2103aZz) {
            Object y = ((AbstractC2103aZz) netflixDataRequest).y();
            if (y instanceof String) {
                return (String) y;
            }
            return y != null ? y.toString() : "";
        }
        if (netflixDataRequest instanceof AbstractC5042brL) {
            Object y2 = ((AbstractC5042brL) netflixDataRequest).y();
            if (y2 instanceof String) {
                return (String) y2;
            }
            if (y2 != null) {
                return y2.toString();
            }
        }
        return "";
    }

    private boolean c(aZE aze) {
        if (!((aMF) getMSLClient()).isReady()) {
            C1044Mm.j("nf_service_resourcefetcher", "MSL agent is not ready, droping request");
            return false;
        } else if (aPB.e().f()) {
            C1044Mm.a("nf_service_resourcefetcher", "DRM resources suspended, unable to add MSL request %s to queue...", e(aze));
            aze.a_(new StatusCodeError(StatusCode.DRM_RESOURCES_SUSPENDED));
            return false;
        } else {
            C1044Mm.a("nf_service_resourcefetcher", "Adding MSL request %s to queue...", e(aze));
            getMSLClient().d(aze);
            this.a.e(aze);
            return true;
        }
    }

    @Override // o.aMF
    public void handleConnectivityChange(ConnectivityUtils.NetType netType) {
        InterfaceC5038brH.c.b(this.b).e(netType);
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.RESOURCE_FETCHER_LOAD;
    }

    @Override // o.InterfaceC4942bpR
    public Single<byte[]> b(final String str, final AssetType assetType) {
        return Single.create(new SingleOnSubscribe() { // from class: o.bpV
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                C4944bpT.this.c(str, assetType, singleEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str, AssetType assetType, final SingleEmitter singleEmitter) {
        b(str, assetType, new InterfaceC4943bpS() { // from class: o.bpT.4
            @Override // o.InterfaceC4943bpS
            public void b(String str2, String str3, long j, long j2, Status status) {
            }

            @Override // o.InterfaceC4943bpS
            public void b(String str2, String str3, Status status) {
            }

            @Override // o.InterfaceC4943bpS
            public void d(String str2, byte[] bArr, Status status) {
                try {
                    if (status.j() && bArr != null) {
                        singleEmitter.onSuccess(bArr);
                    } else {
                        singleEmitter.onError(new StatusException(status));
                    }
                } catch (Exception e) {
                    singleEmitter.onError(e);
                }
            }
        });
    }

    @Override // o.InterfaceC4942bpR
    public Completable a(final String str, final AssetType assetType) {
        return Completable.create(new CompletableOnSubscribe() { // from class: o.bpW
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(CompletableEmitter completableEmitter) {
                C4944bpT.this.c(str, assetType, completableEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str, AssetType assetType, final CompletableEmitter completableEmitter) {
        a(str, assetType, new InterfaceC4943bpS() { // from class: o.bpT.1
            @Override // o.InterfaceC4943bpS
            public void b(String str2, String str3, Status status) {
            }

            @Override // o.InterfaceC4943bpS
            public void d(String str2, byte[] bArr, Status status) {
            }

            @Override // o.InterfaceC4943bpS
            public void b(String str2, String str3, long j, long j2, Status status) {
                if (status.j() && str3 != null) {
                    completableEmitter.onComplete();
                } else {
                    completableEmitter.onError(new StatusException(status));
                }
            }
        });
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        return InterfaceC1078Nw.Y;
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_RESOURCES;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_RESOURCES;
    }
}
