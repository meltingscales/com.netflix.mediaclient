package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.Logger;
import com.netflix.cl.model.NetflixTraceCategory;
import com.netflix.cl.model.NetflixTraceStatus;
import com.netflix.cl.model.NetlixAppState;
import com.netflix.mediaclient.service.webclient.volley.RequestAppStateContext;

/* renamed from: o.aSy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1914aSy implements InterfaceC0905Hc {
    public static final d e = new d(null);
    private final C1665aJs b = new C1665aJs(0, null, false, null, 14, null);

    /* renamed from: o.aSy$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("CompactionPerformanceTrackerImpl");
        }
    }

    @Override // o.InterfaceC0905Hc
    public void d(int i) {
        this.b.d("compactCacheJob");
        this.b.b("compactCacheJob", "cacheSizeAtBegin", Integer.valueOf(i));
    }

    @Override // o.InterfaceC0905Hc
    public void d() {
        this.b.d("firstVacuum");
    }

    @Override // o.InterfaceC0905Hc
    public void e() {
        this.b.e("firstVacuum", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
    }

    @Override // o.InterfaceC0905Hc
    public void a() {
        this.b.d("removeUnused");
    }

    @Override // o.InterfaceC0905Hc
    public void a(int i) {
        this.b.b("removeUnused", "removedUnusedCount", Integer.valueOf(i));
        this.b.d("removeUnused", (r23 & 2) != 0 ? null : null, (r23 & 4) != 0 ? null : null, (r23 & 8) != 0 ? null : null, (r23 & 16) != 0 ? NetlixAppState.foreground : null, (r23 & 32) != 0 ? NetflixTraceCategory.device : null, (r23 & 64) != 0 ? NetflixTraceStatus.success : null, (r23 & 128) != 0 ? null : null, (r23 & JSONzip.end) != 0 ? null : null, (r23 & 512) != 0 ? null : null, (r23 & 1024) == 0 ? null : null);
    }

    @Override // o.InterfaceC0905Hc
    public void c() {
        this.b.d("removeExpired");
    }

    @Override // o.InterfaceC0905Hc
    public void b(int i) {
        this.b.b("removeExpired", "removedExpiredCount", Integer.valueOf(i));
        this.b.d("removeExpired", (r23 & 2) != 0 ? null : null, (r23 & 4) != 0 ? null : null, (r23 & 8) != 0 ? null : null, (r23 & 16) != 0 ? NetlixAppState.foreground : null, (r23 & 32) != 0 ? NetflixTraceCategory.device : null, (r23 & 64) != 0 ? NetflixTraceStatus.success : null, (r23 & 128) != 0 ? null : null, (r23 & JSONzip.end) != 0 ? null : null, (r23 & 512) != 0 ? null : null, (r23 & 1024) == 0 ? null : null);
    }

    @Override // o.InterfaceC0905Hc
    public void b() {
        this.b.d("secondVacuum");
    }

    @Override // o.InterfaceC0905Hc
    public void h() {
        this.b.e("secondVacuum", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
    }

    @Override // o.InterfaceC0905Hc
    public void c(int i) {
        NetlixAppState netlixAppState;
        this.b.b("compactCacheJob", "cacheSizeAtEnd", Integer.valueOf(i));
        C1665aJs c1665aJs = this.b;
        if (C5043brM.a.a() == RequestAppStateContext.e) {
            netlixAppState = NetlixAppState.foreground;
        } else {
            netlixAppState = NetlixAppState.background;
        }
        c1665aJs.d("compactCacheJob", (r23 & 2) != 0 ? null : null, (r23 & 4) != 0 ? null : null, (r23 & 8) != 0 ? null : null, (r23 & 16) != 0 ? NetlixAppState.foreground : netlixAppState, (r23 & 32) != 0 ? NetflixTraceCategory.device : null, (r23 & 64) != 0 ? NetflixTraceStatus.success : null, (r23 & 128) != 0 ? null : null, (r23 & JSONzip.end) != 0 ? null : null, (r23 & 512) != 0 ? null : null, (r23 & 1024) == 0 ? null : null);
        Logger.INSTANCE.logEvent(this.b.c());
        e.getLogTag();
    }
}
