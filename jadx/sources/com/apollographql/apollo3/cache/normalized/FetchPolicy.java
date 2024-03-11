package com.apollographql.apollo3.cache.normalized;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class FetchPolicy {
    private static final /* synthetic */ InterfaceC8598drn h;
    private static final /* synthetic */ FetchPolicy[] j;
    public static final FetchPolicy a = new FetchPolicy("CacheFirst", 0);
    public static final FetchPolicy c = new FetchPolicy("CacheOnly", 1);
    public static final FetchPolicy b = new FetchPolicy("NetworkFirst", 2);
    public static final FetchPolicy d = new FetchPolicy("NetworkOnly", 3);
    public static final FetchPolicy e = new FetchPolicy("CacheAndNetwork", 4);

    private static final /* synthetic */ FetchPolicy[] b() {
        return new FetchPolicy[]{a, c, b, d, e};
    }

    public static FetchPolicy valueOf(String str) {
        return (FetchPolicy) Enum.valueOf(FetchPolicy.class, str);
    }

    public static FetchPolicy[] values() {
        return (FetchPolicy[]) j.clone();
    }

    private FetchPolicy(String str, int i) {
    }

    static {
        FetchPolicy[] b2 = b();
        j = b2;
        h = C8600drp.e(b2);
    }
}
