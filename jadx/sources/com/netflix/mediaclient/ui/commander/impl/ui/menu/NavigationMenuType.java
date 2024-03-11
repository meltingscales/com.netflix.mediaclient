package com.netflix.mediaclient.ui.commander.impl.ui.menu;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class NavigationMenuType {
    private static final /* synthetic */ InterfaceC8598drn f;
    private static final /* synthetic */ NavigationMenuType[] i;
    public static final NavigationMenuType b = new NavigationMenuType("Browse", 0);
    public static final NavigationMenuType e = new NavigationMenuType("Playback", 1);
    public static final NavigationMenuType c = new NavigationMenuType("Dpad", 2);
    public static final NavigationMenuType a = new NavigationMenuType("PlaybackDpad", 3);
    public static final NavigationMenuType d = new NavigationMenuType("All", 4);

    private static final /* synthetic */ NavigationMenuType[] d() {
        return new NavigationMenuType[]{b, e, c, a, d};
    }

    public static NavigationMenuType valueOf(String str) {
        return (NavigationMenuType) Enum.valueOf(NavigationMenuType.class, str);
    }

    public static NavigationMenuType[] values() {
        return (NavigationMenuType[]) i.clone();
    }

    private NavigationMenuType(String str, int i2) {
    }

    static {
        NavigationMenuType[] d2 = d();
        i = d2;
        f = C8600drp.e(d2);
    }
}
