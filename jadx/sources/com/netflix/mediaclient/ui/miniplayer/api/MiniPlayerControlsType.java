package com.netflix.mediaclient.ui.miniplayer.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class MiniPlayerControlsType {
    private static final /* synthetic */ InterfaceC8598drn a;
    private static final /* synthetic */ MiniPlayerControlsType[] c;
    public static final MiniPlayerControlsType e = new MiniPlayerControlsType("DEFAULT", 0);

    private static final /* synthetic */ MiniPlayerControlsType[] d() {
        return new MiniPlayerControlsType[]{e};
    }

    public static MiniPlayerControlsType valueOf(String str) {
        return (MiniPlayerControlsType) Enum.valueOf(MiniPlayerControlsType.class, str);
    }

    public static MiniPlayerControlsType[] values() {
        return (MiniPlayerControlsType[]) c.clone();
    }

    private MiniPlayerControlsType(String str, int i) {
    }

    static {
        MiniPlayerControlsType[] d = d();
        c = d;
        a = C8600drp.e(d);
    }
}
