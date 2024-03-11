package com.netflix.mediaclient.playerui.videoview.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* loaded from: classes3.dex */
public interface PlayerControls {
    void d(PlayerPauseType playerPauseType);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class PlayerPauseType {
        private static final /* synthetic */ InterfaceC8598drn b;
        private static final /* synthetic */ PlayerPauseType[] d;
        public static final PlayerPauseType c = new PlayerPauseType("USER", 0);
        public static final PlayerPauseType e = new PlayerPauseType("AUTO", 1);

        private static final /* synthetic */ PlayerPauseType[] a() {
            return new PlayerPauseType[]{c, e};
        }

        public static PlayerPauseType valueOf(String str) {
            return (PlayerPauseType) Enum.valueOf(PlayerPauseType.class, str);
        }

        public static PlayerPauseType[] values() {
            return (PlayerPauseType[]) d.clone();
        }

        private PlayerPauseType(String str, int i) {
        }

        static {
            PlayerPauseType[] a = a();
            d = a;
            b = C8600drp.e(a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ void e(PlayerControls playerControls, PlayerPauseType playerPauseType, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
            }
            if ((i & 1) != 0) {
                playerPauseType = PlayerPauseType.e;
            }
            playerControls.d(playerPauseType);
        }
    }
}
