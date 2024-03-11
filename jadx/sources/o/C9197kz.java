package o;

import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.Telemetry;
import com.bugsnag.android.ThreadSendPolicy;
import java.io.File;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Pair;

/* renamed from: o.kz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9197kz {
    public static final e b = new e(null);
    private Set<String> B;
    private File C;
    private final HashSet<InterfaceC9217lS> D;
    private Set<? extends Telemetry> F;
    private String c;
    private boolean f;
    private String j;
    private Set<? extends BreadcrumbType> k;
    private Set<Pattern> m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC9157kL f13877o;
    private Set<String> p;
    private final C9209lK v;
    private String z;
    private C9294mq H = new C9294mq(null, null, null, 7, null);
    public final C9190ks a = new C9190ks(null, null, null, null, 15, null);
    public final C9207lI d = new C9207lI(null, 1, null);
    public final C9237lm e = new C9237lm(null, 1, null);
    private Integer L = 0;
    private ThreadSendPolicy G = ThreadSendPolicy.ALWAYS;
    private boolean A = true;
    private long q = 5000;
    private boolean i = true;
    private boolean E = true;
    private C9226lb l = new C9226lb(false, false, false, false, 15, null);
    private boolean g = true;
    private String h = "android";
    private InterfaceC9200lB r = C9149kD.d;
    private C9168kW s = new C9168kW(null, null, 3, null);
    private int t = 100;
    private int u = 32;
    private int w = 128;
    private int y = 200;
    private long I = 5000;
    private int x = 10000;

    public final ThreadSendPolicy A() {
        return this.G;
    }

    public final String B() {
        return this.z;
    }

    public final boolean D() {
        return this.E;
    }

    public final Integer F() {
        return this.L;
    }

    public C9294mq G() {
        return this.H;
    }

    public final long H() {
        return this.I;
    }

    public final Set<Telemetry> I() {
        return this.F;
    }

    public final String a() {
        return this.j;
    }

    public final void a(int i) {
        this.t = i;
    }

    public final void a(Integer num) {
        this.L = num;
    }

    public final void a(String str) {
        this.j = str;
    }

    public final void a(Set<? extends BreadcrumbType> set) {
        this.k = set;
    }

    public final void b(InterfaceC9157kL interfaceC9157kL) {
        this.f13877o = interfaceC9157kL;
    }

    public final boolean b() {
        return this.f;
    }

    public final void c(String str) {
        this.z = str;
    }

    public final void c(Set<String> set) {
        this.B = set;
    }

    public final boolean c() {
        return this.g;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.h;
    }

    public final Set<Pattern> f() {
        return this.m;
    }

    public final boolean g() {
        return this.i;
    }

    public final String i() {
        return this.n;
    }

    public final InterfaceC9157kL j() {
        return this.f13877o;
    }

    public final C9168kW k() {
        return this.s;
    }

    public final Set<String> l() {
        return this.p;
    }

    public final C9226lb m() {
        return this.l;
    }

    public final long n() {
        return this.q;
    }

    public final Set<BreadcrumbType> o() {
        return this.k;
    }

    public final int p() {
        return this.t;
    }

    public final int q() {
        return this.w;
    }

    public final int r() {
        return this.y;
    }

    public final int s() {
        return this.u;
    }

    public final InterfaceC9200lB t() {
        return this.r;
    }

    public final File u() {
        return this.C;
    }

    public final boolean v() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final HashSet<InterfaceC9217lS> w() {
        return this.D;
    }

    public final C9209lK x() {
        return this.v;
    }

    public final int y() {
        return this.x;
    }

    public final Set<String> z() {
        return this.B;
    }

    public C9197kz(String str) {
        Set<Pattern> e2;
        Set<String> e3;
        this.c = str;
        e2 = dqN.e();
        this.m = e2;
        this.F = EnumSet.of(Telemetry.INTERNAL_ERRORS, Telemetry.USAGE);
        e3 = dqN.e();
        this.B = e3;
        this.v = new C9209lK(null, null, null, 7, null);
        this.D = new HashSet<>();
    }

    public final void c(InterfaceC9200lB interfaceC9200lB) {
        if (interfaceC9200lB == null) {
            interfaceC9200lB = C9211lM.d;
        }
        this.r = interfaceC9200lB;
    }

    public final Set<Pattern> C() {
        return this.d.a().c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        r10 = o.C8576dqs.d(r0, ",", null, null, 0, null, null, 62, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String b(java.util.Collection<? extends java.lang.Object> r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L5
            r10 = 0
        L3:
            r0 = r10
            goto L2d
        L5:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = o.C8570dqm.a(r10, r1)
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L16:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r10.next()
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L16
        L28:
            java.util.List r10 = o.C8570dqm.q(r0)
            goto L3
        L2d:
            if (r0 != 0) goto L30
            goto L40
        L30:
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 62
            r8 = 0
            java.lang.String r10 = o.C8570dqm.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r10 != 0) goto L42
        L40:
            java.lang.String r10 = ""
        L42:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9197kz.b(java.util.Collection):java.lang.String");
    }

    public final Map<String, Object> h() {
        Pair pair;
        List i;
        Map<String, Object> d;
        List i2;
        C9197kz c9197kz = new C9197kz("");
        Pair[] pairArr = new Pair[16];
        pairArr[0] = this.D.size() > 0 ? dpD.a("pluginCount", Integer.valueOf(this.D.size())) : null;
        boolean z = this.g;
        pairArr[1] = z != c9197kz.g ? dpD.a("autoDetectErrors", Boolean.valueOf(z)) : null;
        boolean z2 = this.i;
        pairArr[2] = z2 != c9197kz.i ? dpD.a("autoTrackSessions", Boolean.valueOf(z2)) : null;
        pairArr[3] = this.m.size() > 0 ? dpD.a("discardClassesCount", Integer.valueOf(this.m.size())) : null;
        pairArr[4] = !C8632dsu.c(this.k, c9197kz.k) ? dpD.a("enabledBreadcrumbTypes", b(this.k)) : null;
        if (C8632dsu.c(this.l, c9197kz.l)) {
            pair = null;
        } else {
            String[] strArr = new String[4];
            strArr[0] = this.l.d() ? "anrs" : null;
            strArr[1] = this.l.e() ? "ndkCrashes" : null;
            strArr[2] = this.l.c() ? "unhandledExceptions" : null;
            strArr[3] = this.l.b() ? "unhandledRejections" : null;
            i2 = C8569dql.i(strArr);
            pair = dpD.a("enabledErrorTypes", b(i2));
        }
        pairArr[5] = pair;
        long j = this.q;
        pairArr[6] = j != 0 ? dpD.a("launchDurationMillis", Long.valueOf(j)) : null;
        pairArr[7] = !C8632dsu.c(this.r, C9211lM.d) ? dpD.a("logger", Boolean.TRUE) : null;
        int i3 = this.t;
        pairArr[8] = i3 != c9197kz.t ? dpD.a("maxBreadcrumbs", Integer.valueOf(i3)) : null;
        int i4 = this.u;
        pairArr[9] = i4 != c9197kz.u ? dpD.a("maxPersistedEvents", Integer.valueOf(i4)) : null;
        int i5 = this.w;
        pairArr[10] = i5 != c9197kz.w ? dpD.a("maxPersistedSessions", Integer.valueOf(i5)) : null;
        int i6 = this.y;
        pairArr[11] = i6 != c9197kz.y ? dpD.a("maxReportedThreads", Integer.valueOf(i6)) : null;
        long j2 = this.I;
        pairArr[12] = j2 != c9197kz.I ? dpD.a("threadCollectionTimeLimitMillis", Long.valueOf(j2)) : null;
        pairArr[13] = this.C != null ? dpD.a("persistenceDirectorySet", Boolean.TRUE) : null;
        ThreadSendPolicy threadSendPolicy = this.G;
        pairArr[14] = threadSendPolicy != c9197kz.G ? dpD.a("sendThreads", threadSendPolicy) : null;
        boolean z3 = this.f;
        pairArr[15] = z3 != c9197kz.f ? dpD.a("attemptDeliveryOnCrash", Boolean.valueOf(z3)) : null;
        i = C8569dql.i(pairArr);
        d = dqE.d(i);
        return d;
    }

    /* renamed from: o.kz$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
