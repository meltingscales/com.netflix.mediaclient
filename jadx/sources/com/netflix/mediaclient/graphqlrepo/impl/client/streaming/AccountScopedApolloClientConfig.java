package com.netflix.mediaclient.graphqlrepo.impl.client.streaming;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC9054iO;
import o.C1491aDg;
import o.C1492aDh;
import o.C1493aDi;
import o.C1494aDj;
import o.C1596aHd;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1471aCn;
import o.InterfaceC1473aCp;
import o.InterfaceC1475aCr;
import o.InterfaceC1477aCt;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC9095jC;
import o.InterfaceC9101jI;
import o.MC;
import o.MF;
import o.aCJ;
import o.dpD;
import o.dqD;
import o.dqE;
import o.dwQ;

/* loaded from: classes3.dex */
public final class AccountScopedApolloClientConfig implements aCJ {
    public static final d e = new d(null);
    private final InterfaceC1477aCt a;
    private final MF b;
    private final dwQ c;
    private final Context d;
    private final InterfaceC1471aCn f;
    private final InterfaceC1475aCr h;
    private final InterfaceC1473aCp j;

    @Module
    @InstallIn({MC.class})
    /* loaded from: classes6.dex */
    public interface StreamingApolloClientConfigModule {
        @Binds
        aCJ a(AccountScopedApolloClientConfig accountScopedApolloClientConfig);
    }

    @Override // o.aCJ
    public dwQ e() {
        return this.c;
    }

    @Inject
    public AccountScopedApolloClientConfig(@ApplicationContext Context context, MF mf, InterfaceC1477aCt interfaceC1477aCt, InterfaceC1475aCr interfaceC1475aCr, InterfaceC1471aCn interfaceC1471aCn, InterfaceC1473aCp interfaceC1473aCp) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) mf, "");
        C8632dsu.c((Object) interfaceC1477aCt, "");
        C8632dsu.c((Object) interfaceC1475aCr, "");
        C8632dsu.c((Object) interfaceC1471aCn, "");
        C8632dsu.c((Object) interfaceC1473aCp, "");
        this.d = context;
        this.b = mf;
        this.a = interfaceC1477aCt;
        this.h = interfaceC1475aCr;
        this.f = interfaceC1471aCn;
        this.j = interfaceC1473aCp;
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
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final String d(MF mf) {
            C8632dsu.c((Object) mf, "");
            if (mf.d().length() == 0 || C8632dsu.c(mf, MF.c.e())) {
                InterfaceC1593aHa.c.a("SPY-34713 - NetflixApolloClient's accountGuid was empty or invalid");
            }
            String d = mf.d();
            return "apollo_account_cache_v1_" + d + ".db";
        }
    }

    @Override // o.aCJ
    public String c() {
        return this.h.c();
    }

    @Override // o.aCJ
    public InterfaceC9101jI j() {
        return this.a.a(null, b());
    }

    @Override // o.aCJ
    public InterfaceC9095jC c(InterfaceC1473aCp interfaceC1473aCp) {
        C8632dsu.c((Object) interfaceC1473aCp, "");
        return C1493aDi.c.d(this, this.f, interfaceC1473aCp);
    }

    @Override // o.aCJ
    public AbstractC9054iO a() {
        Map b;
        Map k;
        Throwable th;
        if (this.j.c()) {
            return new C1492aDh(this.d, Integer.MAX_VALUE, Long.MAX_VALUE, e.d(this.b));
        }
        C1491aDg c1491aDg = new C1491aDg(Integer.MAX_VALUE, Long.MAX_VALUE);
        try {
            InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
            String d2 = this.b.d();
            aVar.a("GraphQL: [Account] buildNormalizedCacheFactory: chained SQL cache for account " + d2);
            return c1491aDg.e(new C1494aDj(this.d, e.d(this.b)));
        } catch (Exception e2) {
            long freeSpace = this.d.getFilesDir().getFreeSpace();
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            ErrorType errorType = ErrorType.l;
            b = dqD.b(dpD.a("availableFreeSpace", String.valueOf(freeSpace)));
            k = dqE.k(b);
            C1596aHd c1596aHd = new C1596aHd("GraphQL: [Account] buildNormalizedCacheFactory used memory-only cache", e2, errorType, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd.a;
            if (errorType2 != null) {
                c1596aHd.e.put("errorType", errorType2.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType2.c();
                    c1596aHd.a(c + " " + b2);
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
            InterfaceC1597aHe c2 = dVar2.c();
            if (c2 != null) {
                c2.d(c1596aHd, th);
                return c1491aDg;
            }
            dVar2.e().b(c1596aHd, th);
            return c1491aDg;
        }
    }
}
