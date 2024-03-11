package com.netflix.mediaclient.ui.player;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.cl.model.event.discrete.Presented;
import com.netflix.cl.model.event.session.NavigationLevel;
import com.netflix.cl.model.event.session.action.Navigate;
import com.netflix.cl.model.event.session.command.CloseCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.LiveEventState;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import com.netflix.model.leafs.PostPlayAction;
import com.netflix.model.leafs.PostPlayExperience;
import com.netflix.model.leafs.PostPlayItem;
import com.netflix.model.leafs.SeasonRenewal;
import java.util.concurrent.TimeUnit;
import o.AbstractC7627czl;
import o.C1044Mm;
import o.C1596aHd;
import o.C1877aRo;
import o.C1885aRw;
import o.C5086bsC;
import o.C7496cxM;
import o.C7535cxz;
import o.C7624czi;
import o.C7631czp;
import o.C7638czw;
import o.C7641czz;
import o.C8126deW;
import o.C8175dfS;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC5160btX;
import o.InterfaceC5283bvo;
import o.InterfaceC7450cwT;
import o.cIE;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class PostPlay implements InterfaceC7450cwT {
    private boolean A;
    private final Runnable B;
    public LinearLayout a;
    protected C8175dfS.d b;
    public FrameLayout c;
    public C8175dfS.d d;
    protected boolean e;
    protected View f;
    protected View g;
    protected View h;
    protected View i;
    public LinearLayout j;
    public boolean k;
    public AbstractC7627czl l;
    public final NetflixActivity m;
    protected View n;

    /* renamed from: o  reason: collision with root package name */
    public PlayerFragmentV2 f13302o;
    public boolean p;
    protected PostPlayDataFetchStatus q;
    protected boolean r;
    public PostPlayExperience s;
    public View t;
    public C7641czz u;
    protected boolean v;
    public C7631czp w;
    protected boolean x;
    public boolean y;
    private Long z;

    /* loaded from: classes4.dex */
    protected enum PostPlayDataFetchStatus {
        notStarted,
        started
    }

    protected void a(int i) {
    }

    @Override // o.InterfaceC7450cwT
    public void b(boolean z) {
    }

    protected abstract void c(boolean z);

    @Override // o.InterfaceC7450cwT
    public void f() {
        this.A = false;
        this.p = false;
        this.e = false;
        this.x = false;
    }

    @Override // o.InterfaceC7450cwT
    public void i() {
        this.p = true;
    }

    protected void k() {
    }

    @Override // o.InterfaceC7450cwT
    public boolean n() {
        return this.p;
    }

    public boolean o() {
        return this.r;
    }

    protected abstract void r();

    @Deprecated
    public abstract void u();

    protected boolean x() {
        return true;
    }

    protected PostPlay(Activity activity) {
        this.r = false;
        this.B = new Runnable() { // from class: com.netflix.mediaclient.ui.player.PostPlay.3
            @Override // java.lang.Runnable
            public void run() {
                if (PostPlay.this.f13302o == null) {
                    C1044Mm.d("nf_postplay", "onInterrupterDismiss() - called with null PlayerFragment!");
                    return;
                }
                C1044Mm.e("nf_postplay", "After 60 minutes of waiting for user input, close player ui");
                if (PostPlay.this.f13302o.bn_()) {
                    PostPlay.this.f13302o.Y();
                }
            }
        };
        if (activity instanceof NetflixActivity) {
            this.m = (NetflixActivity) activity;
            s();
            r();
            this.q = PostPlayDataFetchStatus.notStarted;
            return;
        }
        this.m = null;
        InterfaceC1598aHf.a("nf_postplay activity is supposed to be NetflixActivity");
    }

    public PostPlay(PlayerFragmentV2 playerFragmentV2) {
        this(playerFragmentV2.bj_());
        this.f13302o = playerFragmentV2;
        C7535cxz af = playerFragmentV2.af();
        if (af == null || af.h() == null) {
            return;
        }
        this.k = this.f13302o.c(PlaybackLauncher.PlayLaunchedBy.d);
        af.h().an_();
        int i = this.f13302o.am().d;
    }

    protected void s() {
        this.h = this.m.findViewById(cIE.b.bs);
        this.i = this.m.findViewById(cIE.b.bn);
        this.a = (LinearLayout) this.m.findViewById(cIE.b.bm);
        this.j = (LinearLayout) this.m.findViewById(cIE.b.bl);
        this.c = (FrameLayout) this.m.findViewById(cIE.b.bi);
        this.f = this.m.findViewById(cIE.b.bu);
        this.t = this.m.findViewById(cIE.b.bo);
        this.g = this.m.findViewById(cIE.b.ap);
        this.n = this.m.findViewById(cIE.b.bp);
    }

    public static int b(InterfaceC5160btX interfaceC5160btX, int i) {
        if (interfaceC5160btX.aJ_() == i) {
            C1044Mm.e("nf_postplay", "adjusting startOfCredits - runtime is same as logical end ");
            return (int) TimeUnit.SECONDS.toMillis(interfaceC5160btX.aJ_() - 2);
        }
        return i * 1000;
    }

    public void i(boolean z) {
        AppView appView;
        PlayerFragmentV2 playerFragmentV2;
        if (this.s != null) {
            this.e = true;
            if (this.n != null && ((playerFragmentV2 = this.f13302o) == null || !playerFragmentV2.ar())) {
                this.n.setFitsSystemWindows(true);
            }
            View view = this.n;
            if (view != null) {
                view.setVisibility(z ? 8 : 0);
            }
            if (this.z != null) {
                InterfaceC1598aHf.a("postPlay navlevel session already exists");
                Logger.INSTANCE.endSession(this.z);
            }
            C7638czw c7638czw = C7638czw.d;
            TrackingInfo d = c7638czw.d(this.s);
            Logger logger = Logger.INSTANCE;
            AppView appView2 = AppView.postPlay;
            Long startSession = logger.startSession(new Navigate(appView2, null, CommandValue.PlayCommand, d));
            this.z = logger.startSession(new NavigationLevel(appView2, d));
            logger.endSession(startSession);
            c(true);
            if (TextUtils.equals(this.s.getType(), "nextEpisodeSeamless")) {
                appView = AppView.nextEpisodeButton;
            } else {
                appView = AppView.boxArt;
            }
            logger.logEvent(new Presented(appView, Boolean.FALSE, c7638czw.d(this.s)));
            return;
        }
        InterfaceC1598aHf.a(new C1596aHd("SPY-10544 - Error transitioning to post play. No post play experience defined.").b(false));
    }

    @Override // o.InterfaceC7450cwT
    public void d(boolean z) {
        PlayerFragmentV2 playerFragmentV2;
        C1044Mm.e("nf_postplay", "Transition to post play execute!");
        if (this.s != null) {
            this.e = true;
            if (this.n != null && (((playerFragmentV2 = this.f13302o) == null || !playerFragmentV2.ar()) && !"preview3".equals(this.s.getType()))) {
                this.n.setFitsSystemWindows(true);
            }
            View view = this.n;
            if (view != null) {
                view.setVisibility(z ? 8 : 0);
            }
            if (this.z != null) {
                InterfaceC1598aHf.a("postPlay navlevel session already exists");
                Logger.INSTANCE.endSession(this.z);
            }
            TrackingInfo d = C7638czw.d.d(this.s);
            Logger logger = Logger.INSTANCE;
            AppView appView = AppView.postPlay;
            Long startSession = logger.startSession(new Navigate(appView, null, CommandValue.PlayCommand, d));
            this.z = logger.startSession(new NavigationLevel(appView, d));
            logger.endSession(startSession);
            c(false);
            l();
            return;
        }
        InterfaceC1598aHf.a(new C1596aHd("SPY-10544 - Error transitioning to post play. No post play experience defined.").b(false));
    }

    public void l() {
        AppView appView;
        if (TextUtils.equals(this.s.getType(), "nextEpisodeSeamless") || TextUtils.equals(this.s.getType(), "twoUpChoicepoint")) {
            appView = AppView.nextEpisodeButton;
        } else {
            appView = AppView.boxArt;
        }
        Logger logger = Logger.INSTANCE;
        Boolean bool = Boolean.FALSE;
        C7638czw c7638czw = C7638czw.d;
        logger.logEvent(new Presented(appView, bool, c7638czw.d(this.s)));
        if (TextUtils.equals(this.s.getType(), "twoUpChoicepoint")) {
            logger.logEvent(new Presented(AppView.boxArt, bool, c7638czw.e(this.s)));
        }
    }

    @Override // o.InterfaceC7450cwT
    public void c(PlayLocationType playLocationType, PostPlayItem postPlayItem, PostPlayAction postPlayAction) {
        C8175dfS.d dVar;
        PlayerFragmentV2 playerFragmentV2 = this.f13302o;
        if (playerFragmentV2 != null && playerFragmentV2.bn_() && (dVar = this.d) != null) {
            dVar.e();
        }
        new C7624czi(this.m, this.f13302o, postPlayAction, playLocationType, null, this.u, postPlayItem).c(false);
    }

    @Override // o.InterfaceC7450cwT
    public void b(PlayLocationType playLocationType, PostPlayItem postPlayItem, PostPlayAction postPlayAction) {
        boolean isDoNotIncrementInterrupter = postPlayAction.isDoNotIncrementInterrupter();
        C7631czp c7631czp = new C7631czp(true, postPlayItem.getUiLabel(), postPlayItem.getImpressionData(), true);
        int listPos = postPlayAction.getListPos();
        PlayLocationType playLocationType2 = PlayLocationType.POST_PLAY;
        PlayContextImp playContextImp = new PlayContextImp(postPlayAction, listPos, null, playLocationType2, null, null);
        playContextImp.d(playLocationType2);
        VideoType videoType = postPlayAction.getVideoType();
        InterfaceC1593aHa.b("PostPlay#executePlayTrailerFromPostPlay actionVideoType = " + videoType);
        this.f13302o.d(postPlayAction.getPlayBackVideo().aE_().aH_(), postPlayAction.getPlayBackVideo().aE_().aY_(), videoType, playContextImp, isDoNotIncrementInterrupter ^ true, true, TimeUnit.SECONDS.toMillis((long) postPlayAction.getBookmarkPosition()), c7631czp);
    }

    @Override // o.InterfaceC7450cwT
    public void b(PlayLocationType playLocationType, PostPlayItem postPlayItem) {
        PlayerFragmentV2 playerFragmentV2 = this.f13302o;
        if (playerFragmentV2 == null || !playerFragmentV2.bn_()) {
            return;
        }
        PostPlayExperience postPlayExperience = this.s;
        if (postPlayExperience == null || postPlayExperience.getItems() == null || this.s.getItems().isEmpty()) {
            InterfaceC1598aHf.a("No items in the post play experience.");
        } else if (postPlayItem == null || postPlayItem.getPlayAction() == null) {
            InterfaceC1598aHf.a("no autoplay action found in postplay experience.");
        } else {
            C8175dfS.d dVar = this.d;
            if (dVar != null) {
                dVar.e();
            }
            PostPlayAction seasonRenewalPlayTrailerAction = p() ? postPlayItem.getSeasonRenewalPlayTrailerAction() : null;
            if (seasonRenewalPlayTrailerAction == null) {
                seasonRenewalPlayTrailerAction = postPlayItem.getPlayActionAtIndex(this.s.getActionsInitialIndex().intValue());
            }
            PostPlayAction postPlayAction = seasonRenewalPlayTrailerAction;
            if (postPlayAction != null) {
                new C7624czi(this.m, this.f13302o, postPlayAction, playLocationType, null, this.u, postPlayItem).c(false);
            }
        }
    }

    public C8175dfS.d d(int i) {
        PlayerFragmentV2 playerFragmentV2 = this.f13302o;
        if (playerFragmentV2 == null || !playerFragmentV2.bn_()) {
            return null;
        }
        C8175dfS.d dVar = new C8175dfS.d(this.m);
        this.d = dVar;
        dVar.d(i);
        return this.d;
    }

    public void q() {
        PlayerFragmentV2 playerFragmentV2 = this.f13302o;
        if (playerFragmentV2 == null || !playerFragmentV2.bn_()) {
            return;
        }
        PostPlayExperience postPlayExperience = this.s;
        if (postPlayExperience == null) {
            InterfaceC1598aHf.a("No post play experience.");
        } else if (postPlayExperience.getItems() == null || this.s.getItems().isEmpty()) {
            InterfaceC1598aHf.a("No items in the post play experience.");
        } else {
            Integer itemsInitialIndex = this.s.getItemsInitialIndex();
            if (itemsInitialIndex == null) {
                InterfaceC1598aHf.a("PostPlay initial Index is missing. Setting a default value.");
                itemsInitialIndex = 0;
            }
            PostPlayItem postPlayItem = this.s.getItems().get(itemsInitialIndex.intValue());
            if (postPlayItem == null || postPlayItem.getPlayAction() == null) {
                InterfaceC1598aHf.a("no autoplay action found in postplay experience.");
            } else if (postPlayItem.isAutoPlay()) {
                if ("twoUpChoicepoint".equals(postPlayItem.getExperienceType()) || "nextEpisodeSeamless".equals(postPlayItem.getExperienceType())) {
                    final C7624czi c7624czi = new C7624czi(this.m, this.f13302o, postPlayItem.getPlayAction(), PlayLocationType.POST_PLAY, null, this.u, postPlayItem);
                    C8175dfS.d dVar = this.d;
                    if (dVar != null) {
                        dVar.b(new Runnable() { // from class: com.netflix.mediaclient.ui.player.PostPlay.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C7624czi c7624czi2;
                                PostPlay postPlay = PostPlay.this;
                                if (!postPlay.e || postPlay.A || (c7624czi2 = c7624czi) == null) {
                                    return;
                                }
                                c7624czi2.c(true);
                            }
                        });
                        this.d.c(new Runnable() { // from class: com.netflix.mediaclient.ui.player.PostPlay.4
                            @Override // java.lang.Runnable
                            public void run() {
                                PostPlay postPlay = PostPlay.this;
                                postPlay.a(postPlay.d.a());
                            }
                        });
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC7450cwT
    public void e(boolean z) {
        PostPlayExperience postPlayExperience;
        PlayerFragmentV2 playerFragmentV2;
        if (!this.e || this.y) {
            if (z) {
                if (!this.y) {
                    v();
                    return;
                } else if (this.m != null) {
                    Logger logger = Logger.INSTANCE;
                    logger.endSession(Long.valueOf(logger.startSession(new CloseCommand()).longValue()));
                    this.m.onBackPressed();
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (!z && C1877aRo.j() && (postPlayExperience = this.s) != null && "nextEpisodeSeamless".equals(postPlayExperience.getType()) && (playerFragmentV2 = this.f13302o) != null && !playerFragmentV2.j()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ab55877Action", "screenTap");
                Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
            } catch (JSONException unused) {
            }
        }
        v();
    }

    public void v() {
        C1044Mm.e("nf_postplay", "Transition from post play execute!");
        this.e = false;
        i();
        PostPlayExperience postPlayExperience = this.s;
        boolean z = postPlayExperience != null && "preview3".equals(postPlayExperience.getType());
        View view = this.n;
        if (view != null && !z) {
            view.setVisibility(4);
            this.n.setFitsSystemWindows(false);
        }
        if (x()) {
            C1044Mm.e("nf_postplay", "User dismissed post_play, report as such");
        }
        k();
        y();
    }

    @Override // o.InterfaceC7450cwT
    public void m() {
        this.x = true;
        this.v = false;
        if (j()) {
            if (!this.r) {
                C1044Mm.e("nf_postplay", "Cannot render post play everywhere as data does not exist");
            }
            this.t.setBackground(this.m.getDrawable(R.e.aI));
            this.f13302o.aw();
            this.e = true;
            g();
        }
    }

    public void w() {
        if (!this.e) {
            if (this.f13302o.f()) {
                return;
            }
            if (j()) {
                i(false);
                return;
            }
            this.t.setAlpha(1.0f);
            this.f13302o.aw();
        } else if ("preview3".equals(this.s.getType())) {
            c(true);
        }
    }

    public boolean p() {
        SeasonRenewal seasonRenewal;
        PostPlayExperience postPlayExperience = this.s;
        return (postPlayExperience == null || (seasonRenewal = postPlayExperience.getSeasonRenewal()) == null || seasonRenewal.message() == null) ? false : true;
    }

    @Override // o.InterfaceC7450cwT
    public void b(long j) {
        PostPlayExperience postPlayExperience;
        PlayerFragmentV2 playerFragmentV2;
        if (this.f13302o == null) {
            C1044Mm.d("nf_postplay", "updatePlaybackPosition() - called with null PlayerFragment!");
        } else if (this.s != null && B()) {
            boolean c = c(j);
            if (this.e && c) {
                C1044Mm.e("nf_postplay", "Already in post play");
            } else if (this.f13302o.am().h) {
                C1044Mm.e("nf_postplay", "In Interrupter mode, do nothing");
            } else {
                boolean z = this.e;
                if (!z && c) {
                    C1044Mm.e("nf_postplay", "Transition to post play");
                    if (this.f13302o.f()) {
                        if (C1885aRw.c()) {
                            this.f13302o.aw();
                            return;
                        }
                        return;
                    }
                    this.t.setBackground(this.m.getDrawable(R.e.aM));
                    this.t.setAlpha(1.0f);
                    if (C1877aRo.j() && (postPlayExperience = this.s) != null && "nextEpisodeSeamless".equals(postPlayExperience.getType()) && (playerFragmentV2 = this.f13302o) != null && !playerFragmentV2.j()) {
                        C7496cxM.e.e("regularPostPlayShown");
                    }
                    this.f13302o.aw();
                } else if (!z && j()) {
                    C1044Mm.e("nf_postplay", "isPostPlayEverywhereOverlayEnabled");
                    this.t.setBackground(this.m.getDrawable(R.e.aI));
                    this.f13302o.aw();
                } else if (this.e && !c && !j() && this.f13302o.am().a() == Interactivity.e) {
                    C1044Mm.e("nf_postplay", "Transition from post play to normal");
                    v();
                } else {
                    C1044Mm.e("nf_postplay", "Not  in post play");
                }
            }
        }
    }

    private boolean B() {
        if (o()) {
            if (this.p) {
                C1044Mm.e("nf_postplay", "Postplay was dismissed");
                return false;
            }
            return true;
        }
        C1044Mm.e("nf_postplay", "Postplay has no data!");
        PlayerFragmentV2 playerFragmentV2 = this.f13302o;
        if (playerFragmentV2 != null) {
            playerFragmentV2.n(false);
        }
        return false;
    }

    @Override // o.InterfaceC7450cwT
    public boolean b() {
        InterfaceC5283bvo a;
        PlayerFragmentV2 playerFragmentV2 = this.f13302o;
        if (playerFragmentV2 == null) {
            C1044Mm.d("nf_postplay", "isAutoPlayEnabled() - called with null PlayerFragment!");
            return false;
        } else if (!playerFragmentV2.bn_()) {
            C1044Mm.d("nf_postplay", "Activity not found! Auto post_play is NOT enabled. This should NOT happen!");
            return false;
        } else if (this.f13302o.af().h() == null) {
            C1044Mm.d("nf_postplay", "playable not found! Auto post_play is NOT enabled. This should NOT happen!");
            return false;
        } else if (this.f13302o.bl_() == null || (a = C8126deW.a(this.m)) == null) {
            return false;
        } else {
            if (a.isAutoPlayEnabled()) {
                C1044Mm.e("nf_postplay", "Autoplay is enabled for this profile");
                return true;
            }
            C1044Mm.e("nf_postplay", "Autoplay is disabled for this profile");
            return false;
        }
    }

    private boolean c(long j) {
        C7535cxz af;
        PlayerFragmentV2 playerFragmentV2 = this.f13302o;
        if (playerFragmentV2 == null) {
            C1044Mm.d("nf_postplay", "inPostPlay() - called with null PlayerFragment!");
            return false;
        } else if (playerFragmentV2.bn_() && (af = this.f13302o.af()) != null) {
            if (IPlayer.PlaybackType.LivePlayback.equals(af.f())) {
                C5086bsC ai = this.f13302o.ai();
                if (ai == null || ai.a() != LiveEventState.EVENT_DVR_MODE) {
                    return false;
                }
                long c = af.c();
                C1044Mm.a("nf_postplay", "in live dvr postplay runtime %d, currentPosition: %d", Long.valueOf(c), Long.valueOf(j));
                return j > 0 && j >= c;
            }
            InterfaceC5160btX h = af.h();
            PostPlayExperience postPlayExperience = this.s;
            int av_ = (postPlayExperience == null || !TextUtils.equals(postPlayExperience.getType(), "nextEpisodeSeamless") || this.s.getSeamlessEnd() <= 0) ? h.av_() : this.s.getSeamlessEnd();
            long b = b(h, av_);
            C1044Mm.a("nf_postplay", "runtime %d, startOfCredits: %d, currentPosition: %d", Integer.valueOf(av_), Long.valueOf(b), Long.valueOf(j));
            return j > 0 && j >= b;
        } else {
            return false;
        }
    }

    @Override // o.InterfaceC7450cwT
    public void c() {
        View view = this.n;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // o.InterfaceC7450cwT
    @Deprecated
    public void b(PostPlayExperience postPlayExperience) {
        e(postPlayExperience);
        u();
        if (this.x) {
            C1044Mm.j("nf_postplay", "Playback has already started, and post play just fetched, lets try to display post play if necessary");
            m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b4, code lost:
        if (r16 == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0324  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(com.netflix.model.leafs.PostPlayExperience r23) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.PostPlay.e(com.netflix.model.leafs.PostPlayExperience):void");
    }

    public boolean b(PostPlayItem postPlayItem) {
        PostPlayAction playAction;
        if (postPlayItem == null || (playAction = postPlayItem.getPlayAction()) == null) {
            return false;
        }
        InterfaceC1593aHa.b("nf_postplay: Checking post play play action video ID: " + playAction.getVideoId());
        return (playAction.getPlayBackVideo() == null || playAction.getPlayBackVideo().aE_() == null) ? false : true;
    }

    private boolean D() {
        PlayerFragmentV2 playerFragmentV2 = this.f13302o;
        return playerFragmentV2 != null && playerFragmentV2.bn_() && this.f13302o.ay() && this.f13302o.am().a() == null;
    }

    @Override // o.InterfaceC7450cwT
    public void e() {
        char c;
        PostPlayExperience postPlayExperience = this.s;
        if (postPlayExperience != null) {
            String type = postPlayExperience.getType();
            int hashCode = type.hashCode();
            if (hashCode == -1273784981) {
                if (type.equals("preview3")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != -140722113) {
                if (hashCode == 0 && type.equals("")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (type.equals("nextEpisodeSeamless")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                c();
                d();
            } else if (c == 1 && C1885aRw.c()) {
                this.f13302o.L();
            }
        }
    }

    public void a(boolean z) {
        LinearLayout linearLayout = this.a;
        if (linearLayout != null) {
            if (z) {
                linearLayout.setVisibility(0);
            } else {
                linearLayout.setVisibility(4);
            }
        }
    }

    @Override // o.InterfaceC7450cwT
    public void d() {
        C8175dfS.d dVar = this.d;
        if (dVar != null) {
            dVar.e();
        }
        PlayerFragmentV2 playerFragmentV2 = this.f13302o;
        if (playerFragmentV2 != null && playerFragmentV2.ae() != null) {
            this.f13302o.ae().removeCallbacks(this.B);
        }
        AbstractC7627czl abstractC7627czl = this.l;
        if (abstractC7627czl != null) {
            abstractC7627czl.a();
        }
        C8175dfS.d dVar2 = this.b;
        if (dVar2 != null) {
            dVar2.e();
        }
        y();
        C1044Mm.e("nf_postplay", "User exits playback and post_play if it was in progress, report as such");
    }

    @Override // o.InterfaceC7450cwT
    public void a() {
        PostPlayExperience postPlayExperience;
        PlayerFragmentV2 playerFragmentV2;
        if (this.f13302o == null) {
            C1044Mm.d("nf_postplay", "playbackHasEnded() - called with null PlayerFragment!");
            return;
        }
        this.v = true;
        C8175dfS.d dVar = this.b;
        if (dVar != null) {
            dVar.e();
        }
        boolean j = j();
        if (j && this.e && !this.y) {
            v();
        }
        this.y = true;
        boolean z = false;
        boolean z2 = this.f13302o.af() != null && IPlayer.PlaybackType.LivePlayback.equals(this.f13302o.af().f());
        PostPlayExperience postPlayExperience2 = this.s;
        if (postPlayExperience2 != null && "preview3".equals(postPlayExperience2.getType())) {
            z = true;
        }
        if (j || n() || z2 || z) {
            w();
            a(true);
        }
        if (!C1877aRo.j() || (postPlayExperience = this.s) == null || !"nextEpisodeSeamless".equals(postPlayExperience.getType()) || (playerFragmentV2 = this.f13302o) == null || playerFragmentV2.j() || this.f13302o.f()) {
            return;
        }
        C7496cxM.e.e("endOfPlayPostPlayShown");
    }

    @Override // o.InterfaceC7450cwT
    public void h() {
        this.s = null;
        this.A = false;
        this.q = PostPlayDataFetchStatus.notStarted;
        this.r = false;
        this.p = false;
        this.e = false;
        this.x = false;
        this.v = false;
    }

    public boolean t() {
        PostPlayExperience postPlayExperience = this.s;
        if (postPlayExperience != null) {
            return postPlayExperience.getAutoplay();
        }
        return false;
    }

    @Override // o.InterfaceC7450cwT
    public boolean j() {
        C7631czp c7631czp = this.w;
        if (c7631czp == null || !c7631czp.a()) {
            return false;
        }
        return this.w.b();
    }

    @Override // o.InterfaceC7450cwT
    public void g() {
        if (this.e && j() && !this.v) {
            this.t.setAlpha(1.0f);
            C8175dfS.d dVar = this.b;
            if (dVar != null) {
                dVar.e();
            }
            C8175dfS.d dVar2 = new C8175dfS.d(this.m);
            this.b = dVar2;
            dVar2.d(4);
            this.b.b(new Runnable() { // from class: com.netflix.mediaclient.ui.player.PostPlay.2
                @Override // java.lang.Runnable
                public void run() {
                    View view = PostPlay.this.t;
                    if (view != null) {
                        view.setAlpha(0.6f);
                    }
                }
            });
            this.b.d();
        }
    }

    private void y() {
        Logger.INSTANCE.endSession(this.z);
        this.z = null;
    }
}
