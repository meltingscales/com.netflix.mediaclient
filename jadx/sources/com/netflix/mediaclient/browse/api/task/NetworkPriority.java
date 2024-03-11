package com.netflix.mediaclient.browse.api.task;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NetworkPriority {
    private static final /* synthetic */ InterfaceC8598drn b;
    private static final /* synthetic */ NetworkPriority[] h;
    public static final NetworkPriority e = new NetworkPriority("LOW", 0);
    public static final NetworkPriority d = new NetworkPriority("NORMAL", 1);
    public static final NetworkPriority c = new NetworkPriority("HIGH", 2);
    public static final NetworkPriority a = new NetworkPriority("IMMEDIATE", 3);

    private static final /* synthetic */ NetworkPriority[] d() {
        return new NetworkPriority[]{e, d, c, a};
    }

    public static NetworkPriority valueOf(String str) {
        return (NetworkPriority) Enum.valueOf(NetworkPriority.class, str);
    }

    public static NetworkPriority[] values() {
        return (NetworkPriority[]) h.clone();
    }

    private NetworkPriority(String str, int i) {
    }

    static {
        NetworkPriority[] d2 = d();
        h = d2;
        b = C8600drp.e(d2);
    }
}
