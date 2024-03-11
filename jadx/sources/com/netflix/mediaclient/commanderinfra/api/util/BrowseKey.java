package com.netflix.mediaclient.commanderinfra.api.util;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class BrowseKey {
    private static final /* synthetic */ BrowseKey[] g;
    private static final /* synthetic */ InterfaceC8598drn i;
    public static final BrowseKey a = new BrowseKey("NewAndPopular", 0);
    public static final BrowseKey e = new BrowseKey("TvShows", 1);
    public static final BrowseKey c = new BrowseKey("Movies", 2);
    public static final BrowseKey b = new BrowseKey("Categories", 3);
    public static final BrowseKey d = new BrowseKey("MyList", 4);

    private static final /* synthetic */ BrowseKey[] c() {
        return new BrowseKey[]{a, e, c, b, d};
    }

    public static BrowseKey valueOf(String str) {
        return (BrowseKey) Enum.valueOf(BrowseKey.class, str);
    }

    public static BrowseKey[] values() {
        return (BrowseKey[]) g.clone();
    }

    private BrowseKey(String str, int i2) {
    }

    static {
        BrowseKey[] c2 = c();
        g = c2;
        i = C8600drp.e(c2);
    }
}
