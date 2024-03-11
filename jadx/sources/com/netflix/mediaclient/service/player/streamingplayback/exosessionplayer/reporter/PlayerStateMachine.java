package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.common.collect.UnmodifiableIterator;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.PlayerStateMachine;
import com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import o.C1044Mm;
import o.C4680bjA;
import o.C4831bnM;
import o.C4974bpx;
import o.C8187dfe;
import o.aQV;

/* loaded from: classes3.dex */
public class PlayerStateMachine {
    private a e;
    private ExoPlayer g;
    private final Handler i;
    private final long m;
    private a s;
    private boolean u;
    private final List<b> k = new CopyOnWriteArrayList();
    private final Map<Long, String> B = new HashMap();
    private Format d = null;
    private Format r = null;
    private Format c = null;
    private Format t = null;
    private final C4831bnM x = new C4831bnM();
    private C4831bnM w = new C4831bnM();
    private State n = State.INITIALIZING;
    private int q = 1;
    private boolean l = false;
    private boolean p = false;

    /* renamed from: o  reason: collision with root package name */
    private long f13225o = -9223372036854775807L;
    private long f = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private Timeline.Window a = new Timeline.Window();
    private Player.Listener j = new Player.Listener() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.PlayerStateMachine.1
        @Override // androidx.media3.common.Player.Listener
        public void onTimelineChanged(Timeline timeline, int i) {
            PlayerStateMachine.this.e("timelineChanged");
            PlayerStateMachine.this.c(false);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRenderedFirstFrame() {
            C1044Mm.b("nf_playreport", "onRenderedFirstFrame()");
            PlayerStateMachine.this.e("renderedFrame");
            PlayerStateMachine.this.p = true;
            if (PlayerStateMachine.this.l && PlayerStateMachine.this.q == 3) {
                PlayerStateMachine.this.c(State.PLAYING);
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTracksChanged(Tracks tracks) {
            Format trackFormat;
            C1044Mm.d("nf_playreport", "onTracksChanged(%s)", tracks);
            PlayerStateMachine.this.e("tracksChanged");
            UnmodifiableIterator<Tracks.Group> it = tracks.getGroups().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Tracks.Group next = it.next();
                if (next.isSelected() && next.length > 0 && (trackFormat = next.getTrackFormat(0)) != null) {
                    int type = next.getType();
                    if (type != 1) {
                        if (type == 3) {
                            if (!trackFormat.equals(PlayerStateMachine.this.d)) {
                                PlayerStateMachine.this.f13225o = SystemClock.elapsedRealtime();
                                PlayerStateMachine playerStateMachine = PlayerStateMachine.this;
                                playerStateMachine.r = playerStateMachine.d;
                                PlayerStateMachine.this.d = trackFormat;
                            }
                            z = true;
                        }
                    } else if (!trackFormat.equals(PlayerStateMachine.this.c)) {
                        if (PlayerStateMachine.this.c != null) {
                            PlayerStateMachine.this.f = SystemClock.elapsedRealtime();
                        }
                        PlayerStateMachine playerStateMachine2 = PlayerStateMachine.this;
                        playerStateMachine2.t = playerStateMachine2.c;
                        PlayerStateMachine.this.c = trackFormat;
                    }
                }
            }
            if (z || PlayerStateMachine.this.d == null) {
                return;
            }
            PlayerStateMachine.this.f13225o = SystemClock.elapsedRealtime();
            PlayerStateMachine playerStateMachine3 = PlayerStateMachine.this;
            playerStateMachine3.r = playerStateMachine3.d;
            PlayerStateMachine.this.d = null;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerStateChanged(boolean z, int i) {
            C1044Mm.d("nf_playreport", "onPlayerStateChanged(%s %s)", Boolean.valueOf(z), Integer.valueOf(i));
            PlayerStateMachine.this.e(i + ":" + z);
            int i2 = PlayerStateMachine.this.q;
            PlayerStateMachine.this.q = i;
            boolean z2 = false;
            if (i2 == 1 && i != 1) {
                PlayerStateMachine.this.c(false);
            } else if (z && i == 2 && PlayerStateMachine.this.c(true)) {
                PlayerStateMachine.this.p = false;
            }
            PlayerStateMachine.this.l = z;
            PlayerStateMachine.this.i.removeCallbacks(PlayerStateMachine.this.v);
            if (i != 1) {
                if (i == 2) {
                    if (PlayerStateMachine.this.u) {
                        PlayerStateMachine.this.u = false;
                        PlayerStateMachine.this.i.removeCallbacks(PlayerStateMachine.this.y);
                        PlayerStateMachine.this.c(State.TRANSITIONING_SEGMENT);
                        return;
                    } else if (z) {
                        boolean z3 = PlayerStateMachine.this.f != -9223372036854775807L && SystemClock.elapsedRealtime() - PlayerStateMachine.this.f < 2000;
                        boolean z4 = PlayerStateMachine.this.f13225o != -9223372036854775807L && SystemClock.elapsedRealtime() - PlayerStateMachine.this.f13225o < 2000;
                        boolean z5 = PlayerStateMachine.this.h != -9223372036854775807L && SystemClock.elapsedRealtime() - PlayerStateMachine.this.h < 2000;
                        if (!z3 && !z4 && !z5) {
                            z2 = true;
                        }
                        if (z3) {
                            PlayerStateMachine.this.c(State.AUDIO);
                        }
                        if (z4) {
                            PlayerStateMachine.this.c(State.TIMEDTEXT);
                        }
                        if (z5) {
                            PlayerStateMachine.this.i.postDelayed(PlayerStateMachine.this.v, 2000L);
                            return;
                        } else if (z2) {
                            PlayerStateMachine.this.c(State.REBUFFERING);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        PlayerStateMachine.this.c(State.PAUSED);
                        return;
                    }
                } else if (i == 3) {
                    if (z) {
                        PlayerStateMachine.this.c(State.PLAYING);
                        return;
                    } else {
                        PlayerStateMachine.this.c(State.PAUSED);
                        return;
                    }
                } else if (i != 4) {
                    return;
                }
            }
            PlayerStateMachine.this.c(State.PAUSED);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(PlaybackException playbackException) {
            C1044Mm.d("nf_playreport", "onPlayerError(%s)", playbackException.toString());
            if (PlayerStateMachine.c(playbackException)) {
                C1044Mm.d("nf_playreport", "onPlayerError(release timeout) - ignoring", playbackException.toString());
                return;
            }
            C4974bpx b2 = ErrorCodeUtils.b(playbackException);
            for (b bVar : PlayerStateMachine.this.k) {
                bVar.d(b2);
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            C1044Mm.b("nf_playreport", "onPositionDiscontinuity()");
            PlayerStateMachine playerStateMachine = PlayerStateMachine.this;
            playerStateMachine.e("positionDiscontinuity " + i);
            PlayerStateMachine.this.c(false);
            if (PlayerStateMachine.this.l && PlayerStateMachine.this.q == 3) {
                PlayerStateMachine.this.c(State.PLAYING);
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            for (b bVar : PlayerStateMachine.this.k) {
                bVar.b(playbackParameters.speed);
            }
        }
    };
    private final AnalyticsListener b = new AnalyticsListener() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.PlayerStateMachine.4
        @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
        public void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
            C1044Mm.a("nf_playreport", "onVideoDecoderReleased %s", str);
            PlayerStateMachine.this.p = false;
        }
    };
    private final Runnable y = new Runnable() { // from class: o.bnq
        @Override // java.lang.Runnable
        public final void run() {
            PlayerStateMachine.this.j();
        }
    };
    private final Runnable v = new Runnable() { // from class: o.bnn
        @Override // java.lang.Runnable
        public final void run() {
            PlayerStateMachine.this.m();
        }
    };

    /* loaded from: classes3.dex */
    public enum State {
        INITIALIZING,
        PLAYING,
        REBUFFERING,
        PAUSED,
        SEEKING,
        SKIPPING,
        TRANSITIONING_SEGMENT,
        TIMEDTEXT,
        AUDIO;

        public boolean a() {
            return this == INITIALIZING || this == REBUFFERING || this == SEEKING || this == SKIPPING || this == AUDIO || this == TRANSITIONING_SEGMENT;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(C4680bjA c4680bjA, C4680bjA c4680bjA2, long j);

        void b(float f);

        void b(C4680bjA c4680bjA, long j, C4680bjA c4680bjA2);

        void d(State state, State state2);

        void d(C4974bpx c4974bpx);
    }

    public Format b(int i) {
        if (i != 1) {
            if (i != 3) {
                return null;
            }
            return this.d;
        }
        return this.c;
    }

    public State b() {
        return this.n;
    }

    public Timeline.Window c() {
        return this.a;
    }

    public Format e(int i) {
        if (i != 1) {
            if (i != 3) {
                return null;
            }
            return this.r;
        }
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(PlaybackException playbackException) {
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            return exoPlaybackException.errorCode == 1003 && (exoPlaybackException.getUnexpectedException() instanceof ExoTimeoutException) && ((ExoTimeoutException) exoPlaybackException.getUnexpectedException()).timeoutOperation == 1;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.u = false;
        for (b bVar : this.k) {
            bVar.a(this.s.a, this.e.a, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        C1044Mm.e("nf_playreport", "seek rebuffer debounce");
        this.j.onPlayerStateChanged(this.l, this.q);
    }

    public PlayerStateMachine(Handler handler, long j) {
        this.i = handler;
        this.m = j;
    }

    public void d(b bVar) {
        this.k.add(bVar);
    }

    public void d(ExoPlayer exoPlayer) {
        this.g = exoPlayer;
        exoPlayer.addListener(this.j);
        if (aQV.c()) {
            exoPlayer.addAnalyticsListener(this.b);
        }
        this.q = exoPlayer.getPlaybackState();
        c(false);
    }

    public void h() {
        if (this.g != null) {
            C8187dfe.c(new Runnable() { // from class: o.bnr
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerStateMachine.this.k();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.g.removeListener(this.j);
        if (aQV.c()) {
            this.g.removeAnalyticsListener(this.b);
        }
    }

    public C4680bjA a() {
        a aVar = this.e;
        if (aVar == null) {
            return null;
        }
        return aVar.a;
    }

    public boolean f() {
        return b() == State.PAUSED;
    }

    public long e() {
        return this.w.c();
    }

    public void g() {
        e("startedSeek");
        this.h = SystemClock.elapsedRealtime();
        c(State.SEEKING);
    }

    public void i() {
        e("transitionRequested");
        this.u = true;
        C1044Mm.a("nf_playreport", "onTransitionSeek mRenderedFirstFrame=false");
        this.p = false;
    }

    public Map<Long, String> d() {
        HashMap hashMap;
        synchronized (this.B) {
            hashMap = new HashMap(this.B);
        }
        return hashMap;
    }

    private a a(boolean z) {
        int nextWindowIndex;
        if (this.q == 1) {
            return null;
        }
        Timeline currentTimeline = this.g.getCurrentTimeline();
        int currentWindowIndex = this.g.getCurrentWindowIndex();
        if (currentTimeline == null || currentTimeline.getWindowCount() <= currentWindowIndex) {
            return null;
        }
        this.g.getCurrentTimeline().getWindow(currentWindowIndex, this.a);
        if (z) {
            if (this.a.getDurationMs() - this.g.getCurrentPosition() <= (this.a.getDurationMs() >= 5000 ? 1000L : 250L) && (nextWindowIndex = currentTimeline.getNextWindowIndex(currentWindowIndex, 0, true)) != -1 && currentTimeline.getWindowCount() > nextWindowIndex) {
                C1044Mm.a("nf_playreport", "detected rebuffer immediately before segment transition - starting segment transition early");
                this.g.getCurrentTimeline().getWindow(nextWindowIndex, this.a);
            }
        }
        Timeline.Window window = this.a;
        Object obj = window.tag;
        if (obj instanceof C4680bjA) {
            return new a((C4680bjA) obj, C.usToMs(window.durationUs));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(boolean z) {
        boolean z2;
        a a2 = a(z);
        a aVar = this.e;
        if (aVar == null) {
            if (a2 != null) {
                z2 = true;
            }
            z2 = false;
        } else {
            if (a2 != null) {
                z2 = !aVar.a.equals(a2.a);
            }
            z2 = false;
        }
        if (z2) {
            if (this.e != null && c(a2)) {
                e("segmentTransition");
                C1044Mm.d("nf_playreport", "detected transition from %s -> %s", this.e, a2);
                if (this.n != State.INITIALIZING || this.e.b() != a2.b()) {
                    this.u = true;
                    for (b bVar : this.k) {
                        a aVar2 = this.e;
                        bVar.b(aVar2.a, aVar2.b, a2.a);
                    }
                }
                State state = this.n;
                if (state != State.INITIALIZING && state != State.TRANSITIONING_SEGMENT) {
                    this.i.postDelayed(this.y, 500L);
                }
            }
            this.s = this.e;
        }
        if (a2 != null) {
            this.e = a2;
        }
        return z2;
    }

    private boolean o() {
        return c(this.e);
    }

    private boolean c(a aVar) {
        return aVar == null || this.m == -1 || aVar.b() == this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(State state) {
        a aVar;
        if (b(state)) {
            State state2 = this.n;
            if (state != state2) {
                C1044Mm.a("nf_playreport", "setState(%s -> %s)", state2, state);
                e("switchTo " + state.ordinal());
                if (this.n == State.SEEKING && state == State.PLAYING) {
                    this.h = SystemClock.elapsedRealtime();
                }
                if (this.n == State.TRANSITIONING_SEGMENT && state == State.PLAYING && this.s != null && this.e != null) {
                    this.i.removeCallbacks(this.y);
                    for (b bVar : this.k) {
                        bVar.a(this.s.a, this.e.a, this.w.c());
                    }
                }
                if (this.n == State.INITIALIZING && state == State.PLAYING && (aVar = this.s) != null && this.e != null && aVar.b() != this.e.b()) {
                    this.i.removeCallbacks(this.y);
                    for (b bVar2 : this.k) {
                        bVar2.a(this.s.a, this.e.a, -9223372036854775807L);
                    }
                }
                for (b bVar3 : this.k) {
                    bVar3.d(this.n, state);
                }
                if (state == State.SEEKING) {
                    C1044Mm.e("nf_playreport", "seeking makes mRenderedFirstFrame=false");
                    this.p = false;
                }
                this.w = new C4831bnM();
                this.n = state;
            } else if (state == State.SEEKING) {
                this.w = new C4831bnM();
            }
        }
    }

    private boolean b(State state) {
        if (!o()) {
            C1044Mm.d("nf_playreport", "setState(%s -> %s) , ignored for segment %s", this.n, state, this.e);
            return false;
        }
        State state2 = this.n;
        State state3 = State.INITIALIZING;
        if (state2 == state3 && state != State.PLAYING) {
            C1044Mm.d("nf_playreport", "setState(%s -> %s) - invalid transition (init). ignoring", state2, state);
            return false;
        } else if (state2 == state3 && !this.p) {
            C1044Mm.d("nf_playreport", "setState(%s -> %s) - invalid transition (init without video). ignoring", state2, state);
            return false;
        } else {
            State state4 = State.SEEKING;
            if (state2 == state4 && !this.p) {
                C1044Mm.d("nf_playreport", "setState(%s -> %s) - spurious transition (seek). ignoring", state2, state);
                return false;
            }
            State state5 = State.TRANSITIONING_SEGMENT;
            if (state2 == state5 && !this.p) {
                C1044Mm.d("nf_playreport", "setState(%s -> %s) - spurious transition (segment transition). ignoring", state2, state);
                return false;
            }
            State state6 = State.AUDIO;
            if (state2 == state6 && state == State.REBUFFERING) {
                C1044Mm.d("nf_playreport", "setState(%s -> %s) - info loss transition (audio). ignoring", state2, state);
                return false;
            }
            State state7 = State.TIMEDTEXT;
            if (state2 == state7 && state == State.REBUFFERING) {
                C1044Mm.d("nf_playreport", "setState(%s -> %s) - info loss transition (timed text). ignoring", state2, state);
                return false;
            } else if (state2 == state4 && state == State.REBUFFERING) {
                C1044Mm.d("nf_playreport", "setState(%s -> %s) - info loss transition (seek). ignoring", state2, state);
                return false;
            } else if (state2.a() && (state == state6 || state == state7)) {
                C1044Mm.d("nf_playreport", "setState(%s -> %s) - additional rebuffer reason (language switch). ignoring", this.n, state);
                return false;
            } else {
                State state8 = this.n;
                if (state8 == state5 && state == State.REBUFFERING) {
                    C1044Mm.d("nf_playreport", "setState(%s -> %s) - info loss transition (segment transition). ignoring", state8, state);
                    return false;
                } else if (state8 == state4 && state == State.PAUSED) {
                    C1044Mm.d("nf_playreport", "setState(%s -> %s) - info loss transition (seek). ignoring", state8, state);
                    return false;
                } else if (state8 == state6 && state == State.PAUSED) {
                    C1044Mm.d("nf_playreport", "setState(%s -> %s) - info loss transition (audio). ignoring", state8, state);
                    return false;
                } else if (state8 == state7 && state == State.PAUSED) {
                    C1044Mm.d("nf_playreport", "setState(%s -> %s) - info loss transition (timed text). ignoring", state8, state);
                    return false;
                } else if (state8 == State.PAUSED && state == State.REBUFFERING) {
                    C1044Mm.d("nf_playreport", "setState(%s -> %s) - invalid transition (paused). ignoring", state8, state);
                    return false;
                } else {
                    return true;
                }
            }
        }
    }

    public void e(String str) {
        synchronized (this.B) {
            long c = this.x.c();
            while (this.B.containsKey(Long.valueOf(c))) {
                c++;
            }
            this.B.put(Long.valueOf(c), str);
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public final C4680bjA a;
        public final long b;

        public a(C4680bjA c4680bjA, long j) {
            this.a = c4680bjA;
            this.b = j;
        }

        public long b() {
            return this.a.a();
        }

        public String toString() {
            return this.a.toString();
        }
    }
}
