package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.contentplaygraph;

import com.netflix.mediaclient.android.app.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C4642biP;
import o.C4649biW;
import o.C4650biX;
import o.C4813bmv;
import o.C4902boe;
import o.C8556dpz;
import o.C8566dqi;
import o.C8569dql;
import o.C8576dqs;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.InterfaceC1078Nw;
import o.InterfaceC4639biM;
import o.InterfaceC4643biQ;
import o.InterfaceC8585dra;
import o.dpR;
import o.dqE;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class AdvertsManager$AdBreakHydrationRequestCallbackHandler$onAdBreakHydrationRequestResult$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ boolean a;
    final /* synthetic */ C4649biW.e b;
    final /* synthetic */ C4902boe c;
    final /* synthetic */ boolean d;
    int e;
    final /* synthetic */ C4649biW h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertsManager$AdBreakHydrationRequestCallbackHandler$onAdBreakHydrationRequestResult$1(C4649biW.e eVar, boolean z, boolean z2, C4902boe c4902boe, C4649biW c4649biW, InterfaceC8585dra<? super AdvertsManager$AdBreakHydrationRequestCallbackHandler$onAdBreakHydrationRequestResult$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = eVar;
        this.a = z;
        this.d = z2;
        this.c = c4902boe;
        this.h = c4649biW;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AdvertsManager$AdBreakHydrationRequestCallbackHandler$onAdBreakHydrationRequestResult$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new AdvertsManager$AdBreakHydrationRequestCallbackHandler$onAdBreakHydrationRequestResult$1(this.b, this.a, this.d, this.c, this.h, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C4650biX c4650biX;
        InterfaceC4639biM interfaceC4639biM;
        C4650biX c4650biX2;
        C4642biP.d dVar;
        List e;
        List<C4642biP.d> g;
        C4642biP.d dVar2;
        List<C4642biP.e> i;
        C4642biP.d dVar3;
        Map d;
        C4642biP.d dVar4;
        Map map;
        C4650biX c4650biX3;
        Status c;
        C4642biP.d dVar5;
        C8586drb.e();
        if (this.e == 0) {
            C8556dpz.d(obj);
            C4649biW.d.getLogTag();
            c4650biX = this.b.a;
            List<C4642biP.d> b = c4650biX.b();
            C4649biW.e eVar = this.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : b) {
                C4642biP.d dVar6 = (C4642biP.d) obj2;
                if (dVar6.a().isEmpty()) {
                    long f = dVar6.f();
                    dVar5 = eVar.e;
                    if (f != dVar5.f()) {
                        arrayList.add(obj2);
                    }
                }
            }
            if (this.a || this.d) {
                if (this.d) {
                    dVar2 = this.b.e;
                    i = C8569dql.i();
                    dVar2.d(i);
                    dVar3 = this.b.e;
                    d = dqE.d();
                    dVar3.d(new C4813bmv(d, null, false, 4, null));
                    dVar4 = this.b.e;
                    dVar4.e(true);
                } else {
                    this.b.a(this.c.d());
                }
                interfaceC4639biM = this.h.e;
                if (interfaceC4639biM != null) {
                    c4650biX2 = this.b.a;
                    long d2 = c4650biX2.d();
                    dVar = this.b.e;
                    e = C8566dqi.e(dVar);
                    g = C8576dqs.g((Collection) arrayList, (Iterable) e);
                    interfaceC4639biM.a(d2, g);
                }
            }
            C4649biW.d.getLogTag();
            map = this.h.h;
            c4650biX3 = this.b.a;
            List<InterfaceC4643biQ> list = (List) map.remove(C8589dre.b(c4650biX3.d()));
            if (list != null) {
                boolean z = this.d;
                C4902boe c4902boe = this.c;
                for (InterfaceC4643biQ interfaceC4643biQ : list) {
                    if (interfaceC4643biQ != null) {
                        if (z) {
                            c = InterfaceC1078Nw.aJ;
                        } else if (!z) {
                            c = c4902boe.c();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        C8632dsu.d(c);
                        interfaceC4643biQ.d(c);
                    }
                }
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
