package com.netflix.mediaclient.ui.gamecontrollermagicpath.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class MagicPathUiType {
    private static final /* synthetic */ MagicPathUiType[] a;
    private static final /* synthetic */ InterfaceC8598drn b;
    public static final MagicPathUiType e = new MagicPathUiType("FULL_SCREEN", 0);
    public static final MagicPathUiType c = new MagicPathUiType("DIALOG", 1);

    private static final /* synthetic */ MagicPathUiType[] b() {
        return new MagicPathUiType[]{e, c};
    }

    public static MagicPathUiType valueOf(String str) {
        return (MagicPathUiType) Enum.valueOf(MagicPathUiType.class, str);
    }

    public static MagicPathUiType[] values() {
        return (MagicPathUiType[]) a.clone();
    }

    private MagicPathUiType(String str, int i) {
    }

    static {
        MagicPathUiType[] b2 = b();
        a = b2;
        b = C8600drp.e(b2);
    }
}
