package com.netflix.mediaclient.cdx.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NavigationCommand {
    private static final /* synthetic */ NavigationCommand[] m;
    private static final /* synthetic */ InterfaceC8598drn n;
    public static final NavigationCommand l = new NavigationCommand("up", 0);
    public static final NavigationCommand a = new NavigationCommand("down", 1);
    public static final NavigationCommand b = new NavigationCommand("left", 2);
    public static final NavigationCommand i = new NavigationCommand("right", 3);
    public static final NavigationCommand d = new NavigationCommand("enter", 4);
    public static final NavigationCommand e = new NavigationCommand("back", 5);
    public static final NavigationCommand c = new NavigationCommand("home", 6);
    public static final NavigationCommand j = new NavigationCommand("play", 7);
    public static final NavigationCommand f = new NavigationCommand("pause", 8);

    /* renamed from: o  reason: collision with root package name */
    public static final NavigationCommand f13166o = new NavigationCommand("stop", 9);
    public static final NavigationCommand h = new NavigationCommand("skip_forward", 10);
    public static final NavigationCommand g = new NavigationCommand("skip_back", 11);

    private static final /* synthetic */ NavigationCommand[] d() {
        return new NavigationCommand[]{l, a, b, i, d, e, c, j, f, f13166o, h, g};
    }

    public static NavigationCommand valueOf(String str) {
        return (NavigationCommand) Enum.valueOf(NavigationCommand.class, str);
    }

    public static NavigationCommand[] values() {
        return (NavigationCommand[]) m.clone();
    }

    private NavigationCommand(String str, int i2) {
    }

    static {
        NavigationCommand[] d2 = d();
        m = d2;
        n = C8600drp.e(d2);
    }
}
