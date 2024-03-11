package o;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.Telemetry;
import com.bugsnag.android.ThreadSendPolicy;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: o.mG  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9258mG {
    private final String A;
    private final Set<Telemetry> B;
    private final ThreadSendPolicy C;
    private final long D;
    private final Integer G;
    private final String a;
    private final ApplicationInfo b;
    private final String c;
    private final boolean d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private final String h;
    private final Collection<Pattern> i;
    private final InterfaceC9157kL j;
    private final Set<BreadcrumbType> k;
    private final long l;
    private final Collection<String> m;
    private final C9226lb n;

    /* renamed from: o  reason: collision with root package name */
    private final C9168kW f13879o;
    private final int p;
    private final int q;
    private final int r;
    private final InterfaceC9200lB s;
    private final int t;
    private final InterfaceC8554dpx<File> u;
    private final PackageInfo v;
    private final boolean w;
    private final Collection<String> x;
    private final Collection<Pattern> y;
    private final boolean z;

    public final Integer A() {
        return this.G;
    }

    public final Set<Telemetry> B() {
        return this.B;
    }

    public final long D() {
        return this.D;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final ApplicationInfo e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9258mG) {
            C9258mG c9258mG = (C9258mG) obj;
            return C8632dsu.c((Object) this.a, (Object) c9258mG.a) && this.f == c9258mG.f && C8632dsu.c(this.n, c9258mG.n) && this.g == c9258mG.g && this.C == c9258mG.C && C8632dsu.c(this.i, c9258mG.i) && C8632dsu.c(this.m, c9258mG.m) && C8632dsu.c(this.x, c9258mG.x) && C8632dsu.c(this.k, c9258mG.k) && C8632dsu.c(this.B, c9258mG.B) && C8632dsu.c((Object) this.A, (Object) c9258mG.A) && C8632dsu.c((Object) this.h, (Object) c9258mG.h) && C8632dsu.c((Object) this.e, (Object) c9258mG.e) && C8632dsu.c(this.G, c9258mG.G) && C8632dsu.c((Object) this.c, (Object) c9258mG.c) && C8632dsu.c(this.j, c9258mG.j) && C8632dsu.c(this.f13879o, c9258mG.f13879o) && this.w == c9258mG.w && this.l == c9258mG.l && C8632dsu.c(this.s, c9258mG.s) && this.q == c9258mG.q && this.r == c9258mG.r && this.t == c9258mG.t && this.p == c9258mG.p && this.D == c9258mG.D && C8632dsu.c(this.u, c9258mG.u) && this.z == c9258mG.z && this.d == c9258mG.d && C8632dsu.c(this.v, c9258mG.v) && C8632dsu.c(this.b, c9258mG.b) && C8632dsu.c(this.y, c9258mG.y);
        }
        return false;
    }

    public final InterfaceC9157kL f() {
        return this.j;
    }

    public final C9226lb g() {
        return this.n;
    }

    public final String h() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.a.hashCode();
        boolean z = this.f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = this.n.hashCode();
        boolean z2 = this.g;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int hashCode3 = this.C.hashCode();
        int hashCode4 = this.i.hashCode();
        Collection<String> collection = this.m;
        int hashCode5 = collection == null ? 0 : collection.hashCode();
        int hashCode6 = this.x.hashCode();
        Set<BreadcrumbType> set = this.k;
        int hashCode7 = set == null ? 0 : set.hashCode();
        int hashCode8 = this.B.hashCode();
        String str = this.A;
        int hashCode9 = str == null ? 0 : str.hashCode();
        String str2 = this.h;
        int hashCode10 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.e;
        int hashCode11 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.G;
        int hashCode12 = num == null ? 0 : num.hashCode();
        String str4 = this.c;
        int hashCode13 = str4 == null ? 0 : str4.hashCode();
        int hashCode14 = this.j.hashCode();
        int hashCode15 = this.f13879o.hashCode();
        boolean z3 = this.w;
        int i3 = hashCode10;
        int i4 = hashCode11;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int hashCode16 = Long.hashCode(this.l);
        int hashCode17 = this.s.hashCode();
        int hashCode18 = Integer.hashCode(this.q);
        int hashCode19 = Integer.hashCode(this.r);
        int hashCode20 = Integer.hashCode(this.t);
        int hashCode21 = Integer.hashCode(this.p);
        int hashCode22 = Long.hashCode(this.D);
        int hashCode23 = this.u.hashCode();
        boolean z4 = this.z;
        int i6 = z4 ? 1 : z4 ? 1 : 0;
        boolean z5 = this.d;
        int i7 = z5 ? 1 : z5 ? 1 : 0;
        PackageInfo packageInfo = this.v;
        int hashCode24 = packageInfo == null ? 0 : packageInfo.hashCode();
        ApplicationInfo applicationInfo = this.b;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + hashCode2) * 31) + i2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i3) * 31) + i4) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + i5) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + i6) * 31) + i7) * 31) + hashCode24) * 31) + (applicationInfo == null ? 0 : applicationInfo.hashCode())) * 31) + this.y.hashCode();
    }

    public final boolean i() {
        return this.g;
    }

    public final Collection<Pattern> j() {
        return this.i;
    }

    public final long k() {
        return this.l;
    }

    public final C9168kW l() {
        return this.f13879o;
    }

    public final InterfaceC9200lB m() {
        return this.s;
    }

    public final Collection<String> n() {
        return this.m;
    }

    public final int o() {
        return this.q;
    }

    public final int p() {
        return this.r;
    }

    public final int q() {
        return this.p;
    }

    public final boolean r() {
        return this.w;
    }

    public final PackageInfo s() {
        return this.v;
    }

    public final int t() {
        return this.t;
    }

    public String toString() {
        return "ImmutableConfig(apiKey=" + this.a + ", autoDetectErrors=" + this.f + ", enabledErrorTypes=" + this.n + ", autoTrackSessions=" + this.g + ", sendThreads=" + this.C + ", discardClasses=" + this.i + ", enabledReleaseStages=" + this.m + ", projectPackages=" + this.x + ", enabledBreadcrumbTypes=" + this.k + ", telemetry=" + this.B + ", releaseStage=" + ((Object) this.A) + ", buildUuid=" + ((Object) this.h) + ", appVersion=" + ((Object) this.e) + ", versionCode=" + this.G + ", appType=" + ((Object) this.c) + ", delivery=" + this.j + ", endpoints=" + this.f13879o + ", persistUser=" + this.w + ", launchDurationMillis=" + this.l + ", logger=" + this.s + ", maxBreadcrumbs=" + this.q + ", maxPersistedEvents=" + this.r + ", maxPersistedSessions=" + this.t + ", maxReportedThreads=" + this.p + ", threadCollectionTimeLimitMillis=" + this.D + ", persistenceDirectory=" + this.u + ", sendLaunchCrashesSynchronously=" + this.z + ", attemptDeliveryOnCrash=" + this.d + ", packageInfo=" + this.v + ", appInfo=" + this.b + ", redactedKeys=" + this.y + ')';
    }

    public final Collection<String> u() {
        return this.x;
    }

    public final Collection<Pattern> v() {
        return this.y;
    }

    public final String w() {
        return this.A;
    }

    public final InterfaceC8554dpx<File> x() {
        return this.u;
    }

    public final boolean y() {
        return this.z;
    }

    public final ThreadSendPolicy z() {
        return this.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9258mG(String str, boolean z, C9226lb c9226lb, boolean z2, ThreadSendPolicy threadSendPolicy, Collection<Pattern> collection, Collection<String> collection2, Collection<String> collection3, Set<? extends BreadcrumbType> set, Set<? extends Telemetry> set2, String str2, String str3, String str4, Integer num, String str5, InterfaceC9157kL interfaceC9157kL, C9168kW c9168kW, boolean z3, long j, InterfaceC9200lB interfaceC9200lB, int i, int i2, int i3, int i4, long j2, InterfaceC8554dpx<? extends File> interfaceC8554dpx, boolean z4, boolean z5, PackageInfo packageInfo, ApplicationInfo applicationInfo, Collection<Pattern> collection4) {
        this.a = str;
        this.f = z;
        this.n = c9226lb;
        this.g = z2;
        this.C = threadSendPolicy;
        this.i = collection;
        this.m = collection2;
        this.x = collection3;
        this.k = set;
        this.B = set2;
        this.A = str2;
        this.h = str3;
        this.e = str4;
        this.G = num;
        this.c = str5;
        this.j = interfaceC9157kL;
        this.f13879o = c9168kW;
        this.w = z3;
        this.l = j;
        this.s = interfaceC9200lB;
        this.q = i;
        this.r = i2;
        this.t = i3;
        this.p = i4;
        this.D = j2;
        this.u = interfaceC8554dpx;
        this.z = z4;
        this.d = z5;
        this.v = packageInfo;
        this.b = applicationInfo;
        this.y = collection4;
    }

    public final C9155kJ c(C9230lf c9230lf) {
        return new C9155kJ(this.f13879o.e(), C9154kI.c(c9230lf));
    }

    public final C9155kJ e(C9220lV c9220lV) {
        return new C9155kJ(this.f13879o.a(), C9154kI.c(c9220lV.c()));
    }

    public final boolean b(Throwable th) {
        return C() || d(th);
    }

    public final boolean a(String str) {
        return C() || b(str);
    }

    public final boolean d(boolean z) {
        return C() || (z && !this.g);
    }

    public final boolean e(BreadcrumbType breadcrumbType) {
        Set<BreadcrumbType> set = this.k;
        return (set == null || set.contains(breadcrumbType)) ? false : true;
    }

    public final boolean C() {
        boolean b;
        Collection<String> collection = this.m;
        if (collection != null) {
            b = C8576dqs.b((Iterable<? extends String>) collection, this.A);
            if (!b) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(String str) {
        if (str != null && str.length() != 0) {
            Collection<Pattern> collection = this.i;
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                for (Pattern pattern : collection) {
                    if (pattern.matcher(str.toString()).matches()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean d(Throwable th) {
        List<Throwable> b = C9287mj.b(th);
        if (!(b instanceof Collection) || !b.isEmpty()) {
            for (Throwable th2 : b) {
                if (b(th2.getClass().getName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
