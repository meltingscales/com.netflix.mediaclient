package o;

import android.app.Activity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.logging.perf.PerformanceProfilerImpl;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C1596aHd;
import o.C3644bFm;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;
import o.dqE;

/* renamed from: o.bFm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3644bFm {
    public static final c b = new c(null);
    private boolean a;
    private final NetflixActivity c;
    private boolean d;
    private d e;
    private final VideoType f;
    private long g;
    private boolean h;

    public C3644bFm(NetflixActivity netflixActivity, VideoType videoType) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) videoType, "");
        this.c = netflixActivity;
        this.f = videoType;
        this.g = System.currentTimeMillis();
        a();
        e();
    }

    /* renamed from: o.bFm$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("DetailsPageLoadingTracker");
        }
    }

    public final void b(Status status) {
        C8632dsu.c((Object) status, "");
        IClientLogging.CompletionReason a = a(status);
        b.getLogTag();
        if (this.d) {
            e(a);
        }
        if (this.a && status.i()) {
            d(a, status);
        }
        if (this.c.isFinishing() || !status.i()) {
            return;
        }
        InterfaceC1640aIu.d.d(this.c, status);
    }

    private final IClientLogging.CompletionReason a(Status status) {
        if (status.j()) {
            return IClientLogging.CompletionReason.success;
        }
        return IClientLogging.CompletionReason.failed;
    }

    public final void c() {
        if (this.d) {
            e(IClientLogging.CompletionReason.canceled);
        }
        if (this.a) {
            d(IClientLogging.CompletionReason.canceled, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InteractiveTrackerInterface.c d() {
        return new InteractiveTrackerInterface.c() { // from class: o.bFp
            @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface.c
            public final void c(InteractiveTrackerInterface.Reason reason, String str, List list) {
                C3644bFm.e(C3644bFm.this, reason, str, list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C3644bFm c3644bFm, InteractiveTrackerInterface.Reason reason, String str, List list) {
        C8632dsu.c((Object) c3644bFm, "");
        C8632dsu.c((Object) reason, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        IClientLogging.CompletionReason fromImageLoaderReason = IClientLogging.CompletionReason.fromImageLoaderReason(reason);
        C8632dsu.a(fromImageLoaderReason, "");
        if (c3644bFm.a) {
            c3644bFm.d(fromImageLoaderReason, null);
        }
    }

    private final void e(IClientLogging.CompletionReason completionReason) {
        Map d2;
        Map k;
        Throwable th;
        if (!this.d) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("Received a end DP TTI session while not tracking any", null, null, true, k, false, false, 96, null);
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
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        this.d = false;
        PerformanceProfilerImpl.INSTANCE.d(Sessions.DP_TTI, d(completionReason));
        this.c.logMetadataRenderedEvent(false);
        if (this.h) {
            this.h = false;
            d(completionReason, null);
        }
        b.getLogTag();
    }

    private final Map<String, String> d(IClientLogging.CompletionReason completionReason) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", completionReason.name());
        hashMap.put("videoType", this.f.name());
        return hashMap;
    }

    /* renamed from: o.bFm$d */
    /* loaded from: classes4.dex */
    public static final class d extends bDE {
        public static final C0102d c = new C0102d(null);
        private final ImageLoader b;

        @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface
        public String a() {
            return "dp-imagelatencyTracker-old";
        }

        @Override // o.bDE
        public boolean a(Activity activity) {
            return true;
        }

        @Override // o.bDE
        public boolean c() {
            return true;
        }

        public d(ImageLoader imageLoader) {
            C8632dsu.c((Object) imageLoader, "");
            this.b = imageLoader;
            imageLoader.b(this);
        }

        /* renamed from: o.bFm$d$d  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0102d extends C1045Mp {
            public /* synthetic */ C0102d(C8627dsp c8627dsp) {
                this();
            }

            private C0102d() {
                super("DetailsPageImageTracker");
            }
        }

        public final void d() {
            this.b.e(this);
        }
    }

    private final void e() {
        if (this.a) {
            b.getLogTag();
            d(IClientLogging.CompletionReason.canceled, null);
        }
        this.a = true;
        PerformanceProfilerImpl.INSTANCE.d(Sessions.DP_TTR);
        C1645aIz.a(this.c, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.details.DetailsPageLoadingTracker$startDPTTRSession$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                d(serviceManager);
                return dpR.c;
            }

            public final void d(ServiceManager serviceManager) {
                Map d2;
                Map k;
                Throwable th;
                InteractiveTrackerInterface.c d3;
                C8632dsu.c((Object) serviceManager, "");
                ImageLoader l = serviceManager.l();
                if (l != null) {
                    C3644bFm c3644bFm = C3644bFm.this;
                    C3644bFm.d dVar = new C3644bFm.d(l);
                    d3 = c3644bFm.d();
                    dVar.a(d3);
                    dVar.e();
                    c3644bFm.e = dVar;
                    return;
                }
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                String str = C3644bFm.b.getLogTag() + " manager.imageLoader is null";
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        c1596aHd.a(errorType.c() + " " + b2);
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
                InterfaceC1598aHf a = dVar2.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar2.e().b(c1596aHd, th);
                }
            }
        });
    }

    private final void d(IClientLogging.CompletionReason completionReason, Status status) {
        Map d2;
        Map k;
        Throwable th;
        c cVar = b;
        cVar.getLogTag();
        if (!this.a) {
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("Received a end DP TTR session while not tracking any", null, null, true, k, false, false, 96, null);
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
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        if (!this.d) {
            this.h = false;
            this.a = false;
            this.c.endRenderNavigationLevelSession(completionReason, status);
            PerformanceProfilerImpl performanceProfilerImpl = PerformanceProfilerImpl.INSTANCE;
            performanceProfilerImpl.d(Sessions.DP_TTR, d(completionReason));
            performanceProfilerImpl.b();
            d dVar2 = this.e;
            if (dVar2 != null) {
                dVar2.d();
                this.e = null;
            }
            cVar.getLogTag();
            return;
        }
        this.h = true;
        cVar.getLogTag();
    }

    private final void a() {
        if (this.d) {
            b.getLogTag();
            e(IClientLogging.CompletionReason.canceled);
        }
        this.d = true;
        PerformanceProfilerImpl.INSTANCE.d(Sessions.DP_TTI);
    }
}
