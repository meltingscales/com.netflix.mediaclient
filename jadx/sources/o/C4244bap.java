package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.job.NetflixJobExecutor;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bap  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4244bap {
    private int A;
    private long B;
    private final InterfaceC1926aTj D;
    private int E;
    protected final List<InterfaceC4290bbi> a;
    protected final Handler b;
    protected final Context e;
    private int k;
    private final IClientLogging l;
    private ConnectivityUtils.NetType m;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13561o;
    private boolean q;
    private final InterfaceC1919aTc s;
    private final b t;
    private int u;
    private int v;
    private int w;
    private boolean y;
    private static final long[] i = {60000};
    private static final int h = 1;
    private static final int f = 5;
    private static final long[] j = {3600000, 14400000};
    private final Map<String, Integer> z = new HashMap();
    private int x = 0;
    private boolean r = true;
    private final long g = TimeUnit.SECONDS.toMillis(30);
    private final Runnable n = new Runnable() { // from class: o.bap.3
        @Override // java.lang.Runnable
        public void run() {
            C4244bap.this.t.e();
        }
    };
    private final Runnable p = new Runnable() { // from class: o.bap.4
        @Override // java.lang.Runnable
        public void run() {
            if (C8196dfn.b(C4244bap.this.e)) {
                C4244bap.this.A();
            }
            C4244bap.this.h();
        }
    };
    private final Runnable C = new Runnable() { // from class: o.bap.5
        @Override // java.lang.Runnable
        public void run() {
            C4244bap.this.w();
        }
    };
    protected final InterfaceC1929aTm d = AbstractApplicationC1040Mh.getInstance().h();
    protected NetflixJob c = NetflixJob.a(p(), a());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bap$b */
    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();

        void i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, Status status) {
    }

    public boolean g() {
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(boolean z) {
        this.q = z;
        if (z) {
            return;
        }
        this.y = false;
        E();
    }

    private void E() {
        this.E = this.y ? 500 : 0;
        AbstractC9826xM.a(this.E);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        this.y = true;
        AbstractC9826xM.a(5000);
        this.b.removeCallbacksAndMessages(null);
        this.b.post(new Runnable() { // from class: o.bap.1
            @Override // java.lang.Runnable
            public void run() {
                C4244bap.this.v();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        this.y = false;
        E();
        this.b.removeCallbacksAndMessages(null);
        this.b.postDelayed(new Runnable() { // from class: o.bap.2
            @Override // java.lang.Runnable
            public void run() {
                C4244bap.this.y();
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (this.y) {
            return;
        }
        this.t.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.t.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
        d();
        H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        this.z.clear();
        d();
        u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        InterfaceC1593aHa.b("onDownloadResumeJobDone");
        this.d.e(NetflixJob.NetflixJobId.DOWNLOAD_RESUME, false);
    }

    public void f() {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - this.B >= 5000 ? 1000L : 5000L;
        C1044Mm.c("nf_downloadController", "handleConnectivityChange delay by=%d", Long.valueOf(j2));
        this.B = currentTimeMillis;
        this.b.removeCallbacks(this.C);
        this.b.postDelayed(this.C, j2);
    }

    public void q() {
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.r) {
            this.r = false;
            C1044Mm.a("nf_downloadController", "mNetworkChangeRunnable delaying the first network change event by " + TimeUnit.MILLISECONDS.toSeconds(this.g));
            this.b.removeCallbacks(this.p);
            this.b.postDelayed(this.p, this.g);
            return;
        }
        h();
    }

    protected void h() {
        G();
        if (this.m != null) {
            if (this.c.a(this.e) || b()) {
                C1044Mm.a("nf_downloadController", "handleNetworkChanged, retry the download.");
                this.t.c();
                return;
            } else if (!this.c.c(this.e)) {
                this.t.f();
                C1044Mm.a("nf_downloadController", "handleNetworkChanged, can't execute the job, stop downloads.");
                return;
            } else {
                C1044Mm.d("nf_downloadController", "handleNetworkChanged, this shouldn't happen.");
                return;
            }
        }
        this.t.i();
        C1044Mm.a("nf_downloadController", "mNetworkChangeRunnable, no network.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4244bap(Context context, InterfaceC1926aTj interfaceC1926aTj, InterfaceC1919aTc interfaceC1919aTc, List<InterfaceC4290bbi> list, Looper looper, b bVar, boolean z, IClientLogging iClientLogging, TQ tq, boolean z2) {
        this.e = context;
        this.D = interfaceC1926aTj;
        this.s = interfaceC1919aTc;
        this.b = new Handler(looper);
        this.t = bVar;
        this.a = list;
        this.l = iClientLogging;
        tq.e(NetflixJob.NetflixJobId.DOWNLOAD_RESUME, new e());
        if (z2) {
            z();
        } else {
            H();
        }
        this.f13561o = false;
        this.q = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(InterfaceC4290bbi interfaceC4290bbi) {
        if (interfaceC4290bbi.au_() != DownloadState.Stopped) {
            C1044Mm.a("nf_downloadController", "canThisPlayableBeResumedByUser no, state=" + interfaceC4290bbi.au_());
            return false;
        }
        I();
        int i2 = this.u;
        if (i2 > 0) {
            C1044Mm.c("nf_downloadController", "canThisPlayableBeResumedByUser no, mInProgressCount=%d", Integer.valueOf(i2));
            return false;
        } else if (this.c.a(this.e) || interfaceC4290bbi.aW_()) {
            return true;
        } else {
            C1044Mm.a("nf_downloadController", "canThisPlayableBeResumedByUser no, downloadResumeJob says no.");
            if (!this.c.c(this.e)) {
                interfaceC4290bbi.i().d(StopReason.NotAllowedOnCurrentNetwork);
            }
            r();
            return false;
        }
    }

    protected boolean b() {
        for (InterfaceC4290bbi interfaceC4290bbi : this.a) {
            if (interfaceC4290bbi.aW_()) {
                return true;
            }
        }
        return false;
    }

    private List<InterfaceC4290bbi> x() {
        ArrayList arrayList = new ArrayList(this.a.size());
        for (InterfaceC4290bbi interfaceC4290bbi : this.a) {
            int i2 = AnonymousClass7.b[interfaceC4290bbi.au_().ordinal()];
            if (i2 == 1 || i2 == 2) {
                arrayList.add(interfaceC4290bbi);
            } else if (i2 == 3 && interfaceC4290bbi.a()) {
                arrayList.add(interfaceC4290bbi);
            }
        }
        return arrayList;
    }

    private void u() {
        C1044Mm.d("nf_downloadController", "onOfflinePlayableListUpdated(%s items)", Integer.valueOf(this.a.size()));
        if (x().isEmpty()) {
            d();
        }
        boolean a = a();
        boolean z = p() && !b();
        if (this.c.i() == a && this.c.m() == z) {
            return;
        }
        c(z, a);
    }

    private void c(boolean z, boolean z2) {
        C1044Mm.d("nf_downloadController", "updateDownloadResumeJob(unmetered=%s, charger=%s)", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (this.c.i() == z2 && this.c.m() == z) {
            return;
        }
        NetflixJob a = NetflixJob.a(z, z2);
        this.c = a;
        if (this.d.d(a.b())) {
            this.d.b(this.c.b());
            r();
        }
    }

    protected boolean a() {
        if (C8054ddD.j()) {
            List<InterfaceC4290bbi> x = x();
            if (x.isEmpty()) {
                return false;
            }
            for (InterfaceC4290bbi interfaceC4290bbi : x) {
                if (!interfaceC4290bbi.bb_()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (this.f13561o) {
            return;
        }
        this.b.removeCallbacksAndMessages(null);
        this.f13561o = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC4290bbi e() {
        C1044Mm.c("nf_downloadController", "getNextPlayableForDownload mIndexOfNextPlayable=%d", Integer.valueOf(this.x));
        if (this.q) {
            C1044Mm.a("nf_downloadController", "getNextPlayableForDownload mDownloadsAreStoppedByUser=true");
            return null;
        } else if (this.y) {
            C1044Mm.a("nf_downloadController", "getNextPlayableForDownload mIsStreaming=true");
            return null;
        } else if (this.a.size() <= 0) {
            C1044Mm.c("nf_downloadController", "getNextPlayableForDownload all done. mOfflinePlayableList.size=%d", Integer.valueOf(this.a.size()));
            return null;
        } else {
            I();
            if (this.k == this.a.size()) {
                C1044Mm.c("nf_downloadController", "getNextPlayableForDownload all downloaded, mCompletedCount=%d", Integer.valueOf(this.k));
                return null;
            }
            int i2 = this.u;
            if (i2 > 0) {
                C1044Mm.c("nf_downloadController", "getNextPlayableForDownload already downloading, mInProgressCount=%d", Integer.valueOf(i2));
                return null;
            } else if (!this.c.a(this.e) && !b()) {
                C1044Mm.a("nf_downloadController", "getNextPlayableForDownload can't execute, downloadResumeJob says no.");
                r();
                return null;
            } else {
                ConnectivityUtils.NetType e2 = ConnectivityUtils.e(this.e);
                for (int size = this.a.size(); size > 0; size--) {
                    if (this.x >= this.a.size()) {
                        this.x = 0;
                    }
                    if (C4338bcd.b(this.a.get(this.x))) {
                        InterfaceC4290bbi interfaceC4290bbi = this.a.get(this.x);
                        if (p() && e2 == ConnectivityUtils.NetType.mobile && !interfaceC4290bbi.aW_()) {
                            this.x++;
                        } else {
                            C1044Mm.c("nf_downloadController", "getNextPlayableForDownload found with errorCount=%d playableId=%s", d(interfaceC4290bbi.aH_()), interfaceC4290bbi.aH_());
                            if (interfaceC4290bbi.aZ_()) {
                                if (C4338bcd.d(e2)) {
                                    return interfaceC4290bbi;
                                }
                            } else if (!interfaceC4290bbi.aT_() || C4338bcd.c(e2)) {
                                return interfaceC4290bbi;
                            }
                        }
                    }
                    this.x++;
                }
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.z.remove(str);
        B();
        C();
        d();
        z();
        this.b.removeCallbacks(this.n);
        u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        this.z.remove(str);
        if (this.a.size() == 0) {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str) {
        G();
        if (this.m != null) {
            int i2 = this.A + 1;
            this.A = i2;
            C1044Mm.c("nf_downloadController", "onNetworkError mNumberOfNetworkErrorsInCurrentDLWindow=%d", Integer.valueOf(i2));
            I();
            int i3 = this.v;
            int i4 = h;
            int i5 = (i3 * (i4 + 1)) - 1;
            int i6 = f;
            if (i5 > i6) {
                i5 = i6;
            }
            if (i5 < 2) {
                i5 = 2;
            }
            C1044Mm.c("nf_downloadController", "maxErrorsInDlWindow=%d", Integer.valueOf(i5));
            if (this.A <= i5) {
                int c = c(str);
                if (c > i4) {
                    this.x++;
                    this.z.put(str, 1);
                    c = 1;
                }
                long[] jArr = i;
                a(jArr[(c - 1) % jArr.length]);
                return;
            }
            F();
        } else if (this.d.d(this.c.b())) {
            C1044Mm.a("nf_downloadController", "onNetworkError networkConnected=no, download resume job already scheduled.");
        } else {
            C1044Mm.a("nf_downloadController", "onNetworkError networkConnected=no, scheduling download resume job");
            r();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        C1044Mm.a("nf_downloadController", "onStorageError removing the back-off timer");
        this.b.removeCallbacks(this.n);
    }

    protected void d() {
        if (this.d.d(this.c.b())) {
            this.d.b(this.c.b());
            C1044Mm.a("nf_downloadController", "cancelDownloadResumeJob cancelled");
        }
    }

    private void H() {
        this.D.c(this.s);
    }

    private void z() {
        this.D.d(this.s);
    }

    protected void r() {
        d(0L);
    }

    private void d(long j2) {
        if (this.d.d(this.c.b())) {
            this.d.b(this.c.b());
        }
        this.c.b(j2);
        this.d.a(this.c);
        C1044Mm.c("nf_downloadController", "DownloadResumeJob scheduled minimumDelay=%d", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        boolean p = p();
        C1044Mm.c("nf_downloadController", "setRequiresUnmeteredNetwork oldValue=%b newValue=%b", Boolean.valueOf(p), Boolean.valueOf(z));
        if (p != z) {
            C8157dfA.d(this.e, "download_requires_unmetered_network", z);
            NetflixJob a = NetflixJob.a(z, false);
            this.c = a;
            if (this.d.d(a.b())) {
                this.d.b(this.c.b());
                r();
            }
            j();
        }
    }

    protected void j() {
        h();
    }

    private void I() {
        this.k = 0;
        this.u = 0;
        this.v = 0;
        for (InterfaceC4290bbi interfaceC4290bbi : this.a) {
            if (interfaceC4290bbi.au_() == DownloadState.Complete) {
                this.k++;
            } else if (interfaceC4290bbi.au_() == DownloadState.InProgress) {
                this.u++;
            }
        }
        this.v = this.a.size() - this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return C8157dfA.b(this.e, "download_requires_unmetered_network", true);
    }

    private void G() {
        this.m = ConnectivityUtils.n(this.e) ? ConnectivityUtils.e(this.e) : null;
    }

    private long b(long j2) {
        return j2 + ((new Random().nextInt(30) * j2) / 100);
    }

    private void a(long j2) {
        this.b.removeCallbacks(this.n);
        long b2 = b(j2);
        C1044Mm.e("nf_downloadController", "scheduleBackOffTimer for seconds=%d", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(b2)));
        this.b.postDelayed(this.n, b2);
    }

    private void C() {
        C1044Mm.a("nf_downloadController", "resetDLWindow");
        this.A = 0;
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        C1044Mm.a("nf_downloadController", "resetDownloadResumeJobBackOffTime");
        this.w = 0;
        C8157dfA.a(this.e, "download_back_off_window_index", 0);
    }

    private void F() {
        B();
        this.A = 0;
        int d = C8157dfA.d(this.e, "download_back_off_window_index", 0);
        this.w = d;
        long[] jArr = j;
        if (d < jArr.length) {
            d(b(jArr[d]));
            int i2 = this.w + 1;
            this.w = i2;
            C8157dfA.a(this.e, "download_back_off_window_index", i2);
            return;
        }
        C1044Mm.e("nf_downloadController", "scheduleNextDLWindow exhausted all DL windows mIndexOfDlWindowBackOffTime=%d", Integer.valueOf(d));
    }

    private int c(String str) {
        Integer valueOf = Integer.valueOf(d(str).intValue() + 1);
        this.z.put(str, valueOf);
        return valueOf.intValue();
    }

    private Integer d(String str) {
        Integer num = this.z.get(str);
        if (num == null) {
            return 0;
        }
        return num;
    }

    private void B() {
        this.x = 0;
        D();
    }

    private void D() {
        for (Map.Entry<String, Integer> entry : this.z.entrySet()) {
            entry.setValue(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        int i2;
        for (InterfaceC4290bbi interfaceC4290bbi : this.a) {
            if (!interfaceC4290bbi.bb_() && ((i2 = AnonymousClass7.b[interfaceC4290bbi.au_().ordinal()]) == 1 || i2 == 2 || (i2 == 3 && interfaceC4290bbi.a()))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o.bap$e */
    /* loaded from: classes3.dex */
    class e implements NetflixJobExecutor {
        final Runnable e = new Runnable() { // from class: o.bap.e.3
            @Override // java.lang.Runnable
            public void run() {
                C4244bap.this.t.b();
            }
        };
        private final C8165dfI a = new C8165dfI(10, TimeUnit.MINUTES.toMillis(10));

        e() {
        }

        @Override // com.netflix.mediaclient.service.job.NetflixJobExecutor
        public void onNetflixStartJob(NetflixJob.NetflixJobId netflixJobId) {
            C1044Mm.c("nf_downloadController", "onNetflixStartJob jobId=%s", netflixJobId.toString());
            if (AnonymousClass7.a[netflixJobId.ordinal()] != 1) {
                return;
            }
            boolean d = this.a.d();
            C1044Mm.c("nf_downloadController", "onNetflixStartJob tooFast=%b", Boolean.valueOf(d));
            if (d) {
                return;
            }
            C4244bap.this.b.removeCallbacks(this.e);
            C4244bap.this.b.postDelayed(this.e, 30000L);
        }

        @Override // com.netflix.mediaclient.service.job.NetflixJobExecutor
        public void onNetflixStopJob(NetflixJob.NetflixJobId netflixJobId) {
            C1044Mm.c("nf_downloadController", "onNetflixStopJob jobId=%s", netflixJobId.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bap$7  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[NetflixJob.NetflixJobId.values().length];
            a = iArr;
            try {
                iArr[NetflixJob.NetflixJobId.DOWNLOAD_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[DownloadState.values().length];
            b = iArr2;
            try {
                iArr2[DownloadState.Creating.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[DownloadState.InProgress.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[DownloadState.Stopped.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
