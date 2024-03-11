package com.netflix.mediaclient.ui.common;

import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault;
import com.netflix.mediaclient.util.PlayContext;
import o.C8600drp;
import o.InterfaceC5160btX;
import o.InterfaceC8598drn;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public interface PlaybackLauncher {
    public static final e a = e.d;
    public static final PlayerExtras e = new PlayerExtras(0, 0, 0, false, false, null, false, null, 0, 0.0f, null, null, null, null, null, 32767, null);
    public static final drM<Boolean, dpR> c = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.common.PlaybackLauncher$Companion$ON_PLAYBACK_DEFAULT$1
        public final void b(boolean z) {
        }

        @Override // o.drM
        public /* synthetic */ dpR invoke(Boolean bool) {
            b(bool.booleanValue());
            return dpR.c;
        }
    };

    void a(PlayVerifierVault playVerifierVault);

    void a(InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext, long j);

    void b(String str, boolean z, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras);

    void b(InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext, long j);

    PlaybackTarget c();

    void c(String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras);

    void c(String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, NetflixActivityBase netflixActivityBase, drM<? super Boolean, dpR> drm);

    void c(InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext, long j);

    void d(InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, drM<? super Boolean, dpR> drm);

    /* loaded from: classes4.dex */
    public static final class e {
        static final /* synthetic */ e d = new e();

        private e() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class PlayLaunchedBy {
        private static final /* synthetic */ InterfaceC8598drn m;
        private static final /* synthetic */ PlayLaunchedBy[] n;
        public static final PlayLaunchedBy c = new PlayLaunchedBy("HomeScreen", 0);
        public static final PlayLaunchedBy b = new PlayLaunchedBy("DetailsScreen", 1);
        public static final PlayLaunchedBy f = new PlayLaunchedBy("PlayerScreen", 2);
        public static final PlayLaunchedBy g = new PlayLaunchedBy("SearchScreen", 3);
        public static final PlayLaunchedBy e = new PlayLaunchedBy("MDXScreen", 4);
        public static final PlayLaunchedBy a = new PlayLaunchedBy("OfflineScreen", 5);
        public static final PlayLaunchedBy d = new PlayLaunchedBy("LaunchActivity", 6);
        public static final PlayLaunchedBy h = new PlayLaunchedBy("UpNext", 7);
        public static final PlayLaunchedBy i = new PlayLaunchedBy("Previews", 8);
        public static final PlayLaunchedBy j = new PlayLaunchedBy("Unknown", 9);

        private static final /* synthetic */ PlayLaunchedBy[] e() {
            return new PlayLaunchedBy[]{c, b, f, g, e, a, d, h, i, j};
        }

        public static PlayLaunchedBy valueOf(String str) {
            return (PlayLaunchedBy) Enum.valueOf(PlayLaunchedBy.class, str);
        }

        public static PlayLaunchedBy[] values() {
            return (PlayLaunchedBy[]) n.clone();
        }

        private PlayLaunchedBy(String str, int i2) {
            super(str, i2);
        }

        static {
            PlayLaunchedBy[] e2 = e();
            n = e2;
            m = C8600drp.e(e2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class PlaybackTarget {
        private static final /* synthetic */ InterfaceC8598drn a;
        private static final /* synthetic */ PlaybackTarget[] h;
        public static final PlaybackTarget e = new PlaybackTarget("Local", 0);
        public static final PlaybackTarget d = new PlaybackTarget("Remote", 1);
        public static final PlaybackTarget c = new PlaybackTarget("RemoteButNotAvailable", 2);
        public static final PlaybackTarget b = new PlaybackTarget("LocalButDisabled", 3);

        private static final /* synthetic */ PlaybackTarget[] d() {
            return new PlaybackTarget[]{e, d, c, b};
        }

        public static PlaybackTarget valueOf(String str) {
            return (PlaybackTarget) Enum.valueOf(PlaybackTarget.class, str);
        }

        public static PlaybackTarget[] values() {
            return (PlaybackTarget[]) h.clone();
        }

        private PlaybackTarget(String str, int i) {
            super(str, i);
        }

        static {
            PlaybackTarget[] d2 = d();
            h = d2;
            a = C8600drp.e(d2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public static /* synthetic */ void a(PlaybackLauncher playbackLauncher, InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, drM drm, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPlaybackAfterPIN");
            }
            if ((i & 8) != 0) {
                playerExtras = PlaybackLauncher.e;
            }
            PlayerExtras playerExtras2 = playerExtras;
            drM<Boolean, dpR> drm2 = drm;
            if ((i & 16) != 0) {
                drm2 = PlaybackLauncher.c;
            }
            playbackLauncher.d(interfaceC5160btX, videoType, playContext, playerExtras2, drm2);
        }

        public static /* synthetic */ void e(PlaybackLauncher playbackLauncher, String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, NetflixActivityBase netflixActivityBase, drM drm, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPlaybackAfterFetchAndPIN");
            }
            if ((i & 8) != 0) {
                playerExtras = PlaybackLauncher.e;
            }
            PlayerExtras playerExtras2 = playerExtras;
            drM<Boolean, dpR> drm2 = drm;
            if ((i & 32) != 0) {
                drm2 = PlaybackLauncher.c;
            }
            playbackLauncher.c(str, videoType, playContext, playerExtras2, netflixActivityBase, drm2);
        }
    }
}
