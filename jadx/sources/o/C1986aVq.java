package o;

/* renamed from: o.aVq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1986aVq {
    private boolean h;
    private int i;
    private boolean j;
    private String k;
    private String l;
    private C1980aVk m;
    private AbstractC4561bgo n;

    /* renamed from: o  reason: collision with root package name */
    private String f13449o;
    private String p;
    private int q;
    private aTU r;
    private String t;
    private String f = "startDownload";
    private String b = "pauseDownload";
    private String e = "resumeDownload";
    private String a = "completeDownload";
    private String d = "cancelDownload";
    private String c = "reportProgress";
    private String g = "stopDownloadDueToError";

    private boolean g() {
        return this.n != null;
    }

    public String a() {
        return this.p;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public boolean b() {
        return this.h;
    }

    public C1986aVq c(C1980aVk c1980aVk) {
        this.m = c1980aVk;
        return this;
    }

    public void d(boolean z) {
        this.j = z;
    }

    public boolean e() {
        return this.j;
    }

    public C1986aVq(String str, String str2, String str3, String str4, String str5, aTU atu) {
        this.p = str;
        this.f13449o = str2;
        this.k = str3;
        this.l = str4;
        this.t = str5;
        this.r = atu;
    }

    public C1986aVq b(AbstractC4564bgr abstractC4564bgr) {
        if (abstractC4564bgr == null) {
            return this;
        }
        this.n = abstractC4564bgr.b();
        return this;
    }

    public void h() {
        c(this.f);
    }

    public void c() {
        c(this.a);
    }

    public void f() {
        c(this.b);
    }

    public void j() {
        c(this.e);
    }

    public void b(int i) {
        if (this.n == null) {
            return;
        }
        this.q = i;
        if (i()) {
            return;
        }
        d(c(this.n, this.c).a());
    }

    public void e(String str, String str2) {
        e(this.g, str, str2);
    }

    public void b(String str, String str2) {
        e(this.g, str, str2);
    }

    public void c(String str, String str2) {
        e(this.g, str, str2);
    }

    public void a(String str, String str2) {
        e(this.d, str, str2);
    }

    public String toString() {
        return "PdsDownloadSession{mPdsLogging=" + this.r + ", lastNotifiedProgressPercentage=" + this.i + ", mDc=" + this.m + ", mPlayableId='" + this.p + "', mOxId='" + this.f13449o + "', mDxId='" + this.k + "', mAppSessionId='" + this.l + "', mUserSessionId='" + this.t + "', mLinkEvents=" + this.n + ", isManifestFetchInProgress=" + this.j + ", isPaused=" + this.h + '}';
    }

    public boolean d() {
        return (g() || e()) ? false : true;
    }

    private void c(String str) {
        if (this.n == null) {
            return;
        }
        C1044Mm.a("nf_pds_download", "sending pds download event: %s", str);
        d(c(this.n, str).a());
    }

    private C1982aVm c(AbstractC4561bgo abstractC4561bgo, String str) {
        if (abstractC4561bgo == null) {
            InterfaceC1598aHf.a("PdsDownloadSession.buildDownloadEvent:: link is null");
        }
        return new C1982aVm(abstractC4561bgo, str, this.l, this.t).c(this.q).d(this.m);
    }

    private void d(String str) {
        if (C8168dfL.h(str)) {
            this.r.c(str, false);
            this.r.e();
        }
    }

    private boolean i() {
        int i = this.q;
        if (i != 0) {
            int i2 = this.i;
            if (i < i2 + 30) {
                C1044Mm.a("nf_pds_download", "rate limited progress message percentage: %d, lastNotifiedProgressPercentage: %d, interval: %d", Integer.valueOf(i), Integer.valueOf(i2), 30);
                return true;
            }
        }
        this.i = i;
        return false;
    }

    private void e(String str, String str2, String str3) {
        if (this.n == null) {
            return;
        }
        a(true);
        d(c(this.n, str).d(str2, str3).a());
    }
}
