package com.netflix.mediaclient.cdx.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Route {
    private static final /* synthetic */ Route[] g;
    private static final /* synthetic */ InterfaceC8598drn h;
    public static final Route b = new Route("CategoryHub", 0);
    public static final Route d = new Route("Home", 1);
    public static final Route i = new Route("TVShows", 2);
    public static final Route a = new Route("MyList", 3);
    public static final Route c = new Route("Movies", 4);
    public static final Route f = new Route("Search", 5);
    public static final Route e = new Route("NewPopular", 6);

    private static final /* synthetic */ Route[] a() {
        return new Route[]{b, d, i, a, c, f, e};
    }

    public static Route valueOf(String str) {
        return (Route) Enum.valueOf(Route.class, str);
    }

    public static Route[] values() {
        return (Route[]) g.clone();
    }

    private Route(String str, int i2) {
    }

    static {
        Route[] a2 = a();
        g = a2;
        h = C8600drp.e(a2);
    }
}
