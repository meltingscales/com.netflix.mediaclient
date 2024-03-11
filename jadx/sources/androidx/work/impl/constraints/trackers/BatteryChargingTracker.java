package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* loaded from: classes2.dex */
public class BatteryChargingTracker extends BroadcastReceiverConstraintTracker<Boolean> {
    private static final String TAG = Logger.tagWithPrefix("BatteryChrgTracker");

    public BatteryChargingTracker(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public Boolean getInitialState() {
        Intent registerReceiver = this.mAppContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            Logger.get().error(TAG, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        return Boolean.valueOf(isBatteryChangedIntentCharging(registerReceiver));
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r5.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L31;
     */
    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBroadcastReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            java.lang.String r5 = r6.getAction()
            if (r5 != 0) goto L7
            return
        L7:
            androidx.work.Logger r6 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.constraints.trackers.BatteryChargingTracker.TAG
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            java.lang.String r2 = "Received %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r2 = 0
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r6.debug(r0, r1, r3)
            int r6 = r5.hashCode()
            r0 = 3
            r1 = 2
            r3 = 1
            switch(r6) {
                case -1886648615: goto L49;
                case -54942926: goto L3e;
                case 948344062: goto L33;
                case 1019184907: goto L28;
                default: goto L27;
            }
        L27:
            goto L51
        L28:
            java.lang.String r6 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L31
            goto L51
        L31:
            r2 = r0
            goto L52
        L33:
            java.lang.String r6 = "android.os.action.CHARGING"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3c
            goto L51
        L3c:
            r2 = r1
            goto L52
        L3e:
            java.lang.String r6 = "android.os.action.DISCHARGING"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L47
            goto L51
        L47:
            r2 = r3
            goto L52
        L49:
            java.lang.String r6 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L52
        L51:
            r2 = -1
        L52:
            if (r2 == 0) goto L6d
            if (r2 == r3) goto L67
            if (r2 == r1) goto L61
            if (r2 == r0) goto L5b
            goto L72
        L5b:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.setState(r5)
            goto L72
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.setState(r5)
            goto L72
        L67:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.setState(r5)
            goto L72
        L6d:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.setState(r5)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.constraints.trackers.BatteryChargingTracker.onBroadcastReceive(android.content.Context, android.content.Intent):void");
    }

    private boolean isBatteryChangedIntentCharging(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }
}
