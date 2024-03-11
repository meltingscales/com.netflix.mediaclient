package com.netflix.mediaclient.ui.commander.impl.ui.menu;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ApplicablePlaybackType {
    private static final /* synthetic */ InterfaceC8598drn e;
    private static final /* synthetic */ ApplicablePlaybackType[] j;
    public static final ApplicablePlaybackType a = new ApplicablePlaybackType("Standalone", 0);
    public static final ApplicablePlaybackType d = new ApplicablePlaybackType("Series", 1);
    public static final ApplicablePlaybackType b = new ApplicablePlaybackType("Both", 2);
    public static final ApplicablePlaybackType c = new ApplicablePlaybackType("Unknown", 3);

    private static final /* synthetic */ ApplicablePlaybackType[] e() {
        return new ApplicablePlaybackType[]{a, d, b, c};
    }

    public static ApplicablePlaybackType valueOf(String str) {
        return (ApplicablePlaybackType) Enum.valueOf(ApplicablePlaybackType.class, str);
    }

    public static ApplicablePlaybackType[] values() {
        return (ApplicablePlaybackType[]) j.clone();
    }

    private ApplicablePlaybackType(String str, int i) {
    }

    static {
        ApplicablePlaybackType[] e2 = e();
        j = e2;
        e = C8600drp.e(e2);
    }
}
