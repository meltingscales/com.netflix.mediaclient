package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: o.ddE  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8055ddE {
    private static String a = null;
    private static String b = null;
    private static boolean d = false;

    public static boolean d() {
        return d;
    }

    public static String a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null!");
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(e(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String h(Context context) {
        String a2 = a(context);
        if (a2 == null) {
            return "";
        }
        int lastIndexOf = a2.lastIndexOf(" ");
        return lastIndexOf > 0 ? a2.substring(0, lastIndexOf) : a2;
    }

    public static String e(Context context) {
        if (a == null) {
            String a2 = a(context);
            if (a2 == null) {
                return "";
            }
            int indexOf = a2.indexOf(" ");
            if (indexOf > 0) {
                a2 = a2.substring(0, indexOf);
            }
            a = a2;
        }
        return a;
    }

    public static int c(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null!");
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(e(), 0);
            if (packageInfo == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String b(Context context) {
        if (b == null) {
            String e = e(context);
            int c = c(context);
            b = e + '-' + c + " R android-" + Build.VERSION.SDK_INT + "-EXO";
        }
        return b;
    }

    public static void g(Context context) {
        int d2 = C8157dfA.d(context, "manifestVersionCode", -1);
        d = d2 == -1;
        int c = c(context);
        boolean z = c > d2 && d2 != -1;
        boolean z2 = c != d2;
        C1044Mm.c("nf_utils", "onApplicationStart lastVersionCode=%d currentVersionCode=%d appUpgraded=%b updateManifestVersionCode=%b", Integer.valueOf(d2), Integer.valueOf(c), Boolean.valueOf(z), Boolean.valueOf(z2));
        if (z) {
            C1044Mm.a("nf_utils", "setting app upgraded pref");
            d(context, true);
        } else if (i(context)) {
            C1044Mm.a("nf_utils", "resetting app upgraded pref");
            d(context, false);
        }
        if (z2) {
            C8157dfA.a(context, "manifestVersionCode", c);
        }
    }

    private static void d(Context context, boolean z) {
        C8157dfA.d(context, "appUpgraded", z);
    }

    public static boolean i(Context context) {
        return C8157dfA.b(context, "appUpgraded", false);
    }

    public static String e() {
        return AbstractApplicationC1040Mh.getInstance().getPackageName();
    }

    public static boolean d(Context context, int i) {
        InterfaceC1248Uj e = C1249Uk.e(context);
        if (e.d().length() == 8) {
            int parseInt = Integer.parseInt(e.d().substring(0, 4));
            int parseInt2 = Integer.parseInt(e.d().substring(4, 6));
            int parseInt3 = Integer.parseInt(e.d().substring(6, 8));
            e.j();
            try {
                Calendar calendar = Calendar.getInstance();
                calendar.clear();
                calendar.set(1, parseInt);
                calendar.set(2, parseInt2 - 1);
                calendar.set(5, parseInt3);
                return TimeUnit.MILLISECONDS.toDays(Math.abs(new Date().getTime() - calendar.getTime().getTime())) > ((long) i);
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    public static long d(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(e(), 0);
            if (packageInfo == null) {
                return 0L;
            }
            return packageInfo.lastUpdateTime;
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
