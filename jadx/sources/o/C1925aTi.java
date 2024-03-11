package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.job.NetflixJobExecutor;
import com.netflix.mediaclient.service.job.PeriodicMaintenance;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* renamed from: o.aTi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1925aTi implements NetflixJobExecutor, InterfaceC1926aTj {
    private static final boolean e = false;
    private final aOV a;
    private final IClientLogging b;
    private final Handler f;
    private final Context g;
    private final Runnable h;
    private final Runnable i;
    private final Set<InterfaceC1919aTc> j;
    private int k;
    private Consumer<Boolean> l;
    private final InterfaceC1938aTv m;
    private final SparseArray<InterfaceC1919aTc> n;

    /* renamed from: o  reason: collision with root package name */
    private final C8165dfI f13444o;
    public static final c d = new c(null);
    private static final long c = TimeUnit.MINUTES.toMillis(1);

    private final void d() {
    }

    public C1925aTi(Context context, aOV aov, IClientLogging iClientLogging, InterfaceC1938aTv interfaceC1938aTv) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) iClientLogging, "");
        C8632dsu.c((Object) interfaceC1938aTv, "");
        this.g = context;
        this.a = aov;
        this.b = iClientLogging;
        this.f = new Handler(Looper.getMainLooper());
        this.j = new HashSet();
        this.n = new SparseArray<>();
        this.h = new Runnable() { // from class: o.aTh
            @Override // java.lang.Runnable
            public final void run() {
                C1925aTi.b(C1925aTi.this);
            }
        };
        this.i = new Runnable() { // from class: o.aTg
            @Override // java.lang.Runnable
            public final void run() {
                C1925aTi.c(C1925aTi.this);
            }
        };
        long a = a();
        this.f13444o = new C8165dfI(10, TimeUnit.MINUTES.toMillis(10L));
        this.m = interfaceC1938aTv;
        PeriodicMaintenance.d.b(interfaceC1938aTv, a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C1925aTi c1925aTi) {
        C8632dsu.c((Object) c1925aTi, "");
        c1925aTi.c();
    }

    public final void b(Consumer<Boolean> consumer) {
        this.l = consumer;
        onNetflixStartJob(NetflixJob.NetflixJobId.NETFLIX_MAINTENANCE);
    }

    @Override // com.netflix.mediaclient.service.job.NetflixJobExecutor
    public void onNetflixStartJob(NetflixJob.NetflixJobId netflixJobId) {
        ArrayList arrayList;
        boolean z;
        C8632dsu.c((Object) netflixJobId, "");
        if (!ConnectivityUtils.l(this.g)) {
            this.f.post(this.h);
        } else if (this.f13444o.d()) {
        } else {
            C1927aTk.b(this.b.e());
            synchronized (this.j) {
                arrayList = new ArrayList(this.j);
                dpR dpr = dpR.c;
            }
            synchronized (this.n) {
                this.n.clear();
            }
            Iterator it = arrayList.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC1919aTc interfaceC1919aTc = (InterfaceC1919aTc) it.next();
                this.k++;
                synchronized (this.n) {
                    this.n.put(this.k, interfaceC1919aTc);
                    dpR dpr2 = dpR.c;
                }
                interfaceC1919aTc.b(this.k);
            }
            synchronized (this.n) {
                if (this.n.size() != 0) {
                    z = false;
                }
                dpR dpr3 = dpR.c;
            }
            if (z) {
                this.f.post(this.h);
            } else if (e) {
                C1044Mm.a("nf_maintenanceJobMgr2", "will run audit");
                this.f.removeCallbacks(this.i);
                this.f.postDelayed(this.i, c);
            }
        }
    }

    @Override // com.netflix.mediaclient.service.job.NetflixJobExecutor
    public void onNetflixStopJob(NetflixJob.NetflixJobId netflixJobId) {
        ArrayList<InterfaceC1919aTc> arrayList;
        C8632dsu.c((Object) netflixJobId, "");
        C1927aTk.c(this.b.e());
        synchronized (this.j) {
            arrayList = new ArrayList(this.j);
            dpR dpr = dpR.c;
        }
        synchronized (this.n) {
            this.n.clear();
        }
        for (InterfaceC1919aTc interfaceC1919aTc : arrayList) {
            interfaceC1919aTc.a();
        }
    }

    @Override // o.InterfaceC1926aTj
    public void e() {
        synchronized (this.j) {
            this.j.clear();
            dpR dpr = dpR.c;
        }
        synchronized (this.n) {
            this.n.clear();
        }
        this.f.removeCallbacksAndMessages(null);
    }

    @Override // o.InterfaceC1926aTj
    public void d(InterfaceC1919aTc interfaceC1919aTc) {
        C8632dsu.c((Object) interfaceC1919aTc, "");
        synchronized (this.j) {
            this.j.add(interfaceC1919aTc);
        }
    }

    @Override // o.InterfaceC1926aTj
    public void c(InterfaceC1919aTc interfaceC1919aTc) {
        C8632dsu.c((Object) interfaceC1919aTc, "");
        synchronized (this.j) {
            this.j.remove(interfaceC1919aTc);
        }
    }

    @Override // o.InterfaceC1926aTj
    public void a(InterfaceC1919aTc interfaceC1919aTc, int i) {
        boolean z;
        C8632dsu.c((Object) interfaceC1919aTc, "");
        synchronized (this.n) {
            this.n.remove(i);
            z = this.n.size() == 0;
            dpR dpr = dpR.c;
        }
        if (z) {
            this.f.post(this.h);
        }
    }

    private final long a() {
        return TimeUnit.HOURS.toMillis(this.a.G());
    }

    private final void c() {
        this.f.removeCallbacks(this.i);
        c cVar = d;
        long e2 = cVar.e(this.g);
        long a = a();
        if (a <= 0) {
            b();
        } else if (e2 != a) {
            b();
            cVar.b(this.g, a);
            PeriodicMaintenance.d.b(this.m, a);
        } else {
            InterfaceC1593aHa.c.a("onMaintenanceJobDone:2");
            Consumer<Boolean> consumer = this.l;
            if (consumer != null) {
                consumer.accept(Boolean.TRUE);
                this.l = null;
            }
        }
    }

    private final void b() {
        this.m.b("maintenance");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C1925aTi c1925aTi) {
        C8632dsu.c((Object) c1925aTi, "");
        c1925aTi.d();
    }

    /* renamed from: o.aTi$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long e(Context context) {
            return C8157dfA.b(context, "maintenace_job_period", -1L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(Context context, long j) {
            C8157dfA.e(context, "maintenace_job_period", j);
        }
    }
}
