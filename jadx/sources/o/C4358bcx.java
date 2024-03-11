package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.core.util.Predicate;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.Log;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.media.VideoResolutionRange;
import com.netflix.mediaclient.service.StopReason;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.service.player.PlayerComponentFactory;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.util.ConnectivityUtils;
import io.reactivex.subjects.CompletableSubject;
import java.util.List;
import o.C4330bcV;
import o.InterfaceC4342bch;

/* renamed from: o.bcx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4358bcx extends aMF {
    private static VideoResolutionRange c;
    public static final b d = new b(null);
    private C4427beM a;
    private boolean b;
    private C4619bht e;
    private final Context f;
    private final CompletableSubject g;
    private final C4390bdc h;
    private final aOV i;
    private HandlerThread j;
    private final aHJ k;
    private final PlayerComponentFactory l;
    private final IClientLogging m;
    private final InterfaceC4208baF n;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC4348bcn f13568o;
    private final PriorityTaskManager p;
    private C4572bgz q;
    private final C4545bgY r;
    private HandlerThread s;
    private InterfaceC4346bcl t;
    private final C4319bcK u;
    private final C4318bcJ v;
    private final BroadcastReceiver w;
    private final C4352bcr y;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(boolean z) {
        return z;
    }

    @Override // o.aMF
    public String agentName() {
        return "player";
    }

    public final CompletableSubject b() {
        return this.g;
    }

    public final C4352bcr c() {
        return this.y;
    }

    public final C4619bht d() {
        return this.e;
    }

    public C4358bcx(Context context, aOV aov, UserAgent userAgent, InterfaceC4942bpR interfaceC4942bpR, IClientLogging iClientLogging, aHJ ahj, InterfaceC4208baF interfaceC4208baF, InterfaceC4348bcn interfaceC4348bcn, C4390bdc c4390bdc, PlayerComponentFactory playerComponentFactory, InterfaceC5098bsO interfaceC5098bsO) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) interfaceC4942bpR, "");
        C8632dsu.c((Object) iClientLogging, "");
        C8632dsu.c((Object) ahj, "");
        C8632dsu.c((Object) interfaceC4208baF, "");
        C8632dsu.c((Object) interfaceC4348bcn, "");
        C8632dsu.c((Object) c4390bdc, "");
        C8632dsu.c((Object) playerComponentFactory, "");
        C8632dsu.c((Object) interfaceC5098bsO, "");
        this.f = context;
        this.i = aov;
        this.m = iClientLogging;
        this.n = interfaceC4208baF;
        this.f13568o = interfaceC4348bcn;
        this.h = c4390bdc;
        CompletableSubject create = CompletableSubject.create();
        C8632dsu.a(create, "");
        this.g = create;
        PriorityTaskManager priorityTaskManager = new PriorityTaskManager();
        this.p = priorityTaskManager;
        this.w = new a();
        C4318bcJ c4318bcJ = new C4318bcJ(context, priorityTaskManager, ahj);
        this.v = c4318bcJ;
        this.l = playerComponentFactory;
        this.k = ahj;
        this.y = playerComponentFactory.a(context, aov, userAgent, interfaceC4942bpR, iClientLogging, c4390bdc);
        this.r = new C4545bgY(interfaceC5098bsO, new Predicate() { // from class: o.bcv
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                boolean a2;
                a2 = C4358bcx.a(((Boolean) obj).booleanValue());
                return a2;
            }
        });
        this.u = new C4319bcK(context, c4318bcJ);
        Log.setLogLevel(Integer.MAX_VALUE);
    }

    @Override // o.aMF
    public void onTrimMemory(int i) {
        C4572bgz c4572bgz;
        if (i == 20) {
            C4427beM c4427beM = this.a;
            if (c4427beM != null) {
                C8632dsu.d(c4427beM);
                c4427beM.i();
            }
        } else if (i < 40 || (c4572bgz = this.q) == null) {
        } else {
            C8632dsu.d(c4572bgz);
            c4572bgz.a();
        }
    }

    @Override // o.aMF
    public Sessions getAgentLoadEventName() {
        return Sessions.PLAYER_AGENT_LOADED;
    }

    @Override // o.aMF
    public void doInit() {
        C4619bht e = this.l.e(this.f, this.i, this.k);
        this.e = e;
        C8116deM.a(getContext(), this.w, C5020bqq.b());
        HandlerThread handlerThread = new HandlerThread("PlaybackWorkerThread", -1);
        this.s = handlerThread;
        C8632dsu.d(handlerThread);
        handlerThread.start();
        C4677biy.b(getContext());
        HandlerThread handlerThread2 = this.s;
        C8632dsu.d(handlerThread2);
        Looper looper = handlerThread2.getLooper();
        C8632dsu.a(looper, "");
        PlayerComponentFactory playerComponentFactory = this.l;
        Context context = getContext();
        C8632dsu.a(context, "");
        HandlerThread handlerThread3 = this.s;
        C8632dsu.d(handlerThread3);
        Looper looper2 = handlerThread3.getLooper();
        C8632dsu.a(looper2, "");
        C4572bgz a2 = playerComponentFactory.a(context, looper2, this.h, this.i.am());
        this.q = a2;
        PlayerComponentFactory playerComponentFactory2 = this.l;
        C8632dsu.d(a2);
        C4390bdc c4390bdc = this.h;
        boolean aj = this.i.aj();
        aTX g = this.m.g();
        C8632dsu.a(g, "");
        this.a = playerComponentFactory2.a(looper, a2, c4390bdc, aj, g);
        C4572bgz c4572bgz = this.q;
        C8632dsu.d(c4572bgz);
        c4572bgz.a(this.a);
        this.v.b(e, this.q, this.a);
        C4349bco c4349bco = new C4349bco(getContext(), this.q, this.n, this.f13568o);
        Context context2 = this.f;
        PriorityTaskManager priorityTaskManager = this.p;
        C4427beM c4427beM = this.a;
        C8632dsu.d(c4427beM);
        Context context3 = getContext();
        C8632dsu.a(context3, "");
        C4917bot c4917bot = new C4917bot(new C4606bhg(context2, priorityTaskManager, e, c4427beM, c4349bco, new C4798bmg(context3), this.r, this.y.c()));
        this.t = c4917bot;
        C4352bcr c4352bcr = this.y;
        C8632dsu.d(c4917bot);
        InterfaceC4348bcn interfaceC4348bcn = this.f13568o;
        HandlerThread handlerThread4 = this.s;
        C8632dsu.d(handlerThread4);
        c4352bcr.e(c4917bot, interfaceC4348bcn, handlerThread4);
        C4344bcj.d();
        MimeTypes.registerCustomMimeType("application/nflx-cmisc", "nflxcmisc", 3);
        try {
            InterfaceC4853bni.c.d(C4347bcm.b);
        } catch (Exception unused) {
        }
        initCompleted(InterfaceC1078Nw.aJ);
        C8187dfe.c(new Runnable() { // from class: o.bcw
            @Override // java.lang.Runnable
            public final void run() {
                C4358bcx.d(C4358bcx.this);
            }
        });
        aII.b.a(this.f).e().d(20);
        C4330bcV.e eVar = C4330bcV.d;
        if (eVar.b()) {
            eVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4358bcx c4358bcx) {
        C8632dsu.c((Object) c4358bcx, "");
        c4358bcx.g.onComplete();
    }

    @Override // o.aMF
    public void destroy() {
        super.destroy();
        C8116deM.a(getContext(), this.w);
        this.y.a();
        InterfaceC4346bcl interfaceC4346bcl = this.t;
        if (interfaceC4346bcl != null) {
            C8632dsu.d(interfaceC4346bcl);
            interfaceC4346bcl.b();
        }
        this.v.c();
        HandlerThread handlerThread = this.s;
        if (handlerThread != null) {
            C8632dsu.d(handlerThread);
            handlerThread.quit();
            this.s = null;
        }
        HandlerThread handlerThread2 = this.j;
        if (handlerThread2 != null) {
            C8632dsu.d(handlerThread2);
            handlerThread2.quit();
            this.j = null;
        }
        C4619bht c4619bht = this.e;
        if (c4619bht != null) {
            C8632dsu.d(c4619bht);
            c4619bht.m();
            this.e = null;
        }
        C4572bgz c4572bgz = this.q;
        if (c4572bgz != null) {
            C8632dsu.d(c4572bgz);
            c4572bgz.c();
            this.q = null;
        }
        C4427beM c4427beM = this.a;
        if (c4427beM != null) {
            C8632dsu.d(c4427beM);
            c4427beM.d();
            this.a = null;
        }
        this.u.c();
    }

    @Override // o.aMF
    public void handleConnectivityChange(ConnectivityUtils.NetType netType) {
        C4427beM c4427beM = this.a;
        if (c4427beM != null) {
            C8632dsu.d(c4427beM);
            c4427beM.e();
        }
        C4572bgz c4572bgz = this.q;
        if (c4572bgz != null) {
            C8632dsu.d(c4572bgz);
            c4572bgz.c(netType);
        }
        this.y.f();
    }

    public final void c(VideoResolutionRange videoResolutionRange) {
        C8166dfJ.e(null, false, 3, null);
        C4619bht c4619bht = this.e;
        if (c4619bht != null) {
            C8632dsu.d(c4619bht);
            c4619bht.d(videoResolutionRange);
        }
    }

    @Override // o.aMF
    public void onNetflixPlatformInitComplete(boolean z) {
        if (z) {
            this.b = true;
            VideoResolutionRange videoResolutionRange = c;
            if (videoResolutionRange != null) {
                c(videoResolutionRange);
                c = null;
            }
        }
    }

    public final void e(long j, InterfaceC4342bch.c cVar) {
        C4545bgY c4545bgY = this.r;
        if (c4545bgY != null) {
            c4545bgY.e(j, cVar);
        }
    }

    /* renamed from: o.bcx$a */
    /* loaded from: classes3.dex */
    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            String action = intent.getAction();
            String action2 = intent.getAction();
            C1044Mm.a("PlayerAgent", "UserAgentIntentReceiver inovoked and received Intent with Action " + action2);
            if (C8632dsu.c((Object) "com.netflix.mediaclient.intent.action.NOTIFY_CELLULAR_DATA_USAGE_CHANGED", (Object) action)) {
                C4619bht d = C4358bcx.this.d();
                C8632dsu.d(d);
                d.l();
            }
        }
    }

    @Override // o.aMF
    public Status getTimeoutStatus() {
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.X;
        C8632dsu.a(netflixImmutableStatus, "");
        return netflixImmutableStatus;
    }

    @Override // o.aMF
    public StopReason getTimeoutStopReason() {
        return StopReason.INIT_TIMED_OUT_PLAYER;
    }

    @Override // o.aMF
    public StopReason getStopReasonForInitFailed() {
        return StopReason.INIT_FAILED_PLAYER;
    }

    public final void e() {
        this.v.b();
    }

    public final void e(List<C5102bsS> list) {
        C8632dsu.c((Object) list, "");
        this.u.a(list);
    }

    /* renamed from: o.bcx$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final void a(VideoResolutionRange videoResolutionRange) {
            C4358bcx.c = videoResolutionRange;
        }
    }
}
