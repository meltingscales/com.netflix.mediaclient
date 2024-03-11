package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;

/* renamed from: o.cBd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5593cBd {
    private final long a;
    private final C7535cxz b;
    private final PlayContext c;
    private final IPlayer.PlaybackType d;
    private final InteractiveMoments e;
    private final InterfaceC5198buI h;
    private final Status i;

    public final C7535cxz a() {
        return this.b;
    }

    public final IPlayer.PlaybackType b() {
        return this.d;
    }

    public final long c() {
        return this.a;
    }

    public final InteractiveMoments d() {
        return this.e;
    }

    public final PlayContext e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5593cBd) {
            C5593cBd c5593cBd = (C5593cBd) obj;
            return C8632dsu.c(this.h, c5593cBd.h) && C8632dsu.c(this.i, c5593cBd.i) && this.d == c5593cBd.d && C8632dsu.c(this.c, c5593cBd.c) && this.a == c5593cBd.a && C8632dsu.c(this.e, c5593cBd.e) && C8632dsu.c(this.b, c5593cBd.b);
        }
        return false;
    }

    public final Status h() {
        return this.i;
    }

    public int hashCode() {
        InterfaceC5198buI interfaceC5198buI = this.h;
        int hashCode = interfaceC5198buI == null ? 0 : interfaceC5198buI.hashCode();
        int hashCode2 = this.i.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.c.hashCode();
        int hashCode5 = Long.hashCode(this.a);
        InteractiveMoments interactiveMoments = this.e;
        int hashCode6 = interactiveMoments == null ? 0 : interactiveMoments.hashCode();
        C7535cxz c7535cxz = this.b;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (c7535cxz != null ? c7535cxz.hashCode() : 0);
    }

    public final InterfaceC5198buI j() {
        return this.h;
    }

    public String toString() {
        InterfaceC5198buI interfaceC5198buI = this.h;
        Status status = this.i;
        IPlayer.PlaybackType playbackType = this.d;
        PlayContext playContext = this.c;
        long j = this.a;
        InteractiveMoments interactiveMoments = this.e;
        C7535cxz c7535cxz = this.b;
        return "PlayerData(videoDetails=" + interfaceC5198buI + ", status=" + status + ", playbackType=" + playbackType + ", playContext=" + playContext + ", bookmarkMs=" + j + ", interactiveMoments=" + interactiveMoments + ", prePlayPlaybackVideoWrapper=" + c7535cxz + ")";
    }

    public C5593cBd(InterfaceC5198buI interfaceC5198buI, Status status, IPlayer.PlaybackType playbackType, PlayContext playContext, long j, InteractiveMoments interactiveMoments, C7535cxz c7535cxz) {
        C8632dsu.c((Object) status, "");
        C8632dsu.c((Object) playbackType, "");
        C8632dsu.c((Object) playContext, "");
        this.h = interfaceC5198buI;
        this.i = status;
        this.d = playbackType;
        this.c = playContext;
        this.a = j;
        this.e = interactiveMoments;
        this.b = c7535cxz;
    }

    public /* synthetic */ C5593cBd(InterfaceC5198buI interfaceC5198buI, Status status, IPlayer.PlaybackType playbackType, PlayContext playContext, long j, InteractiveMoments interactiveMoments, C7535cxz c7535cxz, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : interfaceC5198buI, status, (i & 4) != 0 ? IPlayer.PlaybackType.StreamingPlayback : playbackType, playContext, (i & 16) != 0 ? -1L : j, (i & 32) != 0 ? null : interactiveMoments, (i & 64) != 0 ? null : c7535cxz);
    }
}
