package com.netflix.mediaclient.ui.playercontrolscompose.impl.components;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SeekMode {
    private static final /* synthetic */ SeekMode[] a;
    private static final /* synthetic */ InterfaceC8598drn c;
    public static final SeekMode e = new SeekMode("BACKWARD", 0);
    public static final SeekMode b = new SeekMode("FORWARD", 1);

    private static final /* synthetic */ SeekMode[] d() {
        return new SeekMode[]{e, b};
    }

    public static SeekMode valueOf(String str) {
        return (SeekMode) Enum.valueOf(SeekMode.class, str);
    }

    public static SeekMode[] values() {
        return (SeekMode[]) a.clone();
    }

    private SeekMode(String str, int i) {
    }

    static {
        SeekMode[] d = d();
        a = d;
        c = C8600drp.e(d);
    }
}
