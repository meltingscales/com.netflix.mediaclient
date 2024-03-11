package o;

import android.content.Context;
import com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$clearActionsUpToId$1;
import com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$fetchCWTitles$1;
import com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$fetchGamesRow$1;
import com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$refreshLolomoAndIndividualRows$1;
import com.netflix.model.leafs.ListOfMoviesSummary;
import com.netflix.model.leafs.UpNextFeedListItem;
import com.netflix.model.leafs.UpNextFeedSection;
import com.netflix.model.leafs.UpNextFeedSectionImpl;
import com.netflix.model.leafs.UpNextFeedVideoEvidence;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC7916daY;
import o.AbstractC8918fl;
import o.C4003bSq;
import o.C5220bue;
import o.C7917daZ;
import o.C7971dba;
import o.C7975dbe;
import o.C7978dbh;
import o.C7981dbk;
import o.C8632dsu;
import o.C8932fz;
import o.InterfaceC7974dbd;
import o.dpR;
import o.drX;

/* renamed from: o.dbe  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7975dbe extends C9943zX<C7978dbh> {
    public static final d c = new d(null);
    private final InterfaceC7974dbd a;
    private final Context b;
    private final C7917daZ d;
    private final InterfaceC3993bSg e;
    private final C7981dbk h;
    private final PublishSubject<dpR> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public C7975dbe(@Assisted C7978dbh c7978dbh, C7972dbb c7972dbb, InterfaceC1270Vf interfaceC1270Vf, InterfaceC3993bSg interfaceC3993bSg, @ApplicationContext Context context, C7981dbk c7981dbk) {
        super(c7978dbh);
        C8632dsu.c((Object) c7978dbh, "");
        C8632dsu.c((Object) c7972dbb, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        C8632dsu.c((Object) interfaceC3993bSg, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c7981dbk, "");
        this.e = interfaceC3993bSg;
        this.b = context;
        this.h = c7981dbk;
        C7917daZ e = c.e();
        this.d = e;
        this.a = new C7911daT(aLN.a.a(g()), interfaceC1270Vf, c7972dbb, new C7977dbg(), C7917daZ.c(e, false, 1, null), context);
        PublishSubject<dpR> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.j = create;
        c((dtE) new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return ((C7978dbh) obj).j();
            }
        }, (drM) new drM<List<? extends UpNextFeedSection>, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(List<? extends UpNextFeedSection> list) {
                b(list);
                return dpR.c;
            }

            public final void b(List<? extends UpNextFeedSection> list) {
                C8632dsu.c((Object) list, "");
                C7975dbe.this.a(false);
            }
        });
        Observable<dpR> takeUntil = create.throttleFirst(5L, TimeUnit.SECONDS).takeUntil(g());
        C8632dsu.a(takeUntil, "");
        SubscribersKt.subscribeBy$default(takeUntil, (drM) null, (drO) null, new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$3
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(dpR dpr) {
                b(dpr);
                return dpR.c;
            }

            public final void b(dpR dpr) {
                C7975dbe.this.a(true);
            }
        }, 3, (Object) null);
        if (C8153dex.T()) {
            c(this, 0, false, 3, null);
        }
        if (C1870aRh.a.d()) {
            d(this, 0, false, 3, null);
        }
    }

    /* renamed from: o.dbe$d */
    /* loaded from: classes5.dex */
    public static final class d extends C1045Mp implements InterfaceC8906fZ<C7975dbe, C7978dbh> {
        private final /* synthetic */ C1644aIy<C7975dbe, C7978dbh> a;

        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        public C7975dbe create(AbstractC8979gt abstractC8979gt, C7978dbh c7978dbh) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c7978dbh, "");
            return this.a.create(abstractC8979gt, c7978dbh);
        }

        private d() {
            super("UpNextFeedViewModel");
            this.a = new C1644aIy<>(C7975dbe.class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C7978dbh c() {
            List i;
            List i2;
            i = C8569dql.i();
            i2 = C8569dql.i();
            return new C7978dbh(null, i, i2, AbstractC7916daY.b.a, dqL.a(), true, C8974go.e, null, 129, null);
        }

        public final C7917daZ e() {
            return new C7917daZ(3, 5, 10, 4, 4);
        }

        /* renamed from: initialState */
        public C7978dbh m3184initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            getLogTag();
            return c();
        }
    }

    public static /* synthetic */ void c(C7975dbe c7975dbe, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        c7975dbe.b(i, z);
    }

    public final void b(int i, boolean z) {
        AbstractC8899fS.c(this, new UpNextFeedViewModel$fetchCWTitles$1(this, i, z, null), null, null, new drX<C7978dbh, AbstractC8918fl<? extends C4003bSq>, C7978dbh>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$fetchCWTitles$2
            @Override // o.drX
            /* renamed from: e */
            public final C7978dbh invoke(C7978dbh c7978dbh, AbstractC8918fl<C4003bSq> abstractC8918fl) {
                C7978dbh b2;
                C7978dbh b3;
                C8632dsu.c((Object) c7978dbh, "");
                C8632dsu.c((Object) abstractC8918fl, "");
                if (abstractC8918fl instanceof C8932fz) {
                    b3 = c7978dbh.b((r18 & 1) != 0 ? c7978dbh.i : null, (r18 & 2) != 0 ? c7978dbh.j : null, (r18 & 4) != 0 ? c7978dbh.c : null, (r18 & 8) != 0 ? c7978dbh.h : null, (r18 & 16) != 0 ? c7978dbh.a : null, (r18 & 32) != 0 ? c7978dbh.b : false, (r18 & 64) != 0 ? c7978dbh.d : new C8932fz(c7978dbh.c().c()), (r18 & 128) != 0 ? c7978dbh.e : null);
                    return b3;
                }
                b2 = c7978dbh.b((r18 & 1) != 0 ? c7978dbh.i : null, (r18 & 2) != 0 ? c7978dbh.j : null, (r18 & 4) != 0 ? c7978dbh.c : null, (r18 & 8) != 0 ? c7978dbh.h : null, (r18 & 16) != 0 ? c7978dbh.a : null, (r18 & 32) != 0 ? c7978dbh.b : false, (r18 & 64) != 0 ? c7978dbh.d : abstractC8918fl, (r18 & 128) != 0 ? c7978dbh.e : null);
                return b2;
            }
        }, 3, null);
    }

    public static /* synthetic */ void d(C7975dbe c7975dbe, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        c7975dbe.c(i, z);
    }

    public final void c(int i, boolean z) {
        AbstractC8899fS.c(this, new UpNextFeedViewModel$fetchGamesRow$1(this, i, z, null), null, null, new drX<C7978dbh, AbstractC8918fl<? extends C4003bSq>, C7978dbh>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$fetchGamesRow$2
            @Override // o.drX
            /* renamed from: c */
            public final C7978dbh invoke(C7978dbh c7978dbh, AbstractC8918fl<C4003bSq> abstractC8918fl) {
                C7978dbh b;
                C7978dbh b2;
                C8632dsu.c((Object) c7978dbh, "");
                C8632dsu.c((Object) abstractC8918fl, "");
                if (abstractC8918fl instanceof C8932fz) {
                    b2 = c7978dbh.b((r18 & 1) != 0 ? c7978dbh.i : null, (r18 & 2) != 0 ? c7978dbh.j : null, (r18 & 4) != 0 ? c7978dbh.c : null, (r18 & 8) != 0 ? c7978dbh.h : null, (r18 & 16) != 0 ? c7978dbh.a : null, (r18 & 32) != 0 ? c7978dbh.b : false, (r18 & 64) != 0 ? c7978dbh.d : null, (r18 & 128) != 0 ? c7978dbh.e : new C8932fz(c7978dbh.e().c()));
                    return b2;
                }
                b = c7978dbh.b((r18 & 1) != 0 ? c7978dbh.i : null, (r18 & 2) != 0 ? c7978dbh.j : null, (r18 & 4) != 0 ? c7978dbh.c : null, (r18 & 8) != 0 ? c7978dbh.h : null, (r18 & 16) != 0 ? c7978dbh.a : null, (r18 & 32) != 0 ? c7978dbh.b : false, (r18 & 64) != 0 ? c7978dbh.d : null, (r18 & 128) != 0 ? c7978dbh.e : abstractC8918fl);
                return b;
            }
        }, 3, null);
    }

    public final void j() {
        C8738dws.e(e(), null, null, new UpNextFeedViewModel$refreshLolomoAndIndividualRows$1(this, null), 3, null);
    }

    public final void i() {
        e(new drM<C7978dbh, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$onUserInteraction$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7978dbh c7978dbh) {
                b(c7978dbh);
                return dpR.c;
            }

            public final void b(C7978dbh c7978dbh) {
                PublishSubject publishSubject;
                C8632dsu.c((Object) c7978dbh, "");
                if ((c7978dbh.d() instanceof AbstractC7916daY.d) && (!c7978dbh.j().isEmpty())) {
                    publishSubject = C7975dbe.this.j;
                    publishSubject.onNext(dpR.c);
                }
            }
        });
    }

    public final void a(final boolean z) {
        e(new drM<C7978dbh, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$fetch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7978dbh c7978dbh) {
                e(c7978dbh);
                return dpR.c;
            }

            public final void e(C7978dbh c7978dbh) {
                C7917daZ c7917daZ;
                C7981dbk c7981dbk;
                InterfaceC7974dbd interfaceC7974dbd;
                C8632dsu.c((Object) c7978dbh, "");
                c7917daZ = C7975dbe.this.d;
                C7971dba a = c7917daZ.a(c7978dbh, z);
                if (a != null) {
                    final C7975dbe c7975dbe = C7975dbe.this;
                    c7981dbk = c7975dbe.h;
                    Single<C5220bue> e = c7981dbk.e(a);
                    if (e == null || c7975dbe.b(e, new drX<C7978dbh, AbstractC8918fl<? extends C5220bue>, C7978dbh>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$fetch$1$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        /* renamed from: e */
                        public final C7978dbh invoke(C7978dbh c7978dbh2, AbstractC8918fl<C5220bue> abstractC8918fl) {
                            C8632dsu.c((Object) c7978dbh2, "");
                            C8632dsu.c((Object) abstractC8918fl, "");
                            return C7975dbe.b(C7975dbe.this, c7978dbh2, abstractC8918fl, null, 2, null);
                        }
                    }) == null) {
                        interfaceC7974dbd = c7975dbe.a;
                        c7975dbe.b(interfaceC7974dbd.b(a), new drX<C7978dbh, AbstractC8918fl<? extends C5220bue>, C7978dbh>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$fetch$1$1$2$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                super(2);
                            }

                            @Override // o.drX
                            /* renamed from: c */
                            public final C7978dbh invoke(C7978dbh c7978dbh2, AbstractC8918fl<C5220bue> abstractC8918fl) {
                                C8632dsu.c((Object) c7978dbh2, "");
                                C8632dsu.c((Object) abstractC8918fl, "");
                                return C7975dbe.b(C7975dbe.this, c7978dbh2, abstractC8918fl, null, 2, null);
                            }
                        });
                    }
                }
            }
        });
    }

    public final void d(final Set<Integer> set) {
        e(new drM<C7978dbh, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$refreshAndClearOverrides$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7978dbh c7978dbh) {
                b(c7978dbh);
                return dpR.c;
            }

            public final void b(C7978dbh c7978dbh) {
                C7917daZ c7917daZ;
                InterfaceC7974dbd interfaceC7974dbd;
                C8632dsu.c((Object) c7978dbh, "");
                c7917daZ = C7975dbe.this.d;
                C7971dba c2 = c7917daZ.c(c7978dbh);
                if (c2 != null) {
                    final C7975dbe c7975dbe = C7975dbe.this;
                    final Set<Integer> set2 = set;
                    interfaceC7974dbd = c7975dbe.a;
                    c7975dbe.b(interfaceC7974dbd.b(c2), new drX<C7978dbh, AbstractC8918fl<? extends C5220bue>, C7978dbh>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$refreshAndClearOverrides$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        /* renamed from: a */
                        public final C7978dbh invoke(C7978dbh c7978dbh2, AbstractC8918fl<C5220bue> abstractC8918fl) {
                            C7978dbh a;
                            C8632dsu.c((Object) c7978dbh2, "");
                            C8632dsu.c((Object) abstractC8918fl, "");
                            a = C7975dbe.this.a(c7978dbh2, abstractC8918fl, set2);
                            return a;
                        }
                    });
                }
            }
        });
    }

    public final void d(int i) {
        b(new UpNextFeedViewModel$clearActionsUpToId$1(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C7978dbh b(C7975dbe c7975dbe, C7978dbh c7978dbh, AbstractC8918fl abstractC8918fl, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        return c7975dbe.a(c7978dbh, abstractC8918fl, set);
    }

    private final List<Long> b(List<UpNextFeedSection> list) {
        List<UpNextFeedSection> G;
        InterfaceC8366diy video;
        UpNextFeedVideoEvidence itemEvidence;
        ArrayList arrayList = new ArrayList();
        G = C8576dqs.G(list);
        for (UpNextFeedSection upNextFeedSection : G) {
            for (UpNextFeedListItem upNextFeedListItem : upNextFeedSection.getItems()) {
                if (upNextFeedListItem != null && (video = upNextFeedListItem.getVideo()) != null && (itemEvidence = upNextFeedListItem.getItemEvidence()) != null && itemEvidence.isVideoTrailer()) {
                    String id = video.getId();
                    C8632dsu.a(id, "");
                    arrayList.add(Long.valueOf(Long.parseLong(id)));
                }
            }
        }
        return arrayList;
    }

    public final void f() {
        b(new drM<C7978dbh, C7978dbh>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$refresh$1
            @Override // o.drM
            /* renamed from: d */
            public final C7978dbh invoke(C7978dbh c7978dbh) {
                C7978dbh c2;
                C8632dsu.c((Object) c7978dbh, "");
                c2 = C7975dbe.c.c();
                return c2;
            }
        });
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7978dbh a(C7978dbh c7978dbh, AbstractC8918fl<C5220bue> abstractC8918fl, Set<Integer> set) {
        Set<Integer> b;
        C8654dtp g;
        int d2;
        List<UpNextFeedSection> n;
        Object f;
        Object obj;
        List n2;
        Set<Integer> b2;
        Set<Integer> V;
        c.getLogTag();
        if (abstractC8918fl instanceof C8971gl) {
            C5220bue c5220bue = (C5220bue) ((C8971gl) abstractC8918fl).c();
            boolean d3 = c5220bue.d();
            if (d3) {
                n = C8576dqs.n(c5220bue.a());
            } else {
                g = C8657dts.g(0, c5220bue.b().getTotalSections());
                d2 = C8572dqo.d(g, 10);
                ArrayList arrayList = new ArrayList(d2);
                Iterator<Integer> it = g.iterator();
                while (it.hasNext()) {
                    ((dqB) it).nextInt();
                    arrayList.add(null);
                }
                n = C8576dqs.n(arrayList);
                int totalSections = c5220bue.b().getTotalSections();
                for (int i = 0; i < totalSections; i++) {
                    f = C8576dqs.f((List<? extends Object>) c7978dbh.j(), i);
                    UpNextFeedSection upNextFeedSection = (UpNextFeedSection) f;
                    Iterator<T> it2 = c5220bue.a().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((UpNextFeedSection) obj).getSummary().getListPos() == i) {
                            break;
                        }
                    }
                    UpNextFeedSection upNextFeedSection2 = (UpNextFeedSection) obj;
                    if (upNextFeedSection == null) {
                        upNextFeedSection = upNextFeedSection2;
                    } else if (upNextFeedSection2 != null) {
                        ListOfMoviesSummary summary = upNextFeedSection.getSummary();
                        n2 = C8576dqs.n(upNextFeedSection.getItems());
                        UpNextFeedSectionImpl upNextFeedSectionImpl = new UpNextFeedSectionImpl(summary, n2);
                        upNextFeedSectionImpl.mergeEntities(upNextFeedSection2.getItems());
                        upNextFeedSection = upNextFeedSectionImpl;
                    }
                    if (upNextFeedSection != null) {
                        n.set(upNextFeedSection.getSummary().getListPos(), upNextFeedSection);
                    }
                }
            }
            List<UpNextFeedSection> list = n;
            int totalSections2 = c5220bue.b().getTotalSections();
            List<Long> b3 = b(list);
            AbstractC7916daY.a aVar = AbstractC7916daY.a.a;
            if (set != null) {
                V = C8576dqs.V(c7978dbh.b());
                V.addAll(set);
                b2 = V;
            } else {
                b2 = c7978dbh.b();
            }
            return C7978dbh.copy$default(c7978dbh, Integer.valueOf(totalSections2), list, b3, aVar, b2, d3, null, null, 192, null);
        } else if (C8632dsu.c(abstractC8918fl, C8974go.e)) {
            return C7978dbh.copy$default(c7978dbh, null, null, null, AbstractC7916daY.a.a, null, false, null, null, 247, null);
        } else {
            if (abstractC8918fl instanceof C8932fz) {
                return C7978dbh.copy$default(c7978dbh, null, null, null, AbstractC7916daY.e.b, null, false, null, null, 247, null);
            }
            if (abstractC8918fl instanceof C8927fu) {
                AbstractC7916daY.d dVar = AbstractC7916daY.d.e;
                if (set != null) {
                    b = C8576dqs.V(c7978dbh.b());
                    b.addAll(set);
                } else {
                    b = c7978dbh.b();
                }
                return C7978dbh.copy$default(c7978dbh, null, null, null, dVar, b, false, null, null, 231, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
