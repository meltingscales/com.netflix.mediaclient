package com.netflix.mediaclient.graphqlrepo.api.client.fetcher;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class WatchQueryMode {
    private static final /* synthetic */ InterfaceC8598drn a;
    private static final /* synthetic */ WatchQueryMode[] g;
    public static final WatchQueryMode e = new WatchQueryMode("FROM_CACHE_ONLY", 0);
    public static final WatchQueryMode c = new WatchQueryMode("FROM_CACHE_OR_NETWORK", 1);
    public static final WatchQueryMode d = new WatchQueryMode("FROM_CACHE_THEN_NETWORK", 2);
    public static final WatchQueryMode b = new WatchQueryMode("FROM_NETWORK", 3);

    private static final /* synthetic */ WatchQueryMode[] d() {
        return new WatchQueryMode[]{e, c, d, b};
    }

    public static WatchQueryMode valueOf(String str) {
        return (WatchQueryMode) Enum.valueOf(WatchQueryMode.class, str);
    }

    public static WatchQueryMode[] values() {
        return (WatchQueryMode[]) g.clone();
    }

    private WatchQueryMode(String str, int i) {
    }

    static {
        WatchQueryMode[] d2 = d();
        g = d2;
        a = C8600drp.e(d2);
    }
}
