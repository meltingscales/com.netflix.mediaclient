package com.netflix.mediaclient.commanderinfra.api.util;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConnectionType {
    private static final /* synthetic */ ConnectionType[] f;
    private static final /* synthetic */ InterfaceC8598drn g;
    public static final ConnectionType b = new ConnectionType("Implicit", 0);
    public static final ConnectionType e = new ConnectionType("TargetedPrompt", 1);
    public static final ConnectionType a = new ConnectionType("GenericPrompt", 2);
    public static final ConnectionType d = new ConnectionType("Manual", 3);
    public static final ConnectionType c = new ConnectionType("Reconnect", 4);

    private static final /* synthetic */ ConnectionType[] e() {
        return new ConnectionType[]{b, e, a, d, c};
    }

    public static ConnectionType valueOf(String str) {
        return (ConnectionType) Enum.valueOf(ConnectionType.class, str);
    }

    public static ConnectionType[] values() {
        return (ConnectionType[]) f.clone();
    }

    private ConnectionType(String str, int i) {
    }

    static {
        ConnectionType[] e2 = e();
        f = e2;
        g = C8600drp.e(e2);
    }
}
