package com.netflix.mediaclient.ui.playercontrolscompose.impl.state;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PlayerUIExperience {
    private static final /* synthetic */ PlayerUIExperience[] f;
    private static final /* synthetic */ InterfaceC8598drn h;
    public static final PlayerUIExperience e = new PlayerUIExperience("ADS", 0);
    public static final PlayerUIExperience c = new PlayerUIExperience("LIVE", 1);
    public static final PlayerUIExperience d = new PlayerUIExperience("POST_PLAY", 2);
    public static final PlayerUIExperience a = new PlayerUIExperience("PRE_PLAY", 3);
    public static final PlayerUIExperience b = new PlayerUIExperience("STANDARD", 4);

    private static final /* synthetic */ PlayerUIExperience[] c() {
        return new PlayerUIExperience[]{e, c, d, a, b};
    }

    public static PlayerUIExperience valueOf(String str) {
        return (PlayerUIExperience) Enum.valueOf(PlayerUIExperience.class, str);
    }

    public static PlayerUIExperience[] values() {
        return (PlayerUIExperience[]) f.clone();
    }

    private PlayerUIExperience(String str, int i) {
    }

    static {
        PlayerUIExperience[] c2 = c();
        f = c2;
        h = C8600drp.e(c2);
    }
}
