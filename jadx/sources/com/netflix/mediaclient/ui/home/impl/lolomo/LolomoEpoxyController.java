package com.netflix.mediaclient.ui.home.impl.lolomo;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.home.impl.HomeEpoxyController;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.model.leafs.RecommendedTrailer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC1608aHp;
import o.AbstractC3073as;
import o.AbstractC4079bVl;
import o.AbstractC5100bsQ;
import o.AbstractC5271bvc;
import o.AbstractC6677chn;
import o.C1045Mp;
import o.C1332Xp;
import o.C1596aHd;
import o.C1729aMb;
import o.C1860aQy;
import o.C2077aZ;
import o.C3796bKz;
import o.C3814bLq;
import o.C4022bTi;
import o.C4049bUi;
import o.C4065bUy;
import o.C4082bVo;
import o.C4086bVs;
import o.C6652chO;
import o.C7017coI;
import o.C8151dev;
import o.C8153dex;
import o.C8171dfO;
import o.C8569dql;
import o.C8572dqo;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.C8737dwr;
import o.C9737vz;
import o.C9935zP;
import o.GF;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC2023aX;
import o.InterfaceC4467bf;
import o.InterfaceC5139btC;
import o.InterfaceC5155btS;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.InterfaceC5232buq;
import o.InterfaceC6419ccu;
import o.aSC;
import o.bJH;
import o.bKU;
import o.bLW;
import o.bSI;
import o.bSJ;
import o.bSS;
import o.bSY;
import o.bTX;
import o.bUH;
import o.bVC;
import o.bVI;
import o.bVL;
import o.bVN;
import o.bVR;
import o.bVX;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public class LolomoEpoxyController extends HomeEpoxyController {
    private static final int ROUNDED_CORNER_RADIUS;
    private final bVN collectTasteCreator;
    private final bVR collectionCreator;
    private final drO<MiniPlayerVideoGroupViewModel> getMiniPlayerViewModel;
    private final bUH videoCreator;
    private final AbstractC5100bsQ videoGroup;
    public static final a Companion = new a(null);
    private static final AppView lolomoItemDefaultAppView = AppView.boxArt;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[CollectTaste.MessageType.values().length];
            try {
                iArr[CollectTaste.MessageType.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CollectTaste.MessageType.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CollectTaste.MessageType.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CollectTaste.MessageType.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr;
            int[] iArr2 = new int[LoMoType.values().length];
            try {
                iArr2[LoMoType.INSTANT_QUEUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LoMoType.MY_GAMES.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LoMoType.POPULAR_GAMES.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LoMoType.MOST_THUMBED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[LoMoType.MY_DOWNLOADS.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[LoMoType.BEHIND_THE_SCENES.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[LoMoType.BILLBOARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[LoMoType.GAME_BILLBOARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[LoMoType.GAME_FEATURE_EDUCATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[LoMoType.COLLECTION_PAGE_EVIDENCE.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[LoMoType.COLLECTION_VIDEO_PAGE_EVIDENCE.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[LoMoType.BULK_RATER.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            c = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addEmptyRow$lambda$12$lambda$10(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addTitle$lambda$20$lambda$19(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addTitleRow$lambda$22$lambda$21(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addVideoRow$lambda$14$lambda$13(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildHomeHeaders$lambda$3$lambda$2$lambda$1(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildHomeHeaders$lambda$6$lambda$5(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildRowTitle$lambda$27$lambda$26(int i, int i2, int i3) {
        return i;
    }

    private final boolean isPayoffLoMo(LoMo loMo) {
        return false;
    }

    public final drO<MiniPlayerVideoGroupViewModel> getGetMiniPlayerViewModel() {
        return this.getMiniPlayerViewModel;
    }

    public final AbstractC5100bsQ getVideoGroup() {
        return this.videoGroup;
    }

    /* loaded from: classes4.dex */
    public static final class c implements View.OnLayoutChangeListener {
        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            C8737dwr.c(LolomoEpoxyController.this.getEventBusFactory().a(), GF.e(), null, new LolomoEpoxyController$notifyHeaderHeight$1$1(LolomoEpoxyController.this, view, null), 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LolomoEpoxyController(LolomoMvRxFragment.d dVar, Context context, C9935zP c9935zP, bSY bsy, bLW blw, bTX btx, drX<? super LoMo, ? super Integer, dpR> drx, drM<? super LoMo, dpR> drm, drO<MiniPlayerVideoGroupViewModel> dro, AbstractC5100bsQ abstractC5100bsQ) {
        super(dVar, context, c9935zP, bsy, blw, btx, drx, drm);
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) bsy, "");
        C8632dsu.c((Object) btx, "");
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) dro, "");
        this.getMiniPlayerViewModel = dro;
        this.videoGroup = abstractC5100bsQ;
        this.videoCreator = new bUH(context, bsy, dVar.h(), dVar.c(), dVar.d(), new drM<bSJ, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController$videoCreator$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void e(bSJ bsj) {
                C8632dsu.c((Object) bsj, "");
                LolomoEpoxyController.this.emit(bsj);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(bSJ bsj) {
                e(bsj);
                return dpR.c;
            }
        });
        this.collectTasteCreator = new bVN(bsy, dVar.c(), new drM<bSJ, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController$collectTasteCreator$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void a(bSJ bsj) {
                C8632dsu.c((Object) bsj, "");
                LolomoEpoxyController.this.emit(bsj);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(bSJ bsj) {
                a(bsj);
                return dpR.c;
            }
        });
        this.collectionCreator = new bVR(context, c9935zP);
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("LolomoEpoxyController");
        }

        public final AppView b() {
            return LolomoEpoxyController.lolomoItemDefaultAppView;
        }

        public final int a() {
            return LolomoEpoxyController.ROUNDED_CORNER_RADIUS;
        }
    }

    static {
        C1332Xp c1332Xp = C1332Xp.b;
        ROUNDED_CORNER_RADIUS = (int) TypedValue.applyDimension(1, 7, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
    }

    protected final MiniPlayerVideoGroupViewModel getMiniPlayerViewModel() {
        return this.getMiniPlayerViewModel.invoke();
    }

    @Override // com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public void buildHomeHeaders(C4049bUi c4049bUi) {
        boolean z;
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) c4049bUi, "");
        View f = getLolomoEpoxyRecyclerView().f();
        boolean z2 = false;
        if (f != null) {
            C4086bVs c4086bVs = new C4086bVs();
            c4086bVs.e((CharSequence) "lolomo-header-view");
            c4086bVs.b(f);
            c4086bVs.b(new InterfaceC4467bf() { // from class: o.bTS
                @Override // o.InterfaceC4467bf
                public final void c(AbstractC3073as abstractC3073as, Object obj, int i) {
                    LolomoEpoxyController.buildHomeHeaders$lambda$3$lambda$2$lambda$0(LolomoEpoxyController.this, (C4086bVs) abstractC3073as, (AbstractC4079bVl.e) obj, i);
                }
            });
            c4086bVs.b(new AbstractC3073as.b() { // from class: o.bTT
                @Override // o.AbstractC3073as.b
                public final int b(int i, int i2, int i3) {
                    int buildHomeHeaders$lambda$3$lambda$2$lambda$1;
                    buildHomeHeaders$lambda$3$lambda$2$lambda$1 = LolomoEpoxyController.buildHomeHeaders$lambda$3$lambda$2$lambda$1(i, i2, i3);
                    return buildHomeHeaders$lambda$3$lambda$2$lambda$1;
                }
            });
            add(c4086bVs);
            z = true;
        } else {
            z = false;
        }
        if (c4049bUi.m() != null) {
            C4082bVo c4082bVo = new C4082bVo();
            c4082bVo.e((CharSequence) "lolomo-banner-view");
            c4082bVo.b(C3796bKz.g.k);
            bJH.c(c4049bUi.m(), c4082bVo, getContext(), dpR.c);
            c4082bVo.e(new InterfaceC4467bf() { // from class: o.bTZ
                @Override // o.InterfaceC4467bf
                public final void c(AbstractC3073as abstractC3073as, Object obj, int i) {
                    LolomoEpoxyController.buildHomeHeaders$lambda$6$lambda$4(LolomoEpoxyController.this, (C4082bVo) abstractC3073as, (C2077aZ) obj, i);
                }
            });
            c4082bVo.e(new AbstractC3073as.b() { // from class: o.bUa
                @Override // o.AbstractC3073as.b
                public final int b(int i, int i2, int i3) {
                    int buildHomeHeaders$lambda$6$lambda$5;
                    buildHomeHeaders$lambda$6$lambda$5 = LolomoEpoxyController.buildHomeHeaders$lambda$6$lambda$5(i, i2, i3);
                    return buildHomeHeaders$lambda$6$lambda$5;
                }
            });
            add(c4082bVo);
            z2 = true;
        }
        if (z && z2) {
            InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
            aVar.a("legacy=" + getLolomoEpoxyRecyclerView().f());
            aVar.a("messaging=" + c4049bUi.m());
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("legacy and new banner added", null, null, true, k, false, false, 96, null);
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
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        if (z2) {
            return;
        }
        C8737dwr.c(getEventBusFactory().a(), GF.e(), null, new LolomoEpoxyController$buildHomeHeaders$3(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildHomeHeaders$lambda$3$lambda$2$lambda$0(LolomoEpoxyController lolomoEpoxyController, C4086bVs c4086bVs, AbstractC4079bVl.e eVar, int i) {
        C8632dsu.c((Object) lolomoEpoxyController, "");
        lolomoEpoxyController.notifyHeaderHeight(eVar.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildHomeHeaders$lambda$6$lambda$4(LolomoEpoxyController lolomoEpoxyController, C4082bVo c4082bVo, C2077aZ c2077aZ, int i) {
        C8632dsu.c((Object) lolomoEpoxyController, "");
        lolomoEpoxyController.notifyHeaderHeight(c2077aZ.b());
    }

    @Override // com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public void buildHomeFooters(C4049bUi c4049bUi) {
        C8632dsu.c((Object) c4049bUi, "");
        AbstractC6677chn q = c4049bUi.q();
        if (q != null) {
            C4082bVo c4082bVo = new C4082bVo();
            c4082bVo.e((CharSequence) "lolomo-footer-banner-view");
            c4082bVo.b(C3796bKz.g.k);
            bJH.c(q, c4082bVo, getContext(), dpR.c);
            add(c4082bVo);
        }
    }

    @Override // com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public C1729aMb buildConfig(Context context, LoMo loMo, String str) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) loMo, "");
        if (loMo.getType() == LoMoType.BILLBOARD) {
            return InterfaceC6419ccu.d.d.d();
        }
        if (loMo.getType() != LoMoType.COLLECTION_VIDEO_PAGE_EVIDENCE && loMo.getType() != LoMoType.COLLECTION_PAGE_EVIDENCE) {
            if (loMo.getType() == LoMoType.CHARACTERS) {
                return InterfaceC6419ccu.d.d.d(context);
            }
            if (loMo.getType() == LoMoType.ROAR && isRoarSupported(loMo)) {
                return InterfaceC6419ccu.d.m(context, 5);
            }
            if (loMo.getType() == LoMoType.BEHIND_THE_SCENES) {
                return InterfaceC6419ccu.d.d.n(context, 30);
            }
            if (loMo.getType() == LoMoType.RECENTLY_WATCHED) {
                return InterfaceC6419ccu.d.d.r(context, 31);
            }
            if (loMo.getType() == LoMoType.MY_DOWNLOADS) {
                return InterfaceC6419ccu.d.d.s(context, 32);
            }
            if (loMo.getType() == LoMoType.CONTINUE_WATCHING) {
                return InterfaceC6419ccu.d.e(context, 2);
            }
            if (loMo.getType() == LoMoType.TOP_TEN) {
                return InterfaceC6419ccu.d.k(context, 11);
            }
            if (loMo.getType() == LoMoType.POPULAR_GAMES || loMo.getType() == LoMoType.RECENTLY_RELEASED_GAMES || loMo.getType() == LoMoType.MY_GAMES || loMo.getType() == LoMoType.DEFAULT_GAMES) {
                return InterfaceC6419ccu.d.l(context, 16);
            }
            if (loMo.getType() == LoMoType.IP_BASED_GAMES) {
                return InterfaceC6419ccu.d.j(context, 33);
            }
            if (loMo.getType() == LoMoType.EDITORIAL_GAMES) {
                return InterfaceC6419ccu.d.b(context, 17);
            }
            if (loMo.getType() == LoMoType.READY_TO_PLAY) {
                return InterfaceC6419ccu.d.e(context, 20, C8151dev.j(context) ? 2 : 1);
            } else if (loMo.getType() == LoMoType.GAME_BILLBOARD) {
                if (!C8632dsu.c((Object) str, (Object) "games")) {
                    return InterfaceC6419ccu.d.d.d();
                }
                return InterfaceC6419ccu.d.c(context, 18);
            } else if (loMo.getType() == LoMoType.GAMES_TRAILERS) {
                return InterfaceC6419ccu.d.f(context, 19);
            } else {
                if (loMo.getType() == LoMoType.GAME_FEATURE_EDUCATION) {
                    return InterfaceC6419ccu.d.a(context, 22);
                }
                if (loMo.getType() == LoMoType.GAME_IDENTITY) {
                    return C1729aMb.b(InterfaceC6419ccu.d.h(context, 28), 0, 0, 0.0f, 0, 0, 0, 0, 0, 0.0f, 0, null, false, false, false, 0, 0, 0, false, 0, null, 0, 0, false, 8257535, null);
                }
                if (loMo.getType() == LoMoType.KIDS_FAVORITES) {
                    return InterfaceC6419ccu.d.i(context, 15);
                }
                if (loMo.getType() == LoMoType.GALLERY) {
                    return InterfaceC6419ccu.d.d.o(context, 8);
                }
                if (loMo.getType() == LoMoType.CATEGORIES) {
                    return InterfaceC6419ccu.d.d(context, 23);
                }
                if (loMo.getType() == LoMoType.MOST_THUMBED) {
                    return InterfaceC6419ccu.d.g(context, 26);
                }
                C1860aQy.d dVar = C1860aQy.b;
                if (dVar.e().c() && loMo.getType() == LoMoType.BULK_RATER && !isPayoffLoMo(loMo)) {
                    return C1729aMb.b(InterfaceC6419ccu.d.i(context, 12), 0, 0, 0.0f, 0, 0, 0, 0, 0, 0.0f, 0, null, false, false, false, 0, 0, 0, false, 0, null, 0, 0, false, 8257535, null);
                }
                if (dVar.e().c() && (loMo.getType() == LoMoType.BULK_RATER_RECOMMENDATION || (loMo.getType() == LoMoType.BULK_RATER && isPayoffLoMo(loMo)))) {
                    return InterfaceC6419ccu.d.b(context, getComponents().c(), 29);
                }
                return InterfaceC6419ccu.d.i(context, 1);
            }
        }
        return InterfaceC6419ccu.d.d.c();
    }

    @Override // com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public boolean addEmptyRow(InterfaceC2023aX interfaceC2023aX, LoMo loMo, C1729aMb c1729aMb, C4049bUi c4049bUi, int i, InterfaceC5155btS interfaceC5155btS, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) c4049bUi, "");
        C8632dsu.c((Object) interfaceC5155btS, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        if (loMo.getType() == LoMoType.INSTANT_QUEUE && C8632dsu.c((Object) c4049bUi.b(), (Object) "queue")) {
            bVC bvc = new bVC();
            bvc.c((CharSequence) "my-list-gallery-empty-state");
            bvc.c(new AbstractC3073as.b() { // from class: o.bTN
                @Override // o.AbstractC3073as.b
                public final int b(int i2, int i3, int i4) {
                    int addEmptyRow$lambda$12$lambda$10;
                    addEmptyRow$lambda$12$lambda$10 = LolomoEpoxyController.addEmptyRow$lambda$12$lambda$10(i2, i3, i4);
                    return addEmptyRow$lambda$12$lambda$10;
                }
            });
            bvc.a(new View.OnClickListener() { // from class: o.bTV
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LolomoEpoxyController.addEmptyRow$lambda$12$lambda$11(LolomoEpoxyController.this, view);
                }
            });
            interfaceC2023aX.add(bvc);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEmptyRow$lambda$12$lambda$11(LolomoEpoxyController lolomoEpoxyController, View view) {
        C8632dsu.c((Object) lolomoEpoxyController, "");
        lolomoEpoxyController.getContext().startActivity(HomeActivity.d(lolomoEpoxyController.getContext(), AppView.browseTitlesGallery, false));
    }

    @Override // com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public void addVideoRow(InterfaceC2023aX interfaceC2023aX, C4049bUi c4049bUi, InterfaceC5155btS interfaceC5155btS, final LoMo loMo, final List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> list, C1729aMb c1729aMb, TrackingInfoHolder trackingInfoHolder, boolean z, drO<dpR> dro, drO<dpR> dro2) {
        int d;
        Map k;
        Throwable th;
        boolean g;
        int i;
        boolean g2;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c4049bUi, "");
        C8632dsu.c((Object) interfaceC5155btS, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dro2, "");
        if (loMo.getType() == LoMoType.GAME_BILLBOARD) {
            getGameCreator().d(interfaceC2023aX, loMo, trackingInfoHolder, list, c4049bUi.b(), Integer.valueOf(c4049bUi.a()), this.videoGroup);
        } else if (loMo.getType() == LoMoType.BILLBOARD) {
            new bVL(getContext(), getHomeModelTracking()).b(interfaceC2023aX, c4049bUi, loMo, list.get(0), trackingInfoHolder);
        } else if (loMo.getType() == LoMoType.COLLECTION_PAGE_EVIDENCE || loMo.getType() == LoMoType.COLLECTION_VIDEO_PAGE_EVIDENCE) {
            InterfaceC5223buh video = list.get(0).getVideo();
            InterfaceC5232buq interfaceC5232buq = video instanceof InterfaceC5232buq ? (InterfaceC5232buq) video : null;
            if (interfaceC5232buq != null) {
                this.collectionCreator.e(interfaceC2023aX, interfaceC5232buq, trackingInfoHolder.e(interfaceC5232buq, loMo.getListPos()), loMo.getListPos(), getMiniPlayerViewModel());
            }
        } else if (isFlatGallery(interfaceC5155btS) || loMo.getType() == LoMoType.GALLERY) {
            new bVX(this.videoCreator, new drM<bSJ, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController$addVideoRow$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void e(bSJ bsj) {
                    C8632dsu.c((Object) bsj, "");
                    LolomoEpoxyController.this.emit(bsj);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(bSJ bsj) {
                    e(bsj);
                    return dpR.c;
                }
            }).d(interfaceC2023aX, c4049bUi, interfaceC5155btS, loMo, list, c1729aMb, isFlatGallery(interfaceC5155btS), trackingInfoHolder, getStandardTitleLayoutId(loMo.getListPos(), loMo), getLolomoEpoxyRecyclerView());
        } else if (loMo.getType() != LoMoType.GAMES_TRAILERS) {
            if (!C1860aQy.b.e().c() || loMo.getType() != LoMoType.BULK_RATER || isPayoffLoMo(loMo)) {
                super.addVideoRow(interfaceC2023aX, c4049bUi, interfaceC5155btS, loMo, list, c1729aMb, trackingInfoHolder, z, dro, dro2);
                return;
            }
            int i2 = b.b[c4049bUi.x().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    this.collectTasteCreator.a(this, loMo, AppView.bulkRaterNoPayOffMessage, trackingInfoHolder, CollectTaste.MessageType.b);
                } else if (i2 == 3) {
                    this.collectTasteCreator.a(this, loMo, AppView.bulkRaterSkipAllTitlesMessage, trackingInfoHolder, CollectTaste.MessageType.a);
                } else if (i2 == 4) {
                    this.collectTasteCreator.a(this, loMo, AppView.bulkRaterRatedDownAllTitlesMessage, trackingInfoHolder, CollectTaste.MessageType.d);
                } else {
                    this.collectTasteCreator.a(this, list, loMo, trackingInfoHolder);
                }
            }
        } else {
            C3814bLq c3814bLq = new C3814bLq();
            c3814bLq.b((CharSequence) ("row-title-" + loMo.getListPos()));
            if (loMo.getListPos() == 0) {
                c3814bLq.d(C4022bTi.a.g);
            } else {
                c3814bLq.d(getStandardTitleLayoutId(loMo.getListPos(), loMo));
            }
            c3814bLq.d((CharSequence) loMo.getTitle());
            c3814bLq.d(new AbstractC3073as.b() { // from class: o.bTU
                @Override // o.AbstractC3073as.b
                public final int b(int i3, int i4, int i5) {
                    int addVideoRow$lambda$14$lambda$13;
                    addVideoRow$lambda$14$lambda$13 = LolomoEpoxyController.addVideoRow$lambda$14$lambda$13(i3, i4, i5);
                    return addVideoRow$lambda$14$lambda$13;
                }
            });
            add(c3814bLq);
            ArrayList<InterfaceC5222bug> arrayList = new ArrayList();
            for (Object obj : list) {
                InterfaceC5222bug interfaceC5222bug = (InterfaceC5222bug) obj;
                if (interfaceC5222bug.getVideo() instanceof InterfaceC5139btC) {
                    InterfaceC5223buh video2 = interfaceC5222bug.getVideo();
                    C8632dsu.d(video2);
                    if (((InterfaceC5139btC) video2).l() != null) {
                        arrayList.add(obj);
                    }
                }
            }
            d = C8572dqo.d(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(d);
            for (InterfaceC5222bug interfaceC5222bug2 : arrayList) {
                InterfaceC5223buh video3 = interfaceC5222bug2.getVideo();
                C8632dsu.d(video3);
                RecommendedTrailer l = ((InterfaceC5139btC) video3).l();
                C8632dsu.d(l);
                String supplementalVideoId = l.getSupplementalVideoId();
                g2 = C8691duz.g(supplementalVideoId);
                arrayList2.add(Long.valueOf(g2 ? 0L : Long.parseLong(supplementalVideoId)));
            }
            String listId = loMo.getListId();
            if (listId != null) {
                g = C8691duz.g(listId);
                if (!g) {
                    getMiniPlayerViewModel().c(new AbstractC5271bvc.c(listId, arrayList2));
                    int listPos = loMo.getListPos();
                    int i3 = listPos;
                    int i4 = 0;
                    for (Object obj2 : list) {
                        if (i4 < 0) {
                            C8569dql.h();
                        }
                        InterfaceC5222bug interfaceC5222bug3 = (InterfaceC5222bug) obj2;
                        TrackingInfoHolder e = trackingInfoHolder.e(interfaceC5222bug3.getVideo(), i4);
                        if (interfaceC5222bug3.getVideo() instanceof InterfaceC5139btC) {
                            InterfaceC5223buh video4 = interfaceC5222bug3.getVideo();
                            C8632dsu.d(video4);
                            InterfaceC5139btC interfaceC5139btC = (InterfaceC5139btC) video4;
                            if (interfaceC5139btC.l() != null) {
                                i = i4;
                                getGameCreator().b(this, interfaceC5139btC, i3, bSI.c(loMo), e, new C6652chO(null), getMiniPlayerViewModel(), listId, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController$addVideoRow$3$onFirstBind$1
                                    /* JADX INFO: Access modifiers changed from: package-private */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(0);
                                    }

                                    @Override // o.drO
                                    public /* synthetic */ dpR invoke() {
                                        a();
                                        return dpR.c;
                                    }

                                    public final void a() {
                                        if (list.size() < loMo.getLength()) {
                                            this.emit(new bSJ.j(loMo, list.size()));
                                        }
                                    }
                                });
                                i3++;
                                i4 = i + 1;
                            }
                        }
                        i = i4;
                        i4 = i + 1;
                    }
                    return;
                }
            }
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            k = dqE.k(new LinkedHashMap());
            C1596aHd c1596aHd = new C1596aHd("Games trailer lomo id is empty", null, null, true, k, false, false, 96, null);
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
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c2 = dVar2.c();
            if (c2 != null) {
                c2.d(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
        }
    }

    public static /* synthetic */ void addTitleRow$default(LolomoEpoxyController lolomoEpoxyController, InterfaceC2023aX interfaceC2023aX, LoMo loMo, C1729aMb c1729aMb, Integer num, boolean z, String str, Integer num2, View.OnClickListener onClickListener, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addTitleRow");
        }
        lolomoEpoxyController.addTitleRow(interfaceC2023aX, loMo, c1729aMb, num, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : onClickListener);
    }

    public final void addTitleRow(InterfaceC2023aX interfaceC2023aX, LoMo loMo, C1729aMb c1729aMb, Integer num, boolean z, String str, Integer num2, View.OnClickListener onClickListener) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) c1729aMb, "");
        if (str == null && num2 == null && !ConfigFastPropertyFeatureControlConfig.Companion.D()) {
            addTitle(interfaceC2023aX, loMo, c1729aMb, z);
            return;
        }
        bVI bvi = new bVI();
        int listPos = loMo.getListPos();
        bvi.e((CharSequence) ("row-title-" + listPos));
        bvi.b((CharSequence) loMo.getTitle());
        bvi.a(num);
        bvi.d(z);
        bvi.d((CharSequence) str);
        bvi.d(num2);
        bvi.b(onClickListener);
        bvi.c(new AbstractC3073as.b() { // from class: o.bTW
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int addTitleRow$lambda$22$lambda$21;
                addTitleRow$lambda$22$lambda$21 = LolomoEpoxyController.addTitleRow$lambda$22$lambda$21(i, i2, i3);
                return addTitleRow$lambda$22$lambda$21;
            }
        });
        interfaceC2023aX.add(bvi);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01af  */
    @Override // com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildRowTitle(o.InterfaceC2023aX r16, com.netflix.mediaclient.servicemgr.interface_.LoMo r17, o.C1729aMb r18, o.C4049bUi r19, o.InterfaceC5155btS r20, final com.netflix.mediaclient.clutils.TrackingInfoHolder r21) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController.buildRowTitle(o.aX, com.netflix.mediaclient.servicemgr.interface_.LoMo, o.aMb, o.bUi, o.btS, com.netflix.mediaclient.clutils.TrackingInfoHolder):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildRowTitle$lambda$23(LolomoEpoxyController lolomoEpoxyController, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) lolomoEpoxyController, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        lolomoEpoxyController.emit(bSJ.g.a);
        lolomoEpoxyController.getComponents().i().e(AppView.home, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildRowTitle$lambda$24(LolomoEpoxyController lolomoEpoxyController, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) lolomoEpoxyController, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        lolomoEpoxyController.emit(bSJ.f.d);
        lolomoEpoxyController.getComponents().i().e(AppView.browseGames, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildRowTitle$lambda$25(LolomoEpoxyController lolomoEpoxyController, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) lolomoEpoxyController, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        lolomoEpoxyController.emit(bSJ.f.d);
        lolomoEpoxyController.getComponents().i().e(AppView.home, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null));
    }

    @Override // com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public void addRowLoadingState(C4049bUi c4049bUi, InterfaceC2023aX interfaceC2023aX, LoMo loMo, C1729aMb c1729aMb, int i, String str, drO<dpR> dro) {
        float d;
        C8632dsu.c((Object) c4049bUi, "");
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) dro, "");
        switch (b.c[loMo.getType().ordinal()]) {
            case 7:
                boolean f = C8153dex.f();
                if (f) {
                    bKU bku = new bKU();
                    bku.d((CharSequence) ("spacer-" + i));
                    bku.a(Integer.valueOf(c4049bUi.a()));
                    add(bku);
                }
                bSS.d(interfaceC2023aX, getContext(), i, f, dro);
                return;
            case 8:
                boolean v = C8153dex.v();
                if (v) {
                    bKU bku2 = new bKU();
                    bku2.d((CharSequence) ("spacer-" + i));
                    bku2.a(Integer.valueOf(c4049bUi.a()));
                    add(bku2);
                }
                if (!C8632dsu.c((Object) str, (Object) "games")) {
                    d = InterfaceC6419ccu.c.e.d(getContext(), false) * 1.45f;
                } else {
                    d = InterfaceC6419ccu.c.e.d(getContext(), false) * 1.25f;
                }
                bSS.b(interfaceC2023aX, getContext(), i, v, dro, Integer.valueOf((int) d));
                return;
            case 9:
                bSS.b(interfaceC2023aX, getContext(), i, false, dro, Integer.valueOf((int) (InterfaceC6419ccu.c.e.d(getContext(), false) * 1.25f)));
                return;
            case 10:
            case 11:
                bSS.a(interfaceC2023aX, getContext(), i, dro);
                return;
            case 12:
                bSS.e(interfaceC2023aX, i, dro);
                return;
            default:
                super.addRowLoadingState(c4049bUi, interfaceC2023aX, loMo, c1729aMb, i, str, dro);
                return;
        }
    }

    @Override // com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public void addLoadingState(InterfaceC2023aX interfaceC2023aX, LoMo loMo, int i, int i2, C1729aMb c1729aMb, drO<dpR> dro) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) dro, "");
        getRowLoadingCreator().a(interfaceC2023aX, loMo, i, i2, c1729aMb, dro);
    }

    @Override // com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public void addVideo(InterfaceC2023aX interfaceC2023aX, C4049bUi c4049bUi, InterfaceC5155btS interfaceC5155btS, LoMo loMo, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, int i, C1729aMb c1729aMb, TrackingInfoHolder trackingInfoHolder, boolean z, List<Long> list) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c4049bUi, "");
        C8632dsu.c((Object) interfaceC5155btS, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) list, "");
        if (C4065bUy.a.e(loMo)) {
            getGameCreator().c(interfaceC2023aX, loMo, interfaceC5222bug, i, c1729aMb, trackingInfoHolder, getMiniPlayerViewModel(), list);
        } else {
            this.videoCreator.b(interfaceC2023aX, c4049bUi, interfaceC5155btS, loMo, interfaceC5222bug, i, trackingInfoHolder);
        }
    }

    public static /* synthetic */ void openDetailPage$default(LolomoEpoxyController lolomoEpoxyController, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, Context context, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openDetailPage");
        }
        if ((i & 8) != 0) {
            str = null;
        }
        lolomoEpoxyController.openDetailPage(interfaceC5223buh, trackingInfoHolder, context, str);
    }

    protected void openDetailPage(InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, Context context, String str) {
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) context, "");
        C7017coI.c.e().d(AbstractC1608aHp.d.b).d(new AbstractC1608aHp.d.b(interfaceC5223buh, trackingInfoHolder, "lolomo.controller", str)).b(C9737vz.e(context, NetflixActivity.class));
    }

    private final boolean isRoarSupported(LoMo loMo) {
        return aSC.a() && loMo.isRichUITreatment() && !C8171dfO.e();
    }

    private final void notifyHeaderHeight(View view) {
        if (ViewCompat.isLaidOut(view) && !view.isLayoutRequested()) {
            C8737dwr.c(getEventBusFactory().a(), GF.e(), null, new LolomoEpoxyController$notifyHeaderHeight$1$1(this, view, null), 2, null);
        } else {
            view.addOnLayoutChangeListener(new c());
        }
    }

    @Override // com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public void addTitle(InterfaceC2023aX interfaceC2023aX, LoMo loMo, C1729aMb c1729aMb, boolean z) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) c1729aMb, "");
        C3814bLq c3814bLq = new C3814bLq();
        int listPos = loMo.getListPos();
        c3814bLq.b((CharSequence) ("row-title-" + listPos));
        c3814bLq.d(getStandardTitleLayoutId(loMo.getListPos(), loMo));
        c3814bLq.d((CharSequence) loMo.getTitle());
        c3814bLq.a(z);
        c3814bLq.d(new AbstractC3073as.b() { // from class: o.bTR
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int addTitle$lambda$20$lambda$19;
                addTitle$lambda$20$lambda$19 = LolomoEpoxyController.addTitle$lambda$20$lambda$19(i, i2, i3);
                return addTitle$lambda$20$lambda$19;
            }
        });
        interfaceC2023aX.add(c3814bLq);
    }
}
