package com.netflix.mediaclient.ui.player.v2;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5607cBr;
import o.C8556dpz;
import o.C8572dqo;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.InterfaceC5177bto;
import o.InterfaceC5602cBm;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PlayerPrefetcherImpl$prefetch$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ List<InterfaceC5177bto> b;
    int d;
    final /* synthetic */ C5607cBr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlayerPrefetcherImpl$prefetch$1(C5607cBr c5607cBr, List<? extends InterfaceC5177bto> list, InterfaceC8585dra<? super PlayerPrefetcherImpl$prefetch$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = c5607cBr;
        this.b = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PlayerPrefetcherImpl$prefetch$1(this.e, this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PlayerPrefetcherImpl$prefetch$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC5602cBm interfaceC5602cBm;
        int d;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            interfaceC5602cBm = this.e.d;
            List<InterfaceC5177bto> list = this.b;
            d = C8572dqo.d(list, 10);
            ArrayList arrayList = new ArrayList(d);
            for (InterfaceC5177bto interfaceC5177bto : list) {
                String id = interfaceC5177bto.getId();
                C8632dsu.a(id, "");
                arrayList.add(C8589dre.c(Integer.parseInt(id)));
            }
            this.d = 1;
            if (interfaceC5602cBm.d(arrayList, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
