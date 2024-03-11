package com.netflix.mediaclient.ui.games.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class GameBillboardCanvas {
    private static final /* synthetic */ GameBillboardCanvas[] d;
    private static final /* synthetic */ InterfaceC8598drn e;
    public static final GameBillboardCanvas c = new GameBillboardCanvas("HOME_TAB", 0);
    public static final GameBillboardCanvas b = new GameBillboardCanvas("GAMES_TAB", 1);
    public static final GameBillboardCanvas a = new GameBillboardCanvas("GDP", 2);

    private static final /* synthetic */ GameBillboardCanvas[] a() {
        return new GameBillboardCanvas[]{c, b, a};
    }

    public static GameBillboardCanvas valueOf(String str) {
        return (GameBillboardCanvas) Enum.valueOf(GameBillboardCanvas.class, str);
    }

    public static GameBillboardCanvas[] values() {
        return (GameBillboardCanvas[]) d.clone();
    }

    private GameBillboardCanvas(String str, int i) {
    }

    static {
        GameBillboardCanvas[] a2 = a();
        d = a2;
        e = C8600drp.e(a2);
    }
}
