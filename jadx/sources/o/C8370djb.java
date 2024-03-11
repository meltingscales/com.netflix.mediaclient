package o;

import com.netflix.falkor.BranchMap;
import com.netflix.model.branches.FalkorBillboardData;
import com.netflix.model.branches.FalkorList;
import com.netflix.model.branches.SummarizedList;
import com.netflix.model.branches.UnsummarizedList;
import com.netflix.model.leafs.DownloadedForYouDetailsImpl;
import com.netflix.model.leafs.FalkorStringPrimitive;
import com.netflix.model.leafs.GameScreenshotImpl;
import com.netflix.model.leafs.GenreItemImpl;
import com.netflix.model.leafs.LanguageListImpl;
import com.netflix.model.leafs.ListOfListOfGenres;
import com.netflix.model.leafs.ListOfListOfProfileIconsImpl;
import com.netflix.model.leafs.ListOfMoviesSummaryImpl;
import com.netflix.model.leafs.ListOfTags;
import com.netflix.model.leafs.LoLoMoSummaryImpl;
import com.netflix.model.leafs.NapaPageSummaryImpl;
import com.netflix.model.leafs.SearchSectionSummaryImpl;
import com.netflix.model.leafs.SearchTrackableListSummary;
import com.netflix.model.leafs.TrackableListSummaryImpl;
import com.netflix.model.leafs.originals.BillboardSummaryImpl;
import com.netflix.model.leafs.originals.TallPanelAsset;
import com.netflix.model.leafs.social.UserNotificationsListSummary;

/* renamed from: o.djb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8370djb {
    public static final IN<IF> n = new IN<IF>() { // from class: o.djb.4
        @Override // o.IN
        /* renamed from: a */
        public IF d() {
            return new IF();
        }
    };
    public static final IN<BranchMap<DownloadedForYouDetailsImpl>> c = new IN<BranchMap<DownloadedForYouDetailsImpl>>() { // from class: o.djb.11
        @Override // o.IN
        /* renamed from: a */
        public BranchMap<DownloadedForYouDetailsImpl> d() {
            return new BranchMap<>(C8370djb.a);
        }
    };
    public static final IN<GenreItemImpl> j = new IN<GenreItemImpl>() { // from class: o.djb.25
        @Override // o.IN
        /* renamed from: e */
        public GenreItemImpl d() {
            return new GenreItemImpl();
        }
    };
    public static final IN<DownloadedForYouDetailsImpl> a = new IN<DownloadedForYouDetailsImpl>() { // from class: o.djb.33
        @Override // o.IN
        /* renamed from: e */
        public DownloadedForYouDetailsImpl d() {
            return new DownloadedForYouDetailsImpl();
        }
    };
    public static final IN<SummarizedList<C8337diV, SearchSectionSummaryImpl>> E = new IN<SummarizedList<C8337diV, SearchSectionSummaryImpl>>() { // from class: o.djb.40
        @Override // o.IN
        /* renamed from: c */
        public SummarizedList<C8337diV, SearchSectionSummaryImpl> d() {
            return new SummarizedList<>(C8370djb.l, C8370djb.s);
        }
    };
    public static final IN<BranchMap<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>>> I = new IN<BranchMap<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>>>() { // from class: o.djb.37
        @Override // o.IN
        /* renamed from: e */
        public BranchMap<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>> d() {
            return new BranchMap<>(C8370djb.L);
        }
    };
    public static final IN<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>> L = new IN<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>>() { // from class: o.djb.38
        @Override // o.IN
        /* renamed from: a */
        public BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>> d() {
            return new BranchMap<>(C8370djb.G);
        }
    };
    public static final IN<BranchMap<BranchMap<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>>>> H = new IN<BranchMap<BranchMap<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>>>>() { // from class: o.djb.36
        @Override // o.IN
        /* renamed from: a */
        public BranchMap<BranchMap<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>>> d() {
            return new BranchMap<>(C8370djb.I);
        }
    };
    public static final IN<SummarizedList<C8337diV, SearchSectionSummaryImpl>> G = new IN<SummarizedList<C8337diV, SearchSectionSummaryImpl>>() { // from class: o.djb.39
        @Override // o.IN
        /* renamed from: b */
        public SummarizedList<C8337diV, SearchSectionSummaryImpl> d() {
            return new SummarizedList<>(C8370djb.l, C8370djb.s);
        }
    };
    public static final IN<TrackableListSummaryImpl> C = new IN<TrackableListSummaryImpl>() { // from class: o.djb.3
        @Override // o.IN
        /* renamed from: e */
        public TrackableListSummaryImpl d() {
            return new TrackableListSummaryImpl();
        }
    };
    public static final IN<GameScreenshotImpl> f = new IN() { // from class: o.diY
        @Override // o.IN
        public final Object d() {
            GameScreenshotImpl g2;
            g2 = C8370djb.g();
            return g2;
        }
    };
    public static final IN<UnsummarizedList<IF>> B = new IN<UnsummarizedList<IF>>() { // from class: o.djb.2
        @Override // o.IN
        /* renamed from: b */
        public UnsummarizedList<IF> d() {
            return new UnsummarizedList<>(C8370djb.n);
        }
    };
    public static final IN<ListOfMoviesSummaryImpl> g = new IN() { // from class: o.diZ
        @Override // o.IN
        public final Object d() {
            ListOfMoviesSummaryImpl j2;
            j2 = C8370djb.j();
            return j2;
        }
    };
    public static final IN<LoLoMoSummaryImpl> m = new IN<LoLoMoSummaryImpl>() { // from class: o.djb.5
        @Override // o.IN
        /* renamed from: c */
        public LoLoMoSummaryImpl d() {
            return new LoLoMoSummaryImpl();
        }
    };
    public static final IN<SummarizedList<IF, LoLoMoSummaryImpl>> x = new IN<SummarizedList<IF, LoLoMoSummaryImpl>>() { // from class: o.djb.1
        @Override // o.IN
        /* renamed from: c */
        public SummarizedList<IF, LoLoMoSummaryImpl> d() {
            return new SummarizedList<>(C8370djb.n, C8370djb.m);
        }
    };
    public static final IN<FalkorList<C8333diR>> i = new IN<FalkorList<C8333diR>>() { // from class: o.djb.10
        @Override // o.IN
        /* renamed from: b */
        public FalkorList<C8333diR> d() {
            return new FalkorList<>(C8370djb.h);
        }
    };
    public static final IN<BranchMap<IH<ListOfListOfProfileIconsImpl>>> b = new IN<BranchMap<IH<ListOfListOfProfileIconsImpl>>>() { // from class: o.djb.9
        @Override // o.IN
        /* renamed from: c */
        public BranchMap<IH<ListOfListOfProfileIconsImpl>> d() {
            return new BranchMap<>(C8370djb.r);
        }
    };
    public static final IN<IH<ListOfListOfProfileIconsImpl>> r = new IN<IH<ListOfListOfProfileIconsImpl>>() { // from class: o.djb.6
        @Override // o.IN
        /* renamed from: b */
        public IH<ListOfListOfProfileIconsImpl> d() {
            return IH.d(new ListOfListOfProfileIconsImpl());
        }
    };
    public static final IN<IH<ListOfListOfGenres>> p = new IN<IH<ListOfListOfGenres>>() { // from class: o.djb.8
        @Override // o.IN
        /* renamed from: a */
        public IH<ListOfListOfGenres> d() {
            return IH.d(new ListOfListOfGenres());
        }
    };
    public static final IN<IH<ListOfTags>> u = new IN<IH<ListOfTags>>() { // from class: o.djb.7
        @Override // o.IN
        /* renamed from: c */
        public IH<ListOfTags> d() {
            return IH.d(new ListOfTags());
        }
    };
    public static final IN<IH<LanguageListImpl>> q = new IN<IH<LanguageListImpl>>() { // from class: o.djb.14
        @Override // o.IN
        /* renamed from: c */
        public IH<LanguageListImpl> d() {
            return IH.d(new LanguageListImpl());
        }
    };
    public static IN<SearchTrackableListSummary> t = new IN<SearchTrackableListSummary>() { // from class: o.djb.12
        @Override // o.IN
        /* renamed from: b */
        public SearchTrackableListSummary d() {
            return new SearchTrackableListSummary();
        }
    };
    public static IN<SearchSectionSummaryImpl> s = new IN<SearchSectionSummaryImpl>() { // from class: o.djb.15
        @Override // o.IN
        /* renamed from: e */
        public SearchSectionSummaryImpl d() {
            return new SearchSectionSummaryImpl();
        }
    };

    /* renamed from: o  reason: collision with root package name */
    public static final IN<C8338diW> f13846o = new IN<C8338diW>() { // from class: o.djb.19
        @Override // o.IN
        /* renamed from: c */
        public C8338diW d() {
            return new C8338diW();
        }
    };
    public static final IN<SummarizedList<C8334diS, SearchTrackableListSummary>> v = new IN<SummarizedList<C8334diS, SearchTrackableListSummary>>() { // from class: o.djb.20
        @Override // o.IN
        /* renamed from: e */
        public SummarizedList<C8334diS, SearchTrackableListSummary> d() {
            return new SummarizedList<>(C8370djb.k, C8370djb.t);
        }
    };
    public static IN<C8334diS> k = new IN<C8334diS>() { // from class: o.djb.17
        @Override // o.IN
        /* renamed from: c */
        public C8334diS d() {
            return new C8334diS();
        }
    };
    public static IN<C8337diV> l = new IN<C8337diV>() { // from class: o.djb.16
        @Override // o.IN
        /* renamed from: e */
        public C8337diV d() {
            return new C8337diV();
        }
    };
    public static IN<C8333diR> h = new IN<C8333diR>() { // from class: o.djb.18
        @Override // o.IN
        /* renamed from: e */
        public C8333diR d() {
            return new C8333diR();
        }
    };
    public static final IN<SummarizedList<C8333diR, TrackableListSummaryImpl>> A = new IN<SummarizedList<C8333diR, TrackableListSummaryImpl>>() { // from class: o.djb.24
        @Override // o.IN
        /* renamed from: e */
        public SummarizedList<C8333diR, TrackableListSummaryImpl> d() {
            return new SummarizedList<>(C8370djb.h, C8370djb.C);
        }
    };
    public static final IN<SummarizedList<C8333diR, ListOfMoviesSummaryImpl>> y = new IN<SummarizedList<C8333diR, ListOfMoviesSummaryImpl>>() { // from class: o.djb.23
        @Override // o.IN
        /* renamed from: e */
        public SummarizedList<C8333diR, ListOfMoviesSummaryImpl> d() {
            return new SummarizedList<>(C8370djb.h, C8370djb.g);
        }
    };
    public static final IN<BillboardSummaryImpl> e = new IN<BillboardSummaryImpl>() { // from class: o.djb.30
        @Override // o.IN
        /* renamed from: e */
        public BillboardSummaryImpl d() {
            return new BillboardSummaryImpl();
        }
    };
    public static final IN<NapaPageSummaryImpl> F = new IN<NapaPageSummaryImpl>() { // from class: o.djb.27
        @Override // o.IN
        /* renamed from: a */
        public NapaPageSummaryImpl d() {
            return new NapaPageSummaryImpl();
        }
    };
    public static final IN<BranchMap<NapaPageSummaryImpl>> d = new IN<BranchMap<NapaPageSummaryImpl>>() { // from class: o.djb.28
        @Override // o.IN
        /* renamed from: e */
        public BranchMap<NapaPageSummaryImpl> d() {
            return new BranchMap<>(C8370djb.F);
        }
    };
    public static final IN<TallPanelAsset> w = new IN<TallPanelAsset>() { // from class: o.djb.31
        @Override // o.IN
        /* renamed from: a */
        public TallPanelAsset d() {
            return new TallPanelAsset();
        }
    };
    public static final IN<FalkorStringPrimitive> D = new IN() { // from class: o.djc
        @Override // o.IN
        public final Object d() {
            FalkorStringPrimitive f2;
            f2 = C8370djb.f();
            return f2;
        }
    };
    public static IN<SummarizedList<IF, SearchSectionSummaryImpl>> z = new IN() { // from class: o.djd
        @Override // o.IN
        public final Object d() {
            SummarizedList h2;
            h2 = C8370djb.h();
            return h2;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ GameScreenshotImpl g() {
        return new GameScreenshotImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ListOfMoviesSummaryImpl j() {
        return new ListOfMoviesSummaryImpl();
    }

    public static IN<C8335diT> n(final InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        return new IN<C8335diT>() { // from class: o.djb.13
            @Override // o.IN
            /* renamed from: e */
            public C8335diT d() {
                return new C8335diT(InterfaceC1240Ub.this);
            }
        };
    }

    public static IN<C8329diN> o(final InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        return new IN<C8329diN>() { // from class: o.djb.22
            @Override // o.IN
            /* renamed from: e */
            public C8329diN d() {
                return new C8329diN(InterfaceC1240Ub.this);
            }
        };
    }

    public static IN<C8326diK> h(final InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        return new IN<C8326diK>() { // from class: o.djb.21
            @Override // o.IN
            /* renamed from: c */
            public C8326diK d() {
                return new C8326diK(InterfaceC1240Ub.this);
            }
        };
    }

    public static IN<C8325diJ> f(final InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        return new IN<C8325diJ>() { // from class: o.djb.26
            @Override // o.IN
            /* renamed from: a */
            public C8325diJ d() {
                return new C8325diJ(InterfaceC1240Ub.this);
            }
        };
    }

    public static IN<UserNotificationsListSummary> i(InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        return new IN<UserNotificationsListSummary>() { // from class: o.djb.29
            @Override // o.IN
            /* renamed from: a */
            public UserNotificationsListSummary d() {
                return UserNotificationsListSummary.create();
            }
        };
    }

    public static SummarizedList<IF, UserNotificationsListSummary> g(InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        return new SummarizedList<>(n, i(interfaceC1240Ub));
    }

    public static IN<FalkorBillboardData> c() {
        return new IN<FalkorBillboardData>() { // from class: o.djb.34
            @Override // o.IN
            /* renamed from: b */
            public FalkorBillboardData d() {
                return new FalkorBillboardData(C8370djb.e);
            }
        };
    }

    public static IN<C8330diO> j(final InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        return new IN<C8330diO>() { // from class: o.djb.35
            @Override // o.IN
            /* renamed from: c */
            public C8330diO d() {
                return new C8330diO(InterfaceC1240Ub.this);
            }
        };
    }

    public static IN<C8327diL> c(final InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        return new IN<C8327diL>() { // from class: o.djb.32
            @Override // o.IN
            /* renamed from: e */
            public C8327diL d() {
                return new C8327diL(InterfaceC1240Ub.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FalkorStringPrimitive f() {
        return new FalkorStringPrimitive("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SummarizedList h() {
        return new SummarizedList(n, s);
    }

    public static IN<C8369dja> k(final InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        return new IN() { // from class: o.djf
            @Override // o.IN
            public final Object d() {
                C8369dja s2;
                s2 = C8370djb.s(InterfaceC1240Ub.this);
                return s2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C8369dja s(InterfaceC1240Ub interfaceC1240Ub) {
        return new C8369dja(interfaceC1240Ub);
    }

    public static IN<SummarizedList<C8369dja, ListOfMoviesSummaryImpl>> l(final InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        return new IN() { // from class: o.djg
            @Override // o.IN
            public final Object d() {
                SummarizedList r2;
                r2 = C8370djb.r(InterfaceC1240Ub.this);
                return r2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SummarizedList r(InterfaceC1240Ub interfaceC1240Ub) {
        return new SummarizedList(k(interfaceC1240Ub), g);
    }

    public static IN<C8328diM> d(final InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        return new IN() { // from class: o.diX
            @Override // o.IN
            public final Object d() {
                C8328diM m2;
                m2 = C8370djb.m(InterfaceC1240Ub.this);
                return m2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C8328diM m(InterfaceC1240Ub interfaceC1240Ub) {
        return new C8328diM(interfaceC1240Ub);
    }
}
