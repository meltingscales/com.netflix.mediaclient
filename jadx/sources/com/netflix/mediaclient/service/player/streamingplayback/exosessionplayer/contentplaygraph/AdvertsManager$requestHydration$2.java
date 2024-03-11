package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.contentplaygraph;

import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C4642biP;
import o.C4649biW;
import o.C4650biX;
import o.C8556dpz;
import o.C8569dql;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.InterfaceC1078Nw;
import o.InterfaceC4643biQ;
import o.InterfaceC4652biZ;
import o.InterfaceC4900boc;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class AdvertsManager$requestHydration$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C4649biW a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    int d;
    final /* synthetic */ InterfaceC4643biQ e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertsManager$requestHydration$2(C4649biW c4649biW, long j, long j2, InterfaceC4643biQ interfaceC4643biQ, InterfaceC8585dra<? super AdvertsManager$requestHydration$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c4649biW;
        this.b = j;
        this.c = j2;
        this.e = interfaceC4643biQ;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AdvertsManager$requestHydration$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new AdvertsManager$requestHydration$2(this.a, this.b, this.c, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map;
        Map map2;
        List f;
        InterfaceC4900boc interfaceC4900boc;
        Map map3;
        C8586drb.e();
        if (this.d == 0) {
            C8556dpz.d(obj);
            InterfaceC4652biZ c = this.a.c(this.b);
            C8632dsu.d(c);
            C4650biX c4650biX = (C4650biX) c;
            C4642biP.d b = c4650biX.b(this.c);
            if (b == null || b.h() || b.e() || b.j()) {
                InterfaceC4643biQ interfaceC4643biQ = this.e;
                if (interfaceC4643biQ != null) {
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    interfaceC4643biQ.d(netflixImmutableStatus);
                }
            } else {
                map = this.a.h;
                List list = (List) map.get(C8589dre.b(this.b));
                if (list == null || !(!list.isEmpty())) {
                    map2 = this.a.h;
                    Long b2 = C8589dre.b(this.b);
                    f = C8569dql.f(this.e);
                    map2.put(b2, f);
                    interfaceC4900boc = this.a.b;
                    long d = c4650biX.d();
                    String b3 = b.b();
                    C8632dsu.d((Object) b3);
                    String i = c4650biX.i();
                    String c2 = c4650biX.c();
                    C8632dsu.d((Object) c2);
                    interfaceC4900boc.e(d, b3, i, c2, c4650biX.a(), new C4649biW.e(this.a, c4650biX, b), null);
                } else {
                    map3 = this.a.h;
                    List list2 = (List) map3.get(C8589dre.b(this.b));
                    if (list2 != null) {
                        C8589dre.e(list2.add(this.e));
                    }
                }
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
