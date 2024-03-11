package o;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.collection.ArraySet;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.event.IStreamPresenting;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.media.LanguageChoice;
import com.netflix.mediaclient.media.PlaybackMetadataImpl;
import com.netflix.mediaclient.media.PlayerManifestData;
import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.media.Watermark;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyInitialRequestSize;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_forceAllowPip;
import com.netflix.mediaclient.service.error.crypto.ErrorSource;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.Event;
import com.netflix.mediaclient.service.player.streamingplayback.exostreaming.PlaybackSessionCallbackManager;
import com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.StopReason;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ExitPipAction;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.PlayContext;
import java.nio.ByteBuffer;
import java.util.List;
import o.AbstractC4918bou;
import o.C4898boa;
import o.InterfaceC4610bhk;
import o.InterfaceC4776bmK;

/* renamed from: o.bou  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4918bou implements InterfaceC5085bsB, C4898boa.d, InterfaceC5169btg {
    protected static InterfaceC4776bmK.b d;
    protected final C4638biL A;
    protected C4588bhO B;
    protected final String C;
    PreferredLanguageData D;
    private final long E;
    protected boolean H;
    protected final Handler I;

    /* renamed from: J  reason: collision with root package name */
    private PlayContext f13625J;
    private boolean K;
    private IStreamPresenting L;
    private boolean M;
    private boolean N;
    private final UserAgent O;
    private C4543bgW Q;
    private PlayerManifestData R;
    private final InterfaceC4607bhh S;
    protected final C4908bok a;
    protected final PlaybackSessionCallbackManager b;
    protected final C4910bom c;
    protected aOV e;
    protected final Context h;
    protected final C4624bhy i;
    protected final InterfaceC4665bim k;
    protected int l;
    protected boolean n;

    /* renamed from: o  reason: collision with root package name */
    protected final C4628biB f13626o;
    protected final InterfaceC4873boB p;
    protected Handler q;
    protected final C4880boI r;
    protected final C4678biz s;
    protected final C4666bin t;
    protected PlaybackExperience v;
    protected final C4886boO w;
    protected C4592bhS x;
    protected long z;
    private String F = "GenericPlaybackSession";
    protected IPlayer.PlaybackType y = null;
    protected final PlaybackMetadataImpl u = null;
    protected final LongSparseArray<AudioSource> g = new LongSparseArray<>();
    protected final LongSparseArray<Subtitle> j = new LongSparseArray<>();
    protected final LongSparseArray<Subtitle> m = new LongSparseArray<>();
    protected final LongSparseArray<Language> f = new LongSparseArray<>();
    protected final InterfaceC4610bhk G = new AnonymousClass4();

    public static InterfaceC4776bmK.b a() {
        return d;
    }

    protected boolean a(IPlayer.c cVar) {
        return false;
    }

    public boolean b() {
        return true;
    }

    @Override // o.InterfaceC5085bsB
    public long k() {
        return 1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PlayContext o() {
        return this.f13625J;
    }

    @Override // o.InterfaceC5085bsB
    public IPlaylistControl s() {
        return this.x;
    }

    @Override // o.InterfaceC5085bsB
    public boolean x() {
        return this.M;
    }

    public AbstractC4918bou(C4875boD c4875boD) {
        PlayContext g;
        this.F += hashCode();
        long d2 = C8170dfN.d();
        this.E = d2;
        Context a = c4875boD.a();
        this.h = a;
        this.q = c4875boD.h();
        this.v = c4875boD.c();
        this.S = c4875boD.n();
        this.O = c4875boD.r();
        this.e = c4875boD.b();
        String d3 = C8193dfk.d();
        this.C = d3;
        C4678biz c4678biz = new C4678biz();
        this.s = c4678biz;
        this.t = new C4666bin();
        AseConfig b = c4875boD.e().b(StreamProfileType.c, "Default");
        C4628biB c4628biB = new C4628biB(a, c4875boD.j(), c4678biz);
        this.f13626o = c4628biB;
        c4628biB.b(ConfigFastPropertyInitialRequestSize.useAseConfig() ? b.bh() : ConfigFastPropertyInitialRequestSize.requestSize());
        C4638biL c4638biL = new C4638biL(a, Looper.myLooper(), c4628biB, c4875boD.j(), c4875boD.e().h() * 2);
        this.A = c4638biL;
        boolean z = false;
        this.k = new C4676bix(c4638biL, new C4627biA(a, c4628biB, c4875boD.j(), c4875boD.k()));
        this.i = new C4624bhy();
        C4880boI c4880boI = new C4880boI();
        this.r = c4880boI;
        Handler handler = new Handler(c4875boD.p());
        this.I = handler;
        this.b = new PlaybackSessionCallbackManager(this.q);
        this.n = c4875boD.q();
        this.D = c4875boD.l();
        C4886boO c4886boO = new C4886boO(a, c4875boD, null, d3, this.v.b().c(), c4880boI, d2);
        this.w = c4886boO;
        this.f13625J = c4875boD.g();
        c4886boO.o(g.getTrackId());
        c4875boD.e().c();
        this.c = new C4910bom(c4886boO, k());
        this.a = new C4908bok(a, handler, c4875boD.m(), new InterfaceC4325bcQ() { // from class: o.boy
            @Override // o.InterfaceC4325bcQ
            public final void d(long j, long j2) {
                AbstractC4918bou.this.e(j, j2);
            }
        });
        this.p = c4875boD.f();
        if (this.v.i()) {
            this.Q = new C4538bgR(a, c4875boD.i(), c4875boD.o()).e(this);
        }
        this.K = (Config_FastProperty_forceAllowPip.isEnabled() || C8159dfC.f(a)) ? true : z;
        C4898boa.b(a).b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(long j, long j2) {
        this.w.a(j, j2);
    }

    @Override // o.C4898boa.d
    public void e(String str, int i, int i2) {
        this.b.c(i, i2);
    }

    public void a(InterfaceC5097bsN interfaceC5097bsN) {
        this.b.d(interfaceC5097bsN);
        PlayerManifestData playerManifestData = this.R;
        if (playerManifestData != null && interfaceC5097bsN != null) {
            this.b.b(playerManifestData);
        }
        this.b.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(PlayContext playContext) {
        this.f13625J = playContext;
        this.w.o(playContext.getTrackId());
    }

    @Override // o.InterfaceC5085bsB
    public final void C() {
        this.B.k();
        this.B.b(true);
    }

    @Override // o.InterfaceC5085bsB
    public final void y() {
        this.B.b(false);
        C4543bgW c4543bgW = this.Q;
        if (c4543bgW != null) {
            c4543bgW.e();
        }
    }

    @Override // o.InterfaceC5085bsB
    public final void B() {
        this.B.k();
        this.B.b(true);
    }

    @Override // o.InterfaceC5085bsB
    public void c(boolean z) {
        this.B.b(z);
    }

    @Override // o.InterfaceC5085bsB
    public void c(boolean z, boolean z2) {
        if (z) {
            c(new Runnable() { // from class: o.boz
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC4918bou.this.e();
                }
            });
        }
        C4543bgW c4543bgW = this.Q;
        if (c4543bgW != null) {
            c4543bgW.c(z && this.v.e() && !this.K, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.w.g(H());
    }

    @Override // o.InterfaceC5085bsB
    public void b(long j) {
        h(j);
    }

    @Override // o.InterfaceC5085bsB
    public void b(int i) {
        h(i + this.B.d());
    }

    private void h(long j) {
        this.w.a(H(), StopReason.SEEK, j);
        this.B.e(j);
        this.B.b(true);
    }

    @Override // o.InterfaceC5085bsB
    public void d(float f) {
        this.B.b(f);
        M();
    }

    @Override // o.InterfaceC5085bsB
    public void D() {
        c(new Runnable() { // from class: o.bow
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4918bou.this.G();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.N = true;
        this.w.c(H(), F());
    }

    @Override // o.InterfaceC5085bsB
    public void a(final ExitPipAction exitPipAction) {
        c(new Runnable() { // from class: o.boq
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4918bou.this.c(exitPipAction);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(ExitPipAction exitPipAction) {
        this.N = false;
        this.w.c(H(), exitPipAction, F());
    }

    @Override // o.InterfaceC5085bsB
    public void d(final int i, final int i2, final String str) {
        c(new Runnable() { // from class: o.bov
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4918bou.this.c(i, i2, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i, int i2, String str) {
        this.w.e(H(), i, i2, str);
    }

    @Override // o.InterfaceC5085bsB
    public boolean v() {
        return this.B.e() <= 0.0f || C8159dfC.j(this.h);
    }

    @Override // o.InterfaceC5085bsB
    public Language h() {
        Language language;
        synchronized (this.f) {
            language = this.f.get(H());
        }
        return language;
    }

    @Override // o.InterfaceC5085bsB
    public void b(Language language) {
        synchronized (this.f) {
            this.f.put(H(), language);
        }
    }

    @Override // o.InterfaceC5085bsB
    public AudioSource g() {
        AudioSource audioSource;
        synchronized (this.g) {
            audioSource = this.g.get(H());
        }
        return audioSource;
    }

    public AudioSource[] f() {
        return this.r.d(H());
    }

    @Override // o.InterfaceC5085bsB
    public Subtitle j() {
        Subtitle subtitle;
        synchronized (this.j) {
            subtitle = this.m.get(H());
            if (subtitle == null) {
                subtitle = this.j.get(H());
            }
        }
        return subtitle;
    }

    @Override // o.InterfaceC5085bsB
    public Subtitle[] q() {
        return this.r.j(H());
    }

    @Override // o.InterfaceC5085bsB
    public boolean d(AudioSource audioSource) {
        C1044Mm.e(this.F, "selectAudioTrack");
        if (C8168dfL.g(audioSource.getId())) {
            return false;
        }
        AudioSource e = e(audioSource);
        this.B.d(e.getNewTrackId(), 2);
        if (!this.v.o()) {
            this.B.b(true);
        }
        synchronized (this.g) {
            this.g.put(H(), e);
        }
        return true;
    }

    private AudioSource e(AudioSource audioSource) {
        AudioSource e;
        if ((aQF.c() || this.e.al()) && C8054ddD.g()) {
            AudioManager audioManager = (AudioManager) AbstractApplicationC1040Mh.d().getSystemService("audio");
            boolean L = L();
            if (L && audioSource.getNumChannels() != 6) {
                e = e(6, audioSource);
            } else {
                e = (L || audioSource.getNumChannels() == 2) ? null : e(2, audioSource);
            }
            return e != null ? e : audioSource;
        }
        return audioSource;
    }

    private boolean L() {
        Spatializer spatializer;
        boolean isEnabled;
        Spatializer spatializer2;
        Spatializer spatializer3;
        boolean isEnabled2;
        boolean isHeadTrackerAvailable;
        boolean isAvailable;
        int immersiveAudioLevel;
        boolean isEnabled3;
        int immersiveAudioLevel2;
        boolean isAvailable2;
        AudioManager audioManager = (AudioManager) AbstractApplicationC1040Mh.d().getSystemService("audio");
        boolean z = false;
        if (C8054ddD.i() && ((aQF.j() || this.e.al()) && !ConnectivityUtils.p(AbstractApplicationC1040Mh.d()) && c(audioManager))) {
            spatializer3 = audioManager.getSpatializer();
            String str = this.F;
            StringBuilder sb = new StringBuilder();
            sb.append("Spatial Enabled: ");
            isEnabled2 = spatializer3.isEnabled();
            sb.append(isEnabled2);
            sb.append(" Headtracking Available: ");
            isHeadTrackerAvailable = spatializer3.isHeadTrackerAvailable();
            sb.append(isHeadTrackerAvailable);
            sb.append(" Current audio output routing:");
            isAvailable = spatializer3.isAvailable();
            sb.append(isAvailable);
            sb.append(" Spatial Immersive Audio Level:");
            immersiveAudioLevel = spatializer3.getImmersiveAudioLevel();
            sb.append(immersiveAudioLevel);
            C1044Mm.e(str, sb.toString());
            isEnabled3 = spatializer3.isEnabled();
            if (isEnabled3) {
                immersiveAudioLevel2 = spatializer3.getImmersiveAudioLevel();
                if (immersiveAudioLevel2 != 0) {
                    isAvailable2 = spatializer3.isAvailable();
                    if (isAvailable2) {
                        z = true;
                    }
                }
            }
            C1044Mm.e(this.F, "DD 5_1 enabled: " + z);
        }
        if (aQF.i()) {
            String str2 = this.F;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Spatial Available: ");
            spatializer = audioManager.getSpatializer();
            isEnabled = spatializer.isEnabled();
            sb2.append(isEnabled);
            C1044Mm.e(str2, sb2.toString());
            spatializer2 = audioManager.getSpatializer();
            z = spatializer2.isEnabled();
            C1044Mm.e(this.F, "DD 5_1 enabled: " + z);
        }
        C1044Mm.e(this.F, "Spatial enabled: " + z);
        return z;
    }

    private boolean c(AudioManager audioManager) {
        AudioDeviceInfo[] devices;
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
            if (audioDeviceInfo.isSink() && (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7)) {
                C1044Mm.e(this.F, "Current Audio Sink is Bluetooth mode " + audioDeviceInfo.getType());
                return true;
            }
        }
        C1044Mm.e(this.F, "No bluetooth mode available");
        return false;
    }

    private AudioSource e(int i, AudioSource audioSource) {
        AudioSource[] f;
        for (AudioSource audioSource2 : f()) {
            if (audioSource.getLanguageCodeBcp47().equalsIgnoreCase(audioSource2.getLanguageCodeBcp47()) && i == audioSource2.getNumChannels() && audioSource.getTrackType() == audioSource2.getTrackType()) {
                C1044Mm.e(this.F, "Initial audiosource " + audioSource);
                C1044Mm.e(this.F, "New audiosource " + audioSource2);
                return audioSource2;
            }
        }
        return null;
    }

    @Override // o.InterfaceC5085bsB
    public void d(Subtitle subtitle, boolean z) {
        String str = this.F;
        C1044Mm.e(str, "selectSubtitleTrack " + subtitle);
        Subtitle j = j();
        if (subtitle == null && j == null) {
            C1044Mm.e(this.F, "subtitle selection is ignored, subtitleTrack and currentSubtitleTrack are both null.");
            return;
        }
        this.B.e(subtitle != null ? subtitle.getNewTrackId() : null, z ? 2 : 10002);
        if (!this.v.o()) {
            this.B.b(true);
        }
        synchronized (this.j) {
            this.j.put(H(), subtitle);
        }
        if (!z) {
            this.m.put(H(), subtitle);
        } else {
            this.m.remove(H());
        }
    }

    protected void a(long j) {
        throw new UnsupportedOperationException("upgrade manifest not supported in this playback session");
    }

    @Override // o.InterfaceC5085bsB
    public ByteBuffer e(long j) {
        InterfaceC4326bcR c = this.a.c(H());
        if (c != null) {
            return c.b((int) j);
        }
        return null;
    }

    @Override // o.InterfaceC5085bsB
    public Watermark t() {
        return this.r.h(H());
    }

    @Override // o.InterfaceC5085bsB
    public StreamProfileType p() {
        return this.r.g(H());
    }

    @Override // o.InterfaceC5085bsB
    public PlayerManifestData m() {
        return this.r.a(H());
    }

    @Override // o.InterfaceC5085bsB
    public void r() {
        this.w.n(H());
    }

    @Override // o.InterfaceC5085bsB
    public final IPlayer.PlaybackType l() {
        if (this.y == null) {
            throw new RuntimeException("Did you forget to set the playbackType during the constructor of the session.");
        }
        PlayerManifestData m = m();
        if (m != null) {
            this.y = m.isOffline() ? IPlayer.PlaybackType.OfflinePlayback : IPlayer.PlaybackType.StreamingPlayback;
            if (m.isLive()) {
                this.y = IPlayer.PlaybackType.LivePlayback;
            }
        }
        return this.y;
    }

    @Override // o.InterfaceC5085bsB
    public void d(InterfaceC5097bsN interfaceC5097bsN) {
        this.b.c(interfaceC5097bsN);
    }

    @Override // o.InterfaceC5085bsB
    public void e(InterfaceC5097bsN interfaceC5097bsN) {
        this.b.b(interfaceC5097bsN);
    }

    @Override // o.InterfaceC5085bsB
    public boolean z() {
        return this.v.g();
    }

    @Override // o.InterfaceC5085bsB
    public void d() {
        this.M = true;
        this.z = C8170dfN.d();
        C4543bgW c4543bgW = this.Q;
        if (c4543bgW != null) {
            c4543bgW.f();
        }
        C1044Mm.e(this.F, "closing session");
        this.B.g();
        c(new Runnable() { // from class: o.bos
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4918bou.this.I();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        c(this.z);
    }

    @Override // o.InterfaceC5085bsB
    public InterfaceC5299bwD b(ViewGroup viewGroup) {
        return this.B.e(viewGroup, this.O.s(), this.O.k());
    }

    @Override // o.InterfaceC5085bsB
    public void a(SurfaceView surfaceView) {
        PlayerManifestData playerManifestData;
        String str = this.F;
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(surfaceView == null);
        C1044Mm.a(str, "setSurfaceView isNull=%b", objArr);
        this.B.d(surfaceView);
        this.w.m(H());
        if (!this.v.o() || !this.B.U_() || (playerManifestData = this.R) == null || surfaceView == null) {
            return;
        }
        this.b.b(playerManifestData);
        this.b.a();
    }

    @Override // o.InterfaceC5085bsB
    public void c(float f) {
        this.B.d(f);
    }

    @Override // o.InterfaceC5085bsB
    public float n() {
        return this.B.c();
    }

    @Override // o.InterfaceC5085bsB
    public void d(PlaybackExperience playbackExperience, PlayContext playContext) {
        this.v = playbackExperience;
        this.w.e(playbackExperience.b().c());
        d(playContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(long j) {
        boolean z = this.l > 2;
        boolean z2 = z || this.H;
        this.w.j(H(), j);
        this.w.c(H(), z, z2, this.l);
        this.w.a(H(), StopReason.STOPPED, -1L);
        this.A.a();
        if (this.N) {
            a(ExitPipAction.STOP);
        }
        this.G.i();
        this.a.a();
        this.w.d();
        this.r.a();
        this.c.e();
        this.R = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(Runnable runnable) {
        this.I.post(runnable);
    }

    private void d(C4974bpx c4974bpx) {
        if (c4974bpx != null) {
            String str = this.F;
            C1044Mm.e(str, "reportPlayerError GenericPlaybackSession " + c4974bpx);
            if (c4974bpx.j() instanceof InterfaceC4413bdz) {
                InterfaceC4413bdz interfaceC4413bdz = (InterfaceC4413bdz) c4974bpx.j();
                if (interfaceC4413bdz.D()) {
                    this.b.b(new C4611bhl(c4974bpx.l(), c4974bpx.c(), c4974bpx.d()));
                    return;
                }
                if (interfaceC4413bdz.y() && !C1880aRr.c()) {
                    C4600bha c4600bha = new C4600bha(c4974bpx.l(), c4974bpx.c(), c4974bpx.d());
                    if (c4600bha.f() != null) {
                        this.b.b(c4600bha);
                        return;
                    }
                    InterfaceC1598aHf.a(new C1596aHd("uma unavailable for account hold, falling back to blade runner error response based dialog").b(false));
                }
                if (interfaceC4413bdz.B()) {
                    this.b.b(new C4608bhi(c4974bpx));
                    return;
                } else if (interfaceC4413bdz.w()) {
                    C1044Mm.e(this.F, "reportPlayerError GenericPlaybackSession isAccountInactiveError");
                    this.b.b(new C4546bgZ(c4974bpx));
                    return;
                } else if (interfaceC4413bdz.C()) {
                    this.b.b(new C4603bhd(c4974bpx));
                    return;
                }
            }
            c4974bpx.b(this.h);
            Status j = c4974bpx.j();
            if (j != null && j.c() == StatusCode.DRM_FAILURE_MEDIADRM_KEYS_RESTORE_FAILED) {
                this.b.b(new C4609bhj(c4974bpx));
                return;
            }
        }
        this.b.b(new C4614bho(c4974bpx));
    }

    public void A() {
        this.p.d(H(), this.D);
    }

    @Override // o.InterfaceC5085bsB
    public void c(int i, int i2) {
        C1044Mm.a(this.F, "StreamingPlaybackSession min: %d, max: %d", Integer.valueOf(i), Integer.valueOf(i2));
        this.B.d(i, i2);
    }

    protected void c(IPlayer.c cVar) {
        CryptoErrorManager cryptoErrorManager;
        if (cVar instanceof C4614bho) {
            C4974bpx c = ((C4614bho) cVar).c();
            if (c != null) {
                c.b(this.h);
            }
            if (C4466bez.e(c) && (cryptoErrorManager = (CryptoErrorManager) C1332Xp.b(CryptoErrorManager.class)) != null) {
                cryptoErrorManager.a(ErrorSource.streaming_playback, StatusCode.WIDEVINE_L1_FAILURE_OS_UPGRADE, null);
            }
            d(c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r1.e(1, r0) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void M() {
        /*
            r4 = this;
            com.netflix.mediaclient.event.IStreamPresenting r0 = r4.L
            if (r0 == 0) goto L35
            android.content.Context r1 = r4.h
            boolean r1 = com.netflix.mediaclient.util.AccessibilityUtils.a(r1)
            if (r1 == 0) goto L35
            o.bhO r1 = r4.B
            float r1 = r1.e()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L35
            long r1 = r4.H()
            o.bhy r3 = r4.i
            o.bju r1 = r3.e(r1)
            if (r1 == 0) goto L35
            java.lang.String r0 = r0.c()
            java.lang.String r0 = r1.d(r0)
            if (r0 == 0) goto L35
            r2 = 1
            boolean r0 = r1.e(r2, r0)
            if (r0 != 0) goto L35
            goto L36
        L35:
            r2 = 0
        L36:
            o.bhO r0 = r4.B
            if (r0 == 0) goto L3d
            r0.a(r2)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC4918bou.M():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Language d(long j) {
        boolean z;
        int i;
        int i2;
        C4726bju e = this.i.e(j);
        Subtitle[] j2 = this.r.j(j);
        AudioSource[] d2 = this.r.d(j);
        if (e != null) {
            LanguageChoice g = e.g();
            AudioSource audio = g != null ? g.getAudio() : null;
            int nccpOrderNumber = audio != null ? audio.getNccpOrderNumber() : -1;
            Subtitle subtitle = g != null ? g.getSubtitle() : null;
            if (subtitle != null) {
                int nccpOrderNumber2 = subtitle.getNccpOrderNumber();
                z = true;
                i = nccpOrderNumber;
                i2 = nccpOrderNumber2;
            } else {
                z = false;
                i = nccpOrderNumber;
                i2 = -1;
            }
        } else {
            z = false;
            i = -1;
            i2 = -1;
        }
        return new Language(d2, i, j2, i2, z, true, this.r.b(j), this.r.e(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bou$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass4 implements InterfaceC4610bhk {
        AnonymousClass4() {
        }

        @Override // o.InterfaceC4610bhk
        public void a(IStreamPresenting iStreamPresenting) {
            if (iStreamPresenting.b() == IStreamPresenting.StreamType.TIMED_TEXT) {
                AbstractC4918bou.this.L = iStreamPresenting;
                AbstractC4918bou.this.M();
            }
        }

        @Override // o.InterfaceC4610bhk
        public void i() {
            AbstractC4918bou.this.b.c();
            AbstractC4918bou abstractC4918bou = AbstractC4918bou.this;
            abstractC4918bou.w.b(abstractC4918bou.H(), false);
            C4350bcp.c(AbstractC4918bou.this);
        }

        @Override // o.InterfaceC4610bhk
        public void c(Event event) {
            AbstractC4918bou abstractC4918bou = AbstractC4918bou.this;
            abstractC4918bou.w.a(abstractC4918bou.H(), event);
        }

        @Override // o.InterfaceC4610bhk
        public void e(int i, long j) {
            AbstractC4918bou abstractC4918bou = AbstractC4918bou.this;
            abstractC4918bou.w.a(abstractC4918bou.H(), i, j);
        }

        @Override // o.InterfaceC4610bhk
        public void a(long j, InterfaceC4610bhk.b bVar) {
            AbstractC4918bou abstractC4918bou = AbstractC4918bou.this;
            abstractC4918bou.w.d(abstractC4918bou.H(), j, bVar);
        }

        @Override // o.InterfaceC4610bhk
        public void c(long j, final Format format) {
            final String c = C4453bem.c(format);
            if (c != null) {
                PlaybackMetadataImpl playbackMetadataImpl = AbstractC4918bou.this.u;
                if (playbackMetadataImpl != null) {
                    playbackMetadataImpl.mSubtitleProfile = c;
                }
                if (C1854aQs.c()) {
                    AbstractC4918bou.this.q.post(new Runnable() { // from class: o.boE
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC4918bou.AnonymousClass4.this.d(format, c);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Format format, String str) {
            if ("ja".equals(format.language) && "imsc1.1".equals(str)) {
                AbstractC4918bou.this.B.b(2);
            } else {
                AbstractC4918bou.this.B.b(1);
            }
        }

        @Override // o.InterfaceC4345bck
        public void c() {
            AbstractC4918bou abstractC4918bou = AbstractC4918bou.this;
            C4726bju e = abstractC4918bou.i.e(abstractC4918bou.H());
            if (e != null) {
                AbstractC4918bou.this.b(e);
            }
            InterfaceC4607bhh interfaceC4607bhh = AbstractC4918bou.this.S;
            AbstractC4918bou abstractC4918bou2 = AbstractC4918bou.this;
            interfaceC4607bhh.d(abstractC4918bou2, abstractC4918bou2.r.g(abstractC4918bou2.H()));
            PlayerManifestData m = AbstractC4918bou.this.m();
            if (m != null && AbstractC4918bou.this.R != m) {
                AbstractC4918bou.this.R = m;
                AbstractC4918bou abstractC4918bou3 = AbstractC4918bou.this;
                abstractC4918bou3.b.b(abstractC4918bou3.R);
                AbstractC4918bou abstractC4918bou4 = AbstractC4918bou.this;
                Language d = abstractC4918bou4.d(abstractC4918bou4.H());
                final AudioSource g = AbstractC4918bou.this.g();
                if (d.getSelectedAudio() != null && g != null && g.getNewTrackId().equals(d.getSelectedAudio().getNewTrackId())) {
                    AbstractC4918bou.this.q.post(new Runnable() { // from class: o.box
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC4918bou.AnonymousClass4.this.c(g);
                        }
                    });
                }
                final Subtitle j = AbstractC4918bou.this.j();
                if (d.getSelectedSubtitle() == null || j == null || j.getNewTrackId().equals(d.getSelectedSubtitle().getNewTrackId())) {
                    return;
                }
                AbstractC4918bou.this.q.post(new Runnable() { // from class: o.boC
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC4918bou.AnonymousClass4.this.b(j);
                    }
                });
                return;
            }
            C1044Mm.j(AbstractC4918bou.this.F, "manifest data not yet available - will be called when manifest is available");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(AudioSource audioSource) {
            AbstractC4918bou.this.d(audioSource);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Subtitle subtitle) {
            AbstractC4918bou.this.d(subtitle, true);
        }

        @Override // o.InterfaceC4345bck
        public void d() {
            AbstractC4918bou.this.b.e();
        }

        @Override // o.InterfaceC4345bck
        public void a() {
            AbstractC4918bou.this.b.d();
        }

        @Override // o.InterfaceC4345bck
        public void e() {
            AbstractC4918bou abstractC4918bou = AbstractC4918bou.this;
            abstractC4918bou.c.e(abstractC4918bou.H());
            AbstractC4918bou.this.b.a();
        }

        @Override // o.InterfaceC4345bck
        public void b() {
            AbstractC4918bou abstractC4918bou = AbstractC4918bou.this;
            abstractC4918bou.b.b(abstractC4918bou.H());
            C4350bcp.c(AbstractC4918bou.this);
        }

        @Override // o.InterfaceC4345bck
        public void c(long j) {
            AbstractC4918bou.this.b.c(j);
        }

        @Override // o.InterfaceC4345bck
        public void b(C5086bsC c5086bsC) {
            AbstractC4918bou.this.b.b(c5086bsC);
        }

        @Override // o.InterfaceC4345bck
        public void d(IPlayer.c cVar) {
            C4350bcp.c(AbstractC4918bou.this);
            if (AbstractC4918bou.this.a(cVar)) {
                C1044Mm.e(AbstractC4918bou.this.F, "playerError but retrying");
            } else {
                AbstractC4918bou.this.c(cVar);
            }
        }

        @Override // o.InterfaceC4683bjD
        public void d(DashManifest dashManifest) {
            AbstractC4918bou.this.a(C4725bjt.c(dashManifest));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(C4678biz c4678biz) {
        ArraySet arraySet = new ArraySet();
        for (String str : c4678biz.c()) {
            int i = C4632biF.a(c4678biz.a(str).b()).e;
            if (i == 1 || i == 2) {
                arraySet.add(str);
            }
        }
        this.f13626o.e(arraySet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long d(String str, long j) {
        List<C4656bid> b = this.f13626o.b(str, 0L, 2147483647L);
        if (b != null) {
            List<C4656bid> c = C4674biv.c(b, 0L, j);
            if (c.isEmpty()) {
                return -1L;
            }
            return c.get(c.size() - 1).f();
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(C4726bju c4726bju) {
        IClientLogging f = AbstractApplicationC1040Mh.getInstance().i().f();
        if (f == null) {
            C1044Mm.d(this.F, "Logging agent not available");
            return;
        }
        LanguageChoice g = c4726bju.g();
        if (g == null || g.getSelectionReport() == null) {
            C1044Mm.j(this.F, "Select report is null, nothing to report!");
        } else if (g.getSelectionReport().getSelectedLanguage() == null) {
            C1044Mm.e(this.F, "Select language is null, no user override, nothing to report!");
        } else if (e(g.getAudio(), g.getSelectionReport().getAudioLanguageSelectionOrigin()) || e(g.getSubtitle(), g.getSelectionReport().getSubtitleLanguageSelectionOrigin())) {
            C1044Mm.d(this.F, "We were not able to honor user language override, report!");
            f.e().a(new aUJ(g.getSelectionReport(), Long.valueOf(H()), null));
        } else {
            C1044Mm.e(this.F, "No mismatches, nothing to report");
        }
    }

    @Override // o.InterfaceC5085bsB
    public void u() {
        this.w.f(H());
    }

    @Override // o.InterfaceC5085bsB
    public void w() {
        this.w.h(H());
    }

    public long i() {
        return C8170dfN.d() - this.E;
    }

    private static boolean e(Object obj, LanguageChoice.LanguageSelectionOrigin languageSelectionOrigin) {
        return (obj == null || languageSelectionOrigin == LanguageChoice.LanguageSelectionOrigin.USER_OVERRIDE) ? false : true;
    }

    @Override // o.InterfaceC5169btg
    public void a(InterfaceC5122bsm interfaceC5122bsm) {
        this.B.d(interfaceC5122bsm);
    }
}
