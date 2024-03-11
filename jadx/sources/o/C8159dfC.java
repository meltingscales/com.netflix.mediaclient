package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import com.netflix.mediaclient.media.VideoResolutionRange;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.Logblob;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* renamed from: o.dfC  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8159dfC {
    private static Boolean c;

    public static String a() {
        return "/android/7.64/api";
    }

    public static boolean b() {
        return false;
    }

    public static boolean c() {
        return false;
    }

    public static void d(aOV aov) {
    }

    public static boolean g() {
        return false;
    }

    public static boolean j() {
        return true;
    }

    public static void c(Logblob logblob) {
        InterfaceC5090bsG e;
        IClientLogging f = AbstractApplicationC1040Mh.getInstance().i().f();
        if (f == null || (e = f.e()) == null) {
            return;
        }
        e.a(logblob);
    }

    public static boolean b(Context context) {
        return c(context) && !C8151dev.c(context) && Build.VERSION.SDK_INT >= 26;
    }

    public static boolean c(Context context) {
        if (c == null) {
            c = Boolean.valueOf(c(context, "com.android.vending"));
        }
        if (c.booleanValue()) {
            return true;
        }
        if (C8151dev.c()) {
            return false;
        }
        return c.booleanValue();
    }

    private static boolean c(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static VideoResolutionRange a(Context context) {
        int i;
        Display[] displays = ((DisplayManager) context.getSystemService(InteractiveAnimation.States.display)).getDisplays();
        int length = displays.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i = Integer.MAX_VALUE;
                break;
            }
            Display display = displays[i2];
            if (display.isValid() && display.getDisplayId() == 0) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                if (C8054ddD.h()) {
                    display.getRealMetrics(displayMetrics);
                } else {
                    display.getMetrics(displayMetrics);
                }
                i = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
            } else {
                i2++;
            }
        }
        return VideoResolutionRange.getVideoResolutionRangeFromMaxHeight(i);
    }

    public static boolean j(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        return audioManager == null || audioManager.getStreamVolume(3) == 0;
    }

    public static boolean f(Context context) {
        return C8054ddD.p(context) && !i(context) && C8157dfA.b(context, "ui.allowpip", true) && !e();
    }

    public static boolean h() {
        return C8151dev.c();
    }

    public static boolean e() {
        aOV d = AbstractApplicationC1040Mh.getInstance().i().d();
        if (d != null) {
            return d.aB();
        }
        return false;
    }

    public static boolean d() {
        aOV d = AbstractApplicationC1040Mh.getInstance().i().d();
        if (d != null) {
            return d.az();
        }
        return false;
    }

    public static boolean i(Context context) {
        return C8151dev.d(context);
    }

    public static boolean i() {
        String e = C8157dfA.e(AbstractApplicationC1040Mh.d(), "nf_drm_esn", (String) null);
        C1044Mm.a("platformUtils", "isUpdatedFromStub:: previous ESN: %s", e);
        if (e != null) {
            if (e.startsWith("NFANDROID1-PRV-S-L3-")) {
                C1044Mm.e("platformUtils", "isUpdatedFromStub:: true (RELEASE)");
                return true;
            } else if (e.startsWith("NFANDROIDD-PRV-S-L3-")) {
                C1044Mm.e("platformUtils", "isUpdatedFromStub:: true (debug)");
                return true;
            } else {
                return false;
            }
        }
        C1044Mm.e("platformUtils", "We do NOT have previous ESN, it must be new installation from store.");
        return false;
    }

    public static boolean d(Context context) {
        return f() || C8054ddD.k(context);
    }

    public static boolean f() {
        return C8168dfL.h(C8054ddD.e()) || i() || C8157dfA.b(AbstractApplicationC1040Mh.d(), "wasUpgradedFromStub2", false);
    }

    public static boolean e(Context context) {
        String e = C8157dfA.e(context, "useragent_current_profile_id", "");
        return C8168dfL.h(e) && !"TEMP_PROFILE_ID".equals(e);
    }
}
