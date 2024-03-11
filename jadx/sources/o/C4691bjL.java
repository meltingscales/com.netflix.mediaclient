package o;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Util;

/* renamed from: o.bjL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4691bjL {
    private long a;
    private long c;
    private final C4585bhL d;

    public C4691bjL(C4585bhL c4585bhL) {
        C8632dsu.c((Object) c4585bhL, "");
        this.d = c4585bhL;
        this.a = -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public final void b(MediaItem.LiveConfiguration liveConfiguration) {
        C8632dsu.c((Object) liveConfiguration, "");
        this.d.setLiveConfiguration(liveConfiguration);
    }

    public final void d(long j) {
        this.a = j;
        this.c = Util.getNowUnixTimeMs(0L);
    }

    public final boolean c() {
        return (this.a == -9223372036854775807L || this.c == -9223372036854775807L || this.d.getTargetLiveOffsetUs() <= 0) ? false : true;
    }

    public final void c(int i, long j, long j2) {
        if (i == 2) {
            this.d.getAdjustedPlaybackSpeed(j, j2);
        }
    }

    public final long e(AbstractC4735bkK abstractC4735bkK) {
        long G;
        C8632dsu.c((Object) abstractC4735bkK, "");
        long nowUnixTimeMs = Util.getNowUnixTimeMs(0L);
        long j = this.c;
        if (this.d.d()) {
            G = Util.usToMs(this.d.getTargetLiveOffsetUs());
        } else {
            G = abstractC4735bkK.G();
        }
        return this.a + Util.msToUs((nowUnixTimeMs - j) + G);
    }
}
