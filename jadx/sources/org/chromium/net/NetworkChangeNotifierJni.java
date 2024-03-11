package org.chromium.net;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes5.dex */
class NetworkChangeNotifierJni implements NetworkChangeNotifier.Natives {
    public static final JniStaticTestMocker<NetworkChangeNotifier.Natives> TEST_HOOKS = new JniStaticTestMocker<NetworkChangeNotifier.Natives>() { // from class: org.chromium.net.NetworkChangeNotifierJni.1
    };
    private static NetworkChangeNotifier.Natives testInstance;

    NetworkChangeNotifierJni() {
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyConnectionTypeChanged(long j, NetworkChangeNotifier networkChangeNotifier, int i, long j2) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyConnectionTypeChanged(j, networkChangeNotifier, i, j2);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyConnectionCostChanged(long j, NetworkChangeNotifier networkChangeNotifier, int i) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyConnectionCostChanged(j, networkChangeNotifier, i);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyMaxBandwidthChanged(long j, NetworkChangeNotifier networkChangeNotifier, int i) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyMaxBandwidthChanged(j, networkChangeNotifier, i);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkConnect(long j, NetworkChangeNotifier networkChangeNotifier, long j2, int i) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkConnect(j, networkChangeNotifier, j2, i);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkSoonToDisconnect(long j, NetworkChangeNotifier networkChangeNotifier, long j2) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkSoonToDisconnect(j, networkChangeNotifier, j2);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkDisconnect(long j, NetworkChangeNotifier networkChangeNotifier, long j2) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkDisconnect(j, networkChangeNotifier, j2);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyPurgeActiveNetworkList(long j, NetworkChangeNotifier networkChangeNotifier, long[] jArr) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyPurgeActiveNetworkList(j, networkChangeNotifier, jArr);
    }

    public static NetworkChangeNotifier.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            NetworkChangeNotifier.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.NetworkChangeNotifier.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new NetworkChangeNotifierJni();
    }
}
