package org.chromium.base;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.compat.ApiHelperForO;
import org.chromium.base.metrics.RecordHistogram;
import org.chromium.build.BuildConfig;

/* loaded from: classes6.dex */
public class BundleUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String LOADED_SPLITS_KEY = "split_compat_loaded_splits";
    private static final String TAG = "BundleUtils";
    private static Boolean sIsBundle;
    private static SplitCompatClassLoader sSplitCompatClassLoaderInstance;
    private static ArrayList<String> sSplitsToRestore;
    private static final Object sSplitLock = new Object();
    private static final ArrayMap<String, ClassLoader> sCachedClassLoaders = new ArrayMap<>();
    private static final Map<String, ClassLoader> sInflationClassLoaders = Collections.synchronizedMap(new ArrayMap());

    public static Object getSplitContextLock() {
        return sSplitLock;
    }

    public static void resetForTesting() {
        sIsBundle = null;
        sCachedClassLoaders.clear();
        sInflationClassLoaders.clear();
        sSplitCompatClassLoaderInstance = null;
        sSplitsToRestore = null;
    }

    @CalledByNative
    public static boolean isBundleForNative() {
        return isBundle();
    }

    public static boolean isBundle() {
        if (BuildConfig.BUNDLES_SUPPORTED) {
            return sIsBundle.booleanValue();
        }
        return false;
    }

    public static void setIsBundle(boolean z) {
        sIsBundle = Boolean.valueOf(z);
    }

    public static boolean isolatedSplitsEnabled() {
        return BuildConfig.ISOLATED_SPLITS_ENABLED;
    }

    private static String getSplitApkPath(String str) {
        String[] strArr;
        int binarySearch;
        ApplicationInfo applicationInfo = ContextUtils.getApplicationContext().getApplicationInfo();
        strArr = applicationInfo.splitNames;
        if (strArr != null && (binarySearch = Arrays.binarySearch(strArr, str)) >= 0) {
            return applicationInfo.splitSourceDirs[binarySearch];
        }
        return null;
    }

    public static boolean isIsolatedSplitInstalled(String str) {
        return Build.VERSION.SDK_INT >= 26 && getSplitApkPath(str) != null;
    }

    public static Context createIsolatedSplitContext(Context context, String str) {
        Context createContextForSplit;
        if (Build.VERSION.SDK_INT < 26) {
            return context;
        }
        try {
            if (isApplicationContext(context)) {
                createContextForSplit = ApiHelperForO.createContextForSplit(context, str);
            } else {
                synchronized (getSplitContextLock()) {
                    createContextForSplit = ApiHelperForO.createContextForSplit(context, str);
                }
            }
            ClassLoader parent = createContextForSplit.getClassLoader().getParent();
            Context applicationContext = ContextUtils.getApplicationContext();
            boolean z = true;
            boolean z2 = (!isolatedSplitsEnabled() || parent.equals(BundleUtils.class.getClassLoader()) || applicationContext == null || parent.equals(applicationContext.getClassLoader())) ? false : true;
            ArrayMap<String, ClassLoader> arrayMap = sCachedClassLoaders;
            synchronized (arrayMap) {
                if (z2 && !arrayMap.containsKey(str)) {
                    arrayMap.put(str, new PathClassLoader(getSplitApkPath(str), applicationContext.getClassLoader()));
                }
                ClassLoader classLoader = arrayMap.get(str);
                if (classLoader != null) {
                    if (!classLoader.equals(createContextForSplit.getClassLoader())) {
                        replaceClassLoader(createContextForSplit, classLoader);
                    }
                } else {
                    arrayMap.put(str, createContextForSplit.getClassLoader());
                }
                z = z2;
            }
            RecordHistogram.recordBooleanHistogram("Android.IsolatedSplits.ClassLoaderReplaced." + str, z);
            return createContextForSplit;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void replaceClassLoader(Context context, ClassLoader classLoader) {
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        try {
            Field declaredField = context.getClass().getDeclaredField("mClassLoader");
            declaredField.setAccessible(true);
            declaredField.set(context, classLoader);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Error setting ClassLoader.", e);
        }
    }

    @CalledByNative
    public static String getNativeLibraryPath(String str, String str2) {
        StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
        try {
            String findLibrary = ((BaseDexClassLoader) BundleUtils.class.getClassLoader()).findLibrary(str);
            if (findLibrary != null) {
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                return findLibrary;
            }
            ClassLoader classLoader = ContextUtils.getApplicationContext().getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                findLibrary = ((BaseDexClassLoader) classLoader).findLibrary(str);
            } else if (classLoader instanceof WrappedClassLoader) {
                findLibrary = ((WrappedClassLoader) classLoader).findLibrary(str);
            }
            if (findLibrary != null) {
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                return findLibrary;
            }
            String splitApkLibraryPath = getSplitApkLibraryPath(str, str2);
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return splitApkLibraryPath;
        } catch (Throwable th) {
            if (allowDiskReads != null) {
                try {
                    allowDiskReads.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void checkContextClassLoader(Context context, Activity activity) {
        ClassLoader classLoader = activity.getClass().getClassLoader();
        if (classLoader != context.getClassLoader()) {
            Log.w(TAG, "Mismatched ClassLoaders between Activity and context (fixing): %s", activity.getClass());
            replaceClassLoader(context, classLoader);
        }
    }

    public static Object newInstance(Context context, String str) {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext != null && canLoadClass(applicationContext.getClassLoader(), str)) {
            context = applicationContext;
        }
        try {
            return context.getClassLoader().loadClass(str).newInstance();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    public static Context createContextForInflation(Context context, String str) {
        if (isIsolatedSplitInstalled(str)) {
            final ClassLoader registerSplitClassLoaderForInflation = registerSplitClassLoaderForInflation(str);
            return new ContextWrapper(context) { // from class: org.chromium.base.BundleUtils.1
                @Override // android.content.ContextWrapper, android.content.Context
                public ClassLoader getClassLoader() {
                    return registerSplitClassLoaderForInflation;
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public Object getSystemService(String str2) {
                    Object systemService = super.getSystemService(str2);
                    return "layout_inflater".equals(str2) ? ((LayoutInflater) systemService).cloneInContext(this) : systemService;
                }
            };
        }
        return context;
    }

    public static ClassLoader getOrCreateSplitClassLoader(String str) {
        ClassLoader classLoader;
        ArrayMap<String, ClassLoader> arrayMap = sCachedClassLoaders;
        synchronized (arrayMap) {
            classLoader = arrayMap.get(str);
        }
        if (classLoader == null) {
            createIsolatedSplitContext(ContextUtils.getApplicationContext(), str);
            synchronized (arrayMap) {
                classLoader = arrayMap.get(str);
            }
        }
        return classLoader;
    }

    public static ClassLoader registerSplitClassLoaderForInflation(String str) {
        ClassLoader orCreateSplitClassLoader = getOrCreateSplitClassLoader(str);
        sInflationClassLoaders.put(str, orCreateSplitClassLoader);
        return orCreateSplitClassLoader;
    }

    public static boolean canLoadClass(ClassLoader classLoader, String str) {
        try {
            Class.forName(str, false, classLoader);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static ClassLoader getSplitCompatClassLoader() {
        if (sSplitCompatClassLoaderInstance == null) {
            sSplitCompatClassLoaderInstance = new SplitCompatClassLoader();
        }
        return sSplitCompatClassLoaderInstance;
    }

    public static void saveLoadedSplits(Bundle bundle) {
        bundle.putStringArrayList(LOADED_SPLITS_KEY, new ArrayList<>(sInflationClassLoaders.keySet()));
    }

    public static void restoreLoadedSplits(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        sSplitsToRestore = bundle.getStringArrayList(LOADED_SPLITS_KEY);
    }

    /* loaded from: classes6.dex */
    static class SplitCompatClassLoader extends ClassLoader {
        public SplitCompatClassLoader() {
            super(ContextUtils.getApplicationContext().getClassLoader());
            Log.i("SplitCompatClassLoader", "Splits: %s", BundleUtils.sSplitsToRestore);
        }

        private Class<?> checkSplitsClassLoaders(String str) {
            for (ClassLoader classLoader : BundleUtils.sInflationClassLoaders.values()) {
                try {
                    return classLoader.loadClass(str);
                } catch (ClassNotFoundException unused) {
                }
            }
            return null;
        }

        @Override // java.lang.ClassLoader
        public Class<?> findClass(String str) {
            Class<?> checkSplitsClassLoaders = checkSplitsClassLoaders(str);
            if (checkSplitsClassLoaders != null) {
                return checkSplitsClassLoaders;
            }
            if (BundleUtils.sSplitsToRestore != null && !str.startsWith("android.")) {
                restoreSplitsClassLoaders();
                Class<?> checkSplitsClassLoaders2 = checkSplitsClassLoaders(str);
                if (checkSplitsClassLoaders2 != null) {
                    return checkSplitsClassLoaders2;
                }
            }
            Log.w("SplitCompatClassLoader", "No class %s amongst %s", str, BundleUtils.sInflationClassLoaders.keySet());
            throw new ClassNotFoundException(str);
        }

        private void restoreSplitsClassLoaders() {
            Iterator it = BundleUtils.sSplitsToRestore.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!BundleUtils.sInflationClassLoaders.containsKey(str)) {
                    BundleUtils.registerSplitClassLoaderForInflation(str);
                }
            }
            BundleUtils.sSplitsToRestore = null;
        }
    }

    private static String getSplitApkLibraryPath(String str, String str2) {
        String splitApkPath;
        if (Build.VERSION.SDK_INT >= 26 && (splitApkPath = getSplitApkPath(str2)) != null) {
            try {
                ApplicationInfo applicationInfo = ContextUtils.getApplicationContext().getApplicationInfo();
                String mapLibraryName = System.mapLibraryName(str);
                return splitApkPath + "!/lib/" + ((String) applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo)) + "/" + mapLibraryName;
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    private static boolean isApplicationContext(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Application) {
                return true;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return false;
    }
}
