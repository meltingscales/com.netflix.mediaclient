package com.netflix.mediaclient.ui.commander.impl.ui.menu;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class MenuType {
    private static final /* synthetic */ InterfaceC8598drn a;
    private static final /* synthetic */ MenuType[] j;
    public static final MenuType c = new MenuType("Browse", 0);
    public static final MenuType b = new MenuType("TitleDetails", 1);
    public static final MenuType d = new MenuType("Playback", 2);
    public static final MenuType e = new MenuType("TitleDetailsAndPlayback", 3);

    private static final /* synthetic */ MenuType[] e() {
        return new MenuType[]{c, b, d, e};
    }

    public static MenuType valueOf(String str) {
        return (MenuType) Enum.valueOf(MenuType.class, str);
    }

    public static MenuType[] values() {
        return (MenuType[]) j.clone();
    }

    private MenuType(String str, int i) {
    }

    static {
        MenuType[] e2 = e();
        j = e2;
        a = C8600drp.e(e2);
    }
}
