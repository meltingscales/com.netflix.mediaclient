package com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SupportedBadge {
    private static final /* synthetic */ InterfaceC8598drn b;
    private static final /* synthetic */ SupportedBadge[] d;
    public static final SupportedBadge c = new SupportedBadge("NEW", 0);
    public static final SupportedBadge e = new SupportedBadge("NEW_EPISODE", 1);

    private static final /* synthetic */ SupportedBadge[] a() {
        return new SupportedBadge[]{c, e};
    }

    public static SupportedBadge valueOf(String str) {
        return (SupportedBadge) Enum.valueOf(SupportedBadge.class, str);
    }

    public static SupportedBadge[] values() {
        return (SupportedBadge[]) d.clone();
    }

    private SupportedBadge(String str, int i) {
    }

    static {
        SupportedBadge[] a = a();
        d = a;
        b = C8600drp.e(a);
    }
}
