package com.netflix.mediaclient.service.logging.proxy;

import com.netflix.mediaclient.servicemgr.Logblob;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC5090bsG;
import o.InterfaceC8585dra;
import o.aMF;
import o.aVC;
import o.aVE;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
public final class NetworkProbing$startProbing$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ aVC a;
    int c;
    final /* synthetic */ InterfaceC5090bsG d;
    Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkProbing$startProbing$2(InterfaceC5090bsG interfaceC5090bsG, aVC avc, InterfaceC8585dra<? super NetworkProbing$startProbing$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = interfaceC5090bsG;
        this.a = avc;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((NetworkProbing$startProbing$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new NetworkProbing$startProbing$2(this.d, this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aMF amf;
        InterfaceC5090bsG interfaceC5090bsG;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            InterfaceC5090bsG interfaceC5090bsG2 = this.d;
            amf = this.a.d;
            aVE ave = new aVE(amf);
            this.e = interfaceC5090bsG2;
            this.c = 1;
            Object c = ave.c(this);
            if (c == e) {
                return e;
            }
            interfaceC5090bsG = interfaceC5090bsG2;
            obj = c;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            interfaceC5090bsG = (InterfaceC5090bsG) this.e;
            C8556dpz.d(obj);
        }
        interfaceC5090bsG.a((Logblob) obj);
        return dpR.c;
    }
}
