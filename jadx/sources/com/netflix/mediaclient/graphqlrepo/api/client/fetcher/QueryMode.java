package com.netflix.mediaclient.graphqlrepo.api.client.fetcher;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class QueryMode {
    private static final /* synthetic */ QueryMode[] a;
    private static final /* synthetic */ InterfaceC8598drn e;
    public static final QueryMode c = new QueryMode("FROM_CACHE_ONLY", 0);
    public static final QueryMode b = new QueryMode("FROM_CACHE_OR_NETWORK", 1);
    public static final QueryMode d = new QueryMode("FROM_NETWORK", 2);

    private static final /* synthetic */ QueryMode[] c() {
        return new QueryMode[]{c, b, d};
    }

    public static QueryMode valueOf(String str) {
        return (QueryMode) Enum.valueOf(QueryMode.class, str);
    }

    public static QueryMode[] values() {
        return (QueryMode[]) a.clone();
    }

    private QueryMode(String str, int i) {
    }

    static {
        QueryMode[] c2 = c();
        a = c2;
        e = C8600drp.e(c2);
    }
}
