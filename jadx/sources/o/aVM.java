package o;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.content.ContextCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.mdx.MdxErrorCode;
import com.netflix.mediaclient.service.mdx.MdxErrorSubCode;
import com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IMdxSharedState;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.util.ConnectivityUtils;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C2000aWd;
import o.C2010aWn;
import o.C2013aWq;
import o.C5095bsL;
import o.C8241dgf;
import o.aVM;
import o.aVX;
import o.cVO;
import o.cVS;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class aVM extends aMF implements InterfaceC5131bsv, InterfaceC2015aWs, MdxNotificationIntentRetriever, C2013aWq.a, C2010aWn.d, C2000aWd.b, aGS {
    private static final long a;
    private static final long c;
    private static final long e = TimeUnit.SECONDS.toMillis(5);
    private boolean A;
    private int C;
    private String D;
    private int E;
    private C2012aWp F;
    private C2013aWq G;
    private String H;
    private cVS.c I;

    /* renamed from: J  reason: collision with root package name */
    private cVO.c f13447J;
    private cVQ L;
    private int M;
    private WifiManager.WifiLock P;
    private InterfaceC5198buI R;
    private Disposable U;
    private Bitmap d;
    private final InterfaceC9638uF f;
    private aVL h;
    private final aOV i;
    private boolean j;
    private final AtomicBoolean k;
    private HandlerThread l;
    private final Handler m;
    private final aGT n;

    /* renamed from: o  reason: collision with root package name */
    private aWP f13448o;
    private C2000aWd p;
    private aVI r;
    private aWY s;
    private int t;
    private aVJ u;
    private final aHJ v;
    private int w;
    private C2001aWe x;
    private PowerManager.WakeLock y;
    private C2010aWn z;
    private final AtomicBoolean g = new AtomicBoolean(false);
    private C8241dgf.e O = new C8241dgf.e();
    private C8241dgf.e Q = new C8241dgf.e();
    private final Object q = new Object();
    private List<String> K = new ArrayList();
    private final int N = 3;
    private final PublishSubject<dpR> b = PublishSubject.create();
    private final BroadcastReceiver B = new BroadcastReceiver() { // from class: o.aVM.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            aVX b;
            C2003aWg d2;
            if (intent.hasCategory("com.netflix.mediaclient.intent.category.MDX")) {
                if (intent.getAction().equals("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_PLAYBACKEND")) {
                    c(intent);
                } else if (intent.getAction().equals("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_PLAYBACKSTART")) {
                    a();
                } else {
                    boolean z = false;
                    if ("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_STATE".equals(intent.getAction())) {
                        if (aVM.this.g() != null && aVM.this.g().c() == IMdxSharedState.MdxPlaybackState.Transitioning) {
                            aVM.this.F();
                            if (aVM.this.s.e()) {
                                aVM.this.s.a(aVM.this.getServiceNotificationHelper());
                            }
                        }
                        if (aVM.this.r != null) {
                            aVM.this.r.d(intent.getIntExtra("volume", 0), false);
                            aVM.this.r.e(intent.getStringExtra("currentState"), intent.getIntExtra("time", -1));
                        }
                    } else if ("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_POSTPLAY".equals(intent.getAction())) {
                        b(intent);
                    } else if (intent.getAction().equals("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_SIMPLE_PLAYBACKSTATE")) {
                        e(intent);
                    } else if (intent.getAction().equals("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_ERROR")) {
                        int intExtra = intent.getIntExtra("errorCode", 0);
                        boolean z2 = MdxErrorSubCode.a(intExtra) || intExtra == MdxErrorSubCode.SessionAbruptlyEnded.d() || intExtra == MdxErrorSubCode.DeviceIsLost.d();
                        aVM.this.u();
                        if (aVM.this.u != null && (d2 = aVM.this.u.d(aVM.this.i())) != null) {
                            if (IMdxSharedState.MdxPlaybackState.Loading == d2.c() || IMdxSharedState.MdxPlaybackState.Transitioning == d2.c()) {
                                z = true;
                            }
                            if (z2 && z) {
                                C1044Mm.e("MdxAgent", "MdxAgent: received error, clear video detail");
                                aVM.this.C();
                            }
                        }
                        if (z2) {
                            aVM.this.F.n().d((AbstractC2065aYo) null);
                            aVM.this.F.w();
                        }
                        if (aVM.this.F == null || intExtra != MdxErrorSubCode.RemoteLoginOnlyFailed.d()) {
                            return;
                        }
                        aVM.this.a(intent.getStringExtra("uuid"), 4);
                    } else if ("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REMOTE_LOGIN_STATUS".equals(intent.getAction()) && aVM.this.F != null) {
                        boolean booleanExtra = intent.getBooleanExtra("remoteLoginStarted", false);
                        boolean booleanExtra2 = intent.getBooleanExtra("remoteLoginCompleted", false);
                        if (booleanExtra && booleanExtra2) {
                            String stringExtra = intent.getStringExtra("uuid");
                            String stringExtra2 = intent.getStringExtra("errorDisplayCode");
                            int i = C8168dfL.g(stringExtra2) ? 3 : 4;
                            if (i == 4 && (b = aVX.b(stringExtra2)) != null && "43".equals(b.d())) {
                                i = 5;
                            }
                            aVM.this.a(stringExtra, i);
                        }
                    } else if ("com.netflix.mediaclient.intent.action.MDX_ACTION_REMOTE_LOGIN_REQUESTED_BY_TARGET".equals(intent.getAction())) {
                        String stringExtra3 = intent.getStringExtra("uuid");
                        String stringExtra4 = intent.getStringExtra("remoteLoginSessionUuid");
                        String stringExtra5 = intent.getStringExtra("friendlyName");
                        MdxLoginPolicyEnum e2 = MdxLoginPolicyEnum.e(intent.getIntExtra("remoteLoginPolicy", 0));
                        if (C8168dfL.h(stringExtra3) && C8168dfL.h(stringExtra5) && e2 != null) {
                            if (e2.d(MdxLoginPolicyEnum.LoginOnlyRequestedByTarget) || e2.d(MdxLoginPolicyEnum.LoginAndPairRequestedByTarget)) {
                                cVQ cvq = new cVQ(stringExtra3, stringExtra5, Integer.valueOf(e2.a()), stringExtra4);
                                if (aVM.this.f13447J != null) {
                                    aVM.this.f13447J.a(cvq);
                                } else {
                                    aVM.this.L = cvq;
                                }
                            }
                        }
                    } else if (!"com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REGPAIR_PIN_CONFIRMATION_DIALOG_SHOW".equals(intent.getAction()) || aVM.this.f13447J == null) {
                    } else {
                        String stringExtra6 = intent.getStringExtra("uuid");
                        C1999aWc d3 = C1999aWc.d(intent.getIntExtra("remoteLoginPolicy", 0));
                        if (d3 != null) {
                            if ((d3.a(MdxLoginPolicyEnum.LoginOnlyRequestedByTarget) || d3.a(MdxLoginPolicyEnum.LoginAndPairRequestedByTarget)) && C8168dfL.h(stringExtra6) && !aVM.this.f13447J.b(stringExtra6) && aVM.this.F != null) {
                                aVM.this.F.e();
                            }
                        }
                    }
                }
            }
        }

        private void e(Intent intent) {
            boolean booleanExtra = intent.getBooleanExtra("paused", false);
            boolean booleanExtra2 = intent.getBooleanExtra("transitioning", false);
            boolean a2 = aVM.this.a(intent);
            boolean booleanExtra3 = intent.getBooleanExtra("isInSkipIntroWindow", false);
            String stringExtra = intent.getStringExtra("skipIntroType");
            aVM.this.F();
            if (aVM.this.r != null) {
                aVM.this.r.c(booleanExtra, booleanExtra2, a2);
            }
            aVM.this.s.c(booleanExtra, booleanExtra2, booleanExtra3, stringExtra);
        }

        private void b(Intent intent) {
            String string = intent.getExtras().getString("postplayState");
            if (C8168dfL.g(string)) {
                return;
            }
            C5095bsL c5095bsL = new C5095bsL(string);
            if (c5095bsL.d()) {
                c(intent, string);
            } else if (c5095bsL.e()) {
                e(intent, string);
            }
        }

        private void c(Intent intent, String str) {
            aVM.this.F();
            d(str);
            if (aVM.this.r != null) {
                aVM.this.r.c(false, false, true);
            }
            aVM.this.s.a((Notification) aVM.this.e(true).second, aVM.this.getServiceNotificationHelper(), true);
            aVM.this.s.d(false, false, true);
        }

        private void e(Intent intent, String str) {
            C8241dgf.e n = aVM.this.n();
            if (n != null) {
                AbstractC1761aNg abstractC1761aNg = new AbstractC1761aNg() { // from class: o.aVM.2.3
                    @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
                    public void b(InterfaceC5190buA interfaceC5190buA, Status status) {
                        List<InterfaceC5191buB> aB;
                        if (!status.j() || interfaceC5190buA == null || (aB = interfaceC5190buA.aB()) == null || aB.size() <= 0) {
                            return;
                        }
                        String id = aB.get(0).getId();
                        if (TextUtils.isEmpty(id)) {
                            return;
                        }
                        aVM.this.b(id);
                    }
                };
                InterfaceC1912aSw f = new C6004cQk().f();
                Objects.requireNonNull(f);
                f.e(String.valueOf(n.e), n.d(), PlayLocationType.MDX, abstractC1761aNg);
            }
        }

        private void a() {
            C1044Mm.e("MdxAgent", "MdxAgent: receive MDX_ACTION_UPDATE_PLAYBACKSTART");
            aVM.this.p.a();
            aVM.this.N();
            aVM.this.F();
            if (aVM.this.r != null) {
                aVM.this.r.b();
            }
            aVM.this.s.a((Notification) aVM.this.e(false).second, aVM.this.getServiceNotificationHelper(), false);
            aVM.this.s.c(false, false, false, "");
            aVM.this.s.e(aVM.this.d);
            if (aVM.this.G != null) {
                aVM.this.G.d();
            }
        }

        private void c(Intent intent) {
            if (aVM.this.a(intent)) {
                return;
            }
            C1044Mm.e("MdxAgent", "MdxAgent: receive MDX_ACTION_UPDATE_PLAYBACKEND");
            aVM.this.p.b();
            aVM.this.C();
            aVM.this.u();
            aVM.this.R();
            if (aVM.this.G != null) {
                aVM.this.G.a();
            }
            if (aVM.this.z != null) {
                aVM.this.z.c();
            }
        }

        private void d(String str) {
            C5095bsL c5095bsL = new C5095bsL(str);
            if (c5095bsL.d()) {
                C5095bsL.b[] c2 = c5095bsL.c();
                if (c2 == null) {
                    C1044Mm.e("MdxAgent", "updateVideoIdsForPostplay - titles array is null - postPlayState: %s", str);
                    InterfaceC1598aHf.a("MdxAgent updateVideoIdsForPostplay - titles array is null - postPlayState: " + str);
                } else if (c2.length <= 0 || !c2[0].c() || c2[0].a() == null) {
                } else {
                    aVM.this.Q = new C8241dgf.e();
                    aVM.this.Q.c = true;
                    aVM.this.Q.e = c2[0].a();
                    aVM.this.e(false, true);
                }
            }
        }
    };
    private final BroadcastReceiver S = new BroadcastReceiver() { // from class: o.aVM.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                C1044Mm.b("MdxAgent", "Null intent");
            } else if (!aVM.this.isReady()) {
                C1044Mm.e("MdxAgent", "mUserAgentReceiver MdxAgent not ready, ignoring");
            } else {
                String action = intent.getAction();
                if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE".equals(action)) {
                    C1044Mm.e("MdxAgent", "user profile is active");
                    aVM.this.d(true);
                } else if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_DEACTIVE".equals(action)) {
                    C1044Mm.e("MdxAgent", "user profile is not active");
                    aVM.this.d(false);
                } else if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_ACTIVE".equals(action)) {
                    aVM.this.y();
                    C1044Mm.e("MdxAgent", "user account is activated");
                } else if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE".equals(action)) {
                    aVM.this.K();
                    C1044Mm.e("MdxAgent", "user account is deactivated");
                }
            }
        }
    };
    private final Runnable X = new Runnable() { // from class: o.aVM.1
        @Override // java.lang.Runnable
        public void run() {
            if (aVM.this.isReady()) {
                C1044Mm.b("MdxAgent", "preNConnectivityHandler calling doHandleConnectivityChange");
                aVM.this.I();
            }
        }
    };

    @Override // o.aMF
    public String agentName() {
        return "mdx";
    }

    public C8241dgf.e m() {
        return this.Q;
    }

    @Deprecated
    public InterfaceC5198buI o() {
        return this.R;
    }

    @Override // o.InterfaceC5131bsv
    public boolean p() {
        return this.j;
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        a = timeUnit.toMillis(20L);
        c = timeUnit.toMillis(1L);
    }

    public aVM(aOV aov, aHJ ahj, aGT agt) {
        C1044Mm.e("MdxAgent", "MdxAgent: start");
        this.k = new AtomicBoolean(false);
        this.i = aov;
        this.v = ahj;
        HandlerThread handlerThread = new HandlerThread("MdxAgentWorker");
        this.l = handlerThread;
        handlerThread.start();
        this.m = new Handler(this.l.getLooper());
        this.f = InterfaceC9638uF.a.d(getContext());
        this.n = agt;
        C1332Xp.d(InterfaceC5131bsv.class, this, true);
    }

    @Override // o.InterfaceC5131bsv
    public Pair<String, String>[] l() {
        if (!this.n.c()) {
            C1044Mm.j("MdxAgent", "getTargetList:: consent not given, return null");
            return null;
        }
        C2012aWp c2012aWp = this.F;
        if (c2012aWp != null) {
            return c2012aWp.l();
        }
        return null;
    }

    @Override // o.InterfaceC5131bsv
    public void c(final String str) {
        final String i = i();
        boolean d2 = C8168dfL.d(str, i);
        C1044Mm.a("MdxAgent", "MdxAgent: setCurrentTarget %s => %s ", i, str);
        if (C8168dfL.g(str)) {
            C();
        }
        final boolean z = !d2;
        this.m.post(new Runnable() { // from class: o.aVU
            @Override // java.lang.Runnable
            public final void run() {
                aVM.this.b(str, z, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, boolean z, String str2) {
        C2012aWp c2012aWp = this.F;
        if (c2012aWp == null) {
            InterfaceC1598aHf.a(new C1596aHd("MDX: Unable to set target, target manager is null").b(ErrorType.k).b(true).e("initCompleted", String.valueOf(isInitCompleted())).e("initCalled", String.valueOf(isInitCalled())).e("ready", String.valueOf(isReady())).e("uuid", str != null ? null : ""));
            return;
        }
        if (z && C8168dfL.h(str2)) {
            c2012aWp.i(str2);
        }
        c2012aWp.b(str, true);
    }

    @Override // o.InterfaceC5131bsv
    public boolean e(String str) {
        if (C8168dfL.h(str)) {
            if (str.equals(i())) {
                return true;
            }
            c(str);
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC5131bsv
    public boolean c(String str, String str2) {
        String l = this.F.l(str);
        this.F.a(l, str2);
        return e(l);
    }

    @Override // o.InterfaceC5131bsv
    public String i() {
        C2013aWq c2013aWq = this.G;
        return c2013aWq != null ? c2013aWq.b() : "";
    }

    public JSONObject j() {
        C2013aWq c2013aWq = this.G;
        if (c2013aWq != null) {
            return c2013aWq.c();
        }
        return null;
    }

    @Override // o.InterfaceC5131bsv
    public C2005aWi h() {
        C2012aWp c2012aWp = this.F;
        if (c2012aWp != null) {
            return c2012aWp.k();
        }
        return null;
    }

    @Override // o.InterfaceC5131bsv
    public C8241dgf.e n() {
        C2012aWp c2012aWp = this.F;
        if (c2012aWp != null) {
            return c2012aWp.p();
        }
        return null;
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.MDX_AGENT_LOADED;
    }

    @Override // o.aMF
    public void doInit() {
        C1044Mm.a("MdxAgent", "MdxAgent: doInit");
        this.n.b(this);
        try {
            IClientLogging loggingAgent = getLoggingAgent();
            if (loggingAgent != null && loggingAgent.e() != null) {
                this.f13448o = new aWP(loggingAgent.e(), this.i);
                try {
                    Q();
                    P();
                    this.u = new aVJ(getContext());
                    this.G = new C2013aWq(getContext(), this);
                    C2012aWp c2012aWp = new C2012aWp(this.u, this.i.w().m(), this.l.getLooper(), getMainHandler(), this.G, this.f13448o);
                    this.F = c2012aWp;
                    this.h = new aVL(c2012aWp);
                    this.z = new C2010aWn(this.F, this);
                    AbstractC2065aYo.c(this.i.w().m());
                    if (!this.i.H().b()) {
                        this.F.c(getContext(), this, getMSLClient(), this.v);
                    } else {
                        C1044Mm.e("MdxAgent", "legacy Netflix MDX is disabled.");
                    }
                    this.p = new C2000aWd(this, this.m);
                    this.r = new C2006aWj(this, this.i.H());
                    y();
                    this.u.e();
                    handleConnectivityChange(TN.a.d());
                    initCompleted(InterfaceC1078Nw.aJ);
                } catch (Throwable th) {
                    C1044Mm.e("MdxAgent", "failed init of constructors used for target device management", th);
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ad;
                    aVX d2 = new aVX.d(MdxErrorCode.MdxInitFailed).b(MdxErrorSubCode.MdxInitFailed).c(netflixImmutableStatus.c().getValue()).d(C1044Mm.d(th)).d();
                    initCompleted(netflixImmutableStatus);
                    this.f13448o.e().b(d2, null);
                }
                C1044Mm.d("MdxAgent", "MdxAgent: doInit done.");
                return;
            }
            C1044Mm.d("MdxAgent", "logging agent null at mdx doInit");
            initCompleted(InterfaceC1078Nw.aD);
        } catch (Throwable th2) {
            C1044Mm.d("MdxAgent", C1044Mm.d(th2));
            initCompleted(InterfaceC1078Nw.aD);
        }
    }

    private void c(CompletableSubject completableSubject) {
        if (!B()) {
            C1044Mm.j("MdxAgent", "createCastStack - cannot create cast stack");
            completableSubject.onComplete();
            return;
        }
        e(completableSubject);
    }

    private void e(CompletableSubject completableSubject) {
        if (!B()) {
            C1044Mm.j("MdxAgent", "initCaf - cannot create cast stack");
            completableSubject.onComplete();
            return;
        }
        C1044Mm.a("MdxAgent", "initCaf - enabling CAF");
        this.F.d(getContext(), getMSLClient(), completableSubject);
    }

    private boolean B() {
        if (!G()) {
            C1044Mm.j("MdxAgent", "canCreateCastStack - cast not enabled.");
            return false;
        } else if (this.F.t()) {
            C1044Mm.j("MdxAgent", "canCreateCastStack - cast stack already added");
            return false;
        } else {
            return true;
        }
    }

    private boolean G() {
        aOV aov = this.i;
        return aov != null && aov.H().e();
    }

    @Override // o.aMF
    public void destroy() {
        this.l.quit();
        this.n.e(this);
        try {
            this.l.join();
        } catch (InterruptedException unused) {
            C1044Mm.d("MdxAgent", "MdxAgent: mMdxAgentWorkerThread interrupted");
        }
        this.l = null;
        O();
        aVI avi = this.r;
        if (avi != null) {
            avi.d();
        }
        C2012aWp c2012aWp = this.F;
        if (c2012aWp != null) {
            c2012aWp.d();
        }
        S();
        Disposable disposable = this.U;
        if (disposable != null) {
            disposable.dispose();
            this.U = null;
        }
        this.b.onNext(dpR.c);
        this.b.onComplete();
        super.destroy();
    }

    public boolean c(Intent intent) {
        String i = i();
        if (C8168dfL.h(i) && !t() && !r()) {
            this.F.b(i, true);
        }
        C1044Mm.c("MdxAgent", "handleCommand %s", intent.getAction());
        boolean z = false;
        if (intent.hasCategory("com.netflix.mediaclient.intent.category.MDX") && "com.netflix.mediaclient.intent.action.MDX_ACTION_PLAY_VIDEOIDS".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("uuid");
            if (C8168dfL.g(stringExtra) || !stringExtra.equals(i)) {
                C1044Mm.d("MdxAgent", "MdxAgent: MDX_ACTION_PLAY_VIDEOIDS is for uuid: " + stringExtra + "vs. " + i);
                return true;
            }
            String stringExtra2 = intent.getStringExtra("catalogId");
            if (stringExtra2 != null && !C8168dfL.i(stringExtra2)) {
                C1044Mm.d("MdxAgent", "Unable to parse catalogID from intent.");
                return false;
            }
            String stringExtra3 = intent.getStringExtra("episodeId");
            if (stringExtra3 != null && !C8168dfL.i(stringExtra3)) {
                C1044Mm.d("MdxAgent", "Unable to parse episodeId from intent.");
                return false;
            }
            int intExtra = intent.getIntExtra("trackId", -1);
            if (intExtra == -1) {
                C1044Mm.j("MdxAgent", "MdxAgent: MDX_ACTION_PLAY_VIDEOIDS has invalid trackId");
                intExtra = 13804431;
            }
            this.E = intExtra;
            this.C = intent.getIntExtra("time", -1);
            boolean z2 = stringExtra3 != null;
            this.A = intent.getBooleanExtra("previewPinProtected", false);
            this.D = intent.getStringExtra("prereleasePin");
            if (intent.getBooleanExtra("playNext", false)) {
                u();
            }
            C8241dgf.e eVar = this.O;
            if (eVar.c != z2 || !C8168dfL.d(eVar.a, stringExtra2) || (z2 && !C8168dfL.d(this.O.e, stringExtra3))) {
                this.u.b(i);
                if (C8168dfL.g(stringExtra2) && C8168dfL.g(stringExtra3)) {
                    InterfaceC1593aHa.b("MdxAgent: null catalogId & episodeId");
                }
                C8241dgf.e eVar2 = this.O;
                eVar2.c = z2;
                eVar2.a = stringExtra2;
                eVar2.e = stringExtra3;
                e(true, "com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_POSTPLAY".equals(intent.getAction()));
            } else {
                C1044Mm.e("MdxAgent", "MdxAgent: videoIds are same, start play");
                C2012aWp c2012aWp = this.F;
                C8241dgf.e eVar3 = this.O;
                c2012aWp.c(i, eVar3.b, this.E, eVar3.d, this.C, this.A, this.D);
                this.u.f(i);
            }
        } else if ("com.netflix.mediaclient.intent.action.MDX_CS_CAST_DISCOVERY_ISSUE".equals(intent.getAction())) {
            Pair<String, String>[] l = l();
            if (l != null && i != null) {
                int length = l.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (i.equals(l[i2].first)) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("csPage targetListCount=");
            sb.append(l != null ? l.length : -1);
            sb.append(" currentTargetUuid=");
            sb.append(i);
            sb.append(" targetFound=");
            sb.append(z);
            this.f13448o.a(sb.toString());
        } else {
            if (intent.hasCategory("com.netflix.mediaclient.intent.category.MDXRCC")) {
                C1044Mm.e("MdxAgent", "MdxAgent: get nf_mdx_RemoteControlClient intent");
                intent.putExtra("uuid", i);
                if ("com.netflix.mediaclient.intent.action.MDX_ACTION__TOGGLE_PAUSE".equals(intent.getAction())) {
                    C1044Mm.e("MdxAgent", "MdxAgent: get nf_mdx_RemoteControlClient intent toggle pause");
                }
            }
            if ("com.netflix.mediaclient.intent.action.MDX_ACTION_STOP".equals(intent.getAction())) {
                u();
                LocalBroadcastManager.getInstance(getContext()).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_PLAYER_POST_PLAY_ACTION_TITLE_END"));
            } else if ("com.netflix.mediaclient.intent.action.MDX_ACTION_SETVOLUME".equals(intent.getAction())) {
                e(getContext(), intent.getIntExtra("volume", -1));
            }
            aVL avl = this.h;
            if (avl != null) {
                avl.a(intent);
            }
        }
        return true;
    }

    private void e(Context context, int i) {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_SETVOLUME");
        intent.putExtra("volume", i);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public boolean k() {
        C2012aWp c2012aWp = this.F;
        if (c2012aWp != null) {
            return c2012aWp.r();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Pair<Integer, Notification> e(boolean z) {
        C8241dgf.e n = n();
        F();
        if (n != null) {
            boolean z2 = n.c;
            C8241dgf.e eVar = this.O;
            if (z2 != eVar.c || ((z2 && n.e != eVar.e) || !C8168dfL.d(n.a, eVar.a))) {
                this.O = n;
                e(false, z);
                return this.s.e(z);
            }
            C1044Mm.e("MdxAgent", "MdxAgent: videoIds are all same");
            this.u.f(i());
            Bitmap bitmap = this.d;
            if (bitmap != null) {
                this.s.a(bitmap);
            }
            InterfaceC5198buI interfaceC5198buI = this.R;
            if (interfaceC5198buI != null && !this.O.c) {
                this.s.d(false, interfaceC5198buI.getTitle(), (String) null);
            }
        } else {
            C1044Mm.e("MdxAgent", "MdxAgent: new videoIds is null");
        }
        return this.s.e(z);
    }

    public void D() {
        if (!H() || this.F == null) {
            return;
        }
        C1044Mm.e("MdxAgent", "MdxAgent: UI coming to foreground, try restart discovery");
        this.F.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (!isReady()) {
            C1044Mm.e("MdxAgent", "notifyUserProfileActivation MdxAgent not ready, ignoring");
        }
        if (z) {
            C1044Mm.e("MdxAgent", "MdxAgent: user login");
            return;
        }
        C1044Mm.e("MdxAgent", "MdxAgent: user logout");
        c("");
        this.F.e();
        C();
        b(true);
    }

    public void y() {
        this.U = AbstractApplicationC1040Mh.getInstance().j().subscribe(new Action() { // from class: o.aVN
            @Override // io.reactivex.functions.Action
            public final void run() {
                aVM.this.v();
            }
        });
    }

    public void v() {
        if (!H()) {
            C1044Mm.a("MdxAgent", "startMdx profile is not active");
        } else if (this.g.get()) {
            C1044Mm.d("MdxAgent", "MDX is starting, we should NOT be here");
        } else if (this.n.d() && !this.n.c()) {
            C1044Mm.j("MdxAgent", "startMdxImpl:: Consent is required for local discovery and it is not given, exit");
        } else {
            this.g.set(true);
            final CompletableSubject create = CompletableSubject.create();
            c(create);
            this.m.post(new Runnable() { // from class: o.aVM.3
                @Override // java.lang.Runnable
                public void run() {
                    create.subscribe(new CallbackCompletableObserver(new Consumer<Throwable>() { // from class: o.aVM.3.5
                        @Override // io.reactivex.functions.Consumer
                        /* renamed from: c */
                        public void accept(Throwable th) {
                            C1044Mm.e("MdxAgent", "Failed to initialize Cast.  Error: %s", th.getMessage());
                            InterfaceC1598aHf.a(new C1596aHd("Failed to initialize Cast.  Error: " + th.getMessage()).d(th).b(false));
                            aVM.this.E();
                        }
                    }, new Action() { // from class: o.aVM.3.3
                        @Override // io.reactivex.functions.Action
                        public void run() {
                            C1044Mm.a("MdxAgent", "Finished initializing Cast.  Finalizing MDX init...");
                            aVM.this.E();
                        }
                    }));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        if (this.k.compareAndSet(false, true)) {
            C1044Mm.a("MdxAgent", "finishMdxStart starting the mdx");
            this.f13448o.a();
            this.f13448o.e().c();
            this.F.u();
            this.G.e();
            return;
        }
        C1044Mm.a("MdxAgent", "finishMdxStart already started");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        this.m.post(new Runnable() { // from class: o.aVQ
            @Override // java.lang.Runnable
            public final void run() {
                aVM.this.L();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        C1044Mm.e("MdxAgent", "onAccountDeactivate stopping the mdx");
        this.f13448o.d();
        this.k.set(false);
        this.F.v();
        this.F.n().d((AbstractC2065aYo) null);
        this.F.w();
    }

    private boolean H() {
        UserAgent userAgent = getUserAgent();
        return userAgent != null && C8168dfL.h(userAgent.g()) && userAgent.v();
    }

    @Override // o.InterfaceC5131bsv
    public void u() {
        C1044Mm.a("MdxAgent", "Stop all notifications");
        F();
        aVI avi = this.r;
        if (avi != null) {
            avi.c();
        }
        this.s.c(getServiceNotificationHelper());
        this.s.c();
        this.s = null;
        this.d = null;
        IMdxSharedState g = g();
        if (g instanceof C2003aWg) {
            ((C2003aWg) g).g();
        }
    }

    @Override // o.InterfaceC5131bsv
    public boolean s() {
        C2012aWp c2012aWp = this.F;
        if (c2012aWp != null) {
            return c2012aWp.o(i());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        InterfaceC5346bwy interfaceC5346bwy;
        boolean o2;
        if (this.s != null || (interfaceC5346bwy = (InterfaceC5346bwy) C1332Xp.b(InterfaceC5346bwy.class)) == null) {
            return;
        }
        C2012aWp c2012aWp = this.F;
        if (c2012aWp == null) {
            C1044Mm.j("MdxAgent", "Target manager is null, assume that target is CAST");
            o2 = true;
        } else {
            o2 = c2012aWp.o(i());
        }
        this.s = interfaceC5346bwy.a(getContext(), true, this, this.r, this.i.H(), o2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Intent intent) {
        this.j = false;
        if (intent.hasExtra("postplayState")) {
            String string = intent.getExtras().getString("postplayState");
            if (C8168dfL.g(string)) {
                return false;
            }
            this.j = true;
            C5095bsL c5095bsL = new C5095bsL(string);
            return c5095bsL.d() || c5095bsL.e();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (C8168dfL.h(str)) {
            C8241dgf.e eVar = new C8241dgf.e();
            this.Q = eVar;
            eVar.c = true;
            eVar.e = str;
            F();
            e(false, true);
            aVI avi = this.r;
            if (avi != null) {
                avi.c(false, false, true);
            }
            this.s.a((Notification) e(true).second, getServiceNotificationHelper(), true);
            this.s.d(false, false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends AbstractC1761aNg {
        private final boolean c;

        c(boolean z) {
            this.c = z;
        }

        @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
        @SuppressLint({"CheckResult"})
        public void a(InterfaceC5238buw interfaceC5238buw, Status status) {
            if (status.j()) {
                aVM.this.R = interfaceC5238buw;
                String D = interfaceC5238buw.D();
                if (C8168dfL.g(D)) {
                    C1044Mm.d("MdxAgent", "MdxAgent.onMovieDetailsFetched, box art URL is empty");
                } else {
                    aVM.this.f.b(GetImageRequest.e().a(D).a()).subscribe(new Consumer() { // from class: o.aVZ
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            aVM.c.this.e((GetImageRequest.a) obj);
                        }
                    }, new Consumer() { // from class: o.aVY
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C1044Mm.e("MdxAgent", "failed to download", (Throwable) obj);
                        }
                    });
                }
                String i = aVM.this.i();
                aVM.this.u.f(i);
                if (this.c) {
                    aVM.this.O = new C8241dgf.e(interfaceC5238buw.aE_().aY_(), null, interfaceC5238buw.m(), null, interfaceC5238buw.getId());
                    aVM.this.F.c(i, aVM.this.O.b, aVM.this.E, aVM.this.O.d, C2007aWk.e(aVM.this.C, interfaceC5238buw.aE_()), aVM.this.A, aVM.this.D);
                }
                aVM.this.d(false, interfaceC5238buw.getTitle(), interfaceC5238buw.aE_().g(), null, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(GetImageRequest.a aVar) {
            Bitmap b = aVar.b();
            aVM.this.e(b.copy(b.getConfig(), b.isMutable()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d extends AbstractC1761aNg {
        private final String a;
        InterfaceC5198buI b;
        private final boolean c;
        C8241dgf.e d;
        private final boolean f;

        d(boolean z, boolean z2, String str) {
            this.f = z;
            this.c = z2;
            this.a = str;
        }

        private void e(C8241dgf.e eVar) {
            this.d = eVar;
            if (this.c) {
                aVM.this.Q = eVar;
            } else {
                aVM.this.O = eVar;
            }
        }

        private void a(InterfaceC5198buI interfaceC5198buI) {
            this.b = interfaceC5198buI;
            if (this.c) {
                return;
            }
            aVM.this.R = interfaceC5198buI;
        }

        @Override // o.AbstractC1761aNg, o.InterfaceC1757aNc
        @SuppressLint({"CheckResult"})
        public void a(InterfaceC5227bul interfaceC5227bul, Status status) {
            if (status.i()) {
                return;
            }
            if (interfaceC5227bul == null || interfaceC5227bul.getId() == null) {
                String id = interfaceC5227bul != null ? interfaceC5227bul.getId() : null;
                boolean z = interfaceC5227bul == null;
                InterfaceC1598aHf.a("SPY-7909: SPY-12099 FetchEpisode got bad id: " + this.a + " episodeDetailsNull=" + z + " getId()= " + id);
                return;
            }
            a(interfaceC5227bul);
            String D = interfaceC5227bul.D();
            if (C8168dfL.g(D)) {
                C1044Mm.d("MdxAgent", "MdxAgent.onEpisodeDetailsFetched, box art URL is empty");
            } else {
                aVM.this.f.b(GetImageRequest.e().a(D).a()).subscribe(new Consumer() { // from class: o.aVV
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        aVM.d.this.a((GetImageRequest.a) obj);
                    }
                }, new Consumer() { // from class: o.aVW
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C1044Mm.e("MdxAgent", "failed to download", (Throwable) obj);
                    }
                });
            }
            String i = aVM.this.i();
            aVM.this.u.f(i);
            if (this.f) {
                e(new C8241dgf.e(interfaceC5227bul.aE_().aY_(), interfaceC5227bul.bZ_(), interfaceC5227bul.m(), interfaceC5227bul.getId(), interfaceC5227bul.cd_()));
                aVM.this.F.c(i, this.d.b, aVM.this.E, this.d.d, C2007aWk.e(aVM.this.C, interfaceC5227bul.aE_()), aVM.this.A, aVM.this.D);
            }
            aVM.this.d(true, this.b.aE_().aC_(), this.b.aE_().g(), ((InterfaceC5346bwy) C1332Xp.b(InterfaceC5346bwy.class)).e(aVM.this.getContext(), this.b.aE_().aK_(), this.b.aE_().aw_(), this.b.getTitle(), this.b.F(), this.b.aU_()), this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(GetImageRequest.a aVar) {
            Bitmap b = aVar.b();
            aVM.this.e(b.copy(b.getConfig(), b.isMutable()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z, boolean z2) {
        String str;
        if ((z2 && this.Q.c) || (!z2 && this.O.c)) {
            if (z2) {
                str = this.Q.e;
            } else {
                str = this.O.e;
            }
            d dVar = new d(z, z2, str);
            InterfaceC1912aSw f = new C6004cQk().f();
            Objects.requireNonNull(f);
            f.c(String.valueOf(str), null, true, TaskMode.FROM_CACHE_OR_NETWORK, dVar, "MdxAgent");
            return;
        }
        c cVar = new c(z);
        InterfaceC1912aSw f2 = new C6004cQk().f();
        Objects.requireNonNull(f2);
        f2.e(this.O.a, null, true, TaskMode.FROM_CACHE_OR_NETWORK, cVar, "MdxAgent", Boolean.FALSE);
    }

    private void P() {
        IntentFilter intentFilter = new IntentFilter("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_PLAYBACKEND");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_PLAYBACKSTART");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_SIMPLE_PLAYBACKSTATE");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_ERROR");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_STATE");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REMOTE_LOGIN_STATUS");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_REMOTE_LOGIN_REQUESTED_BY_TARGET");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REGPAIR_PIN_CONFIRMATION_DIALOG_SHOW");
        intentFilter.addCategory("com.netflix.mediaclient.intent.category.MDX");
        intentFilter.setPriority(999);
        LocalBroadcastManager.getInstance(getContext()).registerReceiver(this.B, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_POSTPLAY");
        intentFilter2.addCategory("com.netflix.mediaclient.intent.category.MDX");
        intentFilter2.setPriority(999);
        ContextCompat.registerReceiver(getContext(), this.B, intentFilter2, 4);
    }

    private void S() {
        try {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.B);
        } catch (Exception e2) {
            C1044Mm.a("MdxAgent", "unregister locally mStartStopReceiver " + e2);
        }
        try {
            getContext().unregisterReceiver(this.B);
        } catch (Exception e3) {
            C1044Mm.a("MdxAgent", "unregister globally mStartStopReceiver " + e3);
        }
    }

    private void b(boolean z) {
        String i = i();
        this.F.m(i);
        this.u.b(i, MdxErrorSubCode.SessionAbruptlyEnded.d(), "stop connecting to target");
        this.u.d(i, (String) null, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        this.O = new C8241dgf.e();
        this.R = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z, String str, int i, String str2, boolean z2) {
        F();
        synchronized (this.q) {
            this.s.d(z, str, str2);
            aVI avi = this.r;
            if (avi != null) {
                if (str2 != null) {
                    str = str2;
                }
                avi.e(str, i, z2);
            }
        }
    }

    @Override // com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever
    public PendingIntent c(int i) {
        return d(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_SKIP").putExtra("time", i));
    }

    @Override // com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever
    public PendingIntent b(MdxNotificationIntentRetriever.SegmentType segmentType) {
        return d(segmentType, MdxNotificationIntentRetriever.InvocSource.LockScreen, 0);
    }

    private PendingIntent d(MdxNotificationIntentRetriever.SegmentType segmentType, MdxNotificationIntentRetriever.InvocSource invocSource, int i) {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_SKIP_INTRO");
        intent.putExtra("segmentType", segmentType.b());
        intent.putExtra("invocSource", invocSource.a());
        return a(intent, i);
    }

    @Override // com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever
    public PendingIntent a() {
        return d(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_PAUSE"));
    }

    public PendingIntent a(int i) {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_SEEK");
        intent.putExtra("time", i);
        return d(intent);
    }

    @Override // com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever
    public PendingIntent e() {
        return d(new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_RESUME"));
    }

    @Override // com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever
    public PendingIntent d(MdxNotificationIntentRetriever.InvocSource invocSource) {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_STOP");
        intent.putExtra("invocSource", invocSource.a());
        return d(intent);
    }

    @Override // com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever
    public PendingIntent d() {
        InterfaceC5198buI interfaceC5198buI = this.R;
        if (interfaceC5198buI == null || !(interfaceC5198buI instanceof InterfaceC5227bul)) {
            return null;
        }
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_PLAY_VIDEOIDS");
        String cb_ = ((InterfaceC5227bul) interfaceC5198buI).cb_();
        String aO_ = this.R.aE_().aO_();
        if (TextUtils.isEmpty(aO_) || TextUtils.isEmpty(cb_)) {
            return null;
        }
        intent.putExtra("episodeId", cb_);
        intent.putExtra("catalogId", aO_);
        intent.putExtra("playNext", true);
        return d(intent);
    }

    private PendingIntent d(Intent intent) {
        return a(intent, 0);
    }

    private PendingIntent a(Intent intent, int i) {
        intent.setClass(getContext(), aMH.c().c()).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", i());
        return PendingIntent.getService(getContext(), i, intent, 201326592);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InlinedApi", "InvalidWakeLockTag"})
    public void N() {
        R();
        WifiManager j = ConnectivityUtils.j(getContext());
        if (j != null) {
            C1044Mm.e("MdxAgent", "WiFi lock acquiring...");
            WifiManager.WifiLock createWifiLock = j.createWifiLock(3, "MdxAgent");
            this.P = createWifiLock;
            createWifiLock.acquire();
            C1044Mm.e("MdxAgent", "WiFi lock acquired.");
        }
        PowerManager powerManager = (PowerManager) getContext().getSystemService("power");
        if (powerManager != null && this.y == null) {
            this.y = powerManager.newWakeLock(1, "MdxAgent");
        }
        PowerManager.WakeLock wakeLock = this.y;
        if (wakeLock == null || wakeLock.isHeld()) {
            return;
        }
        this.y.acquire();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        WifiManager.WifiLock wifiLock = this.P;
        if (wifiLock != null && wifiLock.isHeld()) {
            C1044Mm.e("MdxAgent", "WiFi lock was held, release...");
            this.P.release();
            C1044Mm.e("MdxAgent", "WiFi lock released.");
        }
        PowerManager.WakeLock wakeLock = this.y;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.y.release();
    }

    private void Q() {
        LocalBroadcastManager.getInstance(getContext()).registerReceiver(this.S, C5020bqq.b());
    }

    private void O() {
        try {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.S);
        } catch (Exception e2) {
            C1044Mm.a("MdxAgent", "unregisterUserAgentReceiver " + e2);
        }
    }

    @Override // o.C2013aWq.a
    public void w() {
        c("");
        this.u.b();
    }

    @Override // o.C2013aWq.a
    public void b(String str, String str2) {
        if (C8168dfL.g(str)) {
            C();
        }
        if (!TextUtils.isEmpty(str)) {
            aMH.c().b(str);
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            aMH.c().e(str2);
        }
    }

    @Override // o.InterfaceC5131bsv
    public void d(String str, int i) {
        C2010aWn c2010aWn = this.z;
        if (c2010aWn != null) {
            c2010aWn.b(i(), str, this.O, i, this.E, this.A, this.D);
        }
    }

    @Override // o.C2010aWn.d
    public void d(String str) {
        c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Bitmap bitmap) {
        this.d = bitmap;
        aVI avi = this.r;
        if (avi != null) {
            avi.a(bitmap);
        }
        aWY awy = this.s;
        if (awy != null) {
            awy.e(this.d);
        }
    }

    @Override // o.C2000aWd.b
    public long q() {
        C2012aWp c2012aWp = this.F;
        if (c2012aWp != null) {
            return c2012aWp.m();
        }
        return 0L;
    }

    @Override // o.C2000aWd.b
    public void x() {
        aVJ avj = this.u;
        if (avj != null) {
            avj.d(i(), (String) null, false);
        }
    }

    @Override // o.InterfaceC5131bsv
    public IMdxSharedState g() {
        String i = i();
        if (C8168dfL.h(i)) {
            return this.u.d(i);
        }
        return null;
    }

    @Override // o.InterfaceC5131bsv
    public void a(String str) {
        String i = i();
        C2012aWp c2012aWp = this.F;
        if (c2012aWp != null) {
            i = c2012aWp.o();
        }
        this.f13448o.d(str, i, this.t, this.w, C8150deu.q(getContext()));
        this.w = 0;
    }

    @Override // o.InterfaceC5131bsv
    public void b() {
        C2012aWp c2012aWp = this.F;
        if (c2012aWp != null) {
            c2012aWp.c();
        }
    }

    @Override // o.InterfaceC5131bsv
    public void f() {
        C2012aWp c2012aWp = this.F;
        if (c2012aWp != null) {
            c2012aWp.a();
        }
    }

    @Override // o.InterfaceC5131bsv
    public boolean r() {
        C2012aWp c2012aWp = this.F;
        if (c2012aWp != null) {
            return c2012aWp.q();
        }
        return false;
    }

    @Override // o.InterfaceC5131bsv
    public boolean t() {
        C2012aWp c2012aWp = this.F;
        if (c2012aWp != null) {
            return c2012aWp.s();
        }
        return false;
    }

    @Override // o.InterfaceC5131bsv
    public void A() {
        C1044Mm.e("MdxAgent", "transfer playback from local to target");
    }

    @Override // o.InterfaceC2015aWs
    public void c() {
        C2012aWp c2012aWp = this.F;
        if (c2012aWp != null) {
            c2012aWp.e();
        }
    }

    @Override // o.aMF
    public void handleConnectivityChange(ConnectivityUtils.NetType netType) {
        I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        String str;
        boolean z;
        C2001aWe c2001aWe;
        String str2;
        WifiInfo connectionInfo;
        this.t++;
        this.w++;
        Context context = getContext();
        NetworkInfo a2 = ConnectivityUtils.a(context);
        String b = ConnectivityUtils.b(context);
        String str3 = "mobile";
        if (a2 != null) {
            z = a2.isConnected();
            String subtypeName = a2.getSubtypeName();
            if (a2.getType() == 1) {
                WifiManager j = ConnectivityUtils.j(context);
                if (j != null && (connectionInfo = j.getConnectionInfo()) != null) {
                    subtypeName = connectionInfo.getSSID();
                }
                str2 = "WIFI";
            } else {
                str2 = a2.getType() == 9 ? "ETHERNET" : "ETHERNET";
                str = str3 + ":" + subtypeName;
            }
            str3 = str2;
            str = str3 + ":" + subtypeName;
        } else {
            str = "unknown";
            z = false;
        }
        AbstractC2065aYo.b(b);
        C1044Mm.d("MdxAgent", "handleConnectivityChange currentTargetUuid=%s %s %b %s %s", i(), str3, Boolean.valueOf(z), b, str);
        C2001aWe c2001aWe2 = new C2001aWe(str3, str, b, z);
        if (c2001aWe2.equals(this.x)) {
            C1044Mm.a("MdxAgent", "handleConnectivityChange event, same network state. ignored");
            return;
        }
        if (c2001aWe2.a() && (c2001aWe = this.x) != null && c2001aWe.a()) {
            C1044Mm.a("MdxAgent", "handleConnectivityChange, network changed.");
            c(false);
        }
        C2012aWp c2012aWp = this.F;
        if (c2012aWp != null) {
            c2012aWp.b(str3, z, b, str);
        }
        this.x = c2001aWe2;
        c(c2001aWe2.a());
    }

    private void c(boolean z) {
        aVJ avj;
        aWY awy;
        String i = i();
        if (!z) {
            C();
        }
        if (!C8168dfL.h(i) || (avj = this.u) == null) {
            return;
        }
        avj.b(z);
        if (z || (awy = this.s) == null) {
            return;
        }
        awy.c(getServiceNotificationHelper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        if (this.I == null) {
            return;
        }
        if (this.K.size() == 0) {
            if (this.I.b()) {
                return;
            }
            this.I = null;
            return;
        }
        String remove = this.K.remove(0);
        this.H = remove;
        if (!this.I.c(remove, 2)) {
            this.I = null;
            return;
        }
        this.F.e(this.H, true, new C1999aWc(MdxLoginPolicyEnum.LoginOnly).e(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void a(String str, int i) {
        String k = this.F.k(str);
        if (C8168dfL.g(k)) {
            return;
        }
        if (this.I == null || !C8168dfL.c(k, this.H)) {
            cVO.c cVar = this.f13447J;
            if (cVar != null) {
                cVar.b(str, i);
            }
        } else if (this.I.c(k, i)) {
            M();
        } else {
            this.I = null;
        }
    }

    @Override // o.InterfaceC5131bsv
    public cVS.d c(final cVS.c cVar) {
        if (z()) {
            this.I = cVar;
            final HashMap hashMap = new HashMap();
            int[] iArr = {10, 20, 35};
            final int i = iArr[2];
            for (int i2 = 0; i2 < 3; i2++) {
                final int i3 = iArr[i2];
                this.m.postDelayed(new Runnable() { // from class: o.aVO
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVM.this.b(hashMap, i3, i);
                    }
                }, TimeUnit.SECONDS.toMillis(i3));
            }
            this.m.postDelayed(new Runnable() { // from class: o.aVS
                @Override // java.lang.Runnable
                public final void run() {
                    aVM.this.a(hashMap, cVar);
                }
            }, e);
        }
        return new cVS.d() { // from class: o.aVM.4
            @Override // o.cVS.d
            public void a(List<String> list) {
                aVM.this.K = list;
                aVM.this.M();
            }

            @Override // o.cVS.d
            public void d() {
                aVM.this.K.clear();
                aVM.this.I = null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Map map, int i, int i2) {
        C2012aWp c2012aWp = this.F;
        if (c2012aWp == null) {
            return;
        }
        int i3 = 0;
        Pair<String, String>[] e2 = c2012aWp.e(false, true);
        if (e2 != null) {
            int length = e2.length;
            int i4 = 0;
            while (i3 < length) {
                if (!this.F.n((String) e2[i3].first)) {
                    i4++;
                }
                i3++;
            }
            i3 = i4;
        }
        map.put(String.valueOf(i), Integer.valueOf(i3));
        if (i == i2) {
            C8264dhB.e(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, final cVS.c cVar) {
        C2012aWp c2012aWp = this.F;
        if (c2012aWp == null) {
            C8264dhB.e(-1, -1, Boolean.FALSE, "mTargetManager is null");
            return;
        }
        final Pair<String, String>[] e2 = c2012aWp.e(false, true);
        if (e2 == null || e2.length == 0) {
            C8264dhB.e(0, -1, Boolean.FALSE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, String> pair : e2) {
            String str = (String) pair.first;
            if (!this.F.n(str)) {
                arrayList.add(str);
            }
        }
        final int size = arrayList.size();
        map.put(String.valueOf(e / 1000), Integer.valueOf(size));
        if (arrayList.size() > 3) {
            C8264dhB.e(size, -1, Boolean.FALSE);
        } else {
            aLN.a.a(this.b).b(new C0958Jd(arrayList), new drM() { // from class: o.aVT
                @Override // o.drM
                public final Object invoke(Object obj) {
                    dpR e3;
                    e3 = aVM.this.e(cVar, size, e2, (aLO) obj);
                    return e3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR e(final cVS.c cVar, final int i, Pair[] pairArr, aLO alo) {
        if (cVar != this.I) {
            C8264dhB.e(i, -1, Boolean.FALSE, "Client was Discarded");
            return dpR.c;
        }
        if (alo instanceof aLZ) {
            aLZ alz = (aLZ) alo;
            if (alz.e() instanceof Map) {
                Map map = (Map) alz.e();
                final ArrayList arrayList = new ArrayList();
                for (Pair pair : pairArr) {
                    String str = (String) pair.first;
                    String str2 = (String) pair.second;
                    Object obj = map.get(str);
                    if (obj != null && C8168dfL.d(obj.toString(), "SIGNED_OUT")) {
                        arrayList.add(new cVQ(str, str2, Integer.valueOf(MdxLoginPolicyEnum.LoginOnly.a())));
                        if (arrayList.size() >= 3) {
                            break;
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    getMainHandler().post(new Runnable() { // from class: o.aVP
                        @Override // java.lang.Runnable
                        public final void run() {
                            aVM.this.c(cVar, i, arrayList);
                        }
                    });
                } else {
                    C8264dhB.e(i, arrayList.size(), Boolean.FALSE);
                }
            }
        } else if (alo instanceof aLL) {
            C8264dhB.e(i, -1, Boolean.FALSE, "Device Signed in Status request failed");
            C1044Mm.e("MdxAgent", "Device Signed in Status request failed", ((aLL) alo).b());
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(cVS.c cVar, int i, List list) {
        if (cVar != this.I) {
            C8264dhB.e(i, list.size(), Boolean.FALSE, "Client was Discarded");
        } else {
            C8264dhB.e(i, list.size(), Boolean.TRUE, "User in control cell");
        }
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        return InterfaceC1078Nw.f13378J;
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_MDX;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_MDX;
    }

    private boolean z() {
        this.M = C8157dfA.d(getContext(), "tvmd_impression_count", 0);
        long b = C8157dfA.b(getContext(), "tvmd_last_impression_ts", 0L);
        int i = this.M;
        return i < 4 && System.currentTimeMillis() > b + (i % 2 == 0 ? a : c);
    }

    @Override // o.aGS
    public void a(boolean z) {
        synchronized (this) {
            C1044Mm.a("MdxAgent", "onStateChange: local discovery enabled %b", Boolean.valueOf(z));
            if (z) {
                y();
            } else {
                this.m.post(new Runnable() { // from class: o.aVR
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVM.this.J();
                    }
                });
                K();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        C1044Mm.e("MdxAgent", "onStateChange disable stop remote playback and stop the mdx");
        C1044Mm.e("MdxAgent", "Disconnecting current target.");
        d("", 0);
        c("");
        this.u.b();
    }
}
