package o;

import android.content.Context;
import android.os.Handler;
import android.util.Range;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.dash.DashChunkSource;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.chunk.ChunkSampleStreamFactory;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.AdaptiveStreamingEngineFactory;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o.C4687bjH;
import o.C4688bjI;

/* renamed from: o.bhv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4621bhv {
    protected final Context a;
    protected final InterfaceC4659big b;
    protected final d c;
    protected final C4797bmf d;
    protected final DashChunkSource.Factory e;
    protected final C4691bjL f;
    protected final ExoPlayer g;
    protected final InterfaceC4665bim h;
    protected final C4589bhP i;
    protected final Handler j;
    protected final ChunkSampleStreamFactory k;
    protected final LoadErrorHandlingPolicy l;
    protected final C4886boO m;
    protected final C4585bhL n;

    /* renamed from: o  reason: collision with root package name */
    protected final C4737bkO f13599o;
    private ViewGroup p;
    private final C4601bhb q;
    private C4457beq r;
    private final C4617bhr s;
    private final InterfaceC4657bie t;
    private PlaybackParameters u;
    private final C4617bhr v;
    private final IAsePlayerState.d w;
    private final C4617bhr y;

    public AbstractC4621bhv(Context context, Handler handler, InterfaceC4610bhk interfaceC4610bhk, C4628biB c4628biB, InterfaceC4665bim interfaceC4665bim, C4666bin c4666bin, InterfaceC4657bie interfaceC4657bie, C4886boO c4886boO, InterfaceC4793bmb interfaceC4793bmb, PlaybackExperience playbackExperience, C4589bhP c4589bhP) {
        d dVar = new d();
        this.c = dVar;
        C4601bhb c4601bhb = new C4601bhb();
        this.q = c4601bhb;
        this.j = handler;
        this.t = interfaceC4657bie;
        this.h = interfaceC4665bim;
        this.w = new IAsePlayerState.d(StreamProfileType.i, InterfaceC5038brH.c.b(context).c());
        C4799bmh c4799bmh = new C4799bmh();
        InterfaceC4659big e = AdaptiveStreamingEngineFactory.e(c4628biB, interfaceC4665bim, dVar, c4666bin, interfaceC4657bie, playbackExperience.b().c(), c4799bmh);
        this.b = e;
        c4628biB.c(e.h());
        this.f13599o = e.m();
        ExoPlayer.Builder builder = new ExoPlayer.Builder(context, new C4452bel(context, 0, playbackExperience.d(), playbackExperience.o(), new C4461beu(handler, c4589bhP.b, c4886boO), e.c().d().B(), c4601bhb, false), new DefaultMediaSourceFactory(context), e.m(), e.g(), e.d(), new DefaultAnalyticsCollector(Clock.DEFAULT));
        C4585bhL c4585bhL = new C4585bhL();
        this.n = c4585bhL;
        C4691bjL c4691bjL = new C4691bjL(c4585bhL);
        this.f = c4691bjL;
        builder.setLivePlaybackSpeedControl(c4585bhL);
        builder.setUsePlatformDiagnostics(false);
        ExoPlayer build = builder.build();
        this.g = build;
        C4692bjM c4692bjM = new C4692bjM(e.c(), interfaceC4793bmb, c4886boO);
        build.addListener(c4692bjM);
        this.l = c4692bjM;
        build.setAudioAttributes(new AudioAttributes.Builder().setContentType(3).setAllowedCapturePolicy(3).setUsage(1).build(), true);
        build.setSeekParameters(SeekParameters.PREVIOUS_SYNC);
        C4617bhr c4617bhr = new C4617bhr(1, dVar, interfaceC4610bhk, handler);
        this.s = c4617bhr;
        C4617bhr c4617bhr2 = new C4617bhr(2, dVar, interfaceC4610bhk, handler);
        this.v = c4617bhr2;
        C4617bhr c4617bhr3 = new C4617bhr(3, dVar, interfaceC4610bhk, handler);
        this.y = c4617bhr3;
        this.i = c4589bhP;
        c4589bhP.a(dVar);
        this.m = c4886boO;
        c4628biB.d(c4886boO.c());
        c4799bmh.a(interfaceC4793bmb.d());
        C4797bmf c4797bmf = new C4797bmf(context, e.h(), c4886boO.c(), interfaceC4793bmb, e.a(), interfaceC4665bim, e.j());
        this.d = c4797bmf;
        this.e = new C4687bjH.b(c4797bmf, e.c(), e.d(), c4628biB, interfaceC4610bhk, c4617bhr, c4617bhr2, c4617bhr3, interfaceC4657bie, c4585bhL, c4691bjL);
        this.k = new C4688bjI.a(c4617bhr, c4617bhr2, c4617bhr3);
        build.addListener(c4589bhP);
        build.addListener(dVar);
        build.addListener(c4601bhb);
        build.addListener(c4585bhL);
        build.addAnalyticsListener(c4589bhP);
        a(c4886boO);
        this.a = context;
    }

    public void d(SurfaceView surfaceView) {
        Object[] objArr = new Object[1];
        objArr[0] = surfaceView != null ? Integer.valueOf(surfaceView.hashCode()) : null;
        C1044Mm.a("SessionPlayer", "setSurfaceView %s", objArr);
        if (surfaceView != null) {
            this.g.setVideoSurfaceView(surfaceView);
        } else {
            this.g.setVideoSurfaceView(null);
        }
    }

    public void d(InterfaceC5122bsm interfaceC5122bsm) {
        this.q.a(interfaceC5122bsm);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(C4886boO c4886boO) {
        c4886boO.b(this.b.i());
        c4886boO.d(this.g);
        c4886boO.b(this.c);
        c4886boO.c(this.i);
        c4886boO.b(this.b.b());
        c4886boO.d(this.b.o());
        c4886boO.b(this.b.d());
        c4886boO.b(this.h);
        c4886boO.e(this.b.h());
        c4886boO.a(this.n);
        c4886boO.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(C4726bju c4726bju) {
        int d2;
        this.w.b(c4726bju.n());
        if (!InterfaceC4657bie.e(this.t) || (d2 = this.t.d(c4726bju.n())) <= 0 || d2 >= Integer.MAX_VALUE) {
            return;
        }
        this.w.d(new Range<>(0, Integer.valueOf(d2)));
    }

    public void g() {
        Handler handler = this.j;
        final C4589bhP c4589bhP = this.i;
        Objects.requireNonNull(c4589bhP);
        handler.post(new Runnable() { // from class: o.bhu
            @Override // java.lang.Runnable
            public final void run() {
                C4589bhP.this.d();
            }
        });
        this.g.removeListener(this.i);
        this.b.e();
        this.t.n();
        this.g.release();
    }

    public boolean U_() {
        return this.g.getPlaybackState() == 3 && this.g.getPlayWhenReady();
    }

    public boolean b() {
        return this.g.getPlayWhenReady();
    }

    public void d(String str, int i) {
        this.f13599o.a(str, i);
    }

    public void b(float f) {
        this.g.setVolume(f);
    }

    public float e() {
        return this.g.getVolume();
    }

    public void c(C4582bhI c4582bhI) {
        c4582bhI.d(this.g);
        this.g.addAnalyticsListener(c4582bhI);
    }

    public InterfaceC5299bwD e(ViewGroup viewGroup, InterfaceC5284bvp interfaceC5284bvp, InterfaceC5284bvp interfaceC5284bvp2) {
        if (viewGroup == this.p) {
            return this.r;
        }
        C4457beq c4457beq = this.r;
        if (c4457beq != null) {
            this.g.removeListener(c4457beq);
        }
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C8067ddQ.c();
            C4457beq c4457beq2 = new C4457beq(viewGroup.getContext());
            viewGroup.addView(c4457beq2, layoutParams);
            c4457beq2.b(interfaceC5284bvp, interfaceC5284bvp2);
            this.g.addListener(c4457beq2);
            this.p = viewGroup;
            this.r = c4457beq2;
        } else {
            this.p = null;
            this.r = null;
        }
        return this.r;
    }

    public void a(boolean z) {
        C4457beq c4457beq = this.r;
        if (c4457beq != null) {
            c4457beq.setAccessibilityLiveRegion(z ? 2 : 0);
        }
    }

    public void e(String str, int i) {
        C1044Mm.e("SessionPlayer", "selectSubtitleTrack ID " + str);
        this.f13599o.c(str, i);
    }

    public void b(int i) {
        C4457beq c4457beq = this.r;
        if (c4457beq == null) {
            return;
        }
        c4457beq.setViewType(i);
    }

    public void b(boolean z) {
        C1044Mm.a("SessionPlayer", "setPlayWhenReady [%b].", Boolean.valueOf(z));
        this.g.setPlayWhenReady(z);
    }

    public long d() {
        return Math.max(0L, this.g.getCurrentPosition());
    }

    public void e(long j) {
        this.g.seekTo(j);
    }

    public void f() {
        this.g.setRepeatMode(0);
        this.g.setVolume(0.0f);
        this.g.prepare();
    }

    public void h() {
        this.g.prepare();
    }

    public void d(int i, int i2) {
        this.w.d(new Range<>(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public void d(float f) {
        PlaybackParameters playbackParameters = new PlaybackParameters(f, 1.0f);
        this.u = playbackParameters;
        this.g.setPlaybackParameters(playbackParameters);
    }

    public float c() {
        PlaybackParameters playbackParameters = this.u;
        if (playbackParameters != null) {
            return playbackParameters.speed;
        }
        return 1.0f;
    }

    public void e(List<AbstractC4537bgQ> list) {
        for (int i = 0; i < this.g.getRendererCount(); i++) {
            Renderer renderer = this.g.getRenderer(i);
            if (renderer instanceof C4460bet) {
                Iterator<AbstractC4537bgQ> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        AbstractC4537bgQ next = it.next();
                        if (next.g() && next.h() != null) {
                            C4460bet c4460bet = (C4460bet) renderer;
                            if (next.h().equals(c4460bet.a())) {
                                c4460bet.d(next);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public void b(int i, int i2) {
        this.w.d(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bhv$d */
    /* loaded from: classes3.dex */
    public class d implements IAsePlayerState, Player.Listener {
        boolean c;
        int b = 1;
        PlaybackParameters a = PlaybackParameters.DEFAULT;

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean z, int i) {
            this.c = z;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            this.a = playbackParameters;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i) {
            this.b = i;
        }

        d() {
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public IAsePlayerState.AsePlayerState b() {
            int i = this.b;
            if (i != 2) {
                if (i == 3) {
                    return this.c ? IAsePlayerState.AsePlayerState.ASE_PLAYER_PLAYING : IAsePlayerState.AsePlayerState.ASE_PLAYER_PAUSED;
                } else if (i == 4) {
                    return IAsePlayerState.AsePlayerState.ASE_PLAYER_ENDED;
                } else {
                    return IAsePlayerState.AsePlayerState.ASE_PLAYER_IDLE;
                }
            }
            return IAsePlayerState.AsePlayerState.ASE_PLAYER_BUFFERING;
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public long d() {
            return AbstractC4621bhv.this.g.getCurrentPosition() * 1000;
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public long a(int i) {
            long e;
            if (i == 2) {
                e = AbstractC4621bhv.this.v.e(d());
            } else if (i == 1) {
                e = AbstractC4621bhv.this.s.e(d());
            } else {
                e = i == 3 ? AbstractC4621bhv.this.y.e(d()) : -9223372036854775807L;
            }
            if (e != -9223372036854775807L) {
                return Util.usToMs(e);
            }
            return -9223372036854775807L;
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public long b(int i) {
            if (i == 2) {
                return AbstractC4621bhv.this.v.d(d());
            }
            if (i == 1) {
                return AbstractC4621bhv.this.s.d(d());
            }
            if (i == 3) {
                return AbstractC4621bhv.this.y.d(d());
            }
            return 0L;
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public long d(int i) {
            if (i == 2) {
                return Util.usToMs(AbstractC4621bhv.this.v.e(Long.MIN_VALUE));
            }
            if (i == 1) {
                return Util.usToMs(AbstractC4621bhv.this.s.e(Long.MIN_VALUE));
            }
            if (i == 3) {
                return Util.usToMs(AbstractC4621bhv.this.y.e(Long.MIN_VALUE));
            }
            return 0L;
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public List<IAsePlayerState.a> c(int i) {
            if (i == 2) {
                return AbstractC4621bhv.this.v.a();
            }
            if (i == 1) {
                return AbstractC4621bhv.this.s.a();
            }
            if (i == 3) {
                return AbstractC4621bhv.this.y.a();
            }
            return null;
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public IAsePlayerState.a e(int i) {
            if (i == 2) {
                return AbstractC4621bhv.this.v.c();
            }
            if (i == 1) {
                return AbstractC4621bhv.this.s.c();
            }
            if (i == 3) {
                return AbstractC4621bhv.this.y.c();
            }
            return null;
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public IAsePlayerState.d e() {
            return AbstractC4621bhv.this.w;
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public float c() {
            return this.a.speed;
        }
    }
}
