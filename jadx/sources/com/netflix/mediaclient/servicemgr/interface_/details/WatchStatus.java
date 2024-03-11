package com.netflix.mediaclient.servicemgr.interface_.details;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class WatchStatus {
    private static final /* synthetic */ InterfaceC8598drn a;
    private static final /* synthetic */ WatchStatus[] h;
    public static final WatchStatus c = new WatchStatus("NEVER_WATCHED", 0);
    public static final WatchStatus e = new WatchStatus("STARTED", 1);
    public static final WatchStatus b = new WatchStatus("COMPLETED", 2);
    public static final WatchStatus d = new WatchStatus("UNKNOWN", 3);

    private static final /* synthetic */ WatchStatus[] a() {
        return new WatchStatus[]{c, e, b, d};
    }

    public static WatchStatus valueOf(String str) {
        return (WatchStatus) Enum.valueOf(WatchStatus.class, str);
    }

    public static WatchStatus[] values() {
        return (WatchStatus[]) h.clone();
    }

    private WatchStatus(String str, int i) {
    }

    static {
        WatchStatus[] a2 = a();
        h = a2;
        a = C8600drp.e(a2);
    }
}
