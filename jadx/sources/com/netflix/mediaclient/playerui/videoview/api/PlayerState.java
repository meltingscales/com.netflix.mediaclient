package com.netflix.mediaclient.playerui.videoview.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PlayerState {
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final /* synthetic */ PlayerState[] h;

    /* renamed from: o  reason: collision with root package name */
    private final String f13192o;
    public static final PlayerState b = new PlayerState("Idle", 0, "Idle");
    public static final PlayerState c = new PlayerState("Prepared", 1, "Prepared");
    public static final PlayerState f = new PlayerState("Started", 2, "Started");
    public static final PlayerState a = new PlayerState("Paused", 3, "Paused");
    public static final PlayerState d = new PlayerState("Error", 4, "Error");
    public static final PlayerState i = new PlayerState("Stalled", 5, "Stalled");
    public static final PlayerState e = new PlayerState("Completed", 6, "Completed");
    public static final PlayerState j = new PlayerState("Seeking", 7, "Seeking");

    private static final /* synthetic */ PlayerState[] d() {
        return new PlayerState[]{b, c, f, a, d, i, e, j};
    }

    public static PlayerState valueOf(String str) {
        return (PlayerState) Enum.valueOf(PlayerState.class, str);
    }

    public static PlayerState[] values() {
        return (PlayerState[]) h.clone();
    }

    public final boolean a() {
        return (this == j || this == i || this == b || this == c) ? false : true;
    }

    public final boolean e() {
        return this != j;
    }

    private PlayerState(String str, int i2, String str2) {
        this.f13192o = str2;
    }

    static {
        PlayerState[] d2 = d();
        h = d2;
        g = C8600drp.e(d2);
    }
}
