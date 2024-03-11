package o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.view.Display;
import android.view.LayoutInflater;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.io.File;
import java.nio.charset.StandardCharsets;
import o.C9671um;
import org.chromium.net.ConnectionSubtype;

/* renamed from: o.ddD  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8054ddD {
    private static int a = 1;
    private static int b;
    private static final InterfaceC5337bwp e;
    private static byte e$ss2$532;

    @TargetApi(24)
    /* renamed from: o.ddD$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        T d(Display.HdrCapabilities hdrCapabilities);
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT > 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean b(Display.HdrCapabilities hdrCapabilities) {
        return Boolean.TRUE;
    }

    public static int c() {
        return Build.VERSION.SDK_INT;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT > 29;
    }

    public static void e(Activity activity) {
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT > 25;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT > 31;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT > 26;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT > 32;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT > 30;
    }

    static void k() {
        e$ss2$532 = (byte) 24;
    }

    public static boolean o() {
        return Build.VERSION.SDK_INT > 27;
    }

    public static Bitmap d(Bitmap bitmap, int i, int i2, boolean z) {
        int i3;
        int i4;
        C8166dfJ.c();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0 || i <= 0 || i2 <= 0) {
            return bitmap;
        }
        if (width > height) {
            i4 = (i2 * height) / width;
            i3 = i;
        } else {
            i3 = (width * i2) / height;
            i4 = i2;
        }
        C1044Mm.c("nf_utils", "originalW=%d originalH=%d dstWidth=%d dstHeight=%d newWidth=%d newHeight=%d", Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        return Bitmap.createScaledBitmap(bitmap, i3, i4, z);
    }

    public static boolean c(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) != 0;
    }

    public static long b() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    public static ResolveInfo b(Context context, Intent intent) {
        if (context != null) {
            if (intent == null) {
                throw new IllegalArgumentException("Intent cannot be null!");
            }
            try {
                return context.getPackageManager().resolveActivity(intent, 0);
            } catch (Throwable unused) {
                return null;
            }
        }
        throw new IllegalArgumentException("Context cannot be null!");
    }

    public static boolean k(Context context) {
        try {
            int i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags;
            return ((i & 1) == 0 && (i & 128) == 0) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String e() {
        return e("ro.netflix.signup", "");
    }

    public static String c(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.netflix.partner.activation", 0);
            String str = (applicationInfo.flags & 1) != 0 ? "system" : NotificationFactory.DATA;
            if (applicationInfo.enabled) {
                return str;
            }
            return str + "-disabled";
        } catch (PackageManager.NameNotFoundException unused) {
            return "notInstalled";
        }
    }

    public static boolean g(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo("com.netflix.partner.activation", 0).flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean m(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.netflix.partner.activation", 0).flags != 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean l(Context context) {
        return C8141del.c(context);
    }

    public static void d(Context context) {
        String[] list;
        File file = new File(context.getCacheDir().getParent());
        if (!file.exists() || (list = file.list()) == null || list.length <= 0) {
            return;
        }
        for (String str : list) {
            if (!str.equals("lib")) {
                d(new File(file, str));
            }
        }
    }

    public static boolean d(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null && list.length > 0) {
            for (String str : list) {
                if (!d(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static void d(final Context context, long j) {
        C8187dfe.a(new Runnable() { // from class: o.ddD.2
            @Override // java.lang.Runnable
            public void run() {
                C8054ddD.e(context);
            }
        }, j);
    }

    public static void e(Context context) {
        r(context);
        Process.killProcess(Process.myPid());
    }

    private static void r(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            audioManager.setStreamMute(3, false);
            C1044Mm.e("nf_utils", "UN-MUTED");
        }
    }

    public static void d(Activity activity) {
        if (activity != null && c() > 18) {
            activity.getWindow().addFlags(8192);
        }
    }

    public static ClassLoader b(Class cls) {
        ClassLoader classLoader = cls.getClassLoader();
        return classLoader != null ? classLoader : ClassLoader.getSystemClassLoader();
    }

    public static boolean o(Context context) {
        if (context != null) {
            return ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        }
        return false;
    }

    public static boolean p(Context context) {
        if (o() && !o(context) && context.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
            String packageName = context.getPackageName();
            try {
                return appOpsManager.checkOpNoThrow("android:picture_in_picture", context.getPackageManager().getPackageUid(packageName, 0), packageName) == 0;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    public static <T> T a(Context context, Class<T> cls) {
        return (T) C8141del.d(context, cls);
    }

    public static long a(File file) {
        try {
            if (file.exists()) {
                return new StatFs(file.getPath()).getAvailableBytes();
            }
            return 0L;
        } catch (IllegalArgumentException unused) {
            return 0L;
        }
    }

    public static boolean m() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static File a(Context context) {
        if (context == null || !m()) {
            return null;
        }
        return context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
    }

    public static int e(Context context, int i) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getInteger(i);
    }

    public static long d(long j) {
        return j / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    public static boolean f(Context context) {
        return a(context, 2);
    }

    public static boolean h(Context context) {
        return a(context, 1);
    }

    @TargetApi(ConnectionSubtype.SUBTYPE_WIFI_G)
    public static boolean i(Context context) {
        return a(context, 4);
    }

    public static boolean n(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "screen_brightness_mode") == 1;
    }

    public static float j(Context context) {
        return ((Float) d(context, -1, new a() { // from class: o.ddL
            @Override // o.C8054ddD.a
            public final Object d(Display.HdrCapabilities hdrCapabilities) {
                return Float.valueOf(hdrCapabilities.getDesiredMaxLuminance());
            }
        }, Float.valueOf(-1.0f))).floatValue();
    }

    public static boolean a(Context context, int i) {
        return ((Boolean) d(context, i, new a() { // from class: o.ddI
            @Override // o.C8054ddD.a
            public final Object d(Display.HdrCapabilities hdrCapabilities) {
                Boolean b2;
                b2 = C8054ddD.b(hdrCapabilities);
                return b2;
            }
        }, Boolean.FALSE)).booleanValue();
    }

    public static <T> T d(Context context, int i, a<T> aVar, T t) {
        if (c() >= 24) {
            for (Display display : ((DisplayManager) context.getSystemService(InteractiveAnimation.States.display)).getDisplays()) {
                Display.HdrCapabilities hdrCapabilities = display.getHdrCapabilities();
                if (hdrCapabilities != null) {
                    if (i == -1) {
                        return aVar.d(hdrCapabilities);
                    }
                    for (int i2 : hdrCapabilities.getSupportedHdrTypes()) {
                        if (i2 == i) {
                            return aVar.d(hdrCapabilities);
                        }
                    }
                    continue;
                }
            }
        }
        return t;
    }

    public static String e(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e2) {
            C1044Mm.e("nf_utils", "Exception while getting system property: ", e2);
            return str2;
        }
    }

    static {
        k();
        e = new InterfaceC5337bwp() { // from class: o.ddD.3
            @Override // o.InterfaceC5337bwp
            public void c(Exception exc) {
                InterfaceC1598aHf.a("SPY-18205 BadTokenException in AndroidUtils.showToast");
            }
        };
    }

    @SuppressLint({"netflix.ToastUiUtilsShow"})
    public static Toast b(Context context, String str, int i) {
        return c(context, str, i, C9671um.d.d, C9671um.d.b);
    }

    @SuppressLint({"netflix.ToastUiUtilsShow"})
    public static Toast b(Activity activity, String str, int i) {
        return c(activity, str, i, C9671um.d.d, C9671um.d.b);
    }

    private static Toast c(Context context, String str, int i, int i2, int i3) {
        if (!C8067ddQ.c() || C8067ddQ.d()) {
            Context c5343bwv = Build.VERSION.SDK_INT == 25 ? new C5343bwv(context, e) : context;
            C9674up d = C9674up.d((LayoutInflater) context.getSystemService("layout_inflater"));
            d.b.setText(str);
            d.e.setImageResource(i2);
            d.e.setBackground(ContextCompat.getDrawable(context, i3));
            Toast toast = new Toast(c5343bwv);
            toast.setView(d.d());
            toast.setDuration(i);
            return toast;
        }
        return null;
    }

    @SuppressLint({"netflix.ToastUiUtilsShow"})
    public static Toast a(Context context, String str, int i) {
        Toast b2 = b(context, str, i);
        if (b2 != null) {
            b2.show();
        }
        return b2;
    }

    @SuppressLint({"netflix.ToastUiUtilsShow"})
    public static Toast c(Context context, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a + 5;
        b = i4 % 128;
        int i5 = i4 % 2;
        String string = context.getString(i);
        Object obj = null;
        if (string.startsWith("'!#+")) {
            int i6 = a + 73;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                String substring = string.substring(4);
                Object[] objArr = new Object[1];
                q(substring, objArr);
                ((String) objArr[0]).intern();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            q(string.substring(4), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        Toast a2 = a(context, string, i2);
        int i7 = b + 15;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return a2;
        }
        obj.hashCode();
        throw null;
    }

    public static Context b(Context context) {
        try {
            return context.createPackageContext(context.getPackageName(), 1);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static void q(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$532);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
