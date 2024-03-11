package o;

import android.content.Context;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.model.leafs.advisory.Advisory;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o.AbstractC5164btb;
import o.C1044Mm;
import o.C1380Ze;
import o.C1537aEz;
import o.C2512ahV;
import o.C5714cFq;
import o.C8572dqo;
import o.C8576dqs;
import o.C8632dsu;
import o.C8657dts;
import o.C8954gU;
import o.InterfaceC5125bsp;
import o.aCE;
import o.aCG;
import o.aCK;
import o.aEC;
import o.dpR;
import o.dqD;

/* renamed from: o.cFq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5714cFq implements InterfaceC0718Aa<LinkedHashMap<Advisory, Boolean>> {
    private final PublishSubject<LinkedHashMap<Advisory, Boolean>> c;
    private final NetflixActivity e;
    public static final e d = new e(null);
    private static final String b = "ContentAdvisoryRepository";

    public final PublishSubject<LinkedHashMap<Advisory, Boolean>> b() {
        return this.c;
    }

    @Override // o.InterfaceC0718Aa
    public Observable<LinkedHashMap<Advisory, Boolean>> d() {
        return this.c;
    }

    /* renamed from: o.cFq$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    public C5714cFq(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        this.e = netflixActivity;
        PublishSubject<LinkedHashMap<Advisory, Boolean>> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.c = create;
    }

    public final void d(final String str) {
        InterfaceC5283bvo j;
        C8632dsu.c((Object) str, "");
        if (!C8153dex.H()) {
            C1645aIz.a(this.e, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.repository.ContentAdvisoryRepository$fetchData$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                    d(serviceManager);
                    return dpR.c;
                }

                public final void d(ServiceManager serviceManager) {
                    C8632dsu.c((Object) serviceManager, "");
                    InterfaceC5125bsp j2 = serviceManager.j();
                    String str2 = str;
                    final C5714cFq c5714cFq = this;
                    j2.c(str2, new AbstractC5164btb() { // from class: com.netflix.mediaclient.ui.player.v2.repository.ContentAdvisoryRepository$fetchData$1.4
                        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
                        public void c(List<? extends Advisory> list, Status status) {
                            int d2;
                            int e2;
                            int b2;
                            C8632dsu.c((Object) status, "");
                            super.c((List<Advisory>) list, status);
                            if (status.i() || list == null || list.isEmpty()) {
                                return;
                            }
                            PublishSubject<LinkedHashMap<Advisory, Boolean>> b3 = C5714cFq.this.b();
                            d2 = C8572dqo.d(list, 10);
                            e2 = dqD.e(d2);
                            b2 = C8657dts.b(e2, 16);
                            LinkedHashMap<Advisory, Boolean> linkedHashMap = new LinkedHashMap<>(b2);
                            for (Advisory advisory : list) {
                                linkedHashMap.put(advisory, Boolean.FALSE);
                            }
                            b3.onNext(linkedHashMap);
                        }
                    });
                }
            });
            return;
        }
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if (k == null || (j = k.j()) == null) {
            return;
        }
        aCG.e eVar = aCG.b;
        C1332Xp c1332Xp = C1332Xp.b;
        SubscribersKt.subscribeBy(aCE.d.e(eVar.e((Context) C1332Xp.b(Context.class), j), new C1380Ze(Integer.parseInt(str)), null, null, false, 14, null), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.repository.ContentAdvisoryRepository$fetchData$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                String str2;
                C8632dsu.c((Object) th, "");
                str2 = C5714cFq.b;
                String localizedMessage = th.getLocalizedMessage();
                C1044Mm.a(str2, "an exception happened " + localizedMessage);
            }
        }, new drM<C8954gU<C1380Ze.e>, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.repository.ContentAdvisoryRepository$fetchData$3
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C8954gU<C1380Ze.e> c8954gU) {
                d(c8954gU);
                return dpR.c;
            }

            public final void d(C8954gU<C1380Ze.e> c8954gU) {
                List<C1537aEz> list;
                int d2;
                int e2;
                int b2;
                C2512ahV b3;
                List<C2512ahV.a> a;
                int d3;
                Object c1537aEz;
                C8632dsu.c((Object) c8954gU, "");
                List<C1380Ze.b> b4 = ((C1380Ze.e) aCK.e(c8954gU)).b();
                if (b4 == null || b4.isEmpty()) {
                    return;
                }
                C1380Ze.b bVar = b4.get(0);
                if (bVar == null || (b3 = bVar.b()) == null || (a = b3.a()) == null) {
                    list = null;
                } else {
                    d3 = C8572dqo.d(a, 10);
                    ArrayList arrayList = new ArrayList(d3);
                    for (C2512ahV.a aVar : a) {
                        if (aVar.a().a() != null) {
                            c1537aEz = new aEC(aVar.a(), bVar.d());
                        } else {
                            c1537aEz = new C1537aEz(aVar.a());
                        }
                        arrayList.add(c1537aEz);
                    }
                    list = C8576dqs.U(arrayList);
                }
                if (list == null || list.isEmpty()) {
                    return;
                }
                PublishSubject<LinkedHashMap<Advisory, Boolean>> b5 = C5714cFq.this.b();
                d2 = C8572dqo.d(list, 10);
                e2 = dqD.e(d2);
                b2 = C8657dts.b(e2, 16);
                LinkedHashMap<Advisory, Boolean> linkedHashMap = new LinkedHashMap<>(b2);
                for (C1537aEz c1537aEz2 : list) {
                    linkedHashMap.put(c1537aEz2, Boolean.FALSE);
                }
                b5.onNext(linkedHashMap);
            }
        });
    }
}
