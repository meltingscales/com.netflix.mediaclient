package com.netflix.mediaclient.ui.commander.impl.ui.menu;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SubtitlesType {
    private static final /* synthetic */ InterfaceC8598drn c;
    private static final /* synthetic */ SubtitlesType[] e;
    public static final SubtitlesType b = new SubtitlesType("On", 0);
    public static final SubtitlesType d = new SubtitlesType("Off", 1);
    public static final SubtitlesType a = new SubtitlesType("Both", 2);

    private static final /* synthetic */ SubtitlesType[] b() {
        return new SubtitlesType[]{b, d, a};
    }

    public static SubtitlesType valueOf(String str) {
        return (SubtitlesType) Enum.valueOf(SubtitlesType.class, str);
    }

    public static SubtitlesType[] values() {
        return (SubtitlesType[]) e.clone();
    }

    private SubtitlesType(String str, int i) {
    }

    static {
        SubtitlesType[] b2 = b();
        e = b2;
        c = C8600drp.e(b2);
    }
}
