package com.netflix.mediaclient.ui.commander.impl.ui.menu;

import com.netflix.hawkins.consumer.component.icon.HawkinsIconSize;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import o.C8600drp;
import o.C8627dsp;
import o.InterfaceC8598drn;
import o.bBM;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class NavigationMenuAction {
    public static final NavigationMenuAction a;
    public static final NavigationMenuAction b;
    public static final NavigationMenuAction c;
    public static final NavigationMenuAction d;
    public static final NavigationMenuAction e;
    private static final /* synthetic */ NavigationMenuAction[] h;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final HawkinsIconSize f;
    private final int g;
    private final HawkinsIcon i;
    private final NavigationMenuType l;

    public static InterfaceC8598drn<NavigationMenuAction> c() {
        return j;
    }

    private static final /* synthetic */ NavigationMenuAction[] i() {
        return new NavigationMenuAction[]{a, e, b, d, c};
    }

    public static NavigationMenuAction valueOf(String str) {
        return (NavigationMenuAction) Enum.valueOf(NavigationMenuAction.class, str);
    }

    public static NavigationMenuAction[] values() {
        return (NavigationMenuAction[]) h.clone();
    }

    public final NavigationMenuType a() {
        return this.l;
    }

    public final int b() {
        return this.g;
    }

    public final HawkinsIconSize d() {
        return this.f;
    }

    public final HawkinsIcon e() {
        return this.i;
    }

    private NavigationMenuAction(String str, int i, int i2, HawkinsIcon hawkinsIcon, HawkinsIconSize hawkinsIconSize, NavigationMenuType navigationMenuType) {
        this.g = i2;
        this.i = hawkinsIcon;
        this.f = hawkinsIconSize;
        this.l = navigationMenuType;
    }

    /* synthetic */ NavigationMenuAction(String str, int i, int i2, HawkinsIcon hawkinsIcon, HawkinsIconSize hawkinsIconSize, NavigationMenuType navigationMenuType, int i3, C8627dsp c8627dsp) {
        this(str, i, i2, hawkinsIcon, (i3 & 4) != 0 ? HawkinsIconSize.d : hawkinsIconSize, navigationMenuType);
    }

    static {
        int i = bBM.c.b;
        HawkinsIcon.O o2 = HawkinsIcon.O.b;
        NavigationMenuType navigationMenuType = NavigationMenuType.b;
        a = new NavigationMenuAction("Back", 0, i, o2, null, navigationMenuType, 4, null);
        e = new NavigationMenuAction("Stop", 1, bBM.c.au, HawkinsIcon.C0367iy.d, null, NavigationMenuType.a, 4, null);
        b = new NavigationMenuAction("Home", 2, bBM.c.A, HawkinsIcon.eJ.c, null, navigationMenuType, 4, null);
        int i2 = bBM.c.x;
        HawkinsIcon.cT cTVar = HawkinsIcon.cT.d;
        HawkinsIconSize hawkinsIconSize = HawkinsIconSize.a;
        d = new NavigationMenuAction("GoToDpad", 3, i2, cTVar, hawkinsIconSize, NavigationMenuType.e);
        c = new NavigationMenuAction("GoToPlayback", 4, bBM.c.B, HawkinsIcon.cS.c, hawkinsIconSize, NavigationMenuType.c);
        NavigationMenuAction[] i3 = i();
        h = i3;
        j = C8600drp.e(i3);
    }
}
