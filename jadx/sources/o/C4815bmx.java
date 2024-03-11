package o;

import android.content.Context;
import android.os.Handler;
import android.util.LongSparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.MediaLoadData;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsDelayedEventQueue;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;
import o.C4771bmF;
import o.C4817bmz;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.bmx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4815bmx extends C4582bhI {
    public static final b d = new b(null);
    private final Context a;
    private final C4911bon b;
    private final d c;
    private final C4649biW e;
    private final Handler f;
    private boolean g;
    private final PdsDelayedEventQueue h;
    private final C4773bmH i;
    private final C4624bhy j;
    private boolean k;
    private C4817bmz l;
    private boolean m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final Timeline.Window f13619o;
    private C4320bcL p;
    private PlaybackExperience q;
    private boolean r;
    private final InterfaceC4968bpr s;
    private final LongSparseArray<C4771bmF> t;

    /* renamed from: o.bmx$a */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[PdsDelayedEventQueue.EventType.values().length];
            try {
                iArr[PdsDelayedEventQueue.EventType.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PdsDelayedEventQueue.EventType.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            e = iArr;
        }
    }

    public final void a() {
        this.g = true;
    }

    public final void b(PlaybackExperience playbackExperience) {
        C8632dsu.c((Object) playbackExperience, "");
        this.q = playbackExperience;
    }

    public final void d() {
        this.g = false;
    }

    public final void d(boolean z) {
        this.r = z;
    }

    public final void e(C4320bcL c4320bcL) {
        this.p = c4320bcL;
    }

    public C4815bmx(Context context, Handler handler, InterfaceC4766bmA interfaceC4766bmA, InterfaceC4968bpr interfaceC4968bpr, C4624bhy c4624bhy, PlaybackExperience playbackExperience, C4911bon c4911bon, C4649biW c4649biW) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) handler, "");
        C8632dsu.c((Object) interfaceC4766bmA, "");
        C8632dsu.c((Object) interfaceC4968bpr, "");
        C8632dsu.c((Object) c4624bhy, "");
        C8632dsu.c((Object) playbackExperience, "");
        C8632dsu.c((Object) c4649biW, "");
        this.a = context;
        this.f = handler;
        this.s = interfaceC4968bpr;
        this.j = c4624bhy;
        this.q = playbackExperience;
        this.b = c4911bon;
        this.e = c4649biW;
        this.r = true;
        this.t = new LongSparseArray<>();
        this.i = new C4773bmH(interfaceC4766bmA);
        this.f13619o = new Timeline.Window();
        this.h = new PdsDelayedEventQueue();
        this.c = new d();
    }

    /* renamed from: o.bmx$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC4808bmq {
        d() {
        }

        @Override // o.InterfaceC4808bmq
        public boolean e() {
            return C4815bmx.this.r && !C4815bmx.this.g;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onSurfaceSizeChanged(final AnalyticsListener.EventTime eventTime, final int i, final int i2) {
        C8632dsu.c((Object) eventTime, "");
        if (e(eventTime)) {
            a(this, eventTime, false, new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$onSurfaceSizeChanged$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                    a(c4771bmF);
                    return dpR.c;
                }

                public final void a(C4771bmF c4771bmF) {
                    C8632dsu.c((Object) c4771bmF, "");
                    c4771bmF.d(C4817bmz.b.a(AnalyticsListener.EventTime.this), i, i2);
                }
            }, 2, null);
        } else {
            C4809bmr.d.d(i, i2);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlayerError(final AnalyticsListener.EventTime eventTime, final PlaybackException playbackException) {
        C8632dsu.c((Object) eventTime, "");
        C8632dsu.c((Object) playbackException, "");
        a(this, eventTime, false, new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$onPlayerError$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(C4771bmF c4771bmF) {
                C8632dsu.c((Object) c4771bmF, "");
                c4771bmF.a(C4817bmz.b.a(AnalyticsListener.EventTime.this), playbackException);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                a(c4771bmF);
                return dpR.c;
            }
        }, 2, null);
    }

    private final void g(final AnalyticsListener.EventTime eventTime) {
        try {
            eventTime.timeline.getWindow(eventTime.windowIndex, this.f13619o);
            d.getLogTag();
        } catch (Exception unused) {
        }
        for (final PdsDelayedEventQueue.d dVar : this.h.c(this.f13619o.tag)) {
            d.getLogTag();
            int i = a.e[dVar.b().ordinal()];
            if (i == 1) {
                a(this, eventTime, false, new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$storeLastKnownPlayingWindow$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                        c(c4771bmF);
                        return dpR.c;
                    }

                    public final void c(C4771bmF c4771bmF) {
                        C8632dsu.c((Object) c4771bmF, "");
                        C4817bmz a2 = C4817bmz.b.a(AnalyticsListener.EventTime.this);
                        Object d2 = dVar.d();
                        C8632dsu.d(d2);
                        c4771bmF.d(a2, (MediaLoadData) d2);
                    }
                }, 2, null);
            } else if (i == 2) {
                a(this, eventTime, false, new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$storeLastKnownPlayingWindow$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                        c(c4771bmF);
                        return dpR.c;
                    }

                    public final void c(C4771bmF c4771bmF) {
                        C8632dsu.c((Object) c4771bmF, "");
                        C4817bmz a2 = C4817bmz.b.a(AnalyticsListener.EventTime.this);
                        Object d2 = dVar.d();
                        C8632dsu.d(d2);
                        c4771bmF.d(a2, (Tracks) d2);
                    }
                }, 2, null);
            }
        }
    }

    private final boolean e(AnalyticsListener.EventTime eventTime) {
        return i(eventTime) != null;
    }

    private final boolean h(AnalyticsListener.EventTime eventTime) {
        Object obj;
        Object i = i(eventTime);
        return (i == null || (obj = this.f13619o.tag) == null || i == obj) ? false : true;
    }

    private final Object i(AnalyticsListener.EventTime eventTime) {
        Timeline.Window window = new Timeline.Window();
        try {
            eventTime.timeline.getWindow(eventTime.windowIndex, window);
        } catch (Exception unused) {
        }
        return window.tag;
    }

    private final void c(AnalyticsListener.EventTime eventTime, long j) {
        if (c() <= 0 || c() == j) {
            return;
        }
        final C4817bmz c4817bmz = this.l;
        if (c4817bmz == null) {
            c4817bmz = C4817bmz.b.a(eventTime);
        }
        e(c(), new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$maybeCloseOldSession$1
            {
                super(1);
            }

            public final void e(C4771bmF c4771bmF) {
                C8632dsu.c((Object) c4771bmF, "");
                c4771bmF.e(C4817bmz.this);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                e(c4771bmF);
                return dpR.c;
            }
        });
        this.t.remove(c());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(final AnalyticsListener.EventTime eventTime, final MediaLoadData mediaLoadData) {
        C8632dsu.c((Object) eventTime, "");
        C8632dsu.c((Object) mediaLoadData, "");
        if (this.k) {
            return;
        }
        if (h(eventTime)) {
            d.getLogTag();
            this.h.d(i(eventTime), new PdsDelayedEventQueue.d(PdsDelayedEventQueue.EventType.b, mediaLoadData));
            return;
        }
        d.getLogTag();
        a(this, eventTime, false, new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$onDownstreamFormatChanged$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(C4771bmF c4771bmF) {
                C8632dsu.c((Object) c4771bmF, "");
                c4771bmF.d(C4817bmz.b.a(AnalyticsListener.EventTime.this), mediaLoadData);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                a(c4771bmF);
                return dpR.c;
            }
        }, 2, null);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onTracksChanged(final AnalyticsListener.EventTime eventTime, final Tracks tracks) {
        C8632dsu.c((Object) eventTime, "");
        C8632dsu.c((Object) tracks, "");
        if (this.k) {
            return;
        }
        if (h(eventTime)) {
            d.getLogTag();
            this.h.d(i(eventTime), new PdsDelayedEventQueue.d(PdsDelayedEventQueue.EventType.d, tracks));
            return;
        }
        d.getLogTag();
        a(this, eventTime, false, new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$onTracksChanged$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void d(C4771bmF c4771bmF) {
                C8632dsu.c((Object) c4771bmF, "");
                c4771bmF.d(C4817bmz.b.a(AnalyticsListener.EventTime.this), tracks);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                d(c4771bmF);
                return dpR.c;
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4815bmx c4815bmx) {
        C8632dsu.c((Object) c4815bmx, "");
        c4815bmx.i.e();
    }

    @Override // o.C4582bhI
    public void a(AnalyticsListener.EventTime eventTime) {
        C8632dsu.c((Object) eventTime, "");
        if (this.k) {
            return;
        }
        this.f.post(new Runnable() { // from class: o.bmw
            @Override // java.lang.Runnable
            public final void run() {
                C4815bmx.a(C4815bmx.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4815bmx c4815bmx, boolean z) {
        C8632dsu.c((Object) c4815bmx, "");
        c4815bmx.i.d(z);
    }

    @Override // o.C4582bhI
    public void b(AnalyticsListener.EventTime eventTime, final boolean z) {
        C8632dsu.c((Object) eventTime, "");
        if (this.k) {
            return;
        }
        this.f.post(new Runnable() { // from class: o.bmD
            @Override // java.lang.Runnable
            public final void run() {
                C4815bmx.e(C4815bmx.this, z);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        C8632dsu.c((Object) eventTime, "");
        C8632dsu.c((Object) playbackParameters, "");
        boolean z = !(playbackParameters.speed == PlaybackParameters.DEFAULT.speed);
        this.m = z;
        if (z) {
            LongSparseArray<C4771bmF> longSparseArray = this.t;
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                long keyAt = longSparseArray.keyAt(i);
                longSparseArray.valueAt(i);
                e(keyAt, new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$onPlaybackParametersChanged$1$1
                    public final void e(C4771bmF c4771bmF) {
                        C8632dsu.c((Object) c4771bmF, "");
                        c4771bmF.c();
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                        e(c4771bmF);
                        return dpR.c;
                    }
                });
            }
        }
    }

    static /* synthetic */ void a(C4815bmx c4815bmx, AnalyticsListener.EventTime eventTime, boolean z, drM drm, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c4815bmx.c(eventTime, z, drm);
    }

    private final void c(AnalyticsListener.EventTime eventTime, boolean z, drM<? super C4771bmF, dpR> drm) {
        C4771bmF c;
        long a2 = d.a(eventTime);
        if (z && this.t.get(a2) == null && (c = c(eventTime)) != null) {
            this.t.put(a2, c);
        }
        if (a2 > 0) {
            e(a2, drm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, C4771bmF c4771bmF) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) c4771bmF, "");
        drm.invoke(c4771bmF);
    }

    private final void e(long j, final drM<? super C4771bmF, dpR> drm) {
        final C4771bmF c4771bmF = this.t.get(j);
        if (c4771bmF != null) {
            this.f.post(new Runnable() { // from class: o.bmB
                @Override // java.lang.Runnable
                public final void run() {
                    C4815bmx.a(drM.this, c4771bmF);
                }
            });
        }
    }

    private final C4771bmF c(AnalyticsListener.EventTime eventTime) {
        long a2;
        C4726bju e;
        C4680bjA c = C4772bmG.c(eventTime);
        if (c == null || (e = this.j.e((a2 = c.a()))) == null) {
            return null;
        }
        String c2 = this.s.c(a2);
        Context context = this.a;
        C4773bmH c4773bmH = this.i;
        C8632dsu.d((Object) c2);
        return new C4771bmF(context, this, c4773bmH, e, c2, this.p, this.m, this.q, this.b, this.c, this.e.c(a2));
    }

    private final C4817bmz b(AnalyticsListener.EventTime eventTime) {
        SegmentType segmentType;
        AnalyticsListener.EventTime eventTime2;
        C4726bju c4726bju;
        Timeline.Window window = this.f13619o;
        if (window.durationUs > 0) {
            long j = window.presentationStartTimeMs;
            long j2 = j != -9223372036854775807L ? j : 0L;
            long durationMs = window.getDurationMs();
            d.getLogTag();
            Object obj = this.f13619o.tag;
            C4680bjA c4680bjA = obj != null ? (C4680bjA) C9726vo.c(obj, C4680bjA.class) : null;
            if (c4680bjA == null || (segmentType = c4680bjA.c()) == null) {
                segmentType = SegmentType.a;
            }
            SegmentType segmentType2 = segmentType;
            long b2 = c4680bjA != null ? c4680bjA.b() : -1L;
            Object obj2 = this.f13619o.manifest;
            if (obj2 != null) {
                c4726bju = (C4726bju) C9726vo.c(obj2, C4726bju.class);
                eventTime2 = eventTime;
            } else {
                eventTime2 = eventTime;
                c4726bju = null;
            }
            long j3 = eventTime2.realtimeMs;
            Long d2 = c4680bjA != null ? c4680bjA.d() : null;
            Timeline.Window window2 = this.f13619o;
            return new C4817bmz(j3, j2 + durationMs + 1, segmentType2, b2, c4726bju, d2, window2.isDynamic, window2.getDurationMs());
        }
        return null;
    }

    private final long c() {
        Timeline.Window window = this.f13619o;
        Object obj = window != null ? window.tag : null;
        if (obj instanceof C4680bjA) {
            return ((C4680bjA) obj).a();
        }
        return -1L;
    }

    /* renamed from: o.bmx$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("nf_pds");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long a(AnalyticsListener.EventTime eventTime) {
            if (eventTime.timeline.getWindowCount() > 0) {
                try {
                    C4680bjA c = C4772bmG.c(eventTime);
                    if (c != null) {
                        return c.a();
                    }
                } catch (Exception unused) {
                }
            }
            return -1L;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onIsPlayingChanged(final AnalyticsListener.EventTime eventTime, final boolean z) {
        C8632dsu.c((Object) eventTime, "");
        if (this.k) {
            return;
        }
        if (this.n) {
            d.getLogTag();
            return;
        }
        b bVar = d;
        bVar.getLogTag();
        long a2 = bVar.a(eventTime);
        if (z && a2 > 0) {
            c(eventTime, a2);
            g(eventTime);
        }
        a(this, eventTime, false, new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$onIsPlayingChanged$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(C4771bmF c4771bmF) {
                C8632dsu.c((Object) c4771bmF, "");
                c4771bmF.c(C4817bmz.b.a(AnalyticsListener.EventTime.this), z);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                b(c4771bmF);
                return dpR.c;
            }
        }, 2, null);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlaybackStateChanged(final AnalyticsListener.EventTime eventTime, int i) {
        C8632dsu.c((Object) eventTime, "");
        if (this.k) {
            return;
        }
        if (i == 1 || i == 4) {
            b bVar = d;
            bVar.getLogTag();
            long a2 = bVar.a(eventTime);
            if (a2 > 0) {
                e(a2, new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$onPlaybackStateChanged$2
                    {
                        super(1);
                    }

                    public final void e(C4771bmF c4771bmF) {
                        C8632dsu.c((Object) c4771bmF, "");
                        c4771bmF.e(C4817bmz.b.a(AnalyticsListener.EventTime.this));
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                        e(c4771bmF);
                        return dpR.c;
                    }
                });
                this.t.remove(a2);
            }
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPositionDiscontinuity(final AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        C8632dsu.c((Object) eventTime, "");
        C8632dsu.c((Object) positionInfo, "");
        C8632dsu.c((Object) positionInfo2, "");
        if (this.k) {
            return;
        }
        b bVar = d;
        bVar.getLogTag();
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.n = false;
            return;
        }
        final C4817bmz b2 = b(eventTime);
        if (b2 != null) {
            this.l = b2;
            c(eventTime, false, new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$onPositionDiscontinuity$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                    a(c4771bmF);
                    return dpR.c;
                }

                public final void a(C4771bmF c4771bmF) {
                    C8632dsu.c((Object) c4771bmF, "");
                    c4771bmF.b(C4817bmz.this, C4817bmz.b.a(eventTime));
                }
            });
        }
        long a2 = bVar.a(eventTime);
        if (a2 > 0) {
            c(eventTime, a2);
        }
        g(eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        C8632dsu.c((Object) eventTime, "");
        if (this.k) {
            return;
        }
        d.getLogTag();
        final C4817bmz a2 = C4817bmz.b.a(eventTime);
        this.l = a2;
        this.n = true;
        c(eventTime, false, new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$onSeekStarted$2
            {
                super(1);
            }

            public final void a(C4771bmF c4771bmF) {
                C8632dsu.c((Object) c4771bmF, "");
                c4771bmF.a(C4817bmz.this);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                a(c4771bmF);
                return dpR.c;
            }
        });
    }

    @Override // o.C4582bhI
    public void d(final AnalyticsListener.EventTime eventTime) {
        C8632dsu.c((Object) eventTime, "");
        if (this.k) {
            return;
        }
        d.getLogTag();
        c(eventTime, false, new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$onPositionUpdate$2
            {
                super(1);
            }

            public final void a(C4771bmF c4771bmF) {
                C8632dsu.c((Object) c4771bmF, "");
                c4771bmF.d(C4817bmz.b.a(AnalyticsListener.EventTime.this));
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                a(c4771bmF);
                return dpR.c;
            }
        });
    }

    @Override // o.C4582bhI
    public void e(AnalyticsListener.EventTime eventTime, final int i) {
        C8632dsu.c((Object) eventTime, "");
        if (this.k) {
            return;
        }
        d.getLogTag();
        c(eventTime, false, new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$onTextSelectionReasonChanged$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void d(C4771bmF c4771bmF) {
                C8632dsu.c((Object) c4771bmF, "");
                c4771bmF.c(i);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                d(c4771bmF);
                return dpR.c;
            }
        });
    }

    @Override // o.C4582bhI
    public void d(final AnalyticsListener.EventTime eventTime, final long j) {
        C8632dsu.c((Object) eventTime, "");
        if (this.k) {
            return;
        }
        d.getLogTag();
        a(this, eventTime, false, new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$onLiveStreamStartPositionUpdated$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(C4771bmF c4771bmF) {
                C8632dsu.c((Object) c4771bmF, "");
                c4771bmF.b(C4817bmz.b.a(AnalyticsListener.EventTime.this), j);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                b(c4771bmF);
                return dpR.c;
            }
        }, 2, null);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlayerReleased(final AnalyticsListener.EventTime eventTime) {
        C8632dsu.c((Object) eventTime, "");
        this.k = true;
        d.getLogTag();
        LongSparseArray<C4771bmF> longSparseArray = this.t;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            longSparseArray.valueAt(i);
            e(keyAt, new drM<C4771bmF, dpR>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.PdsAnalyticsListener$onPlayerReleased$2$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C4771bmF c4771bmF) {
                    b(c4771bmF);
                    return dpR.c;
                }

                public final void b(C4771bmF c4771bmF) {
                    C8632dsu.c((Object) c4771bmF, "");
                    c4771bmF.e(C4817bmz.b.a(AnalyticsListener.EventTime.this));
                }
            });
        }
        this.t.clear();
    }
}
