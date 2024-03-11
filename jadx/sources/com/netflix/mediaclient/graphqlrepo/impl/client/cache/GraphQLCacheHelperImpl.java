package com.netflix.mediaclient.graphqlrepo.impl.client.cache;

import android.annotation.SuppressLint;
import android.content.Context;
import com.netflix.mediaclient.graphqlrepo.impl.client.cache.GraphQLCacheHelperImpl;
import com.netflix.mediaclient.graphqlrepo.impl.client.streaming.AccountScopedApolloClientConfig;
import com.netflix.mediaclient.graphqlrepo.impl.client.streaming.ProfileScopedApolloClientConfig;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Completable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.C1045Mp;
import o.C1567aGb;
import o.C8572dqo;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.C9083ir;
import o.InterfaceC1476aCs;
import o.InterfaceC1593aHa;
import o.InterfaceC1919aTc;
import o.InterfaceC1926aTj;
import o.InterfaceC5282bvn;
import o.InterfaceC5283bvo;
import o.MF;
import o.aCG;
import o.aCN;
import o.aCO;
import o.aCW;
import o.dAZ;

/* loaded from: classes3.dex */
public final class GraphQLCacheHelperImpl implements aCN {
    public static final c b = new c(null);
    private final Context a;
    private final InterfaceC1476aCs d;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface CacheModule {
        @Binds
        aCN d(GraphQLCacheHelperImpl graphQLCacheHelperImpl);
    }

    @Inject
    public GraphQLCacheHelperImpl(@ApplicationContext Context context, InterfaceC1476aCs interfaceC1476aCs) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC1476aCs, "");
        this.a = context;
        this.d = interfaceC1476aCs;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("GraphQLAppCacheHelperImpl");
        }
    }

    @Override // o.aCN
    public Completable e() {
        List<InterfaceC5283bvo> d = d();
        if (d == null || d.isEmpty()) {
            Completable error = Completable.error(new IllegalArgumentException("GraphQLCacheHelperImpl: allProfiles is null"));
            C8632dsu.a(error, "");
            return error;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC5283bvo interfaceC5283bvo : d) {
            arrayList.add(e(interfaceC5283bvo));
        }
        Completable merge = Completable.merge(arrayList);
        C8632dsu.a(merge, "");
        return merge;
    }

    public Completable e(InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        aCW b2 = b(interfaceC5283bvo);
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        String profileGuid = interfaceC5283bvo.getProfileGuid();
        aVar.a("GraphQL clearCacheForProfile " + profileGuid);
        return e(b2);
    }

    @Override // o.aCN
    public Completable d(C1567aGb c1567aGb) {
        C8632dsu.c((Object) c1567aGb, "");
        aCG a = aCG.b.a(this.a, c1567aGb);
        C8632dsu.d(a);
        aCW a2 = ((aCO) a).a();
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        String a3 = c1567aGb.a();
        aVar.a("GraphQL clearCacheForProfile " + a3);
        return e(a2);
    }

    @Override // o.aCN
    public Completable b(InterfaceC5283bvo interfaceC5283bvo, String str) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        C8632dsu.c((Object) str, "");
        aCW b2 = b(interfaceC5283bvo);
        return dAZ.e(b2.e(), new GraphQLCacheHelperImpl$removeByCacheKeyPatternForProfile$1(b2, str, null));
    }

    @Override // o.aCN
    public InterfaceC1919aTc c(InterfaceC1926aTj interfaceC1926aTj) {
        C8632dsu.c((Object) interfaceC1926aTj, "");
        return new e(this, interfaceC1926aTj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Completable b(MF mf) {
        aCG c2 = aCG.b.c(this.a, mf);
        C8632dsu.d(c2);
        aCW a = ((aCO) c2).a();
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        String d = mf.d();
        aVar.a("GraphQL clearCacheForAccount " + d);
        return e(a);
    }

    private final Completable e(final aCW acw) {
        Completable subscribeOn = Completable.fromAction(new Action() { // from class: o.aDc
            @Override // io.reactivex.functions.Action
            public final void run() {
                GraphQLCacheHelperImpl.c(aCW.this);
            }
        }).subscribeOn(Schedulers.io());
        C8632dsu.a(subscribeOn, "");
        return subscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(aCW acw) {
        C8632dsu.c((Object) acw, "");
        C9083ir.d(acw.c()).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File a(C1567aGb c1567aGb) {
        File databasePath = this.a.getDatabasePath(ProfileScopedApolloClientConfig.e.c(c1567aGb));
        C8632dsu.a(databasePath, "");
        return databasePath;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File a(MF mf) {
        File databasePath = this.a.getDatabasePath(AccountScopedApolloClientConfig.e.d(mf));
        C8632dsu.a(databasePath, "");
        return databasePath;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<InterfaceC5283bvo> d() {
        return this.d.a();
    }

    private final aCW b(InterfaceC5283bvo interfaceC5283bvo) {
        aCG e2 = aCG.b.e(this.a, interfaceC5283bvo);
        C8632dsu.d(e2);
        return ((aCO) e2).a();
    }

    /* loaded from: classes3.dex */
    public final class e implements InterfaceC1919aTc {
        private final InterfaceC1926aTj c;
        final /* synthetic */ GraphQLCacheHelperImpl d;

        @Override // o.InterfaceC1919aTc
        public void a() {
        }

        public e(GraphQLCacheHelperImpl graphQLCacheHelperImpl, InterfaceC1926aTj interfaceC1926aTj) {
            C8632dsu.c((Object) interfaceC1926aTj, "");
            this.d = graphQLCacheHelperImpl;
            this.c = interfaceC1926aTj;
        }

        @Override // o.InterfaceC1919aTc
        @SuppressLint({"CheckResult"})
        public void b(final int i) {
            List<InterfaceC5283bvo> d = this.d.d();
            if (d == null || d.isEmpty()) {
                this.c.a(this, i);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (InterfaceC5283bvo interfaceC5283bvo : d) {
                arrayList.add(a(interfaceC5283bvo));
            }
            InterfaceC5282bvn d2 = this.d.d.d();
            if (d2 != null) {
                arrayList.add(a(d2));
            }
            Completable.merge(arrayList).subscribe(new Action() { // from class: o.aCY
                @Override // io.reactivex.functions.Action
                public final void run() {
                    GraphQLCacheHelperImpl.e.c(GraphQLCacheHelperImpl.e.this, i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(e eVar, int i) {
            C8632dsu.c((Object) eVar, "");
            GraphQLCacheHelperImpl.b.getLogTag();
            InterfaceC1593aHa.c.a("GraphQL cache maintenance complete");
            eVar.c.a(eVar, i);
        }

        @SuppressLint({"CheckResult"})
        private final Completable a(InterfaceC5283bvo interfaceC5283bvo) {
            boolean g;
            C1567aGb.e eVar = C1567aGb.a;
            C1567aGb e = eVar.e(interfaceC5283bvo);
            if (!C8632dsu.c(e, eVar.d())) {
                g = C8691duz.g(e.a());
                if (!g) {
                    if (this.d.a(e).length() > 52428800) {
                        return this.d.e(interfaceC5283bvo);
                    }
                    Completable complete = Completable.complete();
                    C8632dsu.d(complete);
                    return complete;
                }
            }
            Completable complete2 = Completable.complete();
            C8632dsu.a(complete2, "");
            return complete2;
        }

        private final Completable a(InterfaceC5282bvn interfaceC5282bvn) {
            boolean g;
            MF.d dVar = MF.c;
            MF c = dVar.c(interfaceC5282bvn);
            if (!C8632dsu.c(c, dVar.e())) {
                g = C8691duz.g(c.d());
                if (!g) {
                    if (this.d.a(c).length() > 52428800) {
                        return this.d.b(c);
                    }
                    Completable complete = Completable.complete();
                    C8632dsu.d(complete);
                    return complete;
                }
            }
            Completable complete2 = Completable.complete();
            C8632dsu.a(complete2, "");
            return complete2;
        }
    }

    @Override // o.aCN
    public Completable d(List<C1567aGb> list, MF mf) {
        int d;
        List n;
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) mf, "");
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C1567aGb c1567aGb : list) {
            arrayList.add(d(c1567aGb));
        }
        n = C8576dqs.n(arrayList);
        n.add(b(mf));
        Completable merge = Completable.merge(n);
        C8632dsu.a(merge, "");
        return merge;
    }
}
