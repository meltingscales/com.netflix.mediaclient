package com.netflix.mediaclient.cdx.api.event.type;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LocationType {
    private static final /* synthetic */ InterfaceC8598drn f;
    private static final /* synthetic */ LocationType[] j;
    public static final LocationType e = new LocationType("BROWSE", 0);
    public static final LocationType b = new LocationType("DETAILS_PAGE", 1);
    public static final LocationType a = new LocationType("PLAYBACK", 2);
    public static final LocationType c = new LocationType("POST_PLAY", 3);
    public static final LocationType d = new LocationType("ERROR", 4);
    public static final LocationType g = new LocationType("UNKNOWN", 5);

    private static final /* synthetic */ LocationType[] c() {
        return new LocationType[]{e, b, a, c, d, g};
    }

    public static LocationType valueOf(String str) {
        return (LocationType) Enum.valueOf(LocationType.class, str);
    }

    public static LocationType[] values() {
        return (LocationType[]) j.clone();
    }

    private LocationType(String str, int i) {
    }

    static {
        LocationType[] c2 = c();
        j = c2;
        f = C8600drp.e(c2);
    }
}
