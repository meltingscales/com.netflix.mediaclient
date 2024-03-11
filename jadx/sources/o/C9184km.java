package o;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import kotlin.Result;

/* renamed from: o.km  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9184km {
    private final ActivityManager e;
    private final C9203lE f;
    private final C9258mG g;
    private final String h;
    private String i;
    private String j;
    private final String l;
    private final C9205lG m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final PackageManager f13875o;
    private final C9281md q;
    private final String t;
    public static final b d = new b(null);
    private static final long a = SystemClock.elapsedRealtime();
    private final Boolean c = h();
    private final String b = j();
    private final String k = f();

    public final void a(String str) {
        this.i = str;
    }

    public C9184km(Context context, PackageManager packageManager, C9258mG c9258mG, C9281md c9281md, ActivityManager activityManager, C9203lE c9203lE, C9205lG c9205lG) {
        this.f13875o = packageManager;
        this.g = c9258mG;
        this.q = c9281md;
        this.e = activityManager;
        this.f = c9203lE;
        this.m = c9205lG;
        this.l = context.getPackageName();
        this.n = c9258mG.w();
        String a2 = c9258mG.a();
        if (a2 == null) {
            PackageInfo s = c9258mG.s();
            a2 = s == null ? null : s.versionName;
        }
        this.t = a2;
        this.h = e();
    }

    public final C9181kj b() {
        return new C9181kj(this.g, this.i, this.l, this.n, this.t, this.j);
    }

    public final C9186ko a() {
        boolean f = this.q.f();
        Long b2 = b(Boolean.valueOf(f));
        return new C9186ko(this.g, this.i, this.l, this.n, this.t, this.j, Long.valueOf(d.b()), b2, Boolean.valueOf(f), Boolean.valueOf(this.f.b()));
    }

    public final Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.b);
        hashMap.put("activeScreen", this.q.d());
        hashMap.put("lowMemory", Boolean.valueOf(this.m.b()));
        hashMap.put("memoryTrimLevel", this.m.c());
        e(hashMap);
        Boolean bool = this.c;
        if (bool != null) {
            bool.booleanValue();
            hashMap.put("backgroundWorkRestricted", this.c);
        }
        String str = this.k;
        if (str != null) {
            hashMap.put("processName", str);
        }
        return hashMap;
    }

    private final void e(Map<String, Object> map) {
        Runtime runtime = Runtime.getRuntime();
        long j = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        map.put("memoryUsage", Long.valueOf(j - freeMemory));
        map.put("totalMemory", Long.valueOf(j));
        map.put("freeMemory", Long.valueOf(freeMemory));
        map.put("memoryLimit", Long.valueOf(runtime.maxMemory()));
        map.put("installerPackage", this.h);
    }

    private final Boolean h() {
        boolean isBackgroundRestricted;
        ActivityManager activityManager = this.e;
        if (activityManager != null && Build.VERSION.SDK_INT >= 28) {
            isBackgroundRestricted = activityManager.isBackgroundRestricted();
            if (isBackgroundRestricted) {
                return Boolean.TRUE;
            }
        }
        return null;
    }

    public final Long b(Boolean bool) {
        if (bool == null) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long b2 = this.q.b();
        long j = (!bool.booleanValue() || b2 == 0) ? 0L : elapsedRealtime - b2;
        if (j > 0) {
            return Long.valueOf(j);
        }
        return 0L;
    }

    private final String j() {
        ApplicationInfo e = this.g.e();
        PackageManager packageManager = this.f13875o;
        if (packageManager == null || e == null) {
            return null;
        }
        return packageManager.getApplicationLabel(e).toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000c, code lost:
        r1 = r1.getInstallSourceInfo(r3.l);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e() {
        /*
            r3 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L25
            r2 = 30
            if (r1 < r2) goto L1a
            android.content.pm.PackageManager r1 = r3.f13875o     // Catch: java.lang.Exception -> L25
            if (r1 != 0) goto Lc
            goto L19
        Lc:
            java.lang.String r2 = r3.l     // Catch: java.lang.Exception -> L25
            android.content.pm.InstallSourceInfo r1 = o.C9183kl.a(r1, r2)     // Catch: java.lang.Exception -> L25
            if (r1 != 0) goto L15
            goto L19
        L15:
            java.lang.String r0 = o.C9182kk.d(r1)     // Catch: java.lang.Exception -> L25
        L19:
            return r0
        L1a:
            android.content.pm.PackageManager r1 = r3.f13875o     // Catch: java.lang.Exception -> L25
            if (r1 != 0) goto L1f
            goto L25
        L1f:
            java.lang.String r2 = r3.l     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = r1.getInstallerPackageName(r2)     // Catch: java.lang.Exception -> L25
        L25:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9184km.e():java.lang.String");
    }

    @SuppressLint({"PrivateApi"})
    private final String f() {
        Object e;
        String str;
        try {
            Result.c cVar = Result.e;
            if (Build.VERSION.SDK_INT >= 28) {
                str = Application.getProcessName();
            } else {
                Object invoke = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str = (String) invoke;
            }
            e = Result.e(str);
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e = Result.e(C8556dpz.a(th));
        }
        return Result.a(e) ? null : e;
    }

    /* renamed from: o.km$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final long c() {
            return C9184km.a;
        }

        public final long b() {
            return SystemClock.elapsedRealtime() - c();
        }
    }
}
