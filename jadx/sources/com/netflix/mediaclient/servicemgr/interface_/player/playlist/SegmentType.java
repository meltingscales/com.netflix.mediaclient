package com.netflix.mediaclient.servicemgr.interface_.player.playlist;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SegmentType {
    private static final /* synthetic */ InterfaceC8598drn f;
    private static final /* synthetic */ SegmentType[] h;
    public static final SegmentType a = new SegmentType("DEFAULT", 0);
    public static final SegmentType c = new SegmentType("AD", 1);
    public static final SegmentType e = new SegmentType("PRE_AD_PADDING", 2);
    public static final SegmentType d = new SegmentType("POST_AD_PADDING", 3);
    public static final SegmentType b = new SegmentType("START_SLATE", 4);

    private static final /* synthetic */ SegmentType[] d() {
        return new SegmentType[]{a, c, e, d, b};
    }

    public static SegmentType valueOf(String str) {
        return (SegmentType) Enum.valueOf(SegmentType.class, str);
    }

    public static SegmentType[] values() {
        return (SegmentType[]) h.clone();
    }

    private SegmentType(String str, int i) {
    }

    static {
        SegmentType[] d2 = d();
        h = d2;
        f = C8600drp.e(d2);
    }
}
