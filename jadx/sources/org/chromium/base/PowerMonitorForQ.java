package org.chromium.base;

import android.os.PowerManager;
import android.os.PowerManager$OnThermalStatusChangedListener;

/* loaded from: classes6.dex */
public final class PowerMonitorForQ {
    public static void addThermalStatusListener(PowerManager powerManager) {
        powerManager.addThermalStatusListener(new PowerManager$OnThermalStatusChangedListener() { // from class: org.chromium.base.PowerMonitorForQ.1
            public void onThermalStatusChanged(int i) {
                PowerMonitorJni.get().onThermalStatusChanged(i);
            }
        });
    }
}
