package o;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_isFoldableModel;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.deu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8150deu {
    private static JSONObject c;
    private static final AtomicBoolean d = new AtomicBoolean(false);

    private C8150deu() {
    }

    public static String d(Context context) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C1249Uk.e(context).a());
        stringBuffer.append(" (");
        stringBuffer.append(C1249Uk.e(context).e());
        stringBuffer.append(") ");
        stringBuffer.append(C8055ddE.c(AbstractApplicationC1040Mh.d()));
        return stringBuffer.toString();
    }

    public static String t(Context context) {
        String e = C8055ddE.e(context);
        return (e == null || e.isEmpty()) ? "N/A" : e;
    }

    public static int c(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public static void d(Activity activity) {
        if (s(activity)) {
            activity.setRequestedOrientation(6);
        } else {
            activity.setRequestedOrientation(7);
        }
    }

    public static int n(Context context) {
        return context.getResources().getConfiguration().screenLayout & 15;
    }

    public static float i(Context context) {
        return p(context) / l(context);
    }

    public static int k(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static int o(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        return i < i2 ? i : i2;
    }

    public static int m(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        return i > i2 ? i : i2;
    }

    public static int p(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static Rect g(Context context) {
        return new Rect(0, 0, p(context), l(context));
    }

    public static int l(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int c(Activity activity) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static boolean s(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean y(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public static boolean g() {
        return !h();
    }

    public static boolean h() {
        return C8151dev.f();
    }

    public static boolean w(Context context) {
        return h() || (r(context) && C8151dev.j(context));
    }

    public static boolean f() {
        return C8151dev.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.Context] */
    public static boolean r(Context context) {
        try {
            return Config_FastProperty_isFoldableModel.isEnabled() || C8151dev.e(context);
        } catch (NullPointerException unused) {
            C1044Mm.j("nf_device_utils", "unable to access fast property, are you in unit test");
            return context;
        } finally {
            C8151dev.e(context);
        }
    }

    public static DisplayCutout b(Context context) {
        Display display;
        DisplayCutout cutout;
        DisplayManager displayManager = (DisplayManager) context.getSystemService(InteractiveAnimation.States.display);
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            return null;
        }
        cutout = display.getCutout();
        return cutout;
    }

    public static JSONObject e(Context context) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("dpi", k(context));
        jSONObject.put("screenWidthPixels", o(context));
        jSONObject.put("screenHeightPixels", m(context));
        if (Build.VERSION.SDK_INT >= 29) {
            DisplayCutout b = b(context);
            if (b(context) != null) {
                jSONObject.put("displayCutout", d(b));
            }
        }
        return jSONObject;
    }

    public static JSONObject d(DisplayCutout displayCutout) {
        try {
            return new JSONObject(C8118deO.a().toJson(new d(displayCutout)));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: o.deu$d */
    /* loaded from: classes.dex */
    public static class d {
        @SerializedName("displayCutoutRects")
        protected List<c> b = new ArrayList();

        public d(DisplayCutout displayCutout) {
            List<Rect> boundingRects;
            if (displayCutout != null) {
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    if (!rect.isEmpty()) {
                        this.b.add(new c(rect));
                    }
                }
            }
        }
    }

    /* renamed from: o.deu$c */
    /* loaded from: classes.dex */
    public static class c {
        @SerializedName("right")
        protected Integer a;
        @SerializedName("left")
        protected Integer b;
        @SerializedName("bottom")
        protected Integer c;
        @SerializedName("top")
        protected Integer e;

        public c(Rect rect) {
            if (rect != null) {
                this.e = Integer.valueOf(rect.top);
                this.b = Integer.valueOf(rect.left);
                this.c = Integer.valueOf(rect.bottom);
                this.a = Integer.valueOf(rect.right);
            }
        }
    }

    public static JSONObject f(Context context) {
        JSONObject jSONObject = new JSONObject();
        long c2 = C9343nm.c(context) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        jSONObject.put("numCpuCores", C9343nm.c());
        jSONObject.put("cpuFreqInMhz", C9343nm.e() / 1000);
        jSONObject.put("totalRAMInMb", c2);
        jSONObject.put("gl", c);
        return jSONObject;
    }

    public static void e(Activity activity) {
        activity.getWindow().setSoftInputMode(2);
    }

    public static void b(Activity activity, EditText editText) {
        if (activity != null) {
            e((InputMethodManager) activity.getSystemService("input_method"), editText);
        }
    }

    public static void e(InputMethodManager inputMethodManager, EditText editText) {
        if (inputMethodManager == null || editText == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public static boolean b(int i) {
        synchronized (C8150deu.class) {
            if (i <= 0) {
                C1044Mm.e("nf_device_utils", "Everybody is enabled");
                return true;
            } else if (i >= 100) {
                C1044Mm.e("nf_device_utils", "Everybody is disabled");
                return false;
            } else {
                int e = (int) (e(AbstractC1838aQc.c(AbstractApplicationC1040Mh.d())) % 100);
                if (e < 0) {
                    e += 100;
                }
                return e <= 100 - i;
            }
        }
    }

    private static long e(String str) {
        long j = 0;
        for (char c2 : str.toCharArray()) {
            j = (j * 31) + c2;
        }
        return j;
    }

    public static boolean a(Context context) {
        try {
            int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
            if (isGooglePlayServicesAvailable == 0) {
                C1044Mm.e("nf_device_utils", "Success!");
                return true;
            } else if (1 == isGooglePlayServicesAvailable) {
                C1044Mm.e("nf_device_utils", "Device is not Google certified, skip");
                return false;
            } else if (9 != isGooglePlayServicesAvailable) {
                C1044Mm.e("nf_device_utils", "Device is Google certified, problem with Google Play Services");
                return true;
            } else {
                C1044Mm.e("nf_device_utils", "Device is not Google certified, skip");
                return false;
            }
        } catch (Throwable th) {
            C1044Mm.b("nf_device_utils", th, "Can not use Google Play services", new Object[0]);
            InterfaceC1598aHf.e("canUseGooglePlayServices fails", th);
            return false;
        }
    }

    public static int h(Context context) {
        return GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public static int j(Context context) {
        return b(context, 0);
    }

    public static int b(Context context, int i) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            C1044Mm.a("nf_device_utils", "Package versionCode: %d, versionName: %s", Integer.valueOf(packageInfo.versionCode), packageInfo.versionName);
            return packageInfo.versionCode;
        } catch (Throwable unused) {
            C1044Mm.e("nf_device_utils", "gms package not available");
            return i;
        }
    }

    public static boolean q(Context context) {
        return j(context) < h(context);
    }

    public static boolean c(InterfaceC5123bsn interfaceC5123bsn, InterfaceC5187bty interfaceC5187bty) {
        return interfaceC5123bsn.c() && interfaceC5187bty.ar();
    }

    public static boolean a(InterfaceC5123bsn interfaceC5123bsn, InterfaceC5187bty interfaceC5187bty) {
        return interfaceC5123bsn.i() && interfaceC5187bty.aw();
    }

    public static boolean d(InterfaceC5123bsn interfaceC5123bsn, InterfaceC5187bty interfaceC5187bty) {
        return interfaceC5123bsn.b() && interfaceC5187bty.al();
    }

    public static boolean e(InterfaceC5187bty interfaceC5187bty) {
        return interfaceC5187bty.ai();
    }

    public static boolean e(InterfaceC5123bsn interfaceC5123bsn, InterfaceC5187bty interfaceC5187bty) {
        return interfaceC5123bsn.e() && interfaceC5187bty.av();
    }

    public static boolean b(InterfaceC5123bsn interfaceC5123bsn, InterfaceC5187bty interfaceC5187bty) {
        return interfaceC5123bsn.d() && interfaceC5187bty.an();
    }

    public static boolean c() {
        return C8151dev.c(AbstractApplicationC1040Mh.d());
    }

    public static boolean d() {
        return C8151dev.b(AbstractApplicationC1040Mh.d());
    }

    public static boolean e() {
        return C8151dev.a(AbstractApplicationC1040Mh.d());
    }

    public static void a(Activity activity) {
        if (C8054ddD.l(activity)) {
            return;
        }
        a(activity.getWindow());
    }

    public static void a(Window window) {
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(768);
        }
    }

    @Deprecated
    public static void b(Activity activity) {
        if (C8054ddD.l(activity)) {
            return;
        }
        b(activity.getWindow());
    }

    @Deprecated
    public static void b(Window window) {
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(2822);
        }
    }

    public static void a(Window window, int i) {
        if (Build.VERSION.SDK_INT <= 30) {
            b(window);
            return;
        }
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        insetsController.setSystemBarsBehavior(i);
        insetsController.hide(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.navigationBars());
    }

    public static long b() {
        return System.currentTimeMillis();
    }

    public static boolean c(int i) {
        NV e = ((NW) C1332Xp.b(NW.class)).e();
        if (e != null) {
            return e.e(i);
        }
        return false;
    }

    public static boolean a() {
        return d.get();
    }

    public static void a(Boolean bool) {
        d.set(bool.booleanValue());
    }
}
