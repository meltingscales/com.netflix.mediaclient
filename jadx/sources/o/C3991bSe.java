package o;

import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.logging.perf.PerformanceProfilerImpl;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import com.netflix.mediaclient.ui.home.HomeActivity;
import java.util.HashMap;
import java.util.List;
import o.bDE;

/* renamed from: o.bSe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3991bSe {
    private boolean a;
    private boolean b;
    private final HomeActivity e;
    private final drO<dpR> g;
    private final drO<dpR> h;
    public static final c d = new c(null);
    public static final int c = 8;

    public final boolean e() {
        return this.b;
    }

    public C3991bSe(HomeActivity homeActivity, drO<dpR> dro, drO<dpR> dro2) {
        C8632dsu.c((Object) homeActivity, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dro2, "");
        this.e = homeActivity;
        this.h = dro;
        this.g = dro2;
        this.a = true;
        this.b = true;
    }

    /* renamed from: o.bSe$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("HomeTTITTR");
        }
    }

    public final void b() {
        if (this.a) {
            d(IClientLogging.CompletionReason.canceled);
        }
        if (this.b) {
            c(IClientLogging.CompletionReason.canceled, null);
        }
    }

    public final void e(Status status) {
        C8632dsu.c((Object) status, "");
        IClientLogging.CompletionReason completionReason = IClientLogging.CompletionReason.failed;
        d(completionReason);
        c(completionReason, status);
    }

    public final void c(final Status status) {
        C8632dsu.c((Object) status, "");
        IClientLogging.CompletionReason completionReason = status.j() ? IClientLogging.CompletionReason.success : IClientLogging.CompletionReason.failed;
        d(completionReason);
        if (status.j()) {
            this.e.setupInteractiveTracking(new bDE.b(), new InteractiveTrackerInterface.c() { // from class: o.bSf
                @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface.c
                public final void c(InteractiveTrackerInterface.Reason reason, String str, List list) {
                    C3991bSe.b(C3991bSe.this, status, reason, str, list);
                }
            });
        } else {
            c(completionReason, status);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3991bSe c3991bSe, Status status, InteractiveTrackerInterface.Reason reason, String str, List list) {
        C8632dsu.c((Object) c3991bSe, "");
        C8632dsu.c((Object) status, "");
        C8632dsu.c((Object) reason, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        IClientLogging.CompletionReason fromImageLoaderReason = IClientLogging.CompletionReason.fromImageLoaderReason(reason);
        C8632dsu.a(fromImageLoaderReason, "");
        c3991bSe.c(fromImageLoaderReason, status);
    }

    private final void d(IClientLogging.CompletionReason completionReason) {
        this.a = false;
        HashMap hashMap = new HashMap();
        hashMap.put("reason", completionReason.name());
        bRZ k = this.e.k();
        if (k != null) {
            k.a(this.e, hashMap);
        }
        PerformanceProfilerImpl performanceProfilerImpl = PerformanceProfilerImpl.INSTANCE;
        performanceProfilerImpl.d(Sessions.TTI, hashMap);
        performanceProfilerImpl.d(Sessions.LOLOMO_LOAD, hashMap);
        C8271dhI.b();
        this.h.invoke();
    }

    public final void c(IClientLogging.CompletionReason completionReason, Status status) {
        C8632dsu.c((Object) completionReason, "");
        this.e.endRenderNavigationLevelSession(completionReason, status);
        if (this.b) {
            this.e.getNetflixApplication().G();
            HashMap hashMap = new HashMap();
            hashMap.put("reason", completionReason.name());
            bRZ k = this.e.k();
            if (k != null) {
                k.a(this.e, hashMap);
            }
            if (!this.e.getServiceManager().c()) {
                hashMap.put("serviceManagerReady", "false");
            }
            PerformanceProfilerImpl performanceProfilerImpl = PerformanceProfilerImpl.INSTANCE;
            performanceProfilerImpl.d(Sessions.TTR, hashMap);
            NetflixApplication netflixApplication = NetflixApplication.getInstance();
            netflixApplication.b("ttrDone-" + completionReason);
            performanceProfilerImpl.b();
            this.g.invoke();
            this.b = false;
        }
    }
}
