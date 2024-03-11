package com.netflix.mediaclient.commanderinfra.api.util;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NavigationKey {
    private static final /* synthetic */ InterfaceC8598drn c;
    private static final /* synthetic */ NavigationKey[] e;
    public static final NavigationKey d = new NavigationKey("Back", 0);
    public static final NavigationKey b = new NavigationKey("Home", 1);
    public static final NavigationKey a = new NavigationKey("Stop", 2);

    private static final /* synthetic */ NavigationKey[] a() {
        return new NavigationKey[]{d, b, a};
    }

    public static NavigationKey valueOf(String str) {
        return (NavigationKey) Enum.valueOf(NavigationKey.class, str);
    }

    public static NavigationKey[] values() {
        return (NavigationKey[]) e.clone();
    }

    private NavigationKey(String str, int i) {
    }

    static {
        NavigationKey[] a2 = a();
        e = a2;
        c = C8600drp.e(a2);
    }
}
