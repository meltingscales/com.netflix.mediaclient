package com.netflix.mediaclient.service.net.probe;

import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_IpProbing;
import java.net.InetAddress;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8180dfX;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.aHO;
import o.aZP;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class IpProbeOkHttp$probe$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int c;
    final /* synthetic */ aZP e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IpProbeOkHttp$probe$2(aZP azp, InterfaceC8585dra<? super IpProbeOkHttp$probe$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = azp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new IpProbeOkHttp$probe$2(this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((IpProbeOkHttp$probe$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            String c = C8180dfX.e.c();
            Config_FastProperty_IpProbing.a aVar = Config_FastProperty_IpProbing.Companion;
            String e = aVar.e();
            InetAddress[] e2 = aHO.e(e);
            if (e2 != null) {
                aZP azp = this.e;
                if (aVar.c()) {
                    azp.c(e, c, aHO.c(e2));
                }
                if (aVar.f()) {
                    azp.c(e, c, aHO.e(e2));
                }
                return dpR.c;
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
