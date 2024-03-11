package com.facebook.battery.metrics.devicebattery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.facebook.battery.metrics.core.SystemMetricsCollector;
import com.facebook.battery.metrics.core.SystemMetricsLogger;
import com.facebook.battery.metrics.core.Utilities;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* loaded from: classes2.dex */
public class DeviceBatteryMetricsCollector extends SystemMetricsCollector<DeviceBatteryMetrics> {
    static int UNKNOWN_LEVEL = -1;
    long mBatteryRealtimeMs;
    long mChargingRealtimeMs;
    private final Context mContext;
    boolean mIsCurrentlyCharging = isCharging(getBatteryIntent());
    long mLastUpdateMs = SystemClock.elapsedRealtime();

    public DeviceBatteryMetricsCollector(Context context) {
        this.mContext = context;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        context.registerReceiver(new BroadcastReceiver() { // from class: com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector.1
            /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:4:0x0007, B:29:0x007b, B:30:0x007f, B:19:0x0036, B:21:0x003c, B:23:0x0054, B:22:0x0046, B:24:0x0059, B:26:0x005f, B:28:0x0077, B:27:0x0069, B:9:0x001c, B:12:0x0026), top: B:35:0x0007 }] */
            @Override // android.content.BroadcastReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onReceive(android.content.Context r9, android.content.Intent r10) {
                /*
                    r8 = this;
                    long r0 = android.os.SystemClock.elapsedRealtime()
                    com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector r9 = com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector.this
                    monitor-enter(r9)
                    java.lang.String r10 = r10.getAction()     // Catch: java.lang.Throwable -> L81
                    int r2 = r10.hashCode()     // Catch: java.lang.Throwable -> L81
                    r3 = -1886648615(0xffffffff8f8c06d9, float:-1.3807703E-29)
                    r4 = 0
                    r5 = 1
                    if (r2 == r3) goto L26
                    r3 = 1019184907(0x3cbf870b, float:0.023379823)
                    if (r2 == r3) goto L1c
                    goto L30
                L1c:
                    java.lang.String r2 = "android.intent.action.ACTION_POWER_CONNECTED"
                    boolean r10 = r10.equals(r2)     // Catch: java.lang.Throwable -> L81
                    if (r10 == 0) goto L30
                    r10 = r4
                    goto L31
                L26:
                    java.lang.String r2 = "android.intent.action.ACTION_POWER_DISCONNECTED"
                    boolean r10 = r10.equals(r2)     // Catch: java.lang.Throwable -> L81
                    if (r10 == 0) goto L30
                    r10 = r5
                    goto L31
                L30:
                    r10 = -1
                L31:
                    if (r10 == 0) goto L59
                    if (r10 == r5) goto L36
                    goto L7b
                L36:
                    com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector r10 = com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector.this     // Catch: java.lang.Throwable -> L81
                    boolean r2 = r10.mIsCurrentlyCharging     // Catch: java.lang.Throwable -> L81
                    if (r2 == 0) goto L46
                    long r2 = r10.mChargingRealtimeMs     // Catch: java.lang.Throwable -> L81
                    long r5 = r10.mLastUpdateMs     // Catch: java.lang.Throwable -> L81
                    long r5 = r0 - r5
                    long r2 = r2 + r5
                    r10.mChargingRealtimeMs = r2     // Catch: java.lang.Throwable -> L81
                    goto L54
                L46:
                    long r2 = r10.mBatteryRealtimeMs     // Catch: java.lang.Throwable -> L81
                    long r5 = r10.mLastUpdateMs     // Catch: java.lang.Throwable -> L81
                    long r5 = r0 - r5
                    long r2 = r2 + r5
                    r10.mBatteryRealtimeMs = r2     // Catch: java.lang.Throwable -> L81
                    java.lang.String r2 = "DISCONNECTED"
                    r10.logIncorrectSequence(r2, r0)     // Catch: java.lang.Throwable -> L81
                L54:
                    com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector r10 = com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector.this     // Catch: java.lang.Throwable -> L81
                    r10.mIsCurrentlyCharging = r4     // Catch: java.lang.Throwable -> L81
                    goto L7b
                L59:
                    com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector r10 = com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector.this     // Catch: java.lang.Throwable -> L81
                    boolean r2 = r10.mIsCurrentlyCharging     // Catch: java.lang.Throwable -> L81
                    if (r2 != 0) goto L69
                    long r2 = r10.mBatteryRealtimeMs     // Catch: java.lang.Throwable -> L81
                    long r6 = r10.mLastUpdateMs     // Catch: java.lang.Throwable -> L81
                    long r6 = r0 - r6
                    long r2 = r2 + r6
                    r10.mBatteryRealtimeMs = r2     // Catch: java.lang.Throwable -> L81
                    goto L77
                L69:
                    long r2 = r10.mChargingRealtimeMs     // Catch: java.lang.Throwable -> L81
                    long r6 = r10.mLastUpdateMs     // Catch: java.lang.Throwable -> L81
                    long r6 = r0 - r6
                    long r2 = r2 + r6
                    r10.mChargingRealtimeMs = r2     // Catch: java.lang.Throwable -> L81
                    java.lang.String r2 = "CONNECTED"
                    r10.logIncorrectSequence(r2, r0)     // Catch: java.lang.Throwable -> L81
                L77:
                    com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector r10 = com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector.this     // Catch: java.lang.Throwable -> L81
                    r10.mIsCurrentlyCharging = r5     // Catch: java.lang.Throwable -> L81
                L7b:
                    com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector r10 = com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector.this     // Catch: java.lang.Throwable -> L81
                    r10.mLastUpdateMs = r0     // Catch: java.lang.Throwable -> L81
                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L81
                    return
                L81:
                    r10 = move-exception
                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L81
                    throw r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.battery.metrics.devicebattery.DeviceBatteryMetricsCollector.AnonymousClass1.onReceive(android.content.Context, android.content.Intent):void");
            }
        }, intentFilter);
    }

    @Override // com.facebook.battery.metrics.core.SystemMetricsCollector
    public boolean getSnapshot(DeviceBatteryMetrics deviceBatteryMetrics) {
        Utilities.checkNotNull(deviceBatteryMetrics, "Null value passed to getSnapshot!");
        deviceBatteryMetrics.batteryLevelPct = getBatteryLevel(getBatteryIntent());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this) {
            if (this.mIsCurrentlyCharging) {
                deviceBatteryMetrics.chargingRealtimeMs = this.mChargingRealtimeMs + (elapsedRealtime - this.mLastUpdateMs);
                deviceBatteryMetrics.batteryRealtimeMs = this.mBatteryRealtimeMs;
            } else {
                deviceBatteryMetrics.chargingRealtimeMs = this.mChargingRealtimeMs;
                deviceBatteryMetrics.batteryRealtimeMs = this.mBatteryRealtimeMs + (elapsedRealtime - this.mLastUpdateMs);
            }
        }
        return true;
    }

    @Override // com.facebook.battery.metrics.core.SystemMetricsCollector
    public DeviceBatteryMetrics createMetrics() {
        return new DeviceBatteryMetrics();
    }

    private Intent getBatteryIntent() {
        try {
            return this.mContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception unused) {
            SystemMetricsLogger.wtf("DeviceBatteryMetricsCollector", "Exception registering receiver for ACTION_BATTERY_CHANGED");
            return null;
        }
    }

    private static float getBatteryLevel(Intent intent) {
        int i;
        if (intent == null) {
            i = UNKNOWN_LEVEL;
        } else {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra(InteractiveAnimation.ANIMATION_TYPE.SCALE, -1);
            if (intExtra >= 0 && intExtra2 > 0) {
                return (intExtra / intExtra2) * 100.0f;
            }
            i = UNKNOWN_LEVEL;
        }
        return i;
    }

    private static boolean isCharging(Intent intent) {
        int intExtra = intent != null ? intent.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    void logIncorrectSequence(String str, long j) {
        SystemMetricsLogger.wtf("DeviceBatteryMetricsCollector", "Consecutive " + str + "broadcasts: (" + this.mLastUpdateMs + ", " + j + ")");
    }
}
