package o;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.job.NetflixJobExecutor;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: o.aTl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1928aTl implements NetflixJobExecutor, InterfaceC1926aTj {
    private static final long e = TimeUnit.MINUTES.toMillis(1);
    private final IClientLogging g;
    private final Context h;
    private final aOV j;
    private int k;
    private final InterfaceC1929aTm l;
    private final Set<InterfaceC1919aTc> f = new HashSet();
    private final SparseArray<InterfaceC1919aTc> p = new SparseArray<>();
    private boolean d = false;
    private final long c = TimeUnit.SECONDS.toMillis(10);
    private final Runnable m = new Runnable() { // from class: o.aTl.3
        @Override // java.lang.Runnable
        public void run() {
            C1928aTl.this.a();
        }
    };
    private final Runnable b = new Runnable() { // from class: o.aTl.5
        @Override // java.lang.Runnable
        public void run() {
            C1928aTl.this.c();
        }
    };
    private final Runnable a = new Runnable() { // from class: o.aTl.1
        @Override // java.lang.Runnable
        public void run() {
            C1928aTl.this.h();
        }
    };
    private final Handler i = new Handler();

    /* renamed from: o  reason: collision with root package name */
    private NetflixJob f13445o = NetflixJob.c(d());
    private final C8165dfI n = new C8165dfI(10, TimeUnit.MINUTES.toMillis(10));

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.d = false;
    }

    public C1928aTl(Context context, InterfaceC1929aTm interfaceC1929aTm, aOV aov, IClientLogging iClientLogging) {
        this.h = context;
        this.l = interfaceC1929aTm;
        this.j = aov;
        this.g = iClientLogging;
        if (interfaceC1929aTm.d(NetflixJob.NetflixJobId.NETFLIX_MAINTENANCE)) {
            return;
        }
        interfaceC1929aTm.d(this.f13445o);
    }

    @Override // com.netflix.mediaclient.service.job.NetflixJobExecutor
    public void onNetflixStartJob(NetflixJob.NetflixJobId netflixJobId) {
        boolean z;
        if (!ConnectivityUtils.l(this.h)) {
            this.i.post(this.m);
        } else if (this.n.d()) {
            i();
        } else {
            C1927aTk.b(this.g.e());
            ArrayList arrayList = new ArrayList();
            synchronized (this.f) {
                arrayList.addAll(this.f);
            }
            synchronized (this.p) {
                this.p.clear();
            }
            Iterator it = arrayList.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC1919aTc interfaceC1919aTc = (InterfaceC1919aTc) it.next();
                this.k++;
                synchronized (this.p) {
                    this.p.put(this.k, interfaceC1919aTc);
                }
                interfaceC1919aTc.b(this.k);
            }
            synchronized (this.p) {
                if (this.p.size() != 0) {
                    z = false;
                }
            }
            if (z) {
                this.i.post(this.m);
            }
        }
    }

    @Override // com.netflix.mediaclient.service.job.NetflixJobExecutor
    public void onNetflixStopJob(NetflixJob.NetflixJobId netflixJobId) {
        C1927aTk.c(this.g.e());
        ArrayList<InterfaceC1919aTc> arrayList = new ArrayList();
        synchronized (this.f) {
            arrayList.addAll(this.f);
        }
        synchronized (this.p) {
            this.p.clear();
        }
        for (InterfaceC1919aTc interfaceC1919aTc : arrayList) {
            interfaceC1919aTc.a();
        }
    }

    @Override // o.InterfaceC1926aTj
    public void e() {
        synchronized (this.f) {
            this.f.clear();
        }
        synchronized (this.p) {
            this.p.clear();
        }
        this.i.removeCallbacksAndMessages(null);
    }

    @Override // o.InterfaceC1926aTj
    public void d(InterfaceC1919aTc interfaceC1919aTc) {
        synchronized (this.f) {
            this.f.add(interfaceC1919aTc);
        }
    }

    @Override // o.InterfaceC1926aTj
    public void c(InterfaceC1919aTc interfaceC1919aTc) {
        synchronized (this.f) {
            this.f.remove(interfaceC1919aTc);
        }
    }

    @Override // o.InterfaceC1926aTj
    public void a(InterfaceC1919aTc interfaceC1919aTc, int i) {
        boolean z;
        synchronized (this.p) {
            this.p.remove(i);
            z = this.p.size() == 0;
        }
        if (z) {
            this.i.post(this.m);
        }
    }

    private long d() {
        return TimeUnit.HOURS.toMillis(this.j.G());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.i.removeCallbacks(this.a);
        long b = b(this.h, -1L);
        long d = d();
        if (d <= 0) {
            b();
        } else if (b != d) {
            b();
            this.f13445o = NetflixJob.c(d);
            j();
        } else {
            InterfaceC1593aHa.b("onMaintenanceJobDone");
            this.l.e(NetflixJob.NetflixJobId.NETFLIX_MAINTENANCE, false);
        }
    }

    private void b() {
        InterfaceC1929aTm interfaceC1929aTm = this.l;
        NetflixJob.NetflixJobId netflixJobId = NetflixJob.NetflixJobId.NETFLIX_MAINTENANCE;
        if (interfaceC1929aTm.d(netflixJobId)) {
            this.l.b(netflixJobId);
        }
    }

    private void j() {
        if (this.l.d(NetflixJob.NetflixJobId.NETFLIX_MAINTENANCE)) {
            return;
        }
        this.l.d(this.f13445o);
        e(this.h, this.f13445o.g());
    }

    private void i() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.i.postDelayed(this.b, this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        InterfaceC1919aTc interfaceC1919aTc;
        synchronized (this.p) {
            interfaceC1919aTc = this.p.size() > 0 ? this.p.get(0) : null;
        }
        if (interfaceC1919aTc == null) {
            return;
        }
        throw new RuntimeException("Failed to call notifyMaintenanceActionDone by " + interfaceC1919aTc.getClass().getName());
    }

    private static long b(Context context, long j) {
        return C8157dfA.b(context, "maintenace_job_period", j);
    }

    private static void e(Context context, long j) {
        C8157dfA.e(context, "maintenace_job_period", j);
    }
}
