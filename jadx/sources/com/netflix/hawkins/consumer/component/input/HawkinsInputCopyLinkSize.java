package com.netflix.hawkins.consumer.component.input;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HawkinsInputCopyLinkSize {
    private static final /* synthetic */ HawkinsInputCopyLinkSize[] a;
    private static final /* synthetic */ InterfaceC8598drn e;
    public static final HawkinsInputCopyLinkSize d = new HawkinsInputCopyLinkSize("Small", 0);
    public static final HawkinsInputCopyLinkSize c = new HawkinsInputCopyLinkSize("Standard", 1);

    private static final /* synthetic */ HawkinsInputCopyLinkSize[] a() {
        return new HawkinsInputCopyLinkSize[]{d, c};
    }

    public static HawkinsInputCopyLinkSize valueOf(String str) {
        return (HawkinsInputCopyLinkSize) Enum.valueOf(HawkinsInputCopyLinkSize.class, str);
    }

    public static HawkinsInputCopyLinkSize[] values() {
        return (HawkinsInputCopyLinkSize[]) a.clone();
    }

    private HawkinsInputCopyLinkSize(String str, int i) {
    }

    static {
        HawkinsInputCopyLinkSize[] a2 = a();
        a = a2;
        e = C8600drp.e(a2);
    }
}
