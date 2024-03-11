package org.chromium.net;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.net.NetworkActiveNotifier;

/* loaded from: classes6.dex */
class NetworkActiveNotifierJni implements NetworkActiveNotifier.Natives {
    public static final JniStaticTestMocker<NetworkActiveNotifier.Natives> TEST_HOOKS = new JniStaticTestMocker<NetworkActiveNotifier.Natives>() { // from class: org.chromium.net.NetworkActiveNotifierJni.1
    };
    private static NetworkActiveNotifier.Natives testInstance;

    NetworkActiveNotifierJni() {
    }

    @Override // org.chromium.net.NetworkActiveNotifier.Natives
    public void notifyOfDefaultNetworkActive(long j) {
        GEN_JNI.org_chromium_net_NetworkActiveNotifier_notifyOfDefaultNetworkActive(j);
    }

    public static NetworkActiveNotifier.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            NetworkActiveNotifier.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.NetworkActiveNotifier.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new NetworkActiveNotifierJni();
    }
}
