package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Rational;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.Logger;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.context.MediaPlayer;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.media.PlayerManifestData;
import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.media.Watermark;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import com.netflix.mediaclient.playerui.videoview.NetflixVideoView$loadVideo$5;
import com.netflix.mediaclient.playerui.videoview.NetflixVideoView$resumePlaybackFromSuspend$2;
import com.netflix.mediaclient.playerui.videoview.PlaybackSessionState;
import com.netflix.mediaclient.playerui.videoview.api.PlayerControls;
import com.netflix.mediaclient.playerui.videoview.api.PlayerState;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_DisplayCutoutDisable;
import com.netflix.mediaclient.service.player.common.NetflixCroppingMetadataEntry;
import com.netflix.mediaclient.servicemgr.ExitPipAction;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.util.PlayContext;
import dagger.hilt.android.AndroidEntryPoint;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref;
import o.C1682aKi;
import o.C1888aRz;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.aJY;
import o.dlU;
import o.dpR;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class aJY extends aJW implements PlayerControls, Handler.Callback, IPlaylistControl, InterfaceC5274bvf {
    public static final a a = new a(null);
    private static float b;
    private boolean A;
    private final AtomicBoolean B;
    private final long C;
    private boolean D;
    private PlayContext E;
    private String F;
    private boolean G;
    private boolean H;
    private boolean I;

    /* renamed from: J  reason: collision with root package name */
    private int f13427J;
    private boolean K;
    private long L;
    private C1682aKi.e M;
    private PlaybackSessionState N;
    private PreferredLanguageData O;
    private PlaylistTimestamp P;
    private IPlaylistControl Q;
    private PlayerState R;
    private C1682aKi.c S;
    private String T;
    private InterfaceC5274bvf U;
    private b V;
    private final boolean W;
    private final AtomicBoolean aa;
    private final C1686aKm ab;
    private boolean ac;
    private final Rect ad;
    private Rect ae;
    private aJO af;
    private Subtitle ag;
    private Subtitle[] ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private AbstractC1678aKe al;
    private final c am;
    private C1682aKi.d an;
    private long ao;
    private final boolean ap;
    private AbstractC5100bsQ aq;
    private final C1686aKm ar;
    private Handler at;
    private C1682aKi.f au;
    private final boolean c;
    protected VideoType d;
    private boolean e;
    private long f;
    private long g;
    private Subtitle h;
    private AudioSource[] i;
    private final Runnable j;
    private InterfaceC5085bsB k;
    private String l;
    private AtomicBoolean m;
    private final d n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13428o;
    private aJU p;
    private C1682aKi.a q;
    private ViewGroup r;
    private boolean s;
    private PlaybackExperience t;
    private boolean u;
    private long v;
    private boolean w;
    private AtomicBoolean x;
    private final AtomicBoolean y;
    private C1682aKi.b z;

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ar() {
        boolean z = this.G;
        this.G = false;
        return z;
    }

    private final void d(boolean z) {
        if (z && this.ak) {
            this.ak = false;
        }
    }

    public static final long e() {
        return a.d();
    }

    public static final void setScreenBrightnessValueStart(float f) {
        a.b(f);
    }

    public final PlayerState A() {
        return this.R;
    }

    public C1682aKi.c B() {
        return this.S;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final IPlaylistControl C() {
        return this.Q;
    }

    public final long D() {
        return this.L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final PlaylistTimestamp E() {
        return this.P;
    }

    public final Rect F() {
        return this.ae;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final PreferredLanguageData G() {
        return this.O;
    }

    public final boolean I() {
        return this.ac;
    }

    protected final Handler M() {
        return this.at;
    }

    public final SurfaceView N() {
        return this.al;
    }

    protected final AtomicBoolean O() {
        return this.x;
    }

    public final boolean W() {
        return this.u;
    }

    public boolean Y() {
        return this.A;
    }

    protected void a(long j) {
        this.v = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(IPlaylistControl iPlaylistControl) {
        this.Q = iPlaylistControl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str) {
        this.F = str;
    }

    public final boolean aa() {
        return this.ak;
    }

    protected final boolean ac() {
        return this.D;
    }

    protected final void b(PlaybackSessionState playbackSessionState) {
        C8632dsu.c((Object) playbackSessionState, "");
        this.N = playbackSessionState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(String str) {
        C8632dsu.c((Object) str, "");
        this.T = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(boolean z) {
        this.G = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(PlaylistTimestamp playlistTimestamp) {
        this.P = playlistTimestamp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(InterfaceC5085bsB interfaceC5085bsB) {
        this.k = interfaceC5085bsB;
    }

    protected void d(long j) {
        this.g = j;
    }

    protected final void d(VideoType videoType) {
        C8632dsu.c((Object) videoType, "");
        this.d = videoType;
    }

    protected final void e(boolean z) {
        this.I = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long f() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(long j) {
        this.ao = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InterfaceC5085bsB k() {
        return this.k;
    }

    public C1682aKi.a m() {
        return this.q;
    }

    public final PlaybackExperience p() {
        return this.t;
    }

    protected long q() {
        return this.v;
    }

    public final C1682aKi.b r() {
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean s() {
        return this.s;
    }

    public final void setAudioTrackList(AudioSource[] audioSourceArr) {
        this.i = audioSourceArr;
    }

    public final void setCurrentPlayableUri(String str) {
        this.l = str;
    }

    public void setErrorListener(C1682aKi.a aVar) {
        this.q = aVar;
    }

    public final void setExperience(PlaybackExperience playbackExperience) {
        C8632dsu.c((Object) playbackExperience, "");
        this.t = playbackExperience;
    }

    public final void setLiveWindowListener(C1682aKi.b bVar) {
        this.z = bVar;
    }

    public final void setPausedByUser(boolean z) {
        this.u = z;
    }

    public final void setPlayProgressListener(C1682aKi.e eVar) {
        this.M = eVar;
    }

    public void setPlayerBackgroundable(boolean z) {
        this.e = z;
    }

    public final void setPlayerBackgroundedStatus(boolean z) {
        this.K = z;
    }

    public final void setPlayerId(long j) {
        this.L = j;
    }

    public final void setPlayerState(PlayerState playerState) {
        C8632dsu.c((Object) playerState, "");
        this.R = playerState;
    }

    public void setPlayerStatusChangeListener(C1682aKi.c cVar) {
        this.S = cVar;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public void setSegmentTransitionEndListener(InterfaceC5274bvf interfaceC5274bvf) {
        C8632dsu.c((Object) interfaceC5274bvf, "");
        if (interfaceC5274bvf != this.U) {
            this.U = interfaceC5274bvf;
        }
    }

    public final void setSubtitleTrackList(Subtitle[] subtitleArr) {
        this.ah = subtitleArr;
    }

    public final void setVideoSizeChangedListener(C1682aKi.f fVar) {
        this.au = fVar;
    }

    public void setViewInFocus(boolean z) {
        this.A = z;
    }

    public final boolean u() {
        return this.K;
    }

    public final C1682aKi.e v() {
        return this.M;
    }

    protected final PlaybackSessionState y() {
        return this.N;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aJY(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8632dsu.c((Object) context, "");
        C1888aRz.a aVar = C1888aRz.d;
        this.W = aVar.e().getCellId() == 2;
        C1686aKm c1686aKm = new C1686aKm(context, attributeSet);
        c1686aKm.setId(-1);
        if (aVar.b()) {
            AbstractC1678aKe am = am();
            c1686aKm.addView(am, new FrameLayout.LayoutParams(-1, -1, 17));
            this.al = am;
        }
        this.ar = c1686aKm;
        C1686aKm c1686aKm2 = new C1686aKm(context, attributeSet);
        c1686aKm2.setBackgroundColor(0);
        c1686aKm2.setId(-1);
        this.ab = c1686aKm2;
        addView(c1686aKm, new FrameLayout.LayoutParams(-1, -1, 17));
        addView(c1686aKm2, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f = 500L;
        this.V = new b();
        this.u = !this.aj;
        this.w = true;
        this.ai = true;
        this.y = new AtomicBoolean(false);
        this.B = new AtomicBoolean(false);
        this.x = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.f13427J = 2000;
        this.am = aRC.d.e().c() ? null : new c();
        this.aa = new AtomicBoolean(false);
        this.F = "";
        this.T = "";
        this.D = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dlU.c.a, i, 0);
        C8632dsu.a(obtainStyledAttributes, "");
        this.ap = obtainStyledAttributes.getBoolean(dlU.c.c, true);
        obtainStyledAttributes.recycle();
        this.at = new Handler(Looper.getMainLooper(), this);
        this.N = PlaybackSessionState.e;
        this.af = ap();
        this.C = Logger.INSTANCE.addContext(new MediaPlayer());
        this.j = new Runnable() { // from class: o.aKc
            @Override // java.lang.Runnable
            public final void run() {
                aJY.w(aJY.this);
            }
        };
        this.n = new d();
        PlaybackExperience playbackExperience = PlaybackExperience.a;
        C8632dsu.a(playbackExperience, "");
        this.t = playbackExperience;
        this.R = PlayerState.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aJY(Context context) {
        this(context, null, 0, 0);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aJY(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C8632dsu.c((Object) context, "");
    }

    public float x() {
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            return interfaceC5085bsB.n();
        }
        return 1.0f;
    }

    public void setPlaybackSpeed(float f) {
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB == null) {
            return;
        }
        interfaceC5085bsB.c(Math.min(Math.max(0.5f, f), 2.0f));
    }

    public final Language t() {
        Language h;
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB == null || (h = interfaceC5085bsB.h()) == null) {
            return null;
        }
        return h;
    }

    public final void setLanguage(Language language) {
        InterfaceC5085bsB interfaceC5085bsB;
        if (language == null || (interfaceC5085bsB = this.k) == null) {
            return;
        }
        interfaceC5085bsB.b(language);
    }

    public final boolean V() {
        return this.k != null && this.R == PlayerState.a;
    }

    public final boolean ab() {
        return this.k != null && this.R == PlayerState.f;
    }

    public final boolean R() {
        PlayerManifestData z = z();
        return z != null && (z.isHDR10Profile() || z.isDolbyVisionProfile());
    }

    public final void setShouldBeMuted(boolean z) {
        this.ac = z;
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            interfaceC5085bsB.d(z ? 0.0f : 1.0f);
            at();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void at() {
        InterfaceC5085bsB interfaceC5085bsB;
        Subtitle e;
        Subtitle j;
        if (this.t.c() != PlaybackExperience.SubtitleExperience.FORCED_VISIBLE_ON_MUTE || (interfaceC5085bsB = this.k) == null) {
            return;
        }
        if (interfaceC5085bsB.v()) {
            if ((interfaceC5085bsB.j() == null || ((j = interfaceC5085bsB.j()) != null && j.isForcedNarrativeOrNone())) && (e = aJQ.e(an(), interfaceC5085bsB)) != null) {
                C8632dsu.d(e);
                b(e);
                return;
            }
            return;
        }
        ag();
    }

    public final void setPlayContext(PlayContext playContext) {
        this.E = playContext;
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            interfaceC5085bsB.d(this.t, playContext);
        }
    }

    public final long n() {
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        return interfaceC5085bsB != null ? interfaceC5085bsB.H() : q();
    }

    public final long o() {
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            return interfaceC5085bsB.F();
        }
        return 0L;
    }

    public final long h() {
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            return interfaceC5085bsB.E();
        }
        return 0L;
    }

    public final PlayerManifestData z() {
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            return interfaceC5085bsB.m();
        }
        return null;
    }

    public final Watermark K() {
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            return interfaceC5085bsB.t();
        }
        return null;
    }

    public ByteBuffer e(long j) {
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            return interfaceC5085bsB.e(j);
        }
        return null;
    }

    public final AudioSource g() {
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            return interfaceC5085bsB.g();
        }
        return null;
    }

    public final void setAudioTrack(AudioSource audioSource) {
        InterfaceC5085bsB interfaceC5085bsB;
        if (this.t.a() || !Y() || audioSource == null || (interfaceC5085bsB = this.k) == null) {
            return;
        }
        interfaceC5085bsB.d(audioSource);
    }

    public final boolean U() {
        return this.e && Z();
    }

    public final void ad() {
        b = aJV.e(this);
    }

    public final void af() {
        float e = aJV.e(this);
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            float f = b;
            float f2 = (float) JSONzip.end;
            interfaceC5085bsB.d((int) (f * f2), (int) (e * f2), "player");
        }
    }

    public final Rational L() {
        Rational e = C1685aKl.e(this.ar);
        return e == null ? new Rational(16, 9) : e;
    }

    public final IPlayer.PlaybackType w() {
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        IPlayer.PlaybackType l = interfaceC5085bsB != null ? interfaceC5085bsB.l() : null;
        return l == null ? IPlayer.PlaybackType.Unknown : l;
    }

    public void c(int i, int i2, int i3, int i4) {
        Rect rect = new Rect(i, i2, i3, i4);
        this.ae = rect;
        aJO ajo = this.af;
        if (ajo != null) {
            ajo.e(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final VideoType J() {
        VideoType videoType = this.d;
        if (videoType != null) {
            return videoType;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("NetflixVideoView");
        }

        public final void b(float f) {
            aJY.b = f;
        }

        public final long d() {
            return SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean aw() {
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        return interfaceC5085bsB != null && interfaceC5085bsB.l() == IPlayer.PlaybackType.OfflinePlayback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean as() {
        Context context = getContext();
        C8632dsu.a(context, "");
        return (((Activity) C9737vz.e(context, Activity.class)).getWindow().getAttributes().flags & 1024) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class b implements InterfaceC5097bsN {
        public b() {
        }

        @Override // o.InterfaceC5097bsN
        public boolean b() {
            return aJY.this.f13428o;
        }

        @Override // o.InterfaceC5097bsN
        public void a(PlayerManifestData playerManifestData) {
            Map d;
            Map k;
            Throwable th;
            aJO ajo;
            C8166dfJ.e(null, false, 3, null);
            try {
            } catch (Exception e) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("Failed to start player", e, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
                aJY.this.al();
            }
            if (playerManifestData == null) {
                a aVar = aJY.a;
                aJY.this.al();
            } else if (aJY.this.k() == null) {
                a aVar2 = aJY.a;
                aJY.this.al();
            } else {
                InterfaceC5085bsB k2 = aJY.this.k();
                if (k2 != null) {
                    aJY ajy = aJY.this;
                    if (ajy.ar()) {
                        long H = k2.H();
                        StringBuilder sb = new StringBuilder();
                        sb.append(H);
                        LocalBroadcastManager.getInstance(ajy.getContext()).sendBroadcast(C5103bsT.e("com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_STARTED", sb.toString(), k2.l(), ajy.J(), ajy.f(), ajy.p().b()));
                        ajy.e(true);
                    }
                    if ((playerManifestData.isHDR10Profile() || playerManifestData.isDolbyVisionProfile()) && (ajo = ajy.af) != null) {
                        ajo.c(k2);
                    }
                    if (ajy.y() == PlaybackSessionState.a) {
                        float f = ajy.I() ? 0.0f : 1.0f;
                        InterfaceC5085bsB k3 = ajy.k();
                        if (k3 != null) {
                            k3.d(f);
                        }
                        if (ajy.ac()) {
                            ajy.at();
                        }
                        ajy.setSubtitleVisibility(ajy.ai);
                        ajy.b(PlayerState.c);
                        ajy.M().sendEmptyMessage(1);
                        ajy.f13427J = playerManifestData.getGopMaxSizeInMs();
                    } else {
                        a aVar3 = aJY.a;
                        ajy.al();
                    }
                    ajy.setSubtitleVisibility(ajy.ai);
                    ajy.b(PlayerState.c);
                    ajy.M().sendEmptyMessage(1);
                    ajy.f13427J = playerManifestData.getGopMaxSizeInMs();
                }
                if (aJY.this.y() != PlaybackSessionState.a) {
                    a aVar4 = aJY.a;
                    aJY.this.al();
                }
            }
        }

        @Override // o.InterfaceC5097bsN
        public void d(long j) {
            if (Long.valueOf(j).equals(Long.valueOf(aJY.this.n()))) {
                aJY.this.ay();
                aJY.this.b(PlayerState.e);
                aJY.a.getLogTag();
                aJY.this.H = true;
                aJY.this.af = null;
                aJY.this.setImportantForAccessibility(4);
            }
        }

        @Override // o.InterfaceC5097bsN
        public void i() {
            aJV.a(aJY.this);
            aJY.this.aa.set(true);
            C8166dfJ.e(null, false, 3, null);
            aJY.this.setImportantForAccessibility(1);
            if (aJY.this.k() == null || aJY.this.y() != PlaybackSessionState.a) {
                aJY.this.b(PlayerState.d);
                C1682aKi.a m = aJY.this.m();
                if (m != null) {
                    m.d(new C4614bho("Playback start failed", "3.5", null));
                }
                aJY.this.al();
            } else if (!aJY.this.Y()) {
                aJY.this.au();
            } else {
                aJY ajy = aJY.this;
                ajy.setSubtitleVisibility(ajy.ai);
                float f = aJY.this.I() ? 0.0f : 1.0f;
                InterfaceC5085bsB k = aJY.this.k();
                if (k != null) {
                    k.d(f);
                }
                String str = aJY.this.aw() ? "Offline" : "Streaming";
                C1044Mm.a(str + " playback started");
                aJY.this.aA();
                if (aJY.this.p().l()) {
                    aJY.this.av();
                }
                aJY.this.b(PlayerState.f);
                if (aQF.d.a() && (aJY.this.p() instanceof C5124bso)) {
                    Context applicationContext = aJY.this.getContext().getApplicationContext();
                    AudioSource g = aJY.this.g();
                    String valueOf = g != null ? Integer.valueOf(g.getNumChannels()) : "";
                    C8054ddD.a(applicationContext, "channels updated:" + valueOf, 0);
                }
            }
        }

        @Override // o.InterfaceC5097bsN
        public void c() {
            aJY.this.b(PlayerState.i);
        }

        @Override // o.InterfaceC5097bsN
        public void d(IPlayer.c cVar) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) cVar, "");
            C1680aKg.a.d(aJY.this);
            if (aJY.this.y.get()) {
                InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                String str = "Playback error happens after playback ends. Error code: " + cVar.b();
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd(str, null, null, false, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                    return;
                } else {
                    dVar.e().b(c1596aHd, th);
                    return;
                }
            }
            e(cVar);
        }

        private final void e(IPlayer.c cVar) {
            aJY.a.getLogTag();
            aJY.this.ay();
            aJY.this.b(PlayerState.d);
            C1682aKi.a m = aJY.this.m();
            if (m != null) {
                m.d(cVar);
            }
        }

        @Override // o.InterfaceC5097bsN
        public void d() {
            aJY.a.getLogTag();
            aJY.this.b(PlaybackSessionState.e);
            aJY.this.b(PlayerState.b);
            aJY.this.az();
            InterfaceC5085bsB k = aJY.this.k();
            if (k != null) {
                k.e(aJY.this.V);
            }
            aJY.this.f13428o = false;
            aJY.this.c((InterfaceC5085bsB) null);
            aJY.this.O().set(false);
            if (aJY.this.af != null) {
                aJY.this.af = null;
            }
            Logger.INSTANCE.removeContext(Long.valueOf(aJY.this.C));
        }

        @Override // o.InterfaceC5097bsN
        public void e() {
            aJY.this.b(PlayerState.a);
        }

        @Override // o.InterfaceC5097bsN
        public void j() {
            aJY.a.getLogTag();
            C1682aKi.d dVar = aJY.this.an;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // o.InterfaceC5097bsN
        public void e(long j) {
            aJY.a.getLogTag();
            InterfaceC5085bsB k = aJY.this.k();
            if (k != null) {
                long F = k.F();
                C1682aKi.e v = aJY.this.v();
                if (v != null) {
                    v.e(F);
                }
            }
            C1682aKi.b r = aJY.this.r();
            if (r != null) {
                r.e(j);
            }
        }

        @Override // o.InterfaceC5097bsN
        public void d(C5086bsC c5086bsC) {
            C8632dsu.c((Object) c5086bsC, "");
            aJY.a.getLogTag();
            C1682aKi.b r = aJY.this.r();
            if (r != null) {
                r.e(c5086bsC);
            }
        }

        @Override // o.InterfaceC5097bsN
        public void a() {
            AbstractC1678aKe abstractC1678aKe;
            aJY.a.getLogTag();
            if (!C8054ddD.f() && (abstractC1678aKe = aJY.this.al) != null) {
                abstractC1678aKe.setVisibility(8);
            }
            C1680aKg.a.d(aJY.this);
            aJY.this.ay();
            aJY.this.setPlayerState(PlayerState.b);
        }

        @Override // o.InterfaceC5097bsN
        public void b(int i) {
            aJY.a.getLogTag();
            aJY.this.at();
        }
    }

    public final void ah() {
        az();
        aJO ajo = this.af;
        if (ajo != null) {
            ajo.b(null);
        }
        aJO ap = ap();
        this.af = ap;
        if (ap != null) {
            ap.e(this.ae);
        }
        aJO ajo2 = this.af;
        if (ajo2 != null) {
            ajo2.b(this.k);
        }
    }

    public boolean c(long j, AbstractC5100bsQ abstractC5100bsQ, String str, VideoType videoType, PlaybackExperience playbackExperience, PlayContext playContext, PlaylistTimestamp playlistTimestamp, boolean z, String str2, String str3, boolean z2) {
        C8632dsu.c((Object) abstractC5100bsQ, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playbackExperience, "");
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) playlistTimestamp, "");
        C8632dsu.c((Object) str2, "");
        if (playbackExperience instanceof C5118bsi) {
            return a(j, abstractC5100bsQ, str, videoType, playbackExperience, playContext, playlistTimestamp, z, str2, str3, z2);
        }
        a aVar = a;
        aVar.getLogTag();
        this.F = str3;
        this.T = str2;
        this.ao = j;
        if (this.x.get()) {
            if (C8632dsu.c((Object) str, (Object) String.valueOf(n())) || C8632dsu.c((Object) str, (Object) this.l)) {
                aVar.getLogTag();
            } else {
                aVar.getLogTag();
            }
            return false;
        }
        if (Uri.parse(str).getScheme() != null) {
            this.l = str;
        } else {
            a(C8168dfL.f(str));
        }
        if (e(abstractC5100bsQ, videoType, playbackExperience, playContext, z, z2)) {
            d(playlistTimestamp.e);
            this.P = playlistTimestamp;
            return P();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean e(AbstractC5100bsQ abstractC5100bsQ, VideoType videoType, PlaybackExperience playbackExperience, PlayContext playContext, boolean z, boolean z2) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) abstractC5100bsQ, "");
        C8632dsu.c((Object) playbackExperience, "");
        if (this.af == null) {
            aJO ap = ap();
            this.af = ap;
            if (ap != null) {
                ap.e(this.ae);
            }
        }
        if (videoType == null || playContext == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("attachPlaybackSession videoType=" + videoType + " playContext=" + playContext + " group=" + abstractC5100bsQ, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
                return false;
            }
            dVar.e().b(c1596aHd, th);
            return false;
        }
        this.aq = abstractC5100bsQ;
        this.t = playbackExperience;
        setPlayContext(playContext);
        this.w = z;
        this.N = PlaybackSessionState.e;
        d(videoType);
        this.D = z2;
        return true;
    }

    public final void c(long j) {
        this.f = Math.min(Math.max(32L, j), 500L);
    }

    protected void e(int i, int i2, NetflixCroppingMetadataEntry netflixCroppingMetadataEntry) {
        C1682aKi.f fVar;
        if (netflixCroppingMetadataEntry == null || netflixCroppingMetadataEntry.c() <= 0 || (fVar = this.au) == null) {
            return;
        }
        fVar.b(netflixCroppingMetadataEntry.b(), netflixCroppingMetadataEntry.c());
    }

    @Override // com.netflix.mediaclient.playerui.videoview.api.PlayerControls
    public void d(PlayerControls.PlayerPauseType playerPauseType) {
        C8632dsu.c((Object) playerPauseType, "");
        if (playerPauseType == PlayerControls.PlayerPauseType.c) {
            this.aj = true;
        }
        au();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void au() {
        if (this.k == null || !ab()) {
            return;
        }
        a.getLogTag();
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            interfaceC5085bsB.y();
        }
        az();
        ay();
        b(PlayerState.a);
    }

    public void ak() {
        if (this.K) {
            ax();
        } else {
            aB();
        }
    }

    private final void aB() {
        if (Y()) {
            if (this.y.get()) {
                a.getLogTag();
                return;
            } else if (this.k == null) {
                a.getLogTag();
                return;
            } else if (this.al != null) {
                a.getLogTag();
                InterfaceC5085bsB interfaceC5085bsB = this.k;
                if (interfaceC5085bsB != null) {
                    interfaceC5085bsB.C();
                }
                aA();
                return;
            } else {
                a.getLogTag();
                return;
            }
        }
        a.getLogTag();
    }

    public void b(long j) {
        long e;
        this.aj = false;
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            if (this.R.a()) {
                b(PlayerState.j);
                e = C8657dts.e(0L, j);
                interfaceC5085bsB.b(e);
                return;
            }
            a.getLogTag();
        }
    }

    public void setSubtitleTrack(Subtitle subtitle, boolean z) {
        InterfaceC5085bsB interfaceC5085bsB;
        this.h = subtitle;
        if (subtitle == null) {
            if (Y() && (interfaceC5085bsB = this.k) != null) {
                interfaceC5085bsB.d(this.h, z);
            }
            this.af = null;
            return;
        }
        az();
        this.aa.set(false);
        if (this.k != null && Y()) {
            ah();
            InterfaceC5085bsB interfaceC5085bsB2 = this.k;
            if (interfaceC5085bsB2 != null) {
                interfaceC5085bsB2.d(this.h, z);
            }
            setSubtitleVisibility(this.ai);
        } else {
            a.getLogTag();
        }
        aA();
        d(z);
    }

    public void setZoom(boolean z) {
        C9702vQ.a(this, 1.0f);
        c(z);
        this.ar.setResizeMode(z ? 4 : 0);
    }

    public final void d() {
        setErrorListener(null);
        this.M = null;
        setPlayerStatusChangeListener(null);
        this.au = null;
        this.an = null;
    }

    private final void c(boolean z) {
        if (Config_FastProperty_DisplayCutoutDisable.Companion.a()) {
            Context context = getContext();
            C8632dsu.a(context, "");
            Window window = ((Activity) C9737vz.e(context, Activity.class)).getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT >= 28) {
                if (z && as()) {
                    attributes.layoutInDisplayCutoutMode = 1;
                } else {
                    attributes.layoutInDisplayCutoutMode = 0;
                }
                window.setAttributes(attributes);
            }
        }
    }

    private final String an() {
        String str = this.T;
        if (str == null || str.length() == 0) {
            String m = this.t.m();
            C8632dsu.d((Object) m);
            return m;
        }
        return this.T;
    }

    public final void setSubtitleVisibility(boolean z) {
        aJO ajo;
        this.ai = z;
        if (this.t.c() == PlaybackExperience.SubtitleExperience.DISABLED) {
            this.ai = false;
            a.getLogTag();
        }
        if (this.af == null || !Y() || (ajo = this.af) == null) {
            return;
        }
        ajo.a(Boolean.valueOf(this.ai));
    }

    public final void b(Rect rect) {
        C8632dsu.c((Object) rect, "");
        C1685aKl.e(this.ar, rect);
    }

    private final AbstractC1678aKe am() {
        Context context = getContext();
        C8632dsu.a(context, "");
        return new SurfaceHolder$CallbackC1684aKk(context, this.am);
    }

    public final boolean Q() {
        if (this.al != null) {
            this.B.set(true);
        }
        if (!this.W) {
            this.ar.removeAllViewsInLayout();
        }
        if (this.al == null) {
            AbstractC1678aKe am = am();
            this.al = am;
            C1680aKg c1680aKg = C1680aKg.a;
            C5167bte b2 = this.t.b();
            C8632dsu.a(b2, "");
            c1680aKg.a(this, am, b2);
        }
        if (this.m.get()) {
            this.x.set(true);
        }
        AbstractC1678aKe abstractC1678aKe = this.al;
        if (abstractC1678aKe != null) {
            C8632dsu.d(abstractC1678aKe);
            if (e(abstractC1678aKe)) {
                aj();
                return true;
            }
            return false;
        }
        return false;
    }

    private final boolean e(AbstractC1678aKe abstractC1678aKe) {
        boolean b2;
        c(abstractC1678aKe);
        b2 = C8576dqs.b(C9703vR.e(this.ar), abstractC1678aKe);
        if (b2) {
            b(abstractC1678aKe);
            return true;
        }
        this.ar.addView(abstractC1678aKe, new FrameLayout.LayoutParams(-1, -1, 17));
        if (aRC.d.e().c()) {
            b(abstractC1678aKe);
            return true;
        }
        return true;
    }

    private final void c(AbstractC1678aKe abstractC1678aKe) {
        if (this.t.h() && !C8067ddQ.c()) {
            abstractC1678aKe.setSecure(true);
        } else {
            abstractC1678aKe.setSecure(false);
        }
    }

    private final void aj() {
        if (this.ap && ao() == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            this.r = new RelativeLayout(getContext());
            Rect rect = this.ad;
            if (rect != null) {
                layoutParams.setMargins(rect.left, rect.top, rect.right, rect.bottom);
            }
            addView(ao(), layoutParams);
        }
        if (this.c && this.p == null) {
            aJU aju = new aJU(getContext());
            this.p = aju;
            addView(aju);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        AbstractC1678aKe abstractC1678aKe = this.al;
        if (abstractC1678aKe == null) {
            return;
        }
        abstractC1678aKe.setVisibility(i);
    }

    static /* synthetic */ boolean b(aJY ajy, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return ajy.a(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadVideo");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        aJU aju;
        C8632dsu.c((Object) message, "");
        int i = message.what;
        if (i == 1) {
            requestLayout();
            return true;
        } else if (i == 2) {
            InterfaceC5085bsB interfaceC5085bsB = this.k;
            if (interfaceC5085bsB != null) {
                if (this.c && (aju = this.p) != null) {
                    aju.e(interfaceC5085bsB);
                }
                if (ab()) {
                    this.at.sendEmptyMessageDelayed(2, 500L);
                }
                return true;
            }
            a.getLogTag();
            return false;
        } else if (i != 3) {
            return false;
        } else {
            InterfaceC5085bsB interfaceC5085bsB2 = this.k;
            if (interfaceC5085bsB2 == null) {
                a.getLogTag();
                return false;
            } else if (interfaceC5085bsB2 != null) {
                long F = interfaceC5085bsB2.F();
                if (ab() && F >= 0) {
                    C1682aKi.e eVar = this.M;
                    if (eVar != null) {
                        eVar.e(F);
                    }
                    this.at.sendEmptyMessageDelayed(3, this.f);
                }
                return true;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(PlayerState playerState) {
        C1682aKi.c B;
        C8632dsu.c((Object) playerState, "");
        if (this.R != playerState) {
            this.R = playerState;
            if (!playerState.e() || (B = B()) == null) {
                return;
            }
            B.a(this.R);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC5122bsm {
        d() {
        }

        @Override // o.InterfaceC5122bsm
        public void e(int i, int i2, int i3, int i4) {
            float f = i;
            float f2 = i2;
            float f3 = f / f2;
            aJY.this.ar.setCropRatio(f / i3, f2 / i4);
            aJY.this.ar.setAspectRatio(f3);
            aJY.this.ab.setAspectRatio(f3);
        }
    }

    /* loaded from: classes3.dex */
    public final class c implements InterfaceC1679aKf {
        public c() {
        }

        @Override // o.InterfaceC1679aKf
        public void c(AbstractC1678aKe abstractC1678aKe) {
            C8632dsu.c((Object) abstractC1678aKe, "");
            aJY.this.b(abstractC1678aKe);
        }

        @Override // o.InterfaceC1679aKf
        public void e(AbstractC1678aKe abstractC1678aKe, int i, int i2, NetflixCroppingMetadataEntry netflixCroppingMetadataEntry) {
            C8632dsu.c((Object) abstractC1678aKe, "");
            aJY.a.getLogTag();
            InterfaceC5085bsB k = aJY.this.k();
            if (k != null) {
                k.a(i, i2, aJY.this.as());
            }
            aJY.this.M().sendEmptyMessage(1);
            aJY.this.ah();
            aJY.this.aA();
            aJY.this.e(i, i2, netflixCroppingMetadataEntry);
        }

        @Override // o.InterfaceC1679aKf
        public void b(AbstractC1678aKe abstractC1678aKe) {
            C8632dsu.c((Object) abstractC1678aKe, "");
            aJY.a.getLogTag();
            InterfaceC5085bsB k = aJY.this.k();
            if (k != null) {
                k.u();
            }
            aJY.this.ai();
        }
    }

    private final void ax() {
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            this.K = false;
            interfaceC5085bsB.c(false, false);
            return;
        }
        NetflixVideoView$resumePlaybackFromSuspend$2 netflixVideoView$resumePlaybackFromSuspend$2 = new drO<dpR>() { // from class: com.netflix.mediaclient.playerui.videoview.NetflixVideoView$resumePlaybackFromSuspend$2
            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }

            public final void d() {
                aJY.a.getLogTag();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ai() {
        InterfaceC5085bsB interfaceC5085bsB;
        this.y.set(true);
        if (!this.t.o() && (interfaceC5085bsB = this.k) != null) {
            interfaceC5085bsB.y();
        }
        if (U()) {
            this.K = true;
            InterfaceC5085bsB interfaceC5085bsB2 = this.k;
            if (interfaceC5085bsB2 != null) {
                interfaceC5085bsB2.c(true, C8153dex.h());
            }
        } else {
            a.getLogTag();
            j();
        }
        this.y.set(false);
    }

    public InterfaceC5085bsB c(long j, InterfaceC5097bsN interfaceC5097bsN, AbstractC5100bsQ abstractC5100bsQ, PlaybackExperience playbackExperience, PlayContext playContext, boolean z, String str) {
        C8632dsu.c((Object) interfaceC5097bsN, "");
        C8632dsu.c((Object) abstractC5100bsQ, "");
        C8632dsu.c((Object) playbackExperience, "");
        C8632dsu.c((Object) playContext, "");
        long f = f();
        a aVar = a;
        aVar.getLogTag();
        if (f < 0) {
            aVar.getLogTag();
            f = 0;
        }
        return InterfaceC4360bcz.b.a().e(j, interfaceC5097bsN, abstractC5100bsQ, playbackExperience, n(), playContext, 1000 * f, z, this.s, str, this.O);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean P() {
        InterfaceC5085bsB interfaceC5085bsB;
        this.y.set(false);
        this.m.set(true);
        if (this.H && (interfaceC5085bsB = this.k) != null) {
            this.N = PlaybackSessionState.a;
            this.H = false;
            if (interfaceC5085bsB != null) {
                interfaceC5085bsB.b(0L);
                InterfaceC5085bsB interfaceC5085bsB2 = this.k;
                if (interfaceC5085bsB2 != null) {
                    AbstractC1678aKe abstractC1678aKe = this.al;
                    if (abstractC1678aKe != null) {
                        interfaceC5085bsB2.a(abstractC1678aKe);
                        aJO ajo = this.af;
                        if (ajo != null) {
                            ajo.b(this.k);
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.H = false;
        if (aF()) {
            this.x.set(true);
            if ((this.al != null || Q()) && !this.N.d() && b(this, false, 1, null)) {
                this.N = PlaybackSessionState.a;
                InterfaceC5085bsB interfaceC5085bsB3 = this.k;
                if (interfaceC5085bsB3 != null) {
                    AbstractC1678aKe abstractC1678aKe2 = this.al;
                    if (abstractC1678aKe2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    interfaceC5085bsB3.a(abstractC1678aKe2);
                }
                return true;
            }
            return false;
        }
        return Q();
    }

    private final void b(Subtitle subtitle) {
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            this.ak = true;
            this.ag = interfaceC5085bsB.j();
            setSubtitleTrack(subtitle, false);
            a(subtitle);
            this.aa.set(true);
            String languageCodeBcp47 = subtitle.getLanguageCodeBcp47();
            int trackType = subtitle.getTrackType();
            aJT.d(languageCodeBcp47, Integer.valueOf(trackType), CommandValue.MuteCommand);
        }
    }

    private final void a(Subtitle subtitle) {
        Language t = t();
        if (t != null) {
            t.setSelectedSubtitle(subtitle);
        }
        Language t2 = t();
        if (t2 != null) {
            t2.commit();
        }
    }

    private final aJO ap() {
        aJO ajo = this.af;
        if (ajo == null) {
            return new aJO(this.ab);
        }
        C8632dsu.d(ajo);
        return ajo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aA() {
        this.at.sendEmptyMessage(2);
        this.at.sendEmptyMessage(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void az() {
        this.at.removeMessages(2);
        this.at.removeMessages(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void av() {
        setKeepScreenOn(true);
        this.at.removeCallbacks(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ay() {
        this.at.postDelayed(this.j, 120000L);
    }

    public final boolean T() {
        return this.R == PlayerState.b;
    }

    public final boolean X() {
        return !S();
    }

    public final boolean S() {
        return this.t instanceof C5118bsi;
    }

    public final void ag() {
        Subtitle j;
        Subtitle j2;
        if (this.ak) {
            InterfaceC5085bsB interfaceC5085bsB = this.k;
            Integer num = null;
            String languageCodeBcp47 = (interfaceC5085bsB == null || (j2 = interfaceC5085bsB.j()) == null) ? null : j2.getLanguageCodeBcp47();
            InterfaceC5085bsB interfaceC5085bsB2 = this.k;
            if (interfaceC5085bsB2 != null && (j = interfaceC5085bsB2.j()) != null) {
                num = Integer.valueOf(j.getTrackType());
            }
            aJT.d(languageCodeBcp47, num, CommandValue.UnmuteCommand);
            this.ak = false;
            setSubtitleTrack(this.ag, false);
            a(this.ag);
            this.aa.set(true);
        }
    }

    private final boolean aF() {
        return this.t.o();
    }

    public final boolean Z() {
        PlayerState playerState = this.R;
        return playerState == PlayerState.f || playerState == PlayerState.a;
    }

    private final boolean aq() {
        InterfaceC5085bsB interfaceC5085bsB;
        if (this.Q == null && (interfaceC5085bsB = this.k) != null) {
            this.Q = interfaceC5085bsB != null ? interfaceC5085bsB.s() : null;
        }
        return this.Q != null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public PlaylistMap<?> H() {
        if (aq()) {
            IPlaylistControl iPlaylistControl = this.Q;
            C8632dsu.d(iPlaylistControl);
            return iPlaylistControl.H();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public boolean d(PlaylistMap<?> playlistMap) {
        C8632dsu.c((Object) playlistMap, "");
        if (aq()) {
            IPlaylistControl iPlaylistControl = this.Q;
            C8632dsu.d(iPlaylistControl);
            if (iPlaylistControl.d(playlistMap)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public boolean d(String str, String str2) {
        C8632dsu.c((Object) str, "");
        if (aq()) {
            IPlaylistControl iPlaylistControl = this.Q;
            C8632dsu.d(iPlaylistControl);
            return iPlaylistControl.d(str, str2);
        }
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public PlaylistTimestamp l() {
        if (aq()) {
            IPlaylistControl iPlaylistControl = this.Q;
            C8632dsu.d(iPlaylistControl);
            return iPlaylistControl.l();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public void d(PlaylistTimestamp playlistTimestamp) {
        C8632dsu.c((Object) playlistTimestamp, "");
        if (aq()) {
            IPlaylistControl iPlaylistControl = this.Q;
            C8632dsu.d(iPlaylistControl);
            iPlaylistControl.d(playlistTimestamp);
        }
    }

    @Override // o.InterfaceC5274bvf
    public void e(final String str, final PlaylistTimestamp playlistTimestamp) {
        C8632dsu.c((Object) playlistTimestamp, "");
        this.at.post(new Runnable() { // from class: o.aKa
            @Override // java.lang.Runnable
            public final void run() {
                aJY.e(aJY.this, str, playlistTimestamp);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(aJY ajy, String str, PlaylistTimestamp playlistTimestamp) {
        C8632dsu.c((Object) ajy, "");
        C8632dsu.c((Object) playlistTimestamp, "");
        InterfaceC5274bvf interfaceC5274bvf = ajy.U;
        if (interfaceC5274bvf != null) {
            interfaceC5274bvf.e(str, playlistTimestamp);
        }
    }

    private final ViewGroup ao() {
        if (this.r != null) {
            a.getLogTag();
        }
        return this.r;
    }

    private final boolean a(long j, AbstractC5100bsQ abstractC5100bsQ, String str, VideoType videoType, PlaybackExperience playbackExperience, PlayContext playContext, PlaylistTimestamp playlistTimestamp, boolean z, String str2, String str3, boolean z2) {
        a.getLogTag();
        a(C8168dfL.f(str));
        this.Q = null;
        this.F = str3;
        this.ao = j;
        if (e(abstractC5100bsQ, videoType, playbackExperience, playContext, z, z2)) {
            this.T = str2;
            this.P = playlistTimestamp;
            return P();
        }
        return false;
    }

    public void j() {
        InterfaceC5085bsB interfaceC5085bsB;
        InterfaceC5085bsB interfaceC5085bsB2;
        a.getLogTag();
        this.aj = false;
        this.y.set(true);
        this.m.set(false);
        setKeepScreenOn(false);
        this.at.removeCallbacks(this.j);
        if (this.k != null) {
            az();
            if (!this.t.o() && (interfaceC5085bsB2 = this.k) != null) {
                interfaceC5085bsB2.y();
            }
            InterfaceC5085bsB interfaceC5085bsB3 = this.k;
            if (interfaceC5085bsB3 != null) {
                interfaceC5085bsB3.e(this.V);
            }
            if (this.t.f() && (interfaceC5085bsB = this.k) != null) {
                interfaceC5085bsB.d();
            }
            aJO ajo = this.af;
            if (ajo != null) {
                ajo.b(null);
            }
            if (this.I) {
                this.I = false;
                InterfaceC5085bsB interfaceC5085bsB4 = this.k;
                if (interfaceC5085bsB4 != null) {
                    long H = interfaceC5085bsB4.H();
                    StringBuilder sb = new StringBuilder();
                    sb.append(H);
                    String sb2 = sb.toString();
                    InterfaceC5085bsB interfaceC5085bsB5 = this.k;
                    if (interfaceC5085bsB5 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    LocalBroadcastManager.getInstance(getContext()).sendBroadcast(C5103bsT.e("com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_ENDED", sb2, interfaceC5085bsB5.l(), J(), o(), this.t.b()));
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
        }
        this.N = PlaybackSessionState.e;
        if (!this.W) {
            AbstractC1678aKe abstractC1678aKe = this.al;
            if (abstractC1678aKe != null) {
                abstractC1678aKe.c();
            }
            this.al = null;
        }
        this.f13428o = false;
        this.k = null;
        b(PlayerState.b);
        this.x.set(false);
        if (this.af != null) {
            this.af = null;
        }
    }

    public void ae() {
        a.getLogTag();
        j();
        if (!this.W) {
            this.ar.removeAllViewsInLayout();
        }
        this.ab.removeAllViewsInLayout();
    }

    public void i() {
        a.getLogTag();
        aJV.c(this);
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            interfaceC5085bsB.D();
        }
    }

    public void a(ExitPipAction exitPipAction) {
        a.getLogTag();
        aJV.a(this);
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            interfaceC5085bsB.a(exitPipAction);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [o.bsB, T] */
    private final boolean a(boolean z) {
        AbstractC5100bsQ abstractC5100bsQ;
        Map d2;
        Map k;
        Throwable th;
        InterfaceC5085bsB interfaceC5085bsB;
        a aVar = a;
        aVar.getLogTag();
        if (Y() && (abstractC5100bsQ = this.aq) != null && abstractC5100bsQ.d()) {
            C8160dfD.c(this.E);
            if (aF() || this.al != null) {
                try {
                    long j = this.ao;
                    b bVar = this.V;
                    AbstractC5100bsQ abstractC5100bsQ2 = this.aq;
                    if (abstractC5100bsQ2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    PlaybackExperience playbackExperience = this.t;
                    PlayContext playContext = this.E;
                    C8632dsu.d(playContext);
                    InterfaceC5085bsB c2 = c(j, bVar, abstractC5100bsQ2, playbackExperience, playContext, this.w, this.F);
                    this.k = c2;
                    this.ao = -1L;
                    if (c2 != null) {
                        this.L = c2.k();
                    }
                    this.x.set(false);
                    InterfaceC5085bsB interfaceC5085bsB2 = this.k;
                    if (interfaceC5085bsB2 != null) {
                        C8632dsu.d(interfaceC5085bsB2);
                        ((InterfaceC5169btg) interfaceC5085bsB2).a(this.n);
                        if (this.t.o()) {
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            objectRef.d = this.k;
                            Context context = getContext();
                            C8632dsu.a(context, "");
                            ((ComponentActivity) C9737vz.e(context, ComponentActivity.class)).getLifecycle().addObserver(new NetflixVideoView$loadVideo$5(objectRef, this));
                        }
                        if (!aF() && (interfaceC5085bsB = this.k) != null) {
                            interfaceC5085bsB.a(this.al);
                        }
                        PlayerManifestData z2 = z();
                        if (z2 != null) {
                            z2.getVideoProfileTag();
                            aVar.getLogTag();
                        }
                        if (this.af == null) {
                            aVar.getLogTag();
                            this.af = ap();
                        }
                        aJO ajo = this.af;
                        if (ajo != null) {
                            ajo.b(this.k);
                        }
                        aJO ajo2 = this.af;
                        if (ajo2 != null) {
                            ajo2.e(this.ae);
                        }
                        this.f13428o = true;
                        this.N = PlaybackSessionState.a;
                        if (z) {
                            this.G = true;
                        }
                        if (ar()) {
                            InterfaceC5085bsB interfaceC5085bsB3 = this.k;
                            if (interfaceC5085bsB3 != null) {
                                long H = interfaceC5085bsB3.H();
                                StringBuilder sb = new StringBuilder();
                                sb.append(H);
                                String sb2 = sb.toString();
                                InterfaceC5085bsB interfaceC5085bsB4 = this.k;
                                if (interfaceC5085bsB4 == null) {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                                LocalBroadcastManager.getInstance(getContext()).sendBroadcast(C5103bsT.e("com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_STARTED", sb2, interfaceC5085bsB4.l(), J(), f(), this.t.b()));
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        this.I = true;
                        this.N = PlaybackSessionState.b;
                        return true;
                    }
                    aVar.getLogTag();
                    return false;
                } catch (IllegalStateException e) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd("Cannot open playback session.", e, null, false, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            String c3 = errorType.c();
                            c1596aHd.a(c3 + " " + b2);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        Throwable th2 = c1596aHd.i;
                        if (th2 == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        } else {
                            th = th2;
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar.a();
                    if (a2 != null) {
                        a2.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                    return false;
                }
            }
            aVar.getLogTag();
            return false;
        }
        aVar.getLogTag();
        al();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void al() {
        a.getLogTag();
        this.N = PlaybackSessionState.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(AbstractC1678aKe abstractC1678aKe) {
        a aVar = a;
        aVar.getLogTag();
        C1680aKg.a.b(this, abstractC1678aKe);
        if (this.B.getAndSet(false)) {
            this.x.set(true);
            this.m.set(true);
        }
        this.al = abstractC1678aKe;
        if (!Y()) {
            aVar.getLogTag();
            return;
        }
        aVar.getLogTag();
        abstractC1678aKe.setVisibility(0);
        aVar.getLogTag();
        if ((!aF() || this.k == null) && this.m.get() && !this.N.d() && b(this, false, 1, null)) {
            this.N = PlaybackSessionState.a;
        }
        if (this.k == null) {
            aVar.getLogTag();
        }
        InterfaceC5085bsB interfaceC5085bsB = this.k;
        if (interfaceC5085bsB != null) {
            interfaceC5085bsB.w();
        }
        if (this.K) {
            aJV.a(this);
            this.y.set(false);
            if (this.aj) {
                return;
            }
            ax();
            this.K = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(aJY ajy) {
        C8632dsu.c((Object) ajy, "");
        a.getLogTag();
        ajy.setKeepScreenOn(false);
    }
}
