package o;

import android.os.Handler;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.common.collect.UnmodifiableIterator;
import com.netflix.mediaclient.event.IStreamPresenting;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.Event;
import com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: o.bhP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4589bhP implements Player.Listener, AnalyticsListener, InterfaceC1658aJl {
    private static final C4680bjA d = new C4680bjA(-1, "uninitialized_segment", -1, SegmentType.a, null);
    protected final Handler a;
    InterfaceC4610bhk b;
    private ExoPlayer c;
    private DecoderCounters f;
    private C4831bnM g;
    private String i;
    private IAsePlayerState j;
    private String k;
    private final PriorityTaskManager l;
    private Format m;

    /* renamed from: o  reason: collision with root package name */
    private DecoderCounters f13597o;
    private c p;
    private InterfaceC5274bvf v;
    private String q = "uninitialized_playlist";
    private ArrayList<C4655bic> r = new ArrayList<>();
    private int s = Integer.MIN_VALUE;
    private C4680bjA n = d;
    private int t = 1;
    private final Runnable e = new Runnable() { // from class: o.bhP.5
        @Override // java.lang.Runnable
        public void run() {
            C4589bhP.this.b.a();
        }
    };
    private final Runnable x = new Runnable() { // from class: o.bhR
        @Override // java.lang.Runnable
        public final void run() {
            C4589bhP.this.h();
        }
    };
    private final Map<Long, JSONObject> h = null;

    /* renamed from: o.bhP$c */
    /* loaded from: classes3.dex */
    public interface c {
        void a();

        void a(int i);
    }

    public DecoderCounters a() {
        return this.f13597o;
    }

    public void a(IAsePlayerState iAsePlayerState) {
        this.j = iAsePlayerState;
    }

    @Override // o.InterfaceC1658aJl
    public void a(AbstractC1660aJn abstractC1660aJn) {
    }

    public String b() {
        return this.i;
    }

    public void b(ExoPlayer exoPlayer) {
        this.c = exoPlayer;
    }

    public String c() {
        return this.k;
    }

    public void c(InterfaceC5274bvf interfaceC5274bvf) {
        this.v = interfaceC5274bvf;
    }

    public DecoderCounters e() {
        return this.f;
    }

    public void e(c cVar) {
        this.p = cVar;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        this.f = decoderCounters;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        this.f13597o = decoderCounters;
    }

    public C4589bhP(Handler handler, InterfaceC4610bhk interfaceC4610bhk, PriorityTaskManager priorityTaskManager) {
        this.b = interfaceC4610bhk;
        this.l = priorityTaskManager;
        this.a = handler;
    }

    public void d(PlaylistMap playlistMap) {
        this.q = playlistMap.b();
    }

    public void c(C4655bic c4655bic) {
        synchronized (this.r) {
            this.r.add(c4655bic);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public void onTimelineChanged(Timeline timeline, int i) {
        C1044Mm.a("PlaylistEvent", "onTimelineChanged %s / %d", f(), Integer.valueOf(timeline.getWindowCount()));
        c cVar = this.p;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPositionDiscontinuity(int i) {
        C1044Mm.a("PlaylistEvent", "onPositionDiscontinuity %s", f());
        if (this.s >= 0) {
            i();
        }
    }

    private void i() {
        ExoPlayer exoPlayer = this.c;
        if (exoPlayer != null) {
            int currentWindowIndex = exoPlayer.getCurrentWindowIndex();
            C4680bjA b = b(currentWindowIndex);
            if (currentWindowIndex != this.s || !b.equals(this.n)) {
                C1044Mm.a("PlaylistEvent", "segment changed (%d, %s) -> (%d, %s), segment transition completed.", Integer.valueOf(this.s), this.n.e(), Integer.valueOf(currentWindowIndex), b.e());
                C4680bjA c4680bjA = this.n;
                this.s = currentWindowIndex;
                this.n = b;
                if (this.v != null) {
                    long contentPosition = this.c.getContentPosition();
                    String str = this.q;
                    String e = b.e();
                    if (contentPosition < 0) {
                        contentPosition = 0;
                    }
                    PlaylistTimestamp playlistTimestamp = new PlaylistTimestamp(str, e, contentPosition);
                    C1044Mm.a("PlaylistEvent", "onTransitionComplete %s", playlistTimestamp);
                    this.v.e(c4680bjA == d ? null : c4680bjA.e(), playlistTimestamp);
                }
                if (c4680bjA != d && c4680bjA.b() != this.n.b()) {
                    this.b.c();
                }
                synchronized (this.r) {
                    Iterator<C4655bic> it = this.r.iterator();
                    while (it.hasNext()) {
                        it.next().a();
                    }
                }
            }
            h();
        }
    }

    private C4680bjA b(int i) {
        C4680bjA c4680bjA = d;
        Timeline currentTimeline = this.c.getCurrentTimeline();
        if (i < 0 || currentTimeline.getWindowCount() <= i) {
            return c4680bjA;
        }
        Object obj = this.c.getCurrentTimeline().getWindow(i, new Timeline.Window()).tag;
        return obj instanceof C4680bjA ? (C4680bjA) obj : c4680bjA;
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerStateChanged(boolean z, int i) {
        C1044Mm.a("PlaylistEvent", "onPlayerStateChanged [%s] state [%d] %b", f(), Integer.valueOf(i), Boolean.valueOf(z));
        if (this.g != null) {
            this.g = null;
        }
        if (i != 2) {
            k();
        }
        if (i == 2) {
            IAsePlayerState iAsePlayerState = this.j;
            if (iAsePlayerState != null) {
                long a = iAsePlayerState.a(2);
                long a2 = this.j.a(1);
                long a3 = this.j.a(3);
                long min = Math.min(a, a2);
                if (a3 >= 0) {
                    min = Math.min(min, a3);
                }
                boolean z2 = min < 2000;
                C1044Mm.a("PlaylistEvent", "onPlayerStateChanged  => buffer duration %d [A : %d, V : %d] reportBufferingToUI : %b", Long.valueOf(min), Long.valueOf(a2), Long.valueOf(a), Boolean.valueOf(z2));
                if (!z2) {
                    g();
                }
            }
            this.b.a();
        } else if (i != 3) {
            if (i == 4) {
                this.b.b();
            }
        } else if (z) {
            C1044Mm.e("PlaylistEvent", "playerStarted");
            this.g = new C4831bnM();
            this.b.e();
        } else {
            this.b.d();
        }
        if (this.s < 0 && z && i == 3) {
            i();
        }
        c cVar = this.p;
        if (cVar != null) {
            cVar.a(i);
        }
        if (this.t != i && i == 1) {
            this.b.i();
        }
        this.t = i;
    }

    public void d() {
        this.a.removeCallbacks(this.x);
        PriorityTaskManager priorityTaskManager = this.l;
        if (priorityTaskManager != null) {
            synchronized (priorityTaskManager) {
                this.l.remove(0);
            }
        }
    }

    private String f() {
        if (this.c != null) {
            return "windowIndex = " + this.c.getCurrentWindowIndex();
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d5, code lost:
        if (r14 <= r8) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d7, code lost:
        o.C1044Mm.a("PlaylistEvent", "schedule segment end event process after %d", java.lang.Long.valueOf(r14));
        r20.a.removeCallbacks(r20.x);
        r20.a.postDelayed(r20.x, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f4, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4589bhP.h():void");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
        C1044Mm.e("PlaylistEvent", "onVideoDecoderInitialized " + str);
        this.b.c(Event.f);
        this.k = str;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        this.b.c(Event.g);
        C1044Mm.e("PlaylistEvent", "onRenderedFirstFrame");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
        C1044Mm.e("PlaylistEvent", "onAudioDecoderInitialized " + str);
        this.i = str;
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerError(PlaybackException playbackException) {
        this.b.d(new C4614bho(ErrorCodeUtils.b(playbackException)));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onLoadingChanged(boolean z) {
        PriorityTaskManager priorityTaskManager = this.l;
        if (priorityTaskManager != null) {
            synchronized (priorityTaskManager) {
                if (z) {
                    this.l.add(0);
                } else {
                    this.l.remove(0);
                }
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public void onTracksChanged(Tracks tracks) {
        UnmodifiableIterator<Tracks.Group> it = tracks.getGroups().iterator();
        Format format = null;
        while (it.hasNext()) {
            Tracks.Group next = it.next();
            if (next.isSelected() && next.getType() == 3) {
                format = next.getTrackFormat(0);
            }
        }
        if (Objects.equals(format, this.m)) {
            return;
        }
        this.m = format;
        this.b.a(new C4622bhw(IStreamPresenting.StreamType.TIMED_TEXT, format != null ? format.id : null));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
        this.b.e(i, j);
    }

    private void g() {
        this.a.postDelayed(this.e, 250L);
    }

    private void k() {
        this.a.removeCallbacks(this.e);
    }
}
