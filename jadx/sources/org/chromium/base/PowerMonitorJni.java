package org.chromium.base;

import org.chromium.base.PowerMonitor;
import org.chromium.base.natives.GEN_JNI;

/* loaded from: classes6.dex */
class PowerMonitorJni implements PowerMonitor.Natives {
    public static final JniStaticTestMocker<PowerMonitor.Natives> TEST_HOOKS = new JniStaticTestMocker<PowerMonitor.Natives>() { // from class: org.chromium.base.PowerMonitorJni.1
    };
    private static PowerMonitor.Natives testInstance;

    PowerMonitorJni() {
    }

    @Override // org.chromium.base.PowerMonitor.Natives
    public void onBatteryChargingChanged() {
        GEN_JNI.org_chromium_base_PowerMonitor_onBatteryChargingChanged();
    }

    @Override // org.chromium.base.PowerMonitor.Natives
    public void onThermalStatusChanged(int i) {
        GEN_JNI.org_chromium_base_PowerMonitor_onThermalStatusChanged(i);
    }

    public static PowerMonitor.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            PowerMonitor.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.PowerMonitor.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new PowerMonitorJni();
    }
}
