package o;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.EchoShowUtils;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.Locale;

/* renamed from: o.dev  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8151dev {
    private static DeviceCategory e = DeviceCategory.UNKNOWN;
    private static int a = -1;

    public static DeviceCategory a() {
        if (C8141del.a()) {
            DeviceCategory deviceCategory = DeviceCategory.UNKNOWN;
            e = deviceCategory;
            C8120deQ.e = deviceCategory;
        }
        DeviceCategory deviceCategory2 = C8120deQ.e;
        if (deviceCategory2 != null && deviceCategory2 != DeviceCategory.UNKNOWN) {
            return C8120deQ.e;
        }
        DeviceCategory deviceCategory3 = e;
        if (deviceCategory3 == null || deviceCategory3 == DeviceCategory.UNKNOWN) {
            Context context = (Context) C1332Xp.b(Context.class);
            DeviceCategory c = DeviceCategory.c(C8157dfA.e(context, "nf_device_category_at_start", (String) null));
            if (c != null && c != DeviceCategory.UNKNOWN) {
                e = c;
                C1044Mm.a("DeviceCategoryUtils", "getDeviceCategory dcStored: %s", c);
                return e;
            }
            DeviceCategory deviceCategory4 = DeviceCategory.PHONE;
            if (h()) {
                deviceCategory4 = DeviceCategory.SMART_DISPLAY;
            } else if (c(context)) {
                deviceCategory4 = DeviceCategory.CHROME_OS;
            } else if (b(context)) {
                deviceCategory4 = DeviceCategory.ANDROID_STB;
            } else if (a(context)) {
                deviceCategory4 = DeviceCategory.ANDROID_TV;
            } else if (d(context, 600) && !e(context)) {
                deviceCategory4 = DeviceCategory.TABLET;
            }
            e = deviceCategory4;
            C8157dfA.a(context, "nf_device_category_at_start", deviceCategory4.c());
            C1044Mm.a("DeviceCategoryUtils", "getDeviceCategory firstTime sDeviceCategory: %s", e);
            return e;
        }
        return e;
    }

    public static boolean d() {
        return e((Context) C1332Xp.b(Context.class));
    }

    public static boolean e(Context context) {
        PackageManager packageManager;
        if (b() || (packageManager = context.getPackageManager()) == null || Build.VERSION.SDK_INT < 30) {
            return false;
        }
        return packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean f() {
        return a() != DeviceCategory.PHONE;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.hasSystemFeature("org.chromium.arc");
        }
        return false;
    }

    public static boolean b(Context context) {
        return ((DisplayManager) context.getSystemService(InteractiveAnimation.States.display)).getDisplay(0) == null;
    }

    public static boolean a(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager != null) {
            return uiModeManager.getCurrentModeType() == 4;
        }
        InterfaceC1598aHf.e("UiModeManager is null", null, ErrorType.c, false);
        return false;
    }

    public static boolean h() {
        DeviceCategory deviceCategory = C8120deQ.e;
        if (deviceCategory != null) {
            if (deviceCategory == DeviceCategory.SMART_DISPLAY) {
                a = 1;
            } else {
                a = 0;
            }
        } else if (a < 0) {
            a = d((Context) C1332Xp.b(Context.class)) ? 1 : 0;
        }
        return a == 1;
    }

    public static boolean d(Context context) {
        boolean a2 = EchoShowUtils.a();
        if ("Amazon".equalsIgnoreCase(Build.MANUFACTURER) && a2) {
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
            return a2 || (uiModeManager != null && uiModeManager.getCurrentModeType() == 2);
        }
        return EchoShowUtils.b();
    }

    public static boolean c() {
        return Build.MANUFACTURER.toLowerCase(Locale.US).contains("amazon");
    }

    public static boolean j() {
        return Build.MANUFACTURER.toLowerCase(Locale.US).startsWith("samsu");
    }

    public static String e() {
        return f() ? DeviceCategory.TABLET.c() : DeviceCategory.PHONE.c();
    }

    private static boolean d(Context context, int i) {
        WindowManager windowManager;
        Display defaultDisplay;
        if (context == null || (windowManager = (WindowManager) context.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return false;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        return ((float) i) <= Math.min(((float) i2) / f, ((float) i3) / f);
    }

    public static boolean b() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic"))) {
                String str3 = Build.PRODUCT;
                if (!"google_sdk".equals(str3) && !str3.startsWith("sdk_gphone")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean j(Context context) {
        return d(context, 600);
    }
}
