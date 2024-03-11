package com.netflix.hawkins.consumer.component.textlink;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HawkinsTextLinkType {
    private static final /* synthetic */ InterfaceC8598drn b;
    private static final /* synthetic */ HawkinsTextLinkType[] d;
    public static final HawkinsTextLinkType e = new HawkinsTextLinkType("Primary", 0);
    public static final HawkinsTextLinkType a = new HawkinsTextLinkType("Secondary", 1);

    private static final /* synthetic */ HawkinsTextLinkType[] c() {
        return new HawkinsTextLinkType[]{e, a};
    }

    public static HawkinsTextLinkType valueOf(String str) {
        return (HawkinsTextLinkType) Enum.valueOf(HawkinsTextLinkType.class, str);
    }

    public static HawkinsTextLinkType[] values() {
        return (HawkinsTextLinkType[]) d.clone();
    }

    private HawkinsTextLinkType(String str, int i) {
    }

    static {
        HawkinsTextLinkType[] c = c();
        d = c;
        b = C8600drp.e(c);
    }
}
