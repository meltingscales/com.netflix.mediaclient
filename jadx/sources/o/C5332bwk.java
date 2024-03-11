package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.storage.db.entity.DownloadablePersistentData;
import java.util.List;

/* renamed from: o.bwk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5332bwk {
    public long A;
    public String B;
    public long C;
    public boolean D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J  reason: collision with root package name */
    public List<DownloadablePersistentData> f13637J;
    public int K;
    public List<DownloadablePersistentData> L;
    public long M;
    public List<DownloadablePersistentData> N;
    public String O;
    private DownloadState P;
    private DownloadState Q;
    public long R;
    public int S;
    private StopReason T;
    private Status W;
    public int a;
    public List<DownloadablePersistentData> b;
    public long c;
    public String d;
    public int e;
    public String f;
    public String g;
    public int h;
    public int i;
    public int j;
    public String k;
    public String l;
    public long m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public String f13638o;
    public String p;
    public long q;
    public String r;
    public String s;
    public boolean t;
    public String u;
    public boolean v;
    public long w;
    public String x;
    public boolean y;
    public String z;

    public long a() {
        return this.M;
    }

    public Status b() {
        return this.W;
    }

    public void e(boolean z) {
        this.t = z;
    }

    public void i() {
        this.n = 0;
        this.k = null;
        this.W = null;
    }

    public void d(Status status) {
        this.n = status.c().getValue();
        this.k = status.l();
        this.W = status;
    }

    public void e(Status status) {
        d(status);
    }

    public void g() {
        b(DownloadState.Complete);
    }

    public void m() {
        b(DownloadState.InProgress);
        i();
    }

    public void n() {
        DownloadState downloadState = this.P;
        this.Q = downloadState;
        this.e = downloadState.b();
        b(DownloadState.Deleted);
    }

    public void j() {
        b(DownloadState.DeleteComplete);
    }

    public void c(StopReason stopReason) {
        b(DownloadState.Stopped);
        a(stopReason);
    }

    public void f() {
        b(DownloadState.CreateFailed);
    }

    private void b(DownloadState downloadState) {
        this.P = downloadState;
        this.i = downloadState.b();
        this.M = System.currentTimeMillis();
    }

    private void a(StopReason stopReason) {
        this.T = stopReason;
        this.K = stopReason.e();
    }

    public DownloadState d() {
        if (this.P == null) {
            DownloadState d = DownloadState.d(this.i);
            this.P = d;
            if (d == DownloadState.Stopped && this.T == null) {
                this.T = StopReason.d(this.K);
            }
        }
        if (this.P == DownloadState.Deleted && C8168dfL.g(this.p)) {
            this.P = DownloadState.DeleteComplete;
        }
        return this.P;
    }

    public DownloadState e() {
        if (this.Q == null) {
            this.Q = DownloadState.d(this.e);
        }
        return this.Q;
    }

    public StopReason c() {
        StopReason stopReason;
        return (d() != DownloadState.Stopped || (stopReason = this.T) == null) ? StopReason.Unknown : stopReason;
    }

    public void h() {
        DownloadState downloadState = DownloadState.Creating;
        this.P = downloadState;
        this.i = downloadState.b();
    }
}
