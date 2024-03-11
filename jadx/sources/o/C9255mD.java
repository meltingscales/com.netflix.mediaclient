package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.ThreadSendPolicy;
import com.bugsnag.android.internal.TaskType;
import java.io.File;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Result;
import o.C9196ky;

/* renamed from: o.mD  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9255mD {
    public static final C9258mG e(C9196ky c9196ky, String str, PackageInfo packageInfo, ApplicationInfo applicationInfo, InterfaceC8554dpx<? extends File> interfaceC8554dpx) {
        Set W;
        Set W2;
        Set W3;
        Set W4;
        C9226lb a = c9196ky.d() ? c9196ky.f().a() : new C9226lb(false);
        String a2 = c9196ky.a();
        boolean d = c9196ky.d();
        boolean c = c9196ky.c();
        ThreadSendPolicy A = c9196ky.A();
        W = C8576dqs.W(c9196ky.i());
        Set<String> l = c9196ky.l();
        Set W5 = l == null ? null : C8576dqs.W(l);
        W2 = C8576dqs.W(c9196ky.w());
        String D = c9196ky.D();
        String e = c9196ky.e();
        Integer H = c9196ky.H();
        String b = c9196ky.b();
        InterfaceC9157kL g = c9196ky.g();
        C9168kW m = c9196ky.m();
        boolean u = c9196ky.u();
        long o2 = c9196ky.o();
        InterfaceC9200lB k = c9196ky.k();
        C8632dsu.d(k);
        int n = c9196ky.n();
        int r = c9196ky.r();
        int t = c9196ky.t();
        int s = c9196ky.s();
        long B = c9196ky.B();
        Set<BreadcrumbType> h = c9196ky.h();
        Set W6 = h != null ? C8576dqs.W(h) : null;
        W3 = C8576dqs.W(c9196ky.C());
        boolean z = c9196ky.z();
        boolean I = c9196ky.I();
        W4 = C8576dqs.W(c9196ky.v());
        return new C9258mG(a2, d, a, c, A, W, W5, W2, W6, W3, D, str, e, H, b, g, m, u, o2, k, n, r, t, s, B, interfaceC8554dpx, z, I, packageInfo, applicationInfo, W4);
    }

    private static final void e(String str) {
        if (c(str)) {
            C9149kD.d.d(C8632dsu.d("Invalid configuration. apiKey should be a 32-character hexademical string, got ", (Object) str));
        }
    }

    public static final boolean c(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("No Bugsnag API Key set");
        }
        if (str.length() != 32) {
            return true;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = true;
                break;
            }
            char charAt = str.charAt(i);
            if (!Character.isDigit(charAt) && ('a' > charAt || charAt > 'f')) {
                break;
            }
            i++;
        }
        return !z;
    }

    public static final C9258mG e(final Context context, final C9196ky c9196ky, InterfaceC9147kB interfaceC9147kB, C9301mx c9301mx) {
        Object e;
        Object e2;
        InterfaceC8554dpx b;
        Set<String> a;
        Integer H;
        e(c9196ky.a());
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        try {
            Result.c cVar = Result.e;
            e = Result.e(packageManager.getPackageInfo(packageName, 0));
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e = Result.e(C8556dpz.a(th));
        }
        if (Result.a(e)) {
            e = null;
        }
        PackageInfo packageInfo = (PackageInfo) e;
        try {
            Result.c cVar3 = Result.e;
            e2 = Result.e(packageManager.getApplicationInfo(packageName, 128));
        } catch (Throwable th2) {
            Result.c cVar4 = Result.e;
            e2 = Result.e(C8556dpz.a(th2));
        }
        if (Result.a(e2)) {
            e2 = null;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) e2;
        if (c9196ky.D() == null) {
            c9196ky.c((applicationInfo == null || (applicationInfo.flags & 2) == 0) ? "production" : "development");
        }
        if (c9196ky.k() == null || C8632dsu.c(c9196ky.k(), C9149kD.d)) {
            if (!C8632dsu.c((Object) "production", (Object) c9196ky.D())) {
                c9196ky.c(C9149kD.d);
            } else {
                c9196ky.c(C9211lM.d);
            }
        }
        if (c9196ky.H() == null || ((H = c9196ky.H()) != null && H.intValue() == 0)) {
            c9196ky.a(packageInfo != null ? Integer.valueOf(packageInfo.versionCode) : null);
        }
        if (c9196ky.w().isEmpty()) {
            a = dqP.a(packageName);
            c9196ky.d(a);
        }
        String d = d(applicationInfo, c9301mx);
        if (c9196ky.g() == null) {
            String a2 = c9196ky.a();
            int q = c9196ky.q();
            InterfaceC9200lB k = c9196ky.k();
            C8632dsu.d(k);
            c9196ky.c(new C9156kK(interfaceC9147kB, a2, q, k));
        }
        b = dpB.b(new drO<File>() { // from class: com.bugsnag.android.internal.ImmutableConfigKt$sanitiseConfiguration$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final File invoke() {
                File x = C9196ky.this.x();
                return x == null ? context.getCacheDir() : x;
            }
        });
        return e(c9196ky, d, packageInfo, applicationInfo, b);
    }

    private static final String d(final ApplicationInfo applicationInfo, C9301mx c9301mx) {
        String str;
        Bundle bundle = applicationInfo == null ? null : applicationInfo.metaData;
        if (C8632dsu.c(bundle == null ? null : Boolean.valueOf(bundle.containsKey("com.bugsnag.android.BUILD_UUID")), Boolean.TRUE)) {
            str = bundle.getString("com.bugsnag.android.BUILD_UUID");
            if (str == null) {
                str = String.valueOf(bundle.getInt("com.bugsnag.android.BUILD_UUID"));
            }
            if (str.length() <= 0) {
                return null;
            }
        } else if (applicationInfo == null) {
            return null;
        } else {
            try {
                str = (String) c9301mx.c(TaskType.IO, new Callable() { // from class: o.mE
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String a;
                        a = C9255mD.a(applicationInfo);
                        return a;
                    }
                }).get();
            } catch (Exception unused) {
                return null;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(ApplicationInfo applicationInfo) {
        return C9253mB.d.a(applicationInfo);
    }
}
