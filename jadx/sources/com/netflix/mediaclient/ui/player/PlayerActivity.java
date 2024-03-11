package com.netflix.mediaclient.ui.player;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowLayoutInfo;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.action.StartPlay;
import com.netflix.clcs.ui.InterstitialCoordinator;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.player.PlayerActivity;
import com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.originals.interactive.Moment;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractActivityC7444cwN;
import o.C1045Mp;
import o.C1059Nd;
import o.C1596aHd;
import o.C8054ddD;
import o.C8151dev;
import o.C8159dfC;
import o.C8168dfL;
import o.C8196dfn;
import o.C8263dhA;
import o.C8576dqs;
import o.C8580dqw;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5091bsH;
import o.InterfaceC5160btX;
import o.InterfaceC7469cwm;
import o.aIA;
import o.bDG;
import o.bXD;
import o.dqE;
import org.chromium.net.NetError;
import org.json.JSONObject;

@aIA
@AndroidEntryPoint
/* loaded from: classes4.dex */
public class PlayerActivity extends AbstractActivityC7444cwN implements bDG, InterstitialCoordinator.b, InterfaceC7469cwm {
    public static final d d = new d(null);
    private PlayerFragmentV2 b;
    @Inject
    public Lazy<bXD> interstitials;

    public static final Class<? extends PlayerActivity> k() {
        return d.c();
    }

    @Override // o.MO
    public boolean i() {
        return false;
    }

    @Override // o.MO, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean isPlayerActivity() {
        return true;
    }

    @Override // o.MO
    public int j() {
        return R.i.ae;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldAttachToolbar() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showMdxInMenu() {
        return true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSettingsInMenu() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSignOutInMenu() {
        return false;
    }

    public final Lazy<bXD> l() {
        Lazy<bXD> lazy = this.interstitials;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.clcs.ui.InterstitialCoordinator.b
    public InterstitialCoordinator c() {
        return l().get().e();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingPermission"})
    public void onNewIntent(Intent intent) {
        Map d2;
        Map k;
        Throwable th;
        boolean g;
        Throwable th2;
        Map d3;
        Map k2;
        Throwable th3;
        InterfaceC5160btX aj;
        C8632dsu.c((Object) intent, "");
        super.onNewIntent(intent);
        if (!C8054ddD.j() && intent.getBooleanExtra("extra_close_notification_shade", false)) {
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        PlayerFragmentV2 playerFragmentV2 = this.b;
        String str = null;
        if ((playerFragmentV2 != null ? playerFragmentV2.aj() : null) != null) {
            d dVar = d;
            PlayerFragmentV2 playerFragmentV22 = this.b;
            if (playerFragmentV22 != null && (aj = playerFragmentV22.aj()) != null) {
                str = aj.aH_();
            }
            if (dVar.e(str, intent)) {
                dVar.getLogTag();
                intent.putExtra("extra_on_new_intent_for_same_video", true);
                return;
            }
        }
        PlayerFragmentV2 playerFragmentV23 = this.b;
        if (playerFragmentV23 == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d3 = dqE.d();
            k2 = dqE.k(d3);
            C1596aHd c1596aHd = new C1596aHd("SPY-8343 - PlayerActivity received onNewIntent() prior to onCreate() - skipping to avoid crash", null, null, true, k2, false, false, 96, null);
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
                th3 = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th3 = new Throwable(c1596aHd.b());
            } else {
                Throwable th4 = c1596aHd.i;
                if (th4 == null) {
                    th3 = new Throwable("Handled exception with no message");
                } else if (th4 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    th3 = th4;
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar2.a();
            if (a != null) {
                a.e(c1596aHd, th3);
            } else {
                dVar2.e().b(c1596aHd, th3);
            }
        } else if (playerFragmentV23 != null) {
            d dVar3 = d;
            dVar3.getLogTag();
            String stringExtra = intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID);
            if (stringExtra != null) {
                g = C8691duz.g(stringExtra);
                if (!g) {
                    VideoType create = VideoType.create(intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE));
                    PlayContext playContext = (PlayContext) intent.getParcelableExtra(NetflixActivity.EXTRA_PLAY_CONTEXT);
                    if (playContext == null) {
                        playContext = new EmptyPlayContext(dVar3.getLogTag(), NetError.ERR_EMPTY_RESPONSE);
                    } else {
                        C8632dsu.d(playContext);
                    }
                    PlayContext playContext2 = playContext;
                    PlayerExtras playerExtras = (PlayerExtras) intent.getParcelableExtra(NetflixActivity.EXTRA_PLAYER_EXTRAS);
                    if (playerExtras != null) {
                        long e2 = playerExtras.e();
                        if (playerFragmentV23.f()) {
                            playerFragmentV23.e(stringExtra, create, playContext2, e2);
                            return;
                        }
                        playerFragmentV23.av();
                        playerFragmentV23.d(stringExtra, create, playContext2, playerExtras, intent.getLongExtra("CL_START_PLAY_SESSION_ID", 0L));
                        return;
                    }
                    InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                    C1596aHd b2 = new C1596aHd("PlayerExtras is null in PlayerActivity", null, null, false, null, false, false, 126, null).b(false);
                    ErrorType errorType2 = b2.a;
                    if (errorType2 != null) {
                        b2.e.put("errorType", errorType2.c());
                        String b3 = b2.b();
                        if (b3 != null) {
                            String c2 = errorType2.c();
                            b2.a(c2 + " " + b3);
                        }
                    }
                    if (b2.b() != null && b2.i != null) {
                        th2 = new Throwable(b2.b(), b2.i);
                    } else if (b2.b() != null) {
                        th2 = new Throwable(b2.b());
                    } else {
                        Throwable th5 = b2.i;
                        if (th5 == null) {
                            th2 = new Throwable("Handled exception with no message");
                        } else if (th5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        } else {
                            th2 = th5;
                        }
                    }
                    InterfaceC1601aHi.d dVar4 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar4.a();
                    if (a2 != null) {
                        a2.e(b2, th2);
                    } else {
                        dVar4.e().b(b2, th2);
                    }
                    playerFragmentV23.av();
                }
            }
            InterfaceC1598aHf.c cVar3 = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd2 = new C1596aHd("Unable to start handle the new intent without a video id", null, null, true, k, false, false, 96, null);
            ErrorType errorType3 = c1596aHd2.a;
            if (errorType3 != null) {
                c1596aHd2.e.put("errorType", errorType3.c());
                String b4 = c1596aHd2.b();
                if (b4 != null) {
                    String c3 = errorType3.c();
                    c1596aHd2.a(c3 + " " + b4);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th = new Throwable(c1596aHd2.b());
            } else {
                Throwable th6 = c1596aHd2.i;
                if (th6 == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th6 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    th = th6;
                }
            }
            InterfaceC1601aHi.d dVar5 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a3 = dVar5.a();
            if (a3 != null) {
                a3.e(c1596aHd2, th);
            } else {
                dVar5.e().b(c1596aHd2, th);
            }
            playerFragmentV23.av();
        }
    }

    @Override // o.MO
    public Fragment d() {
        Bundle arguments;
        Throwable th;
        Intent intent = getIntent();
        if (intent.getIntExtra(NetflixActivity.EXTRA_DISMISS_NOTIFICATION_ID, -1) > 0) {
            Object systemService = getSystemService(Moment.TYPE.NOTIFICATION);
            C8632dsu.d(systemService);
            ((NotificationManager) systemService).cancel(intent.getIntExtra(NetflixActivity.EXTRA_DISMISS_NOTIFICATION_ID, -1));
        }
        if (intent.getBooleanExtra("extra_requires_cl_session_start", false)) {
            d dVar = d;
            C8632dsu.d(intent);
            dVar.c(intent);
        }
        if (intent.hasExtra(NetflixActivity.EXTRA_VIDEO_ID)) {
            String stringExtra = intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID);
            if (stringExtra == null) {
                throw new IllegalArgumentException("EXTRA_VIDEO_ID cannot be null".toString());
            }
            this.b = PlayerFragmentV2.a(stringExtra, VideoType.create(intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE)), (PlayContext) intent.getParcelableExtra(NetflixActivity.EXTRA_PLAY_CONTEXT), intent.getLongExtra("CL_START_PLAY_SESSION_ID", 0L), (PlayerExtras) intent.getParcelableExtra(NetflixActivity.EXTRA_PLAYER_EXTRAS));
        }
        PlayerFragmentV2 playerFragmentV2 = this.b;
        if (playerFragmentV2 == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd b = new C1596aHd("Unable to create primary fragment in PlayerActivity as video id was not passed in the intent.", null, null, false, null, false, false, 126, null).b(false);
            ErrorType errorType = b.a;
            if (errorType != null) {
                b.e.put("errorType", errorType.c());
                String b2 = b.b();
                if (b2 != null) {
                    String c = errorType.c();
                    b.a(c + " " + b2);
                }
            }
            if (b.b() != null && b.i != null) {
                th = new Throwable(b.b(), b.i);
            } else if (b.b() != null) {
                th = new Throwable(b.b());
            } else {
                th = b.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar2.a();
            if (a != null) {
                a.e(b, th);
            } else {
                dVar2.e().b(b, th);
            }
            finish();
        } else if (playerFragmentV2 != null && (arguments = playerFragmentV2.getArguments()) != null) {
            arguments.putParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS, intent.getParcelableExtra(NetflixActivity.EXTRA_PLAYER_EXTRAS));
        }
        PlayerFragmentV2 playerFragmentV22 = this.b;
        C8632dsu.d(playerFragmentV22);
        return playerFragmentV22;
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Map k;
        Throwable th;
        Map d2;
        Map k2;
        Throwable th2;
        Intent intent = getIntent();
        try {
            boolean z = true;
            boolean z2 = intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID) == null;
            if (z2) {
                StringBuilder sb = new StringBuilder();
                try {
                    sb.append(" taskRoot: ");
                    sb.append(isTaskRoot());
                    sb.append(" savedInstance: ");
                    if (bundle == null) {
                        z = false;
                    }
                    sb.append(z);
                    sb.append(" Action: ");
                    sb.append(intent.getAction());
                    sb.append(" ");
                    sb.append(" PIP Enabled: ");
                    sb.append(C8159dfC.f(this));
                    sb.append(" ");
                    sb.append(" in PIP mode: ");
                    sb.append(isInPictureInPictureMode());
                    sb.append(" ");
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        for (String str : extras.keySet()) {
                            sb.append("[");
                            sb.append(str);
                            sb.append("=");
                            sb.append(extras.get(str));
                            sb.append("]");
                        }
                    }
                } catch (Throwable th3) {
                    sb.append("[EXCEPTION: ");
                    sb.append(th3);
                    sb.append("]");
                }
                InterfaceC1593aHa.c.a("SPY-16126 intent didn't have videoId" + ((Object) sb));
            }
            try {
                super.onCreate(bundle);
            } catch (Exception e2) {
                if (z2) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k2 = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd("SPY-16126 intent didn't have videoId look at last breadcrumb", null, null, true, k2, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            c1596aHd.a(errorType.c() + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th2 = new Throwable(c1596aHd.b());
                    } else {
                        th2 = c1596aHd.i;
                        if (th2 == null) {
                            th2 = new Throwable("Handled exception with no message");
                        } else if (th2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th2);
                    } else {
                        dVar.e().b(c1596aHd, th2);
                    }
                    finish();
                } else {
                    throw e2;
                }
            }
            m();
        } catch (Throwable unused) {
            InterfaceC1597aHe.d dVar2 = InterfaceC1597aHe.b;
            k = dqE.k(new LinkedHashMap());
            C1596aHd c1596aHd2 = new C1596aHd("SPY-33344 - reading player intent failed", null, null, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd2.a;
            if (errorType2 != null) {
                c1596aHd2.e.put("errorType", errorType2.c());
                String b2 = c1596aHd2.b();
                if (b2 != null) {
                    c1596aHd2.a(errorType2.c() + " " + b2);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th = new Throwable(c1596aHd2.b());
            } else {
                th = c1596aHd2.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar3 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c = dVar3.c();
            if (c != null) {
                c.d(c1596aHd2, th);
            } else {
                dVar3.e().b(c1596aHd2, th);
            }
            super.onCreate(bundle);
            finish();
        }
    }

    private final void m() {
        if (isInMultiWindowMode()) {
            getWindow().clearFlags(1024);
        } else {
            getWindow().addFlags(1024);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        PlayerFragmentV2 playerFragmentV2 = this.b;
        if (playerFragmentV2 != null) {
            playerFragmentV2.y();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC5091bsH {
        e() {
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerReady(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) serviceManager, "");
            C8632dsu.c((Object) status, "");
            Fragment h = PlayerActivity.this.h();
            C8632dsu.d(h);
            ((NetflixFrag) h).onManagerReady(serviceManager, status);
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) status, "");
            d dVar = PlayerActivity.d;
            Fragment h = PlayerActivity.this.h();
            C8632dsu.d(h);
            ((NetflixFrag) h).onManagerUnavailable(serviceManager, status);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new e();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.playback;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public C8263dhA getDataContext() {
        String stringExtra;
        InterfaceC5160btX aj;
        PlayContext y_ = y_();
        PlayerFragmentV2 playerFragmentV2 = this.b;
        if (playerFragmentV2 == null || (aj = playerFragmentV2.aj()) == null || (stringExtra = aj.aH_()) == null) {
            stringExtra = getIntent().getStringExtra(NetflixActivity.EXTRA_VIDEO_ID);
        }
        return new C8263dhA(y_, stringExtra);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        endRenderNavigationLevelSession(IClientLogging.CompletionReason.success, null);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onLayoutInfoChanged(WindowLayoutInfo windowLayoutInfo) {
        List b;
        Object x;
        C8632dsu.c((Object) windowLayoutInfo, "");
        PlayerFragmentV2 playerFragmentV2 = this.b;
        if (playerFragmentV2 != null) {
            if (C8151dev.j(this) && C8159dfC.d()) {
                playerFragmentV2.d(13);
            } else {
                playerFragmentV2.d(6);
            }
            if (windowLayoutInfo.getDisplayFeatures().isEmpty()) {
                playerFragmentV2.b((FoldingFeature) null, 0);
                return;
            }
            b = C8580dqw.b(windowLayoutInfo.getDisplayFeatures(), FoldingFeature.class);
            x = C8576dqs.x(b);
            FoldingFeature foldingFeature = (FoldingFeature) x;
            if (foldingFeature != null) {
                C1059Nd c1059Nd = this.orientationHandler;
                View h = playerFragmentV2.h();
                C8632dsu.a(h, "");
                int b2 = c1059Nd.b(h, foldingFeature);
                if (this.orientationHandler.c(foldingFeature)) {
                    playerFragmentV2.b(foldingFeature, b2);
                } else {
                    playerFragmentV2.b((FoldingFeature) null, b2);
                }
            }
        }
    }

    @Override // o.InterfaceC7469cwm
    public void b() {
        PlayerFragmentV2 playerFragmentV2 = this.b;
        if (playerFragmentV2 != null) {
            playerFragmentV2.b();
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (C8196dfn.b(this)) {
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void invalidateOptionsMenu() {
        super.invalidateOptionsMenu();
        d.getLogTag();
        PlayerFragmentV2 playerFragmentV2 = this.b;
        if (playerFragmentV2 != null) {
            playerFragmentV2.az();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C8632dsu.c((Object) keyEvent, "");
        PlayerFragmentV2 playerFragmentV2 = this.b;
        if (playerFragmentV2 == null || !(playerFragmentV2 == null || playerFragmentV2.e(i, keyEvent))) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C8632dsu.c((Object) keyEvent, "");
        PlayerFragmentV2 playerFragmentV2 = this.b;
        if (playerFragmentV2 == null || !(playerFragmentV2 == null || playerFragmentV2.c(i, keyEvent))) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        PlayerFragmentV2 playerFragmentV2 = this.b;
        if (playerFragmentV2 != null) {
            playerFragmentV2.i(z);
        }
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean handleBackPressed() {
        PlayerFragmentV2 playerFragmentV2 = this.b;
        if (playerFragmentV2 != null) {
            return playerFragmentV2.o();
        }
        return true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, o.InterfaceC8018dcU
    public void onPlayVerified(boolean z, Object obj) {
        C8632dsu.c(obj, "");
        PlayerFragmentV2 playerFragmentV2 = this.b;
        if (playerFragmentV2 != null) {
            playerFragmentV2.c(z, (PlayVerifierVault) obj);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.b != null || h() == null) {
            return;
        }
        Fragment h = h();
        C8632dsu.d(h);
        this.b = (PlayerFragmentV2) h;
    }

    @Override // o.bDG
    public PlayContext y_() {
        PlayContext y_;
        PlayerFragmentV2 playerFragmentV2 = this.b;
        if (playerFragmentV2 == null || (y_ = playerFragmentV2.y_()) == null) {
            PlayContext playContext = (PlayContext) getIntent().getParcelableExtra(NetflixActivity.EXTRA_PLAY_CONTEXT);
            return playContext == null ? new EmptyPlayContext(d.getLogTag(), NetError.ERR_RESPONSE_HEADERS_TOO_BIG) : playContext;
        }
        return y_;
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        dismissAllVisibleDialog();
        PlayerFragmentV2 playerFragmentV2 = this.b;
        if (playerFragmentV2 != null) {
            playerFragmentV2.au();
        }
        super.onUserLeaveHint();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C8632dsu.c((Object) keyEvent, "");
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 62 || keyCode == 66) && keyEvent.getAction() == 1) {
            return onKeyUp(keyCode, keyEvent);
        }
        if ((keyCode == 4 || keyCode == 84 || keyCode == 111) && keyEvent.getAction() == 0) {
            return onKeyDown(keyCode, keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        public final Class<? extends PlayerActivity> c() {
            return PlayerActivity.class;
        }

        private d() {
            super("PlayerActivity");
        }

        public final Intent a(Context context, String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras) {
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) playerExtras, "");
            return e(context, str, videoType, playContext, playerExtras, true);
        }

        public final Intent c(Context context, String str, VideoType videoType, PlayContext playContext, long j, boolean z) {
            C8632dsu.c((Object) videoType, "");
            return e(context, str, videoType, playContext, new PlayerExtras(j, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32766, null), z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(Intent intent) {
            PlayerExtras playerExtras = (PlayerExtras) intent.getParcelableExtra(NetflixActivity.EXTRA_PLAYER_EXTRAS);
            final PlayContext playContext = (PlayContext) intent.getParcelableExtra(NetflixActivity.EXTRA_PLAY_CONTEXT);
            final String stringExtra = intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE);
            if (intent.getLongExtra("CL_START_PLAY_SESSION_ID", -1L) >= 0 || playerExtras == null || playContext == null || stringExtra == null) {
                return;
            }
            Long startSession = Logger.INSTANCE.startSession(new StartPlay(null, Long.valueOf(playerExtras.e()), null, null, 1L, new TrackingInfo() { // from class: o.cxJ
                @Override // com.netflix.cl.model.JsonSerializer
                public final JSONObject toJSONObject() {
                    JSONObject d;
                    d = PlayerActivity.d.d(PlayContext.this, stringExtra);
                    return d;
                }
            }));
            intent.putExtra("CL_START_PLAY_SESSION_ID", startSession != null ? startSession.longValue() : -1L);
            playerExtras.m();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final JSONObject d(PlayContext playContext, String str) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uiLabel", AppView.playback);
            jSONObject.put("trackId", playContext.getTrackId());
            jSONObject.put(SignupConstants.Field.VIDEO_ID, str);
            jSONObject.put("unifiedEntityId", playContext.f());
            return jSONObject;
        }

        public final boolean e(String str, Intent intent) {
            C8632dsu.c((Object) intent, "");
            return C8168dfL.d(str, intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID));
        }

        public final void b(Context context) {
            C8632dsu.c((Object) context, "");
            LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.END_PIP"));
        }

        /* JADX WARN: Removed duplicated region for block: B:60:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01a9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final android.content.Intent e(android.content.Context r20, java.lang.String r21, com.netflix.mediaclient.servicemgr.interface_.VideoType r22, com.netflix.mediaclient.util.PlayContext r23, com.netflix.mediaclient.ui.player.PlayerExtras r24, boolean r25) {
            /*
                Method dump skipped, instructions count: 434
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.PlayerActivity.d.e(android.content.Context, java.lang.String, com.netflix.mediaclient.servicemgr.interface_.VideoType, com.netflix.mediaclient.util.PlayContext, com.netflix.mediaclient.ui.player.PlayerExtras, boolean):android.content.Intent");
        }
    }
}
