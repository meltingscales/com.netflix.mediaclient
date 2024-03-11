package org.chromium.net.impl;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.net.impl.CronetLibraryLoader;

/* loaded from: classes5.dex */
class CronetLibraryLoaderJni implements CronetLibraryLoader.Natives {
    public static final JniStaticTestMocker<CronetLibraryLoader.Natives> TEST_HOOKS = new JniStaticTestMocker<CronetLibraryLoader.Natives>() { // from class: org.chromium.net.impl.CronetLibraryLoaderJni.1
    };
    private static CronetLibraryLoader.Natives testInstance;

    CronetLibraryLoaderJni() {
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public void cronetInitOnInitThread() {
        GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_cronetInitOnInitThread();
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public String getCronetVersion() {
        return GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_getCronetVersion();
    }

    public static CronetLibraryLoader.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            CronetLibraryLoader.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.impl.CronetLibraryLoader.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new CronetLibraryLoaderJni();
    }
}
