package com.netflix.mediaclient.ui.home.impl;

import android.content.Context;
import android.os.Handler;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.epoxymodels.api.RowModel;
import com.netflix.mediaclient.ui.home.impl.HomeEpoxyController;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment;
import com.netflix.model.leafs.RecommendedTrailer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Ref;
import o.AbstractC3073as;
import o.AbstractC8918fl;
import o.C1045Mp;
import o.C1596aHd;
import o.C1729aMb;
import o.C2077aZ;
import o.C2808an;
import o.C4022bTi;
import o.C4049bUi;
import o.C4050bUj;
import o.C4061bUu;
import o.C4065bUy;
import o.C4082bVo;
import o.C8141del;
import o.C8187dfe;
import o.C8569dql;
import o.C8572dqo;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.C8927fu;
import o.C8932fz;
import o.C8971gl;
import o.C9935zP;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC2023aX;
import o.InterfaceC4414be;
import o.InterfaceC4467bf;
import o.InterfaceC5139btC;
import o.InterfaceC5143btG;
import o.InterfaceC5155btS;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.bIG;
import o.bKB;
import o.bKU;
import o.bLW;
import o.bSI;
import o.bSJ;
import o.bSM;
import o.bSY;
import o.bTX;
import o.bVV;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.drX;
import o.dsH;

/* loaded from: classes4.dex */
public abstract class HomeEpoxyController extends TypedEpoxyController<C4049bUi> {
    private static final String CATALOG_FILTERS = "catalogFilters";
    private static final String HOME_PAGE_GAMES_BILLBOARD_VALUE_PROP = "homepageBillboardGamesValueProp";
    private static final boolean delayLoading = false;
    private final Set<String> boundRows;
    private final LolomoMvRxFragment.d components;
    private final Map<LoMoType, C1729aMb> configCache;
    private final Context context;
    private final C1729aMb defaultConfig;
    private final bLW epoxyVideoAutoPlay;
    private final C4061bUu errorCreator;
    private final C9935zP eventBusFactory;
    private boolean exceptionSwallowedReported;
    private final C4065bUy gameCreator;
    private final bSY homeModelTracking;
    private final bTX lolomoEpoxyRecyclerView;
    private final List<AbstractC3073as<?>> modelsForDebug;
    private final drM<LoMo, dpR> onBindRow;
    private final drX<LoMo, Integer, dpR> onRowScrollStateChanged;
    private final bVV rowLoadingCreator;
    public static final a Companion = new a(null);
    private static final long delayLoadingMs = OnRampFragment.ARTIFICIAL_PERSONALIZATION_WAIT_TIME;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$7$lambda$5(int i, int i2, int i3) {
        return i;
    }

    public abstract boolean addEmptyRow(InterfaceC2023aX interfaceC2023aX, LoMo loMo, C1729aMb c1729aMb, C4049bUi c4049bUi, int i, InterfaceC5155btS interfaceC5155btS, TrackingInfoHolder trackingInfoHolder);

    public abstract void addLoadingState(InterfaceC2023aX interfaceC2023aX, LoMo loMo, int i, int i2, C1729aMb c1729aMb, drO<dpR> dro);

    public abstract void addTitle(InterfaceC2023aX interfaceC2023aX, LoMo loMo, C1729aMb c1729aMb, boolean z);

    public abstract void addVideo(InterfaceC2023aX interfaceC2023aX, C4049bUi c4049bUi, InterfaceC5155btS interfaceC5155btS, LoMo loMo, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, int i, C1729aMb c1729aMb, TrackingInfoHolder trackingInfoHolder, boolean z, List<Long> list);

    public void afterGroupModel(int i) {
    }

    public void beforeGroupModel(int i) {
    }

    public abstract C1729aMb buildConfig(Context context, LoMo loMo, String str);

    public abstract void buildHomeFooters(C4049bUi c4049bUi);

    public abstract void buildHomeHeaders(C4049bUi c4049bUi);

    public abstract void buildRowTitle(InterfaceC2023aX interfaceC2023aX, LoMo loMo, C1729aMb c1729aMb, C4049bUi c4049bUi, InterfaceC5155btS interfaceC5155btS, TrackingInfoHolder trackingInfoHolder);

    public final LolomoMvRxFragment.d getComponents() {
        return this.components;
    }

    public final Context getContext() {
        return this.context;
    }

    public final C1729aMb getDefaultConfig() {
        return this.defaultConfig;
    }

    protected final bLW getEpoxyVideoAutoPlay() {
        return this.epoxyVideoAutoPlay;
    }

    public final C9935zP getEventBusFactory() {
        return this.eventBusFactory;
    }

    public final C4065bUy getGameCreator() {
        return this.gameCreator;
    }

    public final bSY getHomeModelTracking() {
        return this.homeModelTracking;
    }

    public final bTX getLolomoEpoxyRecyclerView() {
        return this.lolomoEpoxyRecyclerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final drM<LoMo, dpR> getOnBindRow() {
        return this.onBindRow;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final drX<LoMo, Integer, dpR> getOnRowScrollStateChanged() {
        return this.onRowScrollStateChanged;
    }

    public int getRowLayoutId(LoMo loMo) {
        C8632dsu.c((Object) loMo, "");
        return C4022bTi.a.s;
    }

    public final bVV getRowLoadingCreator() {
        return this.rowLoadingCreator;
    }

    public int getStandardTitleLayoutId(int i, LoMo loMo) {
        C8632dsu.c((Object) loMo, "");
        return C4022bTi.a.H;
    }

    public boolean shouldCacheConfigs() {
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HomeEpoxyController(com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.d r41, android.content.Context r42, o.C9935zP r43, o.bSY r44, o.bLW r45, o.bTX r46, o.drX<? super com.netflix.mediaclient.servicemgr.interface_.LoMo, ? super java.lang.Integer, o.dpR> r47, o.drM<? super com.netflix.mediaclient.servicemgr.interface_.LoMo, o.dpR> r48) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.home.impl.HomeEpoxyController.<init>(com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$d, android.content.Context, o.zP, o.bSY, o.bLW, o.bTX, o.drX, o.drM):void");
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("HomeEpoxyController");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Handler d() {
            if (C8141del.a()) {
                return C2808an.b;
            }
            return C2808an.a();
        }
    }

    public final void onConfigChanged() {
        this.configCache.clear();
    }

    public static /* synthetic */ void addTitle$default(HomeEpoxyController homeEpoxyController, InterfaceC2023aX interfaceC2023aX, LoMo loMo, C1729aMb c1729aMb, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addTitle");
        }
        if ((i & 8) != 0) {
            z = false;
        }
        homeEpoxyController.addTitle(interfaceC2023aX, loMo, c1729aMb, z);
    }

    public boolean isFlatGallery(InterfaceC5155btS interfaceC5155btS) {
        C8632dsu.c((Object) interfaceC5155btS, "");
        return C4050bUj.e(interfaceC5155btS);
    }

    public static /* synthetic */ void addVideo$default(HomeEpoxyController homeEpoxyController, InterfaceC2023aX interfaceC2023aX, C4049bUi c4049bUi, InterfaceC5155btS interfaceC5155btS, LoMo loMo, InterfaceC5222bug interfaceC5222bug, int i, C1729aMb c1729aMb, TrackingInfoHolder trackingInfoHolder, boolean z, List list, int i2, Object obj) {
        List list2;
        List i3;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addVideo");
        }
        boolean z2 = (i2 & JSONzip.end) != 0 ? true : z;
        if ((i2 & 512) != 0) {
            i3 = C8569dql.i();
            list2 = i3;
        } else {
            list2 = list;
        }
        homeEpoxyController.addVideo(interfaceC2023aX, c4049bUi, interfaceC5155btS, loMo, interfaceC5222bug, i, c1729aMb, trackingInfoHolder, z2, list2);
    }

    public void addRowLoadingState(C4049bUi c4049bUi, InterfaceC2023aX interfaceC2023aX, LoMo loMo, C1729aMb c1729aMb, int i, String str, drO<dpR> dro) {
        int m;
        C8632dsu.c((Object) c4049bUi, "");
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) dro, "");
        if (c1729aMb.k() == 0) {
            m = (c1729aMb.o() * c1729aMb.m()) + c1729aMb.o();
        } else {
            m = c1729aMb.m() * 4;
        }
        bKB.d(interfaceC2023aX, new HomeEpoxyController$addRowLoadingState$1(loMo, c1729aMb, this, i, m, dro));
    }

    public static /* synthetic */ void addVideoRow$default(HomeEpoxyController homeEpoxyController, InterfaceC2023aX interfaceC2023aX, C4049bUi c4049bUi, InterfaceC5155btS interfaceC5155btS, LoMo loMo, List list, C1729aMb c1729aMb, TrackingInfoHolder trackingInfoHolder, boolean z, drO dro, drO dro2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addVideoRow");
        }
        homeEpoxyController.addVideoRow(interfaceC2023aX, c4049bUi, interfaceC5155btS, loMo, list, c1729aMb, trackingInfoHolder, (i & 128) != 0 ? false : z, dro, dro2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackingInfoHolder updateTrackingInfoHolder(LoMo loMo, TrackingInfoHolder trackingInfoHolder, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, int i) {
        boolean g;
        boolean g2;
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        String id = interfaceC5222bug.getVideo().getId();
        C8632dsu.a(id, "");
        g = C8691duz.g(id);
        if (g) {
            String a2 = loMo.getType().a();
            C8632dsu.a(a2, "");
            g2 = C8691duz.g(a2);
            String a3 = g2 ? "genre" : loMo.getType().a();
            int listPos = loMo.getListPos();
            String id2 = video.getId();
            String value = video.getType().getValue();
            String title = video.getTitle();
            InterfaceC1593aHa.c.a("Lolomo row=" + listPos + ", rank=" + i + ", type=" + a3 + ", video [id=" + id2 + ", type=" + value + ", title=" + title + "]");
        }
        if (loMo.getType() == LoMoType.CATEGORIES) {
            C8632dsu.d(video);
            return trackingInfoHolder.c((InterfaceC5143btG) video, i);
        }
        return trackingInfoHolder.e(video, i);
    }

    private final C1729aMb getConfig(LoMo loMo, String str) {
        C1729aMb c1729aMb = this.configCache.get(loMo.getType());
        if (c1729aMb == null) {
            c1729aMb = C1729aMb.b(buildConfig(this.context, loMo, str), 0, 0, 0.0f, 0, 0, 0, 0, 0, 0.0f, 0, null, false, false, false, 0, 0, 0, false, 0, null, 0, 0, true, 4194303, null);
            if (shouldCacheConfigs()) {
                this.configCache.put(loMo.getType(), c1729aMb);
            }
        }
        return c1729aMb;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(C4049bUi c4049bUi) {
        Object f;
        final int i;
        List<LoMo> list;
        final int i2;
        TrackingInfoHolder trackingInfoHolder;
        boolean z;
        TrackingInfoHolder trackingInfoHolder2;
        String title;
        boolean g;
        C8632dsu.c((Object) c4049bUi, "");
        buildHomeHeaders(c4049bUi);
        TrackingInfoHolder trackingInfoHolder3 = new TrackingInfoHolder(PlayLocationType.LOLOMO_ROW);
        List<LoMo> c = c4049bUi.r().c();
        boolean z2 = false;
        final int size = c != null ? c.size() : 0;
        AbstractC8918fl<InterfaceC5155btS> n = c4049bUi.n();
        if (n instanceof C8932fz) {
            addInitialLoadingShimmer(c4049bUi);
        } else if (n instanceof C8971gl) {
            C8971gl c8971gl = (C8971gl) n;
            InterfaceC5155btS interfaceC5155btS = (InterfaceC5155btS) c8971gl.c();
            TrackingInfoHolder b = trackingInfoHolder3.b((InterfaceC5155btS) c8971gl.c());
            final int numLoMos = interfaceC5155btS.getNumLoMos();
            AbstractC8918fl<List<LoMo>> r = c4049bUi.r();
            if ((r instanceof C8971gl) || (r instanceof C8932fz)) {
                List<LoMo> c2 = r.c();
                if (c2 != null) {
                    beforeGroupModel(0);
                    final int i3 = 0;
                    while (true) {
                        if (i3 >= numLoMos) {
                            break;
                        }
                        f = C8576dqs.f((List<? extends Object>) c2, i3);
                        final LoMo loMo = (LoMo) f;
                        if (loMo != null) {
                            if (loMo.getType() == LoMoType.GAME_FEATURE_EDUCATION) {
                                beforeGroupModel(loMo.getListPos());
                                this.gameCreator.a(this, loMo, b);
                                afterGroupModel(loMo.getListPos());
                                i = i3;
                                list = c2;
                                i2 = numLoMos;
                                trackingInfoHolder = b;
                                z = z2;
                            } else if (loMo.getLength() > 0) {
                                C1729aMb config = getConfig(loMo, c4049bUi.b());
                                if (config.q() && (title = loMo.getTitle()) != null) {
                                    g = C8691duz.g(title);
                                    if (!g && loMo.getType() != LoMoType.GALLERY && !isFlatGallery((InterfaceC5155btS) c8971gl.c())) {
                                        beforeGroupModel(loMo.getListPos());
                                        C4082bVo c4082bVo = new C4082bVo();
                                        c4082bVo.e((CharSequence) ("row-container-" + loMo.getListPos()));
                                        c4082bVo.b(C4022bTi.a.w);
                                        c4082bVo.b(loMo.getListPos() + "-" + loMo.getListContext() + "-" + loMo.getListId());
                                        i = i3;
                                        list = c2;
                                        i2 = numLoMos;
                                        trackingInfoHolder2 = b;
                                        buildRow$default(this, c4082bVo, loMo, config, c4049bUi, i3, interfaceC5155btS, b, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$buildModels$1$1
                                            /* JADX INFO: Access modifiers changed from: package-private */
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // o.drM
                                            public /* synthetic */ dpR invoke(Boolean bool) {
                                                b(bool.booleanValue());
                                                return dpR.c;
                                            }

                                            public final void b(boolean z3) {
                                                if (z3) {
                                                    HomeEpoxyController.this.getRowLoadingCreator().a(i3, numLoMos, size);
                                                }
                                            }
                                        }, null, JSONzip.end, null);
                                        c4082bVo.e(new InterfaceC4467bf() { // from class: o.bSw
                                            @Override // o.InterfaceC4467bf
                                            public final void c(AbstractC3073as abstractC3073as, Object obj, int i4) {
                                                HomeEpoxyController.buildModels$lambda$4$lambda$2(HomeEpoxyController.this, loMo, (C4082bVo) abstractC3073as, (C2077aZ) obj, i4);
                                            }
                                        });
                                        c4082bVo.d(new InterfaceC4414be() { // from class: o.bSy
                                            @Override // o.InterfaceC4414be
                                            public final void d(AbstractC3073as abstractC3073as, Object obj) {
                                                HomeEpoxyController.buildModels$lambda$4$lambda$3(HomeEpoxyController.this, loMo, (C4082bVo) abstractC3073as, (C2077aZ) obj);
                                            }
                                        });
                                        add(c4082bVo);
                                        afterGroupModel(loMo.getListPos());
                                        trackingInfoHolder = trackingInfoHolder2;
                                        z = false;
                                    }
                                }
                                i = i3;
                                list = c2;
                                i2 = numLoMos;
                                trackingInfoHolder2 = b;
                                final int i4 = size;
                                buildRow(this, loMo, config, c4049bUi, i, interfaceC5155btS, trackingInfoHolder2, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$buildModels$2
                                    /* JADX INFO: Access modifiers changed from: package-private */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // o.drM
                                    public /* synthetic */ dpR invoke(Boolean bool) {
                                        e(bool.booleanValue());
                                        return dpR.c;
                                    }

                                    public final void e(boolean z3) {
                                        Set set;
                                        if (z3) {
                                            HomeEpoxyController.this.getRowLoadingCreator().a(i, i2, i4);
                                        }
                                        set = HomeEpoxyController.this.boundRows;
                                        String listId = loMo.getListId();
                                        if (listId == null) {
                                            throw new IllegalArgumentException("Required value was null.".toString());
                                        }
                                        C8632dsu.a(listId, "");
                                        set.add(listId);
                                        HomeEpoxyController.this.getOnBindRow().invoke(loMo);
                                    }
                                }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$buildModels$3
                                    /* JADX INFO: Access modifiers changed from: package-private */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // o.drO
                                    public /* synthetic */ dpR invoke() {
                                        d();
                                        return dpR.c;
                                    }

                                    public final void d() {
                                        Set set;
                                        set = HomeEpoxyController.this.boundRows;
                                        dsH.b(set).remove(loMo.getListId());
                                    }
                                });
                                trackingInfoHolder = trackingInfoHolder2;
                                z = false;
                            } else {
                                i = i3;
                                list = c2;
                                i2 = numLoMos;
                                beforeGroupModel(loMo.getListPos());
                                trackingInfoHolder = b;
                                if (addEmptyRow(this, loMo, getConfig(loMo, c4049bUi.b()), c4049bUi, i, interfaceC5155btS, trackingInfoHolder.a(loMo))) {
                                    z = false;
                                } else {
                                    bKU bku = new bKU();
                                    bku.d((CharSequence) ("row-container-" + loMo.getListPos()));
                                    z = false;
                                    bku.a((Integer) 0);
                                    bku.b(new AbstractC3073as.b() { // from class: o.bSz
                                        @Override // o.AbstractC3073as.b
                                        public final int b(int i5, int i6, int i7) {
                                            int buildModels$lambda$7$lambda$5;
                                            buildModels$lambda$7$lambda$5 = HomeEpoxyController.buildModels$lambda$7$lambda$5(i5, i6, i7);
                                            return buildModels$lambda$7$lambda$5;
                                        }
                                    });
                                    bku.a(new InterfaceC4467bf() { // from class: o.bSv
                                        @Override // o.InterfaceC4467bf
                                        public final void c(AbstractC3073as abstractC3073as, Object obj, int i5) {
                                            HomeEpoxyController.buildModels$lambda$7$lambda$6(HomeEpoxyController.this, loMo, (bKU) abstractC3073as, (bIG) obj, i5);
                                        }
                                    });
                                    add(bku);
                                }
                                afterGroupModel(loMo.getListPos());
                            }
                            i3 = i + 1;
                            z2 = z;
                            b = trackingInfoHolder;
                            numLoMos = i2;
                            c2 = list;
                        } else {
                            addModelsForNotLoadedRow(c4049bUi, numLoMos, i3);
                            break;
                        }
                    }
                }
            } else if (r instanceof C8927fu) {
                errorLoadingLolomo(this, c4049bUi.b());
            }
        } else if (n instanceof C8927fu) {
            errorLoadingLolomo(this, c4049bUi.b());
        }
        buildHomeFooters(c4049bUi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$4$lambda$2(HomeEpoxyController homeEpoxyController, LoMo loMo, C4082bVo c4082bVo, C2077aZ c2077aZ, int i) {
        C8632dsu.c((Object) homeEpoxyController, "");
        Set<String> set = homeEpoxyController.boundRows;
        String listId = loMo.getListId();
        if (listId == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        C8632dsu.a(listId, "");
        set.add(listId);
        homeEpoxyController.onBindRow.invoke(loMo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$4$lambda$3(HomeEpoxyController homeEpoxyController, LoMo loMo, C4082bVo c4082bVo, C2077aZ c2077aZ) {
        C8632dsu.c((Object) homeEpoxyController, "");
        dsH.b(homeEpoxyController.boundRows).remove(loMo.getListId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$7$lambda$6(HomeEpoxyController homeEpoxyController, LoMo loMo, bKU bku, bIG big, int i) {
        C8632dsu.c((Object) homeEpoxyController, "");
        homeEpoxyController.onBindRow.invoke(loMo);
    }

    public void addModelsForNotLoadedRow(C4049bUi c4049bUi, int i, int i2) {
        C8632dsu.c((Object) c4049bUi, "");
        this.rowLoadingCreator.e(this, c4049bUi, i, i2, this.defaultConfig);
    }

    public void addInitialLoadingShimmer(C4049bUi c4049bUi) {
        C8632dsu.c((Object) c4049bUi, "");
        bSM.e.d(this.context, this, c4049bUi);
    }

    static /* synthetic */ void buildRow$default(HomeEpoxyController homeEpoxyController, InterfaceC2023aX interfaceC2023aX, LoMo loMo, C1729aMb c1729aMb, C4049bUi c4049bUi, int i, InterfaceC5155btS interfaceC5155btS, TrackingInfoHolder trackingInfoHolder, drM drm, drO dro, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildRow");
        }
        homeEpoxyController.buildRow(interfaceC2023aX, loMo, c1729aMb, c4049bUi, i, interfaceC5155btS, trackingInfoHolder, drm, (i2 & JSONzip.end) != 0 ? new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$buildRow$1
            public final void c() {
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }
        } : dro);
    }

    private final void buildRow(InterfaceC2023aX interfaceC2023aX, final LoMo loMo, C1729aMb c1729aMb, C4049bUi c4049bUi, int i, InterfaceC5155btS interfaceC5155btS, TrackingInfoHolder trackingInfoHolder, final drM<? super Boolean, dpR> drm, final drO<dpR> dro) {
        buildRowTitle(interfaceC2023aX, loMo, c1729aMb, c4049bUi, interfaceC5155btS, trackingInfoHolder.a(loMo));
        AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>> abstractC8918fl = c4049bUi.u().get(loMo.getId());
        if (abstractC8918fl == null) {
            addRowLoadingState(c4049bUi, interfaceC2023aX, loMo, c1729aMb, i, c4049bUi.b(), new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$buildRow$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    d();
                    return dpR.c;
                }

                public final void d() {
                    HomeEpoxyController.this.emit(new bSJ.j(loMo, 0, 2, null));
                }
            });
            return;
        }
        List<InterfaceC5222bug<? extends InterfaceC5223buh>> c = abstractC8918fl.c();
        if (c != null && !c.isEmpty()) {
            List<InterfaceC5222bug<? extends InterfaceC5223buh>> c2 = abstractC8918fl.c();
            if (c2 != null) {
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.a = true;
                addVideoRow(interfaceC2023aX, c4049bUi, interfaceC5155btS, loMo, c2, c1729aMb, trackingInfoHolder.a(loMo), abstractC8918fl instanceof C8927fu, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$buildRow$3
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
                        drm.invoke(Boolean.valueOf(booleanRef.a));
                        booleanRef.a = false;
                    }
                }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$buildRow$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        a();
                        return dpR.c;
                    }

                    public final void a() {
                        dro.invoke();
                    }
                });
            }
        } else if (abstractC8918fl instanceof C8932fz) {
            addRowLoadingState(c4049bUi, interfaceC2023aX, loMo, c1729aMb, i, c4049bUi.b(), new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.HomeEpoxyController$buildRow$5
                public final void d() {
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    d();
                    return dpR.c;
                }
            });
        } else if (abstractC8918fl instanceof C8927fu) {
            bKB.d(interfaceC2023aX, new HomeEpoxyController$buildRow$6(loMo, c1729aMb, i, this, trackingInfoHolder));
        }
    }

    protected void errorLoadingLolomo(InterfaceC2023aX interfaceC2023aX, String str) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        this.errorCreator.a(interfaceC2023aX, str);
    }

    public final void emit(final bSJ bsj) {
        C8632dsu.c((Object) bsj, "");
        if (delayLoading) {
            C8187dfe.a(new Runnable() { // from class: o.bSx
                @Override // java.lang.Runnable
                public final void run() {
                    HomeEpoxyController.emit$lambda$10(HomeEpoxyController.this, bsj);
                }
            }, delayLoadingMs);
        } else {
            this.eventBusFactory.b(bSJ.class, bsj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void emit$lambda$10(HomeEpoxyController homeEpoxyController, bSJ bsj) {
        C8632dsu.c((Object) homeEpoxyController, "");
        C8632dsu.c((Object) bsj, "");
        homeEpoxyController.eventBusFactory.b(bSJ.class, bsj);
    }

    @Override // o.AbstractC2914ap, o.InterfaceC2023aX
    public void add(AbstractC3073as<?> abstractC3073as) {
        C8632dsu.c((Object) abstractC3073as, "");
        super.add(abstractC3073as);
    }

    private final String toDebugString() {
        if (this.modelsForDebug != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("- start\n");
            toDebugString$default(this, this.modelsForDebug, sb, 0, 4, null);
            sb.append("\n- end\n");
            return sb.toString();
        }
        return null;
    }

    static /* synthetic */ void toDebugString$default(HomeEpoxyController homeEpoxyController, List list, StringBuilder sb, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toDebugString");
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        homeEpoxyController.toDebugString(list, sb, i);
    }

    @Override // o.AbstractC2914ap
    public void onExceptionSwallowed(RuntimeException runtimeException) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) runtimeException, "");
        if (C8141del.a()) {
            throw runtimeException;
        }
        if (this.exceptionSwallowedReported) {
            return;
        }
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        aVar.a("epoxy.swallowed:" + runtimeException);
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd("SPY-32864 - row epoxy issue", null, null, false, k, false, false, 96, null);
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
        InterfaceC1598aHf a2 = dVar.a();
        if (a2 != null) {
            a2.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
        this.exceptionSwallowedReported = true;
    }

    public final boolean isBound(LoMo loMo) {
        boolean b;
        C8632dsu.c((Object) loMo, "");
        b = C8576dqs.b((Iterable<? extends String>) this.boundRows, loMo.getListId());
        return b;
    }

    public void addVideoRow(InterfaceC2023aX interfaceC2023aX, C4049bUi c4049bUi, InterfaceC5155btS interfaceC5155btS, LoMo loMo, List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> list, C1729aMb c1729aMb, TrackingInfoHolder trackingInfoHolder, boolean z, drO<dpR> dro, drO<dpR> dro2) {
        int d;
        boolean g;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c4049bUi, "");
        C8632dsu.c((Object) interfaceC5155btS, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dro2, "");
        ArrayList<InterfaceC5222bug> arrayList = new ArrayList();
        for (Object obj : list) {
            InterfaceC5222bug interfaceC5222bug = (InterfaceC5222bug) obj;
            if (interfaceC5222bug.getVideo() instanceof InterfaceC5139btC) {
                InterfaceC5223buh video = interfaceC5222bug.getVideo();
                C8632dsu.d(video);
                if (((InterfaceC5139btC) video).l() != null) {
                    arrayList.add(obj);
                }
            }
        }
        d = C8572dqo.d(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(d);
        for (InterfaceC5222bug interfaceC5222bug2 : arrayList) {
            InterfaceC5223buh video2 = interfaceC5222bug2.getVideo();
            C8632dsu.d(video2);
            RecommendedTrailer l = ((InterfaceC5139btC) video2).l();
            C8632dsu.d(l);
            String supplementalVideoId = l.getSupplementalVideoId();
            g = C8691duz.g(supplementalVideoId);
            arrayList2.add(Long.valueOf(g ? 0L : Long.parseLong(supplementalVideoId)));
        }
        bKB.d(interfaceC2023aX, new HomeEpoxyController$addVideoRow$1(loMo, this, c1729aMb, list, trackingInfoHolder, z, c4049bUi, interfaceC5155btS, arrayList2, dro, dro2));
    }

    private final void toDebugString(List<? extends AbstractC3073as<?>> list, StringBuilder sb, int i) {
        String c;
        int i2 = i + 2;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC3073as abstractC3073as = (AbstractC3073as) it.next();
            sb.append("\n");
            c = bSI.c(i2);
            String simpleName = abstractC3073as.getClass().getSimpleName();
            int hashCode = abstractC3073as.hashCode();
            long b = abstractC3073as.b();
            sb.append(c + simpleName + "-" + hashCode + "-" + b);
            if (abstractC3073as instanceof RowModel) {
                toDebugString(((RowModel) abstractC3073as).n(), sb, i2);
            }
        }
    }
}
