package com.netflix.mediaclient.libs.process.hooks;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class FoundationalFrameworkInitOrder {
    private static final /* synthetic */ FoundationalFrameworkInitOrder[] f;
    private static final /* synthetic */ InterfaceC8598drn i;
    public static final FoundationalFrameworkInitOrder d = new FoundationalFrameworkInitOrder("ANDROID_STRICT_MODE", 0);
    public static final FoundationalFrameworkInitOrder b = new FoundationalFrameworkInitOrder("LEAK_CANARY", 1);
    public static final FoundationalFrameworkInitOrder a = new FoundationalFrameworkInitOrder("HIGH_PRIORITY_INIT", 2);
    public static final FoundationalFrameworkInitOrder c = new FoundationalFrameworkInitOrder("LOW_PRIORITY_INIT", 3);
    public static final FoundationalFrameworkInitOrder e = new FoundationalFrameworkInitOrder("LEGACY_MONOLITH_APPLICATION_ONCREATE", 4);

    private static final /* synthetic */ FoundationalFrameworkInitOrder[] c() {
        return new FoundationalFrameworkInitOrder[]{d, b, a, c, e};
    }

    public static FoundationalFrameworkInitOrder valueOf(String str) {
        return (FoundationalFrameworkInitOrder) Enum.valueOf(FoundationalFrameworkInitOrder.class, str);
    }

    public static FoundationalFrameworkInitOrder[] values() {
        return (FoundationalFrameworkInitOrder[]) f.clone();
    }

    private FoundationalFrameworkInitOrder(String str, int i2) {
    }

    static {
        FoundationalFrameworkInitOrder[] c2 = c();
        f = c2;
        i = C8600drp.e(c2);
    }
}
