package com.netflix.mediaclient.servicemgr.interface_;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class GameTagRecipe {
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final /* synthetic */ GameTagRecipe[] j;
    private final String i;
    public static final GameTagRecipe h = new GameTagRecipe("NONE", 0, "");
    public static final GameTagRecipe c = new GameTagRecipe("GAME_PRIMARY", 1, "GAME_PRIMARY");
    public static final GameTagRecipe b = new GameTagRecipe("GAME_PRIMARY_FIRST", 2, "GAME_PRIMARY_FIRST");
    public static final GameTagRecipe d = new GameTagRecipe("GAME_GENRE_FORWARD", 3, "GAME_GENRE_FORWARD");
    public static final GameTagRecipe e = new GameTagRecipe("GAME_MECHANIC_FORWARD", 4, "GAME_MECHANIC_FORWARD");
    public static final GameTagRecipe f = new GameTagRecipe("GAME_THEME_FORWARD", 5, "GAME_THEME_FORWARD");
    public static final GameTagRecipe a = new GameTagRecipe("GAME_EVEN_MIX", 6, "GAME_EVEN_MIX");

    private static final /* synthetic */ GameTagRecipe[] a() {
        return new GameTagRecipe[]{h, c, b, d, e, f, a};
    }

    public static GameTagRecipe valueOf(String str) {
        return (GameTagRecipe) Enum.valueOf(GameTagRecipe.class, str);
    }

    public static GameTagRecipe[] values() {
        return (GameTagRecipe[]) j.clone();
    }

    public final String d() {
        return this.i;
    }

    private GameTagRecipe(String str, int i, String str2) {
        this.i = str2;
    }

    static {
        GameTagRecipe[] a2 = a();
        j = a2;
        g = C8600drp.e(a2);
    }
}
