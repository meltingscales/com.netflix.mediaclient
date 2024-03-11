package com.netflix.mediaclient.ui.games.impl.gdp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.games.api.GameBillboardCanvas;
import com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController;
import com.netflix.mediaclient.ui.lightbox.api.LightBoxItem;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.model.leafs.GameInfo;
import com.netflix.model.leafs.TrackableListSummary;
import dagger.hilt.android.qualifiers.ActivityContext;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.jvm.internal.Ref;
import o.AbstractC3073as;
import o.AbstractC3910bPe;
import o.AbstractC3949bQq;
import o.AbstractC5100bsQ;
import o.AbstractC5271bvc;
import o.AbstractC6729cim;
import o.C1026Lt;
import o.C1045Mp;
import o.C1333Xq;
import o.C1729aMb;
import o.C1781aO;
import o.C3771bKa;
import o.C3780bKj;
import o.C3787bKq;
import o.C3796bKz;
import o.C3805bLh;
import o.C3814bLq;
import o.C3895bOq;
import o.C3896bOr;
import o.C3908bPc;
import o.C3909bPd;
import o.C3938bQf;
import o.C3944bQl;
import o.C3945bQm;
import o.C3947bQo;
import o.C3951bQs;
import o.C3964bRe;
import o.C3978bRs;
import o.C5092bsI;
import o.C6692ciB;
import o.C6952cmx;
import o.C8067ddQ;
import o.C8150deu;
import o.C8569dql;
import o.C8572dqo;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8689dux;
import o.C9834xU;
import o.C9935zP;
import o.C9941zV;
import o.InterfaceC3779bKi;
import o.InterfaceC3825bMa;
import o.InterfaceC4190bZo;
import o.InterfaceC4467bf;
import o.InterfaceC4732bk;
import o.InterfaceC5137btA;
import o.InterfaceC5138btB;
import o.InterfaceC5144btH;
import o.InterfaceC5185btw;
import o.InterfaceC5224bui;
import o.InterfaceC6419ccu;
import o.InterfaceC8366diy;
import o.bIO;
import o.bIS;
import o.bKB;
import o.bKU;
import o.bLE;
import o.bLG;
import o.bLU;
import o.bLW;
import o.bNN;
import o.bNS;
import o.bNV;
import o.bPY;
import o.dpR;
import o.drM;
import o.drO;
import o.dwU;

/* loaded from: classes4.dex */
public class GdpEpoxyController extends TypedEpoxyController<C3908bPc> {
    public static final d Companion;
    public static final long SHIMMER_DELAY = 400;
    private static int a = 0;
    private static int b = 1;
    private static byte e$ss2$7918;
    private final AppView appView;
    private final bLW billBoardAutoPlay;
    private final Context context;
    private final dwU coroutineScope;
    private final bLU epoxyPresentationTracking;
    private final C9935zP eventBusFactory;
    private final bNN gameModels;
    private final C3896bOr gamesFeatures;
    private final bNS gamesInstallation;
    private final bNV gamesUtils;
    private final C3909bPd gdpCl;
    private final MiniPlayerVideoGroupViewModel miniPlayerViewModel;
    private boolean needToTrackLoadResult;
    private final TrackingInfoHolder trackingInfoHolder;
    private final bLW trailerAutoPlay;

    static {
        c();
        Companion = new d(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addCtas$lambda$26$lambda$22$lambda$21$lambda$20(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addCtasAb58347$lambda$35$lambda$30$lambda$29$lambda$28(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addMediaCarousel$lambda$45$lambda$44$lambda$43(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addModes$lambda$41$lambda$40$lambda$39(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addMoreGameDetails$lambda$64$lambda$63(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addRelatedGames$lambda$62$lambda$61$lambda$60(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addSynopsis$lambda$38$lambda$37$lambda$36(int i, int i2, int i3) {
        return i;
    }

    static void c() {
        e$ss2$7918 = (byte) 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int renderBillboardShimmerGroup$lambda$11$lambda$7(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int renderBottomShimmerGroup$lambda$17$lambda$12(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int renderError$lambda$3$lambda$2(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int renderError$lambda$6$lambda$4(int i, int i2, int i3) {
        return i;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("GdpEpoxyController");
        }
    }

    @Inject
    public GdpEpoxyController(@ActivityContext Context context, C9935zP c9935zP, TrackingInfoHolder trackingInfoHolder, dwU dwu, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, AppView appView, bLU blu, bLW blw, bLW blw2, C3909bPd c3909bPd, bNV bnv, bNS bns, bNN bnn, C3896bOr c3896bOr) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) blu, "");
        C8632dsu.c((Object) blw, "");
        C8632dsu.c((Object) blw2, "");
        C8632dsu.c((Object) c3909bPd, "");
        C8632dsu.c((Object) bnv, "");
        C8632dsu.c((Object) bns, "");
        C8632dsu.c((Object) bnn, "");
        C8632dsu.c((Object) c3896bOr, "");
        this.context = context;
        this.eventBusFactory = c9935zP;
        this.trackingInfoHolder = trackingInfoHolder;
        this.coroutineScope = dwu;
        this.miniPlayerViewModel = miniPlayerVideoGroupViewModel;
        this.appView = appView;
        this.epoxyPresentationTracking = blu;
        this.billBoardAutoPlay = blw;
        this.trailerAutoPlay = blw2;
        this.gdpCl = c3909bPd;
        this.gamesUtils = bnv;
        this.gamesInstallation = bns;
        this.gameModels = bnn;
        this.gamesFeatures = c3896bOr;
        this.needToTrackLoadResult = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(C3908bPc c3908bPc) {
        if (c3908bPc != null) {
            GameDetails b2 = c3908bPc.b();
            if (b2 != null && C8632dsu.c(c3908bPc.c(), bPY.c.c)) {
                renderGdp(b2, c3908bPc.a(), c3908bPc.e());
                reportStatus(true);
            } else if (C8632dsu.c(c3908bPc.c(), bPY.d.d)) {
                renderLoading();
            } else {
                renderError();
                reportStatus(false);
            }
        }
    }

    private final void reportStatus(boolean z) {
        if (this.needToTrackLoadResult) {
            this.eventBusFactory.b(AbstractC3910bPe.class, new AbstractC3910bPe.e(z));
            this.needToTrackLoadResult = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderError$lambda$6$lambda$5(GdpEpoxyController gdpEpoxyController, View view) {
        C8632dsu.c((Object) gdpEpoxyController, "");
        gdpEpoxyController.eventBusFactory.b(AbstractC3910bPe.class, AbstractC3910bPe.g.b);
    }

    protected void renderLoading() {
        renderBillboardShimmerGroup$default(this, (int) ((InterfaceC6419ccu.c.e.d(this.context, false) * 1.25f) - ViewUtils.d(this.context)), this.context, 0, null, 12, null);
        renderBottomShimmerGroup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void renderBillboardShimmerGroup$default(GdpEpoxyController gdpEpoxyController, int i, Context context, int i2, drM drm, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderBillboardShimmerGroup");
        }
        if ((i3 & 4) != 0) {
            i2 = C3895bOq.c.E;
        }
        if ((i3 & 8) != 0) {
            drm = new drM<InterfaceC3779bKi, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController$renderBillboardShimmerGroup$1
                public final void b(InterfaceC3779bKi interfaceC3779bKi) {
                    C8632dsu.c((Object) interfaceC3779bKi, "");
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(InterfaceC3779bKi interfaceC3779bKi) {
                    b(interfaceC3779bKi);
                    return dpR.c;
                }
            };
        }
        gdpEpoxyController.renderBillboardShimmerGroup(i, context, i2, drm);
    }

    protected void renderGdp(GameDetails gameDetails, boolean z, AbstractC5100bsQ abstractC5100bsQ) {
        C8632dsu.c((Object) gameDetails, "");
        bNN.b.c(this.gameModels, this, 0, gameDetails, abstractC5100bsQ, this.trackingInfoHolder, this.context, this.billBoardAutoPlay, this.eventBusFactory, AppView.boxArt, null, GameBillboardCanvas.a, null, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController$renderGdp$1$1
            public final void b() {
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                b();
                return dpR.c;
            }
        }, this.epoxyPresentationTracking, 1024, null);
        if (this.gamesFeatures.b()) {
            addCtasAb58347(gameDetails, z);
        } else {
            addCtas(gameDetails, z);
        }
        addSynopsis(gameDetails);
        addModes(gameDetails);
        addMediaCarousel(gameDetails);
        addFooterElements(gameDetails);
    }

    private final void addFooterElements(GameDetails gameDetails) {
        addRelatedGames(gameDetails);
        addMoreGameDetails(gameDetails);
    }

    private final void addCtas(final GameDetails gameDetails, final boolean z) {
        AppView appView;
        int i = 2 % 2;
        Context context = this.context;
        final C9935zP c9935zP = this.eventBusFactory;
        final TrackingInfoHolder trackingInfoHolder = this.trackingInfoHolder;
        bLU blu = this.epoxyPresentationTracking;
        boolean m = gameDetails.m();
        C1781aO c1781aO = new C1781aO();
        c1781aO.b((CharSequence) "cta-groupmodel");
        c1781aO.e(C3895bOq.c.F);
        final String k = gameDetails.k();
        if (k != null) {
            C3945bQm c3945bQm = new C3945bQm();
            c3945bQm.e((CharSequence) "play_install_button");
            c3945bQm.e(z);
            c3945bQm.a(this.gamesInstallation.e(gameDetails));
            c3945bQm.c(new View.OnClickListener() { // from class: o.bPv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GdpEpoxyController.addCtas$lambda$26$lambda$22$lambda$21$lambda$19(C9935zP.this, z, k, gameDetails, view);
                }
            });
            c3945bQm.d(new AbstractC3073as.b() { // from class: o.bPz
                @Override // o.AbstractC3073as.b
                public final int b(int i2, int i3, int i4) {
                    int addCtas$lambda$26$lambda$22$lambda$21$lambda$20;
                    addCtas$lambda$26$lambda$22$lambda$21$lambda$20 = GdpEpoxyController.addCtas$lambda$26$lambda$22$lambda$21$lambda$20(i2, i3, i4);
                    return addCtas$lambda$26$lambda$22$lambda$21$lambda$20;
                }
            });
            if (!z) {
                appView = AppView.gameInstallButton;
                int i2 = a + 41;
                b = i2 % 128;
                int i3 = i2 % 2;
            } else {
                int i4 = b + 115;
                a = i4 % 128;
                int i5 = i4 % 2;
                appView = AppView.gameLaunchButton;
            }
            c3945bQm.b(appView);
            c3945bQm.e((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController$addCtas$1$1$1$3
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: d */
                public final TrackingInfo invoke() {
                    return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
                }
            });
            c3945bQm.e(blu.c());
            c1781aO.add(c3945bQm);
            int i6 = a + 115;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        C6952cmx c6952cmx = new C6952cmx();
        String id = gameDetails.getId();
        c6952cmx.e((CharSequence) ("my-list-button-" + id));
        c6952cmx.d(C3895bOq.c.I);
        c6952cmx.b(gameDetails.getId());
        c6952cmx.c(gameDetails.getType());
        c6952cmx.c(c9935zP.d());
        c6952cmx.c(trackingInfoHolder);
        c6952cmx.e(m);
        c1781aO.add(c6952cmx);
        C3805bLh c3805bLh = new C3805bLh();
        c3805bLh.e((CharSequence) "secondary-button");
        c3805bLh.c(C3895bOq.c.f13525J);
        c3805bLh.d(Integer.valueOf(C1026Lt.a.HH));
        String string = context.getString(C9834xU.h.t);
        if (!(!string.startsWith("'!#+"))) {
            Object[] objArr = new Object[1];
            d(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        c3805bLh.b((CharSequence) string);
        c3805bLh.b(new View.OnClickListener() { // from class: o.bPA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdpEpoxyController.addCtas$lambda$26$lambda$25$lambda$24(C9935zP.this, gameDetails, view);
            }
        });
        c1781aO.add(c3805bLh);
        add(c1781aO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCtas$lambda$26$lambda$22$lambda$21$lambda$19(C9935zP c9935zP, boolean z, String str, GameDetails gameDetails, View view) {
        C9941zV aVar;
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) gameDetails, "");
        if (z) {
            aVar = new AbstractC3910bPe.i(str);
        } else {
            aVar = new AbstractC3910bPe.a(str, gameDetails.h());
        }
        c9935zP.b(AbstractC3910bPe.class, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCtas$lambda$26$lambda$25$lambda$24(C9935zP c9935zP, GameDetails gameDetails, View view) {
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) gameDetails, "");
        c9935zP.b(AbstractC3910bPe.class, new AbstractC3910bPe.h(gameDetails));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCtasAb58347$lambda$35$lambda$30$lambda$29$lambda$27(C9935zP c9935zP, boolean z, String str, GameDetails gameDetails, View view) {
        C9941zV aVar;
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) gameDetails, "");
        if (z) {
            aVar = new AbstractC3910bPe.i(str);
        } else {
            aVar = new AbstractC3910bPe.a(str, gameDetails.h());
        }
        c9935zP.b(AbstractC3910bPe.class, aVar);
    }

    private final void addCtasAb58347(final GameDetails gameDetails, final boolean z) {
        AppView appView;
        int i = 2 % 2;
        Context context = this.context;
        final C9935zP c9935zP = this.eventBusFactory;
        final TrackingInfoHolder trackingInfoHolder = this.trackingInfoHolder;
        bLU blu = this.epoxyPresentationTracking;
        boolean m = gameDetails.m();
        C1781aO c1781aO = new C1781aO();
        c1781aO.b((CharSequence) "cta-groupmodel");
        c1781aO.e(C3895bOq.c.G);
        final String k = gameDetails.k();
        if (k != null) {
            C3945bQm c3945bQm = new C3945bQm();
            c3945bQm.e((CharSequence) "play_install_button");
            c3945bQm.e(z);
            c3945bQm.a(this.gamesInstallation.e(gameDetails));
            c3945bQm.c(new View.OnClickListener() { // from class: o.bPx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GdpEpoxyController.addCtasAb58347$lambda$35$lambda$30$lambda$29$lambda$27(C9935zP.this, z, k, gameDetails, view);
                }
            });
            c3945bQm.d(new AbstractC3073as.b() { // from class: o.bPy
                @Override // o.AbstractC3073as.b
                public final int b(int i2, int i3, int i4) {
                    int addCtasAb58347$lambda$35$lambda$30$lambda$29$lambda$28;
                    addCtasAb58347$lambda$35$lambda$30$lambda$29$lambda$28 = GdpEpoxyController.addCtasAb58347$lambda$35$lambda$30$lambda$29$lambda$28(i2, i3, i4);
                    return addCtasAb58347$lambda$35$lambda$30$lambda$29$lambda$28;
                }
            });
            if (z) {
                appView = AppView.gameLaunchButton;
            } else {
                appView = AppView.gameInstallButton;
            }
            c3945bQm.b(appView);
            c3945bQm.e((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController$addCtasAb58347$1$1$1$3
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: b */
                public final TrackingInfo invoke() {
                    return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
                }
            });
            c3945bQm.e(blu.c());
            c1781aO.add(c3945bQm);
            int i2 = a + 7;
            b = i2 % 128;
            int i3 = i2 % 2;
        }
        C6952cmx c6952cmx = new C6952cmx();
        String id = gameDetails.getId();
        c6952cmx.e((CharSequence) ("my-list-button-" + id));
        c6952cmx.d(C3895bOq.c.I);
        c6952cmx.b(gameDetails.getId());
        c6952cmx.c(gameDetails.getType());
        c6952cmx.c(c9935zP.d());
        c6952cmx.c(trackingInfoHolder);
        c6952cmx.e(m);
        c1781aO.add(c6952cmx);
        C3938bQf c3938bQf = new C3938bQf();
        String id2 = gameDetails.getId();
        c3938bQf.e((CharSequence) ("cta-user-rating-button-" + id2));
        c3938bQf.b(gameDetails.E());
        c3938bQf.b((drM<? super Integer, dpR>) new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController$addCtasAb58347$1$3$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                a(num);
                return dpR.c;
            }

            public final void a(Integer num) {
                C9935zP c9935zP2 = C9935zP.this;
                String unifiedEntityId = gameDetails.getUnifiedEntityId();
                if (unifiedEntityId == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C8632dsu.a(unifiedEntityId, "");
                C8632dsu.d(num);
                c9935zP2.b(AbstractC3910bPe.class, new AbstractC3910bPe.b(unifiedEntityId, num.intValue()));
            }
        });
        c1781aO.add(c3938bQf);
        C3771bKa c3771bKa = new C3771bKa();
        c3771bKa.e((CharSequence) "game-share-button");
        c3771bKa.d(C3895bOq.c.N);
        c3771bKa.c(Integer.valueOf(C1026Lt.a.HH));
        String string = context.getString(C9834xU.h.t);
        if (string.startsWith("'!#+")) {
            int i4 = b + 97;
            a = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            d(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i6 = a + 29;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        c3771bKa.d(string);
        c3771bKa.b(new View.OnClickListener() { // from class: o.bPw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdpEpoxyController.addCtasAb58347$lambda$35$lambda$34$lambda$33(C9935zP.this, gameDetails, view);
            }
        });
        c1781aO.add(c3771bKa);
        add(c1781aO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCtasAb58347$lambda$35$lambda$34$lambda$33(C9935zP c9935zP, GameDetails gameDetails, View view) {
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) gameDetails, "");
        c9935zP.b(AbstractC3910bPe.class, new AbstractC3910bPe.h(gameDetails));
    }

    private final void addSynopsis(GameDetails gameDetails) {
        String B = gameDetails.B();
        if (B != null) {
            C3814bLq c3814bLq = new C3814bLq();
            c3814bLq.b((CharSequence) "synopsis");
            c3814bLq.d((CharSequence) B);
            c3814bLq.d(C3895bOq.c.aj);
            c3814bLq.d(new AbstractC3073as.b() { // from class: o.bPF
                @Override // o.AbstractC3073as.b
                public final int b(int i, int i2, int i3) {
                    int addSynopsis$lambda$38$lambda$37$lambda$36;
                    addSynopsis$lambda$38$lambda$37$lambda$36 = GdpEpoxyController.addSynopsis$lambda$38$lambda$37$lambda$36(i, i2, i3);
                    return addSynopsis$lambda$38$lambda$37$lambda$36;
                }
            });
            add(c3814bLq);
        }
    }

    private final void addModes(GameDetails gameDetails) {
        String d2;
        List<String> D = gameDetails.D();
        if (D != null) {
            C3814bLq c3814bLq = new C3814bLq();
            c3814bLq.b((CharSequence) "modes");
            c3814bLq.d(C3895bOq.c.ak);
            C1333Xq d3 = C1333Xq.d(C3895bOq.e.U);
            String string = this.context.getResources().getString(C3895bOq.e.C);
            C8632dsu.a(string, "");
            d2 = C8576dqs.d(D, string, null, null, 0, null, null, 62, null);
            c3814bLq.d((CharSequence) d3.d("modes", d2).c());
            c3814bLq.d(new AbstractC3073as.b() { // from class: o.bPo
                @Override // o.AbstractC3073as.b
                public final int b(int i, int i2, int i3) {
                    int addModes$lambda$41$lambda$40$lambda$39;
                    addModes$lambda$41$lambda$40$lambda$39 = GdpEpoxyController.addModes$lambda$41$lambda$40$lambda$39(i, i2, i3);
                    return addModes$lambda$41$lambda$40$lambda$39;
                }
            });
            add(c3814bLq);
        }
    }

    private final void addMediaCarousel(GameDetails gameDetails) {
        List<AbstractC3073as<?>> createMediaModels = createMediaModels(gameDetails);
        if (!createMediaModels.isEmpty()) {
            C3944bQl c3944bQl = new C3944bQl();
            c3944bQl.e((CharSequence) "screenshots-carousel");
            c3944bQl.d((List<? extends AbstractC3073as<?>>) createMediaModels);
            c3944bQl.a(new InterfaceC4467bf() { // from class: o.bPi
                @Override // o.InterfaceC4467bf
                public final void c(AbstractC3073as abstractC3073as, Object obj, int i) {
                    GdpEpoxyController.addMediaCarousel$lambda$45$lambda$44$lambda$42((C3944bQl) abstractC3073as, (C3947bQo) obj, i);
                }
            });
            c3944bQl.a(Carousel.Padding.a(12, 8, 12, 8, 8));
            c3944bQl.e(new AbstractC3073as.b() { // from class: o.bPs
                @Override // o.AbstractC3073as.b
                public final int b(int i, int i2, int i3) {
                    int addMediaCarousel$lambda$45$lambda$44$lambda$43;
                    addMediaCarousel$lambda$45$lambda$44$lambda$43 = GdpEpoxyController.addMediaCarousel$lambda$45$lambda$44$lambda$43(i, i2, i3);
                    return addMediaCarousel$lambda$45$lambda$44$lambda$43;
                }
            });
            add(c3944bQl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addMediaCarousel$lambda$45$lambda$44$lambda$42(C3944bQl c3944bQl, C3947bQo c3947bQo, int i) {
        c3947bQo.setId(R.g.ca);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMediaModels$lambda$55$lambda$54$lambda$53$lambda$52$lambda$50(GdpEpoxyController gdpEpoxyController, int i, bLE ble, bLG.a aVar, int i2) {
        C8632dsu.c((Object) gdpEpoxyController, "");
        NetflixImageView d2 = aVar.d();
        ViewGroup.LayoutParams layoutParams = d2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            d2.setLayoutParams(layoutParams);
            aVar.d().setRoundedCornerRadius(gdpEpoxyController.context.getResources().getDimension(C9834xU.a.t));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    private final List<AbstractC3073as<?>> createMediaModels(GameDetails gameDetails) {
        int i;
        float f;
        int d2;
        ArrayList arrayList;
        final ArrayList arrayList2;
        final int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i6;
        ArrayList arrayList5;
        TrackingInfoHolder trackingInfoHolder;
        List G;
        List G2;
        int i7;
        Long m;
        GameDetails gameDetails2 = gameDetails;
        int i8 = 2;
        int i9 = 2 % 2;
        ArrayList arrayList6 = new ArrayList();
        if (C8150deu.h()) {
            int i10 = b + 45;
            a = i10 % 128;
            int i11 = i10 % 2;
            i = this.context.getResources().getDimensionPixelSize(R.b.X);
        } else {
            i = this.context.getResources().getDisplayMetrics().widthPixels;
        }
        GameDetails.Orientation C = gameDetails.C();
        GameDetails.Orientation orientation = GameDetails.Orientation.c;
        float f2 = i / (C == orientation ? 2.2f : 1.2f);
        if (gameDetails.C() == orientation) {
            int i12 = b + 125;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 3 % 3;
            }
            f = 1.778f;
        } else {
            f = 0.5625f;
        }
        int i14 = (int) (f * f2);
        TrackingInfoHolder trackingInfoHolder2 = new TrackingInfoHolder(PlayLocationType.GDP);
        ArrayList arrayList7 = new ArrayList();
        C8632dsu.d(gameDetails);
        InterfaceC5144btH interfaceC5144btH = (InterfaceC5144btH) gameDetails2;
        TrackableListSummary y = interfaceC5144btH.y();
        Object obj = null;
        if (y != null) {
            int i15 = a + 29;
            b = i15 % 128;
            if (i15 % 2 == 0) {
                y.getRequestId();
                obj.hashCode();
                throw null;
            } else if (y.getRequestId() != null) {
                TrackableListSummary y2 = interfaceC5144btH.y();
                C8632dsu.d(y2);
                trackingInfoHolder2 = trackingInfoHolder2.a(y2);
            }
        }
        TrackingInfoHolder trackingInfoHolder3 = trackingInfoHolder2;
        List<InterfaceC5224bui> w = interfaceC5144btH.w();
        d2 = C8572dqo.d(w, 10);
        ArrayList arrayList8 = new ArrayList(d2);
        Iterator<T> it = w.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                int i16 = 0;
                int i17 = 0;
                for (Object obj2 : w) {
                    if (i17 < 0) {
                        int i18 = a + 81;
                        b = i18 % 128;
                        int i19 = i18 % i8;
                        C8569dql.h();
                    }
                    InterfaceC5224bui interfaceC5224bui = (InterfaceC5224bui) obj2;
                    if (interfaceC5224bui instanceof InterfaceC8366diy) {
                        G2 = C8576dqs.G(arrayList8);
                        AbstractC5271bvc.c cVar = new AbstractC5271bvc.c("gdp-trailer-list-" + arrayList8, G2);
                        this.miniPlayerViewModel.c(cVar);
                        this.miniPlayerViewModel.a(new C3978bRs("gdpTrailer"));
                        TrackingInfoHolder b2 = trackingInfoHolder3.b(interfaceC5224bui, i16);
                        PlayContextImp d3 = this.trackingInfoHolder.b(interfaceC5224bui, i17).d(z);
                        InterfaceC8366diy interfaceC8366diy = (InterfaceC8366diy) interfaceC5224bui;
                        String id = interfaceC8366diy.getId();
                        C8632dsu.a(id, "getId(...)");
                        i4 = i16;
                        int i20 = i17;
                        i5 = i17;
                        ArrayList arrayList9 = arrayList6;
                        arrayList5 = arrayList6;
                        arrayList3 = arrayList8;
                        trackingInfoHolder = trackingInfoHolder3;
                        arrayList4 = arrayList7;
                        i6 = i14;
                        addGameTrailer(id, interfaceC8366diy.aJ_(), interfaceC8366diy.w(), interfaceC8366diy.ad(), i20, arrayList9, gameDetails, d3, b2, f2, cVar.d());
                    } else {
                        i4 = i16;
                        i5 = i17;
                        arrayList3 = arrayList8;
                        arrayList4 = arrayList7;
                        i6 = i14;
                        arrayList5 = arrayList6;
                        trackingInfoHolder = trackingInfoHolder3;
                        if (interfaceC5224bui instanceof InterfaceC5224bui) {
                            G = C8576dqs.G(arrayList3);
                            AbstractC5271bvc.c cVar2 = new AbstractC5271bvc.c("gdp-trailer-list", G);
                            this.miniPlayerViewModel.c(cVar2);
                            this.miniPlayerViewModel.a(new C5092bsI("gdpTrailer"));
                            addGameTrailer(interfaceC5224bui.e(), interfaceC5224bui.c(), interfaceC5224bui.b(), interfaceC5224bui.d(), i5, arrayList5, gameDetails, this.trackingInfoHolder.b(interfaceC5224bui, i5).d(true), trackingInfoHolder.b(interfaceC5224bui, i4), f2, cVar2.d());
                        }
                    }
                    i16 = i4 + 1;
                    i17 = i5 + 1;
                    gameDetails2 = gameDetails;
                    trackingInfoHolder3 = trackingInfoHolder;
                    arrayList6 = arrayList5;
                    arrayList8 = arrayList3;
                    arrayList7 = arrayList4;
                    i14 = i6;
                    z = true;
                    i8 = 2;
                }
                ArrayList arrayList10 = arrayList7;
                int i21 = i14;
                GameDetails gameDetails3 = gameDetails2;
                ArrayList arrayList11 = arrayList6;
                TrackingInfoHolder trackingInfoHolder4 = trackingInfoHolder3;
                Iterator<T> it2 = ((InterfaceC5137btA) gameDetails3).p().iterator();
                final int i22 = 0;
                while (!(!it2.hasNext())) {
                    Object next = it2.next();
                    int i23 = i22 + 1;
                    if (i22 < 0) {
                        C8569dql.h();
                        int i24 = b + 69;
                        a = i24 % 128;
                        int i25 = i24 % 2;
                    }
                    GameInfo.GameScreenshot gameScreenshot = (GameInfo.GameScreenshot) next;
                    String screenshotUrl = gameScreenshot.getScreenshotUrl();
                    if (screenshotUrl != null) {
                        final TrackingInfoHolder b3 = trackingInfoHolder4.b(gameDetails3, gameScreenshot.getScreenshotKey(), i16);
                        bLE ble = new bLE();
                        ble.d((CharSequence) ("carousel-image-" + i22));
                        ble.b(screenshotUrl);
                        ble.b(AppView.boxArt);
                        new InterfaceC3825bMa.a(null, null, Integer.valueOf(b3.a()), 3, null);
                        ble.a((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController$createMediaModels$2$1$1$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                super(0);
                            }

                            @Override // o.drO
                            /* renamed from: a */
                            public final TrackingInfo invoke() {
                                return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
                            }
                        });
                        ble.d(this.epoxyPresentationTracking.c());
                        i2 = i21;
                        ble.b(new InterfaceC4467bf() { // from class: o.bPD
                            @Override // o.InterfaceC4467bf
                            public final void c(AbstractC3073as abstractC3073as, Object obj3, int i26) {
                                GdpEpoxyController.createMediaModels$lambda$55$lambda$54$lambda$53$lambda$52$lambda$50(GdpEpoxyController.this, i2, (bLE) abstractC3073as, (bLG.a) obj3, i26);
                            }
                        });
                        if (gameDetails.C() == GameDetails.Orientation.c) {
                            int i26 = a + 97;
                            b = i26 % 128;
                            int i27 = i26 % 2;
                            i3 = C3895bOq.c.ap;
                        } else {
                            i3 = C3895bOq.c.am;
                        }
                        ble.e(i3);
                        String string = this.context.getString(C3895bOq.e.a);
                        if (string.startsWith("'!#+")) {
                            Object[] objArr = new Object[1];
                            d(string.substring(4), objArr);
                            string = ((String) objArr[0]).intern();
                        }
                        ble.c((CharSequence) string);
                        arrayList2 = arrayList10;
                        ble.b(new View.OnClickListener() { // from class: o.bPC
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                GdpEpoxyController.createMediaModels$lambda$55$lambda$54$lambda$53$lambda$52$lambda$51(GdpEpoxyController.this, arrayList2, i22, view);
                            }
                        });
                        arrayList = arrayList11;
                        arrayList.add(ble);
                        arrayList2.add(new LightBoxItem.Image(screenshotUrl));
                    } else {
                        arrayList = arrayList11;
                        arrayList2 = arrayList10;
                        i2 = i21;
                    }
                    i16++;
                    i22 = i23;
                    i21 = i2;
                    arrayList10 = arrayList2;
                    arrayList11 = arrayList;
                }
                return arrayList11;
            }
            ArrayList arrayList12 = arrayList8;
            int i28 = i14;
            GameDetails gameDetails4 = gameDetails2;
            ArrayList arrayList13 = arrayList6;
            TrackingInfoHolder trackingInfoHolder5 = trackingInfoHolder3;
            int i29 = a + 33;
            b = i29 % 128;
            int i30 = i29 % 2;
            InterfaceC5224bui interfaceC5224bui2 = (InterfaceC5224bui) it.next();
            if (interfaceC5224bui2 instanceof InterfaceC8366diy) {
                int i31 = a + 61;
                b = i31 % 128;
                i7 = 2;
                if (i31 % 2 == 0) {
                    String id2 = ((InterfaceC8366diy) interfaceC5224bui2).getId();
                    C8632dsu.a(id2, "");
                    Long.valueOf(Long.parseLong(id2));
                    obj.hashCode();
                    throw null;
                }
                String id3 = ((InterfaceC8366diy) interfaceC5224bui2).getId();
                C8632dsu.a(id3, "");
                m = Long.valueOf(Long.parseLong(id3));
            } else {
                i7 = 2;
                m = interfaceC5224bui2 instanceof InterfaceC5224bui ? C8689dux.m(interfaceC5224bui2.e()) : null;
            }
            arrayList12.add(m);
            gameDetails2 = gameDetails4;
            i8 = i7;
            trackingInfoHolder3 = trackingInfoHolder5;
            arrayList6 = arrayList13;
            i14 = i28;
            arrayList8 = arrayList12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMediaModels$lambda$55$lambda$54$lambda$53$lambda$52$lambda$51(GdpEpoxyController gdpEpoxyController, ArrayList arrayList, int i, View view) {
        C8632dsu.c((Object) gdpEpoxyController, "");
        C8632dsu.c((Object) arrayList, "");
        InterfaceC4190bZo.e.d(gdpEpoxyController.context).b(gdpEpoxyController.context, arrayList, i);
    }

    private final <T extends AbstractC3073as<V>, V> InterfaceC4732bk<T, V> trailerVisibilityStateChangedListener(final InterfaceC4732bk<T, V> interfaceC4732bk, final InterfaceC4732bk<T, V> interfaceC4732bk2) {
        return new InterfaceC4732bk() { // from class: o.bPk
            @Override // o.InterfaceC4732bk
            public final void b(AbstractC3073as abstractC3073as, Object obj, int i) {
                GdpEpoxyController.trailerVisibilityStateChangedListener$lambda$56(InterfaceC4732bk.this, interfaceC4732bk, abstractC3073as, obj, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trailerVisibilityStateChangedListener$lambda$56(InterfaceC4732bk interfaceC4732bk, InterfaceC4732bk interfaceC4732bk2, AbstractC3073as abstractC3073as, Object obj, int i) {
        C8632dsu.c((Object) interfaceC4732bk, "");
        C8632dsu.c((Object) interfaceC4732bk2, "");
        interfaceC4732bk.b(abstractC3073as, obj, i);
        interfaceC4732bk2.b(abstractC3073as, obj, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00dc, code lost:
        if (r20.C() == com.netflix.mediaclient.servicemgr.interface_.GameDetails.Orientation.e) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addGameTrailer(java.lang.String r14, int r15, java.lang.String r16, java.lang.String r17, int r18, java.util.List<o.AbstractC3073as<?>> r19, com.netflix.mediaclient.servicemgr.interface_.GameDetails r20, com.netflix.mediaclient.util.PlayContext r21, final com.netflix.mediaclient.clutils.TrackingInfoHolder r22, final float r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.addGameTrailer(java.lang.String, int, java.lang.String, java.lang.String, int, java.util.List, com.netflix.mediaclient.servicemgr.interface_.GameDetails, com.netflix.mediaclient.util.PlayContext, com.netflix.mediaclient.clutils.TrackingInfoHolder, float, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addGameTrailer$lambda$59$lambda$58(float f, C3964bRe c3964bRe, AbstractC6729cim.b bVar, int i) {
        ConstraintLayout a2 = bVar.c().a();
        ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) f;
            a2.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.netflix.mediaclient.clutils.TrackingInfoHolder] */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, com.netflix.mediaclient.clutils.TrackingInfoHolder] */
    private final void addRelatedGames(GameDetails gameDetails) {
        int i = 2 % 2;
        C8632dsu.d(gameDetails);
        InterfaceC5138btB interfaceC5138btB = (InterfaceC5138btB) gameDetails;
        C1729aMb l = InterfaceC6419ccu.d.l(this.context, 16);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.d = new TrackingInfoHolder(PlayLocationType.GDP);
        TrackableListSummary s = interfaceC5138btB.s();
        List<InterfaceC5185btw> r = interfaceC5138btB.r();
        if (s != null) {
            int i2 = b + 5;
            a = i2 % 128;
            int i3 = i2 % 2;
            if (s.getRequestId() != null) {
                TrackableListSummary s2 = interfaceC5138btB.s();
                C8632dsu.d(s2);
                objectRef.d = ((TrackingInfoHolder) objectRef.d).a(s2);
            }
        }
        if (r.isEmpty()) {
            return;
        }
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) "games-sims-header");
        c3814bLq.d(C3895bOq.c.al);
        String string = this.context.getString(C3895bOq.e.n);
        if (string.startsWith("'!#+")) {
            int i4 = b + 81;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                String substring = string.substring(4);
                Object[] objArr = new Object[1];
                d(substring, objArr);
                string = ((String) objArr[0]).intern();
                int i5 = 42 / 0;
            } else {
                String substring2 = string.substring(4);
                Object[] objArr2 = new Object[1];
                d(substring2, objArr2);
                string = ((String) objArr2[0]).intern();
            }
        }
        c3814bLq.d((CharSequence) string);
        c3814bLq.d(new AbstractC3073as.b() { // from class: o.bPE
            @Override // o.AbstractC3073as.b
            public final int b(int i6, int i7, int i8) {
                int addRelatedGames$lambda$62$lambda$61$lambda$60;
                addRelatedGames$lambda$62$lambda$61$lambda$60 = GdpEpoxyController.addRelatedGames$lambda$62$lambda$61$lambda$60(i6, i7, i8);
                return addRelatedGames$lambda$62$lambda$61$lambda$60;
            }
        });
        add(c3814bLq);
        bKB.d(this, new GdpEpoxyController$addRelatedGames$1$2(l, r, objectRef, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addMoreGameDetails$lambda$69$lambda$68$lambda$67(C3951bQs c3951bQs, AbstractC3949bQq.d dVar, int i) {
        dVar.r().setTag("game-row-modes");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01e3, code lost:
        if (r1.startsWith("'!#+") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01f5, code lost:
        if ((!r1.startsWith("'!#+")) != true) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01f7, code lost:
        r2 = new java.lang.Object[1];
        d(r1.substring(4), r2);
        r1 = ((java.lang.String) r2[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0209, code lost:
        r5 = o.C8566dqi.e(r3);
        addMoreDataRowIfPossible$default(r28, "row-connectivity", r0, r1, false, r5, null, null, null, null, 488, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0344  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addMoreGameDetails(com.netflix.mediaclient.servicemgr.interface_.GameDetails r29) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.addMoreGameDetails(com.netflix.mediaclient.servicemgr.interface_.GameDetails):void");
    }

    static /* synthetic */ void addMoreDataRowIfPossible$default(GdpEpoxyController gdpEpoxyController, String str, int i, String str2, boolean z, List list, String str3, Drawable drawable, String str4, Integer num, int i2, Object obj) {
        List list2;
        List i3;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addMoreDataRowIfPossible");
        }
        boolean z2 = (i2 & 8) != 0 ? false : z;
        if ((i2 & 16) != 0) {
            i3 = C8569dql.i();
            list2 = i3;
        } else {
            list2 = list;
        }
        gdpEpoxyController.addMoreDataRowIfPossible(str, i, str2, z2, list2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : drawable, (i2 & 128) != 0 ? null : str4, (i2 & JSONzip.end) != 0 ? null : num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r7.length() <= 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        r7.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r9 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        r1 = com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.a + 9;
        com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r9.isEmpty() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        r1 = new o.C3951bQs();
        r1.b((java.lang.CharSequence) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r13 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        r1.e(r13.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r5 = r4.context.getString(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r5.startsWith("'!#+") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        r6 = new java.lang.Object[1];
        d(r5.substring(4), r6);
        r5 = ((java.lang.String) r6[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
        r1.b(r5);
        r1.c(r7);
        r1.e(r10);
        r1.a(r8);
        r1.e(r9);
        r1.d(r11);
        r1.a(r12);
        add(r1);
        r5 = com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.b + 41;
        com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r7 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r7 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        r1 = r1 + 33;
        com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if ((r1 % 2) == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addMoreDataRowIfPossible(java.lang.String r5, int r6, java.lang.String r7, boolean r8, java.util.List<java.lang.String> r9, java.lang.String r10, android.graphics.drawable.Drawable r11, java.lang.String r12, java.lang.Integer r13) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.a
            int r2 = r1 + 15
            int r3 = r2 % 128
            com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.b = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L15
            r2 = 50
            int r2 = r2 / r3
            if (r7 == 0) goto L2c
            goto L17
        L15:
            if (r7 == 0) goto L2c
        L17:
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.b = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L27
            int r1 = r7.length()
            if (r1 <= 0) goto L2c
            goto L3e
        L27:
            r7.length()
            r5 = 0
            throw r5
        L2c:
            if (r9 == 0) goto L91
            int r1 = com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.a
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.b = r2
            int r1 = r1 % r0
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L3e
            goto L91
        L3e:
            o.bQs r1 = new o.bQs
            r1.<init>()
            r1.b(r5)
            if (r13 == 0) goto L4f
            int r5 = r13.intValue()
            r1.e(r5)
        L4f:
            android.content.Context r5 = r4.context
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "'!#+"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L70
            r6 = 4
            java.lang.String r5 = r5.substring(r6)
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r4.d(r5, r6)
            r5 = r6[r3]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.intern()
        L70:
            r1.b(r5)
            r1.c(r7)
            r1.e(r10)
            r1.a(r8)
            r1.e(r9)
            r1.d(r11)
            r1.a(r12)
            r4.add(r1)
            int r5 = com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.b
            int r5 = r5 + 41
            int r6 = r5 % 128
            com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.a = r6
            int r5 = r5 % r0
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.addMoreDataRowIfPossible(java.lang.String, int, java.lang.String, boolean, java.util.List, java.lang.String, android.graphics.drawable.Drawable, java.lang.String, java.lang.Integer):void");
    }

    private final String getListTitle(List<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return C1333Xq.d(C3895bOq.e.Z).d("first_item", list.get(0)).a(list.size() - 1).c();
    }

    private final String getModesTitle(List<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return C1333Xq.d(C3895bOq.e.l).d("first_item", list.get(0)).a(list.size() - 1).c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r8.startsWith("'!#+") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        r1 = com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.a + 45;
        com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if ((r1 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        r1 = new java.lang.Object[1];
        d(r8.substring(4), r1);
        r8 = ((java.lang.String) r1[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        r0 = new java.lang.Object[1];
        d(r8.substring(4), r0);
        ((java.lang.String) r0[0]).intern();
        r8 = null;
        r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        o.C8632dsu.d((java.lang.Object) r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        r2 = r2 + 69;
        com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.a = r2 % 128;
        r2 = r2 % 2;
        r8 = r7.context.getString(com.netflix.mediaclient.ui.R.o.gT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
        if (r8.startsWith("'!#+") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
        r1 = new java.lang.Object[1];
        d(r8.substring(4), r1);
        r8 = ((java.lang.String) r1[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
        o.C8632dsu.d((java.lang.Object) r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if ((!r8) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((!r8) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        r8 = r7.context.getString(com.netflix.mediaclient.ui.R.o.eA);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String getSupportString(boolean r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.a
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.b = r2
            int r1 = r1 % r0
            java.lang.String r3 = "'!#+"
            r4 = 4
            r5 = 0
            r6 = 1
            if (r1 != 0) goto L1a
            r1 = 49
            int r1 = r1 / r5
            r8 = r8 ^ r6
            if (r8 == 0) goto L61
            goto L1d
        L1a:
            r8 = r8 ^ r6
            if (r8 == 0) goto L61
        L1d:
            android.content.Context r8 = r7.context
            int r1 = com.netflix.mediaclient.ui.R.o.eA
            java.lang.String r8 = r8.getString(r1)
            boolean r1 = r8.startsWith(r3)
            if (r1 == 0) goto L5d
            int r1 = com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.a
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.b = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L48
            java.lang.String r8 = r8.substring(r4)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r7.d(r8, r1)
            r8 = r1[r5]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
            goto L5d
        L48:
            java.lang.String r8 = r8.substring(r4)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r7.d(r8, r0)
            r8 = r0[r5]
            java.lang.String r8 = (java.lang.String) r8
            r8.intern()
            r8 = 0
            r8.hashCode()
            throw r8
        L5d:
            o.C8632dsu.d(r8)
            goto L8a
        L61:
            int r2 = r2 + 69
            int r8 = r2 % 128
            com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.a = r8
            int r2 = r2 % r0
            android.content.Context r8 = r7.context
            int r1 = com.netflix.mediaclient.ui.R.o.gT
            java.lang.String r8 = r8.getString(r1)
            boolean r1 = r8.startsWith(r3)
            if (r1 == 0) goto L87
            java.lang.String r8 = r8.substring(r4)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r7.d(r8, r1)
            r8 = r1[r5]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
        L87:
            o.C8632dsu.d(r8)
        L8a:
            int r1 = com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.a
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.b = r2
            int r1 = r1 % r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController.getSupportString(boolean):java.lang.String");
    }

    private final boolean canAutoplayTrailer(Context context) {
        return canAutoplay(context) && C6692ciB.a.e();
    }

    private final boolean canAutoplay(Context context) {
        return (C8067ddQ.c() || AccessibilityUtils.a(context)) ? false : true;
    }

    private final void renderError() {
        String intern;
        int i = 2 % 2;
        bKU bku = new bKU();
        bku.d((CharSequence) "game-sims-spacer");
        bku.a(Integer.valueOf(this.context.getResources().getDimensionPixelSize(C3895bOq.d.a)));
        add(bku);
        bIO bio = new bIO();
        bio.b((CharSequence) "filling-error-text");
        String string = this.context.getString(C9834xU.h.j);
        if (!(!string.startsWith("'!#+"))) {
            int i2 = a + 121;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                String substring = string.substring(4);
                Object[] objArr = new Object[1];
                d(substring, objArr);
                intern = ((String) objArr[0]).intern();
                int i3 = 45 / 0;
            } else {
                String substring2 = string.substring(4);
                Object[] objArr2 = new Object[1];
                d(substring2, objArr2);
                intern = ((String) objArr2[0]).intern();
            }
            string = intern;
        }
        bio.e((CharSequence) string);
        bio.b(new AbstractC3073as.b() { // from class: o.bPr
            @Override // o.AbstractC3073as.b
            public final int b(int i4, int i5, int i6) {
                int renderError$lambda$3$lambda$2;
                renderError$lambda$3$lambda$2 = GdpEpoxyController.renderError$lambda$3$lambda$2(i4, i5, i6);
                return renderError$lambda$3$lambda$2;
            }
        });
        add(bio);
        bIS bis = new bIS();
        bis.b((CharSequence) "filling-retry-button");
        bis.c(new AbstractC3073as.b() { // from class: o.bPu
            @Override // o.AbstractC3073as.b
            public final int b(int i4, int i5, int i6) {
                int renderError$lambda$6$lambda$4;
                renderError$lambda$6$lambda$4 = GdpEpoxyController.renderError$lambda$6$lambda$4(i4, i5, i6);
                return renderError$lambda$6$lambda$4;
            }
        });
        bis.e(new View.OnClickListener() { // from class: o.bPt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdpEpoxyController.renderError$lambda$6$lambda$5(GdpEpoxyController.this, view);
            }
        });
        add(bis);
    }

    private final void renderBillboardShimmerGroup(int i, Context context, int i2, drM<? super InterfaceC3779bKi, dpR> drm) {
        C3780bKj c3780bKj = new C3780bKj();
        c3780bKj.e((CharSequence) "billboard-shimmer-group");
        c3780bKj.e(i2);
        c3780bKj.c(new Pair<>(-1, Integer.valueOf(i)));
        c3780bKj.e(new AbstractC3073as.b() { // from class: o.bPm
            @Override // o.AbstractC3073as.b
            public final int b(int i3, int i4, int i5) {
                int renderBillboardShimmerGroup$lambda$11$lambda$7;
                renderBillboardShimmerGroup$lambda$11$lambda$7 = GdpEpoxyController.renderBillboardShimmerGroup$lambda$11$lambda$7(i3, i4, i5);
                return renderBillboardShimmerGroup$lambda$11$lambda$7;
            }
        });
        C3787bKq c3787bKq = new C3787bKq();
        c3787bKq.b((CharSequence) "icon-shimmer");
        c3787bKq.c(400L);
        c3787bKq.d(true);
        c3787bKq.d(Integer.valueOf(context.getResources().getDimensionPixelSize(C3796bKz.d.d)));
        c3787bKq.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq);
        C3787bKq c3787bKq2 = new C3787bKq();
        c3787bKq2.b((CharSequence) "title-shimmer");
        c3787bKq2.c(400L);
        c3787bKq2.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq2);
        C3787bKq c3787bKq3 = new C3787bKq();
        c3787bKq3.b((CharSequence) "metadata-shimmer");
        c3787bKq3.c(400L);
        c3787bKq3.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq3);
        drm.invoke(c3780bKj);
        add(c3780bKj);
    }

    private final void renderBottomShimmerGroup() {
        C3780bKj c3780bKj = new C3780bKj();
        c3780bKj.e((CharSequence) "bottom-shimmer-group");
        c3780bKj.e(C3895bOq.c.H);
        c3780bKj.c(new Pair<>(-1, -2));
        c3780bKj.e(new AbstractC3073as.b() { // from class: o.bPq
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int renderBottomShimmerGroup$lambda$17$lambda$12;
                renderBottomShimmerGroup$lambda$17$lambda$12 = GdpEpoxyController.renderBottomShimmerGroup$lambda$17$lambda$12(i, i2, i3);
                return renderBottomShimmerGroup$lambda$17$lambda$12;
            }
        });
        C3787bKq c3787bKq = new C3787bKq();
        c3787bKq.b((CharSequence) "cta1-shimmer");
        c3787bKq.c(400L);
        c3787bKq.d(true);
        c3787bKq.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq);
        C3787bKq c3787bKq2 = new C3787bKq();
        c3787bKq2.b((CharSequence) "cta2-shimmer");
        c3787bKq2.c(400L);
        c3787bKq2.d(true);
        c3787bKq2.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq2);
        C3787bKq c3787bKq3 = new C3787bKq();
        c3787bKq3.b((CharSequence) "synopsis-shimmer");
        c3787bKq3.c(400L);
        c3787bKq3.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq3);
        C3787bKq c3787bKq4 = new C3787bKq();
        c3787bKq4.b((CharSequence) "screenshot-shimmer");
        c3787bKq4.c(400L);
        c3787bKq4.d(true);
        c3787bKq4.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq4);
        add(c3780bKj);
    }

    private void d(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$7918);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
