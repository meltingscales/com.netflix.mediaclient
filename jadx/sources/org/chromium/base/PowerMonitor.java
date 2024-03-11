package org.chromium.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.compat.ApiHelperForQ;

/* loaded from: classes6.dex */
public class PowerMonitor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static PowerMonitor sInstance;
    private boolean mIsBatteryPower;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface Natives {
        void onBatteryChargingChanged();

        void onThermalStatusChanged(int i);
    }

    public static void createForTests() {
        sInstance = new PowerMonitor();
    }

    public static void create() {
        PowerManager powerManager;
        ThreadUtils.assertOnUiThread();
        if (sInstance != null) {
            return;
        }
        Context applicationContext = ContextUtils.getApplicationContext();
        sInstance = new PowerMonitor();
        Intent registerProtectedBroadcastReceiver = ContextUtils.registerProtectedBroadcastReceiver(applicationContext, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerProtectedBroadcastReceiver != null) {
            onBatteryChargingChanged(registerProtectedBroadcastReceiver.getIntExtra("plugged", 0) == 0);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        ContextUtils.registerProtectedBroadcastReceiver(applicationContext, new BroadcastReceiver() { // from class: org.chromium.base.PowerMonitor.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                PowerMonitor.onBatteryChargingChanged(intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED"));
            }
        }, intentFilter);
        if (Build.VERSION.SDK_INT < 29 || (powerManager = (PowerManager) applicationContext.getSystemService("power")) == null) {
            return;
        }
        PowerMonitorForQ.addThermalStatusListener(powerManager);
    }

    private PowerMonitor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onBatteryChargingChanged(boolean z) {
        sInstance.mIsBatteryPower = z;
        PowerMonitorJni.get().onBatteryChargingChanged();
    }

    @CalledByNative
    private static boolean isBatteryPower() {
        if (sInstance == null) {
            create();
        }
        return sInstance.mIsBatteryPower;
    }

    @CalledByNative
    private static int getRemainingBatteryCapacity() {
        if (sInstance == null) {
            create();
        }
        return getRemainingBatteryCapacityImpl();
    }

    private static int getRemainingBatteryCapacityImpl() {
        return ((BatteryManager) ContextUtils.getApplicationContext().getSystemService("batterymanager")).getIntProperty(1);
    }

    @CalledByNative
    private static int getCurrentThermalStatus() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        if (sInstance == null) {
            create();
        }
        PowerManager powerManager = (PowerManager) ContextUtils.getApplicationContext().getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        return ApiHelperForQ.getCurrentThermalStatus(powerManager);
    }
}
