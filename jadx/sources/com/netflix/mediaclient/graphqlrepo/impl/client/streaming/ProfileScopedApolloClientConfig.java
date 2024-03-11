package com.netflix.mediaclient.graphqlrepo.impl.client.streaming;

import android.content.Context;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import o.AbstractC9054iO;
import o.C1491aDg;
import o.C1492aDh;
import o.C1493aDi;
import o.C1494aDj;
import o.C1567aGb;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1471aCn;
import o.InterfaceC1473aCp;
import o.InterfaceC1475aCr;
import o.InterfaceC1477aCt;
import o.InterfaceC1593aHa;
import o.InterfaceC9095jC;
import o.InterfaceC9101jI;
import o.aCJ;
import o.aFU;
import o.dwQ;

/* loaded from: classes3.dex */
public final class ProfileScopedApolloClientConfig implements aCJ {
    public static final c e = new c(null);
    private final InterfaceC1471aCn a;
    private final InterfaceC9101jI b;
    private final Context c;
    private final dwQ d;
    private final C1567aGb g;
    private final InterfaceC1473aCp h;
    private final InterfaceC1475aCr j;

    @Module
    @InstallIn({aFU.class})
    /* loaded from: classes6.dex */
    public interface StreamingApolloClientConfigModule {
        @Binds
        aCJ e(ProfileScopedApolloClientConfig profileScopedApolloClientConfig);
    }

    @Override // o.aCJ
    public dwQ e() {
        return this.d;
    }

    @Override // o.aCJ
    public InterfaceC9101jI j() {
        return this.b;
    }

    @Inject
    public ProfileScopedApolloClientConfig(@ApplicationContext Context context, C1567aGb c1567aGb, InterfaceC1477aCt interfaceC1477aCt, InterfaceC1475aCr interfaceC1475aCr, InterfaceC1471aCn interfaceC1471aCn, InterfaceC1473aCp interfaceC1473aCp) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) interfaceC1477aCt, "");
        C8632dsu.c((Object) interfaceC1475aCr, "");
        C8632dsu.c((Object) interfaceC1471aCn, "");
        C8632dsu.c((Object) interfaceC1473aCp, "");
        this.c = context;
        this.g = c1567aGb;
        this.j = interfaceC1475aCr;
        this.a = interfaceC1471aCn;
        this.h = interfaceC1473aCp;
        this.b = interfaceC1477aCt.a(c1567aGb, b());
    }

    @Override // o.aCJ
    public boolean b() {
        return aCJ.e.a(this);
    }

    @Override // o.aCJ
    public boolean d() {
        return aCJ.e.c(this);
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final String c(C1567aGb c1567aGb) {
            C8632dsu.c((Object) c1567aGb, "");
            if (c1567aGb.a().length() == 0 || C8632dsu.c(c1567aGb, C1567aGb.a.d())) {
                InterfaceC1593aHa.c.a("SPY-34713 - NetflixApolloClient's profileId was empty");
            }
            String a = c1567aGb.a();
            return "apollo_cache_v1_" + a + ".db";
        }
    }

    @Override // o.aCJ
    public String c() {
        return this.j.c();
    }

    @Override // o.aCJ
    public InterfaceC9095jC c(InterfaceC1473aCp interfaceC1473aCp) {
        C8632dsu.c((Object) interfaceC1473aCp, "");
        return C1493aDi.c.d(this, this.a, interfaceC1473aCp);
    }

    @Override // o.aCJ
    public AbstractC9054iO a() {
        if (this.h.c()) {
            return new C1492aDh(this.c, Integer.MAX_VALUE, Long.MAX_VALUE, e.c(this.g));
        }
        C1491aDg c1491aDg = new C1491aDg(Integer.MAX_VALUE, Long.MAX_VALUE);
        long freeSpace = this.c.getFilesDir().getFreeSpace();
        if (freeSpace >= 104857600) {
            InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
            String a = this.g.a();
            aVar.a("GraphQL: [Profile] buildNormalizedCacheFactory: chained SQL cache for profile " + a);
            return c1491aDg.e(new C1494aDj(this.c, e.c(this.g)));
        }
        InterfaceC1593aHa.a aVar2 = InterfaceC1593aHa.c;
        aVar2.a("GraphQL: [Profile] buildNormalizedCacheFactory uses only the memory cache, free space = " + freeSpace);
        return c1491aDg;
    }
}
