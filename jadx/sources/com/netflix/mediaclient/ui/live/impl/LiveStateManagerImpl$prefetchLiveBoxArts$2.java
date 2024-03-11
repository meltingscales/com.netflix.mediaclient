package com.netflix.mediaclient.ui.live.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8572dqo;
import o.C8586drb;
import o.C8733dwn;
import o.C8737dwr;
import o.C9646uN;
import o.InterfaceC8585dra;
import o.bZM;
import o.dpR;
import o.drX;
import o.dwU;
import o.dwZ;

/* loaded from: classes4.dex */
public final class LiveStateManagerImpl$prefetchLiveBoxArts$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super List<? extends C9646uN.e>>, Object> {
    int a;
    final /* synthetic */ List<C9646uN.b> b;
    final /* synthetic */ bZM c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveStateManagerImpl$prefetchLiveBoxArts$2(List<C9646uN.b> list, bZM bzm, InterfaceC8585dra<? super LiveStateManagerImpl$prefetchLiveBoxArts$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = list;
        this.c = bzm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        LiveStateManagerImpl$prefetchLiveBoxArts$2 liveStateManagerImpl$prefetchLiveBoxArts$2 = new LiveStateManagerImpl$prefetchLiveBoxArts$2(this.b, this.c, interfaceC8585dra);
        liveStateManagerImpl$prefetchLiveBoxArts$2.d = obj;
        return liveStateManagerImpl$prefetchLiveBoxArts$2;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super List<C9646uN.e>> interfaceC8585dra) {
        return ((LiveStateManagerImpl$prefetchLiveBoxArts$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        int d;
        dwZ d2;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            dwU dwu = (dwU) this.d;
            List<C9646uN.b> list = this.b;
            bZM bzm = this.c;
            d = C8572dqo.d(list, 10);
            ArrayList arrayList = new ArrayList(d);
            for (C9646uN.b bVar : list) {
                d2 = C8737dwr.d(dwu, null, null, new LiveStateManagerImpl$prefetchLiveBoxArts$2$1$1(bzm, bVar, null), 3, null);
                arrayList.add(d2);
            }
            this.a = 1;
            obj = C8733dwn.a(arrayList, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return obj;
    }
}
