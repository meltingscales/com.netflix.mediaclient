package org.chromium.base.compat;

import android.content.Context;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import android.os.PowerManager;
import android.provider.MediaStore;
import java.util.Set;

/* loaded from: classes5.dex */
public final class ApiHelperForQ {
    public static Set<String> getExternalVolumeNames(Context context) {
        Set<String> externalVolumeNames;
        externalVolumeNames = MediaStore.getExternalVolumeNames(context);
        return externalVolumeNames;
    }

    public static TransportInfo getTransportInfo(NetworkCapabilities networkCapabilities) {
        TransportInfo transportInfo;
        transportInfo = networkCapabilities.getTransportInfo();
        return transportInfo;
    }

    public static int getCurrentThermalStatus(PowerManager powerManager) {
        int currentThermalStatus;
        currentThermalStatus = powerManager.getCurrentThermalStatus();
        return currentThermalStatus;
    }
}
