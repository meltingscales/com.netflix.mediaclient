package o;

import android.content.Context;
import com.apollographql.apollo3.api.http.HttpMethod;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.C8632dsu;
import o.C8944gK;
import o.InterfaceC1473aCp;

/* loaded from: classes3.dex */
public final class aCW {
    public static final c b = new c(null);
    private final C8944gK a;
    private final Context c;
    private final aCX d;
    private final aCJ e;
    private final dwQ f;
    private final InterfaceC1473aCp g;
    private final dwQ h;
    private final C0902Gz i;

    @AssistedFactory
    /* loaded from: classes3.dex */
    public interface d {
        aCW a(aCJ acj);
    }

    public final C8944gK c() {
        return this.a;
    }

    public final dwQ e() {
        return this.f;
    }

    @AssistedInject
    public aCW(aCX acx, @ApplicationContext Context context, @Assisted aCJ acj, InterfaceC1473aCp interfaceC1473aCp, dwQ dwq, C0902Gz c0902Gz) {
        C8632dsu.c((Object) acx, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) acj, "");
        C8632dsu.c((Object) interfaceC1473aCp, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) c0902Gz, "");
        this.d = acx;
        this.c = context;
        this.e = acj;
        this.g = interfaceC1473aCp;
        this.h = dwq;
        this.i = c0902Gz;
        dwQ e2 = acj.e();
        if (e2 != null) {
            dwq = e2;
        } else if (!C8067ddQ.c() && !c0902Gz.a()) {
            dwq = C8752dxf.a();
        }
        this.f = dwq;
        this.a = a();
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("NetflixApolloClient");
        }
    }

    /* loaded from: classes3.dex */
    public static final class e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(((InterfaceC1473aCp.a) t).c(), ((InterfaceC1473aCp.a) t2).c());
            return compareValues;
        }
    }

    private final void d(C8944gK c8944gK) {
        List c2;
        String d2;
        String e2 = C8157dfA.e(this.c, "graphqlDiskcacheDataVersionCode", "0");
        c2 = C8576dqs.c((Iterable) this.g.c(this.c), (Comparator) new e());
        d2 = C8576dqs.d(c2, ",", null, null, 0, null, new drM<InterfaceC1473aCp.a, CharSequence>() { // from class: com.netflix.mediaclient.graphqlrepo.impl.client.NetflixApolloClient$deleteDatabaseIfWrongVersionCode$abConfigs$2
            @Override // o.drM
            /* renamed from: e */
            public final CharSequence invoke(InterfaceC1473aCp.a aVar) {
                C8632dsu.c((Object) aVar, "");
                String c3 = aVar.c();
                int d3 = aVar.d();
                return c3 + ":" + d3;
            }
        }, 30, null);
        String str = "v1-" + d2;
        c cVar = b;
        cVar.getLogTag();
        if (C8632dsu.c((Object) e2, (Object) str)) {
            return;
        }
        cVar.getLogTag();
        C9083ir.d(c8944gK).e();
        C8157dfA.a(this.c, "graphqlDiskcacheDataVersionCode", str);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final d a;
        private final Map<aCJ, aCW> c;

        @Inject
        public a(d dVar) {
            C8632dsu.c((Object) dVar, "");
            this.a = dVar;
            this.c = new LinkedHashMap();
        }

        public final aCW e(aCJ acj) {
            aCW acw;
            synchronized (this) {
                C8632dsu.c((Object) acj, "");
                Map<aCJ, aCW> map = this.c;
                aCW acw2 = map.get(acj);
                if (acw2 == null) {
                    acw2 = this.a.a(acj);
                    map.put(acj, acw2);
                }
                acw = acw2;
            }
            return acw;
        }
    }

    private final C8944gK a() {
        b.getLogTag();
        InterfaceC1593aHa.c.a("Building ApolloClient");
        C8944gK.e c2 = new C8944gK.e().c(this.f);
        if (this.e.d()) {
            AbstractC9054iO a2 = this.e.a();
            aCX acx = this.d;
            c2 = C9083ir.e(c2, C9079in.b(a2, acx, acx), false, 2, null);
        }
        C8944gK.e b2 = c2.b(this.e.c(this.g));
        HttpMethod httpMethod = HttpMethod.a;
        C8944gK.e b3 = b2.b(new C1500aDp(httpMethod, httpMethod));
        if (this.e.b() && this.g.e()) {
            b3 = b3.b(new aCZ(this.g));
        }
        List<Pair<String, String>> b4 = this.g.b();
        if (b4 != null && (!b4.isEmpty())) {
            Iterator<T> it = b4.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                b3.b((String) pair.d(), (String) pair.a());
            }
        }
        C8944gK d2 = b3.d();
        if (this.e.d()) {
            d(d2);
        }
        return d2;
    }
}
