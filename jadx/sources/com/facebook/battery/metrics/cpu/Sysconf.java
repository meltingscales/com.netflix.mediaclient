package com.facebook.battery.metrics.cpu;

import android.annotation.SuppressLint;
import android.system.Os;
import android.system.OsConstants;

/* loaded from: classes2.dex */
class Sysconf {
    Sysconf() {
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public static long getScClkTck(long j) {
        long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
        return sysconf > 0 ? sysconf : j;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public static long getScNProcessorsConf(long j) {
        return Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
    }
}
