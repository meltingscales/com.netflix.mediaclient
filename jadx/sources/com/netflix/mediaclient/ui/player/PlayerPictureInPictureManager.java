package com.netflix.mediaclient.ui.player;

import android.content.Context;
import android.graphics.Rect;
import android.util.Rational;
import o.C8600drp;
import o.InterfaceC8598drn;

/* loaded from: classes4.dex */
public interface PlayerPictureInPictureManager {
    void a(Rect rect);

    void a(Rational rational);

    void a(PlayerLiveStatus playerLiveStatus);

    void b(PlaybackPipStatus playbackPipStatus);

    void b(boolean z);

    boolean b();

    boolean b(boolean z, Context context);

    PlaybackPipStatus c();

    void e(boolean z);

    void i();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class PlaybackPipStatus {
        private static final /* synthetic */ InterfaceC8598drn a;
        private static final /* synthetic */ PlaybackPipStatus[] j;
        public static final PlaybackPipStatus c = new PlaybackPipStatus("None", 0);
        public static final PlaybackPipStatus b = new PlaybackPipStatus("Playing", 1);
        public static final PlaybackPipStatus e = new PlaybackPipStatus("Paused", 2);
        public static final PlaybackPipStatus d = new PlaybackPipStatus("Error", 3);

        private static final /* synthetic */ PlaybackPipStatus[] c() {
            return new PlaybackPipStatus[]{c, b, e, d};
        }

        public static PlaybackPipStatus valueOf(String str) {
            return (PlaybackPipStatus) Enum.valueOf(PlaybackPipStatus.class, str);
        }

        public static PlaybackPipStatus[] values() {
            return (PlaybackPipStatus[]) j.clone();
        }

        private PlaybackPipStatus(String str, int i) {
        }

        static {
            PlaybackPipStatus[] c2 = c();
            j = c2;
            a = C8600drp.e(c2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class PlayerLiveStatus {
        private static final /* synthetic */ InterfaceC8598drn f;
        private static final /* synthetic */ PlayerLiveStatus[] h;
        public static final PlayerLiveStatus d = new PlayerLiveStatus("None", 0);
        public static final PlayerLiveStatus j = new PlayerLiveStatus("WaitingRoom", 1);
        public static final PlayerLiveStatus c = new PlayerLiveStatus("Live", 2);
        public static final PlayerLiveStatus b = new PlayerLiveStatus("ThankYou", 3);
        public static final PlayerLiveStatus a = new PlayerLiveStatus("DVRLiveEdge", 4);
        public static final PlayerLiveStatus e = new PlayerLiveStatus("DVR", 5);

        private static final /* synthetic */ PlayerLiveStatus[] a() {
            return new PlayerLiveStatus[]{d, j, c, b, a, e};
        }

        public static PlayerLiveStatus valueOf(String str) {
            return (PlayerLiveStatus) Enum.valueOf(PlayerLiveStatus.class, str);
        }

        public static PlayerLiveStatus[] values() {
            return (PlayerLiveStatus[]) h.clone();
        }

        private PlayerLiveStatus(String str, int i) {
        }

        static {
            PlayerLiveStatus[] a2 = a();
            h = a2;
            f = C8600drp.e(a2);
        }
    }
}
