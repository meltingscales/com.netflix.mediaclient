package org.chromium.base;

import java.util.Map;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes6.dex */
public class JNIUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "JNIUtils";
    private static ClassLoader sJniClassLoader;
    private static Boolean sSelectiveJniRegistrationEnabled;

    public static void enableSelectiveJniRegistration() {
        sSelectiveJniRegistrationEnabled = Boolean.TRUE;
    }

    public static void setClassLoader(ClassLoader classLoader) {
        sJniClassLoader = classLoader;
    }

    @CalledByNative
    private static ClassLoader getSplitClassLoader(String str) {
        if (!str.isEmpty()) {
            boolean isIsolatedSplitInstalled = BundleUtils.isIsolatedSplitInstalled(str);
            Log.i(TAG, "Init JNI Classloader for %s. isInstalled=%b", str, Boolean.valueOf(isIsolatedSplitInstalled));
            if (isIsolatedSplitInstalled) {
                return BundleUtils.getOrCreateSplitClassLoader(str);
            }
        }
        ClassLoader classLoader = sJniClassLoader;
        return classLoader != null ? classLoader : JNIUtils.class.getClassLoader();
    }

    @CalledByNative
    public static boolean isSelectiveJniRegistrationEnabled() {
        if (sSelectiveJniRegistrationEnabled == null) {
            sSelectiveJniRegistrationEnabled = Boolean.FALSE;
        }
        return sSelectiveJniRegistrationEnabled.booleanValue();
    }

    public static <K, V> void splitMap(Map<K, V> map, K[] kArr, V[] vArr) {
        int i = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            kArr[i] = entry.getKey();
            vArr[i] = entry.getValue();
            i++;
        }
    }
}
