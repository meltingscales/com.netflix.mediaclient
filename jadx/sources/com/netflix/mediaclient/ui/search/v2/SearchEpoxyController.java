package com.netflix.mediaclient.ui.search.v2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.DefaultGenreItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.lomo.LoMoUtils;
import com.netflix.mediaclient.ui.search.v2.SearchEpoxyController;
import com.netflix.model.leafs.CreatorHomeBanner;
import com.netflix.model.leafs.SearchPageEntity;
import com.netflix.model.leafs.SearchSectionSummary;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC3073as;
import o.AbstractC3179au;
import o.AbstractC6078cTd;
import o.AbstractC6094cTq;
import o.AbstractC6112cUh;
import o.AbstractC6115cUk;
import o.AbstractC6118cUn;
import o.AbstractC6120cUp;
import o.AbstractC6123cUs;
import o.AbstractC6124cUt;
import o.C1596aHd;
import o.C1867aRe;
import o.C1873aRk;
import o.C2376afA;
import o.C2755am;
import o.C3177aty;
import o.C3750bJg;
import o.C3751bJh;
import o.C4000bSn;
import o.C6035cRo;
import o.C6043cRw;
import o.C6089cTl;
import o.C6108cUd;
import o.C6110cUf;
import o.C6114cUj;
import o.C6116cUl;
import o.C6119cUo;
import o.C6125cUu;
import o.C6126cUv;
import o.C6129cUy;
import o.C6130cUz;
import o.C8140dek;
import o.C8153dex;
import o.C8569dql;
import o.C8572dqo;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;
import o.C8657dts;
import o.C8691duz;
import o.C9737vz;
import o.C9935zP;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC4255bb;
import o.InterfaceC4308bc;
import o.InterfaceC4467bf;
import o.InterfaceC4573bh;
import o.InterfaceC4732bk;
import o.InterfaceC5185btw;
import o.InterfaceC5278bvj;
import o.InterfaceC8612dsa;
import o.aQH;
import o.bNN;
import o.cRB;
import o.cRE;
import o.cRJ;
import o.cTZ;
import o.dpR;
import o.dqB;
import o.dqE;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class SearchEpoxyController extends TypedEpoxyController<C6089cTl> {
    public static final a Companion = new a(null);
    public static final int GRID_ITEM_COUNT_DEFAULT = 1;
    public static final int MAX_FULL_BOXARTS_IN_CAROUSEL = 2;
    private final b components;
    private final Context context;
    private final C9935zP eventBusFac;
    private final Map<Long, Boolean> loadedSectionMap;
    private String query;
    private RecyclerView recyclerView;
    private int requestedColumnNum;
    private Long requstId;
    private cRJ searchCLHelper;
    private boolean showHeader;
    private final cRE uiViewCallback;

    /* loaded from: classes4.dex */
    public interface b {
        bNN d();
    }

    /* loaded from: classes4.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[SearchUIComponents.values().length];
            try {
                iArr[SearchUIComponents.j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchUIComponents.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchUIComponents.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchUIComponents.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchUIComponents.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SearchUIComponents.d.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SearchUIComponents.c.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addCreatorHomeBanner$lambda$45$lambda$44(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addHeader$lambda$41$lambda$40$lambda$39(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addListWithNewPlayButton$lambda$53$lambda$52(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addPillModels$lambda$31$lambda$30$lambda$29$lambda$28$lambda$27(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addSuggestion$lambda$36$lambda$35$lambda$34$lambda$33$lambda$32(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addVideoCarouselModels$lambda$62$lambda$61$lambda$60(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$13$lambda$10$lambda$9$lambda$8(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$13$lambda$12$lambda$11(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$13$lambda$3$lambda$2(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$13$lambda$6$lambda$5(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$16$lambda$15(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createSearchCarouselModel$lambda$64$lambda$63(int i, int i2, int i3) {
        return i;
    }

    private final int getMaxItemsInRow() {
        return 41;
    }

    public final String getQuery() {
        return this.query;
    }

    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public final Long getRequstId() {
        return this.requstId;
    }

    public final cRJ getSearchCLHelper() {
        return this.searchCLHelper;
    }

    public final boolean getShowHeader() {
        return this.showHeader;
    }

    public final void setQuery(String str) {
        this.query = str;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public final void setRequstId(Long l) {
        this.requstId = l;
    }

    public final void setSearchCLHelper(cRJ crj) {
        this.searchCLHelper = crj;
    }

    public final void setShowHeader(boolean z) {
        this.showHeader = z;
    }

    public SearchEpoxyController(b bVar, cRE cre, C9935zP c9935zP, Context context) {
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) cre, "");
        C8632dsu.c((Object) context, "");
        this.components = bVar;
        this.uiViewCallback = cre;
        this.eventBusFac = c9935zP;
        this.context = context;
        this.loadedSectionMap = new LinkedHashMap();
        this.showHeader = true;
        this.requestedColumnNum = 1;
        addModelBuildListener(new InterfaceC4255bb() { // from class: o.cSB
            @Override // o.InterfaceC4255bb
            public final void b(C2755am c2755am) {
                SearchEpoxyController._init_$lambda$0(SearchEpoxyController.this, c2755am);
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SearchEpoxyController searchEpoxyController, C2755am c2755am) {
        C8632dsu.c((Object) searchEpoxyController, "");
        C8632dsu.c((Object) c2755am, "");
        searchEpoxyController.setGridSize(searchEpoxyController.requestedColumnNum);
    }

    @Override // o.AbstractC2914ap
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // o.AbstractC2914ap
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerView = null;
    }

    public final void resetLoadedSectionMap$netflix_modules_ui_search_impl_release() {
        this.loadedSectionMap.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(final C6089cTl c6089cTl) {
        Set<Integer> set;
        boolean e;
        List<? extends AbstractC3073as<?>> g;
        C8632dsu.c((Object) c6089cTl, "");
        int i = 0;
        for (Object obj : c6089cTl.h()) {
            if (i < 0) {
                C8569dql.h();
            }
            SearchSectionSummary searchSectionSummary = (SearchSectionSummary) obj;
            List<AbstractC3073as<?>> arrayList = new ArrayList<>();
            List<C6125cUu> arrayList2 = new ArrayList<>();
            TrackingInfoHolder e2 = new TrackingInfoHolder(PlayLocationType.SEARCH).e(searchSectionSummary, i);
            addHeader(searchSectionSummary);
            Set<Integer> linkedHashSet = new LinkedHashSet<>();
            String listType = searchSectionSummary.getListType();
            if (listType != null) {
                switch (c.b[SearchUIComponents.a.c(listType).ordinal()]) {
                    case 1:
                        set = linkedHashSet;
                        if (searchSectionSummary.getEntityTreatmentType() != null) {
                            e = C8691duz.e(searchSectionSummary.getEntityTreatmentType(), C3177aty.a.e().b(), false, 2, null);
                            if (e) {
                                addSuggestion(c6089cTl, searchSectionSummary, e2);
                                break;
                            }
                        }
                        addVideoListModels(c6089cTl, e2, searchSectionSummary);
                        break;
                    case 2:
                        set = linkedHashSet;
                        addCreatorHomeBanner(searchSectionSummary);
                        addVideoGalleryModels(c6089cTl, e2, searchSectionSummary);
                        if (!c6089cTl.d() && searchSectionSummary.getSuggestedNumOfVideos() != 0 && searchSectionSummary.getSuggestedNumOfVideos() < 12) {
                            C6129cUy c6129cUy = new C6129cUy();
                            c6129cUy.d((CharSequence) "see more");
                            c6129cUy.d(new View.OnClickListener() { // from class: o.cSH
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    SearchEpoxyController.buildModels$lambda$13$lambda$3$lambda$1(C6089cTl.this, this, view);
                                }
                            });
                            c6129cUy.b(new AbstractC3073as.b() { // from class: o.cST
                                @Override // o.AbstractC3073as.b
                                public final int b(int i2, int i3, int i4) {
                                    int buildModels$lambda$13$lambda$3$lambda$2;
                                    buildModels$lambda$13$lambda$3$lambda$2 = SearchEpoxyController.buildModels$lambda$13$lambda$3$lambda$2(i2, i3, i4);
                                    return buildModels$lambda$13$lambda$3$lambda$2;
                                }
                            });
                            add(c6129cUy);
                        }
                        set.add(Integer.valueOf(LoMoUtils.a(this.context)));
                        break;
                    case 3:
                    case 4:
                        set = linkedHashSet;
                        addVideoCarouselModels(c6089cTl, e2, searchSectionSummary, arrayList, i);
                        C3751bJh c3751bJh = new C3751bJh();
                        c3751bJh.c((CharSequence) ("carousel" + searchSectionSummary.getSectionId()));
                        c3751bJh.e(Carousel.Padding.a(4, 4, 4, 4, 8));
                        c3751bJh.d((List<? extends AbstractC3073as<?>>) arrayList);
                        c3751bJh.c(new InterfaceC4467bf() { // from class: o.cSU
                            @Override // o.InterfaceC4467bf
                            public final void c(AbstractC3073as abstractC3073as, Object obj2, int i2) {
                                SearchEpoxyController.buildModels$lambda$13$lambda$6$lambda$4(SearchEpoxyController.this, (C3751bJh) abstractC3073as, (C3750bJg) obj2, i2);
                            }
                        });
                        c3751bJh.e(new AbstractC3073as.b() { // from class: o.cSY
                            @Override // o.AbstractC3073as.b
                            public final int b(int i2, int i3, int i4) {
                                int buildModels$lambda$13$lambda$6$lambda$5;
                                buildModels$lambda$13$lambda$6$lambda$5 = SearchEpoxyController.buildModels$lambda$13$lambda$6$lambda$5(i2, i3, i4);
                                return buildModels$lambda$13$lambda$6$lambda$5;
                            }
                        });
                        add(c3751bJh);
                        break;
                    case 5:
                        float f = ResourcesCompat.getFloat(this.context.getResources(), C6035cRo.c.b);
                        int b2 = C4000bSn.b(this.context, LoMoType.STANDARD);
                        List gameIconModels$default = getGameIconModels$default(this, null, c6089cTl, searchSectionSummary, e2, this.context.getResources().getDisplayMetrics().widthPixels / f, i, b2, false, 129, null);
                        List<AbstractC3073as<?>> loadMoreGamesShimmer = getLoadMoreGamesShimmer(searchSectionSummary, i, c6089cTl, gameIconModels$default.size(), b2);
                        C3751bJh c3751bJh2 = new C3751bJh();
                        c3751bJh2.c((CharSequence) ("game_carousel" + searchSectionSummary.getSectionId()));
                        g = C8576dqs.g((Collection) gameIconModels$default, (Iterable) loadMoreGamesShimmer);
                        c3751bJh2.d(g);
                        c3751bJh2.c(new InterfaceC4467bf() { // from class: o.cTb
                            @Override // o.InterfaceC4467bf
                            public final void c(AbstractC3073as abstractC3073as, Object obj2, int i2) {
                                SearchEpoxyController.buildModels$lambda$13$lambda$10$lambda$9$lambda$7(SearchEpoxyController.this, (C3751bJh) abstractC3073as, (C3750bJg) obj2, i2);
                            }
                        });
                        c3751bJh2.e(new AbstractC3073as.b() { // from class: o.cTc
                            @Override // o.AbstractC3073as.b
                            public final int b(int i2, int i3, int i4) {
                                int buildModels$lambda$13$lambda$10$lambda$9$lambda$8;
                                buildModels$lambda$13$lambda$10$lambda$9$lambda$8 = SearchEpoxyController.buildModels$lambda$13$lambda$10$lambda$9$lambda$8(i2, i3, i4);
                                return buildModels$lambda$13$lambda$10$lambda$9$lambda$8;
                            }
                        });
                        c3751bJh2.e(Carousel.Padding.a(8, 0, 8, 0, 0));
                        c3751bJh2.b(f);
                        add(c3751bJh2);
                        set = linkedHashSet;
                        set.add(Integer.valueOf((int) f));
                        break;
                    case 6:
                        addSuggestion(c6089cTl, searchSectionSummary, e2);
                        set = linkedHashSet;
                        break;
                    case 7:
                        addPillModels(arrayList2, c6089cTl, searchSectionSummary, e2);
                        C3751bJh c3751bJh3 = new C3751bJh();
                        c3751bJh3.c((CharSequence) ("pill_carousel" + searchSectionSummary.getSectionId()));
                        c3751bJh3.d((List<? extends AbstractC3073as<?>>) arrayList2);
                        c3751bJh3.e(new AbstractC3073as.b() { // from class: o.cSZ
                            @Override // o.AbstractC3073as.b
                            public final int b(int i2, int i3, int i4) {
                                int buildModels$lambda$13$lambda$12$lambda$11;
                                buildModels$lambda$13$lambda$12$lambda$11 = SearchEpoxyController.buildModels$lambda$13$lambda$12$lambda$11(i2, i3, i4);
                                return buildModels$lambda$13$lambda$12$lambda$11;
                            }
                        });
                        add(c3751bJh3);
                        set = linkedHashSet;
                        break;
                    default:
                        set = linkedHashSet;
                        break;
                }
                updateRequestedColmnNum(set);
            }
            i++;
        }
        if (cRB.e(c6089cTl)) {
            C6114cUj c6114cUj = new C6114cUj();
            c6114cUj.e((CharSequence) "loading");
            c6114cUj.b(new InterfaceC4467bf() { // from class: o.cTa
                @Override // o.InterfaceC4467bf
                public final void c(AbstractC3073as abstractC3073as, Object obj2, int i2) {
                    SearchEpoxyController.buildModels$lambda$16$lambda$14(SearchEpoxyController.this, (C6114cUj) abstractC3073as, (AbstractC6115cUk.c) obj2, i2);
                }
            });
            c6114cUj.c(new AbstractC3073as.b() { // from class: o.cSw
                @Override // o.AbstractC3073as.b
                public final int b(int i2, int i3, int i4) {
                    int buildModels$lambda$16$lambda$15;
                    buildModels$lambda$16$lambda$15 = SearchEpoxyController.buildModels$lambda$16$lambda$15(i2, i3, i4);
                    return buildModels$lambda$16$lambda$15;
                }
            });
            add(c6114cUj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$13$lambda$3$lambda$1(C6089cTl c6089cTl, SearchEpoxyController searchEpoxyController, View view) {
        C6089cTl a2;
        C8632dsu.c((Object) c6089cTl, "");
        C8632dsu.c((Object) searchEpoxyController, "");
        a2 = c6089cTl.a((r27 & 1) != 0 ? c6089cTl.i : null, (r27 & 2) != 0 ? c6089cTl.b : true, (r27 & 4) != 0 ? c6089cTl.m : null, (r27 & 8) != 0 ? c6089cTl.f : null, (r27 & 16) != 0 ? c6089cTl.g : null, (r27 & 32) != 0 ? c6089cTl.h : null, (r27 & 64) != 0 ? c6089cTl.c : null, (r27 & 128) != 0 ? c6089cTl.e : null, (r27 & JSONzip.end) != 0 ? c6089cTl.j : null, (r27 & 512) != 0 ? c6089cTl.a : null, (r27 & 1024) != 0 ? c6089cTl.d : 0L);
        searchEpoxyController.setData(a2);
        searchEpoxyController.uiViewCallback.a(AbstractC6078cTd.n.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$13$lambda$6$lambda$4(SearchEpoxyController searchEpoxyController, C3751bJh c3751bJh, C3750bJg c3750bJg, int i) {
        C8632dsu.c((Object) searchEpoxyController, "");
        C8632dsu.d(c3750bJg);
        searchEpoxyController.resetCarouselToStartPosition(c3750bJg, c3751bJh.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$13$lambda$10$lambda$9$lambda$7(SearchEpoxyController searchEpoxyController, C3751bJh c3751bJh, C3750bJg c3750bJg, int i) {
        C8632dsu.c((Object) searchEpoxyController, "");
        C8632dsu.d(c3750bJg);
        searchEpoxyController.resetCarouselToStartPosition(c3750bJg, c3751bJh.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$16$lambda$14(SearchEpoxyController searchEpoxyController, C6114cUj c6114cUj, AbstractC6115cUk.c cVar, int i) {
        C8632dsu.c((Object) searchEpoxyController, "");
        searchEpoxyController.uiViewCallback.a(AbstractC6078cTd.r.e);
    }

    private final List<AbstractC3073as<?>> getLoadMoreGamesShimmer(SearchSectionSummary searchSectionSummary, final int i, C6089cTl c6089cTl, int i2, int i3) {
        C8654dtp g;
        int d;
        ArrayList arrayList = new ArrayList();
        Integer e = c6089cTl.e();
        if (e != null) {
            int intValue = e.intValue();
            if (C8632dsu.c((Object) searchSectionSummary.getPageKind(), (Object) "QuerySearch") && i == intValue && shouldLoad(c6089cTl)) {
                g = C8657dts.g(0, Math.min(getMaxItemsInRow() - i2, i3));
                d = C8572dqo.d(g, 10);
                ArrayList arrayList2 = new ArrayList(d);
                Iterator<Integer> it = g.iterator();
                while (it.hasNext()) {
                    int nextInt = ((dqB) it).nextInt();
                    bNN d2 = this.components.d();
                    String str = "game-icon-shimmer-" + nextInt;
                    Context context = this.context;
                    InterfaceC4467bf<AbstractC3073as<?>, AbstractC3179au> interfaceC4467bf = null;
                    final InterfaceC8612dsa<AbstractC3073as<?>, AbstractC3179au, Integer, dpR> interfaceC8612dsa = nextInt == 0 ? new InterfaceC8612dsa<AbstractC3073as<?>, AbstractC3179au, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.search.v2.SearchEpoxyController$getLoadMoreGamesShimmer$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // o.InterfaceC8612dsa
                        public /* synthetic */ dpR invoke(AbstractC3073as<?> abstractC3073as, AbstractC3179au abstractC3179au, Integer num) {
                            c(abstractC3073as, abstractC3179au, num.intValue());
                            return dpR.c;
                        }

                        public final void c(AbstractC3073as<?> abstractC3073as, AbstractC3179au abstractC3179au, int i4) {
                            C9935zP c9935zP;
                            c9935zP = SearchEpoxyController.this.eventBusFac;
                            if (c9935zP != null) {
                                c9935zP.b(AbstractC6078cTd.class, new AbstractC6078cTd.m(i));
                            }
                        }
                    } : null;
                    if (interfaceC8612dsa != null) {
                        interfaceC4467bf = new InterfaceC4467bf() { // from class: o.cSq
                            @Override // o.InterfaceC4467bf
                            public final void c(AbstractC3073as abstractC3073as, Object obj, int i4) {
                                SearchEpoxyController.getLoadMoreGamesShimmer$lambda$19$lambda$18$lambda$17(InterfaceC8612dsa.this, abstractC3073as, (AbstractC3179au) obj, i4);
                            }
                        };
                    }
                    arrayList2.add(Boolean.valueOf(arrayList.add(d2.a(str, context, interfaceC4467bf))));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLoadMoreGamesShimmer$lambda$19$lambda$18$lambda$17(InterfaceC8612dsa interfaceC8612dsa, AbstractC3073as abstractC3073as, AbstractC3179au abstractC3179au, int i) {
        interfaceC8612dsa.invoke(abstractC3073as, abstractC3179au, Integer.valueOf(i));
    }

    static /* synthetic */ List getGameIconModels$default(SearchEpoxyController searchEpoxyController, Integer num, C6089cTl c6089cTl, SearchSectionSummary searchSectionSummary, TrackingInfoHolder trackingInfoHolder, float f, int i, int i2, boolean z, int i3, Object obj) {
        return searchEpoxyController.getGameIconModels((i3 & 1) != 0 ? null : num, c6089cTl, searchSectionSummary, trackingInfoHolder, f, i, i2, (i3 & 128) != 0 ? false : z);
    }

    private final List<AbstractC3073as<?>> getGameIconModels(Integer num, final C6089cTl c6089cTl, SearchSectionSummary searchSectionSummary, TrackingInfoHolder trackingInfoHolder, float f, final int i, int i2, boolean z) {
        List<AbstractC3073as<?>> i3;
        int d;
        List<InterfaceC5185btw> list = c6089cTl.j().get(searchSectionSummary.getSectionId());
        if (list == null) {
            i3 = C8569dql.i();
            return i3;
        }
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        int i4 = 0;
        for (Object obj : list) {
            if (i4 < 0) {
                C8569dql.h();
            }
            final InterfaceC5185btw interfaceC5185btw = (InterfaceC5185btw) obj;
            final TrackingInfoHolder e = trackingInfoHolder.e(interfaceC5185btw, i4);
            InterfaceC4467bf interfaceC4467bf = (C8632dsu.c((Object) searchSectionSummary.getPageKind(), (Object) "QuerySearch") && i4 == list.size() + (-1) && list.size() % i2 == 0 && list.size() < getMaxItemsInRow()) ? new InterfaceC4467bf() { // from class: o.cSP
                @Override // o.InterfaceC4467bf
                public final void c(AbstractC3073as abstractC3073as, Object obj2, int i5) {
                    SearchEpoxyController.getGameIconModels$lambda$24$lambda$23$lambda$20(SearchEpoxyController.this, c6089cTl, i, abstractC3073as, (AbstractC3179au) obj2, i5);
                }
            } : null;
            bNN d2 = this.components.d();
            InterfaceC4732bk interfaceC4732bk = new InterfaceC4732bk() { // from class: o.cSR
                @Override // o.InterfaceC4732bk
                public final void b(AbstractC3073as abstractC3073as, Object obj2, int i5) {
                    SearchEpoxyController.getGameIconModels$lambda$24$lambda$23$lambda$21(TrackingInfoHolder.this, abstractC3073as, (AbstractC3179au) obj2, i5);
                }
            };
            int i5 = i4;
            arrayList.add(bNN.b.d(d2, interfaceC5185btw, num, i5, Integer.valueOf((int) f), AppView.boxArt, null, new View.OnClickListener() { // from class: o.cSQ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchEpoxyController.getGameIconModels$lambda$24$lambda$23$lambda$22(SearchEpoxyController.this, interfaceC5185btw, e, view);
                }
            }, e, interfaceC4732bk, interfaceC4467bf, z, null, 2080, null));
            i4++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getGameIconModels$lambda$24$lambda$23$lambda$20(SearchEpoxyController searchEpoxyController, C6089cTl c6089cTl, int i, AbstractC3073as abstractC3073as, AbstractC3179au abstractC3179au, int i2) {
        C6089cTl a2;
        C8632dsu.c((Object) searchEpoxyController, "");
        C8632dsu.c((Object) c6089cTl, "");
        a2 = c6089cTl.a((r27 & 1) != 0 ? c6089cTl.i : null, (r27 & 2) != 0 ? c6089cTl.b : false, (r27 & 4) != 0 ? c6089cTl.m : null, (r27 & 8) != 0 ? c6089cTl.f : null, (r27 & 16) != 0 ? c6089cTl.g : null, (r27 & 32) != 0 ? c6089cTl.h : null, (r27 & 64) != 0 ? c6089cTl.c : Integer.valueOf(i), (r27 & 128) != 0 ? c6089cTl.e : null, (r27 & JSONzip.end) != 0 ? c6089cTl.j : null, (r27 & 512) != 0 ? c6089cTl.a : null, (r27 & 1024) != 0 ? c6089cTl.d : 0L);
        searchEpoxyController.setData(a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getGameIconModels$lambda$24$lambda$23$lambda$21(TrackingInfoHolder trackingInfoHolder, AbstractC3073as abstractC3073as, AbstractC3179au abstractC3179au, int i) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        if (i == 5) {
            CLv2Utils.b(false, AppView.boxArt, trackingInfoHolder.c((JSONObject) null), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getGameIconModels$lambda$24$lambda$23$lambda$22(SearchEpoxyController searchEpoxyController, InterfaceC5185btw interfaceC5185btw, TrackingInfoHolder trackingInfoHolder, View view) {
        C8632dsu.c((Object) searchEpoxyController, "");
        C8632dsu.c((Object) interfaceC5185btw, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        cRE cre = searchEpoxyController.uiViewCallback;
        String id = interfaceC5185btw.getId();
        C8632dsu.a(id, "");
        String title = interfaceC5185btw.getTitle();
        C8632dsu.a(title, "");
        String boxshotUrl = interfaceC5185btw.getBoxshotUrl();
        cre.a(new AbstractC6078cTd.j(id, title, boxshotUrl == null ? "" : boxshotUrl, trackingInfoHolder, "search"));
    }

    private final void updateRequestedColmnNum(Set<Integer> set) {
        for (Number number : set) {
            int intValue = number.intValue();
            int i = this.requestedColumnNum;
            if (i % intValue > 0) {
                this.requestedColumnNum = i * intValue;
            }
        }
    }

    private final void addPillModels(List<C6125cUu> list, C6089cTl c6089cTl, SearchSectionSummary searchSectionSummary, TrackingInfoHolder trackingInfoHolder) {
        List<SearchPageEntity> list2 = c6089cTl.g().get(searchSectionSummary.getSectionId());
        if (list2 != null) {
            int i = 0;
            for (Object obj : list2) {
                if (i < 0) {
                    C8569dql.h();
                }
                SearchPageEntity searchPageEntity = (SearchPageEntity) obj;
                String videoId = searchPageEntity.getVideoId();
                if (videoId != null) {
                    final TrackingInfoHolder c2 = TrackingInfoHolder.c(trackingInfoHolder, searchPageEntity, i, false, null, 8, null);
                    String title = searchPageEntity.getTitle();
                    String entityType = searchPageEntity.getEntityType();
                    if (title != null && title.length() > 0 && entityType != null && entityType.length() > 0) {
                        C6125cUu c6125cUu = new C6125cUu();
                        c6125cUu.a((CharSequence) videoId);
                        C6125cUu d = c6125cUu.d(title);
                        String referenceId = searchSectionSummary.getReferenceId();
                        C8632dsu.a(referenceId, "");
                        d.a(createPillClickListener(videoId, entityType, title, c2, referenceId)).d(new InterfaceC4732bk() { // from class: o.cSy
                            @Override // o.InterfaceC4732bk
                            public final void b(AbstractC3073as abstractC3073as, Object obj2, int i2) {
                                SearchEpoxyController.addPillModels$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26(TrackingInfoHolder.this, (C6125cUu) abstractC3073as, (AbstractC6124cUt.b) obj2, i2);
                            }
                        });
                        c6125cUu.a(new AbstractC3073as.b() { // from class: o.cSx
                            @Override // o.AbstractC3073as.b
                            public final int b(int i2, int i3, int i4) {
                                int addPillModels$lambda$31$lambda$30$lambda$29$lambda$28$lambda$27;
                                addPillModels$lambda$31$lambda$30$lambda$29$lambda$28$lambda$27 = SearchEpoxyController.addPillModels$lambda$31$lambda$30$lambda$29$lambda$28$lambda$27(i2, i3, i4);
                                return addPillModels$lambda$31$lambda$30$lambda$29$lambda$28$lambda$27;
                            }
                        });
                        list.add(c6125cUu);
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addPillModels$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26(TrackingInfoHolder trackingInfoHolder, C6125cUu c6125cUu, AbstractC6124cUt.b bVar, int i) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        if (i == 5) {
            CLv2Utils.b(false, AppView.suggestionItem, trackingInfoHolder.c((JSONObject) null), null);
        }
    }

    private final void addSuggestion(C6089cTl c6089cTl, SearchSectionSummary searchSectionSummary, TrackingInfoHolder trackingInfoHolder) {
        String unifiedEntityId;
        Map d;
        Map k;
        Throwable th;
        List<SearchPageEntity> list = c6089cTl.g().get(searchSectionSummary.getSectionId());
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                if (i < 0) {
                    C8569dql.h();
                }
                SearchPageEntity searchPageEntity = (SearchPageEntity) obj;
                if (aQH.b.c() || C1867aRe.a.a() || C8153dex.Y() || C1873aRk.a.b()) {
                    unifiedEntityId = searchPageEntity.getUnifiedEntityId();
                } else {
                    unifiedEntityId = searchPageEntity.getVideoId();
                }
                String str = unifiedEntityId;
                if (str != null) {
                    TrackingInfoHolder c2 = TrackingInfoHolder.c(trackingInfoHolder, searchPageEntity, i, false, null, 8, null);
                    String title = searchPageEntity.getTitle();
                    String entityType = searchPageEntity.getEntityType();
                    if (title == null || title.length() == 0) {
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        d = dqE.d();
                        k = dqE.k(d);
                        C1596aHd c1596aHd = new C1596aHd("videoId is null or empty", null, null, true, k, false, false, 96, null);
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
                    } else {
                        C6130cUz c6130cUz = new C6130cUz();
                        c6130cUz.c((CharSequence) str);
                        c6130cUz.b(title);
                        c6130cUz.c(c6089cTl.a());
                        c6130cUz.a(AppView.suggestionItem);
                        c6130cUz.d(c2);
                        String referenceId = searchSectionSummary.getReferenceId();
                        C8632dsu.a(referenceId, "");
                        c6130cUz.c(createSearchSuggestionClickListener(str, entityType, title, c2, referenceId));
                        c6130cUz.e(searchPageEntity.getEnableTitleGroupTreatment());
                        c6130cUz.b(new AbstractC3073as.b() { // from class: o.cSS
                            @Override // o.AbstractC3073as.b
                            public final int b(int i2, int i3, int i4) {
                                int addSuggestion$lambda$36$lambda$35$lambda$34$lambda$33$lambda$32;
                                addSuggestion$lambda$36$lambda$35$lambda$34$lambda$33$lambda$32 = SearchEpoxyController.addSuggestion$lambda$36$lambda$35$lambda$34$lambda$33$lambda$32(i2, i3, i4);
                                return addSuggestion$lambda$36$lambda$35$lambda$34$lambda$33$lambda$32;
                            }
                        });
                        add(c6130cUz);
                    }
                }
                i++;
            }
        }
    }

    private final InterfaceC4308bc<C6125cUu, AbstractC6124cUt.b> createPillClickListener(final String str, final String str2, final String str3, final TrackingInfoHolder trackingInfoHolder, final String str4) {
        return new InterfaceC4308bc() { // from class: o.cSK
            @Override // o.InterfaceC4308bc
            public final void c(AbstractC3073as abstractC3073as, Object obj, View view, int i) {
                SearchEpoxyController.createPillClickListener$lambda$37(SearchEpoxyController.this, str, str2, str3, trackingInfoHolder, str4, (C6125cUu) abstractC3073as, (AbstractC6124cUt.b) obj, view, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createPillClickListener$lambda$37(SearchEpoxyController searchEpoxyController, String str, String str2, String str3, TrackingInfoHolder trackingInfoHolder, String str4, C6125cUu c6125cUu, AbstractC6124cUt.b bVar, View view, int i) {
        C8632dsu.c((Object) searchEpoxyController, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) str4, "");
        searchEpoxyController.uiViewCallback.a(new AbstractC6078cTd.w(str, str2, str3, trackingInfoHolder, str4));
    }

    private final InterfaceC4308bc<C6130cUz, AbstractC6123cUs.e> createSearchSuggestionClickListener(final String str, final String str2, final String str3, final TrackingInfoHolder trackingInfoHolder, final String str4) {
        return new InterfaceC4308bc() { // from class: o.cSL
            @Override // o.InterfaceC4308bc
            public final void c(AbstractC3073as abstractC3073as, Object obj, View view, int i) {
                SearchEpoxyController.createSearchSuggestionClickListener$lambda$38(SearchEpoxyController.this, str, str2, str3, trackingInfoHolder, str4, (C6130cUz) abstractC3073as, (AbstractC6123cUs.e) obj, view, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSearchSuggestionClickListener$lambda$38(SearchEpoxyController searchEpoxyController, String str, String str2, String str3, TrackingInfoHolder trackingInfoHolder, String str4, C6130cUz c6130cUz, AbstractC6123cUs.e eVar, View view, int i) {
        C8632dsu.c((Object) searchEpoxyController, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) str4, "");
        searchEpoxyController.uiViewCallback.a(new AbstractC6078cTd.w(str, str2, str3, trackingInfoHolder, str4));
    }

    private final void addHeader(SearchSectionSummary searchSectionSummary) {
        String displayString;
        if (C8632dsu.c((Object) searchSectionSummary.getListType(), (Object) "SearchHints") || C8632dsu.c((Object) searchSectionSummary.getPageKind(), (Object) "EntitySearch") || C8632dsu.c((Object) searchSectionSummary.getListType(), (Object) "PillCarousel") || (displayString = searchSectionSummary.getDisplayString()) == null) {
            return;
        }
        C6108cUd c6108cUd = new C6108cUd();
        c6108cUd.c((CharSequence) searchSectionSummary.getSectionId());
        c6108cUd.d(displayString);
        c6108cUd.b(searchSectionSummary.getSecondaryTitle());
        c6108cUd.e(searchSectionSummary.getPageKind());
        c6108cUd.a(searchSectionSummary.getListType());
        c6108cUd.d(new AbstractC3073as.b() { // from class: o.cSX
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int addHeader$lambda$41$lambda$40$lambda$39;
                addHeader$lambda$41$lambda$40$lambda$39 = SearchEpoxyController.addHeader$lambda$41$lambda$40$lambda$39(i, i2, i3);
                return addHeader$lambda$41$lambda$40$lambda$39;
            }
        });
        add(c6108cUd);
    }

    private final void addCreatorHomeBanner(SearchSectionSummary searchSectionSummary) {
        final CreatorHomeBanner creatorHomeBanner = searchSectionSummary.getCreatorHomeBanner();
        String url = creatorHomeBanner != null ? creatorHomeBanner.getUrl() : null;
        final String creatorHomeTitle = creatorHomeBanner != null ? creatorHomeBanner.getCreatorHomeTitle() : null;
        if (creatorHomeTitle == null) {
            creatorHomeTitle = "";
        }
        final String unifiedEntityId = creatorHomeBanner != null ? creatorHomeBanner.getUnifiedEntityId() : null;
        if (url == null || url.length() == 0) {
            return;
        }
        C6110cUf c6110cUf = new C6110cUf();
        c6110cUf.d((CharSequence) searchSectionSummary.getSectionId());
        c6110cUf.d(url);
        c6110cUf.c(searchSectionSummary.getDisplayString());
        c6110cUf.a(new InterfaceC4573bh() { // from class: o.cSD
            @Override // o.InterfaceC4573bh
            public final void b(AbstractC3073as abstractC3073as, Object obj, float f, float f2, int i, int i2) {
                SearchEpoxyController.addCreatorHomeBanner$lambda$45$lambda$42(CreatorHomeBanner.this, (C6110cUf) abstractC3073as, (cTZ.b) obj, f, f2, i, i2);
            }
        });
        if (ConfigFastPropertyFeatureControlConfig.Companion.B()) {
            String creatorHomeId = creatorHomeBanner.getCreatorHomeId();
            final String str = creatorHomeId != null ? creatorHomeId : "";
            c6110cUf.e(new InterfaceC4308bc() { // from class: o.cSE
                @Override // o.InterfaceC4308bc
                public final void c(AbstractC3073as abstractC3073as, Object obj, View view, int i) {
                    SearchEpoxyController.addCreatorHomeBanner$lambda$45$lambda$43(SearchEpoxyController.this, creatorHomeTitle, str, unifiedEntityId, (C6110cUf) abstractC3073as, (cTZ.b) obj, view, i);
                }
            });
        }
        c6110cUf.d(new AbstractC3073as.b() { // from class: o.cSF
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int addCreatorHomeBanner$lambda$45$lambda$44;
                addCreatorHomeBanner$lambda$45$lambda$44 = SearchEpoxyController.addCreatorHomeBanner$lambda$45$lambda$44(i, i2, i3);
                return addCreatorHomeBanner$lambda$45$lambda$44;
            }
        });
        add(c6110cUf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCreatorHomeBanner$lambda$45$lambda$42(CreatorHomeBanner creatorHomeBanner, C6110cUf c6110cUf, cTZ.b bVar, float f, float f2, int i, int i2) {
        if (f > 50.0f) {
            C6043cRw.b(creatorHomeBanner);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCreatorHomeBanner$lambda$45$lambda$43(SearchEpoxyController searchEpoxyController, String str, String str2, String str3, C6110cUf c6110cUf, cTZ.b bVar, View view, int i) {
        C8632dsu.c((Object) searchEpoxyController, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        HomeActivity.e((NetflixActivity) C9737vz.e(searchEpoxyController.context, NetflixActivity.class), new DefaultGenreItem(str, str2, GenreItem.GenreType.LOLOMO, str3, null));
    }

    private final InterfaceC4308bc<C6126cUv, AbstractC6120cUp.d> createPlayVideoClickListenerForNewPlayButton(final SearchSectionSummary searchSectionSummary, final TrackingInfoHolder trackingInfoHolder, final InterfaceC5278bvj interfaceC5278bvj, final int i) {
        return new InterfaceC4308bc() { // from class: o.cSA
            @Override // o.InterfaceC4308bc
            public final void c(AbstractC3073as abstractC3073as, Object obj, View view, int i2) {
                SearchEpoxyController.createPlayVideoClickListenerForNewPlayButton$lambda$46(SearchEpoxyController.this, searchSectionSummary, i, interfaceC5278bvj, trackingInfoHolder, (C6126cUv) abstractC3073as, (AbstractC6120cUp.d) obj, view, i2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createPlayVideoClickListenerForNewPlayButton$lambda$46(SearchEpoxyController searchEpoxyController, SearchSectionSummary searchSectionSummary, int i, InterfaceC5278bvj interfaceC5278bvj, TrackingInfoHolder trackingInfoHolder, C6126cUv c6126cUv, AbstractC6120cUp.d dVar, View view, int i2) {
        C8632dsu.c((Object) searchEpoxyController, "");
        C8632dsu.c((Object) searchSectionSummary, "");
        C8632dsu.c((Object) interfaceC5278bvj, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        searchEpoxyController.uiViewCallback.a(new AbstractC6078cTd.p(searchSectionSummary, i, interfaceC5278bvj, trackingInfoHolder));
    }

    private final InterfaceC4308bc<C6126cUv, AbstractC6120cUp.d> createListItemClickListenerForNewPlayButton(final SearchSectionSummary searchSectionSummary, final TrackingInfoHolder trackingInfoHolder, final InterfaceC5278bvj interfaceC5278bvj, final int i) {
        return new InterfaceC4308bc() { // from class: o.cSv
            @Override // o.InterfaceC4308bc
            public final void c(AbstractC3073as abstractC3073as, Object obj, View view, int i2) {
                SearchEpoxyController.createListItemClickListenerForNewPlayButton$lambda$47(TrackingInfoHolder.this, this, searchSectionSummary, i, interfaceC5278bvj, (C6126cUv) abstractC3073as, (AbstractC6120cUp.d) obj, view, i2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createListItemClickListenerForNewPlayButton$lambda$47(TrackingInfoHolder trackingInfoHolder, SearchEpoxyController searchEpoxyController, SearchSectionSummary searchSectionSummary, int i, InterfaceC5278bvj interfaceC5278bvj, C6126cUv c6126cUv, AbstractC6120cUp.d dVar, View view, int i2) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) searchEpoxyController, "");
        C8632dsu.c((Object) searchSectionSummary, "");
        C8632dsu.c((Object) interfaceC5278bvj, "");
        searchEpoxyController.uiViewCallback.a(new AbstractC6078cTd.z(searchSectionSummary, i, interfaceC5278bvj, trackingInfoHolder, TrackingInfoHolder.b(trackingInfoHolder, PlayLocationType.SEARCH, false, 2, null)));
    }

    private final InterfaceC4308bc<C6119cUo, AbstractC6118cUn.e> createGridItemClickListener(final SearchSectionSummary searchSectionSummary, final InterfaceC5278bvj interfaceC5278bvj, final TrackingInfoHolder trackingInfoHolder) {
        return new InterfaceC4308bc() { // from class: o.cSC
            @Override // o.InterfaceC4308bc
            public final void c(AbstractC3073as abstractC3073as, Object obj, View view, int i) {
                SearchEpoxyController.createGridItemClickListener$lambda$48(TrackingInfoHolder.this, this, searchSectionSummary, interfaceC5278bvj, (C6119cUo) abstractC3073as, (AbstractC6118cUn.e) obj, view, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createGridItemClickListener$lambda$48(TrackingInfoHolder trackingInfoHolder, SearchEpoxyController searchEpoxyController, SearchSectionSummary searchSectionSummary, InterfaceC5278bvj interfaceC5278bvj, C6119cUo c6119cUo, AbstractC6118cUn.e eVar, View view, int i) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) searchEpoxyController, "");
        C8632dsu.c((Object) searchSectionSummary, "");
        C8632dsu.c((Object) interfaceC5278bvj, "");
        searchEpoxyController.uiViewCallback.a(new AbstractC6078cTd.z(searchSectionSummary, i, interfaceC5278bvj, trackingInfoHolder, TrackingInfoHolder.b(trackingInfoHolder, PlayLocationType.SEARCH, false, 2, null)));
    }

    private final InterfaceC4308bc<C6116cUl, AbstractC6112cUh.d> createCarouselItemClickListener(final SearchSectionSummary searchSectionSummary, final InterfaceC5278bvj interfaceC5278bvj, final TrackingInfoHolder trackingInfoHolder) {
        return new InterfaceC4308bc() { // from class: o.cSV
            @Override // o.InterfaceC4308bc
            public final void c(AbstractC3073as abstractC3073as, Object obj, View view, int i) {
                SearchEpoxyController.createCarouselItemClickListener$lambda$49(TrackingInfoHolder.this, this, searchSectionSummary, interfaceC5278bvj, (C6116cUl) abstractC3073as, (AbstractC6112cUh.d) obj, view, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCarouselItemClickListener$lambda$49(TrackingInfoHolder trackingInfoHolder, SearchEpoxyController searchEpoxyController, SearchSectionSummary searchSectionSummary, InterfaceC5278bvj interfaceC5278bvj, C6116cUl c6116cUl, AbstractC6112cUh.d dVar, View view, int i) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) searchEpoxyController, "");
        C8632dsu.c((Object) searchSectionSummary, "");
        C8632dsu.c((Object) interfaceC5278bvj, "");
        searchEpoxyController.uiViewCallback.a(new AbstractC6078cTd.z(searchSectionSummary, i, interfaceC5278bvj, trackingInfoHolder, TrackingInfoHolder.b(trackingInfoHolder, PlayLocationType.SEARCH, false, 2, null)));
    }

    private final void addVideoListModels(C6089cTl c6089cTl, TrackingInfoHolder trackingInfoHolder, SearchSectionSummary searchSectionSummary) {
        String preQueryImgUrl;
        Map d;
        Map k;
        Throwable th;
        Map d2;
        Map k2;
        Throwable th2;
        Map d3;
        Map k3;
        Throwable th3;
        List<InterfaceC5278bvj> list = c6089cTl.i().get(searchSectionSummary.getSectionId());
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                if (i < 0) {
                    C8569dql.h();
                }
                InterfaceC5278bvj interfaceC5278bvj = (InterfaceC5278bvj) obj;
                SearchPageEntity searchPageEntity = c6089cTl.o().get(interfaceC5278bvj.getId());
                if (searchPageEntity != null) {
                    String id = interfaceC5278bvj.getId();
                    C8632dsu.a(id, "");
                    String title = interfaceC5278bvj.getTitle();
                    if (title == null) {
                        title = interfaceC5278bvj.aC_();
                    }
                    C2376afA.e a2 = c6089cTl.c().a(Integer.parseInt(id));
                    if (a2 == null || (preQueryImgUrl = a2.e()) == null) {
                        preQueryImgUrl = searchPageEntity.getPreQueryImgUrl();
                    }
                    TrackingInfoHolder c2 = trackingInfoHolder.c(searchPageEntity, i, true, a2 != null ? a2.c() : null);
                    if (id == null || id.length() == 0) {
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        d = dqE.d();
                        k = dqE.k(d);
                        C1596aHd c1596aHd = new C1596aHd("videoId is null or empty", null, null, true, k, false, false, 96, null);
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
                            Throwable th4 = c1596aHd.i;
                            if (th4 == null) {
                                th = new Throwable("Handled exception with no message");
                            } else if (th4 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            } else {
                                th = th4;
                            }
                        }
                        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a3 = dVar.a();
                        if (a3 != null) {
                            a3.e(c1596aHd, th);
                        } else {
                            dVar.e().b(c1596aHd, th);
                        }
                    } else if (title == null || title.length() == 0) {
                        InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                        String str = "title is null or empty for videoId: " + id;
                        d2 = dqE.d();
                        k2 = dqE.k(d2);
                        C1596aHd c1596aHd2 = new C1596aHd(str, null, null, true, k2, false, false, 96, null);
                        ErrorType errorType2 = c1596aHd2.a;
                        if (errorType2 != null) {
                            c1596aHd2.e.put("errorType", errorType2.c());
                            String b3 = c1596aHd2.b();
                            if (b3 != null) {
                                c1596aHd2.a(errorType2.c() + " " + b3);
                            }
                        }
                        if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                            th2 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                        } else if (c1596aHd2.b() != null) {
                            th2 = new Throwable(c1596aHd2.b());
                        } else {
                            Throwable th5 = c1596aHd2.i;
                            if (th5 == null) {
                                th2 = new Throwable("Handled exception with no message");
                            } else if (th5 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            } else {
                                th2 = th5;
                            }
                        }
                        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a4 = dVar2.a();
                        if (a4 != null) {
                            a4.e(c1596aHd2, th2);
                        } else {
                            dVar2.e().b(c1596aHd2, th2);
                        }
                    } else if (preQueryImgUrl == null || preQueryImgUrl.length() == 0) {
                        InterfaceC1598aHf.c cVar3 = InterfaceC1598aHf.a;
                        String str2 = "preQueryImg is null or empty for videoId: " + id;
                        d3 = dqE.d();
                        k3 = dqE.k(d3);
                        C1596aHd c1596aHd3 = new C1596aHd(str2, null, null, true, k3, false, false, 96, null);
                        ErrorType errorType3 = c1596aHd3.a;
                        if (errorType3 != null) {
                            c1596aHd3.e.put("errorType", errorType3.c());
                            String b4 = c1596aHd3.b();
                            if (b4 != null) {
                                c1596aHd3.a(errorType3.c() + " " + b4);
                            }
                        }
                        if (c1596aHd3.b() != null && c1596aHd3.i != null) {
                            th3 = new Throwable(c1596aHd3.b(), c1596aHd3.i);
                        } else if (c1596aHd3.b() != null) {
                            th3 = new Throwable(c1596aHd3.b());
                        } else {
                            Throwable th6 = c1596aHd3.i;
                            if (th6 == null) {
                                th3 = new Throwable("Handled exception with no message");
                            } else if (th6 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            } else {
                                th3 = th6;
                            }
                        }
                        InterfaceC1601aHi.d dVar3 = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a5 = dVar3.a();
                        if (a5 != null) {
                            a5.e(c1596aHd3, th3);
                        } else {
                            dVar3.e().b(c1596aHd3, th3);
                        }
                    } else {
                        C8632dsu.d((Object) title);
                        addListWithNewPlayButton(id, title, preQueryImgUrl, c2, searchSectionSummary, interfaceC5278bvj, i);
                    }
                }
                i++;
            }
        }
    }

    private final AppView getAppViewForGrid(SearchSectionSummary searchSectionSummary) {
        if (C8632dsu.c((Object) searchSectionSummary.getPageKind(), (Object) "PrequerySearch")) {
            return AppView.searchResults;
        }
        return AppView.boxArt;
    }

    private final void addVideoGalleryModels(C6089cTl c6089cTl, TrackingInfoHolder trackingInfoHolder, SearchSectionSummary searchSectionSummary) {
        TrackingInfoHolder b2;
        String boxshotUrl;
        String str;
        int i;
        Map d;
        Map k;
        Throwable th;
        Map d2;
        Map k2;
        Throwable th2;
        Map d3;
        Map k3;
        Throwable th3;
        String e;
        List<InterfaceC5278bvj> list = c6089cTl.i().get(searchSectionSummary.getSectionId());
        if (list != null) {
            boolean z = false;
            int i2 = 0;
            for (Object obj : list) {
                if (i2 < 0) {
                    C8569dql.h();
                }
                InterfaceC5278bvj interfaceC5278bvj = (InterfaceC5278bvj) obj;
                SearchPageEntity searchPageEntity = c6089cTl.o().get(interfaceC5278bvj.getId());
                String id = interfaceC5278bvj.getId();
                C8632dsu.a(id, "");
                C2376afA.e a2 = c6089cTl.c().a(Integer.parseInt(id));
                if (searchPageEntity != null) {
                    b2 = trackingInfoHolder.c(searchPageEntity, i2, z, a2 != null ? a2.c() : null);
                } else {
                    b2 = trackingInfoHolder.b(interfaceC5278bvj, a2 != null ? a2.c() : null, i2);
                }
                TrackingInfoHolder trackingInfoHolder2 = b2;
                String title = interfaceC5278bvj.getTitle();
                if (title == null) {
                    title = interfaceC5278bvj.aC_();
                }
                if (a2 == null || (e = a2.e()) == null) {
                    String imageUrl = searchPageEntity != null ? searchPageEntity.getImageUrl() : null;
                    if (imageUrl == null || imageUrl.length() == 0) {
                        boxshotUrl = interfaceC5278bvj.getBoxshotUrl();
                    } else if (searchPageEntity != null) {
                        boxshotUrl = searchPageEntity.getImageUrl();
                    } else {
                        str = null;
                    }
                    str = boxshotUrl;
                } else {
                    str = e;
                }
                if (id == null || id.length() == 0) {
                    i = i2;
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd("videoId is null or empty", null, null, true, k, false, false, 96, null);
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
                        Throwable th4 = c1596aHd.i;
                        if (th4 == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        } else {
                            th = th4;
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a3 = dVar.a();
                    if (a3 != null) {
                        a3.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                } else if (title == null || title.length() == 0) {
                    i = i2;
                    InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                    String str2 = "title is null or empty for videoId: " + id;
                    d2 = dqE.d();
                    k2 = dqE.k(d2);
                    C1596aHd c1596aHd2 = new C1596aHd(str2, null, null, true, k2, false, false, 96, null);
                    ErrorType errorType2 = c1596aHd2.a;
                    if (errorType2 != null) {
                        c1596aHd2.e.put("errorType", errorType2.c());
                        String b4 = c1596aHd2.b();
                        if (b4 != null) {
                            c1596aHd2.a(errorType2.c() + " " + b4);
                        }
                    }
                    if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                        th2 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                    } else if (c1596aHd2.b() != null) {
                        th2 = new Throwable(c1596aHd2.b());
                    } else {
                        Throwable th5 = c1596aHd2.i;
                        if (th5 == null) {
                            th2 = new Throwable("Handled exception with no message");
                        } else if (th5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        } else {
                            th2 = th5;
                        }
                    }
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a4 = dVar2.a();
                    if (a4 != null) {
                        a4.e(c1596aHd2, th2);
                    } else {
                        dVar2.e().b(c1596aHd2, th2);
                    }
                } else if (str == null || str.length() == 0) {
                    i = i2;
                    InterfaceC1598aHf.c cVar3 = InterfaceC1598aHf.a;
                    String str3 = "boxshortUrl is null or empty for videoId: " + id;
                    d3 = dqE.d();
                    k3 = dqE.k(d3);
                    C1596aHd c1596aHd3 = new C1596aHd(str3, null, null, true, k3, false, false, 96, null);
                    ErrorType errorType3 = c1596aHd3.a;
                    if (errorType3 != null) {
                        c1596aHd3.e.put("errorType", errorType3.c());
                        String b5 = c1596aHd3.b();
                        if (b5 != null) {
                            c1596aHd3.a(errorType3.c() + " " + b5);
                        }
                    }
                    if (c1596aHd3.b() != null && c1596aHd3.i != null) {
                        th3 = new Throwable(c1596aHd3.b(), c1596aHd3.i);
                    } else if (c1596aHd3.b() != null) {
                        th3 = new Throwable(c1596aHd3.b());
                    } else {
                        Throwable th6 = c1596aHd3.i;
                        if (th6 == null) {
                            th3 = new Throwable("Handled exception with no message");
                        } else if (th6 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        } else {
                            th3 = th6;
                        }
                    }
                    InterfaceC1601aHi.d dVar3 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a5 = dVar3.a();
                    if (a5 != null) {
                        a5.e(c1596aHd3, th3);
                    } else {
                        dVar3.e().b(c1596aHd3, th3);
                    }
                } else {
                    AppView appViewForGrid = getAppViewForGrid(searchSectionSummary);
                    if (!c6089cTl.d()) {
                        if (searchSectionSummary.getSuggestedNumOfVideos() == 0 || (searchSectionSummary.getSuggestedNumOfVideos() != 0 && i2 < searchSectionSummary.getSuggestedNumOfVideos())) {
                            C8632dsu.d((Object) title);
                            i = i2;
                            addSearchGridModel(c6089cTl, id, title, i2, str, searchSectionSummary, trackingInfoHolder2, appViewForGrid, interfaceC5278bvj, list.size(), interfaceC5278bvj.isAvailableToPlay());
                        } else {
                            i = i2;
                        }
                    } else {
                        i = i2;
                        if (c6089cTl.d() && i < 12) {
                            C8632dsu.d((Object) title);
                            addSearchGridModel(c6089cTl, id, title, i, str, searchSectionSummary, trackingInfoHolder2, appViewForGrid, interfaceC5278bvj, list.size(), interfaceC5278bvj.isAvailableToPlay());
                        }
                    }
                }
                i2 = i + 1;
                z = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSearchGridModel$lambda$57$lambda$55(SearchEpoxyController searchEpoxyController, C6089cTl c6089cTl, int i, InterfaceC5278bvj interfaceC5278bvj, SearchSectionSummary searchSectionSummary, int i2, C6119cUo c6119cUo, AbstractC6118cUn.e eVar, int i3) {
        C8632dsu.c((Object) searchEpoxyController, "");
        C8632dsu.c((Object) c6089cTl, "");
        C8632dsu.c((Object) interfaceC5278bvj, "");
        C8632dsu.c((Object) searchSectionSummary, "");
        searchEpoxyController.onBindSearchGrid(c6089cTl, i, interfaceC5278bvj, searchSectionSummary, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSearchGridModel$lambda$57$lambda$56(SearchSectionSummary searchSectionSummary, TrackingInfoHolder trackingInfoHolder, C6119cUo c6119cUo, AbstractC6118cUn.e eVar, int i) {
        C8632dsu.c((Object) searchSectionSummary, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        if (i == 5) {
            if (C8632dsu.c((Object) searchSectionSummary.getPageKind(), (Object) "PrequerySearch")) {
                CLv2Utils.b(false, AppView.searchResults, trackingInfoHolder.c((JSONObject) null), null);
            } else {
                CLv2Utils.b(false, AppView.boxArt, trackingInfoHolder.c((JSONObject) null), null);
            }
        }
    }

    private final void onBindSearchGrid(C6089cTl c6089cTl, int i, InterfaceC5278bvj interfaceC5278bvj, SearchSectionSummary searchSectionSummary, int i2) {
        C9935zP c9935zP;
        List<InterfaceC5278bvj> list = c6089cTl.i().get(searchSectionSummary.getSectionId());
        if (list != null && (!list.isEmpty()) && i == 0) {
            this.uiViewCallback.a(new AbstractC6078cTd.q(list));
        }
        if (!shouldFetchMoreForGallery(searchSectionSummary, i, C4000bSn.b(this.context, LoMoType.STANDARD), i2) || (c9935zP = this.eventBusFac) == null) {
            return;
        }
        c9935zP.b(AbstractC6078cTd.class, new AbstractC6078cTd.i(searchSectionSummary.getListPos()));
    }

    private final boolean shouldFetchMoreForGallery(SearchSectionSummary searchSectionSummary, int i, int i2, int i3) {
        return C8632dsu.c((Object) searchSectionSummary.getPageKind(), (Object) "QuerySearch") && (i + 1) % i2 == 0 && i3 < 50;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r35v0, types: [java.util.List<o.as<?>>, java.util.List] */
    private final void addVideoCarouselModels(C6089cTl c6089cTl, TrackingInfoHolder trackingInfoHolder, SearchSectionSummary searchSectionSummary, List<AbstractC3073as<?>> list, int i) {
        int i2;
        boolean z;
        List<InterfaceC5278bvj> list2;
        boolean z2;
        String boxshotUrl;
        Map d;
        Map k;
        Throwable th;
        Map d2;
        Map k2;
        Throwable th2;
        Map d3;
        Map k3;
        Throwable th3;
        List<InterfaceC5278bvj> list3 = c6089cTl.i().get(searchSectionSummary.getSectionId());
        boolean z3 = true;
        if (list3 != null && (!list3.isEmpty())) {
            this.uiViewCallback.a(new AbstractC6078cTd.q(list3));
        }
        int b2 = C4000bSn.b(this.context, LoMoType.STANDARD);
        boolean z4 = false;
        if (list3 != null) {
            int i3 = 0;
            for (Object obj : list3) {
                if (i3 < 0) {
                    C8569dql.h();
                }
                InterfaceC5278bvj interfaceC5278bvj = (InterfaceC5278bvj) obj;
                SearchPageEntity searchPageEntity = c6089cTl.o().get(interfaceC5278bvj.getId());
                if (searchPageEntity != null) {
                    String id = interfaceC5278bvj.getId();
                    C8632dsu.a(id, "");
                    String title = interfaceC5278bvj.getTitle();
                    if (title == null) {
                        title = interfaceC5278bvj.aC_();
                    }
                    C2376afA.e a2 = c6089cTl.c().a(Integer.parseInt(id));
                    if (a2 == null || (boxshotUrl = a2.e()) == null) {
                        boxshotUrl = searchPageEntity.getImageUrl() == null ? interfaceC5278bvj.getBoxshotUrl() : searchPageEntity.getImageUrl();
                    }
                    TrackingInfoHolder c2 = trackingInfoHolder.c(searchPageEntity, i3, z4, a2 != null ? a2.c() : null);
                    if (id == null || id.length() == 0) {
                        i2 = i3;
                        z = z4;
                        list2 = list3;
                        z2 = z3;
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        d = dqE.d();
                        k = dqE.k(d);
                        C1596aHd c1596aHd = new C1596aHd("videoId is null or empty", null, null, true, k, false, false, 96, null);
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
                            Throwable th4 = c1596aHd.i;
                            if (th4 == null) {
                                th = new Throwable("Handled exception with no message");
                            } else if (th4 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            } else {
                                th = th4;
                            }
                        }
                        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a3 = dVar.a();
                        if (a3 != null) {
                            a3.e(c1596aHd, th);
                        } else {
                            dVar.e().b(c1596aHd, th);
                        }
                    } else if (title == null || title.length() == 0) {
                        i2 = i3;
                        z = z4;
                        list2 = list3;
                        z2 = z3;
                        InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                        String str = "title is null or empty for videoId: " + id;
                        d2 = dqE.d();
                        k2 = dqE.k(d2);
                        C1596aHd c1596aHd2 = new C1596aHd(str, null, null, true, k2, false, false, 96, null);
                        ErrorType errorType2 = c1596aHd2.a;
                        if (errorType2 != null) {
                            c1596aHd2.e.put("errorType", errorType2.c());
                            String b4 = c1596aHd2.b();
                            if (b4 != null) {
                                c1596aHd2.a(errorType2.c() + " " + b4);
                            }
                        }
                        if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                            th2 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                        } else if (c1596aHd2.b() != null) {
                            th2 = new Throwable(c1596aHd2.b());
                        } else {
                            Throwable th5 = c1596aHd2.i;
                            if (th5 == null) {
                                th2 = new Throwable("Handled exception with no message");
                            } else if (th5 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            } else {
                                th2 = th5;
                            }
                        }
                        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a4 = dVar2.a();
                        if (a4 != null) {
                            a4.e(c1596aHd2, th2);
                        } else {
                            dVar2.e().b(c1596aHd2, th2);
                        }
                    } else if (boxshotUrl == null || boxshotUrl.length() == 0) {
                        i2 = i3;
                        z = z4;
                        list2 = list3;
                        z2 = z3;
                        InterfaceC1598aHf.c cVar3 = InterfaceC1598aHf.a;
                        String str2 = "boxshotUrl is null or empty for videoId: " + id;
                        d3 = dqE.d();
                        k3 = dqE.k(d3);
                        C1596aHd c1596aHd3 = new C1596aHd(str2, null, null, true, k3, false, false, 96, null);
                        ErrorType errorType3 = c1596aHd3.a;
                        if (errorType3 != null) {
                            c1596aHd3.e.put("errorType", errorType3.c());
                            String b5 = c1596aHd3.b();
                            if (b5 != null) {
                                c1596aHd3.a(errorType3.c() + " " + b5);
                            }
                        }
                        if (c1596aHd3.b() != null && c1596aHd3.i != null) {
                            th3 = new Throwable(c1596aHd3.b(), c1596aHd3.i);
                        } else if (c1596aHd3.b() != null) {
                            th3 = new Throwable(c1596aHd3.b());
                        } else {
                            Throwable th6 = c1596aHd3.i;
                            if (th6 == null) {
                                th3 = new Throwable("Handled exception with no message");
                            } else if (th6 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            } else {
                                th3 = th6;
                            }
                        }
                        InterfaceC1601aHi.d dVar3 = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a5 = dVar3.a();
                        if (a5 != null) {
                            a5.e(c1596aHd3, th3);
                        } else {
                            dVar3.e().b(c1596aHd3, th3);
                        }
                    } else {
                        int size = list3.size();
                        i2 = i3;
                        z = z4;
                        list2 = list3;
                        z2 = z3;
                        list.add(createSearchCarouselModel(id, title, i3, boxshotUrl, searchSectionSummary, i, c2, interfaceC5278bvj, b2, size, c6089cTl));
                    }
                } else {
                    i2 = i3;
                    z = z4;
                    list2 = list3;
                    z2 = z3;
                }
                i3 = i2 + 1;
                z3 = z2;
                list3 = list2;
                z4 = z;
            }
        }
        boolean z5 = z4;
        boolean z6 = z3;
        Integer e = c6089cTl.e();
        if (e != null) {
            int intValue = e.intValue();
            if (C8632dsu.c((Object) searchSectionSummary.getPageKind(), (Object) "QuerySearch") && i == intValue && shouldLoad(c6089cTl)) {
                int i4 = z5;
                while (i4 < 3) {
                    C6116cUl c6116cUl = new C6116cUl();
                    c6116cUl.a((CharSequence) ("loading " + i4));
                    c6116cUl.f(z6);
                    c6116cUl.i(i);
                    c6116cUl.b(this.eventBusFac);
                    c6116cUl.g(i4 == 0 ? z6 : z5);
                    c6116cUl.a(searchSectionSummary.getPageKind());
                    c6116cUl.a(new AbstractC3073as.b() { // from class: o.cSW
                        @Override // o.AbstractC3073as.b
                        public final int b(int i5, int i6, int i7) {
                            int addVideoCarouselModels$lambda$62$lambda$61$lambda$60;
                            addVideoCarouselModels$lambda$62$lambda$61$lambda$60 = SearchEpoxyController.addVideoCarouselModels$lambda$62$lambda$61$lambda$60(i5, i6, i7);
                            return addVideoCarouselModels$lambda$62$lambda$61$lambda$60;
                        }
                    });
                    c6116cUl.c(C4000bSn.e(this.context));
                    list.add(c6116cUl);
                    i4++;
                }
            }
        }
    }

    private final boolean shouldLoad(C6089cTl c6089cTl) {
        return !(c6089cTl.f() instanceof AbstractC6094cTq.c);
    }

    private final AbstractC3073as<?> createSearchCarouselModel(String str, String str2, int i, String str3, final SearchSectionSummary searchSectionSummary, final int i2, final TrackingInfoHolder trackingInfoHolder, InterfaceC5278bvj interfaceC5278bvj, final int i3, final int i4, final C6089cTl c6089cTl) {
        C6116cUl c6116cUl = new C6116cUl();
        c6116cUl.a((CharSequence) str);
        c6116cUl.f(str);
        c6116cUl.j(str2);
        c6116cUl.e(C8140dek.a.d(this.context, interfaceC5278bvj));
        c6116cUl.c(str3);
        c6116cUl.a(searchSectionSummary.getPageKind());
        c6116cUl.b(this.eventBusFac);
        c6116cUl.i(i2);
        c6116cUl.e(interfaceC5278bvj.isAvailableToPlay());
        c6116cUl.h(i <= 2);
        c6116cUl.a(new AbstractC3073as.b() { // from class: o.cSI
            @Override // o.AbstractC3073as.b
            public final int b(int i5, int i6, int i7) {
                int createSearchCarouselModel$lambda$64$lambda$63;
                createSearchCarouselModel$lambda$64$lambda$63 = SearchEpoxyController.createSearchCarouselModel$lambda$64$lambda$63(i5, i6, i7);
                return createSearchCarouselModel$lambda$64$lambda$63;
            }
        });
        c6116cUl.c(C4000bSn.e(this.context));
        C6116cUl b2 = c6116cUl.d(createCarouselItemClickListener(searchSectionSummary, interfaceC5278bvj, trackingInfoHolder)).d(new InterfaceC4732bk() { // from class: o.cSJ
            @Override // o.InterfaceC4732bk
            public final void b(AbstractC3073as abstractC3073as, Object obj, int i5) {
                SearchEpoxyController.createSearchCarouselModel$lambda$65(SearchSectionSummary.this, trackingInfoHolder, (C6116cUl) abstractC3073as, (AbstractC6112cUh.d) obj, i5);
            }
        }).b(new InterfaceC4467bf() { // from class: o.cSG
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i5) {
                SearchEpoxyController.createSearchCarouselModel$lambda$66(SearchSectionSummary.this, i4, i3, this, c6089cTl, i2, (C6116cUl) abstractC3073as, (AbstractC6112cUh.d) obj, i5);
            }
        });
        C8632dsu.a(b2, "");
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSearchCarouselModel$lambda$65(SearchSectionSummary searchSectionSummary, TrackingInfoHolder trackingInfoHolder, C6116cUl c6116cUl, AbstractC6112cUh.d dVar, int i) {
        C8632dsu.c((Object) searchSectionSummary, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        if (i == 5) {
            if (C8632dsu.c((Object) searchSectionSummary.getPageKind(), (Object) "PrequerySearch")) {
                CLv2Utils.b(false, AppView.searchResults, trackingInfoHolder.c((JSONObject) null), null);
            } else {
                CLv2Utils.b(false, AppView.boxArt, trackingInfoHolder.c((JSONObject) null), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSearchCarouselModel$lambda$66(SearchSectionSummary searchSectionSummary, int i, int i2, SearchEpoxyController searchEpoxyController, C6089cTl c6089cTl, int i3, C6116cUl c6116cUl, AbstractC6112cUh.d dVar, int i4) {
        C6089cTl a2;
        C8632dsu.c((Object) searchSectionSummary, "");
        C8632dsu.c((Object) searchEpoxyController, "");
        C8632dsu.c((Object) c6089cTl, "");
        if (C8632dsu.c((Object) searchSectionSummary.getPageKind(), (Object) "QuerySearch") && i4 == i - 1 && (i4 + 1) % i2 == 0 && i < searchEpoxyController.getMaxItemsInRow()) {
            a2 = c6089cTl.a((r27 & 1) != 0 ? c6089cTl.i : null, (r27 & 2) != 0 ? c6089cTl.b : false, (r27 & 4) != 0 ? c6089cTl.m : null, (r27 & 8) != 0 ? c6089cTl.f : null, (r27 & 16) != 0 ? c6089cTl.g : null, (r27 & 32) != 0 ? c6089cTl.h : null, (r27 & 64) != 0 ? c6089cTl.c : Integer.valueOf(i3), (r27 & 128) != 0 ? c6089cTl.e : null, (r27 & JSONzip.end) != 0 ? c6089cTl.j : null, (r27 & 512) != 0 ? c6089cTl.a : null, (r27 & 1024) != 0 ? c6089cTl.d : 0L);
            searchEpoxyController.setData(a2);
        }
    }

    private final void setGridSize(int i) {
        GridLayoutManager gridLayoutManager;
        if (i != getSpanCount()) {
            RecyclerView recyclerView = this.recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    C8632dsu.d(layoutManager);
                    gridLayoutManager = (GridLayoutManager) layoutManager;
                } else {
                    gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), i, 1, false);
                }
                gridLayoutManager.setSpanCount(i);
                gridLayoutManager.setSpanSizeLookup(getSpanSizeLookup());
            }
            setSpanCount(i);
        }
    }

    private final void resetCarouselToStartPosition(final C3750bJg c3750bJg, long j) {
        Map<Long, Boolean> map = this.loadedSectionMap;
        Long valueOf = Long.valueOf(j);
        if (map.get(valueOf) == null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.cSN
                @Override // java.lang.Runnable
                public final void run() {
                    SearchEpoxyController.resetCarouselToStartPosition$lambda$70$lambda$69(C3750bJg.this);
                }
            });
            map.put(valueOf, Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetCarouselToStartPosition$lambda$70$lambda$69(C3750bJg c3750bJg) {
        C8632dsu.c((Object) c3750bJg, "");
        c3750bJg.scrollToPosition(0);
    }

    private final void addListWithNewPlayButton(String str, String str2, String str3, TrackingInfoHolder trackingInfoHolder, SearchSectionSummary searchSectionSummary, InterfaceC5278bvj interfaceC5278bvj, int i) {
        C6126cUv c6126cUv = new C6126cUv();
        c6126cUv.b((CharSequence) str);
        c6126cUv.c(str2);
        c6126cUv.c(C8140dek.a.d(this.context, interfaceC5278bvj));
        c6126cUv.a(str3);
        c6126cUv.d(str);
        c6126cUv.c(trackingInfoHolder);
        c6126cUv.b(interfaceC5278bvj.isAvailableToPlay());
        c6126cUv.e(createListItemClickListenerForNewPlayButton(searchSectionSummary, trackingInfoHolder, interfaceC5278bvj, i));
        c6126cUv.c(createPlayVideoClickListenerForNewPlayButton(searchSectionSummary, trackingInfoHolder, interfaceC5278bvj, i));
        c6126cUv.b(new AbstractC3073as.b() { // from class: o.cSz
            @Override // o.AbstractC3073as.b
            public final int b(int i2, int i3, int i4) {
                int addListWithNewPlayButton$lambda$53$lambda$52;
                addListWithNewPlayButton$lambda$53$lambda$52 = SearchEpoxyController.addListWithNewPlayButton$lambda$53$lambda$52(i2, i3, i4);
                return addListWithNewPlayButton$lambda$53$lambda$52;
            }
        });
        add(c6126cUv);
    }

    private final void addSearchGridModel(final C6089cTl c6089cTl, String str, String str2, final int i, String str3, final SearchSectionSummary searchSectionSummary, final TrackingInfoHolder trackingInfoHolder, AppView appView, final InterfaceC5278bvj interfaceC5278bvj, final int i2, boolean z) {
        C6119cUo c6119cUo = new C6119cUo();
        Long l = this.requstId;
        c6119cUo.b((CharSequence) ("grid-video-" + str + "-" + l));
        c6119cUo.a(str);
        c6119cUo.d(str2);
        c6119cUo.e(C8140dek.a.d(this.context, interfaceC5278bvj));
        c6119cUo.c(i);
        c6119cUo.d(LoMoUtils.a(this.context));
        c6119cUo.b(str3);
        c6119cUo.b(z);
        c6119cUo.c(createGridItemClickListener(searchSectionSummary, interfaceC5278bvj, trackingInfoHolder));
        c6119cUo.d(appView);
        c6119cUo.b(trackingInfoHolder);
        c6119cUo.d(new InterfaceC4467bf() { // from class: o.cSO
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i3) {
                SearchEpoxyController.addSearchGridModel$lambda$57$lambda$55(SearchEpoxyController.this, c6089cTl, i, interfaceC5278bvj, searchSectionSummary, i2, (C6119cUo) abstractC3073as, (AbstractC6118cUn.e) obj, i3);
            }
        }).b(new InterfaceC4732bk() { // from class: o.cSM
            @Override // o.InterfaceC4732bk
            public final void b(AbstractC3073as abstractC3073as, Object obj, int i3) {
                SearchEpoxyController.addSearchGridModel$lambda$57$lambda$56(SearchSectionSummary.this, trackingInfoHolder, (C6119cUo) abstractC3073as, (AbstractC6118cUn.e) obj, i3);
            }
        });
        add(c6119cUo);
    }
}
