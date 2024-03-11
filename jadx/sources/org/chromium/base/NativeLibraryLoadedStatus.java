package org.chromium.base;

import org.chromium.build.BuildConfig;

/* loaded from: classes5.dex */
public class NativeLibraryLoadedStatus {
    private static NativeLibraryLoadedStatusProvider sProvider;

    /* loaded from: classes5.dex */
    public interface NativeLibraryLoadedStatusProvider {
        boolean areMainDexNativeMethodsReady();

        boolean areNativeMethodsReady();
    }

    public static void checkLoaded(boolean z) {
        NativeLibraryLoadedStatusProvider nativeLibraryLoadedStatusProvider;
        boolean areNativeMethodsReady;
        if (BuildConfig.ENABLE_ASSERTS && (nativeLibraryLoadedStatusProvider = sProvider) != null) {
            if (z) {
                areNativeMethodsReady = nativeLibraryLoadedStatusProvider.areMainDexNativeMethodsReady();
            } else {
                areNativeMethodsReady = nativeLibraryLoadedStatusProvider.areNativeMethodsReady();
            }
            if (!areNativeMethodsReady) {
                throw new JniException(String.format("Native method called before the native library was ready (isMainDex=%b).", Boolean.valueOf(z)));
            }
        }
    }
}
