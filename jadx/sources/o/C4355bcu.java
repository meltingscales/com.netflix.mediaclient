package o;

import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.util.PlayContext;

/* renamed from: o.bcu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4355bcu {
    private final String a;
    private final PlaylistTimestamp b;
    private final PlayContext c;
    private final PlaybackExperience d;
    private final PlaylistMap<?> e;
    private final long f;
    private final AbstractC5100bsQ g;
    private final PreferredLanguageData h;
    private final boolean i;

    public final PlaybackExperience a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final PlaylistTimestamp c() {
        return this.b;
    }

    public final PlayContext d() {
        return this.c;
    }

    public final PlaylistMap<?> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4355bcu) {
            C4355bcu c4355bcu = (C4355bcu) obj;
            return this.f == c4355bcu.f && C8632dsu.c(this.g, c4355bcu.g) && C8632dsu.c(this.d, c4355bcu.d) && C8632dsu.c(this.e, c4355bcu.e) && C8632dsu.c(this.c, c4355bcu.c) && C8632dsu.c(this.b, c4355bcu.b) && this.i == c4355bcu.i && C8632dsu.c((Object) this.a, (Object) c4355bcu.a) && C8632dsu.c(this.h, c4355bcu.h);
        }
        return false;
    }

    public final AbstractC5100bsQ f() {
        return this.g;
    }

    public final boolean g() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.f);
        int hashCode2 = this.g.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.c.hashCode();
        int hashCode6 = this.b.hashCode();
        int hashCode7 = Boolean.hashCode(this.i);
        String str = this.a;
        int hashCode8 = str == null ? 0 : str.hashCode();
        PreferredLanguageData preferredLanguageData = this.h;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (preferredLanguageData != null ? preferredLanguageData.hashCode() : 0);
    }

    public final PreferredLanguageData i() {
        return this.h;
    }

    public final long j() {
        return this.f;
    }

    public String toString() {
        long j = this.f;
        AbstractC5100bsQ abstractC5100bsQ = this.g;
        PlaybackExperience playbackExperience = this.d;
        PlaylistMap<?> playlistMap = this.e;
        PlayContext playContext = this.c;
        PlaylistTimestamp playlistTimestamp = this.b;
        boolean z = this.i;
        String str = this.a;
        PreferredLanguageData preferredLanguageData = this.h;
        return "PlaybackSessionParams2(userPlayStartTime=" + j + ", videoGroup=" + abstractC5100bsQ + ", playbackExperience=" + playbackExperience + ", playlist=" + playlistMap + ", playContext=" + playContext + ", playlistTimestamp=" + playlistTimestamp + ", streamingForced=" + z + ", pin=" + str + ", preferredLanguage=" + preferredLanguageData + ")";
    }

    public C4355bcu(long j, AbstractC5100bsQ abstractC5100bsQ, PlaybackExperience playbackExperience, PlaylistMap<?> playlistMap, PlayContext playContext, PlaylistTimestamp playlistTimestamp, boolean z, String str, PreferredLanguageData preferredLanguageData) {
        C8632dsu.c((Object) abstractC5100bsQ, "");
        C8632dsu.c((Object) playbackExperience, "");
        C8632dsu.c((Object) playlistMap, "");
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) playlistTimestamp, "");
        this.f = j;
        this.g = abstractC5100bsQ;
        this.d = playbackExperience;
        this.e = playlistMap;
        this.c = playContext;
        this.b = playlistTimestamp;
        this.i = z;
        this.a = str;
        this.h = preferredLanguageData;
    }
}
