package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.job.NetflixJobExecutor;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipChoicesResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IVoip;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import com.netflix.model.leafs.ListOfMoviesSummary;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.originals.interactive.InteractiveDebugMenuItem;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import com.netflix.model.leafs.social.NotificationsListSummary;
import com.netflix.model.survey.Survey;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;

/* renamed from: o.bsR  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5101bsR implements ServiceManager, InterfaceC5135bsz {
    private InterfaceC5091bsH b;
    private final Context h;
    private InterfaceC5130bsu k;
    private InterfaceC5130bsu m;
    private e n;
    private int d = -1;
    private final b e = new b();
    private ServiceManager.b a = new C5084bsA(ServiceManager.InitializationState.NOT_INITIALIZED, InterfaceC1078Nw.aJ, null);
    private volatile boolean g = false;
    private int i = 0;
    private int f = 0;
    private final ServiceConnection j = new ServiceConnection() { // from class: o.bsR.2
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C5101bsR.this.d(componentName, iBinder);
            NetflixService.e eVar = (NetflixService.e) iBinder;
            C5101bsR.this.k = eVar.b();
            C5101bsR.this.m = eVar.b();
            if (C5101bsR.this.n == null) {
                C5101bsR c5101bsR = C5101bsR.this;
                c5101bsR.n = new e();
            }
            C5101bsR.this.k.b(C5101bsR.this.n);
            C5101bsR.this.f++;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C1044Mm.e("ServiceManager", "onServiceDisconnected");
            if (C5101bsR.this.b != null) {
                C5101bsR.this.b.onManagerUnavailable(C5101bsR.this, InterfaceC1078Nw.ah);
                C5101bsR.this.b = null;
            }
            C5101bsR.this.m = null;
            C5101bsR.this.k = null;
            C5101bsR.this.a = new C5084bsA(ServiceManager.InitializationState.UNBOUND, InterfaceC1078Nw.aJ, null);
            C5101bsR.this.d = -1;
            C5101bsR.this.i++;
        }
    };
    private final InterfaceC5125bsp c = new C5121bsl(this);

    @Override // o.InterfaceC5135bsz
    public int d() {
        return this.d;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public Context f() {
        return this.h;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public InterfaceC5125bsp j() {
        return this.c;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public boolean z() {
        return this.g;
    }

    @Inject
    public C5101bsR(@ApplicationContext Context context) {
        this.h = context;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void c(InterfaceC5091bsH interfaceC5091bsH) {
        synchronized (this) {
            Objects.requireNonNull(interfaceC5091bsH);
            if (this.g) {
                throw new IllegalStateException("ServiceManager can only be initialized once");
            }
            C1044Mm.e("ServiceManager", "ServiceManager created");
            this.b = interfaceC5091bsH;
            if (Build.VERSION.SDK_INT <= 25) {
                this.h.startService(new Intent(this.h, NetflixService.class));
            }
            if (!this.h.bindService(R(), this.j, 1)) {
                C1044Mm.d("ServiceManager", "ServiceManager could not bind to NetflixService!");
            }
            this.g = true;
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void M() {
        synchronized (this) {
            if (this.k != null) {
                if (this.n != null) {
                    C1044Mm.e("ServiceManager", "ServiceManager unregisterCallback");
                    this.k.e(this.n);
                }
                C1044Mm.e("ServiceManager", "ServiceManager unbindService");
                this.h.unbindService(this.j);
                this.e.b();
                this.d = -1;
                this.a = new C5084bsA(ServiceManager.InitializationState.RELEASED, InterfaceC1078Nw.aJ, null);
            }
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public ImageLoader l() {
        if (P()) {
            return this.m.r();
        }
        C1044Mm.j("ServiceManager", "getImageLoader:: Netflix service is not available or not ready, return null.");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public aOV g() {
        InterfaceC5130bsu interfaceC5130bsu = this.k;
        if (interfaceC5130bsu != null) {
            return interfaceC5130bsu.n();
        }
        C1044Mm.j("ServiceManager", "getConfiguration: service is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public aOV J() {
        aOV g = g();
        if (g != null) {
            return g;
        }
        throw new IllegalStateException("configuration is null");
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public aMU r() {
        InterfaceC5130bsu interfaceC5130bsu = this.k;
        if (interfaceC5130bsu != null) {
            return interfaceC5130bsu.s();
        }
        C1044Mm.j("ServiceManager", "getAUIAgent: service is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public InterfaceC5131bsv q() {
        InterfaceC5130bsu interfaceC5130bsu = this.k;
        if (interfaceC5130bsu != null) {
            return interfaceC5130bsu.t();
        }
        C1044Mm.j("ServiceManager", "getMdx:: service is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public IVoip y() {
        InterfaceC5130bsu interfaceC5130bsu = this.k;
        if (interfaceC5130bsu != null) {
            return interfaceC5130bsu.A();
        }
        C1044Mm.j("ServiceManager", "getVoip:: voip engine is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public InterfaceC1898aSi B() {
        InterfaceC5130bsu interfaceC5130bsu = this.k;
        if (interfaceC5130bsu != null) {
            return interfaceC5130bsu.B();
        }
        C1044Mm.j("ServiceManager", "getVoipAgent: voip agent is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public InterfaceC1843aQh k() {
        InterfaceC5130bsu interfaceC5130bsu = this.k;
        if (interfaceC5130bsu != null) {
            return interfaceC5130bsu.l();
        }
        C1044Mm.j("ServiceManager", "getESNProvider:: service is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public IClientLogging h() {
        InterfaceC5130bsu interfaceC5130bsu = this.k;
        if (interfaceC5130bsu != null) {
            return interfaceC5130bsu.o();
        }
        C1044Mm.j("ServiceManager", "getClientLogging:: service is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public InterfaceC5128bss n() {
        InterfaceC5130bsu interfaceC5130bsu = this.k;
        if (interfaceC5130bsu != null) {
            return interfaceC5130bsu.m();
        }
        C1044Mm.j("ServiceManager", "getErrorHandler:: service is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public boolean H() {
        return t() != null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public InterfaceC4208baF t() {
        InterfaceC5130bsu interfaceC5130bsu = this.k;
        if (interfaceC5130bsu == null) {
            C1044Mm.j("ServiceManager", "getOfflineAgent:: service is not available");
            return null;
        }
        InterfaceC4208baF q = interfaceC5130bsu.q();
        if (q == null) {
            C1044Mm.j("ServiceManager", "getOfflineAgent:: is null");
            return null;
        } else if (q.s()) {
            return q;
        } else {
            C1044Mm.j("ServiceManager", "getOfflineAgent:: not available ");
            return null;
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public InterfaceC4251baw p() {
        InterfaceC5130bsu interfaceC5130bsu = this.k;
        if (interfaceC5130bsu == null) {
            C1044Mm.j("ServiceManager", "getSmartDownloadController:: service is not available");
            return null;
        }
        InterfaceC4208baF q = interfaceC5130bsu.q();
        if (q == null) {
            C1044Mm.j("ServiceManager", "getOfflineAgent:: is null");
            return null;
        } else if (!q.s()) {
            C1044Mm.j("ServiceManager", "getOfflineAgent:: not available ");
            return null;
        } else {
            return q.r();
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public boolean c(String str, AssetType assetType, InterfaceC5094bsK interfaceC5094bsK) {
        synchronized (this) {
            if (str == null) {
                C1044Mm.e("ServiceManager", "fetchAndCacheResource:: resourceUrl is null");
                return false;
            }
            int b2 = b(interfaceC5094bsK);
            if (P()) {
                this.k.e(str, assetType, this.d, b2);
                return true;
            }
            C1044Mm.j("ServiceManager", "fetchAndCacheResource:: service is not available");
            return false;
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void a(InterfaceC5094bsK interfaceC5094bsK) {
        if (P()) {
            this.k.c(this.d, b(interfaceC5094bsK));
            return;
        }
        C1044Mm.j("ServiceManager", "fetchSurvey:: service is not available");
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void G() {
        if (P()) {
            this.k.H();
        } else {
            C1044Mm.j("ServiceManager", "markSurveysAsRead:: service is not available");
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void d(boolean z) {
        if (P()) {
            this.k.b(z);
        } else {
            C1044Mm.j("ServiceManager", "setNonMemberPlayback:: service is not available");
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public boolean A() {
        if (P()) {
            return this.k.C();
        }
        C1044Mm.j("ServiceManager", "isNonMemberPlayback:: service is not available");
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public DeviceCategory i() {
        if (P()) {
            return this.k.k();
        }
        C1044Mm.j("ServiceManager", "getDeviceCategory:: service is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public String v() {
        if (P()) {
            return this.k.w();
        }
        C1044Mm.j("ServiceManager", "getSoftwareVersion:: service is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public InterfaceC5109bsZ s() {
        if (P()) {
            return this.k.y();
        }
        C1044Mm.j("ServiceManager", "getSignUpParams:: service is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public boolean E() {
        if (P()) {
            return this.k.I();
        }
        C1044Mm.j("ServiceManager", "isUserLoggedIn:: service is not available");
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public boolean D() {
        if (P()) {
            return this.k.E();
        }
        C1044Mm.j("ServiceManager", "isNotActiveOrOnHold:: service is not available");
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public String w() {
        if (P()) {
            return this.k.u();
        }
        C1044Mm.j("ServiceManager", "getUserEmail:: service is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public Single<Status> K() {
        if (P()) {
            return this.k.J();
        }
        C1044Mm.j("ServiceManager", "restartMembership:: service is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public Observable<Status> Q() {
        if (P()) {
            return this.k.L();
        }
        C1044Mm.j("ServiceManager", "retryPayment:: service is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void N() {
        e(false, (String) null);
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void e(boolean z) {
        e(z, (String) null);
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void e(boolean z, String str) {
        a(z, str, (String) null);
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void a(boolean z, String str, String str2) {
        if (P()) {
            this.k.d(z, str, str2);
        } else {
            C1044Mm.j("ServiceManager", "refreshUserMessage:: service is not available");
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public UmaAlert x() {
        if (P()) {
            return this.k.D();
        }
        C1044Mm.j("ServiceManager", "getUserMessageAlert:: service is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void b() {
        if (P()) {
            this.k.j();
        } else {
            C1044Mm.j("ServiceManager", "recordUserMessageImpression:: service is not available");
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void a(String str, String str2) {
        if (P()) {
            this.k.e(str, str2);
        } else {
            C1044Mm.j("ServiceManager", "recordUserMessageImpression:: service is not available");
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void I() {
        if (P()) {
            this.k.G();
        } else {
            C1044Mm.j("ServiceManager", "optInToWhatsAppNotifications:: service is not available");
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void c(String str) {
        if (P()) {
            this.k.d(str);
        } else {
            C1044Mm.j("ServiceManager", "recordUmsAlertFeedback:: service is not available");
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public List<? extends InterfaceC5283bvo> e() {
        if (P()) {
            return this.k.f();
        }
        C1044Mm.j("ServiceManager", "getAllProfiles:: service is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public List<InterfaceC5283bvo> o() {
        if (P()) {
            ArrayList arrayList = new ArrayList();
            List<? extends InterfaceC5283bvo> f = this.k.f();
            if (f != null) {
                for (InterfaceC5283bvo interfaceC5283bvo : f) {
                    if (interfaceC5283bvo.isKidsProfile()) {
                        arrayList.add(interfaceC5283bvo);
                    }
                }
            }
            return arrayList;
        }
        C1044Mm.j("ServiceManager", "getAllProfiles:: service is not available");
        return Collections.emptyList();
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void e(String str) {
        a(str, (Long) null);
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void a(String str, Long l) {
        if (P()) {
            this.k.a(str, l);
        } else {
            C1044Mm.j("ServiceManager", "selectProfile:: service is not available");
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public boolean F() {
        if (P()) {
            return this.k.F();
        }
        C1044Mm.j("ServiceManager", "isProfileSwitchInProgress:: service is not available");
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void a(String str, boolean z, String str2, Integer num, InterfaceC5094bsK interfaceC5094bsK) {
        if (P()) {
            this.k.d(str, z, str2, num, this.d, b(interfaceC5094bsK));
            return;
        }
        C1044Mm.j("ServiceManager", "addProfile:: service is not available");
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void a(String str, String str2, Boolean bool, String str3, Integer num, String str4, List<String> list, Boolean bool2, Boolean bool3, InterfaceC5094bsK interfaceC5094bsK) {
        if (P()) {
            this.k.c(str, str2, bool, str3, num, str4, list, bool2, bool3, this.d, b(interfaceC5094bsK));
            return;
        }
        C1044Mm.j("ServiceManager", "editProfile:: service is not available");
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void d(String str, InterfaceC5094bsK interfaceC5094bsK) {
        if (P()) {
            this.k.d(str, this.d, b(interfaceC5094bsK));
            return;
        }
        C1044Mm.j("ServiceManager", "removeProfile:: service is not available");
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void a(String str, InterfaceC5284bvp interfaceC5284bvp, InterfaceC5094bsK interfaceC5094bsK) {
        if (P()) {
            this.k.b(str, interfaceC5284bvp, this.d, b(interfaceC5094bsK));
            return;
        }
        C1044Mm.j("ServiceManager", "updateProfileSubtitlePrefs:: service is not available");
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public boolean e(InterfaceC5094bsK interfaceC5094bsK) {
        if (P()) {
            this.k.d(this.d, b(interfaceC5094bsK));
            return true;
        }
        C1044Mm.j("ServiceManager", "fetchAvailableAvatarsList:: service is not available");
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void b(String str, InterfaceC5094bsK interfaceC5094bsK) {
        if (P()) {
            this.k.a(str, this.d, b(interfaceC5094bsK));
            return;
        }
        C1044Mm.j("ServiceManager", "resolveUmsSimpleUrlPattern:: service is not available");
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void d(InterfaceC5094bsK interfaceC5094bsK) {
        if (P()) {
            this.k.e(this.d, b(interfaceC5094bsK));
            return;
        }
        C1044Mm.j("ServiceManager", "getProductChoices:: service is not available");
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void c(String str, InterfaceC5094bsK interfaceC5094bsK) {
        if (P()) {
            this.k.e(this.d, b(interfaceC5094bsK), str);
            return;
        }
        C1044Mm.j("ServiceManager", "getProductChoices:: service is not available");
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void a(String str, String str2, String str3, String str4, Boolean bool, InterfaceC5094bsK interfaceC5094bsK) {
        if (P()) {
            this.k.b(this.d, b(interfaceC5094bsK), str, str2, str3, str4, bool);
            return;
        }
        C1044Mm.j("ServiceManager", "getProductChoices:: service is not available");
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void e(int i, String str, String str2, Boolean bool, InterfaceC5094bsK interfaceC5094bsK) {
        if (P()) {
            this.k.c(i, str, str2, bool, this.d, b(interfaceC5094bsK));
            return;
        }
        C1044Mm.j("ServiceManager", "updatePlan:: service is not available");
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public UserAgent L() {
        UserAgent u = u();
        if (u != null) {
            return u;
        }
        throw new IllegalStateException("user agent is null");
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public UserAgent u() {
        if (P()) {
            return this.k.v();
        }
        C1044Mm.j("ServiceManager", "getUserAgent:: service is not available");
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public aSE m() {
        if (P()) {
            return this.k.p();
        }
        C1044Mm.j("ServiceManager", "getFalkorAgent:: service is not available");
        return null;
    }

    /* renamed from: o.bsR$e */
    /* loaded from: classes4.dex */
    class e implements InterfaceC5133bsx {
        private e() {
        }

        @Override // o.InterfaceC5133bsx
        public void onServiceReady(int i, Status status, String str) {
            C1044Mm.a("ServiceManager", "onServiceReady clientId=%d, res.getStatusCode()=%s, statusMessage=%s", Integer.valueOf(i), status.c(), str);
            C5101bsR.this.d = i;
            InterfaceC5091bsH interfaceC5091bsH = C5101bsR.this.b;
            if (interfaceC5091bsH != null) {
                if (status.j()) {
                    C5101bsR.this.a = new C5084bsA(ServiceManager.InitializationState.INITIALIZED_SUCCESSFULLY, status, str);
                    interfaceC5091bsH.onManagerReady(C5101bsR.this, status);
                    return;
                }
                C5101bsR.this.a = new C5084bsA(ServiceManager.InitializationState.INITIALIZATION_FAILED, status, str);
                interfaceC5091bsH.onManagerUnavailable(C5101bsR.this, status);
            }
        }

        @Override // o.InterfaceC5133bsx
        public void onLoMosFetched(int i, List<LoMo> list, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                return;
            }
            b.o(list, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onVideosFetched(int i, List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                return;
            }
            b.d(list, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onFlatGenreVideosFetched(int i, ListOfMoviesSummary listOfMoviesSummary, List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status) {
            d(status, i);
            C1044Mm.a("ServiceManager", "onFlatGenreVideosFetched requestId=%s, errorCode=%s, requestedVideos=%s", Integer.valueOf(i), status.c(), list);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.a("ServiceManager", "No callback for onVideosFetched requestId %s", Integer.valueOf(i));
            } else {
                b.d(listOfMoviesSummary, list, status);
            }
        }

        @Override // o.InterfaceC5133bsx
        public void onLoLoMoSummaryFetched(int i, InterfaceC5156btT interfaceC5156btT, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onLoLoMoSummaryFetched requestId " + i);
                return;
            }
            b.e(interfaceC5156btT, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onResourceFetched(int i, String str, String str2, Status status) {
            d(status, i);
            InterfaceC5094bsK d = C5101bsR.this.e.d(i);
            if (d == null) {
                C1044Mm.e("ServiceManager", "No callback for onResourceFetched requestId " + i);
                return;
            }
            d.b(str, str2, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onResourceCached(int i, String str, String str2, long j, long j2, Status status) {
            d(status, i);
            InterfaceC5094bsK d = C5101bsR.this.e.d(i);
            if (d == null) {
                C1044Mm.e("ServiceManager", "No callback for onResourceCached requestId " + i);
                return;
            }
            d.a(str, str2, j, j2, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onLoginComplete(int i, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onLoginComplete requestId " + i);
                return;
            }
            b.b(status);
        }

        @Override // o.InterfaceC5133bsx
        public void onLogoutComplete(int i, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onLogoutComplete requestId " + i);
                return;
            }
            b.d(status);
        }

        @Override // o.InterfaceC5133bsx
        public void onVideoSummaryFetched(int i, InterfaceC5223buh interfaceC5223buh, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onVideoSummaryFetched requestId " + i);
                return;
            }
            b.d(interfaceC5223buh, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onFalkorVideoFetched(int i, InterfaceC8366diy interfaceC8366diy, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onFalkorVideoFetched requestId " + i);
                return;
            }
            b.e(interfaceC8366diy, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onMovieDetailsFetched(int i, InterfaceC5238buw interfaceC5238buw, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onMovieDetailsFetched requestId " + i);
                return;
            }
            b.d(interfaceC5238buw, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onScenePositionFetched(int i, int i2, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onScenePositionFetched requestId " + i);
                return;
            }
            b.c(i2, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onKidsCharacterDetailsFetched(int i, InterfaceC5230buo interfaceC5230buo, Boolean bool, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onKidsCharacterDetailsFetched requestId " + i);
                return;
            }
            b.a(interfaceC5230buo, bool, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onEpisodeDetailsFetched(int i, InterfaceC5227bul interfaceC5227bul, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onEpisodeDetailsFetched requestId " + i);
                return;
            }
            b.e(interfaceC5227bul, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onCWVideosFetched(int i, List<InterfaceC5222bug<InterfaceC5179btq>> list, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onCWVideosFetched requestId " + i);
                return;
            }
            b.a(list, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onPostPlayVideosFetched(int i, InterfaceC5190buA interfaceC5190buA, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onPostPlayVideoFetched requestId " + i);
                return;
            }
            b.b(interfaceC5190buA, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onEpisodesFetched(int i, List<InterfaceC5227bul> list, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onEpisodesFetched requestId " + i);
                return;
            }
            b.h(list, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onSeasonsFetched(int i, List<InterfaceC5195buF> list, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onSeasonsFetched requestId " + i);
                return;
            }
            b.k(list, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onShowDetailsFetched(int i, InterfaceC5194buE interfaceC5194buE, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onShowDetailsFetched requestId " + i);
                return;
            }
            b.e(interfaceC5194buE, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onShowDetailsAndSeasonsFetched(int i, InterfaceC5194buE interfaceC5194buE, List<InterfaceC5195buF> list, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onShowDetailsAndSeasonsFetched requestId " + i);
                return;
            }
            b.a(interfaceC5194buE, list, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onGenreListsFetched(int i, List<GenreItem> list, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onGenreListsFetched requestId " + i);
                return;
            }
            b.i(list, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onVideoRatingSet(int i, InterfaceC5157btU interfaceC5157btU, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onVideoRatingSet requestId " + i);
                return;
            }
            b.b(interfaceC5157btU, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onSurveyFetched(int i, Survey survey, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onSurveyFetched requestId " + i);
                return;
            }
            b.a(survey, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onAdvisoriesFetched(int i, List<Advisory> list, Status status) {
            d(status, i);
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onAdvisoriesFetched requestId " + i);
                return;
            }
            b.c(list, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onSimsFetched(int i, List<InterfaceC8366diy> list, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b != null) {
                b.n(list, status);
            }
        }

        @Override // o.InterfaceC5133bsx
        public void onInteractiveMomentsFetched(int i, InteractiveMoments interactiveMoments, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b != null) {
                b.d(interactiveMoments, status);
            }
        }

        @Override // o.InterfaceC5133bsx
        public void onInteractiveDebugMenuItemsFetched(int i, List<InteractiveDebugMenuItem> list, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b != null) {
                b.j(list, status);
            }
        }

        @Override // o.InterfaceC5133bsx
        public void onInteractiveResetStateFetched(int i, StateHistory stateHistory, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b != null) {
                b.d(stateHistory, status);
            }
        }

        @Override // o.InterfaceC5133bsx
        public void onDownloadedForYouFetched(int i, List<InterfaceC5184btv> list, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b != null) {
                b.f(list, status);
            }
        }

        @Override // o.InterfaceC5133bsx
        public void onUmsSimpleUrlPatternResolved(int i, ResolveSimpleUrlPatternResponse resolveSimpleUrlPatternResponse, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b != null) {
                b.d(resolveSimpleUrlPatternResponse, status);
            }
        }

        @Override // o.InterfaceC5133bsx
        public void onProductChoiceResponse(int i, MembershipChoicesResponse membershipChoicesResponse, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b != null) {
                b.c(membershipChoicesResponse, status);
            }
        }

        @Override // o.InterfaceC5133bsx
        public void onUpdateProductChoiceResponse(int i, UpdateProductChoiceResponse updateProductChoiceResponse, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b != null) {
                b.c(updateProductChoiceResponse, status);
            }
        }

        @Override // o.InterfaceC5133bsx
        public void onBooleanResponse(int i, boolean z, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b != null) {
                b.a(z, status);
            }
        }

        @Override // o.InterfaceC5133bsx
        public void onVideoSharingInfoFetched(int i, InterfaceC5198buI interfaceC5198buI, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b != null) {
                b.d(interfaceC5198buI, status);
            }
        }

        @Override // o.InterfaceC5133bsx
        public void onQueueAdd(int i, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onQueueAdd requestId " + i);
                return;
            }
            b.a(status);
        }

        @Override // o.InterfaceC5133bsx
        public void onQueueRemove(int i, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onQueueRemove requestId " + i);
                return;
            }
            b.c(status);
        }

        @Override // o.InterfaceC5133bsx
        public void onSearchResultsFetched(int i, InterfaceC5275bvg interfaceC5275bvg, Status status, boolean z) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onSearchResultsFetched requestId " + i);
                return;
            }
            b.c(interfaceC5275bvg, status, z);
        }

        public int hashCode() {
            int hashCode = super.hashCode();
            return hashCode < 0 ? -hashCode : hashCode;
        }

        @Override // o.InterfaceC5133bsx
        public void onBBVideosFetched(int i, List<InterfaceC5222bug<InterfaceC5180btr>> list, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onBBVideosFetched requestId " + i);
                return;
            }
            b.b(list, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onTallPanelVideosFetched(int i, List<InterfaceC5222bug<InterfaceC5216bua>> list, Status status) {
            d(status, i);
            C1044Mm.a("ServiceManager", "onTallPanelVideosFetched requestId=%d errorCode=%s", Integer.valueOf(i), status.c());
            C1044Mm.a("ServiceManager", "onTallPanelVideosFetched requestedVideos=%s", list);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.a("ServiceManager", "No callback for onTallPanelVideosFetched requestId %d", Integer.valueOf(i));
            } else {
                b.e(list, status);
            }
        }

        @Override // o.InterfaceC5133bsx
        public void onAvailableAvatarsListFetched(int i, List<AvatarInfo> list, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onAvailableAvatarsListFetched requestId " + i);
                return;
            }
            b.g(list, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onNotificationsListFetched(int i, NotificationsListSummary notificationsListSummary, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onNotificationsListFetched requestId " + i);
                return;
            }
            b.d(notificationsListSummary, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onNotificationSummaryFetched(int i, NotificationSummaryItem notificationSummaryItem, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onNotificationSummaryFetched requestId " + i);
                return;
            }
            b.c(notificationSummaryItem, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onNotificationsMarkedAsRead(int i, List<NotificationSummaryItem> list, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onNotificationsMarkedAsRead requestId " + i);
                return;
            }
            b.l(list, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onProfileListUpdateStatus(int i, Status status, AccountData accountData) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onProfileListUpdateStatus requestId " + i);
                return;
            }
            b.d(status, accountData);
        }

        @Override // o.InterfaceC5133bsx
        public void onAccountDataFetched(int i, AccountData accountData, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onAccountDataFetched requestId " + i);
                return;
            }
            b.b(accountData, status);
        }

        @Override // o.InterfaceC5133bsx
        public void onAutoLoginTokenCreated(int i, String str, Status status) {
            d(status, i);
            InterfaceC5094bsK b = C5101bsR.this.b(i);
            if (b == null) {
                C1044Mm.e("ServiceManager", "No callback for onAutoLoginTokenCreated requestId " + i);
                return;
            }
            b.b(str, status);
        }

        private void d(Status status, int i) {
            if (status instanceof NetflixStatus) {
                ((NetflixStatus) status).e(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bsR$b */
    /* loaded from: classes4.dex */
    public static class b {
        private final ArrayList<c> b;

        private b() {
            this.b = new ArrayList<>();
        }

        public int d(InterfaceC5094bsK interfaceC5094bsK) {
            int c2;
            synchronized (this) {
                c cVar = new c(interfaceC5094bsK);
                this.b.add(cVar);
                c2 = cVar.c();
            }
            return c2;
        }

        public InterfaceC5094bsK d(int i) {
            synchronized (this) {
                Iterator<c> it = this.b.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.c() == i) {
                        this.b.remove(next);
                        return next.a();
                    }
                }
                return null;
            }
        }

        public void b() {
            synchronized (this) {
                this.b.clear();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.bsR$b$c */
        /* loaded from: classes4.dex */
        public static class c {
            private static int d;
            private final InterfaceC5094bsK a;
            private final int e;

            public InterfaceC5094bsK a() {
                return this.a;
            }

            public int c() {
                return this.e;
            }

            public c(InterfaceC5094bsK interfaceC5094bsK) {
                int i = d + 1;
                d = i;
                this.e = i;
                this.a = interfaceC5094bsK;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ComponentName componentName, IBinder iBinder) {
        C1044Mm.a("ServiceManager", "ServiceConnected with IBinder: %s ", iBinder);
        String simpleName = iBinder.getClass().getSimpleName();
        if (simpleName.contains("BinderProxy")) {
            C1596aHd e2 = new C1596aHd("SPY-34154: We received BinderProxy when we should NOT").b(false).b(ErrorType.c).e("serviceClass", simpleName);
            C1596aHd e3 = e2.e("componentPackage", componentName.getPackageName() + "");
            InterfaceC1597aHe.b(e3.e("componentClass", componentName.getClassName() + ""));
        }
    }

    private Intent R() {
        return new Intent(this.h, NetflixService.class);
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void d(String str, boolean z) {
        if (this.k != null) {
            C5113bsd.b().d(str, z);
        }
    }

    private InterfaceC5094bsK d(InterfaceC5094bsK interfaceC5094bsK, String str) {
        return new a(interfaceC5094bsK, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bsR$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC5164btb {
        private final InterfaceC5094bsK a;
        private final String d;

        private a(InterfaceC5094bsK interfaceC5094bsK, String str) {
            this.a = interfaceC5094bsK;
            this.d = str;
            if (C5101bsR.this.k != null) {
                C5113bsd.b().d(str);
            }
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void d(InterfaceC5238buw interfaceC5238buw, Status status) {
            super.d(interfaceC5238buw, status);
            this.a.d(interfaceC5238buw, status);
            c(status, interfaceC5238buw != null && interfaceC5238buw.ap(), false);
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void e(InterfaceC5194buE interfaceC5194buE, Status status) {
            super.e(interfaceC5194buE, status);
            this.a.e(interfaceC5194buE, status);
            c(status, interfaceC5194buE != null && interfaceC5194buE.ap(), false);
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void a(InterfaceC5194buE interfaceC5194buE, List<InterfaceC5195buF> list, Status status) {
            super.a(interfaceC5194buE, list, status);
            this.a.a(interfaceC5194buE, list, status);
            c(status, interfaceC5194buE != null && interfaceC5194buE.ap(), false);
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void a(Status status) {
            super.a(status);
            this.a.a(status);
            c(status, true, true);
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void c(Status status) {
            super.c(status);
            this.a.c(status);
            c(status, false, true);
        }

        private void c(Status status, boolean z, boolean z2) {
            if (C5101bsR.this.k == null) {
                return;
            }
            if (status.j()) {
                C5113bsd.b().d(this.d, z);
            } else {
                C5113bsd.b().d(this.d, z, z2);
            }
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager, o.InterfaceC5135bsz
    public boolean c() {
        return this.k != null && this.a.e() == ServiceManager.InitializationState.INITIALIZED_SUCCESSFULLY;
    }

    private int b(InterfaceC5094bsK interfaceC5094bsK) {
        if (interfaceC5094bsK != null) {
            return this.e.d(interfaceC5094bsK);
        }
        C1044Mm.d("ServiceManager", "Callback that is added is null!");
        return 0;
    }

    private boolean P() {
        if (!c() || this.d < 0) {
            InterfaceC1598aHf.a(new C1596aHd("SPY-17272 - ServiceMgr called before NetflixService is ready").b(false).e(true).e("mConnects", String.valueOf(this.f)).e("mDisconnects", String.valueOf(this.i)).e("initializationResult", String.valueOf(this.a)).e("mService", String.valueOf(this.k)).e("mClientId", String.valueOf(this.d)));
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC5094bsK b(int i) {
        return this.e.d(i);
    }

    @Override // o.InterfaceC5135bsz
    public int c(InterfaceC5094bsK interfaceC5094bsK) {
        return b(interfaceC5094bsK);
    }

    @Override // o.InterfaceC5135bsz
    public int e(InterfaceC5094bsK interfaceC5094bsK, String str) {
        return b(d(interfaceC5094bsK, str));
    }

    @Override // o.InterfaceC5135bsz
    public InterfaceC5127bsr a() {
        P();
        return this.k.g();
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void S() {
        InterfaceC5130bsu interfaceC5130bsu = this.k;
        if (interfaceC5130bsu != null) {
            interfaceC5130bsu.N();
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public void a(Intent intent) {
        InterfaceC5130bsu interfaceC5130bsu = this.k;
        if (interfaceC5130bsu == null) {
            C1044Mm.d("ServiceManager", "sendIntentToNetflixService mService is null");
        } else {
            interfaceC5130bsu.e(intent);
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public NetflixJobExecutor a(NetflixJob.NetflixJobId netflixJobId) {
        InterfaceC5130bsu interfaceC5130bsu = this.k;
        if (interfaceC5130bsu == null) {
            C1044Mm.d("ServiceManager", "getNetflixJobExecutor mService is null");
            return null;
        }
        return interfaceC5130bsu.d(netflixJobId);
    }

    @Override // com.netflix.mediaclient.servicemgr.ServiceManager
    public boolean C() {
        aOV g = g();
        if (g != null) {
            return g.ai();
        }
        return false;
    }
}
