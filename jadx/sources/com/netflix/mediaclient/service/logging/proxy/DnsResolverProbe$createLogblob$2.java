package com.netflix.mediaclient.service.logging.proxy;

import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_NetworkProbing;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1991aVv;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.aVB;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class DnsResolverProbe$createLogblob$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C1991aVv>, Object> {
    int a;
    final /* synthetic */ aVB e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DnsResolverProbe$createLogblob$2(aVB avb, InterfaceC8585dra<? super DnsResolverProbe$createLogblob$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = avb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DnsResolverProbe$createLogblob$2(this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C1991aVv> interfaceC8585dra) {
        return ((DnsResolverProbe$createLogblob$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            aVB avb = this.e;
            Config_FastProperty_NetworkProbing.c cVar = Config_FastProperty_NetworkProbing.Companion;
            List<List<String>> b = cVar.b();
            List<String> e2 = cVar.e();
            this.a = 1;
            obj = avb.a(b, e2, this);
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
