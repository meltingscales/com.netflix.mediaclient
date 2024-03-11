package o;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.LivePlaybackSpeedControl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.bhL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4585bhL implements Player.Listener, LivePlaybackSpeedControl {
    public static final c d = new c(null);
    private long a;
    private MediaItem.LiveConfiguration b;
    private final LivePlaybackSpeedControl c;
    private float e;
    private final List<InterfaceC4574bhA> f;
    private boolean j;

    public C4585bhL() {
        this(null, 1, null);
    }

    public final long b() {
        return this.a;
    }

    public final boolean d() {
        return this.j;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public long getTargetLiveOffsetUs() {
        return this.c.getTargetLiveOffsetUs();
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void notifyRebuffer() {
        this.c.notifyRebuffer();
    }

    public C4585bhL(LivePlaybackSpeedControl livePlaybackSpeedControl) {
        C8632dsu.c((Object) livePlaybackSpeedControl, "");
        this.c = livePlaybackSpeedControl;
        this.f = new ArrayList();
        this.e = 1.0f;
        this.j = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C4585bhL(androidx.media3.exoplayer.LivePlaybackSpeedControl r1, int r2, o.C8627dsp r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L12
            androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl$Builder r1 = new androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl$Builder
            r1.<init>()
            androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl r1 = r1.build()
            java.lang.String r2 = ""
            o.C8632dsu.a(r1, r2)
        L12:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4585bhL.<init>(androidx.media3.exoplayer.LivePlaybackSpeedControl, int, o.dsp):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4585bhL c4585bhL) {
        C8632dsu.c((Object) c4585bhL, "");
        for (InterfaceC4574bhA interfaceC4574bhA : c4585bhL.f) {
            interfaceC4574bhA.a();
        }
    }

    private final void a(boolean z) {
        if (this.j != z) {
            this.j = z;
            C8187dfe.c(new Runnable() { // from class: o.bhN
                @Override // java.lang.Runnable
                public final void run() {
                    C4585bhL.a(C4585bhL.this);
                }
            });
        }
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration) {
        C8632dsu.c((Object) liveConfiguration, "");
        this.b = liveConfiguration;
        if (this.a > 0) {
            MediaItem.LiveConfiguration.Builder buildUpon = liveConfiguration.buildUpon();
            long j = liveConfiguration.maxOffsetMs;
            if (j > 0) {
                buildUpon.setMaxOffsetMs(j + this.a);
            }
            long j2 = liveConfiguration.minOffsetMs;
            if (j2 > 0) {
                buildUpon.setMinOffsetMs(j2 + this.a);
            }
            long j3 = liveConfiguration.targetOffsetMs;
            if (j3 > 0) {
                buildUpon.setTargetOffsetMs(j3 + this.a);
            }
            liveConfiguration = buildUpon.build();
        }
        C8632dsu.d(liveConfiguration);
        this.c.setLiveConfiguration(liveConfiguration);
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void setTargetLiveOffsetOverrideUs(long j) {
        a(j == -9223372036854775807L);
        d.getLogTag();
        this.c.setTargetLiveOffsetOverrideUs(j);
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public float getAdjustedPlaybackSpeed(long j, long j2) {
        float adjustedPlaybackSpeed = this.c.getAdjustedPlaybackSpeed(j, j2);
        this.e = adjustedPlaybackSpeed;
        return adjustedPlaybackSpeed;
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayWhenReadyChanged(boolean z, int i) {
        if (!z) {
            a(false);
        }
        d.getLogTag();
    }

    public final void d(InterfaceC4574bhA interfaceC4574bhA) {
        C8632dsu.c((Object) interfaceC4574bhA, "");
        this.f.add(interfaceC4574bhA);
    }

    public final void c(InterfaceC4574bhA interfaceC4574bhA) {
        C8632dsu.c((Object) interfaceC4574bhA, "");
        this.f.remove(interfaceC4574bhA);
    }

    /* renamed from: o.bhL$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("LivePlaybackSpeedControl");
        }
    }

    public final void d(int i, long j) {
        long d2;
        if (i != 1) {
            d.getLogTag();
        } else if (j < 0) {
            d.getLogTag();
        } else {
            long j2 = this.a;
            if (j >= j2) {
                d2 = C8657dts.d(j, j2 + 100);
                d.getLogTag();
                this.a = d2;
                MediaItem.LiveConfiguration liveConfiguration = this.b;
                if (liveConfiguration != null) {
                    setLiveConfiguration(liveConfiguration);
                    return;
                }
                return;
            }
            d.getLogTag();
        }
    }
}
