package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import android.content.Context;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.google.android.material.tabs.TabLayout;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import com.netflix.mediaclient.servicemgr.interface_.details.WatchStatus;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpEpoxyController;
import com.netflix.mediaclient.ui.lomo.LoMoUtils;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.RecommendedTrailer;
import com.netflix.model.leafs.TrackableListSummary;
import com.netflix.model.leafs.originals.ContentWarning;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import dagger.hilt.android.EntryPointAccessors;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.AbstractC3664bGf;
import o.AbstractC3776bKf;
import o.AbstractC3802bLe;
import o.AbstractC3803bLf;
import o.AbstractC5271bvc;
import o.AbstractC6719cic;
import o.AbstractC6729cim;
import o.C1026Lt;
import o.C1030Lx;
import o.C1044Mm;
import o.C1332Xp;
import o.C1596aHd;
import o.C1781aO;
import o.C2808an;
import o.C3654bFw;
import o.C3670bGh;
import o.C3691bHb;
import o.C3692bHc;
import o.C3700bHk;
import o.C3706bHq;
import o.C3727bIk;
import o.C3729bIm;
import o.C3734bIr;
import o.C3745bJb;
import o.C3774bKd;
import o.C3800bLc;
import o.C3805bLh;
import o.C3814bLq;
import o.C5235but;
import o.C6652chO;
import o.C6734cir;
import o.C8004dcG;
import o.C8067ddQ;
import o.C8126deW;
import o.C8141del;
import o.C8153dex;
import o.C8569dql;
import o.C8572dqo;
import o.C8576dqs;
import o.C8632dsu;
import o.C8691duz;
import o.C9834xU;
import o.C9935zP;
import o.GD;
import o.InterfaceC1270Vf;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC2023aX;
import o.InterfaceC4308bc;
import o.InterfaceC4467bf;
import o.InterfaceC4732bk;
import o.InterfaceC5194buE;
import o.InterfaceC5195buF;
import o.InterfaceC5196buG;
import o.InterfaceC5198buI;
import o.InterfaceC5199buJ;
import o.InterfaceC5202buM;
import o.InterfaceC5206buQ;
import o.InterfaceC5223buh;
import o.InterfaceC5227bul;
import o.InterfaceC5231bup;
import o.InterfaceC5240buy;
import o.InterfaceC5298bwC;
import o.InterfaceC5303bwH;
import o.InterfaceC6718cib;
import o.InterfaceC6903cmA;
import o.InterfaceC7303ctf;
import o.InterfaceC8366diy;
import o.aQW;
import o.bFL;
import o.bGJ;
import o.bGK;
import o.bIN;
import o.bIO;
import o.bIS;
import o.bJK;
import o.bJX;
import o.bLE;
import o.bLG;
import o.bLU;
import o.bZK;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class FullDpEpoxyController extends Typed2EpoxyController<C3729bIm, C3727bIk> {
    private static int c = 0;
    private static int e = 1;
    private static byte e$ss2$9610 = 24;
    private final InterfaceC5303bwH adsPlan;
    private final InterfaceC1270Vf clock;
    private final bLU epoxyPresentationTracking;
    private final C9935zP eventBusFactory;
    private final C3706bHq migrationFeature;
    private final MiniPlayerVideoGroupViewModel miniPlayerViewModel;
    private boolean needToTrackLoadResult;
    private final NetflixActivity netflixActivity;
    private final TrackingInfoHolder trackingInfoHolder;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[VideoType.values().length];
            try {
                iArr[VideoType.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoType.MOVIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            b = iArr;
        }
    }

    @Override // o.AbstractC2914ap
    public boolean isStickyHeader(int i) {
        return i == 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullDpEpoxyController(NetflixActivity netflixActivity, C9935zP c9935zP, bLU blu, TrackingInfoHolder trackingInfoHolder, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, InterfaceC5303bwH interfaceC5303bwH, C3706bHq c3706bHq, InterfaceC1270Vf interfaceC1270Vf) {
        super(C8141del.a() ? C2808an.b : C2808an.a(), C8141del.a() ? C2808an.b : C2808an.a());
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) blu, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        C8632dsu.c((Object) interfaceC5303bwH, "");
        C8632dsu.c((Object) c3706bHq, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        this.netflixActivity = netflixActivity;
        this.eventBusFactory = c9935zP;
        this.epoxyPresentationTracking = blu;
        this.trackingInfoHolder = trackingInfoHolder;
        this.miniPlayerViewModel = miniPlayerVideoGroupViewModel;
        this.adsPlan = interfaceC5303bwH;
        this.migrationFeature = c3706bHq;
        this.clock = interfaceC1270Vf;
        this.needToTrackLoadResult = true;
    }

    private final boolean isPlayCtaAvailable(InterfaceC5198buI interfaceC5198buI) {
        VideoType type = interfaceC5198buI.getType();
        int i = type == null ? -1 : d.b[type.ordinal()];
        return i == 1 || i == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$0(FullDpEpoxyController fullDpEpoxyController, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, AbstractC3664bGf.v.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$1(FullDpEpoxyController fullDpEpoxyController, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, AbstractC3664bGf.x.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        if ((r15.e() instanceof o.C8971gl) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        if ((r15.e() instanceof o.C8971gl) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        if ((r14.g() instanceof o.C8927fu) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
        if ((r15.e() instanceof o.C8927fu) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
        r13.needToTrackLoadResult = false;
        r0 = o.C8737dwr.c(r13.eventBusFactory.a(), o.GF.e(), null, new com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpEpoxyController$buildModels$2(r13, null), 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
        r13.needToTrackLoadResult = false;
        r0 = o.C8737dwr.c(r13.eventBusFactory.a(), o.GF.e(), null, new com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpEpoxyController$buildModels$1(r13, null), 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0170, code lost:
        if (r14.f().c() == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
        if ((r14.g() instanceof o.C8971gl) == false) goto L8;
     */
    @Override // com.airbnb.epoxy.Typed2EpoxyController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildModels(o.C3729bIm r14, o.C3727bIk r15) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpEpoxyController.buildModels(o.bIm, o.bIk):void");
    }

    private final boolean shouldShowEpisodeNameOrPlayProgress(bZK bzk, InterfaceC5198buI interfaceC5198buI) {
        if (getLiveStateForDp(bzk, interfaceC5198buI) != LiveState.a) {
            InteractiveSummary az_ = interfaceC5198buI.az_();
            if (az_ != null && az_.isBranchingNarrative()) {
                Integer ay_ = interfaceC5198buI.aE_().ay_();
                if (ay_ != null && ay_.intValue() > 0) {
                    return true;
                }
            } else if (interfaceC5198buI.getType() == VideoType.MOVIE) {
                if (interfaceC5198buI.aE_().aF_() > 0) {
                    return true;
                }
            } else if (interfaceC5198buI.getType() == VideoType.SHOW && (interfaceC5198buI.B_() == WatchStatus.e || interfaceC5198buI.B_() == WatchStatus.b)) {
                return true;
            }
        }
        return false;
    }

    private final LiveState getLiveStateForDp(bZK bzk, InterfaceC5198buI interfaceC5198buI) {
        if (this.migrationFeature.e()) {
            return C5235but.a(interfaceC5198buI, this.clock.e());
        }
        String id = interfaceC5198buI.getId();
        C8632dsu.a(id, "");
        return bzk.a(Integer.valueOf(Integer.parseInt(id)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addContentFromVideoDetails$lambda$11$lambda$6$lambda$5(FullDpEpoxyController fullDpEpoxyController, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, new AbstractC3664bGf.o(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addContentFromVideoDetails$lambda$14$lambda$13(FullDpEpoxyController fullDpEpoxyController, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, new AbstractC3664bGf.o(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addContentFromVideoDetails$lambda$18$lambda$17(FullDpEpoxyController fullDpEpoxyController, C3805bLh c3805bLh, AbstractC3803bLf.c cVar, View view, int i) {
        AbstractC3664bGf abstractC3664bGf;
        C8632dsu.c((Object) fullDpEpoxyController, "");
        C9935zP c9935zP = fullDpEpoxyController.eventBusFactory;
        if (fullDpEpoxyController.adsPlan.d()) {
            abstractC3664bGf = AbstractC3664bGf.e.d;
        } else {
            abstractC3664bGf = AbstractC3664bGf.B.d;
        }
        c9935zP.b(AbstractC3664bGf.class, abstractC3664bGf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addContentFromVideoDetails$lambda$21$lambda$20(FullDpEpoxyController fullDpEpoxyController, InterfaceC5198buI interfaceC5198buI, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        C8632dsu.c((Object) interfaceC5198buI, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, new AbstractC3664bGf.r(!interfaceC5198buI.isAvailableToPlay()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addContentFromVideoDetails$lambda$26$lambda$25(FullDpEpoxyController fullDpEpoxyController, InterfaceC5198buI interfaceC5198buI, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        C8632dsu.c((Object) interfaceC5198buI, "");
        C9935zP c9935zP = fullDpEpoxyController.eventBusFactory;
        String id = interfaceC5198buI.getId();
        C8632dsu.a(id, "");
        int parseInt = Integer.parseInt(id);
        VideoType type = interfaceC5198buI.getType();
        C8632dsu.a(type, "");
        c9935zP.b(AbstractC3664bGf.class, new AbstractC3664bGf.u(parseInt, type, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addContentFromVideoDetails$lambda$29$lambda$28(FullDpEpoxyController fullDpEpoxyController, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, new AbstractC3664bGf.o(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addContentFromVideoDetails$lambda$36$lambda$35$lambda$34(FullDpEpoxyController fullDpEpoxyController, ContentWarning contentWarning, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        C8632dsu.c((Object) contentWarning, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, new AbstractC3664bGf.f(contentWarning));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addContentFromVideoDetails$lambda$48$lambda$40$lambda$39(FullDpEpoxyController fullDpEpoxyController, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, AbstractC3664bGf.h.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addContentFromVideoDetails$lambda$48$lambda$47$lambda$46(FullDpEpoxyController fullDpEpoxyController, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, AbstractC3664bGf.j.d);
    }

    private final void addCreatorsFalkor(C3729bIm c3729bIm, int i) {
        InterfaceC8366diy c2 = c3729bIm.g().c();
        if (c2 != null && c2.bX_() > 0) {
            C3700bHk c3700bHk = new C3700bHk();
            String id = c2.getId();
            c3700bHk.e((CharSequence) ("directors-" + id));
            c3700bHk.d(C3654bFw.c.c(this.netflixActivity, c2.t(), c2.bX_(), c2.getType() == VideoType.MOVIE ? R.o.de : R.o.cU));
            c3700bHk.c(Integer.valueOf(i));
            c3700bHk.d((Integer) 2);
            add(c3700bHk);
        }
    }

    private final boolean needToShowRemindMeCTA(InterfaceC5198buI interfaceC5198buI, C3729bIm c3729bIm) {
        return isUpcomingMovie(interfaceC5198buI, c3729bIm) || isUpcomingShow(interfaceC5198buI, c3729bIm);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r7.d(r5.clock.e()) == com.netflix.mediaclient.servicemgr.interface_.details.LiveState.c) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean isUpcomingShow(o.InterfaceC5198buI r6, o.C3729bIm r7) {
        /*
            r5 = this;
            o.bHq r0 = r5.migrationFeature
            boolean r0 = r0.e()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            o.buE r6 = r6.P()
            if (r6 == 0) goto L9a
            o.bup r7 = r6.bW_()
            if (r7 == 0) goto L57
            java.util.List r6 = r6.at()
            if (r6 == 0) goto L51
            java.lang.Object r6 = o.C8570dqm.d(r6)
            o.buF r6 = (o.InterfaceC5195buF) r6
            if (r6 == 0) goto L51
            java.util.List r6 = r6.cf_()
            if (r6 == 0) goto L51
            java.lang.Object r6 = o.C8570dqm.d(r6)
            o.bul r6 = (o.InterfaceC5227bul) r6
            if (r6 == 0) goto L51
            java.lang.String r6 = r6.getId()
            if (r6 == 0) goto L51
            int r0 = r7.d()
            int r6 = java.lang.Integer.parseInt(r6)
            if (r0 != r6) goto L51
            o.Vf r6 = r5.clock
            j$.time.Instant r6 = r6.e()
            com.netflix.mediaclient.servicemgr.interface_.details.LiveState r6 = r7.d(r6)
            com.netflix.mediaclient.servicemgr.interface_.details.LiveState r7 = com.netflix.mediaclient.servicemgr.interface_.details.LiveState.c
            if (r6 != r7) goto L51
            goto L52
        L51:
            r2 = r1
        L52:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            goto L58
        L57:
            r6 = 0
        L58:
            if (r6 == 0) goto L9a
            boolean r1 = r6.booleanValue()
            goto L9a
        L5f:
            com.netflix.mediaclient.servicemgr.interface_.VideoType r0 = r6.getType()
            com.netflix.mediaclient.servicemgr.interface_.VideoType r3 = com.netflix.mediaclient.servicemgr.interface_.VideoType.SHOW
            if (r0 != r3) goto L9a
            o.bZK r0 = r7.a()
            java.lang.String r3 = r6.getId()
            java.lang.String r4 = ""
            o.C8632dsu.a(r3, r4)
            int r3 = java.lang.Integer.parseInt(r3)
            int r0 = r0.d(r3)
            if (r0 != r2) goto L9a
            o.bZK r7 = r7.a()
            java.lang.String r6 = r6.getId()
            o.C8632dsu.a(r6, r4)
            int r6 = java.lang.Integer.parseInt(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.netflix.mediaclient.servicemgr.interface_.details.LiveState r6 = r7.a(r6)
            com.netflix.mediaclient.servicemgr.interface_.details.LiveState r7 = com.netflix.mediaclient.servicemgr.interface_.details.LiveState.c
            if (r6 != r7) goto L9a
            r1 = r2
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpEpoxyController.isUpcomingShow(o.buI, o.bIm):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean isUpcomingMovie(o.InterfaceC5198buI r3, o.C3729bIm r4) {
        /*
            r2 = this;
            o.bHq r0 = r2.migrationFeature
            boolean r0 = r0.e()
            if (r0 == 0) goto L25
            o.buw r3 = r3.Q()
            if (r3 == 0) goto L1f
            o.bup r3 = r3.bT_()
            if (r3 == 0) goto L1f
            o.Vf r4 = r2.clock
            j$.time.Instant r4 = r4.e()
            com.netflix.mediaclient.servicemgr.interface_.details.LiveState r3 = r3.d(r4)
            goto L20
        L1f:
            r3 = 0
        L20:
            com.netflix.mediaclient.servicemgr.interface_.details.LiveState r4 = com.netflix.mediaclient.servicemgr.interface_.details.LiveState.c
            if (r3 != r4) goto L4c
            goto L4a
        L25:
            com.netflix.mediaclient.servicemgr.interface_.VideoType r0 = r3.getType()
            com.netflix.mediaclient.servicemgr.interface_.VideoType r1 = com.netflix.mediaclient.servicemgr.interface_.VideoType.MOVIE
            if (r0 != r1) goto L4c
            o.bZK r4 = r4.a()
            java.lang.String r3 = r3.getId()
            java.lang.String r0 = ""
            o.C8632dsu.a(r3, r0)
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.netflix.mediaclient.servicemgr.interface_.details.LiveState r3 = r4.a(r3)
            com.netflix.mediaclient.servicemgr.interface_.details.LiveState r4 = com.netflix.mediaclient.servicemgr.interface_.details.LiveState.c
            if (r3 != r4) goto L4c
        L4a:
            r3 = 1
            goto L4d
        L4c:
            r3 = 0
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpEpoxyController.isUpcomingMovie(o.buI, o.bIm):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildMiniPlayerModels$lambda$56$lambda$53$lambda$52(FullDpEpoxyController fullDpEpoxyController, bLE ble, bLG.a aVar, int i) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        if (FullDpFrag.e.c(fullDpEpoxyController.netflixActivity)) {
            fullDpEpoxyController.emitTrailerNotFullyVisible();
        }
    }

    private final void buildMiniPlayerModels(InterfaceC5198buI interfaceC5198buI, final C3727bIk c3727bIk) {
        String str;
        String str2;
        boolean g;
        int i = 2 % 2;
        int i2 = e + 99;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            String id = interfaceC5198buI.getId();
            C8632dsu.a(id, "");
            int i3 = 9 / 0;
            if (id.length() <= 0) {
                return;
            }
        } else {
            String id2 = interfaceC5198buI.getId();
            C8632dsu.a(id2, "");
            if (id2.length() <= 0) {
                return;
            }
        }
        C1781aO c1781aO = new C1781aO();
        c1781aO.b((CharSequence) ("mini-player-groupmodel-" + interfaceC5198buI.getId()));
        c1781aO.e(C3670bGh.e.y);
        RecommendedTrailer O = interfaceC5198buI.O();
        Object obj = null;
        Integer valueOf = O != null ? Integer.valueOf(O.getSupplementalVideoRuntime()) : null;
        if (O != null) {
            int i4 = e + 105;
            c = i4 % 128;
            int i5 = i4 % 2;
            str = O.getSupplementalVideoType();
        } else {
            str = null;
        }
        if (O != null) {
            int i6 = e + 73;
            c = i6 % 128;
            int i7 = i6 % 2;
            str2 = O.getSupplementalVideoId();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i8 = e + 91;
            c = i8 % 128;
            int i9 = i8 % 2;
            g = C8691duz.g(str2);
            if (!g) {
                if (valueOf == null) {
                    int i10 = c + 41;
                    e = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    String string = this.netflixActivity.getString(C3670bGh.d.d);
                    if (string.startsWith("'!#+")) {
                        int i12 = c + 121;
                        e = i12 % 128;
                        if (i12 % 2 == 0) {
                            Object[] objArr = new Object[1];
                            b(string.substring(4), objArr);
                            ((String) objArr[0]).intern();
                            obj.hashCode();
                            throw null;
                        }
                        String substring = string.substring(4);
                        Object[] objArr2 = new Object[1];
                        b(substring, objArr2);
                        string = ((String) objArr2[0]).intern();
                    }
                    C8632dsu.a(string, "");
                    AbstractC5271bvc.b bVar = new AbstractC5271bvc.b(Long.parseLong(str2));
                    this.miniPlayerViewModel.c(bVar);
                    this.miniPlayerViewModel.d((Integer) 0);
                    C6734cir c6734cir = new C6734cir();
                    c6734cir.b((CharSequence) ("mini-player-" + interfaceC5198buI.getId()));
                    c6734cir.b(str2);
                    c6734cir.d(bVar.d());
                    c6734cir.c(string);
                    c6734cir.d((PlayContext) this.trackingInfoHolder.d(true));
                    c6734cir.c(valueOf.intValue());
                    c6734cir.h(interfaceC5198buI.getId());
                    c6734cir.b(interfaceC5198buI.getType());
                    c6734cir.c(Float.valueOf(1.778f));
                    c6734cir.e(interfaceC5198buI.U());
                    c6734cir.a(interfaceC5198buI.getBoxartId());
                    c6734cir.f(interfaceC5198buI.getTitle());
                    c6734cir.a(false);
                    c6734cir.b(false);
                    c6734cir.a(AppView.movieDetails);
                    c6734cir.j("movieDetails");
                    c6734cir.i(str);
                    c6734cir.b(this.miniPlayerViewModel);
                    c6734cir.e(C8153dex.M());
                    c6734cir.b((InterfaceC6718cib) new C6652chO(null));
                    c6734cir.b(this.eventBusFactory);
                    c6734cir.d((drX<? super View, ? super Boolean, dpR>) new drX<View, Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpEpoxyController$buildMiniPlayerModels$1$2$1
                        @Override // o.drX
                        public /* synthetic */ dpR invoke(View view, Boolean bool) {
                            c(view, bool);
                            return dpR.c;
                        }

                        public final void c(View view, Boolean bool) {
                            NetflixImageView netflixImageView = (NetflixImageView) view.findViewById(R.g.cH);
                            if (netflixImageView != null) {
                                ViewGroup.LayoutParams layoutParams = netflixImageView.getLayoutParams();
                                if (layoutParams != null) {
                                    C8632dsu.d(bool);
                                    layoutParams.height = bool.booleanValue() ? 0 : -2;
                                    netflixImageView.setLayoutParams(layoutParams);
                                    return;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            }
                        }
                    });
                    if (FullDpFrag.e.c(this.netflixActivity)) {
                        c6734cir.c(new InterfaceC4732bk() { // from class: o.bHD
                            @Override // o.InterfaceC4732bk
                            public final void b(AbstractC3073as abstractC3073as, Object obj2, int i13) {
                                FullDpEpoxyController.buildMiniPlayerModels$lambda$56$lambda$55$lambda$54(C3727bIk.this, this, (C6734cir) abstractC3073as, (AbstractC6729cim.b) obj2, i13);
                            }
                        });
                    }
                    c1781aO.add(c6734cir);
                    add(c1781aO);
                }
            }
        }
        bLE ble = new bLE();
        ble.d((CharSequence) ("boxart-image-" + interfaceC5198buI.getId()));
        ble.e(C3670bGh.e.j);
        ble.d(interfaceC5198buI.getTitle());
        ble.b(interfaceC5198buI.U());
        ble.c(new InterfaceC4467bf() { // from class: o.bHE
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj2, int i13) {
                FullDpEpoxyController.buildMiniPlayerModels$lambda$56$lambda$53$lambda$52(FullDpEpoxyController.this, (bLE) abstractC3073as, (bLG.a) obj2, i13);
            }
        });
        c1781aO.add(ble);
        add(c1781aO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildMiniPlayerModels$lambda$56$lambda$55$lambda$54(C3727bIk c3727bIk, FullDpEpoxyController fullDpEpoxyController, C6734cir c6734cir, AbstractC6729cim.b bVar, int i) {
        C8632dsu.c((Object) c3727bIk, "");
        C8632dsu.c((Object) fullDpEpoxyController, "");
        if (c3727bIk.a()) {
            if (i == 5) {
                fullDpEpoxyController.emitTrailerVisible();
            } else if (i != 6) {
            } else {
                fullDpEpoxyController.emitTrailerNotFullyVisible();
            }
        }
    }

    private final void emitTrailerVisible() {
        this.eventBusFactory.b(AbstractC6719cic.class, new AbstractC6719cic.e.c(0, 0));
    }

    private final void emitTrailerNotFullyVisible() {
        this.eventBusFactory.b(AbstractC6719cic.class, new AbstractC6719cic.e.c(1, 0));
    }

    private final boolean shouldShowSeasonDownloadButton(InterfaceC5198buI interfaceC5198buI) {
        return interfaceC5198buI.isAvailableForDownload() && interfaceC5198buI.isAvailableToPlay() && interfaceC5198buI.getType() == VideoType.SHOW;
    }

    static /* synthetic */ void addFillingLoadingModel$default(FullDpEpoxyController fullDpEpoxyController, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        fullDpEpoxyController.addFillingLoadingModel(str, j);
    }

    private final void addTabUI(InterfaceC5198buI interfaceC5198buI, C3729bIm c3729bIm, C3727bIk c3727bIk) {
        int d2;
        Object obj;
        AbstractC3802bLe.d dVar;
        Map d3;
        Map k;
        Throwable th;
        Object y;
        List<bFL> a = C3654bFw.c.a(interfaceC5198buI);
        d2 = C8572dqo.d(a, 10);
        ArrayList arrayList = new ArrayList(d2);
        for (bFL bfl : a) {
            arrayList.add(new AbstractC3802bLe.d(C3654bFw.c.e(interfaceC5198buI.q(), bfl, this.netflixActivity), bfl.e()));
        }
        if (!arrayList.isEmpty()) {
            C3800bLc c3800bLc = new C3800bLc();
            c3800bLc.d((CharSequence) ("detailspage-tab-layout-container-" + interfaceC5198buI.getId()));
            c3800bLc.b(new AbstractC3802bLe.a(arrayList));
            c3800bLc.b(C3670bGh.e.D);
            c3800bLc.a(c3727bIk.c());
            c3800bLc.a((TabLayout.OnTabSelectedListener) new e(arrayList, this, interfaceC5198buI));
            add(c3800bLc);
            if (c3727bIk.c() == null) {
                y = C8576dqs.y(arrayList);
                dVar = (AbstractC3802bLe.d) y;
            } else {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    int b2 = ((AbstractC3802bLe.d) obj).b();
                    Integer c2 = c3727bIk.c();
                    if (c2 != null && b2 == c2.intValue()) {
                        break;
                    }
                }
                dVar = (AbstractC3802bLe.d) obj;
            }
            Integer valueOf = dVar != null ? Integer.valueOf(dVar.b()) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                showSimilarsTab(interfaceC5198buI);
            } else if (valueOf != null && valueOf.intValue() == 0) {
                if (this.migrationFeature.e()) {
                    showEpisodesTab(c3727bIk);
                } else {
                    showEpisodesTabFalkor(c3729bIm, interfaceC5198buI);
                }
            } else if (valueOf != null && valueOf.intValue() == 2) {
                showTrailersTab(interfaceC5198buI.S(), interfaceC5198buI);
            } else if (valueOf != null && valueOf.intValue() == 3) {
                showTitleGroupTab(interfaceC5198buI);
            } else {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                CharSequence e2 = dVar != null ? dVar.e() : null;
                d3 = dqE.d();
                k = dqE.k(d3);
                C1596aHd c1596aHd = new C1596aHd("FullDp: Need to implement a handler for " + ((Object) e2), null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b3 = c1596aHd.b();
                    if (b3 != null) {
                        c1596aHd.a(errorType.c() + " " + b3);
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
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar2.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th);
                } else {
                    dVar2.e().b(c1596aHd, th);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements TabLayout.OnTabSelectedListener {
        final /* synthetic */ FullDpEpoxyController a;
        final /* synthetic */ List<AbstractC3802bLe.d> b;
        final /* synthetic */ InterfaceC5198buI d;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            C8632dsu.c((Object) tab, "");
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            C8632dsu.c((Object) tab, "");
        }

        e(List<AbstractC3802bLe.d> list, FullDpEpoxyController fullDpEpoxyController, InterfaceC5198buI interfaceC5198buI) {
            this.b = list;
            this.a = fullDpEpoxyController;
            this.d = interfaceC5198buI;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) tab, "");
            int position = tab.getPosition();
            CharSequence text = tab.getText();
            C1044Mm.e("FullDpEpoxyController", "onTabSelected " + position + " " + ((Object) text));
            if (tab.getPosition() < this.b.size()) {
                int b = this.b.get(tab.getPosition()).b();
                TrackingInfoHolder trackingInfoHolder = null;
                if (b == 1) {
                    TrackingInfoHolder trackingInfoHolder2 = this.a.trackingInfoHolder;
                    InterfaceC5196buG J2 = this.d.J();
                    TrackableListSummary h = J2 != null ? J2.h() : null;
                    C8632dsu.d(h);
                    trackingInfoHolder = trackingInfoHolder2.a(h);
                }
                int position2 = tab.getPosition();
                CharSequence text2 = tab.getText();
                C1044Mm.e("FullDpEpoxyController", "onTabSelected emit event " + position2 + " " + ((Object) text2) + " " + b);
                this.a.eventBusFactory.b(AbstractC3664bGf.class, new AbstractC3664bGf.m(b, trackingInfoHolder));
                return;
            }
            InterfaceC1593aHa.c.a("SPY-32499: Selected " + tab.getPosition() + ", but tabs are " + this.b);
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str = "FullDp SPY-32499: " + this.d.getId() + " Invalid tab position";
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEpisodesTabFalkor$lambda$83$lambda$82$lambda$69$lambda$68(FullDpEpoxyController fullDpEpoxyController, C3805bLh c3805bLh, AbstractC3803bLf.c cVar, View view, int i) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, AbstractC3664bGf.l.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEpisodesTabFalkor$lambda$83$lambda$82$lambda$71(FullDpEpoxyController fullDpEpoxyController, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, AbstractC3664bGf.y.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01be, code lost:
        if (r13 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01c2, code lost:
        if (r13 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c4, code lost:
        r14 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void showEpisodesTabFalkor(final o.C3729bIm r22, o.InterfaceC5198buI r23) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpEpoxyController.showEpisodesTabFalkor(o.bIm, o.buI):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEpisodesTabFalkor$lambda$83$lambda$82$lambda$77$lambda$76$lambda$73(FullDpEpoxyController fullDpEpoxyController, InterfaceC5227bul interfaceC5227bul, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        C8632dsu.c((Object) interfaceC5227bul, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, new AbstractC3664bGf.C3667c(interfaceC5227bul));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEpisodesTabFalkor$lambda$83$lambda$82$lambda$77$lambda$76$lambda$74(TrackingInfoHolder trackingInfoHolder, ContextualText contextualText, bGJ bgj, bGK.b bVar, int i) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) contextualText, "");
        if (i == 5) {
            CLv2Utils.b(false, AppView.boxArt, TrackingInfoHolder.a(trackingInfoHolder, null, contextualText.evidenceKey(), null, 5, null), null);
            CLv2Utils.b(false, AppView.synopsisEvidence, TrackingInfoHolder.a(trackingInfoHolder, null, contextualText.evidenceKey(), null, 5, null), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEpisodesTabFalkor$lambda$83$lambda$82$lambda$77$lambda$76$lambda$75(FullDpEpoxyController fullDpEpoxyController, InterfaceC5227bul interfaceC5227bul, C3729bIm c3729bIm, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        C8632dsu.c((Object) interfaceC5227bul, "");
        C8632dsu.c((Object) c3729bIm, "");
        C9935zP c9935zP = fullDpEpoxyController.eventBusFactory;
        String id = interfaceC5227bul.getId();
        C8632dsu.a(id, "");
        int parseInt = Integer.parseInt(id);
        VideoType type = interfaceC5227bul.getType();
        C8632dsu.a(type, "");
        String id2 = interfaceC5227bul.getId();
        C8632dsu.a(id2, "");
        c9935zP.b(AbstractC3664bGf.class, new AbstractC3664bGf.u(parseInt, type, !c3729bIm.e(Integer.parseInt(id2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEpisodesTabFalkor$lambda$83$lambda$82$lambda$79$lambda$78(FullDpEpoxyController fullDpEpoxyController, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, AbstractC3664bGf.q.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEpisodesTabFalkor$lambda$83$lambda$82$lambda$81$lambda$80(FullDpEpoxyController fullDpEpoxyController, C3774bKd c3774bKd, AbstractC3776bKf.e eVar, int i) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, AbstractC3664bGf.q.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSeasonLabelOrSelectorWithAdvisory$lambda$89$lambda$85$lambda$84(FullDpEpoxyController fullDpEpoxyController, C3805bLh c3805bLh, AbstractC3803bLf.c cVar, View view, int i) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, AbstractC3664bGf.l.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSeasonLabelOrSelectorWithAdvisory$lambda$89$lambda$88$lambda$87(FullDpEpoxyController fullDpEpoxyController, InterfaceC5195buF interfaceC5195buF, InterfaceC5194buE interfaceC5194buE, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        C8632dsu.c((Object) interfaceC5195buF, "");
        C8632dsu.c((Object) interfaceC5194buE, "");
        C9935zP c9935zP = fullDpEpoxyController.eventBusFactory;
        String id = interfaceC5195buF.getId();
        C8632dsu.a(id, "");
        String title = interfaceC5194buE.getTitle();
        C8632dsu.a(title, "");
        c9935zP.b(AbstractC3664bGf.class, new AbstractC3664bGf.n(id, title));
    }

    private final void showEpisodesTab(C3727bIk c3727bIk) {
        InterfaceC5194buE P;
        Object f;
        InterfaceC5198buI c2 = c3727bIk.e().c();
        if (c2 == null || (P = c2.P()) == null) {
            return;
        }
        List<InterfaceC5195buF> at = P.at();
        if (at == null) {
            at = C8569dql.i();
        }
        f = C8576dqs.f((List<? extends Object>) at, c3727bIk.b());
        InterfaceC5195buF interfaceC5195buF = (InterfaceC5195buF) f;
        if (interfaceC5195buF != null) {
            if (aQW.c.d()) {
                addSeasonLabelOrSelectorWithAdvisory(at, P, interfaceC5195buF);
            } else {
                addSeasonLabelOrSelector(at, P, interfaceC5195buF);
            }
            List<InterfaceC5227bul> cf_ = interfaceC5195buF.cf_();
            if (cf_ != null) {
                addEpisodes(P, cf_, interfaceC5195buF.cg_().a(), c3727bIk.d());
            }
        }
    }

    private final void addEpisodes(InterfaceC5194buE interfaceC5194buE, List<? extends InterfaceC5227bul> list, int i, boolean z) {
        C1332Xp c1332Xp = C1332Xp.b;
        InterfaceC5298bwC interfaceC5298bwC = (InterfaceC5298bwC) C1332Xp.b(InterfaceC5298bwC.class);
        String b2 = C8126deW.b(this.netflixActivity);
        int i2 = 0;
        for (Object obj : list) {
            if (i2 < 0) {
                C8569dql.h();
            }
            final InterfaceC5227bul interfaceC5227bul = (InterfaceC5227bul) obj;
            bIN bin = new bIN(interfaceC5227bul.aE_().aH_(), interfaceC5227bul.aE_().aY_(), interfaceC5227bul.aE_().d(), interfaceC5227bul.aE_().isPlayable());
            InterfaceC5206buQ c2 = interfaceC5298bwC.c(bin.aH_());
            boolean z2 = !interfaceC5227bul.aE_().isPlayable() && this.adsPlan.g();
            boolean z3 = (!interfaceC5227bul.isAvailableToPlay() || InterfaceC7303ctf.c.a(this.netflixActivity).e(c2) || z2) ? false : true;
            final ContextualText e2 = interfaceC5227bul.e(ContextualText.TextContext.b);
            C8632dsu.a(e2, "");
            final TrackingInfoHolder e3 = this.trackingInfoHolder.e(interfaceC5227bul, i2);
            bGJ bgj = new bGJ();
            String id = interfaceC5227bul.getId();
            StringBuilder sb = new StringBuilder();
            InterfaceC5298bwC interfaceC5298bwC2 = interfaceC5298bwC;
            sb.append("episode-row-");
            sb.append(i2);
            sb.append("-");
            sb.append(id);
            bgj.c((CharSequence) sb.toString());
            C3654bFw c3654bFw = C3654bFw.c;
            bgj.h(c3654bFw.e(interfaceC5227bul, this.netflixActivity));
            bgj.e((CharSequence) e2.text());
            bgj.b(c3654bFw.b(interfaceC5227bul, this.netflixActivity));
            bgj.e(interfaceC5227bul.aw_());
            bgj.b((CharSequence) c3654bFw.c(interfaceC5227bul, this.netflixActivity));
            bgj.c(interfaceC5227bul.g());
            bgj.d(interfaceC5227bul.ca_());
            bgj.c(C8632dsu.c((Object) interfaceC5227bul.getId(), (Object) interfaceC5194buE.bU_()));
            bgj.d(LoMoUtils.c(this.netflixActivity, interfaceC5227bul.ce_()));
            bgj.b(C8004dcG.e.a(interfaceC5227bul, b2));
            bgj.d(bin);
            bgj.e(z2);
            bgj.a(z3);
            bgj.c(DownloadButton.b(c2, bin));
            bgj.d(c2 != null ? c2.aD_() : 0);
            String aH_ = interfaceC5227bul.aE_().aH_();
            bgj.e(aH_ != null ? aH_ : "");
            bgj.a(c2 != null ? c2.C() : null);
            bgj.d(new View.OnClickListener() { // from class: o.bHI
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FullDpEpoxyController.addEpisodes$lambda$96$lambda$95$lambda$92(FullDpEpoxyController.this, interfaceC5227bul, view);
                }
            });
            bgj.e(AppView.synopsisEvidence);
            bgj.b(e3);
            bgj.c((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpEpoxyController$addEpisodes$1$1$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: b */
                public final TrackingInfo invoke() {
                    return TrackingInfoHolder.a(TrackingInfoHolder.this, null, e2.evidenceKey(), null, 5, null);
                }
            });
            bgj.c(new InterfaceC4732bk() { // from class: o.bHL
                @Override // o.InterfaceC4732bk
                public final void b(AbstractC3073as abstractC3073as, Object obj2, int i3) {
                    FullDpEpoxyController.addEpisodes$lambda$96$lambda$95$lambda$93(TrackingInfoHolder.this, e2, (bGJ) abstractC3073as, (bGK.b) obj2, i3);
                }
            });
            bgj.e(this.eventBusFactory);
            InterfaceC5231bup bT_ = interfaceC5227bul.bT_();
            bgj.b((bT_ != null ? bT_.d(this.clock.e()) : null) == LiveState.c);
            bgj.d(interfaceC5227bul.aq());
            bgj.a(new CompoundButton.OnCheckedChangeListener() { // from class: o.bHJ
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                    FullDpEpoxyController.addEpisodes$lambda$96$lambda$95$lambda$94(FullDpEpoxyController.this, interfaceC5227bul, compoundButton, z4);
                }
            });
            add(bgj);
            i2++;
            interfaceC5298bwC = interfaceC5298bwC2;
        }
        if (i > list.size()) {
            if (z) {
                bIS bis = new bIS();
                bis.b((CharSequence) "episodes-retry-button");
                bis.e(new View.OnClickListener() { // from class: o.bHK
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FullDpEpoxyController.addEpisodes$lambda$98$lambda$97(FullDpEpoxyController.this, view);
                    }
                });
                add(bis);
                return;
            }
            C3774bKd c3774bKd = new C3774bKd();
            int size = list.size();
            String id2 = interfaceC5194buE.getId();
            c3774bKd.c((CharSequence) ("episodes-loading-" + size + "_" + id2));
            c3774bKd.b(400L);
            c3774bKd.a(new InterfaceC4467bf() { // from class: o.bHQ
                @Override // o.InterfaceC4467bf
                public final void c(AbstractC3073as abstractC3073as, Object obj2, int i3) {
                    FullDpEpoxyController.addEpisodes$lambda$100$lambda$99(FullDpEpoxyController.this, (C3774bKd) abstractC3073as, (AbstractC3776bKf.e) obj2, i3);
                }
            });
            add(c3774bKd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEpisodes$lambda$96$lambda$95$lambda$92(FullDpEpoxyController fullDpEpoxyController, InterfaceC5227bul interfaceC5227bul, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        C8632dsu.c((Object) interfaceC5227bul, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, new AbstractC3664bGf.C3667c(interfaceC5227bul));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEpisodes$lambda$96$lambda$95$lambda$93(TrackingInfoHolder trackingInfoHolder, ContextualText contextualText, bGJ bgj, bGK.b bVar, int i) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) contextualText, "");
        if (i == 5) {
            CLv2Utils.b(false, AppView.boxArt, TrackingInfoHolder.a(trackingInfoHolder, null, contextualText.evidenceKey(), null, 5, null), null);
            CLv2Utils.b(false, AppView.synopsisEvidence, TrackingInfoHolder.a(trackingInfoHolder, null, contextualText.evidenceKey(), null, 5, null), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEpisodes$lambda$96$lambda$95$lambda$94(FullDpEpoxyController fullDpEpoxyController, InterfaceC5227bul interfaceC5227bul, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        C8632dsu.c((Object) interfaceC5227bul, "");
        C9935zP c9935zP = fullDpEpoxyController.eventBusFactory;
        String id = interfaceC5227bul.getId();
        C8632dsu.a(id, "");
        int parseInt = Integer.parseInt(id);
        VideoType type = interfaceC5227bul.getType();
        C8632dsu.a(type, "");
        c9935zP.b(AbstractC3664bGf.class, new AbstractC3664bGf.u(parseInt, type, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEpisodes$lambda$98$lambda$97(FullDpEpoxyController fullDpEpoxyController, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, AbstractC3664bGf.q.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEpisodes$lambda$100$lambda$99(FullDpEpoxyController fullDpEpoxyController, C3774bKd c3774bKd, AbstractC3776bKf.e eVar, int i) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, AbstractC3664bGf.q.c);
    }

    private final void addSeasonLabelOrSelector(List<? extends InterfaceC5195buF> list, InterfaceC5194buE interfaceC5194buE, InterfaceC5195buF interfaceC5195buF) {
        if (list.size() > 1) {
            C3805bLh c3805bLh = new C3805bLh();
            String id = interfaceC5194buE.getId();
            c3805bLh.e((CharSequence) ("season-selector-" + id));
            c3805bLh.c(C3670bGh.e.u);
            c3805bLh.b((CharSequence) interfaceC5195buF.getTitle());
            c3805bLh.e(Integer.valueOf(C9834xU.j.B));
            c3805bLh.a(new InterfaceC4308bc() { // from class: o.bHC
                @Override // o.InterfaceC4308bc
                public final void c(AbstractC3073as abstractC3073as, Object obj, View view, int i) {
                    FullDpEpoxyController.addSeasonLabelOrSelector$lambda$102$lambda$101(FullDpEpoxyController.this, (C3805bLh) abstractC3073as, (AbstractC3803bLf.c) obj, view, i);
                }
            });
            add(c3805bLh);
            return;
        }
        C3814bLq c3814bLq = new C3814bLq();
        String id2 = interfaceC5194buE.getId();
        c3814bLq.b((CharSequence) ("season-selector-" + id2));
        c3814bLq.d(C3670bGh.e.v);
        c3814bLq.d((CharSequence) interfaceC5195buF.getTitle());
        add(c3814bLq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSeasonLabelOrSelector$lambda$102$lambda$101(FullDpEpoxyController fullDpEpoxyController, C3805bLh c3805bLh, AbstractC3803bLf.c cVar, View view, int i) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        fullDpEpoxyController.eventBusFactory.b(AbstractC3664bGf.class, AbstractC3664bGf.l.c);
    }

    private final void showSimilarsTab(InterfaceC5198buI interfaceC5198buI) {
        List<InterfaceC5223buh> bR_;
        InterfaceC5196buG J2 = interfaceC5198buI.J();
        if (J2 == null || (bR_ = J2.bR_()) == null) {
            return;
        }
        TrackingInfoHolder trackingInfoHolder = new TrackingInfoHolder(PlayLocationType.VIDEO_VIEW);
        TrackableListSummary h = J2.h();
        C8632dsu.d(h);
        TrackingInfoHolder a = trackingInfoHolder.a(h);
        C1781aO c1781aO = new C1781aO();
        String id = interfaceC5198buI.getId();
        c1781aO.b((CharSequence) ("sims-group-" + id));
        c1781aO.e(C3670bGh.e.z);
        int i = 0;
        for (Object obj : bR_) {
            if (i < 0) {
                C8569dql.h();
            }
            final InterfaceC5223buh interfaceC5223buh = (InterfaceC5223buh) obj;
            C8632dsu.d(interfaceC5223buh);
            final TrackingInfoHolder e2 = a.e(interfaceC5223buh, i);
            bLE ble = new bLE();
            String id2 = interfaceC5223buh.getId();
            ble.d((CharSequence) ("similar-" + id2));
            ble.e(C3670bGh.e.C);
            ble.d(interfaceC5223buh.getTitle());
            ble.b(interfaceC5223buh.getBoxshotUrl());
            ble.b(AppView.boxArt);
            ble.a(interfaceC5223buh.getId());
            ble.c((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpEpoxyController$showSimilarsTab$1$1$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: e */
                public final TrackingInfo invoke() {
                    return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
                }
            });
            ble.b(this.epoxyPresentationTracking.c());
            ble.b(new View.OnClickListener() { // from class: o.bHz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FullDpEpoxyController.showSimilarsTab$lambda$108$lambda$107$lambda$106$lambda$105$lambda$104(FullDpEpoxyController.this, interfaceC5223buh, e2, view);
                }
            });
            c1781aO.add(ble);
            i++;
        }
        addFillerForGrid(c1781aO, bR_.size(), 3, "sims");
        add(c1781aO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSimilarsTab$lambda$108$lambda$107$lambda$106$lambda$105$lambda$104(FullDpEpoxyController fullDpEpoxyController, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C9935zP c9935zP = fullDpEpoxyController.eventBusFactory;
        String id = interfaceC5223buh.getId();
        C8632dsu.a(id, "");
        VideoType type = interfaceC5223buh.getType();
        C8632dsu.a(type, "");
        c9935zP.b(AbstractC3664bGf.class, new AbstractC3664bGf.k(id, type, interfaceC5223buh.getTitle(), interfaceC5223buh.getBoxshotUrl(), interfaceC5223buh.isOriginal(), interfaceC5223buh.isAvailableToPlay(), interfaceC5223buh.isPlayable(), trackingInfoHolder));
    }

    private final void showTrailersTab(final InterfaceC5199buJ interfaceC5199buJ, final InterfaceC5198buI interfaceC5198buI) {
        List<InterfaceC5240buy> bS_;
        String str;
        String w;
        if (interfaceC5199buJ == null || (bS_ = interfaceC5199buJ.bS_()) == null) {
            return;
        }
        int i = 0;
        for (Object obj : bS_) {
            if (i < 0) {
                C8569dql.h();
            }
            final InterfaceC5240buy interfaceC5240buy = (InterfaceC5240buy) obj;
            C3734bIr c3734bIr = new C3734bIr();
            if (C8067ddQ.c()) {
                str = "trailer-" + i + "-" + interfaceC5240buy.getId();
            } else {
                EntryPointAccessors entryPointAccessors = EntryPointAccessors.INSTANCE;
                Context applicationContext = this.netflixActivity.getApplicationContext();
                C8632dsu.a(applicationContext, "");
                str = ((GD) EntryPointAccessors.fromApplication(applicationContext, GD.class)).a().a() ? "trailer-" + i + "-" + interfaceC5240buy.getId() : "trailer-" + interfaceC5240buy.getId();
            }
            c3734bIr.e((CharSequence) str);
            c3734bIr.d((CharSequence) interfaceC5240buy.getTitle());
            c3734bIr.b(C3654bFw.c.d(interfaceC5240buy, this.netflixActivity));
            if (this.migrationFeature.e()) {
                w = interfaceC5240buy.getBoxshotUrl();
            } else {
                InterfaceC8366diy interfaceC8366diy = interfaceC5240buy instanceof InterfaceC8366diy ? (InterfaceC8366diy) interfaceC5240buy : null;
                w = interfaceC8366diy != null ? interfaceC8366diy.w() : null;
            }
            c3734bIr.d(w);
            final int i2 = i;
            c3734bIr.b(new View.OnClickListener() { // from class: o.bHG
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FullDpEpoxyController.showTrailersTab$lambda$112$lambda$111$lambda$110$lambda$109(InterfaceC5240buy.this, i2, interfaceC5199buJ, interfaceC5198buI, this, view);
                }
            });
            add(c3734bIr);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTrailersTab$lambda$112$lambda$111$lambda$110$lambda$109(InterfaceC5240buy interfaceC5240buy, int i, InterfaceC5199buJ interfaceC5199buJ, InterfaceC5198buI interfaceC5198buI, FullDpEpoxyController fullDpEpoxyController, View view) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) interfaceC5240buy, "");
        C8632dsu.c((Object) interfaceC5198buI, "");
        C8632dsu.c((Object) fullDpEpoxyController, "");
        TrackingInfoHolder e2 = new TrackingInfoHolder(PlayLocationType.VIDEO_VIEW).e(interfaceC5240buy, i);
        TrackableListSummary l = interfaceC5199buJ.l();
        if (l != null && l.getRequestId() != null) {
            e2 = e2.a(l);
        } else {
            InterfaceC1593aHa.c.a("SPY-32499: " + interfaceC5198buI.getId() + " listSummary " + (l != null ? l.toString() : null));
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str = "FullDp SPY-32499: Null trailersListSummary for " + interfaceC5198buI.getId();
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        C9935zP c9935zP = fullDpEpoxyController.eventBusFactory;
        VideoType type = interfaceC5240buy.getType();
        C8632dsu.a(type, "");
        c9935zP.b(AbstractC3664bGf.class, new AbstractC3664bGf.C3666b(interfaceC5240buy, type, e2));
    }

    private final void showTitleGroupTab(InterfaceC5198buI interfaceC5198buI) {
        List<InterfaceC5223buh> cl_;
        InterfaceC5202buM L = interfaceC5198buI.L();
        if (L == null || (cl_ = L.cl_()) == null) {
            return;
        }
        TrackingInfoHolder trackingInfoHolder = new TrackingInfoHolder(PlayLocationType.VIDEO_VIEW);
        TrackableListSummary ck_ = L.ck_();
        C8632dsu.d(ck_);
        TrackingInfoHolder a = trackingInfoHolder.a(ck_);
        C1781aO c1781aO = new C1781aO();
        String id = interfaceC5198buI.getId();
        c1781aO.b((CharSequence) ("titlegroup-group-" + id));
        c1781aO.e(C3670bGh.e.z);
        int i = 0;
        for (Object obj : cl_) {
            if (i < 0) {
                C8569dql.h();
            }
            final InterfaceC5223buh interfaceC5223buh = (InterfaceC5223buh) obj;
            if (interfaceC5223buh != null) {
                final TrackingInfoHolder e2 = a.e(interfaceC5223buh, i);
                bLE ble = new bLE();
                String id2 = interfaceC5223buh.getId();
                ble.d((CharSequence) ("titlegroup-" + id2));
                ble.e(C3670bGh.e.C);
                ble.d(interfaceC5223buh.getTitle());
                ble.b(interfaceC5223buh.getBoxshotUrl());
                ble.b(AppView.boxArt);
                ble.c((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpEpoxyController$showTitleGroupTab$1$1$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    /* renamed from: c */
                    public final TrackingInfo invoke() {
                        return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
                    }
                });
                ble.b(this.epoxyPresentationTracking.c());
                ble.b(new View.OnClickListener() { // from class: o.bHx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FullDpEpoxyController.showTitleGroupTab$lambda$117$lambda$116$lambda$115$lambda$114$lambda$113(FullDpEpoxyController.this, interfaceC5223buh, e2, view);
                    }
                });
                c1781aO.add(ble);
            }
            i++;
        }
        addFillerForGrid(c1781aO, cl_.size(), 3, "titlegroup");
        add(c1781aO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTitleGroupTab$lambda$117$lambda$116$lambda$115$lambda$114$lambda$113(FullDpEpoxyController fullDpEpoxyController, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) fullDpEpoxyController, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C9935zP c9935zP = fullDpEpoxyController.eventBusFactory;
        String id = interfaceC5223buh.getId();
        C8632dsu.a(id, "");
        VideoType type = interfaceC5223buh.getType();
        C8632dsu.a(type, "");
        c9935zP.b(AbstractC3664bGf.class, new AbstractC3664bGf.k(id, type, interfaceC5223buh.getTitle(), interfaceC5223buh.getBoxshotUrl(), interfaceC5223buh.isOriginal(), interfaceC5223buh.isAvailableToPlay(), interfaceC5223buh.isPlayable(), trackingInfoHolder));
    }

    /* loaded from: classes4.dex */
    public final class b implements InterfaceC6903cmA {
        public b() {
        }

        @Override // o.InterfaceC6903cmA
        public void d(String str, VideoType videoType, boolean z, TrackingInfoHolder trackingInfoHolder, drM<? super Boolean, dpR> drm) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            C8632dsu.c((Object) drm, "");
            FullDpEpoxyController.this.eventBusFactory.b(AbstractC3664bGf.class, new AbstractC3664bGf.g(str, videoType, z, trackingInfoHolder));
        }

        @Override // o.InterfaceC6903cmA
        public void c(String str, VideoType videoType, boolean z, TrackingInfoHolder trackingInfoHolder, drM<? super Boolean, dpR> drm) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            C8632dsu.c((Object) drm, "");
            FullDpEpoxyController.this.eventBusFactory.b(AbstractC3664bGf.class, new AbstractC3664bGf.C3668d(str, videoType, z, trackingInfoHolder));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0316  */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v16, types: [o.as, o.aX, o.aM, o.aO] */
    /* JADX WARN: Type inference failed for: r26v0, types: [o.aX, com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpEpoxyController] */
    /* JADX WARN: Type inference failed for: r5v4, types: [o.as, o.aX, o.aM, o.aO] */
    /* JADX WARN: Type inference failed for: r6v34, types: [o.as, o.cmx, o.cmu] */
    /* JADX WARN: Type inference failed for: r7v35, types: [o.bFw] */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43, types: [com.netflix.mediaclient.ui.details.DetailsActivity] */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addContentFromVideoDetails(o.C3729bIm r27, o.InterfaceC5198buI r28, o.C3727bIk r29) {
        /*
            Method dump skipped, instructions count: 3045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpEpoxyController.addContentFromVideoDetails(o.bIm, o.buI, o.bIk):void");
    }

    private final void addFillingLoadingModel(String str, long j) {
        bJK bjk = new bJK();
        bjk.d((CharSequence) "filler-top");
        add(bjk);
        C3774bKd c3774bKd = new C3774bKd();
        c3774bKd.c((CharSequence) str);
        c3774bKd.b(j);
        add(c3774bKd);
        bJK bjk2 = new bJK();
        bjk2.d((CharSequence) "filler-bottom");
        add(bjk2);
    }

    private final void addFillingErrorView(CharSequence charSequence, View.OnClickListener onClickListener) {
        bJK bjk = new bJK();
        bjk.d((CharSequence) "filler-top");
        add(bjk);
        bIO bio = new bIO();
        bio.b((CharSequence) "filling-error-text");
        bio.e(charSequence);
        add(bio);
        bIS bis = new bIS();
        bis.b((CharSequence) "filling-retry-button");
        bis.e(onClickListener);
        add(bis);
        bJK bjk2 = new bJK();
        bjk2.d((CharSequence) "filler-bottom");
        add(bjk2);
        C3745bJb c3745bJb = new C3745bJb();
        c3745bJb.d((CharSequence) "view-downloads");
        add(c3745bJb);
    }

    private final void addSeasonLabelOrSelectorWithAdvisory(List<? extends InterfaceC5195buF> list, final InterfaceC5194buE interfaceC5194buE, final InterfaceC5195buF interfaceC5195buF) {
        int i = 2 % 2;
        C3692bHc c3692bHc = new C3692bHc();
        c3692bHc.e((CharSequence) ("season-selector-group-" + interfaceC5194buE.getId()));
        c3692bHc.b(C3670bGh.e.B);
        if (list.size() > 1) {
            float f = 8;
            C1332Xp c1332Xp = C1332Xp.b;
            c3692bHc.c(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            c3692bHc.e(Integer.valueOf((int) TypedValue.applyDimension(1, 30, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            c3692bHc.b(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            c3692bHc.a(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            C3805bLh c3805bLh = new C3805bLh();
            c3805bLh.e((CharSequence) ("season-selector-" + interfaceC5194buE.getId()));
            c3805bLh.c(C3670bGh.e.u);
            c3805bLh.b((CharSequence) interfaceC5195buF.getTitle());
            c3805bLh.e(Integer.valueOf(C9834xU.j.B));
            c3805bLh.a(new InterfaceC4308bc() { // from class: o.bHF
                @Override // o.InterfaceC4308bc
                public final void c(AbstractC3073as abstractC3073as, Object obj, View view, int i2) {
                    FullDpEpoxyController.addSeasonLabelOrSelectorWithAdvisory$lambda$89$lambda$85$lambda$84(FullDpEpoxyController.this, (C3805bLh) abstractC3073as, (AbstractC3803bLf.c) obj, view, i2);
                }
            });
            c3692bHc.add(c3805bLh);
            int i2 = c + 51;
            e = i2 % 128;
            int i3 = i2 % 2;
        } else {
            C1332Xp c1332Xp2 = C1332Xp.b;
            c3692bHc.c(Integer.valueOf((int) TypedValue.applyDimension(1, 20, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            c3692bHc.e(Integer.valueOf((int) TypedValue.applyDimension(1, 30, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            float f2 = 16;
            c3692bHc.b(Integer.valueOf((int) TypedValue.applyDimension(1, f2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            c3692bHc.a(Integer.valueOf((int) TypedValue.applyDimension(1, f2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            C3814bLq c3814bLq = new C3814bLq();
            c3814bLq.b((CharSequence) ("season-selector-" + interfaceC5194buE.getId()));
            c3814bLq.d(C3670bGh.e.v);
            c3814bLq.d((CharSequence) interfaceC5195buF.getTitle());
            c3692bHc.add(c3814bLq);
        }
        bJX bjx = new bJX();
        bjx.b((CharSequence) ("info-image-" + interfaceC5194buE.getId()));
        bjx.a(Integer.valueOf(C1026Lt.a.he));
        bjx.c(Integer.valueOf(C1030Lx.d.d));
        String string = this.netflixActivity.getString(C3670bGh.d.b);
        if (string.startsWith("'!#+")) {
            int i4 = c + 97;
            e = i4 % 128;
            int i5 = i4 % 2;
            String substring = string.substring(4);
            Object[] objArr = new Object[1];
            b(substring, objArr);
            string = ((String) objArr[0]).intern();
        }
        bjx.d(string);
        bjx.e(new View.OnClickListener() { // from class: o.bHH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FullDpEpoxyController.addSeasonLabelOrSelectorWithAdvisory$lambda$89$lambda$88$lambda$87(FullDpEpoxyController.this, interfaceC5195buF, interfaceC5194buE, view);
            }
        });
        c3692bHc.add(bjx);
        add(c3692bHc);
    }

    private final void addFillerForGrid(InterfaceC2023aX interfaceC2023aX, int i, int i2, String str) {
        if (i >= i2 || i > i2) {
            return;
        }
        while (true) {
            C3691bHb c3691bHb = new C3691bHb();
            c3691bHb.c((CharSequence) (str + "-spacer-" + i));
            interfaceC2023aX.add(c3691bHb);
            if (i == i2) {
                return;
            }
            i++;
        }
    }

    private void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$9610);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
