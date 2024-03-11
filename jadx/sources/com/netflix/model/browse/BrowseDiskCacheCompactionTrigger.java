package com.netflix.model.browse;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BrowseDiskCacheCompactionTrigger {
    private static final /* synthetic */ InterfaceC8598drn b;
    private static final /* synthetic */ BrowseDiskCacheCompactionTrigger[] h;
    private final String i;
    public static final BrowseDiskCacheCompactionTrigger c = new BrowseDiskCacheCompactionTrigger("PERIODIC_24_HOUR", 0, "PERIODIC_24_HOUR");
    public static final BrowseDiskCacheCompactionTrigger e = new BrowseDiskCacheCompactionTrigger("LOLOMO", 1, "LOLOMO");
    public static final BrowseDiskCacheCompactionTrigger d = new BrowseDiskCacheCompactionTrigger("DEBUG", 2, "DEBUG");
    public static final BrowseDiskCacheCompactionTrigger a = new BrowseDiskCacheCompactionTrigger("INSOMNIA", 3, "INSOMNIA");

    private static final /* synthetic */ BrowseDiskCacheCompactionTrigger[] e() {
        return new BrowseDiskCacheCompactionTrigger[]{c, e, d, a};
    }

    public static BrowseDiskCacheCompactionTrigger valueOf(String str) {
        return (BrowseDiskCacheCompactionTrigger) Enum.valueOf(BrowseDiskCacheCompactionTrigger.class, str);
    }

    public static BrowseDiskCacheCompactionTrigger[] values() {
        return (BrowseDiskCacheCompactionTrigger[]) h.clone();
    }

    private BrowseDiskCacheCompactionTrigger(String str, int i, String str2) {
        this.i = str2;
    }

    static {
        BrowseDiskCacheCompactionTrigger[] e2 = e();
        h = e2;
        b = C8600drp.e(e2);
    }
}
