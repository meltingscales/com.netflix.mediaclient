package com.netflix.mediaclient.ui.home.impl.feed;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.clutils.VideoSummaryCLTrackingInfo;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoEpoxyController;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Ref;
import o.AbstractC5100bsQ;
import o.AbstractC8918fl;
import o.C1045Mp;
import o.C1332Xp;
import o.C1596aHd;
import o.C1729aMb;
import o.C1875aRm;
import o.C3794bKx;
import o.C4000bSn;
import o.C4036bTw;
import o.C4049bUi;
import o.C6232cYt;
import o.C8126deW;
import o.C8168dfL;
import o.C8569dql;
import o.C8572dqo;
import o.C8627dsp;
import o.C8632dsu;
import o.C9834xU;
import o.C9935zP;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC2023aX;
import o.InterfaceC5155btS;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.InterfaceC6234cYv;
import o.InterfaceC9960zo;
import o.aQT;
import o.bKU;
import o.bLW;
import o.bSJ;
import o.bSY;
import o.bTX;
import o.cYB;
import o.dpD;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class FeedLolomoEpoxyController extends LolomoEpoxyController implements InterfaceC9960zo {
    public static final a Companion = new a(null);
    private final NetflixActivity activity;
    private final boolean autoPlayEnabled;
    private boolean isNonMember;
    private final InterfaceC6234cYv itemBuilder;
    private final Map<String, Integer> lomoEntityCounts;
    private final C4036bTw overridesManager;
    private final C6232cYt playerEventListener;
    private final Map<LoMo, drO<dpR>> sectionLoadLambdas;
    private Integer top10Ranking;
    private final cYB upNextGps;

    public final boolean isNonMember() {
        return this.isNonMember;
    }

    public final void setNonMember(boolean z) {
        this.isNonMember = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedLolomoEpoxyController(NetflixActivity netflixActivity, LolomoMvRxFragment.d dVar, C9935zP c9935zP, bLW blw, C6232cYt c6232cYt, drO<dpR> dro, drM<? super Integer, dpR> drm, boolean z, bSY bsy, bTX btx, drX<? super LoMo, ? super Integer, dpR> drx, drM<? super LoMo, dpR> drm2, drO<MiniPlayerVideoGroupViewModel> dro2, AbstractC5100bsQ abstractC5100bsQ) {
        super(dVar, netflixActivity, c9935zP, bsy, blw, btx, drx, drm2, dro2, abstractC5100bsQ);
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) blw, "");
        C8632dsu.c((Object) c6232cYt, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) bsy, "");
        C8632dsu.c((Object) btx, "");
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) drm2, "");
        C8632dsu.c((Object) dro2, "");
        this.activity = netflixActivity;
        this.playerEventListener = c6232cYt;
        this.autoPlayEnabled = z;
        this.upNextGps = dVar.o();
        this.lomoEntityCounts = new LinkedHashMap();
        this.sectionLoadLambdas = new LinkedHashMap();
        C4036bTw c4036bTw = new C4036bTw(dro, drm);
        this.overridesManager = c4036bTw;
        this.itemBuilder = dVar.o().c(netflixActivity, c9935zP, dro2.invoke(), c6232cYt, blw, bsy.d(), z, c4036bTw, dVar.a());
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("TrailersLolomoEpoxyController");
        }
    }

    @Override // o.InterfaceC9960zo
    public Integer getFirstTargetItemForSection(int i) {
        return this.upNextGps.b(i);
    }

    @Override // o.InterfaceC9960zo
    public Integer getSectionIndexForModelPos(int i) {
        return this.upNextGps.c(i);
    }

    @Override // com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public void addInitialLoadingShimmer(C4049bUi c4049bUi) {
        C8632dsu.c((Object) c4049bUi, "");
        getComponents().o().b(this);
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController, com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public void addVideoRow(InterfaceC2023aX interfaceC2023aX, C4049bUi c4049bUi, InterfaceC5155btS interfaceC5155btS, final LoMo loMo, final List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> list, C1729aMb c1729aMb, TrackingInfoHolder trackingInfoHolder, boolean z, drO<dpR> dro, drO<dpR> dro2) {
        boolean z2;
        int i;
        int d;
        Map i2;
        Throwable th;
        int i3;
        TrackingInfoHolder trackingInfoHolder2;
        TrackingInfoHolder trackingInfoHolder3;
        List<Long> i4;
        TrackingInfoHolder trackingInfoHolder4 = trackingInfoHolder;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c4049bUi, "");
        C8632dsu.c((Object) interfaceC5155btS, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) trackingInfoHolder4, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dro2, "");
        if (loMo.getType() == LoMoType.FEED) {
            if (getComponents().o().e(loMo)) {
                this.top10Ranking = 0;
            } else {
                this.top10Ranking = null;
            }
            if (aQT.c.c().d()) {
                bKU bku = new bKU();
                bku.d((CharSequence) ("section-" + loMo.getListPos() + "-top-spacer"));
                C1332Xp c1332Xp = C1332Xp.b;
                bku.a(Integer.valueOf((int) TypedValue.applyDimension(1, (float) 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
                interfaceC2023aX.add(bku);
            }
            TrackingInfoHolder a2 = trackingInfoHolder4.a(loMo);
            int i5 = 0;
            ClassCastException e = null;
            for (Object obj : list) {
                if (i5 < 0) {
                    C8569dql.h();
                }
                InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug = (InterfaceC5222bug) obj;
                try {
                    TrackingInfoHolder e2 = a2.e(interfaceC5222bug.getVideo(), i5);
                    i4 = C8569dql.i();
                    i3 = i5;
                    trackingInfoHolder2 = a2;
                    trackingInfoHolder3 = trackingInfoHolder4;
                    try {
                        addVideo(interfaceC2023aX, c4049bUi, interfaceC5155btS, loMo, interfaceC5222bug, i3, c1729aMb, e2, false, i4);
                    } catch (ClassCastException e3) {
                        e = e3;
                    }
                } catch (ClassCastException e4) {
                    e = e4;
                    i3 = i5;
                    trackingInfoHolder2 = a2;
                    trackingInfoHolder3 = trackingInfoHolder4;
                }
                i5 = i3 + 1;
                trackingInfoHolder4 = trackingInfoHolder3;
                a2 = trackingInfoHolder2;
            }
            final TrackingInfoHolder trackingInfoHolder5 = trackingInfoHolder4;
            if (e != null) {
                InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                String str = "SPY-34830 - " + e;
                Pair[] pairArr = new Pair[5];
                z2 = false;
                pairArr[0] = dpD.a("lomo.type", String.valueOf(loMo.getType()));
                i = 1;
                pairArr[1] = dpD.a("lomo.id", String.valueOf(loMo.getId()));
                pairArr[2] = dpD.a("lomo.listPos", String.valueOf(loMo.getListPos()));
                pairArr[3] = dpD.a("trackingInfo", String.valueOf(TrackingInfoHolder.a(trackingInfoHolder, null, null, null, 7, null).toJSONObject()));
                d = C8572dqo.d(list, 10);
                ArrayList arrayList = new ArrayList(d);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC5222bug) it.next()).mo3081getEntity().getClass().getName());
                }
                pairArr[4] = dpD.a("videoEntityModels", String.valueOf(arrayList));
                i2 = dqE.i(pairArr);
                C1596aHd c1596aHd = new C1596aHd(str, null, null, false, i2, false, false, 110, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
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
                InterfaceC1597aHe c = dVar2.c();
                if (c != null) {
                    c.d(c1596aHd, th);
                } else {
                    dVar2.e().b(c1596aHd, th);
                }
            } else {
                z2 = false;
                i = 1;
            }
            if (!z) {
                if (list.size() < loMo.getLength()) {
                    getRowLoadingCreator().a(interfaceC2023aX, loMo, loMo.getListPos(), loMo.getLength(), list.size(), loMo.getLength() - list.size(), c1729aMb, false, getFirstBindLambda$default(this, loMo, list.size(), null, 4, null));
                    return;
                }
                return;
            }
            C3794bKx c3794bKx = new C3794bKx();
            c3794bKx.b((CharSequence) ("error-row-" + loMo.getListPos() + "-retry"));
            c3794bKx.e((CharSequence) C8168dfL.d(C9834xU.h.f));
            c3794bKx.d(new View.OnClickListener() { // from class: o.bTm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedLolomoEpoxyController.addVideoRow$lambda$7$lambda$6$lambda$5(FeedLolomoEpoxyController.this, loMo, list, view);
                }
            });
            c3794bKx.a(bSY.a(getHomeModelTracking(), z2, i, null));
            c3794bKx.c((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoEpoxyController$addVideoRow$1$4$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: a */
                public final TrackingInfo invoke() {
                    return TrackingInfoHolder.this.c();
                }
            });
            interfaceC2023aX.add(c3794bKx);
            return;
        }
        super.addVideoRow(interfaceC2023aX, c4049bUi, interfaceC5155btS, loMo, list, c1729aMb, trackingInfoHolder, z, dro, dro2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addVideoRow$lambda$7$lambda$6$lambda$5(FeedLolomoEpoxyController feedLolomoEpoxyController, LoMo loMo, List list, View view) {
        C8632dsu.c((Object) feedLolomoEpoxyController, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) list, "");
        feedLolomoEpoxyController.emit(new bSJ.n(loMo, list.size()));
        Logger.INSTANCE.logEvent(new Selected(AppView.tryAgainButton, null, CommandValue.RetryCommand, null));
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController, com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public void addVideo(InterfaceC2023aX interfaceC2023aX, C4049bUi c4049bUi, InterfaceC5155btS interfaceC5155btS, LoMo loMo, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug, int i, C1729aMb c1729aMb, TrackingInfoHolder trackingInfoHolder, boolean z, List<Long> list) {
        Map d;
        Map k;
        Throwable th;
        Map k2;
        Throwable th2;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c4049bUi, "");
        C8632dsu.c((Object) interfaceC5155btS, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) list, "");
        if (loMo.getType() == LoMoType.FEED) {
            TrailerItem trailerItem = interfaceC5222bug instanceof TrailerItem ? (TrailerItem) interfaceC5222bug : null;
            if (trailerItem != null) {
                if (getComponents().o().e(loMo)) {
                    Integer num = this.top10Ranking;
                    this.top10Ranking = num != null ? Integer.valueOf(num.intValue() + 1) : null;
                }
                if (c4049bUi.e() == null) {
                    if (C1875aRm.a.d()) {
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        d = dqE.d();
                        k = dqE.k(d);
                        C1596aHd c1596aHd = new C1596aHd("feedState is null", null, null, true, k, false, false, 96, null);
                        ErrorType errorType = c1596aHd.a;
                        if (errorType != null) {
                            c1596aHd.e.put("errorType", errorType.c());
                            String b = c1596aHd.b();
                            if (b != null) {
                                c1596aHd.a(errorType.c() + " " + b);
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
                        InterfaceC1597aHe.d dVar2 = InterfaceC1597aHe.b;
                        k2 = dqE.k(new LinkedHashMap());
                        C1596aHd c1596aHd2 = new C1596aHd("feedState is null", null, null, true, k2, false, false, 96, null);
                        ErrorType errorType2 = c1596aHd2.a;
                        if (errorType2 != null) {
                            c1596aHd2.e.put("errorType", errorType2.c());
                            String b2 = c1596aHd2.b();
                            if (b2 != null) {
                                c1596aHd2.a(errorType2.c() + " " + b2);
                            }
                        }
                        if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                            th2 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                        } else if (c1596aHd2.b() != null) {
                            th2 = new Throwable(c1596aHd2.b());
                        } else {
                            th2 = c1596aHd2.i;
                            if (th2 == null) {
                                th2 = new Throwable("Handled exception with no message");
                            } else if (th2 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        InterfaceC1597aHe c = dVar.c();
                        if (c != null) {
                            c.d(c1596aHd2, th2);
                        } else {
                            dVar.e().b(c1596aHd2, th2);
                        }
                    }
                } else {
                    this.upNextGps.e(loMo.getListPos(), getModelCountBuiltSoFar());
                }
                InterfaceC6234cYv interfaceC6234cYv = this.itemBuilder;
                int modelCountBuiltSoFar = getModelCountBuiltSoFar();
                String listContext = loMo.getListContext();
                if (listContext == null) {
                    listContext = "unknown-section-id-" + i;
                }
                String str = listContext;
                C8632dsu.d((Object) str);
                int listPos = loMo.getListPos();
                boolean a3 = getComponents().o().a(loMo);
                Integer num2 = this.top10Ranking;
                int k3 = trailerItem.k();
                String x = trailerItem.x();
                if (x == null) {
                    x = trailerItem.getUnifiedEntityId();
                }
                interfaceC6234cYv.e(interfaceC2023aX, modelCountBuiltSoFar, str, listPos, i, trailerItem, a3, num2, TrackingInfoHolder.b(trackingInfoHolder, null, null, null, new VideoSummaryCLTrackingInfo(k3, x, trailerItem.p(), i, trailerItem.getVideoMerchComputeId()), 7, null), this.isNonMember, getFirstBindLambda(loMo, i, interfaceC5222bug.getVideo()));
                return;
            }
            return;
        }
        super.addVideo(interfaceC2023aX, c4049bUi, interfaceC5155btS, loMo, interfaceC5222bug, i, c1729aMb, trackingInfoHolder, z, list);
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController, com.netflix.mediaclient.ui.home.impl.HomeEpoxyController
    public C1729aMb buildConfig(Context context, LoMo loMo, String str) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) loMo, "");
        if (loMo.d()) {
            return new C1729aMb(34, C4000bSn.b(this.activity, LoMoType.FEED), 0.0f, 1, 0, 0, 0, 0, 0.0f, 0, null, false, BrowseExperience.e(), false, 0, 1, 0, false, 0, null, 0, 0, true, 4026004, null);
        }
        return super.buildConfig(context, loMo, str);
    }

    static /* synthetic */ drO getFirstBindLambda$default(FeedLolomoEpoxyController feedLolomoEpoxyController, LoMo loMo, int i, InterfaceC5223buh interfaceC5223buh, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            interfaceC5223buh = null;
        }
        return feedLolomoEpoxyController.getFirstBindLambda(loMo, i, interfaceC5223buh);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoEpoxyController$getFirstBindLambda$onFirstBindConsumable$1] */
    private final drO<dpR> getFirstBindLambda(final LoMo loMo, int i, final InterfaceC5223buh interfaceC5223buh) {
        drO<dpR> dro = this.sectionLoadLambdas.get(loMo);
        if (dro != null) {
            return dro;
        }
        Integer num = this.lomoEntityCounts.get(loMo.getId());
        final int intValue = num != null ? num.intValue() : 0;
        if (loMo.getLength() == intValue) {
            return new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoEpoxyController$getFirstBindLambda$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }

                public final void b() {
                    bSY homeModelTracking;
                    if (InterfaceC5223buh.this != null) {
                        homeModelTracking = this.getHomeModelTracking();
                        homeModelTracking.a().a(InterfaceC5223buh.this, loMo.getType(), loMo.getId());
                    }
                }
            };
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.d = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoEpoxyController$getFirstBindLambda$onFirstBindConsumable$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                e();
                return dpR.c;
            }

            public final void e() {
                FeedLolomoEpoxyController.this.emit(new bSJ.j(loMo, intValue));
            }
        };
        drO<dpR> dro2 = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoEpoxyController$getFirstBindLambda$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final void c() {
                bSY homeModelTracking;
                Ref.ObjectRef<drO<dpR>> objectRef2 = objectRef;
                drO<dpR> dro3 = objectRef2.d;
                if (dro3 != null) {
                    dro3.invoke();
                    objectRef2.d = null;
                }
                if (interfaceC5223buh != null) {
                    homeModelTracking = this.getHomeModelTracking();
                    homeModelTracking.a().a(interfaceC5223buh, loMo.getType(), loMo.getId());
                }
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }
        };
        this.sectionLoadLambdas.put(loMo, dro2);
        return dro2;
    }

    @Override // com.netflix.mediaclient.ui.home.impl.HomeEpoxyController, com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(C4049bUi c4049bUi) {
        C8632dsu.c((Object) c4049bUi, "");
        Companion.getLogTag();
        this.itemBuilder.a();
        getComponents().o().b();
        this.overridesManager.b(c4049bUi);
        this.isNonMember = C8126deW.e((Context) this.activity);
        this.sectionLoadLambdas.clear();
        this.lomoEntityCounts.clear();
        for (Map.Entry<String, AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>>> entry : c4049bUi.u().entrySet()) {
            Map<String, Integer> map = this.lomoEntityCounts;
            String key = entry.getKey();
            List<InterfaceC5222bug<? extends InterfaceC5223buh>> c = entry.getValue().c();
            map.put(key, Integer.valueOf(c != null ? c.size() : 0));
        }
        super.buildModels(c4049bUi);
        getComponents().o().d();
    }
}
