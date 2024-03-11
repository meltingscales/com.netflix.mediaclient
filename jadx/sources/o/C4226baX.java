package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.service.offline.download.DownloadableType;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.storage.db.entity.DownloadablePersistentData;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.io.File;
import java.util.List;
import o.C4292bbk;

/* renamed from: o.baX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4226baX implements C4292bbk.a {
    private static final long[] b;
    private static final long c;
    private static final int e;
    private final Handler a;
    private final Runnable d = new Runnable() { // from class: o.baX.1
        @Override // java.lang.Runnable
        public void run() {
            C4226baX.this.n();
        }
    };
    private final InterfaceC4282bba f;
    private final C4227baY g;
    private int h;
    private final File i;
    private final Context j;
    private final DownloadablePersistentData k;
    private int l;
    private C4292bbk m;
    private final DownloadableType n;

    /* renamed from: o  reason: collision with root package name */
    private final C4287bbf f13559o;
    private final C9865xz p;
    private final List<C4223baU> s;

    static {
        c = C8067ddQ.c() ? 0L : 5000L;
        long[] j = j();
        b = j;
        e = j.length;
    }

    private static long[] j() {
        return C8067ddQ.c() ? new long[]{0, 0, 0} : new long[]{30000, 60000};
    }

    public C4226baX(Context context, Looper looper, DownloadablePersistentData downloadablePersistentData, InterfaceC4285bbd interfaceC4285bbd, C4287bbf c4287bbf, File file, C9865xz c9865xz, C4283bbb c4283bbb, IClientLogging iClientLogging, InterfaceC4282bba interfaceC4282bba) {
        this.j = context;
        this.a = new Handler(looper);
        this.k = downloadablePersistentData;
        this.f13559o = c4287bbf;
        this.i = file;
        this.p = c9865xz;
        this.f = interfaceC4282bba;
        c4287bbf.d = file.length();
        this.n = interfaceC4285bbd.a();
        List<C4223baU> b2 = interfaceC4285bbd.b();
        this.s = b2;
        C4223baU.a(b2);
        this.g = new C4227baY(context, c4283bbb, iClientLogging, file);
    }

    public void f() {
        synchronized (this) {
            C1044Mm.a("nf_cdnUrlDownloader", "startDownload");
            this.f13559o.d = this.i.length();
            this.h = 0;
            this.l = 0;
            String str = this.s.get(0).d;
            g();
            a(str);
        }
    }

    @Override // o.C4292bbk.a
    public void d() {
        synchronized (this) {
            if (this.i.length() >= this.k.mSizeOfDownloadable) {
                C1044Mm.a("nf_cdnUrlDownloader", "onUrlDownloadSessionEnd download finished.");
                this.k.mIsComplete = true;
                this.g.b(this.f13559o.d);
            } else {
                C1044Mm.a("nf_cdnUrlDownloader", "onUrlDownloadSessionEnd not finished yet.");
            }
            this.f.a(this);
            g();
        }
    }

    public void i() {
        synchronized (this) {
            g();
        }
    }

    public boolean e() {
        return this.k.mIsComplete;
    }

    public boolean b() {
        return (this.k.mIsComplete || this.m == null) ? false : true;
    }

    @Override // o.C4292bbk.a
    public void a(VolleyError volleyError) {
        synchronized (this) {
            C9858xs c9858xs = volleyError.b;
            int i = c9858xs != null ? c9858xs.e : -1;
            NetflixStatus a = C8237dgb.a(volleyError, StatusCode.NET_GENERAL_NETWORK_ERROR);
            g();
            if (ConnectivityUtils.l(this.j)) {
                if (C4338bcd.e(i)) {
                    C1044Mm.e("nf_cdnUrlDownloader", "cdnUrlExpiredOrMoved httpStatusCode=%d", Integer.valueOf(i));
                    this.f.b(this, a);
                } else if (C4338bcd.c(i)) {
                    C1044Mm.e("nf_cdnUrlDownloader", "isCdnUrlGeoCheckError httpStatusCode=%d", Integer.valueOf(i));
                    this.f.a(this, a);
                } else {
                    if (i == 416) {
                        g();
                        this.i.delete();
                        InterfaceC1598aHf.e("http 416 error", (Throwable) null);
                    }
                    h();
                }
            } else {
                C1044Mm.a("nf_cdnUrlDownloader", "onNetworkError lost connectivity.. not trying next CDN url.");
                this.f.c(this, a);
            }
        }
    }

    @Override // o.C4292bbk.a
    public void c() {
        synchronized (this) {
            C1044Mm.a("nf_cdnUrlDownloader", "onUrlDownloadDiskIOError");
            g();
            this.f.c(this);
        }
    }

    @Override // o.C4292bbk.a
    public void b(C4292bbk c4292bbk) {
        this.f13559o.d = c4292bbk.J();
    }

    @Override // o.C4292bbk.a
    public void a(long j) {
        if (this.f13559o.d == 0 && j > 0) {
            long j2 = this.k.mSizeOfDownloadable;
        }
        int i = this.h;
        if (i < 0 || i >= this.s.size()) {
            return;
        }
        this.g.b(this.s.get(this.h), this.f13559o.d);
    }

    public String a() {
        return this.k.mDownloadableId;
    }

    private void h() {
        int i = this.h;
        if (i == 0 && this.l < e) {
            this.a.removeCallbacks(this.d);
            this.a.postDelayed(this.d, b[this.l]);
            this.l++;
            return;
        }
        int i2 = i + 1;
        this.h = i2;
        if (i2 < this.s.size()) {
            this.a.removeCallbacks(this.d);
            this.a.postDelayed(this.d, c);
            return;
        }
        C1044Mm.d("nf_cdnUrlDownloader", "onCdnRetryRunnable all CDN URL exhausted");
        this.f.c(this, new NetflixStatus(StatusCode.DL_ALL_CDN_URLS_FAILED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.h < this.s.size()) {
            a(this.s.get(this.h).d);
        } else {
            this.f.c(this, new NetflixStatus(StatusCode.DL_ALL_CDN_URLS_FAILED));
        }
    }

    private void g() {
        this.a.removeCallbacksAndMessages(null);
        if (this.m != null) {
            C1044Mm.a("nf_cdnUrlDownloader", "doStopDownload");
            this.g.d(this.f13559o.d);
            this.m.e();
            this.m = null;
        }
    }

    private void a(String str) {
        this.a.removeCallbacksAndMessages(null);
        C4292bbk c4292bbk = new C4292bbk(str, this.i, this.n, Request.Priority.NORMAL, this);
        this.m = c4292bbk;
        c4292bbk.c(this.p);
    }
}
