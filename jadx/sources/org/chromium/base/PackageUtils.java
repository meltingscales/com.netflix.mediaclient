package org.chromium.base;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes6.dex */
public class PackageUtils {
    private static final char[] HEX_CHAR_LOOKUP = "0123456789ABCDEF".toCharArray();

    public static PackageInfo getPackageInfo(String str, int i) {
        try {
            return ContextUtils.getApplicationContext().getPackageManager().getPackageInfo(str, i);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean isPackageInstalled(String str) {
        return getPackageInfo(str, 0) != null;
    }
}
