package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_GraphQLRefreshCookiesOnUnauthenticatedError;
import com.netflix.mediaclient.service.user.UserAgent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Pair;
import kotlin.Result;
import o.C1881aRs;
import o.InterfaceC1473aCp;
import o.InterfaceC1593aHa;

@Singleton
/* renamed from: o.aCy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1482aCy implements InterfaceC1473aCp {
    public static final d d = new d(null);
    private final Context b;
    private final boolean e;

    @Override // o.InterfaceC1473aCp
    public boolean c() {
        return this.e;
    }

    @Inject
    public C1482aCy(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.b = context;
        this.e = aRE.b.d();
    }

    /* renamed from: o.aCy$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    @Override // o.InterfaceC1473aCp
    public Collection<InterfaceC1473aCp.a> c(Context context) {
        int d2;
        C8632dsu.c((Object) context, "");
        Collection<aRM> d3 = C1818aPj.d(context);
        C8632dsu.a(d3, "");
        Collection<aRM> collection = d3;
        d2 = C8572dqo.d(collection, 10);
        ArrayList arrayList = new ArrayList(d2);
        for (aRM arm : collection) {
            arrayList.add(new InterfaceC1473aCp.a(arm.d(), arm.c(context).getCellId()));
        }
        return arrayList;
    }

    @Override // o.InterfaceC1473aCp
    public boolean e() {
        return Config_FastProperty_GraphQLRefreshCookiesOnUnauthenticatedError.Companion.a();
    }

    @Override // o.InterfaceC1473aCp
    public Object b(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e2;
        Object e3;
        b = C8590drf.b(interfaceC8585dra);
        C8587drc c8587drc = new C8587drc(b);
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if (k == null) {
            Result.c cVar = Result.e;
            c8587drc.resumeWith(Result.e(C8556dpz.a(new NullPointerException("User agent is null"))));
        } else {
            k.e(new e(c8587drc));
        }
        Object b2 = c8587drc.b();
        e2 = C8586drb.e();
        if (b2 == e2) {
            C8592drh.c(interfaceC8585dra);
        }
        e3 = C8586drb.e();
        return b2 == e3 ? b2 : dpR.c;
    }

    /* renamed from: o.aCy$e */
    /* loaded from: classes3.dex */
    public static final class e extends C5015bql {
        final /* synthetic */ InterfaceC8585dra<dpR> c;

        /* JADX WARN: Multi-variable type inference failed */
        e(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            this.c = interfaceC8585dra;
        }

        @Override // o.C5015bql, o.InterfaceC5018bqo
        public void e(Status status) {
            String l;
            super.e(status);
            if (status != null && status.i()) {
                Throwable e = status.e();
                if ((e == null || (l = e.getMessage()) == null) && (l = status.l()) == null) {
                    l = status.b();
                }
                Throwable e2 = status.e();
                if (e2 == null) {
                    e2 = new IllegalStateException("Unknown error, message: " + l);
                }
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                aVar.a("Failed to refresh cookies for current profile: " + l);
                InterfaceC8585dra<dpR> interfaceC8585dra = this.c;
                Result.c cVar = Result.e;
                interfaceC8585dra.resumeWith(Result.e(C8556dpz.a(e2)));
                return;
            }
            InterfaceC1593aHa.c.a("Successfully refreshed cookies for current profile");
            InterfaceC8585dra<dpR> interfaceC8585dra2 = this.c;
            Result.c cVar2 = Result.e;
            interfaceC8585dra2.resumeWith(Result.e(dpR.c));
        }
    }

    @Override // o.InterfaceC1473aCp
    public String a() {
        if (C8206dfx.e()) {
            return C8157dfA.e(this.b, "interstitial_dgs_override", (String) null);
        }
        return null;
    }

    @Override // o.InterfaceC1473aCp
    public List<Pair<String, String>> b() {
        List<Pair<String, String>> e2;
        C1881aRs.d dVar = C1881aRs.d;
        if (dVar.d() || (C8206dfx.e() && !dVar.b())) {
            e2 = C8566dqi.e(dpD.a("X-Netflix-CGL", "true"));
            return e2;
        }
        return null;
    }
}
