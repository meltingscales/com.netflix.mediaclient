package o;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;

/* renamed from: o.bmz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4817bmz {
    public static final d b = new d(null);
    private final Long a;
    private final C4726bju c;
    private final boolean d;
    private final SegmentType e;
    private final long g;
    private final long h;
    private final long i;
    private final long j;

    public final C4726bju a() {
        return this.c;
    }

    public final long b() {
        return this.j;
    }

    public final Long c() {
        return this.a;
    }

    public final long d() {
        return this.h;
    }

    public final SegmentType e() {
        return this.e;
    }

    public final boolean f() {
        return this.d;
    }

    public final long i() {
        return this.g;
    }

    public final boolean j() {
        return this.d && this.h >= this.i - ((long) 30000);
    }

    public C4817bmz(long j, long j2, SegmentType segmentType, long j3, C4726bju c4726bju, Long l, boolean z, long j4) {
        C8632dsu.c((Object) segmentType, "");
        this.j = j;
        this.h = j2;
        this.e = segmentType;
        this.g = j3;
        this.c = c4726bju;
        this.a = l;
        this.d = z;
        this.i = j4;
    }

    /* renamed from: o.bmz$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final C4817bmz a(AnalyticsListener.EventTime eventTime) {
            SegmentType segmentType;
            C8632dsu.c((Object) eventTime, "");
            Timeline.Window a = C4772bmG.a(eventTime);
            long positionInFirstPeriodMs = a.getPositionInFirstPeriodMs() != -9223372036854775807L ? a.getPositionInFirstPeriodMs() : 0L;
            long j = eventTime.eventPlaybackPositionMs;
            C4680bjA c = C4772bmG.c(eventTime);
            long b = c != null ? c.b() : -1L;
            if (c == null || (segmentType = c.c()) == null) {
                segmentType = SegmentType.a;
            }
            SegmentType segmentType2 = segmentType;
            Object obj = a.manifest;
            return new C4817bmz(eventTime.realtimeMs, j + positionInFirstPeriodMs, segmentType2, b, obj != null ? (C4726bju) C9726vo.c(obj, C4726bju.class) : null, c != null ? c.d() : null, a.isDynamic, a.getDurationMs());
        }
    }

    public final C4817bmz e(long j) {
        return new C4817bmz(this.j, j, this.e, this.g, this.c, this.a, this.d, this.i);
    }

    public String toString() {
        long j = this.j;
        long j2 = this.h;
        SegmentType segmentType = this.e;
        long j3 = this.g;
        return "PdsEventTime(realtimeMs=" + j + ", playbackPositionMs=" + j2 + ", contentType=" + segmentType + ", viewableId=" + j3 + ")";
    }
}
