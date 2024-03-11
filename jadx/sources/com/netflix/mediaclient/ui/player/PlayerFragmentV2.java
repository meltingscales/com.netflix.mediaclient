package com.netflix.mediaclient.ui.player;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.window.layout.FoldingFeature;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.context.KeyboardInput;
import com.netflix.cl.model.context.iko.IkoMode;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.command.BackCommand;
import com.netflix.cl.model.event.session.command.CancelCommand;
import com.netflix.cl.model.event.session.command.PauseCommand;
import com.netflix.cl.model.event.session.command.SelectCommand;
import com.netflix.cl.model.event.session.command.UnpauseCommand;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import com.netflix.mediaclient.playerui.videoview.api.PlayerControls;
import com.netflix.mediaclient.playerui.videoview.api.PlayerState;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlayerUI;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_TabletopModeDisable;
import com.netflix.mediaclient.service.net.LogMobileType;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.volley.StatusCodeError;
import com.netflix.mediaclient.servicemgr.ExitPipAction;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.LiveEventState;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.PlayerPrefetchSource;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.PlaybackContext;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.LegacyBranchingBookmark;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.player.IPlayerFragment;
import com.netflix.mediaclient.ui.player.PlayerFragmentV2;
import com.netflix.mediaclient.ui.player.PlayerPictureInPictureManager;
import com.netflix.mediaclient.ui.player.v2.SkipCreditsType;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import com.netflix.mediaclient.ui.ums.UserMessageAreaView;
import com.netflix.mediaclient.ui.usermarks.api.UserMarksFlexEventType;
import com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.mediaclient.util.log.RootCause;
import com.netflix.model.leafs.PostPlayExperience;
import com.netflix.model.leafs.TimeCodesData;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.blades.SkipContentData;
import com.netflix.model.leafs.originals.interactive.ImpressionData;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.Subject;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Provider;
import o.AbstractApplicationC1040Mh;
import o.AbstractC4322bcN;
import o.AbstractC5100bsQ;
import o.AbstractC5531cAw;
import o.AbstractC5594cBe;
import o.AbstractC5595cBf;
import o.AbstractC5597cBh;
import o.AbstractC5599cBj;
import o.AbstractC7431cwA;
import o.AbstractC7452cwV;
import o.AbstractC7475cws;
import o.AbstractC7480cwx;
import o.AbstractC7612czW;
import o.AbstractC8266dhD;
import o.C1044Mm;
import o.C1052Mw;
import o.C1163Rc;
import o.C1180Rt;
import o.C1226Tn;
import o.C1332Xp;
import o.C1333Xq;
import o.C1596aHd;
import o.C1613aHu;
import o.C1677aKd;
import o.C1682aKi;
import o.C1877aRo;
import o.C1880aRr;
import o.C1885aRw;
import o.C1907aSr;
import o.C4608bhi;
import o.C4611bhl;
import o.C4614bho;
import o.C4779bmN;
import o.C5086bsC;
import o.C5087bsD;
import o.C5096bsM;
import o.C5124bso;
import o.C5208buS;
import o.C5273bve;
import o.C5296bwA;
import o.C5591cBb;
import o.C5593cBd;
import o.C5596cBg;
import o.C5639cCw;
import o.C6004cQk;
import o.C6186cXa;
import o.C7446cwP;
import o.C7449cwS;
import o.C7460cwd;
import o.C7478cwv;
import o.C7490cxG;
import o.C7496cxM;
import o.C7498cxO;
import o.C7516cxg;
import o.C7535cxz;
import o.C7557cyU;
import o.C7590czA;
import o.C7593czD;
import o.C7599czJ;
import o.C7621czf;
import o.C7622czg;
import o.C7626czk;
import o.C7629czn;
import o.C7631czp;
import o.C7639czx;
import o.C7969dbY;
import o.C8006dcI;
import o.C8021dcX;
import o.C8054ddD;
import o.C8061ddK;
import o.C8067ddQ;
import o.C8082ddf;
import o.C8126deW;
import o.C8141del;
import o.C8150deu;
import o.C8151dev;
import o.C8153dex;
import o.C8157dfA;
import o.C8159dfC;
import o.C8166dfJ;
import o.C8168dfL;
import o.C8187dfe;
import o.C8194dfl;
import o.C8206dfx;
import o.C9935zP;
import o.InterfaceC1078Nw;
import o.InterfaceC1126Pr;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1905aSp;
import o.InterfaceC3612bEh;
import o.InterfaceC3643bFl;
import o.InterfaceC4208baF;
import o.InterfaceC4317bcI;
import o.InterfaceC4342bch;
import o.InterfaceC4360bcz;
import o.InterfaceC5085bsB;
import o.InterfaceC5128bss;
import o.InterfaceC5160btX;
import o.InterfaceC5198buI;
import o.InterfaceC5206buQ;
import o.InterfaceC5227bul;
import o.InterfaceC5274bvf;
import o.InterfaceC5283bvo;
import o.InterfaceC5297bwB;
import o.InterfaceC5303bwH;
import o.InterfaceC5602cBm;
import o.InterfaceC5603cBn;
import o.InterfaceC5604cBo;
import o.InterfaceC6675chl;
import o.InterfaceC7282ctK;
import o.InterfaceC7303ctf;
import o.InterfaceC7441cwK;
import o.InterfaceC7451cwU;
import o.InterfaceC7468cwl;
import o.InterfaceC7469cwm;
import o.InterfaceC7606czQ;
import o.InterfaceC7607czR;
import o.InterfaceC7614czY;
import o.InterfaceC7967dbW;
import o.InterfaceC8612dsa;
import o.InterfaceC9638uF;
import o.SY;
import o.aIB;
import o.aJR;
import o.aJT;
import o.aJV;
import o.aJY;
import o.aOV;
import o.aQB;
import o.aQD;
import o.aQJ;
import o.aSC;
import o.bDG;
import o.bDI;
import o.bDK;
import o.bEH;
import o.bXD;
import o.bZN;
import o.cBA;
import o.cBD;
import o.cBK;
import o.cBO;
import o.cBP;
import o.cBR;
import o.cFH;
import o.cVH;
import o.dpR;
import o.drM;
import o.drO;
import org.chromium.net.ConnectionSubtype;
import org.chromium.net.NetError;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public class PlayerFragmentV2 extends AbstractC7452cwV implements bDG, C1180Rt.d, IPlayerFragment, InterfaceC5274bvf, InterfaceC7469cwm, InterfaceC7451cwU, InterfaceC7441cwK {
    static final int b;
    private static final int k;
    private static final long l;
    private static final int m;
    private static final int n;

    /* renamed from: o  reason: collision with root package name */
    private static final int f13300o;
    private static final long q;
    private static final int r;
    private final View.OnLayoutChangeListener A;
    private NetflixDialogFrag B;
    private final C1682aKi.b C;
    private aOV D;
    private boolean E;
    private boolean F;
    private final BroadcastReceiver G;
    private int H;

    /* renamed from: J  reason: collision with root package name */
    private C7535cxz f13301J;
    private C5086bsC K;
    private boolean M;
    private boolean N;
    private final BroadcastReceiver O;
    @Deprecated
    private IPlayer.PlaybackType P;
    @Deprecated
    private C7535cxz Q;
    private C7449cwS R;
    private InterfaceC5198buI S;
    @Deprecated
    private C7535cxz T;
    @Deprecated
    private boolean U;
    private final BroadcastReceiver V;
    private final Runnable W;
    private PlayerPictureInPictureManager X;
    private final BroadcastReceiver Y;
    private final C7557cyU Z;
    @Deprecated
    private Subject<cBO> aA;
    private PlaybackContext aB;
    @Deprecated
    private C5208buS ab;
    private PlayerExtras ac;
    private boolean ad;
    @Inject
    public InterfaceC5303bwH adsPlan;
    private bDK ae;
    private C7535cxz af;
    private ViewGroup ag;
    @Deprecated
    private boolean ah;
    private aJY ai;
    private final BroadcastReceiver ak;
    private final Runnable al;
    private final Runnable am;
    private InterfaceC5085bsB an;
    private final View.OnClickListener ao;
    private Long ap;
    private final C1682aKi.a aq;
    private final C1682aKi.e ar;
    private PlayerA11yRepository as;
    private C5296bwA at;
    private InterfaceC5604cBo au;
    private C7490cxG av;
    private InterfaceC5297bwB.a aw;
    private cBP ax;
    private C7629czn ay;
    private final C1682aKi.c az;
    public C9935zP e;
    @Inject
    public InterfaceC9638uF imageLoaderRepository;
    @Inject
    public Lazy<bXD> interstitials;
    InterfaceC7607czR j;
    @Inject
    public Lazy<bZN> localDiscoveryConsentUiLazy;
    @Inject
    public InterfaceC5603cBn mPlayerRepositoryFactory;
    @Inject
    public InterfaceC6675chl messaging;
    @Inject
    public InterfaceC7303ctf offlineApi;
    @Inject
    public InterfaceC7282ctK offlinePostplay;
    private float p;
    @Inject
    public Provider<Boolean> pauseAdsEnabled;
    @Inject
    public InterfaceC7468cwl pauseAdsManager;
    @Inject
    public Lazy<PlaybackLauncher> playbackLauncher;
    @Inject
    public C7498cxO playerFragmentCL;
    @Inject
    public Lazy<InterfaceC5602cBm> playerPrefetchRepositoryLazy;
    @Inject
    public bDI playerUI;
    @Inject
    public InterfaceC7606czQ postPlayManagerFactory;
    @Inject
    public Lazy<InterfaceC7614czY> postPlayPlaygraphHelper;
    @Inject
    public Provider<Boolean> prePlayComposeEnabled;
    private PlayerState s;
    @Inject
    public InterfaceC1126Pr socialSharing;
    private final Runnable t;
    private final Runnable u;
    @Inject
    public Lazy<InterfaceC7967dbW> userMarks;
    private final cFH v;
    private final C1226Tn.c w;
    private AppView x;
    private InterfaceC5128bss z;
    private int aa = r;
    private final Handler I = new Handler();
    private final C7626czk aj = new C7626czk();
    private boolean L = true;
    private boolean y = false;
    private String aF = "";

    /* loaded from: classes4.dex */
    public interface d {
        void d(C5593cBd c5593cBd);
    }

    private InterfaceC5198buI aN() {
        return this.S;
    }

    private int aT() {
        return this.aa;
    }

    private void b(PlayerExtras playerExtras) {
        this.ac = playerExtras;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Throwable th) {
    }

    @Override // o.InterfaceC7451cwU
    public aJY B() {
        return this.ai;
    }

    public Handler ae() {
        return this.I;
    }

    public C9935zP ah() {
        return this.e;
    }

    public C5086bsC ai() {
        return this.K;
    }

    public aJY ak() {
        return this.ai;
    }

    @Override // com.netflix.mediaclient.ui.player.IPlayerFragment
    /* renamed from: al */
    public NetflixFrag i() {
        return this;
    }

    public C7626czk am() {
        return this.aj;
    }

    @Override // o.InterfaceC7451cwU
    public void d(aJY ajy) {
        this.ai = ajy;
    }

    @Override // o.InterfaceC7451cwU
    public void e(Subject<cBO> subject) {
        this.aA = subject;
    }

    @Override // com.netflix.mediaclient.ui.player.IPlayerFragment
    public Subject<cBO> g() {
        return this.aA;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return this.L;
    }

    @Deprecated
    public void k(boolean z) {
        this.ah = z;
    }

    @Deprecated
    public void n(boolean z) {
        this.U = z;
    }

    @Override // com.netflix.mediaclient.ui.player.IPlayerFragment
    public /* synthetic */ Context d() {
        return super.getActivity();
    }

    public PlayerFragmentV2() {
        C9935zP d2 = C9935zP.d(this);
        this.e = d2;
        this.Z = new C7557cyU(d2.d(cBA.class));
        this.at = new C5296bwA();
        this.v = new cFH();
        this.S = null;
        this.ad = false;
        this.x = AppView.playback;
        this.p = 1.0f;
        this.N = false;
        this.s = PlayerState.b;
        this.az = new C1682aKi.c() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.4
            @Override // o.C1682aKi.c
            public void a(PlayerState playerState) {
                int i = AnonymousClass18.a[playerState.ordinal()];
                if (i == 1) {
                    C1044Mm.e("PlayerFragment", "playerStatusChangeListener: onPlayerStatusChanged: Started");
                    PlayerFragmentV2.this.bA();
                } else if (i == 2) {
                    C1044Mm.e("PlayerFragment", "playerStatusChangeListener: onPlayerStatusChanged: Paused");
                    PlayerFragmentV2.this.bB();
                } else if (i == 3) {
                    C1044Mm.e("PlayerFragment", "playerStatusChangeListener: onPlayerStatusChanged: Stalled");
                    PlayerFragmentV2.this.e.b(cBA.class, cBA.C5558t.d);
                } else if (i == 4) {
                    C1044Mm.e("PlayerFragment", "playerStatusChangeListener: onPlayerStatusChanged: Completed");
                    PlayerFragmentV2.this.bz();
                } else if (i == 5) {
                    C1044Mm.e("PlayerFragment", "playerStatusChangeListener: onPlayerStatusChanged: Prepared");
                    if (PlayerFragmentV2.this.ak() != null && PlayerFragmentV2.this.f13301J != null) {
                        if (Long.parseLong(PlayerFragmentV2.this.f13301J.m()) == PlayerFragmentV2.this.ak().n()) {
                            PlayerFragmentV2.this.f13301J.d(PlayerFragmentV2.this.ak().w());
                        }
                        PlayerFragmentV2 playerFragmentV2 = PlayerFragmentV2.this;
                        playerFragmentV2.aB = playerFragmentV2.ak().w() == IPlayer.PlaybackType.LivePlayback ? PlaybackContext.a : PlaybackContext.d;
                        PlayerFragmentV2 playerFragmentV22 = PlayerFragmentV2.this;
                        playerFragmentV22.e.b(cBA.class, new cBA.ah(playerFragmentV22.ak().w()));
                        if (PlayerFragmentV2.this.K != null) {
                            PlayerFragmentV2.this.C.e(PlayerFragmentV2.this.K);
                        }
                    }
                } else {
                    C1044Mm.e("PlayerFragment", "playerStatusChangeListener: onPlayerStatusChanged: " + playerState);
                }
                PlayerFragmentV2.this.s = playerState;
            }
        };
        this.ar = new C1682aKi.e() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.13
            @Override // o.C1682aKi.e
            public void e(long j) {
                PlayerFragmentV2.this.e(j);
            }
        };
        this.C = new C1682aKi.b() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.17
            @Override // o.C1682aKi.b
            @SuppressLint({"NewApi"})
            public void e(C5086bsC c5086bsC) {
                C1044Mm.e("PlayerFragment", "Client state: " + c5086bsC);
                PlayerFragmentV2.this.K = c5086bsC;
                if (PlayerFragmentV2.this.f13301J == null) {
                    InterfaceC1598aHf.a("Cannot handle live event state, mCurrentPlaybackItem is null");
                    return;
                }
                if (c5086bsC.a() == LiveEventState.EVENT_WAITING_ROOM) {
                    PlayerFragmentV2.this.aB = PlaybackContext.a;
                    PlayerFragmentV2 playerFragmentV2 = PlayerFragmentV2.this;
                    playerFragmentV2.e.b(cBA.class, new AbstractC5595cBf.d(Integer.parseInt(playerFragmentV2.f13301J.m())));
                    if (PlayerFragmentV2.this.X != null) {
                        PlayerFragmentV2.this.X.a(PlayerPictureInPictureManager.PlayerLiveStatus.j);
                    }
                    PlayerFragmentV2.this.f13301J.e(Long.MAX_VALUE);
                }
                if (c5086bsC.a() == LiveEventState.EVENT_LIVE) {
                    PlayerFragmentV2.this.aB = PlaybackContext.a;
                    PlayerFragmentV2.this.e.b(cBA.class, AbstractC5595cBf.b.c);
                    if (PlayerFragmentV2.this.X != null) {
                        PlayerFragmentV2.this.X.a(PlayerPictureInPictureManager.PlayerLiveStatus.c);
                    }
                    PlayerFragmentV2.this.f13301J.e(Long.MAX_VALUE);
                }
                if (c5086bsC.a() == LiveEventState.EVENT_THANK_YOU) {
                    PlayerFragmentV2.this.e.b(cBA.class, AbstractC5595cBf.c.b);
                    if (PlayerFragmentV2.this.X != null) {
                        PlayerFragmentV2.this.X.a(PlayerPictureInPictureManager.PlayerLiveStatus.b);
                    }
                    if (PlayerFragmentV2.this.f()) {
                        PlayerFragmentV2.this.Y();
                    }
                    PlayerFragmentV2.this.f13301J.p();
                    if (!PlayerFragmentV2.this.f13301J.n()) {
                        PlayerFragmentV2 playerFragmentV22 = PlayerFragmentV2.this;
                        playerFragmentV22.e(playerFragmentV22.f13301J);
                    }
                }
                if (c5086bsC.a() == LiveEventState.EVENT_DVR_MODE) {
                    PlayerFragmentV2.this.aB = PlaybackContext.b;
                    PlayerFragmentV2 playerFragmentV23 = PlayerFragmentV2.this;
                    playerFragmentV23.e.b(cBA.class, new AbstractC5595cBf.e((int) playerFragmentV23.f13301J.c()));
                    if (PlayerFragmentV2.this.X != null) {
                        PlayerFragmentV2.this.X.a(c5086bsC.c() ? PlayerPictureInPictureManager.PlayerLiveStatus.a : PlayerPictureInPictureManager.PlayerLiveStatus.e);
                    }
                    PlayerFragmentV2.this.f13301J.p();
                }
                PlayerFragmentV2.this.e.b(cBA.class, new AbstractC5595cBf.a(c5086bsC.c()));
            }

            @Override // o.C1682aKi.b
            public void e(long j) {
                C1044Mm.a("PlayerFragment", "live window: %s ms", Long.valueOf(j));
                if (PlayerFragmentV2.this.f13301J == null) {
                    InterfaceC1598aHf.a("Cannot handle live duration update, mCurrentPlaybackItem is null");
                    return;
                }
                PlayerFragmentV2.this.f13301J.d(j);
                PlayerFragmentV2.this.e.b(cBA.class, new cBA.C5563y((int) j));
            }
        };
        this.aq = new C1682aKi.a() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.16
            @Override // o.C1682aKi.a
            public void d(IPlayer.c cVar) {
                C1044Mm.e("PlayerFragment", "playbackErrorListener: onError: " + cVar.a());
                PlayerFragmentV2.this.c(cVar);
            }
        };
        this.av = null;
        this.ah = true;
        this.j = null;
        this.aB = PlaybackContext.d;
        this.W = new Runnable() { // from class: o.cyJ
            @Override // java.lang.Runnable
            public final void run() {
                PlayerFragmentV2.this.bg();
            }
        };
        this.t = new Runnable() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.22
            @Override // java.lang.Runnable
            public void run() {
                C1044Mm.e("PlayerFragment", "Pause, release awake clock");
                PlayerFragmentV2.this.bG();
            }
        };
        this.A = new View.OnLayoutChangeListener() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.21
            @Override // android.view.View.OnLayoutChangeListener
            @SuppressLint({"NewApi"})
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Rect rect = new Rect();
                if (PlayerFragmentV2.this.ai != null) {
                    PlayerFragmentV2.this.ai.b(rect);
                    if (PlayerFragmentV2.this.X == null || PlayerFragmentV2.this.f()) {
                        return;
                    }
                    PlayerFragmentV2.this.X.a(rect);
                }
            }
        };
        this.ao = new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PlayerFragmentV2.this.ai == null || PlayerFragmentV2.this.ai.T()) {
                    return;
                }
                PlayerFragmentV2.this.aj.f = SystemClock.elapsedRealtime();
                PlayerFragmentV2.this.bC();
                KeyboardInput keyboardInput = new KeyboardInput("KEYCODE_BUTTON_A", Boolean.FALSE, Double.valueOf(1.0d));
                Logger logger = Logger.INSTANCE;
                long addContext = logger.addContext(keyboardInput);
                if (PlayerFragmentV2.this.aq()) {
                    CLv2Utils cLv2Utils = CLv2Utils.INSTANCE;
                    AppView appView = AppView.pauseButton;
                    cLv2Utils.d(appView, CommandValue.PauseCommand, null, new Focus(appView, null), new PauseCommand(), false, null);
                    PlayerFragmentV2.this.f(false);
                } else {
                    CLv2Utils cLv2Utils2 = CLv2Utils.INSTANCE;
                    AppView appView2 = AppView.playButton;
                    cLv2Utils2.d(appView2, CommandValue.UnpauseCommand, null, new Focus(appView2, null), new UnpauseCommand(), false, null);
                    PlayerFragmentV2.this.aa();
                }
                logger.removeContext(Long.valueOf(addContext));
            }
        };
        this.w = new C1226Tn.c() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.10
            @Override // o.C1226Tn.c
            public void a(Language language) {
                PlayerFragmentV2.this.d(language);
            }

            @Override // o.C1226Tn.c
            public void e() {
                PlayerFragmentV2.this.aa();
                PlayerFragmentV2.this.ax();
            }
        };
        this.am = new Runnable() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.6
            @Override // java.lang.Runnable
            public void run() {
                if (!PlayerFragmentV2.this.bn_() || PlayerFragmentV2.this.aj.g) {
                    C1044Mm.e("PlayerFragment", "METADATA exit");
                    return;
                }
                synchronized (this) {
                    aJY ak = PlayerFragmentV2.this.ak();
                    if (ak != null) {
                        if (PlayerFragmentV2.this.bb() && (PlayerFragmentV2.this.aj.a() != Interactivity.e || !ak.V())) {
                            PlayerFragmentV2.this.e.b(cBA.class, cBA.E.e);
                            PlayerFragmentV2.this.aj.f = 0L;
                        }
                        int o2 = (int) ak.o();
                        if (ak.ab()) {
                            PlayerFragmentV2.this.e.b(cBA.class, new cBA.X(o2));
                        }
                        PlayerFragmentV2.this.e.b(AbstractC5594cBe.class, new AbstractC5594cBe.a(o2));
                        if (PlayerFragmentV2.this.j()) {
                            PlayerFragmentV2.this.e.b(cBA.class, new cBA.C5552n((int) ak.h()));
                        }
                    }
                }
                PlayerFragmentV2.this.a(PlayerFragmentV2.n);
            }
        };
        this.Y = new BroadcastReceiver() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.9
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                C1044Mm.e("PlayerFragment", "mPlayerDeleteIntentReceiver has" + intent.getAction());
                if (PlayerFragmentV2.this.ai != null) {
                    if (PlayerFragmentV2.this.f()) {
                        PlayerFragmentV2.this.aH();
                    } else {
                        PlayerFragmentV2.this.Y();
                    }
                }
            }
        };
        this.G = new BroadcastReceiver() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.7
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                C1044Mm.e("PlayerFragment", "mFinishPipPlayerIntentReceiver has" + intent.getAction());
                if (PlayerFragmentV2.this.f() && "com.netflix.mediaclient.intent.action.END_PIP".equalsIgnoreCase(intent.getAction())) {
                    PlayerFragmentV2.this.aH();
                }
            }
        };
        this.ak = new BroadcastReceiver() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.8
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                PlayerFragmentV2.this.bC();
            }
        };
        this.al = new Runnable() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.11
            @Override // java.lang.Runnable
            public void run() {
                C1044Mm.e("PlayerFragment", "pause has timed out, exit playback");
                InterfaceC1593aHa.b("pauseTimeout calling cleanupExit");
                PlayerFragmentV2.this.Y();
                InterfaceC1593aHa.b("pauseTimeout cleanupExit done");
            }
        };
        this.u = new Runnable() { // from class: o.cyM
            @Override // java.lang.Runnable
            public final void run() {
                PlayerFragmentV2.this.bi();
            }
        };
        this.O = new BroadcastReceiver() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.14
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                PlayerFragmentV2.this.aY();
            }
        };
        this.V = new BroadcastReceiver() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.15
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    PlayerFragmentV2.this.f(true);
                }
            }
        };
    }

    static {
        Config_FastProperty_PlayerUI.b bVar = Config_FastProperty_PlayerUI.Companion;
        k = bVar.d();
        f13300o = bVar.b();
        m = bVar.a();
        n = bVar.e();
        q = bVar.h();
        b = bVar.j();
        l = bVar.c();
        r = bVar.f();
    }

    public static PlayerFragmentV2 a(String str, VideoType videoType, PlayContext playContext, long j, PlayerExtras playerExtras) {
        PlayerFragmentV2 playerFragmentV2 = new PlayerFragmentV2();
        playerFragmentV2.setArguments(c(str, videoType, playContext, j, playerExtras));
        return playerFragmentV2;
    }

    private static Bundle c(String str, VideoType videoType, PlayContext playContext, long j, PlayerExtras playerExtras) {
        Objects.requireNonNull(str);
        Bundle bundle = new Bundle();
        bundle.putString(NetflixActivity.EXTRA_VIDEO_ID, str);
        bundle.putString(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE, videoType.getValue());
        bundle.putParcelable(NetflixActivity.EXTRA_PLAY_CONTEXT, playContext);
        bundle.putLong("CL_START_PLAY_SESSION_ID", j);
        bundle.putParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS, playerExtras);
        return bundle;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.au = this.mPlayerRepositoryFactory.e(this.e.d());
        this.ax = this.mPlayerRepositoryFactory.d();
        this.as = new PlayerA11yRepository(new drO() { // from class: o.cyk
            @Override // o.drO
            public final Object invoke() {
                Context bn;
                bn = PlayerFragmentV2.this.bn();
                return bn;
            }
        }, this);
        if (arguments != null) {
            this.playerFragmentCL.e(arguments.getLong("CL_START_PLAY_SESSION_ID", 0L));
        }
        C8054ddD.e((Activity) by_());
        ao().getAttributes().buttonBrightness = 0.0f;
        this.aj.d();
        this.aj.f13792o = true;
        this.U = false;
        AbstractC8266dhD.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Context bn() {
        return getContext();
    }

    private void bs() {
        ViewUtils.a(ao());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bg() {
        if (C8054ddD.l(bj_())) {
            return;
        }
        by();
    }

    private void by() {
        C1044Mm.a("PlayerFragment", "onPlatformReady");
        C1052Mw i = AbstractApplicationC1040Mh.getInstance().i();
        this.D = i.d();
        this.z = i.j();
        this.R = new C7449cwS(i.i(), this.D, this, new C7449cwS.a() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.20
            @Override // o.C7449cwS.a
            public void a(boolean z) {
                PlayerFragmentV2.this.e.b(cBA.class, new cBA.U(z));
            }

            @Override // o.C7449cwS.a
            public void a() {
                if (PlayerFragmentV2.this.aq()) {
                    PlayerFragmentV2.this.aa();
                }
            }
        });
        if (this.D == null || this.z == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayerFragment mConfig isNull ");
            sb.append(this.D == null);
            sb.append(" mErrorHandler isNull ");
            sb.append(this.z == null);
            InterfaceC1598aHf.a(sb.toString());
            bW();
            return;
        }
        if (aQD.c() || aQB.c() || this.D.ar()) {
            C4779bmN.b(bj_()).e();
        }
        C1044Mm.a("PlayerFragment", "onPlatformReady openSession.");
        bE();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C7639czx.c.d, (ViewGroup) null, false);
        this.ag = viewGroup2;
        return viewGroup2;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    @SuppressLint({"AutoDispose"})
    public void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1044Mm.a("PlayerFragment", "onViewCreated");
        Bundle arguments = getArguments();
        if (arguments != null) {
            PlayerExtras playerExtras = (PlayerExtras) arguments.getParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS);
            if (playerExtras != null) {
                this.x = playerExtras.a();
            }
            this.f.add(this.at.d(arguments).subscribe(new Consumer() { // from class: o.cyE
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PlayerFragmentV2.this.d((C5296bwA.d) obj);
                }
            }));
        }
        view.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.19
            @Override // android.view.View.AccessibilityDelegate
            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view2, AccessibilityEvent accessibilityEvent) {
                if (accessibilityEvent.getEventType() == 32768) {
                    PlayerFragmentV2.this.aj.f = SystemClock.elapsedRealtime();
                }
                return super.onRequestSendAccessibilityEvent(viewGroup, view2, accessibilityEvent);
            }
        });
        aJ();
        new cBD(this, this.e.d(cBA.class), this.e.d(AbstractC5594cBe.class), this.e.d(), view, true, new cBK() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.23
            @Override // o.cBK
            public ConstraintLayout e() {
                return (ConstraintLayout) view.findViewById(C7639czx.e.c);
            }

            @Override // o.cBK
            public ConstraintLayout d() {
                return (ConstraintLayout) view.findViewById(C7639czx.e.h);
            }

            @Override // o.cBK
            public FrameLayout c() {
                return (FrameLayout) view.findViewById(C7639czx.e.j);
            }
        });
        if (f()) {
            bD();
        }
        C1044Mm.a("PlayerFragment", "onViewCreated registerCallback");
        AbstractApplicationC1040Mh.getInstance().i().b(this.W);
        bk_().add(this.as.e().subscribe(new Consumer() { // from class: o.cyD
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.this.b((Boolean) obj);
            }
        }));
        bk_().add(this.as.b().subscribe(new Consumer() { // from class: o.cyG
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.this.a((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(C5296bwA.d dVar) {
        if (dVar instanceof C5296bwA.d.b) {
            this.an = ((C5296bwA.d.b) dVar).a();
        } else {
            C1044Mm.a("PlayerFragment", "not using PlaybackSession2");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Boolean bool) {
        this.e.b(cBA.class, new cBA.C5540b(bool.booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.y = bool.booleanValue();
    }

    public void b(FoldingFeature foldingFeature, int i) {
        if (foldingFeature == null) {
            if (this.M) {
                this.M = false;
                this.e.b(cBA.class, new cBA.C5543e(0));
                ViewUtils.b(this.ag, 0, true);
            }
        } else if (ak() != null) {
            this.M = true;
            this.H = i;
            this.e.b(cBA.class, new cBA.C5543e(i));
            ViewUtils.b(this.ag, i, true);
        }
    }

    @Deprecated
    private void d(InterfaceC5198buI interfaceC5198buI, IPlayer.PlaybackType playbackType, PlayContext playContext, long j, InteractiveMoments interactiveMoments, C7535cxz c7535cxz) {
        this.Q = new C7535cxz(interfaceC5198buI, playContext, j, "postplay", null, interactiveMoments);
        this.P = playbackType;
        this.T = c7535cxz;
    }

    private void bX() {
        if (f() && C1885aRw.c()) {
            C7631czp ba = ba();
            if (ba == null) {
                ba = new C7631czp(true, "postplay", null, false);
            }
            d(this.Q.m(), true, VideoType.EPISODE, this.Q.b(), false, true, this.Q.i(), ba);
        }
    }

    public void d(String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, long j) {
        this.e.b(cBA.class, cBA.aj.b);
        this.playerFragmentCL.e(j);
        c(str, videoType, playContext, playerExtras, TaskMode.FROM_CACHE_OR_NETWORK);
    }

    @SuppressLint({"AutoDispose"})
    private void b(String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, TaskMode taskMode) {
        if (C8054ddD.l(bj_()) || c(PlaybackLauncher.PlayLaunchedBy.d)) {
            return;
        }
        this.f.add(this.au.a(str, videoType, playContext, playerExtras, taskMode).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: o.cyw
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.this.c((C5593cBd) obj);
            }
        }, new Consumer() { // from class: o.cyF
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.this.i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Throwable th) {
        bw();
    }

    @SuppressLint({"AutoDispose"})
    public void c(String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, TaskMode taskMode) {
        if (C8054ddD.l(bj_())) {
            return;
        }
        this.f.add(this.au.c(str, videoType, playContext, playerExtras, taskMode, aM(), c(PlaybackLauncher.PlayLaunchedBy.d)).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: o.cya
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.this.b((C5593cBd) obj);
            }
        }, new Consumer() { // from class: o.cyc
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.this.c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        if (th instanceof StatusCodeError) {
            StatusCodeError statusCodeError = (StatusCodeError) th;
            if (!ConnectivityUtils.n(getContext())) {
                bt();
                return;
            } else if (statusCodeError.d() == InterfaceC1078Nw.af.c()) {
                i(getString(R.o.dF));
                return;
            } else {
                Y();
                return;
            }
        }
        Y();
        if (this.U) {
            InterfaceC1598aHf.a(new C1596aHd("PlayerFragment No data, finishing up the player in Playgraph test").d(th).b(false));
        } else {
            InterfaceC1598aHf.a(new C1596aHd("PlayerFragment No data, finishing up the player").d(th).b(false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(C5593cBd c5593cBd) {
        if (c5593cBd.h() == InterfaceC1078Nw.aJ) {
            InterfaceC5198buI j = c5593cBd.j();
            this.S = j;
            this.e.b(cBA.class, new cBA.V(j));
            return;
        }
        bw();
    }

    private void bw() {
        this.S = null;
        this.e.b(cBA.class, new cBA.V(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(C5593cBd c5593cBd) {
        this.e.b(cBA.class, new cBA.ax(c5593cBd.j()));
        if (c5593cBd.j() == null || c5593cBd.h().i()) {
            if (!ConnectivityUtils.n(getContext())) {
                bt();
                return;
            } else if (c5593cBd.h() == InterfaceC1078Nw.af) {
                i(getString(R.o.dF));
                return;
            } else {
                InterfaceC1598aHf.a(new C1596aHd("PlayerFragment No data, finishing up the player. Details=" + c5593cBd.j() + "Status is " + c5593cBd.h()).b(false));
                Y();
                return;
            }
        }
        InteractiveSummary az_ = c5593cBd.j().az_();
        if (az_ != null && az_.titleNeedsAppUpdate()) {
            c(c5593cBd.j(), c5593cBd.b(), c5593cBd.e(), c5593cBd.c(), c5593cBd.d(), c5593cBd.a());
        } else if (az_ != null && az_.features().videoMoments() && az_.features().supportedErrorDialogs().contains("fetchMomentsFailure") && c5593cBd.d() == null) {
            i(getString(R.o.cm));
        } else if (az_ != null && az_.showAnimationWarningPopup(getContext())) {
            b(c5593cBd.j(), c5593cBd.b(), c5593cBd.e(), c5593cBd.c(), c5593cBd.d(), c5593cBd.a());
        } else if (this.U) {
            d(c5593cBd.j(), c5593cBd.b(), c5593cBd.e(), c5593cBd.c(), c5593cBd.d(), c5593cBd.a());
        } else {
            e(c5593cBd.j(), c5593cBd.b(), c5593cBd.e(), c5593cBd.c(), c5593cBd.d(), c5593cBd.a());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        this.e.b(cBA.class, cBA.I.e);
        super.onStart();
        bk();
        if (be() || ak() == null || ak().W()) {
            return;
        }
        bO();
    }

    private void bW() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (!f()) {
            activity.finish();
        } else {
            activity.finishAndRemoveTask();
        }
    }

    private boolean be() {
        if (!C8141del.c(getActivity())) {
            try {
                if (!getActivity().isInMultiWindowMode()) {
                    if (!f()) {
                    }
                }
                return false;
            } catch (Exception e) {
                C1044Mm.e("PlayerFragment", "Error checking Playback Model " + e);
            }
        }
        return true;
    }

    private void bO() {
        aa();
    }

    private void aE() {
        f(true);
        bQ();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    @SuppressLint({"NewApi"})
    public void onResume() {
        C1044Mm.e("PlayerFragment", "onResume called");
        super.onResume();
        if (C8159dfC.f(NetflixApplication.getInstance()) && this.X == null && getActivity() != null) {
            this.X = new C7516cxg(getActivity(), f(), ap(), new drM() { // from class: o.cyl
                @Override // o.drM
                public final Object invoke(Object obj) {
                    dpR d2;
                    d2 = PlayerFragmentV2.this.d((Boolean) obj);
                    return d2;
                }
            }, new drO() { // from class: o.cym
                @Override // o.drO
                public final Object invoke() {
                    dpR bo;
                    bo = PlayerFragmentV2.this.bo();
                    return bo;
                }
            }, new drO() { // from class: o.cyo
                @Override // o.drO
                public final Object invoke() {
                    dpR bq;
                    bq = PlayerFragmentV2.this.bq();
                    return bq;
                }
            }, new drO() { // from class: o.cys
                @Override // o.drO
                public final Object invoke() {
                    dpR bl;
                    bl = PlayerFragmentV2.this.bl();
                    return bl;
                }
            }, new drO() { // from class: o.cyr
                @Override // o.drO
                public final Object invoke() {
                    dpR bm;
                    bm = PlayerFragmentV2.this.bm();
                    return bm;
                }
            });
        }
        bs();
        d(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR d(Boolean bool) {
        if (bool.booleanValue()) {
            NetflixApplication.getInstance().D().c(true);
            return null;
        }
        NetflixApplication.getInstance().D().c(false);
        this.F = true;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR bo() {
        aa();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR bq() {
        aI();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR bl() {
        aA();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR bm() {
        aB();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i) {
        e(cBA.C5541c.c);
        FragmentActivity activity = getActivity();
        int i2 = getResources().getConfiguration().orientation;
        if (activity == null || this.ad || i2 == i) {
            return;
        }
        activity.setRequestedOrientation(i);
        if (i == 13) {
            m(false);
        }
        e(new cBA.C5549k(true, i != 1));
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onPause() {
        C1044Mm.e("PlayerFragment", "onPause called");
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"NewApi"})
    public void onStop() {
        boolean f = f();
        if (!be()) {
            aE();
        }
        PlayerPictureInPictureManager playerPictureInPictureManager = this.X;
        if (playerPictureInPictureManager != null) {
            playerPictureInPictureManager.i();
            this.X = null;
        }
        super.onStop();
        this.e.b(cBA.class, cBA.C5550l.a);
        aJY ajy = this.ai;
        if (ajy != null && ajy.U() && this.ai.u()) {
            if (!this.ai.ab()) {
                this.playerFragmentCL.d();
            }
            C1044Mm.e("PlayerFragment", "PlayerActivity::onStop done, player is backgrounded");
            return;
        }
        if (this.aj.f13792o) {
            C1044Mm.e("PlayerFragment", "Start play is in progress and user canceled playback");
            this.aj.f13792o = false;
        }
        if (f) {
            aH();
        } else {
            Y();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroy() {
        C1044Mm.e("PlayerFragment", "====> Destroying PlayerFragment " + hashCode());
        this.playerFragmentCL.b();
        AbstractApplicationC1040Mh.getInstance().i().c(this.W);
        aJY ajy = this.ai;
        if (ajy != null && ajy.u()) {
            Y();
        }
        NetflixApplication.getInstance().D().c(false);
        ao().getAttributes().buttonBrightness = -1.0f;
        bG();
        this.I.removeCallbacks(this.al);
        this.I.removeCallbacks(this.t);
        AbstractC8266dhD.b(false);
        this.av = null;
        super.onDestroy();
        C1044Mm.e("PlayerFragment", "====> Destroying PlayerFragment done");
    }

    public Window ao() {
        return requireActivity().getWindow();
    }

    public boolean ar() {
        return getActivity() != null && C8150deu.y(getActivity());
    }

    private void aL() {
        C1044Mm.b("PlayerFragment", "Playback verified - completing init process...");
        if (ag() == null) {
            InterfaceC1598aHf.a("Invalid state, continue init after play verify on a null asset");
            bW();
            return;
        }
        bL();
        bu();
    }

    private void bu() {
        a((String) null);
    }

    @SuppressLint({"AutoDispose"})
    private void a(final String str) {
        this.f.add(this.at.c().subscribe(new Consumer() { // from class: o.cyn
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.this.b(str, (AbstractC5100bsQ) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void b(AbstractC5100bsQ abstractC5100bsQ, String str) {
        C7535cxz af;
        PlayContext playContext;
        PlaybackExperience playbackExperience;
        VideoType videoType;
        InterfaceC5160btX aj = aj();
        PlayContext y_ = y_();
        long aQ = aQ();
        if (!aG() || aj == null || (af = af()) == null) {
            return;
        }
        if (af.h().H() && str == null) {
            InterfaceC1598aHf.a("Got to loadVideoAndChangeState for content preview with no pin supplied!");
            Y();
            return;
        }
        PlaybackExperience j = af.j();
        VideoType an = an();
        if (this.aj.b() && this.af != null && !j()) {
            aj = this.af.h();
            PlayContext b2 = this.af.b();
            PlaybackExperience j2 = this.af.j();
            VideoType videoType2 = VideoType.MOVIE;
            bN();
            playContext = b2;
            playbackExperience = j2;
            videoType = videoType2;
            aQ = 0;
        } else {
            this.aj.d(false);
            if (this.prePlayComposeEnabled.get().booleanValue()) {
                this.e.b(cBA.class, AbstractC5599cBj.a.a);
            }
            playContext = y_;
            playbackExperience = j;
            videoType = an;
        }
        if (aj.aH_() == null) {
            InterfaceC1598aHf.a("playable Id is null " + aj);
            Y();
            return;
        }
        long f = C8168dfL.f(aj.aH_());
        if (f == 0) {
            InterfaceC1598aHf.a("playable Id is 0 " + aj);
            Y();
            return;
        }
        aJY ak = ak();
        if (ak != null) {
            ak.setPlayerStatusChangeListener(this.az);
            ak.setPlayProgressListener(this.ar);
            ak.setLiveWindowListener(this.C);
            ak.setErrorListener(this.aq);
            C7490cxG aS = aS();
            aS.a(C8168dfL.f(af.m()));
            ak.setAdsListener(aS);
            ak.setViewInFocus(true);
            ak.setPlayerBackgroundable(bf());
            if (ar()) {
                m(true);
            }
            if (this.aj.a() == Interactivity.e && !this.aj.b()) {
                C1044Mm.a("PlayerFragment", "BranchedVideoView");
                this.p = 1.0f;
                ak.setSegmentTransitionEndListener(this);
                cVH cvh = new cVH();
                LegacyBranchingBookmark legacyBranchingBookmark = new LegacyBranchingBookmark(f, aQ);
                ak.c(aX(), abstractC5100bsQ, legacyBranchingBookmark.c, videoType, cvh, playContext, legacyBranchingBookmark, true, this.aF, str, bc());
            } else if (ak instanceof C1677aKd) {
                ak.setSegmentTransitionEndListener(this);
                PlaylistTimestamp playlistTimestamp = new PlaylistTimestamp(aj.aH_(), aj.aH_(), aQ);
                if ((ak.H() instanceof C5208buS) && this.U) {
                    this.ab = (C5208buS) ak.H();
                } else {
                    this.ab = new C5208buS.b(aj.aH_()).a(aj.aH_(), new C5273bve.b(f).d()).d(aj.aH_()).a();
                    ((C1677aKd) ak).e(aX(), abstractC5100bsQ, this.ab, videoType, playbackExperience, playContext, playlistTimestamp, true, this.aF, str, bc());
                }
            } else {
                ak.c(aX(), abstractC5100bsQ, aj.aH_(), videoType, playbackExperience, playContext, new LegacyBranchingBookmark(f, aQ), true, this.aF, str, bc());
            }
            if (bd()) {
                e(af);
                return;
            }
            return;
        }
        InterfaceC1598aHf.a("No Videoview to start with");
        Y();
    }

    private boolean aG() {
        C7535cxz c7535cxz;
        if (!bn_() || (c7535cxz = this.f13301J) == null) {
            C1044Mm.e("PlayerFragment", "fragment is not valid. ");
            return false;
        }
        InterfaceC5160btX h = c7535cxz.h();
        if (h == null) {
            C1044Mm.d("PlayerFragment", "trying to load a video with a null playable.");
            return false;
        }
        if (j()) {
            if (c(this.offlineApi.b(h.aH_()))) {
                C1044Mm.a("PlayerFragment", "continue with offline player");
            } else {
                C1044Mm.a("PlayerFragment", "switching to streaming player");
                this.f13301J.d(IPlayer.PlaybackType.StreamingPlayback);
                aK();
            }
        }
        if (!ConnectivityUtils.n(getActivity()) && !j()) {
            C1044Mm.e("PlayerFragment", "Raising no connectivity warning");
            bt();
            return false;
        } else if (aY()) {
            return true;
        } else {
            C1044Mm.e("PlayerFragment", "Network check fails");
            return false;
        }
    }

    private void bI() {
        this.at.e();
    }

    public void f(boolean z) {
        C1044Mm.a("playback paused.");
        aJY ak = ak();
        if (ak == null || !aq()) {
            return;
        }
        ak.d(z ? PlayerControls.PlayerPauseType.e : PlayerControls.PlayerPauseType.c);
    }

    public void aa() {
        C1044Mm.a("playback resumed");
        aJY ak = ak();
        if (ak != null) {
            bk();
            ak.ak();
        }
    }

    private void d(long j, boolean z) {
        this.aj.i = true;
        c(j, z);
    }

    private void c(long j, boolean z) {
        InteractiveMoments e;
        C5639cCw c5639cCw;
        IPlaylistControl e2;
        aJY ak = ak();
        if (ak != null) {
            if (this.aj.a() != Interactivity.e) {
                if (z) {
                    ak.b(ak.o() + j);
                    return;
                } else {
                    ak.b(j);
                    return;
                }
            }
            C7535cxz af = af();
            if (af == null || (e = af.e()) == null || (e2 = (c5639cCw = C5639cCw.e).e(ak)) == null || ak.T()) {
                return;
            }
            PlaylistMap H = e2.H();
            if (z) {
                this.aj.k = c5639cCw.b(ak, e2.l(), e2.H(), j, e.momentsBySegment(), this.e);
            } else if (!ak.S() || H == null) {
            } else {
                PlaylistTimestamp a = new LegacyBranchingBookmark(C8168dfL.f(af.m()), j).a(H);
                if (a == null) {
                    a = new LegacyBranchingBookmark(C8168dfL.f(af.m()), 0L).a(H);
                }
                if (a != null) {
                    aa();
                    ak.d(a);
                }
            }
        }
    }

    public void m(boolean z) {
        if (!ar()) {
            this.N = z;
        }
        aJY ak = ak();
        if (ak != null) {
            ak.setZoom(z);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.hardKeyboardHidden;
        if (i == 1) {
            C1044Mm.e("PlayerFragment", "keyboard out");
        } else if (i == 2) {
            C1044Mm.e("PlayerFragment", "keyboard in");
        }
        if (!f()) {
            if (configuration.orientation == 1) {
                m(true);
            } else {
                m(this.N);
            }
        }
        InterfaceC4360bcz.e().e(C8159dfC.a(requireContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void bB() {
        C1044Mm.e("PlayerFragment", "Pause, release awake clock after 2 minutes.");
        bT();
        this.I.postDelayed(this.t, k);
        this.I.postDelayed(this.al, q);
        C1044Mm.a("PlayerFragment", "doPause() remove reporting");
        PlayerPictureInPictureManager playerPictureInPictureManager = this.X;
        if (playerPictureInPictureManager != null) {
            playerPictureInPictureManager.b(PlayerPictureInPictureManager.PlaybackPipStatus.e);
        }
        this.e.b(cBA.class, cBA.T.b);
        this.playerFragmentCL.e();
        if (this.pauseAdsEnabled.get().booleanValue() && this.aj.e && !f()) {
            C1044Mm.e("PlayerFragment", "Playback Paused by an explicit user pause action");
            this.pauseAdsManager.d(this);
        }
    }

    @Override // o.InterfaceC7469cwm
    public void b() {
        if (this.pauseAdsEnabled.get().booleanValue()) {
            aa();
        } else {
            C1044Mm.d("PlayerFragment", "onResumePlaybackFromPauseAds called when pauseAdsEnabled is false");
        }
    }

    private void bT() {
        if (f()) {
            return;
        }
        e(cBA.C5548j.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bA() {
        UmaAlert x;
        this.aj.e = false;
        aJY ajy = this.ai;
        if (ajy != null && this.X != null) {
            ajy.addOnLayoutChangeListener(this.A);
        }
        float f = this.p;
        if (f != 1.0f) {
            this.ai.setPlaybackSpeed(f);
        }
        C8166dfJ.d();
        C7535cxz c7535cxz = this.f13301J;
        if (c7535cxz == null || c7535cxz.h() == null || C8054ddD.l(getActivity())) {
            if (bn_()) {
                this.playerFragmentCL.e(new Error(RootCause.clientFailure.toString(), null, null));
            }
            this.aj.f13792o = false;
            Y();
        } else if (bl_().x() != null && ConfigFastPropertyFeatureControlConfig.Companion.f() && NetflixActivity.isTutorialOn() && (x = bl_().x()) != null && x.tooltipAnchor() == null && !x.isConsumed()) {
            f(false);
            c(x);
        } else {
            this.e.b(cBA.class, cBA.ao.d);
            aW();
            C1044Mm.a(aR() + " playback started");
            if (C8153dex.F()) {
                this.playerPrefetchRepositoryLazy.get().d(this.f13301J.m());
            }
            if (!C8153dex.H() || this.f13301J.m() == null) {
                return;
            }
            b(this.f13301J.m(), this.f13301J.l(), y_(), aU(), TaskMode.FROM_CACHE_OR_NETWORK);
        }
    }

    private String aR() {
        C7535cxz c7535cxz = this.f13301J;
        if (c7535cxz == null) {
            return "Unknown";
        }
        int i = AnonymousClass18.e[c7535cxz.f().ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "Unknown" : "Offline" : "Live" : "Streaming";
    }

    @SuppressLint({"NewApi"})
    private void aW() {
        int i;
        int i2;
        aJY ak;
        C1044Mm.e("PlayerFragment", "handleEveryPlaybackStart.");
        aJY ajy = this.ai;
        if (ajy != null) {
            int o2 = (int) ajy.o();
            i = (int) this.ai.h();
            i2 = o2;
        } else {
            i = 0;
            i2 = 0;
        }
        C7535cxz af = af();
        long c = af != null ? af.c() : 0L;
        this.e.b(cBA.class, new cBA.J(af));
        if (aQJ.j().e() && aU() != null) {
            this.e.b(cBA.class, new cBA.S(aU().f()));
        }
        C1044Mm.a("PlayerFragment", "handleEveryPlaybackStart, position: %d,  partialDownloadPosition: %d, duration: %d", Integer.valueOf(i2), Integer.valueOf(i), Long.valueOf(c));
        this.aj.b = true;
        d(by_());
        this.e.b(cBA.class, cBA.L.c);
        this.e.b(cBA.class, new cBA.ai(af, i2, (int) c, am().c(), this.ai.R(), this.ai.K(), aP(), this.ai.x()));
        this.aj.f13792o = false;
        bY();
        PlayerPictureInPictureManager playerPictureInPictureManager = this.X;
        if (playerPictureInPictureManager != null && playerPictureInPictureManager.c() != PlayerPictureInPictureManager.PlaybackPipStatus.d && (ak = ak()) != null && ak.X()) {
            this.X.a(ak.L());
            this.X.b(PlayerPictureInPictureManager.PlaybackPipStatus.b);
            Rect rect = new Rect();
            ak.b(rect);
            this.X.a(rect);
        }
        b(af.g().D());
        if (this.aj.i) {
            C1044Mm.e("PlayerFragment", "Dismissing buffering progress bar...");
            this.aj.i = false;
        }
        bk();
        this.L = false;
        bx();
    }

    @SuppressLint({"AutoDispose"})
    private void b(final String str) {
        if (C8168dfL.g(str)) {
            C1044Mm.e("PlayerFragment", "box short URL was empty");
            return;
        }
        this.f.add(this.imageLoaderRepository.b(GetImageRequest.c(this).a(str).a()).subscribe(new Consumer() { // from class: o.cyf
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.this.b((GetImageRequest.a) obj);
            }
        }, new Consumer() { // from class: o.cyg
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.e(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(GetImageRequest.a aVar) {
        b(aVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(String str, Throwable th) {
        C1044Mm.j("PlayerFragment", "failed to download image %s, error: %s", str, th);
    }

    private void b(Bitmap bitmap) {
        String a;
        C7535cxz af = af();
        if (af == null) {
            return;
        }
        InterfaceC4342bch.c cVar = new InterfaceC4342bch.c();
        cVar.a(bitmap);
        cVar.d(af.c());
        InterfaceC5160btX h = af.h();
        cVar.b(h.aI_());
        if (af.l() == VideoType.EPISODE) {
            if (h.aU_() || C8168dfL.g(h.aK_())) {
                a = C8168dfL.a(R.o.du, cVar.a());
            } else {
                int i = R.o.ds;
                String aK_ = h.aK_();
                int aw_ = h.aw_();
                a = C8168dfL.a(i, aK_, Integer.valueOf(aw_), h.aI_());
            }
            cVar.a(a);
        }
        InterfaceC4360bcz.e().a(C8168dfL.f(h.aH_()), cVar);
    }

    private void bN() {
        bl_().j().d(this.af.h().aH_(), this.af.d(), new C5087bsD("PlayerFragment") { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.2
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bz() {
        C1044Mm.e("PlayerFragment", "onCompletion, check if we are in postplay or in preplay");
        bV();
        this.playerFragmentCL.e((Error) null);
        this.e.b(cBA.class, cBA.C5559u.b);
        if (this.j != null && bn_() && !f()) {
            this.j.e(new drM() { // from class: o.cyR
                @Override // o.drM
                public final Object invoke(Object obj) {
                    dpR d2;
                    d2 = PlayerFragmentV2.this.d((AbstractC5531cAw) obj);
                    return d2;
                }
            });
        }
        if (bh()) {
            C1044Mm.e("PlayerFragment", "onCompletion, In PostPlay, allow screen to lock after timeout...");
            this.I.postDelayed(this.t, k);
        } else if (this.aj.b()) {
            C1044Mm.e("PlayerFragment", "OnCompletion of preplay.");
            C7535cxz c7535cxz = this.f13301J;
            if (c7535cxz != null) {
                this.aj.d(C5639cCw.e.e(c7535cxz.g().az_(), c7535cxz.e()));
                InteractiveMoments e = c7535cxz.e();
                if (e != null) {
                    this.e.b(cBA.class, new cBA.C5546h(e));
                }
                c(c7535cxz);
            }
        } else {
            C1044Mm.e("PlayerFragment", "OnCompletion - exiting.");
            if (f()) {
                aH();
            } else if (this.U) {
            } else {
                Y();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR d(AbstractC5531cAw abstractC5531cAw) {
        this.e.b(cBA.class, cBA.C5541c.c);
        this.e.b(cBA.class, cBA.F.a);
        this.e.b(cBA.class, new AbstractC5597cBh.a(abstractC5531cAw, true));
        return dpR.c;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean y() {
        C1044Mm.a("PlayerFragment", "performUpAction");
        CLv2Utils cLv2Utils = CLv2Utils.INSTANCE;
        AppView appView = AppView.backButton;
        cLv2Utils.d(appView, CommandValue.BackCommand, null, new Focus(appView, null), new BackCommand(), false, null);
        this.playerFragmentCL.d();
        aF();
        if (this.F && bj_() != null) {
            bj_().finishAndRemoveTask();
        }
        b(this.f13301J, PlaybackLauncher.PlayLaunchedBy.d, PlaybackLauncher.PlayLaunchedBy.c);
        return true;
    }

    public boolean c(PlaybackLauncher.PlayLaunchedBy... playLaunchedByArr) {
        NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            Intent intent = bj_.getIntent();
            if (intent.hasExtra("play_launched_by")) {
                int intExtra = intent.getIntExtra("play_launched_by", PlaybackLauncher.PlayLaunchedBy.j.ordinal());
                C1044Mm.c("PlayerFragment", "launchDetailScreenIfRequired launchedBy=%d", Integer.valueOf(intExtra));
                if (intExtra >= 0 && intExtra < PlaybackLauncher.PlayLaunchedBy.values().length) {
                    PlaybackLauncher.PlayLaunchedBy playLaunchedBy = PlaybackLauncher.PlayLaunchedBy.values()[intExtra];
                    for (PlaybackLauncher.PlayLaunchedBy playLaunchedBy2 : playLaunchedByArr) {
                        if (playLaunchedBy == playLaunchedBy2) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private void b(C7535cxz c7535cxz, PlaybackLauncher.PlayLaunchedBy... playLaunchedByArr) {
        if (c7535cxz == null || bj_() == null) {
            return;
        }
        boolean z = c(playLaunchedByArr) || this.F;
        C1044Mm.c("PlayerFragment", "launchDetailScreenIfRequired launchDetailsScreen=%b", Boolean.valueOf(z));
        if (z) {
            PlayContext b2 = c7535cxz.b();
            if (c7535cxz.h() != null) {
                VideoType l2 = c7535cxz.l();
                if (l2 == VideoType.EPISODE) {
                    l2 = VideoType.SHOW;
                }
                String aO_ = c7535cxz.h().aO_();
                InterfaceC3643bFl.a(getContext()).b(bj_(), l2, aO_, c7535cxz.h().aC_(), new TrackingInfoHolder(b2.j()).d(Integer.parseInt(aO_), b2), "PlayerFragment", new PlayerExtras());
            }
        }
    }

    private void aF() {
        aOV aov;
        InterfaceC7607czR interfaceC7607czR = this.j;
        if (interfaceC7607czR != null) {
            interfaceC7607czR.d();
        }
        b(IClientLogging.CompletionReason.success);
        bU();
        bV();
        if (aQD.c() || aQB.c() || ((aov = this.D) != null && aov.ar())) {
            C4779bmN.a();
        }
    }

    public void Y() {
        C1044Mm.e("PlayerFragment", "cleanupAndExit");
        aF();
        this.aj.l = IPlayerFragment.PlayerFragmentState.ACTIVITY_NOTREADY;
        C1044Mm.e("PlayerFragment", "cleanupAndExit calling finish");
        FragmentActivity activity = getActivity();
        if (C8054ddD.l(activity) || activity.isChangingConfigurations()) {
            return;
        }
        bW();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aH() {
        C1044Mm.e("PlayerFragment", "cleanupPip");
        aF();
        this.aj.l = IPlayerFragment.PlayerFragmentState.ACTIVITY_NOTREADY;
        C1044Mm.e("PlayerFragment", "cleanupAndExit calling finish");
        FragmentActivity activity = getActivity();
        if (C8054ddD.l(activity) || activity.isChangingConfigurations() || activity.isFinishing() || !f()) {
            return;
        }
        activity.finishAndRemoveTask();
    }

    private void bU() {
        C1044Mm.e("PlayerFragment", "stopPlayback");
        if (this.aj.f13792o) {
            C1044Mm.e("PlayerFragment", "Start play is in progress and user canceled playback");
            this.aj.f13792o = false;
        }
        IPlayerFragment.PlayerFragmentState playerFragmentState = this.aj.l;
        if (playerFragmentState == IPlayerFragment.PlayerFragmentState.ACTIVITY_SRVCMNGR_READY || playerFragmentState == IPlayerFragment.PlayerFragmentState.ACTIVITY_PLAYER_LOADING_NEXT) {
            aK();
            this.aj.l = IPlayerFragment.PlayerFragmentState.ACTIVITY_NOTREADY;
            if (this.f13301J != null) {
                bv();
            }
        }
        this.f13301J = null;
        InterfaceC5297bwB interfaceC5297bwB = (InterfaceC5297bwB) C1332Xp.b(InterfaceC5297bwB.class);
        if (interfaceC5297bwB.e() == this.aw) {
            this.aw = null;
            interfaceC5297bwB.a((InterfaceC5297bwB.a) null);
        }
    }

    private void bx() {
        C7535cxz c7535cxz = this.f13301J;
        if (c7535cxz == null || c7535cxz.h() == null) {
            return;
        }
        this.playerFragmentCL.b(this.x, this.f13301J, aV(), this.f13301J.i(), j(), this.offlineApi, y_());
        C1044Mm.b("PlayerFragment", "Intent PLAYER_PLAY_START sent");
    }

    @Override // o.InterfaceC7451cwU
    public void k() {
        if (this.ai == null) {
            InterfaceC1598aHf.a("mVideoView should not be null in _displayPlayerSpeedDialog()");
            return;
        }
        if (this.ae == null) {
            this.ae = new bDK(by_(), this.ai, this.e);
        }
        this.ae.a(this.ai);
    }

    @Override // o.InterfaceC7451cwU
    public void d(float f) {
        aJY ajy = this.ai;
        if (ajy == null) {
            InterfaceC1598aHf.a("mVideoView should not be null in _playerBrightnessChanged()");
        } else {
            aJV.a(ajy, Math.min(1.0f, Math.max(0.0f, f)));
        }
    }

    @Override // o.InterfaceC7451cwU
    public void P() {
        aJY ajy = this.ai;
        if (ajy != null) {
            ajy.af();
            this.e.b(cBA.class, new cBA.C5554p(aP()));
        }
    }

    @Override // o.InterfaceC7451cwU
    public void S() {
        aJY ajy = this.ai;
        if (ajy == null) {
            InterfaceC1598aHf.a("mVideoView should not be null in _playerBrightnessChanged()");
        } else {
            ajy.ad();
        }
    }

    @Override // o.InterfaceC7451cwU
    public void O() {
        this.p = this.ai.x();
        this.aj.k = true;
    }

    @Override // o.InterfaceC7451cwU
    public void a(boolean z) {
        if (!z) {
            this.ap = Logger.INSTANCE.startSession(new Presentation(AppView.playbackControls, null));
        } else if (Session.doesSessionExist(this.ap)) {
            Logger.INSTANCE.endSession(this.ap);
        }
    }

    @Override // o.InterfaceC7451cwU
    public void a(SkipCreditsType skipCreditsType) {
        this.playerFragmentCL.c(skipCreditsType);
    }

    @Override // o.InterfaceC7451cwU
    public void p() {
        this.playerFragmentCL.c();
    }

    @Override // o.InterfaceC7451cwU
    public void s() {
        InterfaceC4208baF offlineAgentOrNull = NetflixActivity.getOfflineAgentOrNull(bj_());
        if (offlineAgentOrNull != null) {
            offlineAgentOrNull.b(aj().aH_());
        } else {
            InterfaceC1598aHf.a("OfflineAgent is null.");
        }
    }

    @Override // o.InterfaceC7451cwU
    public void X() {
        InterfaceC4208baF offlineAgentOrNull = NetflixActivity.getOfflineAgentOrNull(bj_());
        if (offlineAgentOrNull != null) {
            offlineAgentOrNull.h(aj().aH_());
        } else {
            InterfaceC1598aHf.a("OfflineAgent is null.");
        }
    }

    @Override // o.InterfaceC7451cwU
    public void g(boolean z) {
        if (ak() != null) {
            ak().setViewInFocus(z);
        }
    }

    private void bv() {
        C7535cxz c7535cxz;
        if (!bn_() || (c7535cxz = this.f13301J) == null || c7535cxz.h() == null) {
            return;
        }
        this.playerFragmentCL.d();
        C8082ddf.a().b(this.f13301J.h().aX_(), this.f13301J.h().H());
        bQ();
        C1044Mm.b("PlayerFragment", "Intent PLAYER_PLAY_STOP sent");
    }

    private void bQ() {
        InterfaceC7303ctf interfaceC7303ctf = this.offlineApi;
        String aM = aM();
        C7535cxz c7535cxz = this.f13301J;
        interfaceC7303ctf.e(aM, c7535cxz == null ? null : C5096bsM.b(c7535cxz.m(), this.f13301J.i()));
    }

    private String aM() {
        return C8126deW.a(AbstractApplicationC1040Mh.getInstance().i().k());
    }

    private void bS() {
        C7535cxz c7535cxz;
        aJY ajy;
        NetflixActivity bj_ = bj_();
        if (bj_ == null || C8054ddD.l(bj_) || (c7535cxz = this.f13301J) == null) {
            return;
        }
        InterfaceC5160btX h = c7535cxz.h();
        if (h.aH_() == null || (ajy = this.ai) == null) {
            return;
        }
        ajy.d(PlayerControls.PlayerPauseType.c);
        NetflixDialogFrag netflixDialogFrag = (NetflixDialogFrag) InterfaceC3612bEh.d(bj_, h.aO_(), h.aH_(), aV(), new bEH() { // from class: o.cyq
            @Override // o.bEH
            public final void b(InterfaceC5227bul interfaceC5227bul) {
                PlayerFragmentV2.this.b(interfaceC5227bul);
            }
        });
        this.B = netflixDialogFrag;
        netflixDialogFrag.addDismissOrCancelListener(new NetflixDialogFrag.a() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.5
            @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag.a
            public void a(NetflixDialogFrag netflixDialogFrag2) {
                PlayerFragmentV2.this.aa();
                PlayerFragmentV2.this.ax();
            }
        });
        this.B.setWindowFlags(ao().getDecorView().getSystemUiVisibility());
        bv();
        bj_.showDialog(this.B);
    }

    private void bP() {
        C7535cxz c7535cxz;
        NetflixActivity bj_ = bj_();
        if (bj_ == null || C8054ddD.l(bj_) || (c7535cxz = this.f13301J) == null || this.ai == null) {
            return;
        }
        if (!IPlayer.PlaybackType.LivePlayback.equals(c7535cxz.f())) {
            this.ai.d(PlayerControls.PlayerPauseType.c);
        }
        Language t = this.ai.t();
        if (t == null) {
            return;
        }
        C1226Tn d2 = C1226Tn.d(t, j(), this.w);
        d2.addDismissOrCancelListener(new NetflixDialogFrag.a() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.3
            @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag.a
            public void a(NetflixDialogFrag netflixDialogFrag) {
                PlayerFragmentV2.this.aa();
                PlayerFragmentV2.this.ax();
            }
        });
        d2.setWindowFlags(ao().getDecorView().getSystemUiVisibility());
        bv();
        bj_.showDialog(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(com.netflix.mediaclient.media.Language r7) {
        /*
            r6 = this;
            boolean r0 = r6.bn_()
            if (r0 != 0) goto L7
            return
        L7:
            r6.b(r7)
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            o.C8309dhu.c(r0, r7)
            com.netflix.mediaclient.media.AudioSource r0 = r7.getSelectedAudio()
            com.netflix.mediaclient.media.subtitles.Subtitle r1 = r7.getSelectedSubtitle()
            r2 = 1
            java.lang.String r3 = "PlayerFragment"
            if (r1 != 0) goto L25
            java.lang.String r4 = "Selected subtitle is NONE"
            o.C1044Mm.e(r3, r4)
            r4 = r2
            goto L26
        L25:
            r4 = 0
        L26:
            if (r0 == 0) goto L3d
            int r0 = r0.getNccpOrderNumber()
            int r5 = r7.getCurrentNccpAudioIndex()
            if (r0 == r5) goto L38
            java.lang.String r0 = "Start change language, get awake clock"
            o.C1044Mm.e(r3, r0)
            goto L3e
        L38:
            java.lang.String r0 = "No need to change audio."
            o.C1044Mm.e(r3, r0)
        L3d:
            r2 = r4
        L3e:
            if (r1 == 0) goto L59
            int r0 = r1.getNccpOrderNumber()
            int r1 = r7.getCurrentNccpSubtitleIndex()
            if (r0 == r1) goto L4b
            goto L5e
        L4b:
            java.lang.String r0 = "No need to change subtitle."
            o.C1044Mm.e(r3, r0)
            if (r2 == 0) goto L53
            goto L5e
        L53:
            java.lang.String r7 = "No need to switch tracks"
            o.C1044Mm.e(r3, r7)
            goto L66
        L59:
            java.lang.String r0 = "Subtitle is off"
            o.C1044Mm.e(r3, r0)
        L5e:
            java.lang.String r0 = "Reloading tracks"
            o.C1044Mm.e(r3, r0)
            r6.c(r7)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.PlayerFragmentV2.d(com.netflix.mediaclient.media.Language):void");
    }

    public void aB() {
        j(-b);
    }

    public void aA() {
        j(b);
    }

    private void j(int i) {
        this.aj.f = SystemClock.elapsedRealtime();
        bC();
        d(i, true);
    }

    @Override // o.C1180Rt.d
    public void e() {
        DialogFragment dialogFragment = by_().getDialogFragment();
        if (dialogFragment instanceof C1180Rt.d) {
            ((C1180Rt.d) dialogFragment).e();
        }
    }

    public boolean aq() {
        return ak() != null && ak().ab();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        C1044Mm.j("PlayerFragment", "onManagerReady");
        this.Z.e(serviceManager);
        if (ConfigFastPropertyFeatureControlConfig.Companion.f()) {
            serviceManager.a(true, (String) null, "playback");
        }
        if (serviceManager.u().r() && C8151dev.c()) {
            C1044Mm.d("PlayerFragment", "Amazon device is not allowed on mobile only plan, exit...");
            Y();
        }
    }

    private void bE() {
        C1044Mm.a("PlayerFragment", "openVideoSession");
        C8166dfJ.d();
        this.aj.l = IPlayerFragment.PlayerFragmentState.ACTIVITY_SRVCMNGR_READY;
        Bundle arguments = getArguments();
        PlayerExtras playerExtras = arguments != null ? (PlayerExtras) arguments.getParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS) : null;
        if (this.f13301J == null) {
            this.N = false;
            if (arguments == null) {
                InterfaceC1598aHf.a("Bundle is empty, no video ID to play");
                bW();
                return;
            }
            String string = arguments.getString(NetflixActivity.EXTRA_VIDEO_ID);
            if (C8168dfL.g(string)) {
                InterfaceC1598aHf.a("unable to start playback with invalid video id");
                bW();
                return;
            }
            VideoType create = VideoType.create(arguments.getString(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE));
            if (create == null) {
                InterfaceC1598aHf.a("unable to start playback with invalid video type");
                bW();
                return;
            }
            PlayContext playContext = (PlayContext) arguments.getParcelable(NetflixActivity.EXTRA_PLAY_CONTEXT);
            if (playContext == null) {
                InterfaceC1598aHf.a("Empty context passed in intent");
                playContext = new EmptyPlayContext("PlayerFragment", NetError.ERR_INVALID_RESPONSE);
            }
            c(string, create, playContext, playerExtras, TaskMode.FROM_CACHE_OR_NETWORK);
        }
        if (playerExtras != null) {
            this.aj.d = playerExtras.c();
            this.p = playerExtras.g();
        }
        this.z.e();
        if (getActivity() != null) {
            C8194dfl.a(getActivity().getIntent());
        }
        bH();
        C7449cwS c7449cwS = this.R;
        if (c7449cwS != null) {
            c7449cwS.b();
        }
        this.imageLoaderRepository.c();
        bF();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
        C1044Mm.d("PlayerFragment", "NetflixService is NOT available!");
        Y();
    }

    private void bF() {
        BroadcastReceiver broadcastReceiver = this.O;
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        Boolean bool = Boolean.FALSE;
        a(broadcastReceiver, intentFilter, bool);
        a(this.V, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), bool);
        a(this.ak, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"), bool);
        a(this.Y, InterfaceC4317bcI.a(), bool);
        a(this.G, new IntentFilter("com.netflix.mediaclient.intent.action.END_PIP"));
        a(new C7621czf(this), AbstractC4322bcN.b());
    }

    private void bH() {
        if (C8150deu.f() && getView() != null) {
            this.aw = new C7622czg(this);
            ((InterfaceC5297bwB) C1332Xp.b(InterfaceC5297bwB.class)).a(this.aw);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bb() {
        int d2 = C8067ddQ.d(AccessibilityUtils.e(getContext(), this.y ? m : f13300o, true), C8150deu.h());
        long j = this.aj.f;
        return j > 0 && SystemClock.elapsedRealtime() - j > ((long) d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.I.removeCallbacks(this.am);
        this.I.postDelayed(this.am, i);
    }

    @Override // com.netflix.mediaclient.ui.player.IPlayerFragment
    public boolean f() {
        return (getActivity() != null && getActivity().isInPictureInPictureMode()) || this.E;
    }

    @TargetApi(ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET)
    private boolean aD() {
        PlayerPictureInPictureManager playerPictureInPictureManager;
        return bn_() && (playerPictureInPictureManager = this.X) != null && playerPictureInPictureManager.b(aq(), NetflixApplication.getInstance()) && ak() != null && ak().X() && ak().Z() && !bh() && this.X.c() != PlayerPictureInPictureManager.PlaybackPipStatus.d;
    }

    public InterfaceC5160btX aj() {
        C7535cxz c7535cxz = this.f13301J;
        if (c7535cxz == null) {
            return null;
        }
        return c7535cxz.h();
    }

    public VideoType an() {
        C7535cxz c7535cxz = this.f13301J;
        if (c7535cxz == null) {
            return VideoType.UNKNOWN;
        }
        return c7535cxz.l();
    }

    private void bY() {
        if (bn_()) {
            this.aj.f = SystemClock.elapsedRealtime();
            ax();
        }
    }

    public void i(boolean z) {
        C1044Mm.e("PlayerFragment", "onWindowFocusChanged done");
        C1044Mm.e("PlayerFragment", "====> In focus: " + z);
        if (!z) {
            this.e.b(cBA.class, cBA.aA.a);
        } else {
            this.e.b(cBA.class, cBA.as.b);
        }
    }

    public boolean c(int i, KeyEvent keyEvent) {
        aJY ak = ak();
        if (ak == null) {
            return false;
        }
        if (i == 62 || i == 66) {
            if (ak.ab()) {
                aI();
                return true;
            }
            aa();
            return true;
        }
        return false;
    }

    public boolean e(int i, KeyEvent keyEvent) {
        this.aj.f = SystemClock.elapsedRealtime();
        bC();
        if (i != 4 && i != 111) {
            if (i == 84) {
                return true;
            }
            if (i != 82) {
                return b(i, keyEvent);
            }
            keyEvent.startTracking();
            return true;
        } else if (this.aj.h) {
            C1044Mm.e("PlayerFragment", "Back used to dismiss interrupter overlay, send it back to framework");
            return false;
        } else {
            C1044Mm.e("PlayerFragment", "Back...");
            CLv2Utils.b();
            o();
            Y();
            return true;
        }
    }

    private boolean b(int i, KeyEvent keyEvent) {
        if (i == 96) {
            if (keyEvent.getRepeatCount() > 0) {
                return false;
            }
            C1044Mm.b("PlayerFragment", "A button pressed");
            this.ao.onClick(null);
            return true;
        } else if (i == 21 || i == 102) {
            aB();
            return true;
        } else if (i == 22 || i == 103) {
            aA();
            return true;
        } else if (i == 93) {
            if (aq()) {
                f(false);
            }
            return true;
        } else if (i == 92) {
            if (aq()) {
                aa();
            }
            return true;
        } else if (i == 41) {
            return b(101);
        } else {
            if (i == 19) {
                return b(1);
            }
            if (i == 20) {
                return b(-1);
            }
            return false;
        }
    }

    private boolean b(int i) {
        try {
            AudioManager audioManager = (AudioManager) requireActivity().getSystemService("audio");
            if (audioManager == null) {
                C1044Mm.d("PlayerFragment", "Audio manager is not available, can not change volume");
                return false;
            }
            audioManager.adjustStreamVolume(3, i, 5);
            return true;
        } catch (Exception e) {
            C1044Mm.e("PlayerFragment", "error adjusting audio: ", e);
            return false;
        }
    }

    @Deprecated
    public boolean d(long j, boolean z, long j2) {
        C1044Mm.e("PlayerFragment", "appending playable " + j);
        aJY ajy = this.ai;
        if ((ajy instanceof C1677aKd) && this.ah) {
            this.U = C5591cBb.c.a(j, z, j2, ajy);
            return true;
        }
        return false;
    }

    public boolean ay() {
        return this.ai instanceof C1677aKd;
    }

    public String d(int i, String str) {
        return super.getString(i, str);
    }

    public void c(Language language) {
        C8166dfJ.d();
        if (language == null) {
            return;
        }
        aJY ak = ak();
        if (ak != null) {
            language.commit();
            ak.setLanguage(language);
            ak.setAudioTrack(language.getSelectedAudio());
            ak.setSubtitleTrack(language.getSelectedSubtitle(), true);
            if ((language.getSelectedAudio() != null && !language.getSelectedAudio().isHydrated()) || (language.getSelectedSubtitle() != null && !language.getSelectedSubtitle().isHydrated())) {
                C1044Mm.e("PlayerFragment", "Selected audio/subtitle is not hydrated, refetching manifest");
            }
            if (this.aj.a() != null) {
                e(Moment.InteractiveIntent.DUBS_SUBS_CHANGE, ak.o(), null, null, language.getSelectedAudio(), language.getSelectedSubtitle(), null);
            }
        }
        C1044Mm.e("PlayerFragment", "Language change should be completed");
    }

    @Override // com.netflix.mediaclient.ui.player.IPlayerFragment
    public void b(Runnable runnable) {
        this.ag.post(runnable);
    }

    public void az() {
        C7449cwS c7449cwS = this.R;
        if (c7449cwS != null) {
            c7449cwS.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bi() {
        C1044Mm.e("PlayerFragment", "Playback cancelled");
        Y();
    }

    private void br() {
        C8166dfJ.d();
        i(getString(R.o.fa));
    }

    private void bt() {
        i(getString(R.o.gx));
    }

    private void i(String str) {
        String string = getString(R.o.f13253fi);
        Runnable runnable = this.u;
        by_().displayDialog(C1163Rc.e(getActivity(), this.I, new C1907aSr(null, str, string, runnable, runnable)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean aY() {
        C1044Mm.a("PlayerFragment", "Check connection");
        if (j()) {
            C1044Mm.a("PlayerFragment", "offline playback network is not needed.");
            return true;
        }
        LogMobileType d2 = ConnectivityUtils.d(bj_());
        if (d2 == null) {
            C1044Mm.a("PlayerFragment", "No internet connection. Since this is expected state on Verizons' phones, skip");
            return true;
        } else if (d2 == LogMobileType.WIFI) {
            C1044Mm.a("PlayerFragment", "WiFi connection, do playback");
            return true;
        } else {
            boolean j = C1613aHu.j(getActivity());
            C1044Mm.a("PlayerFragment", "3G Preference setting: " + j);
            if (j) {
                C1044Mm.j("PlayerFragment", "We should warn user if he is on NON WIFI network!");
                br();
                return false;
            }
            C1044Mm.e("PlayerFragment", "Warning is not required, proceed with playback");
            return true;
        }
    }

    public void ax() {
        a(n);
        C1044Mm.e("PlayerFragment", "===>> Screen update thread started");
    }

    private void bV() {
        this.I.removeCallbacks(this.am);
        C1044Mm.e("PlayerFragment", "===>> Screen update thread canceled");
    }

    private void bk() {
        if (bn_()) {
            C1044Mm.e("PlayerFragment", "KEEP_SCREEN: ON");
            ao().addFlags(128);
        }
        this.I.removeCallbacks(this.al);
        this.I.removeCallbacks(this.t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bG() {
        if (bn_()) {
            C1044Mm.e("PlayerFragment", "KEEP_SCREEN: OFF");
            ao().clearFlags(128);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j) {
        C7535cxz af;
        aJY ajy;
        if (bn_() && (af = af()) != null) {
            af.h();
            C8082ddf.a().b(af.h().aX_(), af.h().H());
            if (aq() && (ajy = this.ai) != null) {
                af.c(ajy.o());
            }
            if (c(j)) {
                e(af);
            }
            this.e.b(cBA.class, new cBA.W(j, af.c()));
            d(j);
            b(j);
        }
    }

    private void d(long j) {
        C7535cxz af = af();
        if (this.j == null || af == null || f()) {
            return;
        }
        InterfaceC5160btX h = af.h();
        this.j.b(j, ai(), af.c(), h.av_(), h.aJ_(), new drM() { // from class: o.cyK
            @Override // o.drM
            public final Object invoke(Object obj) {
                dpR a;
                a = PlayerFragmentV2.this.a((AbstractC5531cAw) obj);
                return a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR a(AbstractC5531cAw abstractC5531cAw) {
        aJY ajy = this.ai;
        if (ajy != null) {
            ajy.setPlayerBackgroundable(false);
        }
        d(by_());
        this.e.b(cBA.class, cBA.C5541c.c);
        this.e.b(cBA.class, cBA.F.a);
        this.e.b(cBA.class, new AbstractC5597cBh.a(abstractC5531cAw, false));
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AutoDispose"})
    public void e(C7535cxz c7535cxz) {
        if (c7535cxz.n()) {
            return;
        }
        c7535cxz.e(true);
        this.e.b(cBA.class, new cBA.ad(aZ()));
        String aH_ = c7535cxz.h().aH_();
        if (aH_ != null) {
            this.f.add(this.ax.b(aH_, c7535cxz.f(), c7535cxz.l() == VideoType.SHOW ? VideoType.EPISODE : c7535cxz.l(), c7535cxz.b().j(), aC(), BrowseExperience.a(), this.aB).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: o.cxK
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PlayerFragmentV2.this.b((PostPlayExperience) obj);
                }
            }, new Consumer() { // from class: o.cxN
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PlayerFragmentV2.this.e((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Throwable th) {
        b((PostPlayExperience) null);
    }

    private void b(long j) {
        boolean z;
        if (aj() == null) {
            return;
        }
        if (aj().av_() > 0) {
            if (j > 0 && j >= PostPlay.b(aj(), aj().av_())) {
                this.e.b(cBA.class, cBA.R.b);
            } else {
                this.e.b(cBA.class, cBA.L.c);
            }
        }
        C7460cwd e = this.offlineApi.e(this.f13301J.h().aH_());
        try {
            z = c(e);
        } catch (NullPointerException unused) {
            InterfaceC1593aHa.b("SPY-32303 videoType=" + e.getType() + " playableId=" + e.aH_() + " parentId=" + e.aO_());
            InterfaceC1598aHf.a("SPY-32303");
            z = false;
        }
        TimeCodesData d2 = z ? d(e) : null;
        TimeCodesData d3 = z ? null : d(aj());
        if (z && d2 != null) {
            d(d2, j);
        } else if (d3 != null) {
            d(d3, j);
        } else if (aj().ap_() != null) {
            if (C7590czA.c(aj().ap_(), j, aT())) {
                this.e.b(cBA.class, cBA.P.a);
            } else if (C7590czA.e(aj().ap_(), j, aT())) {
                this.e.b(cBA.class, cBA.O.d);
            } else {
                this.e.b(cBA.class, cBA.N.d);
            }
        }
    }

    private void d(TimeCodesData timeCodesData, long j) {
        if (timeCodesData.creditMarks() != null && C7590czA.c(timeCodesData.creditMarks(), j, aT())) {
            this.e.b(cBA.class, cBA.P.a);
        } else if (timeCodesData.creditMarks() != null && C7590czA.e(timeCodesData.creditMarks(), j, aT())) {
            this.e.b(cBA.class, cBA.O.d);
        } else if (timeCodesData.skipContent() != null && C7590czA.c(timeCodesData.skipContent(), j, aT())) {
            SkipContentData d2 = C7590czA.d(timeCodesData.skipContent(), j, aT());
            if (d2 == null || d2.label() == null) {
                return;
            }
            this.e.b(cBA.class, new cBA.Q(d2.label(), d2.end()));
        } else {
            this.e.b(cBA.class, cBA.N.d);
        }
    }

    public void c(final IPlayer.c cVar) {
        final InterfaceC5283bvo a;
        if (f()) {
            Y();
            return;
        }
        this.aj.l = IPlayerFragment.PlayerFragmentState.ACTIVITY_NOTREADY;
        if (cVar instanceof C4608bhi) {
            this.e.b(cBA.class, new cBA.C5536a(cVar.a()));
            return;
        }
        this.e.b(cBA.class, new cBA.C(cVar.d(), cVar.a()));
        if (C1880aRr.c() && (cVar instanceof C4614bho)) {
            C4614bho c4614bho = (C4614bho) cVar;
            if (c4614bho.c() != null && c4614bho.c().b() != null) {
                final NetflixActivity bj_ = bj_();
                if (bj_ == null || isDetached() || (a = C8126deW.a(bj_)) == null) {
                    return;
                }
                b(new Runnable() { // from class: o.cyp
                    @Override // java.lang.Runnable
                    public final void run() {
                        PlayerFragmentV2.this.c(cVar, bj_, a);
                    }
                });
                return;
            }
        }
        if (cVar instanceof C4611bhl) {
            b(new Runnable() { // from class: o.cyt
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerFragmentV2.this.d(cVar);
                }
            });
        } else if ((cVar instanceof C4614bho) && ((C4614bho) cVar).f() != null) {
            b(new Runnable() { // from class: o.cyv
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerFragmentV2.this.b(cVar);
                }
            });
        } else {
            this.playerFragmentCL.e(new Error(String.valueOf(cVar.d()), null, null));
            bI();
            if (bh()) {
                InterfaceC1598aHf.a(new C1596aHd("We got a playback error but did not show it to the user because we are in postplay. Error was " + cVar.b()).b(false));
                return;
            }
            a(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(final IPlayer.c cVar, final NetflixActivity netflixActivity, InterfaceC5283bvo interfaceC5283bvo) {
        this.interstitials.get().b(((C4614bho) cVar).c().b(), netflixActivity, interfaceC5283bvo, netflixActivity.getSupportFragmentManager(), new drM() { // from class: o.cyC
            @Override // o.drM
            public final Object invoke(Object obj) {
                dpR a;
                a = PlayerFragmentV2.this.a(netflixActivity, cVar, (bXD.b) obj);
                return a;
            }
        }, new drO() { // from class: o.cyB
            @Override // o.drO
            public final Object invoke() {
                dpR e;
                e = PlayerFragmentV2.this.e(netflixActivity);
                return e;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR a(NetflixActivity netflixActivity, final IPlayer.c cVar, final bXD.b bVar) {
        if (bVar == bXD.b.d.a) {
            if (C8150deu.g()) {
                netflixActivity.setRequestedOrientation(1);
            }
        } else if (bVar instanceof bXD.b.a) {
            b(new Runnable() { // from class: o.cxL
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerFragmentV2.this.c(bVar);
                }
            });
        } else {
            b(new Runnable() { // from class: o.cxP
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerFragmentV2.this.a(cVar);
                }
            });
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(bXD.b bVar) {
        c(((bXD.b.a) bVar).c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR e(final NetflixActivity netflixActivity) {
        b(new Runnable() { // from class: o.cxY
            @Override // java.lang.Runnable
            public final void run() {
                PlayerFragmentV2.this.a(netflixActivity);
            }
        });
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(NetflixActivity netflixActivity) {
        if (C8150deu.g()) {
            netflixActivity.setRequestedOrientation(0);
        }
        PlayerExtras aU = aU();
        if (aU != null) {
            aU.m();
        }
        bu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void a(IPlayer.c cVar) {
        InterfaceC5128bss interfaceC5128bss;
        InterfaceC1905aSp d2 = C7599czJ.d(this, cVar, ad(), an(), y_());
        if (d2 == null || d2.a() == null || (interfaceC5128bss = this.z) == null) {
            return;
        }
        interfaceC5128bss.b(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void d(final C4611bhl c4611bhl) {
        final NetflixActivity bj_ = bj_();
        if (bj_ == null || isDetached()) {
            return;
        }
        aIB.b(bj_, new aIB.e() { // from class: o.cyI
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                PlayerFragmentV2.this.e(c4611bhl, bj_, serviceManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(C4611bhl c4611bhl, NetflixActivity netflixActivity, ServiceManager serviceManager) {
        PlayContext emptyPlayContext;
        C7535cxz c7535cxz = this.f13301J;
        if (c7535cxz != null) {
            emptyPlayContext = c7535cxz.b();
        } else {
            emptyPlayContext = new EmptyPlayContext("PlayerFragment", -335);
        }
        AbstractC7480cwx e = AbstractC7480cwx.e(c4611bhl, emptyPlayContext, this);
        e.onManagerReady(serviceManager, InterfaceC1078Nw.aJ);
        e.setCancelable(true);
        netflixActivity.showDialog(e);
        av();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void b(C4614bho c4614bho) {
        c(c4614bho.f());
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void c(UmaAlert umaAlert) {
        NetflixActivity bj_ = bj_();
        if (bj_ == null || isDetached()) {
            return;
        }
        if (C8150deu.g()) {
            bj_.setRequestedOrientation(1);
        }
        C6186cXa a = C6186cXa.a(bj_(), umaAlert);
        a.setCancelable(true);
        a.addDismissOrCancelListener(new AnonymousClass12(a));
        bj_.showDialog(a);
    }

    /* renamed from: com.netflix.mediaclient.ui.player.PlayerFragmentV2$12  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass12 extends NetflixDialogFrag.a {
        final /* synthetic */ C6186cXa e;

        AnonymousClass12(C6186cXa c6186cXa) {
            this.e = c6186cXa;
        }

        @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag.a
        public void a(NetflixDialogFrag netflixDialogFrag) {
            final C6186cXa c6186cXa = this.e;
            C8187dfe.a(new Runnable() { // from class: o.cyN
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerFragmentV2.AnonymousClass12.this.e(c6186cXa);
                }
            }, 100L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(C6186cXa c6186cXa) {
            if (c6186cXa.a() != null) {
                UserMessageAreaView a = c6186cXa.a();
                Objects.requireNonNull(a);
                LifecycleOwner t = a.t();
                if (t != null) {
                    t.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.player.PlayerFragmentV2.22.1
                        @Override // androidx.lifecycle.DefaultLifecycleObserver
                        public void onDestroy(LifecycleOwner lifecycleOwner) {
                            PlayerFragmentV2.this.Y();
                        }
                    });
                } else {
                    PlayerFragmentV2.this.Y();
                }
            }
        }
    }

    @Override // com.netflix.mediaclient.ui.player.IPlayerFragment
    public void d(String str, boolean z, VideoType videoType, PlayContext playContext, boolean z2, boolean z3, long j, C7631czp c7631czp) {
        C7535cxz c7535cxz;
        C1044Mm.e("PlayerFragment", "playable to play next: " + str);
        if (C8168dfL.g(str)) {
            C1044Mm.d("PlayerFragment", "PlayableId is null - skip playback");
            InterfaceC1598aHf.a(new C1596aHd("PlayableId is null - skip playback").b(false));
        } else if (videoType == null) {
            C1044Mm.d("PlayerFragment", "videoType is null - skip playback");
            InterfaceC1598aHf.a(new C1596aHd("videoType is null - skip playback").b(false));
        } else {
            if (z2) {
                this.aj.e();
            }
            if (z3) {
                C1044Mm.e("PlayerFragment", "Resetting user Interaction state due to autoPlay");
                this.aj.c = false;
            }
            int i = this.aj.d;
            if (bj_() != null) {
                this.ad = true;
                this.e.b(cBA.class, cBA.ak.b);
                playContext.b("");
                PlayerExtras playerExtras = new PlayerExtras((int) TimeUnit.MILLISECONDS.toSeconds(j), 0L, i, false, false, c7631czp, false, this.x, aJY.a.d(), this.p, null);
                if (bR()) {
                    this.j = null;
                    C7626czk c7626czk = this.aj;
                    c7626czk.a = false;
                    c7626czk.m = false;
                    c7626czk.l = IPlayerFragment.PlayerFragmentState.ACTIVITY_PLAYER_LOADING_NEXT;
                    C7535cxz c7535cxz2 = this.Q;
                    String aH_ = c7535cxz2 == null ? null : c7535cxz2.h().aH_();
                    boolean equals = aH_ != null ? this.Q.h().aH_().equals(aH_) : false;
                    b(playerExtras);
                    if (this.ai != null && str != null && (c7535cxz = this.Q) != null && this.P != null && equals) {
                        this.e.b(cBA.class, new cBA.C5556r(c7535cxz));
                        e(this.Q.g(), this.P, this.Q.b(), this.Q.i(), this.Q.e(), this.T);
                        C5208buS c5208buS = this.ab;
                        if (c5208buS != null) {
                            C5591cBb.c.b(c5208buS.b(), (C1677aKd) this.ai, null, this.Q, j, playContext);
                            this.P = null;
                            this.T = null;
                            this.Q = null;
                            n(false);
                            bM();
                            return;
                        }
                        return;
                    }
                    if (this.Q != null && !equals) {
                        InterfaceC1598aHf.a(new C1596aHd("Mismatch in the next episode to play " + this.Q.h().aH_() + " playableId in postplay is:" + str).b(false));
                    } else {
                        InterfaceC1598aHf.a(new C1596aHd("PlayNext button pressed before data fetched " + this.Q + " videoMismatch :" + equals).b(false));
                    }
                    Y();
                    this.playbackLauncher.get().b(str, z, videoType, playContext, playerExtras);
                    return;
                }
                Y();
                this.playbackLauncher.get().b(str, z, videoType, playContext, playerExtras);
                return;
            }
            InterfaceC1598aHf.a("SPY-15580 - getNetflixActivity() is null in playNextVideoFromPostPlay");
        }
    }

    private void bM() {
        this.playerFragmentCL.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(InterfaceC5227bul interfaceC5227bul) {
        if (bn_()) {
            C7535cxz c7535cxz = this.f13301J;
            if (c7535cxz != null && c7535cxz.h() != null && TextUtils.equals(this.f13301J.h().aH_(), interfaceC5227bul.aE_().aH_())) {
                C1044Mm.e("PlayerFragment", "Request to play same episode, do nothing");
                ax();
                aa();
            } else if (!d(interfaceC5227bul.aE_().aH_(), PlayContextImp.h)) {
                c(new C7535cxz(interfaceC5227bul, PlayContextImp.h, interfaceC5227bul.aE_().aF_(), null));
            }
            bK();
        }
    }

    public void av() {
        aJY ajy = this.ai;
        if (ajy != null) {
            ajy.d(PlayerControls.PlayerPauseType.e);
        }
        aK();
        this.K = null;
    }

    private void aK() {
        if (ak() != null) {
            ak().j();
        }
        bI();
    }

    private void bK() {
        NetflixActivity by_ = by_();
        if (by_.isDialogFragmentVisible()) {
            by_.removeDialogFrag();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.bFP
    public boolean o() {
        C1044Mm.a("PlayerFragment", "handleBackPressed");
        C7626czk c7626czk = this.aj;
        if (c7626czk.h) {
            c7626czk.h = false;
            this.playerFragmentCL.d();
            aa();
            return true;
        }
        this.playerFragmentCL.d();
        aF();
        if (this.F && bj_() != null) {
            bj_().finishAndRemoveTask();
        }
        b(this.f13301J, PlaybackLauncher.PlayLaunchedBy.d);
        return false;
    }

    private void ca() {
        C7535cxz c7535cxz = this.f13301J;
        if (c7535cxz == null) {
            aJY ajy = this.ai;
            if (ajy != null) {
                ajy.ae();
                return;
            }
            return;
        }
        InterfaceC5160btX h = c7535cxz.h();
        if (h.H()) {
            aO();
        } else if (!h.aS_() && this.f13301J.o()) {
            C1044Mm.e("PlayerFragment", String.format("nf_pin PlayerActivity pinVerification skipped - ageProtected: %b, pinVerified:%b, pinProtected:%b", Boolean.valueOf(h.aS_()), Boolean.valueOf(this.f13301J.o()), Boolean.valueOf(h.aX_())));
            aL();
        } else {
            PlayerExtras playerExtras = new PlayerExtras();
            playerExtras.b(this.f13301J.i());
            if (ba() != null) {
                playerExtras.d(ba());
            }
            C8021dcX.b(by_(), h.aS_(), new PlayVerifierVault(PlayVerifierVault.RequestedBy.c.c(), h.aH_(), h.H(), h.aX_(), this.f13301J.l(), this.f13301J.f() == IPlayer.PlaybackType.StreamingPlayback, this.f13301J.b(), playerExtras));
        }
    }

    @SuppressLint({"AutoDispose"})
    private void aO() {
        FragmentActivity activity = getActivity();
        if (C8054ddD.l(activity) || activity.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        final C7478cwv d2 = C7478cwv.d.d(activity, new PlayVerifierVault(PlayVerifierVault.RequestedBy.c.c(), "unused"));
        final WeakReference weakReference = new WeakReference(d2);
        this.e.d(cBA.class).filter(new Predicate() { // from class: o.cxT
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean c;
                c = PlayerFragmentV2.c((cBA) obj);
                return c;
            }
        }).subscribe(new Consumer() { // from class: o.cxU
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.this.c(weakReference, (cBA) obj);
            }
        }, new Consumer() { // from class: o.cxW
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.b(weakReference, (Throwable) obj);
            }
        });
        this.f.add(d2.a().subscribe(new Consumer() { // from class: o.cxV
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.this.b((AbstractC7475cws) obj);
            }
        }, new Consumer() { // from class: o.cxX
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.this.d(d2, (Throwable) obj);
            }
        }));
        this.f.add(d2.e().subscribe(new Consumer() { // from class: o.cyd
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.this.d((AbstractC7431cwA) obj);
            }
        }, new Consumer() { // from class: o.cxZ
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.this.a(d2, (Throwable) obj);
            }
        }));
        d2.show(activity.getSupportFragmentManager(), NetflixActivity.FRAG_DIALOG_TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(cBA cba) {
        return (cba instanceof cBA.ai) || (cba instanceof cBA.C5536a) || (cba instanceof cBA.C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(WeakReference weakReference, cBA cba) {
        C7478cwv c7478cwv = (C7478cwv) weakReference.get();
        if (c7478cwv != null) {
            if (cba instanceof cBA.ai) {
                c7478cwv.e(AbstractC7431cwA.c.a);
            } else if (cba instanceof cBA.C5536a) {
                av();
                c7478cwv.e(new AbstractC7431cwA.a(((cBA.C5536a) cba).c(), true));
            } else {
                c7478cwv.e(new AbstractC7431cwA.a("", false));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(WeakReference weakReference, Throwable th) {
        InterfaceC1598aHf.e("Error from player", th);
        C7478cwv c7478cwv = (C7478cwv) weakReference.get();
        if (c7478cwv != null) {
            c7478cwv.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AbstractC7475cws abstractC7475cws) {
        if (abstractC7475cws instanceof AbstractC7475cws.e) {
            a(((AbstractC7475cws.e) abstractC7475cws).b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(C7478cwv c7478cwv, Throwable th) {
        InterfaceC1598aHf.e("Error from pin dialog", th);
        c7478cwv.dismiss();
        Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(AbstractC7431cwA abstractC7431cwA) {
        if (abstractC7431cwA == AbstractC7431cwA.b.c) {
            C1044Mm.e("PlayerFragment", "Content preview pin cancelled - close playback");
            Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(C7478cwv c7478cwv, Throwable th) {
        InterfaceC1598aHf.e("Error from pin dialog", th);
        c7478cwv.dismiss();
        Y();
    }

    public void c(boolean z, PlayVerifierVault playVerifierVault) {
        if (this.f13301J == null) {
            InterfaceC1598aHf.a("playback called on null playback item");
            Y();
        } else if (z && PlayVerifierVault.RequestedBy.c.c().equals(playVerifierVault.b())) {
            this.f13301J.d(true);
            aL();
        } else {
            C1044Mm.e("PlayerFragment", "Age/Pin verification failed cannot proceed - close playback");
            Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void e(InterfaceC5198buI interfaceC5198buI, IPlayer.PlaybackType playbackType, PlayContext playContext, long j, InteractiveMoments interactiveMoments, C7535cxz c7535cxz) {
        Interactivity e;
        LiveState liveState;
        C7535cxz c7535cxz2;
        C7631czp ba;
        C1044Mm.a("PlayerFragment", "handleVideoDetailsResponse");
        final NetflixActivity bj_ = bj_();
        if (bj_ == null) {
            return;
        }
        if (!bn_() || interfaceC5198buI == null) {
            C1044Mm.e("PlayerFragment", "handleVideoDetailsResponse isAdded=%b", Boolean.valueOf(isAdded()));
            aJY ajy = this.ai;
            if (ajy != null) {
                ajy.ae();
                return;
            }
            return;
        }
        Bundle arguments = getArguments();
        String e2 = (arguments == null || (ba = ba()) == null || !ba.a()) ? null : ba.e();
        if (e2 == null) {
            PlayerExtras aU = aU();
            e2 = (aU == null || !(aU.b() == LiveState.a || aU.b() == LiveState.c)) ? "Default" : "live";
        }
        this.f13301J = new C7535cxz(interfaceC5198buI, playContext, j, e2, null, interactiveMoments);
        C7535cxz c7535cxz3 = this.aj.j ? null : c7535cxz;
        this.af = c7535cxz3;
        boolean z = false;
        boolean z2 = (c7535cxz3 == null || c7535cxz3.h() == null) ? false : true;
        this.aj.d(z2);
        if (this.prePlayComposeEnabled.get().booleanValue()) {
            if (z2) {
                this.e.b(cBA.class, AbstractC5599cBj.b.d);
            } else {
                this.e.b(cBA.class, AbstractC5599cBj.a.a);
            }
        }
        if (arguments != null) {
            PlayerExtras playerExtras = this.U ? this.ac : (PlayerExtras) arguments.getParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS);
            if (playerExtras != null) {
                this.f13301J.b(playerExtras.o());
                this.f13301J.d(playerExtras.k());
                if (c7535cxz != null) {
                    c7535cxz.b(playerExtras.o());
                    c7535cxz.d(playerExtras.k());
                }
            } else {
                InterfaceC1598aHf.a("Player extras should not be null in PlayerFragment ");
            }
        }
        this.S = aSC.c(interfaceC5198buI);
        IPlayer.PlaybackType playbackType2 = IPlayer.PlaybackType.OfflinePlayback;
        if (playbackType == playbackType2) {
            this.offlinePostplay.a(aM());
        }
        InterfaceC5297bwB.a e3 = ((InterfaceC5297bwB) C1332Xp.b(InterfaceC5297bwB.class)).e();
        if (e3 != null) {
            e3.b(interfaceC5198buI);
        }
        InterfaceC5206buQ b2 = this.offlineApi.b(this.f13301J.h().aH_());
        if (c(b2)) {
            this.f13301J.d(playbackType2);
            if (b2.C() != WatchState.WATCHING_ALLOWED) {
                this.f13301J.c(0L);
            }
            SY.e c = c(b2.C());
            if (c != null) {
                bj_.displayDialog(c);
                aJY ajy2 = this.ai;
                if (ajy2 != null) {
                    ajy2.ae();
                    return;
                }
                return;
            }
        } else {
            this.f13301J.d(IPlayer.PlaybackType.StreamingPlayback);
        }
        if (this.aj.b()) {
            e = C5639cCw.e.e(this.af.g().az_(), this.af.e());
        } else {
            e = C5639cCw.e.e(interfaceC5198buI.az_(), interactiveMoments);
        }
        this.aj.d(e);
        if (this.aj.b() && (c7535cxz2 = this.af) != null) {
            InteractiveMoments e4 = c7535cxz2.e();
            if (e4 != null) {
                this.e.b(cBA.class, new cBA.C5546h(e4));
            }
        } else if (interactiveMoments != null) {
            this.e.b(cBA.class, new cBA.C5546h(interactiveMoments));
        }
        C9935zP c9935zP = this.e;
        C7535cxz c7535cxz4 = this.aj.b() ? this.af : this.f13301J;
        Interactivity a = this.aj.a();
        String requestId = this.aj.b() ? this.af.b().getRequestId() : null;
        boolean z3 = this.U;
        if (!C8150deu.c() && !C8150deu.f()) {
            z = true;
        }
        c9935zP.b(cBA.class, new cBA.C5542d(c7535cxz4, a, requestId, !z3, new C5596cBg(z, true ^ C8150deu.f())));
        PlayerExtras aU2 = aU();
        if (aU2 != null) {
            this.f13301J.c = aU2.b();
            NetflixActivity bj_2 = bj_();
            if (bj_2 != null && !bj_2.isFinishing() && (((liveState = this.f13301J.c) == LiveState.c || liveState == LiveState.a) && this.playbackLauncher.get().c() == PlaybackLauncher.PlaybackTarget.d)) {
                this.e.b(cBA.class, AbstractC5595cBf.g.b);
            }
        }
        bJ();
        if (bR() && this.af != null) {
            this.U = C5591cBb.c.b(this.ab.b(), (C1677aKd) this.ai, this.af, this.f13301J, j, playContext);
        }
        aIB.b(bj_, new aIB.e() { // from class: o.cyP
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                PlayerFragmentV2.this.b(bj_, serviceManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(NetflixActivity netflixActivity, ServiceManager serviceManager) {
        this.aF = C8126deW.e(netflixActivity);
        ca();
    }

    private void b(final InterfaceC5198buI interfaceC5198buI, final IPlayer.PlaybackType playbackType, final PlayContext playContext, final long j, final InteractiveMoments interactiveMoments, final C7535cxz c7535cxz) {
        Runnable runnable = new Runnable() { // from class: o.cyA
            @Override // java.lang.Runnable
            public final void run() {
                PlayerFragmentV2.this.e(interfaceC5198buI, playbackType, playContext, j, interactiveMoments, c7535cxz);
            }
        };
        SY.e d2 = C1163Rc.d(bj_(), null, getString(R.o.cs), ae(), getString(R.o.f13253fi), null, runnable, null);
        NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            bj_.displayDialog(d2);
        }
    }

    private void c(final InterfaceC5198buI interfaceC5198buI, final IPlayer.PlaybackType playbackType, final PlayContext playContext, final long j, final InteractiveMoments interactiveMoments, final C7535cxz c7535cxz) {
        String string;
        final Long valueOf = (interfaceC5198buI == null ? null : interfaceC5198buI.az_()) == null ? null : Long.valueOf(Logger.INSTANCE.addContext(new IkoMode()));
        final Long startSession = Logger.INSTANCE.startSession(new Presentation(AppView.appUpgradePrompt, null));
        Runnable runnable = new Runnable() { // from class: o.cyh
            @Override // java.lang.Runnable
            public final void run() {
                PlayerFragmentV2.this.e(startSession, valueOf);
            }
        };
        Runnable runnable2 = new Runnable() { // from class: o.cyj
            @Override // java.lang.Runnable
            public final void run() {
                PlayerFragmentV2.this.a(startSession, valueOf, interfaceC5198buI, playbackType, playContext, j, interactiveMoments, c7535cxz);
            }
        };
        if (interfaceC5198buI != null && interfaceC5198buI.az_() != null && C8168dfL.h(interfaceC5198buI.az_().features().appUpdateDialogMessage())) {
            string = interfaceC5198buI.az_().features().appUpdateDialogMessage();
        } else {
            string = getString(R.o.co);
        }
        by_().displayDialog(C1163Rc.e(bj_(), ae(), new C1163Rc.e(null, string, getString(R.o.f13253fi), runnable, getString(R.o.cL), runnable2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Long l2, Long l3) {
        Logger logger = Logger.INSTANCE;
        Long startSession = logger.startSession(new SelectCommand());
        logger.endSession(l2);
        if (startSession != null) {
            logger.endSession(startSession);
        }
        if (l3 != null) {
            logger.removeContext(l3);
        }
        startActivity(C8061ddK.e(getContext()));
        Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l2, Long l3, InterfaceC5198buI interfaceC5198buI, IPlayer.PlaybackType playbackType, PlayContext playContext, long j, InteractiveMoments interactiveMoments, C7535cxz c7535cxz) {
        Logger logger = Logger.INSTANCE;
        Long startSession = logger.startSession(new CancelCommand());
        logger.endSession(l2);
        if (startSession != null) {
            logger.endSession(startSession);
        }
        if (l3 != null) {
            logger.removeContext(l3);
        }
        e(interfaceC5198buI, playbackType, playContext, j, interactiveMoments, c7535cxz);
    }

    @Override // o.bDG
    public PlayContext y_() {
        C7535cxz c7535cxz = this.f13301J;
        if (c7535cxz != null) {
            return c7535cxz.b();
        }
        if (getArguments() == null) {
            return new EmptyPlayContext("PlayerFragment", NetError.ERR_INVALID_CHUNKED_ENCODING);
        }
        PlayContext playContext = (PlayContext) getArguments().getParcelable(NetflixActivity.EXTRA_PLAY_CONTEXT);
        return playContext == null ? new EmptyPlayContext("PlayerFragment", NetError.ERR_METHOD_NOT_SUPPORTED) : playContext;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.player.PlayerFragmentV2$18  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass18 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[WatchState.values().length];
            b = iArr;
            try {
                iArr[WatchState.NOT_WATCHABLE_DUE_TO_NOT_ENOUGH_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[WatchState.LICENSE_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[WatchState.PLAY_WINDOW_EXPIRED_BUT_RENEWABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[WatchState.PLAY_WINDOW_EXPIRED_FINAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[WatchState.VIEW_WINDOW_EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[WatchState.GEO_BLOCKED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[IPlayer.PlaybackType.values().length];
            e = iArr2;
            try {
                iArr2[IPlayer.PlaybackType.StreamingPlayback.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                e[IPlayer.PlaybackType.LivePlayback.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                e[IPlayer.PlaybackType.OfflinePlayback.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[PlayerState.values().length];
            a = iArr3;
            try {
                iArr3[PlayerState.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[PlayerState.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[PlayerState.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[PlayerState.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[PlayerState.c.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private SY.e c(WatchState watchState) {
        int i;
        int i2;
        switch (AnonymousClass18.b[watchState.ordinal()]) {
            case 1:
                i = R.o.iR;
                i2 = R.o.in;
                break;
            case 2:
                i2 = R.o.ij;
                if (!ConnectivityUtils.l(getActivity())) {
                    i = R.o.ih;
                    break;
                } else {
                    i = R.o.hY;
                    break;
                }
            case 3:
                i2 = R.o.ij;
                i = R.o.ih;
                break;
            case 4:
                i2 = R.o.ij;
                i = R.o.ii;
                break;
            case 5:
                i2 = R.o.ij;
                i = R.o.iq;
                break;
            case 6:
                i2 = R.o.aR;
                i = R.o.aI;
                break;
            default:
                i2 = -1;
                i = -1;
                break;
        }
        if (i != -1 && i2 != -1) {
            String string = getString(i2);
            String string2 = getString(i);
            if (bn_()) {
                String string3 = getString(R.o.f13253fi);
                Runnable runnable = this.u;
                return C1163Rc.e(getActivity(), this.I, new C1907aSr(string, string2, string3, runnable, runnable));
            }
        }
        return null;
    }

    @Override // com.netflix.mediaclient.ui.player.IPlayerFragment
    public boolean j() {
        C7535cxz c7535cxz = this.f13301J;
        return c7535cxz != null && c7535cxz.f() == IPlayer.PlaybackType.OfflinePlayback;
    }

    @Override // o.InterfaceC7451cwU
    public boolean G() {
        return j();
    }

    private void bL() {
        C7535cxz c7535cxz;
        if (!j() || (c7535cxz = this.f13301J) == null || c7535cxz.h() == null) {
            return;
        }
        this.offlineApi.b(this.f13301J.h().aH_());
    }

    private void b(IClientLogging.CompletionReason completionReason) {
        j();
    }

    private boolean d(String str, PlayContext playContext) {
        boolean z = false;
        if (bl_() == null) {
            return false;
        }
        InterfaceC5206buQ b2 = this.offlineApi.b(str);
        if (c(b2) && b2.au_() == DownloadState.Complete) {
            bU();
            bW();
            z = true;
            if (C8168dfL.g(str)) {
                InterfaceC1598aHf.a("SPY-16126 Empty playableId");
                return true;
            }
            startActivity(this.playerUI.a(requireContext(), str, VideoType.EPISODE, playContext, new PlayerExtras(-1L)));
        }
        return z;
    }

    private boolean c(long j) {
        C7535cxz c7535cxz;
        if (j > 0 && (c7535cxz = this.f13301J) != null && !c7535cxz.n()) {
            if (j + l >= this.f13301J.a() && (ConnectivityUtils.l(getActivity()) || j())) {
                return true;
            }
        }
        return false;
    }

    public void as() {
        PlayerPictureInPictureManager playerPictureInPictureManager;
        if (aD()) {
            if (!C8054ddD.j() || this.E) {
                d(by_());
                aJY ak = ak();
                if (ak == null || (playerPictureInPictureManager = this.X) == null || playerPictureInPictureManager.c() == PlayerPictureInPictureManager.PlaybackPipStatus.d) {
                    return;
                }
                this.X.a(ak.L());
                if (this.X.b()) {
                    bD();
                }
            }
        }
    }

    public C7535cxz af() {
        return this.aj.b() ? this.af : this.f13301J;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPictureInPictureModeChanged(boolean z) {
        aJY ajy;
        if (!z && (ajy = this.ai) != null && ajy.u()) {
            PlayerPictureInPictureManager playerPictureInPictureManager = this.X;
            if (playerPictureInPictureManager != null) {
                playerPictureInPictureManager.e(false);
            }
            aH();
            return;
        }
        if (!Config_FastProperty_TabletopModeDisable.Companion.b()) {
            if (z) {
                this.H = 0;
                ViewUtils.b(this.ag, 0, true);
            } else if (this.M) {
                ViewUtils.b(this.ag, this.H, true);
            }
        }
        if (this.X != null) {
            this.E = false;
            super.onPictureInPictureModeChanged(z);
            aJY ajy2 = this.ai;
            if (ajy2 != null) {
                if (z) {
                    d(by_());
                    if (!this.ai.ab()) {
                        this.ai.ak();
                    }
                    this.ai.i();
                    this.ai.setPlayerBackgroundable(false);
                    bD();
                } else if (ajy2.u()) {
                    this.ai.a(ExitPipAction.STOP);
                    Y();
                    return;
                } else {
                    this.ai.a(ExitPipAction.CONTINUEPLAY);
                    if (!C8054ddD.j()) {
                        this.ai.setPlayerBackgroundable(bf());
                    }
                    this.e.b(cBA.class, cBA.C5564z.e);
                }
                if (this.X.c() != PlayerPictureInPictureManager.PlaybackPipStatus.d) {
                    this.X.e(z);
                }
            }
        }
    }

    public void e(String str, VideoType videoType, PlayContext playContext, long j) {
        C1044Mm.e("PlayerFragment", "restarting activity from pip. ");
        bU();
        bW();
        if (C8168dfL.g(str)) {
            InterfaceC1598aHf.a("Empty playableId");
        } else {
            startActivity(this.playerUI.a(requireContext(), str, videoType, playContext, new PlayerExtras(j)));
        }
    }

    public void a(InterfaceC5198buI interfaceC5198buI, PlayContext playContext, long j) {
        if (d(interfaceC5198buI.aE_().aH_(), playContext)) {
            return;
        }
        c(new C7535cxz(interfaceC5198buI, playContext, j, "Default", null, null));
    }

    private boolean bR() {
        return (this.ai instanceof C1677aKd) && this.ab != null && this.U && x() == null;
    }

    public void c(final C7535cxz c7535cxz) {
        if (bn_()) {
            C1044Mm.a("PlayerFragment", "CUSNP PlaybackVideoWrapper is %s", c7535cxz.h().aH_());
            this.ah = false;
            this.U = false;
            final PlayerExtras aU = aU();
            if (aU != null) {
                aU.m();
                C7631czp i = aU.i();
                if (i != null) {
                    i.a(false);
                }
            }
            this.playerFragmentCL.d(c7535cxz, aV(), this.x, y_());
            bV();
            aJY ajy = this.ai;
            if (ajy != null) {
                ajy.d(PlayerControls.PlayerPauseType.c);
            }
            this.f13301J = c7535cxz;
            final boolean b2 = this.aj.b();
            if (b2) {
                this.af = null;
                this.aj.d(false);
                if (this.prePlayComposeEnabled.get().booleanValue()) {
                    this.e.b(cBA.class, AbstractC5599cBj.a.a);
                }
            }
            bv();
            C7626czk c7626czk = this.aj;
            c7626czk.a = false;
            c7626czk.m = false;
            aJY ajy2 = this.ai;
            if (ajy2 != null) {
                ajy2.setPlayerBackgroundable(bf());
            }
            this.aj.l = IPlayerFragment.PlayerFragmentState.ACTIVITY_PLAYER_LOADING_NEXT;
            this.e.b(cBA.class, new cBA.C5556r(this.f13301J));
            if (C8168dfL.g(c7535cxz.m())) {
                InterfaceC1598aHf.a("SPY-17130 Start playback with null videoId");
                Y();
            }
            av();
            C8187dfe.a(new Runnable() { // from class: o.cye
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerFragmentV2.this.a(b2, c7535cxz, aU);
                }
            }, 1L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, C7535cxz c7535cxz, PlayerExtras playerExtras) {
        if (z) {
            e(c7535cxz.g(), c7535cxz.f(), c7535cxz.b(), c7535cxz.i(), c7535cxz.e(), null);
            return;
        }
        if (playerExtras != null) {
            playerExtras.b(c7535cxz.i());
        }
        c(c7535cxz.m(), c7535cxz.l(), c7535cxz.b(), playerExtras, TaskMode.FROM_CACHE_OR_NETWORK);
    }

    private long aV() {
        aJY ajy = this.ai;
        if (ajy != null) {
            return ajy.D();
        }
        return 0L;
    }

    public void at() {
        this.aj.f = SystemClock.elapsedRealtime();
    }

    public String ad() {
        if (aj() != null) {
            return aj().aH_();
        }
        return null;
    }

    public InterfaceC5160btX ag() {
        C7535cxz c7535cxz = this.f13301J;
        if (c7535cxz == null) {
            return null;
        }
        return c7535cxz.h();
    }

    private long aQ() {
        C7535cxz c7535cxz = this.f13301J;
        if (c7535cxz == null) {
            return 0L;
        }
        long i = c7535cxz.i();
        if (i <= -1) {
            i = this.f13301J.h().aF_();
        }
        if (i < 0) {
            C1044Mm.e("PlayerFragment", hashCode() + " Invalid bookmark, reset to 0");
            return 0L;
        }
        return i;
    }

    private PlayerExtras aU() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (PlayerExtras) arguments.getParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS);
        }
        return null;
    }

    @Override // com.netflix.mediaclient.ui.player.IPlayerFragment
    public View h() {
        return getView();
    }

    public void d(NetflixActivity netflixActivity) {
        aJY ajy = this.ai;
        if (ajy != null && ajy.u()) {
            C1044Mm.e("PlayerFragment", "player in background, won't dismiss dialog");
            return;
        }
        netflixActivity.removeVisibleDialog();
        if (netflixActivity.isDialogFragmentVisible()) {
            netflixActivity.removeDialogFrag();
        }
        NetflixDialogFrag netflixDialogFrag = this.B;
        if (netflixDialogFrag == null || !netflixDialogFrag.isVisible()) {
            return;
        }
        this.B.dismiss();
        this.B = null;
    }

    @Deprecated
    public void aw() {
        aJY ajy = this.ai;
        if (ajy != null) {
            ajy.setPlayerBackgroundable(false);
        }
        d(by_());
        if (f()) {
            bX();
            return;
        }
        this.e.b(cBA.class, new cBA.am());
        this.aj.a = true;
    }

    private void bJ() {
        int d2;
        C7535cxz af = af();
        if (af == null || af.h() == null) {
            return;
        }
        int an_ = af.h().an_();
        if (an_ <= -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Interrupter: autoPlayMaxCount = ");
            sb.append(an_);
            sb.append(" resetting to ");
            an_ = 3;
            sb.append(3);
            C1044Mm.e("PlayerFragment", sb.toString());
        }
        if (C8206dfx.e() && (d2 = C8157dfA.d(getContext(), "preference_debug_test_interrupter_auto_play_count", -1)) != -1) {
            an_ = d2;
        }
        C7626czk c7626czk = this.aj;
        if (c7626czk.d < an_ || c7626czk.c) {
            return;
        }
        C1044Mm.e("PlayerFragment", "This is " + an_ + " consecutive auto play with no user interaction, prepare the interrupter");
        this.e.b(cBA.class, cBA.ae.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bC() {
        C1044Mm.e("PlayerFragment", "onUserInteraction");
        C7626czk c7626czk = this.aj;
        c7626czk.c = true;
        c7626czk.d = 0;
        this.e.b(cBA.class, cBA.aw.c);
    }

    private boolean bf() {
        aOV aov = this.D;
        if (aov == null || aov.am()) {
            return false;
        }
        return this.D.J().c();
    }

    @Override // o.InterfaceC5274bvf
    public void e(String str, PlaylistTimestamp playlistTimestamp) {
        PlaylistTimestamp l2;
        IPlaylistControl e = C5639cCw.e.e(ak());
        if (e == null || (l2 = e.l()) == null) {
            return;
        }
        C1044Mm.e("PlayerFragment", "log segment transition. " + l2.toString());
        this.e.b(cBA.class, new cBA.C5553o(l2));
    }

    private C7631czp ba() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            PlayerExtras playerExtras = this.U ? this.ac : (PlayerExtras) arguments.getParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS);
            if (playerExtras != null) {
                return playerExtras.i();
            }
        }
        return null;
    }

    private long aX() {
        PlayerExtras playerExtras;
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey(NetflixActivity.EXTRA_PLAYER_EXTRAS) && (playerExtras = (PlayerExtras) arguments.getParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS)) != null) {
            long h = playerExtras.h();
            playerExtras.n();
            return h;
        }
        InterfaceC1598aHf.a("PlayerExtras.getUserPlayStartTime should not be null and contain UserPlayStartTime");
        return SystemClock.elapsedRealtime();
    }

    private boolean bd() {
        C7631czp ba = ba();
        return ba != null && ba.a() && ba.b();
    }

    private C7629czn aZ() {
        if (this.ay == null) {
            this.ay = new C7629czn(this, ba());
        }
        return this.ay;
    }

    private boolean aC() {
        InterfaceC5283bvo a = C8126deW.a(bj_());
        return a != null && a.isAutoPlayEnabled();
    }

    @Override // o.InterfaceC7451cwU
    public InterfaceC5160btX A() {
        return aj();
    }

    @Override // o.InterfaceC7451cwU
    public void V() {
        at();
    }

    @Override // o.InterfaceC7451cwU
    public void M() {
        bC();
    }

    @Override // o.InterfaceC7451cwU
    public void Z() {
        this.playerFragmentCL.j();
    }

    @Override // o.InterfaceC7451cwU
    public void J() {
        this.playerFragmentCL.a();
    }

    @Override // o.InterfaceC7451cwU
    public void R() {
        this.playerFragmentCL.h();
    }

    @Override // o.InterfaceC7451cwU
    public void e(String str) {
        this.playerFragmentCL.d(str);
    }

    @Override // o.InterfaceC7451cwU
    public void z() {
        f(false);
    }

    @Override // o.InterfaceC7451cwU
    public void r() {
        aI();
    }

    private void aI() {
        this.aj.e = true;
        f(false);
    }

    @Override // o.InterfaceC7451cwU
    public void q() {
        aa();
    }

    @Override // o.InterfaceC7451cwU
    public void t() {
        at();
        bC();
    }

    @Override // o.InterfaceC7451cwU
    public void n() {
        this.R.a();
    }

    @Override // o.InterfaceC7451cwU
    public void l() {
        final boolean V = this.ai.V();
        if (!V) {
            aE();
        }
        final C7969dbY c7969dbY = new C7969dbY(UUID.randomUUID().toString(), this.f13301J.m(), this.f13301J.h().aJ_(), (int) ak().o(), this.f13301J.g().getTitle(), this.f13301J.l() == VideoType.EPISODE ? this.f13301J.h().aC_() : null, this.f13301J.g().w(), this.f13301J.l().getKey());
        this.e.b(cBA.class, cBA.at.e);
        UserMarksFlexEventType.b(UserMarksFlexEventType.d, c7969dbY.i(), c7969dbY.g(), new HashMap());
        this.userMarks.get().b(c7969dbY, new drM() { // from class: o.cyL
            @Override // o.drM
            public final Object invoke(Object obj) {
                dpR b2;
                b2 = PlayerFragmentV2.this.b(c7969dbY, V, (Boolean) obj);
                return b2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR b(C7969dbY c7969dbY, boolean z, Boolean bool) {
        if (bool.booleanValue()) {
            UserMarksFlexEventType.b(UserMarksFlexEventType.c, c7969dbY.i(), c7969dbY.g(), new HashMap());
        }
        this.e.b(cBA.class, cBA.av.e);
        if (!z) {
            aa();
        }
        return dpR.c;
    }

    public void e(int i) {
        UserMarksFlexEventType userMarksFlexEventType;
        C7593czD f = aU().f();
        final int b2 = f.b() + i;
        if (b2 < 0 || b2 >= f.e().size()) {
            return;
        }
        final C7969dbY c7969dbY = f.e().get(b2);
        if (i > 0) {
            userMarksFlexEventType = UserMarksFlexEventType.i;
        } else {
            userMarksFlexEventType = UserMarksFlexEventType.h;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("position", b2 + "");
        UserMarksFlexEventType.b(userMarksFlexEventType, c7969dbY.i(), c7969dbY.g(), hashMap);
        b(c7969dbY.i(), VideoType.create(c7969dbY.h()), PlayContextImp.w, aU(), TaskMode.FROM_CACHE_OR_NETWORK, new d() { // from class: o.cyi
            @Override // com.netflix.mediaclient.ui.player.PlayerFragmentV2.d
            public final void d(C5593cBd c5593cBd) {
                PlayerFragmentV2.this.c(b2, c7969dbY, c5593cBd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i, C7969dbY c7969dbY, C5593cBd c5593cBd) {
        a(c5593cBd, i, c7969dbY.g());
    }

    @Override // o.InterfaceC7451cwU
    public void Q() {
        e(-1);
    }

    @Override // o.InterfaceC7451cwU
    public void K() {
        e(1);
    }

    @Override // o.InterfaceC7451cwU
    public void c(int i) {
        if (bj_().getTutorialHelper().e()) {
            f(false);
            this.userMarks.get().d(this.messaging, Integer.valueOf(i), new drO() { // from class: o.cyx
                @Override // o.drO
                public final Object invoke() {
                    dpR bj;
                    bj = PlayerFragmentV2.this.bj();
                    return bj;
                }
            });
            this.e.b(cBA.class, new cBA.az(true));
            bj_().getTutorialHelper().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR bj() {
        aa();
        this.e.b(cBA.class, new cBA.az(false));
        return null;
    }

    private void a(C5593cBd c5593cBd, int i, long j) {
        aU().f().b(i);
        a(new C7535cxz(c5593cBd.j(), PlayContextImp.w, j, null));
    }

    @Override // o.InterfaceC7451cwU
    public void d(int i, boolean z) {
        if (ak() != null && j()) {
            if (Long.valueOf(ak().h()).longValue() > 0) {
                d((int) Math.min(i, ak().h()), z);
                return;
            } else {
                d(i, z);
                return;
            }
        }
        d(i, z);
    }

    @Override // o.InterfaceC7451cwU
    public void ac() {
        bV();
    }

    @Override // o.InterfaceC7451cwU
    public void F() {
        bk();
    }

    @Override // o.InterfaceC7451cwU
    public void W() {
        bS();
    }

    @Override // o.InterfaceC7451cwU
    public void U() {
        bP();
    }

    @Override // o.InterfaceC7451cwU
    public InterfaceC5198buI v() {
        return aN();
    }

    @Override // o.InterfaceC7451cwU
    public void a(C7535cxz c7535cxz) {
        c(c7535cxz);
    }

    @Override // o.InterfaceC7451cwU
    public void a(String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras) {
        this.playbackLauncher.get().c(str, videoType, playContext, playerExtras);
    }

    @Override // o.InterfaceC7451cwU
    public void N() {
        bz();
    }

    @Override // o.InterfaceC7451cwU
    public boolean E() {
        return bd();
    }

    @Override // o.InterfaceC7451cwU
    public boolean C() {
        return bf();
    }

    @Override // o.InterfaceC7451cwU
    public void j(boolean z) {
        m(z);
    }

    @Override // o.InterfaceC7451cwU
    public void m() {
        Y();
    }

    @Override // o.InterfaceC7451cwU
    public void c(int i, boolean z) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.setRequestedOrientation(i);
    }

    @Override // o.InterfaceC7451cwU
    public void e(cBA cba) {
        this.e.b(cBA.class, cba);
    }

    @Override // o.InterfaceC7451cwU
    public Interactivity x() {
        return am().a();
    }

    @Override // o.InterfaceC7451cwU
    public void e(boolean z) {
        am().h = z;
    }

    @Override // o.InterfaceC7451cwU
    public void T() {
        am().d = 0;
    }

    @Override // o.InterfaceC7451cwU
    public void h(boolean z) {
        am().k = z;
    }

    @Override // o.InterfaceC7451cwU
    public void c(boolean z) {
        am().g = z;
    }

    @Override // o.InterfaceC7451cwU
    public boolean I() {
        return bh();
    }

    @Override // o.InterfaceC7451cwU
    public void b(boolean z) {
        am().a = z;
    }

    @Override // o.InterfaceC7451cwU
    public void d(boolean z) {
        am().m = z;
    }

    @Override // o.InterfaceC7451cwU
    public boolean H() {
        return am().b();
    }

    @Override // o.InterfaceC7451cwU
    public void L() {
        aw();
    }

    @Override // o.InterfaceC7451cwU
    @SuppressLint({"AutoDispose"})
    public void b(ImpressionData impressionData) {
        this.f.add(this.v.d(af(), impressionData).toObservable().subscribe());
    }

    @Override // o.InterfaceC7451cwU
    public C7535cxz u() {
        return af();
    }

    @Override // o.InterfaceC7451cwU
    public void D() {
        this.aj.e();
    }

    @Override // o.InterfaceC7451cwU
    public int w() {
        return this.aj.d;
    }

    @Override // o.InterfaceC7451cwU
    public boolean c(InterfaceC5206buQ interfaceC5206buQ) {
        if (!ConnectivityUtils.l(AbstractApplicationC1040Mh.d()) || !this.offlineApi.d(interfaceC5206buQ) || interfaceC5206buQ.C().c() || interfaceC5206buQ.C() == WatchState.WATCHING_ALLOWED) {
            return this.offlineApi.d(interfaceC5206buQ);
        }
        return false;
    }

    @Override // o.InterfaceC7451cwU
    public void c(String str) {
        C7535cxz c7535cxz = this.f13301J;
        if (c7535cxz != null) {
            this.socialSharing.e(c7535cxz.g(), str);
        }
    }

    @Override // o.InterfaceC7451cwU
    public void d(String str) {
        String title;
        if (!this.ai.V()) {
            aE();
        }
        C7535cxz c7535cxz = this.f13301J;
        if (c7535cxz != null) {
            InterfaceC5198buI g = c7535cxz.g();
            if (this.f13301J.l() == VideoType.EPISODE) {
                title = this.f13301J.h().aC_() + " - " + g.getTitle();
            } else {
                title = g.getTitle();
            }
            long o2 = ak().o();
            String a = C7969dbY.a(o2);
            UserMarksFlexEventType.b(UserMarksFlexEventType.f, g.getId(), (int) o2, new HashMap());
            this.socialSharing.e(g.getId(), g.getType(), g.getTitle(), C1333Xq.d(str).d(SignupConstants.Field.VIDEO_TITLE, title).d("timestamp", a).c(), (int) TimeUnit.MILLISECONDS.toSeconds(o2), null);
        }
    }

    @Override // o.InterfaceC7451cwU
    public ByteBuffer a(long j) {
        aJY ak = ak();
        if (ak != null) {
            return ak.e(j);
        }
        return null;
    }

    @Override // o.InterfaceC7451cwU
    @SuppressLint({"AutoDispose"})
    public void e(String str, long j, String str2, List<String> list, AudioSource audioSource, Subtitle subtitle, StateHistory stateHistory) {
        C7535cxz af = af();
        if (af != null) {
            this.f.add(this.v.d(af, str, j, str2, list, subtitle, audioSource, stateHistory).takeUntil(this.e.d().ignoreElements()).subscribe(new Consumer() { // from class: o.cyu
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PlayerFragmentV2.this.d((C6004cQk.d) obj);
                }
            }, new Consumer() { // from class: o.cyz
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PlayerFragmentV2.d((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Throwable th) {
        if (th instanceof CancellationException) {
            C1044Mm.e("PlayerFragment", "cancellation for fetching interactive moments");
        } else {
            InterfaceC1598aHf.e("fetching interactive moments failed", th);
        }
    }

    private static TimeCodesData d(InterfaceC5160btX interfaceC5160btX) {
        VideoInfo.TimeCodes B;
        if (interfaceC5160btX == null || (B = interfaceC5160btX.B()) == null) {
            return null;
        }
        return B.getTimeCodesData();
    }

    @Override // o.InterfaceC7441cwK
    public void a() {
        if (isDetached()) {
            return;
        }
        PlayerExtras aU = aU();
        if (aU != null) {
            aU.m();
        }
        bu();
    }

    @Override // o.InterfaceC7441cwK
    public void c() {
        Y();
    }

    public boolean ap() {
        return this.adsPlan.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(C6004cQk.d<InteractiveMoments> dVar) {
        if (!dVar.d().j() || dVar.c() == null) {
            return;
        }
        C7535cxz af = af();
        if (af != null) {
            af.a(dVar.c());
        }
        this.e.b(cBA.class, new cBA.C5546h(dVar.c()));
    }

    @SuppressLint({"NewApi"})
    public void au() {
        PlayerPictureInPictureManager playerPictureInPictureManager = this.X;
        if (playerPictureInPictureManager == null || !playerPictureInPictureManager.b(aq(), NetflixApplication.getInstance())) {
            return;
        }
        this.E = true;
        as();
    }

    @SuppressLint({"AutoDispose"})
    private void aJ() {
        aJY ak = ak();
        if (ak == null || !aJR.a.c(aM())) {
            return;
        }
        ak.setExperience(new C7446cwP());
    }

    private void b(Language language) {
        aJY ak;
        if (!C8159dfC.j(requireContext()) || language == null || language.getSelectedSubtitle() == null || language.getSelectedSubtitle().getLanguageDescription() == null || !language.getSelectedSubtitle().getLanguageDescription().equalsIgnoreCase("off") || (ak = ak()) == null || !ak.aa()) {
            return;
        }
        ak.ag();
        String aM = aM();
        if (C8168dfL.h(aM)) {
            aJR.a.a(aM);
            ak.setExperience(new C5124bso("Default"));
            aJT.a();
        }
    }

    private boolean bc() {
        return aJR.a.c(aM());
    }

    private C7490cxG aS() {
        if (this.av == null) {
            this.av = new C7490cxG(this.e, this.X);
        }
        return this.av;
    }

    private float aP() {
        aJY ajy = this.ai;
        if (ajy == null || aJV.e(ajy) == -1.0f) {
            return 0.5f;
        }
        return aJV.e(this.ai);
    }

    @SuppressLint({"AutoDispose"})
    private void b(String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, TaskMode taskMode, final d dVar) {
        if (C8054ddD.l(bj_())) {
            return;
        }
        this.f.add(this.au.c(str, videoType, playContext, playerExtras, taskMode, aM(), c(PlaybackLauncher.PlayLaunchedBy.d)).subscribe(new Consumer() { // from class: o.cyy
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.d.this.d((C5593cBd) obj);
            }
        }, new Consumer() { // from class: o.cyH
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerFragmentV2.g((Throwable) obj);
            }
        }));
    }

    private void c(final PostPlayExperience postPlayExperience) {
        InterfaceC5160btX h;
        String aH_;
        C7535cxz af = af();
        if (af != null && (aH_ = (h = af.h()).aH_()) != null) {
            this.j = this.postPlayManagerFactory.a(af.f(), c(PlaybackLauncher.PlayLaunchedBy.d), aH_, h.M(), postPlayExperience);
        }
        this.postPlayPlaygraphHelper.get().d(postPlayExperience, new InterfaceC8612dsa() { // from class: o.cxR
            @Override // o.InterfaceC8612dsa
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                dpR e;
                e = PlayerFragmentV2.this.e(postPlayExperience, (InterfaceC5160btX) obj, (VideoType) obj2, (Long) obj3);
                return e;
            }
        }, new drO() { // from class: o.cxQ
            @Override // o.drO
            public final Object invoke() {
                dpR d2;
                d2 = PlayerFragmentV2.this.d(postPlayExperience);
                return d2;
            }
        }, new drM() { // from class: o.cxS
            @Override // o.drM
            public final Object invoke(Object obj) {
                dpR e;
                e = PlayerFragmentV2.this.e(postPlayExperience, (InterfaceC5160btX) obj);
                return e;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
        if (r0 == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ o.dpR e(com.netflix.model.leafs.PostPlayExperience r10, o.InterfaceC5160btX r11, com.netflix.mediaclient.servicemgr.interface_.VideoType r12, java.lang.Long r13) {
        /*
            r9 = this;
            boolean r0 = r11.H()
            java.lang.String r1 = "nextEpisodeSeamless"
            if (r0 != 0) goto La3
            boolean r0 = r9.bn_()
            if (r0 == 0) goto La3
            boolean r0 = r9.ay()
            if (r0 == 0) goto La3
            o.czk r0 = r9.am()
            com.netflix.mediaclient.ui.player.v2.interactive.Interactivity r0 = r0.a()
            if (r0 != 0) goto La3
            r0 = 1
            r9.k(r0)
            java.lang.String r0 = r11.aH_()
            long r3 = o.C8168dfL.f(r0)
            long r6 = r13.longValue()
            r5 = 0
            r2 = r9
            boolean r0 = r2.d(r3, r5, r6)
            boolean r2 = o.C1877aRo.j()
            if (r2 == 0) goto L51
            java.lang.String r2 = r10.getType()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L51
            boolean r2 = r9.j()
            if (r2 != 0) goto L51
            o.cxM r2 = o.C7496cxM.e
            java.lang.String r3 = "playgraphAppendPlayable"
            r2.e(r3)
        L51:
            com.netflix.mediaclient.android.activity.NetflixActivity r2 = r9.bj_()
            if (r2 == 0) goto L6a
            com.netflix.mediaclient.android.activity.NetflixActivity r2 = r9.bj_()
            boolean r2 = r2 instanceof o.bDG
            if (r2 == 0) goto L6a
            com.netflix.mediaclient.android.activity.NetflixActivity r2 = r9.bj_()
            o.bDG r2 = (o.bDG) r2
            com.netflix.mediaclient.util.PlayContext r2 = r2.y_()
            goto L6b
        L6a:
            r2 = 0
        L6b:
            r6 = r2
            if (r0 == 0) goto La1
            if (r12 == 0) goto La1
            if (r6 == 0) goto La1
            java.lang.String r2 = r11.aH_()
            if (r2 == 0) goto La1
            boolean r2 = o.C1877aRo.j()
            if (r2 == 0) goto L95
            java.lang.String r2 = r10.getType()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L95
            boolean r2 = r9.j()
            if (r2 != 0) goto L95
            o.cxM r2 = o.C7496cxM.e
            java.lang.String r3 = "fetchDataForPlaygraph"
            r2.e(r3)
        L95:
            java.lang.String r4 = r11.aH_()
            com.netflix.mediaclient.browse.api.task.TaskMode r8 = com.netflix.mediaclient.browse.api.task.TaskMode.FROM_CACHE_OR_NETWORK
            r7 = 0
            r3 = r9
            r5 = r12
            r3.c(r4, r5, r6, r7, r8)
        La1:
            if (r0 != 0) goto Lc9
        La3:
            boolean r12 = o.C1877aRo.j()
            if (r12 == 0) goto Lc0
            java.lang.String r10 = r10.getType()
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto Lc0
            boolean r10 = r9.j()
            if (r10 != 0) goto Lc0
            o.cxM r10 = o.C7496cxM.e
            java.lang.String r12 = "regularPlayerPrepare1"
            r10.e(r12)
        Lc0:
            com.netflix.mediaclient.servicemgr.PlayerPrefetchSource r10 = com.netflix.mediaclient.servicemgr.PlayerPrefetchSource.PostPlay
            long r12 = r13.longValue()
            o.C8006dcI.e(r11, r10, r12)
        Lc9:
            o.dpR r10 = o.dpR.c
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.PlayerFragmentV2.e(com.netflix.model.leafs.PostPlayExperience, o.btX, com.netflix.mediaclient.servicemgr.interface_.VideoType, java.lang.Long):o.dpR");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR d(PostPlayExperience postPlayExperience) {
        if (bn_() && ay() && am().a() == null) {
            if (C1877aRo.j() && "nextEpisodeSeamless".equals(postPlayExperience.getType()) && !j()) {
                C7496cxM.e.e("resetPlaygraphImpl");
            }
            n(false);
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR e(PostPlayExperience postPlayExperience, InterfaceC5160btX interfaceC5160btX) {
        if (bn_()) {
            if (C1877aRo.j() && "nextEpisodeSeamless".equals(postPlayExperience.getType()) && !j()) {
                C7496cxM.e.e("regularPlayerPrepare2");
            }
            C8006dcI.e(interfaceC5160btX, PlayerPrefetchSource.PostPlay);
        }
        return dpR.c;
    }

    private boolean bh() {
        InterfaceC7607czR interfaceC7607czR;
        return this.aj.a || ((interfaceC7607czR = this.j) != null && interfaceC7607czR.b());
    }

    @Override // o.InterfaceC7451cwU
    public void e(cBR cbr) {
        InterfaceC7607czR interfaceC7607czR;
        if (!bn_() || (interfaceC7607czR = this.j) == null) {
            return;
        }
        interfaceC7607czR.a(cbr, new drM() { // from class: o.cyb
            @Override // o.drM
            public final Object invoke(Object obj) {
                dpR c;
                c = PlayerFragmentV2.this.c((AbstractC7612czW) obj);
                return c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR c(AbstractC7612czW abstractC7612czW) {
        if (abstractC7612czW instanceof AbstractC7612czW.b) {
            aJY ajy = this.ai;
            if (ajy != null) {
                ajy.setPlayerBackgroundable(bf());
            }
            this.e.b(cBA.class, AbstractC5597cBh.d.b);
        } else if (abstractC7612czW instanceof AbstractC7612czW.e) {
            this.e.b(cBA.class, AbstractC5597cBh.d.b);
            AbstractC7612czW.e eVar = (AbstractC7612czW.e) abstractC7612czW;
            d(eVar.d(), true, VideoType.EPISODE, eVar.c(), eVar.a(), eVar.i(), eVar.e(), eVar.b());
        } else if ((abstractC7612czW instanceof AbstractC7612czW.a) && bn_() && bj_() != null) {
            bj_().exit();
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(PostPlayExperience postPlayExperience) {
        if (bn_()) {
            if (postPlayExperience == null) {
                if (this.aB != PlaybackContext.a || bj_() == null) {
                    return;
                }
                C7496cxM.d();
                bj_().exit();
                return;
            }
            boolean equalsIgnoreCase = "liveEventEnd".equalsIgnoreCase(postPlayExperience.getType());
            boolean z = true;
            boolean z2 = !j() && "nextEpisodeSeamless".equalsIgnoreCase(postPlayExperience.getType()) && C1877aRo.h();
            if (!equalsIgnoreCase && !z2) {
                z = false;
            }
            if (!j() && "nextEpisodeSeamless".equalsIgnoreCase(postPlayExperience.getType()) && C1877aRo.j()) {
                C7496cxM.e.e("postPlayDataFetched");
            }
            if (z) {
                c(postPlayExperience);
            } else {
                this.e.b(cBA.class, new cBA.Z(postPlayExperience));
            }
        }
    }

    private void bD() {
        InterfaceC7607czR interfaceC7607czR = this.j;
        if (interfaceC7607czR != null) {
            interfaceC7607czR.d(new drO() { // from class: o.cyO
                @Override // o.drO
                public final Object invoke() {
                    dpR bp;
                    bp = PlayerFragmentV2.this.bp();
                    return bp;
                }
            });
        }
        this.e.b(cBA.class, cBA.K.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR bp() {
        this.e.b(cBA.class, AbstractC5597cBh.d.b);
        return dpR.c;
    }
}
