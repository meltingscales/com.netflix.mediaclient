package com.netflix.mediaclient.service;

import android.content.Context;
import android.os.PowerManager;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class NetflixPowerManager {
    private PowerManager.WakeLock b;
    private final Set<PartialWakeLockReason> c = new HashSet();
    private final Context d;

    /* loaded from: classes3.dex */
    public enum PartialWakeLockReason {
        DownloadGoingOn
    }

    public NetflixPowerManager(Context context) {
        this.d = context;
    }

    public void a(PartialWakeLockReason partialWakeLockReason) {
        if (this.c.contains(partialWakeLockReason)) {
            return;
        }
        this.c.add(partialWakeLockReason);
        PowerManager powerManager = (PowerManager) this.d.getSystemService("power");
        if (powerManager != null) {
            if (this.b == null) {
                this.b = powerManager.newWakeLock(1, "nf_power_manager");
            }
            PowerManager.WakeLock wakeLock = this.b;
            if (wakeLock == null || wakeLock.isHeld()) {
                return;
            }
            this.b.acquire();
        }
    }

    public void c(PartialWakeLockReason partialWakeLockReason) {
        PowerManager.WakeLock wakeLock;
        this.c.remove(partialWakeLockReason);
        if (this.c.isEmpty() && (wakeLock = this.b) != null && wakeLock.isHeld()) {
            this.b.release();
        }
    }

    public void d() {
        this.c.clear();
        PowerManager.WakeLock wakeLock = this.b;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.b.release();
        this.b = null;
    }
}
