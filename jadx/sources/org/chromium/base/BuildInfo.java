package org.chromium.base;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.os.BuildCompat;
import java.nio.charset.StandardCharsets;
import o.C9586sT;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.compat.ApiHelperForP;
import org.chromium.build.BuildConfig;

/* loaded from: classes6.dex */
public class BuildInfo {
    private static int $10 = 0;
    private static int $11 = 1;
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MAX_FINGERPRINT_LENGTH = 128;
    private static final String TAG = "BuildInfo";
    private static int b = 1;
    private static int c = 0;
    private static long e$s69$2122 = 0;
    private static byte e$ss2$1921 = 0;
    private static ApplicationInfo sBrowserApplicationInfo = null;
    private static PackageInfo sBrowserPackageInfo = null;
    private static String sFirebaseAppId = "";
    private static boolean sInitialized;
    public final String abiString;
    public final String androidBuildFingerprint;
    public final String customThemes;
    public final String gmsVersionCode;
    public final String hostPackageLabel;
    public final long hostVersionCode;
    public final String installerPackageName;
    public final boolean isAutomotive;
    public final boolean isTV;
    public final String packageName;
    public final String resourcesVersion;
    public final long versionCode;
    public final String versionName;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class Holder {
        private static BuildInfo sInstance = new BuildInfo();
    }

    static {
        a();
        d();
        int i = b + 47;
        c = i % MAX_FINGERPRINT_LENGTH;
        int i2 = i % 2;
    }

    static void a() {
        e$s69$2122 = -20630003025402130L;
    }

    static void d() {
        int i = 2 % 2;
        int i2 = c + 49;
        int i3 = i2 % MAX_FINGERPRINT_LENGTH;
        b = i3;
        e$ss2$1921 = i2 % 2 == 0 ? (byte) 65 : (byte) 24;
        int i4 = i3 + 21;
        c = i4 % MAX_FINGERPRINT_LENGTH;
        int i5 = i4 % 2;
    }

    public static String getFirebaseAppId() {
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 107;
        c = i3 % MAX_FINGERPRINT_LENGTH;
        if (i3 % 2 != 0) {
            str = sFirebaseAppId;
            int i4 = 83 / 0;
        } else {
            str = sFirebaseAppId;
        }
        int i5 = i2 + 101;
        c = i5 % MAX_FINGERPRINT_LENGTH;
        int i6 = i5 % 2;
        return str;
    }

    public static void setBrowserPackageInfo(PackageInfo packageInfo) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 + 103;
        b = i3 % MAX_FINGERPRINT_LENGTH;
        int i4 = i3 % 2;
        sBrowserPackageInfo = packageInfo;
        int i5 = i2 + 81;
        b = i5 % MAX_FINGERPRINT_LENGTH;
        int i6 = i5 % 2;
    }

    public static void setFirebaseAppId(String str) {
        int i = 2 % 2;
        int i2 = b + 7;
        c = i2 % MAX_FINGERPRINT_LENGTH;
        int i3 = i2 % 2;
        sFirebaseAppId = str;
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
    }

    public ApplicationInfo getBrowserApplicationInfo() {
        int i = 2 % 2;
        int i2 = c + 29;
        b = i2 % MAX_FINGERPRINT_LENGTH;
        if (i2 % 2 != 0) {
            return sBrowserApplicationInfo;
        }
        throw null;
    }

    @CalledByNative
    private static String[] getAll() {
        int i = 2 % 2;
        int i2 = c + 53;
        b = i2 % MAX_FINGERPRINT_LENGTH;
        if (i2 % 2 == 0) {
            getInstance().getAllProperties();
            throw null;
        }
        String[] allProperties = getInstance().getAllProperties();
        int i3 = c + 85;
        b = i3 % MAX_FINGERPRINT_LENGTH;
        if (i3 % 2 == 0) {
            int i4 = 27 / 0;
        }
        return allProperties;
    }

    String[] getAllProperties() {
        String str;
        String str2;
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        f(0, new char[]{28789, 2641, 64209, 1841, 28740}, objArr);
        String intern = ((String) objArr[0]).intern();
        String packageName = ContextUtils.getApplicationContext().getPackageName();
        String[] strArr = new String[31];
        strArr[0] = Build.BRAND;
        strArr[1] = Build.DEVICE;
        strArr[2] = Build.ID;
        strArr[3] = Build.MANUFACTURER;
        strArr[4] = Build.MODEL;
        strArr[5] = String.valueOf(Build.VERSION.SDK_INT);
        strArr[6] = Build.TYPE;
        strArr[7] = Build.BOARD;
        strArr[8] = packageName;
        strArr[9] = String.valueOf(this.hostVersionCode);
        strArr[10] = this.hostPackageLabel;
        strArr[11] = this.packageName;
        strArr[12] = String.valueOf(this.versionCode);
        strArr[13] = this.versionName;
        strArr[14] = this.androidBuildFingerprint;
        strArr[15] = this.gmsVersionCode;
        strArr[16] = this.installerPackageName;
        strArr[17] = this.abiString;
        strArr[18] = sFirebaseAppId;
        strArr[19] = this.customThemes;
        strArr[20] = this.resourcesVersion;
        strArr[21] = String.valueOf(ContextUtils.getApplicationContext().getApplicationInfo().targetSdkVersion);
        strArr[22] = isDebugAndroid() ? intern : "0";
        if (this.isTV) {
            int i2 = b + 23;
            c = i2 % MAX_FINGERPRINT_LENGTH;
            int i3 = i2 % 2;
            str = intern;
        } else {
            str = "0";
        }
        strArr[23] = str;
        strArr[24] = Build.VERSION.INCREMENTAL;
        strArr[25] = Build.HARDWARE;
        strArr[26] = isAtLeastT() ? intern : "0";
        if (!this.isAutomotive) {
            str2 = "0";
        } else {
            int i4 = b + 105;
            c = i4 % MAX_FINGERPRINT_LENGTH;
            if (i4 % 2 != 0) {
                int i5 = 2 / 2;
            }
            str2 = intern;
        }
        strArr[27] = str2;
        strArr[28] = BuildCompat.isAtLeastU() ? intern : "0";
        if (targetsAtLeastU()) {
            int i6 = b + 61;
            c = i6 % MAX_FINGERPRINT_LENGTH;
            int i7 = i6 % 2;
        } else {
            intern = "0";
        }
        strArr[29] = intern;
        strArr[30] = Build.VERSION.CODENAME;
        return strArr;
    }

    private static String nullToEmpty(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 + 33;
        b = i3 % MAX_FINGERPRINT_LENGTH;
        int i4 = i3 % 2;
        if (charSequence == null) {
            int i5 = i2 + 17;
            b = i5 % MAX_FINGERPRINT_LENGTH;
            if (i5 % 2 == 0) {
                int i6 = 4 / 2;
                return "";
            }
            return "";
        }
        return charSequence.toString();
    }

    public static long packageVersionCode(PackageInfo packageInfo) {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT >= 28) {
            int i2 = c + 49;
            b = i2 % MAX_FINGERPRINT_LENGTH;
            int i3 = i2 % 2;
            return ApiHelperForP.getLongVersionCode(packageInfo);
        }
        long j = packageInfo.versionCode;
        int i4 = c + 23;
        b = i4 % MAX_FINGERPRINT_LENGTH;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return j;
    }

    public static BuildInfo getInstance() {
        int i = 2 % 2;
        int i2 = c + 3;
        b = i2 % MAX_FINGERPRINT_LENGTH;
        int i3 = i2 % 2;
        BuildInfo buildInfo = Holder.sInstance;
        int i4 = b + 11;
        c = i4 % MAX_FINGERPRINT_LENGTH;
        int i5 = i4 % 2;
        return buildInfo;
    }

    BuildInfo() {
        String str;
        String str2;
        boolean z = true;
        sInitialized = true;
        Context applicationContext = ContextUtils.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        PackageManager packageManager = applicationContext.getPackageManager();
        boolean z2 = false;
        PackageInfo packageInfo = PackageUtils.getPackageInfo(packageName, 0);
        long packageVersionCode = packageVersionCode(packageInfo);
        this.hostVersionCode = packageVersionCode;
        PackageInfo packageInfo2 = sBrowserPackageInfo;
        if (packageInfo2 != null) {
            this.packageName = packageInfo2.packageName;
            this.versionCode = packageVersionCode(packageInfo2);
            this.versionName = nullToEmpty(sBrowserPackageInfo.versionName);
            sBrowserApplicationInfo = sBrowserPackageInfo.applicationInfo;
            sBrowserPackageInfo = null;
            int i = b + 91;
            c = i % MAX_FINGERPRINT_LENGTH;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            this.packageName = packageName;
            this.versionCode = packageVersionCode;
            this.versionName = nullToEmpty(packageInfo.versionName);
            sBrowserApplicationInfo = applicationContext.getApplicationInfo();
        }
        this.hostPackageLabel = nullToEmpty(packageManager.getApplicationLabel(packageInfo.applicationInfo));
        this.installerPackageName = nullToEmpty(packageManager.getInstallerPackageName(this.packageName));
        PackageInfo packageInfo3 = PackageUtils.getPackageInfo("com.google.android.gms", 0);
        if (packageInfo3 != null) {
            int i4 = b + 103;
            c = i4 % MAX_FINGERPRINT_LENGTH;
            if (i4 % 2 != 0) {
                String.valueOf(packageVersionCode(packageInfo3));
                throw null;
            } else {
                str = String.valueOf(packageVersionCode(packageInfo3));
                int i5 = 2 % 2;
            }
        } else {
            str = "gms versionCode not available.";
        }
        this.gmsVersionCode = str;
        this.customThemes = String.valueOf(PackageUtils.isPackageInstalled("projekt.substratum"));
        if (BuildConfig.R_STRING_PRODUCT_VERSION != 0) {
            int i6 = c + 17;
            b = i6 % MAX_FINGERPRINT_LENGTH;
            int i7 = i6 % 2;
            try {
                str2 = ContextUtils.getApplicationContext().getString(BuildConfig.R_STRING_PRODUCT_VERSION);
                if (str2.startsWith("'!#+")) {
                    Object[] objArr = new Object[1];
                    e(str2.substring(4), objArr);
                    str2 = ((String) objArr[0]).intern();
                    int i8 = b + 111;
                    c = i8 % MAX_FINGERPRINT_LENGTH;
                    if (i8 % 2 != 0) {
                        int i9 = 2 / 2;
                    } else {
                        int i10 = 2 % 2;
                    }
                }
            } catch (Exception unused) {
                str2 = "Not found";
            }
        } else {
            str2 = "Not Enabled";
        }
        this.resourcesVersion = str2;
        this.abiString = TextUtils.join(", ", Build.SUPPORTED_ABIS);
        String str3 = Build.FINGERPRINT;
        this.androidBuildFingerprint = str3.substring(0, Math.min(str3.length(), (int) MAX_FINGERPRINT_LENGTH));
        UiModeManager uiModeManager = (UiModeManager) applicationContext.getSystemService("uimode");
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            int i11 = c + 79;
            b = i11 % MAX_FINGERPRINT_LENGTH;
            if (i11 % 2 != 0) {
                int i12 = 2 % 2;
            }
            z = false;
        } else {
            int i13 = 2 % 2;
        }
        this.isTV = z;
        try {
            z2 = packageManager.hasSystemFeature("android.hardware.type.automotive");
        } catch (SecurityException e) {
            Log.e(TAG, "Unable to query for Automotive system feature", (Throwable) e);
        }
        this.isAutomotive = z2;
    }

    public static boolean isDebugAndroid() {
        int i = 2 % 2;
        int i2 = b + 75;
        c = i2 % MAX_FINGERPRINT_LENGTH;
        int i3 = i2 % 2;
        String str = Build.TYPE;
        if (!"eng".equals(str)) {
            int i4 = c + 51;
            b = i4 % MAX_FINGERPRINT_LENGTH;
            int i5 = i4 % 2;
            if (!"userdebug".equals(str)) {
                return false;
            }
            int i6 = c + 33;
            b = i6 % MAX_FINGERPRINT_LENGTH;
            int i7 = i6 % 2;
        }
        return true;
    }

    public static boolean isDebugApp() {
        int i = 2 % 2;
        int i2 = c + 93;
        b = i2 % MAX_FINGERPRINT_LENGTH;
        int i3 = i2 % 2;
        if ((ContextUtils.getApplicationContext().getApplicationInfo().flags & 2) != 0) {
            int i4 = b + 53;
            c = i4 % MAX_FINGERPRINT_LENGTH;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = b + 125;
        c = i6 % MAX_FINGERPRINT_LENGTH;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (isDebugApp() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        isDebugApp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (isDebugAndroid() == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (isDebugAndroid() == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        r1 = org.chromium.base.BuildInfo.c + 25;
        org.chromium.base.BuildInfo.b = r1 % org.chromium.base.BuildInfo.MAX_FINGERPRINT_LENGTH;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isDebugAndroidOrApp() {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = org.chromium.base.BuildInfo.b
            int r1 = r1 + 73
            int r2 = r1 % 128
            org.chromium.base.BuildInfo.c = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L19
            boolean r1 = isDebugAndroid()
            r3 = 19
            int r3 = r3 / r2
            if (r1 != 0) goto L36
            goto L1f
        L19:
            boolean r1 = isDebugAndroid()
            if (r1 != 0) goto L36
        L1f:
            int r1 = org.chromium.base.BuildInfo.c
            int r1 = r1 + 25
            int r3 = r1 % 128
            org.chromium.base.BuildInfo.b = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L31
            boolean r0 = isDebugApp()
            if (r0 == 0) goto L37
            goto L36
        L31:
            isDebugApp()
            r0 = 0
            throw r0
        L36:
            r2 = 1
        L37:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.BuildInfo.isDebugAndroidOrApp():boolean");
    }

    @Deprecated
    public static boolean isAtLeastT() {
        int i = 2 % 2;
        int i2 = b + 21;
        c = i2 % MAX_FINGERPRINT_LENGTH;
        int i3 = i2 % 2;
        boolean isAtLeastT = BuildCompat.isAtLeastT();
        int i4 = c + 75;
        b = i4 % MAX_FINGERPRINT_LENGTH;
        int i5 = i4 % 2;
        return isAtLeastT;
    }

    @Deprecated
    public static boolean targetsAtLeastT() {
        boolean z;
        int i = 2 % 2;
        if (ContextUtils.getApplicationContext().getApplicationInfo().targetSdkVersion >= 33) {
            int i2 = b + 63;
            int i3 = i2 % MAX_FINGERPRINT_LENGTH;
            c = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 73;
            b = i5 % MAX_FINGERPRINT_LENGTH;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        int i7 = b + 93;
        c = i7 % MAX_FINGERPRINT_LENGTH;
        int i8 = i7 % 2;
        return z;
    }

    public static boolean targetsAtLeastU() {
        int i = 2 % 2;
        int i2 = ContextUtils.getApplicationContext().getApplicationInfo().targetSdkVersion;
        boolean z = false;
        if (!(!BuildCompat.isAtLeastU()) && i2 == 10000) {
            int i3 = c + 43;
            b = i3 % MAX_FINGERPRINT_LENGTH;
            z = i3 % 2 != 0;
        }
        int i4 = c + 5;
        b = i4 % MAX_FINGERPRINT_LENGTH;
        int i5 = i4 % 2;
        return z;
    }

    public static void resetForTesting() {
        int i = 2 % 2;
        Holder.sInstance = new BuildInfo();
        int i2 = c + 107;
        b = i2 % MAX_FINGERPRINT_LENGTH;
        int i3 = i2 % 2;
    }

    private static void e(String str, Object[] objArr) {
        int i = 2 % 2;
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        int i2 = 0;
        while (i2 < decode.length) {
            int i3 = c + 59;
            int i4 = i3 % MAX_FINGERPRINT_LENGTH;
            b = i4;
            int i5 = i3 % 2;
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$1921);
            i2++;
            int i6 = i4 + 61;
            c = i6 % MAX_FINGERPRINT_LENGTH;
            int i7 = i6 % 2;
        }
        String str2 = new String(bArr, StandardCharsets.UTF_8);
        int i8 = b + 61;
        c = i8 % MAX_FINGERPRINT_LENGTH;
        if (i8 % 2 == 0) {
            objArr[0] = str2;
            return;
        }
        int i9 = 31 / 0;
        objArr[0] = str2;
    }

    private static void f(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        C9586sT c9586sT = new C9586sT();
        char[] b2 = C9586sT.b(e$s69$2122 ^ 7567248728798573470L, cArr, i);
        c9586sT.d = 4;
        int i3 = $11 + 83;
        $10 = i3 % MAX_FINGERPRINT_LENGTH;
        int i4 = i3 % 2;
        while (c9586sT.d < b2.length) {
            int i5 = $10 + 111;
            $11 = i5 % MAX_FINGERPRINT_LENGTH;
            int i6 = i5 % 2;
            c9586sT.b = c9586sT.d - 4;
            b2[c9586sT.d] = (char) ((b2[c9586sT.d] ^ b2[c9586sT.d % 4]) ^ (c9586sT.b * (e$s69$2122 ^ 7567248728798573470L)));
            c9586sT.d++;
        }
        objArr[0] = new String(b2, 4, b2.length - 4);
    }
}
