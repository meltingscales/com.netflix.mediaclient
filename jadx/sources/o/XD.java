package o;

import android.annotation.SuppressLint;
import android.content.Context;
import com.netflix.mediaclient.graphql.models.type.ArtworkType;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.service.user.UserAgent;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.List;
import o.C8632dsu;
import o.C8954gU;
import o.C9954zi;
import o.XY;
import o.aCE;
import o.dpR;

/* loaded from: classes3.dex */
public final class XD {
    public static final XD d = new XD();

    private XD() {
    }

    @SuppressLint({"CheckResult"})
    public final void a(Context context, final C9954zi c9954zi, Single<? extends Object> single, boolean z) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) single, "");
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        InterfaceC5283bvo j = k != null ? k.j() : null;
        if (j == null || !j.isKidsProfile()) {
            return;
        }
        Single observeOn = aCE.d.e(aCG.b.e(context, j), new XY(80148069, ArtworkType.ai, null, 112, null, new C2952apl(null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC8997hK.d.e(Boolean.valueOf(z)), null, null, null, null, null, null, null, 2088959, null), 16, null), QueryMode.b, null, false, 8, null).takeUntil(single).observeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(observeOn, "");
        SubscribersKt.subscribeBy(observeOn, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.experiencebadge.api.ExperienceBadgeUtils$setupBadge$1
            public final void b(Throwable th) {
                C8632dsu.c((Object) th, "");
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }
        }, new drM<C8954gU<XY.e>, dpR>() { // from class: com.netflix.mediaclient.experiencebadge.api.ExperienceBadgeUtils$setupBadge$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C8954gU<XY.e> c8954gU) {
                c(c8954gU);
                return dpR.c;
            }

            public final void c(C8954gU<XY.e> c8954gU) {
                List<XY.a> a;
                XY.a aVar;
                XY.c e;
                XY.e eVar = c8954gU.d;
                if (eVar == null || (a = eVar.a()) == null || (aVar = a.get(0)) == null || (e = aVar.e()) == null) {
                    return;
                }
                C9954zi c9954zi2 = C9954zi.this;
                if (!C8632dsu.c(e.c(), Boolean.TRUE) || e.e() == null) {
                    return;
                }
                if (c9954zi2 != null) {
                    String e2 = e.e();
                    C8632dsu.d((Object) e2);
                    c9954zi2.c(e2);
                }
                if (c9954zi2 != null) {
                    c9954zi2.a(true);
                }
            }
        });
    }
}
