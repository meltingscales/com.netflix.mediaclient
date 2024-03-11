package com.netflix.mediaclient.ui.upnextfeed.impl;

import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55851_MobileNav;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedEpoxyController;
import com.netflix.model.leafs.ListOfMoviesSummary;
import com.netflix.model.leafs.UpNextFeedListItem;
import com.netflix.model.leafs.UpNextFeedSection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC7916daY;
import o.AbstractC7938dau;
import o.C1045Mp;
import o.C1332Xp;
import o.C1870aRh;
import o.C2808an;
import o.C3796bKz;
import o.C6232cYt;
import o.C6238cYz;
import o.C6245cZf;
import o.C6257cZr;
import o.C7909daR;
import o.C7915daX;
import o.C7939dav;
import o.C7966dbV;
import o.C7978dbh;
import o.C8126deW;
import o.C8141del;
import o.C8153dex;
import o.C8168dfL;
import o.C8569dql;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C9935zP;
import o.InterfaceC2023aX;
import o.InterfaceC5303bwH;
import o.InterfaceC6244cZe;
import o.InterfaceC7020coL;
import o.InterfaceC8554dpx;
import o.InterfaceC9960zo;
import o.aQT;
import o.bJM;
import o.bKU;
import o.bLU;
import o.bLW;
import o.cYQ;
import o.cZZ;
import o.dpB;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes5.dex */
public final class UpNextFeedEpoxyController extends TypedEpoxyController<C7978dbh> implements InterfaceC9960zo {
    public static final a Companion = new a(null);
    private static final Rect LEFT_SHIMMER_PADDING;
    private static final int PADDING;
    private static final Rect RIGHT_SHIMMER_PADDING;
    private static final int SPACE_IF_INVALID;
    private final NetflixActivity activity;
    private final boolean autoPlayEnabled;
    private final InterfaceC8554dpx cwBuilder$delegate;
    private final bLU epoxyPresentationTracking;
    private final bLW epoxyVideoAutoPlay;
    private final C9935zP eventBusFactory;
    private final cYQ gameRowBuilder;
    private boolean isNonMember;
    private final Map<Integer, Boolean> isSectionFullyLoaded;
    private final InterfaceC6244cZe itemBuilder;
    private final C7966dbV itemShimmer;
    private final Map<Integer, Integer> modelSectionIndex;
    private final C7915daX overridesManager;
    private final C6232cYt playerEventListener;
    private final MiniPlayerVideoGroupViewModel playerViewModel;
    private final Map<Integer, Integer> sectionFirstTargetItem;
    private final Map<String, Integer> sectionNameToIndex;
    private final boolean showAllSections;

    public final Map<String, Integer> getSectionNameToIndex$netflix_modules_ui_up_next_feed_impl_release() {
        return this.sectionNameToIndex;
    }

    public final Map<Integer, Boolean> isSectionFullyLoaded$netflix_modules_ui_up_next_feed_impl_release() {
        return this.isSectionFullyLoaded;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpNextFeedEpoxyController(NetflixActivity netflixActivity, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, C9935zP c9935zP, bLW blw, C6232cYt c6232cYt, bLU blu, drO<dpR> dro, drM<? super Integer, dpR> drm, boolean z, boolean z2, InterfaceC5303bwH interfaceC5303bwH, cYQ cyq, InterfaceC7020coL interfaceC7020coL) {
        super(C8141del.a() ? C2808an.b : C2808an.a(), C8141del.a() ? C2808an.b : C2808an.a());
        InterfaceC8554dpx b;
        InterfaceC6244cZe c6245cZf;
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) blw, "");
        C8632dsu.c((Object) c6232cYt, "");
        C8632dsu.c((Object) blu, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) interfaceC5303bwH, "");
        C8632dsu.c((Object) interfaceC7020coL, "");
        this.activity = netflixActivity;
        this.playerViewModel = miniPlayerVideoGroupViewModel;
        this.eventBusFactory = c9935zP;
        this.epoxyVideoAutoPlay = blw;
        this.playerEventListener = c6232cYt;
        this.epoxyPresentationTracking = blu;
        this.autoPlayEnabled = z;
        this.showAllSections = z2;
        this.gameRowBuilder = cyq;
        this.sectionFirstTargetItem = new LinkedHashMap();
        this.modelSectionIndex = new LinkedHashMap();
        this.sectionNameToIndex = new LinkedHashMap();
        this.isSectionFullyLoaded = new LinkedHashMap();
        this.itemShimmer = new C7966dbV();
        b = dpB.b(new drO<C6238cYz>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedEpoxyController$cwBuilder$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final C6238cYz invoke() {
                NetflixActivity netflixActivity2;
                bLU blu2;
                netflixActivity2 = UpNextFeedEpoxyController.this.activity;
                blu2 = UpNextFeedEpoxyController.this.epoxyPresentationTracking;
                return new C6238cYz(netflixActivity2, blu2);
            }
        });
        this.cwBuilder$delegate = b;
        C7915daX c7915daX = new C7915daX(dro, drm);
        this.overridesManager = c7915daX;
        if (aQT.c.c().d() || Config_Ab55851_MobileNav.a.d().e()) {
            c6245cZf = new C6245cZf(netflixActivity, this, c9935zP, miniPlayerVideoGroupViewModel, c6232cYt, blw, blu, z, c7915daX, interfaceC5303bwH);
        } else if (C1870aRh.a.a().f()) {
            c6245cZf = new cZZ(netflixActivity, this, c9935zP, miniPlayerVideoGroupViewModel, c6232cYt, blw, blu, z, c7915daX, interfaceC5303bwH);
        } else {
            c6245cZf = new C6257cZr(netflixActivity, this, c9935zP, miniPlayerVideoGroupViewModel, c6232cYt, blw, blu, z, c7915daX, interfaceC5303bwH, interfaceC7020coL);
        }
        this.itemBuilder = c6245cZf;
    }

    /* loaded from: classes5.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("UpNextFeedEpoxyController");
        }

        public final Rect c() {
            return UpNextFeedEpoxyController.LEFT_SHIMMER_PADDING;
        }

        public final Rect d() {
            return UpNextFeedEpoxyController.RIGHT_SHIMMER_PADDING;
        }
    }

    private final C6238cYz getCwBuilder() {
        return (C6238cYz) this.cwBuilder$delegate.getValue();
    }

    @Override // o.InterfaceC9960zo
    public Integer getFirstTargetItemForSection(int i) {
        return this.sectionFirstTargetItem.get(Integer.valueOf(i));
    }

    @Override // o.InterfaceC9960zo
    public Integer getSectionIndexForModelPos(int i) {
        return this.modelSectionIndex.get(Integer.valueOf(i));
    }

    private final void addGameRow(C7978dbh c7978dbh) {
        cYQ cyq = this.gameRowBuilder;
        if (cyq != null) {
            cyq.b(this, c7978dbh, new TrackingInfoHolder(PlayLocationType.UP_NEXT), this.eventBusFactory);
        }
    }

    private final void addCWRow(C7978dbh c7978dbh) {
        getCwBuilder().e(this, c7978dbh, new TrackingInfoHolder(PlayLocationType.UP_NEXT), this.eventBusFactory, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedEpoxyController$addCWRow$1
            public final void d() {
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedEpoxyController$addCWRow$2
            public final void e() {
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                e();
                return dpR.c;
            }
        });
    }

    private final boolean validateSection(UpNextFeedSection upNextFeedSection) {
        return (upNextFeedSection.getSummary().getListContext() == null || upNextFeedSection.getSummary().getRequestId() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addErrorModel$lambda$8$lambda$7(UpNextFeedEpoxyController upNextFeedEpoxyController, View view) {
        C8632dsu.c((Object) upNextFeedEpoxyController, "");
        upNextFeedEpoxyController.eventBusFactory.b(AbstractC7938dau.class, AbstractC7938dau.f.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(C7978dbh c7978dbh) {
        List G;
        int i;
        String str;
        ListOfMoviesSummary listOfMoviesSummary;
        int i2;
        TrackingInfoHolder trackingInfoHolder;
        Integer d;
        Integer d2;
        Integer b;
        C8632dsu.c((Object) c7978dbh, "");
        Companion.getLogTag();
        this.itemBuilder.a();
        if (c7978dbh.i()) {
            this.sectionFirstTargetItem.clear();
            this.modelSectionIndex.clear();
            this.sectionNameToIndex.clear();
            this.isSectionFullyLoaded.clear();
        }
        this.overridesManager.b(c7978dbh);
        this.isNonMember = C8126deW.e((Context) this.activity);
        if (c7978dbh.j().isEmpty()) {
            if (!(c7978dbh.d() instanceof AbstractC7916daY.e) && !(c7978dbh.d() instanceof AbstractC7916daY.b)) {
                addErrorModel(this);
                return;
            }
            bKU bku = new bKU();
            bku.d((CharSequence) "top-spacer");
            C1332Xp c1332Xp = C1332Xp.b;
            bku.a(Integer.valueOf((int) TypedValue.applyDimension(1, 18, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            add(bku);
            C7966dbV.a(this.itemShimmer, this, "initial-loading-shimmer-1", true, 1L, null, 16, null);
            C7966dbV.a(this.itemShimmer, this, "initial-loading-shimmer-2", true, 2L, null, 16, null);
            C7966dbV.a(this.itemShimmer, this, "initial-loading-shimmer-3", true, 3L, null, 16, null);
            return;
        }
        G = C8576dqs.G(c7978dbh.j());
        ArrayList arrayList = new ArrayList();
        for (Object obj : G) {
            UpNextFeedSection upNextFeedSection = (UpNextFeedSection) obj;
            if (validateSection(upNextFeedSection) && (this.showAllSections || C8632dsu.c((Object) upNextFeedSection.getSummary().getListContext(), (Object) "COMING_SOON_SECTION_DESCRIPTOR"))) {
                arrayList.add(obj);
            }
        }
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        for (Object obj2 : arrayList) {
            if (i3 < 0) {
                C8569dql.h();
            }
            UpNextFeedSection upNextFeedSection2 = (UpNextFeedSection) obj2;
            ListOfMoviesSummary summary = upNextFeedSection2.getSummary();
            this.modelSectionIndex.put(Integer.valueOf(getModelCountBuiltSoFar()), Integer.valueOf(i3));
            this.sectionFirstTargetItem.put(Integer.valueOf(i3), Integer.valueOf(getModelCountBuiltSoFar()));
            String listContext = upNextFeedSection2.getSummary().getListContext();
            if (listContext != null) {
                C8632dsu.d((Object) listContext);
                this.sectionNameToIndex.put(listContext, Integer.valueOf(i3));
            }
            String str2 = "section-";
            if (aQT.c.c().d()) {
                bKU bku2 = new bKU();
                bku2.d((CharSequence) ("section-" + i3 + "-top-spacer"));
                C1332Xp c1332Xp2 = C1332Xp.b;
                bku2.a(Integer.valueOf((int) TypedValue.applyDimension(1, (float) 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
                add(bku2);
            }
            TrackingInfoHolder a2 = new TrackingInfoHolder(PlayLocationType.UP_NEXT).a(summary);
            boolean c = C8632dsu.c((Object) summary.getListContext(), (Object) "COMING_SOON_SECTION_DESCRIPTOR");
            boolean c2 = C8632dsu.c((Object) summary.getListContext(), (Object) "MOST_WATCHED_SECTION_DESCRIPTOR");
            boolean z3 = z;
            boolean z4 = z2;
            Integer num = null;
            boolean z5 = true;
            int i4 = 0;
            for (UpNextFeedListItem upNextFeedListItem : upNextFeedSection2.getItems()) {
                this.modelSectionIndex.put(Integer.valueOf(getModelCountBuiltSoFar()), Integer.valueOf(i3));
                if (upNextFeedListItem == null) {
                    i = i4;
                    str = str2;
                    listOfMoviesSummary = summary;
                    C7966dbV.a(this.itemShimmer, this, str2 + i3 + "-item-" + i4, c || c2, 0L, null, 24, null);
                    i2 = i3;
                    trackingInfoHolder = a2;
                    z5 = false;
                } else {
                    i = i4;
                    TrackingInfoHolder trackingInfoHolder2 = a2;
                    str = str2;
                    listOfMoviesSummary = summary;
                    C7909daR e = C7909daR.d.e(upNextFeedListItem, this.overridesManager.e());
                    if (e != null) {
                        if (c2) {
                            num = num != null ? Integer.valueOf(num.intValue() + 1) : 1;
                        }
                        Integer num2 = num;
                        InterfaceC6244cZe interfaceC6244cZe = this.itemBuilder;
                        int modelCountBuiltSoFar = getModelCountBuiltSoFar();
                        String listContext2 = listOfMoviesSummary.getListContext();
                        if (listContext2 == null) {
                            listContext2 = "unknown-section-id-" + i;
                        }
                        String str3 = listContext2;
                        C8632dsu.d((Object) str3);
                        trackingInfoHolder = trackingInfoHolder2;
                        i2 = i3;
                        interfaceC6244cZe.a(modelCountBuiltSoFar, str3, i2, i, e, c, num2, trackingInfoHolder.d(upNextFeedListItem, i), this.isNonMember);
                        num = num2;
                    } else {
                        i2 = i3;
                        trackingInfoHolder = trackingInfoHolder2;
                        addInvalidPlaceholderItem(i, upNextFeedListItem);
                    }
                }
                int i5 = i + 1;
                if (!z4 && (((d2 = Config_Ab55851_MobileNav.a.d().d()) != null && i5 == d2.intValue()) || ((b = C1870aRh.a.a().b()) != null && i5 == b.intValue()))) {
                    addCWRow(c7978dbh);
                    i5 = i + 2;
                    z4 = true;
                }
                if (!z3 && (d = C1870aRh.a.a().d()) != null && i5 == d.intValue()) {
                    addGameRow(c7978dbh);
                    i5++;
                    z3 = true;
                }
                a2 = trackingInfoHolder;
                i3 = i2;
                str2 = str;
                summary = listOfMoviesSummary;
                i4 = i5;
            }
            int i6 = i3;
            this.isSectionFullyLoaded.put(Integer.valueOf(i6), Boolean.valueOf(z5));
            if (z4 || !C8153dex.T()) {
                z2 = z4;
            } else {
                addCWRow(c7978dbh);
                z2 = true;
            }
            i3 = i6 + 1;
            z = z3;
        }
    }

    private final void addErrorModel(InterfaceC2023aX interfaceC2023aX) {
        bJM bjm = new bJM();
        bjm.b((CharSequence) "up-next-initial-error");
        bjm.d(C3796bKz.g.f);
        bjm.c((CharSequence) C8168dfL.d(C7939dav.i.q));
        bjm.d((CharSequence) C8168dfL.d(C7939dav.i.s));
        bjm.a(new View.OnClickListener() { // from class: o.daB
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpNextFeedEpoxyController.addErrorModel$lambda$8$lambda$7(UpNextFeedEpoxyController.this, view);
            }
        });
        interfaceC2023aX.add(bjm);
    }

    private final void addInvalidPlaceholderItem(int i, UpNextFeedListItem upNextFeedListItem) {
        bKU bku = new bKU();
        bku.d((CharSequence) ("invalid-" + i));
        bku.a(Integer.valueOf(SPACE_IF_INVALID));
        add(bku);
    }

    static {
        C1332Xp c1332Xp = C1332Xp.b;
        SPACE_IF_INVALID = (int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        int applyDimension = (int) TypedValue.applyDimension(1, 12, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        PADDING = applyDimension;
        LEFT_SHIMMER_PADDING = new Rect(0, applyDimension, applyDimension, applyDimension);
        RIGHT_SHIMMER_PADDING = new Rect(applyDimension, applyDimension, 0, applyDimension);
    }
}
