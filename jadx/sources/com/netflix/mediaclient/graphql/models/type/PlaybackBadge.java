package com.netflix.mediaclient.graphql.models.type;

import java.util.Iterator;
import java.util.List;
import o.C8569dql;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9033hu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PlaybackBadge {
    public static final c b;
    private static final /* synthetic */ InterfaceC8598drn l;
    private static final /* synthetic */ PlaybackBadge[] p;
    private static final C9033hu r;
    private final String q;
    public static final PlaybackBadge m = new PlaybackBadge("VIDEO_SD", 0, "VIDEO_SD");
    public static final PlaybackBadge n = new PlaybackBadge("VIDEO_HD", 1, "VIDEO_HD");

    /* renamed from: o  reason: collision with root package name */
    public static final PlaybackBadge f13180o = new PlaybackBadge("VIDEO_ULTRA_HD", 2, "VIDEO_ULTRA_HD");
    public static final PlaybackBadge k = new PlaybackBadge("VIDEO_HDR", 3, "VIDEO_HDR");
    public static final PlaybackBadge j = new PlaybackBadge("VIDEO_3D", 4, "VIDEO_3D");
    public static final PlaybackBadge h = new PlaybackBadge("VIDEO_DOLBY_VISION", 5, "VIDEO_DOLBY_VISION");
    public static final PlaybackBadge a = new PlaybackBadge("AUDIO_FIVE_DOT_ONE", 6, "AUDIO_FIVE_DOT_ONE");
    public static final PlaybackBadge c = new PlaybackBadge("AUDIO_DOLBY_ATMOS", 7, "AUDIO_DOLBY_ATMOS");
    public static final PlaybackBadge e = new PlaybackBadge("AUDIO_ASSISTIVE", 8, "AUDIO_ASSISTIVE");
    public static final PlaybackBadge d = new PlaybackBadge("AUDIO_SPATIAL", 9, "AUDIO_SPATIAL");
    public static final PlaybackBadge f = new PlaybackBadge("TEXT_CLOSED_CAPTIONS", 10, "TEXT_CLOSED_CAPTIONS");
    public static final PlaybackBadge i = new PlaybackBadge("OFFLINE_DOWNLOAD_AVAILABLE", 11, "OFFLINE_DOWNLOAD_AVAILABLE");
    public static final PlaybackBadge g = new PlaybackBadge("UNKNOWN__", 12, "UNKNOWN__");

    public static InterfaceC8598drn<PlaybackBadge> d() {
        return l;
    }

    private static final /* synthetic */ PlaybackBadge[] e() {
        return new PlaybackBadge[]{m, n, f13180o, k, j, h, a, c, e, d, f, i, g};
    }

    public static PlaybackBadge valueOf(String str) {
        return (PlaybackBadge) Enum.valueOf(PlaybackBadge.class, str);
    }

    public static PlaybackBadge[] values() {
        return (PlaybackBadge[]) p.clone();
    }

    public final String a() {
        return this.q;
    }

    private PlaybackBadge(String str, int i2, String str2) {
        this.q = str2;
    }

    static {
        List j2;
        PlaybackBadge[] e2 = e();
        p = e2;
        l = C8600drp.e(e2);
        b = new c(null);
        j2 = C8569dql.j("VIDEO_SD", "VIDEO_HD", "VIDEO_ULTRA_HD", "VIDEO_HDR", "VIDEO_3D", "VIDEO_DOLBY_VISION", "AUDIO_FIVE_DOT_ONE", "AUDIO_DOLBY_ATMOS", "AUDIO_ASSISTIVE", "AUDIO_SPATIAL", "TEXT_CLOSED_CAPTIONS", "OFFLINE_DOWNLOAD_AVAILABLE");
        r = new C9033hu("PlaybackBadge", j2);
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final C9033hu c() {
            return PlaybackBadge.r;
        }

        public final PlaybackBadge c(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = PlaybackBadge.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((PlaybackBadge) obj).a(), (Object) str)) {
                    break;
                }
            }
            PlaybackBadge playbackBadge = (PlaybackBadge) obj;
            return playbackBadge == null ? PlaybackBadge.g : playbackBadge;
        }
    }
}
