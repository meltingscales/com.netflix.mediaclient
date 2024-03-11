package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.graphqlrepo.api.kotlinx.NetflixGraphQLException;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.home.api.Params;
import com.netflix.mediaclient.ui.home.api.repository.MismatchedRowException;
import com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$clearActionsUpToId$1;
import com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$findRowVideos$1;
import com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$3;
import com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$4;
import com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$observeLiveState$$inlined$flatMapLatest$1;
import com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$observeRecentlyWatchedState$1;
import com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$onStart$2;
import com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$setupVideoWatcher$2;
import com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$setupVideoWatcher$4;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeRepositoryBinding;
import com.netflix.mediaclient.util.ConnectivityUtils;
import dagger.Lazy;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.AbstractC5100bsQ;
import o.AbstractC6677chn;
import o.AbstractC8918fl;
import o.C1596aHd;
import o.C1875aRm;
import o.C4001bSo;
import o.C4002bSp;
import o.C4003bSq;
import o.C4029bTp;
import o.C4049bUi;
import o.C4054bUn;
import o.C5843cKk;
import o.C8566dqi;
import o.C8569dql;
import o.C8572dqo;
import o.C8576dqs;
import o.C8632dsu;
import o.C8670due;
import o.C8927fu;
import o.C8932fz;
import o.C8971gl;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC4004bSr;
import o.InterfaceC4005bSs;
import o.InterfaceC5146btJ;
import o.InterfaceC5155btS;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.aCP;
import o.aCR;
import o.aCS;
import o.aQS;
import o.bSG;
import o.bTF;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.dtQ;
import o.dxD;
import org.linphone.core.Privacy;

/* loaded from: classes4.dex */
public final class bTF extends AbstractC8919fm<C4049bUi> {
    public static final d c = new d(null);
    private final Lazy<C6004cQk> a;
    private final C2865aoD b;
    private final Context d;
    private Disposable e;
    private final InterfaceC4004bSr f;
    private final Set<Integer> g;
    private Bundle h;
    private final dwQ i;
    private final bSG j;
    private boolean k;
    private final Lazy<InterfaceC6910cmH> l;
    private long m;
    private final bZI n;

    /* renamed from: o  reason: collision with root package name */
    private long f13540o;
    private final Lazy<InterfaceC6909cmG> p;
    private final CompositeDisposable q;
    private dxD r;
    private final Lazy<InterfaceC7303ctf> s;
    private final C1567aGb t;
    private dxD u;
    private AbstractC5100bsQ v;

    public final void c(Bundle bundle) {
        this.h = bundle;
    }

    public final void d(AbstractC5100bsQ abstractC5100bsQ) {
        this.v = abstractC5100bsQ;
    }

    public final Bundle h() {
        return this.h;
    }

    public final AbstractC5100bsQ i() {
        return this.v;
    }

    /* loaded from: classes4.dex */
    public static final class e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((InterfaceC5222bug) t).getPosition()), Integer.valueOf(((InterfaceC5222bug) t2).getPosition()));
            return compareValues;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements dyS<C4049bUi> {
        final /* synthetic */ dyS e;

        public b(dyS dys) {
            this.e = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super C4049bUi> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object collect = this.e.collect(new AnonymousClass4(dyq), interfaceC8585dra);
            return collect == C8588drd.c() ? collect : dpR.c;
        }

        /* renamed from: o.bTF$b$4  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass4<T> implements dyQ {
            final /* synthetic */ dyQ a;

            public AnonymousClass4(dyQ dyq) {
                this.a = dyq;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, o.InterfaceC8585dra r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$$inlined$filter$1$2$1 r0 = (com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$$inlined$filter$1$2$1) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.b = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$$inlined$filter$1$2$1 r0 = new com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$$inlined$filter$1$2$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.e
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r8)
                    goto L7c
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    o.C8556dpz.d(r8)
                    o.dyQ r8 = r6.a
                    r2 = r7
                    o.bUi r2 = (o.C4049bUi) r2
                    o.fl r4 = r2.r()
                    boolean r4 = r4 instanceof o.C8971gl
                    if (r4 == 0) goto L7c
                    o.fl r2 = r2.r()
                    o.gl r2 = (o.C8971gl) r2
                    java.lang.Object r2 = r2.c()
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    boolean r4 = r2 instanceof java.util.Collection
                    if (r4 == 0) goto L5b
                    r4 = r2
                    java.util.Collection r4 = (java.util.Collection) r4
                    boolean r4 = r4.isEmpty()
                    if (r4 == 0) goto L5b
                    goto L7c
                L5b:
                    java.util.Iterator r2 = r2.iterator()
                L5f:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L7c
                    java.lang.Object r4 = r2.next()
                    com.netflix.mediaclient.servicemgr.interface_.LoMo r4 = (com.netflix.mediaclient.servicemgr.interface_.LoMo) r4
                    com.netflix.mediaclient.servicemgr.interface_.LoMoType r4 = r4.getType()
                    com.netflix.mediaclient.servicemgr.interface_.LoMoType r5 = com.netflix.mediaclient.servicemgr.interface_.LoMoType.MY_DOWNLOADS
                    if (r4 != r5) goto L5f
                    r0.b = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L7c
                    return r1
                L7c:
                    o.dpR r7 = o.dpR.c
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: o.bTF.b.AnonymousClass4.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public bTF(@Assisted C4049bUi c4049bUi, @Assisted InterfaceC4004bSr interfaceC4004bSr, C1567aGb c1567aGb, bZI bzi, Lazy<InterfaceC7303ctf> lazy, Lazy<InterfaceC6910cmH> lazy2, Lazy<InterfaceC6909cmG> lazy3, Lazy<C6004cQk> lazy4, @ApplicationContext Context context, aDB adb, dwQ dwq, @Assisted bSG bsg) {
        super(c4049bUi);
        C8632dsu.c((Object) c4049bUi, "");
        C8632dsu.c((Object) interfaceC4004bSr, "");
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) bzi, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) lazy2, "");
        C8632dsu.c((Object) lazy3, "");
        C8632dsu.c((Object) lazy4, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) adb, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) bsg, "");
        this.f = interfaceC4004bSr;
        this.t = c1567aGb;
        this.n = bzi;
        this.s = lazy;
        this.l = lazy2;
        this.p = lazy3;
        this.a = lazy4;
        this.d = context;
        this.i = dwq;
        this.j = bsg;
        this.q = new CompositeDisposable();
        Set<Integer> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        C8632dsu.a(synchronizedSet, "");
        this.g = synchronizedSet;
        this.b = adb.b();
        if (C8153dex.B() && C8632dsu.c((Object) c4049bUi.b(), (Object) "myProfile")) {
            o();
            l();
            n();
        }
        a(c4049bUi.b());
        m();
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp implements InterfaceC8906fZ<bTF, C4049bUi> {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("GraphQLLolomoViewModel");
        }

        public bTF create(AbstractC8979gt abstractC8979gt, C4049bUi c4049bUi) {
            Object e;
            InterfaceC4004bSr c;
            Object e2;
            Object e3;
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c4049bUi, "");
            Object c2 = abstractC8979gt.c();
            if (c4049bUi.b() != null) {
                if (c2 instanceof NetflixActivityBase) {
                    e3 = c2;
                } else if (c2 instanceof Fragment) {
                    e3 = ((Fragment) c2).requireActivity();
                } else if (!(c2 instanceof View)) {
                    throw new IllegalStateException("Injecting profile scoped object into " + c2 + " is not supported");
                } else {
                    e3 = C8141del.e((View) c2);
                }
                C8632dsu.d(e3);
                c = ((GraphQLHomeRepositoryBinding.a) C1642aIw.b((NetflixActivityBase) e3, GraphQLHomeRepositoryBinding.a.class)).i().c(c4049bUi.b());
            } else {
                if (c2 instanceof NetflixActivityBase) {
                    e = c2;
                } else if (c2 instanceof Fragment) {
                    e = ((Fragment) c2).requireActivity();
                } else if (!(c2 instanceof View)) {
                    throw new IllegalStateException("Injecting profile scoped object into " + c2 + " is not supported");
                } else {
                    e = C8141del.e((View) c2);
                }
                C8632dsu.d(e);
                c = ((InterfaceC4005bSs.c) C1642aIw.b((NetflixActivityBase) e, InterfaceC4005bSs.c.class)).c();
            }
            boolean z = c2 instanceof NetflixActivityBase;
            if (z) {
                e2 = c2;
            } else if (c2 instanceof Fragment) {
                e2 = ((Fragment) c2).requireActivity();
            } else if (!(c2 instanceof View)) {
                throw new IllegalStateException("Injecting profile scoped object into " + c2 + " is not supported");
            } else {
                e2 = C8141del.e((View) c2);
            }
            C8632dsu.d(e2);
            InterfaceC4051bUk h = ((InterfaceC4057bUq) C1642aIw.b((NetflixActivityBase) e2, InterfaceC4057bUq.class)).h();
            if (!z) {
                if (c2 instanceof Fragment) {
                    c2 = ((Fragment) c2).requireActivity();
                } else if (!(c2 instanceof View)) {
                    throw new IllegalStateException("Injecting profile scoped object into " + c2 + " is not supported");
                } else {
                    c2 = C8141del.e((View) c2);
                }
            }
            C8632dsu.d(c2);
            return h.d(c4049bUi, c, ((bSG.e) C1642aIw.b((NetflixActivityBase) c2, bSG.e.class)).l());
        }

        /* renamed from: initialState */
        public C4049bUi m3164initialState(AbstractC8979gt abstractC8979gt) {
            List<Integer> i;
            ArrayList arrayList;
            String str;
            String str2;
            GenreItem d;
            GenreItem d2;
            int trackId;
            GenreItem d3;
            C8632dsu.c((Object) abstractC8979gt, "");
            i = C8569dql.i();
            String str3 = null;
            if (abstractC8979gt instanceof C8925fs) {
                Bundle arguments = ((C8925fs) abstractC8979gt).e().getArguments();
                Params.Lolomo lolomo = arguments != null ? (Params.Lolomo) arguments.getParcelable("com.netflix.mediaclient.ui.home.impl.lolomo.Params.Lolomo") : null;
                String id = (lolomo == null || (d3 = lolomo.d()) == null) ? null : d3.getId();
                ArrayList arrayList2 = new ArrayList();
                if (lolomo != null && (d2 = lolomo.d()) != null && (trackId = d2.getTrackId()) != -220) {
                    arrayList2.add(Integer.valueOf(trackId));
                }
                if (lolomo != null && (d = lolomo.d()) != null) {
                    str3 = d.getParentPageUUID();
                }
                str = id;
                arrayList = arrayList2;
                str2 = str3;
            } else {
                arrayList = i;
                str = null;
                str2 = null;
            }
            return c(str, arrayList, null, null, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C4049bUi c(String str, List<Integer> list, AbstractC6677chn abstractC6677chn, AbstractC6677chn abstractC6677chn2, String str2) {
            if (C8632dsu.c((Object) str, (Object) "games")) {
                return new C4049bUi(BrowseExperience.a(), "games", null, null, null, null, null, null, null, null, null, true, null, null, true, false, false, null, null, null, null, 0, false, 0, null, 33535996, null);
            }
            return new C4049bUi(BrowseExperience.a(), str, null, list, null, null, null, null, null, null, null, false, abstractC6677chn, abstractC6677chn2, false, false, false, (C1875aRm.a.d() && C8632dsu.c((Object) str, (Object) "mobileFeeds")) ? new C4029bTp(null, null, null, 7, null) : null, null, null, null, 0, false, 0, str2, 16633844, null);
        }
    }

    @Override // o.AbstractC8919fm, o.AbstractC8899fS
    public void d() {
        this.f.b();
        super.d();
    }

    public static /* synthetic */ int c(bTF btf, LoMoType loMoType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            loMoType = LoMoType.STANDARD;
        }
        return btf.b(loMoType, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b(LoMoType loMoType, String str) {
        if (C8632dsu.c((Object) str, (Object) "mobileFeeds")) {
            return 10;
        }
        return C4000bSn.b(this.d, loMoType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d(int i, String str) {
        if (C8632dsu.c((Object) str, (Object) "mobileFeeds")) {
            return 20;
        }
        aQS.d dVar = aQS.a;
        if (dVar.b() && str == null) {
            return dVar.e().d();
        }
        return C8153dex.e(i == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final String str, final List<Integer> list, final AbstractC6677chn abstractC6677chn, final AbstractC6677chn abstractC6677chn2, final String str2) {
        b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$resetToInitialStateState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final C4049bUi invoke(C4049bUi c4049bUi) {
                C4049bUi c2;
                C8632dsu.c((Object) c4049bUi, "");
                c2 = bTF.c.c(str, list, abstractC6677chn, abstractC6677chn2, str2);
                return c2;
            }
        });
        a(str);
    }

    private final void a(String str) {
        C1875aRm.d dVar = C1875aRm.a;
        if (dVar.d() && C8632dsu.c((Object) str, (Object) "mobileFeeds")) {
            dxD dxd = this.u;
            if (dxd != null) {
                dxD.b.b(dxd, null, 1, null);
            }
            this.p.get().a();
            this.u = dyR.e(dyR.a(dyR.d(dyR.c(a(), new drX<C4049bUi, C4049bUi, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$setupVideoWatcher$1
                @Override // o.drX
                /* renamed from: d */
                public final Boolean invoke(C4049bUi c4049bUi, C4049bUi c4049bUi2) {
                    C8632dsu.c((Object) c4049bUi, "");
                    C8632dsu.c((Object) c4049bUi2, "");
                    return Boolean.valueOf(C8632dsu.c(c4049bUi.u(), c4049bUi2.u()));
                }
            }), 0, new GraphQLLolomoViewModel$setupVideoWatcher$2(this, null), 1, null), this.i), e());
        }
        if (C1864aRb.b.a().b() || (dVar.d() && C8632dsu.c((Object) str, (Object) "mobileFeeds"))) {
            dxD dxd2 = this.r;
            if (dxd2 != null) {
                dxD.b.b(dxd2, null, 1, null);
            }
            this.l.get().d();
            this.r = dyR.e(dyR.a(dyR.d(dyR.c(a(), new drX<C4049bUi, C4049bUi, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$setupVideoWatcher$3
                @Override // o.drX
                /* renamed from: c */
                public final Boolean invoke(C4049bUi c4049bUi, C4049bUi c4049bUi2) {
                    C8632dsu.c((Object) c4049bUi, "");
                    C8632dsu.c((Object) c4049bUi2, "");
                    return Boolean.valueOf(C8632dsu.c(c4049bUi.u(), c4049bUi2.u()));
                }
            }), 0, new GraphQLLolomoViewModel$setupVideoWatcher$4(this, null), 1, null), this.i), e());
        }
    }

    private final void m() {
        dyR.e(dyR.a(dyR.c(dyR.c(a(), new drX<C4049bUi, C4049bUi, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$observeLiveState$1
            @Override // o.drX
            /* renamed from: e */
            public final Boolean invoke(C4049bUi c4049bUi, C4049bUi c4049bUi2) {
                C8632dsu.c((Object) c4049bUi, "");
                C8632dsu.c((Object) c4049bUi2, "");
                return Boolean.valueOf(C8632dsu.c(c4049bUi.u(), c4049bUi2.u()));
            }
        }), (InterfaceC8612dsa) new GraphQLLolomoViewModel$observeLiveState$$inlined$flatMapLatest$1(null, this)), this.i), e());
    }

    private final void o() {
        dyR.e(dyR.a(dyR.a((dyS) this.f.d(), (drX) new GraphQLLolomoViewModel$observeRecentlyWatchedState$1(this, null)), this.i), e());
    }

    private final void l() {
        b bVar = new b(dyR.c(a(), new drX<C4049bUi, C4049bUi, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$1
            @Override // o.drX
            /* renamed from: b */
            public final Boolean invoke(C4049bUi c4049bUi, C4049bUi c4049bUi2) {
                C8632dsu.c((Object) c4049bUi, "");
                C8632dsu.c((Object) c4049bUi2, "");
                List<LoMo> c2 = c4049bUi.r().c();
                Integer valueOf = c2 != null ? Integer.valueOf(c2.size()) : null;
                List<LoMo> c3 = c4049bUi2.r().c();
                return Boolean.valueOf(C8632dsu.c(valueOf, c3 != null ? Integer.valueOf(c3.size()) : null));
            }
        }));
        Observable<AbstractC7233csO> j = AbstractC7233csO.j();
        C8632dsu.a(j, "");
        dyR.e(dyR.a(dyR.a(dyR.b(bVar, C7672dBb.d(j), new GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$3(null)), (drX) new GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$4(this, null)), this.i), e());
    }

    @SuppressLint({"CheckResult"})
    private final void n() {
        String a = this.t.a();
        Observable<Integer> startWith = C8119deP.a(a).startWith(Integer.valueOf(C8119deP.d(a)));
        C8632dsu.a(startWith, "");
        b(SubscribersKt.subscribeBy$default(startWith, (drM) null, (drO) null, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$observeNotifications$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                e(num);
                return dpR.c;
            }

            public final void e(final Integer num) {
                bTF.this.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$observeNotifications$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: d */
                    public final C4049bUi invoke(C4049bUi c4049bUi) {
                        C4049bUi d2;
                        C8632dsu.c((Object) c4049bUi, "");
                        C5843cKk b2 = c4049bUi.s().b();
                        Integer num2 = num;
                        C8632dsu.a(num2, "");
                        d2 = c4049bUi.d((r43 & 1) != 0 ? c4049bUi.l : false, (r43 & 2) != 0 ? c4049bUi.a : null, (r43 & 4) != 0 ? c4049bUi.q : null, (r43 & 8) != 0 ? c4049bUi.w : null, (r43 & 16) != 0 ? c4049bUi.m : null, (r43 & 32) != 0 ? c4049bUi.u : null, (r43 & 64) != 0 ? c4049bUi.y : null, (r43 & 128) != 0 ? c4049bUi.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi.z : null, (r43 & 512) != 0 ? c4049bUi.i : null, (r43 & 1024) != 0 ? c4049bUi.d : null, (r43 & 2048) != 0 ? c4049bUi.b : false, (r43 & 4096) != 0 ? c4049bUi.r : null, (r43 & 8192) != 0 ? c4049bUi.t : null, (r43 & 16384) != 0 ? c4049bUi.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi.h : false, (r43 & 131072) != 0 ? c4049bUi.e : null, (r43 & 262144) != 0 ? c4049bUi.x : null, (r43 & 524288) != 0 ? c4049bUi.n : null, (r43 & 1048576) != 0 ? c4049bUi.p : C4054bUn.d(c4049bUi.s(), C5843cKk.c(b2, null, null, num2.intValue(), 3, null), false, 2, null), (r43 & 2097152) != 0 ? c4049bUi.c : 0, (r43 & 4194304) != 0 ? c4049bUi.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi.j : 0, (r43 & 16777216) != 0 ? c4049bUi.s : null);
                        return d2;
                    }
                });
            }
        }, 3, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<Integer> c(C4049bUi c4049bUi) {
        Set<Integer> W;
        Collection i;
        Integer valueOf;
        String aH_;
        AbstractC8918fl<List<LoMo>> r = c4049bUi.r();
        if (!(r instanceof C8971gl)) {
            return dqL.a();
        }
        ArrayList<LoMo> arrayList = new ArrayList();
        for (Object obj : (Iterable) ((C8971gl) r).c()) {
            if (((LoMo) obj).b()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (LoMo loMo : arrayList) {
            AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>> abstractC8918fl = c4049bUi.u().get(loMo.getId());
            if (!(abstractC8918fl instanceof C8971gl)) {
                i = C8569dql.i();
            } else {
                i = new ArrayList();
                for (InterfaceC5222bug interfaceC5222bug : (Iterable) ((C8971gl) abstractC8918fl).c()) {
                    if (loMo.getType() == LoMoType.BILLBOARD) {
                        valueOf = null;
                        InterfaceC5180btr interfaceC5180btr = interfaceC5222bug instanceof InterfaceC5180btr ? (InterfaceC5180btr) interfaceC5222bug : null;
                        if (interfaceC5180btr != null && (aH_ = interfaceC5180btr.aH_()) != null) {
                            C8632dsu.d((Object) aH_);
                            valueOf = Integer.valueOf(Integer.parseInt(aH_));
                        }
                    } else {
                        String id = interfaceC5222bug.getVideo().getId();
                        C8632dsu.a(id, "");
                        valueOf = Integer.valueOf(Integer.parseInt(id));
                    }
                    if (valueOf != null) {
                        i.add(valueOf);
                    }
                }
            }
            C8571dqn.b(arrayList2, i);
        }
        W = C8576dqs.W(arrayList2);
        return W;
    }

    public final void j() {
        Disposable disposable = this.e;
        if (disposable != null) {
            disposable.dispose();
        }
        Single<AbstractC5100bsQ> b2 = InterfaceC4360bcz.b.a().b();
        final drM<AbstractC5100bsQ, dpR> drm = new drM<AbstractC5100bsQ, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$onStart$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC5100bsQ abstractC5100bsQ) {
                c(abstractC5100bsQ);
                return dpR.c;
            }

            public final void c(AbstractC5100bsQ abstractC5100bsQ) {
                bTF.this.d(abstractC5100bsQ);
            }
        };
        Consumer<? super AbstractC5100bsQ> consumer = new Consumer() { // from class: o.bTG
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                bTF.f(drM.this, obj);
            }
        };
        final GraphQLLolomoViewModel$onStart$2 graphQLLolomoViewModel$onStart$2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$onStart$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                Map d2;
                Map k;
                Throwable th2;
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                String str = "Got an exception when create a videoGroup: " + th.getLocalizedMessage();
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b3 = c1596aHd.b();
                    if (b3 != null) {
                        c1596aHd.a(errorType.c() + " " + b3);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        };
        this.e = b2.subscribe(consumer, new Consumer() { // from class: o.bTE
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                bTF.h(drM.this, obj);
            }
        });
        this.k = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final void f() {
        Disposable disposable = this.e;
        if (disposable != null) {
            disposable.dispose();
        }
        this.e = null;
        AbstractC5100bsQ abstractC5100bsQ = this.v;
        if (abstractC5100bsQ != null) {
            abstractC5100bsQ.e();
        }
        this.v = null;
        this.k = true;
    }

    public static /* synthetic */ void c(bTF btf, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            str = null;
        }
        btf.c(i, i2, str);
    }

    public final void c(final int i, final int i2, final String str) {
        e(new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                a(c4049bUi);
                return dpR.c;
            }

            public final void a(final C4049bUi c4049bUi) {
                int d2;
                InterfaceC4004bSr interfaceC4004bSr;
                Disposable b2;
                C8632dsu.c((Object) c4049bUi, "");
                InterfaceC5155btS c2 = c4049bUi.n().c();
                if ((c4049bUi.n() instanceof C8932fz) || (c4049bUi.r() instanceof C8932fz)) {
                    return;
                }
                if (c2 == null) {
                    bTF.this.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1.1
                        @Override // o.drM
                        /* renamed from: a */
                        public final C4049bUi invoke(C4049bUi c4049bUi2) {
                            C4049bUi d3;
                            C8632dsu.c((Object) c4049bUi2, "");
                            d3 = c4049bUi2.d((r43 & 1) != 0 ? c4049bUi2.l : false, (r43 & 2) != 0 ? c4049bUi2.a : null, (r43 & 4) != 0 ? c4049bUi2.q : null, (r43 & 8) != 0 ? c4049bUi2.w : null, (r43 & 16) != 0 ? c4049bUi2.m : new C8932fz(null, 1, null), (r43 & 32) != 0 ? c4049bUi2.u : new C8932fz(null, 1, null), (r43 & 64) != 0 ? c4049bUi2.y : null, (r43 & 128) != 0 ? c4049bUi2.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi2.z : null, (r43 & 512) != 0 ? c4049bUi2.i : null, (r43 & 1024) != 0 ? c4049bUi2.d : null, (r43 & 2048) != 0 ? c4049bUi2.b : false, (r43 & 4096) != 0 ? c4049bUi2.r : null, (r43 & 8192) != 0 ? c4049bUi2.t : null, (r43 & 16384) != 0 ? c4049bUi2.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi2.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi2.h : false, (r43 & 131072) != 0 ? c4049bUi2.e : null, (r43 & 262144) != 0 ? c4049bUi2.x : null, (r43 & 524288) != 0 ? c4049bUi2.n : null, (r43 & 1048576) != 0 ? c4049bUi2.p : null, (r43 & 2097152) != 0 ? c4049bUi2.c : 0, (r43 & 4194304) != 0 ? c4049bUi2.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi2.j : 0, (r43 & 16777216) != 0 ? c4049bUi2.s : null);
                            return d3;
                        }
                    });
                    d2 = bTF.this.d(0, c4049bUi.b());
                    int c3 = bTF.c(bTF.this, null, c4049bUi.b(), 1, null);
                    bTF btf = bTF.this;
                    interfaceC4004bSr = btf.f;
                    Single<C4001bSo> a = interfaceC4004bSr.a(d2, c3, c4049bUi.t(), i, i2, str, c4049bUi.p());
                    final bTF btf2 = bTF.this;
                    drM<Throwable, dpR> drm = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1.2
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(Throwable th) {
                            a(th);
                            return dpR.c;
                        }

                        public final void a(final Throwable th) {
                            C8632dsu.c((Object) th, "");
                            bTF.d dVar = bTF.c;
                            bTF.this.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel.fetchLolomo.1.2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                /* renamed from: b */
                                public final C4049bUi invoke(C4049bUi c4049bUi2) {
                                    C4049bUi d3;
                                    C8632dsu.c((Object) c4049bUi2, "");
                                    d3 = c4049bUi2.d((r43 & 1) != 0 ? c4049bUi2.l : false, (r43 & 2) != 0 ? c4049bUi2.a : null, (r43 & 4) != 0 ? c4049bUi2.q : null, (r43 & 8) != 0 ? c4049bUi2.w : null, (r43 & 16) != 0 ? c4049bUi2.m : new C8927fu(th, null, 2, null), (r43 & 32) != 0 ? c4049bUi2.u : new C8927fu(th, null, 2, null), (r43 & 64) != 0 ? c4049bUi2.y : null, (r43 & 128) != 0 ? c4049bUi2.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi2.z : null, (r43 & 512) != 0 ? c4049bUi2.i : null, (r43 & 1024) != 0 ? c4049bUi2.d : null, (r43 & 2048) != 0 ? c4049bUi2.b : false, (r43 & 4096) != 0 ? c4049bUi2.r : null, (r43 & 8192) != 0 ? c4049bUi2.t : null, (r43 & 16384) != 0 ? c4049bUi2.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi2.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi2.h : false, (r43 & 131072) != 0 ? c4049bUi2.e : null, (r43 & 262144) != 0 ? c4049bUi2.x : null, (r43 & 524288) != 0 ? c4049bUi2.n : null, (r43 & 1048576) != 0 ? c4049bUi2.p : null, (r43 & 2097152) != 0 ? c4049bUi2.c : 0, (r43 & 4194304) != 0 ? c4049bUi2.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi2.j : 0, (r43 & 16777216) != 0 ? c4049bUi2.s : null);
                                    return d3;
                                }
                            });
                        }
                    };
                    final bTF btf3 = bTF.this;
                    b2 = btf.b(SubscribersKt.subscribeBy(a, drm, new drM<C4001bSo, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(C4001bSo c4001bSo) {
                            d(c4001bSo);
                            return dpR.c;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
                        /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
                        /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
                        /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
                        /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
                        /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void d(final o.C4001bSo r13) {
                            /*
                                r12 = this;
                                java.lang.String r0 = ""
                                o.C8632dsu.c(r13, r0)
                                o.btS r2 = r13.b()
                                r0 = 0
                                if (r2 == 0) goto Lce
                                o.bUi r1 = r2
                                o.bTF r11 = o.bTF.this
                                java.lang.String r3 = r2.getLolomoId()
                                if (r3 == 0) goto Lc2
                                long r5 = java.lang.System.currentTimeMillis()
                                java.util.List r3 = r13.e()
                                r4 = 0
                                if (r3 == 0) goto L2e
                                java.lang.Object r3 = o.C8570dqm.a(r3, r4)
                                o.bSq r3 = (o.C4003bSq) r3
                                if (r3 == 0) goto L2e
                                com.netflix.mediaclient.servicemgr.interface_.LoMo r3 = r3.b()
                                goto L2f
                            L2e:
                                r3 = r0
                            L2f:
                                if (r3 == 0) goto L36
                                com.netflix.mediaclient.servicemgr.interface_.LoMoType r7 = r3.getType()
                                goto L37
                            L36:
                                r7 = r0
                            L37:
                                com.netflix.mediaclient.servicemgr.interface_.LoMoType r8 = com.netflix.mediaclient.servicemgr.interface_.LoMoType.BILLBOARD
                                r9 = 1
                                if (r7 != r8) goto L44
                                int r7 = r3.getLength()
                                if (r7 <= 0) goto L44
                                r7 = r9
                                goto L45
                            L44:
                                r7 = r4
                            L45:
                                if (r3 == 0) goto L4c
                                com.netflix.mediaclient.servicemgr.interface_.LoMoType r8 = r3.getType()
                                goto L4d
                            L4c:
                                r8 = r0
                            L4d:
                                com.netflix.mediaclient.servicemgr.interface_.LoMoType r10 = com.netflix.mediaclient.servicemgr.interface_.LoMoType.GAME_BILLBOARD
                                if (r8 != r10) goto L57
                                int r8 = r3.getLength()
                                if (r8 > 0) goto L63
                            L57:
                                if (r3 == 0) goto L5e
                                com.netflix.mediaclient.servicemgr.interface_.LoMoType r3 = r3.getType()
                                goto L5f
                            L5e:
                                r3 = r0
                            L5f:
                                com.netflix.mediaclient.servicemgr.interface_.LoMoType r8 = com.netflix.mediaclient.servicemgr.interface_.LoMoType.GAME_FEATURE_EDUCATION
                                if (r3 != r8) goto L65
                            L63:
                                r8 = r9
                                goto L66
                            L65:
                                r8 = r4
                            L66:
                                java.util.List r3 = r13.e()
                                if (r3 == 0) goto L8f
                                java.util.ArrayList r4 = new java.util.ArrayList
                                r9 = 10
                                int r9 = o.C8570dqm.a(r3, r9)
                                r4.<init>(r9)
                                java.util.Iterator r3 = r3.iterator()
                            L7b:
                                boolean r9 = r3.hasNext()
                                if (r9 == 0) goto L90
                                java.lang.Object r9 = r3.next()
                                o.bSq r9 = (o.C4003bSq) r9
                                com.netflix.mediaclient.servicemgr.interface_.LoMo r9 = r9.b()
                                r4.add(r9)
                                goto L7b
                            L8f:
                                r4 = r0
                            L90:
                                if (r4 == 0) goto La0
                                boolean r3 = r4.isEmpty()
                                if (r3 == 0) goto L99
                                goto La0
                            L99:
                                o.gl r0 = new o.gl
                                r0.<init>(r4)
                                r4 = r0
                                goto Lac
                            La0:
                                o.fu r3 = new o.fu
                                java.lang.Throwable r4 = new java.lang.Throwable
                                r4.<init>()
                                r9 = 2
                                r3.<init>(r4, r0, r9, r0)
                                r4 = r3
                            Lac:
                                com.netflix.mediaclient.clutils.TrackingInfoHolder r0 = r1.o()
                                com.netflix.mediaclient.clutils.TrackingInfoHolder r3 = r0.b(r2)
                                com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1$3$1$2 r0 = new com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1$3$1$2
                                r1 = r0
                                r9 = r13
                                r10 = r11
                                r1.<init>()
                                o.bTF.b(r11, r0)
                                o.dpR r0 = o.dpR.c
                                goto Lce
                            Lc2:
                                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                                java.lang.String r0 = "LolomoId is required"
                                java.lang.String r0 = r0.toString()
                                r13.<init>(r0)
                                throw r13
                            Lce:
                                if (r0 != 0) goto Ld7
                                o.bTF r13 = o.bTF.this
                                com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1$3$2$1 r0 = new o.drM<o.C4049bUi, o.C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1$3$2$1
                                    static {
                                        /*
                                            com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1$3$2$1 r0 = new com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1$3$2$1
                                            r0.<init>()
                                            
                                            // error: 0x0005: SPUT  (r0 I:com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1$3$2$1) com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1$3$2$1.a com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1$3$2$1
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1$3$2$1.<clinit>():void");
                                    }

                                    {
                                        /*
                                            r1 = this;
                                            r0 = 1
                                            r1.<init>(r0)
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1$3$2$1.<init>():void");
                                    }

                                    @Override // o.drM
                                    public /* synthetic */ o.C4049bUi invoke(o.C4049bUi r1) {
                                        /*
                                            r0 = this;
                                            o.bUi r1 = (o.C4049bUi) r1
                                            o.bUi r1 = r0.invoke(r1)
                                            return r1
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1$3$2$1.invoke(java.lang.Object):java.lang.Object");
                                    }

                                    @Override // o.drM
                                    /* renamed from: a */
                                    public final o.C4049bUi invoke(o.C4049bUi r29) {
                                        /*
                                            r28 = this;
                                            r0 = r29
                                            java.lang.String r1 = ""
                                            r2 = r29
                                            o.C8632dsu.c(r2, r1)
                                            o.fu r1 = new o.fu
                                            r5 = r1
                                            java.lang.Throwable r2 = new java.lang.Throwable
                                            r2.<init>()
                                            r3 = 0
                                            r4 = 2
                                            r1.<init>(r2, r3, r4, r3)
                                            o.fu r1 = new o.fu
                                            r6 = r1
                                            java.lang.Throwable r2 = new java.lang.Throwable
                                            r2.<init>()
                                            r1.<init>(r2, r3, r4, r3)
                                            r1 = 0
                                            r2 = 0
                                            r4 = 0
                                            r7 = 0
                                            r8 = 0
                                            r9 = 0
                                            r10 = 0
                                            r11 = 0
                                            r12 = 0
                                            r13 = 0
                                            r14 = 0
                                            r15 = 0
                                            r16 = 0
                                            r17 = 0
                                            r18 = 0
                                            r19 = 0
                                            r20 = 0
                                            r21 = 0
                                            r22 = 0
                                            r23 = 0
                                            r24 = 0
                                            r25 = 0
                                            r26 = 33554383(0x1ffffcf, float:9.4039273E-38)
                                            r27 = 0
                                            o.bUi r0 = o.C4049bUi.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                                            return r0
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1$3$2$1.invoke(o.bUi):o.bUi");
                                    }
                                }
                                o.bTF.b(r13, r0)
                            Ld7:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchLolomo$1.AnonymousClass3.d(o.bSo):void");
                        }
                    }));
                    btf.a(b2);
                    return;
                }
                List<LoMo> c4 = c4049bUi.r().c();
                if (c4 != null) {
                    ArrayList<LoMo> arrayList = new ArrayList();
                    for (Object obj : c4) {
                        if (((LoMo) obj).isVolatile()) {
                            arrayList.add(obj);
                        }
                    }
                    bTF btf4 = bTF.this;
                    for (LoMo loMo : arrayList) {
                        btf4.c(loMo);
                    }
                }
            }
        });
    }

    public final void k() {
        final aQS.e e2 = aQS.a.e();
        if (e2.b()) {
            e(new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$removeLastPageIfNotSeen$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                    a(c4049bUi);
                    return dpR.c;
                }

                public final void a(C4049bUi c4049bUi) {
                    C8632dsu.c((Object) c4049bUi, "");
                    if (c4049bUi.b() != null) {
                        return;
                    }
                    if (c4049bUi.r() instanceof C8971gl) {
                        List list = (List) ((C8971gl) c4049bUi.r()).c();
                        if (c4049bUi.j() < list.size() - aQS.e.this.d()) {
                            final List subList = list.subList(0, Math.max(0, list.size() - aQS.e.this.d()));
                            bTF.c.getLogTag();
                            this.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$removeLastPageIfNotSeen$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                /* renamed from: c */
                                public final C4049bUi invoke(C4049bUi c4049bUi2) {
                                    C4049bUi d2;
                                    C8632dsu.c((Object) c4049bUi2, "");
                                    d2 = c4049bUi2.d((r43 & 1) != 0 ? c4049bUi2.l : false, (r43 & 2) != 0 ? c4049bUi2.a : null, (r43 & 4) != 0 ? c4049bUi2.q : null, (r43 & 8) != 0 ? c4049bUi2.w : null, (r43 & 16) != 0 ? c4049bUi2.m : null, (r43 & 32) != 0 ? c4049bUi2.u : new C8971gl(subList), (r43 & 64) != 0 ? c4049bUi2.y : null, (r43 & 128) != 0 ? c4049bUi2.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi2.z : null, (r43 & 512) != 0 ? c4049bUi2.i : null, (r43 & 1024) != 0 ? c4049bUi2.d : null, (r43 & 2048) != 0 ? c4049bUi2.b : false, (r43 & 4096) != 0 ? c4049bUi2.r : null, (r43 & 8192) != 0 ? c4049bUi2.t : null, (r43 & 16384) != 0 ? c4049bUi2.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi2.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi2.h : false, (r43 & 131072) != 0 ? c4049bUi2.e : null, (r43 & 262144) != 0 ? c4049bUi2.x : null, (r43 & 524288) != 0 ? c4049bUi2.n : null, (r43 & 1048576) != 0 ? c4049bUi2.p : null, (r43 & 2097152) != 0 ? c4049bUi2.c : 0, (r43 & 4194304) != 0 ? c4049bUi2.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi2.j : 0, (r43 & 16777216) != 0 ? c4049bUi2.s : null);
                                    return d2;
                                }
                            });
                            return;
                        }
                        bTF.c.getLogTag();
                        return;
                    }
                    bTF.c.getLogTag();
                }
            });
        }
    }

    public final void b(final int i) {
        e(new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$onRowAtPositionBound$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                d(c4049bUi);
                return dpR.c;
            }

            public final void d(C4049bUi c4049bUi) {
                C8632dsu.c((Object) c4049bUi, "");
                if (i > c4049bUi.j()) {
                    bTF btf = this;
                    final int i2 = i;
                    btf.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$onRowAtPositionBound$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        /* renamed from: b */
                        public final C4049bUi invoke(C4049bUi c4049bUi2) {
                            C4049bUi d2;
                            C8632dsu.c((Object) c4049bUi2, "");
                            d2 = c4049bUi2.d((r43 & 1) != 0 ? c4049bUi2.l : false, (r43 & 2) != 0 ? c4049bUi2.a : null, (r43 & 4) != 0 ? c4049bUi2.q : null, (r43 & 8) != 0 ? c4049bUi2.w : null, (r43 & 16) != 0 ? c4049bUi2.m : null, (r43 & 32) != 0 ? c4049bUi2.u : null, (r43 & 64) != 0 ? c4049bUi2.y : null, (r43 & 128) != 0 ? c4049bUi2.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi2.z : null, (r43 & 512) != 0 ? c4049bUi2.i : null, (r43 & 1024) != 0 ? c4049bUi2.d : null, (r43 & 2048) != 0 ? c4049bUi2.b : false, (r43 & 4096) != 0 ? c4049bUi2.r : null, (r43 & 8192) != 0 ? c4049bUi2.t : null, (r43 & 16384) != 0 ? c4049bUi2.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi2.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi2.h : false, (r43 & 131072) != 0 ? c4049bUi2.e : null, (r43 & 262144) != 0 ? c4049bUi2.x : null, (r43 & 524288) != 0 ? c4049bUi2.n : null, (r43 & 1048576) != 0 ? c4049bUi2.p : null, (r43 & 2097152) != 0 ? c4049bUi2.c : 0, (r43 & 4194304) != 0 ? c4049bUi2.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi2.j : i2, (r43 & 16777216) != 0 ? c4049bUi2.s : null);
                            return d2;
                        }
                    });
                }
            }
        });
    }

    public final void a(final int i) {
        e(new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchMoreRows$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                e(c4049bUi);
                return dpR.c;
            }

            public final void e(final C4049bUi c4049bUi) {
                InterfaceC4004bSr interfaceC4004bSr;
                int d2;
                LoMo loMo;
                Disposable b2;
                Object f;
                C8632dsu.c((Object) c4049bUi, "");
                InterfaceC5155btS c2 = c4049bUi.n().c();
                if (c2 == null || (c4049bUi.r() instanceof C8932fz)) {
                    return;
                }
                final List<LoMo> c3 = c4049bUi.r().c();
                if (c3 == null || c3.size() <= i) {
                    this.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchMoreRows$1.1
                        @Override // o.drM
                        /* renamed from: c */
                        public final C4049bUi invoke(C4049bUi c4049bUi2) {
                            C4049bUi d3;
                            C8632dsu.c((Object) c4049bUi2, "");
                            d3 = c4049bUi2.d((r43 & 1) != 0 ? c4049bUi2.l : false, (r43 & 2) != 0 ? c4049bUi2.a : null, (r43 & 4) != 0 ? c4049bUi2.q : null, (r43 & 8) != 0 ? c4049bUi2.w : null, (r43 & 16) != 0 ? c4049bUi2.m : null, (r43 & 32) != 0 ? c4049bUi2.u : new C8932fz(c4049bUi2.r().c()), (r43 & 64) != 0 ? c4049bUi2.y : null, (r43 & 128) != 0 ? c4049bUi2.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi2.z : null, (r43 & 512) != 0 ? c4049bUi2.i : null, (r43 & 1024) != 0 ? c4049bUi2.d : null, (r43 & 2048) != 0 ? c4049bUi2.b : false, (r43 & 4096) != 0 ? c4049bUi2.r : null, (r43 & 8192) != 0 ? c4049bUi2.t : null, (r43 & 16384) != 0 ? c4049bUi2.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi2.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi2.h : false, (r43 & 131072) != 0 ? c4049bUi2.e : null, (r43 & 262144) != 0 ? c4049bUi2.x : null, (r43 & 524288) != 0 ? c4049bUi2.n : null, (r43 & 1048576) != 0 ? c4049bUi2.p : null, (r43 & 2097152) != 0 ? c4049bUi2.c : 0, (r43 & 4194304) != 0 ? c4049bUi2.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi2.j : 0, (r43 & 16777216) != 0 ? c4049bUi2.s : null);
                            return d3;
                        }
                    });
                    bTF btf = this;
                    interfaceC4004bSr = btf.f;
                    d2 = this.d(i, c4049bUi.b());
                    List<LoMo> c4 = c4049bUi.r().c();
                    if (c4 != null) {
                        f = C8576dqs.f((List<? extends Object>) c4, i - 1);
                        loMo = (LoMo) f;
                    } else {
                        loMo = null;
                    }
                    Single<List<C4003bSq>> c5 = interfaceC4004bSr.c(c2, d2, loMo, Integer.valueOf(bTF.c(this, null, c4049bUi.b(), 1, null)));
                    final bTF btf2 = this;
                    drM<Throwable, dpR> drm = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchMoreRows$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(Throwable th) {
                            b(th);
                            return dpR.c;
                        }

                        public final void b(final Throwable th) {
                            Map d3;
                            Map k;
                            Throwable th2;
                            C8632dsu.c((Object) th, "");
                            List<LoMo> c6 = C4049bUi.this.r().c();
                            if (c6 == null || c6.isEmpty()) {
                                btf2.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel.fetchMoreRows.1.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // o.drM
                                    /* renamed from: d */
                                    public final C4049bUi invoke(C4049bUi c4049bUi2) {
                                        C4049bUi d4;
                                        C8632dsu.c((Object) c4049bUi2, "");
                                        d4 = c4049bUi2.d((r43 & 1) != 0 ? c4049bUi2.l : false, (r43 & 2) != 0 ? c4049bUi2.a : null, (r43 & 4) != 0 ? c4049bUi2.q : null, (r43 & 8) != 0 ? c4049bUi2.w : null, (r43 & 16) != 0 ? c4049bUi2.m : null, (r43 & 32) != 0 ? c4049bUi2.u : new C8927fu(th, null, 2, null), (r43 & 64) != 0 ? c4049bUi2.y : null, (r43 & 128) != 0 ? c4049bUi2.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi2.z : null, (r43 & 512) != 0 ? c4049bUi2.i : null, (r43 & 1024) != 0 ? c4049bUi2.d : null, (r43 & 2048) != 0 ? c4049bUi2.b : false, (r43 & 4096) != 0 ? c4049bUi2.r : null, (r43 & 8192) != 0 ? c4049bUi2.t : null, (r43 & 16384) != 0 ? c4049bUi2.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi2.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi2.h : false, (r43 & 131072) != 0 ? c4049bUi2.e : null, (r43 & 262144) != 0 ? c4049bUi2.x : null, (r43 & 524288) != 0 ? c4049bUi2.n : null, (r43 & 1048576) != 0 ? c4049bUi2.p : null, (r43 & 2097152) != 0 ? c4049bUi2.c : 0, (r43 & 4194304) != 0 ? c4049bUi2.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi2.j : 0, (r43 & 16777216) != 0 ? c4049bUi2.s : null);
                                        return d4;
                                    }
                                });
                            } else {
                                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                                ErrorType errorType = ErrorType.l;
                                d3 = dqE.d();
                                k = dqE.k(d3);
                                C1596aHd c1596aHd = new C1596aHd("vertical pagination failed", th, errorType, false, k, false, false, 96, null);
                                ErrorType errorType2 = c1596aHd.a;
                                if (errorType2 != null) {
                                    c1596aHd.e.put("errorType", errorType2.c());
                                    String b3 = c1596aHd.b();
                                    if (b3 != null) {
                                        String c7 = errorType2.c();
                                        c1596aHd.a(c7 + " " + b3);
                                    }
                                }
                                if (c1596aHd.b() != null && c1596aHd.i != null) {
                                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                                } else if (c1596aHd.b() != null) {
                                    th2 = new Throwable(c1596aHd.b());
                                } else {
                                    th2 = c1596aHd.i;
                                    if (th2 == null) {
                                        th2 = new Throwable("Handled exception with no message");
                                    } else if (th2 == null) {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                                InterfaceC1598aHf a = dVar.a();
                                if (a != null) {
                                    a.e(c1596aHd, th2);
                                } else {
                                    dVar.e().b(c1596aHd, th2);
                                }
                            }
                            if (!aCP.c(th) && !aCP.a(th)) {
                                throw th;
                            }
                        }
                    };
                    final bTF btf3 = this;
                    b2 = btf.b(SubscribersKt.subscribeBy(c5, drm, new drM<List<? extends C4003bSq>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchMoreRows$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        /* renamed from: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchMoreRows$1$3$e */
                        /* loaded from: classes4.dex */
                        public static final class e<T> implements Comparator {
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                int compareValues;
                                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((LoMo) t).getListPos()), Integer.valueOf(((LoMo) t2).getListPos()));
                                return compareValues;
                            }
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(List<? extends C4003bSq> list) {
                            e(list);
                            return dpR.c;
                        }

                        public final void e(final List<C4003bSq> list) {
                            int d3;
                            List g;
                            dtQ C;
                            dtQ g2;
                            dtQ b3;
                            final List q;
                            C8632dsu.c((Object) list, "");
                            List<LoMo> list2 = c3;
                            if (list2 == null) {
                                list2 = C8569dql.i();
                            }
                            d3 = C8572dqo.d(list, 10);
                            ArrayList arrayList = new ArrayList(d3);
                            for (C4003bSq c4003bSq : list) {
                                arrayList.add(c4003bSq.b());
                            }
                            g = C8576dqs.g((Collection) list2, (Iterable) arrayList);
                            C = C8576dqs.C((Iterable) g);
                            g2 = C8670due.g(C, new drM<LoMo, Integer>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchMoreRows$1$3$rows$1
                                @Override // o.drM
                                /* renamed from: b */
                                public final Integer invoke(LoMo loMo2) {
                                    C8632dsu.c((Object) loMo2, "");
                                    return Integer.valueOf(loMo2.getListPos());
                                }
                            });
                            b3 = C8670due.b(g2, (Comparator) new e());
                            q = C8670due.q(b3);
                            final bTF btf4 = btf3;
                            btf4.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel.fetchMoreRows.1.3.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                /* renamed from: c */
                                public final C4049bUi invoke(C4049bUi c4049bUi2) {
                                    C4049bUi d4;
                                    C4049bUi d5;
                                    C8632dsu.c((Object) c4049bUi2, "");
                                    bTF btf5 = bTF.this;
                                    d4 = c4049bUi2.d((r43 & 1) != 0 ? c4049bUi2.l : false, (r43 & 2) != 0 ? c4049bUi2.a : null, (r43 & 4) != 0 ? c4049bUi2.q : null, (r43 & 8) != 0 ? c4049bUi2.w : null, (r43 & 16) != 0 ? c4049bUi2.m : null, (r43 & 32) != 0 ? c4049bUi2.u : new C8971gl(q), (r43 & 64) != 0 ? c4049bUi2.y : null, (r43 & 128) != 0 ? c4049bUi2.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi2.z : null, (r43 & 512) != 0 ? c4049bUi2.i : null, (r43 & 1024) != 0 ? c4049bUi2.d : null, (r43 & 2048) != 0 ? c4049bUi2.b : false, (r43 & 4096) != 0 ? c4049bUi2.r : null, (r43 & 8192) != 0 ? c4049bUi2.t : null, (r43 & 16384) != 0 ? c4049bUi2.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi2.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi2.h : false, (r43 & 131072) != 0 ? c4049bUi2.e : null, (r43 & 262144) != 0 ? c4049bUi2.x : null, (r43 & 524288) != 0 ? c4049bUi2.n : null, (r43 & 1048576) != 0 ? c4049bUi2.p : null, (r43 & 2097152) != 0 ? c4049bUi2.c : 0, (r43 & 4194304) != 0 ? c4049bUi2.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi2.j : 0, (r43 & 16777216) != 0 ? c4049bUi2.s : null);
                                    d5 = btf5.d(d4, list);
                                    return d5;
                                }
                            });
                        }
                    }));
                    btf.a(b2);
                }
            }
        });
    }

    public static /* synthetic */ void a(bTF btf, LoMo loMo, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        btf.d(loMo, i, z);
    }

    public final void d(final LoMo loMo, final int i, final boolean z) {
        C8632dsu.c((Object) loMo, "");
        e(new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchTitles$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                c(c4049bUi);
                return dpR.c;
            }

            public final void c(C4049bUi c4049bUi) {
                InterfaceC4004bSr interfaceC4004bSr;
                Disposable b2;
                List<InterfaceC5222bug<? extends InterfaceC5223buh>> c2;
                Object f;
                Map d2;
                Map k;
                Throwable th;
                C8632dsu.c((Object) c4049bUi, "");
                if (z) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd("`forceFetch` should not be used in GraphQL world", null, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b3 = c1596aHd.b();
                        if (b3 != null) {
                            String c3 = errorType.c();
                            c1596aHd.a(c3 + " " + b3);
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
                AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>> abstractC8918fl = c4049bUi.u().get(loMo.getId());
                InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug = null;
                List<InterfaceC5222bug<? extends InterfaceC5223buh>> c4 = abstractC8918fl != null ? abstractC8918fl.c() : null;
                if (c4 == null || c4.size() <= i) {
                    if (c4049bUi.n() instanceof C8971gl) {
                        AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>> abstractC8918fl2 = c4049bUi.u().get(loMo.getId());
                        if (abstractC8918fl2 != null && (c2 = abstractC8918fl2.c()) != null) {
                            f = C8576dqs.f((List<? extends Object>) c2, i - 1);
                            interfaceC5222bug = (InterfaceC5222bug) f;
                        }
                        bTF btf = this;
                        final LoMo loMo2 = loMo;
                        btf.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchTitles$1.1
                            {
                                super(1);
                            }

                            @Override // o.drM
                            /* renamed from: a */
                            public final C4049bUi invoke(C4049bUi c4049bUi2) {
                                Map k2;
                                C4049bUi d3;
                                C8632dsu.c((Object) c4049bUi2, "");
                                k2 = dqE.k(c4049bUi2.u());
                                String id = LoMo.this.getId();
                                AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>> abstractC8918fl3 = c4049bUi2.u().get(LoMo.this.getId());
                                k2.put(id, new C8932fz(abstractC8918fl3 != null ? abstractC8918fl3.c() : null));
                                d3 = c4049bUi2.d((r43 & 1) != 0 ? c4049bUi2.l : false, (r43 & 2) != 0 ? c4049bUi2.a : null, (r43 & 4) != 0 ? c4049bUi2.q : null, (r43 & 8) != 0 ? c4049bUi2.w : null, (r43 & 16) != 0 ? c4049bUi2.m : null, (r43 & 32) != 0 ? c4049bUi2.u : null, (r43 & 64) != 0 ? c4049bUi2.y : k2, (r43 & 128) != 0 ? c4049bUi2.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi2.z : null, (r43 & 512) != 0 ? c4049bUi2.i : null, (r43 & 1024) != 0 ? c4049bUi2.d : null, (r43 & 2048) != 0 ? c4049bUi2.b : false, (r43 & 4096) != 0 ? c4049bUi2.r : null, (r43 & 8192) != 0 ? c4049bUi2.t : null, (r43 & 16384) != 0 ? c4049bUi2.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi2.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi2.h : false, (r43 & 131072) != 0 ? c4049bUi2.e : null, (r43 & 262144) != 0 ? c4049bUi2.x : null, (r43 & 524288) != 0 ? c4049bUi2.n : null, (r43 & 1048576) != 0 ? c4049bUi2.p : null, (r43 & 2097152) != 0 ? c4049bUi2.c : 0, (r43 & 4194304) != 0 ? c4049bUi2.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi2.j : 0, (r43 & 16777216) != 0 ? c4049bUi2.s : null);
                                return d3;
                            }
                        });
                        int length = loMo.d() ? loMo.getLength() : this.b(loMo.getType(), c4049bUi.b());
                        bTF btf2 = this;
                        interfaceC4004bSr = btf2.f;
                        InterfaceC5155btS c5 = c4049bUi.n().c();
                        C8632dsu.d(c5);
                        Single<List<C4002bSp>> c6 = interfaceC4004bSr.c(c5, loMo, length, interfaceC5222bug);
                        final bTF btf3 = this;
                        final LoMo loMo3 = loMo;
                        drM<Throwable, dpR> drm = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchTitles$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(Throwable th2) {
                                d(th2);
                                return dpR.c;
                            }

                            public final void d(final Throwable th2) {
                                C8632dsu.c((Object) th2, "");
                                bTF btf4 = bTF.this;
                                final LoMo loMo4 = loMo3;
                                btf4.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel.fetchTitles.1.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // o.drM
                                    /* renamed from: e */
                                    public final C4049bUi invoke(C4049bUi c4049bUi2) {
                                        Map k2;
                                        Map l;
                                        C4049bUi d3;
                                        C8632dsu.c((Object) c4049bUi2, "");
                                        k2 = dqE.k(c4049bUi2.u());
                                        AbstractC8918fl abstractC8918fl3 = (AbstractC8918fl) k2.get(LoMo.this.getId());
                                        List list = abstractC8918fl3 != null ? (List) abstractC8918fl3.c() : null;
                                        if (list == null || list.isEmpty()) {
                                            k2.put(LoMo.this.getId(), new C8927fu(th2, null, 2, null));
                                            l = dqE.l(k2);
                                            d3 = c4049bUi2.d((r43 & 1) != 0 ? c4049bUi2.l : false, (r43 & 2) != 0 ? c4049bUi2.a : null, (r43 & 4) != 0 ? c4049bUi2.q : null, (r43 & 8) != 0 ? c4049bUi2.w : null, (r43 & 16) != 0 ? c4049bUi2.m : null, (r43 & 32) != 0 ? c4049bUi2.u : null, (r43 & 64) != 0 ? c4049bUi2.y : l, (r43 & 128) != 0 ? c4049bUi2.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi2.z : null, (r43 & 512) != 0 ? c4049bUi2.i : null, (r43 & 1024) != 0 ? c4049bUi2.d : null, (r43 & 2048) != 0 ? c4049bUi2.b : false, (r43 & 4096) != 0 ? c4049bUi2.r : null, (r43 & 8192) != 0 ? c4049bUi2.t : null, (r43 & 16384) != 0 ? c4049bUi2.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi2.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi2.h : false, (r43 & 131072) != 0 ? c4049bUi2.e : null, (r43 & 262144) != 0 ? c4049bUi2.x : null, (r43 & 524288) != 0 ? c4049bUi2.n : null, (r43 & 1048576) != 0 ? c4049bUi2.p : null, (r43 & 2097152) != 0 ? c4049bUi2.c : 0, (r43 & 4194304) != 0 ? c4049bUi2.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi2.j : 0, (r43 & 16777216) != 0 ? c4049bUi2.s : null);
                                            return d3;
                                        }
                                        return c4049bUi2;
                                    }
                                });
                                if (!aCP.a(th2) && !aCP.c(th2)) {
                                    throw th2;
                                }
                            }
                        };
                        final bTF btf4 = this;
                        final LoMo loMo4 = loMo;
                        b2 = btf2.b(SubscribersKt.subscribeBy(c6, drm, new drM<List<? extends C4002bSp>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchTitles$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(List<? extends C4002bSp> list) {
                                e(list);
                                return dpR.c;
                            }

                            public final void e(List<C4002bSp> list) {
                                C8632dsu.c((Object) list, "");
                                bTF.this.d(loMo4, list);
                            }
                        }));
                        btf2.a(b2);
                        return;
                    }
                    bTF.d dVar2 = bTF.c;
                }
            }
        });
    }

    public final void c(final LoMo loMo) {
        C8632dsu.c((Object) loMo, "");
        e(new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$refreshList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                b(c4049bUi);
                return dpR.c;
            }

            public final void b(C4049bUi c4049bUi) {
                Map d2;
                Map k;
                Throwable th;
                InterfaceC4004bSr interfaceC4004bSr;
                Disposable b2;
                C8632dsu.c((Object) c4049bUi, "");
                final InterfaceC5155btS c2 = c4049bUi.n().c();
                final String listContext = LoMo.this.getListContext();
                int c3 = bTF.c(this, null, c4049bUi.b(), 1, null);
                if (c2 != null) {
                    if (listContext != null) {
                        bTF btf = this;
                        interfaceC4004bSr = btf.f;
                        Completable c4 = interfaceC4004bSr.c(c2.getId(), LoMo.this.getId(), listContext, Integer.valueOf(LoMo.this.getListPos()), null, "lomo.refreshIfExpired", Integer.valueOf(c3));
                        final bTF btf2 = this;
                        final LoMo loMo2 = LoMo.this;
                        drM<Throwable, dpR> drm = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$refreshList$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(Throwable th2) {
                                b(th2);
                                return dpR.c;
                            }

                            public final void b(Throwable th2) {
                                Map<String, String> d3;
                                Map k2;
                                Throwable th3;
                                Context context;
                                long j;
                                aCR b3;
                                C8632dsu.c((Object) th2, "");
                                d3 = dqE.d();
                                boolean z = false;
                                if (th2 instanceof NetflixGraphQLException) {
                                    NetflixGraphQLException netflixGraphQLException = (NetflixGraphQLException) th2;
                                    Map<String, String> a = netflixGraphQLException.a();
                                    if (a == null) {
                                        a = dqE.d();
                                    }
                                    List<aCS> d4 = netflixGraphQLException.d();
                                    if (d4 != null && !d4.isEmpty()) {
                                        Iterator<T> it = d4.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            aCS acs = (aCS) it.next();
                                            if (((acs == null || (b3 = acs.b()) == null) ? null : b3.c()) == com.netflix.mediaclient.graphqlrepo.api.errors.ErrorType.e) {
                                                z = true;
                                                break;
                                            }
                                        }
                                    }
                                    d3 = a;
                                } else if (th2 instanceof MismatchedRowException) {
                                    z = ConfigFastPropertyFeatureControlConfig.Companion.E();
                                }
                                if (z) {
                                    context = bTF.this.d;
                                    if (ConnectivityUtils.l(context)) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        j = bTF.this.m;
                                        if (currentTimeMillis > j + TimeUnit.MINUTES.toMillis(5L)) {
                                            bTF.this.m = currentTimeMillis;
                                            bTF.d(bTF.this, 1, 0, null, 6, null);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                if (aCP.a(th2) || aCP.c(th2)) {
                                    return;
                                }
                                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                                k2 = dqE.k(d3);
                                C1596aHd c1596aHd = new C1596aHd("Refresh failed for lolomo=" + c2.getId() + ", list=" + loMo2.getListId() + ", context=" + listContext, th2, null, false, k2, false, false, 96, null);
                                ErrorType errorType = c1596aHd.a;
                                if (errorType != null) {
                                    c1596aHd.e.put("errorType", errorType.c());
                                    String b4 = c1596aHd.b();
                                    if (b4 != null) {
                                        c1596aHd.a(errorType.c() + " " + b4);
                                    }
                                }
                                if (c1596aHd.b() != null && c1596aHd.i != null) {
                                    th3 = new Throwable(c1596aHd.b(), c1596aHd.i);
                                } else if (c1596aHd.b() != null) {
                                    th3 = new Throwable(c1596aHd.b());
                                } else {
                                    th3 = c1596aHd.i;
                                    if (th3 == null) {
                                        th3 = new Throwable("Handled exception with no message");
                                    } else if (th3 == null) {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                                InterfaceC1598aHf a2 = dVar.a();
                                if (a2 != null) {
                                    a2.e(c1596aHd, th3);
                                } else {
                                    dVar.e().b(c1596aHd, th3);
                                }
                            }
                        };
                        final bTF btf3 = this;
                        b2 = btf.b(SubscribersKt.subscribeBy(c4, drm, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$refreshList$1.2
                            {
                                super(0);
                            }

                            @Override // o.drO
                            public /* synthetic */ dpR invoke() {
                                e();
                                return dpR.c;
                            }

                            public final void e() {
                                bTF.this.m = 0L;
                            }
                        }));
                        btf.a(b2);
                        return;
                    }
                    InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                    String id = c2.getId();
                    String listId = LoMo.this.getListId();
                    String title = LoMo.this.getTitle();
                    aVar.a(id + "/" + listId + "/" + title);
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd("refreshList attempted on null listContext", null, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b3 = c1596aHd.b();
                        if (b3 != null) {
                            String c5 = errorType.c();
                            c1596aHd.a(c5 + " " + b3);
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
        });
    }

    public static /* synthetic */ void d(bTF btf, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        btf.a(i, z);
    }

    public final void a(final int i, final boolean z) {
        e(new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchRow$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                d(c4049bUi);
                return dpR.c;
            }

            public final void d(C4049bUi c4049bUi) {
                final LoMo loMo;
                Set set;
                Set set2;
                Map d2;
                Map k;
                Throwable th;
                InterfaceC4004bSr interfaceC4004bSr;
                Disposable b2;
                Object f;
                C8632dsu.c((Object) c4049bUi, "");
                List<LoMo> c2 = c4049bUi.r().c();
                if (c2 != null) {
                    f = C8576dqs.f((List<? extends Object>) c2, i);
                    loMo = (LoMo) f;
                } else {
                    loMo = null;
                }
                InterfaceC5155btS c3 = c4049bUi.n().c();
                final String listContext = loMo != null ? loMo.getListContext() : null;
                List<LoMo> c4 = c4049bUi.r().c();
                int c5 = bTF.c(this, null, c4049bUi.b(), 1, null);
                if ((c4049bUi.n() instanceof C8932fz) || c3 == null || c4 == null || loMo == null) {
                    return;
                }
                set = this.g;
                if (!set.contains(Integer.valueOf(loMo.getListPos()))) {
                    set2 = this.g;
                    set2.add(Integer.valueOf(loMo.getListPos()));
                    if (listContext != null) {
                        bTF btf = this;
                        interfaceC4004bSr = btf.f;
                        Single<C4003bSq> c6 = interfaceC4004bSr.c(c3, i, c5, z);
                        final bTF btf2 = this;
                        drM<Throwable, dpR> drm = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchRow$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(Throwable th2) {
                                b(th2);
                                return dpR.c;
                            }

                            public final void b(Throwable th2) {
                                Set set3;
                                Map d3;
                                Map k2;
                                Throwable th3;
                                Context context;
                                long j;
                                C8632dsu.c((Object) th2, "");
                                set3 = bTF.this.g;
                                set3.remove(Integer.valueOf(loMo.getListPos()));
                                if (th2 instanceof MismatchedRowException) {
                                    if (ConfigFastPropertyFeatureControlConfig.Companion.E()) {
                                        context = bTF.this.d;
                                        if (ConnectivityUtils.l(context)) {
                                            long currentTimeMillis = System.currentTimeMillis();
                                            j = bTF.this.f13540o;
                                            if (currentTimeMillis > j + TimeUnit.MINUTES.toMillis(5L)) {
                                                bTF.this.f13540o = currentTimeMillis;
                                                bTF.d(bTF.this, 1, 0, null, 6, null);
                                            }
                                        }
                                    }
                                } else if (aCP.c(th2) || aCP.a(th2)) {
                                } else {
                                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                                    String str = "Unexpected error in fetchRow, listContext=" + listContext;
                                    d3 = dqE.d();
                                    k2 = dqE.k(d3);
                                    C1596aHd c1596aHd = new C1596aHd(str, th2, null, false, k2, false, false, 96, null);
                                    ErrorType errorType = c1596aHd.a;
                                    if (errorType != null) {
                                        c1596aHd.e.put("errorType", errorType.c());
                                        String b3 = c1596aHd.b();
                                        if (b3 != null) {
                                            c1596aHd.a(errorType.c() + " " + b3);
                                        }
                                    }
                                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                                        th3 = new Throwable(c1596aHd.b(), c1596aHd.i);
                                    } else if (c1596aHd.b() != null) {
                                        th3 = new Throwable(c1596aHd.b());
                                    } else {
                                        th3 = c1596aHd.i;
                                        if (th3 == null) {
                                            th3 = new Throwable("Handled exception with no message");
                                        } else if (th3 == null) {
                                            throw new IllegalArgumentException("Required value was null.".toString());
                                        }
                                    }
                                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                                    InterfaceC1598aHf a = dVar.a();
                                    if (a != null) {
                                        a.e(c1596aHd, th3);
                                    } else {
                                        dVar.e().b(c1596aHd, th3);
                                    }
                                }
                            }
                        };
                        final bTF btf3 = this;
                        b2 = btf.b(SubscribersKt.subscribeBy(c6, drm, new drM<C4003bSq, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$fetchRow$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(C4003bSq c4003bSq) {
                                b(c4003bSq);
                                return dpR.c;
                            }

                            public final void b(C4003bSq c4003bSq) {
                                Set set3;
                                C8632dsu.c((Object) c4003bSq, "");
                                bTF.this.f13540o = 0L;
                                set3 = bTF.this.g;
                                set3.remove(Integer.valueOf(loMo.getListPos()));
                                final LoMo c7 = c4003bSq.c();
                                List<C4002bSp> a = c4003bSq.a();
                                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                                bTF.d dVar = bTF.c;
                                String logTag = dVar.getLogTag();
                                String id = loMo.getId();
                                String id2 = c7.getId();
                                aVar.a(logTag + ": fetchRow: oldRow id: " + id + ", newRow: " + id2);
                                if (C8632dsu.c((Object) loMo.getListContext(), (Object) c7.getListContext()) && loMo.getListPos() == c7.getListPos()) {
                                    bTF btf4 = bTF.this;
                                    final LoMo loMo2 = loMo;
                                    btf4.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel.fetchRow.1.3.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // o.drM
                                        /* renamed from: b */
                                        public final C4049bUi invoke(C4049bUi c4049bUi2) {
                                            List n;
                                            Map k2;
                                            Object obj;
                                            Map d3;
                                            Map k3;
                                            Throwable th2;
                                            List U;
                                            C4049bUi d4;
                                            C8632dsu.c((Object) c4049bUi2, "");
                                            List<LoMo> c8 = c4049bUi2.r().c();
                                            if (c8 == null || c8.isEmpty()) {
                                                return c4049bUi2;
                                            }
                                            n = C8576dqs.n(c8);
                                            k2 = dqE.k(c4049bUi2.u());
                                            if (!C8632dsu.c((Object) LoMo.this.getId(), (Object) c7.getId())) {
                                                k2.remove(LoMo.this.getId());
                                            }
                                            try {
                                                n.set(LoMo.this.getListPos(), c7);
                                            } catch (IndexOutOfBoundsException e2) {
                                                InterfaceC1593aHa.a aVar2 = InterfaceC1593aHa.c;
                                                aVar2.a("size=" + n.size());
                                                aVar2.a("row=" + LoMo.this.getListContext() + " " + LoMo.this.getListPos() + " ->  " + c7.getListPos());
                                                LoMo loMo3 = LoMo.this;
                                                Iterator it = n.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        obj = null;
                                                        break;
                                                    }
                                                    obj = it.next();
                                                    if (C8632dsu.c((Object) ((LoMo) obj).getListContext(), (Object) loMo3.getListContext())) {
                                                        break;
                                                    }
                                                }
                                                LoMo loMo4 = (LoMo) obj;
                                                aVar2.a("contains=" + (loMo4 != null ? Integer.valueOf(loMo4.getListPos()) : null));
                                                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                                                d3 = dqE.d();
                                                k3 = dqE.k(d3);
                                                C1596aHd c1596aHd = new C1596aHd("SPY-33834: GraphQLLolomoViewModel::refreshList", e2, null, true, k3, false, false, 96, null);
                                                ErrorType errorType = c1596aHd.a;
                                                if (errorType != null) {
                                                    c1596aHd.e.put("errorType", errorType.c());
                                                    String b3 = c1596aHd.b();
                                                    if (b3 != null) {
                                                        c1596aHd.a(errorType.c() + " " + b3);
                                                    }
                                                }
                                                if (c1596aHd.b() != null && c1596aHd.i != null) {
                                                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                                                } else if (c1596aHd.b() != null) {
                                                    th2 = new Throwable(c1596aHd.b());
                                                } else {
                                                    th2 = c1596aHd.i;
                                                    if (th2 == null) {
                                                        th2 = new Throwable("Handled exception with no message");
                                                    } else if (th2 == null) {
                                                        throw new IllegalArgumentException("Required value was null.".toString());
                                                    }
                                                }
                                                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                                                InterfaceC1598aHf a2 = dVar2.a();
                                                if (a2 != null) {
                                                    a2.e(c1596aHd, th2);
                                                } else {
                                                    dVar2.e().b(c1596aHd, th2);
                                                }
                                            }
                                            U = C8576dqs.U(n);
                                            d4 = c4049bUi2.d((r43 & 1) != 0 ? c4049bUi2.l : false, (r43 & 2) != 0 ? c4049bUi2.a : null, (r43 & 4) != 0 ? c4049bUi2.q : null, (r43 & 8) != 0 ? c4049bUi2.w : null, (r43 & 16) != 0 ? c4049bUi2.m : null, (r43 & 32) != 0 ? c4049bUi2.u : new C8971gl(U), (r43 & 64) != 0 ? c4049bUi2.y : k2, (r43 & 128) != 0 ? c4049bUi2.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi2.z : null, (r43 & 512) != 0 ? c4049bUi2.i : null, (r43 & 1024) != 0 ? c4049bUi2.d : null, (r43 & 2048) != 0 ? c4049bUi2.b : false, (r43 & 4096) != 0 ? c4049bUi2.r : null, (r43 & 8192) != 0 ? c4049bUi2.t : null, (r43 & 16384) != 0 ? c4049bUi2.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi2.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi2.h : false, (r43 & 131072) != 0 ? c4049bUi2.e : null, (r43 & 262144) != 0 ? c4049bUi2.x : null, (r43 & 524288) != 0 ? c4049bUi2.n : null, (r43 & 1048576) != 0 ? c4049bUi2.p : null, (r43 & 2097152) != 0 ? c4049bUi2.c : 0, (r43 & 4194304) != 0 ? c4049bUi2.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi2.j : 0, (r43 & 16777216) != 0 ? c4049bUi2.s : null);
                                            return d4;
                                        }
                                    });
                                    if (C8632dsu.c((Object) loMo.getId(), (Object) c7.getId())) {
                                        return;
                                    }
                                    bTF.this.d(c7, a);
                                    return;
                                }
                                String logTag2 = dVar.getLogTag();
                                String listContext2 = loMo.getListContext();
                                int listPos = loMo.getListPos();
                                String listContext3 = c7.getListContext();
                                int listPos2 = loMo.getListPos();
                                aVar.a(logTag2 + ": fetchRow: !!MISMATCH!! in row types: oldRow: " + listContext2 + ":" + listPos + ", newRow: " + listContext3 + ":" + listPos2);
                                throw new MismatchedRowException("SPY-34830: Mismatched row types in fetchRow", null, 2, null);
                            }
                        }));
                        btf.a(b2);
                        return;
                    }
                    InterfaceC1593aHa.c.a(c3.getId() + "/" + loMo.getListId() + "/" + loMo.getTitle());
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    ErrorType errorType = ErrorType.l;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd("refreshList attempted on null listContext", null, errorType, true, k, false, false, 96, null);
                    ErrorType errorType2 = c1596aHd.a;
                    if (errorType2 != null) {
                        c1596aHd.e.put("errorType", errorType2.c());
                        String b3 = c1596aHd.b();
                        if (b3 != null) {
                            c1596aHd.a(errorType2.c() + " " + b3);
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
                        return;
                    } else {
                        dVar.e().b(c1596aHd, th);
                        return;
                    }
                }
                bTF.c.getLogTag();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Disposable a(Disposable disposable) {
        this.q.add(disposable);
        return disposable;
    }

    public static /* synthetic */ void d(bTF btf, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            str = null;
        }
        btf.b(i, i2, str);
    }

    public final void b(int i, int i2, String str) {
        boolean z = i == 1;
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        aVar.a("LolomoViewModel::triggerFullRefresh,isHardRefresh:" + z);
        if (z) {
            this.q.clear();
            e(new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$triggerFullRefresh$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                    d(c4049bUi);
                    return dpR.c;
                }

                public final void d(C4049bUi c4049bUi) {
                    C8632dsu.c((Object) c4049bUi, "");
                    bTF.this.a(c4049bUi.b(), c4049bUi.t(), c4049bUi.m(), c4049bUi.q(), c4049bUi.p());
                }
            });
        }
        c(i, i2, str);
    }

    public final void d(final AbstractC6677chn abstractC6677chn, final AbstractC6677chn abstractC6677chn2) {
        e(new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$attachHomeScreenMessaging$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                b(c4049bUi);
                return dpR.c;
            }

            public final void b(C4049bUi c4049bUi) {
                C8632dsu.c((Object) c4049bUi, "");
                bTF btf = bTF.this;
                final AbstractC6677chn abstractC6677chn3 = abstractC6677chn;
                final AbstractC6677chn abstractC6677chn4 = abstractC6677chn2;
                btf.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$attachHomeScreenMessaging$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: b */
                    public final C4049bUi invoke(C4049bUi c4049bUi2) {
                        C4049bUi d2;
                        C8632dsu.c((Object) c4049bUi2, "");
                        d2 = c4049bUi2.d((r43 & 1) != 0 ? c4049bUi2.l : false, (r43 & 2) != 0 ? c4049bUi2.a : null, (r43 & 4) != 0 ? c4049bUi2.q : null, (r43 & 8) != 0 ? c4049bUi2.w : null, (r43 & 16) != 0 ? c4049bUi2.m : null, (r43 & 32) != 0 ? c4049bUi2.u : null, (r43 & 64) != 0 ? c4049bUi2.y : null, (r43 & 128) != 0 ? c4049bUi2.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi2.z : null, (r43 & 512) != 0 ? c4049bUi2.i : null, (r43 & 1024) != 0 ? c4049bUi2.d : null, (r43 & 2048) != 0 ? c4049bUi2.b : false, (r43 & 4096) != 0 ? c4049bUi2.r : AbstractC6677chn.this, (r43 & 8192) != 0 ? c4049bUi2.t : abstractC6677chn4, (r43 & 16384) != 0 ? c4049bUi2.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi2.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi2.h : false, (r43 & 131072) != 0 ? c4049bUi2.e : null, (r43 & 262144) != 0 ? c4049bUi2.x : null, (r43 & 524288) != 0 ? c4049bUi2.n : null, (r43 & 1048576) != 0 ? c4049bUi2.p : null, (r43 & 2097152) != 0 ? c4049bUi2.c : 0, (r43 & 4194304) != 0 ? c4049bUi2.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi2.j : 0, (r43 & 16777216) != 0 ? c4049bUi2.s : null);
                        return d2;
                    }
                });
            }
        });
    }

    public final void b(String str, drX<? super LoMo, ? super List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>, dpR> drx) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drx, "");
        e(new GraphQLLolomoViewModel$findRowVideos$1(str, drx));
    }

    public final void g() {
        b(SubscribersKt.subscribeBy$default(this.a.get().d(new C0999Ks()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$markFeatureEducationBillboardAsSeen$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                d(th);
                return dpR.c;
            }

            public final void d(Throwable th) {
                C8632dsu.c((Object) th, "");
                bTF.d dVar = bTF.c;
            }
        }, (drO) null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$markFeatureEducationBillboardAsSeen$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(Boolean bool) {
                c(bool.booleanValue());
                return dpR.c;
            }

            public final void c(boolean z) {
                bTF.c.getLogTag();
            }
        }, 2, (Object) null));
    }

    public final void d(final CollectTaste.MessageType messageType) {
        C8632dsu.c((Object) messageType, "");
        e(new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$onCollectTasteRowStateChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                e(c4049bUi);
                return dpR.c;
            }

            public final void e(C4049bUi c4049bUi) {
                C8632dsu.c((Object) c4049bUi, "");
                bTF btf = bTF.this;
                final CollectTaste.MessageType messageType2 = messageType;
                btf.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$onCollectTasteRowStateChanged$1.1
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: c */
                    public final C4049bUi invoke(C4049bUi c4049bUi2) {
                        C4049bUi d2;
                        C8632dsu.c((Object) c4049bUi2, "");
                        d2 = c4049bUi2.d((r43 & 1) != 0 ? c4049bUi2.l : false, (r43 & 2) != 0 ? c4049bUi2.a : null, (r43 & 4) != 0 ? c4049bUi2.q : null, (r43 & 8) != 0 ? c4049bUi2.w : null, (r43 & 16) != 0 ? c4049bUi2.m : null, (r43 & 32) != 0 ? c4049bUi2.u : null, (r43 & 64) != 0 ? c4049bUi2.y : null, (r43 & 128) != 0 ? c4049bUi2.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi2.z : null, (r43 & 512) != 0 ? c4049bUi2.i : null, (r43 & 1024) != 0 ? c4049bUi2.d : null, (r43 & 2048) != 0 ? c4049bUi2.b : false, (r43 & 4096) != 0 ? c4049bUi2.r : null, (r43 & 8192) != 0 ? c4049bUi2.t : null, (r43 & 16384) != 0 ? c4049bUi2.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi2.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi2.h : false, (r43 & 131072) != 0 ? c4049bUi2.e : null, (r43 & 262144) != 0 ? c4049bUi2.x : CollectTaste.MessageType.this, (r43 & 524288) != 0 ? c4049bUi2.n : null, (r43 & 1048576) != 0 ? c4049bUi2.p : null, (r43 & 2097152) != 0 ? c4049bUi2.c : 0, (r43 & 4194304) != 0 ? c4049bUi2.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi2.j : 0, (r43 & 16777216) != 0 ? c4049bUi2.s : null);
                        return d2;
                    }
                });
            }
        });
    }

    public final void b(final C4054bUn c4054bUn) {
        C8632dsu.c((Object) c4054bUn, "");
        b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$setNotificationsState$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final C4049bUi invoke(C4049bUi c4049bUi) {
                C4049bUi d2;
                C8632dsu.c((Object) c4049bUi, "");
                d2 = c4049bUi.d((r43 & 1) != 0 ? c4049bUi.l : false, (r43 & 2) != 0 ? c4049bUi.a : null, (r43 & 4) != 0 ? c4049bUi.q : null, (r43 & 8) != 0 ? c4049bUi.w : null, (r43 & 16) != 0 ? c4049bUi.m : null, (r43 & 32) != 0 ? c4049bUi.u : null, (r43 & 64) != 0 ? c4049bUi.y : null, (r43 & 128) != 0 ? c4049bUi.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi.z : null, (r43 & 512) != 0 ? c4049bUi.i : null, (r43 & 1024) != 0 ? c4049bUi.d : null, (r43 & 2048) != 0 ? c4049bUi.b : false, (r43 & 4096) != 0 ? c4049bUi.r : null, (r43 & 8192) != 0 ? c4049bUi.t : null, (r43 & 16384) != 0 ? c4049bUi.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi.h : false, (r43 & 131072) != 0 ? c4049bUi.e : null, (r43 & 262144) != 0 ? c4049bUi.x : null, (r43 & 524288) != 0 ? c4049bUi.n : null, (r43 & 1048576) != 0 ? c4049bUi.p : C4054bUn.this, (r43 & 2097152) != 0 ? c4049bUi.c : 0, (r43 & 4194304) != 0 ? c4049bUi.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi.j : 0, (r43 & 16777216) != 0 ? c4049bUi.s : null);
                return d2;
            }
        });
    }

    public static /* synthetic */ void b(bTF btf, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        btf.a(str, i);
    }

    public final void a(final String str, final int i) {
        C8632dsu.c((Object) str, "");
        e(new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$refreshInQueueStateForVideo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                b(c4049bUi);
                return dpR.c;
            }

            public final void b(C4049bUi c4049bUi) {
                C8632dsu.c((Object) c4049bUi, "");
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                String str2 = str;
                aVar.a("refresh title video id: " + str2);
                if (c4049bUi.n() instanceof C8932fz) {
                    return;
                }
                Map<String, AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>>> u = c4049bUi.u();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>>> entry : u.entrySet()) {
                    LoMo e2 = c4049bUi.e(entry.getKey());
                    if ((e2 != null ? e2.getType() : null) != LoMoType.INSTANT_QUEUE) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                String str3 = str;
                bTF btf = this;
                int i2 = i;
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str4 = (String) entry2.getKey();
                    List list = (List) ((AbstractC8918fl) entry2.getValue()).c();
                    if (list != null) {
                        int i3 = 0;
                        for (Object obj : list) {
                            if (i3 < 0) {
                                C8569dql.h();
                            }
                            InterfaceC5223buh video = ((InterfaceC5222bug) obj).getVideo();
                            if ((video instanceof InterfaceC5146btJ) && C8632dsu.c((Object) ((InterfaceC5146btJ) video).g(), (Object) str3)) {
                                btf.b(str4, i3, i2);
                            }
                            i3++;
                        }
                    }
                }
            }
        });
    }

    @SuppressLint({"CheckResult"})
    public final void e(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        Disposable subscribe = this.a.get().d(new C0992Kl(str)).subscribe();
        C8632dsu.a(subscribe, "");
        b(subscribe);
    }

    public final void d(final String str) {
        b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$setKidsMysteryBoxRevealed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final C4049bUi invoke(C4049bUi c4049bUi) {
                C4049bUi d2;
                C8632dsu.c((Object) c4049bUi, "");
                String str2 = str;
                d2 = c4049bUi.d((r43 & 1) != 0 ? c4049bUi.l : false, (r43 & 2) != 0 ? c4049bUi.a : null, (r43 & 4) != 0 ? c4049bUi.q : null, (r43 & 8) != 0 ? c4049bUi.w : null, (r43 & 16) != 0 ? c4049bUi.m : null, (r43 & 32) != 0 ? c4049bUi.u : null, (r43 & 64) != 0 ? c4049bUi.y : null, (r43 & 128) != 0 ? c4049bUi.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi.z : null, (r43 & 512) != 0 ? c4049bUi.i : null, (r43 & 1024) != 0 ? c4049bUi.d : null, (r43 & 2048) != 0 ? c4049bUi.b : false, (r43 & 4096) != 0 ? c4049bUi.r : null, (r43 & 8192) != 0 ? c4049bUi.t : null, (r43 & 16384) != 0 ? c4049bUi.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi.h : false, (r43 & 131072) != 0 ? c4049bUi.e : null, (r43 & 262144) != 0 ? c4049bUi.x : null, (r43 & 524288) != 0 ? c4049bUi.n : str2 == null ? "" : str2, (r43 & 1048576) != 0 ? c4049bUi.p : null, (r43 & 2097152) != 0 ? c4049bUi.c : 0, (r43 & 4194304) != 0 ? c4049bUi.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi.j : 0, (r43 & 16777216) != 0 ? c4049bUi.s : null);
                return d2;
            }
        });
    }

    public final void e(final int i) {
        b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$setActionBarHeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C4049bUi invoke(C4049bUi c4049bUi) {
                C4049bUi d2;
                C8632dsu.c((Object) c4049bUi, "");
                d2 = c4049bUi.d((r43 & 1) != 0 ? c4049bUi.l : false, (r43 & 2) != 0 ? c4049bUi.a : null, (r43 & 4) != 0 ? c4049bUi.q : null, (r43 & 8) != 0 ? c4049bUi.w : null, (r43 & 16) != 0 ? c4049bUi.m : null, (r43 & 32) != 0 ? c4049bUi.u : null, (r43 & 64) != 0 ? c4049bUi.y : null, (r43 & 128) != 0 ? c4049bUi.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi.z : null, (r43 & 512) != 0 ? c4049bUi.i : null, (r43 & 1024) != 0 ? c4049bUi.d : null, (r43 & 2048) != 0 ? c4049bUi.b : false, (r43 & 4096) != 0 ? c4049bUi.r : null, (r43 & 8192) != 0 ? c4049bUi.t : null, (r43 & 16384) != 0 ? c4049bUi.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi.h : false, (r43 & 131072) != 0 ? c4049bUi.e : null, (r43 & 262144) != 0 ? c4049bUi.x : null, (r43 & 524288) != 0 ? c4049bUi.n : null, (r43 & 1048576) != 0 ? c4049bUi.p : null, (r43 & 2097152) != 0 ? c4049bUi.c : i, (r43 & 4194304) != 0 ? c4049bUi.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi.j : 0, (r43 & 16777216) != 0 ? c4049bUi.s : null);
                return d2;
            }
        });
    }

    public final void c(int i) {
        b(new GraphQLLolomoViewModel$clearActionsUpToId$1(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<InterfaceC5222bug<? extends InterfaceC5223buh>> e(List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> list, int i, List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> list2) {
        List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> i2;
        List g;
        List<InterfaceC5222bug<? extends InterfaceC5223buh>> g2;
        if (list != null) {
            List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> subList = list.subList(0, i);
            if (list2.size() + i < list.size()) {
                i2 = list.subList(i + list2.size(), list.size());
            } else {
                i2 = C8569dql.i();
            }
            g = C8576dqs.g((Collection) subList, (Iterable) list2);
            g2 = C8576dqs.g((Collection) g, (Iterable) i2);
            return g2 == null ? list2 : g2;
        }
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4029bTp d(C4049bUi c4049bUi, int i) {
        Set V;
        C4029bTp D = c4049bUi.D();
        V = C8576dqs.V(D.b());
        V.add(Integer.valueOf(i));
        return C4029bTp.c(D, V, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(final LoMo loMo, final List<C4002bSp> list) {
        b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$addRowEntitiesToState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C4049bUi invoke(C4049bUi c4049bUi) {
                List e2;
                C4049bUi d2;
                C8632dsu.c((Object) c4049bUi, "");
                bTF btf = bTF.this;
                e2 = C8566dqi.e(new C4003bSq(loMo, list));
                d2 = btf.d(c4049bUi, e2);
                return d2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [o.bTL] */
    /* JADX WARN: Type inference failed for: r11v7, types: [o.bTL] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.C4049bUi d(o.C4049bUi r35, java.util.List<o.C4003bSq> r36) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bTF.d(o.bUi, java.util.List):o.bUi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final String str, final int i, final int i2) {
        e(new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$refreshInQueueStateForVideo$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                e(c4049bUi);
                return dpR.c;
            }

            public final void e(C4049bUi c4049bUi) {
                final C4029bTp d2;
                InterfaceC4004bSr interfaceC4004bSr;
                Disposable b2;
                Object f;
                C8632dsu.c((Object) c4049bUi, "");
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                String str2 = str;
                int i3 = i;
                aVar.a("refresh title " + str2 + "-" + i3);
                final LoMo e2 = c4049bUi.e(str);
                if (e2 == null) {
                    return;
                }
                AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>> abstractC8918fl = c4049bUi.u().get(str);
                InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug = null;
                List<InterfaceC5222bug<? extends InterfaceC5223buh>> c2 = abstractC8918fl != null ? abstractC8918fl.c() : null;
                if (c4049bUi.n() instanceof C8932fz) {
                    return;
                }
                int i4 = i2;
                if (i4 != -1) {
                    d2 = this.d(c4049bUi, i4);
                } else {
                    d2 = c4049bUi.e();
                }
                if (c2 != null) {
                    f = C8576dqs.f((List<? extends Object>) c2, i - 1);
                    interfaceC5222bug = (InterfaceC5222bug) f;
                }
                bTF btf = this;
                interfaceC4004bSr = btf.f;
                InterfaceC5155btS c3 = c4049bUi.n().c();
                C8632dsu.d(c3);
                Single<List<C4002bSp>> c4 = interfaceC4004bSr.c(c3, e2, 1, interfaceC5222bug);
                final bTF btf2 = this;
                drM<Throwable, dpR> drm = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$refreshInQueueStateForVideo$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        c(th);
                        return dpR.c;
                    }

                    public final void c(final Throwable th) {
                        C8632dsu.c((Object) th, "");
                        bTF btf3 = bTF.this;
                        final LoMo loMo = e2;
                        final C4029bTp c4029bTp = d2;
                        btf3.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel.refreshInQueueStateForVideo.2.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            /* renamed from: c */
                            public final C4049bUi invoke(C4049bUi c4049bUi2) {
                                Map k;
                                Map l;
                                C4049bUi d3;
                                C8632dsu.c((Object) c4049bUi2, "");
                                k = dqE.k(c4049bUi2.u());
                                AbstractC8918fl abstractC8918fl2 = (AbstractC8918fl) k.get(LoMo.this.getId());
                                List list = abstractC8918fl2 != null ? (List) abstractC8918fl2.c() : null;
                                if (list == null || list.isEmpty()) {
                                    k.put(LoMo.this.getId(), new C8927fu(th, null, 2, null));
                                    l = dqE.l(k);
                                    d3 = c4049bUi2.d((r43 & 1) != 0 ? c4049bUi2.l : false, (r43 & 2) != 0 ? c4049bUi2.a : null, (r43 & 4) != 0 ? c4049bUi2.q : null, (r43 & 8) != 0 ? c4049bUi2.w : null, (r43 & 16) != 0 ? c4049bUi2.m : null, (r43 & 32) != 0 ? c4049bUi2.u : null, (r43 & 64) != 0 ? c4049bUi2.y : l, (r43 & 128) != 0 ? c4049bUi2.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi2.z : null, (r43 & 512) != 0 ? c4049bUi2.i : null, (r43 & 1024) != 0 ? c4049bUi2.d : null, (r43 & 2048) != 0 ? c4049bUi2.b : false, (r43 & 4096) != 0 ? c4049bUi2.r : null, (r43 & 8192) != 0 ? c4049bUi2.t : null, (r43 & 16384) != 0 ? c4049bUi2.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi2.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi2.h : false, (r43 & 131072) != 0 ? c4049bUi2.e : c4029bTp, (r43 & 262144) != 0 ? c4049bUi2.x : null, (r43 & 524288) != 0 ? c4049bUi2.n : null, (r43 & 1048576) != 0 ? c4049bUi2.p : null, (r43 & 2097152) != 0 ? c4049bUi2.c : 0, (r43 & 4194304) != 0 ? c4049bUi2.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi2.j : 0, (r43 & 16777216) != 0 ? c4049bUi2.s : null);
                                    return d3;
                                }
                                return c4049bUi2;
                            }
                        });
                    }
                };
                final bTF btf3 = this;
                final int i5 = i;
                b2 = btf.b(SubscribersKt.subscribeBy(c4, drm, new drM<List<? extends C4002bSp>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$refreshInQueueStateForVideo$2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(List<? extends C4002bSp> list) {
                        c(list);
                        return dpR.c;
                    }

                    public final void c(List<C4002bSp> list) {
                        int d3;
                        C8632dsu.c((Object) list, "");
                        d3 = C8572dqo.d(list, 10);
                        final ArrayList arrayList = new ArrayList(d3);
                        for (C4002bSp c4002bSp : list) {
                            arrayList.add(c4002bSp.a());
                        }
                        final bTF btf4 = bTF.this;
                        final LoMo loMo = e2;
                        final int i6 = i5;
                        final C4029bTp c4029bTp = d2;
                        btf4.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel.refreshInQueueStateForVideo.2.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            /* renamed from: b */
                            public final C4049bUi invoke(C4049bUi c4049bUi2) {
                                List e3;
                                Map k;
                                Throwable th;
                                Map k2;
                                Map l;
                                C4049bUi d4;
                                C8632dsu.c((Object) c4049bUi2, "");
                                AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>> abstractC8918fl2 = c4049bUi2.u().get(LoMo.this.getId());
                                List<InterfaceC5222bug<? extends InterfaceC5223buh>> c5 = abstractC8918fl2 != null ? abstractC8918fl2.c() : null;
                                e3 = btf4.e(c5, i6, arrayList);
                                if (c5 != null && i6 < c5.size()) {
                                    k2 = dqE.k(c4049bUi2.u());
                                    k2.put(LoMo.this.getId(), new C8971gl(e3));
                                    l = dqE.l(k2);
                                    d4 = c4049bUi2.d((r43 & 1) != 0 ? c4049bUi2.l : false, (r43 & 2) != 0 ? c4049bUi2.a : null, (r43 & 4) != 0 ? c4049bUi2.q : null, (r43 & 8) != 0 ? c4049bUi2.w : null, (r43 & 16) != 0 ? c4049bUi2.m : null, (r43 & 32) != 0 ? c4049bUi2.u : null, (r43 & 64) != 0 ? c4049bUi2.y : l, (r43 & 128) != 0 ? c4049bUi2.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi2.z : null, (r43 & 512) != 0 ? c4049bUi2.i : null, (r43 & 1024) != 0 ? c4049bUi2.d : null, (r43 & 2048) != 0 ? c4049bUi2.b : false, (r43 & 4096) != 0 ? c4049bUi2.r : null, (r43 & 8192) != 0 ? c4049bUi2.t : null, (r43 & 16384) != 0 ? c4049bUi2.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi2.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi2.h : false, (r43 & 131072) != 0 ? c4049bUi2.e : c4029bTp, (r43 & 262144) != 0 ? c4049bUi2.x : null, (r43 & 524288) != 0 ? c4049bUi2.n : null, (r43 & 1048576) != 0 ? c4049bUi2.p : null, (r43 & 2097152) != 0 ? c4049bUi2.c : 0, (r43 & 4194304) != 0 ? c4049bUi2.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi2.j : 0, (r43 & 16777216) != 0 ? c4049bUi2.s : null);
                                    return d4;
                                }
                                InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                                ErrorType errorType = ErrorType.l;
                                String str3 = "Row changed underneath while refreshing numVideosInRow=" + (c5 != null ? Integer.valueOf(c5.size()) : null);
                                k = dqE.k(new LinkedHashMap());
                                C1596aHd c1596aHd = new C1596aHd(str3, null, errorType, true, k, false, false, 96, null);
                                ErrorType errorType2 = c1596aHd.a;
                                if (errorType2 != null) {
                                    c1596aHd.e.put("errorType", errorType2.c());
                                    String b3 = c1596aHd.b();
                                    if (b3 != null) {
                                        c1596aHd.a(errorType2.c() + " " + b3);
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
                                InterfaceC1597aHe c6 = dVar2.c();
                                if (c6 != null) {
                                    c6.d(c1596aHd, th);
                                } else {
                                    dVar2.e().b(c1596aHd, th);
                                }
                                return c4049bUi2;
                            }
                        });
                    }
                }));
                btf.a(b2);
            }
        });
    }

    private final C4049bUi e(C4049bUi c4049bUi, Map<String, ? extends AbstractC8918fl<? extends List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>>> map) {
        C4049bUi d2;
        List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> c2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<LoMo> c3 = c4049bUi.r().c();
        if (c3 != null) {
            for (LoMo loMo : c3) {
                if (loMo.b() && loMo.getType() == LoMoType.FEED) {
                    AbstractC8918fl<? extends List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>> abstractC8918fl = map.get(loMo.getId());
                    if (abstractC8918fl != null && (c2 = abstractC8918fl.c()) != null) {
                        Iterator<T> it = c2.iterator();
                        while (it.hasNext()) {
                            InterfaceC5222bug interfaceC5222bug = (InterfaceC5222bug) it.next();
                            if (interfaceC5222bug instanceof aES) {
                                aES aes = (aES) interfaceC5222bug;
                                if (aes.D()) {
                                    arrayList.add(Long.valueOf(Long.parseLong(aes.getVideo().getId())));
                                }
                                TrailerItem.a h = aes.h();
                                if (!arrayList2.contains(h)) {
                                    arrayList2.add(h);
                                }
                            }
                        }
                    }
                }
            }
        }
        C4029bTp e2 = c4049bUi.e();
        d2 = c4049bUi.d((r43 & 1) != 0 ? c4049bUi.l : false, (r43 & 2) != 0 ? c4049bUi.a : null, (r43 & 4) != 0 ? c4049bUi.q : null, (r43 & 8) != 0 ? c4049bUi.w : null, (r43 & 16) != 0 ? c4049bUi.m : null, (r43 & 32) != 0 ? c4049bUi.u : null, (r43 & 64) != 0 ? c4049bUi.y : null, (r43 & 128) != 0 ? c4049bUi.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi.z : null, (r43 & 512) != 0 ? c4049bUi.i : null, (r43 & 1024) != 0 ? c4049bUi.d : null, (r43 & 2048) != 0 ? c4049bUi.b : false, (r43 & 4096) != 0 ? c4049bUi.r : null, (r43 & 8192) != 0 ? c4049bUi.t : null, (r43 & 16384) != 0 ? c4049bUi.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi.h : false, (r43 & 131072) != 0 ? c4049bUi.e : e2 != null ? C4029bTp.c(e2, null, arrayList, arrayList2, 1, null) : null, (r43 & 262144) != 0 ? c4049bUi.x : null, (r43 & 524288) != 0 ? c4049bUi.n : null, (r43 & 1048576) != 0 ? c4049bUi.p : null, (r43 & 2097152) != 0 ? c4049bUi.c : 0, (r43 & 4194304) != 0 ? c4049bUi.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi.j : 0, (r43 & 16777216) != 0 ? c4049bUi.s : null);
        return d2;
    }

    public final void d(final boolean z) {
        b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$setInterstitialBannerShowing$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C4049bUi invoke(C4049bUi c4049bUi) {
                C4049bUi d2;
                C8632dsu.c((Object) c4049bUi, "");
                d2 = c4049bUi.d((r43 & 1) != 0 ? c4049bUi.l : false, (r43 & 2) != 0 ? c4049bUi.a : null, (r43 & 4) != 0 ? c4049bUi.q : null, (r43 & 8) != 0 ? c4049bUi.w : null, (r43 & 16) != 0 ? c4049bUi.m : null, (r43 & 32) != 0 ? c4049bUi.u : null, (r43 & 64) != 0 ? c4049bUi.y : null, (r43 & 128) != 0 ? c4049bUi.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi.z : null, (r43 & 512) != 0 ? c4049bUi.i : null, (r43 & 1024) != 0 ? c4049bUi.d : null, (r43 & 2048) != 0 ? c4049bUi.b : false, (r43 & 4096) != 0 ? c4049bUi.r : null, (r43 & 8192) != 0 ? c4049bUi.t : null, (r43 & 16384) != 0 ? c4049bUi.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi.h : false, (r43 & 131072) != 0 ? c4049bUi.e : null, (r43 & 262144) != 0 ? c4049bUi.x : null, (r43 & 524288) != 0 ? c4049bUi.n : null, (r43 & 1048576) != 0 ? c4049bUi.p : null, (r43 & 2097152) != 0 ? c4049bUi.c : 0, (r43 & 4194304) != 0 ? c4049bUi.f13548o : z, (r43 & 8388608) != 0 ? c4049bUi.j : 0, (r43 & 16777216) != 0 ? c4049bUi.s : null);
                return d2;
            }
        });
    }
}
