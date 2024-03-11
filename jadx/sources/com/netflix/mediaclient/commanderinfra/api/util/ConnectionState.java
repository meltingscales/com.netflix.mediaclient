package com.netflix.mediaclient.commanderinfra.api.util;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConnectionState {
    private static final /* synthetic */ ConnectionState[] h;
    private static final /* synthetic */ InterfaceC8598drn j;
    public static final ConnectionState i = new ConnectionState("None", 0);
    public static final ConnectionState e = new ConnectionState("Connected", 1);
    public static final ConnectionState a = new ConnectionState("Disconnected", 2);
    public static final ConnectionState f = new ConnectionState("ProfileMismatched", 3);
    public static final ConnectionState c = new ConnectionState("FeatureEducation", 4);
    public static final ConnectionState g = new ConnectionState("TargetedPrompt", 5);
    public static final ConnectionState b = new ConnectionState("GenericPrompt", 6);
    public static final ConnectionState d = new ConnectionState("ImplicitlyConnected", 7);

    private static final /* synthetic */ ConnectionState[] c() {
        return new ConnectionState[]{i, e, a, f, c, g, b, d};
    }

    public static ConnectionState valueOf(String str) {
        return (ConnectionState) Enum.valueOf(ConnectionState.class, str);
    }

    public static ConnectionState[] values() {
        return (ConnectionState[]) h.clone();
    }

    private ConnectionState(String str, int i2) {
    }

    static {
        ConnectionState[] c2 = c();
        h = c2;
        j = C8600drp.e(c2);
    }
}
