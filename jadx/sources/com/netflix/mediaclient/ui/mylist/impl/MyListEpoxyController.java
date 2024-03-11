package com.netflix.mediaclient.ui.mylist.impl;

import android.view.View;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.mylist.impl.MyListEpoxyController;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;
import java.util.List;
import kotlin.jvm.internal.Ref;
import o.AbstractC6960cnE;
import o.AbstractC6968cnM;
import o.AbstractC6996cno;
import o.AbstractC8918fl;
import o.C2376afA;
import o.C2534ahr;
import o.C3774bKd;
import o.C3780bKj;
import o.C3787bKq;
import o.C6956cnA;
import o.C6962cnG;
import o.C6964cnI;
import o.C6967cnL;
import o.C6971cnP;
import o.C6999cnr;
import o.C7011coC;
import o.C7013coE;
import o.C7053cou;
import o.C8168dfL;
import o.C8569dql;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8927fu;
import o.C8932fz;
import o.C8971gl;
import o.C9834xU;
import o.C9935zP;
import o.InterfaceC4467bf;
import o.InterfaceC4573bh;
import o.InterfaceC5160btX;
import o.InterfaceC8881fA;
import o.bIS;
import o.bJK;
import o.bJM;
import o.bNS;

/* loaded from: classes4.dex */
public final class MyListEpoxyController extends TypedEpoxyController<C7011coC> {
    private static final long LOADING_DELAY_MS = 400;
    private static final int LOADING_ROW_COUNT = 9;
    private static final int MORE_VIDEOS_LOOK_AHEAD = 10;
    private static final int SHIMMER_VIEW_INDEX_BOX_ART = 1;
    private static final int SHIMMER_VIEW_INDEX_BUTTON = 3;
    private static final int SHIMMER_VIEW_INDEX_TITLE = 2;
    private static final int VISIBLE_HEIGHT_PERCENTAGE_THRESHOLD = 50;
    private final C9935zP eventBusFactory;
    private final bNS gamesInstallationAndLaunch;
    private TrackingInfoHolder trackingInfoHolder;
    public static final d Companion = new d(null);
    public static final int $stable = 8;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[MyListTabItems.Type.values().length];
            try {
                iArr[MyListTabItems.Type.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MyListTabItems.Type.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            d = iArr;
        }
    }

    public MyListEpoxyController(C9935zP c9935zP, bNS bns) {
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) bns, "");
        this.eventBusFactory = c9935zP;
        this.gamesInstallationAndLaunch = bns;
        this.trackingInfoHolder = new TrackingInfoHolder(PlayLocationType.MY_LIST);
    }

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(C7011coC c7011coC) {
        C8632dsu.c((Object) c7011coC, "");
        int i = a.d[c7011coC.l().ordinal()];
        if (i == 1) {
            buildGame(c7011coC);
        } else if (i != 2) {
        } else {
            buildVideo(c7011coC);
        }
    }

    private final void buildVideo(C7011coC c7011coC) {
        AbstractC8918fl<C7013coE> h = c7011coC.h();
        if (h instanceof C8932fz) {
            addFillingLoadingModel(400L);
        } else if (h instanceof InterfaceC8881fA) {
            addFillingLoadingModel$default(this, 0L, 1, null);
        } else if (h instanceof C8927fu) {
            addFillingErrorView();
        } else if (h instanceof C8971gl) {
            C7013coE c = c7011coC.h().c();
            if (c == null || c.j()) {
                addEmptyVideoStateModel(c7011coC.m());
            } else {
                addVideosModel((C7013coE) ((C8971gl) h).c(), c7011coC);
            }
        }
    }

    private final void buildGame(C7011coC c7011coC) {
        AbstractC8918fl<C6971cnP> f = c7011coC.f();
        if (f instanceof C8932fz) {
            addFillingLoadingModel(400L);
        } else if (f instanceof InterfaceC8881fA) {
            addFillingLoadingModel$default(this, 0L, 1, null);
        } else if (f instanceof C8927fu) {
            C6971cnP c = c7011coC.f().c();
            if (c == null || c.e().isEmpty()) {
                addFillingErrorView();
                return;
            }
            this.trackingInfoHolder = this.trackingInfoHolder.a(c.a());
            addGamesModel(c7011coC, c);
        } else if (f instanceof C8971gl) {
            C6971cnP c2 = c7011coC.f().c();
            if (c2 == null || c2.e().isEmpty()) {
                addEmptyGameStateModel(c7011coC.m());
                return;
            }
            this.trackingInfoHolder = this.trackingInfoHolder.a(c2.a());
            addGamesModel(c7011coC, c2);
        }
    }

    static /* synthetic */ void addFillingLoadingModel$default(MyListEpoxyController myListEpoxyController, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        myListEpoxyController.addFillingLoadingModel(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addFillingErrorView$lambda$6$lambda$5(MyListEpoxyController myListEpoxyController, View view) {
        C8632dsu.c((Object) myListEpoxyController, "");
        myListEpoxyController.emit(AbstractC6996cno.n.e);
    }

    private final void addEmptyVideoStateModel(final boolean z) {
        emit(new AbstractC6996cno.l(false));
        C6962cnG c6962cnG = new C6962cnG();
        c6962cnG.e((CharSequence) "my_list-empty-state");
        c6962cnG.c(Integer.valueOf(z ? C6956cnA.c.w : C6956cnA.c.r));
        c6962cnG.a(Integer.valueOf(z ? C6956cnA.c.u : C6956cnA.c.q));
        c6962cnG.e(Integer.valueOf(z ? C6956cnA.c.y : C6956cnA.c.f13751o));
        c6962cnG.d(new View.OnClickListener() { // from class: o.cnk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyListEpoxyController.addEmptyVideoStateModel$lambda$9$lambda$8(MyListEpoxyController.this, z, view);
            }
        });
        add(c6962cnG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEmptyVideoStateModel$lambda$9$lambda$8(MyListEpoxyController myListEpoxyController, boolean z, View view) {
        AbstractC6996cno abstractC6996cno;
        C8632dsu.c((Object) myListEpoxyController, "");
        if (z) {
            abstractC6996cno = AbstractC6996cno.e.a;
        } else {
            abstractC6996cno = AbstractC6996cno.g.c;
        }
        myListEpoxyController.emit(abstractC6996cno);
    }

    private final void addEmptyGameStateModel(final boolean z) {
        emit(new AbstractC6996cno.o(false));
        C6962cnG c6962cnG = new C6962cnG();
        c6962cnG.e((CharSequence) "my_list-empty-state");
        c6962cnG.c(Integer.valueOf(z ? C6956cnA.c.w : C6956cnA.c.s));
        c6962cnG.a(Integer.valueOf(z ? C6956cnA.c.u : C6956cnA.c.t));
        c6962cnG.e(Integer.valueOf(z ? C6956cnA.c.y : C6956cnA.c.p));
        c6962cnG.d(new View.OnClickListener() { // from class: o.cnm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyListEpoxyController.addEmptyGameStateModel$lambda$11$lambda$10(MyListEpoxyController.this, z, view);
            }
        });
        add(c6962cnG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEmptyGameStateModel$lambda$11$lambda$10(MyListEpoxyController myListEpoxyController, boolean z, View view) {
        AbstractC6996cno abstractC6996cno;
        C8632dsu.c((Object) myListEpoxyController, "");
        if (z) {
            abstractC6996cno = AbstractC6996cno.e.a;
        } else {
            abstractC6996cno = AbstractC6996cno.j.c;
        }
        myListEpoxyController.emit(abstractC6996cno);
    }

    private final void addVideosModel(C7013coE c7013coE, C7011coC c7011coC) {
        String imageUrl;
        String imageKey;
        List<C7053cou> k = c7011coC.k();
        this.trackingInfoHolder = this.trackingInfoHolder.a(c7013coE.h());
        String g = c7011coC.g();
        if (g != null) {
            this.trackingInfoHolder = this.trackingInfoHolder.c(g);
        }
        int i = 0;
        emit(new AbstractC6996cno.l(true ^ (k == null || k.isEmpty())));
        if (k == null || k.isEmpty()) {
            addEmptyVideoStateModel(c7011coC.m());
            return;
        }
        emit(new AbstractC6996cno.i(c7011coC.l(), this.trackingInfoHolder));
        for (Object obj : k) {
            if (i < 0) {
                C8569dql.h();
            }
            C7053cou c7053cou = (C7053cou) obj;
            C2376afA.e a2 = c7011coC.j().a(Integer.parseInt(c7053cou.getId()));
            if (a2 == null || (imageUrl = a2.e()) == null) {
                imageUrl = c7053cou.getEvidence().getImageUrl();
            }
            TrackingInfoHolder trackingInfoHolder = this.trackingInfoHolder;
            if (a2 == null || (imageKey = a2.c()) == null) {
                imageKey = c7053cou.getEvidence().getImageKey();
            }
            addVideoModel(c7053cou, imageUrl, i, trackingInfoHolder.b(c7053cou, imageKey, i), k.size(), c7011coC);
            i++;
        }
        if (!(c7011coC.h() instanceof C8927fu)) {
            if (c7011coC.e()) {
                C3774bKd c3774bKd = new C3774bKd();
                int size = k.size();
                c3774bKd.c((CharSequence) ("my_list-videos-loading-" + size));
                add(c3774bKd);
                return;
            }
            return;
        }
        bIS bis = new bIS();
        bis.b((CharSequence) "my_list-videos-retry-button");
        bis.e(new View.OnClickListener() { // from class: o.cnj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyListEpoxyController.addVideosModel$lambda$15$lambda$14(MyListEpoxyController.this, view);
            }
        });
        add(bis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addVideosModel$lambda$15$lambda$14(MyListEpoxyController myListEpoxyController, View view) {
        C8632dsu.c((Object) myListEpoxyController, "");
        myListEpoxyController.emit(AbstractC6996cno.c.d);
    }

    private final void addGamesModel(C7011coC c7011coC, C6971cnP c6971cnP) {
        List<C6971cnP.a> c = c7011coC.c(c6971cnP);
        emit(new AbstractC6996cno.o(!c.isEmpty()));
        if (c.isEmpty()) {
            addEmptyGameStateModel(c7011coC.m());
            return;
        }
        emit(new AbstractC6996cno.i(c7011coC.l(), this.trackingInfoHolder));
        int i = 0;
        for (Object obj : c) {
            if (i < 0) {
                C8569dql.h();
            }
            C6971cnP.a aVar = (C6971cnP.a) obj;
            addGameModel(aVar, i, this.trackingInfoHolder.e(aVar, i), c.size(), c7011coC.d(), c7011coC);
            i++;
        }
        if (!(c7011coC.f() instanceof C8927fu)) {
            if (c6971cnP.d()) {
                C3774bKd c3774bKd = new C3774bKd();
                int size = c6971cnP.e().size();
                c3774bKd.c((CharSequence) ("my_list-games-loading-" + size));
                add(c3774bKd);
                return;
            }
            return;
        }
        bIS bis = new bIS();
        bis.b((CharSequence) "my_list-game-retry-button");
        bis.e(new View.OnClickListener() { // from class: o.cnl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyListEpoxyController.addGamesModel$lambda$19$lambda$18(MyListEpoxyController.this, view);
            }
        });
        add(bis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addGamesModel$lambda$19$lambda$18(MyListEpoxyController myListEpoxyController, View view) {
        C8632dsu.c((Object) myListEpoxyController, "");
        myListEpoxyController.emit(AbstractC6996cno.b.b);
    }

    private final void addVideoModel(final C7053cou c7053cou, String str, final int i, final TrackingInfoHolder trackingInfoHolder, final int i2, final C7011coC c7011coC) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.a = c7011coC.d();
        C6967cnL c6967cnL = new C6967cnL();
        String id = c7053cou.getId();
        c6967cnL.b((CharSequence) ("MyListVideoModel:" + id));
        c6967cnL.a(c7053cou.getId());
        c6967cnL.c(c7053cou.c());
        c6967cnL.e(c7053cou.getType());
        c6967cnL.e((CharSequence) c7053cou.getTitle());
        c6967cnL.b(str);
        c6967cnL.d(c7011coC.c());
        c6967cnL.b(new InterfaceC4573bh() { // from class: o.cna
            @Override // o.InterfaceC4573bh
            public final void b(AbstractC3073as abstractC3073as, Object obj, float f, float f2, int i3, int i4) {
                MyListEpoxyController.addVideoModel$lambda$28$lambda$22(C7011coC.this, (C6967cnL) abstractC3073as, (AbstractC6968cnM.c) obj, f, f2, i3, i4);
            }
        });
        c6967cnL.e(trackingInfoHolder);
        c6967cnL.c(new View.OnClickListener() { // from class: o.cnd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyListEpoxyController.addVideoModel$lambda$28$lambda$23(MyListEpoxyController.this, c7053cou, trackingInfoHolder, view);
            }
        });
        c6967cnL.b(new View.OnClickListener() { // from class: o.cnf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyListEpoxyController.addVideoModel$lambda$28$lambda$25(C7053cou.this, this, trackingInfoHolder, view);
            }
        });
        c6967cnL.e(new View.OnClickListener() { // from class: o.cnh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyListEpoxyController.addVideoModel$lambda$28$lambda$26(MyListEpoxyController.this, c7053cou, trackingInfoHolder, view);
            }
        });
        c6967cnL.e(new InterfaceC4467bf() { // from class: o.cni
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i3) {
                MyListEpoxyController.addVideoModel$lambda$28$lambda$27(Ref.BooleanRef.this, i, i2, this, (C6967cnL) abstractC3073as, (AbstractC6968cnM.c) obj, i3);
            }
        });
        add(c6967cnL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addVideoModel$lambda$28$lambda$22(C7011coC c7011coC, C6967cnL c6967cnL, AbstractC6968cnM.c cVar, float f, float f2, int i, int i2) {
        C8632dsu.c((Object) c7011coC, "");
        TrackingInfoHolder p = c6967cnL.p();
        if (f > 50.0f) {
            c7011coC.i().d(c6967cnL.q(), AppView.myListGallery, p);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addVideoModel$lambda$28$lambda$23(MyListEpoxyController myListEpoxyController, C7053cou c7053cou, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) myListEpoxyController, "");
        C8632dsu.c((Object) c7053cou, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        myListEpoxyController.emit(new AbstractC6996cno.f(c7053cou, trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addVideoModel$lambda$28$lambda$25(C7053cou c7053cou, MyListEpoxyController myListEpoxyController, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) c7053cou, "");
        C8632dsu.c((Object) myListEpoxyController, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC5160btX c = c7053cou.c();
        if (c != null) {
            myListEpoxyController.emit(new AbstractC6996cno.d(c, trackingInfoHolder));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addVideoModel$lambda$28$lambda$26(MyListEpoxyController myListEpoxyController, C7053cou c7053cou, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) myListEpoxyController, "");
        C8632dsu.c((Object) c7053cou, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        myListEpoxyController.emit(new AbstractC6996cno.k(c7053cou, trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addVideoModel$lambda$28$lambda$27(Ref.BooleanRef booleanRef, int i, int i2, MyListEpoxyController myListEpoxyController, C6967cnL c6967cnL, AbstractC6968cnM.c cVar, int i3) {
        C8632dsu.c((Object) booleanRef, "");
        C8632dsu.c((Object) myListEpoxyController, "");
        if (booleanRef.a) {
            booleanRef.a = false;
            if (i + 10 == i2) {
                myListEpoxyController.emit(AbstractC6996cno.c.d);
            }
        }
    }

    private final void addGameModel(final C6971cnP.a aVar, final int i, final TrackingInfoHolder trackingInfoHolder, final int i2, boolean z, final C7011coC c7011coC) {
        String str;
        Object x;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.a = z;
        final boolean e = this.gamesInstallationAndLaunch.e(aVar.f());
        boolean b = this.gamesInstallationAndLaunch.b(aVar.e(), aVar.b(), aVar.a());
        C6964cnI c6964cnI = new C6964cnI();
        String unifiedEntityId = aVar.getUnifiedEntityId();
        c6964cnI.c((CharSequence) ("MyListVideoModel:" + unifiedEntityId));
        c6964cnI.e(aVar.getTitle());
        c6964cnI.a(String.valueOf(aVar.c()));
        List<C2534ahr.c> j = aVar.j();
        if (j != null) {
            x = C8576dqs.x(j);
            C2534ahr.c cVar = (C2534ahr.c) x;
            if (cVar != null) {
                str = cVar.e();
                c6964cnI.b(str);
                c6964cnI.b(e);
                c6964cnI.d(aVar.d());
                c6964cnI.d(trackingInfoHolder);
                c6964cnI.d(c7011coC.c());
                c6964cnI.c(b);
                c6964cnI.b(new InterfaceC4573bh() { // from class: o.cmZ
                    @Override // o.InterfaceC4573bh
                    public final void b(AbstractC3073as abstractC3073as, Object obj, float f, float f2, int i3, int i4) {
                        MyListEpoxyController.addGameModel$lambda$35$lambda$30(C7011coC.this, (C6964cnI) abstractC3073as, (AbstractC6960cnE.e) obj, f, f2, i3, i4);
                    }
                });
                c6964cnI.e(new View.OnClickListener() { // from class: o.cnb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyListEpoxyController.addGameModel$lambda$35$lambda$31(MyListEpoxyController.this, aVar, trackingInfoHolder, view);
                    }
                });
                c6964cnI.d(new View.OnClickListener() { // from class: o.cnc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyListEpoxyController.addGameModel$lambda$35$lambda$32(MyListEpoxyController.this, aVar, e, trackingInfoHolder, view);
                    }
                });
                c6964cnI.b(new View.OnClickListener() { // from class: o.cng
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyListEpoxyController.addGameModel$lambda$35$lambda$33(MyListEpoxyController.this, aVar, trackingInfoHolder, view);
                    }
                });
                c6964cnI.b(new InterfaceC4467bf() { // from class: o.cne
                    @Override // o.InterfaceC4467bf
                    public final void c(AbstractC3073as abstractC3073as, Object obj, int i3) {
                        MyListEpoxyController.addGameModel$lambda$35$lambda$34(Ref.BooleanRef.this, i, i2, this, (C6964cnI) abstractC3073as, (AbstractC6960cnE.e) obj, i3);
                    }
                });
                add(c6964cnI);
            }
        }
        str = null;
        c6964cnI.b(str);
        c6964cnI.b(e);
        c6964cnI.d(aVar.d());
        c6964cnI.d(trackingInfoHolder);
        c6964cnI.d(c7011coC.c());
        c6964cnI.c(b);
        c6964cnI.b(new InterfaceC4573bh() { // from class: o.cmZ
            @Override // o.InterfaceC4573bh
            public final void b(AbstractC3073as abstractC3073as, Object obj, float f, float f2, int i3, int i4) {
                MyListEpoxyController.addGameModel$lambda$35$lambda$30(C7011coC.this, (C6964cnI) abstractC3073as, (AbstractC6960cnE.e) obj, f, f2, i3, i4);
            }
        });
        c6964cnI.e(new View.OnClickListener() { // from class: o.cnb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyListEpoxyController.addGameModel$lambda$35$lambda$31(MyListEpoxyController.this, aVar, trackingInfoHolder, view);
            }
        });
        c6964cnI.d(new View.OnClickListener() { // from class: o.cnc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyListEpoxyController.addGameModel$lambda$35$lambda$32(MyListEpoxyController.this, aVar, e, trackingInfoHolder, view);
            }
        });
        c6964cnI.b(new View.OnClickListener() { // from class: o.cng
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyListEpoxyController.addGameModel$lambda$35$lambda$33(MyListEpoxyController.this, aVar, trackingInfoHolder, view);
            }
        });
        c6964cnI.b(new InterfaceC4467bf() { // from class: o.cne
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i3) {
                MyListEpoxyController.addGameModel$lambda$35$lambda$34(Ref.BooleanRef.this, i, i2, this, (C6964cnI) abstractC3073as, (AbstractC6960cnE.e) obj, i3);
            }
        });
        add(c6964cnI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addGameModel$lambda$35$lambda$30(C7011coC c7011coC, C6964cnI c6964cnI, AbstractC6960cnE.e eVar, float f, float f2, int i, int i2) {
        C8632dsu.c((Object) c7011coC, "");
        TrackingInfoHolder v = c6964cnI.v();
        if (f > 50.0f) {
            c7011coC.i().d(c6964cnI.l(), AppView.myListGallery, v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addGameModel$lambda$35$lambda$31(MyListEpoxyController myListEpoxyController, C6971cnP.a aVar, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) myListEpoxyController, "");
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        myListEpoxyController.emit(new AbstractC6996cno.h(aVar, trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addGameModel$lambda$35$lambda$32(MyListEpoxyController myListEpoxyController, C6971cnP.a aVar, boolean z, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) myListEpoxyController, "");
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        myListEpoxyController.emit(new AbstractC6996cno.a(aVar, z, trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addGameModel$lambda$35$lambda$33(MyListEpoxyController myListEpoxyController, C6971cnP.a aVar, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) myListEpoxyController, "");
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        myListEpoxyController.emit(new AbstractC6996cno.m(aVar, trackingInfoHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addGameModel$lambda$35$lambda$34(Ref.BooleanRef booleanRef, int i, int i2, MyListEpoxyController myListEpoxyController, C6964cnI c6964cnI, AbstractC6960cnE.e eVar, int i3) {
        C8632dsu.c((Object) booleanRef, "");
        C8632dsu.c((Object) myListEpoxyController, "");
        if (booleanRef.a) {
            booleanRef.a = false;
            if (i + 10 == i2) {
                myListEpoxyController.emit(AbstractC6996cno.b.b);
            }
        }
    }

    private final void emit(AbstractC6996cno abstractC6996cno) {
        this.eventBusFactory.b(AbstractC6996cno.class, abstractC6996cno);
    }

    private final void addFillingLoadingModel(long j) {
        String d2;
        String d3;
        String d4;
        for (int i = 0; i < 9; i++) {
            C3780bKj c3780bKj = new C3780bKj();
            c3780bKj.e((CharSequence) ("si-video-" + i));
            c3780bKj.e(C6956cnA.b.j);
            c3780bKj.e(true);
            C3787bKq c3787bKq = new C3787bKq();
            d2 = C6999cnr.d(i, 1);
            c3787bKq.b((CharSequence) d2);
            c3787bKq.d(true);
            c3787bKq.c(j);
            c3787bKq.a(BrowseExperience.e());
            c3780bKj.add(c3787bKq);
            C3787bKq c3787bKq2 = new C3787bKq();
            d3 = C6999cnr.d(i, 2);
            c3787bKq2.b((CharSequence) d3);
            c3787bKq2.d(true);
            c3787bKq2.c(j);
            c3787bKq2.a(BrowseExperience.e());
            c3780bKj.add(c3787bKq2);
            C3787bKq c3787bKq3 = new C3787bKq();
            d4 = C6999cnr.d(i, 3);
            c3787bKq3.b((CharSequence) d4);
            c3787bKq3.d(true);
            c3787bKq3.c(j);
            c3787bKq3.a(BrowseExperience.e());
            c3780bKj.add(c3787bKq3);
            add(c3780bKj);
        }
    }

    private final void addFillingErrorView() {
        bJK bjk = new bJK();
        bjk.d((CharSequence) "filler-top");
        add(bjk);
        bJM bjm = new bJM();
        bjm.b((CharSequence) "error-retry");
        bjm.c((CharSequence) C8168dfL.d(C9834xU.h.j));
        bjm.d((CharSequence) C8168dfL.d(C9834xU.h.f));
        bjm.a(new View.OnClickListener() { // from class: o.cnn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyListEpoxyController.addFillingErrorView$lambda$6$lambda$5(MyListEpoxyController.this, view);
            }
        });
        add(bjm);
        bJK bjk2 = new bJK();
        bjk2.d((CharSequence) "filler-bottom");
        add(bjk2);
    }
}
