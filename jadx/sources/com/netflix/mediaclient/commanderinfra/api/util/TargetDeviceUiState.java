package com.netflix.mediaclient.commanderinfra.api.util;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TargetDeviceUiState {
    private static final /* synthetic */ InterfaceC8598drn b;
    private static final /* synthetic */ TargetDeviceUiState[] g;
    public static final TargetDeviceUiState c = new TargetDeviceUiState("None", 0);
    public static final TargetDeviceUiState a = new TargetDeviceUiState("Browse", 1);
    public static final TargetDeviceUiState d = new TargetDeviceUiState("Playback", 2);
    public static final TargetDeviceUiState e = new TargetDeviceUiState("PostPlay", 3);

    private static final /* synthetic */ TargetDeviceUiState[] c() {
        return new TargetDeviceUiState[]{c, a, d, e};
    }

    public static TargetDeviceUiState valueOf(String str) {
        return (TargetDeviceUiState) Enum.valueOf(TargetDeviceUiState.class, str);
    }

    public static TargetDeviceUiState[] values() {
        return (TargetDeviceUiState[]) g.clone();
    }

    private TargetDeviceUiState(String str, int i) {
    }

    static {
        TargetDeviceUiState[] c2 = c();
        g = c2;
        b = C8600drp.e(c2);
    }
}
