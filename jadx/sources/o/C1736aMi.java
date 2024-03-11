package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.util.ConnectivityUtils;
import dagger.Lazy;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C1355Ym;
import o.C1736aMi;
import o.C8632dsu;
import o.C8954gU;
import o.aCE;
import o.dpR;
import o.drM;

/* renamed from: o.aMi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1736aMi {
    private String a;
    private final Lazy<aCI> b;
    private final Context c;
    private final SharedPreferences f;
    private long j;
    public static final d e = new d(null);
    public static final int d = 8;

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1736aMi) {
            C1736aMi c1736aMi = (C1736aMi) obj;
            return C8632dsu.c(this.c, c1736aMi.c) && C8632dsu.c(this.b, c1736aMi.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        Context context = this.c;
        Lazy<aCI> lazy = this.b;
        return "CurrentCountryCode(context=" + context + ", loggedOutGraphQLRepository=" + lazy + ")";
    }

    public C1736aMi(Context context, Lazy<aCI> lazy) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) lazy, "");
        this.c = context;
        this.b = lazy;
        SharedPreferences sharedPreferences = context.getSharedPreferences("CurrentCountryCode", 0);
        this.f = sharedPreferences;
        this.a = sharedPreferences.getString("code", null);
        e.getLogTag();
    }

    /* renamed from: o.aMi$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("CurrentCountryCode");
        }
    }

    @SuppressLint({"CheckResult"})
    public final void b(final drM<? super String, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        if (System.currentTimeMillis() < this.j + 60000 || !ConnectivityUtils.l(this.c)) {
            e.getLogTag();
            return;
        }
        e.getLogTag();
        this.j = System.currentTimeMillis();
        aCI aci = this.b.get();
        C8632dsu.d(aci);
        SubscribersKt.subscribeBy(aCE.d.e(aci, new C1355Ym(), QueryMode.d, RequestPriority.c, false, 8, null), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.service.CurrentCountryCode$fetchCurrentCountry$3
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                C8632dsu.c((Object) th, "");
                C1736aMi.d dVar = C1736aMi.e;
            }
        }, new drM<C8954gU<C1355Ym.b>, dpR>() { // from class: com.netflix.mediaclient.service.CurrentCountryCode$fetchCurrentCountry$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C8954gU<C1355Ym.b> c8954gU) {
                d(c8954gU);
                return dpR.c;
            }

            public final void d(C8954gU<C1355Ym.b> c8954gU) {
                dpR dpr;
                C1355Ym.e d2;
                SharedPreferences sharedPreferences;
                C8632dsu.c((Object) c8954gU, "");
                C1355Ym.b bVar = c8954gU.d;
                if (bVar == null || (d2 = bVar.d()) == null) {
                    dpr = null;
                } else {
                    C1736aMi c1736aMi = C1736aMi.this;
                    drM<String, dpR> drm2 = drm;
                    C1736aMi.e.getLogTag();
                    if (!C8632dsu.c((Object) c1736aMi.b(), (Object) d2.d())) {
                        c1736aMi.a = d2.d();
                        drm2.invoke(c1736aMi.b());
                        c1736aMi.j = System.currentTimeMillis();
                        sharedPreferences = c1736aMi.f;
                        sharedPreferences.edit().putString("code", c1736aMi.b()).apply();
                    }
                    dpr = dpR.c;
                }
                if (dpr == null) {
                    C1736aMi.this.j = 0L;
                }
            }
        });
    }
}
