package org.chromium.net;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.net.X509Util;

/* loaded from: classes6.dex */
class X509UtilJni implements X509Util.Natives {
    public static final JniStaticTestMocker<X509Util.Natives> TEST_HOOKS = new JniStaticTestMocker<X509Util.Natives>() { // from class: org.chromium.net.X509UtilJni.1
    };
    private static X509Util.Natives testInstance;

    X509UtilJni() {
    }

    @Override // org.chromium.net.X509Util.Natives
    public void notifyKeyChainChanged() {
        GEN_JNI.org_chromium_net_X509Util_notifyKeyChainChanged();
    }

    public static X509Util.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            X509Util.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.X509Util.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new X509UtilJni();
    }
}
